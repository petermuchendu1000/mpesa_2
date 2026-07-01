package com.huawei.digitalpayment.pwa.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules;
import dagger.internal.Factory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class PwaViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static final byte[] $$c = {35, -11, -97, -73};
    private static final int $$d = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {104, -2, Ascii.CAN, -74, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 207;
    private static int component1 = 0;
    private static int component2 = 1;
    private static char[] ShareDataUIState = {3095, 25040, 55170, 17756, 47929, 10487, 40610, 3104, 25177, 53261, 17800, 48061, 10607, 40749, 3314, 25259, 53403, 18045, 46090, 10689, 40885, 3445, 3091, 25042, 55175, 17758, 47909, 10491, 40610, 3164, 25171, 53279, 17866, 48026, 10623, 40755, 3299, 3100, 25055, 55184, 17743, 47992, 10482, 40615, 3168, 25169, 53328, 17909, 48023, 10597, 40746, 3299, 25251, 31832, 4509, 42948, 13575, 52069, 22704, 61173, 31792, 4665, 41048, 13714, 52161, 22802, 61302, 31909, 4844};
    private static long component3 = 4956715606490833342L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules_KeyModule_ProvideFactory.$$c
            int r6 = r6 + 117
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules_KeyModule_ProvideFactory.$$e(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules_KeyModule_ProvideFactory.$$a
            int r8 = r8 * 3
            int r8 = 10 - r8
            int r9 = r9 * 3
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = 99 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r3
            r3 = r7
            r7 = r6
        L2e:
            int r9 = r9 + r7
            int r9 = r9 + (-26)
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules_KeyModule_ProvideFactory.b(short, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public Object get() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 35;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    static final class component1 {
        static final PwaViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new PwaViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int copydefault;

        private component1() {
        }

        static {
            int i = component2 + 105;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 59;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i) {
            int i6 = $11 + 33;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i2 + i8])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1758;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34;
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte length = (byte) $$c.length;
                    byte b2 = (byte) (length - 4);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, doubleTapTimeout, pressedStateDuration, 1159210934, false, $$e(length, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(component3), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 3608, TextUtils.indexOf("", "", 0) + 29, (char) (7171 - TextUtils.indexOf("", "", 0)), 1951385784, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4012;
                            int absoluteGravity = 24 - Gravity.getAbsoluteGravity(0, 0);
                            char cIndexOf = (char) (27760 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            byte b5 = (byte) ($$d & 15);
                            byte b6 = (byte) (b5 - 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i9, absoluteGravity, cIndexOf, -1529629956, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
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
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i10 = $10 + 71;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                try {
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        int defaultSize = View.getDefaultSize(0, 0) + 4013;
                        int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24;
                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27760);
                        byte b7 = (byte) ($$d & 15);
                        byte b8 = (byte) (b7 - 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, i11, c3, -1529629956, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    int i12 = 24 / 0;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    int iMyPid = (Process.myPid() >> 22) + 4013;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 25;
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 27762);
                    byte b9 = (byte) ($$d & 15);
                    byte b10 = (byte) (b9 - 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, iIndexOf, cIndexOf2, -1529629956, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override
    public Boolean get() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        int i4 = 0;
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 66, 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (19696 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 520092524, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 22, View.resolveSizeAndState(0, 0, 0), (char) ((-1) - MotionEvent.axisFromString("")), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(15 - Color.alpha(0), Color.blue(0) + 22, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = j ^ 994548984081925399L;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j;
        long j3 = 933;
        long j4 = (((long) 934) * 3461174112524584926L) + (((long) (-932)) * 994548984081925399L) + (((long) (-933)) * (j2 | (((j ^ 3461174112524584926L) | jIdentityHashCode) ^ j))) + ((((j2 | jIdentityHashCode) ^ j) | ((j2 | 3461174112524584926L) ^ j)) * j3) + (j3 * (j ^ 4453461401007015903L));
        int i6 = 0;
        while (true) {
            int i7 = 8;
            if (i6 == 10) {
                int i8 = i4;
                Object[] objArr3 = new Object[1];
                a(Color.blue(i8) + 16, 37 - TextUtils.indexOf("", ""), (char) ExpandableListView.getPackedPositionType(0L), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[i8]);
                Object[] objArr4 = new Object[1];
                a(KeyEvent.keyCodeFromString("") + 16, 53 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28743), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-761837745};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1663 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -978089085, ((Constructor) objCopydefault2).newInstance(objArr5), false};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1454 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1591, Color.rgb(0, 0, 0) + 16777255, (char) Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault3).invoke(null, objArr6);
                    int i9 = ((int[]) objArr8[2])[0];
                    int i10 = ((int[]) objArr8[1])[0];
                    if (i10 != i9) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i11 = 0;
                            while (i11 < strArr.length) {
                                int i12 = component2 + 37;
                                component1 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    arrayList.add(strArr[i11]);
                                    i11 += 74;
                                } else {
                                    arrayList.add(strArr[i11]);
                                    i11++;
                                }
                            }
                        }
                        long j5 = -1;
                        long j6 = 0;
                        long j7 = (((j5 - ((j5 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i10 ^ i9))) | (j6 - ((j6 >> 63) << 32)) | (((long) 1) << 32);
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (Process.myPid() >> 22) + 42, (char) (AndroidCharacter.getMirror('0') - '0'), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault4).invoke(null, null);
                        Object[] objArr9 = {-761837745, Long.valueOf(j7), arrayList, null, false, false};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 56, (char) KeyEvent.keyCodeFromString(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault5).invoke(objInvoke, objArr9);
                        int[] iArr = new int[i10];
                        int i13 = i10 - 1;
                        iArr[i13] = 1;
                        Toast.makeText((Context) null, iArr[((i10 * i13) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int i14 = component1 + 97;
                component2 = i14 % 128;
                int i15 = i14 % 2;
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 37, (-16777186) - Color.rgb(i4, i4, i4), (char) View.MeasureSpec.makeMeasureSpec(i4, i4), 846241313, false, "copydefault", null);
                }
                int i16 = ((Field) objCopydefault6).getInt(null);
                int i17 = i4;
                long j8 = jLongValue;
                while (true) {
                    int i18 = i4;
                    while (i18 != i7) {
                        int i19 = component1;
                        int i20 = i19 + 63;
                        component2 = i20 % 128;
                        int i21 = i20 % 2;
                        i16 = (((((int) (j8 >> i18)) & 255) + (i16 << 6)) + (i16 << 16)) - i16;
                        i18++;
                        int i22 = i19 + 33;
                        component2 = i22 % 128;
                        int i23 = i22 % 2;
                        i7 = 8;
                    }
                    if (i17 != 0) {
                        break;
                    }
                    i17++;
                    j8 = j4;
                    i4 = 0;
                    i7 = 8;
                }
                if (i16 == i5) {
                    break;
                }
                int i24 = component1 + 97;
                component2 = i24 % 128;
                int i25 = i24 % 2;
                jLongValue -= 1024;
                i6++;
                i4 = 0;
            }
        }
        return Boolean.valueOf(provide());
    }

    public static PwaViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            PwaViewModel_HiltModules_KeyModule_ProvideFactory pwaViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PwaViewModel_HiltModules_KeyModule_ProvideFactory pwaViewModel_HiltModules_KeyModule_ProvideFactory2 = component1.ShareDataUIState;
        int i3 = component1 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return pwaViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PwaViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 61;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return zProvide;
    }
}
