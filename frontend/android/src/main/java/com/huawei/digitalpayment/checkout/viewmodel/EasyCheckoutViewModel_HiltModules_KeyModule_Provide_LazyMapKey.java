package com.huawei.digitalpayment.checkout.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class EasyCheckoutViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static int component3;
    private static short[] component4;
    private static int copy;
    static EasyCheckoutViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    private static String $$c(int i, int i2, short s) {
        int i3 = i2 + 4;
        int i4 = s * 4;
        byte[] bArr = $$a;
        int i5 = 116 - i;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 += -i3;
            i3 = i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i3 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i9];
            i3 = i9;
            i7 = i8;
        }
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 3;
                byte b4 = (byte) (b3 - 4);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 999, (ViewConfiguration.getScrollBarSize() >> 8) + 31, (char) (61685 - (Process.myPid() >> 22)), 1874745193, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = component1;
                long j = 0;
                if (bArr2 != null) {
                    int i10 = $10 + 61;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        int i11 = $10 + 115;
                        $11 = i11 % 128;
                        if (i11 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int iArgb = Color.argb(0, 0, 0, 0) + 2984;
                                int capsMode = 48 - TextUtils.getCapsMode("", 0, 0);
                                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 54461);
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, capsMode, c2, -1178636483, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i5] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i5])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 - 1);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2985, ExpandableListView.getPackedPositionChild(0L) + 49, (char) (Color.rgb(0, 0, 0) + 16831678), -1178636483, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i5] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i5++;
                        }
                        i6 = 2;
                        j = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = component1;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 3;
                        byte b10 = (byte) (b9 - 4);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 998, 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (61684 - TextUtils.indexOf((CharSequence) "", '0')), 1874745193, false, $$c(b9, b10, (byte) (b10 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)) + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component2), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int jumpTapTimeout = 1697 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 37;
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    byte length2 = (byte) $$a.length;
                    byte b11 = (byte) (length2 - 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, iKeyCodeFromString, absoluteGravity, -1454191902, false, $$c(length2, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component1;
                if (bArr4 != null) {
                    int i12 = $10 + 61;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = component1;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        int i15 = $11 + 25;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 5 % 2;
                        }
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
        copy = 1;
        component2();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 421002127, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10, (short) View.resolveSizeAndState(0, 0, 0), (byte) (51 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1354513224 - ImageFormat.getBitsPerPixel(0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 79;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        ShareDataUIState = 388199257;
        component3 = -238323951;
        component2 = 1586016819;
        component1 = new byte[]{Ascii.GS, Ascii.ESC, -17, 56, -52, 8, -26, 9, -8, -27, Ascii.FS, Ascii.RS, Ascii.DC2, -28, -25, 63, -48, Ascii.FS, 8, 6, 13, -40, Ascii.GS, Ascii.ESC, -17, Ascii.CAN, -20, 8, -26, -23, 82, -96, -27, Ascii.FS, Ascii.RS, Ascii.DC2, -28, -25, Ascii.US, 47, -96, Ascii.FS, 19, -30, -18, 2, -21, Ascii.RS, 17, -9, 17, Ascii.CAN, -28, Ascii.US, 44, -33, Ascii.RS, -12, Ascii.FF, -10, Ascii.ETB, 32, -37, -28, Ascii.SYN, 41};
    }
}
