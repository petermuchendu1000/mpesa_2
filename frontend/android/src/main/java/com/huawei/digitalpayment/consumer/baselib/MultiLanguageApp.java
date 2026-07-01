package com.huawei.digitalpayment.consumer.baselib;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.language.LanguageUtils;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public class MultiLanguageApp extends Application {
    private static char component1;
    private static int component2;
    private static char[] component3;
    private static int copy;
    private static long copydefault;
    private static final byte[] $$c = {7, 80, 121, 38};
    private static final int $$f = 93;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {120, -62, 63, 57, Ascii.DLE, 2, -59, TarHeader.LF_CONTIG, Ascii.FF, 13, -12, Ascii.DLE, -8, -48, 66, 7, 9, 4, -7, 0, -51, TarHeader.LF_CONTIG, 17, -1, 8, -8, Ascii.ETB, -7, 10, 3, -60, 57, Ascii.DLE, 3, 10, -11, 13, 10, -66, Ascii.EM, TarHeader.LF_NORMAL, 2, 7, 3, 10, -3, -6, -12, 34, -5, 8, -25, Ascii.NAK, Ascii.ETB, -8, -33, TarHeader.LF_NORMAL, 3, 10, -11, 13, 10, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -62, Ascii.EM, -3, Ascii.NAK, -9, -29, 33, Ascii.ETB, -15, -8, -8, Ascii.SO, 37, -15, Ascii.ETB, -11};
    private static final int $$k = 61;
    private static final byte[] $$a = {57, Ascii.SYN, -21, -92, -29, -18, -26, 4, -18, -18, -12, -37, -8, -25, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2};
    private static final int $$b = 248;
    private static int getAsAtTimestamp = 0;
    private static int ShareDataUIState = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.MultiLanguageApp.$$c
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L14
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
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageApp.$$i(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.MultiLanguageApp.$$a
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r9 = 41 - r9
            int r7 = 16 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-17)
            int r9 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageApp.b(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.MultiLanguageApp.$$j
            int r6 = r6 + 10
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r5 = r5 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageApp.c(int, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            LanguageUtils.getInstance().init(context);
            super.attachBaseContext(LanguageUtils.getInstance().attach(context));
            int i3 = component4 + 117;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        LanguageUtils.getInstance().init(context);
        super.attachBaseContext(LanguageUtils.getInstance().attach(context));
        throw null;
    }

    private static void d(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $10 + 103;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 4037, 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (19181 - ExpandableListView.getPackedPositionType(0L)), 1912513118, false, $$i(b2, (byte) (b2 & Ascii.DLE), (byte) 0), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 11 - View.MeasureSpec.getMode(0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b3 = (byte) (-1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - Drawable.resolveOpacity(0, 0), 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 931716605, false, $$i(b3, (byte) (b3 & 17), (byte) 0), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getTapTimeout() >> 16), 10 - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.indexOf("", "", 0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i6 = $10 + 101;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 9;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 657, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, (char) (65118 - TextUtils.getOffsetBefore("", 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 657, 14 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (65118 - ExpandableListView.getPackedPositionType(0L)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i9 = $11 + 89;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 & 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4501 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35, (char) (27898 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), -1464227204, false, $$i(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3580, 27 - TextUtils.indexOf((CharSequence) "", '0'), (char) ExpandableListView.getPackedPositionType(0L), 1180380354, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (-b6);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 34, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 80302927, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i13 = $10 + 109;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i15, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i15);
        }
        if (z) {
            int i16 = $10 + 117;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $10 + 7;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onCreate() throws Throwable {
        Object[] objArr;
        String str;
        Object[] objArr2;
        Method method;
        Object[] objArrComponent3$16dd2b22;
        Object[] objArr3;
        int i = 2 % 2;
        int i2 = component4 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr4 = new Object[1];
        a(new int[]{0, 22, 0, 19}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr4);
        String str2 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        a(new int[]{22, 15, 0, 13}, true, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0}, objArr5);
        String str3 = (String) objArr5[0];
        Callback.onCreate(this);
        super.onCreate();
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
        if (objCopydefault == null) {
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1455;
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[49]);
            Object[] objArr6 = new Object[1];
            b(b2, (byte) (b2 - 4), (byte) (-bArr[11]), objArr6);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, i4, trimmedLength, 1557109104, false, (String) objArr6[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        long jLongValue = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
        if (objCopydefault2 == null) {
            byte b3 = (byte) 6;
            Object[] objArr7 = new Object[1];
            b(b3, (byte) (b3 - 5), (byte) (-$$a[51]), objArr7);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1454 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1255888033, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
            if (objCopydefault3 == null) {
                int maxKeyCode = 1454 - (KeyEvent.getMaxKeyCode() >> 16);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                byte b4 = (byte) 6;
                Object[] objArr8 = new Object[1];
                b(b4, (byte) (b4 - 5), (byte) (-$$a[5]), objArr8);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, pressedStateDuration, cLastIndexOf, -1254718500, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr9[1])[0]}, new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int ringerMode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getRingerMode();
            int i5 = ~ringerMode;
            int i6 = 2017762554 + (((~(i5 | 1322706817)) | 79090509) * (-1042)) + ((1322706817 | ringerMode) * 521) + (((~(ringerMode | (-79090510))) | 76989185 | (~(i5 | 1324808141))) * 521) + 141127036;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            a(new int[]{37, 16, 12, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
            Class<?> cls = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(new int[]{53, 16, 41, 14}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr11);
            int iIntValue = ((Integer) cls.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr12 = {333135638};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1662, 9 - MotionEvent.axisFromString(""), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1006506020, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr13 = {Integer.valueOf(iIntValue), 0, 141127036, ((Constructor) objCopydefault4).newInstance(objArr12), false};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                if (objCopydefault5 == null) {
                    int scrollBarSize = 1454 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iGreen = Color.green(0) + 22;
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b5 = (byte) 6;
                    byte b6 = (byte) (b5 - 5);
                    Object[] objArr14 = new Object[1];
                    b(b5, b6, (byte) (b6 | 8), objArr14);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iGreen, maximumFlingVelocity, 1908380642, false, (String) objArr14[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 1591, View.MeasureSpec.makeMeasureSpec(0, 0) + 39, (char) (Process.myTid() >> 22)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr13);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
                if (objCopydefault6 == null) {
                    int i9 = 1454 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int size = View.MeasureSpec.getSize(0) + 22;
                    char c2 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    byte b7 = (byte) 6;
                    Object[] objArr15 = new Object[1];
                    b(b7, (byte) (b7 - 5), (byte) (-$$a[5]), objArr15);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i9, size, c2, -1254718500, false, (String) objArr15[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    long jLongValue2 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
                    if (objCopydefault7 == null) {
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1454;
                        int iAlpha = 22 - Color.alpha(0);
                        char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b8 = (byte) 6;
                        Object[] objArr16 = new Object[1];
                        b(b8, (byte) (b8 - 5), (byte) (-$$a[51]), objArr16);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iAlpha, c3, -1255888033, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
                    if (objCopydefault8 == null) {
                        int iLastIndexOf = 1453 - TextUtils.lastIndexOf("", '0');
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b9 = (byte) (-bArr2[49]);
                        Object[] objArr17 = new Object[1];
                        b(b9, (byte) (b9 - 4), (byte) (-bArr2[11]), objArr17);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, tapTimeout, keyRepeatTimeout, 1557109104, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[1])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[0])[0];
            Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i13 = i12 + (((831496 | r6) * (-374)) - 867180898) + (((~((~((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode()) | 145536216)) | 144704720) * 374);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr18[0])[0] = i15 ^ (i15 << 5);
            int i16 = ((int[]) objArr18[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr18[1])[0]}, new int[]{((int[]) objArr18[2])[0]}, (String[]) objArr18[3]};
            int i17 = (int) Runtime.getRuntime().totalMemory();
            int i18 = ~i17;
            int i19 = i16 + (((~((-1373178664) | i18)) | (~((-28618664) | i17)) | (~(i18 | 28618663))) * 959) + 2029254516 + (((~(i17 | 28618663)) | (~(i18 | (-28618664))) | (~((-1373178664) | i17))) * 959);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[0])[0] = i21 ^ (i21 << 5);
            str = str2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str4 : strArr) {
                    arrayList.add(str4);
                }
            }
            str = str2;
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i10 ^ i11))) | (((long) 1) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.alpha(0), View.getDefaultSize(0, 0) + 42, (char) View.MeasureSpec.getMode(0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr20 = {333135638, Long.valueOf(j4), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6562, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr20);
            int i22 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt();
            int i23 = i22 + 1906391866 + (((~((-404878926) | iNextInt)) | (-996918402)) * (-964)) + (((~((~iNextInt) | (-404878926))) | 12876) * (-964));
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
            int[] iArr = new int[i11];
            int i26 = i11 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr21[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr21[1])[0]}, new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
            int iCodePointAt = ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).codePointAt(0) - 2010096047;
            int i28 = ~((-989266811) | (~iCodePointAt));
            int i29 = i27 + ((46084 | i28 | (~(989266810 | iCodePointAt))) * (-338)) + 1417373718 + (((~(iCodePointAt | 989312894)) | i28) * 338);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr22[0])[0] = i31 ^ (i31 << 5);
        }
        Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(534243434);
        if (objCopydefault11 == null) {
            int bitsPerPixel = 1183 - ImageFormat.getBitsPerPixel(0);
            int scrollBarFadeDuration = 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr3 = $$a;
            byte b10 = (byte) (-bArr3[49]);
            Object[] objArr23 = new Object[1];
            b(b10, (byte) (b10 - 4), (byte) (-bArr3[11]), objArr23);
            objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, scrollBarFadeDuration, scrollDefaultDelay, -628214001, false, (String) objArr23[0], null);
        }
        long j5 = ((Field) objCopydefault11).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(1260029028);
        if (objCopydefault12 == null) {
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1185;
            int iMyTid = (Process.myTid() >> 22) + 16;
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            byte b11 = (byte) 0;
            byte b12 = b11;
            Object[] objArr24 = new Object[1];
            b(b11, b12, b12, objArr24);
            objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, iMyTid, cResolveSizeAndState, -1908188415, false, (String) objArr24[0], null);
        }
        if (j5 == ((jLongValue3 - ((((Field) objCopydefault12).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
            if (objCopydefault13 == null) {
                byte b13 = (byte) 6;
                Object[] objArr25 = new Object[1];
                b(b13, (byte) (b13 - 5), (byte) (-$$a[5]), objArr25);
                objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 1184, View.MeasureSpec.getMode(0) + 16, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), -5487455, false, (String) objArr25[0], null);
            }
            Object[] objArr26 = (Object[]) ((Field) objCopydefault13).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i32 = ((int[]) objArr26[1])[0];
            int i33 = ((int[]) objArr26[2])[0];
            String[] strArr2 = (String[]) objArr26[0];
            int streamMaxVolume = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
            int i34 = ~streamMaxVolume;
            int i35 = 2136248592 + (((~((-518778979) | i34)) | (~((-676178819) | i34))) * (-867)) + (((~((-518778979) | streamMaxVolume)) | 139042818 | (~((-676178819) | streamMaxVolume))) * (-1734)) + (((~(streamMaxVolume | (-537136001))) | (~(i34 | (-139042819))) | (~((-379736161) | streamMaxVolume))) * 867) + 1512237296;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[3])[0] = i37 ^ (i37 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i38 = ShareDataUIState + 123;
                component4 = i38 % 128;
                if (i38 % 2 == 0) {
                    Object[] objArr27 = new Object[1];
                    a(new int[]{69, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr27);
                    Class<?> cls2 = Class.forName((String) objArr27[0]);
                    Object[] objArr28 = new Object[1];
                    a(new int[]{95, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr28);
                    method = cls2.getMethod((String) objArr28[0], new Class[1]);
                } else {
                    Object[] objArr29 = new Object[1];
                    a(new int[]{69, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr29);
                    Class<?> cls3 = Class.forName((String) objArr29[0]);
                    Object[] objArr30 = new Object[1];
                    a(new int[]{95, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr30);
                    method = cls3.getMethod((String) objArr30[0], new Class[0]);
                }
                baseContext = (Context) method.invoke(null, null);
            }
            if (baseContext != null) {
                int i39 = ShareDataUIState + 45;
                component4 = i39 % 128;
                if (i39 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            Object[] objArr31 = new Object[1];
            a(new int[]{37, 16, 12, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr31);
            Class<?> cls4 = Class.forName((String) objArr31[0]);
            Object[] objArr32 = new Object[1];
            a(new int[]{53, 16, 41, 14}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr32);
            try {
                Object[] objArr33 = {baseContext, Integer.valueOf(((Integer) cls4.getMethod((String) objArr32[0], Object.class).invoke(null, this)).intValue()), 0, 1512237296};
                byte[] bArr4 = $$j;
                byte b14 = bArr4[23];
                byte b15 = b14;
                Object[] objArr34 = new Object[1];
                c(b15, (byte) (b15 & TarHeader.LF_LINK), (byte) (-b14), objArr34);
                Class<?> cls5 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                c(bArr4[3], bArr4[19], (byte) (-bArr4[23]), objArr35);
                objArr2 = (Object[]) cls5.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
                Object objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
                if (objCopydefault14 == null) {
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1184;
                    int threadPriority = 16 - ((Process.getThreadPriority(0) + 20) >> 6);
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b16 = (byte) 6;
                    Object[] objArr36 = new Object[1];
                    b(b16, (byte) (b16 - 5), (byte) (-$$a[5]), objArr36);
                    objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, threadPriority, cIndexOf, -5487455, false, (String) objArr36[0], null);
                }
                ((Field) objCopydefault14).set(null, objArr2);
                try {
                    long jLongValue4 = ((Long) Class.forName(str).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(1260029028);
                    if (objCopydefault15 == null) {
                        int i40 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1184;
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 16;
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr37 = new Object[1];
                        b(b17, b18, b18, objArr37);
                        objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(i40, maxKeyCode2, edgeSlop, -1908188415, false, (String) objArr37[0], null);
                    }
                    ((Field) objCopydefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(534243434);
                    if (objCopydefault16 == null) {
                        int scrollBarFadeDuration2 = 1184 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int capsMode = 16 - TextUtils.getCapsMode("", 0, 0);
                        char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b19 = (byte) (-bArr5[49]);
                        Object[] objArr38 = new Object[1];
                        b(b19, (byte) (b19 - 4), (byte) (-bArr5[11]), objArr38);
                        objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration2, capsMode, jumpTapTimeout2, -628214001, false, (String) objArr38[0], null);
                    }
                    ((Field) objCopydefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i41 = ((int[]) objArr2[2])[0];
        int i42 = ((int[]) objArr2[1])[0];
        if (i42 == i41) {
            Object[] objArr39 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i43 = ((int[]) objArr2[3])[0];
            int i44 = ((int[]) objArr2[1])[0];
            int i45 = ((int[]) objArr2[2])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int i46 = ~System.identityHashCode(this);
            int i47 = i43 + (-1517432492) + (((~(917958620 | i46)) | 276999176) * (-828)) + ((i46 | 917958620) * (-828)) + 139473204;
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr39[3])[0] = i49 ^ (i49 << 5);
            Object[] objArr40 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i50 = ((int[]) objArr39[3])[0];
            int i51 = ((int[]) objArr39[1])[0];
            int i52 = ((int[]) objArr39[2])[0];
            String[] strArr4 = (String[]) objArr39[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i53 = i50 + (-396535932) + (((~(iIdentityHashCode | 408393028)) | (-786564769)) * (-668)) + ((408393028 | (~((-786564769) | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | (-648020641)) * 668);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            ((int[]) objArr40[3])[0] = i55 ^ (i55 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[0];
            if (strArr5 != null) {
                int i56 = component4 + 73;
                ShareDataUIState = i56 % 128;
                int i57 = 2;
                int i58 = i56 % 2;
                int i59 = 0;
                while (i59 < strArr5.length) {
                    int i60 = component4 + 105;
                    ShareDataUIState = i60 % 128;
                    int i61 = i60 % i57;
                    arrayList2.add(strArr5[i59]);
                    i59++;
                    i57 = 2;
                }
            }
            long j6 = -1;
            long j7 = 0;
            long j8 = (((j6 - ((j6 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i41 ^ i42))) | (((long) 4) << 32) | (j7 - ((j7 >> 63) << 32));
            Object objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault17 == null) {
                objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 6618, 42 - TextUtils.getTrimmedLength(""), (char) View.resolveSize(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault17).invoke(null, null);
            Object[] objArr41 = {333135638, Long.valueOf(j8), arrayList2, null, false, false};
            Object objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault18 == null) {
                objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myTid() >> 22) + 56, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault18).invoke(objInvoke2, objArr41);
            Object[] objArr42 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i62 = ((int[]) objArr2[3])[0];
            int i63 = ((int[]) objArr2[1])[0];
            int i64 = ((int[]) objArr2[2])[0];
            String[] strArr6 = (String[]) objArr2[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i65 = i62 + (-1428837100) + (((~((~iIdentityHashCode2) | (-605030785))) | (~(901086174 | iIdentityHashCode2))) * (-302)) + ((~((-605030785) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | 296055390)) | 2183768) * 302);
            int i66 = (i65 << 13) ^ i65;
            int i67 = i66 ^ (i66 >>> 17);
            ((int[]) objArr42[3])[0] = i67 ^ (i67 << 5);
            int[] iArr2 = new int[i42];
            int i68 = i42 - 1;
            iArr2[i68] = 1;
            Toast.makeText((Context) null, iArr2[((i42 * i68) % 2) - 1], 1).show();
            Object[] objArr43 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i69 = ((int[]) objArr42[3])[0];
            int i70 = ((int[]) objArr42[1])[0];
            int i71 = ((int[]) objArr42[2])[0];
            String[] strArr7 = (String[]) objArr42[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i72 = ~startElapsedRealtime;
            int i73 = i69 + 1666295264 + (((~(501458350 | i72)) | 538202640) * (-108)) + (((~(i72 | 693499446)) | (~((-693499447) | startElapsedRealtime)) | 346161544) * 54) + ((startElapsedRealtime | 346161544) * 54);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr43[3])[0] = i75 ^ (i75 << 5);
        }
        Object objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
        if (objCopydefault19 == null) {
            int edgeSlop2 = 2405 - (ViewConfiguration.getEdgeSlop() >> 16);
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            byte[] bArr6 = $$a;
            byte b20 = (byte) (-bArr6[49]);
            Object[] objArr44 = new Object[1];
            b(b20, (byte) (b20 - 4), (byte) (-bArr6[11]), objArr44);
            objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop2, keyRepeatTimeout2, cIndexOf2, 1926552790, false, (String) objArr44[0], null);
        }
        long j9 = ((Field) objCopydefault19).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
        if (objCopydefault20 == null) {
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2406;
            int i76 = 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b21 = (byte) 0;
            byte b22 = b21;
            Object[] objArr45 = new Object[1];
            b(b21, b22, b22, objArr45);
            objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i76, maximumDrawingCacheSize, 246010334, false, (String) objArr45[0], null);
        }
        if (j9 == ((jLongValue5 - ((((Field) objCopydefault20).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault21 == null) {
                int i77 = 2406 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int defaultSize = 26 - View.getDefaultSize(0, 0);
                char c4 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                byte b23 = (byte) 6;
                byte b24 = (byte) (b23 - 5);
                Object[] objArr46 = new Object[1];
                b(b23, b24, (byte) (b24 | 8), objArr46);
                objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(i77, defaultSize, c4, 21921080, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objCopydefault21).get(null);
            objArrComponent3$16dd2b22 = new Object[]{new int[]{((int[]) objArr47[0])[0]}, new int[1], new int[]{((int[]) objArr47[2])[0]}, (String[]) objArr47[3]};
            int i78 = ((((~(r0 | (-170613375))) * TypedValues.CycleType.TYPE_EASING) - 459888863) + (((~((~Process.myPid()) | (-170613375))) | 96509952) * TypedValues.CycleType.TYPE_EASING)) - 1541247166;
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArrComponent3$16dd2b22[1])[0] = i80 ^ (i80 << 5);
            int i81 = ShareDataUIState + 49;
            component4 = i81 % 128;
            int i82 = i81 % 2;
        } else {
            Object[] objArr48 = new Object[1];
            a(new int[]{37, 16, 12, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr48);
            Class<?> cls6 = Class.forName((String) objArr48[0]);
            Object[] objArr49 = new Object[1];
            a(new int[]{53, 16, 41, 14}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr49);
            int iIntValue2 = ((Integer) cls6.getMethod((String) objArr49[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr50 = {333135638};
            Object objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
            if (objCopydefault22 == null) {
                objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 2393, 11 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (30139 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1140467866, false, null, new Class[]{Integer.TYPE});
            }
            objArrComponent3$16dd2b22 = ActiveConsumerParams.component3$16dd2b22(iIntValue2, 0, ((Constructor) objCopydefault22).newInstance(objArr50), -1541247166, false, false);
            Object objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault23 == null) {
                int iIndexOf2 = 2405 - TextUtils.indexOf("", "", 0, 0);
                int iRed = 26 - Color.red(0);
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                byte b25 = (byte) 6;
                byte b26 = (byte) (b25 - 5);
                Object[] objArr51 = new Object[1];
                b(b25, b26, (byte) (b26 | 8), objArr51);
                objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iRed, gidForName, 21921080, false, (String) objArr51[0], null);
            }
            ((Field) objCopydefault23).set(null, objArrComponent3$16dd2b22);
            try {
                long jLongValue6 = ((Long) Class.forName(str).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue6);
                Object objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                if (objCopydefault24 == null) {
                    int edgeSlop3 = 2405 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iIndexOf3 = 26 - TextUtils.indexOf("", "", 0);
                    char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b27 = (byte) 0;
                    byte b28 = b27;
                    Object[] objArr52 = new Object[1];
                    b(b27, b28, b28, objArr52);
                    objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop3, iIndexOf3, keyRepeatTimeout3, 246010334, false, (String) objArr52[0], null);
                }
                ((Field) objCopydefault24).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                Object objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                if (objCopydefault25 == null) {
                    byte[] bArr7 = $$a;
                    byte b29 = (byte) (-bArr7[49]);
                    Object[] objArr53 = new Object[1];
                    b(b29, (byte) (b29 - 4), (byte) (-bArr7[11]), objArr53);
                    objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(2404 - Process.getGidForName(""), 26 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 1926552790, false, (String) objArr53[0], null);
                }
                ((Field) objCopydefault25).set(null, lValueOf6);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i83 = ((int[]) objArrComponent3$16dd2b22[0])[0];
        int i84 = ((int[]) objArrComponent3$16dd2b22[2])[0];
        if (i84 == i83) {
            int i85 = ((int[]) objArrComponent3$16dd2b22[1])[0];
            Object[] objArr54 = {new int[]{((int[]) objArrComponent3$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrComponent3$16dd2b22[2])[0]}, (String[]) objArrComponent3$16dd2b22[3]};
            int i86 = ~new Random().nextInt(1918838480);
            int i87 = i85 + 1383129592 + (((~(626370843 | i86)) | (-689129206)) * (-983)) + (((~(i86 | (-689129206))) | 554762257) * 983);
            int i88 = (i87 << 13) ^ i87;
            int i89 = i88 ^ (i88 >>> 17);
            ((int[]) objArr54[1])[0] = i89 ^ (i89 << 5);
            int i90 = ((int[]) objArr54[1])[0];
            Object[] objArr55 = {new int[]{((int[]) objArr54[0])[0]}, new int[1], new int[]{((int[]) objArr54[2])[0]}, (String[]) objArr54[3]};
            int streamVolume = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamVolume(3);
            int i91 = ~streamVolume;
            int i92 = i90 + 573756155 + (((~(40991650 | i91)) | (-109018111)) * 98) + (((~(i91 | (-103750013))) | 40991650 | (~(103750012 | streamVolume))) * (-49)) + (((~(streamVolume | 40991650)) | 5268098) * 49);
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            ((int[]) objArr55[1])[0] = i94 ^ (i94 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr8 = (String[]) objArrComponent3$16dd2b22[3];
            if (strArr8 != null) {
                for (String str5 : strArr8) {
                    arrayList3.add(str5);
                }
            }
            long j10 = -1;
            long j11 = ((long) (i83 ^ i84)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)));
            long j12 = 0;
            long j13 = j11 | (((long) 2) << 32) | (j12 - ((j12 >> 63) << 32));
            Object objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault26 == null) {
                objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke3 = ((Method) objCopydefault26).invoke(null, null);
            Object[] objArr56 = {333135638, Long.valueOf(j13), arrayList3, null, false, false};
            Object objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault27 == null) {
                objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6562, 55 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (KeyEvent.getMaxKeyCode() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault27).invoke(objInvoke3, objArr56);
            int i95 = ((int[]) objArrComponent3$16dd2b22[1])[0];
            Object[] objArr57 = {new int[]{((int[]) objArrComponent3$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrComponent3$16dd2b22[2])[0]}, (String[]) objArrComponent3$16dd2b22[3]};
            int streamMaxVolume2 = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
            int i96 = i95 + (-122871183) + (((~(574646095 | streamMaxVolume2)) | (-637404458)) * (-964)) + (((~((~streamMaxVolume2) | 574646095)) | (-670984048)) * (-964));
            int i97 = i96 ^ (i96 << 13);
            int i98 = i97 ^ (i97 >>> 17);
            ((int[]) objArr57[1])[0] = i98 ^ (i98 << 5);
            int[] iArr3 = new int[i84];
            int i99 = i84 - 1;
            iArr3[i99] = 1;
            Toast.makeText((Context) null, iArr3[((i84 * i99) % 2) - 1], 1).show();
            int i100 = ((int[]) objArr57[1])[0];
            Object[] objArr58 = {new int[]{((int[]) objArr57[0])[0]}, new int[1], new int[]{((int[]) objArr57[2])[0]}, (String[]) objArr57[3]};
            int iMyPid = Process.myPid();
            int i101 = ~iMyPid;
            int i102 = 495364417 + (((~((-134218243) | i101)) | (~((-653747709) | iMyPid))) * 520);
            int i103 = ~(653747708 | i101);
            int i104 = ~(iMyPid | 716506070);
            int i105 = i100 + i102 + ((i103 | i104) * (-1040)) + ((i104 | (~(i101 | (-716506071))) | (-787965951)) * 520);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr58[1])[0] = i107 ^ (i107 << 5);
        }
        Object objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
        if (objCopydefault28 == null) {
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2984;
            int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 48;
            char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 54462);
            byte b30 = (byte) 0;
            byte b31 = b30;
            Object[] objArr59 = new Object[1];
            b(b30, b31, b31, objArr59);
            objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iIndexOf4, maximumDrawingCacheSize2, 1571866973, false, (String) objArr59[0], null);
        }
        long j14 = ((Field) objCopydefault28).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
        if (objCopydefault29 == null) {
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2984;
            int mode = 48 - View.MeasureSpec.getMode(0);
            char offsetAfter = (char) (54462 - TextUtils.getOffsetAfter("", 0));
            byte b32 = (byte) 6;
            Object[] objArr60 = new Object[1];
            b(b32, (byte) (b32 - 5), (byte) (-$$a[51]), objArr60);
            objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, mode, offsetAfter, -1592726660, false, (String) objArr60[0], null);
        }
        if (j14 == ((jLongValue7 - ((((Field) objCopydefault29).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
            if (objCopydefault30 == null) {
                int iLastIndexOf3 = 2983 - TextUtils.lastIndexOf("", '0', 0);
                int packedPositionType2 = 48 - ExpandableListView.getPackedPositionType(0L);
                char c5 = (char) (54463 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                byte[] bArr8 = $$a;
                byte b33 = (byte) (-bArr8[49]);
                Object[] objArr61 = new Object[1];
                b(b33, (byte) (b33 - 4), (byte) (-bArr8[11]), objArr61);
                objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf3, packedPositionType2, c5, -635740813, false, (String) objArr61[0], null);
            }
            Object[] objArr62 = (Object[]) ((Field) objCopydefault30).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr62[0])[0]}, new int[]{((int[]) objArr62[1])[0]}, new int[1], (String[]) objArr62[3]};
            int iMyPid2 = Process.myPid();
            int i108 = (-600282421) + (((~(238733347 | iMyPid2)) | (-1874788196) | (~(1871984480 | iMyPid2))) * (-744)) + (((~iMyPid2) | 235929632) * 744) + ((iMyPid2 | 1874788195) * 744) + 713190288;
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            ((int[]) objArr3[2])[0] = i110 ^ (i110 << 5);
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                Object[] objArr63 = new Object[1];
                a(new int[]{69, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr63);
                Class<?> cls7 = Class.forName((String) objArr63[0]);
                Object[] objArr64 = new Object[1];
                a(new int[]{95, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr64);
                baseContext2 = (Context) cls7.getMethod((String) objArr64[0], new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr65 = new Object[1];
            a(new int[]{37, 16, 12, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr65);
            Class<?> cls8 = Class.forName((String) objArr65[0]);
            Object[] objArr66 = new Object[1];
            a(new int[]{53, 16, 41, 14}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr66);
            Object[] objArr67 = {baseContext2, Integer.valueOf(((Integer) cls8.getMethod((String) objArr66[0], Object.class).invoke(null, this)).intValue()), 0, 713190288};
            Object[] objArr68 = new Object[1];
            a(new int[]{69, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr68);
            Class<?> cls9 = Class.forName((String) objArr68[0]);
            Object[] objArr69 = new Object[1];
            a(new int[]{95, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr69);
            Method method2 = cls9.getMethod((String) objArr69[0], new Class[0]);
            char length = (char) (((Context) method2.invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 2908);
            Object[] objArr70 = new Object[1];
            a(new int[]{69, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr70);
            Class<?> cls10 = Class.forName((String) objArr70[0]);
            a(new int[]{95, 18, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new Object[1]);
            Object[] objArr71 = new Object[1];
            d(new char[]{8992, 1626, 26206, 58098, 46835, 17993, 53634, 36541, 37943, 19609, 43642, 45829, 37003, 38355, 52400, 47076, 13786, 54982, 39259, 4469, 32021, 37875, 63518, 57490, 52144, 60030, 29612, 56454, 23336, 18921, 8955, 43331, 33113, 41701, 17061, 45558, 20327, 1838, 50328, 61723, 1481, 62978, 44660, 50197, 34844, 4323, 13651, 10260, 22686, 38573, 27563, 8036, 19573, 40100, 58674, 46097, 10151, 60076, 40736, 18230, 39875, 56539, 50548, 956, 57647, 36798, 48217, 59511, 3060, 677, 23302, 60972, 3701, 13241, 26024, 61420, 31185, 25540, 20274, 62626, 31633, 33025, 49028, 31249, 19892, 43418, 6588, 27894, 61216, 46294, 65400, 40105, 61092, 48816, 27851, 50332, 54060, 23705, 29192, 28997, 52959, 32463, 58694, 44943, 41884, 12429, 17251, 52057, 21368}, new char[]{55095, 33339, 23943, 52747}, length, ((Context) cls10.getMethod((String) r12[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).length() - 2021508138, new char[]{0, 0, 0, 0}, objArr71);
            Class<?> cls11 = Class.forName(((String) objArr71[0]).intern());
            Object[] objArr72 = new Object[1];
            c(r3[14], (byte) (-$$j[46]), r3[19], objArr72);
            objArr3 = (Object[]) cls11.getMethod((String) objArr72[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr67);
            if (baseContext2 != null) {
                Object objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                if (objCopydefault31 == null) {
                    int windowTouchSlop = 2984 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int packedPositionGroup = 48 - ExpandableListView.getPackedPositionGroup(0L);
                    char cBlue = (char) (54462 - Color.blue(0));
                    byte[] bArr9 = $$a;
                    byte b34 = (byte) (-bArr9[49]);
                    Object[] objArr73 = new Object[1];
                    b(b34, (byte) (b34 - 4), (byte) (-bArr9[11]), objArr73);
                    objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, packedPositionGroup, cBlue, -635740813, false, (String) objArr73[0], null);
                }
                ((Field) objCopydefault31).set(null, objArr3);
                try {
                    long jLongValue8 = ((Long) Class.forName(str).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue8);
                    Object objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                    if (objCopydefault32 == null) {
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2984;
                        int minimumFlingVelocity = 48 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        char packedPositionChild = (char) (54461 - ExpandableListView.getPackedPositionChild(0L));
                        byte b35 = (byte) 6;
                        Object[] objArr74 = new Object[1];
                        b(b35, (byte) (b35 - 5), (byte) (-$$a[51]), objArr74);
                        objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize2, minimumFlingVelocity, packedPositionChild, -1592726660, false, (String) objArr74[0], null);
                    }
                    ((Field) objCopydefault32).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                    Object objCopydefault33 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                    if (objCopydefault33 == null) {
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 2984;
                        int packedPositionType3 = 48 - ExpandableListView.getPackedPositionType(0L);
                        char defaultSize2 = (char) (54462 - View.getDefaultSize(0, 0));
                        byte b36 = (byte) 0;
                        byte b37 = b36;
                        Object[] objArr75 = new Object[1];
                        b(b36, b37, b37, objArr75);
                        objCopydefault33 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState2, packedPositionType3, defaultSize2, 1571866973, false, (String) objArr75[0], null);
                    }
                    ((Field) objCopydefault33).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
        }
        int i111 = ((int[]) objArr3[0])[0];
        int i112 = ((int[]) objArr3[1])[0];
        if (i112 == i111) {
            int i113 = ((int[]) objArr3[2])[0];
            Object[] objArr76 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, new int[1], (String[]) objArr3[3]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i114 = ~startElapsedRealtime2;
            int i115 = (-1109231805) + (((~(1197059297 | i114)) | 807686658) * (-1188));
            int i116 = (~(startElapsedRealtime2 | (-1197059298))) | 807686658;
            int i117 = ~(913658530 | i114);
            int i118 = i113 + i115 + ((i116 | i117) * 594) + (((~((-1197059298) | i114)) | 1091087425 | i117) * 594);
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            ((int[]) objArr76[2])[0] = i120 ^ (i120 << 5);
            int i121 = ((int[]) objArr76[2])[0];
            Object[] objArr77 = {new int[]{((int[]) objArr76[0])[0]}, new int[]{((int[]) objArr76[1])[0]}, new int[1], (String[]) objArr76[3]};
            int i122 = Settings.System.getInt(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i123 = ~i122;
            int i124 = i121 + 1672875144 + (((~(i123 | 1789468339)) | 321249488) * (-1042)) + ((1789468339 | i122) * 521) + (((~(i122 | (-321249489))) | 35717264 | (~(i123 | 2075000563))) * 521);
            int i125 = (i124 << 13) ^ i124;
            int i126 = i125 ^ (i125 >>> 17);
            ((int[]) objArr77[2])[0] = i126 ^ (i126 << 5);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        String[] strArr9 = (String[]) objArr3[3];
        if (strArr9 != null) {
            for (String str6 : strArr9) {
                arrayList4.add(str6);
            }
        }
        long j15 = -1;
        long j16 = ((long) (i111 ^ i112)) & ((((long) 0) << 32) | (j15 - ((j15 >> 63) << 32)));
        long j17 = 0;
        long j18 = j16 | (((long) 3) << 32) | (j17 - ((j17 >> 63) << 32));
        Object objCopydefault34 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
        if (objCopydefault34 == null) {
            objCopydefault34 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6618, (ViewConfiguration.getEdgeSlop() >> 16) + 42, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
        }
        Object objInvoke4 = ((Method) objCopydefault34).invoke(null, null);
        Object[] objArr78 = {333135638, Long.valueOf(j18), arrayList4, null, false, false};
        Object objCopydefault35 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
        if (objCopydefault35 == null) {
            objCopydefault35 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 6562, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57, (char) View.MeasureSpec.getMode(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
        }
        ((Method) objCopydefault35).invoke(objInvoke4, objArr78);
        int i127 = ((int[]) objArr3[2])[0];
        Object[] objArr79 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, new int[1], (String[]) objArr3[3]};
        int i128 = ~(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) + 868030717);
        int i129 = i127 + (((~((-584494713) | i128)) | 47185928) * (-241)) + 631948088 + (((~(i128 | (-537308785))) | 1479037187) * 241);
        int i130 = (i129 << 13) ^ i129;
        int i131 = i130 ^ (i130 >>> 17);
        ((int[]) objArr79[2])[0] = i131 ^ (i131 << 5);
        throw null;
    }

    static {
        copy = 1;
        copydefault();
        copydefault = -3780477796495014671L;
        component2 = 599554719;
        component1 = (char) 50417;
        int i = getAsAtTimestamp + 65;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component3 = new char[]{33513, 33416, 33415, 33462, 33459, 33452, 33449, 33465, 33439, 33423, 33454, 33425, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33465, 33464, 33462, 33515, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33454, 33463, 33465, 33463, 33466, 33462, 33507, 33450, 33447, 33440, 33373, 33453, 33427, 33417, 33449, 33452, 33453, 33414, 33420, 33448, 33448, 33454, 33432, 33357, 33349, 33352, 33352, 33344, 33366, 33442, 33356, 33353, 33441, 33373, 33357, 33362, 33359, 33360, 33517, 33469, 33468, 33460, 33458, 33409, 33465, 33449, 33457, 33456, 33456, 33457, 33460, 33421, 33512, 33424, 33455, 33463, 33432, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33512, 33457, 33459, 33457, 33461, 33469, 33465, 33461, 33457, 33455, 33415, 33413, 33454, 33462, 33460, 33453, 33452, 33459};
    }
}
