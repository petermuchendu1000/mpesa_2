package com.huawei.digitalpayment.consumer.loginModule.init;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.common.base.Ascii;
import com.google.gson.JsonObject;
import com.huawei.common.module.UserLifecycle;
import com.huawei.digitalpayment.consumer.loginModule.util.LoginUtils;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public class LoginUserLifecycle implements UserLifecycle {
    private static final byte[] $$c = {1, -128, 109, -128};
    private static final int $$f = 138;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {101, 74, 115, 66, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 103;
    private static final byte[] $$a = {Ascii.ETB, 124, -70, -17, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, 8, Ascii.EM, -33, 47, Ascii.SI, Ascii.VT, -9, Ascii.ETB, -1, Ascii.FF};
    private static final int $$b = 113;
    private static int component3 = 0;
    private static int component1 = 1;
    private static char[] component2 = {12824, 2038, 2036, 2024, 2034, 2031, 12819, 2021, 2022, 2023, 2030, 12816, 1998, 12825, 1997, 2032, 2035, 2004, 2028, 2017, 12827, 1966, 12830, 2025, 2041, 12829, 2002, 2037, 2020, 12828, 12818, 2019, 12831, 2029, 2000, 2026};
    private static char ShareDataUIState = 12828;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$c
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 119
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$g(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 8
            int r6 = 19 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$a
            int r7 = r7 * 18
            int r7 = 22 - r7
            int r8 = r8 * 3
            int r8 = 106 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$d
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2d
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r6
            int r6 = r3 + (-27)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.b(int, byte, short, java.lang.Object[]):void");
    }

    @Override
    public void onAfterLogin(Context context, final String str, boolean z) {
        int i = 2 % 2;
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>(this) {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public Object doInBackground() throws Throwable {
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    component3();
                    throw null;
                }
                Void voidComponent3 = component3();
                int i4 = component1 + 5;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return voidComponent3;
                }
                throw null;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1((Void) obj);
                int i5 = component3 + 79;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public Void component3() throws Throwable {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                LoginUtils.saveIdentityId((JsonObject) GsonUtils.fromJson(str, JsonObject.class));
                int i5 = component1 + 49;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }

            public void component1(Void r3) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginUtils.removeRecentIdentityId();
        int i4 = component3 + 87;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    private static void c(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        Object obj2 = null;
        int i5 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getScrollBarSize() >> i5), 15 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (64291 - TextUtils.getTrimmedLength("")), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i5 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 7422, View.MeasureSpec.getSize(0) + 15, (char) (64290 - ImageFormat.getBitsPerPixel(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i7 = $10 + 117;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i9 = $11 + 99;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[6] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[i3] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int trimmedLength = 7117 - TextUtils.getTrimmedLength("");
                        int i11 = 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, i11, c2, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[i3] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2944;
                            int i12 = 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            char cRgb = (char) ((-16749579) - Color.rgb(0, 0, 0));
                            byte b3 = $$c[0];
                            byte b4 = (byte) (b3 - 1);
                            byte b5 = (byte) (-b3);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, i12, cRgb, 794909189, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i14];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                        } else {
                            int i16 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i16];
                            cArr4[cancelall.component2 + 1] = cArr2[i17];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                i3 = 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            int i19 = $11 + 115;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? 15284 : 9999;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0a41, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0a42, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0a46, code lost:
    
        if (r1 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0a48, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0a49, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x06c6, code lost:
    
        r0 = com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.component3;
        r2 = ((r0 | 61) << 1) - (r0 ^ 61);
        com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.component1 = r2 % 128;
        r2 = r2 % 2;
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x06db, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x06dd, code lost:
    
        r3 = 1341 - android.text.TextUtils.lastIndexOf("", '0', 0, 0);
        r27 = 32 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
        r0 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 6424);
        r2 = (byte) (com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$e & 1);
        r5 = (byte) (r2 + 2);
        r7 = new java.lang.Object[1];
        b(r2, r5, (byte) (r5 - 4), r7);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r3, r27, r0, 1443979249, false, (java.lang.String) r7[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x071f, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r15);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x072c, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x072e, code lost:
    
        r3 = 1342 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r4 = (android.os.Process.myTid() >> 22) + 33;
        r5 = (char) (6425 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
        r0 = (byte) (com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$e & 1);
        r8 = (byte) (r0 + 2);
        r11 = new java.lang.Object[1];
        b(r0, r8, (byte) (r8 - 4), r11);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r3, r4, r5, 1443979249, false, (java.lang.String) r11[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x076e, code lost:
    
        r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0783, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0785, code lost:
    
        r0 = 1342 - android.view.View.getDefaultSize(0, 0);
        r27 = 32 - android.view.MotionEvent.axisFromString("");
        r2 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 6426);
        r4 = (byte) (com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.$$e & 10);
        r5 = (byte) (r4 - 2);
        r8 = new java.lang.Object[1];
        b(r4, r5, (byte) (r5 | 8), r8);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r27, r2, -181198845, false, (java.lang.String) r8[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x07cd, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x07d9, code lost:
    
        r0 = com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.component1;
        r2 = (r0 ^ 89) + ((r0 & 89) << 1);
        r0 = r2 % 128;
        com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.component3 = r0;
        r2 = r2 % 2;
        r2 = (r0 & 97) + (r0 | 97);
        com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.component1 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x09f5 A[PHI: r0 r2
  0x09f5: PHI (r0v25 int) = (r0v24 int), (r0v39 int) binds: [B:101:0x09f3, B:98:0x09e8] A[DONT_GENERATE, DONT_INLINE]
  0x09f5: PHI (r2v36 int) = (r2v35 int), (r2v41 int) binds: [B:101:0x09f3, B:98:0x09e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x09f7 A[PHI: r0 r2
  0x09f7: PHI (r0v37 int) = (r0v24 int), (r0v39 int) binds: [B:101:0x09f3, B:98:0x09e8] A[DONT_GENERATE, DONT_INLINE]
  0x09f7: PHI (r2v38 int) = (r2v35 int), (r2v41 int) binds: [B:101:0x09f3, B:98:0x09e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x063f A[PHI: r3
  0x063f: PHI (r3v128 int) = (r3v127 int), (r3v141 int) binds: [B:60:0x063d, B:57:0x0630] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x07f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int ShareDataUIState(java.util.List r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.init.LoginUserLifecycle.ShareDataUIState(java.util.List):int");
    }
}
