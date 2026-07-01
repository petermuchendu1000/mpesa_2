package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public final class PinLoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static PinLoginViewModel component2;
    private static char[] component3;
    private static long copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    private static String $$c(short s, int i, short s2) {
        int i2 = s + 4;
        int i3 = i * 4;
        byte[] bArr = $$a;
        int i4 = s2 + 117;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = (-i2) + i3;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            int i7 = i2 + 1;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            i4 = (-bArr[i7]) + i4;
            i2 = i7;
        }
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component3[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 1758, 34 - View.combineMeasuredStates(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1159210934, false, $$c(b2, (byte) (b2 + 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3607 - ExpandableListView.getPackedPositionChild(0L), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 7172), 1951385784, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4012 - MotionEvent.axisFromString(""), ImageFormat.getBitsPerPixel(0) + 25, (char) (View.resolveSize(0, 0) + 27761), -1529629956, false, $$c(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b7 = (byte) (-1);
                byte b8 = (byte) (b7 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getTouchSlop() >> 8), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27761), -1529629956, false, $$c(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $10 + 93;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    static {
        ShareDataUIState = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0), 80 - View.MeasureSpec.getMode(0), (char) (54938 - (Process.myPid() >> 22)), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 85;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component3 = new char[]{55951, 52160, 63495, 59659, 40840, 36054, 48415, 41550, 20625, 16862, 30300, 26473, 5537, 15084, 11055, 55413, 52925, 65523, 60458, 40308, 33705, 45310, 41291, 22407, 17616, 30025, 6721, 2194, 14806, 11784, 57155, 52636, 62185, 58173, 36900, 34473, 47087, 42020, 21879, 31671, 26841, 6456, 3702, 15576, 11524, 53838, 49352, 61901, 58899, 38744, 34195, 43739, 23390, 18501, 32423, 28652, 7219, 3434, 13229, 8441, 53565, 50807, 62712, 58817, 35397, 47233, 43494, 24074, 20295, 32138, 25296, 4911, AbstractJsonLexerKt.END_LIST, 13970, 10181, 54272, 50535, 60335, 39139, 35117};
        copydefault = 39282769613233461L;
    }
}
