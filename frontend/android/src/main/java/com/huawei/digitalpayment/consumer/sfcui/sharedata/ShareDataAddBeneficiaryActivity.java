package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalActivity;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import defpackage.ShareDataUIState;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelNotification;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataAddBeneficiaryActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "contactLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "confirmationLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "navigateToConfirmation", "ConsumerSfcUI_release", "shareDataUIState", "LShareDataUIState;", "addFormState", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/add/ShareDataAddBeneficiaryFormState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ShareDataAddBeneficiaryActivity extends Hilt_ShareDataAddBeneficiaryActivity {
    public static final int $stable = 8;
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static long component3;
    private static boolean component4;
    private static int copydefault;
    private static int getRequestBeneficiariesState;

    private final Lazy viewModel;
    private static final byte[] $$l = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$m = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {115, Ascii.RS, 119, 102, Ascii.DC2, 4, -57, 63, Ascii.SO, 6, -2, Ascii.VT, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, Ascii.EM, -9, 19, -3, -2, 17, -56, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 40, Ascii.ETB, Ascii.ETB, -9, 8, 13, -5, 7, Ascii.DLE, -1, -12, 35, -9, Ascii.ETB, 7, -8, -22, 43, Ascii.FF, -45, TarHeader.LF_CONTIG, 6, -11, Ascii.RS, -79, 19, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -61, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 75, -7, 3, Ascii.CAN, -6, -53, 58, Ascii.EM, 10, -17, Ascii.EM, -1, -4, Ascii.SO, -1, 20, -63, 58, Ascii.DLE, 3, 19, -11, 3, Ascii.EM, -1, -4, Ascii.SO, -1, 20, -63, Ascii.SUB, Ascii.DLE, 35, 19, -11, -29, 57, -1, -4, Ascii.SO, -1, 20, -26, Ascii.SYN, Ascii.NAK, -7, 6, Ascii.SI, -29, 47, -74, 69, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, -9, 69, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 59, Ascii.DC2, 4, 6, 8, 5, -58, 79, -8, 1, 9, 4, Ascii.NAK, -64, 60, Ascii.VT, -2, 17, 9, -2, -51, 43, Ascii.CAN, Ascii.NAK, -45, TarHeader.LF_SYMLINK, 8, Ascii.FF, -1, Ascii.FF, -30, 37, 7, -70, 6, 39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, Ascii.FF, -6, 3, Ascii.NAK, -5, 0, -17, Ascii.ESC, Ascii.DC2, -5, 8, 3, -42, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60};
    private static final int $$k = 141;
    private static final byte[] $$d = {63, 67, 46, -88, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 5;
    private static int equals = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private final ActivityResultLauncher<Intent> contactLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataAddBeneficiaryActivity.$r8$lambda$EPvfIcG550sq1sGfeaJ0Zoy6OUM(this.f$0, (ActivityResult) obj);
            int i4 = ShareDataUIState + 73;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });
    private final ActivityResultLauncher<Intent> confirmationLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int copydefault = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataAddBeneficiaryActivity.$r8$lambda$iQcZQtMD_D0Cwz3ayQMyVgXCMIQ(this.f$0, (ActivityResult) obj);
            int i4 = component1 + 7;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    });

    private static String $$n(byte b2, byte b3, short s) {
        byte[] bArr = $$l;
        int i = 122 - b2;
        int i2 = s * 3;
        int i3 = (b3 * 3) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += i3;
            i3++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i3;
            i += bArr[i3];
            i3 = i6 + 1;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.$$d
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r7 = 100 - r7
            int r1 = 28 - r5
            byte[] r1 = new byte[r1]
            int r5 = 27 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.g(byte, short, short, java.lang.Object[]):void");
    }

    private static void h(byte b2, short s, byte b3, Object[] objArr) {
        int i = s + 4;
        int i2 = (b2 * 2) + 99;
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[108 - b3];
        int i3 = 107 - b3;
        int i4 = -1;
        if (bArr == null) {
            i2 = (i2 + i3) - 6;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            i++;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + bArr[i]) - 6;
        }
    }

    public static final ActivityResultLauncher access$getContactLauncher$p(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = copy + 107;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = shareDataAddBeneficiaryActivity.contactLauncher;
        if (i4 == 0) {
            int i5 = 94 / 0;
        }
        int i6 = i3 + 103;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return activityResultLauncher;
    }

    public static final ShareDataViewModel access$getViewModel(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            shareDataAddBeneficiaryActivity.getViewModel();
            obj.hashCode();
            throw null;
        }
        ShareDataViewModel viewModel = shareDataAddBeneficiaryActivity.getViewModel();
        int i3 = getAsAtTimestamp + 113;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            return viewModel;
        }
        throw null;
    }

    public static final void access$navigateToConfirmation(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = copy + 121;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        shareDataAddBeneficiaryActivity.navigateToConfirmation();
        int i4 = getAsAtTimestamp + 39;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ShareDataAddBeneficiaryActivity() {
        final ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareDataViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = shareDataAddBeneficiaryActivity.getViewModelStore();
                int i4 = ShareDataUIState + 45;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 19 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 85;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
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
                int i2 = ShareDataUIState + 89;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = ShareDataUIState + 69;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 21;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    shareDataAddBeneficiaryActivity.getDefaultViewModelProviderFactory();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = shareDataAddBeneficiaryActivity.getDefaultViewModelProviderFactory();
                int i3 = ShareDataUIState + 43;
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
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity$special$$inlined$viewModels$default$3.component1
                    int r1 = r1 + 9
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity$special$$inlined$viewModels$default$3.component3 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 13
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
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity$special$$inlined$viewModels$default$3.component1
                    int r2 = r2 + 95
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity$special$$inlined$viewModels$default$3.component3 = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 31;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component3 + 75;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ShareDataViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copy + 107;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ShareDataViewModel shareDataViewModel = (ShareDataViewModel) this.viewModel.getValue();
        int i3 = getAsAtTimestamp + 19;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return shareDataViewModel;
    }

    private static final void contactLauncher$lambda$1(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity, ActivityResult activityResult) {
        Intent data;
        SfcContact sfcContact;
        String realPhoneNumber;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
        if (activityResult != null) {
            int i4 = copy + 19;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (sfcContact = (SfcContact) data.getSerializableExtra(FixedDataNavKeys.EXTRA_CONTACT_RESP)) == null || (realPhoneNumber = sfcContact.getRealPhoneNumber()) == null) {
                return;
            }
            int i6 = getAsAtTimestamp + 117;
            copy = i6 % 128;
            int i7 = i6 % 2;
            ShareDataAddBeneficiaryFormState value = shareDataAddBeneficiaryActivity.getViewModel().getAddFormState().getValue();
            if (value == null) {
                value = new ShareDataAddBeneficiaryFormState(null, null, null, null, null, null, null, null, false, 511, null);
            }
            shareDataAddBeneficiaryActivity.getViewModel().updateAddFormState(ShareDataAddBeneficiaryFormState.copy$default(value, null, realPhoneNumber, null, null, null, null, null, null, false, 509, null));
        }
    }

    private static final void confirmationLauncher$lambda$2(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
        if (activityResult != null) {
            int i4 = getAsAtTimestamp + 5;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                activityResult.getResultCode();
                throw null;
            }
            if (activityResult.getResultCode() == -1) {
                shareDataAddBeneficiaryActivity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 1;
            private static int copydefault;
            final ShareDataAddBeneficiaryActivity component1;

            public static Object component1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i4;
                int i8 = ~i;
                int i9 = ~(i7 | i8);
                int i10 = (~(i7 | i2)) | i9 | (~(i8 | i2));
                int i11 = ~i2;
                int i12 = (~(i8 | i11)) | i9;
                int i13 = (~(i11 | i7)) | i;
                int i14 = i4 + i + i3 + ((-700610695) * i5) + ((-1151578525) * i6);
                int i15 = i14 * i14;
                int i16 = (1165304685 * i4) + 1030029312 + ((-1366800679) * i) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i3) + ((-665714688) * i5) + (367394816 * i6) + (374145024 * i15);
                int i17 = ((i4 * 323709325) - 650539883) + (i * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i3 * 323709601) + (i5 * (-499299047)) + (i6 * 1568885315) + (i15 * (-395509760));
                return i16 + ((i17 * i17) * (-772603904)) != 1 ? copydefault(objArr) : component1(objArr);
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 47;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 67;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r23, int r24) {
                /*
                    Method dump skipped, instruction units count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.copydefault.AnonymousClass2.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            private static Object copydefault(Object[] objArr) {
                ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity = (ShareDataAddBeneficiaryActivity) objArr[0];
                ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormState = (ShareDataAddBeneficiaryFormState) objArr[1];
                int i = 2 % 2;
                int i2 = component2 + 67;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                    Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryFormState, "");
                    ShareDataAddBeneficiaryActivity.access$getViewModel(shareDataAddBeneficiaryActivity).updateAddFormState(shareDataAddBeneficiaryFormState);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryFormState, "");
                ShareDataAddBeneficiaryActivity.access$getViewModel(shareDataAddBeneficiaryActivity).updateAddFormState(shareDataAddBeneficiaryFormState);
                int i3 = 47 / 0;
                return Unit.INSTANCE;
            }

            private static final Unit copydefault(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = component2 + 13;
                copydefault = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                    ShareDataAddBeneficiaryActivity.access$navigateToConfirmation(shareDataAddBeneficiaryActivity);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                ShareDataAddBeneficiaryActivity.access$navigateToConfirmation(shareDataAddBeneficiaryActivity);
                Unit unit2 = Unit.INSTANCE;
                int i3 = component2 + 65;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit2;
                }
                obj.hashCode();
                throw null;
            }

            private static final Unit component3(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = component2 + 47;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                Object obj = null;
                RouteUtils.routeWithExecute(shareDataAddBeneficiaryActivity, RoutePathConstant.SELECT_CONTACT, null, ShareDataAddBeneficiaryActivity.access$getContactLauncher$p(shareDataAddBeneficiaryActivity));
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 1;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }

            private static final Unit component4(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 17;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                    shareDataAddBeneficiaryActivity.finish();
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(shareDataAddBeneficiaryActivity, "");
                shareDataAddBeneficiaryActivity.finish();
                Unit unit2 = Unit.INSTANCE;
                int i3 = component2 + 39;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final ShareDataUIState component2(State<ShareDataUIState> state) {
                int i = 2 % 2;
                int i2 = component2 + 75;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState value = state.getValue();
                int i4 = component2 + 23;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return value;
                }
                throw null;
            }

            private static final ShareDataAddBeneficiaryFormState copydefault(State<ShareDataAddBeneficiaryFormState> state) {
                int i = 2 % 2;
                int i2 = copydefault + 47;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataAddBeneficiaryFormState value = state.getValue();
                int i4 = component2 + 1;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            public static Unit copydefault(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity, ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormState) {
                int i = 2 % 2;
                int i2 = copydefault + 53;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) component1(-366122547, MpesaGlobalActivity.component1.component1(), MpesaGlobalActivity.component1.component1(), 366122547, MpesaGlobalActivity.component1.component1(), new Object[]{shareDataAddBeneficiaryActivity, shareDataAddBeneficiaryFormState}, MpesaGlobalActivity.component1.component1());
                int i4 = component2 + 69;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 40 / 0;
                }
                return unit;
            }

            public static Unit ShareDataUIState(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                return (Unit) component1(549969243, MpesaGlobalActivity.component1.component1(), MpesaGlobalActivity.component1.component1(), -549969242, MpesaGlobalActivity.component1.component1(), new Object[]{shareDataAddBeneficiaryActivity}, MpesaGlobalActivity.component1.component1());
            }

            public static Unit component1(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent4 = component4(shareDataAddBeneficiaryActivity);
                int i4 = component2 + 105;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent4;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component2(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = component2 + 35;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(shareDataAddBeneficiaryActivity);
                int i4 = component2 + 41;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
                return unitCopydefault;
            }

            AnonymousClass2(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity) {
                this.component1 = shareDataAddBeneficiaryActivity;
            }

            private static final Unit component2(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity, ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormState) {
                return (Unit) component1(-366122547, MpesaGlobalActivity.component1.component1(), MpesaGlobalActivity.component1.component1(), 366122547, MpesaGlobalActivity.component1.component1(), new Object[]{shareDataAddBeneficiaryActivity, shareDataAddBeneficiaryFormState}, MpesaGlobalActivity.component1.component1());
            }

            private static Object component1(Object[] objArr) {
                ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity = (ShareDataAddBeneficiaryActivity) objArr[0];
                int i = 2 % 2;
                int i2 = copydefault + 59;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(shareDataAddBeneficiaryActivity);
                int i4 = component2 + 43;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent3;
                }
                throw null;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 43;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = component3 + 33;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i5 = ShareDataUIState + 67;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-356558856, true, new AnonymousClass2(ShareDataAddBeneficiaryActivity.this), composer, 54), composer, 1572864, 63);
        }

        copydefault() {
        }
    }

    private static void f(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 59;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i2) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) ($$m & 5);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 1759, TextUtils.indexOf("", "", 0) + 34, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 1159210934, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 5;
                    byte b5 = (byte) (b4 - 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3608, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (char) (7171 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1951385784, false, $$n(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 4014, 24 - Color.alpha(0), (char) (27761 - TextUtils.getTrimmedLength("")), -1529629956, false, $$n(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        int i7 = $11 + 17;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (cancelnotification.copydefault < i2) {
            int i9 = $11 + 31;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 4013, Color.green(0) + 24, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$n(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i10 = 89 / 0;
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 4013, ExpandableListView.getPackedPositionType(0L) + 24, (char) (27760 - TextUtils.lastIndexOf("", '0', 0)), -1529629956, false, $$n(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void e(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 63;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3761 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), ExpandableListView.getPackedPositionChild(j) + 25, (char) (ImageFormat.getBitsPerPixel(0) + 1), -1670574543, false, $$n((byte) 54, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 7140, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, (char) Color.alpha(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (component4) {
            int i8 = $11 + 81;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 2748, 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (7644 - TextUtils.indexOf("", "", 0)), -327556343, false, $$n((byte) ($$l[0] + 1), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i10 = $10 + 63;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i7 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!ShareDataUIState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b4 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 2748, 18 - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.getOffsetBefore("", 0) + 7644), -327556343, false, $$n((byte) ($$l[0] + 1), b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x1e37  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x1e43  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x017e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.onCreate(android.os.Bundle):void");
    }

    private final void navigateToConfirmation() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ShareDataAddBeneficiaryFormState value = getViewModel().getAddFormState().getValue();
        if (value == null) {
            return;
        }
        LinkedHashMap linkedHashMapLinkedMapOf = MapsKt.linkedMapOf(TuplesKt.to("Phone Number", value.getBeneficiaryMsisdn()), TuplesKt.to("Data Amount", value.getAmountAllocated() + " MBs"), TuplesKt.to("Bundle Type", value.getSelectedShareableDataType().name()), TuplesKt.to("Preferred PIN", value.getSelectedPinType().getComponent2()));
        Bundle bundle = new Bundle();
        bundle.putString("beneficiaryMsisdn", value.getBeneficiaryMsisdn());
        bundle.putString("amountAllocated", value.getAmountAllocated());
        bundle.putString("bundleType", value.getSelectedShareableDataType().name());
        bundle.putString("pinType", value.getSelectedPinType().getButtonName());
        bundle.putSerializable("confirmationFields", linkedHashMapLinkedMapOf);
        bundle.putBoolean("isShareData", true);
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE_CONFIRM, bundle, this.confirmationLauncher);
        int i4 = copy + 125;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(1512542628));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
    
        if (r1 == (((1000206828 + (((-237510984) | r2) * (-381))) + (((~((~r2) | 553835688)) | (-791210440)) * 381)) + 297371307)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        if (r1 == ((1462730901 + (((~((-523711570) | r3)) | (~(r2 | 267771334))) * 333)) + (((~(r2 | (-523711570))) | (~(r3 | 267771334))) * 333))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        super.onStart();
        r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.copy + 49;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.getAsAtTimestamp = r1 % 128;
        r1 = r1 % 2;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.copy
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L60
            java.lang.reflect.Member[] r1 = kotlin.addObserverForBackInvokerlambda7.component2
            r4 = 1
            r1 = r1[r4]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r2 = r4.getMethod(r5, r2)
            r4 = r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r2 = r2.invoke(r3, r3)
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r2 = r2.getPackageName()
            int r2 = r2.length()
            r3 = 2146611963(0x7ff2b2fb, float:NaN)
            int r2 = r2 + r3
            r3 = -237510984(0xfffffffff1d7deb8, float:-2.1378729E30)
            r3 = r3 | r2
            int r3 = r3 * (-381)
            r4 = 1000206828(0x3b9df1ec, float:0.004820099)
            int r4 = r4 + r3
            int r2 = ~r2
            r3 = 553835688(0x2102dca8, float:4.433775E-19)
            r2 = r2 | r3
            int r2 = ~r2
            r3 = -791210440(0xffffffffd0d71638, float:-2.886846E10)
            r2 = r2 | r3
            int r2 = r2 * 381
            int r4 = r4 + r2
            r2 = 297371307(0x11b986ab, float:2.927085E-28)
            int r4 = r4 + r2
            if (r1 != r4) goto L99
            goto L8c
        L60:
            java.lang.reflect.Member[] r1 = kotlin.addObserverForBackInvokerlambda7.component2
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r8)
            int r3 = ~r2
            r4 = -523711570(0xffffffffe0c8cbae, float:-1.157508E20)
            r5 = r4 | r3
            int r5 = ~r5
            r6 = 267771334(0xff5ddc6, float:2.4244289E-29)
            r7 = r2 | r6
            int r7 = ~r7
            r5 = r5 | r7
            int r5 = r5 * 333
            r7 = 1462730901(0x572f8095, float:1.9296679E14)
            int r7 = r7 + r5
            r2 = r2 | r4
            int r2 = ~r2
            r3 = r3 | r6
            int r3 = ~r3
            r2 = r2 | r3
            int r2 = r2 * 333
            int r7 = r7 + r2
            if (r1 != r7) goto L99
        L8c:
            super.onStart()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.copy
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            return
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = 1512542628(0x5a2791a4, float:1.1791614E16)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(72:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|906|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|900|32|(2:978|34)|38|39|878|(5:41|42|(1:44)|45|46)(19:48|49|898|50|51|882|52|(2:952|54)|58|59|60|(2:916|62)|66|67|68|(1:70)|71|(1:73)|74)|47|75|(9:78|866|79|(1:81)|82|83|84|984|85)|86|122|894|123|(2:933|125)|130|(6:132|914|133|134|907|135)(1:139)|888|140|141|(1:977)|(4:143|144|(1:146)|147)(54:150|(2:152|(1:158)(1:157))(1:160)|(20:162|862|163|(2:876|165)|169|170|980|171|(2:939|173)|177|178|179|(1:181)|182|183|184|(1:186)(1:188)|189|(2:191|192)|193)(43:249|250|267|959|268|(2:971|270)|274|275|956|(4:277|278|(1:280)|281)(19:283|284|943|285|(2:937|287)|291|292|935|293|(2:950|295)|299|300|301|(1:303)|304|(1:306)(1:308)|309|(2:311|312)|313)|314|(4:317|(2:319|995)(11:320|(3:322|(3:325|326|323)|996)|327|923|328|(1:330)|331|332|910|333|994)|334|315)|993|346|(3:947|377|(1:383)(1:382))(1:387)|388|925|389|(1:391)|392|912|393|(1:395)|396|397|420|884|421|(2:892|423)|427|428|881|(4:430|431|(1:433)|434)(19:436|437|864|438|(2:975|440)|444|445|982|446|(3:448|868|449)|453|454|455|(2:457|458)|459|(1:461)(1:463)|464|(1:466)|467)|468|(4:471|(2:473|999)(11:474|(3:476|(3:479|480|477)|1000)|481|973|482|(1:484)|485|486|963|487|998)|488|469)|997|500|529|(1:531)|532|(3:534|(1:536)|537)(14:538|539|(1:541)|542|543|(1:545)|546|967|547|548|(1:550)(1:551)|552|(1:554)|555)|556|(9:558|(1:560)|561|(1:563)(1:564)|565|(3:567|(1:569)|570)(16:572|573|(1:575)|576|(1:578)|579|580|(1:582)|583|969|584|585|(1:587)|588|(1:590)|591)|571|592|(18:594|929|595|(13:902|597|602|(5:896|604|605|872|606)(1:611)|927|612|613|922|(4:615|616|(1:618)|619)(4:622|(2:624|(1:630)(1:629))|(19:632|633|904|634|(3:636|874|637)|641|642|890|643|(2:931|645)|649|650|651|(1:653)|654|(2:656|657)|658|(2:660|661)|662)|709)|663|(4:666|(2:668|1003)(11:669|(3:671|(3:674|675|672)|1004)|676|879|677|(1:679)|680|681|870|682|1002)|683|664)|1001|709)(11:602|(0)(0)|927|612|613|922|(0)(0)|663|(1:664)|1001|709)|727|(1:729)|730|(3:732|(1:734)|735)(13:737|886|738|739|(1:741)|742|941|743|744|(1:746)|747|(1:749)|750)|736|751|(6:754|755|(1:757)|758|759|760)|761|(1:763)|764|(2:766|(3:768|(1:770)|771)(3:772|(1:774)|775))(14:777|778|(1:780)|781|782|(1:784)|785|954|786|787|(1:789)|790|(1:792)|793)|776|794|(1:1012)(7:797|798|(1:800)|801|802|803|804))(10:814|(3:816|(2:819|817)|1005)|820|821|(1:823)|824|(1:826)|827|828|829))(10:832|(3:834|(4:837|(3:1008|839|1011)(3:1007|840|1010)|1009|835)|1006)|841|842|(1:844)|845|(1:847)|848|849|850))|255|256|908|257|260|261|(1:263)|264|265|266|267|959|268|(0)|274|275|956|(0)(0)|314|(1:315)|993|346|(0)(0)|388|925|389|(0)|392|912|393|(0)|396|397|420|884|421|(0)|427|428|881|(0)(0)|468|(1:469)|997|500|529|(0)|532|(0)(0)|556|(0)(0))|194|(4:197|(2:199|(3:201|205|990)(12:202|206|(5:208|(1:210)(1:211)|992|(3:214|215|212)|991)|216|965|217|(1:219)|220|221|961|222|989))(2:203|(2:205|990)(11:206|(0)|216|965|217|(0)|220|221|961|222|989))|223|195)|988|250|267|959|268|(0)|274|275|956|(0)(0)|314|(1:315)|993|346|(0)(0)|388|925|389|(0)|392|912|393|(0)|396|397|420|884|421|(0)|427|428|881|(0)(0)|468|(1:469)|997|500|529|(0)|532|(0)(0)|556|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x13fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x13fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x13fd, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x13ff, code lost:
    
        r1 = r0;
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x14ac, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6617 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), 42 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.view.View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1012:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07d7 A[Catch: all -> 0x03c8, TryCatch #23 {all -> 0x03c8, blocks: (B:261:0x0efd, B:263:0x0f03, B:264:0x0f31, B:369:0x14a6, B:371:0x14ac, B:372:0x14d5, B:523:0x1ca3, B:525:0x1ca9, B:526:0x1cd3, B:721:0x2b84, B:723:0x2b8a, B:724:0x2bb3, B:755:0x2ec9, B:757:0x2ecf, B:758:0x2ef7, B:798:0x3270, B:800:0x3276, B:801:0x3296, B:778:0x30a6, B:780:0x30c9, B:781:0x3122, B:821:0x337b, B:823:0x3381, B:824:0x33ac, B:826:0x33e6, B:827:0x3427, B:573:0x22c9, B:575:0x22de, B:576:0x230c, B:578:0x2340, B:579:0x23c2, B:842:0x351f, B:844:0x3525, B:845:0x3548, B:847:0x3582, B:848:0x35be, B:539:0x1eb7, B:541:0x1ecc, B:542:0x1ef9, B:414:0x1733, B:416:0x1739, B:417:0x1766, B:116:0x07d1, B:118:0x07d7, B:119:0x0805, B:19:0x017b, B:21:0x0181, B:22:0x01a9, B:24:0x033a, B:26:0x036b, B:27:0x03c2, B:377:0x155d, B:379:0x1561, B:400:0x164d, B:402:0x1653, B:403:0x1654, B:405:0x1656, B:407:0x165d, B:408:0x165e, B:383:0x156d), top: B:906:0x017b, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0d4d A[Catch: all -> 0x0e08, TryCatch #55 {all -> 0x0e08, blocks: (B:217:0x0d47, B:219:0x0d4d, B:220:0x0d77), top: B:965:0x0d47, outer: #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0f03 A[Catch: all -> 0x03c8, TryCatch #23 {all -> 0x03c8, blocks: (B:261:0x0efd, B:263:0x0f03, B:264:0x0f31, B:369:0x14a6, B:371:0x14ac, B:372:0x14d5, B:523:0x1ca3, B:525:0x1ca9, B:526:0x1cd3, B:721:0x2b84, B:723:0x2b8a, B:724:0x2bb3, B:755:0x2ec9, B:757:0x2ecf, B:758:0x2ef7, B:798:0x3270, B:800:0x3276, B:801:0x3296, B:778:0x30a6, B:780:0x30c9, B:781:0x3122, B:821:0x337b, B:823:0x3381, B:824:0x33ac, B:826:0x33e6, B:827:0x3427, B:573:0x22c9, B:575:0x22de, B:576:0x230c, B:578:0x2340, B:579:0x23c2, B:842:0x351f, B:844:0x3525, B:845:0x3548, B:847:0x3582, B:848:0x35be, B:539:0x1eb7, B:541:0x1ecc, B:542:0x1ef9, B:414:0x1733, B:416:0x1739, B:417:0x1766, B:116:0x07d1, B:118:0x07d7, B:119:0x0805, B:19:0x017b, B:21:0x0181, B:22:0x01a9, B:24:0x033a, B:26:0x036b, B:27:0x03c2, B:377:0x155d, B:379:0x1561, B:400:0x164d, B:402:0x1653, B:403:0x1654, B:405:0x1656, B:407:0x165d, B:408:0x165e, B:383:0x156d), top: B:906:0x017b, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x101f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x107c A[Catch: all -> 0x13fc, TRY_ENTER, TRY_LEAVE, TryCatch #52 {all -> 0x13fc, blocks: (B:268:0x0fbd, B:274:0x1012, B:314:0x12a4, B:315:0x12a8, B:317:0x12ae, B:320:0x12c9, B:283:0x107c, B:301:0x1185, B:304:0x11cb, B:309:0x123f, B:313:0x129c), top: B:959:0x0fbd }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x12ae A[Catch: all -> 0x13fc, TryCatch #52 {all -> 0x13fc, blocks: (B:268:0x0fbd, B:274:0x1012, B:314:0x12a4, B:315:0x12a8, B:317:0x12ae, B:320:0x12c9, B:283:0x107c, B:301:0x1185, B:304:0x11cb, B:309:0x123f, B:313:0x129c), top: B:959:0x0fbd }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x14ac A[Catch: all -> 0x03c8, TryCatch #23 {all -> 0x03c8, blocks: (B:261:0x0efd, B:263:0x0f03, B:264:0x0f31, B:369:0x14a6, B:371:0x14ac, B:372:0x14d5, B:523:0x1ca3, B:525:0x1ca9, B:526:0x1cd3, B:721:0x2b84, B:723:0x2b8a, B:724:0x2bb3, B:755:0x2ec9, B:757:0x2ecf, B:758:0x2ef7, B:798:0x3270, B:800:0x3276, B:801:0x3296, B:778:0x30a6, B:780:0x30c9, B:781:0x3122, B:821:0x337b, B:823:0x3381, B:824:0x33ac, B:826:0x33e6, B:827:0x3427, B:573:0x22c9, B:575:0x22de, B:576:0x230c, B:578:0x2340, B:579:0x23c2, B:842:0x351f, B:844:0x3525, B:845:0x3548, B:847:0x3582, B:848:0x35be, B:539:0x1eb7, B:541:0x1ecc, B:542:0x1ef9, B:414:0x1733, B:416:0x1739, B:417:0x1766, B:116:0x07d1, B:118:0x07d7, B:119:0x0805, B:19:0x017b, B:21:0x0181, B:22:0x01a9, B:24:0x033a, B:26:0x036b, B:27:0x03c2, B:377:0x155d, B:379:0x1561, B:400:0x164d, B:402:0x1653, B:403:0x1654, B:405:0x1656, B:407:0x165d, B:408:0x165e, B:383:0x156d), top: B:906:0x017b, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1576  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x158d A[Catch: all -> 0x1655, TryCatch #34 {all -> 0x1655, blocks: (B:389:0x1578, B:391:0x158d, B:392:0x15bd), top: B:925:0x1578, outer: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x15d0 A[Catch: all -> 0x164b, TryCatch #27 {all -> 0x164b, blocks: (B:393:0x15c3, B:395:0x15d0, B:396:0x1641), top: B:912:0x15c3, outer: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x184e  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x18a4 A[Catch: all -> 0x1c33, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x1c33, blocks: (B:421:0x17ea, B:427:0x1841, B:468:0x1ade, B:469:0x1ae2, B:471:0x1ae8, B:474:0x1b01, B:436:0x18a4, B:455:0x19b8, B:459:0x19ff, B:464:0x1a74, B:467:0x1ad6), top: B:884:0x17ea }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1ae8 A[Catch: all -> 0x1c33, TryCatch #12 {all -> 0x1c33, blocks: (B:421:0x17ea, B:427:0x1841, B:468:0x1ade, B:469:0x1ae2, B:471:0x1ae8, B:474:0x1b01, B:436:0x18a4, B:455:0x19b8, B:459:0x19ff, B:464:0x1a74, B:467:0x1ad6), top: B:884:0x17ea }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x1ca9 A[Catch: all -> 0x03c8, TryCatch #23 {all -> 0x03c8, blocks: (B:261:0x0efd, B:263:0x0f03, B:264:0x0f31, B:369:0x14a6, B:371:0x14ac, B:372:0x14d5, B:523:0x1ca3, B:525:0x1ca9, B:526:0x1cd3, B:721:0x2b84, B:723:0x2b8a, B:724:0x2bb3, B:755:0x2ec9, B:757:0x2ecf, B:758:0x2ef7, B:798:0x3270, B:800:0x3276, B:801:0x3296, B:778:0x30a6, B:780:0x30c9, B:781:0x3122, B:821:0x337b, B:823:0x3381, B:824:0x33ac, B:826:0x33e6, B:827:0x3427, B:573:0x22c9, B:575:0x22de, B:576:0x230c, B:578:0x2340, B:579:0x23c2, B:842:0x351f, B:844:0x3525, B:845:0x3548, B:847:0x3582, B:848:0x35be, B:539:0x1eb7, B:541:0x1ecc, B:542:0x1ef9, B:414:0x1733, B:416:0x1739, B:417:0x1766, B:116:0x07d1, B:118:0x07d7, B:119:0x0805, B:19:0x017b, B:21:0x0181, B:22:0x01a9, B:24:0x033a, B:26:0x036b, B:27:0x03c2, B:377:0x155d, B:379:0x1561, B:400:0x164d, B:402:0x1653, B:403:0x1654, B:405:0x1656, B:407:0x165d, B:408:0x165e, B:383:0x156d), top: B:906:0x017b, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1d5d  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1dac  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1e95  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x2038  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x26c2  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x26da  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x272d  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x2990 A[Catch: all -> 0x2ad6, TryCatch #35 {all -> 0x2ad6, blocks: (B:612:0x26c4, B:663:0x2986, B:664:0x298a, B:666:0x2990, B:669:0x29aa, B:632:0x2747, B:651:0x286a, B:654:0x28b2, B:658:0x2924, B:662:0x2980), top: B:927:0x26c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:723:0x2b8a A[Catch: all -> 0x03c8, TryCatch #23 {all -> 0x03c8, blocks: (B:261:0x0efd, B:263:0x0f03, B:264:0x0f31, B:369:0x14a6, B:371:0x14ac, B:372:0x14d5, B:523:0x1ca3, B:525:0x1ca9, B:526:0x1cd3, B:721:0x2b84, B:723:0x2b8a, B:724:0x2bb3, B:755:0x2ec9, B:757:0x2ecf, B:758:0x2ef7, B:798:0x3270, B:800:0x3276, B:801:0x3296, B:778:0x30a6, B:780:0x30c9, B:781:0x3122, B:821:0x337b, B:823:0x3381, B:824:0x33ac, B:826:0x33e6, B:827:0x3427, B:573:0x22c9, B:575:0x22de, B:576:0x230c, B:578:0x2340, B:579:0x23c2, B:842:0x351f, B:844:0x3525, B:845:0x3548, B:847:0x3582, B:848:0x35be, B:539:0x1eb7, B:541:0x1ecc, B:542:0x1ef9, B:414:0x1733, B:416:0x1739, B:417:0x1766, B:116:0x07d1, B:118:0x07d7, B:119:0x0805, B:19:0x017b, B:21:0x0181, B:22:0x01a9, B:24:0x033a, B:26:0x036b, B:27:0x03c2, B:377:0x155d, B:379:0x1561, B:400:0x164d, B:402:0x1653, B:403:0x1654, B:405:0x1656, B:407:0x165d, B:408:0x165e, B:383:0x156d), top: B:906:0x017b, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:729:0x2c3f  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x2c90  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x2cec  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x2ea7  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x2f85  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x2fd7  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x3088  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x3252  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x34d3  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x17f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:896:0x2671 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x0891 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:947:0x155d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:971:0x0fc3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v144 */
    /* JADX WARN: Type inference failed for: r10v145 */
    /* JADX WARN: Type inference failed for: r10v146 */
    /* JADX WARN: Type inference failed for: r10v147 */
    /* JADX WARN: Type inference failed for: r10v148 */
    /* JADX WARN: Type inference failed for: r10v151, types: [long] */
    /* JADX WARN: Type inference failed for: r10v152 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v161 */
    /* JADX WARN: Type inference failed for: r10v166 */
    /* JADX WARN: Type inference failed for: r10v172 */
    /* JADX WARN: Type inference failed for: r10v174 */
    /* JADX WARN: Type inference failed for: r10v175, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v180 */
    /* JADX WARN: Type inference failed for: r10v181 */
    /* JADX WARN: Type inference failed for: r10v182 */
    /* JADX WARN: Type inference failed for: r10v184 */
    /* JADX WARN: Type inference failed for: r10v194 */
    /* JADX WARN: Type inference failed for: r10v195 */
    /* JADX WARN: Type inference failed for: r10v196 */
    /* JADX WARN: Type inference failed for: r10v197 */
    /* JADX WARN: Type inference failed for: r10v202 */
    /* JADX WARN: Type inference failed for: r10v207 */
    /* JADX WARN: Type inference failed for: r10v208 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v211 */
    /* JADX WARN: Type inference failed for: r10v212 */
    /* JADX WARN: Type inference failed for: r10v213 */
    /* JADX WARN: Type inference failed for: r10v214 */
    /* JADX WARN: Type inference failed for: r10v215 */
    /* JADX WARN: Type inference failed for: r10v216 */
    /* JADX WARN: Type inference failed for: r10v217 */
    /* JADX WARN: Type inference failed for: r10v218 */
    /* JADX WARN: Type inference failed for: r10v219 */
    /* JADX WARN: Type inference failed for: r10v220 */
    /* JADX WARN: Type inference failed for: r10v221 */
    /* JADX WARN: Type inference failed for: r10v222 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v107 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v110 */
    /* JADX WARN: Type inference failed for: r14v111 */
    /* JADX WARN: Type inference failed for: r14v112 */
    /* JADX WARN: Type inference failed for: r14v113 */
    /* JADX WARN: Type inference failed for: r14v114 */
    /* JADX WARN: Type inference failed for: r14v115 */
    /* JADX WARN: Type inference failed for: r14v116 */
    /* JADX WARN: Type inference failed for: r14v117 */
    /* JADX WARN: Type inference failed for: r14v118 */
    /* JADX WARN: Type inference failed for: r14v119 */
    /* JADX WARN: Type inference failed for: r14v120 */
    /* JADX WARN: Type inference failed for: r14v121 */
    /* JADX WARN: Type inference failed for: r14v122 */
    /* JADX WARN: Type inference failed for: r14v123 */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v125 */
    /* JADX WARN: Type inference failed for: r14v126 */
    /* JADX WARN: Type inference failed for: r14v127 */
    /* JADX WARN: Type inference failed for: r14v128 */
    /* JADX WARN: Type inference failed for: r14v129 */
    /* JADX WARN: Type inference failed for: r14v130 */
    /* JADX WARN: Type inference failed for: r14v131 */
    /* JADX WARN: Type inference failed for: r14v132 */
    /* JADX WARN: Type inference failed for: r14v133 */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v138 */
    /* JADX WARN: Type inference failed for: r14v139 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v55, types: [long] */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v63, types: [long] */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v82, types: [long] */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v27 */
    /* JADX WARN: Type inference failed for: r25v28 */
    /* JADX WARN: Type inference failed for: r25v29 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v30 */
    /* JADX WARN: Type inference failed for: r25v31 */
    /* JADX WARN: Type inference failed for: r25v32 */
    /* JADX WARN: Type inference failed for: r25v33 */
    /* JADX WARN: Type inference failed for: r25v34 */
    /* JADX WARN: Type inference failed for: r25v35 */
    /* JADX WARN: Type inference failed for: r25v36 */
    /* JADX WARN: Type inference failed for: r25v37 */
    /* JADX WARN: Type inference failed for: r25v38 */
    /* JADX WARN: Type inference failed for: r25v39 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v40 */
    /* JADX WARN: Type inference failed for: r25v41 */
    /* JADX WARN: Type inference failed for: r25v42 */
    /* JADX WARN: Type inference failed for: r25v43 */
    /* JADX WARN: Type inference failed for: r25v47 */
    /* JADX WARN: Type inference failed for: r25v48 */
    /* JADX WARN: Type inference failed for: r25v49 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v50 */
    /* JADX WARN: Type inference failed for: r25v51 */
    /* JADX WARN: Type inference failed for: r25v52 */
    /* JADX WARN: Type inference failed for: r25v53 */
    /* JADX WARN: Type inference failed for: r25v54 */
    /* JADX WARN: Type inference failed for: r25v55 */
    /* JADX WARN: Type inference failed for: r25v56 */
    /* JADX WARN: Type inference failed for: r25v57 */
    /* JADX WARN: Type inference failed for: r25v58 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v62 */
    /* JADX WARN: Type inference failed for: r25v63 */
    /* JADX WARN: Type inference failed for: r25v64 */
    /* JADX WARN: Type inference failed for: r25v65 */
    /* JADX WARN: Type inference failed for: r25v66 */
    /* JADX WARN: Type inference failed for: r25v67 */
    /* JADX WARN: Type inference failed for: r25v69 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v70 */
    /* JADX WARN: Type inference failed for: r25v71 */
    /* JADX WARN: Type inference failed for: r25v72 */
    /* JADX WARN: Type inference failed for: r25v73 */
    /* JADX WARN: Type inference failed for: r25v74 */
    /* JADX WARN: Type inference failed for: r25v75 */
    /* JADX WARN: Type inference failed for: r25v76 */
    /* JADX WARN: Type inference failed for: r25v77 */
    /* JADX WARN: Type inference failed for: r25v78 */
    /* JADX WARN: Type inference failed for: r25v79 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v389 */
    /* JADX WARN: Type inference failed for: r2v392 */
    /* JADX WARN: Type inference failed for: r2v409 */
    /* JADX WARN: Type inference failed for: r2v410 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v301, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v399, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v400 */
    /* JADX WARN: Type inference failed for: r4v401 */
    /* JADX WARN: Type inference failed for: r4v415 */
    /* JADX WARN: Type inference failed for: r4v417, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v418 */
    /* JADX WARN: Type inference failed for: r4v419 */
    /* JADX WARN: Type inference failed for: r4v420 */
    /* JADX WARN: Type inference failed for: r4v421 */
    /* JADX WARN: Type inference failed for: r4v422 */
    /* JADX WARN: Type inference failed for: r4v423 */
    /* JADX WARN: Type inference failed for: r4v437 */
    /* JADX WARN: Type inference failed for: r4v452 */
    /* JADX WARN: Type inference failed for: r4v467 */
    /* JADX WARN: Type inference failed for: r4v468 */
    /* JADX WARN: Type inference failed for: r4v469 */
    /* JADX WARN: Type inference failed for: r4v470 */
    /* JADX WARN: Type inference failed for: r4v471 */
    /* JADX WARN: Type inference failed for: r4v472 */
    /* JADX WARN: Type inference failed for: r4v473 */
    /* JADX WARN: Type inference failed for: r8v118, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v152, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v156, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v187, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v113 */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v116, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v141 */
    /* JADX WARN: Type inference failed for: r9v142 */
    /* JADX WARN: Type inference failed for: r9v143 */
    /* JADX WARN: Type inference failed for: r9v144 */
    /* JADX WARN: Type inference failed for: r9v145 */
    /* JADX WARN: Type inference failed for: r9v146 */
    /* JADX WARN: Type inference failed for: r9v158 */
    /* JADX WARN: Type inference failed for: r9v160 */
    /* JADX WARN: Type inference failed for: r9v161 */
    /* JADX WARN: Type inference failed for: r9v162 */
    /* JADX WARN: Type inference failed for: r9v163 */
    /* JADX WARN: Type inference failed for: r9v378 */
    /* JADX WARN: Type inference failed for: r9v379 */
    /* JADX WARN: Type inference failed for: r9v380 */
    /* JADX WARN: Type inference failed for: r9v381 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataAddBeneficiaryActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$EPvfIcG550sq1sGfeaJ0Zoy6OUM(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copy + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        contactLauncher$lambda$1(shareDataAddBeneficiaryActivity, activityResult);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public static void $r8$lambda$iQcZQtMD_D0Cwz3ayQMyVgXCMIQ(ShareDataAddBeneficiaryActivity shareDataAddBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        confirmationLauncher$lambda$2(shareDataAddBeneficiaryActivity, activityResult);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 99;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
    }

    static {
        getRequestBeneficiariesState = 1;
        ShareDataUIState();
        int i = equals + 97;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{33539, 52214, 4850, 23038, 41189, 61417, 14042, 32154, 50397, 5083, 23176, 41356, 59560, 14271, 32429, 50593, 3249, 23435, 3099, 17653, 40407, 55025, 12282, 62818, 48526, 25735, 12189, 54924, 39309, 16553, 2966, 45729, 26043, 11433, 55254, 40666, 16850, 2265, 46030, 31438, 11765, 3095, 17589, 40371, 55038, 12200, 24739, 47561, 62149, 19350, 40159, 54660, 12017, 26615, 47351, 61887, 19174, 33716, 54493, 11735, 26317, 49055, 61639, 18748, 33381, 56114, 11300, 25972, 48668, 63308, 18501, 33116, 55894, 4947, 25645, 48498, 63081, 20332, 32877, 55561, 4609, 27472, 48200, 62786, 19901, 34490, 57267, 4270, 27122, 8191, 22355, 36355, 50501, 15382, 29467, 43553, 57644, 22569, 36710, 50792, 15639, 29760, 43853, 57942, 22795, 36874, 50998, 15982, 30068, 44149, 58234, 23179, 37263, 51339, 16321, 30365, 44450, 58611, 23470, 37552, 51695, 191, 30659, 44696, 58833, 23766, 37769, 51947, 444, 30952, 45043, 59122, 24070, 38151, 52228, 785, 31306, 45342, 59426, 24440, 38456, 52534, 1085, 31555, 45595, 59678, 8192, 38739, 52835, 1377, 31849, 45942, 59946, 30445, 15889, 59161, 44037, 21773, 6662, 49974, 34867, 12605, 58926, 44844, 3141, 17592, 40369, 54957, 12199, 24739, 47513, 62104, 19349, 40074, 54666, 3138, 17598, 40379, 54956, 12199, 24738, 47517, 62098, 19359, 40074, 54658, 3150, 17597, 40372, 54952, 12202, 24743, 47517, 62104, 19344, 40078, 54662, 3150, 17593, 40378, 54945, 12199, 24743, 47518, 62101, 19359, 40078, 3138, 17598, 40379, 54956, 12199, 24738, 47517, 62098, 19359, 40074};
        component3 = -8327192018598673268L;
        component2 = new char[]{30663, 30522, 30656, 30518, 30517, 30527, 30714, 30516, 30695, 30657, 30512, 30514, 30511, 30672, 30524, 30659, 30710, 30705, 30711, 30708, 30704, 30658, 30703, 30706, 30700, 30662, 30707, 30701, 30513, 30702, 30709, 30525, 30515, 30519, 30523, 30715, 30673, 30689, 30520, 30521, 30678, 30526, 30684};
        copydefault = 321288100;
        ShareDataUIState = true;
        component4 = true;
    }
}
