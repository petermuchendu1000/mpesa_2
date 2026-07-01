package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class OtpLoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static OtpLoginViewModel component1;
    private static int component2;
    private static int component3;
    private static byte[] copydefault;
    private static short[] equals;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.GS, -59, -25, -119};
    private static final int $$b = WSContextConstant.HANDSHAKE_SEND_SIZE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.OtpLoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 + 112
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.OtpLoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        long j2;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 999;
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 31;
                char pressedStateDuration = (char) (61685 - (ViewConfiguration.getPressedStateDuration() >> 16));
                byte b3 = (byte) ($$b & 3);
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, touchSlop, pressedStateDuration, 1874745193, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            long j3 = 0;
            if (z) {
                byte[] bArr = copydefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $11 + 105;
                        $10 = i8 % 128;
                        if (i8 % i5 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2984;
                                int offsetBefore = 48 - TextUtils.getOffsetBefore("", 0);
                                char c2 = (char) (54463 - (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1)));
                                byte length2 = (byte) $$a.length;
                                byte b5 = (byte) (length2 - 4);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, offsetBefore, c2, -1178636483, false, $$c(length2, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i7])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                int size = 2984 - View.MeasureSpec.getSize(0);
                                int packedPositionType = 48 - ExpandableListView.getPackedPositionType(0L);
                                char cMyTid = (char) (54462 - (Process.myTid() >> 22));
                                byte length3 = (byte) $$a.length;
                                byte b6 = (byte) (length3 - 4);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(size, packedPositionType, cMyTid, -1178636483, false, $$c(length3, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i7++;
                        }
                        i5 = 2;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 11;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = copydefault;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 999;
                        int touchSlop2 = 31 - (ViewConfiguration.getTouchSlop() >> 8);
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 61684);
                        byte b7 = (byte) ($$b & 3);
                        byte b8 = (byte) (b7 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, touchSlop2, c3, 1874745193, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ j));
                if (z) {
                    i4 = 1;
                } else {
                    int i12 = $11 + 17;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 0;
                }
                getsmalliconid.copydefault = i11 + i4;
                try {
                    Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component2), sb};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault5 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1696, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, (char) ((Process.getThreadPriority(0) + 20) >> 6), -1454191902, false, $$c(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = copydefault;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i14 = 0; i14 < length4; i14++) {
                            int i15 = $10 + 3;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                        }
                        int i17 = $11 + 49;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (z2) {
                            int i19 = $10 + 115;
                            $11 = i19 % 128;
                            if (i19 % 2 == 0) {
                                byte[] bArr6 = copydefault;
                                int i20 = getsmalliconid.copydefault;
                                getsmalliconid.copydefault = i20 >> 1;
                                j2 = ((long) bArr6[i20]) % 7083766810336261929L;
                            } else {
                                byte[] bArr7 = copydefault;
                                int i21 = getsmalliconid.copydefault;
                                getsmalliconid.copydefault = i21 - 1;
                                j2 = ((long) bArr7[i21]) ^ 7083766810336261929L;
                            }
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) j2) + s)) ^ b2));
                        } else {
                            short[] sArr = equals;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
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
        getRequestBeneficiariesState = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((-1520001179) - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0, 0) - 72, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (KeyEvent.normalizeMetaState(0) + 119), (ViewConfiguration.getTapTimeout() >> 16) - 1386549086, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 13;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        ShareDataUIState = -1420683342;
        component3 = -238323858;
        component2 = -1553041176;
        copydefault = new byte[]{32, 89, 95, -85, 124, -120, 76, -94, 77, -74, 91, 92, -90, 125, -126, -94, 123, 127, -100, 89, 95, -85, 92, -88, 76, -94, -83, Ascii.SYN, -98, 91, 92, -90, 93, 96, -105, -89, -87, 79, -85, 124, -127, 91, 92, -90, 93, 96, -30, 83, -90, -90, 92, 91, -95, 82, 107, -28, 88, 87, -90, -86, 70, -81, 90, 85, -77, 85, 92, -96, 91, 104, -101, 90, -80, 72, -78, 83, 100, -97, -96, 82};
    }
}
