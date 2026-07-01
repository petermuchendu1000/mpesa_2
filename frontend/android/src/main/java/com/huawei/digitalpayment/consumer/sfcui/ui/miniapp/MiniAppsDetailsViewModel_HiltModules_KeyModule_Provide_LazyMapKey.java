package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class MiniAppsDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static byte[] ShareDataUIState;
    static MiniAppsDetailsViewModel component1;
    private static int component2;
    private static int component3;
    private static int component4;
    private static int copydefault;
    private static short[] getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    private static String $$c(int i, short s, byte b2) {
        byte[] bArr = $$a;
        int i2 = s * 4;
        int i3 = 116 - i;
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i2 + i3;
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
            i4++;
        }
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 3;
                byte b4 = (byte) (b3 - 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 999, KeyEvent.normalizeMetaState(0) + 31, (char) (KeyEvent.getDeadChar(0, 0) + 61685), 1874745193, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $11 + 29;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 49;
                        $10 = i9 % 128;
                        if (i9 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 2984, 48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (54462 - Color.red(0)), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault3 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2984 - KeyEvent.normalizeMetaState(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 54463), -1178636483, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                                i8++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 3;
                        byte b10 = (byte) (b9 - 3);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 999, 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (61685 - KeyEvent.getDeadChar(0, 0)), 1874745193, false, $$c(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                    int i10 = $10 + 73;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ 7083766810336261929L)) + i6;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component3), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int mode = View.MeasureSpec.getMode(0) + 1697;
                    int pressedStateDuration = 37 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte length2 = (byte) $$a.length;
                    byte b11 = (byte) (length2 - 4);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(mode, pressedStateDuration, doubleTapTimeout, -1454191902, false, $$c(length2, b11, b11), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i12 = $11 + 15;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    for (int i14 = 0; i14 < length3; i14++) {
                        int i15 = $10 + 41;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (!z) {
                        short[] sArr = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
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
        component4 = 1;
        component2();
        Object[] objArr = new Object[1];
        a((-861101842) - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 55, (short) (6 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1399060514, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 83;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component2 = -1030215621;
        copydefault = -238323940;
        component3 = -1566011475;
        ShareDataUIState = new byte[]{62, 40, -46, -58, TarHeader.LF_DIR, -7, 37, -33, 36, -12, 40, -44, 43, -50, 32, TarHeader.LF_SYMLINK, -30, -44, -45, 0, -5, -36, -42, 63, TarHeader.LF_NORMAL, -111, -45, 32, -37, -36, -42, -33, Ascii.DLE, -106, -57, 104, -106, -57, 37, -34, -60, Ascii.SYN, -97, 46, -37, -37, -43, -42, -48, 47, 6, -99, 41, 42, -37, -57, 59, -62, -41, 44, -50, 44, -43, -47, -42, Ascii.EM, -106, -41, -63, 57, -49, 46, Ascii.GS, -110, -47, 47};
    }
}
