package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.L;
import com.huawei.common.util.ViewUtils;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import org.bouncycastle.crypto.signers.PSSSigner;

public class AppConfigUtils {
    private static final byte[] $$c = {Base64.padSymbol, -49, -70, 93};
    private static final int $$f = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {126, 1, Ascii.SUB, -71, -12, -1, -9, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$e = 87;
    private static final byte[] $$a = {57, 126, 65, 8, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -55, -14, -1, -8, 13, -11, -8, 68, PSSSigner.TRAILER_IMPLICIT, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, Ascii.ESC, -39, -11, 7, -23, 19, TarHeader.LF_LINK, -64, 9, -15, 5, TarHeader.LF_CONTIG, -40, -22, -12, Ascii.VT, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
    private static final int $$b = 60;
    private static int component3 = 0;
    private static int ShareDataUIState = 1;
    private static char[] copydefault = {3095, 10481, 17856, 25279, 40893, 46226, 53604, 3591, 11101, 16424, 32002, 39425, 46847, 54221, 2236, 9727, 17061, 32608, 38010, 45385, 60967, 2835, 8196, 57884, 50935, 43997, 35984, 29118, 23189, 16230, 57413, 50516, 44591, 37679, 29721, 22778, 15819, 57786, 50513, 43131, 36647, 29193, 22816, 15559, 58347, 50934, 44429, 37043, 30647, 23390, 15974, 58666, 51220, 44843, 37579, 3161, 3078, 10482, 17796, 25249, 40891, 46216, 53620, 3593, 11086, 16422, 32015, 39454, 46843, 54212, 2221, 9634, 3091, 10471, 17869, 25273, 40920, 28477, 19397, 9980, 413, 64648, 55207, 45662, 27944, 18534, 8979, 7738, 63840, 54726, 45303, 27548, 18061, 8625, 7249, 63233, 25766, 16478, 11623, 2566, 63251, 56380, 47557, 26291, 17405, 10376, 5537, 62203, 56923, 47981, 24588, 19715, 10793, 6086, 64720, 55731, 3078, 10494, 17863, 25254, 40883, 46236, 53605, 3603, 3148, 3095, 10481, 17856, 25279, 40893, 46226, 53604, 3591, 11103, 16439, 32028, 39515, 46843, 54215, 2213, 9656, 17032, 32545, 37968, 45400, 60980, 2818, Typography.ndash, 23804, 31230, 38616, 46000, 59532, 1385, 8810, 24437, 29728, 37176, 52766, 60131, 1992, 15552, 3089, 10490, 17872, 25228, 40881, 46223, 53609, 3679, 11099, 16390, 32008, 39448, 46835, 54221, 2235, 3095, 10481, 17856, 25279, 40893, 46226, 53604, 3591, 11101, 16424, 32002, 39425, 46847, 54221, 2236, 9727, 17061, 32608, 38009, 45389, 60973, 2821, 8213, 23799, 31194, 38649, 46013, 59528, 1391, 19775, 27084, 1236, 9119, 56989, 62909, 36937, 20325, 27259, 296, 15419, 56123, 63455, 37617, 18857, 25729, 950, 25686, 16611, 11730, 2737, 63401, 56465, 47458, 26121, 17223, 10296, 5387, 61973, 57083, 48073, 24728, 19885, 10905, 5985, 64632, 55639};
    private static long component1 = 6274652646388082847L;
    private static int component2 = -890926533;

    private static String $$g(int i, byte b2, int i2) {
        int i3 = b2 * 2;
        int i4 = (i * 4) + 4;
        byte[] bArr = $$c;
        int i5 = i2 + 65;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4++;
            i5 = i4 + (-i5);
        }
        while (true) {
            int i8 = i5;
            int i9 = i4;
            i7++;
            bArr2[i7] = (byte) i8;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 = i9 + 1;
            i5 = i8 + (-bArr[i9]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.$$a
            int r8 = r8 + 4
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-2)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.b(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 1
            int r7 = 16 - r7
            int r8 = 100 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.c(int, byte, int, java.lang.Object[]):void");
    }

    public static String getCurrentLang() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String language = Utils.getApp().getResources().getConfiguration().getLocales().get(0).getLanguage();
        int i4 = ShareDataUIState + 27;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return language;
        }
        throw null;
    }

    public static boolean getStateBarBgBitmapPixColor(Bitmap bitmap) {
        int iRed;
        int iGreen;
        int iBlue;
        int i = 2 % 2;
        int width = bitmap.getWidth();
        int statusBarHeight = ViewUtils.getStatusBarHeight();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < statusBarHeight) {
            int i6 = 0;
            while (i6 < width) {
                int i7 = component3 + 119;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 == 0) {
                    int pixel = bitmap.getPixel(i6, i2);
                    iRed = Color.red(pixel);
                    iGreen = Color.green(pixel);
                    iBlue = Color.blue(pixel);
                } else {
                    int pixel2 = bitmap.getPixel(i6, i2);
                    iRed = Color.red(pixel2);
                    iGreen = Color.green(pixel2);
                    iBlue = Color.blue(pixel2);
                    i6++;
                }
                int i8 = iGreen;
                i5 = iBlue;
                i3 = iRed;
                i4 = i8;
            }
            i2++;
            int i9 = ShareDataUIState + 75;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (((int) ((((double) i3) * 0.299d) + (((double) i4) * 0.587d) + (((double) i5) * 0.114d))) <= 192) {
            return false;
        }
        int i11 = component3 + 33;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public static void startBrowser(Context context, String str) {
        int i = 2 % 2;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(SafeUri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            int i2 = ShareDataUIState + 119;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
    }

    public static boolean isLayoutRTL() {
        int i = 2 % 2;
        boolean z = true;
        if (Utils.getApp().getResources().getConfiguration().getLayoutDirection() == 1) {
            int i2 = component3 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        } else {
            z = false;
        }
        int i4 = component3 + 105;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i2 + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1758, (ViewConfiguration.getLongPressTimeout() >> 16) + 34, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1159210934, false, $$g(b2, b3, (byte) (b3 | 56)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 3608, Color.green(0) + 29, (char) (7171 - Color.green(0)), 1951385784, false, $$g(b4, b5, (byte) (b5 | TarHeader.LF_BLK)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 4013, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (27761 - View.MeasureSpec.getSize(0)), -1529629956, false, $$g(b6, b7, (byte) (b7 | 57)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        int i5 = $10 + 25;
        $11 = i5 % 128;
        int i6 = 2;
        int i7 = i5 % 2;
        while (cancelnotification.copydefault < i) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            if (i8 % i6 == 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4012 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24, (char) (27761 - (ViewConfiguration.getTapTimeout() >> 16)), -1529629956, false, $$g(b8, b9, (byte) (b9 | 57)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                throw null;
            }
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr6 = {cancelnotification, cancelnotification};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault5 == null) {
                int iGreen = Color.green(0) + 4013;
                int iKeyCodeFromString = 24 - KeyEvent.keyCodeFromString("");
                char maxKeyCode = (char) (27761 - (KeyEvent.getMaxKeyCode() >> 16));
                byte b10 = (byte) 0;
                byte b11 = b10;
                String str$$g = $$g(b10, b11, (byte) (b11 | 57));
                i6 = 2;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, iKeyCodeFromString, maxKeyCode, -1529629956, false, str$$g, new Class[]{Object.class, Object.class});
            } else {
                i6 = 2;
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void d(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38, (char) (26861 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 16 - TextUtils.getOffsetBefore("", 0), (char) View.resolveSize(0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i8 = $10 + 21;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i10 = $11 + 115;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 7407, 16 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object[] component3(android.content.Context r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 7726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.component3(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
