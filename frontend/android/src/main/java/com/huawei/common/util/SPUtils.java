package com.huawei.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class SPUtils {
    private static final Map<String, SPUtils> component1;
    private static char[] component3 = null;
    private static final String copydefault = "config_object";
    private static int getAsAtTimestamp;
    private SharedPreferences component2;
    private static final byte[] $$c = {87, -2, Ascii.VT, -41};
    private static final int $$f = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -58, 7, 71, Ascii.SO, 0, -61, 60, Ascii.SI, -18, Ascii.CAN, -16, 6, -57, 60, 7, 8, -67, 58, Ascii.SO, -15, Ascii.SO, -6, 20, -6, 5, -5, -59, 66, -7, 17, 5, -6, 5, -5, -59, 59, 13, 3, -67, 57, -53, TarHeader.LF_FIFO, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -64};
    private static final int $$e = 90;
    private static final byte[] $$a = {111, -17, Ascii.VT, -125, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -31, -7, -38, -34};
    private static final int $$b = 154;
    private static int getRequestBeneficiariesState = 0;
    private static int copy = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r7 = 115 - r7
            byte[] r0 = com.huawei.common.util.SPUtils.$$c
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.SPUtils.$$g(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.common.util.SPUtils.$$a
            int r6 = r6 * 4
            int r1 = r6 + 6
            int r8 = r8 * 2
            int r8 = 101 - r8
            int r7 = r7 * 9
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 5
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r7 = r7 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-27)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.SPUtils.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 30
            int r0 = 40 - r6
            int r8 = r8 * 4
            int r8 = r8 + 99
            int r7 = r7 * 39
            int r7 = 42 - r7
            byte[] r1 = com.huawei.common.util.SPUtils.$$d
            byte[] r0 = new byte[r0]
            int r6 = 39 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.SPUtils.c(byte, short, int, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 1;
        component2();
        component1 = new HashMap();
        int i = ShareDataUIState + 63;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    public static SPUtils getInstance() {
        int i = 2 % 2;
        int i2 = copy + 81;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SPUtils sPUtils = getInstance(Utils.getApp(), "");
        int i4 = copy + 99;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return sPUtils;
    }

    public static SPUtils getInstance(Context context) {
        int i = 2 % 2;
        int i2 = copy + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SPUtils sPUtils = getInstance(context, "");
        int i4 = getRequestBeneficiariesState + 67;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return sPUtils;
    }

    public static SPUtils getInstance(String str) {
        int i = 2 % 2;
        int i2 = copy + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SPUtils sPUtils = getInstance(Utils.getApp(), str);
        int i4 = copy + 111;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return sPUtils;
        }
        throw null;
    }

    public static SPUtils getInstance(Context context, String str) {
        if (component2(str)) {
            str = "consumerApp";
        }
        Map<String, SPUtils> map = component1;
        SPUtils sPUtils = map.get(str);
        if (sPUtils == null) {
            synchronized (SPUtils.class) {
                sPUtils = map.get(str);
                if (sPUtils == null) {
                    sPUtils = new SPUtils(context, str);
                    map.put(str, sPUtils);
                }
            }
        }
        return sPUtils;
    }

    private SPUtils(Context context, String str) {
        this.component2 = context.getSharedPreferences(str, 0);
    }

    public void put(String str, String str2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        put(str, str2, false);
        int i4 = copy + 79;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void put(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            int i4 = i3 + 23;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            this.component2.edit().putString(str, str2).commit();
            return;
        }
        this.component2.edit().putString(str, str2).apply();
    }

    public String getString(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(str, "");
        int i4 = getRequestBeneficiariesState + 81;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public String getString(String str, String str2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String string = this.component2.getString(str, str2);
        int i4 = getRequestBeneficiariesState + 101;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public void put(String str, int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 103;
        copy = i3 % 128;
        int i4 = i3 % 2;
        put(str, i, false);
        int i5 = copy + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r3.component2.edit().putInt(r4, r5).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r6 != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        r3.component2.edit().putInt(r4, r5).apply();
        r4 = com.huawei.common.util.SPUtils.getRequestBeneficiariesState + 115;
        com.huawei.common.util.SPUtils.copy = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void put(java.lang.String r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.common.util.SPUtils.copy
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.common.util.SPUtils.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 9
            int r1 = r1 / 0
            if (r6 == 0) goto L18
            goto L2f
        L15:
            r1 = 1
            if (r6 == r1) goto L2f
        L18:
            android.content.SharedPreferences r6 = r3.component2
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r4 = r6.putInt(r4, r5)
            r4.apply()
            int r4 = com.huawei.common.util.SPUtils.getRequestBeneficiariesState
            int r4 = r4 + 115
            int r5 = r4 % 128
            com.huawei.common.util.SPUtils.copy = r5
            int r4 = r4 % r0
            goto L3c
        L2f:
            android.content.SharedPreferences r6 = r3.component2
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r4 = r6.putInt(r4, r5)
            r4.commit()
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.SPUtils.put(java.lang.String, int, boolean):void");
    }

    public void putSecrete(String str, String str2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        put(component1(str), component1(str2), false);
        int i4 = copy + 69;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    public String getSecrete(String str) {
        int i = 2 % 2;
        String str2 = new String(EncodeUtils.base64Decode(getString(component1(str))), StandardCharsets.UTF_8);
        int i2 = getRequestBeneficiariesState + 27;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return str2;
    }

    private static String component1(String str) {
        int i = 2 % 2;
        String str2 = new String(EncodeUtils.base64Encode(str), StandardCharsets.UTF_8);
        int i2 = getRequestBeneficiariesState + 95;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void removeSecrete(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        copy = i2 % 128;
        int i3 = i2 % 2;
        remove(component1(str), false);
        int i4 = copy + 45;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getInt(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return getInt(str, -1);
        }
        getInt(str, -1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 101;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component2.getInt(str, i);
        int i6 = copy + 97;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public void put(String str, long j) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        copy = i2 % 128;
        put(str, j, i2 % 2 == 0);
        int i3 = getRequestBeneficiariesState + 77;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void b(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        byte b2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component3;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - Color.blue(0), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 14, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i7 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        int iMyPid = (Process.myPid() >> 22) + 4502;
                        int gidForName = Process.getGidForName("") + 37;
                        char tapTimeout = (char) (27897 - (ViewConfiguration.getTapTimeout() >> 16));
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 5);
                        String str$$g = $$g(b3, b4, (byte) (b4 - 5));
                        Class[] clsArr = new Class[2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[b2] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, gidForName, tapTimeout, -1464227204, false, str$$g, clsArr);
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i8 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (Process.myTid() >> 22), 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1180380354, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getWindowTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 35, (char) (Process.getGidForName("") + 1), 80302927, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i9 = $10 + 89;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                System.arraycopy(cArr5, 0, cArr3, i3 % i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i3 - i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i10 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i10, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i10);
            }
        }
        if (z) {
            int i11 = $10 + 31;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr7 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i13 = $11 + 59;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 / 5;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public void put(String str, long j, boolean z) {
        int i = 2 % 2;
        if (!z) {
            this.component2.edit().putLong(str, j).apply();
            return;
        }
        int i2 = getRequestBeneficiariesState + 27;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.edit().putLong(str, j).commit();
            int i3 = getRequestBeneficiariesState + 3;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.component2.edit().putLong(str, j).commit();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getLong(java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.SPUtils.getLong(java.lang.String):long");
    }

    public long getLong(String str, long j) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            this.component2.getLong(str, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.component2.getLong(str, j);
        int i3 = getRequestBeneficiariesState + 37;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return j2;
    }

    public void put(String str, float f) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        put(str, f, false);
        int i4 = copy + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void put(String str, float f, boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!z) {
            this.component2.edit().putFloat(str, f).apply();
        } else {
            this.component2.edit().putFloat(str, f).commit();
        }
        int i4 = getRequestBeneficiariesState + 89;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public float getFloat(String str) {
        int i = 2 % 2;
        int i2 = copy + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        float f = getFloat(str, -1.0f);
        int i4 = copy + 99;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public float getFloat(String str, float f) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
        float f2 = this.component2.getFloat(str, f);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return f2;
    }

    public void put(String str, boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        put(str, z, false);
        int i4 = getRequestBeneficiariesState + 61;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void put(String str, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        if (!z2) {
            this.component2.edit().putBoolean(str, z).apply();
            return;
        }
        int i5 = i3 + 69;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        this.component2.edit().putBoolean(str, z).commit();
        int i7 = copy + 87;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean getBoolean(String str) {
        int i = 2 % 2;
        int i2 = copy + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = getBoolean(str, false);
        int i4 = getRequestBeneficiariesState + 119;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return z;
    }

    public boolean getBoolean(String str, boolean z) {
        int i = 2 % 2;
        int i2 = copy + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = this.component2;
        if (i3 == 0) {
            return sharedPreferences.getBoolean(str, z);
        }
        sharedPreferences.getBoolean(str, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void put(String str, Set<String> set) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        copy = i2 % 128;
        put(str, set, i2 % 2 == 0);
    }

    public void put(String str, Set<String> set, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = getRequestBeneficiariesState + 117;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                this.component2.edit().putStringSet(str, set).commit();
                throw null;
            }
            this.component2.edit().putStringSet(str, set).commit();
        } else {
            this.component2.edit().putStringSet(str, set).apply();
        }
        int i3 = copy + 57;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    public Set<String> getStringSet(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Set<String> stringSet = getStringSet(str, Collections.emptySet());
        int i4 = getRequestBeneficiariesState + 95;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return stringSet;
        }
        throw null;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Set<String> stringSet = this.component2.getStringSet(str, set);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return stringSet;
    }

    public Map<String, ?> getAll() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, ?> all = this.component2.getAll();
        int i4 = copy + 51;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return all;
    }

    public boolean contains(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = this.component2;
        if (i3 != 0) {
            return sharedPreferences.contains(str);
        }
        sharedPreferences.contains(str);
        throw null;
    }

    public void remove(String str) {
        int i = 2 % 2;
        int i2 = copy + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        remove(str, false);
        int i4 = getRequestBeneficiariesState + 115;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r3.component2.edit().remove(r4).commit();
        r4 = com.huawei.common.util.SPUtils.copy + 1;
        com.huawei.common.util.SPUtils.getRequestBeneficiariesState = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((!r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r3.component2.edit().remove(r4).apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.common.util.SPUtils.getRequestBeneficiariesState
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.huawei.common.util.SPUtils.copy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 51
            int r1 = r1 / 0
            if (r5 == 0) goto L19
            goto L27
        L15:
            r5 = r5 ^ 1
            if (r5 == 0) goto L27
        L19:
            android.content.SharedPreferences r5 = r3.component2
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.SharedPreferences$Editor r4 = r5.remove(r4)
            r4.apply()
            goto L3d
        L27:
            android.content.SharedPreferences r5 = r3.component2
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.SharedPreferences$Editor r4 = r5.remove(r4)
            r4.commit()
            int r4 = com.huawei.common.util.SPUtils.copy
            int r4 = r4 + 1
            int r5 = r4 % 128
            com.huawei.common.util.SPUtils.getRequestBeneficiariesState = r5
            int r4 = r4 % r0
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.SPUtils.remove(java.lang.String, boolean):void");
    }

    public void clear() {
        int i = 2 % 2;
        int i2 = copy + 89;
        getRequestBeneficiariesState = i2 % 128;
        clear(i2 % 2 != 0);
    }

    public void clear(boolean z) {
        int i;
        int i2 = 2 % 2;
        if (!(!z)) {
            this.component2.edit().clear().commit();
            i = copy + 47;
        } else {
            this.component2.edit().clear().apply();
            i = copy + 117;
        }
        getRequestBeneficiariesState = i % 128;
        int i3 = i % 2;
    }

    private static boolean component2(String str) {
        int i = 2 % 2;
        int i2 = copy + 103;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = getRequestBeneficiariesState + 79;
            copy = i5 % 128;
            int i6 = i5 % 2;
            if (!Character.isWhitespace(str.charAt(i4))) {
                int i7 = copy + 1;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }

    public <T> T getObject(String str, Class<T> cls) {
        int i = 2 % 2;
        int i2 = copy + 19;
        getRequestBeneficiariesState = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return (T) GsonUtils.fromJson(getInstance().getString(str), (Class) cls);
            }
            GsonUtils.fromJson(getInstance().getString(str), (Class) cls);
            throw null;
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public <T> T getObject(String str, Type type) {
        T t;
        int i = 2 % 2;
        int i2 = copy + 73;
        getRequestBeneficiariesState = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                t = (T) GsonUtils.fromJson(getInstance().getString(str), type);
                int i3 = 75 / 0;
            } else {
                t = (T) GsonUtils.fromJson(getInstance().getString(str), type);
            }
            return t;
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public void saveObject(String str, Object obj) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        getInstance().put(str, GsonUtils.toJson(obj));
        int i4 = getRequestBeneficiariesState + 11;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public boolean setObjectToShare(String str, Object obj) {
        int i = 2 % 2;
        int i2 = copy + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorEdit = Utils.getApp().getSharedPreferences(copydefault, 0).edit();
        if (obj == null) {
            editorEdit.remove(str);
            boolean zCommit = editorEdit.commit();
            int i4 = copy + 97;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                return zCommit;
            }
            throw null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    editorEdit.putString(str, new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0), StandardCharsets.UTF_8));
                    boolean zCommit2 = editorEdit.commit();
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    return zCommit2;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public Object getObjectFromShare(String str) throws Throwable {
        char c2;
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        ObjectInputStream objectInputStream2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getTouchSlop() >> 8), 33 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (View.MeasureSpec.getMode(0) + 19696), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 37, TextUtils.indexOf((CharSequence) "", '0') + 31, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 30, (char) ((-16777216) - Color.rgb(0, 0, 0)), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long jIdentityHashCode = System.identityHashCode(this);
        long j2 = 859;
        long j3 = -1;
        long j4 = jIdentityHashCode ^ j3;
        long j5 = j3 ^ (-2378371617518832320L);
        long j6 = (((long) 860) * 3171075071163036744L) + (((long) (-858)) * (-2378371617518832320L)) + (((long) (-859)) * (jIdentityHashCode | 3171075071163036744L)) + ((((j4 | 3171075071163036744L) ^ j3) | ((((j3 ^ 3171075071163036744L) | j5) | jIdentityHashCode) ^ j3)) * j2) + (j2 * (((j5 | j4) ^ j3) | (j3 ^ (j5 | 3171075071163036744L))));
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                int i7 = copy + 63;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                i4 = (((((int) (j >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            int i9 = getRequestBeneficiariesState + 95;
            copy = i9 % 128;
            i5 = i9 % 2 == 0 ? i5 + 117 : i5 + 1;
            j = j6;
        }
        if (i4 != i2) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(66 - ExpandableListView.getPackedPositionChild(0L), 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j7 = -1;
            long j8 = ((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)));
            long j9 = 0;
            long j10 = j8 | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 6619, 42 - KeyEvent.getDeadChar(0, 0), (char) TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {8057397, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 56, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            String string = Utils.getApp().getSharedPreferences(copydefault, 0).getString(str, "");
            if (string != null && !string.equals("")) {
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(Base64.decode(string.getBytes(StandardCharsets.UTF_8), 0));
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream3);
                } catch (Exception e) {
                    e = e;
                    byteArrayInputStream2 = byteArrayInputStream3;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream3;
                    c2 = 0;
                    objectInputStream2 = null;
                    Closeable[] closeableArr = new Closeable[1];
                    closeableArr[c2] = byteArrayInputStream;
                    CloseUtils.closeIO(closeableArr);
                    Closeable[] closeableArr2 = new Closeable[1];
                    closeableArr2[c2] = objectInputStream2;
                    CloseUtils.closeIO(closeableArr2);
                    throw th;
                }
                try {
                    Object object = objectInputStream.readObject();
                    byteArrayInputStream3.close();
                    objectInputStream.close();
                    CloseUtils.closeIO(byteArrayInputStream3);
                    CloseUtils.closeIO(objectInputStream);
                    return object;
                } catch (Exception e2) {
                    e = e2;
                    byteArrayInputStream2 = byteArrayInputStream3;
                    try {
                        L.e(e.getMessage());
                        CloseUtils.closeIO(byteArrayInputStream2);
                        CloseUtils.closeIO(objectInputStream);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        c2 = 0;
                        byteArrayInputStream = byteArrayInputStream2;
                        objectInputStream2 = objectInputStream;
                        Closeable[] closeableArr3 = new Closeable[1];
                        closeableArr3[c2] = byteArrayInputStream;
                        CloseUtils.closeIO(closeableArr3);
                        Closeable[] closeableArr22 = new Closeable[1];
                        closeableArr22[c2] = objectInputStream2;
                        CloseUtils.closeIO(closeableArr22);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayInputStream = byteArrayInputStream3;
                    c2 = 0;
                    objectInputStream2 = objectInputStream;
                    Closeable[] closeableArr32 = new Closeable[1];
                    closeableArr32[c2] = byteArrayInputStream;
                    CloseUtils.closeIO(closeableArr32);
                    Closeable[] closeableArr222 = new Closeable[1];
                    closeableArr222[c2] = objectInputStream2;
                    CloseUtils.closeIO(closeableArr222);
                    throw th;
                }
            }
            CloseUtils.closeIO(null);
            CloseUtils.closeIO(null);
            return null;
        } catch (Exception e3) {
            e = e3;
            objectInputStream = null;
            byteArrayInputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            c2 = 0;
            byteArrayInputStream = null;
        }
    }

    static void component2() {
        component3 = new char[]{33370, 33743, 33741, 33739, 33734, 33738, 33744, 33325, 33320, 33733, 33318, 33334, 33744, 33728, 33731, 33738, 33741, 33758, 33759, 33737, 33741, 33743, 33513, 33465, 33463, 33454, 33459, 33467, 33412, 33412, 33468, 33465, 33455, 33457, 33460, 33462, 33466, 33517, 33469, 33468, 33460, 33458, 33409, 33465, 33449, 33457, 33456, 33456, 33457, 33460, 33421, 33512, 33424, 33455, 33463, 33432, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33535, 33415, 33455, 33457, 33461, 33465, 33469, 33461, 33457, 33459, 33457, 33463, 33459, 33452, 33453, 33460, 33462, 33454};
    }
}
