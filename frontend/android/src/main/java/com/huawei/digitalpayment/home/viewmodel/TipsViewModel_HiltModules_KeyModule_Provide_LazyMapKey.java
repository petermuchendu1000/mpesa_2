package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import org.bouncycastle.crypto.signers.PSSSigner;

public final class TipsViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {68, 4, -12, PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = 216;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static char[] component1;
    static TipsViewModel component2;
    private static long component3;
    private static int copydefault;
    public static String lazyClassKeyName;

    private static String $$c(int i, byte b2, int i2) {
        int i3 = i2 * 3;
        int i4 = i + 117;
        byte[] bArr = $$a;
        int i5 = 3 - (b2 * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + (-i5);
            i5 = i5;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i5 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i9];
            i5 = i9;
            i7 = i8;
        }
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i7])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int absoluteGravity = 1758 - Gravity.getAbsoluteGravity(0, 0);
                    int iIndexOf = 34 - TextUtils.indexOf("", "", 0);
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte length = (byte) $$a.length;
                    byte b2 = (byte) (length - 4);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, iIndexOf, longPressTimeout, 1159210934, false, $$c(length, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3607 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 29 - View.combineMeasuredStates(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 7172), 1951385784, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    int defaultSize = View.getDefaultSize(0, 0) + 4013;
                    int iMyTid = (Process.myTid() >> 22) + 24;
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 27761);
                    byte b5 = (byte) ($$a[1] + 1);
                    byte b6 = (byte) (b5 - 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iMyTid, offsetAfter, -1529629956, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i3 = 2;
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
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4013;
                int iLastIndexOf = 23 - TextUtils.lastIndexOf("", '0');
                char cLastIndexOf = (char) (27760 - TextUtils.lastIndexOf("", '0'));
                byte b7 = (byte) ($$a[1] + 1);
                byte b8 = (byte) (b7 - 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, iLastIndexOf, cLastIndexOf, -1529629956, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i8 = $10 + 85;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 3;
            }
        }
        objArr[0] = new String(cArr);
    }

    static {
        copydefault = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollDefaultDelay() >> 16, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 54, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 87;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component1 = new char[]{3093, 30425, 63899, 31768, 59166, 27075, 60567, 22337, 55827, 23775, 51160, 19026, 52511, 14289, 47775, 15682, 40983, 10970, 44422, 4183, 39695, 7643, 32915, 2904, 36354, 61592, 31646, 65113, 24859, 60371, 28376, 53568, 21535, 57043, 16769, 50267, 20249, 45522, 13459, 48986, 8792, 42210, 12191, 37446, 5381, 40928, 671, 34131, 2049, 29435, 62873, 30802, 58131, 26074};
        component3 = -7222185421982566730L;
    }
}
