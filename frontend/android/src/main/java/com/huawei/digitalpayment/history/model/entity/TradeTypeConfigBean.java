package com.huawei.digitalpayment.history.model.entity;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public class TradeTypeConfigBean extends BaseResp {
    private static short[] component3;
    private String order;
    private String serviceKey;
    private String serviceName;
    private static final byte[] $$c = {94, -43, -105, 125};
    private static final int $$f = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, 99, 107, 124, -5, 9, TarHeader.LF_CONTIG, -54, -15, -8, 5, 9, -24, 20, 0, -20, -3, 6, 5, TarHeader.LF_DIR, PSSSigner.TRAILER_IMPLICIT, -3, Ascii.FF, TarHeader.LF_CHR, -55, -17, -9, 7, -6, 3, 63, -70, Ascii.SI, -10, -7, 10, -15, -10, 71, -38, -17, -10, -7, 10, -15, -10, 42, -28, -22, 39, -19, -10, -11, 41, -32, -11, 7, -15, Ascii.SI, -21, 3, -5, -14, 0, -5, -1, -1, 7, -11, -8, SignedBytes.MAX_POWER_OF_TWO};
    private static final int $$e = 106;
    private static final byte[] $$a = {120, -46, -95, -23, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1};
    private static final int $$b = 231;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int component2 = 1557283794;
    private static int copydefault = -238323884;
    private static int component1 = 507386593;
    private static byte[] ShareDataUIState = {60, 40, 57, Ascii.US, -54, 60, -41, 39, 46, Ascii.SUB, Ascii.ESC, -31, 56, 103, -2, 33, 46, 35, TarHeader.LF_SYMLINK, 42, TarHeader.LF_CHR, 57, TarHeader.LF_DIR, 36, 9, 10, Base64.padSymbol, 2, 47, 62, 35, TarHeader.LF_SYMLINK, Ascii.SO, 36, TarHeader.LF_FIFO, -2, -7, -18, -9, -63, -122, -16, -10, -18, -56, -32, -52, -33, -50, -69, -3, -54, 46, -73, -26, -25, -8, -53, -29, -56, 66, 91, 72, 86, 67, 79, SignedBytes.MAX_POWER_OF_TWO, 65, 69, -78, Ascii.DLE, 91, 92, 118, 69, SignedBytes.MAX_POWER_OF_TWO, 87, 41, 41, 41, 41};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, byte r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r8 = r8 + 4
            int r6 = 116 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            r3 = -1
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            goto L29
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
        L29:
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean.$$i(short, byte, int):java.lang.String");
    }

    private static void a(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = 99 - (b2 * 16);
        int i3 = 23 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b3 + 10];
        int i4 = b3 + 9;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i2 + (-i3)) - 16;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i3];
                i3++;
                i2 = (i2 + (-b4)) - 16;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r8 = r8 + 99
            byte[] r0 = com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean.$$d
            int r7 = r7 * 49
            int r1 = 59 - r7
            int r6 = r6 * 58
            int r6 = 61 - r6
            byte[] r1 = new byte[r1]
            int r7 = 58 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean.c(short, byte, short, java.lang.Object[]):void");
    }

    public String getServiceKey() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serviceKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setServiceKey(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 51;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        this.serviceKey = str;
        int i5 = i2 + 97;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getServiceName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.serviceName;
        int i5 = i3 + 67;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setServiceName(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 69;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        this.serviceName = str;
        int i5 = i2 + 27;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOrder() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.order;
        }
        throw null;
    }

    private static void b(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            char c2 = '0';
            if (objCopydefault == null) {
                int iAlpha = Color.alpha(0) + 999;
                int mirror = 'O' - AndroidCharacter.getMirror('0');
                char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 61684);
                byte b3 = (byte) ($$f & 7);
                byte b4 = (byte) (b3 - 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, mirror, c3, 1874745193, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int i9 = $10 + 99;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 69;
                        $11 = i12 % 128;
                        if (i12 % i5 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2985 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", c2) + 49, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 54462), -1178636483, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2985, MotionEvent.axisFromString("") + 49, (char) (54463 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -1178636483, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i11++;
                        }
                        i5 = 2;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 999;
                        int windowTouchSlop = 31 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 61686);
                        byte b9 = (byte) ($$f & 7);
                        byte b10 = (byte) (b9 - 3);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, windowTouchSlop, cIndexOf, 1874745193, false, $$i(b9, b10, (byte) (b10 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component3[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ j));
                if (z) {
                    int i14 = $10 + 29;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i13 + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component1), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int i16 = 1696 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iLastIndexOf = 36 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    byte length2 = (byte) $$c.length;
                    byte b11 = (byte) (length2 - 4);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i16, iLastIndexOf, packedPositionType, -1454191902, false, $$i(length2, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i17 = 0; i17 < length3; i17++) {
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i18 = $11 + 123;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    z2 = true;
                } else {
                    int i20 = $10 + 59;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0581  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOrder(java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean.setOrder(java.lang.String):void");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TradeTypeConfig{serviceKey='" + this.serviceKey + "', serviceName='" + this.serviceName + "', order='" + this.order + "'}";
        int i2 = getRequestBeneficiariesState + 71;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
