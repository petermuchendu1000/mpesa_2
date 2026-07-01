package com.huawei.common.util;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ThrowableUtils;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public class CrashHookLooper {
    private static final String copydefault = "CrashHookLooper";
    private static final byte[] $$c = {TarHeader.LF_SYMLINK, -82, -81, 124};
    private static final int $$f = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -58, 7, 71, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 75;
    private static final byte[] $$a = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81, -2, Ascii.SI, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
    private static final int $$b = 237;
    private static int component2 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static long component1 = -3468758873125811256L;
    private static int component3 = 1386857713;
    private static char ShareDataUIState = 50417;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r6 = 99 - r6
            byte[] r0 = com.huawei.common.util.CrashHookLooper.$$c
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.CrashHookLooper.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 103
            int r5 = r5 * 2
            int r0 = r5 + 14
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = com.huawei.common.util.CrashHookLooper.$$a
            byte[] r0 = new byte[r0]
            int r5 = r5 + 13
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r5
            r3 = r6
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r6]
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.CrashHookLooper.a(short, short, short, java.lang.Object[]):void");
    }

    private static void b(byte b2, short s, byte b3, Object[] objArr) {
        int i = 100 - b3;
        byte[] bArr = $$d;
        int i2 = b2 * 3;
        int i3 = (s * 9) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i = (i + i2) - 27;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i5 = bArr[i3];
                i3++;
                i = (i + i5) - 27;
            }
        }
    }

    static void copydefault(boolean z, boolean z2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        int i = 2 % 2;
        while (true) {
            try {
                Looper.loop();
                int i2 = component2 + 33;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                ShareDataUIState(z, z2, uncaughtExceptionHandler, uncaughtExceptionHandler2, th, Thread.currentThread());
            }
        }
    }

    public static void hook(final boolean z, final boolean z2, final Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        int i = 2 % 2;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public final void run() {
                CrashHookLooper.copydefault(z, z2, defaultUncaughtExceptionHandler, uncaughtExceptionHandler);
            }
        });
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public final void uncaughtException(Thread thread, Throwable th) {
                CrashHookLooper.component1(z, z2, defaultUncaughtExceptionHandler, uncaughtExceptionHandler, thread, th);
            }
        });
        int i2 = component2 + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    static void component1(boolean z, boolean z2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2, Thread thread, Throwable th) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(z, z2, uncaughtExceptionHandler, uncaughtExceptionHandler2, th, thread);
        int i4 = component2 + 25;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void ShareDataUIState(boolean z, boolean z2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2, Throwable th, Thread thread) {
        int i = 2 % 2;
        L.d(copydefault, "error on " + thread.getName() + " : " + th.getMessage());
        if (uncaughtExceptionHandler2 != null) {
            int i2 = getRequestBeneficiariesState + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            uncaughtExceptionHandler2.uncaughtException(Thread.currentThread(), th);
        }
        if (z2) {
            component2(thread, th);
            int i4 = getRequestBeneficiariesState + 85;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        if (z || uncaughtExceptionHandler == null) {
            return;
        }
        int i6 = component2 + 59;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    private static void component2(Thread thread, Throwable th) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(new Date(System.currentTimeMillis())));
        sb.append(":\nVersionName: ");
        sb.append(component1());
        sb.append("\nThread: ");
        sb.append(thread.getName());
        sb.append("\n");
        sb.append(ThrowableUtils.getFullStackTrace(th));
        sb.append("\n");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                sb.append(stringWriter);
                String string = sb.toString();
                L.d("crash-->", string);
                LogFileUtils.crashToFile(string);
                stringWriter.close();
            } finally {
            }
        } catch (IOException e) {
            L.e(copydefault, "saveCrashToFile: " + e.getMessage());
        }
        int i2 = component2 + 35;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 11;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int threadPriority = 4037 - ((Process.getThreadPriority(i4) + 20) >> 6);
                    int iResolveSizeAndState = View.resolveSizeAndState(i4, i4, i4) + 31;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i4) + 19182);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, iResolveSizeAndState, cIndexOf, 1912513118, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7566;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 11;
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i7, tapTimeout, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    int pressedStateDuration = 2459 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iRgb = Color.rgb(i4, i4, i4) + 16777244;
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    byte b4 = (byte) ($$f & 1);
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, iRgb, cKeyCodeFromString, 931716605, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 7567, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i9 = $10 + 89;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static String component1() {
        int i;
        int i2;
        Method method;
        int i3 = 2 % 2;
        try {
            PackageManager packageManager = Utils.getApp().getPackageManager();
            ArrayList arrayList = new ArrayList();
            Class<?> cls = Class.forName("android.content.pm.PackageManager");
            int i4 = 0;
            byte b2 = (byte) 0;
            byte b3 = b2;
            byte b4 = b3;
            int i5 = 1;
            Object[] objArr = new Object[1];
            a(b2, b3, b4, objArr);
            String str = (String) objArr[0];
            Class<?>[] clsArr = {String.class, Integer.TYPE};
            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
            Object[] objArr2 = new Object[1];
            a(b2, b3, b4, objArr2);
            Method[] methodArr = {cls.getMethod(str, clsArr), cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
            if (objCopydefault == null) {
                int scrollBarFadeDuration = 1342 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int defaultSize = 33 - View.getDefaultSize(0, 0);
                char cMyPid = (char) ((Process.myPid() >> 22) + 6425);
                byte b5 = (byte) ($$e & 7);
                byte b6 = (byte) (b5 - 3);
                Object[] objArr3 = new Object[1];
                b(b5, b6, (byte) (b6 + 1), objArr3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, defaultSize, cMyPid, 1443979249, false, (String) objArr3[0], null);
            }
            long j = 0;
            int i6 = 4;
            if (((Field) objCopydefault).get(null) == null) {
                Method[] declaredMethods = ((Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 1342, View.getDefaultSize(0, 0) + 33, (char) (6425 - Color.red(0)))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    Method method2 = declaredMethods[i7];
                    try {
                        char[] cArr = new char[i6];
                        
                        cArr[0] = 64598;
                        cArr[1] = 28521;
                        cArr[2] = 24418;
                        cArr[3] = 49695;
                        char[] cArr2 = new char[i6];
                        
                        cArr2[0] = 53049;
                        cArr2[1] = 45427;
                        cArr2[2] = 30039;
                        cArr2[3] = 1109;
                        Object[] objArr4 = new Object[i5];
                        c((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1, new char[]{26070, 39263, 49978, 29086, 49700, 41770, 35037, 14223, 11204, 32070, 55165, 8348, 20015, 3326, 12907, 52111, 61110, 1372, 15626, 41735, 43919, 57915, 15878, 12836}, cArr, cArr2, objArr4);
                        Class<?> cls3 = Class.forName((String) objArr4[i4]);
                        Object[] objArr5 = new Object[i5];
                        c((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{34430, 41918, 55698, 53835, 13544, 63235, 49656, 37538, 59185, 26483, 41197, 30669}, new char[]{36637, 33325, 4885, 12657}, new char[]{53049, 45427, 30039, 1109}, objArr5);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue();
                        int i8 = component2 + 17;
                        getRequestBeneficiariesState = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr6 = new Object[i5];
                        objArr6[0] = Integer.valueOf(iIntValue);
                        Object[] objArr7 = new Object[i5];
                        c((char) (61219 - View.combineMeasuredStates(0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{13817, 3700, 18376, 31674, 30863, 22970, 43459, 2934, 26020, 52107, 4505, 60573, 45792, 61635, 22312, 20972, 2305, 2860, 40986, 15125, 4848, 6260, 27020, 5586, 12046, 25588}, new char[]{15995, 23046, 9102, 21231}, new char[]{53049, 45427, 30039, 1109}, objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[0]);
                        Method[] methodArr2 = declaredMethods;
                        Object[] objArr8 = new Object[1];
                        c((char) ((Process.getThreadPriority(0) + 20) >> 6), Color.rgb(0, 0, 0) + 16777216, new char[]{11483, 37783, 31036, 3233, 24332, 32421, 1759, 14600}, new char[]{22599, 34625, 2595, 2069}, new char[]{53049, 45427, 30039, 1109}, objArr8);
                        if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            Class cls5 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            c((char) KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getMode(0), new char[]{26070, 39263, 49978, 29086, 49700, 41770, 35037, 14223, 11204, 32070, 55165, 8348, 20015, 3326, 12907, 52111, 61110, 1372, 15626, 41735, 43919, 57915, 15878, 12836}, new char[]{64598, 28521, 24418, 49695}, new char[]{53049, 45427, 30039, 1109}, objArr9);
                            Class<?> cls6 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            c((char) (1931 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1277964047, new char[]{56010, 19752, 14503, 62198, 50027, 54682, 6260, 20587, 41340, 42998, 34775, 20805, 23096}, new char[]{61736, 54224, 35763, 61191}, new char[]{53049, 45427, 30039, 1109}, objArr10);
                            if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                Object[] objArr11 = new Object[1];
                                c((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{26070, 39263, 49978, 29086, 49700, 41770, 35037, 14223, 11204, 32070, 55165, 8348, 20015, 3326, 12907, 52111, 61110, 1372, 15626, 41735, 43919, 57915, 15878, 12836}, new char[]{64598, 28521, 24418, 49695}, new char[]{53049, 45427, 30039, 1109}, objArr11);
                                Class<?> cls7 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                c((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49913), (-245613209) - TextUtils.indexOf("", ""), new char[]{3522, 12607, 24801, 17365, 1194, 42511, 34771, 10005, 9428, 4527, 1171, 22134, 38008, 17320, 33428, 34371, 49856}, new char[]{26580, 23613, 63729, 43202}, new char[]{53049, 45427, 30039, 1109}, objArr12);
                                Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method2, null);
                                if (objArr13.length == 2) {
                                    int i10 = component2 + 107;
                                    getRequestBeneficiariesState = i10 % 128;
                                    int i11 = i10 % 2;
                                    if (Long.TYPE.equals(objArr13[0])) {
                                        Object[] objArr14 = new Object[1];
                                        c((char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionType(0L), new char[]{26070, 39263, 49978, 29086, 49700, 41770, 35037, 14223, 11204, 32070, 55165, 8348, 20015, 3326, 12907, 52111, 61110, 1372, 15626, 41735, 43919, 57915, 15878, 12836}, new char[]{64598, 28521, 24418, 49695}, new char[]{53049, 45427, 30039, 1109}, objArr14);
                                        if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                            int i12 = component2 + 1;
                                            getRequestBeneficiariesState = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
                                                if (objCopydefault2 == null) {
                                                    int iRed = Color.red(0) + 1342;
                                                    int iRed2 = Color.red(0) + 33;
                                                    char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 6425);
                                                    byte b7 = (byte) ($$e & 7);
                                                    byte b8 = (byte) (b7 - 3);
                                                    Object[] objArr15 = new Object[1];
                                                    b(b7, b8, (byte) (b8 + 1), objArr15);
                                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iRed, iRed2, defaultSize2, 1443979249, false, (String) objArr15[0], null);
                                                }
                                                ((Field) objCopydefault2).set(null, method2);
                                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
                                                if (objCopydefault3 == null) {
                                                    int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1341;
                                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                                                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 6425);
                                                    byte b9 = (byte) ($$e & 7);
                                                    byte b10 = (byte) (b9 - 3);
                                                    Object[] objArr16 = new Object[1];
                                                    b(b9, b10, (byte) (b10 + 1), objArr16);
                                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i13, iMakeMeasureSpec, cIndexOf, 1443979249, false, (String) objArr16[0], null);
                                                }
                                                try {
                                                    Object[] objArr17 = {0L, ((Field) objCopydefault3).get(null)};
                                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(812318566);
                                                    if (objCopydefault4 == null) {
                                                        int iRed3 = Color.red(0) + 1342;
                                                        int iAxisFromString = 32 - MotionEvent.axisFromString("");
                                                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6424);
                                                        byte b11 = (byte) (b2 + 1);
                                                        Object[] objArr18 = new Object[1];
                                                        b(b2, b11, (byte) (b11 - 1), objArr18);
                                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRed3, iAxisFromString, c2, -181198845, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objCopydefault4).invoke(null, objArr17)).longValue();
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
                                                if (objCopydefault5 == null) {
                                                    int maximumFlingVelocity = 1342 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int iRed4 = 33 - Color.red(0);
                                                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 6425);
                                                    byte b12 = (byte) ($$e & 7);
                                                    byte b13 = (byte) (b12 - 3);
                                                    Object[] objArr19 = new Object[1];
                                                    b(b12, b13, (byte) (b13 + 1), objArr19);
                                                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, iRed4, longPressTimeout, 1443979249, false, (String) objArr19[0], null);
                                                }
                                                ((Field) objCopydefault5).set(null, method2);
                                                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
                                                if (objCopydefault6 == null) {
                                                    int longPressTimeout2 = 1342 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                    int deadChar = 33 - KeyEvent.getDeadChar(0, 0);
                                                    char cIndexOf2 = (char) (6424 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                                    byte b14 = (byte) ($$e & 7);
                                                    byte b15 = (byte) (b14 - 3);
                                                    Object[] objArr20 = new Object[1];
                                                    b(b14, b15, (byte) (b15 + 1), objArr20);
                                                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout2, deadChar, cIndexOf2, 1443979249, false, (String) objArr20[0], null);
                                                }
                                                try {
                                                    Object[] objArr21 = {0L, ((Field) objCopydefault6).get(null)};
                                                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(812318566);
                                                    if (objCopydefault7 == null) {
                                                        int packedPositionType = 1342 - ExpandableListView.getPackedPositionType(0L);
                                                        int i14 = 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                        char cMyPid2 = (char) ((Process.myPid() >> 22) + 6425);
                                                        byte b16 = (byte) (b2 + 1);
                                                        Object[] objArr22 = new Object[1];
                                                        b(b2, b16, (byte) (b16 - 1), objArr22);
                                                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, i14, cMyPid2, -181198845, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objCopydefault7).invoke(null, objArr21)).longValue();
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i7++;
                        declaredMethods = methodArr2;
                        i4 = 0;
                        i5 = 1;
                        j = 0;
                        i6 = 4;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
            }
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
            if (objCopydefault8 == null) {
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1342;
                int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6424);
                byte b17 = (byte) ($$e & 7);
                byte b18 = (byte) (b17 - 3);
                Object[] objArr23 = new Object[1];
                b(b17, b18, (byte) (b18 + 1), objArr23);
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, iLastIndexOf, c3, 1443979249, false, (String) objArr23[0], null);
            }
            try {
                Object[] objArr24 = {((Field) objCopydefault8).get(null)};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(778775472);
                if (objCopydefault9 == null) {
                    int iResolveSize = 1342 - View.resolveSize(0, 0);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
                    char packedPositionGroup = (char) (6425 - ExpandableListView.getPackedPositionGroup(0L));
                    byte b19 = (byte) (b2 + 1);
                    Object[] objArr25 = new Object[1];
                    b(b2, b19, (byte) (b19 + 1), objArr25);
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iIndexOf, packedPositionGroup, -348982059, false, (String) objArr25[0], new Class[]{Object.class});
                }
                ((Method) objCopydefault9).invoke(null, objArr24);
                try {
                    Object[] objArr26 = {0, methodArr, null};
                    Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(468157002);
                    if (objCopydefault10 == null) {
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1138;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 39;
                        char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        byte b20 = (byte) ($$e & 5);
                        byte b21 = b20;
                        Object[] objArr27 = new Object[1];
                        b(b20, b21, b21, objArr27);
                        objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iLastIndexOf2, packedPositionGroup2, -557949649, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                    }
                    long jLongValue = ((Long) ((Method) objCopydefault10).invoke(null, objArr26)).longValue();
                    long j2 = -770558502;
                    long j3 = -1;
                    long j4 = j2 ^ j3;
                    long jMaxMemory = (((long) ((int) Runtime.getRuntime().maxMemory())) | jLongValue) ^ j3;
                    long j5 = (((long) (-109)) * j2) + (((long) 111) * jLongValue) + (((long) (-220)) * (j4 | jMaxMemory)) + (((long) 220) * (((j2 | jLongValue) ^ j3) | jMaxMemory)) + (((long) 110) * ((((jLongValue ^ j3) | j2) ^ j3) | ((j4 | jLongValue) ^ j3))) + ((long) 1204907992);
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i15 = ((int) (j5 >> 32)) & ((((~(459756040 | elapsedCpuTime)) | (-2071459772)) * (-566)) + 1517067266 + ((~(elapsedCpuTime | (-1611703732))) * 566));
                    int i16 = (int) j5;
                    int i17 = (int) Runtime.getRuntime().totalMemory();
                    int i18 = (~((-1188137908) | (~i17))) | 1115687586;
                    int i19 = ~(i17 | 1742053299);
                    int i20 = i >>> 24;
                    int i21 = i & 16777215;
                    boolean z = i20 != 0;
                    if (!z) {
                        i = 2;
                        i2 = 0;
                    } else {
                        int i22 = getRequestBeneficiariesState + 1;
                        component2 = i22 % 128;
                        i = 2;
                        int i23 = i22 % 2;
                        i2 = 1;
                    }
                    arrayList.add((!z || i21 >= i || (method = methodArr[i21]) == null) ? null : method.toString());
                    int i24 = (i20 + 6) * i2;
                    if (i24 == 0) {
                        return packageManager.getPackageInfo(Utils.getApp().getPackageName(), 0).versionName;
                    }
                    long j6 = -1;
                    long j7 = 0;
                    long j8 = (((long) i24) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)))) | (((long) 1) << 32) | (j7 - ((j7 >> 63) << 32));
                    try {
                        Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault11 == null) {
                            objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault11).invoke(null, null);
                        try {
                            Object[] objArr28 = {-113639624, Long.valueOf(j8), arrayList, null, false, false};
                            Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault12 == null) {
                                objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6562, 56 - Gravity.getAbsoluteGravity(0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault12).invoke(objInvoke, objArr28);
                            throw new RuntimeException(String.valueOf(0));
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                } catch (Throwable th6) {
                    Throwable cause6 = th6.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                Throwable cause7 = th7.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th7;
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "undefined version name";
        }
    }
}
