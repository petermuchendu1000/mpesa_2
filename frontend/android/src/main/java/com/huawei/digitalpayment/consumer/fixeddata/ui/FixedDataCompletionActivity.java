package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataCompletionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataCompletionActivity extends Hilt_FixedDataCompletionActivity {
    public static final int $stable = 0;
    private static boolean ShareDataUIState;
    private static int[] component1;
    private static char[] component2;
    private static int component3;
    private static int[] component4;
    private static boolean copydefault;
    private static int equals;
    private static final byte[] $$c = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$f = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90, -19, 9, -15, Ascii.SI, 35, -27, -17, Ascii.NAK, Ascii.SO, Ascii.SO, -8, -31, Ascii.NAK, -17, 17, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 67, -1, 13, 59, -50, -11, -4, 9, 13, -20, Ascii.CAN, 4, -16, 1, 10, 9, 57, -64, 1, Ascii.DLE, TarHeader.LF_CONTIG, -58, 9, 4, -7, 9, 0, 57, -64, 0, 5, -5, Ascii.SI, 7, 1, -11, 70, -72, 13, -4, 2, 71, -40, 13, -4, 2, 8, -5, Ascii.VT, -24, -18, 43, -15, -6, -7, 45, -28, -7, Ascii.VT, -11, 19, -17, 7, -1, 33, -27, 9, -10, 1, -7, Ascii.ETB, 1, 1, 7, -18, Ascii.VT, -6, 67, -17, -32, -15, 13, -4, 3, 35, -22, -7, -5, 46, -41, 17, -6, Ascii.EM, -17, 6, -16, 41, -29, 1, -3, 7, 47, -28, -9, 2, Ascii.FF, 3, 0, -6, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 69};
    private static final int $$h = 31;
    private static final byte[] $$a = {79, -25, -14, 102, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 79;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r5, byte r6, byte r7) {
        /*
            int r5 = r5 + 68
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.$$i(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 99 - r5
            int r0 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.$$a
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r5 = r5 + 1
            r3 = r1[r5]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.$$g
            int r1 = 67 - r8
            int r6 = r6 * 4
            int r6 = 111 - r6
            byte[] r1 = new byte[r1]
            int r8 = 66 - r8
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + 2
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.e(short, int, byte, java.lang.Object[]):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int getAsAtTimestamp = 1;
        final String component1;
        final String component2;
        final boolean component3;
        final FixedDataCompletionActivity copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int getRequestBeneficiariesState = 1;
            final FixedDataCompletionActivity component1;
            final String component2;
            final String component3;
            final boolean copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 77;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = getRequestBeneficiariesState + 1;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 0;
                }
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void copydefault(androidx.compose.runtime.Composer r14, int r15) {
                /*
                    r13 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.ShareDataUIState.AnonymousClass1.getRequestBeneficiariesState
                    int r1 = r1 + 105
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.ShareDataUIState.AnonymousClass1.ShareDataUIState = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L14
                    r15 = r15 & 29
                    r1 = 3
                    if (r15 != r1) goto L24
                    goto L18
                L14:
                    r15 = r15 & 11
                    if (r15 != r0) goto L24
                L18:
                    boolean r15 = r14.getSkipping()
                    if (r15 != 0) goto L1f
                    goto L24
                L1f:
                    r14.skipToGroupEnd()
                    goto Lb8
                L24:
                    boolean r2 = r13.copydefault
                    java.lang.String r3 = r13.component3
                    com.safaricom.sharedui.compose.completion.TransactionCompletionData r15 = new com.safaricom.sharedui.compose.completion.TransactionCompletionData
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 60
                    r9 = 0
                    r1 = r15
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                    r1 = 114494210(0x6d30b02, float:7.9385553E-35)
                    r14.startReplaceGroup(r1)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity r1 = r13.component1
                    boolean r1 = r14.changed(r1)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity r2 = r13.component1
                    java.lang.Object r3 = r14.rememberedValue()
                    if (r1 != 0) goto L51
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r1 = r1.getEmpty()
                    if (r3 != r1) goto L59
                L51:
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity$onCreate$1$1$$ExternalSyntheticLambda0 r3 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    r3.<init>()
                    r14.updateRememberedValue(r3)
                L59:
                    r7 = r3
                    kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                    r14.endReplaceGroup()
                    r1 = 114495909(0x6d311a5, float:7.9395305E-35)
                    r14.startReplaceGroup(r1)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity r1 = r13.component1
                    boolean r1 = r14.changed(r1)
                    java.lang.String r2 = r13.component2
                    boolean r2 = r14.changed(r2)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity r3 = r13.component1
                    java.lang.String r4 = r13.component2
                    java.lang.Object r5 = r14.rememberedValue()
                    r1 = r1 | r2
                    r1 = r1 ^ 1
                    if (r1 == 0) goto L9e
                    int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.ShareDataUIState.AnonymousClass1.ShareDataUIState
                    int r1 = r1 + 27
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.ShareDataUIState.AnonymousClass1.getRequestBeneficiariesState = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L96
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r0 = r0.getEmpty()
                    r1 = 72
                    int r1 = r1 / 0
                    if (r5 != r0) goto La6
                    goto L9e
                L96:
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r0 = r0.getEmpty()
                    if (r5 != r0) goto La6
                L9e:
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity$onCreate$1$1$$ExternalSyntheticLambda1 r5 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    r5.<init>()
                    r14.updateRememberedValue(r5)
                La6:
                    r9 = r5
                    kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
                    r14.endReplaceGroup()
                    int r11 = com.safaricom.sharedui.compose.completion.TransactionCompletionData.$stable
                    r5 = 0
                    r6 = 0
                    r8 = 0
                    r12 = 22
                    r4 = r15
                    r10 = r14
                    com.safaricom.sharedui.compose.completion.TransactionCompletionScreenKt.TransactionCompletionScreen(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                Lb8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.ShareDataUIState.AnonymousClass1.copydefault(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component3(FixedDataCompletionActivity fixedDataCompletionActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 119;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataCompletionActivity, "");
                fixedDataCompletionActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = getRequestBeneficiariesState + 53;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component3(FixedDataCompletionActivity fixedDataCompletionActivity, String str) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 33;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataCompletionActivity, "");
                Intrinsics.checkNotNullParameter(str, "");
                RouteUtils.routeWithExecute(fixedDataCompletionActivity, str, 603979776);
                fixedDataCompletionActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 105;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit component2(FixedDataCompletionActivity fixedDataCompletionActivity, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 83;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(fixedDataCompletionActivity, str);
                int i4 = getRequestBeneficiariesState + 69;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit component1(FixedDataCompletionActivity fixedDataCompletionActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 39;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(fixedDataCompletionActivity);
                int i4 = getRequestBeneficiariesState + 47;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                }
                return unitComponent3;
            }

            AnonymousClass1(boolean z, String str, FixedDataCompletionActivity fixedDataCompletionActivity, String str2) {
                this.copydefault = z;
                this.component3 = str;
                this.component1 = fixedDataCompletionActivity;
                this.component2 = str2;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            Unit unit;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            getAsAtTimestamp = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                copydefault(composer2, num2.intValue());
                unit = Unit.INSTANCE;
                int i3 = 13 / 0;
            } else {
                copydefault(composer2, num2.intValue());
                unit = Unit.INSTANCE;
            }
            int i4 = getAsAtTimestamp + 69;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void copydefault(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 45;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 64) == 5) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i4 = ShareDataUIState + 3;
                    getAsAtTimestamp = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 5 % 4;
                        return;
                    }
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1330255323, true, new AnonymousClass1(this.component3, this.component2, this.copydefault, this.component1), composer, 54), composer, 1572864, 63);
            int i6 = ShareDataUIState + 107;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
        }

        ShareDataUIState(boolean z, String str, FixedDataCompletionActivity fixedDataCompletionActivity, String str2) {
            this.component3 = z;
            this.component2 = str;
            this.copydefault = fixedDataCompletionActivity;
            this.component1 = str2;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component4;
        int i4 = 38;
        int i5 = 684241640;
        int i6 = 16;
        int i7 = 1;
        int i8 = 0;
        if (iArr2 != null) {
            int i9 = $10 + 123;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.indexOf((CharSequence) "", '0', 0), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> i6), (char) (ViewConfiguration.getScrollBarSize() >> 8), -309236339, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i11] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i11++;
                    i4 = 38;
                    i5 = 684241640;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component4;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = $10 + 15;
            $11 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < length3) {
                int i16 = $10 + 19;
                $11 = i16 % 128;
                int i17 = i16 % i13;
                try {
                    Object[] objArr3 = new Object[i7];
                    objArr3[i8] = Integer.valueOf(iArr5[i15]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) i8;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4392 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, (char) (KeyEvent.getMaxKeyCode() >> 16), -309236339, false, $$i((byte) 38, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i15] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i15++;
                    i7 = 1;
                    i8 = 0;
                    i13 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i8;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            int i18 = $11 + 21;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i20 = 0;
            for (int i21 = 16; i20 < i21; i21 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i20];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + 17, (char) (49870 - ExpandableListView.getPackedPositionChild(0L)), 462826032, false, $$i((byte) 36, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i20++;
            }
            int i22 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i22;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i23 = getactivenotifications.ShareDataUIState;
            int i24 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2944, 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 27637), -1616366948, false, $$i((byte) 39, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void d(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component1;
        float f = 0.0f;
        int i4 = 684241640;
        int i5 = 16;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $11 + 5;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 61;
                $11 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getLongPressTimeout() >> i5), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 37, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -309236339, false, $$i((byte) 38, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i10] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i10++;
                    i2 = 2;
                    f = 0.0f;
                    i4 = 684241640;
                    i5 = 16;
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
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component1;
        char c2 = '0';
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr6[i13]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    iArr2 = iArr6;
                    byte b3 = (byte) i7;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror(c2) + 4343, 37 - TextUtils.indexOf("", "", i7), (char) ((Process.getThreadPriority(i7) + 20) >> 6), -309236339, false, $$i((byte) 38, b3, b3), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i13++;
                iArr6 = iArr2;
                c2 = '0';
                i6 = 1;
                i7 = 0;
            }
            iArr6 = iArr7;
        }
        int i14 = i7;
        System.arraycopy(iArr6, i14, iArr5, i14, length2);
        getactivenotifications.component1 = i14;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i14] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 95;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i15];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 2968, 16 - Gravity.getAbsoluteGravity(0, 0), (char) ((-16727345) - Color.rgb(0, 0, 0)), 462826032, false, $$i((byte) 36, b4, b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i15 += 98;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i15];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 16, (char) (49872 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 462826032, false, $$i((byte) 36, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i15++;
                }
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 24, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27638), -1616366948, false, $$i((byte) 39, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 67;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3761 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 24 - TextUtils.getOffsetBefore("", i3), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(component3)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 13, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            if (copydefault) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i7 = $11 + 121;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 5;
                }
                while (cancelVar.component3 < cancelVar.component1) {
                    int i9 = $10 + 9;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 >> 1) - cancelVar.component3] + i] + iIntValue);
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 5;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2748, 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 7644), -327556343, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } else {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 5;
                            byte b7 = (byte) (b6 - 5);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getEdgeSlop() >> 16), 19 - Drawable.resolveOpacity(0, 0), (char) (7644 - KeyEvent.keyCodeFromString("")), -327556343, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (ShareDataUIState) {
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i10 = $10 + 17;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 5;
                        byte b9 = (byte) (b8 - 5);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.resolveSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, (char) (View.resolveSize(0, 0) + 7644), -327556343, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                String str = new String(cArr5);
                int i12 = $11 + 83;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                objArr[0] = str;
                return;
            }
            int i14 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i14;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i15 = $10 + 73;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[cancelVar.component1 << cancelVar.component3] << i] % iIntValue);
                    i14 = cancelVar.component3 % 1;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i14 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:280:0x1e48  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1eb7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x1f0c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x013d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) + 81, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 17, new int[]{1741363496, 1450363512, -1680668341, 200012395, 382897975, -651044604, -1448298337, -1505042570, 427889375, -688311201}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = getRequestBeneficiariesState + 91;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = getAsAtTimestamp + 69;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 6618, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 56, (char) Color.red(0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i7 = getAsAtTimestamp + 39;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
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

    /* JADX WARN: Can't wrap try/catch for region: R(70:813|162|(1:164)|165|166|189|(8:836|190|(1:192)|193|(3:195|(1:197)|198)(19:199|200|817|201|(1:203)|204|205|807|206|(1:208)|209|210|211|(1:213)|214|(1:216)|217|(1:219)|220)|221|(4:224|(2:226|854)(11:227|(3:229|(3:232|233|230)|855)|234|792|235|(1:237)|238|239|777|240|853)|241|222)|852)|275|794|276|(1:278)|279|(4:281|(1:283)|284|285)(14:287|288|781|289|(1:291)|292|293|294|(1:296)|297|(1:299)|300|(1:302)|303)|286|304|(9:307|767|308|(1:310)|311|312|313|843|314)|344|821|345|(2:775|347)|351|(1:353)|354|355|783|(5:357|358|(1:360)|361|362)(44:363|(3:365|366|(1:373)(1:371))(1:374)|(18:376|795|377|(2:788|379)|383|384|784|385|(2:773|387)|391|392|393|(1:395)|396|(2:398|399)(1:401)|402|(2:404|405)|406)|454|469|(1:471)|472|(1:474)|475|(3:477|(1:479)|480)(16:482|483|(1:485)|486|(1:488)|489|490|(1:492)|493|799|494|495|(1:497)|498|(1:500)|501)|481|502|(1:504)(9:505|(3:507|(2:510|508)|868)|511|512|(1:514)|515|(1:517)|518|519)|520|(1:522)|523|(3:525|(1:527)|528)(14:529|530|(1:532)|533|534|(1:536)|537|811|538|539|(1:541)|542|(1:544)|545)|546|(1:548)(9:549|(3:551|(2:554|552)|867)|555|556|(1:558)|559|(1:561)|562|563)|564|771|565|(1:567)|568|(1:570)|571|(3:573|(1:575)|576)(17:577|(2:579|(1:585)(1:584))|(19:587|588|757|589|(1:591)|592|593|832|594|(1:596)|597|598|599|(1:601)|602|(1:604)|605|(1:607)|608)|663|(1:665)|666|(3:668|(1:670)|671)(13:673|801|674|675|(1:677)|678|839|679|680|(1:682)|683|(1:685)|686)|672|687|(6:690|691|(1:693)|694|695|696)|697|(1:699)|700|(3:702|(1:704)|705)(14:707|708|(1:710)|711|712|(1:714)|715|759|716|717|(1:719)|720|(1:722)|723)|706|724|(1:869)(7:727|728|(1:730)|731|732|733|734))|609|(4:612|(3:862|614|865)(12:861|615|(3:617|(3:620|621|618)|866)|622|819|623|(1:625)|626|627|809|628|864)|863|610)|860|663|(0)|666|(0)(0)|672|687|(0)|697|(0)|700|(0)(0)|706|724|(0)(0))|407|(4:410|(2:412|858)(11:413|(3:415|(4:418|419|420|416)|859)|421|765|422|(1:424)|425|426|841|427|857)|428|408)|856|454|469|(0)|472|(0)|475|(0)(0)|481|502|(0)(0)|520|(0)|523|(0)(0)|546|(0)(0)|564|771|565|(0)|568|(0)|571|(0)(0)|609|(1:610)|860|663|(0)|666|(0)(0)|672|687|(0)|697|(0)|700|(0)(0)|706|724|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(74:830|158|(1:160)|161|813|162|(1:164)|165|166|189|(8:836|190|(1:192)|193|(3:195|(1:197)|198)(19:199|200|817|201|(1:203)|204|205|807|206|(1:208)|209|210|211|(1:213)|214|(1:216)|217|(1:219)|220)|221|(4:224|(2:226|854)(11:227|(3:229|(3:232|233|230)|855)|234|792|235|(1:237)|238|239|777|240|853)|241|222)|852)|275|794|276|(1:278)|279|(4:281|(1:283)|284|285)(14:287|288|781|289|(1:291)|292|293|294|(1:296)|297|(1:299)|300|(1:302)|303)|286|304|(9:307|767|308|(1:310)|311|312|313|843|314)|344|821|345|(2:775|347)|351|(1:353)|354|355|783|(5:357|358|(1:360)|361|362)(44:363|(3:365|366|(1:373)(1:371))(1:374)|(18:376|795|377|(2:788|379)|383|384|784|385|(2:773|387)|391|392|393|(1:395)|396|(2:398|399)(1:401)|402|(2:404|405)|406)|454|469|(1:471)|472|(1:474)|475|(3:477|(1:479)|480)(16:482|483|(1:485)|486|(1:488)|489|490|(1:492)|493|799|494|495|(1:497)|498|(1:500)|501)|481|502|(1:504)(9:505|(3:507|(2:510|508)|868)|511|512|(1:514)|515|(1:517)|518|519)|520|(1:522)|523|(3:525|(1:527)|528)(14:529|530|(1:532)|533|534|(1:536)|537|811|538|539|(1:541)|542|(1:544)|545)|546|(1:548)(9:549|(3:551|(2:554|552)|867)|555|556|(1:558)|559|(1:561)|562|563)|564|771|565|(1:567)|568|(1:570)|571|(3:573|(1:575)|576)(17:577|(2:579|(1:585)(1:584))|(19:587|588|757|589|(1:591)|592|593|832|594|(1:596)|597|598|599|(1:601)|602|(1:604)|605|(1:607)|608)|663|(1:665)|666|(3:668|(1:670)|671)(13:673|801|674|675|(1:677)|678|839|679|680|(1:682)|683|(1:685)|686)|672|687|(6:690|691|(1:693)|694|695|696)|697|(1:699)|700|(3:702|(1:704)|705)(14:707|708|(1:710)|711|712|(1:714)|715|759|716|717|(1:719)|720|(1:722)|723)|706|724|(1:869)(7:727|728|(1:730)|731|732|733|734))|609|(4:612|(3:862|614|865)(12:861|615|(3:617|(3:620|621|618)|866)|622|819|623|(1:625)|626|627|809|628|864)|863|610)|860|663|(0)|666|(0)(0)|672|687|(0)|697|(0)|700|(0)(0)|706|724|(0)(0))|407|(4:410|(2:412|858)(11:413|(3:415|(4:418|419|420|416)|859)|421|765|422|(1:424)|425|426|841|427|857)|428|408)|856|454|469|(0)|472|(0)|475|(0)(0)|481|502|(0)(0)|520|(0)|523|(0)(0)|546|(0)(0)|564|771|565|(0)|568|(0)|571|(0)(0)|609|(1:610)|860|663|(0)|666|(0)(0)|672|687|(0)|697|(0)|700|(0)(0)|706|724|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x13fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x13fe, code lost:
    
        r5 = new java.lang.Object[1];
        b(new byte[]{-98, -97, -106, -107, -104, -97, -107, -103, -106, -103, -106}, null, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, null, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x141b, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x1432, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x1436, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x1464, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x1468, code lost:
    
        if (r1 == null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x146a, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 42 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x1497, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x149f, code lost:
    
        r8 = new java.lang.Object[]{-1014940305, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 55 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
        r3 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.$$g;
        r9 = new java.lang.Object[1];
        e(r3[22], r3[12], r3[43], r9);
        r2.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x1a73, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x1a74, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x1a8e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x1a8f, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x1a90, code lost:
    
        r1 = r0;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x2cec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x2ced, code lost:
    
        r5 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, new int[]{1853142063, 1331018030, -410366160, -1324086220, -712722040, -1394052761}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x2d23, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x2d3a, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x2d3e, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r10 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r10 - ((r10 >> 63) << 32)));
        r10 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r10 - ((r10 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x2d69, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x2d6d, code lost:
    
        if (r5 == null) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x2d6f, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.View.getDefaultSize(0, 0), 42 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x2d97, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x2d9f, code lost:
    
        r8 = new java.lang.Object[]{-1014940305, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 56 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.graphics.Color.alpha(0));
        r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.$$g;
        r9 = new java.lang.Object[1];
        e(r2[22], r2[12], r2[43], r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x084b A[Catch: all -> 0x0392, TryCatch #39 {all -> 0x0392, blocks: (B:463:0x1af6, B:465:0x1afc, B:466:0x1b2b, B:691:0x30ac, B:693:0x30b2, B:694:0x30dd, B:728:0x33f7, B:730:0x33fd, B:731:0x3426, B:708:0x323d, B:710:0x3260, B:711:0x32b1, B:657:0x2d69, B:659:0x2d6f, B:660:0x2d97, B:556:0x266f, B:558:0x2675, B:559:0x26a2, B:561:0x26dc, B:562:0x2723, B:530:0x23cd, B:532:0x23e2, B:533:0x2412, B:512:0x20c6, B:514:0x20cc, B:515:0x20f6, B:517:0x2130, B:518:0x217a, B:483:0x1d7d, B:485:0x1d92, B:486:0x1dbe, B:488:0x1df2, B:489:0x1e6e, B:338:0x1464, B:340:0x146a, B:341:0x1497, B:269:0x0fd8, B:271:0x0fde, B:272:0x1007, B:183:0x0a83, B:185:0x0a89, B:186:0x0ab3, B:137:0x0845, B:139:0x084b, B:140:0x0876, B:24:0x019b, B:26:0x01a1, B:27:0x01c7, B:29:0x0301, B:31:0x0333, B:32:0x038c, B:146:0x0911, B:148:0x0915, B:169:0x0a0d, B:171:0x0a13, B:172:0x0a14, B:174:0x0a16, B:176:0x0a1d, B:177:0x0a1e, B:152:0x0921, B:162:0x0978, B:164:0x0985, B:165:0x09f9, B:158:0x092c, B:160:0x0941, B:161:0x0972, B:565:0x2846, B:567:0x284c, B:568:0x2891, B:570:0x28b8, B:571:0x2901, B:573:0x2915, B:575:0x291e, B:576:0x2962, B:609:0x2bad, B:610:0x2bb1, B:612:0x2bb7, B:615:0x2bcf, B:618:0x2bdc, B:620:0x2bdf, B:632:0x2cc6, B:634:0x2ccc, B:635:0x2ccd, B:637:0x2ccf, B:639:0x2cd6, B:640:0x2cd7, B:579:0x2971, B:581:0x2975, B:585:0x2981, B:587:0x2987, B:599:0x2a9a, B:601:0x2aa0, B:602:0x2ae3, B:604:0x2b0d, B:605:0x2b51, B:607:0x2b67, B:608:0x2ba7, B:642:0x2cd9, B:644:0x2ce0, B:645:0x2ce1, B:647:0x2ce3, B:649:0x2cea, B:650:0x2ceb, B:589:0x29a7, B:591:0x29bc, B:592:0x29f0, B:628:0x2c40, B:623:0x2c0a, B:625:0x2c10, B:626:0x2c38, B:594:0x29f7, B:596:0x2a16, B:597:0x2a8e, B:276:0x108e, B:278:0x1094, B:279:0x10d8, B:281:0x10e5, B:283:0x10ee, B:284:0x1132, B:304:0x12f2, B:312:0x135b, B:318:0x13e1, B:320:0x13e7, B:321:0x13e8, B:323:0x13ea, B:325:0x13f1, B:326:0x13f2, B:287:0x1148, B:294:0x11d3, B:296:0x11d9, B:297:0x121a, B:299:0x1244, B:300:0x1288, B:302:0x129e, B:303:0x12ea, B:328:0x13f4, B:330:0x13fb, B:331:0x13fc, B:308:0x1323, B:310:0x1329, B:311:0x1354, B:289:0x1168, B:291:0x117a, B:292:0x11c7, B:314:0x1361, B:190:0x0b37, B:192:0x0b3d, B:193:0x0b87, B:195:0x0b94, B:197:0x0b9d, B:198:0x0be6, B:221:0x0e16, B:222:0x0e1a, B:224:0x0e20, B:227:0x0e39, B:230:0x0e46, B:232:0x0e49, B:244:0x0f32, B:246:0x0f38, B:247:0x0f39, B:249:0x0f3b, B:251:0x0f42, B:252:0x0f43, B:199:0x0bf1, B:211:0x0cee, B:213:0x0cf4, B:214:0x0d42, B:216:0x0d6c, B:217:0x0db2, B:219:0x0dc8, B:220:0x0e10, B:254:0x0f45, B:256:0x0f4c, B:257:0x0f4d, B:259:0x0f4f, B:261:0x0f56, B:262:0x0f57), top: B:829:0x019b, inners: #3, #8, #21, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1094 A[Catch: all -> 0x13fd, TryCatch #21 {all -> 0x13fd, blocks: (B:276:0x108e, B:278:0x1094, B:279:0x10d8, B:281:0x10e5, B:283:0x10ee, B:284:0x1132, B:304:0x12f2, B:312:0x135b, B:318:0x13e1, B:320:0x13e7, B:321:0x13e8, B:323:0x13ea, B:325:0x13f1, B:326:0x13f2, B:287:0x1148, B:294:0x11d3, B:296:0x11d9, B:297:0x121a, B:299:0x1244, B:300:0x1288, B:302:0x129e, B:303:0x12ea, B:328:0x13f4, B:330:0x13fb, B:331:0x13fc, B:308:0x1323, B:310:0x1329, B:311:0x1354, B:289:0x1168, B:291:0x117a, B:292:0x11c7, B:314:0x1361), top: B:794:0x108e, outer: #39, inners: #6, #14, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x10e5 A[Catch: all -> 0x13fd, TryCatch #21 {all -> 0x13fd, blocks: (B:276:0x108e, B:278:0x1094, B:279:0x10d8, B:281:0x10e5, B:283:0x10ee, B:284:0x1132, B:304:0x12f2, B:312:0x135b, B:318:0x13e1, B:320:0x13e7, B:321:0x13e8, B:323:0x13ea, B:325:0x13f1, B:326:0x13f2, B:287:0x1148, B:294:0x11d3, B:296:0x11d9, B:297:0x121a, B:299:0x1244, B:300:0x1288, B:302:0x129e, B:303:0x12ea, B:328:0x13f4, B:330:0x13fb, B:331:0x13fc, B:308:0x1323, B:310:0x1329, B:311:0x1354, B:289:0x1168, B:291:0x117a, B:292:0x11c7, B:314:0x1361), top: B:794:0x108e, outer: #39, inners: #6, #14, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1148 A[Catch: all -> 0x13fd, TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x13fd, blocks: (B:276:0x108e, B:278:0x1094, B:279:0x10d8, B:281:0x10e5, B:283:0x10ee, B:284:0x1132, B:304:0x12f2, B:312:0x135b, B:318:0x13e1, B:320:0x13e7, B:321:0x13e8, B:323:0x13ea, B:325:0x13f1, B:326:0x13f2, B:287:0x1148, B:294:0x11d3, B:296:0x11d9, B:297:0x121a, B:299:0x1244, B:300:0x1288, B:302:0x129e, B:303:0x12ea, B:328:0x13f4, B:330:0x13fb, B:331:0x13fc, B:308:0x1323, B:310:0x1329, B:311:0x1354, B:289:0x1168, B:291:0x117a, B:292:0x11c7, B:314:0x1361), top: B:794:0x108e, outer: #39, inners: #6, #14, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x1304  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x159c A[Catch: all -> 0x1570, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x1570, blocks: (B:347:0x1527, B:353:0x159c, B:358:0x15f9, B:360:0x15ff, B:361:0x1642, B:416:0x195f, B:419:0x196c, B:366:0x165f, B:371:0x166e, B:395:0x1805, B:399:0x187b, B:405:0x18de, B:369:0x1665), top: B:775:0x1527 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x15f6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x1651  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1938 A[Catch: all -> 0x1a8e, TryCatch #35 {all -> 0x1a8e, blocks: (B:345:0x1521, B:351:0x1575, B:354:0x15e2, B:407:0x192e, B:408:0x1932, B:410:0x1938, B:413:0x1953, B:376:0x1678, B:393:0x17ff, B:396:0x184f, B:402:0x18c7, B:406:0x1928), top: B:821:0x1521 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1afc A[Catch: all -> 0x0392, TryCatch #39 {all -> 0x0392, blocks: (B:463:0x1af6, B:465:0x1afc, B:466:0x1b2b, B:691:0x30ac, B:693:0x30b2, B:694:0x30dd, B:728:0x33f7, B:730:0x33fd, B:731:0x3426, B:708:0x323d, B:710:0x3260, B:711:0x32b1, B:657:0x2d69, B:659:0x2d6f, B:660:0x2d97, B:556:0x266f, B:558:0x2675, B:559:0x26a2, B:561:0x26dc, B:562:0x2723, B:530:0x23cd, B:532:0x23e2, B:533:0x2412, B:512:0x20c6, B:514:0x20cc, B:515:0x20f6, B:517:0x2130, B:518:0x217a, B:483:0x1d7d, B:485:0x1d92, B:486:0x1dbe, B:488:0x1df2, B:489:0x1e6e, B:338:0x1464, B:340:0x146a, B:341:0x1497, B:269:0x0fd8, B:271:0x0fde, B:272:0x1007, B:183:0x0a83, B:185:0x0a89, B:186:0x0ab3, B:137:0x0845, B:139:0x084b, B:140:0x0876, B:24:0x019b, B:26:0x01a1, B:27:0x01c7, B:29:0x0301, B:31:0x0333, B:32:0x038c, B:146:0x0911, B:148:0x0915, B:169:0x0a0d, B:171:0x0a13, B:172:0x0a14, B:174:0x0a16, B:176:0x0a1d, B:177:0x0a1e, B:152:0x0921, B:162:0x0978, B:164:0x0985, B:165:0x09f9, B:158:0x092c, B:160:0x0941, B:161:0x0972, B:565:0x2846, B:567:0x284c, B:568:0x2891, B:570:0x28b8, B:571:0x2901, B:573:0x2915, B:575:0x291e, B:576:0x2962, B:609:0x2bad, B:610:0x2bb1, B:612:0x2bb7, B:615:0x2bcf, B:618:0x2bdc, B:620:0x2bdf, B:632:0x2cc6, B:634:0x2ccc, B:635:0x2ccd, B:637:0x2ccf, B:639:0x2cd6, B:640:0x2cd7, B:579:0x2971, B:581:0x2975, B:585:0x2981, B:587:0x2987, B:599:0x2a9a, B:601:0x2aa0, B:602:0x2ae3, B:604:0x2b0d, B:605:0x2b51, B:607:0x2b67, B:608:0x2ba7, B:642:0x2cd9, B:644:0x2ce0, B:645:0x2ce1, B:647:0x2ce3, B:649:0x2cea, B:650:0x2ceb, B:589:0x29a7, B:591:0x29bc, B:592:0x29f0, B:628:0x2c40, B:623:0x2c0a, B:625:0x2c10, B:626:0x2c38, B:594:0x29f7, B:596:0x2a16, B:597:0x2a8e, B:276:0x108e, B:278:0x1094, B:279:0x10d8, B:281:0x10e5, B:283:0x10ee, B:284:0x1132, B:304:0x12f2, B:312:0x135b, B:318:0x13e1, B:320:0x13e7, B:321:0x13e8, B:323:0x13ea, B:325:0x13f1, B:326:0x13f2, B:287:0x1148, B:294:0x11d3, B:296:0x11d9, B:297:0x121a, B:299:0x1244, B:300:0x1288, B:302:0x129e, B:303:0x12ea, B:328:0x13f4, B:330:0x13fb, B:331:0x13fc, B:308:0x1323, B:310:0x1329, B:311:0x1354, B:289:0x1168, B:291:0x117a, B:292:0x11c7, B:314:0x1361, B:190:0x0b37, B:192:0x0b3d, B:193:0x0b87, B:195:0x0b94, B:197:0x0b9d, B:198:0x0be6, B:221:0x0e16, B:222:0x0e1a, B:224:0x0e20, B:227:0x0e39, B:230:0x0e46, B:232:0x0e49, B:244:0x0f32, B:246:0x0f38, B:247:0x0f39, B:249:0x0f3b, B:251:0x0f42, B:252:0x0f43, B:199:0x0bf1, B:211:0x0cee, B:213:0x0cf4, B:214:0x0d42, B:216:0x0d6c, B:217:0x0db2, B:219:0x0dc8, B:220:0x0e10, B:254:0x0f45, B:256:0x0f4c, B:257:0x0f4d, B:259:0x0f4f, B:261:0x0f56, B:262:0x0f57), top: B:829:0x019b, inners: #3, #8, #21, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1bb8  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1c1e  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1c83  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1d5e  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1fb0  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x2087  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x2278  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x22ca  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x23ad  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x2549  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x262a  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x284c A[Catch: all -> 0x2cec, TryCatch #8 {all -> 0x2cec, blocks: (B:565:0x2846, B:567:0x284c, B:568:0x2891, B:570:0x28b8, B:571:0x2901, B:573:0x2915, B:575:0x291e, B:576:0x2962, B:609:0x2bad, B:610:0x2bb1, B:612:0x2bb7, B:615:0x2bcf, B:618:0x2bdc, B:620:0x2bdf, B:632:0x2cc6, B:634:0x2ccc, B:635:0x2ccd, B:637:0x2ccf, B:639:0x2cd6, B:640:0x2cd7, B:579:0x2971, B:581:0x2975, B:585:0x2981, B:587:0x2987, B:599:0x2a9a, B:601:0x2aa0, B:602:0x2ae3, B:604:0x2b0d, B:605:0x2b51, B:607:0x2b67, B:608:0x2ba7, B:642:0x2cd9, B:644:0x2ce0, B:645:0x2ce1, B:647:0x2ce3, B:649:0x2cea, B:650:0x2ceb, B:589:0x29a7, B:591:0x29bc, B:592:0x29f0, B:628:0x2c40, B:623:0x2c0a, B:625:0x2c10, B:626:0x2c38, B:594:0x29f7, B:596:0x2a16, B:597:0x2a8e), top: B:771:0x2846, outer: #39, inners: #0, #29, #34, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x28b8 A[Catch: all -> 0x2cec, TryCatch #8 {all -> 0x2cec, blocks: (B:565:0x2846, B:567:0x284c, B:568:0x2891, B:570:0x28b8, B:571:0x2901, B:573:0x2915, B:575:0x291e, B:576:0x2962, B:609:0x2bad, B:610:0x2bb1, B:612:0x2bb7, B:615:0x2bcf, B:618:0x2bdc, B:620:0x2bdf, B:632:0x2cc6, B:634:0x2ccc, B:635:0x2ccd, B:637:0x2ccf, B:639:0x2cd6, B:640:0x2cd7, B:579:0x2971, B:581:0x2975, B:585:0x2981, B:587:0x2987, B:599:0x2a9a, B:601:0x2aa0, B:602:0x2ae3, B:604:0x2b0d, B:605:0x2b51, B:607:0x2b67, B:608:0x2ba7, B:642:0x2cd9, B:644:0x2ce0, B:645:0x2ce1, B:647:0x2ce3, B:649:0x2cea, B:650:0x2ceb, B:589:0x29a7, B:591:0x29bc, B:592:0x29f0, B:628:0x2c40, B:623:0x2c0a, B:625:0x2c10, B:626:0x2c38, B:594:0x29f7, B:596:0x2a16, B:597:0x2a8e), top: B:771:0x2846, outer: #39, inners: #0, #29, #34, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x2915 A[Catch: all -> 0x2cec, TryCatch #8 {all -> 0x2cec, blocks: (B:565:0x2846, B:567:0x284c, B:568:0x2891, B:570:0x28b8, B:571:0x2901, B:573:0x2915, B:575:0x291e, B:576:0x2962, B:609:0x2bad, B:610:0x2bb1, B:612:0x2bb7, B:615:0x2bcf, B:618:0x2bdc, B:620:0x2bdf, B:632:0x2cc6, B:634:0x2ccc, B:635:0x2ccd, B:637:0x2ccf, B:639:0x2cd6, B:640:0x2cd7, B:579:0x2971, B:581:0x2975, B:585:0x2981, B:587:0x2987, B:599:0x2a9a, B:601:0x2aa0, B:602:0x2ae3, B:604:0x2b0d, B:605:0x2b51, B:607:0x2b67, B:608:0x2ba7, B:642:0x2cd9, B:644:0x2ce0, B:645:0x2ce1, B:647:0x2ce3, B:649:0x2cea, B:650:0x2ceb, B:589:0x29a7, B:591:0x29bc, B:592:0x29f0, B:628:0x2c40, B:623:0x2c0a, B:625:0x2c10, B:626:0x2c38, B:594:0x29f7, B:596:0x2a16, B:597:0x2a8e), top: B:771:0x2846, outer: #39, inners: #0, #29, #34, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x296d  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x2bb7 A[Catch: all -> 0x2cec, TryCatch #8 {all -> 0x2cec, blocks: (B:565:0x2846, B:567:0x284c, B:568:0x2891, B:570:0x28b8, B:571:0x2901, B:573:0x2915, B:575:0x291e, B:576:0x2962, B:609:0x2bad, B:610:0x2bb1, B:612:0x2bb7, B:615:0x2bcf, B:618:0x2bdc, B:620:0x2bdf, B:632:0x2cc6, B:634:0x2ccc, B:635:0x2ccd, B:637:0x2ccf, B:639:0x2cd6, B:640:0x2cd7, B:579:0x2971, B:581:0x2975, B:585:0x2981, B:587:0x2987, B:599:0x2a9a, B:601:0x2aa0, B:602:0x2ae3, B:604:0x2b0d, B:605:0x2b51, B:607:0x2b67, B:608:0x2ba7, B:642:0x2cd9, B:644:0x2ce0, B:645:0x2ce1, B:647:0x2ce3, B:649:0x2cea, B:650:0x2ceb, B:589:0x29a7, B:591:0x29bc, B:592:0x29f0, B:628:0x2c40, B:623:0x2c0a, B:625:0x2c10, B:626:0x2c38, B:594:0x29f7, B:596:0x2a16, B:597:0x2a8e), top: B:771:0x2846, outer: #39, inners: #0, #29, #34, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x2e25  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x2e79  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x2ed3  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x308d  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x316d  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x31c3  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x321f  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x33d7  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x1527 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:869:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v60, types: [long] */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
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
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v63 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r1v685, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v513, types: [java.lang.Object[]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataCompletionActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        equals = 0;
        copydefault();
        component3();
        int i = copy + 39;
        equals = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 113;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        getRequestBeneficiariesState = i2 % 128;
        int[] iArr = {415453419, 766064590, 1906346485, -1586121870, 1180173758, 1706595410, -84982874, 1055679099, -960355217, 1963301079, 1523007373, 54735164, 1201832850, -1888262396, -69467914, 1598675369, 2073044969, 603873818};
        if (i2 % 2 == 0) {
            component1 = iArr;
            return;
        }
        component1 = iArr;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = new char[]{30709, 30696, 30710, 30692, 30699, 30701, 30632, 30695, 30602, 30711, 30705, 30697, 30685, 30593, 30698, 30613, 30694, 30688, 30598, 30706, 30621, 30629, 30704, 30624, 30627, 30634, 30631, 30708, 30625, 30630, 30626, 30628, 30633, 30700, 30702, 30707, 30599, 30596};
        component3 = 321287770;
        ShareDataUIState = true;
        copydefault = true;
        component4 = new int[]{-134582465, 12277181, 1464534515, -330800912, -527836845, -659800793, -790154424, 76454544, -2059354969, -1096523558, -1954999916, -183340182, -539614418, -2076745837, -1833699085, -1501206277, -404453303, 961491430};
    }
}
