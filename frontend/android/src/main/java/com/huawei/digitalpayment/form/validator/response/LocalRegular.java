package com.huawei.digitalpayment.form.validator.response;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.common.base.Ascii;
import com.huawei.http.BaseResp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/form/validator/response/LocalRegular;", "Lcom/huawei/http/BaseResp;", "regular", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRegular", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "FormValidator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalRegular extends BaseResp {
    private final String message;
    private final String regular;
    private static final byte[] $$c = {1, -53, Ascii.US, 101};
    private static final int $$d = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {78, -86, -128, -128, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 227;
    private static int copydefault = 0;
    private static int component1 = 1;
    private static char[] ShareDataUIState = {2031, 2036, 2018, 2032, 2030, 2041, 2017, 2034, 2024, 2021, 2020, 2026, 2002, 1966, 2003, 2029, 2027, 1987, 1992, 2019, 2023, 2028, 2035, 2025, 2038};
    private static char component2 = 12831;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 119 - r8
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.form.validator.response.LocalRegular.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalRegular.$$e(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.huawei.digitalpayment.form.validator.response.LocalRegular.$$a
            int r6 = r6 * 2
            int r1 = r6 + 10
            int r7 = r7 * 3
            int r7 = r7 + 99
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-26)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalRegular.b(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalRegular(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1;
            int i3 = i2 + 63;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i7 = copydefault + 79;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public LocalRegular(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.regular = str;
        this.message = str2;
    }

    private static void a(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 27;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7421 - TextUtils.lastIndexOf("", '0', 0), 15 - View.resolveSize(0, 0), (char) (64291 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 7422, 14 - TextUtils.indexOf((CharSequence) "", '0'), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 29;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 14 - (Process.myPid() >> 22), (char) (44464 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        try {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                int keyRepeatTimeout = 2944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int longPressTimeout = 24 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 27637);
                                byte b3 = (byte) ($$c[0] - 1);
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, longPressTimeout, tapTimeout, 794909189, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i11];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[i12];
                        cArr4[cancelall.component2 + 1] = cArr2[i13];
                    } else {
                        int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr2[i14];
                        cArr4[cancelall.component2 + 1] = cArr2[i15];
                    }
                }
                cancelall.component2 += 2;
            }
        }
        int i16 = $10 + 61;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final String getRegular() throws Throwable {
        CharSequence charSequence;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 68, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 19696), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((byte) (TextUtils.indexOf("", "", 0, 0) + 83), new char[]{'\t', 1, '\f', 5, 3, 20, 11, 14, 2, 20, 14, '\n', 7, 20, 4, 6, 16, 18, 20, 1, 15, 17}, ((Process.getThreadPriority(0) + 20) >> 6) + 22, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        int i3 = 8;
        Object[] objArr2 = new Object[1];
        a((byte) (TextUtils.getTrimmedLength("") + 107), new char[]{6, 24, '\b', 1, 24, 7, 11, CharUtils.CR, 5, 7, 1, 6, 20, 18, 13930}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int i4 = i2;
        long j = -948;
        long j2 = -1;
        long j3 = j2 ^ 1713397638046498243L;
        long j4 = j2 ^ 2742325458560012082L;
        long jMyTid = Process.myTid();
        long j5 = (((long) (-947)) * 1713397638046498243L) + (((long) 949) * 2742325458560012082L) + ((j3 | ((j4 | jMyTid) ^ j2)) * j) + (j * (j2 ^ ((j3 | j4) | (jMyTid ^ j2)))) + (((long) 948) * (j4 | 1713397638046498243L));
        int i5 = 0;
        while (true) {
            if (i5 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 846241313, false, "copydefault", null);
                }
                int i6 = ((Field) objCopydefault2).getInt(null);
                int i7 = 0;
                long j6 = jLongValue;
                while (true) {
                    int i8 = 0;
                    while (i8 != i3) {
                        int i9 = component1 + 33;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                        i6 = (((((int) (j6 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                        i8++;
                        i3 = 8;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i11 = copydefault + 123;
                    component1 = i11 % 128;
                    i7 = i11 % 2 == 0 ? i7 + 17 : i7 + 1;
                    j6 = j5;
                    i3 = 8;
                }
                int i12 = i4;
                if (i6 == i12) {
                    break;
                }
                int i13 = component1 + 43;
                copydefault = i13 % 128;
                if (i13 % 2 != 0) {
                    jLongValue *= 1024;
                    i5 += 24;
                } else {
                    jLongValue -= 1024;
                    i5++;
                }
                i4 = i12;
                i3 = 8;
            } else {
                Object[] objArr3 = new Object[1];
                a((byte) (124 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), new char[]{16, 11, 21, '\t', 11, 23, '\t', 1, 23, '\n', '\n', '\t', 21, 2, 5, 19}, 16 - KeyEvent.normalizeMetaState(0), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((byte) (27 - (ViewConfiguration.getScrollBarSize() >> 8)), new char[]{20, CharUtils.CR, 14, '\t', 3, 21, 0, 6, 16, '\b', 23, 7, 15, 2, 14, 5}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {229937478};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1662, (KeyEvent.getMaxKeyCode() >> 16) + 10, (char) (Process.getGidForName("") + 1), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1994199426, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1454;
                        int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        charSequence = "";
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iIndexOf, cIndexOf, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1590 - TextUtils.lastIndexOf("", '0', 0), 38 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)), Boolean.TYPE});
                    } else {
                        charSequence = "";
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i14 = ((int[]) objArr8[2])[0];
                    int i15 = ((int[]) objArr8[1])[0];
                    if (i15 != i14) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i16 = 0;
                            while (i16 < strArr.length) {
                                arrayList.add(strArr[i16]);
                                i16++;
                                int i17 = component1 + 27;
                                copydefault = i17 % 128;
                                int i18 = i17 % 2;
                            }
                        }
                        long j7 = -1;
                        long j8 = ((long) (i15 ^ i14)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)));
                        long j9 = 0;
                        long j10 = j8 | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetAfter(charSequence, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr9 = {229937478, Long.valueOf(j10), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6562, (ViewConfiguration.getEdgeSlop() >> 16) + 56, (char) (TextUtils.lastIndexOf(charSequence, '0', 0, 0) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                        Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        String str = this.regular;
        int i19 = component1 + 41;
        copydefault = i19 % 128;
        int i20 = i19 % 2;
        return str;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.message;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalRegular() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static LocalRegular copy$default(LocalRegular localRegular, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 115;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = localRegular.regular;
        }
        if ((i & 2) != 0) {
            str2 = localRegular.message;
            int i5 = copydefault + 69;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return localRegular.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.regular;
            int i4 = 92 / 0;
        } else {
            str = this.regular;
        }
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.message;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final LocalRegular copy(String regular, String message) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(regular, "");
        Intrinsics.checkNotNullParameter(message, "");
        LocalRegular localRegular = new LocalRegular(regular, message);
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return localRegular;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalRegular)) {
            int i2 = copydefault + 89;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
        LocalRegular localRegular = (LocalRegular) other;
        if (!Intrinsics.areEqual(this.regular, localRegular.regular)) {
            int i3 = component1 + 27;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.message, localRegular.message)) {
            return true;
        }
        int i5 = copydefault + 49;
        component1 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.regular.hashCode() * 31) + this.message.hashCode();
        int i4 = copydefault + 59;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalRegular(regular=" + this.regular + ", message=" + this.message + ")";
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
