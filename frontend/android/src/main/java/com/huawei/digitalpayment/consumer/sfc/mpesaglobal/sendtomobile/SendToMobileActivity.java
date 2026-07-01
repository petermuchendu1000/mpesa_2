package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.global.databinding.ActivityMpesaGlobalBinding;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalActivity;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MPesaGlobalCountryPickerFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryFetchState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryListType;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optin.failure.MPesaGlobalErrorFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import com.safaricom.sharedui.compose.confirmation.ConfirmTransactionFragment;
import com.safaricom.sharedui.compose.confirmation.ConfirmTransactionViewModel;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import com.safaricom.sharedui.compose.stk.StkPushActivity;
import com.safaricom.sharedui.compose.utils.FragmentExtensionsKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Function;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onBackCancelled;
import kotlin.onBackStarted;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\u0016\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u001aH\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileActivity;", "Lcom/safaricom/sharedui/compose/activity/BackHandlerActivity;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/global/databinding/ActivityMpesaGlobalBinding;", "mpesaGlobalCountriesViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "getMpesaGlobalCountriesViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesViewModel;", "mpesaGlobalCountriesViewModel$delegate", "Lkotlin/Lazy;", "confirmTransactionViewModel", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "getConfirmTransactionViewModel", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionViewModel;", "confirmTransactionViewModel$delegate", "sendToMobileViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileViewModel;", "getSendToMobileViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileViewModel;", "sendToMobileViewModel$delegate", "contactsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleBackPress", "onPause", "onResume", "observeScreenChange", "observeCountrySelection", "changeScreen", "screenInformation", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "observeCountryFetchingState", "setConfirmationData", "showStkPush", "onSelectContact", "observeConfirmationForwardNavigation", "observeConfirmationBackNavigation", "observeCountriesBackNavigation", "observeConfirmationData", "observeGetFeeLoading", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SendToMobileActivity extends Hilt_SendToMobileActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static long ShareDataUIState;
    private static int[] component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int equals;
    private static char getRequestBeneficiariesState;
    private ActivityMpesaGlobalBinding binding;

    private final Lazy confirmTransactionViewModel;
    private final ActivityResultLauncher<Intent> contactsLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            SendToMobileActivity.m11052$r8$lambda$71fGxN3PLfBoKplkUiceY9MRK4(this.f$0, (ActivityResult) obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    private final Lazy mpesaGlobalCountriesViewModel;

    private final Lazy sendToMobileViewModel;
    private static final byte[] $$l = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM};
    private static final int $$o = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {119, -40, Ascii.DLE, 123, Ascii.DC2, 4, -57, 63, Ascii.SO, 6, -2, Ascii.VT, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, Ascii.EM, -9, 19, -3, -2, 17, -56, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 40, Ascii.ETB, Ascii.ETB, -9, 8, 13, -5, 7, Ascii.DLE, -1, -12, 35, -9, Ascii.ETB, 7, -8, -22, 43, Ascii.FF, -45, TarHeader.LF_CONTIG, 6, -11, Ascii.RS, -79, 19, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -61, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, 57, 17, 3, -1, 5, 7, 5, -45, 63, 17, -3, 19, -11, 19, -62, 58, 5, Ascii.CAN, -8, -49, 77, -6, -53, 79, -8, 1, 9, 4, Ascii.NAK, -64, Ascii.US, TarHeader.LF_LINK, -3, 19, -11, 19, -41, 43, 3, 4, Ascii.SO, -35, TarHeader.LF_CHR, Ascii.SI, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO};
    private static final int $$n = 59;
    private static final byte[] $$d = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 137;
    private static int copy = 0;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class equals implements Observer, FunctionAdapter {
        private static int component1 = 1;
        private static int copydefault;
        private final Function1 component3;

        equals(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 107;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            if (obj instanceof Observer) {
                int i5 = i3 + 35;
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
            int i2 = copydefault;
            int i3 = i2 + 111;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component3;
            int i5 = i2 + 73;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 23;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = copydefault + 85;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.$$l
            int r6 = 111 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.$$r(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 83
            int r7 = 28 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.$$d
            int r8 = 100 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.g(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.$$m
            int r8 = r8 + 4
            int r1 = 63 - r6
            int r7 = r7 * 3
            int r7 = r7 + 99
            byte[] r1 = new byte[r1]
            int r6 = 62 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r7 = r7 + r8
            int r7 = r7 + (-6)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.h(int, int, byte, java.lang.Object[]):void");
    }

    public static final void access$changeScreen(SendToMobileActivity sendToMobileActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        sendToMobileActivity.changeScreen(screenInformation);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = component4 + 55;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final ConfirmTransactionViewModel access$getConfirmTransactionViewModel(SendToMobileActivity sendToMobileActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            sendToMobileActivity.getConfirmTransactionViewModel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConfirmTransactionViewModel confirmTransactionViewModel = sendToMobileActivity.getConfirmTransactionViewModel();
        int i3 = getAsAtTimestamp + 113;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return confirmTransactionViewModel;
    }

    public static final MpesaGlobalCountriesViewModel access$getMpesaGlobalCountriesViewModel(SendToMobileActivity sendToMobileActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = sendToMobileActivity.getMpesaGlobalCountriesViewModel();
        int i4 = component4 + 115;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return mpesaGlobalCountriesViewModel;
    }

    public static final SendToMobileViewModel access$getSendToMobileViewModel(SendToMobileActivity sendToMobileActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        SendToMobileViewModel sendToMobileViewModel = sendToMobileActivity.getSendToMobileViewModel();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = getAsAtTimestamp + 35;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return sendToMobileViewModel;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", WindowInfoFieldGroup.FIELD_SCREEN, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 0;
        private static int component2 = 1;

        private Companion() {
        }

        public static Intent createIntent$default(Companion companion, Context context, MPesaGlobalScreen mPesaGlobalScreen, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 57;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 2) != 0) {
                mPesaGlobalScreen = MPesaGlobalScreen.CountrySelection.INSTANCE;
                int i5 = component1 + 27;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
            return companion.createIntent(context, mPesaGlobalScreen);
        }

        public final Intent createIntent(Context context, MPesaGlobalScreen screen) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(screen, "");
            Intent intent = new Intent(context, (Class<?>) SendToMobileActivity.class);
            intent.putExtra("screen_key", screen);
            int i2 = component2 + 45;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SendToMobileActivity() {
        final SendToMobileActivity sendToMobileActivity = this;
        final Function0 function0 = null;
        this.mpesaGlobalCountriesViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MpesaGlobalCountriesViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 97;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sendToMobileActivity.getViewModelStore();
                int i4 = copydefault + 57;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 45;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 3 / 0;
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
                int i2 = component1 + 91;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 5 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 51;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    sendToMobileActivity.getDefaultViewModelProviderFactory();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToMobileActivity.getDefaultViewModelProviderFactory();
                int i3 = component1 + 5;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 57;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 21;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sendToMobileActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 73;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 103;
                component1 = i4 % 128;
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
        this.confirmTransactionViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ConfirmTransactionViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 117;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sendToMobileActivity.getViewModelStore();
                int i4 = component2 + 65;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 5;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 56 / 0;
                }
                return viewModelStoreInvoke;
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
                int i2 = component1 + 47;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component1 + 23;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 7;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    sendToMobileActivity.getDefaultViewModelProviderFactory();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToMobileActivity.getDefaultViewModelProviderFactory();
                int i3 = component2 + 55;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 1;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 57;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sendToMobileActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 71;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
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
        this.sendToMobileViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SendToMobileViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 27;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    sendToMobileActivity.getViewModelStore();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = sendToMobileActivity.getViewModelStore();
                int i3 = component1 + 49;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 71;
                component2 = i2 % 128;
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
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 85;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 63;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToMobileActivity.getDefaultViewModelProviderFactory();
                int i4 = ShareDataUIState + 11;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 125;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = sendToMobileActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = copydefault + 21;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 123;
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
    }

    private final MpesaGlobalCountriesViewModel getMpesaGlobalCountriesViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 21;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel = (MpesaGlobalCountriesViewModel) this.mpesaGlobalCountriesViewModel.getValue();
        int i4 = component4 + 101;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return mpesaGlobalCountriesViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ConfirmTransactionViewModel getConfirmTransactionViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ConfirmTransactionViewModel confirmTransactionViewModel = (ConfirmTransactionViewModel) this.confirmTransactionViewModel.getValue();
        if (i3 == 0) {
            return confirmTransactionViewModel;
        }
        throw null;
    }

    private final SendToMobileViewModel getSendToMobileViewModel() {
        int i = 2 % 2;
        int i2 = component4 + 67;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        SendToMobileViewModel sendToMobileViewModel = (SendToMobileViewModel) this.sendToMobileViewModel.getValue();
        int i4 = component4 + 39;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return sendToMobileViewModel;
    }

    private static final void contactsLauncher$lambda$1(SendToMobileActivity sendToMobileActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sendToMobileActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i2 = getAsAtTimestamp + 115;
            component4 = i2 % 128;
            SfcContact sfcContact = null;
            if (i2 % 2 == 0) {
                activityResult.getData();
                throw null;
            }
            Intent data = activityResult.getData();
            Serializable serializableExtra = data != null ? data.getSerializableExtra(FixedDataNavKeys.EXTRA_CONTACT_RESP) : null;
            if (serializableExtra instanceof SfcContact) {
                int i3 = component4 + 105;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                sfcContact = (SfcContact) serializableExtra;
            }
            if (sfcContact != null) {
                sendToMobileActivity.getSendToMobileViewModel().updatePhoneNumber(StringsKt.replace$default(SfcPhoneNumberUtil.INSTANCE.formatterPhoneNumberNoCountryCode(sfcContact.getRealPhoneNumber()), "-", "", false, 4, (Object) null));
            }
        }
        int i5 = component4 + 29;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getEdgeSlop() >> 16), 33 - ImageFormat.getBitsPerPixel(0), (char) (63440 - View.resolveSizeAndState(0, 0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 18, (char) (51269 - TextUtils.getOffsetAfter("", 0)), -1883291598, false, $$r((byte) ($$o & 14), b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 51;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class getRequestBeneficiariesState extends FunctionReferenceImpl implements Function1<ScreenInformation<MPesaGlobalScreen>, Unit> {
        private static int component2 = 1;
        private static int copydefault;

        public final void ShareDataUIState(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component2 + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(screenInformation, "");
            SendToMobileActivity.access$changeScreen((SendToMobileActivity) this.receiver, screenInformation);
            int i4 = copydefault + 59;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Unit invoke(ScreenInformation<MPesaGlobalScreen> screenInformation) {
            Unit unit;
            int i = 2 % 2;
            int i2 = component2 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(screenInformation);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 68 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = component2 + 113;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        getRequestBeneficiariesState(Object obj) {
            super(1, obj, SendToMobileActivity.class, "changeScreen", "changeScreen(Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;)V", 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountrySelection$1", f = "SendToMobileActivity.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    static final class copy extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountrySelection$1$1", f = "SendToMobileActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component3 = 0;
            private static int copydefault = 1;
            int ShareDataUIState;
            final SendToMobileActivity component2;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountrySelection$1$1$1", f = "SendToMobileActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C02445 extends SuspendLambda implements Function2<Country, Continuation<? super Unit>, Object> {
                private static int component2 = 1;
                private static int copydefault;
                Object ShareDataUIState;
                final SendToMobileActivity component1;
                int component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Country country = (Country) this.ShareDataUIState;
                    if (country != null) {
                        int i2 = copydefault + 63;
                        component2 = i2 % 128;
                        if (i2 % 2 == 0) {
                            SendToMobileActivity sendToMobileActivity = this.component1;
                            SendToMobileActivity.access$getSendToMobileViewModel(sendToMobileActivity).setCountry(country);
                            SendToMobileActivity.access$getMpesaGlobalCountriesViewModel(sendToMobileActivity).clearSelectedCountry();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        SendToMobileActivity sendToMobileActivity2 = this.component1;
                        SendToMobileActivity.access$getSendToMobileViewModel(sendToMobileActivity2).setCountry(country);
                        SendToMobileActivity.access$getMpesaGlobalCountriesViewModel(sendToMobileActivity2).clearSelectedCountry();
                        int i3 = copydefault + 63;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02445(SendToMobileActivity sendToMobileActivity, Continuation<? super C02445> continuation) {
                    super(2, continuation);
                    this.component1 = sendToMobileActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02445 c02445 = new C02445(this.component1, continuation);
                    c02445.ShareDataUIState = obj;
                    C02445 c024452 = c02445;
                    int i2 = component2 + 45;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return c024452;
                }

                public final Object component2(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 65;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    C02445 c02445 = (C02445) create(country, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return c02445.invokeSuspend(unit);
                    }
                    c02445.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(Country country, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 7;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent2 = component2(country, continuation);
                    if (i3 == 0) {
                        int i4 = 60 / 0;
                    }
                    int i5 = copydefault + 35;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 35 / 0;
                    }
                    return objComponent2;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 33;
                component3 = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.ShareDataUIState;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.ShareDataUIState = 1;
                    if (FlowKt.collectLatest(SendToMobileActivity.access$getMpesaGlobalCountriesViewModel(this.component2).getSelectedCountry(), new C02445(this.component2, null), this) == coroutine_suspended) {
                        int i4 = component3 + 85;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component2 = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                int i2 = copydefault + 113;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 1;
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
                int i3 = copydefault + 95;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 115;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 57;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
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
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 51;
                copydefault = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(SendToMobileActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 19;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        copy(Continuation<? super copy> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = SendToMobileActivity.this.new copy(continuation);
            int i2 = copydefault + 5;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
            }
            return copyVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            copydefault = i2 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                copydefault(coroutineScope2, continuation2);
                throw null;
            }
            Object objCopydefault = copydefault(coroutineScope2, continuation2);
            int i3 = component3 + 65;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return objCopydefault;
            }
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 23;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountriesBackNavigation$1", f = "SendToMobileActivity.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    public static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static short[] toString;
        int ShareDataUIState;
        private static final byte[] $$c = {59, -24, -77, -23};
        private static final int $$f = 236;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {74, 75, -50, -9, -12, -1, -9, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
        private static final int $$e = 200;
        private static final byte[] $$a = {93, TarHeader.LF_LINK, 76, -114, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -55, -14, -1, -8, 13, -11, -8, 68, PSSSigner.TRAILER_IMPLICIT, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, Ascii.ESC, -39, -11, 7, -23, 19, TarHeader.LF_LINK, -64, 9, -15, 5, TarHeader.LF_CONTIG, -40, -22, -12, Ascii.VT, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
        private static final int $$b = 139;
        private static int ArtificialStackFrames = 0;
        private static int getSponsorBeneficiariesState = 1;
        private static char component2 = 65184;
        private static char copydefault = 37314;
        private static char component3 = 35708;
        private static char equals = 51414;
        private static int getRequestBeneficiariesState = 362530340;
        private static int getAsAtTimestamp = -238323967;
        private static int copy = -1906689276;
        private static byte[] component4 = {-61, 32, -47, Ascii.FF, -14, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 38, -41, -16, -63, 39, -41, 47, -33, 33, 43, -40, 121, -123, 40, 35, -44, 101, -102, -44, -62, -32, -48, 44, -47, 41, 33, Ascii.DLE, -24, -41, 37, 0, -4, -41, 47, -33, 33, 43, -40, -59, -29, -46, -45, -44, 39, -33, 36, Ascii.SUB, -24, -41, 37, 0, -4, -41, 47, -33, 33, 43, -40, -55, -4, -41, 47, -33, 33, 43, -40, -16, -63, 43, -45, -38, 45, 36, 59, -49, 33, -40, 40, -45, Ascii.SI, -10, 38, -41, -44, 36, -41, 47, -38, 36, Base64.padSymbol, -3, 63, -45, -44, -44, TarHeader.LF_FIFO, -62, 43, -45, -38, 56, 8, 63, -23, 44, -43, 32, 42, Ascii.SUB, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, -50, 44, 44, -43, 32, 10, -11, -58, 36, -36, 56, Ascii.VT, -28, 38, -41, -51, 32, -47, Ascii.FF, -33, 45, -14, 40, 39, -39, 39, 17};

        private static String $$g(byte b2, byte b3, int i) {
            int i2 = b3 + 111;
            byte[] bArr = $$c;
            int i3 = 3 - (i * 2);
            int i4 = b2 * 4;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                int i6 = i3 + i4;
                i3 = i3;
                i2 = i6;
            }
            while (true) {
                int i7 = i3 + 1;
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i3 = i7;
                i2 += bArr[i7];
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r0 = 34 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.$$a
                int r6 = 65 - r6
                int r8 = r8 * 3
                int r8 = 115 - r8
                byte[] r0 = new byte[r0]
                int r7 = 33 - r7
                r2 = 0
                if (r1 != 0) goto L15
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2e
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
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
                int r3 = r3 + r6
                int r6 = r3 + (-2)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.c(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r0 = r6 + 1
                byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.$$d
                int r7 = r7 + 98
                int r8 = 16 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L11
                r4 = r6
                r7 = r8
                r3 = r2
                goto L28
            L11:
                r3 = r2
            L12:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L21:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L28:
                int r4 = -r4
                int r8 = r8 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.d(short, byte, byte, java.lang.Object[]):void");
        }

        private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            iNotificationSideChannelDefault.component3 = 0;
            char[] cArr3 = new char[2];
            while (iNotificationSideChannelDefault.component3 < cArr.length) {
                int i4 = $10 + 123;
                $11 = i4 % 128;
                int i5 = 58224;
                if (i4 % 2 == 0) {
                    cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                    cArr3[i3] = cArr[iNotificationSideChannelDefault.component3 >>> 1];
                } else {
                    cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
                    cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                }
                int i6 = i3;
                while (i6 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[i3];
                    char[] cArr4 = cArr3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(equals)};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, (char) (23250 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 592652048, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        cArr4[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 844, 32 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 23252), 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        int i7 = $11 + 101;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
                cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
                Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getTouchSlop() >> 8), 49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountriesBackNavigation$1$1", f = "SendToMobileActivity.kt", i = {}, l = {BERTags.FLAGS}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int copydefault;
            final SendToMobileActivity ShareDataUIState;
            int component1;

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
                    SharedFlow<Boolean> navigateBackUiEvent = SendToMobileActivity.access$getMpesaGlobalCountriesViewModel(this.ShareDataUIState).getNavigateBackUiEvent();
                    final SendToMobileActivity sendToMobileActivity = this.ShareDataUIState;
                    this.component1 = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int component1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = component1 + 101;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            Object obj3 = null;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i7 == 0) {
                                copydefault(zBooleanValue, continuation);
                                obj3.hashCode();
                                throw null;
                            }
                            Object objCopydefault = copydefault(zBooleanValue, continuation);
                            int i8 = ShareDataUIState + 107;
                            component1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                return objCopydefault;
                            }
                            throw null;
                        }

                        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            int i6 = component1;
                            int i7 = i6 + 3;
                            ShareDataUIState = i7 % 128;
                            int i8 = i7 % 2;
                            if (z) {
                                int i9 = i6 + 47;
                                ShareDataUIState = i9 % 128;
                                if (i9 % 2 == 0) {
                                    SendToMobileActivity.access$getSendToMobileViewModel(sendToMobileActivity).previousScreen();
                                    int i10 = 9 / 0;
                                } else {
                                    SendToMobileActivity.access$getSendToMobileViewModel(sendToMobileActivity).previousScreen();
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            int i11 = ShareDataUIState + 43;
                            component1 = i11 % 128;
                            int i12 = i11 % 2;
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = component2 + 81;
                        int i6 = i5 % 128;
                        copydefault = i6;
                        int i7 = i5 % 2;
                        int i8 = i6 + 123;
                        component2 = i8 % 128;
                        int i9 = i8 % 2;
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.ShareDataUIState = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.ShareDataUIState, continuation);
                int i2 = copydefault + 9;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 67;
                copydefault = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    copydefault(coroutineScope2, continuation2);
                    throw null;
                }
                Object objCopydefault = copydefault(coroutineScope2, continuation2);
                int i3 = component2 + 21;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 51;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r1
  0x003b: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.ArtificialStackFrames
                int r1 = r1 + 97
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.getSponsorBeneficiariesState = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r7.ShareDataUIState
                r4 = 68
                int r4 = r4 / 0
                if (r3 == 0) goto L3b
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r7.ShareDataUIState
                if (r3 == 0) goto L3b
            L24:
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.getSponsorBeneficiariesState
                int r1 = r1 + 77
                int r4 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.ArtificialStackFrames = r4
                int r1 = r1 % r0
                if (r3 != r2) goto L33
                kotlin.ResultKt.throwOnFailure(r8)
                goto L69
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L3b:
                kotlin.ResultKt.throwOnFailure(r8)
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.this
                androidx.lifecycle.LifecycleOwner r8 = (androidx.lifecycle.LifecycleOwner) r8
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$component3$1 r4 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$component3$1
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.this
                r6 = 0
                r4.<init>(r5, r6)
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                r5 = r7
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r7.ShareDataUIState = r2
                java.lang.Object r8 = androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r8, r3, r4, r5)
                if (r8 != r1) goto L69
                int r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.getSponsorBeneficiariesState
                int r8 = r8 + 61
                int r2 = r8 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.ArtificialStackFrames = r2
                int r8 = r8 % r0
                if (r8 != 0) goto L65
                return r1
            L65:
                r6.hashCode()
                throw r6
            L69:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void b(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            getSmallIconId getsmalliconid = new getSmallIconId();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(getAsAtTimestamp)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                long j2 = 0;
                if (objCopydefault == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(998 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 61686), 1874745193, false, $$g(b3, b4, (byte) (b4 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 != 0) {
                    int i8 = $11 + 51;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr = component4;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = $11 + 15;
                            $10 = i11 % 128;
                            int i12 = i11 % i5;
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 5);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 2983, 48 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Process.getGidForName("") + 54463), -1178636483, false, $$g(b5, b6, (byte) (b6 - 5)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i10++;
                            i5 = 2;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = component4;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(getRequestBeneficiariesState)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 2);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0', 0) + 32, (char) (61685 - ExpandableListView.getPackedPositionGroup(0L)), 1874745193, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) getAsAtTimestamp) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } else {
                        j = 7083766810336261929L;
                        iIntValue = (short) (((short) (((long) toString[i2 + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) getAsAtTimestamp) ^ 7083766810336261929L)));
                    }
                } else {
                    j = 7083766810336261929L;
                }
                if (iIntValue > 0) {
                    getsmalliconid.copydefault = ((i2 + iIntValue) - 2) + ((int) (((long) getRequestBeneficiariesState) ^ j)) + i7;
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copy), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 1698, Color.blue(0) + 37, (char) ((-1) - TextUtils.lastIndexOf("", '0')), -1454191902, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = component4;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i13 = 0;
                        while (i13 < length2) {
                            int i14 = $10 + 13;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                bArr5[i13] = (byte) (((long) bArr4[i13]) % 7083766810336261929L);
                            } else {
                                bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7083766810336261929L);
                                i13++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        int i15 = $10;
                        int i16 = i15 + 65;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        if (z) {
                            int i18 = i15 + 77;
                            $11 = i18 % 128;
                            if (i18 % 2 == 0) {
                                byte[] bArr6 = component4;
                                getsmalliconid.copydefault = getsmalliconid.copydefault;
                                i4 = getsmalliconid.component3 - (((byte) (((byte) (((long) bArr6[r7]) / 7083766810336261929L)) / s)) ^ b2);
                            } else {
                                byte[] bArr7 = component4;
                                getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                i4 = getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r7]) ^ 7083766810336261929L)) + s)) ^ b2);
                            }
                            getsmalliconid.component1 = (char) i4;
                        } else {
                            short[] sArr = toString;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SendToMobileActivity.this.new component3(continuation);
            int i2 = getSponsorBeneficiariesState + 35;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ArtificialStackFrames + 125;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ArtificialStackFrames + 97;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getSponsorBeneficiariesState + 27;
            ArtificialStackFrames = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x0a5e, code lost:
        
            r14.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0a63, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0a69, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0b13 A[Catch: IOException -> 0x0e63, Exception -> 0x0ea9, all -> 0x0f4b, TryCatch #7 {Exception -> 0x0ea9, blocks: (B:120:0x0b05, B:122:0x0b13, B:123:0x0b57, B:125:0x0b6d, B:126:0x0bb1), top: B:324:0x0b05 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0b6d A[Catch: IOException -> 0x0e63, Exception -> 0x0ea9, all -> 0x0f4b, TryCatch #7 {Exception -> 0x0ea9, blocks: (B:120:0x0b05, B:122:0x0b13, B:123:0x0b57, B:125:0x0b6d, B:126:0x0bb1), top: B:324:0x0b05 }] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0be1 A[Catch: IOException -> 0x0e63, all -> 0x0f4b, TryCatch #30 {all -> 0x0f4b, blocks: (B:119:0x0b02, B:120:0x0b05, B:122:0x0b13, B:123:0x0b57, B:125:0x0b6d, B:126:0x0bb1, B:128:0x0bc3, B:130:0x0be1, B:132:0x0c2e, B:134:0x0cd4, B:136:0x0d1b, B:138:0x0e29, B:140:0x0e33, B:216:0x0f2c, B:217:0x0f4a, B:176:0x0e9e, B:177:0x0ea1, B:182:0x0eae, B:184:0x0eba, B:185:0x0ebb, B:197:0x0edc, B:199:0x0ee3, B:200:0x0ee4, B:202:0x0ee6, B:204:0x0ef7, B:205:0x0ef8, B:207:0x0efa, B:209:0x0f0b, B:210:0x0f0c), top: B:349:0x0b02 }] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0e53  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0ee3 A[Catch: Exception -> 0x0f2c, all -> 0x0f4b, IOException -> 0x0f5c, TryCatch #1 {Exception -> 0x0f2c, blocks: (B:177:0x0ea1, B:182:0x0eae, B:184:0x0eba, B:185:0x0ebb, B:197:0x0edc, B:199:0x0ee3, B:200:0x0ee4, B:202:0x0ee6, B:204:0x0ef7, B:205:0x0ef8, B:207:0x0efa, B:209:0x0f0b, B:210:0x0f0c), top: B:316:0x0783 }] */
        /* JADX WARN: Removed duplicated region for block: B:200:0x0ee4 A[Catch: Exception -> 0x0f2c, all -> 0x0f4b, IOException -> 0x0f5c, TryCatch #1 {Exception -> 0x0f2c, blocks: (B:177:0x0ea1, B:182:0x0eae, B:184:0x0eba, B:185:0x0ebb, B:197:0x0edc, B:199:0x0ee3, B:200:0x0ee4, B:202:0x0ee6, B:204:0x0ef7, B:205:0x0ef8, B:207:0x0efa, B:209:0x0f0b, B:210:0x0f0c), top: B:316:0x0783 }] */
        /* JADX WARN: Removed duplicated region for block: B:262:0x1534 A[PHI: r3
  0x1534: PHI (r3v43 java.lang.String[]) = (r3v41 java.lang.String[]), (r3v41 java.lang.String[]), (r3v47 java.lang.String[]) binds: [B:237:0x1121, B:239:0x11fd, B:381:0x1534] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x05d8  */
        /* JADX WARN: Type inference failed for: r11v99, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v126, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r25v14 */
        /* JADX WARN: Type inference failed for: r25v15 */
        /* JADX WARN: Type inference failed for: r25v16 */
        /* JADX WARN: Type inference failed for: r25v17 */
        /* JADX WARN: Type inference failed for: r25v18 */
        /* JADX WARN: Type inference failed for: r25v19 */
        /* JADX WARN: Type inference failed for: r25v20 */
        /* JADX WARN: Type inference failed for: r25v27 */
        /* JADX WARN: Type inference failed for: r25v28 */
        /* JADX WARN: Type inference failed for: r25v37 */
        /* JADX WARN: Type inference failed for: r34v5 */
        /* JADX WARN: Type inference failed for: r34v6 */
        /* JADX WARN: Type inference failed for: r34v7 */
        /* JADX WARN: Type inference failed for: r3v108 */
        /* JADX WARN: Type inference failed for: r3v109 */
        /* JADX WARN: Type inference failed for: r3v313 */
        /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r9v155 */
        /* JADX WARN: Type inference failed for: r9v156 */
        /* JADX WARN: Type inference failed for: r9v169, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] component2(android.content.Context r43, int r44, int r45, int r46) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 7702
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.component3.component2(android.content.Context, int, int, int):java.lang.Object[]");
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3 << 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(getRequestBeneficiariesState)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 844, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32, (char) (23251 - ExpandableListView.getPackedPositionType(0L)), 592652048, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.indexOf("", "", 0), Process.getGidForName("") + 33, (char) (23251 - View.MeasureSpec.getMode(0)), 592652048, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((-16776751) - Color.rgb(0, 0, 0), 49 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i7 = $10 + 37;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i5 = 684241640;
        int i6 = 5;
        int i7 = 1;
        int i8 = 0;
        if (iArr2 != null) {
            int i9 = $10 + 77;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 13;
                $11 = i12 % 128;
                if (i12 % i3 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i8] = Integer.valueOf(iArr2[i11]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 - 5);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 4391, 37 - ((Process.getThreadPriority(i8) + 20) >> 6), (char) (ViewConfiguration.getScrollBarSize() >> 8), -309236339, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i11] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i3 = 2;
                        i11 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i11])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 5;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4391, Color.rgb(0, 0, 0) + 16777253, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), -309236339, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr3[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i11++;
                        i3 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i5 = 684241640;
                i6 = 5;
                i8 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component1;
        int i13 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $10 + 61;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    Object[] objArr4 = new Object[i7];
                    objArr4[0] = Integer.valueOf(iArr5[i14]);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 5;
                        byte b7 = (byte) (b6 - 5);
                        i2 = length3;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 4392, 37 - (ViewConfiguration.getScrollDefaultDelay() >> i13), (char) TextUtils.getCapsMode("", 0, 0), -309236339, false, $$r(b6, b7, b7), new Class[]{Integer.TYPE});
                    } else {
                        i2 = length3;
                    }
                    iArr6[i14] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i14--;
                } else {
                    i2 = length3;
                    Object[] objArr5 = {Integer.valueOf(iArr5[i14])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 5;
                        byte b9 = (byte) (b8 - 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.indexOf((CharSequence) "", '0', 0), 37 - View.resolveSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -309236339, false, $$r(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    iArr6[i14] = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    i14++;
                }
                length3 = i2;
                i13 = 16;
                i7 = 1;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $10 + 61;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    getactivenotifications.ShareDataUIState ^= iArr4[i16];
                    Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault5 == null) {
                        byte b10 = (byte) 0;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getLongPressTimeout() >> 16), 16 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49871), 462826032, false, $$r((byte) 7, b10, b10), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i16 += 99;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr4[i16];
                    Object[] objArr7 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault6 == null) {
                        byte b11 = (byte) 0;
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2969 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (49871 - TextUtils.indexOf("", "")), 462826032, false, $$r((byte) 7, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault6).invoke(null, objArr7)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i16++;
                }
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr8 = {getactivenotifications, getactivenotifications};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault7 == null) {
                int iResolveOpacity = 2944 - Drawable.resolveOpacity(0, 0);
                int iRed = 24 - Color.red(0);
                char c3 = (char) (27638 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                byte length4 = (byte) $$l.length;
                byte b12 = (byte) (length4 - 4);
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, iRed, c3, -1616366948, false, $$r(length4, b12, b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
            c2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i22 = $10 + 105;
        $11 = i22 % 128;
        if (i22 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountryFetchingState$1", f = "SendToMobileActivity.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountryFetchingState$1$1", f = "SendToMobileActivity.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final SendToMobileActivity component2;
            int component3;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchState;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeCountryFetchingState$1$1$1", f = "SendToMobileActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<CountryFetchState, Continuation<? super Unit>, Object> {
                private static int component2 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                Object component1;
                final SendToMobileActivity component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = copydefault + 73;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = component2 + 15;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                    CountryFetchState countryFetchState = (CountryFetchState) this.component1;
                    if (!countryFetchState.isLoading() && countryFetchState.isError()) {
                        SendToMobileActivity.access$getSendToMobileViewModel(this.component3).showError();
                    }
                    Unit unit = Unit.INSTANCE;
                    int i6 = component2 + 101;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 23 / 0;
                    }
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component3 = sendToMobileActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component3, continuation);
                    anonymousClass5.component1 = obj;
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = copydefault + 75;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass52;
                }

                public final Object copydefault(CountryFetchState countryFetchState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 65;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(countryFetchState, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
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
                    int i2 = copydefault + 1;
                    component2 = i2 % 128;
                    CountryFetchState countryFetchState2 = countryFetchState;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        copydefault(countryFetchState2, continuation2);
                        throw null;
                    }
                    Object objCopydefault = copydefault(countryFetchState2, continuation2);
                    int i3 = copydefault + 15;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    return objCopydefault;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component3;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 23;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component3 = 1;
                    if (FlowKt.collectLatest(SendToMobileActivity.access$getMpesaGlobalCountriesViewModel(this.component2).getCountryFetchState(), new AnonymousClass5(this.component2, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i5 = copydefault + 47;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component2 = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component2, continuation);
                int i2 = ShareDataUIState + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 75;
                copydefault = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return ShareDataUIState(coroutineScope2, continuation2);
                }
                Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
                int i3 = 4 / 0;
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 111;
                copydefault = i2 % 128;
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
            int i2 = component1 + 125;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component3;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileActivity.this, Lifecycle.State.STARTED, new AnonymousClass4(SendToMobileActivity.this, null), this) == coroutine_suspended) {
                    int i5 = component2 + 95;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = SendToMobileActivity.this.new component1(continuation);
            int i2 = component2 + 109;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return component1Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = component1 + 61;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objCopydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 57;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationForwardNavigation$1", f = "SendToMobileActivity.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationForwardNavigation$1$1", f = "SendToMobileActivity.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 0;
            private static int component3 = 1;
            final SendToMobileActivity component2;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 63;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.copydefault;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateForwardUiEvent = SendToMobileActivity.access$getConfirmTransactionViewModel(this.component2).getNavigateForwardUiEvent();
                    final SendToMobileActivity sendToMobileActivity = this.component2;
                    this.copydefault = 1;
                    if (navigateForwardUiEvent.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int component1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            Object objComponent2;
                            int i5 = 2 % 2;
                            int i6 = component1 + 87;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i7 == 0) {
                                objComponent2 = component2(zBooleanValue, continuation);
                                int i8 = 22 / 0;
                            } else {
                                objComponent2 = component2(zBooleanValue, continuation);
                            }
                            int i9 = component1 + 49;
                            ShareDataUIState = i9 % 128;
                            int i10 = i9 % 2;
                            return objComponent2;
                        }

                        public final Object component2(boolean z, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            int i6 = component1 + 5;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            if (z) {
                                SendToMobileActivity.access$getSendToMobileViewModel(sendToMobileActivity).onConfirmContinue(sendToMobileActivity);
                            }
                            Unit unit = Unit.INSTANCE;
                            int i8 = component1 + 75;
                            ShareDataUIState = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = component1 + 1;
                        int i6 = i5 % 128;
                        component3 = i6;
                        int i7 = i5 % 2;
                        int i8 = i6 + 23;
                        component1 = i8 % 128;
                        if (i8 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
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
            AnonymousClass3(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component2 = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component2, continuation);
                int i2 = component1 + 31;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 15;
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
                int i2 = component1 + 9;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 13;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 31 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = component3 + 3;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SendToMobileActivity.this, null), this) == coroutine_suspended) {
                    int i6 = component3 + 35;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
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
            component2 component2Var = SendToMobileActivity.this.new component2(continuation);
            int i2 = ShareDataUIState + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = ShareDataUIState + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                component2Var.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(unit);
            int i4 = ShareDataUIState + 69;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationBackNavigation$1", f = "SendToMobileActivity.kt", i = {}, l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationBackNavigation$1$1", f = "SendToMobileActivity.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 1;
            private static int component2;
            final SendToMobileActivity ShareDataUIState;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 101;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.copydefault;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Boolean> navigateBackUiEvent = SendToMobileActivity.access$getConfirmTransactionViewModel(this.ShareDataUIState).getNavigateBackUiEvent();
                    final SendToMobileActivity sendToMobileActivity = this.ShareDataUIState;
                    this.copydefault = 1;
                    if (navigateBackUiEvent.collect(new FlowCollector() {
                        private static int component1 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = copydefault + 13;
                            component1 = i5 % 128;
                            int i6 = i5 % 2;
                            Object objComponent1 = component1(((Boolean) obj2).booleanValue(), continuation);
                            int i7 = component1 + 57;
                            copydefault = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 12 / 0;
                            }
                            return objComponent1;
                        }

                        public final Object component1(boolean z, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = component1;
                            int i6 = i5 + 81;
                            copydefault = i6 % 128;
                            int i7 = i6 % 2;
                            if (z) {
                                int i8 = i5 + 89;
                                copydefault = i8 % 128;
                                int i9 = i8 % 2;
                                SendToMobileActivity.access$getSendToMobileViewModel(sendToMobileActivity).previousScreen();
                            }
                            Unit unit = Unit.INSTANCE;
                            int i10 = copydefault + 1;
                            component1 = i10 % 128;
                            int i11 = i10 % 2;
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = component1 + 45;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 4 % 3;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.ShareDataUIState = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.ShareDataUIState, continuation);
                int i2 = component2 + 105;
                component1 = i2 % 128;
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
                int i2 = component2 + 105;
                component1 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return copydefault(coroutineScope2, continuation2);
                }
                copydefault(coroutineScope2, continuation2);
                throw null;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 63;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return anonymousClass4.invokeSuspend(unit);
                }
                anonymousClass4.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            if (i4 != 0) {
                int i5 = component3;
                int i6 = i5 + 33;
                copydefault = i6 % 128;
                if (i6 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i5 + 39;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.throwOnFailure(obj);
                int i9 = component3 + 113;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileActivity.this, Lifecycle.State.STARTED, new AnonymousClass4(SendToMobileActivity.this, null), this) == coroutine_suspended) {
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
            copydefault copydefaultVar = SendToMobileActivity.this.new copydefault(continuation);
            int i2 = copydefault + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = copydefault + 29;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 21;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationData$1", f = "SendToMobileActivity.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationData$1$1", f = "SendToMobileActivity.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component3 = 0;
            private static int copydefault = 1;
            final SendToMobileActivity component1;
            int component2;

            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeConfirmationData$1$1$1", f = "SendToMobileActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C02423 extends SuspendLambda implements Function2<List<? extends ConfirmInfoItem>, Continuation<? super Unit>, Object> {
                private static int component1 = 1;
                private static int copydefault;
                int ShareDataUIState;
                Object component2;
                final SendToMobileActivity component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component1 + 37;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = component1 + 65;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                    List<? extends ConfirmInfoItem> list = (List) this.component2;
                    if (i5 != 0) {
                        SendToMobileActivity.access$getConfirmTransactionViewModel(this.component3).setConfirmTransactionDetailsInfo(list, this.component3);
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    SendToMobileActivity.access$getConfirmTransactionViewModel(this.component3).setConfirmTransactionDetailsInfo(list, this.component3);
                    Unit unit2 = Unit.INSTANCE;
                    int i6 = component1 + 47;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    return unit2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02423(SendToMobileActivity sendToMobileActivity, Continuation<? super C02423> continuation) {
                    super(2, continuation);
                    this.component3 = sendToMobileActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02423 c02423 = new C02423(this.component3, continuation);
                    c02423.component2 = obj;
                    C02423 c024232 = c02423;
                    int i2 = component1 + 45;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 94 / 0;
                    }
                    return c024232;
                }

                @Override
                public Object invoke(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 17;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent3 = component3(list, continuation);
                    int i4 = copydefault + 41;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 51 / 0;
                    }
                    return objComponent3;
                }

                public final Object component3(List<? extends ConfirmInfoItem> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 69;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((C02423) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = copydefault + 67;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 46 / 0;
                    }
                    return objInvokeSuspend;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r1
  0x003b: PHI (r1v11 java.lang.Object) = (r1v4 java.lang.Object), (r1v12 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.copydefault
                    int r1 = r1 + 21
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.component3 = r2
                    int r1 = r1 % r0
                    r2 = 1
                    if (r1 == 0) goto L1c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r6.component2
                    r4 = 94
                    int r4 = r4 / 0
                    if (r3 == 0) goto L3b
                    goto L24
                L1c:
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r6.component2
                    if (r3 == 0) goto L3b
                L24:
                    if (r3 != r2) goto L33
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.copydefault
                    int r1 = r1 + 75
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.component3 = r2
                    int r1 = r1 % r0
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L6f
                L33:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L3b:
                    kotlin.ResultKt.throwOnFailure(r7)
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity r7 = r6.component1
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel r7 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.access$getSendToMobileViewModel(r7)
                    kotlinx.coroutines.flow.StateFlow r7 = r7.getConfirmationData()
                    kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$ShareDataUIState$3$3 r3 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$ShareDataUIState$3$3
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity r4 = r6.component1
                    r5 = 0
                    r3.<init>(r4, r5)
                    kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                    r4 = r6
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    r6.component2 = r2
                    java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r3, r4)
                    if (r7 != r1) goto L6f
                    int r7 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.component3
                    int r7 = r7 + 73
                    int r2 = r7 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.copydefault = r2
                    int r7 = r7 % r0
                    if (r7 == 0) goto L6b
                    return r1
                L6b:
                    r5.hashCode()
                    throw r5
                L6f:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.component3
                    int r1 = r1 + 125
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.copydefault = r2
                    int r1 = r1 % r0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.ShareDataUIState.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component1 = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, continuation);
                int i2 = copydefault + 49;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 91;
                component3 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    return component3(coroutineScope2, continuation2);
                }
                component3(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 3;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 53;
                copydefault = i4 % 128;
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
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = component2 + 87;
                component3 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SendToMobileActivity.this, null), this) == coroutine_suspended) {
                    int i4 = component3 + 3;
                    component2 = i4 % 128;
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
            ShareDataUIState shareDataUIState = SendToMobileActivity.this.new ShareDataUIState(continuation);
            int i2 = component2 + 13;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return shareDataUIState;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component2 + 59;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeGetFeeLoading$1", f = "SendToMobileActivity.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
    static final class getAsAtTimestamp extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeGetFeeLoading$1$1", f = "SendToMobileActivity.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            int component1;
            final SendToMobileActivity component2;

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity$observeGetFeeLoading$1$1$1", f = "SendToMobileActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int copydefault = 1;
                boolean ShareDataUIState;
                final SendToMobileActivity component2;
                int component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = copydefault + 67;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SendToMobileActivity.access$getConfirmTransactionViewModel(this.component2).updateIsLoading(this.ShareDataUIState);
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 15;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component2 = sendToMobileActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component2, continuation);
                    anonymousClass2.ShareDataUIState = ((Boolean) obj).booleanValue();
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = component1 + 71;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass22;
                }

                @Override
                public Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 35;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(bool.booleanValue(), continuation);
                    int i4 = component1 + 65;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objCopydefault;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 115;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Continuation<Unit> continuationCreate = create(Boolean.valueOf(z), continuation);
                    if (i3 == 0) {
                        return ((AnonymousClass2) continuationCreate).invokeSuspend(Unit.INSTANCE);
                    }
                    int i4 = 88 / 0;
                    return ((AnonymousClass2) continuationCreate).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component1;
                if (i2 != 0) {
                    int i3 = copydefault + 61;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component1 = 1;
                    if (FlowKt.collectLatest(SendToMobileActivity.access$getSendToMobileViewModel(this.component2).getConfirmationLoading(), new AnonymousClass2(this.component2, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 91;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SendToMobileActivity sendToMobileActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component2 = sendToMobileActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                int i2 = ShareDataUIState + 9;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 17;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = copydefault + 61;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(coroutineScope, continuation);
                if (i3 == 0) {
                    objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                    int i4 = 57 / 0;
                } else {
                    objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = ShareDataUIState + 107;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
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
            int i2 = copydefault + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = copydefault + 55;
                int i6 = i5 % 128;
                component3 = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 45;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(SendToMobileActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = copydefault + 81;
            component3 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 23 / 0;
            }
            return unit;
        }

        getAsAtTimestamp(Continuation<? super getAsAtTimestamp> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getAsAtTimestamp getasattimestamp = SendToMobileActivity.this.new getAsAtTimestamp(continuation);
            int i2 = component3 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return getasattimestamp;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component3 + 35;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent1;
            }
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            getAsAtTimestamp getasattimestamp = (getAsAtTimestamp) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return getasattimestamp.invokeSuspend(unit);
            }
            getasattimestamp.invokeSuspend(unit);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x1405  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x2018  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x2019  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0117  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void handleBackPress() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            getSendToMobileViewModel().previousScreen();
            throw null;
        }
        getSendToMobileViewModel().previousScreen();
        int i3 = getAsAtTimestamp + 1;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.onPause():void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = ((Field) onBackCancelled.ShareDataUIState[0]).getInt(null);
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = 550636386 + ((i3 | 445420596) * (-859));
        int i5 = ~i3;
        if (i2 != i4 + (((~(i3 | (-167772193))) | (~(445420596 | i5))) * 859) + (((~((-1331841828) | i5)) | 1164069635) * 859)) {
            int i6 = component4 + 53;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i8 = getAsAtTimestamp + 27;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr = new Object[1];
            f(26 - View.MeasureSpec.getSize(0), new char[]{22840, 47269, 45346, 51864, 14175, 14357, 58974, 8703, 64317, 2854, 40873, 44600, 42679, 20012, 'o', 54811, 12025, 62445, 45878, 61897, 40956, 61259, 29007, 57895, 47701, 1395}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 84, new char[]{44210, 41559, 34666, 15920, 21656, 13657, 4374, 12788, 49179, 61512, 37103, 10762, 9556, 21846, 'o', 54811, 12961, 53679}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i10 = getAsAtTimestamp + 19;
                component4 = i10 % 128;
                int i11 = i10 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6618, TextUtils.lastIndexOf("", '0') + 43, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 56 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) View.combineMeasuredStates(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
        getSendToMobileViewModel().onResume();
    }

    private final void observeScreenChange() {
        int i = 2 % 2;
        getSendToMobileViewModel().getScreenTransition().observe(this, new equals(new getRequestBeneficiariesState(this)));
        int i2 = component4 + 117;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeCountrySelection() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copy(null), 3, null);
        int i2 = getAsAtTimestamp + 49;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void changeScreen(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        MPesaGlobalErrorFragment mPesaGlobalErrorFragment;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            MPesaGlobalScreen screen = screenInformation.getScreen();
            if (Intrinsics.areEqual(screen, MPesaGlobalScreen.CountrySelection.INSTANCE)) {
                mPesaGlobalErrorFragment = MPesaGlobalCountryPickerFragment.INSTANCE.create(CountryListType.SEND_TO_MOBILE);
            } else if (Intrinsics.areEqual(screen, MPesaGlobalScreen.RecipientDetails.INSTANCE)) {
                mPesaGlobalErrorFragment = new SendToMobileDetailsFragment();
            } else {
                if (Intrinsics.areEqual(screen, MPesaGlobalScreen.ContactSelection.INSTANCE)) {
                    onSelectContact();
                    return;
                }
                if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Confirmation.INSTANCE)) {
                    setConfirmationData();
                    mPesaGlobalErrorFragment = new ConfirmTransactionFragment();
                } else if (!Intrinsics.areEqual(screen, MPesaGlobalScreen.TransactionSuccess.INSTANCE)) {
                    if (!(screen instanceof MPesaGlobalScreen.TransactionError)) {
                        if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Dashboard.INSTANCE)) {
                            MpesaGlobalActivity.INSTANCE.showDashboard(this);
                            finish();
                            return;
                        } else {
                            if (Intrinsics.areEqual(screen, MPesaGlobalScreen.Close.INSTANCE)) {
                                finish();
                                return;
                            }
                            return;
                        }
                    }
                    mPesaGlobalErrorFragment = new MPesaGlobalErrorFragment();
                } else {
                    int i3 = getAsAtTimestamp + 73;
                    component4 = i3 % 128;
                    int i4 = i3 % 2;
                    showStkPush();
                    return;
                }
            }
            Fragment fragment = mPesaGlobalErrorFragment;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            ScreenDirection direction = screenInformation.getDirection();
            String simpleName = fragment.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            FragmentExtensionsKt.showFragment$default(supportFragmentManager, direction, simpleName, fragment, false, R.id.container, null, 32, null);
            return;
        }
        Intrinsics.areEqual(screenInformation.getScreen(), MPesaGlobalScreen.CountrySelection.INSTANCE);
        throw null;
    }

    private final void observeCountryFetchingState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component1(null), 3, null);
        int i2 = component4 + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void setConfirmationData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
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
        int i4 = component4 + 5;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    private final void showStkPush() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            startActivity(StkPushActivity.INSTANCE.newInstance(this));
            finish();
        } else {
            startActivity(StkPushActivity.INSTANCE.newInstance(this));
            finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onSelectContact() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            RouteUtils.routeWithExecute(this, RoutePathConstant.SELECT_CONTACT, null, this.contactsLauncher);
            int i3 = 91 / 0;
        } else {
            RouteUtils.routeWithExecute(this, RoutePathConstant.SELECT_CONTACT, null, this.contactsLauncher);
        }
    }

    private final void observeConfirmationForwardNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component2(null), 3, null);
        int i2 = component4 + 51;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void observeConfirmationBackNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copydefault(null), 3, null);
        int i2 = component4 + 47;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void observeCountriesBackNavigation() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = component4 + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observeConfirmationData() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = getAsAtTimestamp + 47;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void observeGetFeeLoading() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new getAsAtTimestamp(null), 3, null);
        int i2 = getAsAtTimestamp + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) onBackStarted.component2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 == 1985949928 + (((~((-1062536645) | i5)) | (-714725780)) * (-865)) + ((~(iIdentityHashCode | 1062536644)) * 865) + (((~((-714725780) | i5)) | (~(i5 | 1062536644))) * 865)) {
            super.onStart();
            int i6 = getAsAtTimestamp + 67;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw new RuntimeException(String.valueOf(-1958566556));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(65:828|50|(1:52)|53|77|(10:833|78|(3:80|849|81)|85|86|808|(5:88|89|(1:91)|92|93)(24:94|95|830|96|97|823|98|(2:813|100)|104|105|811|106|(2:825|108)|112|113|114|(2:784|116)|120|121|122|(1:124)(1:125)|126|(1:128)|129)|130|(4:133|(2:135|900)(11:136|(3:138|(3:141|142|139)|901)|143|796|144|(1:146)|147|148|786|149|899)|150|131)|898)|192|865|193|(1:195)|196|(3:198|(1:200)|201)(14:203|204|858|205|(1:207)|208|209|210|(1:212)|213|(1:215)|216|(1:218)|219)|202|220|(9:223|854|224|(1:226)|227|228|229|845|230)|260|(8:827|261|(1:263)|264|(3:266|(1:268)|269)(19:270|271|819|272|(1:274)|275|276|809|277|(1:279)|280|281|282|(1:284)|285|(1:287)|288|(1:290)|291)|292|(4:295|(3:875|297|878)(12:874|298|(3:300|(4:303|(3:881|305|884)(4:879|306|307|883)|882|301)|880)|308|802|309|(1:311)|312|313|790|314|877)|876|293)|873)|349|(8:806|350|(3:352|841|353)|357|(1:359)|360|361|779)|(4:363|364|(1:366)|367)(45:368|(2:370|(1:376)(1:375))(1:378)|(18:380|794|381|(2:847|383)|387|388|782|389|(2:780|391)|395|396|397|(1:399)|400|(1:402)(1:404)|405|(2:407|408)|409)|456|471|(1:473)|474|(3:476|(1:478)|479)(14:480|481|(1:483)|484|485|(1:487)|488|788|489|490|(1:492)|493|(1:495)|496)|497|(1:499)(9:500|(3:502|(2:505|503)|893)|506|507|(1:509)|510|(1:512)|513|514)|515|(1:517)|518|(1:520)|521|(3:523|(1:525)|526)(16:528|529|(1:531)|532|(1:534)|535|536|(1:538)|539|798|540|541|(1:543)|544|(1:546)|547)|527|548|(1:550)(9:551|(3:553|(2:556|554)|892)|557|558|(1:560)|561|(1:563)|564|565)|566|868|567|(2:870|569)|573|(1:575)|576|577|(4:579|580|(1:582)|583)(27:584|(2:586|(1:592)(1:591))|(22:594|595|851|596|597|856|598|(1:600)|601|602|852|603|(1:605)|606|607|608|(1:610)|611|(1:613)|614|(1:616)|617)(15:662|677|(1:679)|680|(2:682|(3:684|(1:686)|687)(3:688|(1:690)|691))(13:693|821|694|695|(1:697)|698|860|699|700|(1:702)|703|(1:705)|706)|692|707|(6:710|711|(1:713)|714|715|716)|717|(1:719)|720|(3:722|(1:724)|725)(14:727|728|(1:730)|731|732|(1:734)|735|866|736|737|(1:739)|740|(1:742)|743)|726|744|(1:902)(7:747|748|(1:750)|751|752|753|754))|665|666|817|667|670|671|(1:673)|674|675|676|677|(0)|680|(0)(0)|692|707|(0)|717|(0)|720|(0)(0)|726|744|(0)(0))|618|(4:621|(3:887|623|890)(12:886|624|(3:626|(3:629|630|627)|891)|631|843|632|(1:634)|635|636|835|637|889)|888|619)|885|677|(0)|680|(0)(0)|692|707|(0)|717|(0)|720|(0)(0)|726|744|(0)(0))|410|(4:413|(2:415|896)(11:416|(3:418|(3:421|422|419)|897)|423|871|424|(1:426)|427|428|863|429|895)|430|411)|894|456|471|(0)|474|(0)(0)|497|(0)(0)|515|(0)|518|(0)|521|(0)(0)|527|548|(0)(0)|566|868|567|(0)|573|(0)|576|577|(0)(0)|618|(1:619)|885|677|(0)|680|(0)(0)|692|707|(0)|717|(0)|720|(0)(0)|726|744|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x2d16, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x2d17, code lost:
    
        r5 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a79 A[Catch: all -> 0x0363, TryCatch #29 {all -> 0x0363, blocks: (B:186:0x0a73, B:188:0x0a79, B:189:0x0aa5, B:465:0x1b51, B:467:0x1b57, B:468:0x1b81, B:711:0x31c9, B:713:0x31cf, B:714:0x31f5, B:748:0x350e, B:750:0x3514, B:751:0x3535, B:728:0x334d, B:730:0x3370, B:731:0x33c4, B:671:0x2d7c, B:673:0x2d82, B:674:0x2dac, B:558:0x26a5, B:560:0x26ab, B:561:0x26d6, B:563:0x2710, B:564:0x2759, B:529:0x2361, B:531:0x2376, B:532:0x23a7, B:534:0x23db, B:535:0x2457, B:507:0x1fd9, B:509:0x1fdf, B:510:0x200c, B:512:0x2046, B:513:0x2090, B:481:0x1d3a, B:483:0x1d4f, B:484:0x1d7e, B:343:0x1467, B:345:0x146d, B:346:0x149c, B:254:0x0efa, B:256:0x0f00, B:257:0x0f26, B:71:0x04ef, B:73:0x04f5, B:74:0x0520, B:19:0x0133, B:21:0x0139, B:22:0x015f, B:24:0x02d4, B:26:0x0305, B:27:0x035d, B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9, B:34:0x037c, B:36:0x0380, B:57:0x0460, B:59:0x0466, B:60:0x0467, B:62:0x0469, B:64:0x0470, B:65:0x0471, B:40:0x038c, B:193:0x0b2b, B:195:0x0b31, B:196:0x0b74, B:198:0x0b81, B:200:0x0b8a, B:201:0x0bd4, B:220:0x0d86, B:228:0x0deb, B:234:0x0e77, B:236:0x0e7d, B:237:0x0e7e, B:239:0x0e80, B:241:0x0e87, B:242:0x0e88, B:203:0x0be0, B:210:0x0c67, B:212:0x0c6d, B:213:0x0cb3, B:215:0x0cdd, B:216:0x0d23, B:218:0x0d39, B:219:0x0d7e, B:244:0x0e8a, B:246:0x0e91, B:247:0x0e92), top: B:832:0x0133, inners: #26, #45, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0b31 A[Catch: all -> 0x0e93, TryCatch #47 {all -> 0x0e93, blocks: (B:193:0x0b2b, B:195:0x0b31, B:196:0x0b74, B:198:0x0b81, B:200:0x0b8a, B:201:0x0bd4, B:220:0x0d86, B:228:0x0deb, B:234:0x0e77, B:236:0x0e7d, B:237:0x0e7e, B:239:0x0e80, B:241:0x0e87, B:242:0x0e88, B:203:0x0be0, B:210:0x0c67, B:212:0x0c6d, B:213:0x0cb3, B:215:0x0cdd, B:216:0x0d23, B:218:0x0d39, B:219:0x0d7e, B:244:0x0e8a, B:246:0x0e91, B:247:0x0e92, B:230:0x0df1, B:224:0x0db9, B:226:0x0dbf, B:227:0x0de4, B:205:0x0c00, B:207:0x0c12, B:208:0x0c5b), top: B:865:0x0b2b, outer: #29, inners: #36, #41, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b81 A[Catch: all -> 0x0e93, TryCatch #47 {all -> 0x0e93, blocks: (B:193:0x0b2b, B:195:0x0b31, B:196:0x0b74, B:198:0x0b81, B:200:0x0b8a, B:201:0x0bd4, B:220:0x0d86, B:228:0x0deb, B:234:0x0e77, B:236:0x0e7d, B:237:0x0e7e, B:239:0x0e80, B:241:0x0e87, B:242:0x0e88, B:203:0x0be0, B:210:0x0c67, B:212:0x0c6d, B:213:0x0cb3, B:215:0x0cdd, B:216:0x0d23, B:218:0x0d39, B:219:0x0d7e, B:244:0x0e8a, B:246:0x0e91, B:247:0x0e92, B:230:0x0df1, B:224:0x0db9, B:226:0x0dbf, B:227:0x0de4, B:205:0x0c00, B:207:0x0c12, B:208:0x0c5b), top: B:865:0x0b2b, outer: #29, inners: #36, #41, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0be0 A[Catch: all -> 0x0e93, TRY_LEAVE, TryCatch #47 {all -> 0x0e93, blocks: (B:193:0x0b2b, B:195:0x0b31, B:196:0x0b74, B:198:0x0b81, B:200:0x0b8a, B:201:0x0bd4, B:220:0x0d86, B:228:0x0deb, B:234:0x0e77, B:236:0x0e7d, B:237:0x0e7e, B:239:0x0e80, B:241:0x0e87, B:242:0x0e88, B:203:0x0be0, B:210:0x0c67, B:212:0x0c6d, B:213:0x0cb3, B:215:0x0cdd, B:216:0x0d23, B:218:0x0d39, B:219:0x0d7e, B:244:0x0e8a, B:246:0x0e91, B:247:0x0e92, B:230:0x0df1, B:224:0x0db9, B:226:0x0dbf, B:227:0x0de4, B:205:0x0c00, B:207:0x0c12, B:208:0x0c5b), top: B:865:0x0b2b, outer: #29, inners: #36, #41, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0d98  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0faf A[Catch: all -> 0x13da, TryCatch #26 {all -> 0x13da, blocks: (B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9), top: B:827:0x0fa9, outer: #29, inners: #7, #13, #17, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x1002 A[Catch: all -> 0x13da, TryCatch #26 {all -> 0x13da, blocks: (B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9), top: B:827:0x0fa9, outer: #29, inners: #7, #13, #17, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x105f A[Catch: all -> 0x13da, TRY_LEAVE, TryCatch #26 {all -> 0x13da, blocks: (B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9), top: B:827:0x0fa9, outer: #29, inners: #7, #13, #17, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x128c A[Catch: all -> 0x13da, TryCatch #26 {all -> 0x13da, blocks: (B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9), top: B:827:0x0fa9, outer: #29, inners: #7, #13, #17, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1529  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x159c A[Catch: all -> 0x156f, TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x156f, blocks: (B:353:0x152c, B:359:0x159c, B:364:0x1603, B:366:0x1609, B:367:0x164e, B:419:0x199d, B:421:0x19a0, B:370:0x1661, B:372:0x1665, B:399:0x183f, B:402:0x18b5, B:408:0x191c, B:376:0x1671), top: B:841:0x152c }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x15f6  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x165d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1975 A[Catch: all -> 0x1ac4, TryCatch #15 {all -> 0x1ac4, blocks: (B:350:0x1523, B:357:0x1575, B:360:0x15e2, B:410:0x196b, B:411:0x196f, B:413:0x1975, B:416:0x1991, B:380:0x1679, B:397:0x1839, B:400:0x188b, B:405:0x1904, B:409:0x1965), top: B:806:0x1523 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1b57 A[Catch: all -> 0x0363, TryCatch #29 {all -> 0x0363, blocks: (B:186:0x0a73, B:188:0x0a79, B:189:0x0aa5, B:465:0x1b51, B:467:0x1b57, B:468:0x1b81, B:711:0x31c9, B:713:0x31cf, B:714:0x31f5, B:748:0x350e, B:750:0x3514, B:751:0x3535, B:728:0x334d, B:730:0x3370, B:731:0x33c4, B:671:0x2d7c, B:673:0x2d82, B:674:0x2dac, B:558:0x26a5, B:560:0x26ab, B:561:0x26d6, B:563:0x2710, B:564:0x2759, B:529:0x2361, B:531:0x2376, B:532:0x23a7, B:534:0x23db, B:535:0x2457, B:507:0x1fd9, B:509:0x1fdf, B:510:0x200c, B:512:0x2046, B:513:0x2090, B:481:0x1d3a, B:483:0x1d4f, B:484:0x1d7e, B:343:0x1467, B:345:0x146d, B:346:0x149c, B:254:0x0efa, B:256:0x0f00, B:257:0x0f26, B:71:0x04ef, B:73:0x04f5, B:74:0x0520, B:19:0x0133, B:21:0x0139, B:22:0x015f, B:24:0x02d4, B:26:0x0305, B:27:0x035d, B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9, B:34:0x037c, B:36:0x0380, B:57:0x0460, B:59:0x0466, B:60:0x0467, B:62:0x0469, B:64:0x0470, B:65:0x0471, B:40:0x038c, B:193:0x0b2b, B:195:0x0b31, B:196:0x0b74, B:198:0x0b81, B:200:0x0b8a, B:201:0x0bd4, B:220:0x0d86, B:228:0x0deb, B:234:0x0e77, B:236:0x0e7d, B:237:0x0e7e, B:239:0x0e80, B:241:0x0e87, B:242:0x0e88, B:203:0x0be0, B:210:0x0c67, B:212:0x0c6d, B:213:0x0cb3, B:215:0x0cdd, B:216:0x0d23, B:218:0x0d39, B:219:0x0d7e, B:244:0x0e8a, B:246:0x0e91, B:247:0x0e92), top: B:832:0x0133, inners: #26, #45, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1c0e  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1c57  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x1d18  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x1eb0  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1f99  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x21b4  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x221e  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x2277  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x2343  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x258f  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x2663  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x28c7 A[Catch: all -> 0x289a, TRY_ENTER, TRY_LEAVE, TryCatch #50 {all -> 0x289a, blocks: (B:569:0x2854, B:575:0x28c7, B:580:0x2927, B:582:0x292d, B:583:0x296f, B:586:0x2980, B:588:0x2984, B:592:0x2990), top: B:870:0x2854 }] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x2924  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x297c  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x2bd9 A[Catch: all -> 0x2cfc, TryCatch #39 {all -> 0x2cfc, blocks: (B:618:0x2bcf, B:619:0x2bd3, B:621:0x2bd9, B:624:0x2bf1, B:627:0x2bfe, B:629:0x2c01, B:641:0x2cea, B:643:0x2cf0, B:644:0x2cf1, B:646:0x2cf3, B:648:0x2cfa, B:649:0x2cfb, B:596:0x29a4, B:608:0x2aa8, B:610:0x2aae, B:611:0x2af4, B:613:0x2b1e, B:614:0x2b6a, B:616:0x2b80, B:617:0x2bc9, B:653:0x2cff, B:655:0x2d06, B:656:0x2d07, B:658:0x2d09, B:660:0x2d10, B:661:0x2d11, B:637:0x2c6b, B:632:0x2c2d, B:634:0x2c33, B:635:0x2c63, B:603:0x2a08, B:605:0x2a27, B:606:0x2a9c, B:598:0x29b8, B:600:0x29cd, B:601:0x2a01), top: B:851:0x29a4, inners: #31, #35, #40, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x2d82 A[Catch: all -> 0x0363, TryCatch #29 {all -> 0x0363, blocks: (B:186:0x0a73, B:188:0x0a79, B:189:0x0aa5, B:465:0x1b51, B:467:0x1b57, B:468:0x1b81, B:711:0x31c9, B:713:0x31cf, B:714:0x31f5, B:748:0x350e, B:750:0x3514, B:751:0x3535, B:728:0x334d, B:730:0x3370, B:731:0x33c4, B:671:0x2d7c, B:673:0x2d82, B:674:0x2dac, B:558:0x26a5, B:560:0x26ab, B:561:0x26d6, B:563:0x2710, B:564:0x2759, B:529:0x2361, B:531:0x2376, B:532:0x23a7, B:534:0x23db, B:535:0x2457, B:507:0x1fd9, B:509:0x1fdf, B:510:0x200c, B:512:0x2046, B:513:0x2090, B:481:0x1d3a, B:483:0x1d4f, B:484:0x1d7e, B:343:0x1467, B:345:0x146d, B:346:0x149c, B:254:0x0efa, B:256:0x0f00, B:257:0x0f26, B:71:0x04ef, B:73:0x04f5, B:74:0x0520, B:19:0x0133, B:21:0x0139, B:22:0x015f, B:24:0x02d4, B:26:0x0305, B:27:0x035d, B:261:0x0fa9, B:263:0x0faf, B:264:0x0ff5, B:266:0x1002, B:268:0x100b, B:269:0x1054, B:292:0x1282, B:293:0x1286, B:295:0x128c, B:298:0x12a3, B:301:0x12b0, B:305:0x12bf, B:306:0x12c7, B:318:0x13b4, B:320:0x13ba, B:321:0x13bb, B:323:0x13bd, B:325:0x13c4, B:326:0x13c5, B:270:0x105f, B:282:0x116c, B:284:0x1172, B:285:0x11b7, B:287:0x11e1, B:288:0x1223, B:290:0x1239, B:291:0x127c, B:328:0x13c7, B:330:0x13ce, B:331:0x13cf, B:333:0x13d1, B:335:0x13d8, B:336:0x13d9, B:314:0x1339, B:309:0x12f5, B:311:0x12fb, B:312:0x1327, B:277:0x10d0, B:279:0x10ec, B:280:0x1160, B:272:0x107f, B:274:0x1094, B:275:0x10c9, B:34:0x037c, B:36:0x0380, B:57:0x0460, B:59:0x0466, B:60:0x0467, B:62:0x0469, B:64:0x0470, B:65:0x0471, B:40:0x038c, B:193:0x0b2b, B:195:0x0b31, B:196:0x0b74, B:198:0x0b81, B:200:0x0b8a, B:201:0x0bd4, B:220:0x0d86, B:228:0x0deb, B:234:0x0e77, B:236:0x0e7d, B:237:0x0e7e, B:239:0x0e80, B:241:0x0e87, B:242:0x0e88, B:203:0x0be0, B:210:0x0c67, B:212:0x0c6d, B:213:0x0cb3, B:215:0x0cdd, B:216:0x0d23, B:218:0x0d39, B:219:0x0d7e, B:244:0x0e8a, B:246:0x0e91, B:247:0x0e92), top: B:832:0x0133, inners: #26, #45, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2e36  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x2e89  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x2f4b  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x31a8  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x3286  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x32da  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x332f  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x34f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x2854 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:902:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r1v721, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v27 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v31 */
    /* JADX WARN: Type inference failed for: r26v32 */
    /* JADX WARN: Type inference failed for: r26v33 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v35 */
    /* JADX WARN: Type inference failed for: r26v36 */
    /* JADX WARN: Type inference failed for: r26v37 */
    /* JADX WARN: Type inference failed for: r26v38 */
    /* JADX WARN: Type inference failed for: r26v39 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v40 */
    /* JADX WARN: Type inference failed for: r26v41 */
    /* JADX WARN: Type inference failed for: r26v42 */
    /* JADX WARN: Type inference failed for: r26v43 */
    /* JADX WARN: Type inference failed for: r26v44 */
    /* JADX WARN: Type inference failed for: r26v45 */
    /* JADX WARN: Type inference failed for: r26v46 */
    /* JADX WARN: Type inference failed for: r26v47 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r5v112 */
    /* JADX WARN: Type inference failed for: r5v113 */
    /* JADX WARN: Type inference failed for: r5v114 */
    /* JADX WARN: Type inference failed for: r5v127 */
    /* JADX WARN: Type inference failed for: r5v129, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v130 */
    /* JADX WARN: Type inference failed for: r5v131 */
    /* JADX WARN: Type inference failed for: r5v132 */
    /* JADX WARN: Type inference failed for: r5v142 */
    /* JADX WARN: Type inference failed for: r5v388 */
    /* JADX WARN: Type inference failed for: r5v389 */
    /* JADX WARN: Type inference failed for: r5v390 */
    /* JADX WARN: Type inference failed for: r5v391 */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v374 */
    /* JADX WARN: Type inference failed for: r6v375 */
    /* JADX WARN: Type inference failed for: r6v378 */
    /* JADX WARN: Type inference failed for: r6v379 */
    /* JADX WARN: Type inference failed for: r6v380 */
    /* JADX WARN: Type inference failed for: r6v381 */
    /* JADX WARN: Type inference failed for: r6v382 */
    /* JADX WARN: Type inference failed for: r6v385, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v386 */
    /* JADX WARN: Type inference failed for: r6v388 */
    /* JADX WARN: Type inference failed for: r6v394 */
    /* JADX WARN: Type inference failed for: r6v413 */
    /* JADX WARN: Type inference failed for: r6v414 */
    /* JADX WARN: Type inference failed for: r6v415 */
    /* JADX WARN: Type inference failed for: r6v416 */
    /* JADX WARN: Type inference failed for: r6v417 */
    /* JADX WARN: Type inference failed for: r6v418 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r7v525, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v85, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m11052$r8$lambda$71fGxN3PLfBoKplkUiceY9MRK4(SendToMobileActivity sendToMobileActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        contactsLauncher$lambda$1(sendToMobileActivity, activityResult);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 77;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        equals = 1;
        component1();
        copydefault();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = copy + 103;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 29;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = 5151948417302554122L;
        int i5 = i2 + 41;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component1 = new int[]{5313003, -1980198052, -1185168589, -610730168, -2067741561, -764508294, 677610382, 886258892, 35805931, 213124248, 1838764513, -726979929, -2119760266, -1739778599, 1438578269, 103242612, -1336145083, 1316898169};
        component3 = (char) 22787;
        copydefault = (char) 53467;
        component2 = (char) 20080;
        getRequestBeneficiariesState = (char) 59730;
    }
}
