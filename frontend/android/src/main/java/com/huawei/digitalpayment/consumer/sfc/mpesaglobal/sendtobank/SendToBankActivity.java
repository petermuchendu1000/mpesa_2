package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.global.databinding.ActivityMpesaGlobalBinding;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalActivity;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MPesaGlobalCountryPickerFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optin.failure.MPesaGlobalErrorFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.SendToBankBankDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.recipientdetails.SendToBankRecipientDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import com.safaricom.sharedui.compose.confirmation.ConfirmTransactionFragment;
import com.safaricom.sharedui.compose.confirmation.ConfirmTransactionViewModel;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import com.safaricom.sharedui.compose.stk.StkPushActivity;
import com.safaricom.sharedui.compose.utils.FragmentExtensionsKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.notify;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\u0016\u0010$\u001a\u00020\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankActivity;", "Lcom/safaricom/sharedui/compose/activity/BackHandlerActivity;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/global/databinding/ActivityMpesaGlobalBinding;", "sendToBankViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankViewModel;", "getSendToBankViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankViewModel;", "sendToBankViewModel$delegate", "Lkotlin/Lazy;", "mpesaGlobalCountriesViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "getMpesaGlobalCountriesViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "mpesaGlobalCountriesViewModel$delegate", "confirmTransactionViewModel", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "getConfirmTransactionViewModel", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "confirmTransactionViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleBackPress", "onPause", "onResume", "observeConfirmationForwardNavigation", "observeConfirmationBackNavigation", "observeConfirmationData", "observeGetFeeLoading", "observeScreenChange", "observeCountrySelection", "observeCountriesBackNavigation", "changeScreen", "screenInformation", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "setConfirmationData", "showStkPush", "observeCountryFetchingState", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SendToBankActivity extends Hilt_SendToBankActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static boolean ShareDataUIState;
    private static long component1;
    private static char[] component2;
    private static boolean component3;
    private static int copy;
    private static int copydefault;
    private static char[] equals;
    private ActivityMpesaGlobalBinding binding;

    private final Lazy confirmTransactionViewModel;

    private final Lazy mpesaGlobalCountriesViewModel;

    private final Lazy sendToBankViewModel;
    private static final byte[] $$l = {46, -95, Ascii.VT, -87};
    private static final int $$o = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {102, Ascii.FF, 98, 84, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, 1, 59, -57, -17, 0, 3, 2, -18, 1, -2, -7, 0, 3, 2, -18, 66, -60, -5, 0, TarHeader.LF_DIR, -28, -37, 0, Ascii.US, -49, Ascii.SO, -25, 19, -4, -13, 4, Ascii.EM, -40, 2, -14, -24, 4, -20, 10, Ascii.RS, -32, -22, Ascii.DLE, 9, 9, -13, -36, Ascii.DLE, -22, Ascii.FF};
    private static final int $$n = 237;
    private static final byte[] $$d = {69, -38, -90, 81, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 239;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int component4 = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copy implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final Function1 copydefault;

        copy(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 9;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (obj instanceof Observer) {
                int i5 = i2 + 63;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                if (!(!(obj instanceof FunctionAdapter))) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i7 = component2 + 125;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    return zAreEqual;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.copydefault;
            int i5 = i3 + 41;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$l
            int r6 = r6 + 4
            int r8 = r8 + 68
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2c
        L14:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$r(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$d
            int r1 = r6 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.h(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 83
            int r0 = r8 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$m
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-3)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.i(byte, int, byte, java.lang.Object[]):void");
    }

    public static final void access$changeScreen(SendToBankActivity sendToBankActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sendToBankActivity.changeScreen(screenInformation);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
    }

    public static final ConfirmTransactionViewModel access$getConfirmTransactionViewModel(SendToBankActivity sendToBankActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = sendToBankActivity.getConfirmTransactionViewModel();
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return confirmTransactionViewModel;
    }

    public static final MpesaGlobalCountriesViewModel access$getMpesaGlobalCountriesViewModel(SendToBankActivity sendToBankActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = sendToBankActivity.getMpesaGlobalCountriesViewModel();
        int i4 = getAsAtTimestamp + 75;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return mpesaGlobalCountriesViewModel;
    }

    public static final SendToBankViewModel access$getSendToBankViewModel(SendToBankActivity sendToBankActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        SendToBankViewModel sendToBankViewModel = sendToBankActivity.getSendToBankViewModel();
        int i4 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return sendToBankViewModel;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", WindowInfoFieldGroup.FIELD_SCREEN, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component3 = 1;
        private static int copydefault;

        private Companion() {
        }

        public static Intent createIntent$default(Companion companion, Context context, MPesaGlobalScreen mPesaGlobalScreen, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 75;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 125;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    MPesaGlobalScreen.CountrySelection countrySelection = MPesaGlobalScreen.CountrySelection.INSTANCE;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                mPesaGlobalScreen = MPesaGlobalScreen.CountrySelection.INSTANCE;
            }
            return companion.createIntent(context, mPesaGlobalScreen);
        }

        public final Intent createIntent(Context context, MPesaGlobalScreen screen) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(screen, "");
            Intent intent = new Intent(context, (Class<?>) SendToBankActivity.class);
            intent.putExtra("screen_key", screen);
            int i2 = copydefault + 43;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SendToBankActivity() {
        final SendToBankActivity sendToBankActivity = this;
        final Function0 function0 = null;
        this.sendToBankViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SendToBankViewModel.class), new SendToBankActivity$special$$inlined$viewModels$default$2(sendToBankActivity), new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 33;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = ShareDataUIState + 123;
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
                int i2 = component1 + 51;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToBankActivity.getDefaultViewModelProviderFactory();
                int i4 = component1 + 33;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 61 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$special$$inlined$viewModels$default$3.component2
                    int r1 = r1 + 15
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r2
                    int r1 = r1 % r0
                    kotlin.jvm.functions.Function0 r1 = r1
                    r3 = 0
                    if (r1 == 0) goto L2a
                    int r2 = r2 + 109
                    int r4 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$special$$inlined$viewModels$default$3.component2 = r4
                    int r2 = r2 % r0
                    if (r2 == 0) goto L23
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L30
                    goto L2a
                L23:
                    java.lang.Object r0 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    throw r3
                L2a:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L30:
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$special$$inlined$viewModels$default$3.ShareDataUIState
                    int r2 = r2 + 123
                    int r4 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$special$$inlined$viewModels$default$3.component2 = r4
                    int r2 = r2 % r0
                    if (r2 == 0) goto L3c
                    return r1
                L3c:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 121;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = component2 + 75;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.mpesaGlobalCountriesViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MpesaGlobalCountriesViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 111;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    sendToBankActivity.getViewModelStore();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = sendToBankActivity.getViewModelStore();
                int i3 = component1 + 33;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 103;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = ShareDataUIState + 79;
                component1 = i4 % 128;
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
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 107;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component1 + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 31;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToBankActivity.getDefaultViewModelProviderFactory();
                if (i3 != 0) {
                    int i4 = 78 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 111;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 49;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = sendToBankActivity.getDefaultViewModelCreationExtras();
                int i7 = component3 + 105;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 123;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.confirmTransactionViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ConfirmTransactionViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 29;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sendToBankActivity.getViewModelStore();
                int i4 = component3 + 83;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 15;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
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
                int i2 = copydefault + 1;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = copydefault + 57;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    defaultViewModelProviderFactory = sendToBankActivity.getDefaultViewModelProviderFactory();
                    int i3 = 58 / 0;
                } else {
                    defaultViewModelProviderFactory = sendToBankActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = copydefault + 17;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return defaultViewModelProviderFactory;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 101;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = sendToBankActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = copydefault + 21;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 75;
                copydefault = i4 % 128;
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

    private final SendToBankViewModel getSendToBankViewModel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SendToBankViewModel sendToBankViewModel = (SendToBankViewModel) this.sendToBankViewModel.getValue();
        int i4 = getAsAtTimestamp + 65;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return sendToBankViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final MpesaGlobalCountriesViewModel getMpesaGlobalCountriesViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = (MpesaGlobalCountriesViewModel) this.mpesaGlobalCountriesViewModel.getValue();
        int i4 = getAsAtTimestamp + 123;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return mpesaGlobalCountriesViewModel;
        }
        throw null;
    }

    private final ConfirmTransactionViewModel getConfirmTransactionViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = (ConfirmTransactionViewModel) this.confirmTransactionViewModel.getValue();
        if (i3 != 0) {
            return confirmTransactionViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 33, (char) (60267 - Process.getGidForName("")), -834797019, false, $$r(b2, b3, (byte) (b3 | 34)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() * (component1 / 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 686, Color.green(0) + 34, (char) (60372 - ImageFormat.getBitsPerPixel(0)), -1969106284, false, $$r(b4, b5, (byte) (b5 | 37)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16780482, 33 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (60268 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), -834797019, false, $$r(b6, b7, (byte) (b7 | 34)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 687, Process.getGidForName("") + 35, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60374), -1969106284, false, $$r(b8, b9, (byte) (b9 | 37)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(686 - MotionEvent.axisFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) (60373 - View.MeasureSpec.getSize(0)), -1969106284, false, $$r(b10, b11, (byte) (b11 | 37)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i8 = $11 + 47;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationForwardNavigation$1", f = "SendToBankActivity.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationForwardNavigation$1$1", f = "SendToBankActivity.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final SendToBankActivity component1;
            int component2;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 115;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = component3 + 31;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateForwardUiEvent = SendToBankActivity.access$getConfirmTransactionViewModel(this.component1).getNavigateForwardUiEvent();
                    final SendToBankActivity sendToBankActivity = this.component1;
                    this.component2 = 1;
                    if (navigateForwardUiEvent.collect(new FlowCollector() {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i7 = 2 % 2;
                            int i8 = component3 + 115;
                            copydefault = i8 % 128;
                            int i9 = i8 % 2;
                            Object objComponent3 = component3(((Boolean) obj2).booleanValue(), continuation);
                            int i10 = copydefault + 99;
                            component3 = i10 % 128;
                            if (i10 % 2 == 0) {
                                return objComponent3;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object component3(boolean z, Continuation<? super Unit> continuation) {
                            int i7 = 2 % 2;
                            int i8 = copydefault + 93;
                            component3 = i8 % 128;
                            Object obj2 = null;
                            if (i8 % 2 != 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            if (z) {
                                for (T t : SendToBankActivity.access$getSendToBankViewModel(sendToBankActivity).getConfirmationData().getValue()) {
                                    if (((ConfirmInfoItem) t) instanceof ConfirmInfoItem.FeeRequestDetails) {
                                        int i9 = copydefault + 77;
                                        component3 = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            Intrinsics.checkNotNull(t, "");
                                            SendToBankActivity.access$getSendToBankViewModel(sendToBankActivity).onConfirmContinue(sendToBankActivity, ((ConfirmInfoItem.FeeRequestDetails) t).getFeeRequestId());
                                            throw null;
                                        }
                                        Intrinsics.checkNotNull(t, "");
                                        SendToBankActivity.access$getSendToBankViewModel(sendToBankActivity).onConfirmContinue(sendToBankActivity, ((ConfirmInfoItem.FeeRequestDetails) t).getFeeRequestId());
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            Unit unit = Unit.INSTANCE;
                            int i10 = copydefault + 105;
                            component3 = i10 % 128;
                            if (i10 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        int i7 = component3 + 7;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component1 = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component1, continuation);
                int i2 = component3 + 113;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 49;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = ShareDataUIState + 19;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objComponent2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                if (i3 != 0) {
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass4.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 57;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = ShareDataUIState;
                int i6 = i5 + 113;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 13;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankActivity.this, Lifecycle.State.STARTED, new AnonymousClass4(SendToBankActivity.this, null), this) == coroutine_suspended) {
                    int i10 = copydefault + 3;
                    ShareDataUIState = i10 % 128;
                    int i11 = i10 % 2;
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
            component3 component3Var = SendToBankActivity.this.new component3(continuation);
            int i2 = copydefault + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = copydefault + 103;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 113;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationBackNavigation$1", f = "SendToBankActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationBackNavigation$1$1", f = "SendToBankActivity.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component3 = 1;
            private static int copydefault;
            final SendToBankActivity ShareDataUIState;
            int component2;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 53;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component2;
                if (i3 != 0) {
                    int i4 = component3 + 87;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = component3 + 109;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateBackUiEvent = SendToBankActivity.access$getConfirmTransactionViewModel(this.ShareDataUIState).getNavigateBackUiEvent();
                    final SendToBankActivity sendToBankActivity = this.ShareDataUIState;
                    this.component2 = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int component1 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i7 = 2 % 2;
                            int i8 = copydefault + 15;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            Object objComponent1 = component1(((Boolean) obj2).booleanValue(), continuation);
                            if (i9 != 0) {
                                int i10 = 93 / 0;
                            }
                            return objComponent1;
                        }

                        public final Object component1(boolean z, Continuation<? super Unit> continuation) {
                            int i7 = 2 % 2;
                            int i8 = component1;
                            int i9 = i8 + 125;
                            copydefault = i9 % 128;
                            if (i9 % 2 == 0) {
                                throw null;
                            }
                            if (z) {
                                int i10 = i8 + 49;
                                copydefault = i10 % 128;
                                int i11 = i10 % 2;
                                SendToBankActivity.access$getSendToBankViewModel(sendToBankActivity).previousScreen();
                                int i12 = component1 + 91;
                                copydefault = i12 % 128;
                                int i13 = i12 % 2;
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.ShareDataUIState = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.ShareDataUIState, continuation);
                int i2 = component3 + 109;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                component3 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return component3(coroutineScope2, continuation2);
                }
                component3(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 45;
                component3 = i4 % 128;
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
            int i2 = copydefault + 113;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 != 0) {
                int i4 = copydefault + 107;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SendToBankActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = SendToBankActivity.this.new copydefault(continuation);
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = copydefault + 97;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return copydefaultVar.invokeSuspend(unit);
            }
            copydefaultVar.invokeSuspend(unit);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationData$1", f = "SendToBankActivity.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int copydefault = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationData$1$1", f = "SendToBankActivity.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int component3 = 1;
            int ShareDataUIState;
            final SendToBankActivity copydefault;

            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeConfirmationData$1$1$1", f = "SendToBankActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C02393 extends SuspendLambda implements Function2<List<? extends ConfirmInfoItem>, Continuation<? super Unit>, Object> {
                private static int component3 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                final SendToBankActivity component1;
                Object component2;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component3 + 77;
                    copydefault = i2 % 128;
                    Object obj2 = null;
                    if (i2 % 2 == 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        obj2.hashCode();
                        throw null;
                    }
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SendToBankActivity.access$getConfirmTransactionViewModel(this.component1).setConfirmTransactionDetailsInfo((List) this.component2, this.component1);
                    Unit unit = Unit.INSTANCE;
                    int i3 = component3 + 77;
                    copydefault = i3 % 128;
                    if (i3 % 2 != 0) {
                        return unit;
                    }
                    obj2.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02393(SendToBankActivity sendToBankActivity, Continuation<? super C02393> continuation) {
                    super(2, continuation);
                    this.component1 = sendToBankActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02393 c02393 = new C02393(this.component1, continuation);
                    c02393.component2 = obj;
                    C02393 c023932 = c02393;
                    int i2 = component3 + 25;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        return c023932;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 5;
                    copydefault = i2 % 128;
                    List<? extends ConfirmInfoItem> list2 = list;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return component1(list2, continuation2);
                    }
                    Object objComponent1 = component1(list2, continuation2);
                    int i3 = 46 / 0;
                    return objComponent1;
                }

                public final Object component1(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 25;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((C02393) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 61;
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
                    int i3 = component3 + 85;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = component3 + 81;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.ShareDataUIState = 1;
                    if (FlowKt.collectLatest(SendToBankActivity.access$getSendToBankViewModel(this.copydefault).getConfirmationData(), new C02393(this.copydefault, null), this) == coroutine_suspended) {
                        int i6 = component2 + 101;
                        component3 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.copydefault = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.copydefault, continuation);
                int i2 = component3 + 81;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 67;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = component2 + 71;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 83;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass3.invokeSuspend(unit);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(unit);
                int i4 = component3 + 71;
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
            int i2 = component2 + 93;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankActivity.this, Lifecycle.State.RESUMED, new AnonymousClass3(SendToBankActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = component2 + 105;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
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
            component2 component2Var = SendToBankActivity.this.new component2(continuation);
            int i2 = copydefault + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 59;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            ShareDataUIState(coroutineScope2, continuation2);
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component2Var.invokeSuspend(unit);
            }
            component2Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeGetFeeLoading$1", f = "SendToBankActivity.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeGetFeeLoading$1$1", f = "SendToBankActivity.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component3 = 1;
            private static int copydefault;
            final SendToBankActivity component1;
            int component2;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/payment/mvvm/Resource;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeGetFeeLoading$1$1$1", f = "SendToBankActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<Resource<Unit>, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int component3 = 1;
                int ShareDataUIState;
                Object component2;
                final SendToBankActivity copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = component1 + 117;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    ResultKt.throwOnFailure(obj);
                    Resource resource = (Resource) this.component2;
                    if (i3 == 0) {
                        SendToBankActivity.access$getConfirmTransactionViewModel(this.copydefault).updateIsLoading(resource.loading());
                        resource.error();
                        throw null;
                    }
                    SendToBankActivity.access$getConfirmTransactionViewModel(this.copydefault).updateIsLoading(resource.loading());
                    if (resource.error()) {
                        SendToBankActivity.access$getSendToBankViewModel(this.copydefault).showError();
                        int i4 = component1 + 67;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.copydefault = sendToBankActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.copydefault, continuation);
                    anonymousClass1.component2 = obj;
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    int i2 = component1 + 21;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        return anonymousClass12;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object copydefault(Resource<Unit> resource, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 73;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass1) create(resource, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 27;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                @Override
                public Object invoke(Resource<Unit> resource, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 109;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(resource, continuation);
                    int i4 = component1 + 19;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objCopydefault;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[PHI: r1
  0x0040: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.component3
                    int r1 = r1 + 33
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.copydefault = r2
                    int r1 = r1 % r0
                    r2 = 1
                    if (r1 == 0) goto L1c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r6.component2
                    r4 = 22
                    int r4 = r4 / 0
                    if (r3 == 0) goto L40
                    goto L24
                L1c:
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r6.component2
                    if (r3 == 0) goto L40
                L24:
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.component3
                    int r1 = r1 + 23
                    int r4 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.copydefault = r4
                    int r1 = r1 % r0
                    if (r1 == 0) goto L32
                    if (r3 != r2) goto L38
                    goto L34
                L32:
                    if (r3 != r2) goto L38
                L34:
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L74
                L38:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L40:
                    kotlin.ResultKt.throwOnFailure(r7)
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity r7 = r6.component1
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankViewModel r7 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.access$getSendToBankViewModel(r7)
                    kotlinx.coroutines.flow.StateFlow r7 = r7.getConfirmationLoading()
                    kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$getRequestBeneficiariesState$3$1 r3 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$getRequestBeneficiariesState$3$1
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity r4 = r6.component1
                    r5 = 0
                    r3.<init>(r4, r5)
                    kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                    r4 = r6
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    r6.component2 = r2
                    java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r3, r4)
                    if (r7 != r1) goto L74
                    int r7 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.copydefault
                    int r7 = r7 + 95
                    int r2 = r7 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.component3 = r2
                    int r7 = r7 % r0
                    if (r7 == 0) goto L70
                    return r1
                L70:
                    r5.hashCode()
                    throw r5
                L74:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component1 = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, continuation);
                int i2 = component3 + 65;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass3;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 121;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault(coroutineScope, continuation);
                int i4 = component3 + 3;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                if (i3 == 0) {
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 46 / 0;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            if (i4 != 0) {
                int i5 = component3 + 25;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = component3 + 79;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankActivity.this, Lifecycle.State.RESUMED, new AnonymousClass3(SendToBankActivity.this, null), this) == coroutine_suspended) {
                    int i9 = copydefault + 41;
                    component3 = i9 % 128;
                    if (i9 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = component3 + 7;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        getRequestBeneficiariesState(Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = SendToBankActivity.this.new getRequestBeneficiariesState(continuation);
            int i2 = component3 + 119;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return getrequestbeneficiariesstate;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 117;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component2(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = copydefault + 29;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = (getRequestBeneficiariesState) create(coroutineScope, continuation);
            if (i3 != 0) {
                getrequestbeneficiariesstate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = getrequestbeneficiariesstate.invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 55;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class equals extends FunctionReferenceImpl implements Function1<ScreenInformation<MPesaGlobalScreen>, Unit> {
        private static int component3 = 1;
        private static int copydefault;

        public final void ShareDataUIState(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component3 + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(screenInformation, "");
            SendToBankActivity.access$changeScreen((SendToBankActivity) this.receiver, screenInformation);
            int i4 = component3 + 7;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override
        public Unit invoke(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(screenInformation);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            int i4 = 25 / 0;
            return Unit.INSTANCE;
        }

        equals(Object obj) {
            super(1, obj, SendToBankActivity.class, "changeScreen", "changeScreen(Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;)V", 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountrySelection$1", f = "SendToBankActivity.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class component4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountrySelection$1$1", f = "SendToBankActivity.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int component3;
            int ShareDataUIState;
            final SendToBankActivity component1;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountrySelection$1$1$1", f = "SendToBankActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<Country, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int component2 = 1;
                int ShareDataUIState;
                final SendToBankActivity component3;
                Object copydefault;

                /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.component2
                        int r1 = r1 + 97
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.component1 = r2
                        int r1 = r1 % r0
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.ShareDataUIState
                        if (r1 != 0) goto L56
                        int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.component1
                        int r1 = r1 + 71
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.component2 = r2
                        int r1 = r1 % r0
                        kotlin.ResultKt.throwOnFailure(r5)
                        java.lang.Object r5 = r4.copydefault
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country r5 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country) r5
                        if (r1 != 0) goto L2c
                        r1 = 28
                        int r1 = r1 / 0
                        if (r5 == 0) goto L53
                        goto L2e
                    L2c:
                        if (r5 == 0) goto L53
                    L2e:
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity r1 = r4.component3
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankViewModel r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.access$getSendToBankViewModel(r1)
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.access$getMpesaGlobalCountriesViewModel(r1)
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.State r3 = r3.getSelectedUsState()
                        r2.setCountry(r5, r3)
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.access$getMpesaGlobalCountriesViewModel(r1)
                        r5.clearSelectedCountry()
                        int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.component2
                        int r5 = r5 + 77
                        int r1 = r5 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.component1 = r1
                        int r5 = r5 % r0
                        if (r5 == 0) goto L53
                        r5 = 4
                        int r5 = r5 % r0
                    L53:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    L56:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.component4.AnonymousClass5.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component3 = sendToBankActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3, continuation);
                    anonymousClass2.copydefault = obj;
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = component2 + 57;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass22;
                }

                public final Object ShareDataUIState(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 43;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(country, continuation);
                    if (i3 == 0) {
                        anonymousClass2.invokeSuspend(Unit.INSTANCE);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass2.invokeSuspend(Unit.INSTANCE);
                    int i4 = component2 + 45;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 32 / 0;
                    }
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 55;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objShareDataUIState = ShareDataUIState(country, continuation);
                    int i4 = component1 + 105;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 85 / 0;
                    }
                    return objShareDataUIState;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 91;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.ShareDataUIState;
                if (i4 != 0) {
                    int i5 = component3 + 93;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.ShareDataUIState = 1;
                    if (FlowKt.collectLatest(SendToBankActivity.access$getMpesaGlobalCountriesViewModel(this.component1).getSelectedCountry(), new AnonymousClass2(this.component1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component1 = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component1, continuation);
                int i2 = component3 + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 21;
                component3 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    component3(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objComponent3 = component3(coroutineScope2, continuation2);
                int i3 = component2 + 35;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 75;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass5.invokeSuspend(unit);
                }
                anonymousClass5.invokeSuspend(unit);
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = component1 + 23;
                component2 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankActivity.this, Lifecycle.State.RESUMED, new AnonymousClass5(SendToBankActivity.this, null), this) == coroutine_suspended) {
                    int i4 = component1 + 1;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 11 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = component2 + 23;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        component4(Continuation<? super component4> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component4 component4Var = SendToBankActivity.this.new component4(continuation);
            int i2 = component1 + 7;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return component4Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = component2 + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component4 component4Var = (component4) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                component4Var.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = component4Var.invokeSuspend(unit);
            int i4 = component2 + 67;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountriesBackNavigation$1", f = "SendToBankActivity.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountriesBackNavigation$1$1", f = "SendToBankActivity.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component3;
            final SendToBankActivity component1;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.copydefault;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 115;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = component3 + 1;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateBackUiEvent = SendToBankActivity.access$getMpesaGlobalCountriesViewModel(this.component1).getNavigateBackUiEvent();
                    final SendToBankActivity sendToBankActivity = this.component1;
                    this.copydefault = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i7 = 2 % 2;
                            int i8 = copydefault + 57;
                            component3 = i8 % 128;
                            int i9 = i8 % 2;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i9 == 0) {
                                return component1(zBooleanValue, continuation);
                            }
                            component1(zBooleanValue, continuation);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object component1(boolean z, Continuation<? super Unit> continuation) {
                            int i7 = 2 % 2;
                            int i8 = copydefault + 55;
                            component3 = i8 % 128;
                            Object obj2 = null;
                            if (i8 % 2 != 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            if (!(!z)) {
                                SendToBankActivity.access$getSendToBankViewModel(sendToBankActivity).previousScreen();
                            }
                            Unit unit = Unit.INSTANCE;
                            int i9 = copydefault + 13;
                            component3 = i9 % 128;
                            if (i9 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component1 = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, continuation);
                int i2 = ShareDataUIState + 31;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 115;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    component1(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objComponent1 = component1(coroutineScope2, continuation2);
                int i3 = component3 + 95;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 107;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                if (i3 != 0) {
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass3.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SendToBankActivity.this, null), this) == coroutine_suspended) {
                    int i5 = component1;
                    int i6 = i5 + 77;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 7;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = component1 + 5;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
                ResultKt.throwOnFailure(obj);
                int i12 = ShareDataUIState + 105;
                component1 = i12 % 128;
                int i13 = i12 % 2;
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = SendToBankActivity.this.new component1(continuation);
            int i2 = ShareDataUIState + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = component1 + 13;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void g(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component2;
        float f = 0.0f;
        int i3 = -1;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 3760, (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 25, (char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1), -1670574543, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                    i3 = -1;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - KeyEvent.normalizeMetaState(0), 12 - TextUtils.lastIndexOf("", '0'), (char) Color.alpha(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (component3) {
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2747, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7644), -327556343, false, $$r(b4, b5, (byte) (b5 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i6 = $11 + 11;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!ShareDataUIState) {
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $10 + 7;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            cancelVar.component1 = cArr.length;
            cArr2 = new char[cancelVar.component1];
            cancelVar.component3 = 1;
        } else {
            cancelVar.component1 = cArr.length;
            cArr2 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
        }
        while (cancelVar.component3 < cancelVar.component1) {
            cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i5);
            if (objCopydefault4 == null) {
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2747, 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (7645 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), -327556343, false, $$r(b6, b7, (byte) (b7 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i5 = 689978476;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = equals;
        long j = 0;
        double d2 = 0.0d;
        if (cArr2 != null) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr2[i2]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 657, 15 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                    i4 = 0;
                    j = 0;
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1)) + 4502, ImageFormat.getBitsPerPixel(0) + 37, (char) (27898 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1464227204, false, $$r(b2, b3, (byte) (b3 | 42)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 3580, 28 - TextUtils.getOffsetAfter("", 0), (char) Color.green(0), 1180380354, false, $$r(b4, b5, (byte) (b5 | 47)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) (-1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1859, 34 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Process.myTid() >> 22), 80302927, false, $$r(b6, (byte) (b6 + 1), $$l[0]), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                d2 = 0.0d;
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i14, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i14);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            iTrustedWebActivityService_Parcel.copydefault = i;
            int i15 = $10 + 91;
            $11 = i15 % 128;
            int i16 = 2;
            int i17 = i15 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                int i18 = $10 + 101;
                $11 = i18 % 128;
                int i19 = i18 % i16;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
                i16 = 2;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i20 = $10 + 61;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (true) {
                iTrustedWebActivityService_Parcel.copydefault = i22;
                if (iTrustedWebActivityService_Parcel.copydefault >= i6) {
                    break;
                }
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                i22 = iTrustedWebActivityService_Parcel.copydefault + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountryFetchingState$1", f = "SendToBankActivity.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountryFetchingState$1$1", f = "SendToBankActivity.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            int component1;
            final SendToBankActivity copydefault;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchState;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$observeCountryFetchingState$1$1$1", f = "SendToBankActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<CountryFetchState, Continuation<? super Unit>, Object> {
                private static int component2 = 0;
                private static int component3 = 1;
                int ShareDataUIState;
                final SendToBankActivity component1;
                Object copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component2 + 19;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CountryFetchState countryFetchState = (CountryFetchState) this.copydefault;
                    if (!countryFetchState.isLoading() && countryFetchState.isError()) {
                        SendToBankActivity.access$getSendToBankViewModel(this.component1).showError();
                        int i4 = component2 + 31;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.component1 = sendToBankActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, continuation);
                    anonymousClass3.copydefault = obj;
                    AnonymousClass3 anonymousClass32 = anonymousClass3;
                    int i2 = component2 + 73;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass32;
                }

                public final Object ShareDataUIState(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 59;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(countryFetchState, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return anonymousClass3.invokeSuspend(unit);
                    }
                    anonymousClass3.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 59;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objShareDataUIState = ShareDataUIState(countryFetchState, continuation);
                    int i4 = component3 + 29;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objShareDataUIState;
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
                    int i3 = ShareDataUIState + 59;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = null;
                    this.component1 = 1;
                    if (FlowKt.collectLatest(SendToBankActivity.access$getMpesaGlobalCountriesViewModel(this.copydefault).getCountryFetchState(), new AnonymousClass3(this.copydefault, null), this) == coroutine_suspended) {
                        int i4 = component2 + 87;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SendToBankActivity sendToBankActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.copydefault = sendToBankActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.copydefault, continuation);
                int i2 = ShareDataUIState + 45;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 123;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = component2 + 107;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return objComponent2;
                }
                throw null;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 65;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                if (i3 == 0) {
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass4.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[PHI: r1
  0x003f: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r4
  0x0023: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.component1
                int r1 = r1 + 11
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.ShareDataUIState = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r8.component3
                int r5 = r3 / r3
                if (r4 == 0) goto L3f
                goto L23
            L1b:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r8.component3
                if (r4 == 0) goto L3f
            L23:
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.ShareDataUIState
                int r1 = r1 + 33
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.component1 = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L31
                if (r4 != 0) goto L37
                goto L33
            L31:
                if (r4 != r2) goto L37
            L33:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L6b
            L37:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L3f:
                kotlin.ResultKt.throwOnFailure(r9)
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity r9 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.this
                androidx.lifecycle.LifecycleOwner r9 = (androidx.lifecycle.LifecycleOwner) r9
                androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$ShareDataUIState$4 r5 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity$ShareDataUIState$4
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.this
                r7 = 0
                r5.<init>(r6, r7)
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                r6 = r8
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r8.component3 = r2
                java.lang.Object r9 = androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r9, r4, r5, r6)
                if (r9 != r1) goto L6b
                int r9 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.component1
                int r9 = r9 + 75
                int r2 = r9 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.ShareDataUIState = r2
                int r9 = r9 % r0
                if (r9 != 0) goto L6a
                r9 = 7
                int r9 = r9 / r3
            L6a:
                return r1
            L6b:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.ShareDataUIState.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = SendToBankActivity.this.new ShareDataUIState(continuation);
            int i2 = ShareDataUIState + 91;
            component1 = i2 % 128;
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
            int i2 = ShareDataUIState + 13;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 77;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0107  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void handleBackPress() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        getSendToBankViewModel().previousScreen();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, false, new int[]{0, 26, 137, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).codePointAt(0) + 81, new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 91;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getTapTimeout() >> 16), 42 - View.MeasureSpec.getMode(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.MeasureSpec.getMode(0), 56 - (ViewConfiguration.getScrollBarSize() >> 8), (char) KeyEvent.keyCodeFromString(""), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = getAsAtTimestamp + 87;
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
        super.onPause();
        getSendToBankViewModel().onPause();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -445713961
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
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.onResume():void");
    }

    private final void observeConfirmationForwardNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = getAsAtTimestamp + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeConfirmationBackNavigation() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copydefault(null), 3, null);
        int i2 = getAsAtTimestamp + 41;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void observeConfirmationData() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component2(null), 3, null);
        int i2 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void observeGetFeeLoading() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new getRequestBeneficiariesState(null), 3, null);
        int i2 = getRequestBeneficiariesState + 9;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void observeScreenChange() {
        int i = 2 % 2;
        getSendToBankViewModel().getScreenTransition().observe(this, new copy(new equals(this)));
        int i2 = getAsAtTimestamp + 65;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
    }

    private final void observeCountrySelection() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component4(null), 3, null);
        int i2 = getAsAtTimestamp + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeCountriesBackNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component1(null), 3, null);
        int i2 = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void changeScreen(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        MPesaGlobalErrorFragment mPesaGlobalErrorFragment;
        int i;
        int i2 = 2 % 2;
        MPesaGlobalScreen screen = screenInformation.getScreen();
        if (!(!Intrinsics.areEqual(screen, MPesaGlobalScreen.CountrySelection.INSTANCE))) {
            mPesaGlobalErrorFragment = MPesaGlobalCountryPickerFragment.INSTANCE.create(CountryListType.SEND_TO_BANK);
            i = getRequestBeneficiariesState + 109;
        } else {
            if (!Intrinsics.areEqual(screen, MPesaGlobalScreen.RecipientDetails.INSTANCE)) {
                if (Intrinsics.areEqual(screen, MPesaGlobalScreen.BankDetails.INSTANCE)) {
                    mPesaGlobalErrorFragment = new SendToBankBankDetailsFragment();
                } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.AmountDetails.INSTANCE)) {
                    mPesaGlobalErrorFragment = new SendToBankAmountDetailsFragment();
                } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Confirmation.INSTANCE)) {
                    setConfirmationData();
                    mPesaGlobalErrorFragment = new ConfirmTransactionFragment();
                } else {
                    if (!(!Intrinsics.areEqual(screen, MPesaGlobalScreen.TransactionSuccess.INSTANCE))) {
                        showStkPush();
                        return;
                    }
                    if (!(screen instanceof MPesaGlobalScreen.TransactionError)) {
                        if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Dashboard.INSTANCE)) {
                            MpesaGlobalActivity.INSTANCE.showDashboard(this);
                            finish();
                            return;
                        }
                        return;
                    }
                    mPesaGlobalErrorFragment = new MPesaGlobalErrorFragment();
                    i = getRequestBeneficiariesState + 69;
                }
                Fragment fragment = mPesaGlobalErrorFragment;
                int i3 = getRequestBeneficiariesState + 1;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                ScreenDirection direction = screenInformation.getDirection();
                String simpleName = fragment.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                FragmentExtensionsKt.showFragment$default(supportFragmentManager, direction, simpleName, fragment, false, com.huawei.digitalpayment.consumer.sfc.global.R.id.container, null, 32, null);
            }
            mPesaGlobalErrorFragment = new SendToBankRecipientDetailsFragment();
            i = getRequestBeneficiariesState + 19;
        }
        getAsAtTimestamp = i % 128;
        int i5 = i % 2;
        Fragment fragment2 = mPesaGlobalErrorFragment;
        int i32 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i32 % 128;
        int i42 = i32 % 2;
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        ScreenDirection direction2 = screenInformation.getDirection();
        String simpleName2 = fragment2.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "");
        FragmentExtensionsKt.showFragment$default(supportFragmentManager2, direction2, simpleName2, fragment2, false, com.huawei.digitalpayment.consumer.sfc.global.R.id.container, null, 32, null);
    }

    private final void setConfirmationData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = getConfirmTransactionViewModel();
        String string = getString(com.huawei.digitalpayment.consumer.sfc.global.R.string.design_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        confirmTransactionViewModel.updateScreenTitleText(string);
        String string2 = getString(com.huawei.digitalpayment.consumer.sfc.global.R.string.send);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        confirmTransactionViewModel.updateConfirmButtonText(string2);
        confirmTransactionViewModel.shouldShowNewAvatarIcon(true);
        int i4 = getRequestBeneficiariesState + 19;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    private final void showStkPush() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        startActivity(StkPushActivity.INSTANCE.newInstance(this));
        finish();
        int i4 = getAsAtTimestamp + 77;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void observeCountryFetchingState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d8, code lost:
    
        if (r1 != ((r11 + (((~(r8 | (-105644069))) | (~(248281652 | r10))) * 859)) + (((~((-1198458285) | r10)) | 1092814216) * 859))) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00da, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.OnBackPressedDispatcherApi33Impl.copydefault[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.media.AudioManager) ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0120, code lost:
    
        if (r1 != ((((-1271962391) + (((~r2) | 316678144) * 1324)) + (((~(r2 | (-689232151))) | (~(853598482 | r2))) * (-1324))) - 1233706222)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0122, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.r8lambdauALQStkfKNo5swuEpG7lymZRBFs.copydefault[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r15);
        r3 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x014d, code lost:
    
        if (r1 == (((1230867564 + ((~(1513691701 | r3)) * 979)) + ((r2 | 186727272) * (-979))) + (((~(r2 | 1513691701)) | (~(r3 | 186727272))) * 979))) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x014f, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState + 91;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getAsAtTimestamp = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x015b, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x015d, code lost:
    
        r1 = new int[430755922];
        r1[430755922 % 0] = 0;
        r1 = r1[107688980(0x66b3414, float:4.4236849E-35)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x016b, code lost:
    
        r1 = new int[430755922];
        r1[430755921(0x19acd051, float:1.7868521E-23)] = 1;
        r1 = r1[-1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0175, code lost:
    
        android.widget.Toast.makeText((android.content.Context) null, r1, 1).show();
        r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getAsAtTimestamp + 89;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.getRequestBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0185, code lost:
    
        super.onStart();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0188, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0195, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(1356086695));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a2, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(19132492));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a3, code lost:
    
        r0 = (java.lang.Integer) null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007d, code lost:
    
        if (r1 == (((1809341571 + ((((~((-262274) | r9)) | (~((-546940705) | r8))) | (~(648017913 | r8))) * 765)) + (((~((-547202978) | r9)) | 262273) * 1530)) + (((~(r8 | (-547202978))) | (~(r9 | 648017913))) * 765))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a4, code lost:
    
        if (r1 == (((((-100823530) | r8) * (-658)) + 724921968) + ((r8 | (-656899054)) * 658))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.OnBackPressedDispatcher3.component2[0]).getInt(null);
        r8 = (int) android.os.Process.getStartElapsedRealtime();
        r11 = 1288799288 + ((r8 | 248281652) * (-859));
        r10 = ~r8;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.onStart():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:(5:905|(5:46|47|(1:49)|50|51)(21:52|53|919|54|(2:819|56)|60|61|907|62|(2:823|64)|68|69|70|(1:72)|73|74|75|(1:77)|78|(1:80)|81)|82|(4:85|(3:952|87|955)(12:951|88|(3:90|(3:93|94|91)|956)|95|897|96|(1:98)|99|100|884|101|954)|953|83)|950)|(33:145|(3:147|(3:149|152|(1:154)(1:155))|156)(2:150|(2:152|(0)(0))(1:156))|193|899|194|(1:196)|197|(3:199|(1:201)|202)(14:204|205|889|206|(1:208)|209|210|211|(1:213)|214|(1:216)(1:217)|218|(1:220)|221)|203|222|(9:225|878|226|(1:228)|229|230|231|867|232)|262|913|263|(13:265|893|266|270|(6:272|880|273|274|877|275)(1:280)|911|281|282|886|(4:284|285|(1:287)|288)(12:(2:292|(3:294|295|(2:297|299)(1:298))(1:299))(1:301)|(20:303|900|304|(3:306|853|307)|311|312|891|313|(2:902|315)|319|320|321|(1:323)|324|325|326|(1:328)(1:329)|330|(1:332)|333)(1:380)|385|386|873|387|390|391|(1:393)|394|395|396)|334|(4:337|(3:945|339|948)(12:944|340|(3:342|(3:345|346|343)|949)|347|875|348|(1:350)|351|352|865|353|947)|946|335)|943)(10:270|(0)(0)|911|281|282|886|(0)(0)|334|(1:335)|943)|397|870|398|(1:400)|401|(3:403|(1:405)|406)(19:407|408|859|409|(1:411)|412|413|851|414|(1:416)|417|418|419|(1:421)|422|(1:424)(1:425)|426|(1:428)|429)|430|(4:433|(3:923|435|926)(12:922|436|(3:438|(3:441|442|439)|927)|443|845|444|(1:446)|447|448|836|449|925)|924|431)|921|484|(1:486)|487|(1:489)|490|(3:492|(1:494)|495)(16:497|498|(1:500)|501|(1:503)|504|505|(1:507)|508|857|509|510|(1:512)(1:513)|514|(1:516)|517)|496|518|(6:520|(1:522)|523|(3:525|(1:527)|528)(14:529|530|(1:532)|533|534|(1:536)|537|825|538|539|(1:541)|542|(1:544)|545)|546|(18:548|863|549|(12:847|551|555|(5:839|557|558|831|559)(1:564)|861|565|566|838|(4:568|569|(1:571)|572)(12:(2:576|(1:582)(1:581))|(21:584|585|849|586|(2:829|588)|592|593|841|594|(2:855|596)|600|601|602|(1:604)|605|606|607|(1:609)|610|(1:612)|613)(1:663)|668|669|917|670|673|674|(1:676)|677|678|679)|614|(4:617|(3:930|619|933)(12:929|620|(3:622|(4:625|(3:936|627|939)(4:935|628|629|938)|937|623)|934)|630|832|631|(1:633)|634|635|817|636|932)|931|615)|928)(10:555|(0)(0)|861|565|566|838|(0)(0)|614|(1:615)|928)|680|(1:682)|683|(3:685|(1:687)|688)(13:690|887|691|692|(1:694)|695|821|696|697|(1:699)|700|(1:702)|703)|689|704|(6:707|708|(1:710)|711|712|713)|714|(1:716)|717|(2:719|(3:721|(1:723)|724)(3:725|(1:727)|728))(14:730|731|(1:733)|734|735|(1:737)|738|843|739|740|(1:742)|743|(1:745)|746)|729|747|(1:957)(7:750|751|(1:753)|754|755|756|757))(10:767|(5:769|(1:771)(1:772)|941|(2:775|773)|940)|776|777|(1:779)|780|(1:782)|783|784|785))(10:788|(3:790|(2:793|791)|942)|794|795|(1:797)|798|(1:800)|801|802|803))(1:160)|871|166|(1:168)|169|193|899|194|(0)|197|(0)(0)|203|222|(0)|262|913|263|(0)(0)|397|870|398|(0)|401|(0)(0)|430|(1:431)|921|484|(0)|487|(0)|490|(0)(0)|496|518|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:0|2|(2:(2:9|(2:11|(2:13|(1:19)(1:16))(2:17|18))(0))(1:20)|(9:22|904|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|815|36|(3:38|869|39)|43|44|(5:905|(5:46|47|(1:49)|50|51)(21:52|53|919|54|(2:819|56)|60|61|907|62|(2:823|64)|68|69|70|(1:72)|73|74|75|(1:77)|78|(1:80)|81)|82|(4:85|(3:952|87|955)(12:951|88|(3:90|(3:93|94|91)|956)|95|897|96|(1:98)|99|100|884|101|954)|953|83)|950)|114|(1:906)|(33:145|(3:147|(3:149|152|(1:154)(1:155))|156)(2:150|(2:152|(0)(0))(1:156))|193|899|194|(1:196)|197|(3:199|(1:201)|202)(14:204|205|889|206|(1:208)|209|210|211|(1:213)|214|(1:216)(1:217)|218|(1:220)|221)|203|222|(9:225|878|226|(1:228)|229|230|231|867|232)|262|913|263|(13:265|893|266|270|(6:272|880|273|274|877|275)(1:280)|911|281|282|886|(4:284|285|(1:287)|288)(12:(2:292|(3:294|295|(2:297|299)(1:298))(1:299))(1:301)|(20:303|900|304|(3:306|853|307)|311|312|891|313|(2:902|315)|319|320|321|(1:323)|324|325|326|(1:328)(1:329)|330|(1:332)|333)(1:380)|385|386|873|387|390|391|(1:393)|394|395|396)|334|(4:337|(3:945|339|948)(12:944|340|(3:342|(3:345|346|343)|949)|347|875|348|(1:350)|351|352|865|353|947)|946|335)|943)(10:270|(0)(0)|911|281|282|886|(0)(0)|334|(1:335)|943)|397|870|398|(1:400)|401|(3:403|(1:405)|406)(19:407|408|859|409|(1:411)|412|413|851|414|(1:416)|417|418|419|(1:421)|422|(1:424)(1:425)|426|(1:428)|429)|430|(4:433|(3:923|435|926)(12:922|436|(3:438|(3:441|442|439)|927)|443|845|444|(1:446)|447|448|836|449|925)|924|431)|921|484|(1:486)|487|(1:489)|490|(3:492|(1:494)|495)(16:497|498|(1:500)|501|(1:503)|504|505|(1:507)|508|857|509|510|(1:512)(1:513)|514|(1:516)|517)|496|518|(6:520|(1:522)|523|(3:525|(1:527)|528)(14:529|530|(1:532)|533|534|(1:536)|537|825|538|539|(1:541)|542|(1:544)|545)|546|(18:548|863|549|(12:847|551|555|(5:839|557|558|831|559)(1:564)|861|565|566|838|(4:568|569|(1:571)|572)(12:(2:576|(1:582)(1:581))|(21:584|585|849|586|(2:829|588)|592|593|841|594|(2:855|596)|600|601|602|(1:604)|605|606|607|(1:609)|610|(1:612)|613)(1:663)|668|669|917|670|673|674|(1:676)|677|678|679)|614|(4:617|(3:930|619|933)(12:929|620|(3:622|(4:625|(3:936|627|939)(4:935|628|629|938)|937|623)|934)|630|832|631|(1:633)|634|635|817|636|932)|931|615)|928)(10:555|(0)(0)|861|565|566|838|(0)(0)|614|(1:615)|928)|680|(1:682)|683|(3:685|(1:687)|688)(13:690|887|691|692|(1:694)|695|821|696|697|(1:699)|700|(1:702)|703)|689|704|(6:707|708|(1:710)|711|712|713)|714|(1:716)|717|(2:719|(3:721|(1:723)|724)(3:725|(1:727)|728))(14:730|731|(1:733)|734|735|(1:737)|738|843|739|740|(1:742)|743|(1:745)|746)|729|747|(1:957)(7:750|751|(1:753)|754|755|756|757))(10:767|(5:769|(1:771)(1:772)|941|(2:775|773)|940)|776|777|(1:779)|780|(1:782)|783|784|785))(10:788|(3:790|(2:793|791)|942)|794|795|(1:797)|798|(1:800)|801|802|803))(1:160)|161|882|162|(1:164)|165|871|166|(1:168)|169|193|899|194|(0)|197|(0)(0)|203|222|(0)|262|913|263|(0)(0)|397|870|398|(0)|401|(0)(0)|430|(1:431)|921|484|(0)|487|(0)|490|(0)(0)|496|518|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(58:0|2|(2:(2:9|(2:11|(2:13|(1:19)(1:16))(2:17|18))(0))(1:20)|(9:22|904|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|815|36|(3:38|869|39)|43|44|905|(5:46|47|(1:49)|50|51)(21:52|53|919|54|(2:819|56)|60|61|907|62|(2:823|64)|68|69|70|(1:72)|73|74|75|(1:77)|78|(1:80)|81)|82|(4:85|(3:952|87|955)(12:951|88|(3:90|(3:93|94|91)|956)|95|897|96|(1:98)|99|100|884|101|954)|953|83)|950|114|906|(33:145|(3:147|(3:149|152|(1:154)(1:155))|156)(2:150|(2:152|(0)(0))(1:156))|193|899|194|(1:196)|197|(3:199|(1:201)|202)(14:204|205|889|206|(1:208)|209|210|211|(1:213)|214|(1:216)(1:217)|218|(1:220)|221)|203|222|(9:225|878|226|(1:228)|229|230|231|867|232)|262|913|263|(13:265|893|266|270|(6:272|880|273|274|877|275)(1:280)|911|281|282|886|(4:284|285|(1:287)|288)(12:(2:292|(3:294|295|(2:297|299)(1:298))(1:299))(1:301)|(20:303|900|304|(3:306|853|307)|311|312|891|313|(2:902|315)|319|320|321|(1:323)|324|325|326|(1:328)(1:329)|330|(1:332)|333)(1:380)|385|386|873|387|390|391|(1:393)|394|395|396)|334|(4:337|(3:945|339|948)(12:944|340|(3:342|(3:345|346|343)|949)|347|875|348|(1:350)|351|352|865|353|947)|946|335)|943)(10:270|(0)(0)|911|281|282|886|(0)(0)|334|(1:335)|943)|397|870|398|(1:400)|401|(3:403|(1:405)|406)(19:407|408|859|409|(1:411)|412|413|851|414|(1:416)|417|418|419|(1:421)|422|(1:424)(1:425)|426|(1:428)|429)|430|(4:433|(3:923|435|926)(12:922|436|(3:438|(3:441|442|439)|927)|443|845|444|(1:446)|447|448|836|449|925)|924|431)|921|484|(1:486)|487|(1:489)|490|(3:492|(1:494)|495)(16:497|498|(1:500)|501|(1:503)|504|505|(1:507)|508|857|509|510|(1:512)(1:513)|514|(1:516)|517)|496|518|(6:520|(1:522)|523|(3:525|(1:527)|528)(14:529|530|(1:532)|533|534|(1:536)|537|825|538|539|(1:541)|542|(1:544)|545)|546|(18:548|863|549|(12:847|551|555|(5:839|557|558|831|559)(1:564)|861|565|566|838|(4:568|569|(1:571)|572)(12:(2:576|(1:582)(1:581))|(21:584|585|849|586|(2:829|588)|592|593|841|594|(2:855|596)|600|601|602|(1:604)|605|606|607|(1:609)|610|(1:612)|613)(1:663)|668|669|917|670|673|674|(1:676)|677|678|679)|614|(4:617|(3:930|619|933)(12:929|620|(3:622|(4:625|(3:936|627|939)(4:935|628|629|938)|937|623)|934)|630|832|631|(1:633)|634|635|817|636|932)|931|615)|928)(10:555|(0)(0)|861|565|566|838|(0)(0)|614|(1:615)|928)|680|(1:682)|683|(3:685|(1:687)|688)(13:690|887|691|692|(1:694)|695|821|696|697|(1:699)|700|(1:702)|703)|689|704|(6:707|708|(1:710)|711|712|713)|714|(1:716)|717|(2:719|(3:721|(1:723)|724)(3:725|(1:727)|728))(14:730|731|(1:733)|734|735|(1:737)|738|843|739|740|(1:742)|743|(1:745)|746)|729|747|(1:957)(7:750|751|(1:753)|754|755|756|757))(10:767|(5:769|(1:771)(1:772)|941|(2:775|773)|940)|776|777|(1:779)|780|(1:782)|783|784|785))(10:788|(3:790|(2:793|791)|942)|794|795|(1:797)|798|(1:800)|801|802|803))(1:160)|161|882|162|(1:164)|165|871|166|(1:168)|169|193|899|194|(0)|197|(0)(0)|203|222|(0)|262|913|263|(0)(0)|397|870|398|(0)|401|(0)(0)|430|(1:431)|921|484|(0)|487|(0)|490|(0)(0)|496|518|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0d7a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0d7b, code lost:
    
        r6 = new java.lang.Object[1];
        f(new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}, true, new int[]{208, 11, 178, 0}, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0d98, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0daf, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0db3, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
        r12 = -1;
        r13 = 0;
        r2 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | (((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0de4, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0de8, code lost:
    
        if (r5 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0dea, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6617 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 42 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.os.Process.getGidForName("") + 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0e15, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0e1d, code lost:
    
        r8 = new java.lang.Object[]{415294193, java.lang.Long.valueOf(r2), r4, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 6561, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 55, (char) (android.os.Process.myTid() >> 22));
        r3 = (byte) (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$n & 62);
        r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$m;
        r12 = new java.lang.Object[1];
        i(r3, r4[106(0x6a, float:1.49E-43)], r4[9], r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x1411, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x1412, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x195f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x1960, code lost:
    
        r8 = new java.lang.Object[1];
        f(new byte[]{0, 1, 1, 1, 0, 0, 1, 1, 0, 1}, false, new int[]{219, 10, 0, 0}, r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x197b, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x1992, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x1996, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
        r13 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r2 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x19c7, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x19cb, code lost:
    
        if (r5 == null) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x19cd, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.text.TextUtils.indexOf("", "", 0), android.graphics.Color.argb(0, 0, 0, 0) + 42, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x19f4, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x19fc, code lost:
    
        r11 = new java.lang.Object[]{415294193, java.lang.Long.valueOf(r2), r4, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.MotionEvent.axisFromString("") + 6563, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 56, (char) android.graphics.Color.alpha(0));
        r3 = (byte) (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$n & 62);
        r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.$$m;
        r12 = new java.lang.Object[1];
        i(r3, r4[106(0x6a, float:1.49E-43)], r4[9], r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x072a A[Catch: all -> 0x0284, TryCatch #48 {all -> 0x0284, blocks: (B:137:0x0724, B:139:0x072a, B:140:0x0756, B:391:0x1498, B:393:0x149e, B:394:0x14ca, B:708:0x2b95, B:710:0x2b9b, B:711:0x2bc2, B:751:0x2f2d, B:753:0x2f33, B:754:0x2f56, B:731:0x2d74, B:733:0x2d97, B:734:0x2de4, B:674:0x2845, B:676:0x284b, B:677:0x2873, B:777:0x303f, B:779:0x3045, B:780:0x3067, B:782:0x30a1, B:783:0x30e0, B:530:0x20a4, B:532:0x20b9, B:533:0x20ea, B:795:0x31bf, B:797:0x31c5, B:798:0x31e3, B:800:0x321d, B:801:0x325f, B:498:0x1c21, B:500:0x1c36, B:501:0x1c65, B:503:0x1c99, B:504:0x1d17, B:478:0x19c7, B:480:0x19cd, B:481:0x19f4, B:256:0x0de4, B:258:0x0dea, B:259:0x0e15, B:187:0x095f, B:189:0x0965, B:190:0x0990, B:23:0x012f, B:25:0x0135, B:26:0x015f, B:28:0x01f7, B:30:0x0228, B:31:0x027e, B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664, B:194:0x0a18, B:196:0x0a1e, B:197:0x0a65, B:199:0x0a72, B:201:0x0a7b, B:202:0x0abe, B:222:0x0c6d, B:230:0x0cd9, B:236:0x0d5e, B:238:0x0d64, B:239:0x0d65, B:241:0x0d67, B:243:0x0d6e, B:244:0x0d6f, B:204:0x0aca, B:211:0x0b50, B:213:0x0b56, B:214:0x0b95, B:216:0x0bbf, B:218:0x0c0a, B:220:0x0c21, B:221:0x0c63, B:246:0x0d71, B:248:0x0d78, B:249:0x0d79, B:232:0x0cdf, B:226:0x0ca2, B:228:0x0ca8, B:229:0x0cd2, B:206:0x0aea, B:208:0x0afc, B:209:0x0b44, B:147:0x07e9, B:152:0x07f6, B:173:0x08e5, B:175:0x08eb, B:176:0x08ec, B:178:0x08ee, B:180:0x08f5, B:181:0x08f6, B:156:0x0802, B:150:0x07f2), top: B:904:0x012f, inners: #29, #45, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0822 A[Catch: all -> 0x08ed, TryCatch #36 {all -> 0x08ed, blocks: (B:162:0x080d, B:164:0x0822, B:165:0x0855), top: B:882:0x080d, outer: #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0868 A[Catch: all -> 0x08e3, TryCatch #30 {all -> 0x08e3, blocks: (B:166:0x085b, B:168:0x0868, B:169:0x08db), top: B:871:0x085b, outer: #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0a1e A[Catch: all -> 0x0d7a, TryCatch #45 {all -> 0x0d7a, blocks: (B:194:0x0a18, B:196:0x0a1e, B:197:0x0a65, B:199:0x0a72, B:201:0x0a7b, B:202:0x0abe, B:222:0x0c6d, B:230:0x0cd9, B:236:0x0d5e, B:238:0x0d64, B:239:0x0d65, B:241:0x0d67, B:243:0x0d6e, B:244:0x0d6f, B:204:0x0aca, B:211:0x0b50, B:213:0x0b56, B:214:0x0b95, B:216:0x0bbf, B:218:0x0c0a, B:220:0x0c21, B:221:0x0c63, B:246:0x0d71, B:248:0x0d78, B:249:0x0d79, B:232:0x0cdf, B:226:0x0ca2, B:228:0x0ca8, B:229:0x0cd2, B:206:0x0aea, B:208:0x0afc, B:209:0x0b44), top: B:899:0x0a18, outer: #48, inners: #27, #34, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0a72 A[Catch: all -> 0x0d7a, TryCatch #45 {all -> 0x0d7a, blocks: (B:194:0x0a18, B:196:0x0a1e, B:197:0x0a65, B:199:0x0a72, B:201:0x0a7b, B:202:0x0abe, B:222:0x0c6d, B:230:0x0cd9, B:236:0x0d5e, B:238:0x0d64, B:239:0x0d65, B:241:0x0d67, B:243:0x0d6e, B:244:0x0d6f, B:204:0x0aca, B:211:0x0b50, B:213:0x0b56, B:214:0x0b95, B:216:0x0bbf, B:218:0x0c0a, B:220:0x0c21, B:221:0x0c63, B:246:0x0d71, B:248:0x0d78, B:249:0x0d79, B:232:0x0cdf, B:226:0x0ca2, B:228:0x0ca8, B:229:0x0cd2, B:206:0x0aea, B:208:0x0afc, B:209:0x0b44), top: B:899:0x0a18, outer: #48, inners: #27, #34, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0aca A[Catch: all -> 0x0d7a, TRY_LEAVE, TryCatch #45 {all -> 0x0d7a, blocks: (B:194:0x0a18, B:196:0x0a1e, B:197:0x0a65, B:199:0x0a72, B:201:0x0a7b, B:202:0x0abe, B:222:0x0c6d, B:230:0x0cd9, B:236:0x0d5e, B:238:0x0d64, B:239:0x0d65, B:241:0x0d67, B:243:0x0d6e, B:244:0x0d6f, B:204:0x0aca, B:211:0x0b50, B:213:0x0b56, B:214:0x0b95, B:216:0x0bbf, B:218:0x0c0a, B:220:0x0c21, B:221:0x0c63, B:246:0x0d71, B:248:0x0d78, B:249:0x0d79, B:232:0x0cdf, B:226:0x0ca2, B:228:0x0ca8, B:229:0x0cd2, B:206:0x0aea, B:208:0x0afc, B:209:0x0b44), top: B:899:0x0a18, outer: #48, inners: #27, #34, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0ef7 A[Catch: all -> 0x1411, PHI: r2
  0x0ef7: PHI (r2v616 java.lang.Object) = (r2v615 java.lang.Object), (r2v677 java.lang.Object) binds: [B:264:0x0ea5, B:266:0x0ea9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #54 {all -> 0x1411, blocks: (B:263:0x0ea1, B:270:0x0ef7), top: B:913:0x0ea1 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0fe8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x12d3 A[Catch: all -> 0x13ef, TryCatch #38 {all -> 0x13ef, blocks: (B:334:0x12c9, B:335:0x12cd, B:337:0x12d3, B:340:0x12eb, B:343:0x12f7, B:345:0x12fa, B:357:0x13dd, B:359:0x13e3, B:360:0x13e4, B:362:0x13e6, B:364:0x13ed, B:365:0x13ee, B:376:0x1401, B:378:0x1407, B:379:0x1408, B:326:0x11f6, B:328:0x1213, B:330:0x125f, B:332:0x1276, B:333:0x12c1, B:370:0x13f5, B:372:0x13fb, B:373:0x13fc, B:353:0x135e, B:348:0x1327, B:350:0x132d, B:351:0x1356), top: B:886:0x0f87, inners: #26, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x149e A[Catch: all -> 0x0284, TryCatch #48 {all -> 0x0284, blocks: (B:137:0x0724, B:139:0x072a, B:140:0x0756, B:391:0x1498, B:393:0x149e, B:394:0x14ca, B:708:0x2b95, B:710:0x2b9b, B:711:0x2bc2, B:751:0x2f2d, B:753:0x2f33, B:754:0x2f56, B:731:0x2d74, B:733:0x2d97, B:734:0x2de4, B:674:0x2845, B:676:0x284b, B:677:0x2873, B:777:0x303f, B:779:0x3045, B:780:0x3067, B:782:0x30a1, B:783:0x30e0, B:530:0x20a4, B:532:0x20b9, B:533:0x20ea, B:795:0x31bf, B:797:0x31c5, B:798:0x31e3, B:800:0x321d, B:801:0x325f, B:498:0x1c21, B:500:0x1c36, B:501:0x1c65, B:503:0x1c99, B:504:0x1d17, B:478:0x19c7, B:480:0x19cd, B:481:0x19f4, B:256:0x0de4, B:258:0x0dea, B:259:0x0e15, B:187:0x095f, B:189:0x0965, B:190:0x0990, B:23:0x012f, B:25:0x0135, B:26:0x015f, B:28:0x01f7, B:30:0x0228, B:31:0x027e, B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664, B:194:0x0a18, B:196:0x0a1e, B:197:0x0a65, B:199:0x0a72, B:201:0x0a7b, B:202:0x0abe, B:222:0x0c6d, B:230:0x0cd9, B:236:0x0d5e, B:238:0x0d64, B:239:0x0d65, B:241:0x0d67, B:243:0x0d6e, B:244:0x0d6f, B:204:0x0aca, B:211:0x0b50, B:213:0x0b56, B:214:0x0b95, B:216:0x0bbf, B:218:0x0c0a, B:220:0x0c21, B:221:0x0c63, B:246:0x0d71, B:248:0x0d78, B:249:0x0d79, B:232:0x0cdf, B:226:0x0ca2, B:228:0x0ca8, B:229:0x0cd2, B:206:0x0aea, B:208:0x0afc, B:209:0x0b44, B:147:0x07e9, B:152:0x07f6, B:173:0x08e5, B:175:0x08eb, B:176:0x08ec, B:178:0x08ee, B:180:0x08f5, B:181:0x08f6, B:156:0x0802, B:150:0x07f2), top: B:904:0x012f, inners: #29, #45, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1554 A[Catch: all -> 0x195f, TryCatch #29 {all -> 0x195f, blocks: (B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664), top: B:870:0x154e, outer: #48, inners: #11, #16, #19, #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x15a5 A[Catch: all -> 0x195f, TryCatch #29 {all -> 0x195f, blocks: (B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664), top: B:870:0x154e, outer: #48, inners: #11, #16, #19, #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x15ff A[Catch: all -> 0x195f, TRY_LEAVE, TryCatch #29 {all -> 0x195f, blocks: (B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664), top: B:870:0x154e, outer: #48, inners: #11, #16, #19, #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x182d A[Catch: all -> 0x195f, TryCatch #29 {all -> 0x195f, blocks: (B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664), top: B:870:0x154e, outer: #48, inners: #11, #16, #19, #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x1a7e  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x1ae7  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x1b3f  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1c03  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x1e5e  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x23c1  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x23d9  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x242e  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x2689 A[Catch: all -> 0x27b8, TryCatch #12 {all -> 0x27b8, blocks: (B:614:0x267f, B:615:0x2683, B:617:0x2689, B:620:0x26a1, B:623:0x26ae, B:627:0x26bd, B:628:0x26c5, B:640:0x27a6, B:642:0x27ac, B:643:0x27ad, B:645:0x27af, B:647:0x27b6, B:648:0x27b7, B:607:0x25bd, B:609:0x25da, B:610:0x2621, B:612:0x2637, B:613:0x2679, B:653:0x27be, B:655:0x27c4, B:656:0x27c5, B:659:0x27ca, B:661:0x27d0, B:662:0x27d1, B:636:0x2728, B:631:0x26f1, B:633:0x26f7, B:634:0x2720), top: B:838:0x23d7, inners: #1, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x284b A[Catch: all -> 0x0284, TryCatch #48 {all -> 0x0284, blocks: (B:137:0x0724, B:139:0x072a, B:140:0x0756, B:391:0x1498, B:393:0x149e, B:394:0x14ca, B:708:0x2b95, B:710:0x2b9b, B:711:0x2bc2, B:751:0x2f2d, B:753:0x2f33, B:754:0x2f56, B:731:0x2d74, B:733:0x2d97, B:734:0x2de4, B:674:0x2845, B:676:0x284b, B:677:0x2873, B:777:0x303f, B:779:0x3045, B:780:0x3067, B:782:0x30a1, B:783:0x30e0, B:530:0x20a4, B:532:0x20b9, B:533:0x20ea, B:795:0x31bf, B:797:0x31c5, B:798:0x31e3, B:800:0x321d, B:801:0x325f, B:498:0x1c21, B:500:0x1c36, B:501:0x1c65, B:503:0x1c99, B:504:0x1d17, B:478:0x19c7, B:480:0x19cd, B:481:0x19f4, B:256:0x0de4, B:258:0x0dea, B:259:0x0e15, B:187:0x095f, B:189:0x0965, B:190:0x0990, B:23:0x012f, B:25:0x0135, B:26:0x015f, B:28:0x01f7, B:30:0x0228, B:31:0x027e, B:398:0x154e, B:400:0x1554, B:401:0x1598, B:403:0x15a5, B:405:0x15ae, B:406:0x15f4, B:430:0x1823, B:431:0x1827, B:433:0x182d, B:436:0x1844, B:439:0x185b, B:441:0x185e, B:453:0x1939, B:455:0x193f, B:456:0x1940, B:458:0x1942, B:460:0x1949, B:461:0x194a, B:407:0x15ff, B:419:0x1706, B:421:0x170c, B:422:0x174e, B:424:0x1778, B:426:0x17c0, B:428:0x17d7, B:429:0x181b, B:463:0x194c, B:465:0x1953, B:466:0x1954, B:468:0x1956, B:470:0x195d, B:471:0x195e, B:449:0x18bf, B:444:0x188a, B:446:0x1890, B:447:0x18b7, B:414:0x166b, B:416:0x1687, B:417:0x16fa, B:409:0x161f, B:411:0x1634, B:412:0x1664, B:194:0x0a18, B:196:0x0a1e, B:197:0x0a65, B:199:0x0a72, B:201:0x0a7b, B:202:0x0abe, B:222:0x0c6d, B:230:0x0cd9, B:236:0x0d5e, B:238:0x0d64, B:239:0x0d65, B:241:0x0d67, B:243:0x0d6e, B:244:0x0d6f, B:204:0x0aca, B:211:0x0b50, B:213:0x0b56, B:214:0x0b95, B:216:0x0bbf, B:218:0x0c0a, B:220:0x0c21, B:221:0x0c63, B:246:0x0d71, B:248:0x0d78, B:249:0x0d79, B:232:0x0cdf, B:226:0x0ca2, B:228:0x0ca8, B:229:0x0cd2, B:206:0x0aea, B:208:0x0afc, B:209:0x0b44, B:147:0x07e9, B:152:0x07f6, B:173:0x08e5, B:175:0x08eb, B:176:0x08ec, B:178:0x08ee, B:180:0x08f5, B:181:0x08f6, B:156:0x0802, B:150:0x07f2), top: B:904:0x012f, inners: #29, #45, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:788:0x317d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x236f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v231 */
    /* JADX WARN: Type inference failed for: r11v232, types: [long] */
    /* JADX WARN: Type inference failed for: r11v233 */
    /* JADX WARN: Type inference failed for: r11v248 */
    /* JADX WARN: Type inference failed for: r11v249 */
    /* JADX WARN: Type inference failed for: r11v254 */
    /* JADX WARN: Type inference failed for: r11v260 */
    /* JADX WARN: Type inference failed for: r11v261 */
    /* JADX WARN: Type inference failed for: r11v262 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r6v155 */
    /* JADX WARN: Type inference failed for: r6v156 */
    /* JADX WARN: Type inference failed for: r6v157 */
    /* JADX WARN: Type inference failed for: r6v158, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v181 */
    /* JADX WARN: Type inference failed for: r6v186 */
    /* JADX WARN: Type inference failed for: r6v192 */
    /* JADX WARN: Type inference failed for: r6v197 */
    /* JADX WARN: Type inference failed for: r6v198 */
    /* JADX WARN: Type inference failed for: r6v199 */
    /* JADX WARN: Type inference failed for: r6v200 */
    /* JADX WARN: Type inference failed for: r6v201 */
    /* JADX WARN: Type inference failed for: r6v207 */
    /* JADX WARN: Type inference failed for: r6v210 */
    /* JADX WARN: Type inference failed for: r6v216, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v220 */
    /* JADX WARN: Type inference failed for: r6v221 */
    /* JADX WARN: Type inference failed for: r6v510 */
    /* JADX WARN: Type inference failed for: r6v511 */
    /* JADX WARN: Type inference failed for: r6v512 */
    /* JADX WARN: Type inference failed for: r7v221 */
    /* JADX WARN: Type inference failed for: r7v224 */
    /* JADX WARN: Type inference failed for: r7v225 */
    /* JADX WARN: Type inference failed for: r7v226 */
    /* JADX WARN: Type inference failed for: r7v227 */
    /* JADX WARN: Type inference failed for: r7v232 */
    /* JADX WARN: Type inference failed for: r7v238 */
    /* JADX WARN: Type inference failed for: r7v240 */
    /* JADX WARN: Type inference failed for: r7v241, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v247 */
    /* JADX WARN: Type inference failed for: r7v251 */
    /* JADX WARN: Type inference failed for: r7v252 */
    /* JADX WARN: Type inference failed for: r7v256 */
    /* JADX WARN: Type inference failed for: r7v259 */
    /* JADX WARN: Type inference failed for: r7v315 */
    /* JADX WARN: Type inference failed for: r7v316 */
    /* JADX WARN: Type inference failed for: r7v317 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copy = 1;
        component1();
        component3();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = component4 + 87;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 115;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        component1 = 264143998899843928L;
        int i5 = i2 + 119;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component1() {
        component2 = new char[]{30421, 30408, 30422, 30404, 30411, 30413, 30344, 30407, 30442, 30423, 30417, 30409, 30269, 30433, 30401, 30406, 30453, 30410, 30414, 30340, 30343, 30341, 30346, 30342, 30416, 30461, 30336, 30338, 30420, 30337, 30339, 30418, 30460, 30347, 30419, 30405, 30400, 30345, 30450, 30455};
        copydefault = 321287866;
        ShareDataUIState = true;
        component3 = true;
        equals = new char[]{33450, 33327, 33325, 33323, 33318, 33322, 33328, 33293, 33295, 33326, 33318, 33287, 33311, 33284, 33323, 33320, 33319, 33319, 33320, 33312, 33328, 33336, 33321, 33323, 33331, 33332, 33518, 33428, 33514, 33514, 33515, 33517, 33517, 33514, 33428, 33469, 33425, 33514, 33518, 33519, 33431, 33468, 33466, 33465, 33468, 33470, 33428, 33426, 33424, 33513, 33427, 33426, 33515, 33429, 33428, 33514, 33516, 33430, 33427, 33426, 33427, 33513, 33510, 33512, 33427, 33430, 33429, 33467, 33426, 33513, 33425, 33428, 33514, 33426, 33475, 33514, 33515, 33514, 33515, 33427, 33430, 33428, 33424, 33425, 33429, 33516, 33515, 33516, 33514, 33427, 33468, 33467, 33425, 33516, 33517, 33428, 33468, 33467, 33427, 33514, 33516, 33515, 33512, 33512, 33514, 33427, 33426, 33515, 33428, 33428, 33516, 33427, 33428, 33516, 33427, 33430, 33519, 33429, 33425, 33425, 33425, 33513, 33512, 33511, 33516, 33515, 33514, 33429, 33429, 33515, 33426, 33425, 33514, 33519, 33519, 33430, 33470, 33468, 33480, 33519, 33513, 33516, 33520, 33517, 33513, 33462, 33459, 33452, 33449, 33465, 33439, 33429, 33461, 33464, 33465, 33426, 33432, 33460, 33460, 33466, 33518, 33462, 33460, 33458, 33453, 33457, 33463, 33428, 33423, 33452, 33421, 33437, 33463, 33447, 33450, 33457, 33460, 33413, 33414, 33456, 33460, 33462, 33362, 33791, 33781, 33783, 33786, 33788, 33728, 33789, 33791, 33789, 33780, 33785, 33729, 33738, 33738, 33479, 33517, 33516, 33514, 33512, 33512, 33515, 33516, 33513, 33515, 33516, 33452, 33335, 33337, 33336, 33334, 33334, 33333, 33333, 33337, 33337, 33337, 33475, 33513, 33513, 33511, 33510, 33513, 33516, 33515, 33512, 33514, 33510, 33453, 33451, 33450, 33450, 33449, 33450, 33452, 33451, 33449};
    }
}
