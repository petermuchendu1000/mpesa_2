package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.crypto.tink.KeysetManager;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardUiState;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareEvent;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareResourceItem;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0014J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataFamilyShareDashboardActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "viewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "pendingDeleteMsisdn", "", "pinLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "optOutPinLauncher", "onNewIntent", "", IpcMessageConstants.EXTRA_INTENT, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataFamilyShareDashboardActivity extends Hilt_FixedDataFamilyShareDashboardActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static int component1;
    private static char component2;
    private static long component3;
    private static int copy;

    @Inject
    public FixedDataViewModel fixedDataViewModel;

    @Inject
    public RemoteConfig remoteConfig;

    private final Lazy viewModel;
    private static final byte[] $$c = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {68, -59, -116, 119, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -57, Ascii.SO, Ascii.SI, 2, 7, Ascii.SI, 20, -64, 63, Ascii.SYN, 13, 7, Ascii.DLE, 9, -1, Ascii.SI, 1, Ascii.CAN, -59, 63, Ascii.SI, 3, Ascii.ETB, 10, 1, 17, 17, -59, 44, 44, 7, -1, Ascii.ESC, -8, Ascii.FF, Ascii.ETB, -21, Ascii.SUB, Ascii.SYN, Ascii.VT, -1, -55, 42, 43, Ascii.VT, 5, Ascii.RS, 1, Ascii.DC2, -33, 46, 13, 6, 17, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -56, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -55};
    private static final int $$h = 237;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 116;
    private static int getAsAtTimestamp = 1;
    private static int copydefault = 0;
    private static int equals = 1;
    private String pendingDeleteMsisdn = "";
    private final ActivityResultLauncher<Intent> pinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                FixedDataFamilyShareDashboardActivity.$r8$lambda$e28JUPX7OA6ekJdi4OrS_4FIMYo(this.f$0, (ActivityResult) obj);
                int i3 = 89 / 0;
            } else {
                FixedDataFamilyShareDashboardActivity.$r8$lambda$e28JUPX7OA6ekJdi4OrS_4FIMYo(this.f$0, (ActivityResult) obj);
            }
            int i4 = ShareDataUIState + 121;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
        }
    });
    private final ActivityResultLauncher<Intent> optOutPinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FixedDataFamilyShareDashboardActivity.$r8$lambda$eR3IUKw3cZ35P0fWIHNcb0XOYz4(this.f$0, (ActivityResult) obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, short r7, byte r8) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.$$c
            int r7 = r7 + 65
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.$$i(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.$$a
            int r6 = 28 - r6
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r7 = 99 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.$$g
            int r8 = r8 + 4
            int r9 = r9 * 8
            int r9 = 107 - r9
            int r7 = r7 * 44
            int r7 = 54 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.e(int, short, short, java.lang.Object[]):void");
    }

    public static final ActivityResultLauncher access$getOptOutPinLauncher$p(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        equals = i3 % 128;
        int i4 = i3 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataFamilyShareDashboardActivity.optOutPinLauncher;
        int i5 = i2 + 9;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return activityResultLauncher;
    }

    public static final ActivityResultLauncher access$getPinLauncher$p(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataFamilyShareDashboardActivity.pinLauncher;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return activityResultLauncher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final FamilyShareDashboardViewModel access$getViewModel(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            fixedDataFamilyShareDashboardActivity.getViewModel();
            throw null;
        }
        FamilyShareDashboardViewModel viewModel = fixedDataFamilyShareDashboardActivity.getViewModel();
        int i3 = equals + 83;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return viewModel;
        }
        throw null;
    }

    public static final void access$setPendingDeleteMsisdn$p(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        fixedDataFamilyShareDashboardActivity.pendingDeleteMsisdn = str;
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        int i6 = i3 + 21;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public FixedDataFamilyShareDashboardActivity() {
        final FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FamilyShareDashboardViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 1;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = fixedDataFamilyShareDashboardActivity.getViewModelStore();
                int i4 = copydefault + 97;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStore;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 123;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = copydefault + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 89;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component2 + 91;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 77;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    fixedDataFamilyShareDashboardActivity.getDefaultViewModelProviderFactory();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = fixedDataFamilyShareDashboardActivity.getDefaultViewModelProviderFactory();
                int i3 = copydefault + 45;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelProviderFactory;
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
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i2 = component1 + 15;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = fixedDataFamilyShareDashboardActivity.getDefaultViewModelCreationExtras();
                int i3 = component3 + 3;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 51;
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

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 105;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataViewModel;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = equals + 113;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
        this.fixedDataViewModel = fixedDataViewModel;
        int i3 = copydefault + 109;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        RemoteConfig remoteConfig = this.remoteConfig;
        if (remoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return remoteConfig;
        }
        throw null;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = equals + 91;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
        } else {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
            throw null;
        }
    }

    private final FamilyShareDashboardViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.viewModel.getValue();
        if (i3 != 0) {
            return (FamilyShareDashboardViewModel) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void pinLauncher$lambda$0(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i4 = equals + 1;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                fixedDataFamilyShareDashboardActivity.getViewModel().deleteBeneficiary(fixedDataFamilyShareDashboardActivity.pendingDeleteMsisdn);
            } else {
                fixedDataFamilyShareDashboardActivity.getViewModel().deleteBeneficiary(fixedDataFamilyShareDashboardActivity.pendingDeleteMsisdn);
                throw null;
            }
        }
    }

    private static final void optOutPinLauncher$lambda$1(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i2 = copydefault + 63;
            equals = i2 % 128;
            String stringExtra = null;
            if (i2 % 2 == 0) {
                fixedDataFamilyShareDashboardActivity.getIntent();
                throw null;
            }
            Intent intent = fixedDataFamilyShareDashboardActivity.getIntent();
            if (intent != null) {
                int i3 = equals + 1;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                stringExtra = intent.getStringExtra(FixedDataNavKeys.EXTRA_ACCOUNT_ID);
            }
            if (stringExtra == null) {
                int i5 = copydefault + 15;
                equals = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str = stringExtra;
            }
            fixedDataFamilyShareDashboardActivity.getFixedDataViewModel().deleteFamilyShareProduct(str);
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            getViewModel().fetchBeneficiaries();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        getViewModel().fetchBeneficiaries();
        int i3 = equals + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$1", f = "FixedDataFamilyShareDashboardActivity.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<UiEvent> events = FixedDataFamilyShareDashboardActivity.this.getFixedDataViewModel().getEvents();
                final FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity = FixedDataFamilyShareDashboardActivity.this;
                this.ShareDataUIState = 1;
                if (events.collect(new FlowCollector() {
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i3 = 2 % 2;
                        int i4 = copydefault + 27;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        Object objComponent1 = component1((UiEvent) obj2, continuation);
                        int i6 = ShareDataUIState + 105;
                        copydefault = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 89 / 0;
                        }
                        return objComponent1;
                    }

                    public final Object component1(UiEvent uiEvent, Continuation<? super Unit> continuation) {
                        int i3 = 2 % 2;
                        int i4 = copydefault + 43;
                        int i5 = i4 % 128;
                        ShareDataUIState = i5;
                        Object obj2 = null;
                        if (i4 % 2 != 0) {
                            boolean z = uiEvent instanceof UiEvent.DeleteProductCompleted;
                            throw null;
                        }
                        if (uiEvent instanceof UiEvent.DeleteProductCompleted) {
                            FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity2 = fixedDataFamilyShareDashboardActivity;
                            String responseMessage = ((UiEvent.DeleteProductCompleted) uiEvent).getResponseMessage();
                            if (responseMessage == null) {
                                responseMessage = fixedDataFamilyShareDashboardActivity.getString(R.string.gsm_fixed_data_opt_out_success);
                                Intrinsics.checkNotNullExpressionValue(responseMessage, "");
                            }
                            Toast.makeText(fixedDataFamilyShareDashboardActivity2, responseMessage, 1).show();
                            Intent intent = new Intent(fixedDataFamilyShareDashboardActivity, (Class<?>) FixedDataDashboardActivity.class);
                            intent.setFlags(603979776);
                            fixedDataFamilyShareDashboardActivity.startActivity(intent);
                            fixedDataFamilyShareDashboardActivity.finish();
                        } else if (!(!(uiEvent instanceof UiEvent.ShowError))) {
                            int i6 = i5 + 1;
                            copydefault = i6 % 128;
                            if (i6 % 2 == 0) {
                                FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity3 = fixedDataFamilyShareDashboardActivity;
                                ((UiEvent.ShowError) uiEvent).getError().getMessage();
                                obj2.hashCode();
                                throw null;
                            }
                            FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity4 = fixedDataFamilyShareDashboardActivity;
                            String message = ((UiEvent.ShowError) uiEvent).getError().getMessage();
                            if (message == null) {
                                message = fixedDataFamilyShareDashboardActivity.getString(R.string.gsm_fixed_data_an_error_occurred);
                                Intrinsics.checkNotNullExpressionValue(message, "");
                            }
                            Toast.makeText(fixedDataFamilyShareDashboardActivity4, message, 1).show();
                        }
                        Unit unit = Unit.INSTANCE;
                        int i7 = copydefault + 125;
                        ShareDataUIState = i7 % 128;
                        if (i7 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    int i3 = component3 + 63;
                    int i4 = i3 % 128;
                    component1 = i4;
                    if (i3 % 2 != 0) {
                        int i5 = 97 / 0;
                    }
                    int i6 = i4 + 59;
                    component3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = FixedDataFamilyShareDashboardActivity.this.new component1(continuation);
            int i2 = component1 + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 51;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                copydefault(coroutineScope2, continuation2);
                throw null;
            }
            Object objCopydefault = copydefault(coroutineScope2, continuation2);
            int i3 = component3 + 101;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return objCopydefault;
            }
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 97;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 21;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 123;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - View.MeasureSpec.getSize(0), 33 - Gravity.getAbsoluteGravity(0, 0), (char) (60268 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), -834797019, false, $$i(b2, (byte) (b2 & 37), (byte) 0), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 686, 35 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 60373), -1969106284, false, $$i(b3, (byte) (b3 & 40), (byte) 0), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i6 = $11 + 19;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $11 + 75;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 34, (char) (60373 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), -1969106284, false, $$i(b4, (byte) (b4 & 40), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                throw null;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr5 = {notifyVar, notifyVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault4 == null) {
                byte b5 = (byte) (-1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) (60372 - TextUtils.lastIndexOf("", '0')), -1969106284, false, $$i(b5, (byte) (b5 & 40), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$2", f = "FixedDataFamilyShareDashboardActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 113;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                StateFlow<FixedDataUiState> uiState = FixedDataFamilyShareDashboardActivity.this.getFixedDataViewModel().getUiState();
                final FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity = FixedDataFamilyShareDashboardActivity.this;
                this.component2 = 1;
                if (uiState.collect(new FlowCollector() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = component2 + 43;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        Object objComponent3 = component3((FixedDataUiState) obj2, continuation);
                        int i8 = component2 + 7;
                        component3 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 34 / 0;
                        }
                        return objComponent3;
                    }

                    public final Object component3(FixedDataUiState fixedDataUiState, Continuation<? super Unit> continuation) {
                        int i5 = 2 % 2;
                        if (!fixedDataUiState.isLoading()) {
                            DialogManager.hideLoading(fixedDataFamilyShareDashboardActivity);
                            int i6 = component2 + 53;
                            component3 = i6 % 128;
                            int i7 = i6 % 2;
                        } else {
                            int i8 = component3 + 119;
                            component2 = i8 % 128;
                            if (i8 % 2 != 0) {
                                DialogManager.showLoading(fixedDataFamilyShareDashboardActivity);
                                throw null;
                            }
                            DialogManager.showLoading(fixedDataFamilyShareDashboardActivity);
                        }
                        Unit unit = Unit.INSTANCE;
                        int i9 = component3 + 101;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    int i5 = ShareDataUIState + 3;
                    int i6 = i5 % 128;
                    component3 = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 33;
                    ShareDataUIState = i8 % 128;
                    if (i8 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    throw null;
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
            component3 component3Var = FixedDataFamilyShareDashboardActivity.this.new component3(continuation);
            int i2 = component3 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = ShareDataUIState + 19;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objCopydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 113;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$3", f = "FixedDataFamilyShareDashboardActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            if (i4 != 0) {
                int i5 = component1 + 69;
                copydefault = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SharedFlow<FamilyShareEvent> events = FixedDataFamilyShareDashboardActivity.access$getViewModel(FixedDataFamilyShareDashboardActivity.this).getEvents();
                final FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity = FixedDataFamilyShareDashboardActivity.this;
                this.ShareDataUIState = 1;
                if (events.collect(new FlowCollector() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = copydefault + 53;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                        Object objCopydefault = copydefault((FamilyShareEvent) obj2, continuation);
                        if (i8 != 0) {
                            int i9 = 51 / 0;
                        }
                        return objCopydefault;
                    }

                    public final Object copydefault(FamilyShareEvent familyShareEvent, Continuation<? super Unit> continuation) {
                        int i6 = 2 % 2;
                        int i7 = copydefault + 99;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                        if (familyShareEvent instanceof FamilyShareEvent.DeleteSuccess) {
                            Bundle bundle = new Bundle();
                            FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity2 = fixedDataFamilyShareDashboardActivity;
                            bundle.putBoolean("extra_is_success", true);
                            String message = ((FamilyShareEvent.DeleteSuccess) familyShareEvent).getMessage();
                            if (StringsKt.isBlank(message)) {
                                message = fixedDataFamilyShareDashboardActivity2.getString(R.string.fixed_data_beneficiary_deleted_successfully);
                                Intrinsics.checkNotNullExpressionValue(message, "");
                            }
                            bundle.putString("extra_message", message);
                            bundle.putString(FixedDataNavKeys.EXTRA_CLOSE_ROUTE, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE_DASHBOARD);
                            RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_GENERIC_COMPLETION, bundle);
                            FixedDataFamilyShareDashboardActivity.access$getViewModel(fixedDataFamilyShareDashboardActivity).fetchBeneficiaries();
                        } else if (familyShareEvent instanceof FamilyShareEvent.DeleteError) {
                            Bundle bundle2 = new Bundle();
                            FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity3 = fixedDataFamilyShareDashboardActivity;
                            bundle2.putBoolean("extra_is_success", false);
                            String message2 = ((FamilyShareEvent.DeleteError) familyShareEvent).getMessage();
                            if (StringsKt.isBlank(message2)) {
                                int i9 = copydefault + 61;
                                component2 = i9 % 128;
                                int i10 = i9 % 2;
                                message2 = fixedDataFamilyShareDashboardActivity3.getString(R.string.fixed_data_failed_to_delete_beneficiary);
                                Intrinsics.checkNotNullExpressionValue(message2, "");
                                int i11 = component2 + 51;
                                copydefault = i11 % 128;
                                int i12 = i11 % 2;
                            }
                            bundle2.putString("extra_message", message2);
                            bundle2.putString(FixedDataNavKeys.EXTRA_CLOSE_ROUTE, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE_DASHBOARD);
                            RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_GENERIC_COMPLETION, bundle2);
                            int i13 = component2 + 73;
                            copydefault = i13 % 128;
                            int i14 = i13 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    int i6 = component1 + 69;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            throw new KotlinNothingValueException();
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = FixedDataFamilyShareDashboardActivity.this.new ShareDataUIState(continuation);
            int i2 = component1 + 125;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return shareDataUIState;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = copydefault + 47;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                shareDataUIState.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(unit);
            int i4 = component1 + 117;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 3785, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 38, (char) (TextUtils.indexOf("", "", 0) + 26860), 2015799920, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 16, (char) Color.argb(0, 0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 17;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 2;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.getTrimmedLength(""), Color.blue(0) + 16, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component2 = 1;
        private static int component3;

        public static final FamilyShareDashboardUiState component3(State state) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareDashboardUiState familyShareDashboardUiStateComponent2 = component2(state);
            int i4 = component3 + 21;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return familyShareDashboardUiStateComponent2;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 105;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$1", f = "FixedDataFamilyShareDashboardActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int component3 = 1;
            final FixedDataFamilyShareDashboardActivity component1;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 117;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.copydefault != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = component2 + 25;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.throwOnFailure(obj);
                FixedDataFamilyShareDashboardActivity.access$getViewModel(this.component1).fetchBeneficiaries();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component1 = fixedDataFamilyShareDashboardActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component1, continuation);
                int i2 = component3 + 33;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                int i4 = component2 + 103;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 50 / 0;
                }
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 61;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 19;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final State<FamilyShareDashboardUiState> component1;
            final FixedDataFamilyShareDashboardActivity component2;
            final String component3;

            public static Object ShareDataUIState(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i;
                int i8 = ~i3;
                int i9 = ~(i7 | i8);
                int i10 = i4 | i9;
                int i11 = ~i4;
                int i12 = i9 | (~(i11 | i));
                int i13 = (~(i3 | i7 | i4)) | (~(i8 | i11 | i7));
                int i14 = i + i4 + i2 + ((-619979367) * i5) + (68302741 * i6);
                int i15 = i14 * i14;
                int i16 = (i * 561304900) + 382271488 + (561304900 * i4) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i2) + (1615200256 * i5) + ((-1821507584) * i6) + (428933120 * i15);
                int i17 = ((i * (-96142684)) - 56799437) + (i4 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i2 * (-96141863)) + (i5 * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
                if (i16 + (i17 * i17 * (-1369505792)) != 1) {
                    return component2(objArr);
                }
                FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity = (FixedDataFamilyShareDashboardActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = ShareDataUIState + 115;
                copydefault = i19 % 128;
                int i20 = i19 % 2;
                Unit unit = (Unit) ShareDataUIState(-345796700, KeysetManager.ShareDataUIState(), KeysetManager.ShareDataUIState(), 345796700, KeysetManager.ShareDataUIState(), new Object[]{fixedDataFamilyShareDashboardActivity}, KeysetManager.ShareDataUIState());
                int i21 = copydefault + 35;
                ShareDataUIState = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 7;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    int i4 = 63 / 0;
                }
                int i5 = copydefault + 45;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 73 / 0;
                }
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component2(androidx.compose.runtime.Composer r17, int r18) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = 2
                    int r2 = r1 % r1
                    r2 = r18 & 11
                    r3 = 0
                    if (r2 != r1) goto L24
                    int r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.copydefault.AnonymousClass1.copydefault
                    int r2 = r2 + 101
                    int r4 = r2 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.copydefault.AnonymousClass1.ShareDataUIState = r4
                    int r2 = r2 % r1
                    if (r2 == 0) goto L20
                    boolean r2 = r17.getSkipping()
                    if (r2 != 0) goto L1c
                    goto L24
                L1c:
                    r17.skipToGroupEnd()
                    goto L62
                L20:
                    r17.getSkipping()
                    throw r3
                L24:
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardUiState> r2 = r0.component1
                    com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardUiState r4 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.copydefault.component3(r2)
                    java.lang.String r5 = r0.component3
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda0 r6 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity r2 = r0.component2
                    r6.<init>()
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda1 r7 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity r2 = r0.component2
                    r7.<init>()
                    r8 = 0
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda2 r9 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity r2 = r0.component2
                    r9.<init>()
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda3 r10 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda3
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity r2 = r0.component2
                    r10.<init>()
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda4 r11 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda4
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity r2 = r0.component2
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardUiState> r12 = r0.component1
                    r11.<init>()
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda5 r12 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity$onCreate$4$2$$ExternalSyntheticLambda5
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity r2 = r0.component2
                    r12.<init>()
                    r14 = 8
                    r15 = 16
                    r13 = r17
                    com.huawei.digitalpayment.consumer.fixeddata.ui.screen.FamilyShareDashboardScreenKt.FamilyShareDashboardScreen(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                L62:
                    int r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.copydefault.AnonymousClass1.copydefault
                    int r2 = r2 + 17
                    int r4 = r2 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.copydefault.AnonymousClass1.ShareDataUIState = r4
                    int r2 = r2 % r1
                    if (r2 == 0) goto L6e
                    return
                L6e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.copydefault.AnonymousClass1.component2(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit copydefault(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 73;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                FixedDataFamilyShareDashboardActivity.access$getViewModel(fixedDataFamilyShareDashboardActivity).fetchBeneficiaries();
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 85;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit equals(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 113;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                fixedDataFamilyShareDashboardActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 109;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return unit;
            }

            private static final Unit component4(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = copydefault + 115;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                    RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE);
                    unit = Unit.INSTANCE;
                    int i3 = 51 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                    RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE);
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 45;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component3(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, State state) {
                Object obj;
                Object next;
                int iFloatValue;
                String amount;
                String amount2;
                Float floatOrNull;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                Intrinsics.checkNotNullParameter(state, "");
                Iterator<T> it = copydefault.component3(state).getResourcePool().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i2 = ShareDataUIState + 85;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    next = it.next();
                    if (Intrinsics.areEqual(((FamilyShareResourceItem) next).getCode(), "C_20214")) {
                        break;
                    }
                }
                FamilyShareResourceItem familyShareResourceItem = (FamilyShareResourceItem) next;
                int iFloatValue2 = 0;
                if (familyShareResourceItem == null || (amount2 = familyShareResourceItem.getAmount()) == null || (floatOrNull = StringsKt.toFloatOrNull(amount2)) == null) {
                    iFloatValue = 0;
                } else {
                    int i4 = ShareDataUIState + 5;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        iFloatValue = (int) floatOrNull.floatValue();
                        int i5 = 36 / 0;
                    } else {
                        iFloatValue = (int) floatOrNull.floatValue();
                    }
                }
                Iterator<T> it2 = copydefault.component3(state).getResourcePool().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.areEqual(((FamilyShareResourceItem) next2).getCode(), "C_20213")) {
                        obj = next2;
                        break;
                    }
                }
                FamilyShareResourceItem familyShareResourceItem2 = (FamilyShareResourceItem) obj;
                if (familyShareResourceItem2 != null && (amount = familyShareResourceItem2.getAmount()) != null) {
                    int i6 = copydefault + 85;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    Float floatOrNull2 = StringsKt.toFloatOrNull(amount);
                    if (floatOrNull2 != null) {
                        iFloatValue2 = (int) floatOrNull2.floatValue();
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt(FixedDataNavKeys.EXTRA_AVAILABLE_DATA_MBS, iFloatValue);
                bundle.putInt(FixedDataNavKeys.EXTRA_AVAILABLE_MINS, iFloatValue2);
                RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE_ADD_BENEFICIARY, bundle);
                return Unit.INSTANCE;
            }

            private static final Unit copydefault(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, FamilyShareBeneficiary familyShareBeneficiary) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                Intrinsics.checkNotNullParameter(familyShareBeneficiary, "");
                FixedDataFamilyShareDashboardActivity.access$setPendingDeleteMsisdn$p(fixedDataFamilyShareDashboardActivity, familyShareBeneficiary.getBeneficiaryMsisdn());
                Bundle bundle = new Bundle();
                bundle.putString("titleText", fixedDataFamilyShareDashboardActivity.getString(R.string.gsm_fixed_data_delete_beneficiary_title));
                bundle.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.ic_family_share);
                bundle.putString("phoneNumber", fixedDataFamilyShareDashboardActivity.getString(R.string.gsm_fixed_data_confirm_delete_beneficiary_msg, new Object[]{familyShareBeneficiary.getBeneficiaryMsisdn()}));
                RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, "/sfcModule/identityPin", bundle, FixedDataFamilyShareDashboardActivity.access$getPinLauncher$p(fixedDataFamilyShareDashboardActivity));
                Unit unit = Unit.INSTANCE;
                int i2 = ShareDataUIState + 35;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static Object component2(Object[] objArr) {
                String stringExtra;
                String str;
                FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity = (FixedDataFamilyShareDashboardActivity) objArr[0];
                int i = 2 % 2;
                int i2 = ShareDataUIState + 121;
                copydefault = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                    fixedDataFamilyShareDashboardActivity.getIntent();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareDashboardActivity, "");
                Intent intent = fixedDataFamilyShareDashboardActivity.getIntent();
                if (intent == null || (stringExtra = intent.getStringExtra(FixedDataNavKeys.EXTRA_PIN_TYPE)) == null) {
                    stringExtra = "MPESA_PIN";
                }
                Bundle bundle = new Bundle();
                bundle.putString("titleText", fixedDataFamilyShareDashboardActivity.getString(R.string.gsm_fixed_data_opt_out_title));
                bundle.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.ic_family_share);
                bundle.putString("phoneNumber", fixedDataFamilyShareDashboardActivity.getString(R.string.gsm_fixed_data_confirm_opt_out_msg));
                if (Intrinsics.areEqual(stringExtra, "SERVICE_PIN")) {
                    int i3 = copydefault + 65;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    str = RoutePathConstant.SFC_SERVICE_PIN;
                } else {
                    str = "/sfcModule/identityPin";
                }
                RouteUtils.routeWithExecute(fixedDataFamilyShareDashboardActivity, str, bundle, FixedDataFamilyShareDashboardActivity.access$getOptOutPinLauncher$p(fixedDataFamilyShareDashboardActivity));
                Unit unit = Unit.INSTANCE;
                int i5 = copydefault + 67;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int iShareDataUIState = KeysetManager.ShareDataUIState();
                return (Unit) ShareDataUIState(-830363883, KeysetManager.ShareDataUIState(), iShareDataUIState, 830363884, KeysetManager.ShareDataUIState(), new Object[]{fixedDataFamilyShareDashboardActivity}, KeysetManager.ShareDataUIState());
            }

            public static Unit component3(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 15;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return component4(fixedDataFamilyShareDashboardActivity);
                }
                component4(fixedDataFamilyShareDashboardActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component2(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitEquals = equals(fixedDataFamilyShareDashboardActivity);
                int i4 = copydefault + 51;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitEquals;
            }

            public static Unit component1(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 13;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(fixedDataFamilyShareDashboardActivity);
                int i4 = copydefault + 57;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitCopydefault;
            }

            public static Unit component2(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, FamilyShareBeneficiary familyShareBeneficiary) {
                int i = 2 % 2;
                int i2 = copydefault + 11;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(fixedDataFamilyShareDashboardActivity, familyShareBeneficiary);
                int i4 = copydefault + 41;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitCopydefault;
            }

            public static Unit component2(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, State state) {
                int i = 2 % 2;
                int i2 = copydefault + 25;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return component3(fixedDataFamilyShareDashboardActivity, state);
                }
                component3(fixedDataFamilyShareDashboardActivity, state);
                throw null;
            }

            AnonymousClass1(String str, State<FamilyShareDashboardUiState> state, FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                this.component3 = str;
                this.component1 = state;
                this.component2 = fixedDataFamilyShareDashboardActivity;
            }

            private static final Unit getAsAtTimestamp(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity) {
                int iShareDataUIState = KeysetManager.ShareDataUIState();
                return (Unit) ShareDataUIState(-345796700, KeysetManager.ShareDataUIState(), iShareDataUIState, 345796700, KeysetManager.ShareDataUIState(), new Object[]{fixedDataFamilyShareDashboardActivity}, KeysetManager.ShareDataUIState());
            }
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                int i3 = component2 + 71;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(FixedDataFamilyShareDashboardActivity.access$getViewModel(FixedDataFamilyShareDashboardActivity.this).getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            Intent intent = FixedDataFamilyShareDashboardActivity.this.getIntent();
            String stringExtra = intent != null ? intent.getStringExtra(FixedDataNavKeys.EXTRA_EXPIRY_DATE) : null;
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (!StringsKt.isBlank(stringExtra)) {
                str = "(Expires on " + stringExtra + ")";
                int i5 = component2 + 97;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass5(FixedDataFamilyShareDashboardActivity.this, null), composer, 70);
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1807593861, true, new AnonymousClass1(str, stateCollectAsStateWithLifecycle, FixedDataFamilyShareDashboardActivity.this), composer, 54), composer, 1572864, 63);
        }

        private static final FamilyShareDashboardUiState component2(State<FamilyShareDashboardUiState> state) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareDashboardUiState value = state.getValue();
            int i4 = component2 + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        copydefault() {
        }
    }

    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        int i4 = 64291;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 95;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 7423, Gravity.getAbsoluteGravity(0, 0) + 15, (char) (Color.blue(0) + i4), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7422, 14 - Process.getGidForName(""), (char) (64292 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 64291;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component2)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 7422, 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (64291 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $11 + 81;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i2 = i + 91;
                cArr4[i2] = (char) (cArr[i2] >>> b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $11 + 75;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i12 = $10 + 73;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7116, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13, (char) (KeyEvent.getDeadChar(0, 0) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        int i14 = $11 + 7;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) (-1);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27636), 794909189, false, $$i(b3, (byte) (b3 & TarHeader.LF_FIFO), (byte) 0), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i16];
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[i17];
                        cArr4[cancelall.component2 + 1] = cArr2[i18];
                    } else {
                        int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr2[i19];
                        cArr4[cancelall.component2 + 1] = cArr2[i20];
                    }
                }
                cancelall.component2 += 2;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x2381  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x2382  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02a1  */
    /* JADX WARN: Type inference failed for: r4v213, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r52) {
        /*
            Method dump skipped, instruction units count: 15346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareDashboardActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$e28JUPX7OA6ekJdi4OrS_4FIMYo(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        pinLauncher$lambda$0(fixedDataFamilyShareDashboardActivity, activityResult);
        int i4 = copydefault + 99;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$eR3IUKw3cZ35P0fWIHNcb0XOYz4(FixedDataFamilyShareDashboardActivity fixedDataFamilyShareDashboardActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        optOutPinLauncher$lambda$1(fixedDataFamilyShareDashboardActivity, activityResult);
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        copy = 0;
        ShareDataUIState();
        copydefault();
        int i = getAsAtTimestamp + 31;
        copy = i % 128;
        if (i % 2 != 0) {
            int i2 = 91 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = new char[]{2041, 2017, 2021, 1966, 2002, 2027, 2001, 2029, 1995, 1996, 2045, 2026, 1989, 1987, 2035, 1985, 2044, 1994, 2037, 2004, 2025, 2024, 2040, 2006, 2018, 1973, 1969, 2023, 2032, 2042, 2046, 1986, 1971, 2047, 2003, 2020, 1998, 2038, 2019, 2031, 1956, 2036, 2028, 2039, 2000, 2034, 2022, 1965, 2030};
        component2 = (char) 12829;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        component1 = -890926339;
        component3 = 2865508475787548260L;
    }
}
