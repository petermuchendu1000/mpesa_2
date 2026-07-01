package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesManager;", "", "<init>", "()V", "callback", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesCallback;", "getCallback", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesCallback;", "setCallback", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesCallback;)V", "requestUserScopes", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserscopesManager {
    public static final int $stable;
    public static final UserscopesManager INSTANCE;
    private static int ShareDataUIState;
    private static long component1;
    private static int component2;
    private static UserscopesCallback component3;
    private static char copydefault;
    private static final byte[] $$c = {Base64.padSymbol, -49, -70, 93};
    private static final int $$d = WSContextConstant.HANDSHAKE_RECEIVE_SIZE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 168;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r7, byte r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.UserscopesManager.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = 99 - r7
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.UserscopesManager.$$e(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r0 = 10 - r5
            int r7 = r7 * 4
            int r7 = r7 + 99
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.UserscopesManager.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            int r5 = 9 - r5
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L2a:
            r3 = r1[r6]
        L2c:
            int r7 = r7 + r3
            int r7 = r7 + (-26)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.UserscopesManager.b(byte, byte, short, java.lang.Object[]):void");
    }

    private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
        int i5 = $11 + 37;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $10 + 51;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iNormalizeMetaState = 4037 - KeyEvent.normalizeMetaState(i4);
                    int iIndexOf = 31 - TextUtils.indexOf("", "");
                    char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19180);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iIndexOf, c3, 1912513118, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i4) + 7568;
                        int absoluteGravity = 11 - Gravity.getAbsoluteGravity(i4, i4);
                        char bitsPerPixel2 = (char) ((-1) - ImageFormat.getBitsPerPixel(i4));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, absoluteGravity, bitsPerPixel2, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i9);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int i10 = 2460 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int iGreen = Color.green(i4) + 28;
                            char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b4 = (byte) ($$d & 7);
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i10, iGreen, c4, 931716605, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - ((Process.getThreadPriority(0) + 20) >> 6), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) Drawable.resolveOpacity(0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i11 = $11 + 47;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            i2 = 2;
                            i4 = 0;
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

    private UserscopesManager() {
    }

    public final UserscopesCallback getCallback() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        UserscopesCallback userscopesCallback = component3;
        int i5 = i3 + 81;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return userscopesCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCallback(UserscopesCallback userscopesCallback) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        component3 = userscopesCallback;
        int i5 = i3 + 67;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
    }

    public static void requestUserScopes$default(UserscopesManager userscopesManager, Activity activity, Bundle bundle, UserscopesCallback userscopesCallback, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 27;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        Object obj2 = null;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 55;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            userscopesCallback = null;
        }
        userscopesManager.requestUserScopes(activity, bundle, userscopesCallback);
    }

    public final void requestUserScopes(Activity activity, Bundle bundle, UserscopesCallback callback) throws Throwable {
        int i;
        int i2;
        long j;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 68, 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (19696 - TextUtils.getTrimmedLength("")), 520092524, false, "component2", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{13657, 41541, 32148, 34086, 41983, 59669, 8567, 19961, 13511, 24788, 45084, 41186, 39657, 23810, 26063, 41149, 7044, 26952, 65527, 38092, 30677, 11387}, new char[]{6075, 60904, 54169, 65018}, new char[]{0, 0, 0, 0}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        int i5 = 8;
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 59634), (-2083407810) - TextUtils.getOffsetBefore("", 0), new char[]{28015, 6929, 55998, 49307, 42467, 20610, 48224, 45394, 48339, 19334, 49681, 43417, 46268, 741, 52727}, new char[]{15921, 53688, 62083, 43240}, new char[]{0, 0, 0, 0}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int iMyUid = Process.myUid();
        long j2 = 306;
        long j3 = ((long) TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (j2 * 1728260138295978439L) + (j2 * 2727462958310531886L);
        long j4 = 305;
        long j5 = jLongValue;
        long j6 = -1;
        long j7 = iMyUid;
        long j8 = j3 + (((4034635362679385071L ^ j6) | ((j7 | 1728260138295978439L) ^ j6)) * j4) + (j4 * ((j6 ^ 2727462958310531886L) | (((j7 ^ j6) | 1728260138295978439L) ^ j6)));
        int i6 = 0;
        while (true) {
            if (i6 != 10) {
                int i7 = getRequestBeneficiariesState + 45;
                getAsAtTimestamp = i7 % 128;
                if (i7 % 2 == 0) {
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 37, 31 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault2).getInt(null);
                    j = j5;
                    i2 = 1;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault3).getInt(null);
                    i2 = 0;
                    j = j5;
                }
                while (true) {
                    int i8 = 0;
                    while (i8 != i5) {
                        i = (((((int) (j >> i8)) & 255) + (i << 6)) + (i << 16)) - i;
                        i8++;
                        i5 = 8;
                    }
                    if (i2 != 0) {
                        break;
                    }
                    int i9 = getRequestBeneficiariesState + 31;
                    getAsAtTimestamp = i9 % 128;
                    int i10 = i9 % 2;
                    i2++;
                    j = j8;
                    i5 = 8;
                }
                if (i == i4) {
                    break;
                }
                int i11 = getAsAtTimestamp + 71;
                getRequestBeneficiariesState = i11 % 128;
                if (i11 % 2 != 0) {
                    j5 ^= 1024;
                    i6 += 53;
                } else {
                    j5 -= 1024;
                    i6++;
                }
                i5 = 8;
            } else {
                Object[] objArr3 = new Object[1];
                a((char) ((Process.myTid() >> 22) + 39755), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{15290, 28428, 47118, 18992, 56258, 50724, 4304, 24974, 57701, 15108, 47758, 23182, 31626, 7727, 14322, 36924}, new char[]{19542, 51725, 19235, 35227}, new char[]{0, 0, 0, 0}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27559), ViewConfiguration.getScrollBarSize() >> 8, new char[]{51079, 47873, 15655, 55582, 14899, 22614, 60149, 45723, 12320, 34916, 16054, 42200, 49038, 64724, 6118, 28738}, new char[]{64487, 44686, 42898, 20331}, new char[]{0, 0, 0, 0}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {80191654};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1663 - View.MeasureSpec.getSize(0), 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 2003846412, ((Constructor) objCopydefault4).newInstance(objArr5), false};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault5 == null) {
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1454;
                        int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, maxKeyCode, cMakeMeasureSpec, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1591, 39 - Color.green(0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr6);
                    int i12 = ((int[]) objArr8[2])[0];
                    int i13 = ((int[]) objArr8[1])[0];
                    if (i13 != i12) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i14 = getRequestBeneficiariesState + 19;
                            getAsAtTimestamp = i14 % 128;
                            int i15 = i14 % 2;
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j9 = -1;
                        long j10 = 0;
                        long j11 = (((j9 - ((j9 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i13 ^ i12))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), Color.red(0) + 42, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                        Object[] objArr9 = {80191654, Long.valueOf(j11), arrayList, null, false, false};
                        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault7 == null) {
                            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6561, 55 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Color.alpha(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault7).invoke(objInvoke, objArr9);
                        int[] iArr = new int[i13];
                        int i16 = i13 - 1;
                        iArr[i16] = 1;
                        Toast.makeText((Context) null, iArr[((i13 * i16) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        component3 = callback;
        RouteUtils.routeWithExecute(RoutePathConstant.SFC_MINIAPP_SCOPES_REQUEST, bundle);
    }

    static {
        ShareDataUIState = 0;
        ShareDataUIState();
        INSTANCE = new UserscopesManager();
        $stable = 8;
        int i = equals + 83;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = -3780477796495014671L;
        component2 = 1386857713;
        copydefault = (char) 6299;
    }
}
