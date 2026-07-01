package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class AutomaticPaymentTypeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static AutomaticPaymentTypeViewModel ShareDataUIState;
    private static int component2;
    private static long component3;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {2, 77, TarHeader.LF_CONTIG, -86};
    private static final int $$b = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentTypeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 + 4
            int r8 = r8 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentTypeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, byte):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(copydefault[i << i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1759, (ViewConfiguration.getTouchSlop() >> 8) + 34, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1159210934, false, $$c(b2, (byte) (b2 + 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                    }
                    long jLongValue = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue();
                    long j = i6;
                    long j2 = component3;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c2);
                    objArr3[i3] = Long.valueOf(j2);
                    objArr3[1] = Long.valueOf(j);
                    objArr3[0] = Long.valueOf(jLongValue);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        int defaultSize = 3608 - View.getDefaultSize(0, 0);
                        int packedPositionType = 29 - ExpandableListView.getPackedPositionType(0L);
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 7171);
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        String str$$c = $$c(b3, b4, b4);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Long.TYPE;
                        clsArr[1] = Long.TYPE;
                        clsArr[i3] = Long.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, packedPositionType, cResolveOpacity, 1951385784, false, str$$c, clsArr);
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        int iMyPid = 4013 - (Process.myPid() >> 22);
                        int defaultSize2 = 24 - View.getDefaultSize(0, 0);
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27760);
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        String str$$c2 = $$c(b5, b6, (byte) (b6 + 5));
                        Class[] clsArr2 = new Class[i3];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, defaultSize2, c3, -1529629956, false, str$$c2, clsArr2);
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = cancelnotification.copydefault;
                try {
                    Object[] objArr5 = {Integer.valueOf(copydefault[i + i7])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) (-1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.combineMeasuredStates(0, 0), 1159210934, false, $$c(b7, (byte) (b7 + 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(component3), Integer.valueOf(c2)};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault5 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (KeyEvent.getMaxKeyCode() >> 16), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (7171 - (Process.myTid() >> 22)), 1951385784, false, $$c(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {cancelnotification, cancelnotification};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault6 == null) {
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (b10 + 1);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 4013, 24 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27761), -1529629956, false, $$c(b10, b11, (byte) (b11 + 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
                        i3 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i8 = $10 + 47;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b12 = (byte) (-1);
                byte b13 = (byte) (b12 + 1);
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 25, (char) (27760 - ExpandableListView.getPackedPositionChild(0L)), -1529629956, false, $$c(b12, b13, (byte) (b13 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
            int i10 = $10 + 65;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static {
        component2 = 0;
        component3();
        Object[] objArr = new Object[1];
        a((Process.getThreadPriority(0) + 20) >> 6, 131 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 119;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        copydefault = new char[]{3093, 48993, 27371, 5680, 49662, 36187, 14535, 58441, 38867, 17191, 3816, 47674, 26047, 4361, 56463, 34826, 15255, 59106, 37494, 24063, 2415, 46275, 24643, 5072, 57154, 35552, 13861, 57777, 44344, 22685, 1043, 46995, 25363, 11900, 55720, 34157, 12533, 64582, 44995, 23386, 1731, 45602, 32163, 10608, 54432, 32775, 13187, 65289, 43675, 21985, 354, 52475, 30842, 11136, 55143, 33483, 20034, 63905, 42283, 20671, 7202, 53127, 31493, 9902, 53783, 40311, 18667, 62587, 43000, 21338, 7922, 51783, 30150, 8491, 60560, 38967, 19379, 63257, 41643, 28177, 6546, 50411, 28778};
        component3 = 2219131418366885646L;
    }
}
