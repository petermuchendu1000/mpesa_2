package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class AppShareViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int component1;
    static AppShareViewModel component2;
    private static long copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    private static String $$c(short s, int i, byte b2) {
        int i2 = i + 4;
        int i3 = 105 - (s * 3);
        byte[] bArr = $$a;
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i3 += bArr[i2];
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3265, ((Process.getThreadPriority(0) + 20) >> 6) + 33, (char) (60267 - TextUtils.lastIndexOf("", '0', 0)), -834797019, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 687, KeyEvent.normalizeMetaState(0) + 34, (char) (60373 - Color.argb(0, 0, 0, 0)), -1969106284, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 34 - TextUtils.indexOf("", ""), (char) (60373 - (ViewConfiguration.getLongPressTimeout() >> 16)), -1969106284, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i7 = 95 / 0;
            } else {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 34, (char) (60372 - ((byte) KeyEvent.getModifierMetaStateMask())), -1969106284, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component1 = 0;
        component1();
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2969, new char[]{57419, 60382, 63351, 49869, 52772, 55712, 42463, 45424, 48261, 34848, 37884, 40927, 27501, 30346, 16927, 19883, 23001, 9581, 12442, 15378, 1957, 5064, 8043, 60153, 62980, 49655, 52673, 55652, 42234, 45070, 48051, 34754, 37741, 40675, 27220, 30113, 16845, 19782, 22775, 9220, 12181, 15296, 1820, 4845, 7693, 59816, 62753, 49490, 52471, 55301, 41903, 44863, 47890, 34500, 37406, 40327, 26883, 30033, 16611, 19481, 22417, 8971, 12111, 15082, 1567, 4540, 7477, 59719, 62697, 49273}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 77;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
    }

    static void component1() {
        copydefault = 7964029850716889090L;
    }
}
