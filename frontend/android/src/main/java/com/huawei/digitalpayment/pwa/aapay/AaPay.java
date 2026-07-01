package com.huawei.digitalpayment.pwa.aapay;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import com.huawei.digitalpayment.pwa.business.IBusiness;
import com.huawei.digitalpayment.pwa.constant.BusinessType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public class AaPay implements IBusiness {
    private Activity component3;
    private static final byte[] $$c = {19, TarHeader.LF_SYMLINK, -9, 119};
    private static final int $$d = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {107, -21, -54, -113, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 99;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static long ShareDataUIState = -4184011063188591745L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 103
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r0 = com.huawei.digitalpayment.pwa.aapay.AaPay.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.aapay.AaPay.$$e(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 16
            int r5 = r5 + 83
            int r7 = r7 * 6
            int r0 = r7 + 10
            byte[] r1 = com.huawei.digitalpayment.pwa.aapay.AaPay.$$a
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r5 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r4 = -r4
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-17)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.aapay.AaPay.a(int, byte, int, java.lang.Object[]):void");
    }

    public AaPay(Activity activity) {
        this.component3 = activity;
    }

    @Override
    public void init(Activity activity) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.component3 = activity;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 91;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16784248, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, (char) (63440 - TextUtils.getTrimmedLength("")), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1389, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (51269 - Color.green(0)), -1883291598, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $11 + 5;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i8 = $10 + 65;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override
    public String getBusinessName() throws Throwable {
        int i;
        Object[] objArr;
        int i2 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int iIndexOf = 998 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int pressedStateDuration = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
            char maximumDrawingCacheSize = (char) (61685 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            byte b2 = (byte) 0;
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, pressedStateDuration, maximumDrawingCacheSize, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{63157, 63188, 26963, 63925, 44755, 28325, 59746, 18716, 55805, 20145, 51626, 30221, 14621, 43518, 47471, 44660, 43492, 35254, 39293, 36746, 34872, 59486, 30941, 61400, 26702, 51262}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(KeyEvent.normalizeMetaState(0), new char[]{12652, 12553, 40651, 59873, 22857, 17857, 11943, 48778, 51628, 26027, 3705, 26204, 4731, 24182, 43388, 34101, 28205, 32306, 35133}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int iNormalizeMetaState = 999 - KeyEvent.normalizeMetaState(0);
            int scrollBarFadeDuration = 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            char cBlue = (char) (61685 - Color.blue(0));
            byte b4 = (byte) ($$b & 5);
            byte b5 = (byte) (-$$a[12]);
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 - 5), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, scrollBarFadeDuration, cBlue, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int i3 = 1000 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int trimmedLength = TextUtils.getTrimmedLength("") + 31;
                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61685);
                Object[] objArr6 = new Object[1];
                a((byte) ($$b & 5), (byte) (-$$a[24]), (byte) 0, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i3, trimmedLength, c2, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            int i6 = ~((int) Process.getStartElapsedRealtime());
            int i7 = ((285322553 + (((~(i6 | 1073560575)) | (~((-304678926) | i6))) * (-184))) + (((759177522 | (~((-1063856448) | i6))) | (~(314383053 | i6))) * 184)) - 1513209302;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
            i = 2;
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2217, 46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 272350434, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 999;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32;
                    char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 61685);
                    byte b6 = (byte) ($$b & 5);
                    Object[] objArr9 = new Object[1];
                    a(b6, (byte) (b6 | 10), (byte) 0, objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iIndexOf2, trimmedLength2, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 1030, 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)), (Class) ITrustedWebActivityCallbackDefault.copydefault(1072 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 44, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33532)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 999;
                    int iGreen = 31 - Color.green(0);
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 61685);
                    Object[] objArr11 = new Object[1];
                    a((byte) ($$b & 5), (byte) (-$$a[24]), (byte) 0, objArr11);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize2, iGreen, cIndexOf, 1267122354, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    b(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{63157, 63188, 26963, 63925, 44755, 28325, 59746, 18716, 55805, 20145, 51626, 30221, 14621, 43518, 47471, 44660, 43492, 35254, 39293, 36746, 34872, 59486, 30941, 61400, 26702, 51262}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{12652, 12553, 40651, 59873, 22857, 17857, 11943, 48778, 51628, 26027, 3705, 26204, 4731, 24182, 43388, 34101, 28205, 32306, 35133}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int gidForName = Process.getGidForName("") + 1000;
                        int iNormalizeMetaState2 = 31 - KeyEvent.normalizeMetaState(0);
                        char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 61685);
                        byte b7 = (byte) ($$b & 5);
                        byte b8 = (byte) (-$$a[12]);
                        Object[] objArr14 = new Object[1];
                        a(b7, b8, (byte) (b8 - 5), objArr14);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iNormalizeMetaState2, scrollBarFadeDuration2, 1267259187, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 999;
                        int maximumFlingVelocity = 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 61685);
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        a(b9, b10, (byte) (b10 + 1), objArr15);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, maximumFlingVelocity, minimumFlingVelocity, -1638177773, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    int i10 = component2 + 85;
                    copydefault = i10 % 128;
                    i = 2;
                    int i11 = i10 % 2;
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[i])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i14 = component2 + 93;
                copydefault = i14 % 128;
                int i15 = 2;
                int i16 = i14 % 2;
                int i17 = 0;
                while (i17 < strArr.length) {
                    int i18 = copydefault + 77;
                    component2 = i18 % 128;
                    if (i18 % i15 != 0) {
                        arrayList.add(strArr[i17]);
                        i17 += 42;
                    } else {
                        arrayList.add(strArr[i17]);
                        i17++;
                    }
                    i15 = 2;
                }
            }
            long j2 = -1;
            long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0, 0), 42 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr16 = {1688997434, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 6562, 56 - Color.red(0), (char) Gravity.getAbsoluteGravity(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr16);
            Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = i19 + (((~((-181617141) | i22)) | (~((-567856254) | iIdentityHashCode)) | (~(i22 | 567856253))) * 959) + 545955748 + (((~(iIdentityHashCode | 567856253)) | (~(i22 | (-567856254))) | (~((-181617141) | iIdentityHashCode))) * 959);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr17[3])[0] = i25 ^ (i25 << 5);
            throw null;
        }
        int i26 = copydefault + 83;
        component2 = i26 % 128;
        int i27 = i26 % i;
        Object[] objArr18 = new Object[4];
        objArr18[1] = new int[]{i};
        objArr18[i] = new int[]{i};
        objArr18[3] = new int[1];
        int i28 = ((int[]) objArr[3])[0];
        int i29 = ((int[]) objArr[i])[0];
        int i30 = ((int[]) objArr[1])[0];
        objArr18[0] = new String[0];
        int iNextInt = new Random().nextInt(1268845862);
        int i31 = i28 + 1430989026 + ((~(648804335 | iNextInt)) * (-301)) + (((~((-111892388) | iNextInt)) | (~((~iNextInt) | 637581006))) * (-301)) + (((~(iNextInt | (-637581007))) | (-111892388)) * 301);
        int i32 = (i31 << 13) ^ i31;
        int i33 = i32 ^ (i32 >>> 17);
        ((int[]) objArr18[3])[0] = i33 ^ (i33 << 5);
        Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i34 = ((int[]) objArr18[3])[0];
        int i35 = ((int[]) objArr18[2])[0];
        int i36 = ((int[]) objArr18[1])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i37 = ~((-33562771) | iIdentityHashCode2);
        int i38 = ~iIdentityHashCode2;
        int i39 = i34 + (-1571280807) + ((i37 | (~((-9142606) | i38))) * 920) + (((~((-706768019) | i38)) | 33562770) * 920) + (((~(iIdentityHashCode2 | (-9142606))) | (~((-33562771) | i38)) | (~((-673205249) | iIdentityHashCode2))) * 920);
        int i40 = i39 ^ (i39 << 13);
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr19[3])[0] = i41 ^ (i41 << 5);
        int i42 = copydefault + 73;
        component2 = i42 % 128;
        int i43 = i42 % 2;
        String strConcat = "14;26;18;4;".concat(BusinessType.AA_PAY);
        int i44 = ((int[]) objArr19[3])[0];
        int i45 = i44 * i44;
        int i46 = -(122388100 * i44);
        int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
        int i48 = -(i44 * 2129073032);
        int i49 = (i47 & i48) + (i48 | i47);
        int i50 = (i49 ^ 2080402468) + ((2080402468 & i49) << 1);
        int i51 = ((i50 >> 25) - 255) / 128;
        int i52 = (i51 ^ 1) + ((i51 & 1) << 1);
        int i53 = (i50 ^ i52) + ((i52 & i50) << 1);
        int i54 = i50 >> 20;
        int i55 = ((i54 & (-8191)) + (i54 | (-8191))) / 4096;
        int i56 = -(i53 ^ ((i55 & 1) + (i55 | 1)));
        int i57 = (i56 & 7) + (i56 | 7);
        int i58 = ((i57 >> 20) - 8191) / 4096;
        int i59 = (i58 ^ 1) + ((i58 & 1) << 1);
        return strConcat.substring(99022 / (((-(((i59 | 1) << 1) - (i59 ^ 1))) & i57) * 1286));
    }

    @Override
    public void parseUri(Uri uri) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (uri == null) {
            return;
        }
        copydefault(UriUtils.parseQuerys(uri));
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void copydefault(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
            if (!((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
                return;
            }
        } else if (!((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            return;
        }
        if (!(!TextUtils.isEmpty(map.get("qrCode")))) {
            Activity activity = this.component3;
            if (activity != null) {
                int i4 = copydefault + 83;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                activity.finish();
            }
            int i6 = component2 + 77;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RouteUtils.routeWithExecute(this.component3, UriUtils.getAppendUrl("native://app/pwaModule/aaPay", map), map);
    }
}
