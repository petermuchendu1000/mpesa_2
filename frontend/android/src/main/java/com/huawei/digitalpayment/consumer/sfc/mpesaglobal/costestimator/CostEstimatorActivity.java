package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.global.databinding.ActivityMpesaGlobalBinding;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalActivity;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.selecttransaction.CostEstimatorSelectTransactionTypeFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MPesaGlobalCountryPickerFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optin.failure.MPesaGlobalErrorFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import com.safaricom.sharedui.compose.confirmation.ConfirmTransactionFragment;
import com.safaricom.sharedui.compose.confirmation.ConfirmTransactionViewModel;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import com.safaricom.sharedui.compose.utils.FragmentExtensionsKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.OnBackPressedDispatcherOnBackPressedCancellable;
import kotlin.OnBackPressedDispatcherOwner;
import kotlin.OnBackPressedDispatcheraddCancellableCallback1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.accessonBackCancelled;
import kotlin.accesssetInProgressCallbackp;
import kotlin.cancel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onBackInvoked;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorActivity;", "Lcom/safaricom/sharedui/compose/activity/BackHandlerActivity;", "<init>", "()V", "mpesaGlobalCountriesViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "getMpesaGlobalCountriesViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "mpesaGlobalCountriesViewModel$delegate", "Lkotlin/Lazy;", "costEstimatorViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorViewModel;", "getCostEstimatorViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorViewModel;", "costEstimatorViewModel$delegate", "confirmTransactionViewModel", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "getConfirmTransactionViewModel", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "confirmTransactionViewModel$delegate", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/global/databinding/ActivityMpesaGlobalBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleBackPress", "observeCountrySelection", "observeScreenChange", "changeScreen", "screenInformation", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "getCountryListType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryListType;", "observeGetFeeLoading", "observeConfirmationForwardNavigation", "observeConfirmationBackNavigation", "observeConfirmationData", "observeCountryFetchingState", "setConfirmationData", "observeCountriesBackNavigation", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class CostEstimatorActivity extends Hilt_CostEstimatorActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static boolean ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static boolean component3;
    private static long copy;
    private static char[] copydefault;
    private static char equals;
    private static int getRequestBeneficiariesState;
    private ActivityMpesaGlobalBinding binding;

    private final Lazy confirmTransactionViewModel;

    private final Lazy costEstimatorViewModel;

    private final Lazy mpesaGlobalCountriesViewModel;
    private static final byte[] $$c = {109, 5, -57, 108};
    private static final int $$f = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {120, -46, -95, -23, -13, 1, -4, 0, 0, 8, -10, -7, 66, -13, 1, -4, 0, 0, 8, -10, -7, SignedBytes.MAX_POWER_OF_TWO, -13, 1, 62, -61, -6, -7, 2, 3, 8, -21, Ascii.ETB, -16, -1, -4, 68, -53, 0, -18, Ascii.SO, -13, 10, -2, -15, Ascii.SI, 1, -14, -1, 8, -14, 67, -38, -23, -18, 20, -13, 1, 62, -59, -14, 19, -23, 17, -5, 58, -54, -13, 1, -1, -3, 0, 63, -74, 13, 4, -4, 1, -16, 69, -55, -6, 7, -12, -4, 7, 56, -38, -19, -16, TarHeader.LF_SYMLINK, -45, -3, -7, 6, -7, 35, -32, -2, 75, -1, -34, -52, 3, Ascii.SO, -14, 3, Ascii.FF, -12, Ascii.CAN, -39, 10, -7, Ascii.VT, 2, -16, 10, 5, Ascii.SYN, -22, -13, 10, -3, 2, 47, -13, 1, -4, 0, 0, 8, -10, -7, 65, -13, 1, 62, -70, 17, -6, 4, -18, 8, 5, -13, 1, 62, -70, 10, 6, -18, Ascii.FF, 0, -18, Ascii.VT, 58, -54, -13, 1, -4, 0, -5, 13, TarHeader.LF_FIFO, -54, -13, 0, 7, -4, -10, 4, Ascii.VT, -20, 10, -7, 0, 63, -22, -45, 0, 7, -4, -10, 4, 35, -38, 7, -10, 37, -44, Ascii.SO, -9, 72, -30, -35, -18, 10, -7, 0, 42, -38, -2, -8, 75, -32, -48, Ascii.FF, 3, -20, 4, -4, -22, 6, -18, Ascii.FF, 32, -30, -20, Ascii.DC2, Ascii.VT, Ascii.VT, -11, -34, Ascii.DC2, -20, Ascii.SO};
    private static final int $$k = 239;
    private static final byte[] $$a = {119, -27, 13, -93, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 188;
    private static int component4 = 0;
    private static int getShareableDataState = 1;
    private static int getAsAtTimestamp = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class getAsAtTimestamp implements Observer, FunctionAdapter {
        private static int component2 = 1;
        private static int copydefault;
        private final Function1 component1;

        getAsAtTimestamp(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 15;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (obj instanceof Observer) {
                int i5 = i2 + 7;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 63;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component1;
            int i5 = i2 + 25;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            int i4 = copydefault + 13;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r7, int r8, int r9) {
        /*
            int r9 = r9 * 2
            int r9 = 4 - r9
            int r7 = r7 + 68
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.$$i(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r6 = 99 - r6
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = 78 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.$$j
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = 77 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.e(short, int, int, java.lang.Object[]):void");
    }

    public static final void access$changeScreen(CostEstimatorActivity costEstimatorActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        costEstimatorActivity.changeScreen(screenInformation);
        int i4 = component4 + 73;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final ConfirmTransactionViewModel access$getConfirmTransactionViewModel(CostEstimatorActivity costEstimatorActivity) {
        int i = 2 % 2;
        int i2 = component4 + 111;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = costEstimatorActivity.getConfirmTransactionViewModel();
        int i4 = component4 + 93;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return confirmTransactionViewModel;
    }

    public static final CostEstimatorViewModel access$getCostEstimatorViewModel(CostEstimatorActivity costEstimatorActivity) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 89;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        CostEstimatorViewModel costEstimatorViewModel = costEstimatorActivity.getCostEstimatorViewModel();
        int i4 = getShareableDataState + 51;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return costEstimatorViewModel;
    }

    public static final MpesaGlobalCountriesViewModel access$getMpesaGlobalCountriesViewModel(CostEstimatorActivity costEstimatorActivity) {
        int i = 2 % 2;
        int i2 = component4 + 69;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return costEstimatorActivity.getMpesaGlobalCountriesViewModel();
        }
        costEstimatorActivity.getMpesaGlobalCountriesViewModel();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private Companion() {
        }

        public final Intent createIntent(Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) CostEstimatorActivity.class);
            int i2 = component1 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CostEstimatorActivity() {
        final CostEstimatorActivity costEstimatorActivity = this;
        final Function0 function0 = null;
        this.mpesaGlobalCountriesViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MpesaGlobalCountriesViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 15;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = costEstimatorActivity.getViewModelStore();
                int i4 = ShareDataUIState + 95;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 41;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = ShareDataUIState + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 117;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 49;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
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
                int i2 = component1 + 77;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = costEstimatorActivity.getDefaultViewModelProviderFactory();
                int i4 = copydefault + 125;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 59;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = costEstimatorActivity.getDefaultViewModelCreationExtras();
                int i3 = copydefault + 9;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 119;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 51;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.costEstimatorViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CostEstimatorViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 89;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = costEstimatorActivity.getViewModelStore();
                int i4 = component2 + 101;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 77;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 51 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 89;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 25;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
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
                int i2 = copydefault + 9;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    costEstimatorActivity.getDefaultViewModelProviderFactory();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = costEstimatorActivity.getDefaultViewModelProviderFactory();
                int i3 = copydefault + 85;
                component1 = i3 % 128;
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
            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
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
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$special$$inlined$viewModels$default$6.component3
                    int r2 = r2 + 77
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$special$$inlined$viewModels$default$6.component1 = r3
                    int r2 = r2 % r0
                    if (r2 == 0) goto L1b
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L37
                    goto L23
                L1b:
                    java.lang.Object r0 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r0 = 0
                    throw r0
                L23:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$special$$inlined$viewModels$default$6.component1
                    int r2 = r2 + 117
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$special$$inlined$viewModels$default$6.component3 = r3
                    int r2 = r2 % r0
                    if (r2 == 0) goto L37
                    r0 = 3
                    int r0 = r0 % 4
                L37:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$special$$inlined$viewModels$default$6.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                CreationExtras creationExtrasInvoke;
                int i = 2 % 2;
                int i2 = component3 + 33;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    creationExtrasInvoke = invoke();
                    int i3 = 57 / 0;
                } else {
                    creationExtrasInvoke = invoke();
                }
                int i4 = component1 + 27;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 10 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.confirmTransactionViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ConfirmTransactionViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 111;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = costEstimatorActivity.getViewModelStore();
                int i4 = component3 + 51;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 95;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 81;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component2 + 27;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 105;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = costEstimatorActivity.getDefaultViewModelProviderFactory();
                if (i3 == 0) {
                    int i4 = 25 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 77;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = costEstimatorActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = copydefault + 103;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 90 / 0;
                }
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 99;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 9;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return creationExtrasInvoke;
                }
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

    private final MpesaGlobalCountriesViewModel getMpesaGlobalCountriesViewModel() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 83;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = (MpesaGlobalCountriesViewModel) this.mpesaGlobalCountriesViewModel.getValue();
        int i4 = getShareableDataState + 99;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return mpesaGlobalCountriesViewModel;
    }

    private final CostEstimatorViewModel getCostEstimatorViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 77;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        CostEstimatorViewModel costEstimatorViewModel = (CostEstimatorViewModel) this.costEstimatorViewModel.getValue();
        int i4 = getShareableDataState + 123;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return costEstimatorViewModel;
    }

    private final ConfirmTransactionViewModel getConfirmTransactionViewModel() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = (ConfirmTransactionViewModel) this.confirmTransactionViewModel.getValue();
        int i4 = component4 + 1;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return confirmTransactionViewModel;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copy ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copy)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16784248, 34 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (63440 - View.resolveSize(0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 1390, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 51269), -1883291598, false, $$i((byte) 35, b2, b2), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 15;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 93 / 0;
            objArr[0] = str;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountrySelection$1", f = "CostEstimatorActivity.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountrySelection$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 0;
            private static int component2 = 1;
            final CostEstimatorActivity component3;
            int copydefault;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountrySelection$1$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass4 extends SuspendLambda implements Function2<Country, Continuation<? super Unit>, Object> {
                private static int component2 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                Object component1;
                final CostEstimatorActivity component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component2 + 119;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Country country = (Country) this.component1;
                    if (country != null) {
                        int i4 = component2 + 65;
                        copydefault = i4 % 128;
                        if (i4 % 2 == 0) {
                            CostEstimatorActivity costEstimatorActivity = this.component3;
                            CostEstimatorActivity.access$getCostEstimatorViewModel(costEstimatorActivity).setCountry(country, CostEstimatorActivity.access$getMpesaGlobalCountriesViewModel(costEstimatorActivity).getSelectedUsState());
                            int i5 = 27 / 0;
                        } else {
                            CostEstimatorActivity costEstimatorActivity2 = this.component3;
                            CostEstimatorActivity.access$getCostEstimatorViewModel(costEstimatorActivity2).setCountry(country, CostEstimatorActivity.access$getMpesaGlobalCountriesViewModel(costEstimatorActivity2).getSelectedUsState());
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i6 = copydefault + 83;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.component3 = costEstimatorActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component3, continuation);
                    anonymousClass4.component1 = obj;
                    AnonymousClass4 anonymousClass42 = anonymousClass4;
                    int i2 = component2 + 99;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass42;
                }

                public final Object copydefault(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 75;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass4) create(country, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = copydefault + 93;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 105;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(country, continuation);
                    int i4 = component2 + 115;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objCopydefault;
                    }
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
                    Object obj2 = null;
                    this.copydefault = 1;
                    if (FlowKt.collectLatest(CostEstimatorActivity.access$getMpesaGlobalCountriesViewModel(this.component3).getSelectedCountry(), new AnonymousClass4(this.component3, null), this) == coroutine_suspended) {
                        int i3 = component1 + 53;
                        int i4 = i3 % 128;
                        component2 = i4;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        int i5 = i4 + 27;
                        component1 = i5 % 128;
                        if (i5 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component3 = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component3, continuation);
                int i2 = component1 + 77;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 119;
                component2 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return copydefault(coroutineScope2, continuation2);
                }
                Object objCopydefault = copydefault(coroutineScope2, continuation2);
                int i3 = 89 / 0;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 76 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            component2 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.ShareDataUIState;
            if (i3 != 0) {
                int i4 = component1;
                int i5 = i4 + 17;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i4 + 97;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(CostEstimatorActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        getRequestBeneficiariesState(Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = CostEstimatorActivity.this.new getRequestBeneficiariesState(continuation);
            int i2 = component1 + 39;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 92 / 0;
            }
            return getrequestbeneficiariesstate;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 71;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 41;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class copy extends FunctionReferenceImpl implements Function1<ScreenInformation<MPesaGlobalScreen>, Unit> {
        private static int component1 = 1;
        private static int component3;

        public final void component1(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component1 + 95;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(screenInformation, "");
                CostEstimatorActivity.access$changeScreen((CostEstimatorActivity) this.receiver, screenInformation);
                int i3 = 31 / 0;
            } else {
                Intrinsics.checkNotNullParameter(screenInformation, "");
                CostEstimatorActivity.access$changeScreen((CostEstimatorActivity) this.receiver, screenInformation);
            }
            int i4 = component1 + 93;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override
        public Unit invoke(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component1(screenInformation);
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        copy(Object obj) {
            super(1, obj, CostEstimatorActivity.class, "changeScreen", "changeScreen(Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;)V", 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeGetFeeLoading$1", f = "CostEstimatorActivity.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    static final class equals extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeGetFeeLoading$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final CostEstimatorActivity ShareDataUIState;
            int component3;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeGetFeeLoading$1$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                private static int component3 = 0;
                private static int copydefault = 1;
                final CostEstimatorActivity ShareDataUIState;
                boolean component1;
                int component2;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component3 + 15;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CostEstimatorActivity.access$getConfirmTransactionViewModel(this.ShareDataUIState).updateIsLoading(this.component1);
                    Unit unit = Unit.INSTANCE;
                    int i3 = copydefault + 71;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 39 / 0;
                    }
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.ShareDataUIState = costEstimatorActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.ShareDataUIState, continuation);
                    anonymousClass5.component1 = ((Boolean) obj).booleanValue();
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = copydefault + 9;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass52;
                }

                @Override
                public Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 65;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    boolean zBooleanValue = bool.booleanValue();
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i3 != 0) {
                        component3(zBooleanValue, continuation2);
                        obj.hashCode();
                        throw null;
                    }
                    Object objComponent3 = component3(zBooleanValue, continuation2);
                    int i4 = component3 + 63;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objComponent3;
                    }
                    throw null;
                }

                public final Object component3(boolean z, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 1;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 29;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 85;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component3;
                if (i4 != 0) {
                    int i5 = copydefault + 53;
                    int i6 = i5 % 128;
                    component2 = i6;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i6 + 9;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component3 = 1;
                    if (FlowKt.collectLatest(CostEstimatorActivity.access$getCostEstimatorViewModel(this.ShareDataUIState).getConfirmationLoading(), new AnonymousClass5(this.ShareDataUIState, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.ShareDataUIState = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.ShareDataUIState, continuation);
                int i2 = copydefault + 87;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 77 / 0;
                }
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 107;
                component2 = i2 % 128;
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
                int i2 = component2 + 71;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 73;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component3 + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i5 = component2 + 81;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorActivity.this, Lifecycle.State.STARTED, new AnonymousClass1(CostEstimatorActivity.this, null), this) == coroutine_suspended) {
                    int i7 = component3 + 27;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        equals(Continuation<? super equals> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            equals equalsVar = CostEstimatorActivity.this.new equals(continuation);
            int i2 = component2 + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return equalsVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component2 + 47;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 75;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((equals) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 87;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationForwardNavigation$1", f = "CostEstimatorActivity.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationForwardNavigation$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 0;
            private static int copydefault = 1;
            final CostEstimatorActivity component2;
            int component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component3;
                if (i2 != 0) {
                    int i3 = copydefault + 59;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateForwardUiEvent = CostEstimatorActivity.access$getConfirmTransactionViewModel(this.component2).getNavigateForwardUiEvent();
                    final CostEstimatorActivity costEstimatorActivity = this.component2;
                    this.component3 = 1;
                    if (navigateForwardUiEvent.collect(new FlowCollector() {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = ShareDataUIState + 93;
                            component3 = i6 % 128;
                            int i7 = i6 % 2;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i7 != 0) {
                                return component2(zBooleanValue, continuation);
                            }
                            component2(zBooleanValue, continuation);
                            throw null;
                        }

                        public final Object component2(boolean z, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            int i6 = ShareDataUIState;
                            int i7 = i6 + 5;
                            component3 = i7 % 128;
                            int i8 = i7 % 2;
                            if (z) {
                                int i9 = i6 + 9;
                                component3 = i9 % 128;
                                if (i9 % 2 != 0) {
                                    CostEstimatorActivity.access$getCostEstimatorViewModel(costEstimatorActivity).onConfirmContinue();
                                } else {
                                    CostEstimatorActivity.access$getCostEstimatorViewModel(costEstimatorActivity).onConfirmContinue();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = component1;
                        int i6 = i5 + 125;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = i5 + 115;
                        copydefault = i8 % 128;
                        if (i8 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component2 = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                int i2 = component1 + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 31;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = copydefault + 33;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objComponent1;
                }
                throw null;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 7;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component1 + 115;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r1
  0x003b: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.copydefault.ShareDataUIState
                int r1 = r1 + 13
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.copydefault.component1 = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r6.component3
                r4 = 96
                int r4 = r4 / 0
                if (r3 == 0) goto L3b
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r6.component3
                if (r3 == 0) goto L3b
            L24:
                if (r3 != r2) goto L33
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.copydefault.ShareDataUIState
                int r1 = r1 + 95
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.copydefault.component1 = r2
                int r1 = r1 % r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5a
            L33:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L3b:
                kotlin.ResultKt.throwOnFailure(r7)
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity r7 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.this
                androidx.lifecycle.LifecycleOwner r7 = (androidx.lifecycle.LifecycleOwner) r7
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$copydefault$5 r3 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$copydefault$5
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.this
                r5 = 0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r6.component3 = r2
                java.lang.Object r7 = androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r7, r0, r3, r4)
                if (r7 != r1) goto L5a
                return r1
            L5a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = CostEstimatorActivity.this.new copydefault(continuation);
            int i2 = component1 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 85 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            int i5 = component1 + 31;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationBackNavigation$1", f = "CostEstimatorActivity.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int copydefault;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationBackNavigation$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            int component1;
            final CostEstimatorActivity component2;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass5<T> implements FlowCollector {
                private static int ShareDataUIState = 1;
                private static int component1;
                final CostEstimatorActivity component2;

                @Override
                public Object emit(Object obj, Continuation continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 121;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (i3 == 0) {
                        component3(zBooleanValue, continuation);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Object objComponent3 = component3(zBooleanValue, continuation);
                    int i4 = component1 + 29;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 94 / 0;
                    }
                    return objComponent3;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object component3(boolean r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                    /*
                        r2 = this;
                        r4 = 2
                        int r0 = r4 % r4
                        int r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component2.AnonymousClass2.AnonymousClass5.component1
                        int r0 = r0 + 81
                        int r1 = r0 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component2.AnonymousClass2.AnonymousClass5.ShareDataUIState = r1
                        int r0 = r0 % r4
                        if (r0 != 0) goto L15
                        r0 = 19
                        int r0 = r0 / 0
                        if (r3 == 0) goto L29
                        goto L17
                    L15:
                        if (r3 == 0) goto L29
                    L17:
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity r3 = r2.component2
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.access$getCostEstimatorViewModel(r3)
                        r3.previousScreen()
                        int r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component2.AnonymousClass2.AnonymousClass5.ShareDataUIState
                        int r3 = r3 + 27
                        int r0 = r3 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component2.AnonymousClass2.AnonymousClass5.component1 = r0
                        int r3 = r3 % r4
                    L29:
                        kotlin.Unit r3 = kotlin.Unit.INSTANCE
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component2.AnonymousClass2.AnonymousClass5.component3(boolean, kotlin.coroutines.Continuation):java.lang.Object");
                }

                AnonymousClass5(CostEstimatorActivity costEstimatorActivity) {
                    this.component2 = costEstimatorActivity;
                }

                public static void component3() {
                    accessonBackCancelled.component1[0] = accesssetInProgressCallbackp.component3[0];
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 107;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component1;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.component1 = 1;
                    if (CostEstimatorActivity.access$getConfirmTransactionViewModel(this.component2).getNavigateBackUiEvent().collect(new AnonymousClass5(this.component2), this) == coroutine_suspended) {
                        int i4 = copydefault + 123;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component2 = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component2, continuation);
                int i2 = copydefault + 9;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = copydefault + 109;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return objComponent2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 125;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(coroutineScope, continuation);
                if (i3 == 0) {
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
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = copydefault + 21;
                int i4 = i3 % 128;
                component2 = i4;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i4 + 49;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i6 = 36 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(CostEstimatorActivity.this, null), this) == coroutine_suspended) {
                    int i7 = copydefault + 89;
                    component2 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 42 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = CostEstimatorActivity.this.new component2(continuation);
            int i2 = copydefault + 67;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 37;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(coroutineScope2, continuation2);
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = 65 / 0;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 != 0) {
                return component2Var.invokeSuspend(Unit.INSTANCE);
            }
            component2Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationData$1", f = "CostEstimatorActivity.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int copydefault = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationData$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final CostEstimatorActivity component1;
            int component2;

            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeConfirmationData$1$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ConfirmInfoItem>, Continuation<? super Unit>, Object> {
                private static int component3 = 0;
                private static int copydefault = 1;
                final CostEstimatorActivity ShareDataUIState;
                Object component1;
                int component2;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component3 + 65;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = component3 + 97;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                    CostEstimatorActivity.access$getConfirmTransactionViewModel(this.ShareDataUIState).setConfirmTransactionDetailsInfo((List) this.component1, this.ShareDataUIState);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.ShareDataUIState = costEstimatorActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.ShareDataUIState, continuation);
                    anonymousClass2.component1 = obj;
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = component3 + 67;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass22;
                }

                @Override
                public Object invoke(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 67;
                    component3 = i2 % 128;
                    List<? extends ConfirmInfoItem> list2 = list;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        component2(list2, continuation2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objComponent2 = component2(list2, continuation2);
                    int i3 = component3 + 39;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return objComponent2;
                }

                public final Object component2(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 13;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(list, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        anonymousClass2.invokeSuspend(unit);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass2.invokeSuspend(unit);
                    int i4 = copydefault + 93;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 87;
                    int i4 = i3 % 128;
                    copydefault = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 125;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component2 = 1;
                    if (FlowKt.collectLatest(CostEstimatorActivity.access$getCostEstimatorViewModel(this.component1).getConfirmationData(), new AnonymousClass2(this.component1, null), this) == coroutine_suspended) {
                        int i8 = ShareDataUIState + 77;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component1 = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component1, continuation);
                int i2 = copydefault + 61;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 83;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    component1(coroutineScope2, continuation2);
                    obj.hashCode();
                    throw null;
                }
                Object objComponent1 = component1(coroutineScope2, continuation2);
                int i3 = copydefault + 87;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return objComponent1;
                }
                obj.hashCode();
                throw null;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 29;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 15;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component2 + 51;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = null;
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorActivity.this, Lifecycle.State.STARTED, new AnonymousClass1(CostEstimatorActivity.this, null), this) == coroutine_suspended) {
                    int i5 = copydefault + 87;
                    int i6 = i5 % 128;
                    component2 = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 81;
                    copydefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = CostEstimatorActivity.this.new ShareDataUIState(continuation);
            int i2 = copydefault + 39;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return shareDataUIState;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            int i5 = component2 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 71;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static void d(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i4 = 0;
        if (cArr2 != null) {
            int i5 = $11 + 7;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 117;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr2[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - View.getDefaultSize(i4, i4), KeyEvent.getDeadChar(i4, i4) + 24, (char) TextUtils.getOffsetAfter("", i4), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 2;
                    i4 = 0;
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
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - View.MeasureSpec.getSize(0), 13 - Drawable.resolveOpacity(0, 0), (char) View.getDefaultSize(0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i10 = 689978476;
        float f = 0.0f;
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    int i11 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 2748;
                    int minimumFlingVelocity = 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 7644);
                    byte b4 = $$c[1];
                    byte b5 = (byte) (b4 - 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i11, minimumFlingVelocity, packedPositionType, -327556343, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                f = 0.0f;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component3) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10);
                if (objCopydefault4 == null) {
                    int i12 = 2748 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20;
                    char pressedStateDuration = (char) (7644 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b6 = $$c[1];
                    byte b7 = (byte) (b6 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, iIndexOf, pressedStateDuration, -327556343, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i10 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i13;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i13 = cancelVar.component3 + 1;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountryFetchingState$1", f = "CostEstimatorActivity.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountryFetchingState$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final CostEstimatorActivity component1;
            int component2;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchState;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountryFetchingState$1$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<CountryFetchState, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                final CostEstimatorActivity component2;
                Object component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = copydefault + 87;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CountryFetchState countryFetchState = (CountryFetchState) this.component3;
                    if (!countryFetchState.isLoading() && countryFetchState.isError()) {
                        int i4 = component1 + 23;
                        copydefault = i4 % 128;
                        if (i4 % 2 == 0) {
                            CostEstimatorActivity.access$getCostEstimatorViewModel(this.component2).showError();
                            throw null;
                        }
                        CostEstimatorActivity.access$getCostEstimatorViewModel(this.component2).showError();
                        int i5 = component1 + 69;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component2 = costEstimatorActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                    anonymousClass5.component3 = obj;
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = copydefault + 47;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass52;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object component1(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend;
                    int i = 2 % 2;
                    int i2 = copydefault + 119;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(countryFetchState, continuation);
                    if (i3 != 0) {
                        objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                        int i4 = 22 / 0;
                    } else {
                        objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                    }
                    int i5 = component1 + 59;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 61;
                    component1 = i2 % 128;
                    CountryFetchState countryFetchState2 = countryFetchState;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 == 0) {
                        return component1(countryFetchState2, continuation2);
                    }
                    Object objComponent1 = component1(countryFetchState2, continuation2);
                    int i3 = 3 / 0;
                    return objComponent1;
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
                    if (FlowKt.collectLatest(CostEstimatorActivity.access$getMpesaGlobalCountriesViewModel(this.component1).getCountryFetchState(), new AnonymousClass5(this.component1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = ShareDataUIState + 23;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        int i6 = 48 / 0;
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component1 = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component1, continuation);
                int i2 = copydefault + 39;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 38 / 0;
                }
                return anonymousClass2;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 17;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent3 = component3(coroutineScope, continuation);
                int i4 = copydefault + 117;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 53;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return anonymousClass2.invokeSuspend(unit);
                }
                anonymousClass2.invokeSuspend(unit);
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = copydefault + 107;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(CostEstimatorActivity.this, null), this) == coroutine_suspended) {
                    int i4 = copydefault + 31;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = CostEstimatorActivity.this.new component3(continuation);
            int i2 = copydefault + 93;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = ShareDataUIState + 97;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return component3Var.invokeSuspend(unit);
            }
            component3Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountriesBackNavigation$1", f = "CostEstimatorActivity.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity$observeCountriesBackNavigation$1$1", f = "CostEstimatorActivity.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            int component2;
            final CostEstimatorActivity component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 51;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component2;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateBackUiEvent = CostEstimatorActivity.access$getMpesaGlobalCountriesViewModel(this.component3).getNavigateBackUiEvent();
                    final CostEstimatorActivity costEstimatorActivity = this.component3;
                    this.component2 = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int component2 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            Object objCopydefault;
                            int i5 = 2 % 2;
                            int i6 = copydefault + 85;
                            component2 = i6 % 128;
                            int i7 = i6 % 2;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i7 != 0) {
                                objCopydefault = copydefault(zBooleanValue, continuation);
                                int i8 = 82 / 0;
                            } else {
                                objCopydefault = copydefault(zBooleanValue, continuation);
                            }
                            int i9 = component2 + 11;
                            copydefault = i9 % 128;
                            if (i9 % 2 != 0) {
                                return objCopydefault;
                            }
                            throw null;
                        }

                        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            int i6 = copydefault;
                            int i7 = i6 + 119;
                            component2 = i7 % 128;
                            int i8 = i7 % 2;
                            if (z) {
                                int i9 = i6 + 77;
                                component2 = i9 % 128;
                                int i10 = i9 % 2;
                                CostEstimatorActivity.access$getCostEstimatorViewModel(costEstimatorActivity).previousScreen();
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = copydefault + 15;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CostEstimatorActivity costEstimatorActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component3 = costEstimatorActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component3, continuation);
                int i2 = ShareDataUIState + 121;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass5;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 73;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = copydefault + 7;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 111;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 123;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 52 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = copydefault;
                int i4 = i3 + 45;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 45;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(CostEstimatorActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = ShareDataUIState + 5;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = CostEstimatorActivity.this.new component1(continuation);
            int i2 = ShareDataUIState + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 49;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = copydefault + 11;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.a(int, char[], byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x1545  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1551  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1c29  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01a9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void handleBackPress() {
        int i = 2 % 2;
        int i2 = component4 + 63;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        getCostEstimatorViewModel().previousScreen();
        int i4 = getShareableDataState + 65;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void observeCountrySelection() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new getRequestBeneficiariesState(null), 3, null);
        int i2 = getShareableDataState + 5;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeScreenChange() {
        int i = 2 % 2;
        getCostEstimatorViewModel().getScreenTransition().observe(this, new getAsAtTimestamp(new copy(this)));
        int i2 = getShareableDataState + 33;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void changeScreen(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        MPesaGlobalCountryPickerFragment mPesaGlobalCountryPickerFragmentCreate;
        int i = 2 % 2;
        Log.d("CostEstimatorActivity", "Received screen: " + screenInformation.getScreen());
        MPesaGlobalScreen screen = screenInformation.getScreen();
        if (Intrinsics.areEqual(screen, MPesaGlobalScreen.TransactionTypeSelection.INSTANCE)) {
            new CostEstimatorSelectTransactionTypeFragment().show(getSupportFragmentManager(), CostEstimatorSelectTransactionTypeFragment.INSTANCE.getTAG());
            return;
        }
        if (!(!Intrinsics.areEqual(screen, MPesaGlobalScreen.CountrySelection.INSTANCE))) {
            mPesaGlobalCountryPickerFragmentCreate = MPesaGlobalCountryPickerFragment.INSTANCE.create(getCountryListType());
        } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.AmountDetails.INSTANCE)) {
            mPesaGlobalCountryPickerFragmentCreate = new CostEstimatorAmountDetailsFragment();
            int i2 = component4 + 105;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
        } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Confirmation.INSTANCE)) {
            setConfirmationData();
            mPesaGlobalCountryPickerFragmentCreate = new ConfirmTransactionFragment();
        } else {
            if (!Intrinsics.areEqual(screen, MPesaGlobalScreen.TransactionError.INSTANCE)) {
                if (!Intrinsics.areEqual(screen, MPesaGlobalScreen.Dashboard.INSTANCE)) {
                    if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Close.INSTANCE)) {
                        finish();
                        return;
                    }
                    return;
                } else {
                    int i4 = component4 + 43;
                    getShareableDataState = i4 % 128;
                    int i5 = i4 % 2;
                    MpesaGlobalActivity.INSTANCE.showDashboard(this);
                    finish();
                    return;
                }
            }
            mPesaGlobalCountryPickerFragmentCreate = new MPesaGlobalErrorFragment();
        }
        Fragment fragment = mPesaGlobalCountryPickerFragmentCreate;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        ScreenDirection direction = screenInformation.getDirection();
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        FragmentExtensionsKt.showFragment$default(supportFragmentManager, direction, simpleName, fragment, false, R.id.container, null, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r1
  0x002e: PHI (r1v8 com.safaricom.consumer.commons.transaction.ITransactionType) = 
  (r1v5 com.safaricom.consumer.commons.transaction.ITransactionType)
  (r1v17 com.safaricom.consumer.commons.transaction.ITransactionType)
 binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType getCountryListType() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component4
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.getShareableDataState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel r1 = r4.getCostEstimatorViewModel()
            com.safaricom.consumer.commons.transaction.ITransactionType r1 = r1.getTransactionType()
            com.safaricom.consumer.commons.transaction.TransactionType r2 = com.safaricom.consumer.commons.transaction.TransactionType.SEND_MONEY_TO_WESTERN_UNION
            r3 = 62
            int r3 = r3 / 0
            if (r1 != r2) goto L2e
            goto L2b
        L1f:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel r1 = r4.getCostEstimatorViewModel()
            com.safaricom.consumer.commons.transaction.ITransactionType r1 = r1.getTransactionType()
            com.safaricom.consumer.commons.transaction.TransactionType r2 = com.safaricom.consumer.commons.transaction.TransactionType.SEND_MONEY_TO_WESTERN_UNION
            if (r1 != r2) goto L2e
        L2b:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType.WESTERN_UNION
            goto L4b
        L2e:
            com.safaricom.consumer.commons.transaction.TransactionType r2 = com.safaricom.consumer.commons.transaction.TransactionType.ROAMING_CASH_OUT
            if (r1 != r2) goto L35
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType.ROAMING_CASHOUT
            goto L4b
        L35:
            com.safaricom.consumer.commons.transaction.TransactionType r2 = com.safaricom.consumer.commons.transaction.TransactionType.GLOBAL_SEND_TO_BANK
            if (r1 != r2) goto L45
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component4
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.getShareableDataState = r2
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType.SEND_TO_BANK
            goto L4b
        L45:
            com.safaricom.consumer.commons.transaction.TransactionType r2 = com.safaricom.consumer.commons.transaction.TransactionType.GLOBAL_SEND_TO_MOBILE
            if (r1 != r2) goto L5b
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType.SEND_TO_MOBILE
        L4b:
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.component4
            int r2 = r2 + 105
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.getShareableDataState = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L5a
            r0 = 62
            int r0 = r0 / 0
        L5a:
            return r1
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid transaction type"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.getCountryListType():com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType");
    }

    private final void observeGetFeeLoading() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new equals(null), 3, null);
        int i2 = component4 + 119;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeConfirmationForwardNavigation() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copydefault(null), 3, null);
        int i2 = getShareableDataState + 91;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void observeConfirmationBackNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component2(null), 3, null);
        int i2 = getShareableDataState + 113;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeConfirmationData() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = component4 + 17;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeCountryFetchingState() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = getShareableDataState + 27;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void setConfirmationData() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = getConfirmTransactionViewModel();
        String string = getString(R.string.cost_estimation);
        Intrinsics.checkNotNullExpressionValue(string, "");
        confirmTransactionViewModel.updateScreenTitleText(string);
        String string2 = getString(R.string.action_done);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        confirmTransactionViewModel.updateConfirmButtonText(string2);
        confirmTransactionViewModel.shouldShowNewAvatarIcon(true);
        int i4 = component4 + 5;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void observeCountriesBackNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component1(null), 3, null);
        int i2 = getShareableDataState + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) onBackInvoked.copydefault[0]).getInt(null);
        int streamVolume = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamVolume(3);
        if (i2 != (-47440762) + (((~((-268987522) | (~streamVolume))) | (~((-553779259) | streamVolume))) * (-272)) + (((~((-513338758) | streamVolume)) | 244351236) * (-272)) + (((~(streamVolume | 513338757)) | (-798130495)) * 272)) {
            int i3 = component4 + 105;
            getShareableDataState = i3 % 128;
            Toast.makeText((Context) null, i3 % 2 == 0 ? 1743415002 : 1743415002 / 0, 0).show();
        }
        int i4 = ((Field) OnBackPressedDispatcherOnBackPressedCancellable.ShareDataUIState[0]).getInt(null);
        int streamMaxVolume = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
        if (i4 != 1192997161 + (((~(470034086 | streamMaxVolume)) | 10178881) * (-140)) + ((~(480212967 | streamMaxVolume)) * 70) + (((~(streamMaxVolume | 413103969)) | 77287879) * 70)) {
            throw null;
        }
        int i5 = ((Field) OnBackPressedDispatcheraddCancellableCallback1.component2[0]).getInt(null);
        int i6 = ~System.identityHashCode(this);
        if (i5 != (-2079355329) + (((-207096834) | i6) * 494) + (((~(i6 | (-1817717830))) | 1879454462) * 494)) {
            int i7 = getShareableDataState + 7;
            component4 = i7 % 128;
            Toast.makeText((Context) null, i7 % 2 != 0 ? -497406276 : (-248703138) / 0, 0).show();
        }
        int i8 = ((Field) OnBackPressedDispatcherOwner.component2[0]).getInt(null);
        int i9 = ~((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getRingerMode();
        if (i8 != (-1175491715) + (((~(i9 | 944927523)) | (-2027910076)) * (-160)) + (((~(i9 | (-1087194043))) | 944927523) * 160)) {
            throw null;
        }
        super.onStart();
        int i10 = component4 + 11;
        getShareableDataState = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1353826519
        	at java.base/java.util.ArrayList.<init>(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:(10:932|174|175|899|(0)(0)|235|(1:236)|938|270|285)|831|415|(0)|418|419|442|830|443|(0)|446|(0)(0)|475|(1:476)|942|510|533|(0)|536|(0)(0)|540|(0)(0)|546|567|(0)(0)|585|(0)|588|(0)(0)|612|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(72:0|2|(2:(2:9|(2:11|(2:13|(1:19)(1:16))(2:17|18))(0))(1:20)|(9:22|873|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|861|36|(3:38|848|39)|43|44|833|(5:46|47|(1:49)|50|51)(24:52|53|854|54|55|846|56|(2:914|58)|62|63|834|64|(3:66|836|67)|71|72|73|(3:75|912|76)|80|81|82|(1:84)|85|(1:87)|88)|89|(4:92|(3:958|94|961)(12:957|95|(5:97|(1:99)(1:100)|963|(3:103|104|101)|962)|105|924|106|(1:108)|109|110|916|111|960)|959|90)|956|124|155|(9:936|156|(2:891|158)|163|(6:165|889|166|167|880|168)(1:173)|932|174|175|899)|(4:177|178|(1:180)|181)(52:184|(2:186|(1:192)(1:191))(1:194)|(28:196|197|926|198|199|200|201|202|203|918|204|(2:865|206)|210|211|906|212|(2:900|214)|218|219|220|(2:222|223)|224|225|226|(1:228)(1:230)|231|(1:233)|234)|285|303|885|304|(2:934|306)|311|312|870|(5:314|315|(1:317)|318|319)(19:321|322|881|323|324|871|325|(2:920|327)|331|332|333|(2:878|335)|339|340|341|(1:343)(1:344)|345|(1:347)|348)|320|349|(9:352|868|353|(1:355)|356|357|358|863|359)|360|(3:867|399|(1:405)(1:404))(1:409)|410|844|411|(1:413)|414|831|415|(1:417)|418|419|442|830|443|(1:445)|446|(3:448|(1:450)|451)(19:452|453|928|454|(1:456)|457|458|922|459|(1:461)|462|463|464|(1:466)|467|(1:469)(1:470)|471|(1:473)|474)|475|(4:478|(2:480|944)(11:481|(5:483|(1:485)(1:486)|946|(3:489|490|487)|945)|491|908|492|(1:494)|495|496|897|497|943)|498|476)|942|510|533|(1:535)|536|(1:538)(1:539)|540|(3:542|(1:544)|545)(16:547|548|(1:550)|551|(1:553)|554|555|(1:557)|558|874|559|560|(1:562)|563|(1:565)|566)|546|567|(1:569)(9:570|(3:572|(2:575|573)|955)|576|577|(1:579)|580|(1:582)|583|584)|585|(1:587)|588|(3:590|(1:592)|593)(14:594|595|(1:597)|598|599|(1:601)|602|838|603|604|(1:606)(1:607)|608|(1:610)|611)|612|(25:614|858|615|(1:617)|618|(1:620)|621|(3:623|(1:625)|626)(17:628|(2:630|(2:632|(1:638)(1:637))(2:639|640))|(19:642|643|852|644|(1:646)|647|648|842|649|(1:651)|652|653|654|(1:656)|657|(1:659)|660|(1:662)|663)|718|(1:720)|721|(3:723|(1:725)|726)(13:728|887|729|730|(1:732)|733|850|734|735|(1:737)|738|(1:740)|741)|727|742|(6:745|746|(1:748)|749|750|751)|752|(1:754)|755|(3:757|(1:759)|760)(14:762|763|(1:765)|766|767|(1:769)|770|856|771|772|(1:774)|775|(1:777)|778)|761|779|(1:964)(7:782|783|(1:785)|786|787|788|789))|664|(4:667|(3:949|669|952)(12:948|670|(3:672|(3:675|676|673)|953)|677|828|678|(1:680)|681|682|930|683|951)|950|665)|947|718|(0)|721|(0)(0)|727|742|(0)|752|(0)|755|(0)(0)|761|779|(0)(0))(10:799|(3:801|(2:804|802)|954)|805|806|(1:808)|809|(1:811)|812|813|814))|235|(5:238|239|(2:241|940)(11:242|(3:244|(3:247|248|245)|941)|249|893|250|(1:252)|253|254|883|255|939)|256|236)|938|270|285|303|885|304|(0)|311|312|870|(0)(0)|320|349|(0)|360|(0)(0)|410|844|411|(0)|414|831|415|(0)|418|419|442|830|443|(0)|446|(0)(0)|475|(1:476)|942|510|533|(0)|536|(0)(0)|540|(0)(0)|546|567|(0)(0)|585|(0)|588|(0)(0)|612|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x14d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x14d7, code lost:
    
        r11 = r11;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x14e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x14e7, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1576, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.getCapsMode(r9, 0, 0) + 6618, android.graphics.Color.argb(0, 0, 0, 0) + 42, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x1ca0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x1ca1, code lost:
    
        r5 = r30;
        r7 = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionGroup(0) + 11, new char[]{'+', '\f', '!', '0', 30, '0', 1, org.apache.commons.lang3.CharUtils.CR, 30, '0', 13860}, (byte) ((((android.content.Context) java.lang.Class.forName(r27).getMethod(r5, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.safaricom.mpesa.lifestyle.R.integer._2131427364_res_0x7f0b0024) & (-3)) + 121), r7);
        r3 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x1ce4, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x1cfb, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x1cff, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r13 = 0;
        r3 = (((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)))) | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x1d2c, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x1d30, code lost:
    
        if (r6 == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x1d32, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.MotionEvent.axisFromString(r9) + 43, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x1d5d, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x1d65, code lost:
    
        r8 = new java.lang.Object[]{720699741, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
        r13 = new java.lang.Object[1];
        e(r2[7], r2[36], (short) (-com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.$$j[191(0xbf, float:2.68E-43)]), r13);
        r1.getMethod((java.lang.String) r13[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x09e1 A[Catch: all -> 0x04da, TryCatch #25 {all -> 0x04da, blocks: (B:149:0x09db, B:151:0x09e1, B:152:0x0a10, B:297:0x108e, B:299:0x1094, B:300:0x10bf, B:746:0x30db, B:748:0x30e1, B:749:0x3107, B:783:0x3429, B:785:0x342f, B:786:0x3457, B:763:0x325e, B:765:0x3281, B:766:0x32d5, B:712:0x2da1, B:714:0x2da7, B:715:0x2dd3, B:806:0x3527, B:808:0x352d, B:809:0x355b, B:811:0x3595, B:812:0x35d8, B:595:0x2601, B:597:0x2616, B:598:0x264c, B:577:0x230b, B:579:0x2311, B:580:0x2340, B:582:0x237a, B:583:0x23c5, B:548:0x1f98, B:550:0x1fad, B:551:0x1fdd, B:553:0x2011, B:554:0x2095, B:527:0x1d2c, B:529:0x1d32, B:530:0x1d5d, B:436:0x17b2, B:438:0x17b8, B:439:0x17eb, B:391:0x1570, B:393:0x1576, B:394:0x15a3, B:23:0x020b, B:25:0x0211, B:26:0x023b, B:28:0x0442, B:30:0x0474, B:31:0x04d4, B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987, B:615:0x2886, B:617:0x288c, B:618:0x28c8, B:620:0x28ef, B:621:0x293a, B:623:0x2950, B:625:0x2959, B:626:0x29a0, B:664:0x2bfb, B:665:0x2bff, B:667:0x2c05, B:670:0x2c1d, B:673:0x2c2a, B:675:0x2c2d, B:687:0x2d18, B:689:0x2d1e, B:690:0x2d1f, B:692:0x2d21, B:694:0x2d28, B:695:0x2d29, B:632:0x29bb, B:634:0x29bf, B:638:0x29cb, B:639:0x29d0, B:640:0x29d3, B:642:0x29d6, B:654:0x2ae1, B:656:0x2ae7, B:657:0x2b2c, B:659:0x2b56, B:660:0x2b9b, B:662:0x2bb1, B:663:0x2bf5, B:697:0x2d2b, B:699:0x2d32, B:700:0x2d33, B:702:0x2d35, B:704:0x2d3c, B:705:0x2d3d, B:678:0x2c57, B:680:0x2c5d, B:681:0x2c87, B:649:0x2a43, B:651:0x2a62, B:652:0x2ad5, B:644:0x29f6, B:646:0x2a0b, B:647:0x2a3c, B:683:0x2c99, B:399:0x1630, B:401:0x1634, B:422:0x1722, B:424:0x1728, B:425:0x1729, B:427:0x172b, B:429:0x1732, B:430:0x1733, B:405:0x1640, B:415:0x1696, B:417:0x16a3, B:418:0x1716, B:411:0x164b, B:413:0x1660, B:414:0x1690), top: B:873:0x020b, inners: #1, #16, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1094 A[Catch: all -> 0x04da, TryCatch #25 {all -> 0x04da, blocks: (B:149:0x09db, B:151:0x09e1, B:152:0x0a10, B:297:0x108e, B:299:0x1094, B:300:0x10bf, B:746:0x30db, B:748:0x30e1, B:749:0x3107, B:783:0x3429, B:785:0x342f, B:786:0x3457, B:763:0x325e, B:765:0x3281, B:766:0x32d5, B:712:0x2da1, B:714:0x2da7, B:715:0x2dd3, B:806:0x3527, B:808:0x352d, B:809:0x355b, B:811:0x3595, B:812:0x35d8, B:595:0x2601, B:597:0x2616, B:598:0x264c, B:577:0x230b, B:579:0x2311, B:580:0x2340, B:582:0x237a, B:583:0x23c5, B:548:0x1f98, B:550:0x1fad, B:551:0x1fdd, B:553:0x2011, B:554:0x2095, B:527:0x1d2c, B:529:0x1d32, B:530:0x1d5d, B:436:0x17b2, B:438:0x17b8, B:439:0x17eb, B:391:0x1570, B:393:0x1576, B:394:0x15a3, B:23:0x020b, B:25:0x0211, B:26:0x023b, B:28:0x0442, B:30:0x0474, B:31:0x04d4, B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987, B:615:0x2886, B:617:0x288c, B:618:0x28c8, B:620:0x28ef, B:621:0x293a, B:623:0x2950, B:625:0x2959, B:626:0x29a0, B:664:0x2bfb, B:665:0x2bff, B:667:0x2c05, B:670:0x2c1d, B:673:0x2c2a, B:675:0x2c2d, B:687:0x2d18, B:689:0x2d1e, B:690:0x2d1f, B:692:0x2d21, B:694:0x2d28, B:695:0x2d29, B:632:0x29bb, B:634:0x29bf, B:638:0x29cb, B:639:0x29d0, B:640:0x29d3, B:642:0x29d6, B:654:0x2ae1, B:656:0x2ae7, B:657:0x2b2c, B:659:0x2b56, B:660:0x2b9b, B:662:0x2bb1, B:663:0x2bf5, B:697:0x2d2b, B:699:0x2d32, B:700:0x2d33, B:702:0x2d35, B:704:0x2d3c, B:705:0x2d3d, B:678:0x2c57, B:680:0x2c5d, B:681:0x2c87, B:649:0x2a43, B:651:0x2a62, B:652:0x2ad5, B:644:0x29f6, B:646:0x2a0b, B:647:0x2a3c, B:683:0x2c99, B:399:0x1630, B:401:0x1634, B:422:0x1722, B:424:0x1728, B:425:0x1729, B:427:0x172b, B:429:0x1732, B:430:0x1733, B:405:0x1640, B:415:0x1696, B:417:0x16a3, B:418:0x1716, B:411:0x164b, B:413:0x1660, B:414:0x1690), top: B:873:0x020b, inners: #1, #16, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x11b0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1208 A[Catch: all -> 0x14e6, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x14e6, blocks: (B:304:0x1151, B:311:0x11a3, B:321:0x1208), top: B:885:0x1151 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x13e0  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1576 A[Catch: all -> 0x04da, TryCatch #25 {all -> 0x04da, blocks: (B:149:0x09db, B:151:0x09e1, B:152:0x0a10, B:297:0x108e, B:299:0x1094, B:300:0x10bf, B:746:0x30db, B:748:0x30e1, B:749:0x3107, B:783:0x3429, B:785:0x342f, B:786:0x3457, B:763:0x325e, B:765:0x3281, B:766:0x32d5, B:712:0x2da1, B:714:0x2da7, B:715:0x2dd3, B:806:0x3527, B:808:0x352d, B:809:0x355b, B:811:0x3595, B:812:0x35d8, B:595:0x2601, B:597:0x2616, B:598:0x264c, B:577:0x230b, B:579:0x2311, B:580:0x2340, B:582:0x237a, B:583:0x23c5, B:548:0x1f98, B:550:0x1fad, B:551:0x1fdd, B:553:0x2011, B:554:0x2095, B:527:0x1d2c, B:529:0x1d32, B:530:0x1d5d, B:436:0x17b2, B:438:0x17b8, B:439:0x17eb, B:391:0x1570, B:393:0x1576, B:394:0x15a3, B:23:0x020b, B:25:0x0211, B:26:0x023b, B:28:0x0442, B:30:0x0474, B:31:0x04d4, B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987, B:615:0x2886, B:617:0x288c, B:618:0x28c8, B:620:0x28ef, B:621:0x293a, B:623:0x2950, B:625:0x2959, B:626:0x29a0, B:664:0x2bfb, B:665:0x2bff, B:667:0x2c05, B:670:0x2c1d, B:673:0x2c2a, B:675:0x2c2d, B:687:0x2d18, B:689:0x2d1e, B:690:0x2d1f, B:692:0x2d21, B:694:0x2d28, B:695:0x2d29, B:632:0x29bb, B:634:0x29bf, B:638:0x29cb, B:639:0x29d0, B:640:0x29d3, B:642:0x29d6, B:654:0x2ae1, B:656:0x2ae7, B:657:0x2b2c, B:659:0x2b56, B:660:0x2b9b, B:662:0x2bb1, B:663:0x2bf5, B:697:0x2d2b, B:699:0x2d32, B:700:0x2d33, B:702:0x2d35, B:704:0x2d3c, B:705:0x2d3d, B:678:0x2c57, B:680:0x2c5d, B:681:0x2c87, B:649:0x2a43, B:651:0x2a62, B:652:0x2ad5, B:644:0x29f6, B:646:0x2a0b, B:647:0x2a3c, B:683:0x2c99, B:399:0x1630, B:401:0x1634, B:422:0x1722, B:424:0x1728, B:425:0x1729, B:427:0x172b, B:429:0x1732, B:430:0x1733, B:405:0x1640, B:415:0x1696, B:417:0x16a3, B:418:0x1716, B:411:0x164b, B:413:0x1660, B:414:0x1690), top: B:873:0x020b, inners: #1, #16, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x1649  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1660 A[Catch: all -> 0x172a, TryCatch #9 {all -> 0x172a, blocks: (B:411:0x164b, B:413:0x1660, B:414:0x1690), top: B:844:0x164b, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x16a3 A[Catch: all -> 0x1720, TryCatch #2 {all -> 0x1720, blocks: (B:415:0x1696, B:417:0x16a3, B:418:0x1716), top: B:831:0x1696, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1872 A[Catch: all -> 0x1ca0, TryCatch #1 {all -> 0x1ca0, blocks: (B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987), top: B:830:0x186c, outer: #25, inners: #38, #44, #51, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x18c8 A[Catch: all -> 0x1ca0, TryCatch #1 {all -> 0x1ca0, blocks: (B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987), top: B:830:0x186c, outer: #25, inners: #38, #44, #51, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x1926 A[Catch: all -> 0x1ca0, TRY_LEAVE, TryCatch #1 {all -> 0x1ca0, blocks: (B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987), top: B:830:0x186c, outer: #25, inners: #38, #44, #51, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x1b51 A[Catch: all -> 0x1ca0, TryCatch #1 {all -> 0x1ca0, blocks: (B:443:0x186c, B:445:0x1872, B:446:0x18bb, B:448:0x18c8, B:450:0x18d1, B:451:0x191b, B:475:0x1b47, B:476:0x1b4b, B:478:0x1b51, B:481:0x1b6b, B:487:0x1b85, B:489:0x1b88, B:501:0x1c76, B:503:0x1c7c, B:504:0x1c7d, B:506:0x1c7f, B:508:0x1c86, B:509:0x1c87, B:452:0x1926, B:464:0x1a23, B:466:0x1a29, B:467:0x1a6d, B:469:0x1a97, B:471:0x1ae0, B:473:0x1af7, B:474:0x1b3f, B:512:0x1c8d, B:514:0x1c94, B:515:0x1c95, B:517:0x1c97, B:519:0x1c9e, B:520:0x1c9f, B:497:0x1bf6, B:492:0x1bb5, B:494:0x1bbb, B:495:0x1be4, B:459:0x198e, B:461:0x19a3, B:462:0x1a17, B:454:0x1946, B:456:0x195b, B:457:0x1987), top: B:830:0x186c, outer: #25, inners: #38, #44, #51, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x1ded  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1e55  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1e9f  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x1eb7  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1f7a  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x21d6  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x22cd  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x24b5  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x2506  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x25e2  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x2788  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x2e6b  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x2eb9  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2f15  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x30bf  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x3195  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x31e5  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x3240  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x340b  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x34f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x1630 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:891:0x0aa3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:934:0x1157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:964:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v123 */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v129 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v132 */
    /* JADX WARN: Type inference failed for: r11v133 */
    /* JADX WARN: Type inference failed for: r11v134 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v145 */
    /* JADX WARN: Type inference failed for: r11v146 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
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
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v25 */
    /* JADX WARN: Type inference failed for: r37v26 */
    /* JADX WARN: Type inference failed for: r37v27 */
    /* JADX WARN: Type inference failed for: r37v28 */
    /* JADX WARN: Type inference failed for: r37v29 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v30 */
    /* JADX WARN: Type inference failed for: r37v34 */
    /* JADX WARN: Type inference failed for: r37v35 */
    /* JADX WARN: Type inference failed for: r37v36 */
    /* JADX WARN: Type inference failed for: r37v37 */
    /* JADX WARN: Type inference failed for: r37v38 */
    /* JADX WARN: Type inference failed for: r37v39 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v40 */
    /* JADX WARN: Type inference failed for: r37v41 */
    /* JADX WARN: Type inference failed for: r37v42 */
    /* JADX WARN: Type inference failed for: r37v43 */
    /* JADX WARN: Type inference failed for: r37v44 */
    /* JADX WARN: Type inference failed for: r37v45 */
    /* JADX WARN: Type inference failed for: r37v46 */
    /* JADX WARN: Type inference failed for: r37v47 */
    /* JADX WARN: Type inference failed for: r37v48 */
    /* JADX WARN: Type inference failed for: r37v49 */
    /* JADX WARN: Type inference failed for: r37v50 */
    /* JADX WARN: Type inference failed for: r37v51 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        component3();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = component4 + 115;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        copydefault = new char[]{30220, 30208, 30214, 30401, 30219, 30334, 30226, 30328, 30222, 30218, 30223, 30216, 30335, 30215, 30211, 30330, 30209, 30332, 30333, 30221, 30212, 30325, 30236, 30239, 30415, 30252};
        component1 = 321287923;
        component3 = true;
        ShareDataUIState = true;
        int i5 = i3 + 83;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component2 = new char[]{1967, 2033, 1973, 2022, 1976, 1978, 1975, 2020, 1970, 2027, 2038, 2003, 2019, 2000, 1964, 2028, 2023, 2021, 2031, 1953, 2017, 1969, 2025, 2030, 2034, 2029, 2032, 1966, 2002, 2035, 2005, 1954, 2037, 2018, 1977, 1952, 1968, 1987, 2024, 2036, 2026, 1971, 1992, 1955, 1974, 2041, 1958, 1972, 1965};
        equals = (char) 12829;
        copy = -6043705160332232714L;
    }
}
