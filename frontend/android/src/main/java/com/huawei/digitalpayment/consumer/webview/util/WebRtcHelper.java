package com.huawei.digitalpayment.consumer.webview.util;

import android.app.Activity;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.PermissionRequest;
import android.widget.ExpandableListView;
import androidx.core.app.ActivityCompat;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.plus.android.miniprogram.engine.api.APWebPermissionRequest;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public class WebRtcHelper {
    private static final int copydefault = 30;
    private static short[] getRequestBeneficiariesState;
    Activity component1;
    PermissionRequest component2;
    private static final byte[] $$c = {112, 44, -46, -27};
    private static final int $$f = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -53, Ascii.US, 101, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 251;
    private static final byte[] $$a = {TarHeader.LF_BLK, -107, 59, -11, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, Ascii.NAK, -31, 45, Ascii.SI, -3, Ascii.NAK};
    private static final int $$b = 79;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 1;
    private static int ShareDataUIState = 1578872659;
    private static int component3 = -238323853;
    private static int copy = 101561658;
    private static byte[] equals = {-105, -36, 46, -35, 38, TarHeader.LF_LINK, TarHeader.LF_FIFO, -109, 56, -41, -48, 47, 40, -38, 109, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -101, 40, 36, -43, 42, -44, 44, -36, Ascii.VT, -16, 38, -41, -23, 36, -43, 42, -44, 44, -36, Ascii.VT, TarHeader.LF_FIFO, -109, 56, -41, -48, 47, 40, -38, 109, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -121, -58, 36, -36, 58, 58, -14, 35, -102, -36, -34, Ascii.FF, -49, -43, -44, 40, 38, 58, -9, 38, -41, -98, 39, -36, -34, Ascii.FF, -53, 36, -40, 38, -47, 37, -58, 56, 56, -11, 38, -41};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r8 = 116 - r8
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.$$c
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.$$g(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 6
            int r6 = 106 - r6
            int r5 = r5 * 18
            int r5 = 21 - r5
            int r7 = r7 * 12
            int r0 = 19 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.$$a
            byte[] r0 = new byte[r0]
            int r7 = 18 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            int r5 = r5 + 1
            r3 = r1[r5]
        L2c:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.$$d
            int r6 = r6 + 98
            int r7 = r7 * 9
            int r7 = 12 - r7
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r6 = r6 + r7
            int r6 = r6 + (-27)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.b(short, short, short, java.lang.Object[]):void");
    }

    public WebRtcHelper(Activity activity) {
        this.component1 = activity;
    }

    public void onWebViewPermissionRequest(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        this.component1.runOnUiThread(new WebRtcHelper$$ExternalSyntheticLambda0(this, permissionRequest));
        int i2 = component4 + 25;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
    }

    private void ShareDataUIState(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        this.component2 = permissionRequest;
        ArrayList arrayList = new ArrayList();
        for (String str : permissionRequest.getResources()) {
            int i2 = component4 + 3;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.equals(str, APWebPermissionRequest.RESOURCE_AUDIO_CAPTURE)) {
                arrayList.add("android.permission.RECORD_AUDIO");
                int i4 = component4 + 13;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
            } else if (TextUtils.equals(str, APWebPermissionRequest.RESOURCE_VIDEO_CAPTURE)) {
                int i6 = getAsAtTimestamp + 7;
                component4 = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add("android.permission.CAMERA");
            }
        }
        ActivityCompat.requestPermissions(this.component1, (String[]) arrayList.toArray(new String[0]), 30);
    }

    public void onActivityRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = component4 + 69;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0) {
            if (i != 72) {
                return;
            }
        } else if (i != 30) {
            return;
        }
        if (iArr.length > 0) {
            int i5 = i4 + 29;
            component4 = i5 % 128;
            for (int i6 = i5 % 2 == 0 ? 1 : 0; i6 < iArr.length; i6++) {
                int i7 = getAsAtTimestamp + 89;
                int i8 = i7 % 128;
                component4 = i8;
                if (i7 % 2 == 0) {
                    int i9 = 15 / 0;
                    if (iArr[i6] != 0) {
                        int i10 = i8 + 73;
                        getAsAtTimestamp = i10 % 128;
                        int i11 = i10 % 2;
                    }
                } else if (iArr[i6] != 0) {
                    int i102 = i8 + 73;
                    getAsAtTimestamp = i102 % 128;
                    int i112 = i102 % 2;
                }
            }
            PermissionRequest permissionRequest = this.component2;
            permissionRequest.grant(permissionRequest.getResources());
            return;
        }
        this.component2.deny();
    }

    private static void c(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            long j2 = 0;
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, (char) (61686 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1874745193, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            if (i8 != 0) {
                int i9 = $11 + 107;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = equals;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 27;
                        $11 = i12 % 128;
                        int i13 = i12 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2983 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), 48 - View.getDefaultSize(0, 0), (char) (54462 - (ViewConfiguration.getTouchSlop() >> 8)), -1178636483, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i6 = 2;
                        j2 = 0;
                    }
                    int i14 = $10 + 81;
                    $11 = i14 % 128;
                    i4 = 2;
                    int i15 = i14 % 2;
                    bArr = bArr2;
                } else {
                    i4 = 2;
                }
                if (bArr != null) {
                    int i16 = $11 + 107;
                    $10 = i16 % 128;
                    if (i16 % i4 != 0) {
                        byte[] bArr3 = equals;
                        Object[] objArr4 = new Object[i4];
                        objArr4[1] = Integer.valueOf(ShareDataUIState);
                        objArr4[0] = Integer.valueOf(i);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - TextUtils.indexOf("", "", 0, 0), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (61685 - TextUtils.getCapsMode("", 0, 0)), 1874745193, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) % 7083766810336261929L)) * ((int) (((long) component3) & 7083766810336261929L));
                    } else {
                        byte[] bArr4 = equals;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 999, Process.getGidForName("") + 32, (char) (ExpandableListView.getPackedPositionGroup(0L) + 61685), 1874745193, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i5;
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ j)) + i8;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copy), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b11 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 1697, View.resolveSizeAndState(0, 0, 0) + 37, (char) (ViewConfiguration.getTapTimeout() >> 16), -1454191902, false, $$g(b11, b11, (byte) $$c.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = equals;
                if (bArr5 != null) {
                    int i17 = $11 + 109;
                    int i18 = i17 % 128;
                    $10 = i18;
                    int i19 = 2;
                    int i20 = i17 % 2;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i21 = i18 + 59;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = 0;
                    while (i23 < length2) {
                        int i24 = $11 + 47;
                        $10 = i24 % 128;
                        int i25 = i24 % i19;
                        bArr6[i23] = (byte) (((long) bArr5[i23]) ^ 7083766810336261929L);
                        i23++;
                        i19 = 2;
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i26 = $10 + 43;
                    $11 = i26 % 128;
                    int i27 = i26 % 2;
                    z = true;
                } else {
                    int i28 = $11 + 119;
                    $10 = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 4 / 4;
                    }
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr7 = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getRequestBeneficiariesState;
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

    public static void m12138$r8$lambda$H1n9uLErnKiqLRslS6xwTJxF7w(WebRtcHelper webRtcHelper, PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = component4 + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        webRtcHelper.ShareDataUIState(permissionRequest);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0b5e A[Catch: all -> 0x0e12, TryCatch #0 {all -> 0x0e12, blocks: (B:70:0x0b47, B:72:0x0b5e, B:73:0x0ba0, B:86:0x0c15, B:88:0x0c22, B:89:0x0c5d, B:91:0x0c7c, B:93:0x0cc0), top: B:122:0x0b47 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component3(java.util.List r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper.component3(java.util.List):int");
    }
}
