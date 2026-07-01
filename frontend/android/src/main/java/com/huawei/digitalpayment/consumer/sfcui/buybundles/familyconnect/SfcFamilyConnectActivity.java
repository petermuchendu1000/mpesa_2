package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityManageServicePinBinding;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBundleData;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenData;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.safaricom.sharedui.compose.fragment.TransactionErrorFragment;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import com.safaricom.sharedui.compose.utils.FragmentExtensionsKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.ComponentActivityExternalSyntheticLambda1;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onStateChanged;
import kotlin.startActivityForResult;
import kotlin.text.StringsKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u0016\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/SfcFamilyConnectActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityManageServicePinBinding;", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "contactsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "pinLauncher", "servicePinLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getConfirmationFragment", "Landroidx/fragment/app/Fragment;", "fsBundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "limit", "", "observeScreenChange", "changeScreen", "screenInformation", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "onSelectContact", "showPinScreen", "pinValidationType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcFamilyConnectActivity extends Hilt_SfcFamilyConnectActivity {
    public static final int $stable = 8;
    private static int[] ShareDataUIState;
    private static long component1;
    private static int copy;
    private static long copydefault;
    private ActivityManageServicePinBinding binding;

    private final Lazy familyConnectViewModel;
    private static final byte[] $$l = {120, 65, 99, 57};
    private static final int $$m = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {118, 33, 67, 92, -17, -3, 58, -56, -16, -2, 2, -4, -6, -4, 46, -62, -16, 4, -18, Ascii.FF, -18, 63, -67, -8, -10, -5, 6, -1, TarHeader.LF_SYMLINK, -35, -40, -10, -5, 6, -1, Ascii.FS, -51, Ascii.FF, -27, 17, -6, -15, 2, 60, -18, -6, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol, -17, -3, -8, -4, -4, 4, -14, -11, 60, -17, -3, -8, -4, -4, 4, -14, -11, 62, -17, -3, 58, -74, 13, -10, 0, -22, 4, 1, -17, -3, 58, -74, 6, 2, -22, 8, -4, -22, 7, TarHeader.LF_FIFO, -58, -17, -3, -8, -4, -9, 9, TarHeader.LF_SYMLINK, -61, 0, -26, 2, -8, 4, -16, 10, -19, SignedBytes.MAX_POWER_OF_TWO, -29, -32, -26, 2, -8, 4, -16, 10, -19, Ascii.ESC, -23, -3, -22, 6, -11, -4, Ascii.RS, -46, 75, -5, -38, -56, -1, 10, -18, -1, 8, -16, 20, -43, 6, -11, 7, -2, -20, 6, 1, Ascii.DC2, -26, -17, 6, -7, -2, 41, -26, 2, -22, 8, Ascii.FS, -34, -24, Ascii.SO, 7, 7, -15, -38, Ascii.SO, -24, 10, -11, 60, -73, 8, -1, -7, -22, 6, -18, Ascii.FF, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -70, -6, 6, -18, Ascii.FF, -24, 0, -8, -6, SignedBytes.MAX_POWER_OF_TWO, -61, -11, -8, -13, 17, -6, -15, 2, TarHeader.LF_SYMLINK, -29, -43, -8, -13, 17, -6, -15, 2, Ascii.FF, -18, -15, 1, 9, -22, -6, -8, 2, 60, PSSSigner.TRAILER_IMPLICIT, -17, -6, -14, Ascii.DLE, -6, -6, 0, -25, 4, -13};
    private static final int $$k = 120;
    private static final byte[] $$d = {89, 120, -98, -110, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 75;
    private static int equals = 1;
    private static int component3 = 0;
    private static int component2 = 1;
    private final ActivityResultLauncher<Intent> contactsLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int copydefault = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SfcFamilyConnectActivity.m11295$r8$lambda$vg_uapsppg1Hasy7IvNO1YEqpg(this.f$0, (ActivityResult) obj);
            int i4 = copydefault + 107;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    });
    private final ActivityResultLauncher<Intent> pinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 31;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                SfcFamilyConnectActivity.$r8$lambda$VCei5PjOAwMhmmF_bOeU3RrThLs(this.f$0, (ActivityResult) obj);
                int i3 = 87 / 0;
            } else {
                SfcFamilyConnectActivity.$r8$lambda$VCei5PjOAwMhmmF_bOeU3RrThLs(this.f$0, (ActivityResult) obj);
            }
            int i4 = component2 + 99;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    });
    private final ActivityResultLauncher<Intent> servicePinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                SfcFamilyConnectActivity.$r8$lambda$QkF5TrERkq999rRJ8RdeeqEALis(this.f$0, (ActivityResult) obj);
                throw null;
            }
            SfcFamilyConnectActivity.$r8$lambda$QkF5TrERkq999rRJ8RdeeqEALis(this.f$0, (ActivityResult) obj);
            int i3 = copydefault + 11;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final Function1 component1;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L3b
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.ShareDataUIState
                int r1 = r1 + 89
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.component2 = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L37
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L3b
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.component2
                int r1 = r1 + 67
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.ShareDataUIState = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L3c
                r1 = 3
                int r1 = r1 % 5
                goto L3c
            L37:
                boolean r5 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                r5 = 0
                throw r5
            L3b:
                r5 = r2
            L3c:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.ShareDataUIState
                int r1 = r1 + 65
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.component2 = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L4a
                r0 = 19
                int r0 = r0 / r2
            L4a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.ShareDataUIState.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 11;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component1;
            int i5 = i2 + 67;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = ShareDataUIState + 15;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        static {
            int[] iArr = new int[PinValidationType.values().length];
            try {
                iArr[PinValidationType.MPESA_PIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinValidationType.SERVICE_PIN.ordinal()] = 2;
                int i = ShareDataUIState + 115;
                component1 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i3 = component1 + 51;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 + 102
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.$$n(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.$$d
            int r1 = 28 - r7
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r1 = new byte[r1]
            int r7 = 27 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.h(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.$$j
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r6 = r6 * 3
            int r1 = r6 + 10
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-5)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.i(byte, int, int, java.lang.Object[]):void");
    }

    public static final void access$changeScreen(SfcFamilyConnectActivity sfcFamilyConnectActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        sfcFamilyConnectActivity.changeScreen(screenInformation);
        int i4 = component2 + 13;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcFamilyConnectActivity() {
        final SfcFamilyConnectActivity sfcFamilyConnectActivity = this;
        final Function0 function0 = null;
        this.familyConnectViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 119;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = sfcFamilyConnectActivity;
                if (i3 != 0) {
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
                int i2 = component3 + 63;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component3 + 3;
                component2 = i4 % 128;
                int i5 = i4 % 2;
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
                int i2 = copydefault + 81;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 3;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 17;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcFamilyConnectActivity.getDefaultViewModelProviderFactory();
                int i4 = copydefault + 57;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 51 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
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
                    if (r1 == 0) goto L21
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.component1
                    int r2 = r2 + 89
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.copydefault = r3
                    int r2 = r2 % r0
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r2 == 0) goto L1f
                    r2 = 26
                    int r2 = r2 / 0
                    if (r1 != 0) goto L30
                    goto L21
                L1f:
                    if (r1 != 0) goto L30
                L21:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.copydefault
                    int r2 = r2 + 17
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.component1 = r3
                    int r2 = r2 % r0
                L30:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.component1
                    int r2 = r2 + 69
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.copydefault = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L3c
                    return r1
                L3c:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 95;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component1 + 57;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 21 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final FamilyConnectViewModel getFamilyConnectViewModel() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.familyConnectViewModel.getValue();
        int i4 = component2 + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return familyConnectViewModel;
    }

    private static final void contactsLauncher$lambda$1(SfcFamilyConnectActivity sfcFamilyConnectActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcFamilyConnectActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i4 = component3 + 47;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                activityResult.getData();
                throw null;
            }
            Intent data = activityResult.getData();
            Serializable serializableExtra = data != null ? data.getSerializableExtra(FixedDataNavKeys.EXTRA_CONTACT_RESP) : null;
            SfcContact sfcContact = serializableExtra instanceof SfcContact ? (SfcContact) serializableExtra : null;
            if (sfcContact != null) {
                sfcFamilyConnectActivity.getFamilyConnectViewModel().updatePhoneNumber(StringsKt.replace$default(SfcPhoneNumberUtil.INSTANCE.formatterPhoneNumberNoCountryCode(sfcContact.getRealPhoneNumber()), "-", "", false, 4, (Object) null));
            }
        }
    }

    private static final void pinLauncher$lambda$2(SfcFamilyConnectActivity sfcFamilyConnectActivity, ActivityResult activityResult) {
        String stringExtra;
        String str = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcFamilyConnectActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() != -1 || activityResult.getData() == null) {
            return;
        }
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityResult.getData();
            throw null;
        }
        Intent data = activityResult.getData();
        if (data != null && (stringExtra = data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN2)) != null) {
            str = stringExtra;
        }
        if (str.length() <= 0) {
            ToastUtils.showShort("PIN entry failed or cancelled.", new Object[0]);
            return;
        }
        int i3 = component2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        sfcFamilyConnectActivity.getFamilyConnectViewModel().nextAfterPin();
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 105;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 7032, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33, (char) (63441 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - View.resolveSize(0, 0), (Process.myPid() >> 22) + 18, (char) (51269 - KeyEvent.getDeadChar(0, 0)), -1883291598, false, $$n(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 113;
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

    private static final void servicePinLauncher$lambda$3(SfcFamilyConnectActivity sfcFamilyConnectActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sfcFamilyConnectActivity, "");
            Intrinsics.checkNotNullParameter(activityResult, "");
            activityResult.getResultCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sfcFamilyConnectActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            sfcFamilyConnectActivity.getFamilyConnectViewModel().nextAfterPin();
            return;
        }
        if (activityResult.getResultCode() != 0) {
            int i3 = component3 + 35;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                ToastUtils.showShort("Service PIN validation failed.", new Object[0]);
            } else {
                ToastUtils.showShort("Service PIN validation failed.", new Object[0]);
            }
            int i4 = component2 + 29;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r22, char[] r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.f(int, char[], java.lang.Object[]):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class component3 extends FunctionReferenceImpl implements Function1<ScreenInformation<FamilyConnectScreen>, Unit> {
        private static int ShareDataUIState = 1;
        private static int component1;

        public final void copydefault(ScreenInformation<FamilyConnectScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component1 + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(screenInformation, "");
            SfcFamilyConnectActivity.access$changeScreen((SfcFamilyConnectActivity) this.receiver, screenInformation);
            int i4 = ShareDataUIState + 23;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
        }

        @Override
        public Unit invoke(ScreenInformation<FamilyConnectScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(screenInformation);
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 123;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        component3(Object obj) {
            super(1, obj, SfcFamilyConnectActivity.class, "changeScreen", "changeScreen(Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;)V", 0);
        }
    }

    private static void j(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ShareDataUIState;
        int i3 = 684241640;
        float f = 0.0f;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        int i7 = 4392 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                        int iRed = 37 - Color.red(0);
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte length2 = (byte) $$l.length;
                        byte b2 = (byte) (length2 - 4);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i7, iRed, doubleTapTimeout, -309236339, false, $$n(length2, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 684241640;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = ShareDataUIState;
        if (iArr6 != null) {
            int length4 = iArr6.length;
            int[] iArr7 = new int[length4];
            int i8 = 0;
            while (i8 < length4) {
                int i9 = $11 + 51;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr6[i8]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    int offsetAfter = 4391 - TextUtils.getOffsetAfter("", i5);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 37;
                    char c2 = (char) (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1));
                    byte length5 = (byte) $$l.length;
                    byte b3 = (byte) (length5 - 4);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, scrollBarSize, c2, -309236339, false, $$n(length5, b3, b3), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i8++;
                iArr6 = iArr2;
                i4 = 1;
                i5 = 0;
            }
            iArr6 = iArr7;
        }
        int i11 = i5;
        System.arraycopy(iArr6, i11, iArr5, i11, length3);
        getactivenotifications.component1 = i11;
        while (getactivenotifications.component1 < iArr.length) {
            int i12 = $11 + 107;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i14];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2969 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, (char) (49871 - ExpandableListView.getPackedPositionType(0L)), 462826032, false, $$n(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 5;
                byte b7 = (byte) (b6 - 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - TextUtils.getOffsetBefore("", 0), 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 27637), -1616366948, false, $$n(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i19 = $11 + 125;
        $10 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0160  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.onCreate(android.os.Bundle):void");
    }

    private final Fragment getConfirmationFragment(Bundle fsBundle, String limit) {
        int i = 2 % 2;
        FamilyConnectConfirmFragment familyConnectConfirmFragmentNewInstance = FamilyConnectConfirmFragment.INSTANCE.newInstance(new GsmConfirmationScreenData("Family Connect", R.drawable.ic_gsm_family_connect, MapsKt.linkedMapOf(TuplesKt.to("Bundle", fsBundle.getName()), TuplesKt.to("Share with upto", limit + " Beneficiaries"), TuplesKt.to("Payment Method", Keys.PAY_METHOD_AIRTIME), TuplesKt.to("Amount", "Ksh " + ((int) fsBundle.getAmount().floatValue()) + ".00"))), "Confirm", FamilyConnectBundleData.INSTANCE.fromBundle(fsBundle, limit), FamilyConnectConfirmFragment.FLOW_TYPE_FAMILY_CONNECT);
        int i2 = component3 + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return familyConnectConfirmFragmentNewInstance;
    }

    private final void observeScreenChange() {
        int i = 2 % 2;
        getFamilyConnectViewModel().getScreenTransition().observe(this, new ShareDataUIState(new component3(this)));
        int i2 = component3 + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void changeScreen(ScreenInformation<FamilyConnectScreen> screenInformation) {
        TransactionErrorFragment confirmationFragment;
        Fragment fragment;
        int i = 2 % 2;
        FamilyConnectScreen screen = screenInformation.getScreen();
        if (screen instanceof FamilyConnectScreen.CheckStatus) {
            confirmationFragment = new FamilyConnectCheckStatusFragment();
        } else if (screen instanceof FamilyConnectScreen.BundleList) {
            confirmationFragment = new FamilyConnectBundleListFragment();
        } else if (screen instanceof FamilyConnectScreen.Dashboard) {
            confirmationFragment = new FamilyConnectDashboardFragment();
        } else if (screen instanceof FamilyConnectScreen.AddBeneficiary) {
            confirmationFragment = new FamilyConnectAddBeneficiaryFragment();
        } else {
            if (screen instanceof FamilyConnectScreen.UpdateBeneficiary) {
                FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment = new FamilyConnectUpdateBeneficiaryFragment();
                int i2 = component2 + 119;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                fragment = familyConnectUpdateBeneficiaryFragment;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                ScreenDirection direction = screenInformation.getDirection();
                String simpleName = fragment.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                FragmentExtensionsKt.showFragment$default(supportFragmentManager, direction, simpleName, fragment, false, R.id.container, null, 32, null);
            }
            if (screen instanceof FamilyConnectScreen.DeleteBeneficiary) {
                new FamilyConnectDeleteBeneficiaryFragment().show(getSupportFragmentManager(), FamilyConnectDeleteBeneficiaryFragment.INSTANCE.getTAG());
                return;
            }
            if (screen instanceof FamilyConnectScreen.Error) {
                confirmationFragment = new TransactionErrorFragment();
            } else {
                if (screen instanceof FamilyConnectScreen.ContactSelection) {
                    int i4 = component2 + 65;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        onSelectContact();
                        return;
                    } else {
                        onSelectContact();
                        throw null;
                    }
                }
                if (!(screen instanceof FamilyConnectScreen.Confirmation)) {
                    if (!(screen instanceof FamilyConnectScreen.PinEntry)) {
                        finish();
                        return;
                    }
                    showPinScreen(((FamilyConnectScreen.PinEntry) screen).getPinValidationType());
                    int i5 = component3 + 69;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                confirmationFragment = getConfirmationFragment(getFamilyConnectViewModel().getSelectedBundle(), getFamilyConnectViewModel().getSelectedLimit());
            }
        }
        fragment = confirmationFragment;
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        ScreenDirection direction2 = screenInformation.getDirection();
        String simpleName2 = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "");
        FragmentExtensionsKt.showFragment$default(supportFragmentManager2, direction2, simpleName2, fragment, false, R.id.container, null, 32, null);
    }

    private final void onSelectContact() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            RouteUtils.routeWithExecute(this, RoutePathConstant.SELECT_CONTACT, null, this.contactsLauncher);
            int i3 = 67 / 0;
        } else {
            RouteUtils.routeWithExecute(this, RoutePathConstant.SELECT_CONTACT, null, this.contactsLauncher);
        }
        int i4 = component3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    private final void showPinScreen(PinValidationType pinValidationType) {
        int i;
        int i2 = 2 % 2;
        String string = getString(R.string.gsm_family_connect_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("titleText", string);
        bundle.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.ic_gsm_family_connect);
        int i3 = WhenMappings.$EnumSwitchMapping$0[pinValidationType.ordinal()];
        if (i3 == 1) {
            RouteUtils.routeWithExecute(this, "/sfcModule/identityPin", bundle, this.pinLauncher);
            i = component2 + 35;
            component3 = i % 128;
        } else if (i3 != 2) {
            i = component3 + 103;
            component2 = i % 128;
        } else {
            RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_SERVICE_PIN, bundle, this.servicePinLauncher);
            return;
        }
        int i4 = i % 2;
    }

    @Override
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) startActivityForResult.copydefault[0]).getInt(null);
        int ringerMode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getRingerMode();
        int i3 = ~ringerMode;
        if (i2 != (-687939935) + (((~(921872651 | i3)) | 16794260) * (-108)) + (((~(i3 | 62966422)) | (~((-62966423) | ringerMode)) | 875700489) * 54) + ((ringerMode | 875700489) * 54)) {
            int i4 = component3 + 97;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        int i5 = ((Field) onStateChanged.copydefault[0]).getInt(null);
        int i6 = Settings.System.getInt(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
        if (i5 != 658633208 + ((~((-1262616705) | i6)) * 623) + (((~i6) | 805311074) * (-623)) + (((~(i6 | 817446766)) | (~((-1274752397) | i6)) | 1262616704) * 623)) {
            int i7 = component2 + 51;
            component3 = i7 % 128;
            Toast.makeText((Context) null, i7 % 2 != 0 ? (((-657505829) / 0) / 5) - 657505829 : (-657505829) / 0, 0).show();
        }
        int i8 = ((Field) ComponentActivityExternalSyntheticLambda1.ShareDataUIState[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != (-133272392) + (((~((-1692009871) | iIdentityHashCode)) | 4195466) * (-140)) + ((~((-1687814405) | iIdentityHashCode)) * 70) + (((~(iIdentityHashCode | 289535211)) | (-1973154150)) * 70)) {
            throw new RuntimeException(String.valueOf(2142417179));
        }
        super.onStart();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = component2 + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{39877, 39844, 4539, 4867, 8782, 10118, 59659, 37106, 57851, 7492, 14054, 61967, 36116, 2805, 15274, 65255, 47500, 14270, 'F', 51992, 46803, 9052, 5374, 54368, 41769, 10469, 6544, 41124, 57268, 21889}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26700, new char[]{9179, 19364, 62232, 6897, 33401, 10715, 20922, 63782, 24704, 34937, 14286, 24402, 50999, 28300, 38514, 15862, 42311, 52527}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i5 = component3 + 111;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = component2 + 99;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 42, (char) View.MeasureSpec.getMode(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), MotionEvent.axisFromString("") + 57, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i8 = component3 + 115;
                component2 = i8 % 128;
                int i9 = i8 % 2;
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

    /* JADX WARN: Can't wrap try/catch for region: R(33:(31:845|254|(2:256|(2:258|(2:260|264)(1:261))(2:262|263))(1:264)|301|850|302|(1:304)|305|306|(2:308|(5:310|311|(1:313)|314|315)(3:316|(1:318)|319))(19:320|321|839|322|(1:324)|325|326|830|327|(1:329)|330|331|332|(1:334)|335|(1:337)(1:338)|339|(1:341)|342)|343|(4:346|(2:348|882)(11:349|(3:351|(3:354|355|352)|883)|356|826|357|(1:359)|360|361|814|362|881)|363|344)|880|397|786|398|(1:400)|401|(3:403|(1:405)|406)(19:407|408|873|409|(1:411)|412|413|869|414|(1:416)|417|418|419|(1:421)|422|(1:424)|425|(1:427)|428)|429|(4:432|(3:886|434|889)(12:884|435|(3:437|(3:440|441|438)|890)|442|861|443|(1:445)|446|447|852|448|888)|887|430)|885|483|(1:485)|486|(1:488)|489|(3:491|(1:493)|494)(16:496|497|(1:499)|500|(1:502)|503|504|(1:506)|507|796|508|509|(1:511)|512|(1:514)|515)|495|516|(32:518|(1:520)|521|(3:523|(1:525)|526)(14:527|528|(1:530)|531|532|(1:534)|535|803|536|537|(1:539)|540|(1:542)|543)|544|(1:546)(9:547|(3:549|(2:552|550)|898)|553|554|(1:556)|557|(1:559)|560|561)|562|871|563|(2:795|565)|569|(2:571|572)|573|574|(4:576|577|(1:579)|580)(27:581|(2:583|(1:589)(1:588))|(22:591|592|851|593|594|863|595|(1:597)|598|599|854|600|(1:602)|603|604|605|(1:607)|608|(1:610)|611|(1:613)|614)(15:659|674|(1:676)|677|(3:679|(1:681)|682)(13:684|818|685|686|(1:688)|689|865|690|691|(1:693)|694|(1:696)|697)|683|698|(6:701|702|(1:704)|705|706|707)|708|(1:710)|711|(3:713|(1:715)|716)(14:718|719|(1:721)|722|723|(1:725)|726|857|727|728|(1:730)|731|(1:733)|734)|717|735|(1:900)(7:738|739|(1:741)|742|743|744|745))|662|663|843|664|667|668|(1:670)|671|672|673|674|(0)|677|(0)(0)|683|698|(0)|708|(0)|711|(0)(0)|717|735|(0)(0))|615|(4:618|(3:893|620|896)(12:892|621|(3:623|(3:626|627|624)|897)|628|841|629|(1:631)|632|633|832|634|895)|894|616)|891|674|(0)|677|(0)(0)|683|698|(0)|708|(0)|711|(0)(0)|717|735|(0)(0))(10:757|(3:759|(2:762|760)|899)|763|764|(1:766)|767|(1:769)|770|771|772))(1:268)|812|274|(1:276)|277|301|850|302|(0)|305|306|(0)(0)|343|(1:344)|880|397|786|398|(0)|401|(0)(0)|429|(1:430)|885|483|(0)|486|(0)|489|(0)(0)|495|516|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:0|2|(2:4|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|811|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|824|32|(12:875|34|38|(2:40|41)|42|43|798|(5:45|46|(1:48)|49|50)(14:51|(3:53|54|(2:56|(2:58|(2:60|64)(1:61))(2:62|63))(1:64))(1:66)|(21:68|69|801|70|809|71|(2:789|73)|77|78|805|79|(2:820|81)|85|86|87|(2:807|89)|90|(1:92)(1:94)|95|(2:97|98)|99)(1:152)|155|156|799|157|160|161|(1:163)|164|165|835|166)|100|(4:103|(2:105|878)(11:106|(3:108|(4:111|112|113|109)|879)|116|791|117|(1:119)|120|121|784|122|877)|123|101)|876|137)(10:38|(0)|42|43|798|(0)(0)|100|(1:101)|876|137)|167|(10:867|168|(3:170|834|171)|175|176|856|(5:178|179|(1:181)|182|183)(16:185|186|859|187|(2:816|189)|193|194|195|(1:197)|198|199|200|(1:202)|203|(1:205)|206)|184|207|(9:210|848|211|(1:213)|214|215|216|837|217))|218|(31:845|254|(2:256|(2:258|(2:260|264)(1:261))(2:262|263))(1:264)|301|850|302|(1:304)|305|306|(2:308|(5:310|311|(1:313)|314|315)(3:316|(1:318)|319))(19:320|321|839|322|(1:324)|325|326|830|327|(1:329)|330|331|332|(1:334)|335|(1:337)(1:338)|339|(1:341)|342)|343|(4:346|(2:348|882)(11:349|(3:351|(3:354|355|352)|883)|356|826|357|(1:359)|360|361|814|362|881)|363|344)|880|397|786|398|(1:400)|401|(3:403|(1:405)|406)(19:407|408|873|409|(1:411)|412|413|869|414|(1:416)|417|418|419|(1:421)|422|(1:424)|425|(1:427)|428)|429|(4:432|(3:886|434|889)(12:884|435|(3:437|(3:440|441|438)|890)|442|861|443|(1:445)|446|447|852|448|888)|887|430)|885|483|(1:485)|486|(1:488)|489|(3:491|(1:493)|494)(16:496|497|(1:499)|500|(1:502)|503|504|(1:506)|507|796|508|509|(1:511)|512|(1:514)|515)|495|516|(32:518|(1:520)|521|(3:523|(1:525)|526)(14:527|528|(1:530)|531|532|(1:534)|535|803|536|537|(1:539)|540|(1:542)|543)|544|(1:546)(9:547|(3:549|(2:552|550)|898)|553|554|(1:556)|557|(1:559)|560|561)|562|871|563|(2:795|565)|569|(2:571|572)|573|574|(4:576|577|(1:579)|580)(27:581|(2:583|(1:589)(1:588))|(22:591|592|851|593|594|863|595|(1:597)|598|599|854|600|(1:602)|603|604|605|(1:607)|608|(1:610)|611|(1:613)|614)(15:659|674|(1:676)|677|(3:679|(1:681)|682)(13:684|818|685|686|(1:688)|689|865|690|691|(1:693)|694|(1:696)|697)|683|698|(6:701|702|(1:704)|705|706|707)|708|(1:710)|711|(3:713|(1:715)|716)(14:718|719|(1:721)|722|723|(1:725)|726|857|727|728|(1:730)|731|(1:733)|734)|717|735|(1:900)(7:738|739|(1:741)|742|743|744|745))|662|663|843|664|667|668|(1:670)|671|672|673|674|(0)|677|(0)(0)|683|698|(0)|708|(0)|711|(0)(0)|717|735|(0)(0))|615|(4:618|(3:893|620|896)(12:892|621|(3:623|(3:626|627|624)|897)|628|841|629|(1:631)|632|633|832|634|895)|894|616)|891|674|(0)|677|(0)(0)|683|698|(0)|708|(0)|711|(0)(0)|717|735|(0)(0))(10:757|(3:759|(2:762|760)|899)|763|764|(1:766)|767|(1:769)|770|771|772))(1:268)|269|822|270|(1:272)|273|812|274|(1:276)|277|301|850|302|(0)|305|306|(0)(0)|343|(1:344)|880|397|786|398|(0)|401|(0)(0)|429|(1:430)|885|483|(0)|486|(0)|489|(0)(0)|495|516|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x14fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x14fc, code lost:
    
        r6 = new java.lang.Object[1];
        g(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{49622, 49634, 61121, 60453, 17397, 18016, 2358, 51895, 384, 57917, 22355, 4712, 55135, 62869, 23052}, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x1515, code lost:
    
        r1 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r1);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r1.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x152c, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x1530, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x155e, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1562, code lost:
    
        if (r6 == null) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1564, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6618, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 42, (char) android.widget.ExpandableListView.getPackedPositionGroup(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x158d, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x1595, code lost:
    
        r9 = new java.lang.Object[]{1826494741, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, (char) ((-1) - android.text.TextUtils.lastIndexOf("", '0')));
        r10 = new java.lang.Object[1];
        i(r2[79], r2[28], (byte) (-com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.$$j[5]), r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x1a26, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x1a27, code lost:
    
        r6 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) + 8576, new char[]{9088, 616, 24650, 17966, 42005, 35570, 59602, 52942, 11433, 4743}, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x1a60, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x1a77, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x1a7b, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x1aa9, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x1aad, code lost:
    
        if (r6 == null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x1aaf, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 42 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x1ad9, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x1ae1, code lost:
    
        r9 = new java.lang.Object[]{1826494741, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 56 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
        r10 = new java.lang.Object[1];
        i(r2[79], r2[28], (byte) (-com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.$$j[5]), r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x070e A[Catch: all -> 0x083d, TryCatch #10 {all -> 0x083d, blocks: (B:100:0x0704, B:101:0x0708, B:103:0x070e, B:106:0x0729, B:70:0x0447, B:87:0x05ea, B:90:0x0631, B:95:0x06a3, B:99:0x06fe), top: B:801:0x0447 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08f5 A[Catch: all -> 0x02cb, TryCatch #15 {all -> 0x02cb, blocks: (B:161:0x08ef, B:163:0x08f5, B:164:0x0921, B:246:0x0d96, B:248:0x0d9c, B:249:0x0dc5, B:702:0x2e5c, B:704:0x2e62, B:705:0x2e8a, B:739:0x319b, B:741:0x31a1, B:742:0x31c3, B:719:0x2fd8, B:721:0x2ffb, B:722:0x3050, B:668:0x2b29, B:670:0x2b2f, B:671:0x2b59, B:554:0x2445, B:556:0x244b, B:557:0x2474, B:559:0x24ae, B:560:0x24fa, B:528:0x2179, B:530:0x218e, B:531:0x21be, B:764:0x329f, B:766:0x32a5, B:767:0x32ce, B:769:0x3308, B:770:0x3348, B:497:0x1d01, B:499:0x1d16, B:500:0x1d3f, B:502:0x1d73, B:503:0x1df4, B:477:0x1aa9, B:479:0x1aaf, B:480:0x1ad9, B:391:0x155e, B:393:0x1564, B:394:0x158d, B:295:0x0fe3, B:297:0x0fe9, B:298:0x1012, B:19:0x0138, B:21:0x013e, B:22:0x0164, B:24:0x023b, B:26:0x026c, B:27:0x02c5, B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a, B:254:0x0e4c, B:258:0x0e5c, B:281:0x0f51, B:283:0x0f57, B:284:0x0f58, B:286:0x0f5a, B:288:0x0f61, B:289:0x0f62, B:262:0x0e68, B:263:0x0e6f, B:264:0x0e70, B:302:0x109d, B:304:0x10a3, B:305:0x10e4, B:311:0x1100, B:313:0x1106, B:314:0x1149, B:315:0x1155, B:316:0x1156, B:318:0x115f, B:319:0x11a0, B:343:0x13b6, B:344:0x13ba, B:346:0x13c0, B:349:0x13da, B:352:0x13e7, B:354:0x13ea, B:366:0x14d5, B:368:0x14db, B:369:0x14dc, B:371:0x14de, B:373:0x14e5, B:374:0x14e6, B:320:0x11ab, B:332:0x129b, B:334:0x12a1, B:335:0x12e0, B:337:0x130a, B:339:0x1353, B:341:0x1369, B:342:0x13ae, B:376:0x14e8, B:378:0x14ef, B:379:0x14f0, B:381:0x14f2, B:383:0x14f9, B:384:0x14fa), top: B:811:0x0138, inners: #1, #33, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d9c A[Catch: all -> 0x02cb, TryCatch #15 {all -> 0x02cb, blocks: (B:161:0x08ef, B:163:0x08f5, B:164:0x0921, B:246:0x0d96, B:248:0x0d9c, B:249:0x0dc5, B:702:0x2e5c, B:704:0x2e62, B:705:0x2e8a, B:739:0x319b, B:741:0x31a1, B:742:0x31c3, B:719:0x2fd8, B:721:0x2ffb, B:722:0x3050, B:668:0x2b29, B:670:0x2b2f, B:671:0x2b59, B:554:0x2445, B:556:0x244b, B:557:0x2474, B:559:0x24ae, B:560:0x24fa, B:528:0x2179, B:530:0x218e, B:531:0x21be, B:764:0x329f, B:766:0x32a5, B:767:0x32ce, B:769:0x3308, B:770:0x3348, B:497:0x1d01, B:499:0x1d16, B:500:0x1d3f, B:502:0x1d73, B:503:0x1df4, B:477:0x1aa9, B:479:0x1aaf, B:480:0x1ad9, B:391:0x155e, B:393:0x1564, B:394:0x158d, B:295:0x0fe3, B:297:0x0fe9, B:298:0x1012, B:19:0x0138, B:21:0x013e, B:22:0x0164, B:24:0x023b, B:26:0x026c, B:27:0x02c5, B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a, B:254:0x0e4c, B:258:0x0e5c, B:281:0x0f51, B:283:0x0f57, B:284:0x0f58, B:286:0x0f5a, B:288:0x0f61, B:289:0x0f62, B:262:0x0e68, B:263:0x0e6f, B:264:0x0e70, B:302:0x109d, B:304:0x10a3, B:305:0x10e4, B:311:0x1100, B:313:0x1106, B:314:0x1149, B:315:0x1155, B:316:0x1156, B:318:0x115f, B:319:0x11a0, B:343:0x13b6, B:344:0x13ba, B:346:0x13c0, B:349:0x13da, B:352:0x13e7, B:354:0x13ea, B:366:0x14d5, B:368:0x14db, B:369:0x14dc, B:371:0x14de, B:373:0x14e5, B:374:0x14e6, B:320:0x11ab, B:332:0x129b, B:334:0x12a1, B:335:0x12e0, B:337:0x130a, B:339:0x1353, B:341:0x1369, B:342:0x13ae, B:376:0x14e8, B:378:0x14ef, B:379:0x14f0, B:381:0x14f2, B:383:0x14f9, B:384:0x14fa), top: B:811:0x0138, inners: #1, #33, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x10a3 A[Catch: all -> 0x14fb, TryCatch #36 {all -> 0x14fb, blocks: (B:302:0x109d, B:304:0x10a3, B:305:0x10e4, B:311:0x1100, B:313:0x1106, B:314:0x1149, B:315:0x1155, B:316:0x1156, B:318:0x115f, B:319:0x11a0, B:343:0x13b6, B:344:0x13ba, B:346:0x13c0, B:349:0x13da, B:352:0x13e7, B:354:0x13ea, B:366:0x14d5, B:368:0x14db, B:369:0x14dc, B:371:0x14de, B:373:0x14e5, B:374:0x14e6, B:320:0x11ab, B:332:0x129b, B:334:0x12a1, B:335:0x12e0, B:337:0x130a, B:339:0x1353, B:341:0x1369, B:342:0x13ae, B:376:0x14e8, B:378:0x14ef, B:379:0x14f0, B:381:0x14f2, B:383:0x14f9, B:384:0x14fa, B:362:0x1453, B:357:0x1419, B:359:0x141f, B:360:0x144b, B:327:0x1213, B:329:0x1228, B:330:0x128f, B:322:0x11cb, B:324:0x11e0, B:325:0x120c), top: B:850:0x109d, outer: #15, inners: #17, #23, #25, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x11ab A[Catch: all -> 0x14fb, TRY_LEAVE, TryCatch #36 {all -> 0x14fb, blocks: (B:302:0x109d, B:304:0x10a3, B:305:0x10e4, B:311:0x1100, B:313:0x1106, B:314:0x1149, B:315:0x1155, B:316:0x1156, B:318:0x115f, B:319:0x11a0, B:343:0x13b6, B:344:0x13ba, B:346:0x13c0, B:349:0x13da, B:352:0x13e7, B:354:0x13ea, B:366:0x14d5, B:368:0x14db, B:369:0x14dc, B:371:0x14de, B:373:0x14e5, B:374:0x14e6, B:320:0x11ab, B:332:0x129b, B:334:0x12a1, B:335:0x12e0, B:337:0x130a, B:339:0x1353, B:341:0x1369, B:342:0x13ae, B:376:0x14e8, B:378:0x14ef, B:379:0x14f0, B:381:0x14f2, B:383:0x14f9, B:384:0x14fa, B:362:0x1453, B:357:0x1419, B:359:0x141f, B:360:0x144b, B:327:0x1213, B:329:0x1228, B:330:0x128f, B:322:0x11cb, B:324:0x11e0, B:325:0x120c), top: B:850:0x109d, outer: #15, inners: #17, #23, #25, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x13c0 A[Catch: all -> 0x14fb, TryCatch #36 {all -> 0x14fb, blocks: (B:302:0x109d, B:304:0x10a3, B:305:0x10e4, B:311:0x1100, B:313:0x1106, B:314:0x1149, B:315:0x1155, B:316:0x1156, B:318:0x115f, B:319:0x11a0, B:343:0x13b6, B:344:0x13ba, B:346:0x13c0, B:349:0x13da, B:352:0x13e7, B:354:0x13ea, B:366:0x14d5, B:368:0x14db, B:369:0x14dc, B:371:0x14de, B:373:0x14e5, B:374:0x14e6, B:320:0x11ab, B:332:0x129b, B:334:0x12a1, B:335:0x12e0, B:337:0x130a, B:339:0x1353, B:341:0x1369, B:342:0x13ae, B:376:0x14e8, B:378:0x14ef, B:379:0x14f0, B:381:0x14f2, B:383:0x14f9, B:384:0x14fa, B:362:0x1453, B:357:0x1419, B:359:0x141f, B:360:0x144b, B:327:0x1213, B:329:0x1228, B:330:0x128f, B:322:0x11cb, B:324:0x11e0, B:325:0x120c), top: B:850:0x109d, outer: #15, inners: #17, #23, #25, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x161b A[Catch: all -> 0x1a26, TryCatch #1 {all -> 0x1a26, blocks: (B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a), top: B:786:0x1615, outer: #15, inners: #38, #43, #47, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x166e A[Catch: all -> 0x1a26, TryCatch #1 {all -> 0x1a26, blocks: (B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a), top: B:786:0x1615, outer: #15, inners: #38, #43, #47, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x16c5 A[Catch: all -> 0x1a26, TRY_LEAVE, TryCatch #1 {all -> 0x1a26, blocks: (B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a), top: B:786:0x1615, outer: #15, inners: #38, #43, #47, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x18ec A[Catch: all -> 0x1a26, TryCatch #1 {all -> 0x1a26, blocks: (B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a), top: B:786:0x1615, outer: #15, inners: #38, #43, #47, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1b64  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1bce  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1c22  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x1ce3  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1f28  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x2b2f A[Catch: all -> 0x02cb, TryCatch #15 {all -> 0x02cb, blocks: (B:161:0x08ef, B:163:0x08f5, B:164:0x0921, B:246:0x0d96, B:248:0x0d9c, B:249:0x0dc5, B:702:0x2e5c, B:704:0x2e62, B:705:0x2e8a, B:739:0x319b, B:741:0x31a1, B:742:0x31c3, B:719:0x2fd8, B:721:0x2ffb, B:722:0x3050, B:668:0x2b29, B:670:0x2b2f, B:671:0x2b59, B:554:0x2445, B:556:0x244b, B:557:0x2474, B:559:0x24ae, B:560:0x24fa, B:528:0x2179, B:530:0x218e, B:531:0x21be, B:764:0x329f, B:766:0x32a5, B:767:0x32ce, B:769:0x3308, B:770:0x3348, B:497:0x1d01, B:499:0x1d16, B:500:0x1d3f, B:502:0x1d73, B:503:0x1df4, B:477:0x1aa9, B:479:0x1aaf, B:480:0x1ad9, B:391:0x155e, B:393:0x1564, B:394:0x158d, B:295:0x0fe3, B:297:0x0fe9, B:298:0x1012, B:19:0x0138, B:21:0x013e, B:22:0x0164, B:24:0x023b, B:26:0x026c, B:27:0x02c5, B:398:0x1615, B:400:0x161b, B:401:0x1661, B:403:0x166e, B:405:0x1677, B:406:0x16ba, B:429:0x18e2, B:430:0x18e6, B:432:0x18ec, B:435:0x1903, B:438:0x191a, B:440:0x191d, B:452:0x1a00, B:454:0x1a06, B:455:0x1a07, B:457:0x1a09, B:459:0x1a10, B:460:0x1a11, B:407:0x16c5, B:419:0x17ca, B:421:0x17d0, B:422:0x1815, B:424:0x183f, B:425:0x1881, B:427:0x1897, B:428:0x18dc, B:462:0x1a13, B:464:0x1a1a, B:465:0x1a1b, B:467:0x1a1d, B:469:0x1a24, B:470:0x1a25, B:448:0x1982, B:443:0x1949, B:445:0x194f, B:446:0x197a, B:414:0x1731, B:416:0x174d, B:417:0x17be, B:409:0x16e5, B:411:0x16fa, B:412:0x172a, B:254:0x0e4c, B:258:0x0e5c, B:281:0x0f51, B:283:0x0f57, B:284:0x0f58, B:286:0x0f5a, B:288:0x0f61, B:289:0x0f62, B:262:0x0e68, B:263:0x0e6f, B:264:0x0e70, B:302:0x109d, B:304:0x10a3, B:305:0x10e4, B:311:0x1100, B:313:0x1106, B:314:0x1149, B:315:0x1155, B:316:0x1156, B:318:0x115f, B:319:0x11a0, B:343:0x13b6, B:344:0x13ba, B:346:0x13c0, B:349:0x13da, B:352:0x13e7, B:354:0x13ea, B:366:0x14d5, B:368:0x14db, B:369:0x14dc, B:371:0x14de, B:373:0x14e5, B:374:0x14e6, B:320:0x11ab, B:332:0x129b, B:334:0x12a1, B:335:0x12e0, B:337:0x130a, B:339:0x1353, B:341:0x1369, B:342:0x13ae, B:376:0x14e8, B:378:0x14ef, B:379:0x14f0, B:381:0x14f2, B:383:0x14f9, B:384:0x14fa), top: B:811:0x0138, inners: #1, #33, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2be4  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2c39  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x2c8c  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x2e3e  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x2f1a  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x2f6c  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x2fba  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x317d  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x3268  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x010f A[PHI: r15
  0x010f: PHI (r15v61 char) = (r15v5 char), (r15v62 char) binds: [B:17:0x012d, B:5:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0115 A[PHI: r15
  0x0115: PHI (r15v5 char) = (r15v4 char), (r15v63 char) binds: [B:3:0x0107, B:5:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:900:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v73 */
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
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v27 */
    /* JADX WARN: Type inference failed for: r26v52 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r7v98 */
    /* JADX WARN: Type inference failed for: r7v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.SfcFamilyConnectActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$QkF5TrERkq999rRJ8RdeeqEALis(SfcFamilyConnectActivity sfcFamilyConnectActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        servicePinLauncher$lambda$3(sfcFamilyConnectActivity, activityResult);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    public static void $r8$lambda$VCei5PjOAwMhmmF_bOeU3RrThLs(SfcFamilyConnectActivity sfcFamilyConnectActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        pinLauncher$lambda$2(sfcFamilyConnectActivity, activityResult);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = component2 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m11295$r8$lambda$vg_uapsppg1Hasy7IvNO1YEqpg(SfcFamilyConnectActivity sfcFamilyConnectActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        contactsLauncher$lambda$1(sfcFamilyConnectActivity, activityResult);
        int i4 = component2 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        copy = 0;
        component2();
        component3();
        int i = equals + 123;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = new int[]{-1868914474, 1904922271, -1134967931, 96093796, 1375690390, -2133929660, 1069751905, 924846162, 653177245, 685484606, -1068333273, 601498461, 1319625012, 1928019812, -82690234, -2024138633, 814801144, -1477315777};
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component2() {
        component1 = 7496424100137414215L;
        copydefault = -8065730131742645358L;
    }
}
