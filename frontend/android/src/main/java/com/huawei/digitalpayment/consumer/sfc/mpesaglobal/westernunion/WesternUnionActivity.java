package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.global.databinding.ActivityMpesaGlobalBinding;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalActivity;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MPesaGlobalCountryPickerFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optin.failure.MPesaGlobalErrorFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.recipientdetails.WesternUnionRecipientDetailsFragment;
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
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
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
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\u0016\u0010\"\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionActivity;", "Lcom/safaricom/sharedui/compose/activity/BackHandlerActivity;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/global/databinding/ActivityMpesaGlobalBinding;", "westernUnionViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionViewModel;", "getWesternUnionViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionViewModel;", "westernUnionViewModel$delegate", "Lkotlin/Lazy;", "mpesaGlobalCountriesViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "getMpesaGlobalCountriesViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "mpesaGlobalCountriesViewModel$delegate", "confirmTransactionViewModel", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "getConfirmTransactionViewModel", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "confirmTransactionViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleBackPress", "observeConfirmationForwardNavigation", "observeConfirmationBackNavigation", "observeConfirmationData", "observeGetFeeLoading", "observeScreenChange", "observeCountrySelection", "observeCountriesBackNavigation", "changeScreen", "screenInformation", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "setConfirmationData", "showStkPush", "observeCountryFetchingState", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class WesternUnionActivity extends Hilt_WesternUnionActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static char ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static int component3;
    private static long copydefault;
    private static int equals;
    private static long getRequestBeneficiariesState;
    private ActivityMpesaGlobalBinding binding;

    private final Lazy confirmTransactionViewModel;

    private final Lazy mpesaGlobalCountriesViewModel;

    private final Lazy westernUnionViewModel;
    private static final byte[] $$l = {41, -64, -63, -4};
    private static final int $$o = 55;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {125, 44, 8, -98, 13, -1, 4, 0, 0, -8, 10, 7, -65, 13, -1, -62, TarHeader.LF_BLK, Ascii.FF, -2, -6, 0, 2, 0, -50, TarHeader.LF_BLK, Ascii.DC2, -8, Ascii.SO, -16, Ascii.SO, -67, TarHeader.LF_BLK, Ascii.DLE, 1, -65, 20, TarHeader.LF_NORMAL, 1, -33, 34, -10, 2, -64, Ascii.SI, -13, Ascii.SO, 13, -1, 4, 0, 0, -8, 10, 7, -64, 13, -1, -62, TarHeader.LF_BLK, Ascii.FF, -2, -6, 0, 2, 0, -50, 58, Ascii.FF, -8, Ascii.SO, -16, Ascii.SO, -67, 72, -11, -58, Base64.padSymbol, 10, -17, Ascii.DLE, -6, -58, 67, -6, -5, 9, -5, Ascii.SO, -67, Ascii.SUB, 44, -8, Ascii.SO, -16, Ascii.SO, -45, 34, 2, -4, Ascii.NAK, -8, 9, -36, 34, 5, -10, 7, 0, 6, -34, Ascii.SUB, -5, 9, -5, Ascii.SO, -44, TarHeader.LF_BLK, -3, -14, 10, 6, -9, 7, 0, -36, 37, 4, -3, -71, Ascii.SO, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_CONTIG, 2, -2, 20, -13, -56, 60, 6, 7, -14, Ascii.SO, -3, -12, Ascii.FF, -61, Ascii.ETB, 34, -2, 20, -13, -35, 45, 4, -2, 7, 0, -10, 6, -8, -27, 38, -7, 10, -37, 37, 4, -3, -71, TarHeader.LF_NORMAL, Ascii.SYN, -6, Ascii.DC2, -12, -32, Ascii.RS, 20, -18, -11, -11, Ascii.VT, 34, -18, 20, -14};
    private static final int $$n = 251;
    private static final byte[] $$d = {119, -58, 7, 71, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 121;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class getRequestBeneficiariesState implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        private final Function1 component2;

        getRequestBeneficiariesState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component2 = function1;
        }

        public final boolean equals(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 61;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
                if (!(obj instanceof Observer)) {
                    return true;
                }
            } else {
                z = false;
                if (!(obj instanceof Observer)) {
                    return false;
                }
            }
            if (!(obj instanceof FunctionAdapter)) {
                return z;
            }
            int i4 = i2 + 109;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i6 = ShareDataUIState + 93;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component2;
            int i5 = i3 + 99;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component3 + 117;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.component2.invoke(obj);
            int i4 = component3 + 11;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.$$l
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r8 = r8 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.$$r(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.$$d
            int r8 = 28 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
        L28:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.g(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.$$m
            int r6 = r6 * 8
            int r6 = r6 + 99
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = -1
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L29:
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.i(short, short, short, java.lang.Object[]):void");
    }

    public static final void access$changeScreen(WesternUnionActivity westernUnionActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = component4 + 105;
        copy = i2 % 128;
        int i3 = i2 % 2;
        westernUnionActivity.changeScreen(screenInformation);
        int i4 = copy + 23;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final ConfirmTransactionViewModel access$getConfirmTransactionViewModel(WesternUnionActivity westernUnionActivity) {
        int i = 2 % 2;
        int i2 = copy + 91;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return westernUnionActivity.getConfirmTransactionViewModel();
        }
        westernUnionActivity.getConfirmTransactionViewModel();
        throw null;
    }

    public static final MpesaGlobalCountriesViewModel access$getMpesaGlobalCountriesViewModel(WesternUnionActivity westernUnionActivity) {
        int i = 2 % 2;
        int i2 = component4 + 105;
        copy = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = westernUnionActivity.getMpesaGlobalCountriesViewModel();
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return mpesaGlobalCountriesViewModel;
    }

    public static final WesternUnionViewModel access$getWesternUnionViewModel(WesternUnionActivity westernUnionActivity) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        WesternUnionViewModel westernUnionViewModel = westernUnionActivity.getWesternUnionViewModel();
        int i4 = copy + 43;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return westernUnionViewModel;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", WindowInfoFieldGroup.FIELD_SCREEN, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public static Intent createIntent$default(Companion companion, Context context, MPesaGlobalScreen mPesaGlobalScreen, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 101;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 2) != 0) {
                mPesaGlobalScreen = MPesaGlobalScreen.CountrySelection.INSTANCE;
            }
            Intent intentCreateIntent = companion.createIntent(context, mPesaGlobalScreen);
            int i5 = copydefault + 71;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
            }
            return intentCreateIntent;
        }

        public final Intent createIntent(Context context, MPesaGlobalScreen screen) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(screen, "");
            Intent intent = new Intent(context, (Class<?>) WesternUnionActivity.class);
            intent.putExtra("screen_key", screen);
            int i2 = component2 + 123;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WesternUnionActivity() {
        final WesternUnionActivity westernUnionActivity = this;
        final Function0 function0 = null;
        this.westernUnionViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WesternUnionViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 73;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = westernUnionActivity.getViewModelStore();
                int i4 = component2 + 49;
                component3 = i4 % 128;
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
                int i2 = component2 + 7;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
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
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 83;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 111;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = westernUnionActivity.getDefaultViewModelProviderFactory();
                int i4 = ShareDataUIState + 51;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 103;
                int i3 = i2 % 128;
                component1 = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 31;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = westernUnionActivity.getDefaultViewModelCreationExtras();
                int i6 = ShareDataUIState + 105;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 91;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.mpesaGlobalCountriesViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MpesaGlobalCountriesViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 85;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = westernUnionActivity.getViewModelStore();
                int i4 = component2 + 69;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 119;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component3 + 83;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
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
                int i2 = copydefault + 79;
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
                int i = 2 % 2;
                int i2 = copydefault + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = westernUnionActivity.getDefaultViewModelProviderFactory();
                if (i3 != 0) {
                    int i4 = 85 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int component1;

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
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.component1
                    int r1 = r1 + 73
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.ShareDataUIState = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 66
                    int r2 = r2 / 0
                    if (r1 == 0) goto L23
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L32
                L23:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.ShareDataUIState
                    int r2 = r2 + 25
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.component1 = r3
                    int r2 = r2 % r0
                L32:
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.ShareDataUIState
                    int r2 = r2 + 121
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.component1 = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$special$$inlined$viewModels$default$6.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 119;
                component1 = i2 % 128;
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
            private static int ShareDataUIState = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 109;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = westernUnionActivity.getViewModelStore();
                if (i3 != 0) {
                    int i4 = 95 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 59;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component3 + 9;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 7;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 67;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 105;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = westernUnionActivity.getDefaultViewModelProviderFactory();
                int i4 = ShareDataUIState + 25;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 99;
                int i3 = i2 % 128;
                component2 = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 19;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return westernUnionActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 85;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component3 + 65;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final WesternUnionViewModel getWesternUnionViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        WesternUnionViewModel westernUnionViewModel = (WesternUnionViewModel) this.westernUnionViewModel.getValue();
        int i4 = copy + 103;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return westernUnionViewModel;
    }

    private final MpesaGlobalCountriesViewModel getMpesaGlobalCountriesViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = (MpesaGlobalCountriesViewModel) this.mpesaGlobalCountriesViewModel.getValue();
        int i4 = component4 + 23;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return mpesaGlobalCountriesViewModel;
        }
        throw null;
    }

    private final ConfirmTransactionViewModel getConfirmTransactionViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 119;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = (ConfirmTransactionViewModel) this.confirmTransactionViewModel.getValue();
        int i4 = component4 + 123;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return confirmTransactionViewModel;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationForwardNavigation$1", f = "WesternUnionActivity.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationForwardNavigation$1$1", f = "WesternUnionActivity.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final WesternUnionActivity component1;
            int component2;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 19;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component2;
                if (i4 != 0) {
                    int i5 = copydefault + 85;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateForwardUiEvent = WesternUnionActivity.access$getConfirmTransactionViewModel(this.component1).getNavigateForwardUiEvent();
                    final WesternUnionActivity westernUnionActivity = this.component1;
                    this.component2 = 1;
                    if (navigateForwardUiEvent.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int copydefault;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i6 = 2 % 2;
                            int i7 = copydefault + 1;
                            ShareDataUIState = i7 % 128;
                            int i8 = i7 % 2;
                            Object objComponent3 = component3(((Boolean) obj2).booleanValue(), continuation);
                            int i9 = copydefault + 63;
                            ShareDataUIState = i9 % 128;
                            int i10 = i9 % 2;
                            return objComponent3;
                        }

                        public final Object component3(boolean z, Continuation<? super Unit> continuation) {
                            int i6 = 2 % 2;
                            int i7 = copydefault;
                            int i8 = i7 + 69;
                            ShareDataUIState = i8 % 128;
                            int i9 = i8 % 2;
                            Object obj2 = null;
                            if (z) {
                                int i10 = i7 + 13;
                                ShareDataUIState = i10 % 128;
                                if (i10 % 2 != 0) {
                                    WesternUnionActivity.access$getWesternUnionViewModel(westernUnionActivity).onConfirmContinue(westernUnionActivity);
                                } else {
                                    WesternUnionActivity.access$getWesternUnionViewModel(westernUnionActivity).onConfirmContinue(westernUnionActivity);
                                    obj2.hashCode();
                                    throw null;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            int i11 = ShareDataUIState + 43;
                            copydefault = i11 % 128;
                            if (i11 % 2 == 0) {
                                return unit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        int i6 = copydefault + 45;
                        ShareDataUIState = i6 % 128;
                        if (i6 % 2 != 0) {
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
            AnonymousClass1(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component1 = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component1, continuation);
                int i2 = copydefault + 61;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass1;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 67;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    component1(coroutineScope2, continuation2);
                    throw null;
                }
                Object objComponent1 = component1(coroutineScope2, continuation2);
                int i3 = copydefault + 117;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 80 / 0;
                }
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 75;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 49;
                copydefault = i4 % 128;
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
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = component1 + 121;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.STARTED, new AnonymousClass1(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i5 = component2 + 83;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = WesternUnionActivity.this.new component3(continuation);
            int i2 = component1 + 75;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return component3Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 69;
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
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = component2 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 != 0) {
                objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
                int i4 = 73 / 0;
            } else {
                objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = component2 + 69;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 97;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int iAlpha = Color.alpha(0) + 3266;
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 34;
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 60268);
                    byte length2 = (byte) $$l.length;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, packedPositionChild, keyRepeatTimeout, -834797019, false, $$r((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (getRequestBeneficiariesState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 688, 34 - Color.blue(0), (char) (60372 - MotionEvent.axisFromString("")), -1969106284, false, $$r(b2, (byte) (b2 | 7), b2), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 125;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 % 4;
        }
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 688, (Process.myTid() >> 22) + 34, (char) (TextUtils.indexOf("", "", 0, 0) + 60373), -1969106284, false, $$r(b3, (byte) (b3 | 7), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i8 = $10 + 51;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i10 = $11 + 111;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationBackNavigation$1", f = "WesternUnionActivity.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int copydefault;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationBackNavigation$1$1", f = "WesternUnionActivity.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component3 = 0;
            private static int copydefault = 1;
            final WesternUnionActivity ShareDataUIState;
            int component2;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                if (i2 != 0) {
                    int i3 = component3 + 95;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = component3 + 23;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateBackUiEvent = WesternUnionActivity.access$getConfirmTransactionViewModel(this.ShareDataUIState).getNavigateBackUiEvent();
                    final WesternUnionActivity westernUnionActivity = this.ShareDataUIState;
                    this.component2 = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int component2 = 0;
                        private static int component3 = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            Object objShareDataUIState;
                            int i7 = 2 % 2;
                            int i8 = component3 + 23;
                            component2 = i8 % 128;
                            int i9 = i8 % 2;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i9 != 0) {
                                objShareDataUIState = ShareDataUIState(zBooleanValue, continuation);
                                int i10 = 80 / 0;
                            } else {
                                objShareDataUIState = ShareDataUIState(zBooleanValue, continuation);
                            }
                            int i11 = component3 + 31;
                            component2 = i11 % 128;
                            if (i11 % 2 == 0) {
                                return objShareDataUIState;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object ShareDataUIState(boolean z, Continuation<? super Unit> continuation) {
                            int i7 = 2 % 2;
                            int i8 = component2 + 25;
                            component3 = i8 % 128;
                            if (i8 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (z) {
                                WesternUnionActivity.access$getWesternUnionViewModel(westernUnionActivity).previousScreen();
                                int i9 = component3 + 111;
                                component2 = i9 % 128;
                                int i10 = i9 % 2;
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
            AnonymousClass5(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.ShareDataUIState = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.ShareDataUIState, continuation);
                int i2 = copydefault + 63;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = component3 + 47;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 15;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 59 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 11;
            ShareDataUIState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.copydefault;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    int i4 = ShareDataUIState + 7;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component2 + 53;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = component2 + 55;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = WesternUnionActivity.this.new component1(continuation);
            int i2 = ShareDataUIState + 97;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 26 / 0;
            }
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component1(coroutineScope2, continuation2);
            }
            component1(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 75;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            if (i3 != 0) {
                return component1Var.invokeSuspend(Unit.INSTANCE);
            }
            component1Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationData$1", f = "WesternUnionActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int copydefault;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationData$1$1", f = "WesternUnionActivity.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int copydefault;
            final WesternUnionActivity ShareDataUIState;
            int component1;

            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeConfirmationData$1$1$1", f = "WesternUnionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C02514 extends SuspendLambda implements Function2<List<? extends ConfirmInfoItem>, Continuation<? super Unit>, Object> {
                private static int component2 = 1;
                private static int copydefault;
                final WesternUnionActivity ShareDataUIState;
                Object component1;
                int component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component2 + 87;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WesternUnionActivity.access$getConfirmTransactionViewModel(this.ShareDataUIState).setConfirmTransactionDetailsInfo((List) this.component1, this.ShareDataUIState);
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 45;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02514(WesternUnionActivity westernUnionActivity, Continuation<? super C02514> continuation) {
                    super(2, continuation);
                    this.ShareDataUIState = westernUnionActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02514 c02514 = new C02514(this.ShareDataUIState, continuation);
                    c02514.component1 = obj;
                    C02514 c025142 = c02514;
                    int i2 = copydefault + 7;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    return c025142;
                }

                @Override
                public Object invoke(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 59;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent1 = component1(list, continuation);
                    int i4 = copydefault + 79;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return objComponent1;
                }

                public final Object component1(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 53;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    C02514 c02514 = (C02514) create(list, continuation);
                    if (i3 == 0) {
                        return c02514.invokeSuspend(Unit.INSTANCE);
                    }
                    c02514.invokeSuspend(Unit.INSTANCE);
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
                    this.component1 = 1;
                    if (FlowKt.collectLatest(WesternUnionActivity.access$getWesternUnionViewModel(this.ShareDataUIState).getConfirmationData(), new C02514(this.ShareDataUIState, null), this) == coroutine_suspended) {
                        int i3 = component2 + 47;
                        copydefault = i3 % 128;
                        int i4 = i3 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = copydefault + 89;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.ShareDataUIState = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.ShareDataUIState, continuation);
                int i2 = component2 + 25;
                copydefault = i2 % 128;
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
                int i2 = component2 + 1;
                copydefault = i2 % 128;
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
                int i2 = copydefault + 59;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass4.invokeSuspend(unit);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4.invokeSuspend(unit);
                int i4 = copydefault + 11;
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = component1 + 23;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.RESUMED, new AnonymousClass4(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    int i4 = ShareDataUIState + 35;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i5 = ShareDataUIState + 71;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = WesternUnionActivity.this.new copydefault(continuation);
            int i2 = component1 + 29;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = component1 + 5;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            if (i3 == 0) {
                return copydefaultVar.invokeSuspend(Unit.INSTANCE);
            }
            copydefaultVar.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    private static void h(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $10 + 67;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - KeyEvent.getDeadChar(0, 0), 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1159210934, false, $$r(b2, (byte) (b2 | Ascii.ETB), b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 3609, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7171), 1951385784, false, $$r(b3, (byte) (b3 | 19), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - Color.red(0), 23 - ExpandableListView.getPackedPositionChild(0L), (char) (27760 - MotionEvent.axisFromString("")), -1529629956, false, $$r(b4, (byte) (b4 | Ascii.CAN), b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
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
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getOffsetAfter("", 0), 23 - TextUtils.indexOf((CharSequence) "", '0'), (char) (27761 - KeyEvent.normalizeMetaState(0)), -1529629956, false, $$r(b5, (byte) (b5 | Ascii.CAN), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $10 + 31;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeGetFeeLoading$1", f = "WesternUnionActivity.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    static final class copy extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int copydefault;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeGetFeeLoading$1$1", f = "WesternUnionActivity.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            final WesternUnionActivity component1;
            int component3;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeGetFeeLoading$1$1$1", f = "WesternUnionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 1;
                private static int component1;
                final WesternUnionActivity component2;
                boolean component3;
                int copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.copydefault != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = component1 + 125;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ResultKt.throwOnFailure(obj);
                    WesternUnionActivity.access$getConfirmTransactionViewModel(this.component2).updateIsLoading(this.component3);
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 109;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component2 = westernUnionActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                    anonymousClass5.component3 = ((Boolean) obj).booleanValue();
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = ShareDataUIState + 101;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass52;
                    }
                    throw null;
                }

                @Override
                public Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 91;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    boolean zBooleanValue = bool.booleanValue();
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i3 != 0) {
                        return copydefault(zBooleanValue, continuation2);
                    }
                    copydefault(zBooleanValue, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 109;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = ShareDataUIState + 29;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component3;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.component3 = 1;
                    if (FlowKt.collectLatest(WesternUnionActivity.access$getWesternUnionViewModel(this.component1).getConfirmationLoading(), new AnonymousClass5(this.component1, null), this) == coroutine_suspended) {
                        int i3 = component2 + 31;
                        int i4 = i3 % 128;
                        ShareDataUIState = i4;
                        int i5 = i3 % 2;
                        int i6 = i4 + 79;
                        component2 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = component2 + 69;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        int i8 = 67 / 0;
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component1 = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component1, continuation);
                int i2 = ShareDataUIState + 45;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass4;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 117;
                ShareDataUIState = i2 % 128;
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
                int i2 = component2 + 55;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                if (i3 == 0) {
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass4.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.RESUMED, new AnonymousClass4(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    int i5 = ShareDataUIState + 61;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = ShareDataUIState + 79;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i9 = component2 + 111;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        copy(Continuation<? super copy> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = WesternUnionActivity.this.new copy(continuation);
            int i2 = component2 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copyVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 81;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            copy copyVar = (copy) create(coroutineScope, continuation);
            if (i3 == 0) {
                copyVar.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = copyVar.invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 51;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class component4 extends FunctionReferenceImpl implements Function1<ScreenInformation<MPesaGlobalScreen>, Unit> {
        private static int component1 = 0;
        private static int component2 = 1;

        public final void component2(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(screenInformation, "");
                WesternUnionActivity.access$changeScreen((WesternUnionActivity) this.receiver, screenInformation);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(screenInformation, "");
            WesternUnionActivity.access$changeScreen((WesternUnionActivity) this.receiver, screenInformation);
            int i3 = component1 + 99;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override
        public Unit invoke(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component2 + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component2(screenInformation);
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 87;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        component4(Object obj) {
            super(1, obj, WesternUnionActivity.class, "changeScreen", "changeScreen(Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;)V", 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountrySelection$1", f = "WesternUnionActivity.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    static final class equals extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountrySelection$1$1", f = "WesternUnionActivity.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public static int ShareDataUIState = 501075512;
            private static int component3 = 0;
            private static int copydefault = 1;
            final WesternUnionActivity component1;
            int component2;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountrySelection$1$1$1", f = "WesternUnionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<Country, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;
                Object component1;
                int component2;
                final WesternUnionActivity copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 97;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = ShareDataUIState + 109;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                    Country country = (Country) this.component1;
                    if (country != null) {
                        WesternUnionActivity westernUnionActivity = this.copydefault;
                        WesternUnionActivity.access$getWesternUnionViewModel(westernUnionActivity).setCountry(country, WesternUnionActivity.access$getMpesaGlobalCountriesViewModel(westernUnionActivity).getSelectedUsState());
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.copydefault = westernUnionActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.copydefault, continuation);
                    anonymousClass2.component1 = obj;
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = component3 + 3;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass22;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object component2(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 25;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass2) create(country, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 19;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 121;
                    component3 = i2 % 128;
                    Country country2 = country;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return component2(country2, continuation2);
                    }
                    Object objComponent2 = component2(country2, continuation2);
                    int i3 = 10 / 0;
                    return objComponent2;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 55;
                component3 = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component2;
                if (i3 != 0) {
                    int i4 = copydefault + 35;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component2 = 1;
                    if (FlowKt.collectLatest(WesternUnionActivity.access$getMpesaGlobalCountriesViewModel(this.component1).getSelectedCountry(), new AnonymousClass2(this.component1, null), this) == coroutine_suspended) {
                        int i5 = component3 + 109;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component1 = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component1, continuation);
                int i2 = component3 + 123;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 15 / 0;
                }
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                component3 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    component2(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objComponent2 = component2(coroutineScope2, continuation2);
                int i3 = component3 + 19;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 69;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 82 / 0;
                }
                int i5 = copydefault + 103;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = copydefault + 1;
                component3 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i4 = component3 + 15;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.RESUMED, new AnonymousClass4(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = component3 + 13;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        equals(Continuation<? super equals> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            equals equalsVar = WesternUnionActivity.this.new equals(continuation);
            int i2 = copydefault + 87;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return equalsVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = copydefault + 3;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((equals) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 65;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static void e(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iArgb = 4037 - Color.argb(i4, i4, i4, i4);
                    int scrollBarFadeDuration = 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19180);
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (b2 + 1);
                    String str$$r = $$r(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iArgb, scrollBarFadeDuration, c3, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int iAxisFromString = MotionEvent.axisFromString("") + 7568;
                        int threadPriority = 11 - ((Process.getThreadPriority(i4) + 20) >> 6);
                        char c4 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, threadPriority, c4, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i7);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2458, KeyEvent.keyCodeFromString("") + 28, (char) TextUtils.indexOf("", ""), 931716605, false, $$r(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 7568, (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, (char) KeyEvent.keyCodeFromString(""), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i8 = $11 + 87;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            i2 = 2;
                            i4 = 0;
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
        objArr[0] = new String(cArr6);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountriesBackNavigation$1", f = "WesternUnionActivity.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountriesBackNavigation$1$1", f = "WesternUnionActivity.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component1;
            int component2;
            final WesternUnionActivity component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 85;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component2;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateBackUiEvent = WesternUnionActivity.access$getMpesaGlobalCountriesViewModel(this.component3).getNavigateBackUiEvent();
                    final WesternUnionActivity westernUnionActivity = this.component3;
                    this.component2 = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int ShareDataUIState = 0;
                        private static int component2 = 1;

                        @Override
                        public Object emit(Object obj3, Continuation continuation) {
                            Object objCopydefault;
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState + 75;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            if (i6 == 0) {
                                objCopydefault = copydefault(zBooleanValue, continuation);
                                int i7 = 63 / 0;
                            } else {
                                objCopydefault = copydefault(zBooleanValue, continuation);
                            }
                            int i8 = ShareDataUIState + 79;
                            component2 = i8 % 128;
                            if (i8 % 2 != 0) {
                                return objCopydefault;
                            }
                            throw null;
                        }

                        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = component2 + 1;
                            int i6 = i5 % 128;
                            ShareDataUIState = i6;
                            if (i5 % 2 != 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            if (z) {
                                int i7 = i6 + 125;
                                component2 = i7 % 128;
                                int i8 = i7 % 2;
                                WesternUnionActivity.access$getWesternUnionViewModel(westernUnionActivity).previousScreen();
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i4 = ShareDataUIState;
                        int i5 = i4 + 13;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 81;
                        component1 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 23 / 0;
                        }
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
            AnonymousClass2(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component3 = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3, continuation);
                int i2 = ShareDataUIState + 67;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 3;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                if (i3 == 0) {
                    int i4 = 27 / 0;
                }
                int i5 = component1 + 39;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 47;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 9;
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = copydefault + 15;
                component3 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    int i4 = component3 + 93;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
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
            ShareDataUIState shareDataUIState = WesternUnionActivity.this.new ShareDataUIState(continuation);
            int i2 = copydefault + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 51;
            component3 = i2 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component3(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent3 = component3(coroutineScope2, continuation2);
            int i3 = component3 + 89;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return objComponent3;
            }
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountryFetchingState$1", f = "WesternUnionActivity.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int copydefault;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountryFetchingState$1$1", f = "WesternUnionActivity.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            int component2;
            final WesternUnionActivity component3;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchState;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity$observeCountryFetchingState$1$1$1", f = "WesternUnionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<CountryFetchState, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 1;
                private static int component3;
                final WesternUnionActivity component1;
                int component2;
                Object copydefault;

                /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
                
                    if (((com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState) r3.copydefault).isLoading() == false) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
                
                    if ((!r4.isError()) == false) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
                
                    r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.ShareDataUIState + 91;
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.component3 = r4 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    if ((r4 % 2) != 0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
                
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.access$getWesternUnionViewModel(r3.component1).showError();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
                
                    return kotlin.Unit.INSTANCE;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
                
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.access$getWesternUnionViewModel(r3.component1).showError();
                    r4 = null;
                    r4.hashCode();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
                
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
                
                    if (r3.component2 == 0) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
                
                    if (r3.component2 == 0) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
                
                    kotlin.ResultKt.throwOnFailure(r4);
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
                        int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.component3
                        int r1 = r1 + 63
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.ShareDataUIState = r2
                        int r1 = r1 % r0
                        if (r1 != 0) goto L1a
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r3.component2
                        r2 = 46
                        int r2 = r2 / 0
                        if (r1 != 0) goto L5d
                        goto L21
                    L1a:
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r3.component2
                        if (r1 != 0) goto L5d
                    L21:
                        kotlin.ResultKt.throwOnFailure(r4)
                        java.lang.Object r4 = r3.copydefault
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState r4 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState) r4
                        boolean r1 = r4.isLoading()
                        if (r1 == 0) goto L2f
                        goto L4c
                    L2f:
                        boolean r4 = r4.isError()
                        r4 = r4 ^ 1
                        if (r4 == 0) goto L38
                        goto L4c
                    L38:
                        int r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.ShareDataUIState
                        int r4 = r4 + 91
                        int r1 = r4 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.component3 = r1
                        int r4 = r4 % r0
                        if (r4 != 0) goto L4f
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity r4 = r3.component1
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.access$getWesternUnionViewModel(r4)
                        r4.showError()
                    L4c:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    L4f:
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity r4 = r3.component1
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.access$getWesternUnionViewModel(r4)
                        r4.showError()
                        r4 = 0
                        r4.hashCode()
                        throw r4
                    L5d:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r0)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.component2.AnonymousClass1.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component1 = westernUnionActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component1, continuation);
                    anonymousClass5.copydefault = obj;
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = ShareDataUIState + 41;
                    component3 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass52;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object component2(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 111;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(countryFetchState, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return anonymousClass5.invokeSuspend(unit);
                    }
                    anonymousClass5.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 81;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent2 = component2(countryFetchState, continuation);
                    int i4 = ShareDataUIState + 23;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return objComponent2;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 73;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component2;
                if (i4 != 0) {
                    int i5 = component1 + 65;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component2 = 1;
                    if (FlowKt.collectLatest(WesternUnionActivity.access$getMpesaGlobalCountriesViewModel(this.component3).getCountryFetchState(), new AnonymousClass5(this.component3, null), this) == coroutine_suspended) {
                        int i6 = ShareDataUIState + 117;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WesternUnionActivity westernUnionActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component3 = westernUnionActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component3, continuation);
                int i2 = component1 + 5;
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
                int i2 = ShareDataUIState + 59;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent3 = component3(coroutineScope, continuation);
                if (i3 == 0) {
                    int i4 = 94 / 0;
                }
                int i5 = component1 + 63;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 123;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 109;
                component1 = i4 % 128;
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
            int i2 = this.copydefault;
            if (i2 != 0) {
                int i3 = component3;
                int i4 = i3 + 37;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 111;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionActivity.this, Lifecycle.State.RESUMED, new AnonymousClass1(WesternUnionActivity.this, null), this) == coroutine_suspended) {
                    int i8 = ShareDataUIState + 19;
                    component3 = i8 % 128;
                    if (i8 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
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
            component2 component2Var = WesternUnionActivity.this.new component2(continuation);
            int i2 = component3 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = ShareDataUIState + 103;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 != 0) {
                return component2Var.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 97 / 0;
            return component2Var.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x029d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void handleBackPress() {
        int i = 2 % 2;
        int i2 = copy + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        getWesternUnionViewModel().previousScreen();
        int i4 = copy + 35;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void observeConfirmationForwardNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = component4 + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeConfirmationBackNavigation() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component1(null), 3, null);
        int i2 = component4 + 109;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void observeConfirmationData() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copydefault(null), 3, null);
        int i2 = component4 + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeGetFeeLoading() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copy(null), 3, null);
        int i2 = copy + 29;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeScreenChange() {
        int i = 2 % 2;
        getWesternUnionViewModel().getScreenTransition().observe(this, new getRequestBeneficiariesState(new component4(this)));
        int i2 = copy + 105;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeCountrySelection() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new equals(null), 3, null);
        int i2 = component4 + 87;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
    }

    private final void observeCountriesBackNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = copy + 87;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void changeScreen(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        MPesaGlobalErrorFragment mPesaGlobalErrorFragment;
        int i = 2 % 2;
        MPesaGlobalScreen screen = screenInformation.getScreen();
        if (Intrinsics.areEqual(screen, MPesaGlobalScreen.CountrySelection.INSTANCE)) {
            mPesaGlobalErrorFragment = MPesaGlobalCountryPickerFragment.INSTANCE.create(CountryListType.WESTERN_UNION);
        } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.RecipientDetails.INSTANCE)) {
            mPesaGlobalErrorFragment = new WesternUnionRecipientDetailsFragment();
            int i2 = copy + 81;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.AmountDetails.INSTANCE)) {
            mPesaGlobalErrorFragment = new WesternUnionAmountDetailsFragment();
        } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Confirmation.INSTANCE)) {
            setConfirmationData();
            mPesaGlobalErrorFragment = new ConfirmTransactionFragment();
        } else {
            if (Intrinsics.areEqual(screen, MPesaGlobalScreen.TransactionSuccess.INSTANCE)) {
                int i4 = copy + 35;
                component4 = i4 % 128;
                int i5 = i4 % 2;
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
        }
        Fragment fragment = mPesaGlobalErrorFragment;
        int i6 = copy + 65;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 2;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        ScreenDirection direction = screenInformation.getDirection();
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        FragmentExtensionsKt.showFragment$default(supportFragmentManager, direction, simpleName, fragment, false, R.id.container, null, 32, null);
    }

    private final void setConfirmationData() {
        int i = 2 % 2;
        int i2 = copy + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = getConfirmTransactionViewModel();
        String string = getString(R.string.design_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        confirmTransactionViewModel.updateScreenTitleText(string);
        String string2 = getString(R.string.send);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        confirmTransactionViewModel.updateConfirmButtonText(string2);
        confirmTransactionViewModel.shouldShowNewAvatarIcon(true);
        int i4 = component4 + 93;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void showStkPush() {
        int i = 2 % 2;
        int i2 = copy + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        startActivity(StkPushActivity.INSTANCE.newInstance(this));
        finish();
        int i4 = copy + 37;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void observeCountryFetchingState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component2(null), 3, null);
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -536309982
        	at java.base/java.util.ArrayList.<init>(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.onPause():void");
    }

    /*  JADX ERROR: StackOverflowError in pass: FixTypesVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:113)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        */
    @Override
    public void attachBaseContext(android.content.Context r44) {
        /*
            Method dump skipped, instruction units count: 15214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        equals = 0;
        ShareDataUIState();
        copydefault();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = getAsAtTimestamp + 29;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = component4 + 115;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            component1 = new char[]{3093, 1729, 6571, 11472, 10110, 14907, 19719, 18409, 23251, 28039, 24616, 31578, 36415, 33001, 39887, 44714, 41367, 46146, 53046, 49695, 54511, 61347, 57987, 62832, 2114, 832, 5605, 10449, 9144, 13949, 18771, 23603, 22291, 27100, 31976, 30610, 35449, 40233, 36879, 43760, 48635, 45185, 52066, 56907, 53562, 60395, 65160, 61868, 1171, 8009, 4655, 9485, 16354, 12971, 17812, 22576, 21312, 26119, 30947, 29641, 34491, 39265, 44098, 42811, 47642, 52352, 51093, 55963, 60770, 57374, 64271, 3568, 224, 7047, 11875, 8521, 13339, 20193, 16834, 21691, 28570, 25201, 29966, 34839, 33530, 38330, 43179, 41841, 46674, 51483, 50154, 55003, 59813, 64554, 63332, 2615, 7448, 6090, 10933, 15795, 12409, 19242, 24083, 20722, 27603};
            copydefault = 5167949625112200878L;
            throw null;
        }
        component1 = new char[]{3093, 1729, 6571, 11472, 10110, 14907, 19719, 18409, 23251, 28039, 24616, 31578, 36415, 33001, 39887, 44714, 41367, 46146, 53046, 49695, 54511, 61347, 57987, 62832, 2114, 832, 5605, 10449, 9144, 13949, 18771, 23603, 22291, 27100, 31976, 30610, 35449, 40233, 36879, 43760, 48635, 45185, 52066, 56907, 53562, 60395, 65160, 61868, 1171, 8009, 4655, 9485, 16354, 12971, 17812, 22576, 21312, 26119, 30947, 29641, 34491, 39265, 44098, 42811, 47642, 52352, 51093, 55963, 60770, 57374, 64271, 3568, 224, 7047, 11875, 8521, 13339, 20193, 16834, 21691, 28570, 25201, 29966, 34839, 33530, 38330, 43179, 41841, 46674, 51483, 50154, 55003, 59813, 64554, 63332, 2615, 7448, 6090, 10933, 15795, 12409, 19242, 24083, 20722, 27603};
        copydefault = 5167949625112200878L;
        int i4 = i3 + 55;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        component2 = -3780477796495014671L;
        component3 = 324620127;
        ShareDataUIState = (char) 50417;
        getRequestBeneficiariesState = -2695797918298192443L;
    }
}
