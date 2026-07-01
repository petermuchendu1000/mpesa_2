package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentCompletionArgs;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentMethod;
import com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.sharedui.compose.completion.TransactionCompletionData;
import com.safaricom.sharedui.compose.completion.TransactionCompletionScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.collections.CollectionsKt;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataPaymentCompletionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "args", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentCompletionArgs;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataPaymentCompletionActivity extends Hilt_FixedDataPaymentCompletionActivity {
    public static final int $stable = 8;
    private static boolean ShareDataUIState;
    private static int[] component1;
    private static boolean component2;
    private static int component3;
    private static int component4;
    private static boolean copy;
    private static char[] copydefault;
    private static boolean equals;
    private static char[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private PaymentCompletionArgs args;
    private static final byte[] $$c = {119, -27, 13, -93};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {106, 40, -98, -117, -16, -2, 59, -55, -12, -13, Ascii.FF, -16, 8, TarHeader.LF_NORMAL, -66, -7, -9, -4, 7, 0, TarHeader.LF_CHR, -55, -17, 1, -8, 8, -23, 7, -10, -3, 60, -57, -16, -3, -10, Ascii.VT, -13, -10, 66, -25, -48, -2, -7, -3, -10, 3, 6, Ascii.FF, -34, 5, -8, Ascii.EM, -21, -23, 8, 33, -48, -3, -10, Ascii.VT, -13, -10, -16, -2, -7, -3, -3, 5, -13, -10, 62, -16, -2, 59, -63, 4, -19, 62, -55, -6, TarHeader.LF_LINK, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -55, -6, -20, 65, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -56, -11, -21, 72, -72, 9, -6, -6, -10, -3, 60, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -72, 9, -15, -3, -8, 6, -15, 1, -7, -11, 71, -28, -35, -19, 13, -9, 35, -47, -4, 39, -51, -4, -7, Ascii.GS, -23, -16, -8, Ascii.FF, -18, -5, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -55, -15, -1, 3, -3, -5, -3, 47, -61, -15, 5, -17, 13, -17, SignedBytes.MAX_POWER_OF_TWO, -66, -7, -9, -4, 7, 0, TarHeader.LF_CHR, -69, 0, -2, -10, Base64.padSymbol, -29, -55, 13, -11, Ascii.EM, -26, -9, -1, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT, -16, -2, -7, -3, -3, 5, -13, -10, 63};
    private static final int $$h = 91;
    private static final byte[] $$a = {77, -64, 102, -128, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 78;
    private static int hashCode = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 1;

    private static String $$i(int i, byte b2, short s) {
        int i2 = 4 - (i * 3);
        byte[] bArr = $$c;
        int i3 = s * 3;
        int i4 = b2 + 68;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
            i2++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.$$a
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r5]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            int r5 = r5 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.$$g
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r9 = r9 + 4
            int r7 = 84 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-4)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.d(byte, short, int, java.lang.Object[]):void");
    }

    public static final PaymentCompletionArgs access$getArgs$p(FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 99;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        PaymentCompletionArgs paymentCompletionArgs = fixedDataPaymentCompletionActivity.args;
        if (i3 == 0) {
            return paymentCompletionArgs;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        final String copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 0;
            private static int component3 = 1;
            final String ShareDataUIState;
            final FixedDataPaymentCompletionActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 7;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 101;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void copydefault(Composer composer, int i) {
                String strStringResource;
                int i2 = 2 % 2;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                PaymentCompletionArgs paymentCompletionArgsAccess$getArgs$p = FixedDataPaymentCompletionActivity.access$getArgs$p(this.copydefault);
                PaymentCompletionArgs paymentCompletionArgs = null;
                if (paymentCompletionArgsAccess$getArgs$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    paymentCompletionArgsAccess$getArgs$p = null;
                }
                PaymentMethod method = paymentCompletionArgsAccess$getArgs$p.getMethod();
                composer.startReplaceGroup(226647300);
                if (method == null) {
                    int i3 = component1 + 99;
                    int i4 = i3 % 128;
                    component3 = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 35;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    strStringResource = null;
                } else {
                    strStringResource = StringResources_androidKt.stringResource(method.displayName(), composer, 0);
                }
                composer.endReplaceGroup();
                PaymentCompletionArgs paymentCompletionArgsAccess$getArgs$p2 = FixedDataPaymentCompletionActivity.access$getArgs$p(this.copydefault);
                if (paymentCompletionArgsAccess$getArgs$p2 == null) {
                    int i8 = component1 + 3;
                    component3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    paymentCompletionArgsAccess$getArgs$p2 = null;
                }
                boolean zIsSuccess = paymentCompletionArgsAccess$getArgs$p2.isSuccess();
                PaymentCompletionArgs paymentCompletionArgsAccess$getArgs$p3 = FixedDataPaymentCompletionActivity.access$getArgs$p(this.copydefault);
                if (paymentCompletionArgsAccess$getArgs$p3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    paymentCompletionArgsAccess$getArgs$p3 = null;
                }
                String message = paymentCompletionArgsAccess$getArgs$p3.getMessage();
                PaymentCompletionArgs paymentCompletionArgsAccess$getArgs$p4 = FixedDataPaymentCompletionActivity.access$getArgs$p(this.copydefault);
                if (paymentCompletionArgsAccess$getArgs$p4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    paymentCompletionArgs = paymentCompletionArgsAccess$getArgs$p4;
                }
                TransactionCompletionData transactionCompletionData = new TransactionCompletionData(zIsSuccess, message, CollectionsKt.listOfNotNull((Object[]) new String[]{paymentCompletionArgs.getPlanName(), this.ShareDataUIState, strStringResource}), null, null, false, 56, null);
                final FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity = this.copydefault;
                Function0 function0 = new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component2 + 35;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitShareDataUIState = FixedDataPaymentCompletionActivity.ShareDataUIState.AnonymousClass1.ShareDataUIState(fixedDataPaymentCompletionActivity);
                        int i12 = ShareDataUIState + 123;
                        component2 = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 89 / 0;
                        }
                        return unitShareDataUIState;
                    }
                };
                final FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity2 = this.copydefault;
                TransactionCompletionScreenKt.TransactionCompletionScreen(transactionCompletionData, null, null, function0, null, new Function0() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component2 + 73;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitCopydefault = FixedDataPaymentCompletionActivity.ShareDataUIState.AnonymousClass1.copydefault(fixedDataPaymentCompletionActivity2);
                        int i12 = copydefault + 15;
                        component2 = i12 % 128;
                        if (i12 % 2 != 0) {
                            return unitCopydefault;
                        }
                        throw null;
                    }
                }, composer, TransactionCompletionData.$stable, 22);
            }

            private static final Unit component1(FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity) {
                int i = 2 % 2;
                int i2 = component1 + 19;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataPaymentCompletionActivity, "");
                    fixedDataPaymentCompletionActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(fixedDataPaymentCompletionActivity, "");
                fixedDataPaymentCompletionActivity.finish();
                int i3 = 93 / 0;
                return Unit.INSTANCE;
            }

            private static final Unit component2(FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component3 + 5;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataPaymentCompletionActivity, "");
                    RouteUtils.routeWithExecute(fixedDataPaymentCompletionActivity, RoutePathConstant.SFC_FIXED_DATA_DASHBOARD, 603979776);
                    fixedDataPaymentCompletionActivity.finish();
                    unit = Unit.INSTANCE;
                    int i3 = 98 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fixedDataPaymentCompletionActivity, "");
                    RouteUtils.routeWithExecute(fixedDataPaymentCompletionActivity, RoutePathConstant.SFC_FIXED_DATA_DASHBOARD, 603979776);
                    fixedDataPaymentCompletionActivity.finish();
                    unit = Unit.INSTANCE;
                }
                int i4 = component1 + 111;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 16 / 0;
                }
                return unit;
            }

            public static Unit copydefault(FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity) {
                int i = 2 % 2;
                int i2 = component3 + 119;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return component2(fixedDataPaymentCompletionActivity);
                }
                component2(fixedDataPaymentCompletionActivity);
                throw null;
            }

            public static Unit ShareDataUIState(FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity) {
                int i = 2 % 2;
                int i2 = component3 + 103;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    component1(fixedDataPaymentCompletionActivity);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent1 = component1(fixedDataPaymentCompletionActivity);
                int i3 = component3 + 121;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 18 / 0;
                }
                return unitComponent1;
            }

            AnonymousClass1(FixedDataPaymentCompletionActivity fixedDataPaymentCompletionActivity, String str) {
                this.copydefault = fixedDataPaymentCompletionActivity;
                this.ShareDataUIState = str;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            ShareDataUIState = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component1(composer2, num2.intValue());
                return Unit.INSTANCE;
            }
            component1(composer2, num2.intValue());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void component1(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) != 2) {
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1566726705, true, new AnonymousClass1(FixedDataPaymentCompletionActivity.this, this.copydefault), composer, 54), composer, 1572864, 63);
            } else if (!composer.getSkipping()) {
                int i3 = ShareDataUIState + 115;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1566726705, true, new AnonymousClass1(FixedDataPaymentCompletionActivity.this, this.copydefault), composer, 54), composer, 1572864, 63);
            } else {
                composer.skipToGroupEnd();
            }
            int i5 = component2 + 41;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        ShareDataUIState(String str) {
            this.copydefault = str;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i4 = 684241640;
        char c2 = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.indexOf("", c2, 0, 0), Color.blue(0) + 37, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -309236339, false, $$i(b2, (byte) (b2 | 38), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = 684241640;
                    c2 = '0';
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
        int[] iArr5 = component1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) i6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 4391, 36 - (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -309236339, false, $$i(b3, (byte) (b3 | 38), b3), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i10++;
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i11 = i6;
        System.arraycopy(iArr5, i11, iArr4, i11, length2);
        getactivenotifications.component1 = i11;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i11] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i12 = $10 + 93;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            for (int i14 = 0; i14 < 16; i14++) {
                getactivenotifications.ShareDataUIState ^= iArr4[i14];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2968, Drawable.resolveOpacity(0, 0) + 16, (char) (49871 - (ViewConfiguration.getTapTimeout() >> 16)), 462826032, false, $$i(b4, (byte) (b4 | 36), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
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
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 2945, AndroidCharacter.getMirror('0') - 24, (char) (View.resolveSizeAndState(0, 0, 0) + 27637), -1616366948, false, $$i(b5, (byte) (b5 | 39), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i11 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = getAsAtTimestamp;
        char c2 = '0';
        long j = 0;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(i3, i3) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == j ? 0 : -1)) + 3761, 23 - TextUtils.lastIndexOf("", c2), (char) View.getDefaultSize(i3, i3), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    c2 = '0';
                    j = 0;
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
            Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - View.MeasureSpec.getSize(0), 13 - Gravity.getAbsoluteGravity(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i5 = 689978476;
            if (equals) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i6 = $10 + 57;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) >> cancelVar.component3] >>> i] % iIntValue);
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2747, TextUtils.indexOf("", "") + 19, (char) (7645 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -327556343, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } else {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 5);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2749 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7643), -327556343, false, $$i(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!copy) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i7 = $10 + 35;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i11 = $10 + 23;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                try {
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 5);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 19, (char) (7643 - TextUtils.lastIndexOf("", '0')), -327556343, false, $$i(b8, b9, (byte) (b9 - 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                    int i13 = $10 + 19;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
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
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static void e(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - MotionEvent.axisFromString(""), TextUtils.getOffsetBefore("", i3) + 24, (char) View.MeasureSpec.getMode(i3), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - KeyEvent.getDeadChar(0, 0), 12 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i6 = $10 + 69;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[cancelVar.component1 % cancelVar.component3] % i] << iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 2748, TextUtils.indexOf("", "", 0, 0) + 19, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7643), -327556343, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, (char) (KeyEvent.keyCodeFromString("") + 7644), -327556343, false, $$i(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                i5 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component2) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i7 = $10 + 125;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2747, 19 - View.getDefaultSize(0, 0), (char) (7644 - Color.alpha(0)), -327556343, false, $$i(b8, b9, (byte) (b9 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i9;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i10 = $11 + 87;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 / 0) << cancelVar.component3] + i] % iIntValue);
                i9 = cancelVar.component3;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i9 = cancelVar.component3 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:335:0x226e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x226f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = hashCode + 15;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 25, new int[]{930334313, 1144212086, 657311868, -309936843, -270383167, 1708001788, 1335295558, -919345267, 1989147157, 1900194942, 601526531, -385196379, 306253507, -1513758868}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(17 - ExpandableListView.getPackedPositionChild(0L), new int[]{535811392, 1852485698, 1756231509, 2033689991, -453117283, -374587059, -1039733546, -5111798, 434496495, 1405834211}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = hashCode + 99;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6561, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 55, (char) (ViewConfiguration.getScrollBarSize() >> 8), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = getShareableDataState + 41;
                hashCode = i6 % 128;
                int i7 = i6 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:827|188|(0)|191|215|857|216|(0)|222|223|(5:831|(0)(0)|263|(1:264)|859)|324|851|325|(0)|328|(0)(0)|334|352|(0)|392|824|393|(0)|396|(0)(0)|424|(1:425)|863|481|(0)|484|(0)(0)|507|(0)(0)|525|(0)|528|(0)|531|(0)(0)|537|558|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x1b00, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x1b01, code lost:
    
        r7 = new java.lang.Object[1];
        b(127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), new byte[]{-117, -109, -116, -111, -110, -109, -109, -120, -116, -120}, null, null, r7);
        r4 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x1b1b, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x1b32, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x1b36, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
        r12 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32)));
        r12 = 0;
        r4 = r4 | ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x1b65, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x1b69, code lost:
    
        if (r1 == null) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x1b6b, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 42, (char) android.text.TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x1b96, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x1b9e, code lost:
    
        r9 = new java.lang.Object[]{-784191357, java.lang.Long.valueOf(r4), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 56, (char) android.view.View.getDefaultSize(0, 0));
        r4 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.$$h & 494);
        r5 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.$$g[23];
        r10 = new java.lang.Object[1];
        d(r4, r5, (short) (r5 | 158), r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x07f6 A[Catch: all -> 0x0920, TryCatch #0 {all -> 0x0920, blocks: (B:103:0x07ec, B:104:0x07f0, B:106:0x07f6, B:109:0x0811, B:73:0x0568, B:90:0x06c1, B:93:0x070f, B:98:0x0787, B:102:0x07e4), top: B:769:0x0568 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x09d6 A[Catch: all -> 0x040a, TryCatch #37 {all -> 0x040a, blocks: (B:164:0x09d0, B:166:0x09d6, B:167:0x0a04, B:687:0x2f42, B:689:0x2f48, B:690:0x2f79, B:724:0x328a, B:726:0x3290, B:727:0x32b6, B:704:0x30cf, B:706:0x30f2, B:707:0x3147, B:653:0x2c06, B:655:0x2c0c, B:656:0x2c37, B:747:0x338e, B:749:0x3394, B:750:0x33b9, B:752:0x33f3, B:753:0x3438, B:539:0x2386, B:541:0x239b, B:542:0x23c8, B:544:0x23fc, B:545:0x247e, B:517:0x1ff5, B:519:0x1ffb, B:520:0x2023, B:522:0x205d, B:523:0x20a8, B:491:0x1d54, B:493:0x1d69, B:494:0x1d9b, B:475:0x1b65, B:477:0x1b6b, B:478:0x1b96, B:386:0x1628, B:388:0x162e, B:389:0x165c, B:318:0x1184, B:320:0x118a, B:321:0x11ae, B:209:0x0c23, B:211:0x0c29, B:212:0x0c54, B:27:0x01ec, B:29:0x01f2, B:30:0x0217, B:32:0x037e, B:34:0x03b0, B:35:0x0404), top: B:836:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ac2 A[Catch: all -> 0x0b8e, TryCatch #38 {all -> 0x0b8e, blocks: (B:184:0x0aad, B:186:0x0ac2, B:187:0x0af3), top: B:837:0x0aad, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0b06 A[Catch: all -> 0x0b84, TryCatch #32 {all -> 0x0b84, blocks: (B:188:0x0af9, B:190:0x0b06, B:191:0x0b7c), top: B:827:0x0af9, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0da0 A[Catch: all -> 0x111f, TRY_ENTER, TRY_LEAVE, TryCatch #49 {all -> 0x111f, blocks: (B:216:0x0ce4, B:222:0x0d38, B:231:0x0da0, B:250:0x0ea4, B:253:0x0eef), top: B:857:0x0ce4 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0fd3 A[Catch: all -> 0x1105, TryCatch #34 {all -> 0x1105, blocks: (B:263:0x0fc9, B:264:0x0fcd, B:266:0x0fd3, B:269:0x0fed, B:272:0x0ffa, B:275:0x1007, B:287:0x10f3, B:289:0x10f9, B:290:0x10fa, B:292:0x10fc, B:294:0x1103, B:295:0x1104, B:300:0x110b, B:302:0x1111, B:303:0x1112, B:255:0x0efe, B:257:0x0f1b, B:259:0x0f67, B:261:0x0f7d, B:262:0x0fc1, B:306:0x1117, B:308:0x111d, B:309:0x111e, B:283:0x1070, B:278:0x1036, B:280:0x103c, B:281:0x1068), top: B:831:0x0d43, inners: #23, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x118a A[Catch: all -> 0x040a, TryCatch #37 {all -> 0x040a, blocks: (B:164:0x09d0, B:166:0x09d6, B:167:0x0a04, B:687:0x2f42, B:689:0x2f48, B:690:0x2f79, B:724:0x328a, B:726:0x3290, B:727:0x32b6, B:704:0x30cf, B:706:0x30f2, B:707:0x3147, B:653:0x2c06, B:655:0x2c0c, B:656:0x2c37, B:747:0x338e, B:749:0x3394, B:750:0x33b9, B:752:0x33f3, B:753:0x3438, B:539:0x2386, B:541:0x239b, B:542:0x23c8, B:544:0x23fc, B:545:0x247e, B:517:0x1ff5, B:519:0x1ffb, B:520:0x2023, B:522:0x205d, B:523:0x20a8, B:491:0x1d54, B:493:0x1d69, B:494:0x1d9b, B:475:0x1b65, B:477:0x1b6b, B:478:0x1b96, B:386:0x1628, B:388:0x162e, B:389:0x165c, B:318:0x1184, B:320:0x118a, B:321:0x11ae, B:209:0x0c23, B:211:0x0c29, B:212:0x0c54, B:27:0x01ec, B:29:0x01f2, B:30:0x0217, B:32:0x037e, B:34:0x03b0, B:35:0x0404), top: B:836:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x1239 A[Catch: all -> 0x1599, TryCatch #45 {all -> 0x1599, blocks: (B:325:0x1233, B:327:0x1239, B:328:0x127c, B:330:0x1289, B:332:0x1292, B:333:0x12d8, B:352:0x148b, B:360:0x14f6, B:366:0x157d, B:368:0x1583, B:369:0x1584, B:371:0x1586, B:373:0x158d, B:374:0x158e, B:335:0x12e4, B:342:0x1370, B:344:0x1376, B:345:0x13b7, B:347:0x13e1, B:348:0x1422, B:350:0x1438, B:351:0x1483, B:376:0x1590, B:378:0x1597, B:379:0x1598, B:362:0x14fc, B:356:0x14be, B:358:0x14c4, B:359:0x14ef, B:337:0x1304, B:339:0x1316, B:340:0x1364), top: B:851:0x1233, outer: #9, inners: #27, #33, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x1289 A[Catch: all -> 0x1599, TryCatch #45 {all -> 0x1599, blocks: (B:325:0x1233, B:327:0x1239, B:328:0x127c, B:330:0x1289, B:332:0x1292, B:333:0x12d8, B:352:0x148b, B:360:0x14f6, B:366:0x157d, B:368:0x1583, B:369:0x1584, B:371:0x1586, B:373:0x158d, B:374:0x158e, B:335:0x12e4, B:342:0x1370, B:344:0x1376, B:345:0x13b7, B:347:0x13e1, B:348:0x1422, B:350:0x1438, B:351:0x1483, B:376:0x1590, B:378:0x1597, B:379:0x1598, B:362:0x14fc, B:356:0x14be, B:358:0x14c4, B:359:0x14ef, B:337:0x1304, B:339:0x1316, B:340:0x1364), top: B:851:0x1233, outer: #9, inners: #27, #33, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x12e4 A[Catch: all -> 0x1599, TRY_LEAVE, TryCatch #45 {all -> 0x1599, blocks: (B:325:0x1233, B:327:0x1239, B:328:0x127c, B:330:0x1289, B:332:0x1292, B:333:0x12d8, B:352:0x148b, B:360:0x14f6, B:366:0x157d, B:368:0x1583, B:369:0x1584, B:371:0x1586, B:373:0x158d, B:374:0x158e, B:335:0x12e4, B:342:0x1370, B:344:0x1376, B:345:0x13b7, B:347:0x13e1, B:348:0x1422, B:350:0x1438, B:351:0x1483, B:376:0x1590, B:378:0x1597, B:379:0x1598, B:362:0x14fc, B:356:0x14be, B:358:0x14c4, B:359:0x14ef, B:337:0x1304, B:339:0x1316, B:340:0x1364), top: B:851:0x1233, outer: #9, inners: #27, #33, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x149d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x16ef A[Catch: all -> 0x1b00, TryCatch #30 {all -> 0x1b00, blocks: (B:393:0x16e9, B:395:0x16ef, B:396:0x172e, B:398:0x173b, B:400:0x1744, B:401:0x1788, B:424:0x19b3, B:425:0x19b7, B:427:0x19bd, B:430:0x19d4, B:436:0x19ef, B:438:0x19f2, B:450:0x1ada, B:452:0x1ae0, B:453:0x1ae1, B:455:0x1ae3, B:457:0x1aea, B:458:0x1aeb, B:402:0x1793, B:414:0x189e, B:416:0x18a4, B:417:0x18e4, B:419:0x190e, B:420:0x1953, B:422:0x1969, B:423:0x19ad, B:460:0x1aed, B:462:0x1af4, B:463:0x1af5, B:465:0x1af7, B:467:0x1afe, B:468:0x1aff, B:446:0x1a56, B:441:0x1a1e, B:443:0x1a24, B:444:0x1a4e, B:409:0x1802, B:411:0x181e, B:412:0x1892, B:404:0x17b3, B:406:0x17c8, B:407:0x17fb), top: B:824:0x16e9, outer: #9, inners: #15, #17, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x173b A[Catch: all -> 0x1b00, TryCatch #30 {all -> 0x1b00, blocks: (B:393:0x16e9, B:395:0x16ef, B:396:0x172e, B:398:0x173b, B:400:0x1744, B:401:0x1788, B:424:0x19b3, B:425:0x19b7, B:427:0x19bd, B:430:0x19d4, B:436:0x19ef, B:438:0x19f2, B:450:0x1ada, B:452:0x1ae0, B:453:0x1ae1, B:455:0x1ae3, B:457:0x1aea, B:458:0x1aeb, B:402:0x1793, B:414:0x189e, B:416:0x18a4, B:417:0x18e4, B:419:0x190e, B:420:0x1953, B:422:0x1969, B:423:0x19ad, B:460:0x1aed, B:462:0x1af4, B:463:0x1af5, B:465:0x1af7, B:467:0x1afe, B:468:0x1aff, B:446:0x1a56, B:441:0x1a1e, B:443:0x1a24, B:444:0x1a4e, B:409:0x1802, B:411:0x181e, B:412:0x1892, B:404:0x17b3, B:406:0x17c8, B:407:0x17fb), top: B:824:0x16e9, outer: #9, inners: #15, #17, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1793 A[Catch: all -> 0x1b00, TRY_LEAVE, TryCatch #30 {all -> 0x1b00, blocks: (B:393:0x16e9, B:395:0x16ef, B:396:0x172e, B:398:0x173b, B:400:0x1744, B:401:0x1788, B:424:0x19b3, B:425:0x19b7, B:427:0x19bd, B:430:0x19d4, B:436:0x19ef, B:438:0x19f2, B:450:0x1ada, B:452:0x1ae0, B:453:0x1ae1, B:455:0x1ae3, B:457:0x1aea, B:458:0x1aeb, B:402:0x1793, B:414:0x189e, B:416:0x18a4, B:417:0x18e4, B:419:0x190e, B:420:0x1953, B:422:0x1969, B:423:0x19ad, B:460:0x1aed, B:462:0x1af4, B:463:0x1af5, B:465:0x1af7, B:467:0x1afe, B:468:0x1aff, B:446:0x1a56, B:441:0x1a1e, B:443:0x1a24, B:444:0x1a4e, B:409:0x1802, B:411:0x181e, B:412:0x1892, B:404:0x17b3, B:406:0x17c8, B:407:0x17fb), top: B:824:0x16e9, outer: #9, inners: #15, #17, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x19bd A[Catch: all -> 0x1b00, TryCatch #30 {all -> 0x1b00, blocks: (B:393:0x16e9, B:395:0x16ef, B:396:0x172e, B:398:0x173b, B:400:0x1744, B:401:0x1788, B:424:0x19b3, B:425:0x19b7, B:427:0x19bd, B:430:0x19d4, B:436:0x19ef, B:438:0x19f2, B:450:0x1ada, B:452:0x1ae0, B:453:0x1ae1, B:455:0x1ae3, B:457:0x1aea, B:458:0x1aeb, B:402:0x1793, B:414:0x189e, B:416:0x18a4, B:417:0x18e4, B:419:0x190e, B:420:0x1953, B:422:0x1969, B:423:0x19ad, B:460:0x1aed, B:462:0x1af4, B:463:0x1af5, B:465:0x1af7, B:467:0x1afe, B:468:0x1aff, B:446:0x1a56, B:441:0x1a1e, B:443:0x1a24, B:444:0x1a4e, B:409:0x1802, B:411:0x181e, B:412:0x1892, B:404:0x17b3, B:406:0x17c8, B:407:0x17fb), top: B:824:0x16e9, outer: #9, inners: #15, #17, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1c1e  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x1c70  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1d34  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1eda  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1fb6  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x21d8  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x2242  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x229f  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x2368  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x25be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x2cbc  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x2d0a  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x2d62  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x2f23  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x300a  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x305f  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x30b1  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x326a  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x3357  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0cea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:884:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v121, types: [long] */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v164 */
    /* JADX WARN: Type inference failed for: r8v165 */
    /* JADX WARN: Type inference failed for: r8v188 */
    /* JADX WARN: Type inference failed for: r8v196 */
    /* JADX WARN: Type inference failed for: r8v197 */
    /* JADX WARN: Type inference failed for: r8v198 */
    /* JADX WARN: Type inference failed for: r8v199 */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v204 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v206 */
    /* JADX WARN: Type inference failed for: r8v207 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v210 */
    /* JADX WARN: Type inference failed for: r8v211 */
    /* JADX WARN: Type inference failed for: r8v212 */
    /* JADX WARN: Type inference failed for: r8v213 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataPaymentCompletionActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        component4 = 0;
        component3();
        component1();
        int i = getSponsorBeneficiariesState + 31;
        component4 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 55;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = hashCode + 95;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 37;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        copydefault = new char[]{30521, 30509, 30515, 30706, 30516, 30507, 30527, 30501, 30523, 30519, 30520, 30517, 30504, 30512, 30508, 30503, 30514, 30505, 30510, 30526, 30513, 30502, 30665, 30664, 30712, 30681};
        component3 = 321288092;
        component2 = true;
        ShareDataUIState = true;
        int i5 = i3 + 9;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }

    static void component3() {
        component1 = new int[]{1287031250, 2130489869, 1819236276, -1158710425, 1089893137, 1776803975, -1839247235, -422239075, 690222239, -779208526, 1084400224, -87557883, 655338557, -999430854, 620473810, 1852870936, -957626375, -534662996};
        getAsAtTimestamp = new char[]{30255, 30243, 30407, 30259, 30260, 30440, 30262, 30432, 30443, 30438, 30442, 30439, 30261, 30433, 30266, 30263, 30436, 30437, 30435, 30267, 30447, 30254, 30244, 30416, 30245, 30256, 30421, 30249};
        getRequestBeneficiariesState = 321287832;
        copy = true;
        equals = true;
    }
}
