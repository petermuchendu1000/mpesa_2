package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class ModifySecurityQuestionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    static ModifySecurityQuestionsViewModel component2;
    private static byte[] component3;
    private static short[] component4;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {34, -56, Ascii.SUB, -92};
    private static final int $$b = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    private static String $$c(byte b2, byte b3, int i) {
        int i2 = 3 - (b3 * 3);
        int i3 = b2 + 112;
        int i4 = i * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i2 + 1;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
            i5 = i6;
        }
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            long j2 = 0;
            if (objCopydefault == null) {
                byte b3 = (byte) 1;
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 998, View.getDefaultSize(0, 0) + 31, (char) (61685 - Color.alpha(0)), 1874745193, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 45;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = component3;
                if (bArr2 != null) {
                    int i8 = $10 + 25;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int maxKeyCode = 2984 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iGreen = 48 - Color.green(0);
                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(j2) + 54463);
                            byte length2 = (byte) $$a.length;
                            byte b5 = (byte) (length2 - 4);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, iGreen, packedPositionChild, -1178636483, false, $$c(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = component3;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1000 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, (char) (ExpandableListView.getPackedPositionGroup(0L) + 61685), 1874745193, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ j));
                if (!z) {
                    i4 = 0;
                } else {
                    int i11 = $11 + 23;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                }
                getsmalliconid.copydefault = i10 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component1), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1697, 37 - Color.blue(0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -1454191902, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component3;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i13 = 0;
                    while (i13 < length3) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7083766810336261929L);
                        i13++;
                        int i14 = $10 + 79;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        int i16 = $11 + 11;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
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
        getRequestBeneficiariesState = 1;
        component2();
        Object[] objArr = new Object[1];
        a((-1587930911) - Color.green(0), (Process.myPid() >> 22) - 5, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-75) - View.MeasureSpec.getSize(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2039324737, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 123;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        copydefault = -1351708618;
        ShareDataUIState = -238323923;
        component1 = 2008618763;
        component3 = new byte[]{115, -101, -99, 105, -66, 74, -114, 96, -113, 127, -103, 99, -102, 105, -99, -110, 108, -72, 68, -103, -105, 107, 97, -114, 98, -114, 70, -113, 97, -103, 105, -66, -125, 94, -101, -99, 105, -98, 106, -114, 96, 111, -44, 92, -103, 101, -97, -93, 85, 101, 107, -115, 105, -66, 67, -103, -98, 100, -97, -94, 32, -111, 100, 100, -98, -103, 99, -112, -87, 38, -102, -107, 100, 104, -124, 109, -104, -105, 113, -105, -98, 98, -103, -86, 89, -104, 114, -118, 112, -111, -90, 93, 98, -112};
    }
}
