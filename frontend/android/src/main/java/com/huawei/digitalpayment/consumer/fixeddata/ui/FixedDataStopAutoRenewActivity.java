package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataStopAutoRenewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataStopAutoRenewActivity extends Hilt_FixedDataStopAutoRenewActivity {
    public static final int $stable = 0;
    private static int ShareDataUIState;
    private static long component1;
    private static char[] component2;
    private static char[] component3;
    private static int component4;
    private static long copy;
    private static boolean copydefault;
    private static char[] getAsAtTimestamp;
    private static boolean getRequestBeneficiariesState;
    private static final byte[] $$c = {117, -24, -14, 98};
    private static final int $$f = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {2, 77, TarHeader.LF_CONTIG, -86, -16, -2, 59, -63, 4, -19, 62, -55, -6, TarHeader.LF_LINK, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -55, -6, -20, 65, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -56, -11, -21, 72, -72, 9, -6, -6, -10, -3, 60, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -72, 9, -15, -3, -8, 6, -15, 1, -7, -11, 71, -28, -35, -19, 13, -9, 35, -47, -4, 39, -51, -4, -7, Ascii.GS, -23, -16, -8, Ascii.FF, -18, -5, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, -7, -3, -3, 5, -13, -10, 62, -16, -2, 59, -62, -17, Ascii.DLE, -26, Ascii.SO, -8, TarHeader.LF_CONTIG, -58, -9, -2, -6, -15, Ascii.SI, -15, -8, Ascii.VT, -28, 8, 4, -13, -10, 66, -57, -16, -3, -9, -6, 4, 4, -17, SignedBytes.MAX_POWER_OF_TWO, -73, 9, -1, -22, 8, TarHeader.LF_CONTIG, -75, 8, TarHeader.LF_CONTIG, -55, -6, -21, 7, -17, 9, -15, -9, 71, -41, -22, -13, 6, 19, -38, -3, 5, -24, TarHeader.LF_BLK, -38, -21, 7, -17, 9, -15, -9, 42, -45, 76, -67, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT};
    private static final int $$h = 250;
    private static final byte[] $$a = {101, 74, 115, 66, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 199;
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r5, byte r6, short r7) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = 122 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r5 = r5 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r5]
        L25:
            int r6 = r6 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.$$i(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.$$a
            int r1 = r7 + 4
            int r5 = r5 * 2
            int r5 = r5 + 83
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.$$g
            int r5 = r5 * 16
            int r5 = r5 + 83
            int r1 = 84 - r7
            byte[] r1 = new byte[r1]
            int r7 = 83 - r7
            r2 = -1
            if (r0 != 0) goto L14
            r5 = r6
            r3 = r7
            goto L2b
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            int r5 = r5 + 1
            r3 = r0[r5]
        L2b:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.d(byte, int, int, java.lang.Object[]):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final FixedDataStopAutoRenewActivity component1;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 67;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    throw null;
                }
                int i4 = ShareDataUIState + 123;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r7, int r8) {
                /*
                    Method dump skipped, instruction units count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.ShareDataUIState.AnonymousClass3.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit ShareDataUIState(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataStopAutoRenewActivity, "");
                    fixedDataStopAutoRenewActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(fixedDataStopAutoRenewActivity, "");
                fixedDataStopAutoRenewActivity.finish();
                int i3 = 60 / 0;
                return Unit.INSTANCE;
            }

            private static final Unit component1(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                int i = 2 % 2;
                int i2 = component3 + 37;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataStopAutoRenewActivity, "");
                fixedDataStopAutoRenewActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 85;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component4(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                int i = 2 % 2;
                int i2 = component3 + 119;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataStopAutoRenewActivity, "");
                fixedDataStopAutoRenewActivity.setResult(-1);
                fixedDataStopAutoRenewActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 55;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit copydefault(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                int i = 2 % 2;
                int i2 = component3 + 97;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(fixedDataStopAutoRenewActivity);
                if (i3 != 0) {
                    int i4 = 34 / 0;
                }
                int i5 = component3 + 77;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return unitShareDataUIState;
            }

            public static Unit component3(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 5;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    component1(fixedDataStopAutoRenewActivity);
                    throw null;
                }
                Unit unitComponent1 = component1(fixedDataStopAutoRenewActivity);
                int i3 = ShareDataUIState + 49;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent1;
            }

            public static Unit component2(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 117;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent4 = component4(fixedDataStopAutoRenewActivity);
                int i4 = ShareDataUIState + 63;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent4;
            }

            AnonymousClass3(FixedDataStopAutoRenewActivity fixedDataStopAutoRenewActivity) {
                this.component1 = fixedDataStopAutoRenewActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 109;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = copydefault + 17;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
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
                if (r13 != r0) goto L1b
                int r13 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.ShareDataUIState.copydefault
                int r13 = r13 + 85
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.ShareDataUIState.ShareDataUIState = r1
                int r13 = r13 % r0
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L17
                goto L1b
            L17:
                r12.skipToGroupEnd()
                goto L3d
            L1b:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity$ShareDataUIState$3 r13 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity$ShareDataUIState$3
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity r7 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.this
                r13.<init>(r7)
                r7 = 54
                r8 = -1386000805(0xffffffffad634e5b, float:-1.29208545E-11)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L3d:
                int r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.ShareDataUIState.ShareDataUIState
                int r12 = r12 + 35
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.ShareDataUIState.copydefault = r13
                int r12 = r12 % r0
                if (r12 == 0) goto L49
                return
            L49:
                r12 = 0
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.ShareDataUIState.copydefault(androidx.compose.runtime.Composer, int):void");
        }

        ShareDataUIState() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.a(char, int, int, java.lang.Object[]):void");
    }

    private static void e(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 23;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i2) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 1758, 'R' - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(0, 0), 1159210934, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 & 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 3608, 29 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (7171 - Color.alpha(0)), 1951385784, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, (char) (27761 - TextUtils.getCapsMode("", 0, 0)), -1529629956, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        while (cancelnotification.copydefault < i2) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 4013, View.MeasureSpec.getSize(0) + 24, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArr);
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        long j = 0;
        char c2 = '0';
        int i3 = -1;
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
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 3760, 'H' - AndroidCharacter.getMirror(c2), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), -1670574543, false, $$i(b2, (byte) (b2 & TarHeader.LF_FIFO), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                    c2 = '0';
                    i3 = -1;
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (getRequestBeneficiariesState) {
            int i6 = $11 + 47;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) (-1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - KeyEvent.getDeadChar(0, 0), AndroidCharacter.getMirror('0') - 29, (char) (KeyEvent.normalizeMetaState(0) + 7644), -327556343, false, $$i(b3, (byte) (b3 & TarHeader.LF_LINK), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!copydefault) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i7 = $11 + 81;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i9 = $11 + 81;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = $10 + 77;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            try {
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) (-1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 2748, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, (char) (7645 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), -327556343, false, $$i(b4, (byte) (b4 & TarHeader.LF_LINK), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i5 = 689978476;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x25ae  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x25af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0180  */
    /* JADX WARN: Type inference failed for: r1v203, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v342, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = toString + 121;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = toString + 23;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).length() + 25, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23632), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 20, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode("", 0, 0) + 42, (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6562, View.MeasureSpec.getSize(0) + 56, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -699576857, false, "component2", new Class[]{Context.class});
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
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = toString + 13;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 109), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() - 1, 26 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((char) (ExpandableListView.getPackedPositionGroup(0L) + 23633), 26 - ExpandableListView.getPackedPositionGroup(0L), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() + 17, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = toString + 13;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i6 = toString + 103;
                getSponsorBeneficiariesState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 5;
                }
            } else {
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 6618, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Process.getGidForName("") + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 6563, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -960739708, false, "component3", new Class[]{Context.class});
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
    public void attachBaseContext(android.content.Context r38) {
        /*
            Method dump skipped, instruction units count: 14485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataStopAutoRenewActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        component4 = 1;
        component3();
        component2();
        int i = equals + 83;
        component4 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = toString + 75;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = toString + 25;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = toString + 85;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        component2 = new char[]{52962, 17639, 56062, 20660, 59085, 31961, 62166, 2249, 40620, 5305, 43765, 8326, 46724, 52371, 17046, 55410, 28272, 58484, 31315, 61515, 1612, 40017, 4642, 43040, 15917, 46158, 51720, 16413, 54803, 28151, 58362, 31227, 36804, 1498, 39837, 4553, 42915, 15791, 45986, 51639, 24519, 54674, 27534, 57723, 30575, 36193, 881, 39234, 12125, 42333, 15152, 45412, 50996, 23871, 54035, 26887, 65295, 29417, 35071, 7915, 38067, 10999, 41161, 14037, 19589, 49833, 22695, 61115, 25770, 64130, 28827, 34439, 7243, 37477, 10357, 48710, 13377, 19025, 49228, 22023, 60466, 25132, 63498, 3612, 33820, 6664, 37374, 10154, 48618, 13264, 18894, 57297, 21972, 60325, 24995, 63474, 3525, 33665, 6557, 44950, 9580, 47970, 12658, 18298, 56589, 21318, 59730, 32551, 62778, 2841, 33072, 5890, 44308, 8980, 46832, 52398, 17137, 55545, 28353, 58575, 31436, 61612, 1727, 40182, 4847, 3093, 34320, 6153, 37443, 9274, 48686, 12321, 51774, 23643, 54862, 26626, 57969, 29811, 3684, 32865, 6789, 44167, 9859, 47268, 12988, 50363, 24230, 53461, 27351, 64730, 30393, 2303, 33514, 5348, 44800, 8461, 47884, 19763, 50989, 22890, 54078, 25937, 65363, 28997, 2893, 40299, 5995, 43369, 9088, 46483, 20429, 49565, 23480, 60904, 26542, 63952, 29660, 1490, 40927, 4597, 44011, 15776, 45110, 18953, 56337, 22021, 59454, 25145, 62517, 36447, '\\', 39540, 11340, 42603, 14454, 45669, 17511, 56970, 20646, 60040, 31924, 63146, 34999, 685, 38083};
        component1 = 6590084207222556287L;
        int i5 = i3 + 109;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component3 = new char[]{30326, 30309, 30323, 30305, 30308, 30318, 30245, 30304, 30215, 30320, 30322, 30314, 30302, 30210, 30241, 30240, 30246, 30247, 30243, 30317, 30238, 30237, 30239, 30321, 30242, 30236, 30250, 30315, 30311, 30209, 30307};
        ShareDataUIState = 321287895;
        copydefault = true;
        getRequestBeneficiariesState = true;
        getAsAtTimestamp = new char[]{3095, 52844, 35066, 19288, 1481, 49243, 33450, 23924, 8119, 55826, 38030, 22180, 4423, 54257, 44634, 26835, 11072, 58795, 41002, 25235, 15666, 65434, 47612, 29823, 14071, 61766, 20548, 37414, 54461, 5897, 22930, 39949, 57067, 330, 17399, 34371, 51395, 2738, 19764, 36770, 61963, 13442, 30472, 47613, 14162, 62846, 46058, 28681, 16085, 64320, 47592, 26234, 9379, 57668, 44941, 28150, 10874, 59620, 38158, 21449, 4113, 57014, 39726, 22938, 1602, 50308, 33533, 20282, 3559, 51807, 34973, 46395, 29665, 12406, 65229, 47961, 31190, 10150, 58475, 41694, 28497, 11726, 60008, 43262, 21797, 5011, 53259, 40570, 23799, 6496, 51167, 33821, 59244, 9476, 25496, 41000, 61095, 11130, 27027, 46599, 62610, 12581, 32692, 48591, 64071, 14470, 17768, 33789, 49269, 3718, 19230, 35242, 54816, 5303, 21151, 40714, 56778, 6692, 22692, 25930, 41937, 57409, 12008, 27499, 43493, 63363, 13336, 29430, 48947, 64949, 14941, 30938, 34112, 50147, AbstractJsonLexerKt.END_OBJ, 19981, 35989, 51474, 6073, 21606, 37543, 57183, 7617, 23095, 39157, 42352, 58133, 8647, 28173, 44222, 59691, 14301, 29767, 45780, 65331, 15870, 31286, 47199, 50825, 814, 16817, 36398, 52424, 2395, 3100, 52835, 35048, 19275, 1416, 49246, 33455, 23860, 8113, 55884, 38061, 22259, 4469, 54246, 44619, 26839, 55000, 5281, 21052, 37251, 57109, 6812, 22653, 34788, 50521, 196, 20042, 35877, 52098, 2362, 29837, 45592, 3095, 52844, 35066, 19288, 1481, 49243, 33450, 23924, 8121, 55825, 38096, 22233, 4479, 54241, 44634, 26847, 11099, 58753, 41010, 25221, 15621, 65433, 3088, 52795, 35066, 19226, 1477, 49232, 33455, 23917, 8117, 55894, 38043, 22248, 4403, 54177, 44575, 26846, 11008, 58871, 41016, 25308, 15623, 65425, 47594, 29742, 13988, 61716, 45961, 36398, 18596, 2913, 50568, 32840, 17103, 7398, 57127, 39326, 21534, 5764, 53627, 37858, 28211, 10449, 60239, 42348, 26597, 8739, 64719, 48910, 31184, 13435, 63160, 45320, 29653, 19991, 2154, 51875, 34165, 18374, 519, 56573, 40822, 23011, 5133, 54937, 3150, 52787, 34984, 19226, 1426, 49153, 33529, 23906, 8160, 55888, 38090};
        copy = 1204783585086459394L;
    }
}
