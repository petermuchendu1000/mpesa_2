package com.huawei.digitalpayment.consumer.sfcui.bonga.statement;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.addOnNewIntentListener;
import kotlin.addOnPictureInPictureModeChangedListener;
import kotlin.cancel;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/BongaDatePickerActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaDatePickerActivity extends FragmentActivity {
    public static final int $stable = 0;

    public static final Companion INSTANCE;
    public static final String EXTRA_CALL_TO_ACTION = "EXTRA_CALL_TO_ACTION";
    public static final String EXTRA_SELECTED_DATE_MILLIS = "EXTRA_SELECTED_DATE_MILLIS";
    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    public static final String RESULT_DATE_MILLIS = "RESULT_DATE_MILLIS";
    private static long ShareDataUIState;
    private static int component1;
    private static int component2;
    private static char component3;
    private static boolean component4;
    private static int copy;
    private static char[] copydefault;
    private static boolean equals;
    private static int[] getAsAtTimestamp;
    private static final byte[] $$c = {111, -17, Ascii.VT, -125};
    private static final int $$f = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, 69, -115, -114, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 58, -14, 57, -76, 5, -4, -10, -25, 3, -21, 9, -27, 66, -67, -13, -14, 7, -21, -4, 5, -19, TarHeader.LF_FIFO, -73, -9, 3, -21, 9, -27, -3, -11, -9, Base64.padSymbol, -73, 5, -25, 6, -21, -12, 13, -9, -18, -1, 47, -41, -27, -25, 6, -21, -12, 13, -9, -18, -1, 6, -26, -13, 2, -19, -16, 45, -53, -14, -1, 2, -5, -25, -15, 77, -71, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16};
    private static final int $$e = 219;
    private static final byte[] $$a = {118, 33, 67, 92, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 107;
    private static int hashCode = 0;
    private static int toString = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r7, int r8, byte r9) {
        /*
            int r9 = r9 + 68
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.$$g(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = 28 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.$$a
            int r8 = r8 * 2
            int r8 = r8 + 83
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
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
            r4 = r1[r8]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            int r8 = r8 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.$$d
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r7 = 78 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-8)
            int r6 = r6 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.e(short, int, int, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/BongaDatePickerActivity$Companion;", "", "<init>", "()V", BongaDatePickerActivity.EXTRA_TITLE, "", BongaDatePickerActivity.EXTRA_CALL_TO_ACTION, BongaDatePickerActivity.EXTRA_SELECTED_DATE_MILLIS, BongaDatePickerActivity.RESULT_DATE_MILLIS, "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void component3() {
            addOnNewIntentListener.component1[0] = addOnPictureInPictureModeChangedListener.component3[0];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        final String component1;
        final String copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 1;
            private static int component2;
            final String ShareDataUIState;
            final BongaDatePickerActivity component3;
            final String copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 125;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    int i4 = 70 / 0;
                }
                int i5 = component1 + 31;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 75 / 0;
                }
                return unit;
            }

            private static final Unit component1(BongaDatePickerActivity bongaDatePickerActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component2 + 99;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bongaDatePickerActivity, "");
                    bongaDatePickerActivity.finish();
                    unit = Unit.INSTANCE;
                    int i3 = 59 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(bongaDatePickerActivity, "");
                    bongaDatePickerActivity.finish();
                    unit = Unit.INSTANCE;
                }
                int i4 = component2 + 51;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component1(BongaDatePickerActivity bongaDatePickerActivity, Date date) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(bongaDatePickerActivity, "");
                Intrinsics.checkNotNullParameter(date, "");
                Intent intent = new Intent();
                intent.putExtra(BongaDatePickerActivity.RESULT_DATE_MILLIS, date.getTime());
                bongaDatePickerActivity.setResult(-1, intent);
                bongaDatePickerActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i2 = component1 + 39;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static final Unit copydefault(BongaDatePickerActivity bongaDatePickerActivity) {
                int i = 2 % 2;
                int i2 = component1 + 27;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(bongaDatePickerActivity, "");
                bongaDatePickerActivity.setResult(0);
                bongaDatePickerActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 55;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component3() {
                int i = 2 % 2;
                int i2 = component1 + 85;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 23;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component2(androidx.compose.runtime.Composer r21, int r22) {
                /*
                    Method dump skipped, instruction units count: 477
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.AnonymousClass3.component2(androidx.compose.runtime.Composer, int):void");
            }

            public static Unit component3(BongaDatePickerActivity bongaDatePickerActivity) {
                int i = 2 % 2;
                int i2 = component1 + 69;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return component1(bongaDatePickerActivity);
                }
                component1(bongaDatePickerActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState() {
                int i = 2 % 2;
                int i2 = component2 + 65;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3();
                int i4 = component1 + 83;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit copydefault(BongaDatePickerActivity bongaDatePickerActivity, Date date) {
                int i = 2 % 2;
                int i2 = component1 + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(bongaDatePickerActivity, date);
                int i4 = component1 + 97;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
                return unitComponent1;
            }

            public static Unit ShareDataUIState(BongaDatePickerActivity bongaDatePickerActivity) {
                int i = 2 % 2;
                int i2 = component2 + 105;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(bongaDatePickerActivity);
                int i4 = component1 + 59;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 61 / 0;
                }
                return unitCopydefault;
            }

            AnonymousClass3(BongaDatePickerActivity bongaDatePickerActivity, String str, String str2) {
                this.component3 = bongaDatePickerActivity;
                this.ShareDataUIState = str;
                this.copydefault = str2;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component1(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L1b
                int r13 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.component3
                int r13 = r13 + 87
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.ShareDataUIState = r1
                int r13 = r13 % r0
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L17
                goto L1b
            L17:
                r12.skipToGroupEnd()
                goto L4a
            L1b:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity$copydefault$3 r13 = new com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity$copydefault$3
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity r7 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.this
                java.lang.String r8 = r11.copydefault
                java.lang.String r9 = r11.component1
                r13.<init>(r7, r8, r9)
                r7 = 54
                r8 = -1162495497(0xffffffffbab5b9f7, float:-0.0013864626)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                int r12 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.component3
                int r12 = r12 + 117
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.ShareDataUIState = r13
                int r12 = r12 % r0
            L4a:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.ShareDataUIState
                int r12 = r12 + 75
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.component3 = r13
                int r12 = r12 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.copydefault.component1(androidx.compose.runtime.Composer, int):void");
        }

        copydefault(String str, String str2) {
            this.copydefault = str;
            this.component1 = str2;
        }
    }

    private static void d(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int i7 = 4038 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iGreen = Color.green(i4) + 31;
                    char capsMode = (char) (TextUtils.getCapsMode("", i4, i4) + 19181);
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    String str$$g = $$g(b2, b3, (byte) (b3 | Ascii.US));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i7, iGreen, capsMode, 1912513118, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7566;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 12;
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i8, iIndexOf, cAxisFromString, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(i4, i4, i4, i4) + 2459, Color.red(i4) + 28, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 931716605, false, $$g(b4, b5, (byte) (b5 | Ascii.RS)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7566, (ViewConfiguration.getEdgeSlop() >> 16) + 11, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i10 = $10 + 87;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getAsAtTimestamp;
        int i4 = 684241640;
        int i5 = -1;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $10 + 57;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 95;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 4391, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -309236339, false, $$g(b2, b3, (byte) (b3 | 38)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i10] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i10 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i10])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 4391, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -309236339, false, $$g(b4, b5, (byte) (b5 | 38)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i10++;
                }
                i2 = 2;
                i4 = 684241640;
                i5 = -1;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getAsAtTimestamp;
        if (iArr5 != null) {
            int i12 = $10 + 43;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr4 = new Object[i6];
                objArr4[i7] = Integer.valueOf(iArr5[i14]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    int i15 = (ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1)) + 4391;
                    int bitsPerPixel = 36 - ImageFormat.getBitsPerPixel(i7);
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)) + i6);
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i15, bitsPerPixel, c2, -309236339, false, $$g(b6, b7, (byte) (b7 | 38)), new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i14++;
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i16 = i7;
        System.arraycopy(iArr5, i16, iArr4, i16, length2);
        getactivenotifications.component1 = i16;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i16] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i17];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2969, 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49870), 462826032, false, $$g(b8, b9, (byte) (b9 | 36)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i17++;
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
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2944, ExpandableListView.getPackedPositionGroup(0L) + 24, (char) (27636 - Process.getGidForName("")), -1616366948, false, $$g(b10, b11, (byte) (b11 | 39)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i16 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = copydefault;
        int i5 = -1;
        long j = 0;
        if (cArr3 != null) {
            int i6 = $10;
            int i7 = i6 + 7;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            int i8 = i6 + 123;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 5;
            }
            while (i2 < length) {
                int i10 = $10 + 5;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 3761, (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 23, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1670574543, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 2;
                    i5 = -1;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - Gravity.getAbsoluteGravity(0, 0), 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i12 = 689978476;
        if (component4) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2747, View.MeasureSpec.getSize(0) + 19, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 7645), -327556343, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!equals) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i13 = $11 + 27;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12);
            if (objCopydefault4 == null) {
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2749, 18 - Process.getGidForName(""), (char) (View.combineMeasuredStates(0, 0) + 7644), -327556343, false, $$g(b6, b7, (byte) (b7 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i12 = 689978476;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x10ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x10b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0191  */
    /* JADX WARN: Type inference failed for: r2v142, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = hashCode + 91;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) + 95, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new byte[]{-126, -123, -122, -114, -127, -118, -122, -108, -116, -116, -115, -114, -126, -117, -124, -124, -109, -118}, null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) + 95, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        try {
            if (baseContext != null) {
                int i4 = toString + 49;
                hashCode = i4 % 128;
                if (i4 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 6618, 42 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - Process.getGidForName("")), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6562, 56 - (Process.myPid() >> 22), (char) View.resolveSizeAndState(0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 6618, TextUtils.indexOf("", "", 0) + 42, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6562, 56 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (Process.getGidForName("") + 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                    int i5 = 39 / 0;
                }
            }
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-610792312);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(66 - ((byte) KeyEvent.getModifierMetaStateMask()), Process.getGidForName("") + 34, (char) (19697 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 516019181, false, "component1", null);
            }
            Object obj = ((Field) objCopydefault5).get(null);
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1078988351);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(68 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 33, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19696), 2062954148, false, "copydefault", new Class[0]);
            }
            ((Method) objCopydefault6).invoke(obj, null);
            super.onPause();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(72:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|790|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(10:846|32|(3:34|852|35)|39|40|813|(5:42|43|(1:45)|46|47)(23:48|49|832|50|(2:814|52)|56|57|820|58|(3:60|834|61)(1:65)|818|66|67|816|68|(2:807|70)|74|75|76|(1:78)|79|(1:81)|82)|83|(4:86|(3:886|88|889)(12:885|89|(3:91|(3:94|95|92)|890)|96|809|97|(1:99)|100|101|802|102|888)|887|84)|884)|115|(11:804|(2:151|(2:153|(1:159)(1:158))(2:162|163))(1:164)|165|791|166|(1:168)|169|786|170|(1:172)|173)|197|773|198|(1:200)|201|202|(2:204|(5:206|207|(1:209)|210|211)(3:212|(1:214)|215))(19:216|217|854|218|(1:220)|221|222|842|223|(1:225)|226|227|228|(1:230)|231|(1:233)(1:234)|235|(1:237)|238)|239|(4:242|(13:244|(3:246|249|864)|250|(3:252|(3:255|256|253)|865)|257|836|258|(1:260)|261|262|822|263|863)(2:247|(2:249|864)(11:250|(0)|257|836|258|(0)|261|262|822|263|863))|264|240)|862|298|(8:801|299|(1:301)|302|(3:304|(1:306)|307)(14:309|310|797|311|(1:313)|314|315|316|(1:318)|319|(1:321)|322|(1:324)|325)|308|326|(9:329|788|330|(1:332)|333|334|335|782|336))|366|776|367|(1:369)|370|(1:372)|373|(3:375|(1:377)|378)(44:379|(2:381|(1:387)(1:386))(1:388)|(18:390|856|391|(1:393)|394|395|844|396|(1:398)|399|400|401|(1:403)|404|(1:406)(1:407)|408|(1:410)|411)|466|(1:468)|469|(1:471)|472|(3:474|(1:476)|477)(16:479|480|(1:482)|483|(1:485)|486|487|(1:489)|490|830|491|492|(1:494)|495|(1:497)|498)|478|499|(1:501)(9:502|(3:504|(2:507|505)|883)|508|509|(1:511)|512|(1:514)|515|516)|517|(1:519)|520|(3:522|(1:524)|525)(14:526|527|(1:529)|530|531|(1:533)|534|840|535|536|(1:538)|539|(1:541)|542)|543|(1:545)(9:546|(3:548|(2:551|549)|882)|552|553|(1:555)|556|(1:558)|559|560)|561|793|562|(3:564|772|565)|569|(1:571)|572|573|(4:575|576|(1:578)|579)(27:580|(2:582|(1:588)(1:587))|(22:590|591|777|592|593|784|594|(1:596)|597|598|780|599|(1:601)|602|603|604|(1:606)|607|(1:609)|610|(1:612)|613)(15:663|678|(1:680)|681|(3:683|(1:685)|686)(13:688|795|689|690|(1:692)|693|858|694|695|(1:697)|698|(1:700)|701)|687|702|(6:705|706|(1:708)|709|710|711)|712|(1:714)|715|(3:717|(1:719)|720)(14:722|723|(1:725)|726|727|(1:729)|730|811|731|732|(1:734)|735|(1:737)|738)|721|739|(1:891)(7:742|743|(1:745)|746|747|748|749))|666|667|848|668|671|672|(1:674)|675|676|677|678|(0)|681|(0)(0)|687|702|(0)|712|(0)|715|(0)(0)|721|739|(0)(0))|614|(4:617|(3:875|619|(3:873|621|880)(12:872|625|(3:627|(3:630|631|628)|881)|632|860|633|(1:635)|636|637|850|638|879))(3:871|622|(3:874|624|878)(12:876|625|(0)|632|860|633|(0)|636|637|850|638|879))|877|615)|870|678|(0)|681|(0)(0)|687|702|(0)|712|(0)|715|(0)(0)|721|739|(0)(0))|412|(4:415|(2:417|868)(11:418|(3:420|(3:423|424|421)|869)|425|838|426|(1:428)|429|430|824|431|867)|432|413)|866|466|(0)|469|(0)|472|(0)(0)|478|499|(0)(0)|517|(0)|520|(0)(0)|543|(0)(0)|561|793|562|(0)|569|(0)|572|573|(0)(0)|614|(1:615)|870|678|(0)|681|(0)(0)|687|702|(0)|712|(0)|715|(0)(0)|721|739|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x2dc1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x2dc2, code lost:
    
        r11 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0780 A[Catch: all -> 0x076a, TryCatch #24 {all -> 0x076a, blocks: (B:83:0x0634, B:84:0x0638, B:86:0x063e, B:89:0x065f, B:92:0x0676, B:94:0x0679, B:106:0x0754, B:108:0x075a, B:109:0x075b, B:111:0x075d, B:113:0x0764, B:114:0x0765, B:76:0x056f, B:78:0x058c, B:79:0x05cb, B:81:0x05e2, B:82:0x062e, B:125:0x077a, B:127:0x0780, B:128:0x0781, B:131:0x0788, B:133:0x078e, B:134:0x078f, B:102:0x06da, B:97:0x06a5, B:99:0x06ab, B:100:0x06d2), top: B:813:0x03a8, inners: #18, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0781 A[Catch: all -> 0x076a, TryCatch #24 {all -> 0x076a, blocks: (B:83:0x0634, B:84:0x0638, B:86:0x063e, B:89:0x065f, B:92:0x0676, B:94:0x0679, B:106:0x0754, B:108:0x075a, B:109:0x075b, B:111:0x075d, B:113:0x0764, B:114:0x0765, B:76:0x056f, B:78:0x058c, B:79:0x05cb, B:81:0x05e2, B:82:0x062e, B:125:0x077a, B:127:0x0780, B:128:0x0781, B:131:0x0788, B:133:0x078e, B:134:0x078f, B:102:0x06da, B:97:0x06a5, B:99:0x06ab, B:100:0x06d2), top: B:813:0x03a8, inners: #18, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07ff A[Catch: all -> 0x033e, TryCatch #11 {all -> 0x033e, blocks: (B:143:0x07f9, B:145:0x07ff, B:146:0x0830, B:672:0x2e44, B:674:0x2e4a, B:675:0x2e77, B:706:0x31ad, B:708:0x31b3, B:709:0x31da, B:743:0x3503, B:745:0x3509, B:746:0x3529, B:723:0x3342, B:725:0x3365, B:726:0x33be, B:553:0x26f4, B:555:0x26fa, B:556:0x2723, B:558:0x275d, B:559:0x27a6, B:527:0x2433, B:529:0x2448, B:530:0x2476, B:509:0x20ef, B:511:0x20f5, B:512:0x2121, B:514:0x215b, B:515:0x21a5, B:480:0x1d96, B:482:0x1dab, B:483:0x1ddd, B:485:0x1e11, B:486:0x1e91, B:460:0x1b31, B:462:0x1b37, B:463:0x1b66, B:360:0x14dc, B:362:0x14e2, B:363:0x150d, B:292:0x1032, B:294:0x1038, B:295:0x105d, B:191:0x0a56, B:193:0x0a5c, B:194:0x0a88, B:19:0x0151, B:21:0x0157, B:22:0x017d, B:24:0x02b1, B:26:0x02e2, B:27:0x0338, B:198:0x0b0c, B:200:0x0b12, B:201:0x0b56, B:207:0x0b72, B:209:0x0b78, B:210:0x0bba, B:211:0x0bc3, B:212:0x0bc4, B:214:0x0bcd, B:215:0x0c13, B:239:0x0e3f, B:240:0x0e43, B:244:0x0e55, B:250:0x0e86, B:253:0x0e93, B:255:0x0e96, B:267:0x0f7c, B:269:0x0f82, B:270:0x0f83, B:272:0x0f85, B:274:0x0f8c, B:275:0x0f8d, B:247:0x0e6c, B:216:0x0c1e, B:228:0x0d19, B:230:0x0d1f, B:231:0x0d63, B:233:0x0d8d, B:235:0x0dda, B:237:0x0df1, B:238:0x0e37, B:277:0x0f8f, B:279:0x0f96, B:280:0x0f97, B:282:0x0f99, B:284:0x0fa0, B:285:0x0fa1, B:263:0x0efc, B:258:0x0ec5, B:260:0x0ecb, B:261:0x0ef4, B:223:0x0c8a, B:225:0x0c9f, B:226:0x0d0d, B:218:0x0c3e, B:220:0x0c53, B:221:0x0c83, B:367:0x1592, B:369:0x1598, B:370:0x15e0, B:372:0x1607, B:373:0x1652, B:375:0x1668, B:377:0x1671, B:378:0x16b7, B:412:0x1966, B:413:0x196a, B:415:0x1970, B:418:0x198a, B:421:0x1996, B:423:0x1999, B:435:0x1a7d, B:437:0x1a83, B:438:0x1a84, B:440:0x1a86, B:442:0x1a8d, B:443:0x1a8e, B:381:0x16ca, B:383:0x16ce, B:390:0x16e2, B:401:0x1838, B:403:0x183e, B:404:0x1884, B:406:0x18ae, B:408:0x1901, B:410:0x1918, B:411:0x1960, B:445:0x1a90, B:447:0x1a97, B:448:0x1a98, B:450:0x1a9a, B:452:0x1aa1, B:453:0x1aa2, B:387:0x16da, B:431:0x19fd, B:426:0x19c7, B:428:0x19cd, B:429:0x19f5, B:396:0x1789, B:398:0x17ad, B:399:0x182c, B:391:0x173f, B:393:0x1753, B:394:0x1782, B:299:0x10e4, B:301:0x10ea, B:302:0x112d, B:304:0x113a, B:306:0x1143, B:307:0x1188, B:326:0x1340, B:334:0x13a9, B:340:0x1433, B:342:0x1439, B:343:0x143a, B:345:0x143c, B:347:0x1443, B:348:0x1444, B:309:0x1194, B:316:0x121e, B:318:0x1224, B:319:0x126c, B:321:0x1296, B:322:0x12da, B:324:0x12f0, B:325:0x1338, B:350:0x1446, B:352:0x144d, B:353:0x144e, B:153:0x08c3, B:155:0x08c7, B:177:0x09b7, B:179:0x09bd, B:180:0x09be, B:182:0x09c0, B:184:0x09c7, B:185:0x09c8, B:159:0x08d3, B:162:0x08dc, B:163:0x08df), top: B:790:0x0151, inners: #1, #3, #17, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x08f7 A[Catch: all -> 0x09bf, TryCatch #12 {all -> 0x09bf, blocks: (B:166:0x08e2, B:168:0x08f7, B:169:0x0928), top: B:791:0x08e2, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x093b A[Catch: all -> 0x09b5, TryCatch #9 {all -> 0x09b5, blocks: (B:170:0x092e, B:172:0x093b, B:173:0x09ad), top: B:786:0x092e, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0b12 A[Catch: all -> 0x0fa2, TryCatch #1 {all -> 0x0fa2, blocks: (B:198:0x0b0c, B:200:0x0b12, B:201:0x0b56, B:207:0x0b72, B:209:0x0b78, B:210:0x0bba, B:211:0x0bc3, B:212:0x0bc4, B:214:0x0bcd, B:215:0x0c13, B:239:0x0e3f, B:240:0x0e43, B:244:0x0e55, B:250:0x0e86, B:253:0x0e93, B:255:0x0e96, B:267:0x0f7c, B:269:0x0f82, B:270:0x0f83, B:272:0x0f85, B:274:0x0f8c, B:275:0x0f8d, B:247:0x0e6c, B:216:0x0c1e, B:228:0x0d19, B:230:0x0d1f, B:231:0x0d63, B:233:0x0d8d, B:235:0x0dda, B:237:0x0df1, B:238:0x0e37, B:277:0x0f8f, B:279:0x0f96, B:280:0x0f97, B:282:0x0f99, B:284:0x0fa0, B:285:0x0fa1, B:263:0x0efc, B:258:0x0ec5, B:260:0x0ecb, B:261:0x0ef4, B:223:0x0c8a, B:225:0x0c9f, B:226:0x0d0d, B:218:0x0c3e, B:220:0x0c53, B:221:0x0c83), top: B:773:0x0b0c, outer: #11, inners: #29, #36, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0c1e A[Catch: all -> 0x0fa2, TRY_LEAVE, TryCatch #1 {all -> 0x0fa2, blocks: (B:198:0x0b0c, B:200:0x0b12, B:201:0x0b56, B:207:0x0b72, B:209:0x0b78, B:210:0x0bba, B:211:0x0bc3, B:212:0x0bc4, B:214:0x0bcd, B:215:0x0c13, B:239:0x0e3f, B:240:0x0e43, B:244:0x0e55, B:250:0x0e86, B:253:0x0e93, B:255:0x0e96, B:267:0x0f7c, B:269:0x0f82, B:270:0x0f83, B:272:0x0f85, B:274:0x0f8c, B:275:0x0f8d, B:247:0x0e6c, B:216:0x0c1e, B:228:0x0d19, B:230:0x0d1f, B:231:0x0d63, B:233:0x0d8d, B:235:0x0dda, B:237:0x0df1, B:238:0x0e37, B:277:0x0f8f, B:279:0x0f96, B:280:0x0f97, B:282:0x0f99, B:284:0x0fa0, B:285:0x0fa1, B:263:0x0efc, B:258:0x0ec5, B:260:0x0ecb, B:261:0x0ef4, B:223:0x0c8a, B:225:0x0c9f, B:226:0x0d0d, B:218:0x0c3e, B:220:0x0c53, B:221:0x0c83), top: B:773:0x0b0c, outer: #11, inners: #29, #36, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ecb A[Catch: all -> 0x0f84, TryCatch #36 {all -> 0x0f84, blocks: (B:258:0x0ec5, B:260:0x0ecb, B:261:0x0ef4), top: B:836:0x0ec5, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x10ea A[Catch: all -> 0x144f, TryCatch #17 {all -> 0x144f, blocks: (B:299:0x10e4, B:301:0x10ea, B:302:0x112d, B:304:0x113a, B:306:0x1143, B:307:0x1188, B:326:0x1340, B:334:0x13a9, B:340:0x1433, B:342:0x1439, B:343:0x143a, B:345:0x143c, B:347:0x1443, B:348:0x1444, B:309:0x1194, B:316:0x121e, B:318:0x1224, B:319:0x126c, B:321:0x1296, B:322:0x12da, B:324:0x12f0, B:325:0x1338, B:350:0x1446, B:352:0x144d, B:353:0x144e, B:336:0x13af, B:330:0x1373, B:332:0x1379, B:333:0x13a2, B:311:0x11b4, B:313:0x11c6, B:314:0x1212), top: B:801:0x10e4, outer: #11, inners: #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x113a A[Catch: all -> 0x144f, TryCatch #17 {all -> 0x144f, blocks: (B:299:0x10e4, B:301:0x10ea, B:302:0x112d, B:304:0x113a, B:306:0x1143, B:307:0x1188, B:326:0x1340, B:334:0x13a9, B:340:0x1433, B:342:0x1439, B:343:0x143a, B:345:0x143c, B:347:0x1443, B:348:0x1444, B:309:0x1194, B:316:0x121e, B:318:0x1224, B:319:0x126c, B:321:0x1296, B:322:0x12da, B:324:0x12f0, B:325:0x1338, B:350:0x1446, B:352:0x144d, B:353:0x144e, B:336:0x13af, B:330:0x1373, B:332:0x1379, B:333:0x13a2, B:311:0x11b4, B:313:0x11c6, B:314:0x1212), top: B:801:0x10e4, outer: #11, inners: #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x1194 A[Catch: all -> 0x144f, TRY_LEAVE, TryCatch #17 {all -> 0x144f, blocks: (B:299:0x10e4, B:301:0x10ea, B:302:0x112d, B:304:0x113a, B:306:0x1143, B:307:0x1188, B:326:0x1340, B:334:0x13a9, B:340:0x1433, B:342:0x1439, B:343:0x143a, B:345:0x143c, B:347:0x1443, B:348:0x1444, B:309:0x1194, B:316:0x121e, B:318:0x1224, B:319:0x126c, B:321:0x1296, B:322:0x12da, B:324:0x12f0, B:325:0x1338, B:350:0x1446, B:352:0x144d, B:353:0x144e, B:336:0x13af, B:330:0x1373, B:332:0x1379, B:333:0x13a2, B:311:0x11b4, B:313:0x11c6, B:314:0x1212), top: B:801:0x10e4, outer: #11, inners: #7, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x1352  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x1598 A[Catch: all -> 0x1aa3, TryCatch #3 {all -> 0x1aa3, blocks: (B:367:0x1592, B:369:0x1598, B:370:0x15e0, B:372:0x1607, B:373:0x1652, B:375:0x1668, B:377:0x1671, B:378:0x16b7, B:412:0x1966, B:413:0x196a, B:415:0x1970, B:418:0x198a, B:421:0x1996, B:423:0x1999, B:435:0x1a7d, B:437:0x1a83, B:438:0x1a84, B:440:0x1a86, B:442:0x1a8d, B:443:0x1a8e, B:381:0x16ca, B:383:0x16ce, B:390:0x16e2, B:401:0x1838, B:403:0x183e, B:404:0x1884, B:406:0x18ae, B:408:0x1901, B:410:0x1918, B:411:0x1960, B:445:0x1a90, B:447:0x1a97, B:448:0x1a98, B:450:0x1a9a, B:452:0x1aa1, B:453:0x1aa2, B:387:0x16da, B:431:0x19fd, B:426:0x19c7, B:428:0x19cd, B:429:0x19f5, B:396:0x1789, B:398:0x17ad, B:399:0x182c, B:391:0x173f, B:393:0x1753, B:394:0x1782), top: B:776:0x1592, outer: #11, inners: #30, #37, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1607 A[Catch: all -> 0x1aa3, TryCatch #3 {all -> 0x1aa3, blocks: (B:367:0x1592, B:369:0x1598, B:370:0x15e0, B:372:0x1607, B:373:0x1652, B:375:0x1668, B:377:0x1671, B:378:0x16b7, B:412:0x1966, B:413:0x196a, B:415:0x1970, B:418:0x198a, B:421:0x1996, B:423:0x1999, B:435:0x1a7d, B:437:0x1a83, B:438:0x1a84, B:440:0x1a86, B:442:0x1a8d, B:443:0x1a8e, B:381:0x16ca, B:383:0x16ce, B:390:0x16e2, B:401:0x1838, B:403:0x183e, B:404:0x1884, B:406:0x18ae, B:408:0x1901, B:410:0x1918, B:411:0x1960, B:445:0x1a90, B:447:0x1a97, B:448:0x1a98, B:450:0x1a9a, B:452:0x1aa1, B:453:0x1aa2, B:387:0x16da, B:431:0x19fd, B:426:0x19c7, B:428:0x19cd, B:429:0x19f5, B:396:0x1789, B:398:0x17ad, B:399:0x182c, B:391:0x173f, B:393:0x1753, B:394:0x1782), top: B:776:0x1592, outer: #11, inners: #30, #37, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1668 A[Catch: all -> 0x1aa3, TryCatch #3 {all -> 0x1aa3, blocks: (B:367:0x1592, B:369:0x1598, B:370:0x15e0, B:372:0x1607, B:373:0x1652, B:375:0x1668, B:377:0x1671, B:378:0x16b7, B:412:0x1966, B:413:0x196a, B:415:0x1970, B:418:0x198a, B:421:0x1996, B:423:0x1999, B:435:0x1a7d, B:437:0x1a83, B:438:0x1a84, B:440:0x1a86, B:442:0x1a8d, B:443:0x1a8e, B:381:0x16ca, B:383:0x16ce, B:390:0x16e2, B:401:0x1838, B:403:0x183e, B:404:0x1884, B:406:0x18ae, B:408:0x1901, B:410:0x1918, B:411:0x1960, B:445:0x1a90, B:447:0x1a97, B:448:0x1a98, B:450:0x1a9a, B:452:0x1aa1, B:453:0x1aa2, B:387:0x16da, B:431:0x19fd, B:426:0x19c7, B:428:0x19cd, B:429:0x19f5, B:396:0x1789, B:398:0x17ad, B:399:0x182c, B:391:0x173f, B:393:0x1753, B:394:0x1782), top: B:776:0x1592, outer: #11, inners: #30, #37, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x16c6  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x1970 A[Catch: all -> 0x1aa3, TryCatch #3 {all -> 0x1aa3, blocks: (B:367:0x1592, B:369:0x1598, B:370:0x15e0, B:372:0x1607, B:373:0x1652, B:375:0x1668, B:377:0x1671, B:378:0x16b7, B:412:0x1966, B:413:0x196a, B:415:0x1970, B:418:0x198a, B:421:0x1996, B:423:0x1999, B:435:0x1a7d, B:437:0x1a83, B:438:0x1a84, B:440:0x1a86, B:442:0x1a8d, B:443:0x1a8e, B:381:0x16ca, B:383:0x16ce, B:390:0x16e2, B:401:0x1838, B:403:0x183e, B:404:0x1884, B:406:0x18ae, B:408:0x1901, B:410:0x1918, B:411:0x1960, B:445:0x1a90, B:447:0x1a97, B:448:0x1a98, B:450:0x1a9a, B:452:0x1aa1, B:453:0x1aa2, B:387:0x16da, B:431:0x19fd, B:426:0x19c7, B:428:0x19cd, B:429:0x19f5, B:396:0x1789, B:398:0x17ad, B:399:0x182c, B:391:0x173f, B:393:0x1753, B:394:0x1782), top: B:776:0x1592, outer: #11, inners: #30, #37, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x1bf5  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1c5f  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1cb6  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1d78  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1fd6  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x20b0  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x22fc  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x234f  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x2413  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x25b4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x26b3  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x28d8  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x294f A[Catch: all -> 0x2922, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x2922, blocks: (B:565:0x28d9, B:571:0x294f, B:576:0x29b2, B:578:0x29b8, B:579:0x29f9, B:582:0x2a0a, B:584:0x2a0e, B:588:0x2a1a), top: B:772:0x28d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x29af  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x2a06  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x2c5c  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x2ca3  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x2cdc A[Catch: all -> 0x2d9d, TryCatch #48 {all -> 0x2d9d, blocks: (B:633:0x2cd6, B:635:0x2cdc, B:636:0x2d09), top: B:860:0x2cd6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x2e4a A[Catch: all -> 0x033e, TryCatch #11 {all -> 0x033e, blocks: (B:143:0x07f9, B:145:0x07ff, B:146:0x0830, B:672:0x2e44, B:674:0x2e4a, B:675:0x2e77, B:706:0x31ad, B:708:0x31b3, B:709:0x31da, B:743:0x3503, B:745:0x3509, B:746:0x3529, B:723:0x3342, B:725:0x3365, B:726:0x33be, B:553:0x26f4, B:555:0x26fa, B:556:0x2723, B:558:0x275d, B:559:0x27a6, B:527:0x2433, B:529:0x2448, B:530:0x2476, B:509:0x20ef, B:511:0x20f5, B:512:0x2121, B:514:0x215b, B:515:0x21a5, B:480:0x1d96, B:482:0x1dab, B:483:0x1ddd, B:485:0x1e11, B:486:0x1e91, B:460:0x1b31, B:462:0x1b37, B:463:0x1b66, B:360:0x14dc, B:362:0x14e2, B:363:0x150d, B:292:0x1032, B:294:0x1038, B:295:0x105d, B:191:0x0a56, B:193:0x0a5c, B:194:0x0a88, B:19:0x0151, B:21:0x0157, B:22:0x017d, B:24:0x02b1, B:26:0x02e2, B:27:0x0338, B:198:0x0b0c, B:200:0x0b12, B:201:0x0b56, B:207:0x0b72, B:209:0x0b78, B:210:0x0bba, B:211:0x0bc3, B:212:0x0bc4, B:214:0x0bcd, B:215:0x0c13, B:239:0x0e3f, B:240:0x0e43, B:244:0x0e55, B:250:0x0e86, B:253:0x0e93, B:255:0x0e96, B:267:0x0f7c, B:269:0x0f82, B:270:0x0f83, B:272:0x0f85, B:274:0x0f8c, B:275:0x0f8d, B:247:0x0e6c, B:216:0x0c1e, B:228:0x0d19, B:230:0x0d1f, B:231:0x0d63, B:233:0x0d8d, B:235:0x0dda, B:237:0x0df1, B:238:0x0e37, B:277:0x0f8f, B:279:0x0f96, B:280:0x0f97, B:282:0x0f99, B:284:0x0fa0, B:285:0x0fa1, B:263:0x0efc, B:258:0x0ec5, B:260:0x0ecb, B:261:0x0ef4, B:223:0x0c8a, B:225:0x0c9f, B:226:0x0d0d, B:218:0x0c3e, B:220:0x0c53, B:221:0x0c83, B:367:0x1592, B:369:0x1598, B:370:0x15e0, B:372:0x1607, B:373:0x1652, B:375:0x1668, B:377:0x1671, B:378:0x16b7, B:412:0x1966, B:413:0x196a, B:415:0x1970, B:418:0x198a, B:421:0x1996, B:423:0x1999, B:435:0x1a7d, B:437:0x1a83, B:438:0x1a84, B:440:0x1a86, B:442:0x1a8d, B:443:0x1a8e, B:381:0x16ca, B:383:0x16ce, B:390:0x16e2, B:401:0x1838, B:403:0x183e, B:404:0x1884, B:406:0x18ae, B:408:0x1901, B:410:0x1918, B:411:0x1960, B:445:0x1a90, B:447:0x1a97, B:448:0x1a98, B:450:0x1a9a, B:452:0x1aa1, B:453:0x1aa2, B:387:0x16da, B:431:0x19fd, B:426:0x19c7, B:428:0x19cd, B:429:0x19f5, B:396:0x1789, B:398:0x17ad, B:399:0x182c, B:391:0x173f, B:393:0x1753, B:394:0x1782, B:299:0x10e4, B:301:0x10ea, B:302:0x112d, B:304:0x113a, B:306:0x1143, B:307:0x1188, B:326:0x1340, B:334:0x13a9, B:340:0x1433, B:342:0x1439, B:343:0x143a, B:345:0x143c, B:347:0x1443, B:348:0x1444, B:309:0x1194, B:316:0x121e, B:318:0x1224, B:319:0x126c, B:321:0x1296, B:322:0x12da, B:324:0x12f0, B:325:0x1338, B:350:0x1446, B:352:0x144d, B:353:0x144e, B:153:0x08c3, B:155:0x08c7, B:177:0x09b7, B:179:0x09bd, B:180:0x09be, B:182:0x09c0, B:184:0x09c7, B:185:0x09c8, B:159:0x08d3, B:162:0x08dc, B:163:0x08df), top: B:790:0x0151, inners: #1, #3, #17, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x2f03  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x2f54  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x2faf  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x318a  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x3271  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x32c8  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x3324  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x34e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:891:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v123 */
    /* JADX WARN: Type inference failed for: r10v124 */
    /* JADX WARN: Type inference failed for: r10v125 */
    /* JADX WARN: Type inference failed for: r10v136 */
    /* JADX WARN: Type inference failed for: r10v137 */
    /* JADX WARN: Type inference failed for: r10v142 */
    /* JADX WARN: Type inference failed for: r10v143 */
    /* JADX WARN: Type inference failed for: r10v146 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v154 */
    /* JADX WARN: Type inference failed for: r10v155 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v157 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v66 */
    /* JADX WARN: Type inference failed for: r9v205 */
    /* JADX WARN: Type inference failed for: r9v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v66 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copy = 1;
        component3();
        copydefault();
        INSTANCE = new Companion(null);
        int i = getRequestBeneficiariesState + 117;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = toString + 99;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = hashCode + 97;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = toString + 73;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        ShareDataUIState = -3780477796495014671L;
        component1 = 1533598011;
        component3 = (char) 50417;
        int i5 = i3 + 91;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        copydefault = new char[]{30279, 30650, 30272, 30646, 30645, 30655, 30330, 30641, 30292, 30273, 30275, 30644, 30311, 30640, 30642, 30639, 30288, 30652, 30643, 30648, 30319, 30327, 30274, 30322, 30317, 30324, 30321, 30278, 30323, 30320, 30316, 30326, 30318, 30325, 30653, 30647, 30651, 30331, 30654, 30289};
        component2 = 321287716;
        equals = true;
        component4 = true;
        getAsAtTimestamp = new int[]{2001729466, 276392284, 1223712909, 1144607525, -1846962295, 1375182812, -1094803106, -1746716856, 1396474711, 1089865531, -2736019, 1930834658, -1297399255, -1638128403, -1428760946, -142050766, -1193056069, 1536590568};
    }
}
