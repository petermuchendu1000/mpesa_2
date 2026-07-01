package com.huawei.digitalpayment.consumer.remoteconfig.service;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.http.HaProxyConstants;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/service/PackageUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "onReceive", "", "context", "Landroid/content/Context;", IpcMessageConstants.EXTRA_INTENT, "Landroid/content/Intent;", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class PackageUpdateReceiver extends Hilt_PackageUpdateReceiver {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static int[] copydefault;
    private static int getRequestBeneficiariesState;

    @Inject
    public RemoteConfig remoteConfig;
    private static final byte[] $$l = {86, 117, -27, 75};
    private static final int $$m = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {102, Ascii.GS, -34, 39, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, PSSSigner.TRAILER_IMPLICIT, Ascii.VT, -3, -64, 56, 7, -1, -9, 4, -8, -56, TarHeader.LF_BLK, Ascii.SO, 6, -10, 3, -6, -66, 69, -12, 4, -4, -62, 68, -12, -8, 2, 0, -2, -55, 65, 1, -4, 4, -6, -14, Ascii.DC2, -16, -57, Ascii.DC2, 44, 10, -42, 33, -4, 4, -6};
    private static final int $$k = 75;
    private static final byte[] $$d = {Ascii.SI, -12, 105, 108, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$e = 188;
    private static int getAsAtTimestamp = 0;
    private static int equals = 0;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r7, byte r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver.$$l
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r7 = r7 + 104
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver.$$n(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver.$$d
            int r5 = r5 + 4
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r1 = r6 + 10
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r5]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver.e(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 99
            int r7 = r7 * 37
            int r7 = 47 - r7
            int r9 = r9 * 9
            int r9 = 12 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r9 = r9 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.PackageUpdateReceiver.g(short, int, byte, java.lang.Object[]):void");
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        int i2 = equals + 7;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        RemoteConfig remoteConfig = this.remoteConfig;
        Object obj = null;
        if (remoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 49;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return remoteConfig;
        }
        obj.hashCode();
        throw null;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = copy + 125;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(remoteConfig, "");
        this.remoteConfig = remoteConfig;
        int i3 = equals + 101;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i3 = $10 + 57;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 844, 32 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (23251 - (ViewConfiguration.getTapTimeout() >> 16)), 592652048, false, $$n((byte) 7, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0') + 33, (char) (23251 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 592652048, false, $$n((byte) 7, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 465, TextUtils.indexOf("", "", 0) + 49, (char) TextUtils.indexOf("", ""), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = copydefault;
        char c2 = '0';
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        int iLastIndexOf = 4390 - TextUtils.lastIndexOf("", c2, i6);
                        int capsMode = TextUtils.getCapsMode("", i6, i6) + 37;
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c2, i6, i6) + 1);
                        byte b2 = (byte) ($$m & 7);
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, capsMode, cLastIndexOf, -309236339, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $10 + 85;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 % 5;
                    }
                    c2 = '0';
                    i4 = 684241640;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = copydefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 29;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr5[i10]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int iLastIndexOf2 = 4390 - TextUtils.lastIndexOf("", '0');
                        int iIndexOf = TextUtils.indexOf("", "") + 37;
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b4 = (byte) ($$m & 7);
                        byte b5 = (byte) (b4 - 2);
                        i2 = length3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, iIndexOf, pressedStateDuration, -309236339, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE});
                    } else {
                        i2 = length3;
                    }
                    iArr6[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    length3 = i2;
                    i10 = 0;
                } else {
                    int i12 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        int iMyTid = (Process.myTid() >> 22) + 4391;
                        int i13 = 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        byte b6 = (byte) ($$m & 7);
                        byte b7 = (byte) (b6 - 2);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i13, gidForName, -309236339, false, $$n(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i10++;
                    length3 = i12;
                }
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i14];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 16, (char) (49871 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 462826032, false, $$n(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 3;
                byte b11 = (byte) (b10 - 3);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - View.getDefaultSize(0, 0), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (27638 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1616366948, false, $$n(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v92, types: [boolean, int] */
    @Override
    public void onReceive(Context context, Intent intent) throws Throwable {
        Context applicationContext;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        String str;
        Object[] objArr4;
        Object[] objArr5;
        char c2;
        Object[] objArr6;
        char c3;
        Context applicationContext2 = context;
        char c4 = 2;
        int i = 2 % 2;
        int i2 = copy + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr7 = new Object[1];
        d(Process.getGidForName("") + 23, new char[]{47605, 6510, 4282, 23471, 4520, 38249, 2691, 57981, 25304, 8223, 8601, 16223, 41875, 17150, 20783, 63324, 41286, 600, 19326, 13465, 35701, 37498}, objArr7);
        String str2 = (String) objArr7[0];
        Object[] objArr8 = new Object[1];
        d(16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{48150, 20952, 14400, 9861, 46375, 24457, 12947, 23370, 5047, 41915, 36565, 58781, 60851, 56863, 52750, 34105}, objArr8);
        String str3 = (String) objArr8[0];
        super.onReceive(context, intent);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(534243434);
        if (objCopydefault == null) {
            int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1183;
            int i5 = 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            byte b2 = (byte) ($$d[30] + 1);
            byte b3 = (byte) (-b2);
            Object[] objArr9 = new Object[1];
            e(b2, b3, b3, objArr9);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, i5, cIndexOf, -628214001, false, (String) objArr9[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
            if (objCopydefault2 == null) {
                int minimumFlingVelocity = 1184 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iLastIndexOf = 15 - TextUtils.lastIndexOf("", '0');
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                byte b4 = (byte) 0;
                Object[] objArr10 = new Object[1];
                e((byte) ($$d[24] - 1), b4, (byte) (b4 + 1), objArr10);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iLastIndexOf, gidForName, -5487455, false, (String) objArr10[0], null);
            }
            Object[] objArr11 = (Object[]) ((Field) objCopydefault2).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr11[1])[0];
            int i7 = ((int[]) objArr11[2])[0];
            String[] strArr = (String[]) objArr11[0];
            int i8 = (((136384840 | r4) * (-196)) - 1159539920) + (((~(System.identityHashCode(this) | 262869325)) | 126484485) * 196) + 1244776299;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            if (applicationContext2 != null) {
                int i11 = equals + 83;
                copy = i11 % 128;
                int i12 = i11 % 2;
                applicationContext = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = applicationContext2;
            }
            Object[] objArr12 = new Object[1];
            d((ViewConfiguration.getPressedStateDuration() >> 16) + 16, new char[]{4406, 63481, 27253, 36337, 20041, 26394, 47605, 6510, 24113, 32439, 43933, 46927, 61429, 29881, 21463, 65314}, objArr12);
            Class<?> cls = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            d(16 - TextUtils.indexOf("", "", 0), new char[]{26601, 21077, 42629, 18273, 59468, 37690, 14539, 32881, 22050, 32064, 10347, 36709, 52025, 57584, 32493, 7426}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, Integer.valueOf(((Integer) cls.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue()), 0, 1244776299};
                Object[] objArr15 = new Object[1];
                f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 112, new int[]{-1870529563, -1517109165, -1443689084, 222413214, -931174016, 1024842600, 292439366, 1747582739, -247045460, -992960853, -1827628235, 868670609, -1747119266, -267638550, -1006270464, 1647519807, 941356717, 734086980, -1684084903, -1545048117, 1819700526, -100922980, -968908482, -773199751, 1240704600, 1047902542, 288350320, -1336343309, 1955680619, 2126068396, 181170608, -197258549, -213649470, -510550872, 1877850679, 85554499, 685668118, -75488311, 1064269917, 2145843209, -1856012130, -316930447, 51724218, -713283196, 915947175, 307876041, -2016259643, -801367899, 779146444, 1931331557, 1616044846, 1920016313, -1271427754, -343742767, -462090090, 702434849}, objArr15);
                Class<?> cls2 = Class.forName(((String) objArr15[0]).intern());
                byte b5 = $$j[43];
                Object[] objArr16 = new Object[1];
                g(b5, r8[39], b5, objArr16);
                objArr = (Object[]) cls2.getMethod((String) objArr16[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
                if (objCopydefault3 == null) {
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1184;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 16;
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    byte b6 = (byte) 0;
                    Object[] objArr17 = new Object[1];
                    e((byte) ($$d[24] - 1), b6, (byte) (b6 + 1), objArr17);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, offsetAfter, capsMode, -5487455, false, (String) objArr17[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    long jLongValue = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1260029028);
                    if (objCopydefault4 == null) {
                        int pressedStateDuration = 1184 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iMyTid = 16 - (Process.myTid() >> 22);
                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                        Object[] objArr18 = new Object[1];
                        e(r14[5], (byte) ($$d[31] + 1), (byte) 0, objArr18);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, iMyTid, offsetAfter2, -1908188415, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(534243434);
                    if (objCopydefault5 == null) {
                        int touchSlop = 1184 - (ViewConfiguration.getTouchSlop() >> 8);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 17;
                        char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                        byte b7 = (byte) ($$d[30] + 1);
                        byte b8 = (byte) (-b7);
                        Object[] objArr19 = new Object[1];
                        e(b7, b8, b8, objArr19);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, iIndexOf, capsMode2, -628214001, false, (String) objArr19[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
                    c4 = 2;
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
        int i13 = ((int[]) objArr[c4])[0];
        int i14 = ((int[]) objArr[1])[0];
        try {
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[0];
                if (strArr2 != null) {
                    for (String str4 : strArr2) {
                        arrayList.add(str4);
                    }
                }
                long j = -1;
                long j2 = ((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                long j3 = 0;
                long j4 = j2 | (((long) 4) << 32) | (j3 - ((j3 >> 63) << 32));
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6618, View.resolveSize(0, 0) + 42, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                Object[] objArr20 = {-1998931746, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0), 55 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault7).invoke(objInvoke, objArr20);
                Object[] objArr21 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
                int i15 = ((int[]) objArr[3])[0];
                int i16 = ((int[]) objArr[1])[0];
                int i17 = ((int[]) objArr[2])[0];
                String[] strArr3 = (String[]) objArr[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i18 = ~iIdentityHashCode;
                int i19 = i15 + 2136248592 + (((~((-856709177) | i18)) | (~((-338248621) | i18))) * (-867)) + (((~((-856709177) | iIdentityHashCode)) | 268451880 | (~((-338248621) | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | (-69796741))) | (~(i18 | (-268451881))) | (~((-588257297) | iIdentityHashCode))) * 867);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr21[3])[0] = i21 ^ (i21 << 5);
                throw new RuntimeException(String.valueOf(i14));
            }
            Object[] objArr22 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i22 = ((int[]) objArr[3])[0];
            int i23 = ((int[]) objArr[1])[0];
            int i24 = ((int[]) objArr[2])[0];
            String[] strArr4 = (String[]) objArr[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i25 = ~((-24957243) | elapsedCpuTime);
            int i26 = (-197315932) + ((4198672 | i25) * (-280)) + ((i25 | (~((-1170000555) | elapsedCpuTime))) * 140);
            int i27 = ~((-20758571) | elapsedCpuTime);
            int i28 = ~elapsedCpuTime;
            int i29 = i22 + i26 + (((~(i28 | (-1149241985))) | i27 | (~((-4198673) | i28))) * 140);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr22[3])[0] = i31 ^ (i31 << 5);
            Object[] objArr23 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i32 = ((int[]) objArr22[3])[0];
            int i33 = ((int[]) objArr22[1])[0];
            int i34 = ((int[]) objArr22[2])[0];
            String[] strArr5 = (String[]) objArr22[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i35 = i32 + 1473398596 + (((~((-413292486) | iIdentityHashCode2)) | 142754821) * 104) + ((~((~iIdentityHashCode2) | 1052202975)) * (-104)) + ((iIdentityHashCode2 | 781665311) * 104);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr23[3])[0] = i37 ^ (i37 << 5);
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
            if (objCopydefault8 == null) {
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1454;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 23;
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                byte b9 = (byte) ($$d[30] + 1);
                byte b10 = (byte) (-b9);
                Object[] objArr24 = new Object[1];
                e(b9, b10, b10, objArr24);
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, iLastIndexOf2, deadChar, 1557109104, false, (String) objArr24[0], null);
            }
            long j5 = ((Field) objCopydefault8).getLong(null);
            long jLongValue2 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
            if (objCopydefault9 == null) {
                int iLastIndexOf3 = 1453 - TextUtils.lastIndexOf("", '0');
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                byte b11 = (byte) 0;
                Object[] objArr25 = new Object[1];
                e((byte) ($$d[25] - 1), b11, (byte) (b11 + 1), objArr25);
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf3, threadPriority, bitsPerPixel, -1255888033, false, (String) objArr25[0], null);
            }
            if (j5 == ((jLongValue2 - ((((Field) objCopydefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
                if (objCopydefault10 == null) {
                    int longPressTimeout = 1454 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int mirror = AndroidCharacter.getMirror('0') - 26;
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    byte b12 = (byte) 0;
                    Object[] objArr26 = new Object[1];
                    e((byte) ($$d[24] - 1), b12, (byte) (b12 + 1), objArr26);
                    objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, mirror, touchSlop2, -1254718500, false, (String) objArr26[0], null);
                }
                Object[] objArr27 = (Object[]) ((Field) objCopydefault10).get(null);
                objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr27[1])[0]}, new int[]{((int[]) objArr27[2])[0]}, (String[]) objArr27[3]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i38 = 1387452942 + (((~(508436410 | iIdentityHashCode3)) | 893360916) * 672);
                int i39 = ~iIdentityHashCode3;
                int i40 = i38 + (((~(iIdentityHashCode3 | 893360916)) | (~((-508436411) | i39))) * (-672)) + (((~((-893360917) | i39)) | 556892164) * 672) + 231031879;
                int i41 = (i40 << 13) ^ i40;
                int i42 = i41 ^ (i41 >>> 17);
                ((int[]) objArr3[0])[0] = i42 ^ (i42 << 5);
            } else {
                Object[] objArr28 = new Object[1];
                d(TextUtils.getOffsetBefore("", 0) + 16, new char[]{4406, 63481, 27253, 36337, 20041, 26394, 47605, 6510, 24113, 32439, 43933, 46927, 61429, 29881, 21463, 65314}, objArr28);
                Class<?> cls3 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                d(15 - TextUtils.lastIndexOf("", '0'), new char[]{26601, 21077, 42629, 18273, 59468, 37690, 14539, 32881, 22050, 32064, 10347, 36709, 52025, 57584, 32493, 7426}, objArr29);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr30 = {-1998931746};
                Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                if (objCopydefault11 == null) {
                    objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(1663 - TextUtils.getOffsetBefore("", 0), Color.argb(0, 0, 0, 0) + 10, (char) Gravity.getAbsoluteGravity(0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr31 = {Integer.valueOf(iIntValue), 0, 231031879, ((Constructor) objCopydefault11).newInstance(objArr30), false};
                Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                if (objCopydefault12 == null) {
                    int absoluteGravity = 1454 - Gravity.getAbsoluteGravity(0, 0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                    byte b13 = (byte) 0;
                    Object[] objArr32 = new Object[1];
                    e((byte) 42, b13, (byte) (b13 + 1), objArr32);
                    objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, iNormalizeMetaState, cIndexOf2, 1908380642, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 1591, 39 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) View.resolveSize(0, 0)), Boolean.TYPE});
                }
                Object[] objArr33 = (Object[]) ((Method) objCopydefault12).invoke(null, objArr31);
                Object objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
                if (objCopydefault13 == null) {
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1454;
                    int size = View.MeasureSpec.getSize(0) + 22;
                    char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                    byte b14 = (byte) 0;
                    Object[] objArr34 = new Object[1];
                    e((byte) ($$d[24] - 1), b14, (byte) (b14 + 1), objArr34);
                    objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(deadChar2, size, offsetAfter3, -1254718500, false, (String) objArr34[0], null);
                }
                ((Field) objCopydefault13).set(null, objArr33);
                try {
                    long jLongValue3 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
                    if (objCopydefault14 == null) {
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1454;
                        int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
                        char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                        byte b15 = (byte) 0;
                        objArr2 = objArr33;
                        Object[] objArr35 = new Object[1];
                        e((byte) ($$d[25] - 1), b15, (byte) (b15 + 1), objArr35);
                        objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout2, iKeyCodeFromString, offsetBefore2, -1255888033, false, (String) objArr35[0], null);
                    } else {
                        objArr2 = objArr33;
                    }
                    ((Field) objCopydefault14).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
                    if (objCopydefault15 == null) {
                        int iRed = Color.red(0) + 1454;
                        int iBlue = Color.blue(0) + 22;
                        char cIndexOf3 = (char) TextUtils.indexOf("", "");
                        byte b16 = (byte) ($$d[30] + 1);
                        byte b17 = (byte) (-b16);
                        Object[] objArr36 = new Object[1];
                        e(b16, b17, b17, objArr36);
                        objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(iRed, iBlue, cIndexOf3, 1557109104, false, (String) objArr36[0], null);
                    }
                    ((Field) objCopydefault15).set(null, lValueOf4);
                    objArr3 = objArr2;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i43 = ((int[]) objArr3[2])[0];
            int i44 = ((int[]) objArr3[1])[0];
            if (i44 != i43) {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr6 = (String[]) objArr3[3];
                if (strArr6 != null) {
                    int i45 = equals + 65;
                    copy = i45 % 128;
                    int i46 = i45 % 2;
                    for (String str5 : strArr6) {
                        arrayList2.add(str5);
                    }
                }
                long j6 = -1;
                long j7 = ((long) (i43 ^ i44)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
                long j8 = 0;
                long j9 = j7 | (((long) 1) << 32) | (j8 - ((j8 >> 63) << 32));
                Object objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault16 == null) {
                    objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6618, 42 - ExpandableListView.getPackedPositionGroup(0L), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault16).invoke(null, null);
                Object[] objArr37 = {-1998931746, Long.valueOf(j9), arrayList2, null, false, false};
                Object objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault17 == null) {
                    objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.alpha(0), 55 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.lastIndexOf("", '0') + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault17).invoke(objInvoke2, objArr37);
                int i47 = ((int[]) objArr3[0])[0];
                Object[] objArr38 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i48 = ~(491617133 | iIdentityHashCode4);
                int i49 = i47 + 1733560687 + ((570426368 | i48) * (-814)) + ((i48 | (~((~iIdentityHashCode4) | (-910180194))) | 151863308) * 407) + (((~(iIdentityHashCode4 | 910180193)) | (~((-491617134) | iIdentityHashCode4)) | 151863308) * 407);
                int i50 = (i49 << 13) ^ i49;
                int i51 = i50 ^ (i50 >>> 17);
                ((int[]) objArr38[0])[0] = i51 ^ (i51 << 5);
                throw new RuntimeException(String.valueOf(i44));
            }
            int i52 = ((int[]) objArr3[0])[0];
            Object[] objArr39 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iMyPid = Process.myPid();
            int i53 = ~iMyPid;
            int i54 = i52 + (-281541844) + (((~((-274604294) | i53)) | 1127193033) * 519) + (((~(i53 | (-273686533))) | (~(1400879565 | iMyPid))) * (-519)) + (((~(iMyPid | 1127193033)) | 274604293) * 519);
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArr39[0])[0] = i56 ^ (i56 << 5);
            int i57 = ((int[]) objArr39[0])[0];
            Object[] objArr40 = {new int[1], new int[]{((int[]) objArr39[1])[0]}, new int[]{((int[]) objArr39[2])[0]}, (String[]) objArr39[3]};
            int iMyUid = Process.myUid();
            int i58 = ~((-1280108052) | iMyUid);
            int i59 = ~iMyUid;
            int i60 = i57 + (-726582178) + ((i58 | (~(1330443963 | i59))) * (-406)) + ((~((-1208754689) | i59)) * (-406)) + (((~(iMyUid | (-121689276))) | (~(1280108051 | i59))) * HaProxyConstants.VOUCHER_TOP_UP_SUCESS);
            int i61 = (i60 << 13) ^ i60;
            int i62 = i61 ^ (i61 >>> 17);
            ((int[]) objArr40[0])[0] = i62 ^ (i62 << 5);
            Object objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
            if (objCopydefault18 == null) {
                int iAxisFromString = MotionEvent.axisFromString("") + 2406;
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 26;
                char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                byte b18 = (byte) ($$d[30] + 1);
                byte b19 = (byte) (-b18);
                Object[] objArr41 = new Object[1];
                e(b18, b19, b19, objArr41);
                objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, iIndexOf2, cIndexOf4, 1926552790, false, (String) objArr41[0], null);
            }
            if (((Field) objCopydefault18).getLong(null) != -1) {
                Object objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault19 == null) {
                    int i63 = 2406 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int mirror2 = AndroidCharacter.getMirror('0') - 22;
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b20 = (byte) 0;
                    Object[] objArr42 = new Object[1];
                    e((byte) 42, b20, (byte) (b20 + 1), objArr42);
                    objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(i63, mirror2, windowTouchSlop, 21921080, false, (String) objArr42[0], null);
                }
                Object[] objArr43 = (Object[]) ((Field) objCopydefault19).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr43[0])[0]}, new int[1], new int[]{((int[]) objArr43[2])[0]}, (String[]) objArr43[3]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i64 = ((((-1462612081) + (((~(432148546 | iIdentityHashCode5)) | 8392770) * (-502))) + ((~((~iIdentityHashCode5) | 503299678)) * (-502))) + (((~(iIdentityHashCode5 | (-494906909))) | 432148546) * 502)) - 1432512288;
                int i65 = (i64 << 13) ^ i64;
                int i66 = i65 ^ (i65 >>> 17);
                ((int[]) objArr5[1])[0] = i66 ^ (i66 << 5);
                c2 = 0;
                str = str3;
            } else {
                Object[] objArr44 = new Object[1];
                d((ViewConfiguration.getJumpTapTimeout() >> 16) + 16, new char[]{4406, 63481, 27253, 36337, 20041, 26394, 47605, 6510, 24113, 32439, 43933, 46927, 61429, 29881, 21463, 65314}, objArr44);
                Class<?> cls4 = Class.forName((String) objArr44[0]);
                Object[] objArr45 = new Object[1];
                d((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, new char[]{26601, 21077, 42629, 18273, 59468, 37690, 14539, 32881, 22050, 32064, 10347, 36709, 52025, 57584, 32493, 7426}, objArr45);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr45[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr46 = {-1998931746};
                Object objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
                if (objCopydefault20 == null) {
                    objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(2393 - KeyEvent.getDeadChar(0, 0), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (30139 - View.MeasureSpec.getSize(0)), 1140467866, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrComponent1$16dd2b22 = ASN1PrintableString.AnonymousClass5.component1$16dd2b22(iIntValue2, 0, ((Constructor) objCopydefault20).newInstance(objArr46), -1432512288, false, false);
                Object objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault21 == null) {
                    byte b21 = (byte) 0;
                    Object[] objArr47 = new Object[1];
                    e((byte) 42, b21, (byte) (b21 + 1), objArr47);
                    objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(2405 - TextUtils.indexOf("", "", 0), 26 - Color.alpha(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 21921080, false, (String) objArr47[0], null);
                }
                ((Field) objCopydefault21).set(null, objArrComponent1$16dd2b22);
                try {
                    long jLongValue4 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                    if (objCopydefault22 == null) {
                        objArr4 = objArrComponent1$16dd2b22;
                        str = str3;
                        Object[] objArr48 = new Object[1];
                        e(r14[5], (byte) ($$d[31] + 1), (byte) 0, objArr48);
                        objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(2405 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 246010334, false, (String) objArr48[0], null);
                    } else {
                        str = str3;
                        objArr4 = objArrComponent1$16dd2b22;
                    }
                    ((Field) objCopydefault22).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                    if (objCopydefault23 == null) {
                        int maximumDrawingCacheSize = 2405 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iAlpha = Color.alpha(0) + 26;
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b22 = (byte) ($$d[30] + 1);
                        byte b23 = (byte) (-b22);
                        Object[] objArr49 = new Object[1];
                        e(b22, b23, b23, objArr49);
                        objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, iAlpha, minimumFlingVelocity2, 1926552790, false, (String) objArr49[0], null);
                    }
                    ((Field) objCopydefault23).set(null, lValueOf6);
                    objArr5 = objArr4;
                    c2 = 0;
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            int i67 = ((int[]) objArr5[c2])[c2];
            int i68 = ((int[]) objArr5[2])[c2];
            if (i68 != i67) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr7 = (String[]) objArr5[3];
                if (strArr7 != null) {
                    for (String str6 : strArr7) {
                        int i69 = copy + 13;
                        equals = i69 % 128;
                        int i70 = i69 % 2;
                        arrayList3.add(str6);
                    }
                }
                long j10 = -1;
                long j11 = 0;
                long j12 = (((long) (i68 ^ i67)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)))) | (((long) 2) << 32) | (j11 - ((j11 >> 63) << 32));
                Object objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault24 == null) {
                    objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6618, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, (char) View.MeasureSpec.getMode(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke3 = ((Method) objCopydefault24).invoke(null, null);
                Object[] objArr50 = {-1998931746, Long.valueOf(j12), arrayList3, null, false, false};
                Object objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault25 == null) {
                    objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(6561 - ((byte) KeyEvent.getModifierMetaStateMask()), 56 - Color.argb(0, 0, 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault25).invoke(objInvoke3, objArr50);
                int i71 = ((int[]) objArr5[1])[0];
                Object[] objArr51 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i72 = i71 + (-1815356863) + (((~(856211637 | iIdentityHashCode6)) | (-918970000)) * (-964)) + (((~((~iIdentityHashCode6) | 856211637)) | (-936304320)) * (-964));
                int i73 = (i72 << 13) ^ i72;
                int i74 = i73 ^ (i73 >>> 17);
                ((int[]) objArr51[1])[0] = i74 ^ (i74 << 5);
                throw null;
            }
            Object[] objArr52 = new Object[4];
            int[] iArr = new int[1];
            objArr52[c2] = iArr;
            objArr52[1] = new int[1];
            int[] iArr2 = new int[1];
            objArr52[2] = iArr2;
            int i75 = ((int[]) objArr5[1])[c2];
            int i76 = ((int[]) objArr5[2])[c2];
            int i77 = ((int[]) objArr5[c2])[c2];
            String[] strArr8 = (String[]) objArr5[3];
            iArr2[c2] = i76;
            iArr[c2] = i77;
            objArr52[3] = strArr8;
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i78 = i75 + (-114039704) + (((~((-13339182) | iIdentityHashCode7)) | 12714540) * 345) + (((~((-13339182) | (~iIdentityHashCode7))) | 36704640) * 345) + ((~(iIdentityHashCode7 | (-12714541))) * 345);
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArr52[1])[0] = i80 ^ (i80 << 5);
            int i81 = ((int[]) objArr52[1])[0];
            Object[] objArr53 = {new int[]{((int[]) objArr52[0])[0]}, new int[1], new int[]{((int[]) objArr52[2])[0]}, (String[]) objArr52[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i82 = ~startUptimeMillis;
            int i83 = 132292161 + (((~((-121321065) | i82)) | 37229632) * (-1188));
            int i84 = (~(startUptimeMillis | 121321064)) | 37229632;
            int i85 = ~(184079426 | i82);
            int i86 = i81 + i83 + ((i84 | i85) * 594) + (((~(121321064 | i82)) | (-268170859) | i85) * 594);
            int i87 = (i86 << 13) ^ i86;
            int i88 = i87 ^ (i87 >>> 17);
            ((int[]) objArr53[1])[0] = i88 ^ (i88 << 5);
            RemoteConfig remoteConfig = getRemoteConfig();
            int i89 = ((int[]) objArr23[3])[0];
            int i90 = i89 * i89;
            int i91 = -(2006475087 * i89);
            int i92 = (i90 & i91) + (i90 | i91);
            int i93 = -(i89 * (-182664481));
            int i94 = ((i92 ^ i93) + ((i93 & i92) << 1)) - 1081459183;
            int i95 = ((i94 >> 19) - 16383) / 8192;
            int i96 = (i95 & 1) + (i95 | 1);
            int i97 = (-((((i94 | i96) << 1) - (i96 ^ i94)) ^ ((((i94 >> 24) - 511) / 256) - (-1)))) + 8;
            int i98 = i97 >> 21;
            int i99 = ((((i98 | (-4095)) << 1) - (i98 ^ (-4095))) / 2048) - (-1);
            int i100 = 8968520 / ((i97 & (-((i99 & 1) + (i99 | 1)))) * 1853);
            int i101 = ((int[]) objArr40[0])[0];
            int i102 = i101 * i101;
            int i103 = -(1130888700 * i101);
            int i104 = (i102 & i103) + (i102 | i103);
            int i105 = -(i101 * (-2038844016));
            int i106 = ((i104 & i105) + (i105 | i104)) - 1132378844;
            int i107 = i106 >> 23;
            int i108 = ((i107 & (-1023)) + (i107 | (-1023))) / 512;
            int i109 = ((i108 | 1) << 1) - (i108 ^ 1);
            int i110 = (i106 ^ i109) + ((i109 & i106) << 1);
            int i111 = i106 >> 22;
            int i112 = -(i110 ^ ((((i111 & (-2047)) + (i111 | (-2047))) / 1024) - (-1)));
            int i113 = ((i112 | 6) << 1) - (i112 ^ 6);
            int i114 = i113 >> 28;
            int i115 = (((i114 ^ (-31)) + ((i114 & (-31)) << 1)) / 16) - (-1);
            int i116 = i100 + (1293096 / (((-(((i115 | 1) << 1) - (i115 ^ 1))) & i113) * 358));
            int i117 = ((int[]) objArr53[1])[0];
            int i118 = i117 * i117;
            int i119 = -(696759815 * i117);
            int i120 = (i118 & i119) + (i118 | i119);
            int i121 = -(i117 * (-1778248609));
            int i122 = ((i120 & i121) + (i121 | i120)) - 1655945175;
            int i123 = i122 >> 24;
            int i124 = ((i123 ^ (-511)) + ((i123 & (-511)) << 1)) / 256;
            int i125 = ((i124 | 1) << 1) - (i124 ^ 1);
            int i126 = ((i122 | i125) << 1) - (i125 ^ i122);
            int i127 = i122 >> 20;
            int i128 = -(i126 ^ ((((i127 & (-8191)) + (i127 | (-8191))) / 4096) - (-1)));
            int i129 = ((i128 | 5) << 1) - (i128 ^ 5);
            int i130 = ((i129 >> 25) - 255) / 128;
            int i131 = (i130 & 1) + (i130 | 1);
            remoteConfig.setRemoteConfigStale(i116 + ((-10009800) / (((-(((i131 | 1) << 1) - (i131 ^ 1))) & i129) * 1660)));
            Object objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
            if (objCopydefault26 == null) {
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2984;
                int absoluteGravity2 = 48 - Gravity.getAbsoluteGravity(0, 0);
                char c5 = (char) (54463 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                Object[] objArr54 = new Object[1];
                e(r1[5], (byte) ($$d[31] + 1), (byte) 0, objArr54);
                objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize2, absoluteGravity2, c5, 1571866973, false, (String) objArr54[0], null);
            }
            if (((Field) objCopydefault26).getLong(null) != -1) {
                Object objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                if (objCopydefault27 == null) {
                    int i132 = 2985 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int iRgb = Color.rgb(0, 0, 0) + 16777264;
                    char c6 = (char) (54463 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b24 = (byte) ($$d[30] + 1);
                    byte b25 = (byte) (-b24);
                    Object[] objArr55 = new Object[1];
                    e(b24, b25, b25, objArr55);
                    objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(i132, iRgb, c6, -635740813, false, (String) objArr55[0], null);
                }
                Object[] objArr56 = (Object[]) ((Field) objCopydefault27).get(null);
                objArr6 = new Object[]{new int[]{((int[]) objArr56[0])[0]}, new int[]{((int[]) objArr56[1])[0]}, new int[1], (String[]) objArr56[3]};
                int i133 = (~((int) Runtime.getRuntime().freeMemory())) | 172162072;
                int i134 = (((-1613827590) + (i133 * 495)) + (((~i133) | 33554440) * 495)) - 491738762;
                int i135 = (i134 << 13) ^ i134;
                int i136 = i135 ^ (i135 >>> 17);
                ((int[]) objArr6[2])[0] = i136 ^ (i136 << 5);
                c3 = 0;
            } else {
                if (applicationContext2 != null) {
                    applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
                }
                Object[] objArr57 = new Object[1];
                d(Color.blue(0) + 16, new char[]{4406, 63481, 27253, 36337, 20041, 26394, 47605, 6510, 24113, 32439, 43933, 46927, 61429, 29881, 21463, 65314}, objArr57);
                Class<?> cls5 = Class.forName((String) objArr57[0]);
                Object[] objArr58 = new Object[1];
                d(ExpandableListView.getPackedPositionType(0L) + 16, new char[]{26601, 21077, 42629, 18273, 59468, 37690, 14539, 32881, 22050, 32064, 10347, 36709, 52025, 57584, 32493, 7426}, objArr58);
                Object[] objArr59 = {applicationContext2, Integer.valueOf(((Integer) cls5.getMethod((String) objArr58[0], Object.class).invoke(null, this)).intValue()), 0, -491738762};
                byte[] bArr = $$j;
                byte b26 = bArr[39];
                byte b27 = b26;
                Object[] objArr60 = new Object[1];
                g(b26, b27, b27, objArr60);
                Class<?> cls6 = Class.forName((String) objArr60[0]);
                byte b28 = bArr[43];
                Object[] objArr61 = new Object[1];
                g(b28, bArr[39], b28, objArr61);
                objArr6 = (Object[]) cls6.getMethod((String) objArr61[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr59);
                if (applicationContext2 != null) {
                    Object objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                    if (objCopydefault28 == null) {
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 2984;
                        int i137 = 48 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 54463);
                        byte b29 = (byte) ($$d[30] + 1);
                        byte b30 = (byte) (-b29);
                        Object[] objArr62 = new Object[1];
                        e(b29, b30, b30, objArr62);
                        objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority2, i137, cIndexOf5, -635740813, false, (String) objArr62[0], null);
                    }
                    ((Field) objCopydefault28).set(null, objArr6);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue5);
                        Object objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                        if (objCopydefault29 == null) {
                            int i138 = 2984 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 49;
                            char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54461);
                            byte b31 = (byte) 0;
                            Object[] objArr63 = new Object[1];
                            e((byte) ($$d[25] - 1), b31, (byte) (b31 + 1), objArr63);
                            objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(i138, bitsPerPixel2, c7, -1592726660, false, (String) objArr63[0], null);
                        }
                        ((Field) objCopydefault29).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                        Object objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                        if (objCopydefault30 == null) {
                            int i139 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2984;
                            int scrollBarSize = 48 - (ViewConfiguration.getScrollBarSize() >> 8);
                            char cNormalizeMetaState = (char) (54462 - KeyEvent.normalizeMetaState(0));
                            Object[] objArr64 = new Object[1];
                            e(r1[5], (byte) ($$d[31] + 1), (byte) 0, objArr64);
                            objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(i139, scrollBarSize, cNormalizeMetaState, 1571866973, false, (String) objArr64[0], null);
                        }
                        ((Field) objCopydefault30).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                c3 = 0;
            }
            int i140 = ((int[]) objArr6[c3])[c3];
            int i141 = ((int[]) objArr6[1])[c3];
            if (i141 == i140) {
                Object[] objArr65 = new Object[4];
                int[] iArr3 = new int[1];
                objArr65[c3] = iArr3;
                int[] iArr4 = new int[1];
                objArr65[1] = iArr4;
                objArr65[2] = new int[1];
                int i142 = ((int[]) objArr6[2])[c3];
                int i143 = ((int[]) objArr6[1])[c3];
                int i144 = ((int[]) objArr6[c3])[c3];
                String[] strArr9 = (String[]) objArr6[3];
                iArr4[c3] = i143;
                iArr3[c3] = i144;
                objArr65[3] = strArr9;
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i145 = i142 + 294466190 + (((~((-65541) | (~iIdentityHashCode8))) | (-2110652288)) * (-591)) + ((iIdentityHashCode8 | (-65541)) * 591);
                int i146 = (i145 << 13) ^ i145;
                int i147 = i146 ^ (i146 >>> 17);
                ((int[]) objArr65[2])[0] = i147 ^ (i147 << 5);
                int i148 = ((int[]) objArr65[2])[0];
                Object[] objArr66 = {new int[]{((int[]) objArr65[0])[0]}, new int[]{((int[]) objArr65[1])[0]}, new int[1], (String[]) objArr65[3]};
                int iMyTid2 = Process.myTid();
                int i149 = i148 + (-302558837) + (((~((-1396627896) | iMyTid2)) | 34603396) * 336) + (((~(iMyTid2 | 714089932)) | (-2076114432)) * (-168)) + (((~((~iMyTid2) | 714089932)) | (-1396627896)) * 168);
                int i150 = (i149 << 13) ^ i149;
                int i151 = i150 ^ (i150 >>> 17);
                ((int[]) objArr66[2])[0] = i151 ^ (i151 << 5);
                getRemoteConfig().check();
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            String[] strArr10 = (String[]) objArr6[3];
            if (strArr10 != null) {
                int i152 = equals + 93;
                copy = i152 % 128;
                int i153 = i152 % 2;
                for (String str7 : strArr10) {
                    arrayList4.add(str7);
                }
            }
            long j13 = -1;
            long j14 = ((long) (i140 ^ i141)) & ((((long) 0) << 32) | (j13 - ((j13 >> 63) << 32)));
            long j15 = 0;
            long j16 = j14 | (((long) 3) << 32) | (j15 - ((j15 >> 63) << 32));
            Object objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault31 == null) {
                objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, (ViewConfiguration.getScrollBarSize() >> 8) + 42, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke4 = ((Method) objCopydefault31).invoke(null, null);
            Object[] objArr67 = {-665134828, Long.valueOf(j16), arrayList4, null, false, false};
            Object objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault32 == null) {
                objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 6562, (ViewConfiguration.getTouchSlop() >> 8) + 56, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault32).invoke(objInvoke4, objArr67);
            int i154 = ((int[]) objArr6[2])[0];
            Object[] objArr68 = {new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, new int[1], (String[]) objArr6[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i155 = ~iIdentityHashCode9;
            int i156 = i154 + (-723100973) + ((~(674409886 | i155)) * (-560)) + ((~(iIdentityHashCode9 | (-1435258978))) * (-560)) + (((~(1436307941 | i155)) | 673360922) * 560);
            int i157 = (i156 << 13) ^ i156;
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr68[2])[0] = i158 ^ (i158 << 5);
            throw new RuntimeException(String.valueOf(i141));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        getRequestBeneficiariesState = 1;
        component2();
        copydefault = new int[]{962326110, 421305547, 372892063, 463031611, -1263376606, -650061161, -821826700, 2029474375, 816763050, 1518711442, -545336804, 1619378319, -1221484006, 1423256553, 963416304, -1298329844, 1546726042, 310383567};
        int i = getAsAtTimestamp + 109;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
    }

    static void component2() {
        component2 = (char) 28957;
        component3 = (char) 25040;
        component1 = (char) 59390;
        ShareDataUIState = (char) 59463;
    }
}
