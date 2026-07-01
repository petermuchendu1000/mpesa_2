package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
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
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.DataSharingResponse;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\u0012\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataDeleteBeneficiaryActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "transactionTitle", "", "isDeleteSponsor", "", "currentBeneficiaryResponse", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BeneficiaryResponse;", "pinLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "servicePinLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showPinActivity", "pinType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "executeDeleteAction", "ConsumerSfcUI_release", "deleteBeneficiaryResult", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingResponse;", "deleteSponsorResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ShareDataDeleteBeneficiaryActivity extends Hilt_ShareDataDeleteBeneficiaryActivity {
    public static final int $stable = 8;
    private static int component3;
    private static long copydefault;
    private static int getRequestBeneficiariesState;
    private BeneficiaryResponse currentBeneficiaryResponse;
    private boolean isDeleteSponsor;

    private final Lazy viewModel;
    private static final byte[] $$l = {79, Ascii.ETB, 89, Ascii.VT};
    private static final int $$m = 209;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {79, 9, 94, -7, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, TarHeader.LF_DIR, -78, 0, 13, -7, 5, TarHeader.LF_CONTIG, PSSSigner.TRAILER_IMPLICIT, 10, -4, TarHeader.LF_NORMAL, 1, -8, 7, -56, -3, 0, -14, 9, -3, -15, 66, -22, -33, -19, 13, -14, 9, -3, Ascii.SYN, -26, -17, 17, -5, 1, -21, 17, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13, -14, 0, -5, -1, -1, 7, -11, -8, 63, -14, 0, Base64.padSymbol, -60, -15, Ascii.DC2, -24, Ascii.DLE, -6, 57, -56, -7, 0, -4, -13, 17, -13, -6, 13, -26, 10, 6, -11, -8, 68, -55, -14, -1, -7, -4, 6, 6, -15, 66, -71, Ascii.VT, 1, -20, 10, 57, -73, 10, 57, -53, -4, -19, 9, -15, Ascii.VT, -13, -7, 73, -39, -20, -11, 8, Ascii.NAK, -36, -1, 7, -22, TarHeader.LF_FIFO, -36, -19, 9, -15, Ascii.VT, -13, -7, 44, -43, 78, -65, -14, 0, -5, -1, -1, 7, -11, -8, 63, -14, 0, Base64.padSymbol, -53, -13, 1, 5, -1, -3, -1, TarHeader.LF_LINK, -59, -13, 7, -15, Ascii.SI, -15, 66, -73, 10, 57, -62, -11, Ascii.DLE, -17, 5, 57, PSSSigner.TRAILER_IMPLICIT, 5, 4, -10, 4, -15, 66, -27, -45, 7, -15, Ascii.SI, -15, 44, -35, -3, 3, -22, 7, -10, 35, -35, -6, 9, -8, -1, -7, 33, -27, 4, -10, 4, -15, 43, -53, 2, 13, -11, -7, 8, -8, -1, 35, -38, -5, 2, 70, -15, -14, 0, -5, -1, -1, 7, -11, -8, SignedBytes.MAX_POWER_OF_TWO, -14, 0, Base64.padSymbol, -71, Ascii.DLE, -7, 3, -19, 7, 4, -14, 0, Base64.padSymbol, -71, 9, 5, -19, Ascii.VT, -1, -19, 10, 57, -55, -14, 0, -5, -1, -6, Ascii.FF, TarHeader.LF_DIR, -55, -14, -1, 6, -5, -11, 3, 10, -21, 9, -8, -1, 62, -23, -46, -1, 6, -5, -11, 3, 34, -39, 6, -11, 36, -45, 13, -10, 71, -31, -36, -19, 9, -8, -1, 41, -39, -3, -9, 74, -33, -49, Ascii.VT, 2, -21, 3, -5};
    private static final int $$k = 221;
    private static final byte[] $$d = {4, -66, -36, 8, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 162;
    private static int component2 = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private String transactionTitle = "Delete Sponsor";
    private final ActivityResultLauncher<Intent> pinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component2 = 0;
        private static int copydefault = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataDeleteBeneficiaryActivity.$r8$lambda$mHJGfERxp9KXA_NnUUHaoBWIPrE(this.f$0, (ActivityResult) obj);
            int i4 = copydefault + 19;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    });
    private final ActivityResultLauncher<Intent> servicePinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component2 = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity = this.f$0;
            ActivityResult activityResult = (ActivityResult) obj;
            if (i3 == 0) {
                ShareDataDeleteBeneficiaryActivity.$r8$lambda$bjdkoUsOL2ceCCPNlg697rVzccw(shareDataDeleteBeneficiaryActivity, activityResult);
            } else {
                ShareDataDeleteBeneficiaryActivity.$r8$lambda$bjdkoUsOL2ceCCPNlg697rVzccw(shareDataDeleteBeneficiaryActivity, activityResult);
                int i4 = 41 / 0;
            }
        }
    });

    private static String $$n(int i, short s, byte b2) {
        int i2 = s * 4;
        int i3 = i + 65;
        byte[] bArr = $$l;
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i4]) + i3;
            i4++;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 28 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.$$d
            int r6 = 99 - r6
            int r8 = r8 * 2
            int r8 = r8 + 83
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.h(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.$$j
            int r6 = 240 - r6
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r1 = 83 - r7
            byte[] r1 = new byte[r1]
            int r7 = 82 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.i(int, int, short, java.lang.Object[]):void");
    }

    public static final BeneficiaryResponse access$getCurrentBeneficiaryResponse$p(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        BeneficiaryResponse beneficiaryResponse = shareDataDeleteBeneficiaryActivity.currentBeneficiaryResponse;
        int i5 = i3 + 75;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return beneficiaryResponse;
    }

    public static final ShareDataViewModel access$getViewModel(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataViewModel viewModel = shareDataDeleteBeneficiaryActivity.getViewModel();
        int i4 = component1 + 75;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return viewModel;
    }

    public static final boolean access$isDeleteSponsor$p(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = shareDataDeleteBeneficiaryActivity.isDeleteSponsor;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return z;
    }

    public static final void access$showPinActivity(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, PinValidationType pinValidationType) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        shareDataDeleteBeneficiaryActivity.showPinActivity(pinValidationType);
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ShareDataDeleteBeneficiaryActivity() {
        final ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareDataViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i = 2 % 2;
                int i2 = component3 + 49;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    viewModelStore = shareDataDeleteBeneficiaryActivity.getViewModelStore();
                    int i3 = 89 / 0;
                } else {
                    viewModelStore = shareDataDeleteBeneficiaryActivity.getViewModelStore();
                }
                int i4 = component3 + 81;
                copydefault = i4 % 128;
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
                int i2 = component3 + 105;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 != 0) {
                    int i4 = 51 / 0;
                }
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
                int i = 2 % 2;
                int i2 = component3 + 13;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 65;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return factoryInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 33;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = shareDataDeleteBeneficiaryActivity.getDefaultViewModelProviderFactory();
                int i4 = ShareDataUIState + 121;
                component3 = i4 % 128;
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
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity$special$$inlined$viewModels$default$3.copydefault
                    int r2 = r2 + 83
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r3
                    int r2 = r2 % r0
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r2 != 0) goto L1f
                    r2 = 80
                    int r2 = r2 / 0
                    if (r1 != 0) goto L27
                    goto L21
                L1f:
                    if (r1 != 0) goto L27
                L21:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L27:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity$special$$inlined$viewModels$default$3.copydefault
                    int r2 = r2 + 79
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r3
                    int r2 = r2 % r0
                    if (r2 == 0) goto L33
                    return r1
                L33:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = ShareDataUIState + 19;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
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
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ShareDataViewModel shareDataViewModel = (ShareDataViewModel) this.viewModel.getValue();
        int i3 = component1 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return shareDataViewModel;
    }

    private static final void pinLauncher$lambda$0(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        Intent data = activityResult.getData();
        Object obj = null;
        String stringExtra = data != null ? data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN2) : null;
        if (stringExtra == null) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 15;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 73;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = stringExtra;
        }
        if (activityResult.getResultCode() == -1 && str.length() > 0) {
            int i6 = component1 + 121;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            shareDataDeleteBeneficiaryActivity.executeDeleteAction();
            return;
        }
        if (activityResult.getResultCode() != 0) {
            int i8 = ShareDataUIState + 9;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            ToastHelperKt.showCustomToast$default(shareDataDeleteBeneficiaryActivity, "PIN entry failed.", 0L, (Integer) null, (String) null, (Function0) null, 30, (Object) null);
        }
    }

    private static final void servicePinLauncher$lambda$1(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i4 = component1 + 39;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                shareDataDeleteBeneficiaryActivity.executeDeleteAction();
                return;
            } else {
                shareDataDeleteBeneficiaryActivity.executeDeleteAction();
                int i5 = 71 / 0;
                return;
            }
        }
        if (activityResult.getResultCode() != 0) {
            int i6 = ShareDataUIState + 71;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            ToastHelperKt.showCustomToast$default(shareDataDeleteBeneficiaryActivity, "Service PIN validation failed.", 0L, (Integer) null, (String) null, (Function0) null, 30, (Object) null);
            int i8 = component1 + 27;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 2;
            }
        }
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 29;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 3267, 33 - (Process.myTid() >> 22), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 60267), -834797019, false, $$n((byte) 37, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() & copydefault & 5431355972723572778L;
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 687, 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (60373 - KeyEvent.getDeadChar(0, 0)), -1969106284, false, $$n((byte) 40, b3, b3), new Class[]{Object.class, Object.class});
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
                int i7 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 3266, 33 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60268), -834797019, false, $$n((byte) 37, b4, b4), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (Process.myTid() >> 22), 35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (60372 - ExpandableListView.getPackedPositionChild(0L)), -1969106284, false, $$n((byte) 40, b5, b5), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 103;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 687, Color.red(0) + 34, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60374), -1969106284, false, $$n((byte) 40, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final ShareDataDeleteBeneficiaryActivity component1;

            public static Object copydefault(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~i6;
                int i8 = ~i2;
                int i9 = ~(i7 | i8 | i4);
                int i10 = ~i4;
                int i11 = (~(i7 | i10)) | (~(i8 | i6 | i4));
                int i12 = (~(i4 | i7)) | (~(i8 | i10));
                int i13 = i6 + i2 + i5 + ((-1255669517) * i3) + (533247121 * i);
                int i14 = i13 * i13;
                int i15 = ((i6 * (-1895547823)) - 858849280) + ((-1895547823) * i2) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i5) + (760610816 * i3) + ((-1057882112) * i) + (1344208896 * i14);
                int i16 = ((i6 * (-122328301)) - 2132886715) + (i2 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i5 * (-122328029)) + (i3 * (-1196579527)) + (i * 656595923) + (i14 * 138215424);
                return i15 + ((i16 * i16) * (-833028096)) != 1 ? component3(objArr) : component1(objArr);
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                Unit unit;
                int i = 2 % 2;
                int i2 = copydefault + 63;
                ShareDataUIState = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    component3(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                    int i3 = 79 / 0;
                } else {
                    component3(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                }
                int i4 = copydefault + 55;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copy(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 115;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
                shareDataDeleteBeneficiaryActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 119;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component3(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, ShareDataBeneficiary shareDataBeneficiary, PinValidationType pinValidationType) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 29;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
                Intrinsics.checkNotNullParameter(shareDataBeneficiary, "");
                Intrinsics.checkNotNullParameter(pinValidationType, "");
                ShareDataDeleteBeneficiaryActivity.access$showPinActivity(shareDataDeleteBeneficiaryActivity, pinValidationType);
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 17;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component1(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 87;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
                    shareDataDeleteBeneficiaryActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
                shareDataDeleteBeneficiaryActivity.finish();
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component1() {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 1;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 30 / 0;
                }
                return unit;
            }

            private static final void ShareDataUIState(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 21;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
                    shareDataDeleteBeneficiaryActivity.finish();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(shareDataDeleteBeneficiaryActivity, "");
                shareDataDeleteBeneficiaryActivity.finish();
                int i3 = copydefault + 57;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:70:0x027f  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x029f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component3(androidx.compose.runtime.Composer r25, int r26) {
                /*
                    Method dump skipped, instruction units count: 704
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.component2.AnonymousClass1.component3(androidx.compose.runtime.Composer, int):void");
            }

            private static final Resource<DataSharingResponse> ShareDataUIState(State<Resource<DataSharingResponse>> state) {
                int i = 2 % 2;
                int i2 = copydefault + 75;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Resource<DataSharingResponse> value = state.getValue();
                int i4 = copydefault + 123;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return value;
                }
                throw null;
            }

            private static Object component3(Object[] objArr) {
                State state = (State) objArr[0];
                int i = 2 % 2;
                int i2 = copydefault + 81;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Resource resource = (Resource) state.getValue();
                if (i3 != 0) {
                    return resource;
                }
                throw null;
            }

            public static Unit ShareDataUIState(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, ShareDataBeneficiary shareDataBeneficiary, PinValidationType pinValidationType) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 73;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(shareDataDeleteBeneficiaryActivity, shareDataBeneficiary, pinValidationType);
                int i4 = ShareDataUIState + 37;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit component3(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopy = copy(shareDataDeleteBeneficiaryActivity);
                int i4 = ShareDataUIState + 5;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitCopy;
            }

            public static void copydefault(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                int iComponent3 = zzpj.component3();
                int iComponent32 = zzpj.component3();
                int iComponent33 = zzpj.component3();
                copydefault(zzpj.component3(), new Object[]{shareDataDeleteBeneficiaryActivity}, -389607412, iComponent33, iComponent3, iComponent32, 389607413);
            }

            public static Unit component2(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(shareDataDeleteBeneficiaryActivity);
                int i4 = ShareDataUIState + 17;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent1;
                }
                throw null;
            }

            public static Unit component3() {
                int i = 2 % 2;
                int i2 = copydefault + 61;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component1();
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent1 = component1();
                int i3 = copydefault + 45;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitComponent1;
                }
                throw null;
            }

            AnonymousClass1(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity) {
                this.component1 = shareDataDeleteBeneficiaryActivity;
            }

            private static final Resource<DataSharingResponse> component1(State<Resource<DataSharingResponse>> state) {
                int iComponent3 = zzpj.component3();
                int iComponent32 = zzpj.component3();
                int iComponent33 = zzpj.component3();
                return (Resource) copydefault(zzpj.component3(), new Object[]{state}, 562855611, iComponent33, iComponent3, iComponent32, -562855611);
            }

            private static Object component1(Object[] objArr) {
                ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity = (ShareDataDeleteBeneficiaryActivity) objArr[0];
                int i = 2 % 2;
                int i2 = copydefault + 27;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(shareDataDeleteBeneficiaryActivity);
                if (i3 != 0) {
                    return null;
                }
                throw null;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            return unit;
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 117;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if ((i & 11) == 2) {
                int i6 = i4 + 51;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i8 = component1 + 73;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(881232146, true, new AnonymousClass1(ShareDataDeleteBeneficiaryActivity.this), composer, 54), composer, 1572864, 63);
        }

        component2() {
        }
    }

    private static void f(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3783, TextUtils.getOffsetBefore("", 0) + 38, (char) (Color.red(0) + 26860), 2015799920, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7405 - TextUtils.indexOf((CharSequence) "", '0', 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, (char) Drawable.resolveOpacity(0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 81;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i8 = $10 + 111;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.getOffsetBefore("", 0), KeyEvent.keyCodeFromString("") + 16, (char) View.resolveSizeAndState(0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 35;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x23b0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x23b1  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x23c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x23c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0221  */
    /* JADX WARN: Type inference failed for: r4v124, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.onCreate(android.os.Bundle):void");
    }

    private final void showPinActivity(PinValidationType pinType) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("titleText", this.transactionTitle);
        bundle.putString("imageLink", "https://placehold.co/60x60/38a169/ffffff?text=SHARE");
        bundle.putString("titleText", this.transactionTitle);
        if (pinType != PinValidationType.SERVICE_PIN) {
            RouteUtils.routeWithExecute(this, "/sfcModule/identityPin", bundle, this.pinLauncher);
            return;
        }
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_SERVICE_PIN, bundle, this.servicePinLauncher);
        int i4 = component1 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r11.isDeleteSponsor == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        getViewModel().setSelectedSponsor(new com.huawei.digitalpayment.consumer.sfcui.sharedata.model.SponsorResponse(r2.getMsisdn(), r2.getLimitValue(), r2.getRemainderValue(), r2.getUsageValue(), r2.getBundleType(), r2.getStartTime(), r2.getEndTime()));
        getViewModel().deleteSponsor();
        r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.component1 + 99;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.ShareDataUIState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        getViewModel().setSelectedBeneficiary(r2);
        getViewModel().deleteBeneficiary();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 27;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.component1 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void executeDeleteAction() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.ShareDataUIState
            int r2 = r1 + 121
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.component1 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse r2 = r11.currentBeneficiaryResponse
            r3 = 12
            int r3 = r3 / 0
            if (r2 != 0) goto L2a
            goto L1b
        L17:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse r2 = r11.currentBeneficiaryResponse
            if (r2 != 0) goto L2a
        L1b:
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L25
            return
        L25:
            r0 = 0
            r0.hashCode()
            throw r0
        L2a:
            r1 = r11
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r1)
            boolean r1 = r11.isDeleteSponsor
            if (r1 == 0) goto L6e
            java.lang.String r4 = r2.getMsisdn()
            java.lang.String r5 = r2.getLimitValue()
            java.lang.String r6 = r2.getRemainderValue()
            java.lang.String r7 = r2.getUsageValue()
            java.lang.String r8 = r2.getBundleType()
            java.lang.String r9 = r2.getStartTime()
            java.lang.String r10 = r2.getEndTime()
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.SponsorResponse r1 = new com.huawei.digitalpayment.consumer.sfcui.sharedata.model.SponsorResponse
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r2 = r11.getViewModel()
            r2.setSelectedSponsor(r1)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r1 = r11.getViewModel()
            r1.deleteSponsor()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.component1
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            goto L7c
        L6e:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r0 = r11.getViewModel()
            r0.setSelectedBeneficiary(r2)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r0 = r11.getViewModel()
            r0.deleteBeneficiary()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.executeDeleteAction():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 63530, new char[]{52466, 13498, 15481, 9268, 11744, 5529, 7517, 1356, 3786, 30364, 32293, 26544, 28550, 22379, 24325, 16595, 18581, 45133, 47129, 41391, 43339, 37160, 39675, 33431, 35418, 61976}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 13308, new char[]{52464, 65307, 43803, 22294, 770, 53004, 64265, 42809, 21259, 7942, 51997, 63269, 41772, 28459, 6961, 50985, 62252, 48944}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = component1 + 107;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = component1 + 23;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.red(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -960739708, false, "component3", new Class[]{Context.class});
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
            Method dump skipped, instruction units count: 15388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataDeleteBeneficiaryActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$bjdkoUsOL2ceCCPNlg697rVzccw(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        servicePinLauncher$lambda$1(shareDataDeleteBeneficiaryActivity, activityResult);
        int i4 = ShareDataUIState + 61;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$mHJGfERxp9KXA_NnUUHaoBWIPrE(ShareDataDeleteBeneficiaryActivity shareDataDeleteBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        pinLauncher$lambda$0(shareDataDeleteBeneficiaryActivity, activityResult);
        int i4 = ShareDataUIState + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    static {
        getRequestBeneficiariesState = 1;
        ShareDataUIState();
        int i = component2 + 31;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component1 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        copydefault = -5398683808814379847L;
        component3 = -890926554;
    }
}
