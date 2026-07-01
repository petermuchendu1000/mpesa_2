package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class PaySettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long ShareDataUIState;
    private static char[] component1;
    static PaySettingViewModel component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2d
        L14:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int fadingEdgeLength = 1758 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf = 33 - TextUtils.indexOf((CharSequence) "", '0');
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte length = (byte) $$a.length;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, iIndexOf, scrollBarFadeDuration, 1159210934, false, $$c((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 3608, TextUtils.lastIndexOf("", '0') + 30, (char) (7171 - Color.blue(0)), 1951385784, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    int i5 = 4013 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 24;
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27762);
                    byte b4 = $$a[1];
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5, maxKeyCode, modifierMetaStateMask, -1529629956, false, $$c((byte) 0, b4, (byte) (b4 - 5)), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 31;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    int iIndexOf2 = 4013 - TextUtils.indexOf("", "", 0, 0);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 24;
                    char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27760);
                    byte b5 = $$a[1];
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iCombineMeasuredStates, c3, -1529629956, false, $$c((byte) 0, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i8 = $11 + 105;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 2;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i10 = $11 + 99;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 0;
        component2();
        Object[] objArr = new Object[1];
        a(TextUtils.getTrimmedLength(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 61;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component1 = new char[]{3093, 45916, 29329, 12695, 61706, 45146, 30601, 14050, 63035, 46450, 29930, 15333, 64291, 47760, 31193, 14601, 63559, 49039, 32476, 15880, 64875, 48306, 25597, 9003, 57978, 41445, 24855, 8286, 59284, 42708, 26133, 9536, 58547, 44001, 27506, 10875, 59811, 43260, 26657, 12182, 61163, 44562, 27914, 11415, 54211, 37682, 21095, 4528, 53481, 36903, 22377, 5797, 54876, 38255, 21657, 7132, 56125, 39502, 22944, 6373, 55347, 40809, 24231, 7643, 56671, 40086, 17355, 820, 49741, 33163, 16589, '9'};
        ShareDataUIState = 7393570691445338931L;
    }
}
