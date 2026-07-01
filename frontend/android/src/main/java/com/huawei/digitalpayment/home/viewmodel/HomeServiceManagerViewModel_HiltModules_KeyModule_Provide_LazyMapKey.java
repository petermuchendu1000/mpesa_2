package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;

public final class HomeServiceManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static byte[] component2;
    private static int component3;
    private static short[] component4;
    static HomeServiceManagerViewModel copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {118, 33, 67, 92};
    private static final int $$b = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 + 112
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c2;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 999, TextUtils.getTrimmedLength("") + 31, (char) (61685 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1874745193, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $10 + 23;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = component2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 23;
                        $10 = i10 % 128;
                        if (i10 % i5 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2984, 47 - ImageFormat.getBitsPerPixel(0), (char) (MotionEvent.axisFromString("") + 54463), -1178636483, false, $$c(b5, b5, (byte) $$a.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i9 /= 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                byte b6 = (byte) 0;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 2984, 48 - (Process.myPid() >> 22), (char) (Color.argb(0, 0, 0, 0) + 54462), -1178636483, false, $$c(b6, b6, (byte) $$a.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component2;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component3)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 1000, 31 - (Process.myTid() >> 22), (char) (61685 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1874745193, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                    int i11 = $11 + 47;
                    $10 = i11 % 128;
                    i4 = 2;
                    int i12 = i11 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - i4) + ((int) (((long) component3) ^ 7083766810336261929L)) + i7;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1697 - View.MeasureSpec.makeMeasureSpec(0, 0), 37 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) View.resolveSize(0, 0), -1454191902, false, $$c(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7083766810336261929L);
                        i13++;
                        int i14 = $11 + 117;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        int i16 = $10 + 81;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            byte[] bArr6 = component2;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            c2 = (char) (getsmalliconid.component3 >> (((byte) (((byte) (((long) bArr6[r8]) - 7083766810336261929L)) >>> s)) ^ b2));
                        } else {
                            byte[] bArr7 = component2;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            c2 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        getsmalliconid.component1 = c2;
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        equals = 1;
        component2();
        Object[] objArr = new Object[1];
        a(MotionEvent.axisFromString("") - 1703852617, (-52) - KeyEvent.keyCodeFromString(""), (short) ((-7) - ExpandableListView.getPackedPositionGroup(0L)), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") - 1672604654, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 121;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = -1807364765;
        component1 = -238323887;
        ShareDataUIState = -1837458568;
        component2 = new byte[]{39, 33, -43, 0, -12, TarHeader.LF_NORMAL, 42, TarHeader.LF_CHR, -62, Base64.padSymbol, 44, 36, -45, Base64.padSymbol, TarHeader.LF_SYMLINK, -58, 32, 40, -45, 34, Base64.padSymbol, TarHeader.LF_NORMAL, -36, -42, 44, 7, 8, -32, 39, 33, -43, 32, -44, TarHeader.LF_NORMAL, 42, -45, 102, -7, -42, 44, 39, 104, -24, 36, 57, -42, -46, TarHeader.LF_FIFO, -47, 34, 59, -35, 59, 32, 44, 37, 20, -27, 34, -36, TarHeader.LF_BLK, -38, Base64.padSymbol, 104, -31, 44, 58, 41};
    }
}
