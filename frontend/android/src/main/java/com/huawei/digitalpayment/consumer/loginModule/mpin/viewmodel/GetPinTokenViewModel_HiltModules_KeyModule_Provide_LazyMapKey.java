package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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

public final class GetPinTokenViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static byte[] ShareDataUIState;
    static GetPinTokenViewModel component1;
    private static int component2;
    private static int component3;
    private static int copydefault;
    private static short[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {62, TarHeader.LF_FIFO, 60, 44};
    private static final int $$b = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    private static String $$c(int i, int i2, short s) {
        int i3 = i * 3;
        int i4 = 116 - i2;
        byte[] bArr = $$a;
        int i5 = 4 - (s * 2);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i4 = i5 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i5];
            i5++;
            i4 += b2;
        }
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        long j2;
        int i4 = 2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getEdgeSlop() >> 16), 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (61686 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1874745193, false, $$c(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 == 0) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int i7 = $11;
                    int i8 = i7 + 69;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = i7 + 123;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 117;
                        $11 = i13 % 128;
                        if (i13 % i4 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 2984, (ViewConfiguration.getWindowTouchSlop() >> 8) + 48, (char) (54462 - View.MeasureSpec.getMode(0)), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                                }
                                bArr2[i12] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                                i4 = 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i12])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                j2 = 0;
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 2984, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49, (char) (54462 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), -1178636483, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
                            } else {
                                j2 = 0;
                            }
                            bArr2[i12] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i12++;
                            i4 = 2;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 3);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 31, (char) (61685 - View.getDefaultSize(0, 0)), 1874745193, false, $$c(b9, b10, (byte) (b10 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ j)) + i6;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component3), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1697;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 37;
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte length2 = (byte) $$a.length;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, iMakeMeasureSpec, keyRepeatTimeout, -1454191902, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    int i15 = $10 + 55;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i17 = $11 + 97;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getAsAtTimestamp;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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
        getRequestBeneficiariesState = 0;
        component3();
        Object[] objArr = new Object[1];
        a((-1476195702) - (KeyEvent.getMaxKeyCode() >> 16), (-28) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (byte) (62 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 418586227, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 99;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        copydefault = -1506311585;
        component2 = -238323897;
        component3 = -382178817;
        ShareDataUIState = new byte[]{19, Ascii.NAK, -31, TarHeader.LF_FIFO, -62, 6, -24, 7, -4, Ascii.GS, -18, -24, Ascii.SI, -14, 17, 13, -56, Ascii.ESC, 10, 13, -42, 19, Ascii.NAK, -31, Ascii.SYN, -30, 6, -24, -25, 92, -44, 17, -19, Ascii.ETB, 43, -35, -19, -29, 5, -31, TarHeader.LF_FIFO, -53, 17, Ascii.SYN, -20, Ascii.ETB, 42, -88, Ascii.EM, -20, -20, Ascii.SYN, 17, -21, Ascii.CAN, 33, -82, Ascii.DC2, Ascii.GS, -20, -32, Ascii.FF, -27, Ascii.DLE, Ascii.US, -7, Ascii.US, Ascii.SYN, -22, 17, 34, -47, Ascii.DLE, -6, 2, -8, Ascii.EM, 46, -43, -22, Ascii.CAN, 41};
    }
}
