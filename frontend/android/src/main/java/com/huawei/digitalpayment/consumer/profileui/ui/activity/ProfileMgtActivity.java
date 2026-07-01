package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ActivityProfileMgtBinding;
import com.huawei.digitalpayment.consumer.profileui.ui.adapter.MgtAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.getActiveNotifications;
import kotlin.getSmallIconId;

public class ProfileMgtActivity extends Hilt_ProfileMgtActivity<ActivityProfileMgtBinding, ProfileViewModel> {
    private static int ArtificialStackFrames;
    private static int ShareDataUIState;
    private static char component1;
    private static char[] component2;
    private static int[] component3;
    private static byte[] component4;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private static short[] getRequestBeneficiariesState;
    private MgtAdapter mgtAdapter;
    private static final byte[] $$l = {1, -128, 109, -128};
    private static final int $$o = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {119, -40, Ascii.DLE, 123, -9, 2, -6, Ascii.CAN, 2, 2, 8, -17, Ascii.FF, -5, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 68, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, 3, Ascii.DC2, -18, 10, -14, Ascii.DLE, 36, -26, -16, Ascii.SYN, Ascii.SI, Ascii.SI, -7, -30, Ascii.SYN, -16, Ascii.DC2};
    private static final int $$k = 115;
    private static final byte[] $$d = {120, -46, -95, -23, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 131;
    private static int toString = 1;
    private static int copy = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.$$l
            int r7 = r7 + 104
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.$$r(byte, byte, short):java.lang.String");
    }

    private static void i(byte b2, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i = (s * 2) + 83;
        int i2 = s2 + 4;
        byte[] bArr2 = new byte[28 - b2];
        int i3 = 27 - b2;
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i = (i + i3) - 8;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i2];
                i2++;
                i = (i + b3) - 8;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.$$j
            int r1 = 42 - r7
            byte[] r1 = new byte[r1]
            int r7 = 41 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + 3
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.k(int, short, byte, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(ProfileMgtActivity profileMgtActivity) {
        int i = 2 % 2;
        int i2 = equals + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = profileMgtActivity.binding;
        int i4 = copy + 77;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        throw null;
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component3;
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 49;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            byte b2 = (byte) ($$l[0] - 1);
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 4391, ExpandableListView.getPackedPositionGroup(0L) + 37, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -309236339, false, $$r(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            int i10 = 4391 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37;
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                            byte b4 = (byte) ($$l[0] - 1);
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i10, scrollDefaultDelay, bitsPerPixel, -309236339, false, $$r(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                i5 = 684241640;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = $11 + 97;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 4;
            }
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 9;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    try {
                        Object[] objArr4 = new Object[i6];
                        objArr4[i7] = Integer.valueOf(iArr5[i13]);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            int iGreen = 4391 - Color.green(i7);
                            int iRgb = (-16777179) - Color.rgb(i7, i7, i7);
                            char capsMode = (char) TextUtils.getCapsMode("", i7, i7);
                            byte b6 = (byte) ($$l[i7] - 1);
                            byte b7 = b6;
                            i2 = length3;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, iRgb, capsMode, -309236339, false, $$r(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE});
                        } else {
                            i2 = length3;
                        }
                        iArr6[i13] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    i2 = length3;
                    Object[] objArr5 = {Integer.valueOf(iArr5[i13])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault4 == null) {
                        int iRgb2 = (-16772825) - Color.rgb(0, 0, 0);
                        int windowTouchSlop = 37 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        byte b8 = (byte) ($$l[0] - 1);
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRgb2, windowTouchSlop, offsetBefore, -309236339, false, $$r(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    i13++;
                }
                length3 = i2;
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i15 = i7;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        getactivenotifications.component1 = i15;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i15] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i16];
                try {
                    Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault5 == null) {
                        int iMyTid = 2968 - (Process.myTid() >> 22);
                        int iIndexOf = 16 - TextUtils.indexOf("", "");
                        char offsetBefore2 = (char) (49871 - TextUtils.getOffsetBefore("", 0));
                        byte b10 = (byte) ($$l[0] - 1);
                        byte b11 = b10;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, iIndexOf, offsetBefore2, 462826032, false, $$r(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i16++;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                int gidForName = Process.getGidForName("") + 2945;
                int iGreen2 = 24 - Color.green(0);
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27637);
                byte b12 = (byte) ($$l[0] - 1);
                byte b13 = b12;
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iGreen2, threadPriority, -1616366948, false, $$r(b12, b13, (byte) (b13 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            i15 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void h(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            char c2 = '0';
            if (objCopydefault == null) {
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1000;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 31;
                char cResolveSize = (char) (View.resolveSize(0, 0) + 61685);
                byte b3 = (byte) ($$l[0] - 1);
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, longPressTimeout, cResolveSize, 1874745193, false, $$r(b3, b4, (byte) (b4 | 9)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            long j = 0;
            if (z) {
                byte[] bArr = component4;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 41;
                        $10 = i10 % 128;
                        if (i10 % i5 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) ($$l[0] - 1);
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 47 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (54461 - TextUtils.indexOf("", c2, 0, 0)), -1178636483, false, $$r(b5, b6, (byte) (b6 | Ascii.FF)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault3 == null) {
                                    int iAlpha = Color.alpha(0) + 2984;
                                    int i11 = 48 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    char cArgb = (char) (54462 - Color.argb(0, 0, 0, 0));
                                    byte b7 = (byte) ($$l[0] - 1);
                                    byte b8 = b7;
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, i11, cArgb, -1178636483, false, $$r(b7, b8, (byte) (b8 | Ascii.FF)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                                i9++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i5 = 2;
                        c2 = '0';
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $10 + 125;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = component4;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        int iAlpha2 = Color.alpha(0) + 999;
                        int i14 = 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        char minimumFlingVelocity = (char) (61685 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b9 = (byte) ($$l[0] - 1);
                        byte b10 = b9;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha2, i14, minimumFlingVelocity, 1874745193, false, $$r(b9, b10, (byte) (b10 | 9)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i15 = $10 + 81;
                int i16 = i15 % 128;
                $11 = i16;
                int i17 = i15 % 2;
                int i18 = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ 7083766810336261929L));
                if (!z) {
                    i4 = 0;
                } else {
                    int i19 = i16 + 47;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    i4 = 1;
                }
                getsmalliconid.copydefault = i18 + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(getAsAtTimestamp), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int i21 = 1698 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iResolveSize = View.resolveSize(0, 0) + 37;
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    byte b11 = (byte) ($$l[0] - 1);
                    byte b12 = b11;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i21, iResolveSize, cIndexOf, -1454191902, false, $$r(b11, b12, (byte) (b12 | 8)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component4;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i22 = 0; i22 < length2; i22++) {
                        int i23 = $10 + 81;
                        $11 = i23 % 128;
                        int i24 = i23 % 2;
                        bArr5[i22] = (byte) (((long) bArr4[i22]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        int i25 = $10 + 59;
                        $11 = i25 % 128;
                        int i26 = i25 % 2;
                        byte[] bArr6 = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ff  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = equals + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.mgt_title_why);
        if (i3 == 0) {
            super.initToolbar(string);
        } else {
            super.initToolbar(string);
            int i4 = 99 / 0;
        }
    }

    private void initData() {
        int i = 2 % 2;
        this.mgtAdapter.setNewInstance(new ArrayList());
        int i2 = equals + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void j(byte b2, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7422, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, (char) (64291 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - Gravity.getAbsoluteGravity(0, 0), 14 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (44463 - KeyEvent.keyCodeFromString("")), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i11 = $10 + 31;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) ($$l[0] - 1);
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2944, 23 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27637), 794909189, false, $$r(b3, b4, (byte) (b4 | Ascii.SI)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i14 = $11 + 99;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i16 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i16];
                            cArr4[cancelall.component2 + 1] = cArr2[i17];
                        } else {
                            int i18 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i18];
                            cArr4[cancelall.component2 + 1] = cArr2[i19];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void initView() {
        int i = 2 % 2;
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        this.mgtAdapter = new MgtAdapter();
        ((ActivityProfileMgtBinding) this.binding).recycleview.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(getColor(R.color.color_divide_line), DensityUtils.dp2px(this, 0.5f));
        recycleViewDivider.setPadding(DensityUtils.dp2px(this, 12.0f), 0, DensityUtils.dp2px(this, 12.0f), 0);
        ((ActivityProfileMgtBinding) this.binding).recycleview.addItemDecoration(recycleViewDivider);
        ((ActivityProfileMgtBinding) this.binding).recycleview.setAdapter(this.mgtAdapter);
        this.mgtAdapter.setOnItemClickListener(new OnItemClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onItemClick(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i2) {
                LoadingButton loadingButton;
                boolean z;
                int i3 = 2 % 2;
                int i4 = component2 + 95;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    ProfileMgtActivity.m10890$$Nest$fgetmgtAdapter(ProfileMgtActivity.this).setSelectPositon(i2);
                    loadingButton = ((ActivityProfileMgtBinding) ProfileMgtActivity.access$000(ProfileMgtActivity.this)).lbNext;
                    z = false;
                } else {
                    ProfileMgtActivity.m10890$$Nest$fgetmgtAdapter(ProfileMgtActivity.this).setSelectPositon(i2);
                    loadingButton = ((ActivityProfileMgtBinding) ProfileMgtActivity.access$000(ProfileMgtActivity.this)).lbNext;
                    z = true;
                }
                loadingButton.setEnabled(z);
            }
        });
        ((ActivityProfileMgtBinding) this.binding).lbNext.setOnClickListener(new View.OnClickListener(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 121;
                ShareDataUIState = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        Callback.onClick_enter(view);
                        RouteUtils.routeWithExecute(RoutePathConstants.PROFILE_MGT_CONFIRM);
                        Callback.onClick_exit();
                        int i4 = 59 / 0;
                    } else {
                        Callback.onClick_enter(view);
                        RouteUtils.routeWithExecute(RoutePathConstants.PROFILE_MGT_CONFIRM);
                        Callback.onClick_exit();
                    }
                } catch (Throwable th) {
                    Callback.onClick_exit();
                    throw th;
                }
            }
        });
        ((ActivityProfileMgtBinding) this.binding).lbSkip.setOnClickListener(new View.OnClickListener(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Callback.onClick_enter(view);
                try {
                    RouteUtils.routeWithExecute(RoutePathConstants.PROFILE_MGT_CONFIRM);
                    Callback.onClick_exit();
                    int i5 = component3 + 41;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                } catch (Throwable th) {
                    Callback.onClick_exit();
                    throw th;
                }
            }
        });
        int i2 = copy + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_profile_mgt;
        if (i3 != 0) {
            int i5 = 87 / 0;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 63;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).length() + 25, new int[]{1619465074, 52634869, 1556486597, 530187862, 644065885, 71096260, 1942239301, -120245260, 396809922, -823132599, -1989971049, -1036909173, -697669056, 1438881050}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 14, new int[]{195559709, -1544745324, -1524818310, -563515889, -235602062, -1431782869, -1284585722, -733085802, 817358717, -2122036388}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i3 = equals + 113;
                    copy = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 6619, 42 - Color.green(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 56 - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            super.onPause();
            int i5 = equals + 117;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
                return;
            }
            return;
        }
        getBaseContext();
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r53) {
        /*
            Method dump skipped, instruction units count: 15314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtActivity.attachBaseContext(android.content.Context):void");
    }

    static MgtAdapter m10890$$Nest$fgetmgtAdapter(ProfileMgtActivity profileMgtActivity) {
        int i = 2 % 2;
        int i2 = copy + 51;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MgtAdapter mgtAdapter = profileMgtActivity.mgtAdapter;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 125;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return mgtAdapter;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 79;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 43;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        ArtificialStackFrames = 0;
        component1();
        component2 = new char[]{2025, 1966, 2019, 2030, 2023, 2018, 2029, 2041, 2024, 2031, 2034, 2016, 2017, 2035, 2037, 2020, 1050, 2039, 2032, 2021, 2028, 2002, 2022, 2036, 1986};
        component1 = (char) 12831;
        int i = toString + 11;
        ArtificialStackFrames = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        component3 = new int[]{2048158357, 975221509, -480012744, 9969475, 125255179, -2038166826, -1373634753, -541575762, -1183796830, -1076164218, -1971662207, 388989560, -1766245502, -781861199, 2085792337, -1602202826, -1449302480, -501115795};
        copydefault = 1755287777;
        ShareDataUIState = -238323914;
        getAsAtTimestamp = 1407428446;
        component4 = new byte[]{-49, 43, -60, Ascii.FF, -36, 56, 35, -16, Ascii.SO, -14, 8, -15, -13, -40, -13, 39, 10, Ascii.FF, Ascii.FF, -62, -15, -14, 13, 8, -14, 35, -61, 35, 9, -62, 34, Ascii.SO, -33, 33, 13, 9, -62, 33, -36, 63, -9, 13, Ascii.SO, -34, 62, -58, Ascii.SI, 33, Ascii.FF, -35, 56, -11, -43, 8, -102, -75, 74, -80, 78, 103, -80, 75, -122, -76, 75, 76, 98, -104, -78, 122, -123, 77, -67, 77, 74, -73, 75, 102, -103, 96, -121, -75, 121, -103, -78, 126, -121, -76, 123, -123, 73, 102, -124, 74, 74, -75, -79, 73, -76, 102, 74, -73, -103, -79, 77, 101, -73, -76, -103, -75, -73, 72, -79, 121, -104, 102, -126, -40, -77, 74, -70, 65, -99, -98, 124, 66, -74, 78, -123, 118, 80, -82, 76, -40, -89, 83, -118, 125, 83, -76, -65, 105, -93, -83, 83, -96, -81, -89, 93, -34, Ascii.FF, -16, 7, 45, -46, Ascii.FF, -11, 5, -2, 34, 33, -65, 0, 69, -50, -1, -2, -7, 10, -14, 9, -59, 98, -103, 102, -99, 96, 97, -100, -104, 100, -104, 8, -57, -11, -58, 62, 57, Ascii.DC2, -58, -19, Ascii.DC2, 56, -11, Ascii.SYN, 59, -22, 20, -11, 20, -9, 9, 58, -14, 57, 9, -22, -60, 56, 57, -61, 60, Ascii.DC2, -20, -64, Ascii.VT, -12, Ascii.SYN, 57, -22, -58, -61, 57, Ascii.ETB, -58, -59, -20, Ascii.ETB, -10, 56, Ascii.NAK, -12, 57, 57, 20, 58, -10, Ascii.SYN, -21, 17, 56, 56, -12, Ascii.VT, -20, 20, -59, -40, -39, 33, -33, 38, 36, -34, -40, 37, -37, -62, 80, -83, -88, -88, 83, -87, -88, -86, 84};
    }
}
