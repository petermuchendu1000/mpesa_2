package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;
import kotlin.text.Typography;

public final class ESimViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long ShareDataUIState;
    static ESimViewModel component2;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_BLK, -58, -85, 74};
    private static final int $$b = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 105 - r6
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        char c2 = 2;
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            char c3 = cArr[notifyVar.copydefault];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c2] = notifyVar;
                objArr2[1] = notifyVar;
                objArr2[0] = Integer.valueOf(c3);
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 3267, TextUtils.indexOf("", "", 0, 0) + 33, (char) (TextUtils.indexOf("", "", 0, 0) + 60268), -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 687, 34 - TextUtils.getOffsetBefore("", 0), (char) (60374 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i4 = $11 + 107;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                c2 = 2;
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
            int i6 = $11 + 87;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - KeyEvent.keyCodeFromString(""), 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (60373 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), -1969106284, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr5 = {notifyVar, notifyVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 687, 34 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (KeyEvent.normalizeMetaState(0) + 60373), -1969106284, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component3 = 1;
        component1();
        Object[] objArr = new Object[1];
        a(55807 - ExpandableListView.getPackedPositionGroup(0L), new char[]{63179, 12088, 17723, 31611, 37180, 46886, 60723, 806, 14645, 24374, 30064, 43833, 49461, 59196, 7475, 13101, 26937, 36651, 42294, 56100, 61757, 5934, 19751, 25391, 39220, 48993, 54573, 2850, Typography.tm, 18232, 32063, 37668, 51501, 61189, 1368, 15110, 20754, 30480, 44295, 49944, 63838, 7951, 13580, 27410, 33050, 42770, 56598, 62236, 10582, 20226, 25877, 39692, 45321, 55117, 3367, 9010, 22793, 32514, 38200, 51972, 57609, 1820, 15655, 21254, 35084, 44914, 50554}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 109;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        ShareDataUIState = -4478318495782898046L;
    }
}
