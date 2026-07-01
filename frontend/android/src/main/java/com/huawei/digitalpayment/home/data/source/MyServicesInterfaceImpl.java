package com.huawei.digitalpayment.home.data.source;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.blankj.utilcode.util.GsonUtils;
import com.google.common.base.Ascii;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.service.MyServicesInterface;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.util.MyServicesManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/MyServicesInterfaceImpl;", "Lcom/huawei/digitalpayment/consumer/service/MyServicesInterface;", "<init>", "()V", "setNeedRefresh", "", SplashEntryInfo.NEED_REFRESH, "", "getNeedRefresh", "setMaxCount", "maxCount", "", "getMaxCount", "updateMyServices", "myServices", "", "getMyServices", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyServicesInterfaceImpl implements MyServicesInterface {
    private static final byte[] $$c = {TarHeader.LF_NORMAL, 86, 58, 71};
    private static final int $$d = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Ascii.VT, -55, -20, -91, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49};
    private static final int $$b = 155;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private static char[] ShareDataUIState = {30719, 30706, 30712, 30702, 30701, 30711, 30642, 30697, 30601, 30695, 30696, 30715, 30707, 30617, 30704, 30713, 30705, 30700, 30606};
    private static int component2 = 321287772;
    private static boolean copydefault = true;
    private static boolean component1 = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = com.huawei.digitalpayment.home.data.source.MyServicesInterfaceImpl.$$c
            int r7 = r7 * 5
            int r7 = r7 + 68
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.MyServicesInterfaceImpl.$$e(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 5
            int r5 = r5 + 4
            int r0 = 16 - r6
            byte[] r1 = com.huawei.digitalpayment.home.data.source.MyServicesInterfaceImpl.$$a
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r0 = new byte[r0]
            int r6 = 15 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-16)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.MyServicesInterfaceImpl.a(byte, int, short, java.lang.Object[]):void");
    }

    @Override
    public void setNeedRefresh(boolean needRefresh) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            MyServicesManager.INSTANCE.setNeedRefresh(needRefresh);
            throw null;
        }
        MyServicesManager.INSTANCE.setNeedRefresh(needRefresh);
        int i3 = component3 + 97;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
    }

    @Override
    public boolean getNeedRefresh() {
        boolean needRefresh;
        int i = 2 % 2;
        int i2 = component3 + 97;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            needRefresh = MyServicesManager.INSTANCE.getNeedRefresh();
            int i3 = 89 / 0;
        } else {
            needRefresh = MyServicesManager.INSTANCE.getNeedRefresh();
        }
        int i4 = getAsAtTimestamp + 97;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return needRefresh;
        }
        throw null;
    }

    @Override
    public void setMaxCount(int maxCount) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            MyServicesManager.INSTANCE.setMaxCount(maxCount);
            int i3 = 28 / 0;
        } else {
            MyServicesManager.INSTANCE.setMaxCount(maxCount);
        }
        int i4 = component3 + 79;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getMaxCount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MyServicesManager.INSTANCE.getMaxCount();
            obj.hashCode();
            throw null;
        }
        int maxCount = MyServicesManager.INSTANCE.getMaxCount();
        int i3 = component3 + 49;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return maxCount;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = ShareDataUIState;
        long j = 0;
        float f = 0.0f;
        if (cArr3 != null) {
            int i4 = $10 + 23;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 43;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 3759, 24 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), c2, -1670574543, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i6 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3760 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 24, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -1670574543, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
                j = 0;
                f = 0.0f;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(component2)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7139 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12 - Process.getGidForName(""), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        if (component1) {
            int i8 = $11 + 7;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                int i9 = $10 + 75;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 >>> 1) >> cancelVar.component3] % i] >>> iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2748, 19 - (ViewConfiguration.getTapTimeout() >> 16), (char) (7644 - KeyEvent.getDeadChar(0, 0)), -327556343, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } else {
                    cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2747, 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7645), -327556343, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
            }
            String str = new String(cArr2);
            int i10 = $11 + 29;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
            return;
        }
        if (!copydefault) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $11 + 119;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i14 = $11 + 79;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 >> 1) >> cancelVar.component3] - i] % iIntValue);
                Object[] objArr7 = {cancelVar, cancelVar};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 2749, 19 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7643), -327556343, false, $$e(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr8 = {cancelVar, cancelVar};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault7 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2748, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7644), -327556343, false, $$e(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault7).invoke(null, objArr8);
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override
    public void updateMyServices(String myServices) throws Throwable {
        Object[] objArrShareDataUIState$16dd2b22;
        char c2;
        int i = 2 % 2;
        Type type = new TypeToken<List<? extends LocalHomeFunction>>() {
        }.getType();
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
        if (objCopydefault == null) {
            int gidForName = Process.getGidForName("") + 2406;
            int iRed = 26 - Color.red(0);
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            Object[] objArr = new Object[1];
            a((byte) (b2 - 1), (byte) (-bArr[7]), b2, objArr);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iRed, keyRepeatDelay, 1926552790, false, (String) objArr[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr2 = new Object[1];
        b(null, 126 - ExpandableListView.getPackedPositionChild(0L), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, null, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
        if (objCopydefault2 == null) {
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2404;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 27;
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            byte b3 = (byte) ($$b & 6);
            byte b4 = (byte) (b3 - 2);
            Object[] objArr4 = new Object[1];
            a(b3, b4, b4, objArr4);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i2, bitsPerPixel, tapTimeout, 246010334, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getAsAtTimestamp + 91;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault3 == null) {
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2405;
                int iBlue = 26 - Color.blue(0);
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b5 = (byte) (-$$a[7]);
                Object[] objArr5 = new Object[1];
                a(b5, (byte) (b5 + 1), r1[28], objArr5);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay2, iBlue, scrollBarFadeDuration, 21921080, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objCopydefault3).get(null);
            objArrShareDataUIState$16dd2b22 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = 934794481 + ((~(iIdentityHashCode | 788993881)) * 216);
            int i6 = ~iIdentityHashCode;
            int i7 = ((i5 + ((793739135 | i6) * (-216))) + (((~(i6 | 788993881)) | (-726235520)) * 216)) - 1601162798;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrShareDataUIState$16dd2b22[1])[0] = i9 ^ (i9 << 5);
            c2 = 2;
        } else {
            int length = myServices != null ? myServices.length() : 0;
            try {
                Object[] objArr7 = {1703458404};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2393 - View.combineMeasuredStates(0, 0), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (30139 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1140467866, false, null, new Class[]{Integer.TYPE});
                }
                objArrShareDataUIState$16dd2b22 = LocalValidatorItem.ShareDataUIState$16dd2b22(length, 0, ((Constructor) objCopydefault4).newInstance(objArr7), -1601162798, false, false);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault5 == null) {
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2405;
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    byte b6 = (byte) (-$$a[7]);
                    Object[] objArr8 = new Object[1];
                    a(b6, (byte) (b6 + 1), r1[28], objArr8);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, packedPositionType, cLastIndexOf, 21921080, false, (String) objArr8[0], null);
                }
                ((Field) objCopydefault5).set(null, objArrShareDataUIState$16dd2b22);
                try {
                    Object[] objArr9 = new Object[1];
                    b(null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b(null, TextUtils.indexOf("", "") + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, null, objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                    if (objCopydefault6 == null) {
                        int windowTouchSlop = 2405 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int offsetAfter = 26 - TextUtils.getOffsetAfter("", 0);
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b7 = (byte) ($$b & 6);
                        byte b8 = (byte) (b7 - 2);
                        Object[] objArr11 = new Object[1];
                        a(b7, b8, b8, objArr11);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, offsetAfter, fadingEdgeLength, 246010334, false, (String) objArr11[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                    if (objCopydefault7 == null) {
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2405;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 27;
                        char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte[] bArr2 = $$a;
                        byte b9 = bArr2[28];
                        Object[] objArr12 = new Object[1];
                        a((byte) (b9 - 1), (byte) (-bArr2[7]), b9, objArr12);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout2, iIndexOf, c3, 1926552790, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i10 = getAsAtTimestamp + 111;
                    component3 = i10 % 128;
                    c2 = 2;
                    if (i10 % 2 != 0) {
                        int i11 = 4 / 5;
                    }
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArrShareDataUIState$16dd2b22[0])[0];
        int i13 = ((int[]) objArrShareDataUIState$16dd2b22[c2])[0];
        if (i13 == i12) {
            Object[] objArr13 = new Object[4];
            objArr13[0] = new int[]{i};
            objArr13[1] = new int[1];
            objArr13[c2] = new int[]{i};
            int i14 = ((int[]) objArrShareDataUIState$16dd2b22[1])[0];
            int i15 = ((int[]) objArrShareDataUIState$16dd2b22[c2])[0];
            int i16 = ((int[]) objArrShareDataUIState$16dd2b22[0])[0];
            objArr13[3] = (String[]) objArrShareDataUIState$16dd2b22[3];
            int i17 = i14 + (((62544321 | r3) * (-658)) - 667550869) + (((~(System.identityHashCode(this) | 44688269)) | 17963072) * 658);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr13[1])[0] = i19 ^ (i19 << 5);
            int i20 = ((int[]) objArr13[1])[0];
            Object[] objArr14 = {new int[]{((int[]) objArr13[0])[0]}, new int[1], new int[]{((int[]) objArr13[2])[0]}, (String[]) objArr13[3]};
            int i21 = i20 + ((((~((-2115713) | r1)) | (-100657835)) * 501) - 2107245568) + ((~((~Process.myUid()) | (-2115713))) * 501);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[1])[0] = i23 ^ (i23 << 5);
            MyServicesManager.INSTANCE.updateMyServices((List) SecureGsonUtils.fromJson(myServices, type));
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrShareDataUIState$16dd2b22[3];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        long j2 = -1;
        long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 2) << 32) | (j4 - ((j4 >> 63) << 32));
        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
        if (objCopydefault8 == null) {
            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0, 0), KeyEvent.normalizeMetaState(0) + 42, (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
        }
        Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
        Object[] objArr15 = {1703458404, Long.valueOf(j5), arrayList, null, false, false};
        Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
        if (objCopydefault9 == null) {
            objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6563, 57 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
        }
        ((Method) objCopydefault9).invoke(objInvoke, objArr15);
        int i24 = ((int[]) objArrShareDataUIState$16dd2b22[1])[0];
        Object[] objArr16 = {new int[]{((int[]) objArrShareDataUIState$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrShareDataUIState$16dd2b22[2])[0]}, (String[]) objArrShareDataUIState$16dd2b22[3]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i25 = ~iUptimeMillis;
        int i26 = i24 + (-167785403) + ((493019006 | iUptimeMillis) * (-676)) + (((~(488660798 | i25)) | (-493019007)) * 676) + (((~(iUptimeMillis | (-4358209))) | (~(i25 | 425902436)) | 67116570) * 676);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr16[1])[0] = i28 ^ (i28 << 5);
        throw new RuntimeException(String.valueOf(i13));
    }

    @Override
    public String getMyServices() {
        String json;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            json = GsonUtils.toJson(MyServicesManager.INSTANCE.getMyServices());
            Intrinsics.checkNotNullExpressionValue(json, "");
            int i3 = 73 / 0;
        } else {
            json = GsonUtils.toJson(MyServicesManager.INSTANCE.getMyServices());
            Intrinsics.checkNotNullExpressionValue(json, "");
        }
        int i4 = component3 + 69;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return json;
    }
}
