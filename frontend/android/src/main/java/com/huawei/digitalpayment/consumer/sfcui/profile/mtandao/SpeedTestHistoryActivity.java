package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityMtandaoSpeedtesthistoryBinding;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel;
import com.huawei.digitalpayment.consumer.sfcui.utils.UtilObjects;
import dagger.hilt.android.AndroidEntryPoint;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0012H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/SpeedTestHistoryActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityMtandaoSpeedtesthistoryBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "adapter", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/SpeedHistoryAdapter;", "speedTestHistoryViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/viewmodels/SpeedTestHistoryViewModel;", "getSpeedTestHistoryViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/viewmodels/SpeedTestHistoryViewModel;", "speedTestHistoryViewModel$delegate", "Lkotlin/Lazy;", "allTests", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "selectedMonth", "", "initToolbar", "", "title", "", "getLayoutId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupRecycler", "observeData", "setupMonthChips", "updateMonthSelection", "applyMonthFilter", "monthIndex", "buildGroupedList", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem;", "data", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SpeedTestHistoryActivity extends Hilt_SpeedTestHistoryActivity<ActivityMtandaoSpeedtesthistoryBinding, ViewModel> {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static long component1;
    private static long component2;
    private static char component3;
    private static int copy;
    private static char copydefault;
    private static char getRequestBeneficiariesState;
    private SpeedHistoryAdapter adapter;
    private List<SpeedTestsHistoryData> allTests = CollectionsKt.emptyList();
    private int selectedMonth = Calendar.getInstance().get(2);

    private final Lazy speedTestHistoryViewModel;
    private static final byte[] $$l = {7, 75, -84, -52};
    private static final int $$o = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {46, -35, 45, 111, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -60, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -58, Ascii.VT, Ascii.FF, -1, 4, Ascii.FF, 17, -67, 60, 19, 10, 4, 13, 6, -4, Ascii.FF, -2, Ascii.NAK, -62, Base64.padSymbol, 8, 4, Ascii.SUB, -7, -50, 66, Ascii.FF, 13, -8, 20, 3, -6, Ascii.DC2, -55, Ascii.GS, 40, 4, Ascii.SUB, -7, -29, TarHeader.LF_CHR, 10, 4, 13, 6, -4, Ascii.FF, -2, -21, 44, -1, Ascii.DLE, -31, 43, 10, 3, -65, TarHeader.LF_FIFO, Ascii.FS, 0, Ascii.CAN, -6, -26, 36, Ascii.SUB, -12, -5, -5, 17, 40, -12, Ascii.SUB, -8, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -59};
    private static final int $$t = 130;
    private static final byte[] $$d = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 15;
    private static int equals = 0;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r5, short r6, byte r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.$$l
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r5 = r5 * 8
            int r5 = r5 + 103
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            r4 = r0[r6]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.$$r(byte, short, byte):java.lang.String");
    }

    private static void i(short s, byte b2, int i, Object[] objArr) {
        int i2 = 100 - b2;
        byte[] bArr = $$d;
        int i3 = (i * 2) + 83;
        byte[] bArr2 = new byte[28 - s];
        int i4 = 27 - s;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i4 + (-i2)) - 8;
            i2++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            int i8 = i2 + 1;
            i5 = i6;
            i3 = (i7 + (-bArr[i2])) - 8;
            i2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.$$s
            int r8 = r8 * 63
            int r1 = r8 + 10
            int r6 = r6 * 8
            int r6 = r6 + 99
            int r7 = r7 * 9
            int r7 = 94 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
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
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r6 = r6 + r7
            int r6 = r6 + (-7)
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.k(short, short, byte, java.lang.Object[]):void");
    }

    public static final void access$applyMonthFilter(SpeedTestHistoryActivity speedTestHistoryActivity, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 107;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        speedTestHistoryActivity.applyMonthFilter(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = getAsAtTimestamp + 53;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final List access$getAllTests$p(SpeedTestHistoryActivity speedTestHistoryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 11;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<SpeedTestsHistoryData> list = speedTestHistoryActivity.allTests;
        int i5 = i2 + 29;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final ViewDataBinding access$getBinding$p(SpeedTestHistoryActivity speedTestHistoryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = speedTestHistoryActivity.binding;
        int i4 = component4 + 85;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int access$getSelectedMonth$p(SpeedTestHistoryActivity speedTestHistoryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = speedTestHistoryActivity.selectedMonth;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final SpeedTestHistoryViewModel access$getSpeedTestHistoryViewModel(SpeedTestHistoryActivity speedTestHistoryActivity) {
        int i = 2 % 2;
        int i2 = component4 + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestHistoryViewModel speedTestHistoryViewModel = speedTestHistoryActivity.getSpeedTestHistoryViewModel();
        int i4 = component4 + 85;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return speedTestHistoryViewModel;
    }

    public static final void access$setAllTests$p(SpeedTestHistoryActivity speedTestHistoryActivity, List list) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        speedTestHistoryActivity.allTests = list;
        int i5 = i2 + 81;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void access$setupMonthChips(SpeedTestHistoryActivity speedTestHistoryActivity) {
        int i = 2 % 2;
        int i2 = component4 + 113;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        speedTestHistoryActivity.setupMonthChips();
        if (i3 == 0) {
            throw null;
        }
        int i4 = component4 + 65;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public SpeedTestHistoryActivity() {
        final SpeedTestHistoryActivity speedTestHistoryActivity = this;
        final Function0 function0 = null;
        this.speedTestHistoryViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SpeedTestHistoryViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 117;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = speedTestHistoryActivity.getViewModelStore();
                int i4 = component2 + 75;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 11;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 != 0) {
                    int i4 = 40 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = ShareDataUIState + 41;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 53 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 67;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = speedTestHistoryActivity.getDefaultViewModelProviderFactory();
                int i4 = component1 + 27;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v11 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity$special$$inlined$viewModels$default$3.copydefault
                    int r1 = r1 + 25
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r2
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
                    if (r1 != 0) goto L29
                L23:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L29:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity$special$$inlined$viewModels$default$3.ShareDataUIState
                    int r2 = r2 + 93
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity$special$$inlined$viewModels$default$3.copydefault = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 111;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 87;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 86 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final SpeedTestHistoryViewModel getSpeedTestHistoryViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestHistoryViewModel speedTestHistoryViewModel = (SpeedTestHistoryViewModel) this.speedTestHistoryViewModel.getValue();
        int i4 = getAsAtTimestamp + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestHistoryViewModel;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component4 + 7;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.previous_tests));
        int i4 = component4 + 79;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 83;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.layout.activity_mtandao_speedtesthistory;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.activity_mtandao_speedtesthistory;
        int i5 = getAsAtTimestamp + 15;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 71;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 83;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - TextUtils.indexOf("", "", 0, 0), 34 - Color.red(0), (char) (63440 - TextUtils.getOffsetAfter("", 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 1390, 18 - Color.blue(0), (char) (TextUtils.getTrimmedLength("") + 51269), -1883291598, false, $$r(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 11;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 41;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - View.MeasureSpec.makeMeasureSpec(0, 0), AndroidCharacter.getMirror('0') - 14, (char) (AndroidCharacter.getMirror('0') + 63392), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 1390, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, (char) (Gravity.getAbsoluteGravity(0, 0) + 51269), -1883291598, false, $$r(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity$observeData$1", f = "SpeedTestHistoryActivity.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            if (i4 != 0) {
                int i5 = component3 + 51;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Flow<List<SpeedTestsHistoryData>> getAllSpeedTestsData = SpeedTestHistoryActivity.access$getSpeedTestHistoryViewModel(SpeedTestHistoryActivity.this).getGetAllSpeedTestsData();
                final SpeedTestHistoryActivity speedTestHistoryActivity = SpeedTestHistoryActivity.this;
                this.component1 = 1;
                if (getAllSpeedTestsData.collect(new FlowCollector() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i7 = 2 % 2;
                        int i8 = ShareDataUIState + 109;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                        Object objCopydefault = copydefault((List) obj2, continuation);
                        int i10 = component1 + 11;
                        ShareDataUIState = i10 % 128;
                        if (i10 % 2 == 0) {
                            return objCopydefault;
                        }
                        throw null;
                    }

                    public final Object copydefault(List<SpeedTestsHistoryData> list, Continuation<? super Unit> continuation) {
                        int i7 = 2 % 2;
                        int i8 = component1 + 21;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        SpeedTestHistoryActivity.access$setAllTests$p(speedTestHistoryActivity, list);
                        SpeedTestHistoryActivity.access$setupMonthChips(speedTestHistoryActivity);
                        SpeedTestHistoryActivity speedTestHistoryActivity2 = speedTestHistoryActivity;
                        SpeedTestHistoryActivity.access$applyMonthFilter(speedTestHistoryActivity2, SpeedTestHistoryActivity.access$getSelectedMonth$p(speedTestHistoryActivity2));
                        if (!SpeedTestHistoryActivity.access$getAllTests$p(speedTestHistoryActivity).isEmpty()) {
                            ((ActivityMtandaoSpeedtesthistoryBinding) SpeedTestHistoryActivity.access$getBinding$p(speedTestHistoryActivity)).imageView4.setVisibility(4);
                            ((ActivityMtandaoSpeedtesthistoryBinding) SpeedTestHistoryActivity.access$getBinding$p(speedTestHistoryActivity)).textView15.setVisibility(4);
                            ((ActivityMtandaoSpeedtesthistoryBinding) SpeedTestHistoryActivity.access$getBinding$p(speedTestHistoryActivity)).textView13.setVisibility(4);
                        } else {
                            ((ActivityMtandaoSpeedtesthistoryBinding) SpeedTestHistoryActivity.access$getBinding$p(speedTestHistoryActivity)).imageView4.setVisibility(0);
                            ((ActivityMtandaoSpeedtesthistoryBinding) SpeedTestHistoryActivity.access$getBinding$p(speedTestHistoryActivity)).textView15.setVisibility(0);
                            ((ActivityMtandaoSpeedtesthistoryBinding) SpeedTestHistoryActivity.access$getBinding$p(speedTestHistoryActivity)).textView13.setVisibility(0);
                            int i10 = ShareDataUIState + 37;
                            component1 = i10 % 128;
                            int i11 = i10 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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
            component1 component1Var = SpeedTestHistoryActivity.this.new component1(continuation);
            int i2 = component3 + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 49;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component3(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent3 = component3(coroutineScope2, continuation2);
            int i3 = component2 + 115;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 32 / 0;
            }
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 117;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 69;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getRequestBeneficiariesState);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 844;
                        int iIndexOf = 32 - TextUtils.indexOf("", "");
                        char c4 = (char) (23252 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b2 = (byte) ($$o & 5);
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, iIndexOf, c4, 592652048, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iResolveSizeAndState = 844 - View.resolveSizeAndState(0, 0, 0);
                        int iIndexOf2 = 31 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 23251);
                        byte b4 = (byte) ($$o & 5);
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, iIndexOf2, cIndexOf, 592652048, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    i2 = 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 466, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 48, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i12 = $11 + 89;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 5 % 5;
            }
            i2 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{30152, 30121, 37733, 21993, 16407, 49109, 50911, 24554, 3121, 50943, 353, 64707, 4951, 11368, 52403, 11045, 28626, 63740, 30838, 26520, 47195, 17688}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(0) - 49, new char[]{4302, 4259, 8210, 58751, 39896, 3253, 41938, 48278, 7467}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new char[]{54696, 26893, 28603, 48772, 25654, 33158, 51349, 39901, 31655, 9576, 12465, 36478, 38075, 43146, 3230, 35512, 2064, 34913, 35477, 27175, 22538, 28437, 32626, 23993, 22622, 59581}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).length() - 1, new char[]{4466, 4369, 44099, 11758, 276, 33000, 41583, 24784, 29728, 34812, 31072, 48559, 30706, 4950, 46304, 27167, 2937, 51151, 'p', 9879, 56573, 31288}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i2 = getAsAtTimestamp + 81;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getDoubleTapTimeout() >> 16), MotionEvent.axisFromString("") + 43, (char) ((-1) - Process.getGidForName("")), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{5870, 5775, 33368, 57049, 5651, 44735, 42400, 20190, 34644, 37103, 35331, 43672, 28718, 15634, 18382, 32092, 3263, 59850, 62229, 12763, 56172, 21552, 41213, 50336, 38871, 186, 23670, 38776, 8714, 53033, 2494, 11185, 65220, 48120, 50486, 65131, 36171, 26176, 29208, 45700, 23012, 53904, 12227, 17756, 5224, 33029, 56072, 6544, 41202, 19854, 34948, 44111}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    h((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64, new char[]{63087, 53879, 48382, 22158, 3801, 14278, 12775, 64806, 269, '4', 26685, 41314, 25724, 27815, 12775, 64806, 61033, 32445, 30995, 52810, 12791, 23633, 33228, 45765, 10219, 60406, 34075, 15119, 35100, 18499, 28180, 47573, 43640, 35641, 29974, 14170, 33322, 10664, 22840, 23338, 55825, 15514, 23850, 51404, 39741, 42912, 9719, 21475, 10603, 41496, 20816, 5321, 17154, GMTDateParser.YEAR, 30765, 61105, 2690, 43858, 7303, 15875, 34999, 57495, 19119, 25957}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953980_res_0x7f13093c).substring(0, 4).length() - 4, new char[]{39353, 39305, 7234, 139, 44701, 12538, 10992, 53402, 22799, 10339, 21513, 4676, 65407, 41815, 39360, 50575, 33766, 30604, 11550, 35075, 21564, 51751, 32422, 31788, 6355, 40699, 33315, 12199, 44381, 20784, 55221, 37690, 29077, 9711, 6968, 18151, 585, 63570, 44048, 2569, 54960, 19592, 61891, 64980, 39742, 8002, 1370, 41246, 12193, 54213, 22233, 5314, 61480, 42675, 39472, 55392, 33936, 31036, 12267, 35763, 18760, 52721, 29563, 32635, 7559, 32808, 34046, 8866}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 99, new char[]{47540, 47580, 25726, 25659, 13618, 18644, 2751, 43192, 15859, 46040, 12520, 35301, 57202, 56111, 64871, 24165, 41967, 4084, 18915, 4847, 29797, 45660, 6749, 59280, 14552, 59093, 59012, 46152, 36170, 10510, 45847, 2240, 20889, 23955, 32643, 56665, 8725, 32825, 51451, 37292, 63211, 13495, 38246, 26232, 47968, 26409, 25070, 15079, 4093, 43936, 12914, 36660, 53367, 57029, 65218, 17357, 42189, 338, 19278, 4165, 26957, 46548, 6104, 58519, 15823, 63558, 57368, 47372, 36358, 11429, 44202, 3508, 21289, 24428, 31027, 49721}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{26957, 26996, 39199, 44985, 23879, 46575, 55835, 21898, 63028, 56297}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, new char[]{44048, 49708, 34671, 48461, 59291, 16973, 37944, 36034, 61351, 33703, 43640, 35641, 35387, 45197, 51816, 5078, 8388, 36426, 65348, 58106, 24408, 5067, 61597, 16452, 45215, 36618, 43431, 49749, 29075, 63302, 25724, 27815, 9444, 25528, 7989, 57385}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57, (char) (ViewConfiguration.getLongPressTimeout() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i4 = getAsAtTimestamp + 19;
                    component4 = i4 % 128;
                    int i5 = i4 % 2;
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
            int minimumFlingVelocity = 2405 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iBlue = 26 - Color.blue(0);
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b2 = $$d[38];
            Object[] objArr13 = new Object[1];
            i(b2, (byte) (b2 << 2), r4[22], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iBlue, keyRepeatDelay, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i6 = component4 + 15;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0');
                    int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26;
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    Object[] objArr14 = new Object[1];
                    i((byte) (-$$d[95]), (byte) 93, r2[22], objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i7, modifierMetaStateMask, 24929979, false, (String) objArr14[0], null);
                }
                objArr = (Object[]) ((Field) objCopydefault4).get(null);
                int i8 = 8 / 0;
            } else {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i9 = 2406 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    Object[] objArr15 = new Object[1];
                    i((byte) (-$$d[95]), (byte) 93, r2[22], objArr15);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9, doubleTapTimeout, maximumFlingVelocity, 24929979, false, (String) objArr15[0], null);
                }
                objArr = (Object[]) ((Field) objCopydefault5).get(null);
            }
        } else {
            Object[] objArr16 = new Object[1];
            h(16 - TextUtils.indexOf("", ""), new char[]{6590, 63855, 24939, 48578, 31020, 4764, 54696, 26893, 16276, 18369, 62062, 4180, 30464, 37674, 33948, 58317}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 21, new char[]{41712, 63183, 60124, 22211, 3230, 35512, 35477, 27175, 39535, 19272, 44275, 26499, 34127, 6915, 16256, 45598}, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, 1366111337};
                Object[] objArr19 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 73, new char[]{54696, 26893, 28603, 48772, 25654, 33158, 51349, 39901, 31655, 9576, 12465, 36478, 38075, 43146, 3230, 35512, 2064, 34913, 35477, 27175, 22538, 28437, 32626, 23993, 22622, 59581}, objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8226, new char[]{4466, 4369, 44099, 11758, 276, 33000, 41583, 24784, 29728, 34812, 31072, 48559, 30706, 4950, 46304, 27167, 2937, 51151, 'p', 9879, 56573, 31288}, objArr20);
                Method method = cls4.getMethod((String) objArr20[0], new Class[0]);
                Object[] objArr21 = new Object[1];
                j(((Context) method.invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).length(), new char[]{61574, 61669, 36257, 20539, 5046, 14841, 43057, 40968, 34618, 55325, 8297, 10301, 8011, 16469, 47114, 45082, 38803, 51383, 12473, 14550, 12215, 12424, 35068, 16567, 42971, 47317, 221, 51348, 15882, 8546, 39223, 20801, 46628, 43283, 4469, 55615, 20035, 4422, 26898, 25077, 50823, 39338, 57755, 59871, 24231, 434, 31222, 29115, 55017, 35264, 61854, 34417, 27933, 63021, 18966, 3671, 58732, 32331, 49779, 38451, 32100, 58957, 23136, 7905, 62852, 28325, 53956, 42737, 36276, 55025, 11005, 11922, 1533, 24282}, objArr21);
                Class<?> cls5 = Class.forName(((String) objArr21[0]).intern());
                byte b3 = $$s[80];
                Object[] objArr22 = new Object[1];
                k(b3, r2[6], b3, objArr22);
                objArr = (Object[]) cls5.getMethod((String) objArr22[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault6 == null) {
                    int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2405;
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                    char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    Object[] objArr23 = new Object[1];
                    i((byte) (-$$d[95]), (byte) 93, r9[22], objArr23);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i10, keyRepeatDelay2, c2, 24929979, false, (String) objArr23[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr24 = new Object[1];
                    h(Color.green(0) + 22, new char[]{54696, 26893, 28603, 48772, 25654, 33158, 51349, 39901, 53914, 33251, 28457, 31880, 53439, 62589, 64840, 23770, 36766, 11742, 4954, 41950, 10727, 2087}, objArr24);
                    Class<?> cls6 = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 17, new char[]{53545, 24293, 31655, 9576, 42020, 53187, 17155, 58442, 46123, 4742, 10970, 4214, 16187, 29729, 3484, 15739}, objArr25);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault7 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 2405;
                        int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b4 = $$d[33];
                        Object[] objArr26 = new Object[1];
                        i(b4, (byte) (b4 | 84), (byte) ($$e - 5), objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(mode, packedPositionType, threadPriority, -1843538389, false, (String) objArr26[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault8 == null) {
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 2405;
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 27;
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        byte b5 = $$d[38];
                        Object[] objArr27 = new Object[1];
                        i(b5, (byte) (b5 << 2), r5[22], objArr27);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority2, iIndexOf2, cKeyCodeFromString, -2047739879, false, (String) objArr27[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
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
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 6619, 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault9).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i13 = getAsAtTimestamp + 107;
            component4 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr28 = {593829719, Long.valueOf(j4), arrayList, null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 6562, View.MeasureSpec.makeMeasureSpec(0, 0) + 56, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte b6 = $$s[80];
                byte b7 = b6;
                Object[] objArr29 = new Object[1];
                k(b7, (byte) (b7 | 9), b6, objArr29);
                cls7.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr28);
                int i15 = component4 + 77;
                getAsAtTimestamp = i15 % 128;
                int i16 = i15 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        setupRecycler();
        observeData();
    }

    private final void setupRecycler() {
        int i = 2 % 2;
        this.adapter = new SpeedHistoryAdapter(CollectionsKt.emptyList());
        RecyclerView recyclerView = ((ActivityMtandaoSpeedtesthistoryBinding) this.binding).historyRecycler;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        SpeedHistoryAdapter speedHistoryAdapter = this.adapter;
        if (speedHistoryAdapter == null) {
            int i2 = component4 + 19;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                int i4 = 71 / 0;
            }
            speedHistoryAdapter = null;
        }
        recyclerView.setAdapter(speedHistoryAdapter);
        int i5 = getAsAtTimestamp + 13;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void observeData() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component1(null), 3, null);
        int i2 = getAsAtTimestamp + 67;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
    }

    private static final void setupMonthChips$lambda$3$lambda$2(SpeedTestHistoryActivity speedTestHistoryActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component4 + 11;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(speedTestHistoryActivity, "");
        speedTestHistoryActivity.selectedMonth = i;
        speedTestHistoryActivity.updateMonthSelection();
        speedTestHistoryActivity.applyMonthFilter(i);
        int i5 = component4 + 31;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void setupMonthChips() {
        boolean z;
        int i = 2 % 2;
        ((ActivityMtandaoSpeedtesthistoryBinding) this.binding).monthContainer.removeAllViews();
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"});
        List<SpeedTestsHistoryData> list = this.allTests;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(MtandaoUtils.INSTANCE.getMonthIndex(((SpeedTestsHistoryData) it.next()).getTestDateTime())));
        }
        Set set = CollectionsKt.toSet(arrayList);
        int i2 = component4 + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        final int i4 = 0;
        for (Object obj : listListOf) {
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (set.contains(Integer.valueOf(i4))) {
                View viewInflate = getLayoutInflater().inflate(R.layout.item_mtandao_monthchip, (ViewGroup) ((ActivityMtandaoSpeedtesthistoryBinding) this.binding).monthContainer, false);
                Intrinsics.checkNotNull(viewInflate, "");
                TextView textView = (TextView) viewInflate;
                textView.setText(str);
                if (i4 == this.selectedMonth) {
                    int i5 = component4 + 69;
                    getAsAtTimestamp = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
                textView.setOnClickListener(new View.OnClickListener() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final void onClick(View view) {
                        int i7 = 2 % 2;
                        int i8 = copydefault + 7;
                        component2 = i8 % 128;
                        int i9 = i8 % 2;
                        SpeedTestHistoryActivity speedTestHistoryActivity = this.f$0;
                        if (i9 != 0) {
                            SpeedTestHistoryActivity.$r8$lambda$7uOsa4QTjmKo6KoIOXBFTgmyN0g(speedTestHistoryActivity, i4, view);
                            return;
                        }
                        SpeedTestHistoryActivity.$r8$lambda$7uOsa4QTjmKo6KoIOXBFTgmyN0g(speedTestHistoryActivity, i4, view);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                ((ActivityMtandaoSpeedtesthistoryBinding) this.binding).monthContainer.addView(textView);
                int i7 = getAsAtTimestamp + 53;
                component4 = i7 % 128;
                int i8 = i7 % 2;
            }
            i4++;
            int i9 = getAsAtTimestamp + 73;
            component4 = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private final void updateMonthSelection() {
        int i = 2 % 2;
        int childCount = ((ActivityMtandaoSpeedtesthistoryBinding) this.binding).monthContainer.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = component4 + 39;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            View childAt = ((ActivityMtandaoSpeedtesthistoryBinding) this.binding).monthContainer.getChildAt(i2);
            Intrinsics.checkNotNull(childAt, "");
            ((TextView) childAt).setSelected(i2 == this.selectedMonth);
            i2++;
        }
        int i5 = getAsAtTimestamp + 13;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void applyMonthFilter(int monthIndex) {
        int i = 2 % 2;
        List<SpeedTestsHistoryData> list = this.allTests;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            SpeedHistoryAdapter speedHistoryAdapter = null;
            if (!it.hasNext()) {
                List<SpeedHistoryItem> listBuildGroupedList = buildGroupedList(arrayList);
                SpeedHistoryAdapter speedHistoryAdapter2 = this.adapter;
                if (speedHistoryAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    speedHistoryAdapter = speedHistoryAdapter2;
                }
                speedHistoryAdapter.submitList(listBuildGroupedList);
                return;
            }
            int i2 = getAsAtTimestamp + 89;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object next = it.next();
            if (MtandaoUtils.INSTANCE.getMonthIndex(((SpeedTestsHistoryData) next).getTestDateTime()) == monthIndex) {
                int i4 = component4 + 95;
                getAsAtTimestamp = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(next);
                    speedHistoryAdapter.hashCode();
                    throw null;
                }
                arrayList.add(next);
            }
        }
    }

    private final List<SpeedHistoryItem> buildGroupedList(List<SpeedTestsHistoryData> data) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            int i2 = getAsAtTimestamp + 123;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                linkedHashMap.get(UtilObjects.INSTANCE.formatDate(((SpeedTestsHistoryData) it.next()).getTestDateTime()));
                throw null;
            }
            Object next = it.next();
            String date = UtilObjects.INSTANCE.formatDate(((SpeedTestsHistoryData) next).getTestDateTime());
            Object obj = linkedHashMap.get(date);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(date, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : MapsKt.toSortedMap(linkedHashMap, new Comparator() {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final int compare(T t, T t2) {
                int i3 = 2 % 2;
                int i4 = component3 + 85;
                component1 = i4 % 128;
                String str = (String) t2;
                if (i4 % 2 == 0) {
                    ComparisonsKt.compareValues(str, (String) t);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int iCompareValues = ComparisonsKt.compareValues(str, (String) t);
                int i5 = component1 + 15;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return iCompareValues;
            }
        }).entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Intrinsics.checkNotNull(str);
            arrayList.add(new SpeedHistoryItem.DateHeader(str));
            Intrinsics.checkNotNull(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new SpeedHistoryItem.TestItem((SpeedTestsHistoryData) it2.next()));
            }
        }
        int i3 = getAsAtTimestamp + 71;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|886|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|(5:870|31|(2:852|33)|37|38)|(28:(5:849|(2:40|(5:42|43|(1:45)|46|47)(4:48|(1:50)|51|52))(21:53|54|863|55|(2:887|57)|61|62|850|63|(2:803|65)|69|70|71|(1:73)|74|75|76|(1:78)|79|(1:81)|82)|83|(4:86|(3:893|88|896)(12:892|89|(3:91|(3:94|95|92)|897)|96|838|97|(1:99)|100|101|830|102|895)|894|84)|891)|828|312|(1:314)|315|824|316|(1:318)|319|343|841|344|(13:346|847|347|351|(5:836|353|354|840|355)(1:360)|832|361|362|821|(4:364|365|(1:367)|368)(12:(2:372|(1:378)(1:377))(1:380)|(20:382|826|383|(2:843|385)|389|390|822|391|(2:889|393)|397|398|399|(1:401)|402|403|404|(1:406)(1:407)|408|(1:410)|411)(1:465)|470|471|884|472|475|476|(1:478)|479|480|481)|412|(4:415|(2:417|(3:419|423|913)(12:420|424|(3:426|(4:429|430|431|427)|914)|432|813|433|(1:435)|436|437|805|438|912))(2:421|(2:423|913)(11:424|(0)|432|813|433|(0)|436|437|805|438|912))|439|413)|911)(10:351|(0)(0)|832|361|362|821|(0)(0)|412|(1:413)|911)|482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|791|500|501|(1:503)|504|(1:506)|507)|508|(1:510)(9:511|(3:513|(2:516|514)|910)|517|518|(1:520)|521|(1:523)|524|525)|526|(1:528)|529|(1:531)|532|(3:534|(1:536)|537)(16:539|540|(1:542)|543|(1:545)|546|547|(1:549)|550|798|551|552|(1:554)|555|(1:557)|558)|538|559|(28:561|809|562|(2:815|564)|568|(2:570|571)|572|573|802|(4:575|576|(1:578)|579)(18:580|(2:582|(1:588)(1:587))|(19:590|591|794|592|(2:882|594)|598|599|878|600|(2:817|602)|606|607|608|(2:610|611)|612|(1:614)|615|(2:617|618)|619)|666|681|(1:683)|684|(3:686|(1:688)|689)(13:691|855|692|693|(1:695)|696|800|697|698|(1:700)|701|(1:703)|704)|690|705|(6:708|709|(1:711)|712|713|714)|715|(1:717)|718|(3:720|(1:722)|723)(14:725|726|(1:728)|729|730|(1:732)|733|796|734|735|(1:737)|738|(1:740)|741)|724|742|(1:915)(7:745|746|(1:748)|749|750|751|752))|620|(4:623|(2:625|907)(11:626|(3:628|(3:631|632|629)|908)|633|872|634|(1:636)|637|638|867|639|906)|640|621)|905|666|681|(0)|684|(0)(0)|690|705|(0)|715|(0)|718|(0)(0)|724|742|(0)(0))(10:762|(3:764|(2:767|765)|909)|768|769|(1:771)|772|(1:774)|775|776|777))|143|869|144|(1:146)|147|(3:149|(1:151)|152)(14:154|155|859|156|(1:158)|159|160|161|(1:163)|164|(1:166)|167|(1:169)|170)|153|171|(9:174|845|175|(1:177)|178|179|180|834|181)|211|793|212|(1:214)|215|(3:217|(1:219)|220)(19:221|222|880|223|(1:225)|226|227|874|228|(1:230)|231|232|233|(1:235)|236|(1:238)|239|(1:241)|242)|243|(4:246|(3:900|248|903)(12:899|249|(3:251|(3:254|255|252)|904)|256|865|257|(1:259)|260|261|853|262|902)|901|244)|898|275|(3:858|300|(1:306)(1:305))(1:310)|311|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|886|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|870|31|(2:852|33)|37|38|(28:(5:849|(2:40|(5:42|43|(1:45)|46|47)(4:48|(1:50)|51|52))(21:53|54|863|55|(2:887|57)|61|62|850|63|(2:803|65)|69|70|71|(1:73)|74|75|76|(1:78)|79|(1:81)|82)|83|(4:86|(3:893|88|896)(12:892|89|(3:91|(3:94|95|92)|897)|96|838|97|(1:99)|100|101|830|102|895)|894|84)|891)|828|312|(1:314)|315|824|316|(1:318)|319|343|841|344|(13:346|847|347|351|(5:836|353|354|840|355)(1:360)|832|361|362|821|(4:364|365|(1:367)|368)(12:(2:372|(1:378)(1:377))(1:380)|(20:382|826|383|(2:843|385)|389|390|822|391|(2:889|393)|397|398|399|(1:401)|402|403|404|(1:406)(1:407)|408|(1:410)|411)(1:465)|470|471|884|472|475|476|(1:478)|479|480|481)|412|(4:415|(2:417|(3:419|423|913)(12:420|424|(3:426|(4:429|430|431|427)|914)|432|813|433|(1:435)|436|437|805|438|912))(2:421|(2:423|913)(11:424|(0)|432|813|433|(0)|436|437|805|438|912))|439|413)|911)(10:351|(0)(0)|832|361|362|821|(0)(0)|412|(1:413)|911)|482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|791|500|501|(1:503)|504|(1:506)|507)|508|(1:510)(9:511|(3:513|(2:516|514)|910)|517|518|(1:520)|521|(1:523)|524|525)|526|(1:528)|529|(1:531)|532|(3:534|(1:536)|537)(16:539|540|(1:542)|543|(1:545)|546|547|(1:549)|550|798|551|552|(1:554)|555|(1:557)|558)|538|559|(28:561|809|562|(2:815|564)|568|(2:570|571)|572|573|802|(4:575|576|(1:578)|579)(18:580|(2:582|(1:588)(1:587))|(19:590|591|794|592|(2:882|594)|598|599|878|600|(2:817|602)|606|607|608|(2:610|611)|612|(1:614)|615|(2:617|618)|619)|666|681|(1:683)|684|(3:686|(1:688)|689)(13:691|855|692|693|(1:695)|696|800|697|698|(1:700)|701|(1:703)|704)|690|705|(6:708|709|(1:711)|712|713|714)|715|(1:717)|718|(3:720|(1:722)|723)(14:725|726|(1:728)|729|730|(1:732)|733|796|734|735|(1:737)|738|(1:740)|741)|724|742|(1:915)(7:745|746|(1:748)|749|750|751|752))|620|(4:623|(2:625|907)(11:626|(3:628|(3:631|632|629)|908)|633|872|634|(1:636)|637|638|867|639|906)|640|621)|905|666|681|(0)|684|(0)(0)|690|705|(0)|715|(0)|718|(0)(0)|724|742|(0)(0))(10:762|(3:764|(2:767|765)|909)|768|769|(1:771)|772|(1:774)|775|776|777))|143|869|144|(1:146)|147|(3:149|(1:151)|152)(14:154|155|859|156|(1:158)|159|160|161|(1:163)|164|(1:166)|167|(1:169)|170)|153|171|(9:174|845|175|(1:177)|178|179|180|834|181)|211|793|212|(1:214)|215|(3:217|(1:219)|220)(19:221|222|880|223|(1:225)|226|227|874|228|(1:230)|231|232|233|(1:235)|236|(1:238)|239|(1:241)|242)|243|(4:246|(3:900|248|903)(12:899|249|(3:251|(3:254|255|252)|904)|256|865|257|(1:259)|260|261|853|262|902)|901|244)|898|275|(3:858|300|(1:306)(1:305))(1:310)|311|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|886|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|870|31|(2:852|33)|37|38|(5:849|(2:40|(5:42|43|(1:45)|46|47)(4:48|(1:50)|51|52))(21:53|54|863|55|(2:887|57)|61|62|850|63|(2:803|65)|69|70|71|(1:73)|74|75|76|(1:78)|79|(1:81)|82)|83|(4:86|(3:893|88|896)(12:892|89|(3:91|(3:94|95|92)|897)|96|838|97|(1:99)|100|101|830|102|895)|894|84)|891)|143|869|144|(1:146)|147|(3:149|(1:151)|152)(14:154|155|859|156|(1:158)|159|160|161|(1:163)|164|(1:166)|167|(1:169)|170)|153|171|(9:174|845|175|(1:177)|178|179|180|834|181)|211|793|212|(1:214)|215|(3:217|(1:219)|220)(19:221|222|880|223|(1:225)|226|227|874|228|(1:230)|231|232|233|(1:235)|236|(1:238)|239|(1:241)|242)|243|(4:246|(3:900|248|903)(12:899|249|(3:251|(3:254|255|252)|904)|256|865|257|(1:259)|260|261|853|262|902)|901|244)|898|275|(3:858|300|(1:306)(1:305))(1:310)|311|828|312|(1:314)|315|824|316|(1:318)|319|343|841|344|(13:346|847|347|351|(5:836|353|354|840|355)(1:360)|832|361|362|821|(4:364|365|(1:367)|368)(12:(2:372|(1:378)(1:377))(1:380)|(20:382|826|383|(2:843|385)|389|390|822|391|(2:889|393)|397|398|399|(1:401)|402|403|404|(1:406)(1:407)|408|(1:410)|411)(1:465)|470|471|884|472|475|476|(1:478)|479|480|481)|412|(4:415|(2:417|(3:419|423|913)(12:420|424|(3:426|(4:429|430|431|427)|914)|432|813|433|(1:435)|436|437|805|438|912))(2:421|(2:423|913)(11:424|(0)|432|813|433|(0)|436|437|805|438|912))|439|413)|911)(10:351|(0)(0)|832|361|362|821|(0)(0)|412|(1:413)|911)|482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|791|500|501|(1:503)|504|(1:506)|507)|508|(1:510)(9:511|(3:513|(2:516|514)|910)|517|518|(1:520)|521|(1:523)|524|525)|526|(1:528)|529|(1:531)|532|(3:534|(1:536)|537)(16:539|540|(1:542)|543|(1:545)|546|547|(1:549)|550|798|551|552|(1:554)|555|(1:557)|558)|538|559|(28:561|809|562|(2:815|564)|568|(2:570|571)|572|573|802|(4:575|576|(1:578)|579)(18:580|(2:582|(1:588)(1:587))|(19:590|591|794|592|(2:882|594)|598|599|878|600|(2:817|602)|606|607|608|(2:610|611)|612|(1:614)|615|(2:617|618)|619)|666|681|(1:683)|684|(3:686|(1:688)|689)(13:691|855|692|693|(1:695)|696|800|697|698|(1:700)|701|(1:703)|704)|690|705|(6:708|709|(1:711)|712|713|714)|715|(1:717)|718|(3:720|(1:722)|723)(14:725|726|(1:728)|729|730|(1:732)|733|796|734|735|(1:737)|738|(1:740)|741)|724|742|(1:915)(7:745|746|(1:748)|749|750|751|752))|620|(4:623|(2:625|907)(11:626|(3:628|(3:631|632|629)|908)|633|872|634|(1:636)|637|638|867|639|906)|640|621)|905|666|681|(0)|684|(0)(0)|690|705|(0)|715|(0)|718|(0)(0)|724|742|(0)(0))(10:762|(3:764|(2:767|765)|909)|768|769|(1:771)|772|(1:774)|775|776|777)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0c04, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0c05, code lost:
    
        r6 = new java.lang.Object[1];
        h(android.view.View.MeasureSpec.getMode(0) + 11, new char[]{8095, 5840, 8095, 5840, 7303, 15875, 19119, 25957, 41078, 29836, 2988, 30076}, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0c1e, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0c35, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0c39, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0c68, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0c6c, code lost:
    
        if (r5 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0c6e, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.graphics.Color.blue(0), android.graphics.Color.green(0) + 42, (char) android.text.TextUtils.getOffsetBefore("", 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0c92, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0c9a, code lost:
    
        r7 = new java.lang.Object[]{1500903486, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.KeyEvent.normalizeMetaState(0) + 6562, 56 - android.view.View.combineMeasuredStates(0, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
        r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.$$s[80];
        r3 = r2;
        r8 = new java.lang.Object[1];
        k(r3, (byte) (r3 | 9), r2, r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x1122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x1123, code lost:
    
        r6 = new java.lang.Object[1];
        h(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 21, new char[]{13184, 28502, 55769, 61674, 25724, 27815, 21450, 30374, 25724, 27815, 32401, 28043}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x1166, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x117d, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1181, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r14 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r1 = ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x11b1, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x11b5, code lost:
    
        if (r4 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x11b7, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.os.Process.myTid() >> 22), 42 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.graphics.Color.red(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x11df, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x11e6, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.component4 + 5;
        com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.getAsAtTimestamp = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x11f0, code lost:
    
        r5 = new java.lang.Object[]{1500903486, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.view.View.resolveSize(0, 0), android.graphics.Color.blue(0) + 56, (char) android.text.TextUtils.indexOf("", "", 0, 0));
        r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.$$s[80];
        r3 = r2;
        r8 = new java.lang.Object[1];
        k(r3, (byte) (r3 | 9), r2, r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x1a69, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x1a6a, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07f5 A[Catch: all -> 0x031d, TryCatch #52 {all -> 0x031d, blocks: (B:476:0x1acf, B:478:0x1ad5, B:479:0x1afc, B:675:0x2b43, B:677:0x2b49, B:678:0x2b70, B:709:0x2e74, B:711:0x2e7a, B:712:0x2ea8, B:746:0x31ba, B:748:0x31c0, B:749:0x31e6, B:726:0x2ff8, B:728:0x301b, B:729:0x306b, B:769:0x32b8, B:771:0x32be, B:772:0x32ed, B:774:0x3327, B:775:0x336f, B:540:0x22cb, B:542:0x22e0, B:543:0x2309, B:545:0x233d, B:546:0x23b8, B:518:0x1f74, B:520:0x1f7a, B:521:0x1fa4, B:523:0x1fde, B:524:0x2024, B:492:0x1cd2, B:494:0x1ce7, B:495:0x1d16, B:337:0x13f4, B:339:0x13fa, B:340:0x1420, B:292:0x11b1, B:294:0x11b7, B:295:0x11df, B:205:0x0c68, B:207:0x0c6e, B:208:0x0c92, B:137:0x07ef, B:139:0x07f5, B:140:0x081e, B:17:0x015b, B:19:0x0161, B:20:0x018d, B:22:0x028f, B:24:0x02c0, B:25:0x0317), top: B:886:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08b2 A[Catch: all -> 0x0c04, TryCatch #43 {all -> 0x0c04, blocks: (B:144:0x08ac, B:146:0x08b2, B:147:0x08f7, B:149:0x0904, B:151:0x090d, B:152:0x0954, B:171:0x0afe, B:179:0x0b6b, B:185:0x0be8, B:187:0x0bee, B:188:0x0bef, B:190:0x0bf1, B:192:0x0bf8, B:193:0x0bf9, B:154:0x0960, B:161:0x09e3, B:163:0x09e9, B:164:0x0a2f, B:166:0x0a59, B:167:0x0a9c, B:169:0x0ab3, B:170:0x0af6, B:195:0x0bfb, B:197:0x0c02, B:198:0x0c03, B:181:0x0b71, B:175:0x0b31, B:177:0x0b37, B:178:0x0b64, B:156:0x0980, B:158:0x0992, B:159:0x09d7), top: B:869:0x08ac, outer: #36, inners: #23, #29, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0904 A[Catch: all -> 0x0c04, TryCatch #43 {all -> 0x0c04, blocks: (B:144:0x08ac, B:146:0x08b2, B:147:0x08f7, B:149:0x0904, B:151:0x090d, B:152:0x0954, B:171:0x0afe, B:179:0x0b6b, B:185:0x0be8, B:187:0x0bee, B:188:0x0bef, B:190:0x0bf1, B:192:0x0bf8, B:193:0x0bf9, B:154:0x0960, B:161:0x09e3, B:163:0x09e9, B:164:0x0a2f, B:166:0x0a59, B:167:0x0a9c, B:169:0x0ab3, B:170:0x0af6, B:195:0x0bfb, B:197:0x0c02, B:198:0x0c03, B:181:0x0b71, B:175:0x0b31, B:177:0x0b37, B:178:0x0b64, B:156:0x0980, B:158:0x0992, B:159:0x09d7), top: B:869:0x08ac, outer: #36, inners: #23, #29, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0960 A[Catch: all -> 0x0c04, TRY_LEAVE, TryCatch #43 {all -> 0x0c04, blocks: (B:144:0x08ac, B:146:0x08b2, B:147:0x08f7, B:149:0x0904, B:151:0x090d, B:152:0x0954, B:171:0x0afe, B:179:0x0b6b, B:185:0x0be8, B:187:0x0bee, B:188:0x0bef, B:190:0x0bf1, B:192:0x0bf8, B:193:0x0bf9, B:154:0x0960, B:161:0x09e3, B:163:0x09e9, B:164:0x0a2f, B:166:0x0a59, B:167:0x0a9c, B:169:0x0ab3, B:170:0x0af6, B:195:0x0bfb, B:197:0x0c02, B:198:0x0c03, B:181:0x0b71, B:175:0x0b31, B:177:0x0b37, B:178:0x0b64, B:156:0x0980, B:158:0x0992, B:159:0x09d7), top: B:869:0x08ac, outer: #36, inners: #23, #29, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0d13 A[Catch: all -> 0x1122, TryCatch #1 {all -> 0x1122, blocks: (B:212:0x0d0d, B:214:0x0d13, B:215:0x0d5b, B:217:0x0d68, B:219:0x0d71, B:220:0x0db7, B:243:0x0fd5, B:244:0x0fd9, B:246:0x0fdf, B:249:0x0ff7, B:252:0x100d, B:254:0x1010, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:221:0x0dc2, B:233:0x0eb8, B:235:0x0ebe, B:236:0x0f01, B:238:0x0f2b, B:239:0x0f71, B:241:0x0f87, B:242:0x0fcf, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x1081, B:257:0x103c, B:259:0x1042, B:260:0x106f, B:228:0x0e2c, B:230:0x0e41, B:231:0x0eac, B:223:0x0de2, B:225:0x0df7, B:226:0x0e25), top: B:793:0x0d0d, outer: #36, inners: #34, #41, #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0d68 A[Catch: all -> 0x1122, TryCatch #1 {all -> 0x1122, blocks: (B:212:0x0d0d, B:214:0x0d13, B:215:0x0d5b, B:217:0x0d68, B:219:0x0d71, B:220:0x0db7, B:243:0x0fd5, B:244:0x0fd9, B:246:0x0fdf, B:249:0x0ff7, B:252:0x100d, B:254:0x1010, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:221:0x0dc2, B:233:0x0eb8, B:235:0x0ebe, B:236:0x0f01, B:238:0x0f2b, B:239:0x0f71, B:241:0x0f87, B:242:0x0fcf, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x1081, B:257:0x103c, B:259:0x1042, B:260:0x106f, B:228:0x0e2c, B:230:0x0e41, B:231:0x0eac, B:223:0x0de2, B:225:0x0df7, B:226:0x0e25), top: B:793:0x0d0d, outer: #36, inners: #34, #41, #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0dc2 A[Catch: all -> 0x1122, TRY_LEAVE, TryCatch #1 {all -> 0x1122, blocks: (B:212:0x0d0d, B:214:0x0d13, B:215:0x0d5b, B:217:0x0d68, B:219:0x0d71, B:220:0x0db7, B:243:0x0fd5, B:244:0x0fd9, B:246:0x0fdf, B:249:0x0ff7, B:252:0x100d, B:254:0x1010, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:221:0x0dc2, B:233:0x0eb8, B:235:0x0ebe, B:236:0x0f01, B:238:0x0f2b, B:239:0x0f71, B:241:0x0f87, B:242:0x0fcf, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x1081, B:257:0x103c, B:259:0x1042, B:260:0x106f, B:228:0x0e2c, B:230:0x0e41, B:231:0x0eac, B:223:0x0de2, B:225:0x0df7, B:226:0x0e25), top: B:793:0x0d0d, outer: #36, inners: #34, #41, #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0fdf A[Catch: all -> 0x1122, TryCatch #1 {all -> 0x1122, blocks: (B:212:0x0d0d, B:214:0x0d13, B:215:0x0d5b, B:217:0x0d68, B:219:0x0d71, B:220:0x0db7, B:243:0x0fd5, B:244:0x0fd9, B:246:0x0fdf, B:249:0x0ff7, B:252:0x100d, B:254:0x1010, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:221:0x0dc2, B:233:0x0eb8, B:235:0x0ebe, B:236:0x0f01, B:238:0x0f2b, B:239:0x0f71, B:241:0x0f87, B:242:0x0fcf, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x1081, B:257:0x103c, B:259:0x1042, B:260:0x106f, B:228:0x0e2c, B:230:0x0e41, B:231:0x0eac, B:223:0x0de2, B:225:0x0df7, B:226:0x0e25), top: B:793:0x0d0d, outer: #36, inners: #34, #41, #46, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x127d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x1294 A[Catch: all -> 0x135c, TryCatch #20 {all -> 0x135c, blocks: (B:312:0x127f, B:314:0x1294, B:315:0x12c4), top: B:828:0x127f, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x12d7 A[Catch: all -> 0x1352, TryCatch #18 {all -> 0x1352, blocks: (B:316:0x12ca, B:318:0x12d7, B:319:0x134a), top: B:824:0x12ca, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x14aa  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x14f6 A[Catch: all -> 0x1a69, PHI: r2
  0x14f6: PHI (r2v465 java.lang.Object) = (r2v464 java.lang.Object), (r2v533 java.lang.Object) binds: [B:345:0x14a8, B:347:0x14ab] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x1a69, blocks: (B:344:0x14a4, B:351:0x14f6), top: B:841:0x14a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x156f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1587  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x15ea  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x18e8  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x1934  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1976 A[Catch: all -> 0x1a3d, TryCatch #12 {all -> 0x1a3d, blocks: (B:433:0x1970, B:435:0x1976, B:436:0x19a3), top: B:813:0x1970, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x1ad5 A[Catch: all -> 0x031d, TryCatch #52 {all -> 0x031d, blocks: (B:476:0x1acf, B:478:0x1ad5, B:479:0x1afc, B:675:0x2b43, B:677:0x2b49, B:678:0x2b70, B:709:0x2e74, B:711:0x2e7a, B:712:0x2ea8, B:746:0x31ba, B:748:0x31c0, B:749:0x31e6, B:726:0x2ff8, B:728:0x301b, B:729:0x306b, B:769:0x32b8, B:771:0x32be, B:772:0x32ed, B:774:0x3327, B:775:0x336f, B:540:0x22cb, B:542:0x22e0, B:543:0x2309, B:545:0x233d, B:546:0x23b8, B:518:0x1f74, B:520:0x1f7a, B:521:0x1fa4, B:523:0x1fde, B:524:0x2024, B:492:0x1cd2, B:494:0x1ce7, B:495:0x1d16, B:337:0x13f4, B:339:0x13fa, B:340:0x1420, B:292:0x11b1, B:294:0x11b7, B:295:0x11df, B:205:0x0c68, B:207:0x0c6e, B:208:0x0c92, B:137:0x07ef, B:139:0x07f5, B:140:0x081e, B:17:0x015b, B:19:0x0161, B:20:0x018d, B:22:0x028f, B:24:0x02c0, B:25:0x0317), top: B:886:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1b82  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1bd1  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1cb2  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1e55  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x1f34  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x2111  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x2178  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x21d0  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x22ab  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x24f8  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x2b49 A[Catch: all -> 0x031d, TryCatch #52 {all -> 0x031d, blocks: (B:476:0x1acf, B:478:0x1ad5, B:479:0x1afc, B:675:0x2b43, B:677:0x2b49, B:678:0x2b70, B:709:0x2e74, B:711:0x2e7a, B:712:0x2ea8, B:746:0x31ba, B:748:0x31c0, B:749:0x31e6, B:726:0x2ff8, B:728:0x301b, B:729:0x306b, B:769:0x32b8, B:771:0x32be, B:772:0x32ed, B:774:0x3327, B:775:0x336f, B:540:0x22cb, B:542:0x22e0, B:543:0x2309, B:545:0x233d, B:546:0x23b8, B:518:0x1f74, B:520:0x1f7a, B:521:0x1fa4, B:523:0x1fde, B:524:0x2024, B:492:0x1cd2, B:494:0x1ce7, B:495:0x1d16, B:337:0x13f4, B:339:0x13fa, B:340:0x1420, B:292:0x11b1, B:294:0x11b7, B:295:0x11df, B:205:0x0c68, B:207:0x0c6e, B:208:0x0c92, B:137:0x07ef, B:139:0x07f5, B:140:0x081e, B:17:0x015b, B:19:0x0161, B:20:0x018d, B:22:0x028f, B:24:0x02c0, B:25:0x0317), top: B:886:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x2bf7  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x2c42  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x2c9c  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x2e52  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x2f38  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x2f8a  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x2fda  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x319a  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x3281  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x151d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:858:0x1264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:915:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v114 */
    /* JADX WARN: Type inference failed for: r29v115 */
    /* JADX WARN: Type inference failed for: r29v116 */
    /* JADX WARN: Type inference failed for: r29v117 */
    /* JADX WARN: Type inference failed for: r29v118 */
    /* JADX WARN: Type inference failed for: r29v119 */
    /* JADX WARN: Type inference failed for: r29v120 */
    /* JADX WARN: Type inference failed for: r29v121 */
    /* JADX WARN: Type inference failed for: r29v122 */
    /* JADX WARN: Type inference failed for: r29v123 */
    /* JADX WARN: Type inference failed for: r29v124 */
    /* JADX WARN: Type inference failed for: r29v125 */
    /* JADX WARN: Type inference failed for: r29v126 */
    /* JADX WARN: Type inference failed for: r29v127 */
    /* JADX WARN: Type inference failed for: r29v128 */
    /* JADX WARN: Type inference failed for: r29v129 */
    /* JADX WARN: Type inference failed for: r29v130 */
    /* JADX WARN: Type inference failed for: r29v131 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v29 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v34 */
    /* JADX WARN: Type inference failed for: r29v44 */
    /* JADX WARN: Type inference failed for: r29v46 */
    /* JADX WARN: Type inference failed for: r29v47 */
    /* JADX WARN: Type inference failed for: r29v48 */
    /* JADX WARN: Type inference failed for: r29v49 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r29v51 */
    /* JADX WARN: Type inference failed for: r29v53 */
    /* JADX WARN: Type inference failed for: r29v54 */
    /* JADX WARN: Type inference failed for: r29v59 */
    /* JADX WARN: Type inference failed for: r29v60 */
    /* JADX WARN: Type inference failed for: r29v61 */
    /* JADX WARN: Type inference failed for: r29v62 */
    /* JADX WARN: Type inference failed for: r36v10 */
    /* JADX WARN: Type inference failed for: r36v11 */
    /* JADX WARN: Type inference failed for: r36v12 */
    /* JADX WARN: Type inference failed for: r36v13 */
    /* JADX WARN: Type inference failed for: r36v17 */
    /* JADX WARN: Type inference failed for: r36v18 */
    /* JADX WARN: Type inference failed for: r36v19 */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v112, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v246 */
    /* JADX WARN: Type inference failed for: r7v247 */
    /* JADX WARN: Type inference failed for: r7v248 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX WARN: Type inference failed for: r9v195 */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v200 */
    /* JADX WARN: Type inference failed for: r9v215 */
    /* JADX WARN: Type inference failed for: r9v216 */
    /* JADX WARN: Type inference failed for: r9v226 */
    /* JADX WARN: Type inference failed for: r9v227 */
    /* JADX WARN: Type inference failed for: r9v228 */
    /* JADX WARN: Type inference failed for: r9v229 */
    /* JADX WARN: Type inference failed for: r9v230 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedTestHistoryActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$7uOsa4QTjmKo6KoIOXBFTgmyN0g(SpeedTestHistoryActivity speedTestHistoryActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component4 + 101;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        m11732instrumented$0$setupMonthChips$V(speedTestHistoryActivity, i, view);
        if (i4 == 0) {
            int i5 = 94 / 0;
        }
    }

    static {
        copy = 1;
        copydefault();
        component1();
        int i = equals + 121;
        copy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m11732instrumented$0$setupMonthChips$V(SpeedTestHistoryActivity speedTestHistoryActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component4 + 17;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Callback.onClick_enter(view);
        try {
            setupMonthChips$lambda$3$lambda$2(speedTestHistoryActivity, i, view);
            Callback.onClick_exit();
            int i5 = component4 + 103;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 5;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        component1 = 78738304143782244L;
        int i5 = i3 + 51;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = -3720280244277804977L;
        component3 = (char) 8393;
        copydefault = (char) 47924;
        ShareDataUIState = (char) 6241;
        getRequestBeneficiariesState = (char) 28051;
    }
}
