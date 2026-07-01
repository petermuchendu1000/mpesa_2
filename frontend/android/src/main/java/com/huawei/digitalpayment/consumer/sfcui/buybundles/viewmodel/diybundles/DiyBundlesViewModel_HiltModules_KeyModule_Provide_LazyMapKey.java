package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class DiyBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    static DiyBundlesViewModel component2;
    private static byte[] component3;
    private static short[] copy;
    private static int copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {107, -21, -54, -113};
    private static final int $$b = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = 116 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2a:
            int r7 = r7 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 999, 31 - ExpandableListView.getPackedPositionType(0L), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61685), 1874745193, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 23;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = $11 + 11;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    for (int i10 = 0; i10 < length; i10++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 2984, 47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 54463), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component3;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 999, 31 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf("", "") + 61685), 1874745193, false, $$c(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) copy[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11 + 5;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ 7083766810336261929L)) + i4;
                try {
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1697, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1454191902, false, $$c(b9, b9, (byte) $$a.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = component3;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            int i14 = $11 + 17;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7083766810336261929L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (z) {
                            byte[] bArr6 = component3;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        } else {
                            short[] sArr = copy;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        getAsAtTimestamp = 1;
        component2();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "") - 1985003119, View.getDefaultSize(0, 0) - 23, (short) (AndroidCharacter.getMirror('0') - '0'), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 422077888 - Color.green(0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component1 = -2019833530;
        copydefault = -238323878;
        ShareDataUIState = 387771786;
        component3 = new byte[]{46, 40, -36, Ascii.VT, -1, 59, -43, 58, -54, 39, -48, 33, -33, -48, Ascii.SUB, -32, 57, Ascii.FF, 63, -110, 39, -48, 33, -33, -48, 58, -64, 57, 44, Ascii.US, -21, 46, 40, -36, 43, -33, 59, -43, -38, 97, -110, 39, -48, 33, -33, -48, 58, -64, 45, 58, Ascii.GS, -20, -35, 59, -44, -38, 108, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
    }
}
