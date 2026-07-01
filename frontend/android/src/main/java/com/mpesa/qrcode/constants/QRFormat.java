package com.mpesa.qrcode.constants;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public class QRFormat {
    public static final String EMVCO = "EMVCO";
    public static final String JSON = "JSON";
    public static final String PIPE = "Piped";
    public static final String STRING = "String";
    private static final byte[] $$c = {69, -50, 81, 75};
    private static final int $$d = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {13, 38, -109, 117, -6, 5, -3};
    private static final int $$b = 13;
    private static int component2 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char ShareDataUIState = 36227;
    private static char component3 = 27628;
    private static char copydefault = 47644;
    private static char component1 = 6795;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 111
            byte[] r1 = com.mpesa.qrcode.constants.QRFormat.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.constants.QRFormat.$$e(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.mpesa.qrcode.constants.QRFormat.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 99
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 6
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.constants.QRFormat.b(short, short, short, java.lang.Object[]):void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = $10 + 23;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(845 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 32, (char) (23251 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 592652048, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(845 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 31 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (23251 - (ViewConfiguration.getTapTimeout() >> 16)), 592652048, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 48 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:130|21|(1:23)|24|25|(2:140|26)|(2:28|(3:30|141|31))(16:36|37|134|(1:39)(2:42|43)|44|(1:46)(2:47|48)|49|(4:51|52|(2:54|57)|58)(1:55)|129|62|63|(7:65|66|127|67|(1:75)(10:76|138|77|78|(1:80)(1:82)|81|83|84|85|(5:135|87|(2:89|99)(7:90|132|91|92|93|94|95)|(2:101|(1:(1:104)(1:105))(2:106|107))|112))|111|112)(4:73|(0)(0)|111|112)|113|(1:115)(1:116)|117|118)|61|129|62|63|(0)(0)|113|(0)(0)|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0380, code lost:
    
        if (r0.equals((java.lang.String) r6[0]) == false) goto L57;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c8 A[Catch: Exception -> 0x059e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x059e, blocks: (B:62:0x0399, B:65:0x03c8, B:67:0x03ce, B:76:0x03e7, B:85:0x047c, B:109:0x0597, B:110:0x059d, B:73:0x03d5, B:77:0x03f1, B:84:0x0469), top: B:129:0x0399, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d5 A[Catch: Exception -> 0x059e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x059e, blocks: (B:62:0x0399, B:65:0x03c8, B:67:0x03ce, B:76:0x03e7, B:85:0x047c, B:109:0x0597, B:110:0x059d, B:73:0x03d5, B:77:0x03f1, B:84:0x0469), top: B:129:0x0399, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e7 A[Catch: Exception -> 0x059e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x059e, blocks: (B:62:0x0399, B:65:0x03c8, B:67:0x03ce, B:76:0x03e7, B:85:0x047c, B:109:0x0597, B:110:0x059d, B:73:0x03d5, B:77:0x03f1, B:84:0x0469), top: B:129:0x0399, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component1(int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.constants.QRFormat.component1(int, int):java.lang.Object[]");
    }
}
