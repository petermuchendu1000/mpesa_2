package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorMapper;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/strategies/ConfirmationErrorStrategy;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/strategies/ErrorProcessingStrategy;", "errorMapper", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorMapper;)V", "processError", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "context", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorContext;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmationErrorStrategy implements ErrorProcessingStrategy {
    public static final int $stable = 8;
    private static int[] component1;
    private static int component2;
    private final ErrorMapper component3;
    private static final byte[] $$c = {89, 120, -98, -110};
    private static final int $$d = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {35, -11, -97, -73, 6, -5, 3};
    private static final int $$b = 164;
    private static int ShareDataUIState = 0;
    private static int copy = 1;
    private static int copydefault = 0;

    private static String $$e(short s, byte b2, short s2) {
        int i = s2 * 4;
        byte[] bArr = $$c;
        int i2 = s + 104;
        int i3 = 3 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 += i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i7];
            i3 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ConfirmationErrorStrategy.$$a
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r6 = r6 + 99
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + 6
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ConfirmationErrorStrategy.b(short, byte, short, java.lang.Object[]):void");
    }

    public ConfirmationErrorStrategy(ErrorMapper errorMapper) {
        Intrinsics.checkNotNullParameter(errorMapper, "");
        this.component3 = errorMapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState processError(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType r6, com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorContext r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ConfirmationErrorStrategy.processError(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType, com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorContext):com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component1;
        int i4 = 684241640;
        int i5 = 16;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 123;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) ($$d >>> 2);
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> i5) + 4391, 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -309236339, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i11 = $10 + 55;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i2 = 2;
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
            int i13 = $11 + 117;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component1;
        if (iArr6 != null) {
            int i15 = $10 + 123;
            int i16 = i15 % 128;
            $11 = i16;
            int i17 = i15 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i18 = i16 + 69;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr6[i20]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    int iCombineMeasuredStates = 4391 - View.combineMeasuredStates(i7, i7);
                    int iIndexOf = 36 - TextUtils.indexOf((CharSequence) "", '0');
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    byte b4 = (byte) ($$d >>> 2);
                    byte b5 = (byte) (b4 - 2);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, iIndexOf, maxKeyCode, -309236339, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i20] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i20++;
                iArr6 = iArr2;
                i6 = 1;
                i7 = 0;
            }
            iArr6 = iArr7;
        }
        int i21 = i7;
        System.arraycopy(iArr6, i21, iArr5, i21, length2);
        getactivenotifications.component1 = i21;
        int i22 = $11 + 35;
        $10 = i22 % 128;
        int i23 = i22 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            int i24 = $11 + 99;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i26 = 0;
            for (int i27 = 16; i26 < i27; i27 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i26];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - TextUtils.getOffsetAfter("", 0), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49871), 462826032, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i26++;
            }
            int i28 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i28;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i29 = getactivenotifications.ShareDataUIState;
            int i30 = getactivenotifications.component2;
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
                byte b8 = (byte) 3;
                byte b9 = (byte) (b8 - 3);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 25, (char) (Color.green(0) + 27637), -1616366948, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component2 = 1;
        component2();
        int i = copydefault + 9;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:133|18|(1:20)|21|22|(1:24)(1:25)|26|(1:28)(1:29)|30|(2:132|31)|(2:33|(4:36|142|37|38))(19:41|139|42|43|(1:45)(2:46|47)|48|(1:50)(1:51)|52|53|54|(3:56|(3:58|61|62)|63)(1:59)|130|68|69|70|71|(2:73|(7:131|91|(1:93)(10:94|137|95|96|(2:98|99)(1:101)|100|103|108|(1:118)(2:111|(1:113)(1:114))|119)|107|108|(0)(0)|119)(0))(11:76|140|77|78|(2:80|81)(1:83)|82|85|86|87|(1:89)|(0)(0))|120|121)|67|130|68|69|70|71|(0)(0)|120|121) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x038c, code lost:
    
        if (r0.equals(r7) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0473 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f9 A[Catch: Exception -> 0x0600, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0600, blocks: (B:68:0x03b0, B:70:0x03d9, B:76:0x03f9, B:86:0x045b, B:116:0x05f9, B:117:0x05ff, B:77:0x0403, B:81:0x0423, B:82:0x0431, B:83:0x0436), top: B:130:0x03b0, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component1(int r29, int r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.strategies.ConfirmationErrorStrategy.component1(int, int):java.lang.Object[]");
    }

    static void component2() {
        component1 = new int[]{-1814904298, -1778498285, 966896003, 46065428, -1017258966, 1145578608, 1691237243, 1250301755, 1363767029, -1725925227, 1603004395, -1065473089, -331144072, 1460187244, -1947957644, 1907262409, 1632852197, -1356179445};
    }
}
