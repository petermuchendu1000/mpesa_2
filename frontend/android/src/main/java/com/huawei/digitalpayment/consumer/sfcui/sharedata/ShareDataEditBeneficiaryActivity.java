package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0;
import com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.DataSharingResponse;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataEditBeneficiaryActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "transactionTitle", "", "currentBeneficiary", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BeneficiaryResponse;", "pinLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "servicePinLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showPinActivity", "pinType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "executeEditAction", "ConsumerSfcUI_release", "editFormState", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/manage/ShareDataEditBeneficiaryFormState;", "updateBeneficiaryResult", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingResponse;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ShareDataEditBeneficiaryActivity extends Hilt_ShareDataEditBeneficiaryActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static long component2;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    private BeneficiaryResponse currentBeneficiary;

    private final Lazy viewModel;
    private static final byte[] $$l = {41, -64, -63, -4};
    private static final int $$m = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {102, Ascii.GS, -34, 39, 10, Ascii.VT, -2, 3, Ascii.VT, Ascii.DLE, PSSSigner.TRAILER_IMPLICIT, 59, Ascii.DC2, 9, 3, Ascii.FF, 5, -5, Ascii.VT, -3, 20, -63, 59, Ascii.VT, -1, 19, 6, -3, 13, 13, -63, 40, 40, 3, -5, Ascii.ETB, -12, 8, 19, -25, Ascii.SYN, Ascii.DC2, 7, -5, -59, 38, 39, 7, 1, Ascii.SUB, -3, Ascii.SO, -37, 42, 9, 2, 13, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, 57, 17, 3, -1, 5, 7, 5, -45, 63, 17, -3, 19, -11, 19, -62, 58, 5, Ascii.CAN, -8, -49, 77, -6, -53, 79, -8, 1, 9, 4, Ascii.NAK, -64, Ascii.US, TarHeader.LF_LINK, -3, 19, -11, 19, -41, 43, 3, 4, Ascii.SO, -35, TarHeader.LF_CHR, Ascii.SI, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.FF, -59, 74, -7, 2, 8, Ascii.ETB, -5, 19, -11, Ascii.EM, PSSSigner.TRAILER_IMPLICIT, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 71, 7, -5, 19, -11, Ascii.EM, 1, 9, 7, -63, 71, -7, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -49, 39, Ascii.EM, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -8, Ascii.CAN, Ascii.VT, -4, 17, Ascii.SO, -47, TarHeader.LF_CHR, Ascii.FF, -1, -4, 3, Ascii.ETB, 13, -79, 69, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, 63, Ascii.SO, 6, -2, Ascii.VT, -1, -49, 62, 9, Ascii.SI, -7, 3, 5, Ascii.CAN, -8, -49, 75, -8, 20, 6, -4, Ascii.FF, 5, Ascii.VT, -63, 60, 3, Ascii.FF, 6, 4, 19, -62, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 40, 40, -7, 4, Ascii.DC2, 5, -4, Ascii.VT, 17, -5, Ascii.FF, 5, Ascii.VT, Ascii.ESC, -1, Ascii.ETB, -7, -27, 35, Ascii.EM, -13, -6, -6, Ascii.DLE, 39, -13, Ascii.EM, -9};
    private static final int $$k = 190;
    private static final byte[] $$d = {125, 44, 8, -98, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = BERTags.FLAGS;
    private static int component4 = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private String transactionTitle = "Update Beneficiary";
    private final ActivityResultLauncher<Intent> pinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component2 = 1;
        private static int component3;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataEditBeneficiaryActivity.$r8$lambda$QCPwG5ZNybjDuURqYsmqGKNMXZU(this.f$0, (ActivityResult) obj);
            int i4 = component3 + 61;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
        }
    });
    private final ActivityResultLauncher<Intent> servicePinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component2 = 1;
        private static int copydefault;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataEditBeneficiaryActivity.$r8$lambda$RPIxTsZKIohWOOLiGRYQC6h4i9I(this.f$0, (ActivityResult) obj);
            int i4 = copydefault + 49;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
        }
    });

    private static String $$n(int i, byte b2, int i2) {
        byte[] bArr = $$l;
        int i3 = 3 - (b2 * 3);
        int i4 = i * 4;
        int i5 = 119 - (i2 * 16);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i5 = (-i3) + i4;
            i3 = i3;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i5;
            int i8 = i3 + 1;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i5 = (-bArr[i8]) + i5;
            i3 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.$$d
            int r7 = 100 - r7
            int r9 = 28 - r9
            int r8 = r8 * 2
            int r8 = r8 + 83
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.h(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.$$j
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-6)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.i(short, short, short, java.lang.Object[]):void");
    }

    public static final ShareDataViewModel access$getViewModel(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            shareDataEditBeneficiaryActivity.getViewModel();
            obj.hashCode();
            throw null;
        }
        ShareDataViewModel viewModel = shareDataEditBeneficiaryActivity.getViewModel();
        int i3 = component3 + 109;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return viewModel;
        }
        throw null;
    }

    public static final void access$showPinActivity(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, PinValidationType pinValidationType) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        shareDataEditBeneficiaryActivity.showPinActivity(pinValidationType);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = component3 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public ShareDataEditBeneficiaryActivity() {
        final ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareDataViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 65;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = shareDataEditBeneficiaryActivity.getViewModelStore();
                int i4 = ShareDataUIState + 37;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 59;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = ShareDataUIState + 117;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1(shareDataEditBeneficiaryActivity), new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 81;
                int i3 = i2 % 128;
                copydefault = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 23;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return shareDataEditBeneficiaryActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 113;
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
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataViewModel shareDataViewModel = (ShareDataViewModel) this.viewModel.getValue();
        int i4 = component3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return shareDataViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void pinLauncher$lambda$0(com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity r24, androidx.activity.result.ActivityResult r25) {
        /*
            r0 = r24
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r3 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            android.content.Intent r4 = r25.getData()
            r5 = 0
            if (r4 == 0) goto L1d
            java.lang.String r6 = "encryptPin2"
            java.lang.String r4 = r4.getStringExtra(r6)
            goto L27
        L1d:
            int r4 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1
            int r4 = r4 + 123
            int r6 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3 = r6
            int r4 = r4 % r1
            r4 = r5
        L27:
            if (r4 != 0) goto L39
            int r4 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3
            int r4 = r4 + 19
            int r6 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1 = r6
            int r4 = r4 % r1
            if (r4 == 0) goto L3a
            r4 = 16
            int r4 = r4 / 0
            goto L3a
        L39:
            r2 = r4
        L3a:
            int r4 = r25.getResultCode()
            r6 = -1
            if (r4 != r6) goto L5a
            int r4 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1
            int r4 = r4 + 23
            int r6 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3 = r6
            int r4 = r4 % r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L5a
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse r2 = r0.currentBeneficiary
            if (r2 == 0) goto L5a
            r24.executeEditAction()
            goto L90
        L5a:
            int r2 = r25.getResultCode()
            if (r2 == 0) goto L90
            int r2 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3
            int r2 = r2 + 101
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1 = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L7c
            r6 = r0
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.String r7 = "PIN entry failed."
            r8 = 3000(0xbb8, double:1.482E-320)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 123(0x7b, float:1.72E-43)
            r14 = 0
            com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt.showCustomToast$default(r6, r7, r8, r10, r11, r12, r13, r14)
            goto L90
        L7c:
            r15 = r0
            android.app.Activity r15 = (android.app.Activity) r15
            java.lang.String r16 = "PIN entry failed."
            r17 = 3000(0xbb8, double:1.482E-320)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 28
            r23 = 0
            com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt.showCustomToast$default(r15, r16, r17, r19, r20, r21, r22, r23)
        L90:
            int r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3
            int r0 = r0 + 7
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1 = r2
            int r0 = r0 % r1
            if (r0 != 0) goto L9c
            return
        L9c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.pinLauncher$lambda$0(com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity, androidx.activity.result.ActivityResult):void");
    }

    private static final void servicePinLauncher$lambda$1(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1 && shareDataEditBeneficiaryActivity.currentBeneficiary != null) {
            int i2 = component3 + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            shareDataEditBeneficiaryActivity.executeEditAction();
            int i4 = component3 + 9;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (activityResult.getResultCode() != 0) {
            int i6 = component3 + 71;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                ToastHelperKt.showCustomToast$default(shareDataEditBeneficiaryActivity, "Service PIN validation failed.", 3000L, (Integer) null, (String) null, (Function0) null, 116, (Object) null);
            } else {
                ToastHelperKt.showCustomToast$default(shareDataEditBeneficiaryActivity, "Service PIN validation failed.", 3000L, (Integer) null, (String) null, (Function0) null, 28, (Object) null);
            }
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 75;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                break;
            }
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 7033, (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) ((Process.myPid() >> 22) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 1390, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 51269), -1883291598, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 45;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component2;
        final ShareDataBeneficiary component1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 1;
            private static int component3;
            final ShareDataBeneficiary ShareDataUIState;
            final ShareDataEditBeneficiaryActivity copydefault;

            public static Object component3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
                int i7 = ~(i2 | i4);
                int i8 = (~i3) | (~i4);
                int i9 = (~i8) | i2;
                int i10 = (~(i4 | i3)) | (~((~i2) | i3)) | (~(i8 | i2));
                int i11 = i3 + i2 + i + ((-101282902) * i6) + ((-829309908) * i5);
                int i12 = i11 * i11;
                int i13 = ((i3 * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i) + (1710751744 * i6) + ((-1643118592) * i5) + ((-1134166016) * i12);
                int i14 = (i3 * 1745018779) + 1790267665 + (i2 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i * 1745018721) + (i6 * (-1587019414)) + (i5 * (-1871011668)) + (i12 * 1017511936);
                return i13 + ((i14 * i14) * (-1139146752)) != 1 ? ShareDataUIState(objArr) : component2(objArr);
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component1 + 45;
                component3 = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    component1(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
                component1(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final Unit component1(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, ShareDataEditBeneficiaryFormState shareDataEditBeneficiaryFormState) {
                int i = 2 % 2;
                int i2 = component3 + 59;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryActivity, "");
                Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryFormState, "");
                ShareDataEditBeneficiaryActivity.access$getViewModel(shareDataEditBeneficiaryActivity).updateEditFormState(shareDataEditBeneficiaryFormState);
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 113;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit copydefault(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, State state, ShareDataBeneficiary shareDataBeneficiary) {
                int i = 2 % 2;
                int i2 = component3 + 43;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryActivity, "");
                Intrinsics.checkNotNullParameter(state, "");
                Intrinsics.checkNotNullParameter(shareDataBeneficiary, "");
                ShareDataEditBeneficiaryActivity.access$showPinActivity(shareDataEditBeneficiaryActivity, component3((State<ShareDataEditBeneficiaryFormState>) state).getSelectedPinType());
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 47;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component1(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = component3 + 59;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryActivity, "");
                    shareDataEditBeneficiaryActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryActivity, "");
                shareDataEditBeneficiaryActivity.finish();
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final void component3(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = component3 + 105;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(shareDataEditBeneficiaryActivity, "");
                shareDataEditBeneficiaryActivity.finish();
                int i4 = component1 + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component1(androidx.compose.runtime.Composer r26, int r27) {
                /*
                    Method dump skipped, instruction units count: 493
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1.AnonymousClass4.component1(androidx.compose.runtime.Composer, int):void");
            }

            private static final ShareDataEditBeneficiaryFormState component3(State<ShareDataEditBeneficiaryFormState> state) {
                int i = 2 % 2;
                int i2 = component3 + 89;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataEditBeneficiaryFormState value = state.getValue();
                if (i3 == 0) {
                    int i4 = 76 / 0;
                }
                int i5 = component3 + 49;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return value;
            }

            private static final Resource<DataSharingResponse> component1(State<Resource<DataSharingResponse>> state) {
                int i = 2 % 2;
                int i2 = component1 + 115;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Resource<DataSharingResponse> value = state.getValue();
                int i4 = component3 + 19;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return value;
                }
                throw null;
            }

            public static Unit component3(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, State state, ShareDataBeneficiary shareDataBeneficiary) {
                int iComponent3 = ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3();
                return (Unit) component3(ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3(), -528854163, 528854164, iComponent3, new Object[]{shareDataEditBeneficiaryActivity, state, shareDataBeneficiary}, ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3(), ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3());
            }

            public static Unit component2(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity) {
                int iComponent3 = ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3();
                return (Unit) component3(ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3(), 1749283703, -1749283703, iComponent3, new Object[]{shareDataEditBeneficiaryActivity}, ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3(), ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0.component3());
            }

            public static void copydefault(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = component1 + 67;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                component3(shareDataEditBeneficiaryActivity);
                int i4 = component3 + 65;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, ShareDataEditBeneficiaryFormState shareDataEditBeneficiaryFormState) {
                int i = 2 % 2;
                int i2 = component1 + 51;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(shareDataEditBeneficiaryActivity, shareDataEditBeneficiaryFormState);
                int i4 = component1 + 23;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent1;
            }

            AnonymousClass4(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, ShareDataBeneficiary shareDataBeneficiary) {
                this.copydefault = shareDataEditBeneficiaryActivity;
                this.ShareDataUIState = shareDataBeneficiary;
            }

            private static Object ShareDataUIState(Object[] objArr) {
                ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity = (ShareDataEditBeneficiaryActivity) objArr[0];
                int i = 2 % 2;
                int i2 = component1 + 25;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(shareDataEditBeneficiaryActivity);
                int i4 = component1 + 95;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 51 / 0;
                }
                return unitComponent1;
            }

            private static Object component2(Object[] objArr) {
                ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity = (ShareDataEditBeneficiaryActivity) objArr[0];
                State state = (State) objArr[1];
                ShareDataBeneficiary shareDataBeneficiary = (ShareDataBeneficiary) objArr[2];
                int i = 2 % 2;
                int i2 = component3 + 23;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(shareDataEditBeneficiaryActivity, state, shareDataBeneficiary);
                int i4 = component3 + 37;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitCopydefault;
                }
                throw null;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 111;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 101;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 67) == 2) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i4 = component2 + 13;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-721952078, true, new AnonymousClass4(ShareDataEditBeneficiaryActivity.this, this.component1), composer, 54), composer, 1572864, 63);
        }

        component1(ShareDataBeneficiary shareDataBeneficiary) {
            this.component1 = shareDataBeneficiary;
        }
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int length;
        char[] cArr2;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = ShareDataUIState;
        char c2 = '0';
        Object obj2 = null;
        if (cArr3 != null) {
            int i7 = $10 + 51;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2) + 7423, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, (char) (64290 - ((byte) KeyEvent.getModifierMetaStateMask())), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 15, (char) (64291 - (ViewConfiguration.getLongPressTimeout() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 51;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    i3 = i5;
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[i5] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int iIndexOf = 7116 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iIndexOf2 = 14 - TextUtils.indexOf("", "", 0);
                            char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44462);
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[i5] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[8] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, c3, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = cancelall;
                            objArr5[9] = Integer.valueOf(cCharValue);
                            objArr5[8] = cancelall;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = cancelall;
                            objArr5[4] = cancelall;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[i5] = Integer.valueOf(cCharValue);
                            objArr5[1] = cancelall;
                            objArr5[0] = cancelall;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 2945, 24 - Drawable.resolveOpacity(0, 0), (char) (27637 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 794909189, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr3[i10];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr3[i11];
                                cArr4[cancelall.component2 + 1] = cArr3[i12];
                            } else {
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr3[i13];
                                cArr4[cancelall.component2 + 1] = cArr3[i14];
                                int i15 = $10 + 99;
                                $11 = i15 % 128;
                                i3 = 2;
                                int i16 = i15 % 2;
                            }
                        }
                        i3 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += i3;
                obj2 = obj;
                i5 = 2;
            }
        }
        int i17 = $10 + 41;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x2206  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x2207  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x013d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.onCreate(android.os.Bundle):void");
    }

    private final void showPinActivity(PinValidationType pinType) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("titleText", this.transactionTitle);
        bundle.putString("imageLink", "https://placehold.co/60x60/38a169/ffffff?text=UPDATE");
        bundle.putString("titleText", this.transactionTitle);
        if (pinType == PinValidationType.SERVICE_PIN) {
            int i2 = component3 + 97;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_SERVICE_PIN, bundle, this.servicePinLauncher);
                int i3 = 2 / 0;
                return;
            } else {
                RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_SERVICE_PIN, bundle, this.servicePinLauncher);
                return;
            }
        }
        RouteUtils.routeWithExecute(this, "/sfcModule/identityPin", bundle, this.pinLauncher);
        int i4 = component1 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void executeEditAction() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L29
            r1 = r10
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r1)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r1 = r10.getViewModel()
            androidx.lifecycle.LiveData r1 = r1.getEditFormState()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState r1 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState) r1
            r2 = 18
            int r2 = r2 / 0
            if (r1 != 0) goto L4d
            goto L3f
        L29:
            r1 = r10
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r1)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r1 = r10.getViewModel()
            androidx.lifecycle.LiveData r1 = r1.getEditFormState()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState r1 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState) r1
            if (r1 != 0) goto L4d
        L3f:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState r1 = new com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 31
            r9 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L4d:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r2 = r10.getViewModel()
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse r3 = r10.currentBeneficiary
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r2.setSelectedBeneficiary(r3)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r2 = r10.getViewModel()
            androidx.lifecycle.MutableLiveData r2 = r2.getNewDataAmount()
            java.lang.String r1 = r1.getAmountAllocated()
            r2.setValue(r1)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.BeneficiaryResponse r1 = r10.currentBeneficiary
            if (r1 == 0) goto L72
            java.lang.String r1 = r1.getBundleType()
            if (r1 != 0) goto L7d
        L72:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3 = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
        L7d:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r0 = r10.getViewModel()
            androidx.lifecycle.MutableLiveData r0 = r0.getBundleType()
            kotlin.Pair r2 = new kotlin.Pair
            r3 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.<init>(r3, r1)
            r0.setValue(r2)
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r0 = r10.getViewModel()
            r0.updateBeneficiary()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.executeEditAction():void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 109, new char[]{2825, 12122, 20561, 8615, 2920, 57988, 52053, 18629, 15782, 11075, 33301, 48729, 26344, 5146, 22721, 63257, 44808, 24265, 28549, 11422, 53375, 34691, 9797, 26062, 6813, 61506, 64771, 23314, 17384, 14606}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 16, new char[]{31, 14, 13917, 13917, CharUtils.CR, 15, '\"', 23, 13919, 13919, JSONLexer.EOI, 22, 31, 2, ' ', 23, 2, 17}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 88), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = component1 + 95;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, (ViewConfiguration.getScrollBarSize() >> 8) + 42, (char) (Color.rgb(0, 0, 0) + 16777216), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 6562, View.getDefaultSize(0, 0) + 56, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -699576857, false, "component2", new Class[]{Context.class});
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
        int i4 = component1 + 91;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|814|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(5:769|32|(2:782|34)|38|39)|(5:833|(5:41|42|(1:44)|45|46)(24:47|48|767|49|50|757|51|(2:761|53)|57|58|836|59|(2:776|61)|65|66|67|(2:843|69)|73|74|75|(1:77)|78|(1:80)|81)|82|(4:85|(3:849|87|852)(12:848|88|(3:90|(3:93|94|91)|853)|95|823|96|(1:98)|99|100|815|101|851)|850|83)|847)|144|(11:838|(2:146|(2:148|(1:154)(1:153))(2:157|158))(1:159)|160|808|161|(1:163)|164|798|165|(1:167)|168)|192|775|193|(1:195)|196|(1:198)|199|(3:201|(1:203)|204)(6:205|(2:207|(1:213)(1:212))(1:214)|(18:216|771|217|(1:219)|220|221|763|222|(1:224)|225|226|227|(1:229)|230|(1:232)(1:233)|234|(1:236)|237)(24:292|760|293|(1:295)|296|(3:298|(1:300)|301)(19:302|303|839|304|(1:306)|307|308|829|309|(1:311)|312|313|314|(1:316)|317|(1:319)|320|(1:322)|323)|324|(4:327|(3:863|329|(3:861|331|868)(12:860|335|(3:337|(4:340|(3:871|342|874)(4:870|343|344|873)|872|338)|869)|345|821|346|(1:348)|349|350|810|351|867))(3:859|332|(3:862|334|866)(12:864|335|(0)|345|821|346|(0)|349|350|810|351|867))|865|325)|858|386|759|387|(1:389)|390|(3:392|(1:394)|395)(14:397|398|841|399|(1:401)|402|403|404|(1:406)|407|(1:409)|410|(1:412)|413)|396|414|(9:417|831|418|(1:420)|421|422|423|819|424)|454|(1:456)|457|(3:459|(1:461)|462)(14:463|464|(1:466)|467|468|(1:470)|471|825|472|473|(1:475)|476|(1:478)|479)|480|(37:482|(1:484)|485|(1:487)|488|(3:490|(1:492)|493)(16:495|496|(1:498)|499|(1:501)|502|503|(1:505)|506|789|507|508|(1:510)|511|(1:513)|514)|494|515|(1:517)(9:518|(3:520|(2:523|521)|882)|524|525|(1:527)|528|(1:530)|531|532)|533|794|534|(2:806|536)|540|541|792|542|(4:544|545|791|546)(1:547)|548|(3:550|(1:552)|553)(17:554|(2:556|(1:562)(1:561))|(19:564|565|787|566|(1:568)|569|570|780|571|(1:573)|574|575|576|(1:578)|579|(1:581)|582|(1:584)|585)|647|(1:649)|650|(3:652|(1:654)|655)(13:657|765|658|659|(1:661)|662|802|663|664|(1:666)|667|(1:669)|670)|656|671|(6:674|675|(1:677)|678|679|680)|681|(1:683)|684|(3:686|(1:688)|689)(14:691|692|(1:694)|695|696|(1:698)|699|812|700|701|(1:703)|704|(1:706)|707)|690|708|(2:710|884)(7:711|712|(1:714)|715|716|717|718))|586|(4:589|(3:877|591|880)(12:876|592|(3:594|(3:597|598|595)|881)|599|778|600|(1:602)|603|604|773|605|879)|878|587)|875|647|(0)|650|(0)(0)|656|671|(0)|681|(0)|684|(0)(0)|690|708|(0)(0))(10:730|(3:732|(2:735|733)|883)|736|737|(1:739)|740|(1:742)|743|744|745))|748|749|(1:751)(1:752))|238|(4:241|(2:243|856)(11:244|(3:246|(3:249|250|247)|857)|251|845|252|(1:254)|255|256|834|257|855)|258|239)|854|292|760|293|(0)|296|(0)(0)|324|(1:325)|858|386|759|387|(0)|390|(0)(0)|396|414|(0)|454|(0)|457|(0)(0)|480|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|814|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|769|32|(2:782|34)|38|39|(5:833|(5:41|42|(1:44)|45|46)(24:47|48|767|49|50|757|51|(2:761|53)|57|58|836|59|(2:776|61)|65|66|67|(2:843|69)|73|74|75|(1:77)|78|(1:80)|81)|82|(4:85|(3:849|87|852)(12:848|88|(3:90|(3:93|94|91)|853)|95|823|96|(1:98)|99|100|815|101|851)|850|83)|847)|144|(11:838|(2:146|(2:148|(1:154)(1:153))(2:157|158))(1:159)|160|808|161|(1:163)|164|798|165|(1:167)|168)|192|775|193|(1:195)|196|(1:198)|199|(3:201|(1:203)|204)(6:205|(2:207|(1:213)(1:212))(1:214)|(18:216|771|217|(1:219)|220|221|763|222|(1:224)|225|226|227|(1:229)|230|(1:232)(1:233)|234|(1:236)|237)(24:292|760|293|(1:295)|296|(3:298|(1:300)|301)(19:302|303|839|304|(1:306)|307|308|829|309|(1:311)|312|313|314|(1:316)|317|(1:319)|320|(1:322)|323)|324|(4:327|(3:863|329|(3:861|331|868)(12:860|335|(3:337|(4:340|(3:871|342|874)(4:870|343|344|873)|872|338)|869)|345|821|346|(1:348)|349|350|810|351|867))(3:859|332|(3:862|334|866)(12:864|335|(0)|345|821|346|(0)|349|350|810|351|867))|865|325)|858|386|759|387|(1:389)|390|(3:392|(1:394)|395)(14:397|398|841|399|(1:401)|402|403|404|(1:406)|407|(1:409)|410|(1:412)|413)|396|414|(9:417|831|418|(1:420)|421|422|423|819|424)|454|(1:456)|457|(3:459|(1:461)|462)(14:463|464|(1:466)|467|468|(1:470)|471|825|472|473|(1:475)|476|(1:478)|479)|480|(37:482|(1:484)|485|(1:487)|488|(3:490|(1:492)|493)(16:495|496|(1:498)|499|(1:501)|502|503|(1:505)|506|789|507|508|(1:510)|511|(1:513)|514)|494|515|(1:517)(9:518|(3:520|(2:523|521)|882)|524|525|(1:527)|528|(1:530)|531|532)|533|794|534|(2:806|536)|540|541|792|542|(4:544|545|791|546)(1:547)|548|(3:550|(1:552)|553)(17:554|(2:556|(1:562)(1:561))|(19:564|565|787|566|(1:568)|569|570|780|571|(1:573)|574|575|576|(1:578)|579|(1:581)|582|(1:584)|585)|647|(1:649)|650|(3:652|(1:654)|655)(13:657|765|658|659|(1:661)|662|802|663|664|(1:666)|667|(1:669)|670)|656|671|(6:674|675|(1:677)|678|679|680)|681|(1:683)|684|(3:686|(1:688)|689)(14:691|692|(1:694)|695|696|(1:698)|699|812|700|701|(1:703)|704|(1:706)|707)|690|708|(2:710|884)(7:711|712|(1:714)|715|716|717|718))|586|(4:589|(3:877|591|880)(12:876|592|(3:594|(3:597|598|595)|881)|599|778|600|(1:602)|603|604|773|605|879)|878|587)|875|647|(0)|650|(0)(0)|656|671|(0)|681|(0)|684|(0)(0)|690|708|(0)(0))(10:730|(3:732|(2:735|733)|883)|736|737|(1:739)|740|(1:742)|743|744|745))|748|749|(1:751)(1:752))|238|(4:241|(2:243|856)(11:244|(3:246|(3:249|250|247)|857)|251|845|252|(1:254)|255|256|834|257|855)|258|239)|854|292|760|293|(0)|296|(0)(0)|324|(1:325)|858|386|759|387|(0)|390|(0)(0)|396|414|(0)|454|(0)|457|(0)(0)|480|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x10bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x10bc, code lost:
    
        r5 = new java.lang.Object[1];
        f(android.view.KeyEvent.getMaxKeyCode() >> 16, new char[]{51354, 9121, 45758, 28645, 51369, 60965, 10733, 1728, 65123, 10214, 24749, 61453, 42281, 6311, 47718}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x10d6, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x10ed, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x10f1, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x1120, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x1124, code lost:
    
        if (r1 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x1126, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 6617, 42 - android.view.View.combineMeasuredStates(0, 0), (char) android.text.TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x114e, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1156, code lost:
    
        r7 = new java.lang.Object[]{-1014110750, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 'h' - android.text.AndroidCharacter.getMirror('0'), (char) android.graphics.Color.blue(0));
        r9 = new java.lang.Object[1];
        i(r3[219(0xdb, float:3.07E-43)], r3[37], (byte) (com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.$$j[48] - 1), r9);
        r2.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x1622, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x1623, code lost:
    
        r4 = new java.lang.Object[1];
        f(1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), new char[]{6532, 38737, 19142, 21656, 6576, 23251, 53663, 15804, 12157, 37655, 39121, 52090, 29757, 44119, 16918}, r4);
        r3 = (java.lang.String) r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x163e, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1655, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1659, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x1688, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x168c, code lost:
    
        if (r5 == null) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x168e, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6617 - android.text.TextUtils.lastIndexOf("", '0', 0), android.view.KeyEvent.keyCodeFromString("") + 42, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x16ba, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x16c2, code lost:
    
        r7 = new java.lang.Object[]{-1014110750, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6562, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
        r9 = new java.lang.Object[1];
        i(r2[219(0xdb, float:3.07E-43)], r2[37], (byte) (com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.$$j[48] - 1), r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1aa2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1aa3, code lost:
    
        r5 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 46, new char[]{51796, 62408, 5491, 2156, 51813, 15951, 36386, 24907, 64685, 63360, 51045, 38789, 42981, 51392, 7591}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x1adc, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x1af3, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x1af7, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x1b26, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x1b2a, code lost:
    
        if (r5 == null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x1b2c, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.getCapsMode("", 0, 0) + 42, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x1b53, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x1b5a, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component1 + 103;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x1b65, code lost:
    
        r7 = new java.lang.Object[]{-1014110750, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 6562, 56 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
        r9 = new java.lang.Object[1];
        i(r2[219(0xdb, float:3.07E-43)], r2[37], (byte) (com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.$$j[48] - 1), r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0846 A[Catch: all -> 0x037e, TryCatch #31 {all -> 0x037e, blocks: (B:675:0x2f65, B:677:0x2f6b, B:678:0x2f98, B:712:0x32d3, B:714:0x32d9, B:715:0x3306, B:692:0x30f7, B:694:0x311a, B:695:0x316c, B:640:0x2c1f, B:642:0x2c25, B:643:0x2c4d, B:525:0x24fc, B:527:0x2502, B:528:0x252e, B:530:0x2568, B:531:0x25b1, B:496:0x2168, B:498:0x217d, B:499:0x21b3, B:501:0x21e7, B:502:0x226b, B:737:0x33fa, B:739:0x3400, B:740:0x342b, B:742:0x3465, B:743:0x34ad, B:464:0x1d56, B:466:0x1d6b, B:467:0x1d9d, B:448:0x1b26, B:450:0x1b2c, B:451:0x1b53, B:380:0x1688, B:382:0x168e, B:383:0x16ba, B:286:0x1120, B:288:0x1126, B:289:0x114e, B:186:0x0ab4, B:188:0x0aba, B:189:0x0ae9, B:138:0x0840, B:140:0x0846, B:141:0x086a, B:19:0x0192, B:21:0x0198, B:22:0x01c2, B:24:0x02ee, B:26:0x031f, B:27:0x0378), top: B:814:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0936 A[Catch: all -> 0x09f6, TryCatch #28 {all -> 0x09f6, blocks: (B:161:0x0921, B:163:0x0936, B:164:0x0969), top: B:808:0x0921, outer: #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x097c A[Catch: all -> 0x09ec, TryCatch #23 {all -> 0x09ec, blocks: (B:165:0x096f, B:167:0x097c, B:168:0x09e4), top: B:798:0x096f, outer: #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0b74 A[Catch: all -> 0x10bb, TryCatch #10 {all -> 0x10bb, blocks: (B:193:0x0b6e, B:195:0x0b74, B:196:0x0bbb, B:198:0x0be2, B:199:0x0c2f, B:201:0x0c45, B:203:0x0c4e, B:204:0x0c94, B:238:0x0f78, B:239:0x0f7c, B:241:0x0f82, B:244:0x0f9c, B:247:0x0fa8, B:249:0x0fab, B:261:0x1095, B:263:0x109b, B:264:0x109c, B:266:0x109e, B:268:0x10a5, B:269:0x10a6, B:207:0x0ca7, B:209:0x0cab, B:216:0x0cbf, B:227:0x0e4f, B:229:0x0e55, B:230:0x0e99, B:232:0x0ec3, B:234:0x0f11, B:236:0x0f28, B:237:0x0f72, B:271:0x10a8, B:273:0x10af, B:274:0x10b0, B:276:0x10b2, B:278:0x10b9, B:279:0x10ba, B:213:0x0cb7, B:222:0x0d9f, B:224:0x0dc3, B:225:0x0e43, B:217:0x0d4f, B:219:0x0d63, B:220:0x0d98, B:257:0x1011, B:252:0x0fd9, B:254:0x0fdf, B:255:0x1009), top: B:775:0x0b6e, outer: #15, inners: #4, #8, #42, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0be2 A[Catch: all -> 0x10bb, TryCatch #10 {all -> 0x10bb, blocks: (B:193:0x0b6e, B:195:0x0b74, B:196:0x0bbb, B:198:0x0be2, B:199:0x0c2f, B:201:0x0c45, B:203:0x0c4e, B:204:0x0c94, B:238:0x0f78, B:239:0x0f7c, B:241:0x0f82, B:244:0x0f9c, B:247:0x0fa8, B:249:0x0fab, B:261:0x1095, B:263:0x109b, B:264:0x109c, B:266:0x109e, B:268:0x10a5, B:269:0x10a6, B:207:0x0ca7, B:209:0x0cab, B:216:0x0cbf, B:227:0x0e4f, B:229:0x0e55, B:230:0x0e99, B:232:0x0ec3, B:234:0x0f11, B:236:0x0f28, B:237:0x0f72, B:271:0x10a8, B:273:0x10af, B:274:0x10b0, B:276:0x10b2, B:278:0x10b9, B:279:0x10ba, B:213:0x0cb7, B:222:0x0d9f, B:224:0x0dc3, B:225:0x0e43, B:217:0x0d4f, B:219:0x0d63, B:220:0x0d98, B:257:0x1011, B:252:0x0fd9, B:254:0x0fdf, B:255:0x1009), top: B:775:0x0b6e, outer: #15, inners: #4, #8, #42, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0c45 A[Catch: all -> 0x10bb, TryCatch #10 {all -> 0x10bb, blocks: (B:193:0x0b6e, B:195:0x0b74, B:196:0x0bbb, B:198:0x0be2, B:199:0x0c2f, B:201:0x0c45, B:203:0x0c4e, B:204:0x0c94, B:238:0x0f78, B:239:0x0f7c, B:241:0x0f82, B:244:0x0f9c, B:247:0x0fa8, B:249:0x0fab, B:261:0x1095, B:263:0x109b, B:264:0x109c, B:266:0x109e, B:268:0x10a5, B:269:0x10a6, B:207:0x0ca7, B:209:0x0cab, B:216:0x0cbf, B:227:0x0e4f, B:229:0x0e55, B:230:0x0e99, B:232:0x0ec3, B:234:0x0f11, B:236:0x0f28, B:237:0x0f72, B:271:0x10a8, B:273:0x10af, B:274:0x10b0, B:276:0x10b2, B:278:0x10b9, B:279:0x10ba, B:213:0x0cb7, B:222:0x0d9f, B:224:0x0dc3, B:225:0x0e43, B:217:0x0d4f, B:219:0x0d63, B:220:0x0d98, B:257:0x1011, B:252:0x0fd9, B:254:0x0fdf, B:255:0x1009), top: B:775:0x0b6e, outer: #15, inners: #4, #8, #42, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0f82 A[Catch: all -> 0x10bb, TryCatch #10 {all -> 0x10bb, blocks: (B:193:0x0b6e, B:195:0x0b74, B:196:0x0bbb, B:198:0x0be2, B:199:0x0c2f, B:201:0x0c45, B:203:0x0c4e, B:204:0x0c94, B:238:0x0f78, B:239:0x0f7c, B:241:0x0f82, B:244:0x0f9c, B:247:0x0fa8, B:249:0x0fab, B:261:0x1095, B:263:0x109b, B:264:0x109c, B:266:0x109e, B:268:0x10a5, B:269:0x10a6, B:207:0x0ca7, B:209:0x0cab, B:216:0x0cbf, B:227:0x0e4f, B:229:0x0e55, B:230:0x0e99, B:232:0x0ec3, B:234:0x0f11, B:236:0x0f28, B:237:0x0f72, B:271:0x10a8, B:273:0x10af, B:274:0x10b0, B:276:0x10b2, B:278:0x10b9, B:279:0x10ba, B:213:0x0cb7, B:222:0x0d9f, B:224:0x0dc3, B:225:0x0e43, B:217:0x0d4f, B:219:0x0d63, B:220:0x0d98, B:257:0x1011, B:252:0x0fd9, B:254:0x0fdf, B:255:0x1009), top: B:775:0x0b6e, outer: #15, inners: #4, #8, #42, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x11da A[Catch: all -> 0x1622, TryCatch #2 {all -> 0x1622, blocks: (B:293:0x11d4, B:295:0x11da, B:296:0x1223, B:298:0x1230, B:300:0x1239, B:301:0x1282, B:324:0x14a7, B:325:0x14ab, B:329:0x14bd, B:335:0x14ed, B:338:0x14fa, B:342:0x1509, B:343:0x1511, B:355:0x15fc, B:357:0x1602, B:358:0x1603, B:360:0x1605, B:362:0x160c, B:363:0x160d, B:332:0x14d5, B:302:0x128d, B:314:0x138a, B:316:0x1390, B:317:0x13d1, B:319:0x13fb, B:320:0x1440, B:322:0x1457, B:323:0x14a1, B:365:0x160f, B:367:0x1616, B:368:0x1617, B:370:0x1619, B:372:0x1620, B:373:0x1621, B:351:0x157c, B:346:0x153d, B:348:0x1543, B:349:0x1574, B:309:0x12f7, B:311:0x130c, B:312:0x137e, B:304:0x12ad, B:306:0x12c2, B:307:0x12f0), top: B:760:0x11d4, outer: #15, inners: #29, #35, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1230 A[Catch: all -> 0x1622, TryCatch #2 {all -> 0x1622, blocks: (B:293:0x11d4, B:295:0x11da, B:296:0x1223, B:298:0x1230, B:300:0x1239, B:301:0x1282, B:324:0x14a7, B:325:0x14ab, B:329:0x14bd, B:335:0x14ed, B:338:0x14fa, B:342:0x1509, B:343:0x1511, B:355:0x15fc, B:357:0x1602, B:358:0x1603, B:360:0x1605, B:362:0x160c, B:363:0x160d, B:332:0x14d5, B:302:0x128d, B:314:0x138a, B:316:0x1390, B:317:0x13d1, B:319:0x13fb, B:320:0x1440, B:322:0x1457, B:323:0x14a1, B:365:0x160f, B:367:0x1616, B:368:0x1617, B:370:0x1619, B:372:0x1620, B:373:0x1621, B:351:0x157c, B:346:0x153d, B:348:0x1543, B:349:0x1574, B:309:0x12f7, B:311:0x130c, B:312:0x137e, B:304:0x12ad, B:306:0x12c2, B:307:0x12f0), top: B:760:0x11d4, outer: #15, inners: #29, #35, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x128d A[Catch: all -> 0x1622, TRY_LEAVE, TryCatch #2 {all -> 0x1622, blocks: (B:293:0x11d4, B:295:0x11da, B:296:0x1223, B:298:0x1230, B:300:0x1239, B:301:0x1282, B:324:0x14a7, B:325:0x14ab, B:329:0x14bd, B:335:0x14ed, B:338:0x14fa, B:342:0x1509, B:343:0x1511, B:355:0x15fc, B:357:0x1602, B:358:0x1603, B:360:0x1605, B:362:0x160c, B:363:0x160d, B:332:0x14d5, B:302:0x128d, B:314:0x138a, B:316:0x1390, B:317:0x13d1, B:319:0x13fb, B:320:0x1440, B:322:0x1457, B:323:0x14a1, B:365:0x160f, B:367:0x1616, B:368:0x1617, B:370:0x1619, B:372:0x1620, B:373:0x1621, B:351:0x157c, B:346:0x153d, B:348:0x1543, B:349:0x1574, B:309:0x12f7, B:311:0x130c, B:312:0x137e, B:304:0x12ad, B:306:0x12c2, B:307:0x12f0), top: B:760:0x11d4, outer: #15, inners: #29, #35, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x14b1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x14f9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1543 A[Catch: all -> 0x1604, TryCatch #35 {all -> 0x1604, blocks: (B:346:0x153d, B:348:0x1543, B:349:0x1574), top: B:821:0x153d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x1749 A[Catch: all -> 0x1aa2, TryCatch #1 {all -> 0x1aa2, blocks: (B:387:0x1743, B:389:0x1749, B:390:0x178b, B:392:0x1798, B:394:0x17a1, B:395:0x17e5, B:414:0x1992, B:422:0x19fd, B:428:0x1a86, B:430:0x1a8c, B:431:0x1a8d, B:433:0x1a8f, B:435:0x1a96, B:436:0x1a97, B:397:0x17f1, B:404:0x1875, B:406:0x187b, B:407:0x18c2, B:409:0x18ec, B:410:0x1931, B:412:0x1947, B:413:0x198a, B:438:0x1a99, B:440:0x1aa0, B:441:0x1aa1, B:424:0x1a03, B:418:0x19c7, B:420:0x19cd, B:421:0x19f6, B:399:0x1811, B:401:0x1823, B:402:0x1869), top: B:759:0x1743, outer: #15, inners: #34, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1798 A[Catch: all -> 0x1aa2, TryCatch #1 {all -> 0x1aa2, blocks: (B:387:0x1743, B:389:0x1749, B:390:0x178b, B:392:0x1798, B:394:0x17a1, B:395:0x17e5, B:414:0x1992, B:422:0x19fd, B:428:0x1a86, B:430:0x1a8c, B:431:0x1a8d, B:433:0x1a8f, B:435:0x1a96, B:436:0x1a97, B:397:0x17f1, B:404:0x1875, B:406:0x187b, B:407:0x18c2, B:409:0x18ec, B:410:0x1931, B:412:0x1947, B:413:0x198a, B:438:0x1a99, B:440:0x1aa0, B:441:0x1aa1, B:424:0x1a03, B:418:0x19c7, B:420:0x19cd, B:421:0x19f6, B:399:0x1811, B:401:0x1823, B:402:0x1869), top: B:759:0x1743, outer: #15, inners: #34, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x17f1 A[Catch: all -> 0x1aa2, TRY_LEAVE, TryCatch #1 {all -> 0x1aa2, blocks: (B:387:0x1743, B:389:0x1749, B:390:0x178b, B:392:0x1798, B:394:0x17a1, B:395:0x17e5, B:414:0x1992, B:422:0x19fd, B:428:0x1a86, B:430:0x1a8c, B:431:0x1a8d, B:433:0x1a8f, B:435:0x1a96, B:436:0x1a97, B:397:0x17f1, B:404:0x1875, B:406:0x187b, B:407:0x18c2, B:409:0x18ec, B:410:0x1931, B:412:0x1947, B:413:0x198a, B:438:0x1a99, B:440:0x1aa0, B:441:0x1aa1, B:424:0x1a03, B:418:0x19c7, B:420:0x19cd, B:421:0x19f6, B:399:0x1811, B:401:0x1823, B:402:0x1869), top: B:759:0x1743, outer: #15, inners: #34, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x19a4  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1bea  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x1c3f  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1d37  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1ed5  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2c25 A[Catch: all -> 0x037e, TryCatch #31 {all -> 0x037e, blocks: (B:675:0x2f65, B:677:0x2f6b, B:678:0x2f98, B:712:0x32d3, B:714:0x32d9, B:715:0x3306, B:692:0x30f7, B:694:0x311a, B:695:0x316c, B:640:0x2c1f, B:642:0x2c25, B:643:0x2c4d, B:525:0x24fc, B:527:0x2502, B:528:0x252e, B:530:0x2568, B:531:0x25b1, B:496:0x2168, B:498:0x217d, B:499:0x21b3, B:501:0x21e7, B:502:0x226b, B:737:0x33fa, B:739:0x3400, B:740:0x342b, B:742:0x3465, B:743:0x34ad, B:464:0x1d56, B:466:0x1d6b, B:467:0x1d9d, B:448:0x1b26, B:450:0x1b2c, B:451:0x1b53, B:380:0x1688, B:382:0x168e, B:383:0x16ba, B:286:0x1120, B:288:0x1126, B:289:0x114e, B:186:0x0ab4, B:188:0x0aba, B:189:0x0ae9, B:138:0x0840, B:140:0x0846, B:141:0x086a, B:19:0x0192, B:21:0x0198, B:22:0x01c2, B:24:0x02ee, B:26:0x031f, B:27:0x0378), top: B:814:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2ce6  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x2d38  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x2d8f  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x2f43  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x302d  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x3086  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x30d9  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x32a7  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x32b3  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x33b8  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x355a  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x355b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x016d  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r29v39 */
    /* JADX WARN: Type inference failed for: r29v40 */
    /* JADX WARN: Type inference failed for: r29v67 */
    /* JADX WARN: Type inference failed for: r7v124 */
    /* JADX WARN: Type inference failed for: r7v125 */
    /* JADX WARN: Type inference failed for: r7v126 */
    /* JADX WARN: Type inference failed for: r7v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v140 */
    /* JADX WARN: Type inference failed for: r7v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v294 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$QCPwG5ZNybjDuURqYsmqGKNMXZU(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        pinLauncher$lambda$0(shareDataEditBeneficiaryActivity, activityResult);
        int i4 = component3 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$RPIxTsZKIohWOOLiGRYQC6h4i9I(ShareDataEditBeneficiaryActivity shareDataEditBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        servicePinLauncher$lambda$1(shareDataEditBeneficiaryActivity, activityResult);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
    }

    static {
        getRequestBeneficiariesState = 1;
        component1();
        int i = component4 + 45;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component3 + 107;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        ShareDataUIState = new char[]{2000, 2017, 2001, 2041, 2032, 2031, 1975, 2018, 1987, 2022, 1965, 2020, 2021, 2037, 2030, 1968, 1973, 1977, 2029, 1992, 2025, 1969, 1985, 2035, 2034, 2024, 1966, 1972, 2028, 1976, 1970, 2002, 2019, 1971, 1974, 2036};
        copydefault = (char) 12828;
        component2 = -3048121665920638687L;
    }
}
