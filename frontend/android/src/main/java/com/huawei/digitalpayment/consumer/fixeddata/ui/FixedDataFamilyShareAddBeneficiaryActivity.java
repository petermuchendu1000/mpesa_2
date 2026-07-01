package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity;
import com.huawei.digitalpayment.consumer.fixeddata.ui.screen.FixedDataAddBeneficiaryScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataFamilyShareAddBeneficiaryActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "selectedContactMsisdn", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "selectedContactName", "confirmationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "contactLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release", "initialMsisdn"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataFamilyShareAddBeneficiaryActivity extends Hilt_FixedDataFamilyShareAddBeneficiaryActivity {
    public static final int $stable = 8;
    private static int ArtificialStackFrames;
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char[] component3;
    private static char copy;
    private static int copydefault;
    private static char equals;
    private static final byte[] $$c = {115, 102, 60, 8};
    private static final int $$f = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {57, Ascii.SYN, -21, -92, -10, 4, 65, PSSSigner.TRAILER_IMPLICIT, 20, -17, 8, 3, 1, 4, 0, 67, -70, Ascii.SI, 6, -16, 9, 17, -4, 4, -11, Ascii.DLE, -9, -3, 3, Ascii.FF, -3, Ascii.FF, -3, 8, 4, -17, 7, -1, 70, -34, TarHeader.LF_NORMAL, -70, 13, -22, Ascii.FF, -4, 3, -10, 1, -7, Ascii.ETB, 1, 1, 7, -18, Ascii.VT, -6, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 67, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 69, -1, 13, 59, -50, -11, -4, 9, 13, -20, Ascii.CAN, 4, -16, 1, 10, 9, 57, -64, 1, Ascii.DLE, TarHeader.LF_CONTIG, -58, 9, 4, -7, 9, 0, 57, -64, 0, 5, -5, Ascii.SI, 7, 1, -11, 70, -72, 13, -4, 2, 71, -40, 13, -4, 2, 8, -5, Ascii.VT, -24, -18, 43, -15, -6, -7, 45, -28, -7, Ascii.VT, -11, 19, -17, 7, -1, 33, -27, 9};
    private static final int $$h = 242;
    private static final byte[] $$a = {80, 83, -21, -55, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 53;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private MutableStateFlow<String> selectedContactMsisdn = StateFlowKt.MutableStateFlow("");
    private MutableStateFlow<String> selectedContactName = StateFlowKt.MutableStateFlow("");
    private final ActivityResultLauncher<Intent> confirmationLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 67;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                FixedDataFamilyShareAddBeneficiaryActivity.$r8$lambda$U0Rb7hOtXp5e6Y0LEqBnTbg1Ntw(this.f$0, (ActivityResult) obj);
                throw null;
            }
            FixedDataFamilyShareAddBeneficiaryActivity.$r8$lambda$U0Rb7hOtXp5e6Y0LEqBnTbg1Ntw(this.f$0, (ActivityResult) obj);
            int i3 = component1 + 115;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
    });
    private final ActivityResultLauncher<Intent> contactLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FixedDataFamilyShareAddBeneficiaryActivity.$r8$lambda$CJt7USv2fHIruYNCa0UEWZnvZGs(this.f$0, (ActivityResult) obj);
            int i4 = component3 + 43;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 119 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.$$i(byte, int, byte):java.lang.String");
    }

    private static void c(byte b2, int i, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (s * 2) + 83;
        int i3 = 99 - i;
        byte[] bArr2 = new byte[28 - b2];
        int i4 = 27 - b2;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + i4) - 8;
            i3 = i3;
        }
        while (true) {
            i5++;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i6]) - 8;
                i3 = i6;
            }
        }
    }

    private static void d(short s, short s2, short s3, Object[] objArr) {
        byte[] bArr = $$g;
        int i = s + 4;
        int i2 = (s3 * 12) + 99;
        byte[] bArr2 = new byte[s2 + 10];
        int i3 = s2 + 9;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = i3 + (-i) + 2;
            i = i;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            int i6 = i + 1;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i5;
            i2 = i2 + (-bArr[i6]) + 2;
            i = i6;
        }
    }

    public static final ActivityResultLauncher access$getConfirmationLauncher$p(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataFamilyShareAddBeneficiaryActivity.confirmationLauncher;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return activityResultLauncher;
    }

    public static final ActivityResultLauncher access$getContactLauncher$p(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = component4 + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataFamilyShareAddBeneficiaryActivity.contactLauncher;
        if (i3 != 0) {
            return activityResultLauncher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$getSelectedContactMsisdn$p(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<String> mutableStateFlow = fixedDataFamilyShareAddBeneficiaryActivity.selectedContactMsisdn;
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        int i6 = i3 + 7;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return mutableStateFlow;
    }

    public static final MutableStateFlow access$getSelectedContactName$p(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<String> mutableStateFlow = fixedDataFamilyShareAddBeneficiaryActivity.selectedContactName;
        int i5 = i3 + 83;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    private static final void confirmationLauncher$lambda$0(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fixedDataFamilyShareAddBeneficiaryActivity, "");
            Intrinsics.checkNotNullParameter(activityResult, "");
            activityResult.getResultCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataFamilyShareAddBeneficiaryActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            fixedDataFamilyShareAddBeneficiaryActivity.finish();
            int i3 = getAsAtTimestamp + 101;
            component4 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[PHI: r5
  0x006c: PHI (r5v2 kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>) = 
  (r5v1 kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>)
  (r5v5 kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>)
 binds: [B:18:0x006a, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[PHI: r5 r6
  0x0076: PHI (r5v4 kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>) = 
  (r5v1 kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>)
  (r5v5 kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>)
 binds: [B:18:0x006a, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r6v8 java.lang.String) = (r6v4 java.lang.String), (r6v9 java.lang.String) binds: [B:18:0x006a, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void contactLauncher$lambda$2(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity r5, androidx.activity.result.ActivityResult r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            if (r6 == 0) goto L7a
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.getAsAtTimestamp
            int r2 = r2 + 37
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component4 = r3
            int r2 = r2 % r0
            int r2 = r6.getResultCode()
            r3 = -1
            if (r2 != r3) goto L7a
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.getAsAtTimestamp
            int r2 = r2 + 109
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component4 = r3
            int r2 = r2 % r0
            android.content.Intent r6 = r6.getData()
            if (r6 == 0) goto L7a
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.getAsAtTimestamp
            int r2 = r2 + 57
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component4 = r3
            int r2 = r2 % r0
            java.lang.String r2 = "contactResp"
            java.io.Serializable r6 = r6.getSerializableExtra(r2)
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact r6 = (com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact) r6
            if (r6 == 0) goto L7a
            java.lang.String r2 = r6.getRealPhoneNumber()
            if (r2 == 0) goto L7a
            int r3 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.getAsAtTimestamp
            int r3 = r3 + 79
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component4 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L5f
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r3 = r5.selectedContactMsisdn
            r3.setValue(r2)
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r5 = r5.selectedContactName
            java.lang.String r6 = r6.getName()
            r2 = 33
            int r2 = r2 / 0
            if (r6 != 0) goto L76
            goto L6c
        L5f:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r3 = r5.selectedContactMsisdn
            r3.setValue(r2)
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r5 = r5.selectedContactName
            java.lang.String r6 = r6.getName()
            if (r6 != 0) goto L76
        L6c:
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.getAsAtTimestamp
            int r6 = r6 + 17
            int r2 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component4 = r2
            int r6 = r6 % r0
            goto L77
        L76:
            r1 = r6
        L77:
            r5.setValue(r1)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.contactLauncher$lambda$2(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity, androidx.activity.result.ActivityResult):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int copydefault = 1;
        final int ShareDataUIState;
        final int component3;

        public static final String copydefault(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                ShareDataUIState(state);
                throw null;
            }
            String strShareDataUIState = ShareDataUIState(state);
            int i3 = copydefault + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return strShareDataUIState;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = copydefault + 65;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int copy = 1;
            private static int copydefault;
            final int ShareDataUIState;
            final FixedDataFamilyShareAddBeneficiaryActivity component1;
            final int component2;
            final State<String> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                copy = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copy + 45;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component1(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = copydefault + 49;
                    copy = i3 % 128;
                    int i4 = i3 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i5 = copy + 119;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                int i7 = this.ShareDataUIState;
                int i8 = this.component2;
                String strCopydefault = component2.copydefault(this.component3);
                final FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity = this.component1;
                Function0 function0 = new Function0() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = copydefault + 119;
                        component1 = i10 % 128;
                        if (i10 % 2 != 0) {
                            FixedDataFamilyShareAddBeneficiaryActivity.component2.AnonymousClass5.copydefault(fixedDataFamilyShareAddBeneficiaryActivity);
                            throw null;
                        }
                        Unit unitCopydefault = FixedDataFamilyShareAddBeneficiaryActivity.component2.AnonymousClass5.copydefault(fixedDataFamilyShareAddBeneficiaryActivity);
                        int i11 = copydefault + 23;
                        component1 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return unitCopydefault;
                        }
                        throw null;
                    }
                };
                final FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity2 = this.component1;
                Function0 function02 = new Function0() {
                    private static int component2 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component2 + 109;
                        component3 = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitComponent2 = FixedDataFamilyShareAddBeneficiaryActivity.component2.AnonymousClass5.component2(fixedDataFamilyShareAddBeneficiaryActivity2);
                        int i12 = component2 + 39;
                        component3 = i12 % 128;
                        int i13 = i12 % 2;
                        return unitComponent2;
                    }
                };
                final FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity3 = this.component1;
                FixedDataAddBeneficiaryScreenKt.FixedDataAddBeneficiaryScreen(i7, i8, strCopydefault, false, function0, function02, new Function6() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i9 = 2 % 2;
                        int i10 = component3 + 27;
                        component2 = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitCopydefault = FixedDataFamilyShareAddBeneficiaryActivity.component2.AnonymousClass5.copydefault(fixedDataFamilyShareAddBeneficiaryActivity3, (String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue(), (String) obj5, (String) obj6);
                        int i12 = component3 + 103;
                        component2 = i12 % 128;
                        int i13 = i12 % 2;
                        return unitCopydefault;
                    }
                }, composer, 0, 8);
                int i9 = copydefault + 69;
                copy = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 / 2;
                }
            }

            private static final Unit component3(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 105;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareAddBeneficiaryActivity, "");
                RouteUtils.routeWithExecute(fixedDataFamilyShareAddBeneficiaryActivity, RoutePathConstant.SELECT_CONTACT, null, FixedDataFamilyShareAddBeneficiaryActivity.access$getContactLauncher$p(fixedDataFamilyShareAddBeneficiaryActivity));
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 9;
                copy = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit ShareDataUIState(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 87;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareAddBeneficiaryActivity, "");
                fixedDataFamilyShareAddBeneficiaryActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 115;
                copy = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit component1(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.String r12, java.lang.String r13) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component2.AnonymousClass5.component1(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):kotlin.Unit");
            }

            public static Unit copydefault(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity, String str, String str2, String str3, boolean z, String str4, String str5) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                copy = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component1(fixedDataFamilyShareAddBeneficiaryActivity, str, str2, str3, z, str4, str5);
                    throw null;
                }
                Unit unitComponent1 = component1(fixedDataFamilyShareAddBeneficiaryActivity, str, str2, str3, z, str4, str5);
                int i3 = copydefault + 51;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitComponent1;
                }
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 45;
                copy = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component3(fixedDataFamilyShareAddBeneficiaryActivity);
                    throw null;
                }
                Unit unitComponent3 = component3(fixedDataFamilyShareAddBeneficiaryActivity);
                int i3 = copydefault + 61;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitComponent3;
                }
                obj.hashCode();
                throw null;
            }

            public static Unit component2(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 81;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(fixedDataFamilyShareAddBeneficiaryActivity);
                if (i3 == 0) {
                    int i4 = 15 / 0;
                }
                int i5 = copydefault + 99;
                copy = i5 % 128;
                int i6 = i5 % 2;
                return unitShareDataUIState;
            }

            AnonymousClass5(int i, int i2, State<String> state, FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity) {
                this.ShareDataUIState = i;
                this.component2 = i2;
                this.component3 = state;
                this.component1 = fixedDataFamilyShareAddBeneficiaryActivity;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void copydefault(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L22
                int r13 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component2.copydefault
                int r13 = r13 + 75
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component2.component2 = r1
                int r13 = r13 % r0
                if (r13 != 0) goto L1d
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L19
                goto L22
            L19:
                r12.skipToGroupEnd()
                goto L59
            L1d:
                r12.getSkipping()
                r12 = 0
                throw r12
            L22:
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity r13 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.this
                kotlinx.coroutines.flow.MutableStateFlow r13 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.access$getSelectedContactMsisdn$p(r13)
                r1 = r13
                kotlinx.coroutines.flow.StateFlow r1 = (kotlinx.coroutines.flow.StateFlow) r1
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 8
                r7 = 7
                r5 = r12
                androidx.compose.runtime.State r13 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r1, r2, r3, r4, r5, r6, r7)
                r1 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity$component2$5 r7 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity$component2$5
                int r8 = r11.ShareDataUIState
                int r9 = r11.component3
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity r10 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.this
                r7.<init>(r8, r9, r13, r10)
                r13 = 54
                r8 = 1370839445(0x51b55995, float:9.73615E10)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r7, r12, r13)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L59:
                int r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component2.copydefault
                int r12 = r12 + 59
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component2.component2 = r13
                int r12 = r12 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.component2.copydefault(androidx.compose.runtime.Composer, int):void");
        }

        private static final String ShareDataUIState(State<String> state) {
            int i = 2 % 2;
            int i2 = copydefault + 5;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String value = state.getValue();
            int i4 = component2 + 95;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        component2(int i, int i2) {
            this.ShareDataUIState = i;
            this.component3 = i2;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        String str;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = 58224;
            int i10 = 0;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) copy) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(equals);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        str = "";
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 845, 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (23251 - TextUtils.indexOf(str, str)), 592652048, false, $$i(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        str = "";
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(892 - AndroidCharacter.getMirror('0'), MotionEvent.axisFromString(str) + 33, (char) (23251 - View.MeasureSpec.getSize(0)), 592652048, false, $$i(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i3 = 2;
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
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 465, TextUtils.lastIndexOf("", '0', 0, 0) + 50, (char) KeyEvent.getDeadChar(0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr3 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 33;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 3784, TextUtils.indexOf("", "") + 38, (char) (ExpandableListView.getPackedPositionGroup(0L) + 26860), 2015799920, false, $$i(b2, b3, (byte) (b3 | Ascii.ESC)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Color.alpha(0), 16 - Color.green(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $11 + 39;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 1;
            } else {
                cArr2 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(char[] r35, byte r36, int r37, java.lang.Object[] r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.e(char[], byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x2487  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x2488  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0249  */
    /* JADX WARN: Type inference failed for: r3v102, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0103  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new char[]{1, 65483, 65534, CharUtils.CR, CharUtils.CR, 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 19, false, Drawable.resolveOpacity(0, 0) + 26, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(1) + 209, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 25, false, (ViewConfiguration.getTapTimeout() >> 16) + 18, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) + 230, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = component4 + 37;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 6619, 42 - TextUtils.indexOf("", "", 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0, 0), 16777272 + Color.rgb(0, 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(19:(6:872|(5:42|43|(1:45)|46|47)(21:48|49|790|50|(2:881|52)|56|57|873|58|(2:803|60)|64|65|66|(2:68|69)|70|71|72|(1:74)(1:75)|76|(1:78)|79)|80|(5:85|(3:912|87|915)(12:911|88|(3:90|(3:93|94|91)|916)|95|859|96|(1:98)|99|100|850|101|914)|913|81|82)|910|84)|(16:858|300|(3:302|303|(2:305|307)(1:306))(1:307)|344|807|345|(13:347|842|348|352|(6:354|834|355|356|837|357)(1:363)|801|364|365|861|(4:367|368|(1:370)|371)(13:(2:375|(1:381)(1:380))(1:383)|(23:385|386|795|387|883|388|(2:838|390)|394|395|864|396|(2:875|398)|402|403|404|(3:406|844|407)|411|412|413|(1:415)(1:416)|417|(1:419)|420)(1:470)|473|476|477|815|478|481|482|(1:484)|485|486|487)|421|(4:424|(3:905|426|908)(12:904|427|(3:429|(4:432|433|434|430)|909)|435|852|436|(1:438)|439|440|846|441|907)|906|422)|903)(10:352|(0)(0)|801|364|365|861|(0)(0)|421|(1:422)|903)|488|(1:490)|491|(1:493)(1:494)|495|(3:497|(1:499)|500)(16:502|503|(1:505)|506|(1:508)|509|510|(1:512)|513|824|514|515|(1:517)|518|(1:520)|521)|501|522|(31:524|(1:526)|527|(3:529|(1:531)|532)(14:533|534|(1:536)|537|538|(1:540)|541|840|542|543|(1:545)(1:546)|547|(1:549)|550)|551|(1:553)(9:554|(3:556|(2:559|557)|901)|560|561|(1:563)|564|(1:566)|567|568)|569|794|570|(1:572)|573|(1:575)|576|(3:578|(1:580)|581)(16:583|(2:585|(2:587|(1:593)(1:592))(2:594|595))|(19:597|598|885|599|(1:601)|602|603|870|604|(1:606)|607|608|609|(1:611)|612|(1:614)|615|(1:617)|618)|674|(1:676)|677|(3:679|(1:681)|682)(13:684|877|685|686|(1:688)|689|813|690|691|(1:693)|694|(1:696)|697)|683|698|(6:701|702|(1:704)|705|706|707)|708|(1:710)|711|(2:713|(4:715|(1:717)|718|719)(3:720|(1:722)|723))(14:724|725|(1:727)|728|729|(1:731)|732|821|733|734|(1:736)|737|(1:739)|740)|741|(1:917)(7:744|745|(1:747)|748|749|750|751))|619|(4:623|(3:896|625|899)(12:894|626|(3:628|(3:631|632|629)|900)|633|856|634|(1:636)|637|638|848|639|898)|897|620)|895|622|674|(0)|677|(0)(0)|683|698|(0)|708|(0)|711|(0)(0)|741|(0)(0))(10:763|(3:765|(2:768|766)|902)|769|770|(1:772)|773|(1:775)|776|777|778))(1:311)|828|317|(1:319)|320|344|807|345|(0)(0)|488|(0)|491|(0)(0)|495|(0)(0)|501|522|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|836|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|799|32|(3:34|812|35)|39|40|(23:(6:872|(5:42|43|(1:45)|46|47)(21:48|49|790|50|(2:881|52)|56|57|873|58|(2:803|60)|64|65|66|(2:68|69)|70|71|72|(1:74)(1:75)|76|(1:78)|79)|80|(5:85|(3:912|87|915)(12:911|88|(3:90|(3:93|94|91)|916)|95|859|96|(1:98)|99|100|850|101|914)|913|81|82)|910|84)|(16:858|300|(3:302|303|(2:305|307)(1:306))(1:307)|344|807|345|(13:347|842|348|352|(6:354|834|355|356|837|357)(1:363)|801|364|365|861|(4:367|368|(1:370)|371)(13:(2:375|(1:381)(1:380))(1:383)|(23:385|386|795|387|883|388|(2:838|390)|394|395|864|396|(2:875|398)|402|403|404|(3:406|844|407)|411|412|413|(1:415)(1:416)|417|(1:419)|420)(1:470)|473|476|477|815|478|481|482|(1:484)|485|486|487)|421|(4:424|(3:905|426|908)(12:904|427|(3:429|(4:432|433|434|430)|909)|435|852|436|(1:438)|439|440|846|441|907)|906|422)|903)(10:352|(0)(0)|801|364|365|861|(0)(0)|421|(1:422)|903)|488|(1:490)|491|(1:493)(1:494)|495|(3:497|(1:499)|500)(16:502|503|(1:505)|506|(1:508)|509|510|(1:512)|513|824|514|515|(1:517)|518|(1:520)|521)|501|522|(31:524|(1:526)|527|(3:529|(1:531)|532)(14:533|534|(1:536)|537|538|(1:540)|541|840|542|543|(1:545)(1:546)|547|(1:549)|550)|551|(1:553)(9:554|(3:556|(2:559|557)|901)|560|561|(1:563)|564|(1:566)|567|568)|569|794|570|(1:572)|573|(1:575)|576|(3:578|(1:580)|581)(16:583|(2:585|(2:587|(1:593)(1:592))(2:594|595))|(19:597|598|885|599|(1:601)|602|603|870|604|(1:606)|607|608|609|(1:611)|612|(1:614)|615|(1:617)|618)|674|(1:676)|677|(3:679|(1:681)|682)(13:684|877|685|686|(1:688)|689|813|690|691|(1:693)|694|(1:696)|697)|683|698|(6:701|702|(1:704)|705|706|707)|708|(1:710)|711|(2:713|(4:715|(1:717)|718|719)(3:720|(1:722)|723))(14:724|725|(1:727)|728|729|(1:731)|732|821|733|734|(1:736)|737|(1:739)|740)|741|(1:917)(7:744|745|(1:747)|748|749|750|751))|619|(4:623|(3:896|625|899)(12:894|626|(3:628|(3:631|632|629)|900)|633|856|634|(1:636)|637|638|848|639|898)|897|620)|895|622|674|(0)|677|(0)(0)|683|698|(0)|708|(0)|711|(0)(0)|741|(0)(0))(10:763|(3:765|(2:768|766)|902)|769|770|(1:772)|773|(1:775)|776|777|778))(1:311)|832|313|(1:315)|316|828|317|(1:319)|320|344|807|345|(0)(0)|488|(0)|491|(0)(0)|495|(0)(0)|501|522|(0)(0))|142|809|143|(1:145)|146|(3:148|(1:150)|151)(19:152|153|797|154|(1:156)|157|158|792|159|(1:161)|162|163|164|(1:166)|167|(1:169)(1:170)|171|(1:173)|174)|175|(4:178|(3:889|180|892)(12:888|181|(3:183|(3:186|187|184)|893)|188|879|189|(1:191)|192|193|866|194|891)|890|176)|887|229|823|230|(1:232)|233|(3:235|(1:237)|238)(14:240|241|819|242|(1:244)|245|246|247|(1:249)|250|(1:252)(1:253)|254|(1:256)|257)|239|258|(9:261|810|262|(1:264)|265|266|267|805|268)|269|312|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0f35, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0f36, code lost:
    
        r6 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName(r35).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).codePointAt(0) - 104, new char[]{13152, 10364, 13480, 61655, 63745, 46085, 6087, 28217, 63745, 46085, 16766, 30353}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0f77, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0f8e, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0f92, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r13 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r1 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0fc1, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0fc5, code lost:
    
        if (r4 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0fc7, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 42 - android.text.TextUtils.indexOf("", "", 0), (char) android.view.KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0fee, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0ff6, code lost:
    
        r8 = new java.lang.Object[]{2130029774, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6562, 56 - android.graphics.Color.red(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
        r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.$$g[14];
        r9 = new java.lang.Object[1];
        d((byte) 52, r2, r2, r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x13d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x13d1, code lost:
    
        r5 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, new char[]{17643, 45195, 17643, 45195, 244, 32655, 41112, 57865, 22073, 13379, 60286, 61277}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x13ed, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x1404, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1408, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x1436, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x143a, code lost:
    
        if (r5 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x143c, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 6619, 43 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x1465, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x146d, code lost:
    
        r8 = new java.lang.Object[]{2130029774, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6563 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) android.graphics.Color.alpha(0));
        r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.$$g[14];
        r9 = new java.lang.Object[1];
        d((byte) 52, r2, r2, r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x1cb3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x1cb4, code lost:
    
        r6 = "currentApplication";
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0a9a A[Catch: all -> 0x05e9, TryCatch #25 {all -> 0x05e9, blocks: (B:136:0x0a94, B:138:0x0a9a, B:139:0x0ac8, B:482:0x1d74, B:484:0x1d7a, B:485:0x1da2, B:702:0x30c2, B:704:0x30c8, B:705:0x30f6, B:745:0x345f, B:747:0x3465, B:748:0x3489, B:725:0x329f, B:727:0x32c2, B:728:0x3313, B:668:0x2d85, B:670:0x2d8b, B:671:0x2db8, B:561:0x26da, B:563:0x26e0, B:564:0x270c, B:566:0x2746, B:567:0x2788, B:534:0x241b, B:536:0x2430, B:537:0x245e, B:770:0x355f, B:772:0x3565, B:773:0x358c, B:775:0x35c6, B:776:0x3607, B:503:0x1fc9, B:505:0x1fde, B:506:0x2010, B:508:0x2044, B:509:0x20bb, B:338:0x1675, B:340:0x167b, B:341:0x16a5, B:292:0x1436, B:294:0x143c, B:295:0x1465, B:223:0x0fc1, B:225:0x0fc7, B:226:0x0fee, B:19:0x02c7, B:21:0x02cd, B:22:0x02fb, B:24:0x0557, B:26:0x0589, B:27:0x05e3, B:570:0x2873, B:572:0x2879, B:573:0x28bf, B:575:0x28e6, B:576:0x292c, B:578:0x2940, B:580:0x2949, B:581:0x298b, B:619:0x2be8, B:620:0x2bec, B:623:0x2bf6, B:626:0x2c0e, B:629:0x2c1b, B:631:0x2c1e, B:643:0x2cfd, B:645:0x2d03, B:646:0x2d04, B:648:0x2d06, B:650:0x2d0d, B:651:0x2d0e, B:587:0x29a6, B:589:0x29aa, B:593:0x29b6, B:594:0x29bb, B:595:0x29be, B:597:0x29c1, B:609:0x2ad4, B:611:0x2ada, B:612:0x2b1c, B:614:0x2b46, B:615:0x2b87, B:617:0x2b9d, B:618:0x2be2, B:653:0x2d10, B:655:0x2d17, B:656:0x2d18, B:658:0x2d1a, B:660:0x2d21, B:661:0x2d22, B:639:0x2c82, B:634:0x2c48, B:636:0x2c4e, B:637:0x2c7a, B:604:0x2a30, B:606:0x2a4f, B:607:0x2ac8, B:599:0x29e1, B:601:0x29f6, B:602:0x2a29, B:143:0x0b4a, B:145:0x0b50, B:146:0x0b93, B:148:0x0ba0, B:150:0x0ba9, B:151:0x0be9, B:175:0x0e01, B:176:0x0e05, B:178:0x0e0b, B:181:0x0e23, B:184:0x0e30, B:186:0x0e33, B:198:0x0f0f, B:200:0x0f15, B:201:0x0f16, B:203:0x0f18, B:205:0x0f1f, B:206:0x0f20, B:152:0x0bf4, B:164:0x0cea, B:166:0x0cf0, B:167:0x0d32, B:169:0x0d5c, B:171:0x0da0, B:173:0x0db6, B:174:0x0df9, B:208:0x0f22, B:210:0x0f29, B:211:0x0f2a, B:213:0x0f2c, B:215:0x0f33, B:216:0x0f34, B:159:0x0c5f, B:161:0x0c74, B:162:0x0cde, B:154:0x0c14, B:156:0x0c29, B:157:0x0c58, B:194:0x0e97, B:189:0x0e5f, B:191:0x0e65, B:192:0x0e8f, B:230:0x106e, B:232:0x1074, B:233:0x10b4, B:235:0x10c1, B:237:0x10ca, B:238:0x1112, B:258:0x12c5, B:266:0x1327, B:272:0x13b4, B:274:0x13ba, B:275:0x13bb, B:277:0x13bd, B:279:0x13c4, B:280:0x13c5, B:240:0x111e, B:247:0x11a4, B:249:0x11aa, B:250:0x11f2, B:252:0x121c, B:254:0x1265, B:256:0x127b, B:257:0x12bb, B:282:0x13c7, B:284:0x13ce, B:285:0x13cf, B:268:0x1337, B:262:0x12f6, B:264:0x12fc, B:265:0x1320, B:242:0x113e, B:244:0x1150, B:245:0x1198, B:300:0x14e7, B:303:0x14f5, B:324:0x15dc, B:326:0x15e2, B:327:0x15e3, B:329:0x15e5, B:331:0x15ec, B:332:0x15ed, B:307:0x1501), top: B:836:0x02c7, inners: #2, #10, #18, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0b50 A[Catch: all -> 0x0f35, TryCatch #10 {all -> 0x0f35, blocks: (B:143:0x0b4a, B:145:0x0b50, B:146:0x0b93, B:148:0x0ba0, B:150:0x0ba9, B:151:0x0be9, B:175:0x0e01, B:176:0x0e05, B:178:0x0e0b, B:181:0x0e23, B:184:0x0e30, B:186:0x0e33, B:198:0x0f0f, B:200:0x0f15, B:201:0x0f16, B:203:0x0f18, B:205:0x0f1f, B:206:0x0f20, B:152:0x0bf4, B:164:0x0cea, B:166:0x0cf0, B:167:0x0d32, B:169:0x0d5c, B:171:0x0da0, B:173:0x0db6, B:174:0x0df9, B:208:0x0f22, B:210:0x0f29, B:211:0x0f2a, B:213:0x0f2c, B:215:0x0f33, B:216:0x0f34, B:159:0x0c5f, B:161:0x0c74, B:162:0x0cde, B:154:0x0c14, B:156:0x0c29, B:157:0x0c58, B:194:0x0e97, B:189:0x0e5f, B:191:0x0e65, B:192:0x0e8f), top: B:809:0x0b4a, outer: #25, inners: #1, #4, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0ba0 A[Catch: all -> 0x0f35, TryCatch #10 {all -> 0x0f35, blocks: (B:143:0x0b4a, B:145:0x0b50, B:146:0x0b93, B:148:0x0ba0, B:150:0x0ba9, B:151:0x0be9, B:175:0x0e01, B:176:0x0e05, B:178:0x0e0b, B:181:0x0e23, B:184:0x0e30, B:186:0x0e33, B:198:0x0f0f, B:200:0x0f15, B:201:0x0f16, B:203:0x0f18, B:205:0x0f1f, B:206:0x0f20, B:152:0x0bf4, B:164:0x0cea, B:166:0x0cf0, B:167:0x0d32, B:169:0x0d5c, B:171:0x0da0, B:173:0x0db6, B:174:0x0df9, B:208:0x0f22, B:210:0x0f29, B:211:0x0f2a, B:213:0x0f2c, B:215:0x0f33, B:216:0x0f34, B:159:0x0c5f, B:161:0x0c74, B:162:0x0cde, B:154:0x0c14, B:156:0x0c29, B:157:0x0c58, B:194:0x0e97, B:189:0x0e5f, B:191:0x0e65, B:192:0x0e8f), top: B:809:0x0b4a, outer: #25, inners: #1, #4, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0bf4 A[Catch: all -> 0x0f35, TRY_LEAVE, TryCatch #10 {all -> 0x0f35, blocks: (B:143:0x0b4a, B:145:0x0b50, B:146:0x0b93, B:148:0x0ba0, B:150:0x0ba9, B:151:0x0be9, B:175:0x0e01, B:176:0x0e05, B:178:0x0e0b, B:181:0x0e23, B:184:0x0e30, B:186:0x0e33, B:198:0x0f0f, B:200:0x0f15, B:201:0x0f16, B:203:0x0f18, B:205:0x0f1f, B:206:0x0f20, B:152:0x0bf4, B:164:0x0cea, B:166:0x0cf0, B:167:0x0d32, B:169:0x0d5c, B:171:0x0da0, B:173:0x0db6, B:174:0x0df9, B:208:0x0f22, B:210:0x0f29, B:211:0x0f2a, B:213:0x0f2c, B:215:0x0f33, B:216:0x0f34, B:159:0x0c5f, B:161:0x0c74, B:162:0x0cde, B:154:0x0c14, B:156:0x0c29, B:157:0x0c58, B:194:0x0e97, B:189:0x0e5f, B:191:0x0e65, B:192:0x0e8f), top: B:809:0x0b4a, outer: #25, inners: #1, #4, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e0b A[Catch: all -> 0x0f35, TryCatch #10 {all -> 0x0f35, blocks: (B:143:0x0b4a, B:145:0x0b50, B:146:0x0b93, B:148:0x0ba0, B:150:0x0ba9, B:151:0x0be9, B:175:0x0e01, B:176:0x0e05, B:178:0x0e0b, B:181:0x0e23, B:184:0x0e30, B:186:0x0e33, B:198:0x0f0f, B:200:0x0f15, B:201:0x0f16, B:203:0x0f18, B:205:0x0f1f, B:206:0x0f20, B:152:0x0bf4, B:164:0x0cea, B:166:0x0cf0, B:167:0x0d32, B:169:0x0d5c, B:171:0x0da0, B:173:0x0db6, B:174:0x0df9, B:208:0x0f22, B:210:0x0f29, B:211:0x0f2a, B:213:0x0f2c, B:215:0x0f33, B:216:0x0f34, B:159:0x0c5f, B:161:0x0c74, B:162:0x0cde, B:154:0x0c14, B:156:0x0c29, B:157:0x0c58, B:194:0x0e97, B:189:0x0e5f, B:191:0x0e65, B:192:0x0e8f), top: B:809:0x0b4a, outer: #25, inners: #1, #4, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1074 A[Catch: all -> 0x13d0, TryCatch #18 {all -> 0x13d0, blocks: (B:230:0x106e, B:232:0x1074, B:233:0x10b4, B:235:0x10c1, B:237:0x10ca, B:238:0x1112, B:258:0x12c5, B:266:0x1327, B:272:0x13b4, B:274:0x13ba, B:275:0x13bb, B:277:0x13bd, B:279:0x13c4, B:280:0x13c5, B:240:0x111e, B:247:0x11a4, B:249:0x11aa, B:250:0x11f2, B:252:0x121c, B:254:0x1265, B:256:0x127b, B:257:0x12bb, B:282:0x13c7, B:284:0x13ce, B:285:0x13cf, B:268:0x1337, B:262:0x12f6, B:264:0x12fc, B:265:0x1320, B:242:0x113e, B:244:0x1150, B:245:0x1198), top: B:823:0x106e, outer: #25, inners: #8, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x10c1 A[Catch: all -> 0x13d0, TryCatch #18 {all -> 0x13d0, blocks: (B:230:0x106e, B:232:0x1074, B:233:0x10b4, B:235:0x10c1, B:237:0x10ca, B:238:0x1112, B:258:0x12c5, B:266:0x1327, B:272:0x13b4, B:274:0x13ba, B:275:0x13bb, B:277:0x13bd, B:279:0x13c4, B:280:0x13c5, B:240:0x111e, B:247:0x11a4, B:249:0x11aa, B:250:0x11f2, B:252:0x121c, B:254:0x1265, B:256:0x127b, B:257:0x12bb, B:282:0x13c7, B:284:0x13ce, B:285:0x13cf, B:268:0x1337, B:262:0x12f6, B:264:0x12fc, B:265:0x1320, B:242:0x113e, B:244:0x1150, B:245:0x1198), top: B:823:0x106e, outer: #25, inners: #8, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x111e A[Catch: all -> 0x13d0, TRY_LEAVE, TryCatch #18 {all -> 0x13d0, blocks: (B:230:0x106e, B:232:0x1074, B:233:0x10b4, B:235:0x10c1, B:237:0x10ca, B:238:0x1112, B:258:0x12c5, B:266:0x1327, B:272:0x13b4, B:274:0x13ba, B:275:0x13bb, B:277:0x13bd, B:279:0x13c4, B:280:0x13c5, B:240:0x111e, B:247:0x11a4, B:249:0x11aa, B:250:0x11f2, B:252:0x121c, B:254:0x1265, B:256:0x127b, B:257:0x12bb, B:282:0x13c7, B:284:0x13ce, B:285:0x13cf, B:268:0x1337, B:262:0x12f6, B:264:0x12fc, B:265:0x1320, B:242:0x113e, B:244:0x1150, B:245:0x1198), top: B:823:0x106e, outer: #25, inners: #8, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x12d7  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x150a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x1521 A[Catch: all -> 0x15e4, TryCatch #23 {all -> 0x15e4, blocks: (B:313:0x150c, B:315:0x1521, B:316:0x154f), top: B:832:0x150c, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x1562 A[Catch: all -> 0x15da, TryCatch #21 {all -> 0x15da, blocks: (B:317:0x1555, B:319:0x1562, B:320:0x15d2), top: B:828:0x1555, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x1729  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1777 A[Catch: all -> 0x1cb3, PHI: r2
  0x1777: PHI (r2v509 java.lang.Object) = (r2v508 java.lang.Object), (r2v589 java.lang.Object) binds: [B:346:0x1727, B:348:0x172b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x1cb3, blocks: (B:345:0x1723, B:352:0x1777), top: B:807:0x1723 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x179e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x17f5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x180d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x186c  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1b60 A[Catch: all -> 0x1c8b, TryCatch #39 {all -> 0x1c8b, blocks: (B:421:0x1b56, B:422:0x1b5a, B:424:0x1b60, B:427:0x1b78, B:430:0x1b84, B:433:0x1b91, B:445:0x1c79, B:447:0x1c7f, B:448:0x1c80, B:450:0x1c82, B:452:0x1c89, B:453:0x1c8a, B:413:0x1a88, B:415:0x1aa5, B:417:0x1af0, B:419:0x1b07, B:420:0x1b4e, B:458:0x1c91, B:460:0x1c97, B:461:0x1c98, B:464:0x1c9d, B:466:0x1ca3, B:467:0x1ca4, B:441:0x1c03, B:436:0x1bc7, B:438:0x1bcd, B:439:0x1bfb), top: B:861:0x180b, inners: #31, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1d7a A[Catch: all -> 0x05e9, TryCatch #25 {all -> 0x05e9, blocks: (B:136:0x0a94, B:138:0x0a9a, B:139:0x0ac8, B:482:0x1d74, B:484:0x1d7a, B:485:0x1da2, B:702:0x30c2, B:704:0x30c8, B:705:0x30f6, B:745:0x345f, B:747:0x3465, B:748:0x3489, B:725:0x329f, B:727:0x32c2, B:728:0x3313, B:668:0x2d85, B:670:0x2d8b, B:671:0x2db8, B:561:0x26da, B:563:0x26e0, B:564:0x270c, B:566:0x2746, B:567:0x2788, B:534:0x241b, B:536:0x2430, B:537:0x245e, B:770:0x355f, B:772:0x3565, B:773:0x358c, B:775:0x35c6, B:776:0x3607, B:503:0x1fc9, B:505:0x1fde, B:506:0x2010, B:508:0x2044, B:509:0x20bb, B:338:0x1675, B:340:0x167b, B:341:0x16a5, B:292:0x1436, B:294:0x143c, B:295:0x1465, B:223:0x0fc1, B:225:0x0fc7, B:226:0x0fee, B:19:0x02c7, B:21:0x02cd, B:22:0x02fb, B:24:0x0557, B:26:0x0589, B:27:0x05e3, B:570:0x2873, B:572:0x2879, B:573:0x28bf, B:575:0x28e6, B:576:0x292c, B:578:0x2940, B:580:0x2949, B:581:0x298b, B:619:0x2be8, B:620:0x2bec, B:623:0x2bf6, B:626:0x2c0e, B:629:0x2c1b, B:631:0x2c1e, B:643:0x2cfd, B:645:0x2d03, B:646:0x2d04, B:648:0x2d06, B:650:0x2d0d, B:651:0x2d0e, B:587:0x29a6, B:589:0x29aa, B:593:0x29b6, B:594:0x29bb, B:595:0x29be, B:597:0x29c1, B:609:0x2ad4, B:611:0x2ada, B:612:0x2b1c, B:614:0x2b46, B:615:0x2b87, B:617:0x2b9d, B:618:0x2be2, B:653:0x2d10, B:655:0x2d17, B:656:0x2d18, B:658:0x2d1a, B:660:0x2d21, B:661:0x2d22, B:639:0x2c82, B:634:0x2c48, B:636:0x2c4e, B:637:0x2c7a, B:604:0x2a30, B:606:0x2a4f, B:607:0x2ac8, B:599:0x29e1, B:601:0x29f6, B:602:0x2a29, B:143:0x0b4a, B:145:0x0b50, B:146:0x0b93, B:148:0x0ba0, B:150:0x0ba9, B:151:0x0be9, B:175:0x0e01, B:176:0x0e05, B:178:0x0e0b, B:181:0x0e23, B:184:0x0e30, B:186:0x0e33, B:198:0x0f0f, B:200:0x0f15, B:201:0x0f16, B:203:0x0f18, B:205:0x0f1f, B:206:0x0f20, B:152:0x0bf4, B:164:0x0cea, B:166:0x0cf0, B:167:0x0d32, B:169:0x0d5c, B:171:0x0da0, B:173:0x0db6, B:174:0x0df9, B:208:0x0f22, B:210:0x0f29, B:211:0x0f2a, B:213:0x0f2c, B:215:0x0f33, B:216:0x0f34, B:159:0x0c5f, B:161:0x0c74, B:162:0x0cde, B:154:0x0c14, B:156:0x0c29, B:157:0x0c58, B:194:0x0e97, B:189:0x0e5f, B:191:0x0e65, B:192:0x0e8f, B:230:0x106e, B:232:0x1074, B:233:0x10b4, B:235:0x10c1, B:237:0x10ca, B:238:0x1112, B:258:0x12c5, B:266:0x1327, B:272:0x13b4, B:274:0x13ba, B:275:0x13bb, B:277:0x13bd, B:279:0x13c4, B:280:0x13c5, B:240:0x111e, B:247:0x11a4, B:249:0x11aa, B:250:0x11f2, B:252:0x121c, B:254:0x1265, B:256:0x127b, B:257:0x12bb, B:282:0x13c7, B:284:0x13ce, B:285:0x13cf, B:268:0x1337, B:262:0x12f6, B:264:0x12fc, B:265:0x1320, B:242:0x113e, B:244:0x1150, B:245:0x1198, B:300:0x14e7, B:303:0x14f5, B:324:0x15dc, B:326:0x15e2, B:327:0x15e3, B:329:0x15e5, B:331:0x15ec, B:332:0x15ed, B:307:0x1501), top: B:836:0x02c7, inners: #2, #10, #18, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1e33  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1e9d  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x1ee3  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1ef9  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x1fab  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x21f2  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2e3b  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2e89  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x2ee1  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x30a2  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x3183  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x31d7  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x3281  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x343f  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x3527  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x14e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:917:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v172 */
    /* JADX WARN: Type inference failed for: r10v173 */
    /* JADX WARN: Type inference failed for: r10v174 */
    /* JADX WARN: Type inference failed for: r10v195 */
    /* JADX WARN: Type inference failed for: r10v196 */
    /* JADX WARN: Type inference failed for: r10v201 */
    /* JADX WARN: Type inference failed for: r10v204 */
    /* JADX WARN: Type inference failed for: r10v205 */
    /* JADX WARN: Type inference failed for: r10v206 */
    /* JADX WARN: Type inference failed for: r10v207 */
    /* JADX WARN: Type inference failed for: r10v208 */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r3v111, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v303, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v313 */
    /* JADX WARN: Type inference failed for: r6v314 */
    /* JADX WARN: Type inference failed for: r6v315 */
    /* JADX WARN: Type inference failed for: r6v319 */
    /* JADX WARN: Type inference failed for: r6v320 */
    /* JADX WARN: Type inference failed for: r6v327 */
    /* JADX WARN: Type inference failed for: r6v446 */
    /* JADX WARN: Type inference failed for: r6v447 */
    /* JADX WARN: Type inference failed for: r6v448 */
    /* JADX WARN: Type inference failed for: r6v450 */
    /* JADX WARN: Type inference failed for: r6v451 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v107 */
    /* JADX WARN: Type inference failed for: r8v108 */
    /* JADX WARN: Type inference failed for: r8v109, types: [long] */
    /* JADX WARN: Type inference failed for: r8v110 */
    /* JADX WARN: Type inference failed for: r8v111 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v123 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v137 */
    /* JADX WARN: Type inference failed for: r8v138 */
    /* JADX WARN: Type inference failed for: r8v143 */
    /* JADX WARN: Type inference failed for: r8v270 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v272 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareAddBeneficiaryActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$CJt7USv2fHIruYNCa0UEWZnvZGs(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        contactLauncher$lambda$2(fixedDataFamilyShareAddBeneficiaryActivity, activityResult);
        int i4 = getAsAtTimestamp + 19;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$U0Rb7hOtXp5e6Y0LEqBnTbg1Ntw(FixedDataFamilyShareAddBeneficiaryActivity fixedDataFamilyShareAddBeneficiaryActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        confirmationLauncher$lambda$0(fixedDataFamilyShareAddBeneficiaryActivity, activityResult);
        int i4 = getAsAtTimestamp + 39;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
    }

    static {
        ArtificialStackFrames = 1;
        ShareDataUIState();
        copydefault();
        int i = getRequestBeneficiariesState + 87;
        ArtificialStackFrames = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 75;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        component3 = new char[]{2003, 2034, 1987, 1966, 1997, 2035, 2031, 2042, 2032, 1956, 2000, 2018, 2025, 2037, 2030, 2041, 2017, 2024, 2036, 2023, 2007, 1990, 2004, 2028, 2022, 2006, 1970, 2005, 2001, 2039, 2019, 2027, 2029, 2021, 2038, 2020};
        ShareDataUIState = (char) 12828;
        int i5 = i3 + 1;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        copydefault = -890926587;
        component2 = (char) 11555;
        component1 = (char) 47196;
        copy = (char) 46004;
        equals = (char) 6432;
    }
}
