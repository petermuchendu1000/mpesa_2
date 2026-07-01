package com.huawei.digitalpayment.consumer.loginModule.register.request;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.http.BaseRequestParams;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ActiveConsumerParams;", "Lcom/huawei/http/BaseRequestParams;", "oldPin", "", "newPin", "qaList", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/QAItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldPin", "()Ljava/lang/String;", "getNewPin", "getQaList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActiveConsumerParams extends BaseRequestParams {
    private final String newPin;
    private final String oldPin;
    private final List<QAItem> qaList;
    private static final byte[] $$c = {79, 9, 94, -7};
    private static final int $$f = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 33, 67, 92, 6, -5, 3};
    private static final int $$e = 191;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK, Ascii.VT, -19, Ascii.ETB, TarHeader.LF_DIR, -60, 13, -11, 9, 59, -36, -18, -8, Ascii.SI, 6, -1, -1, 9, 1, Ascii.NAK, -15, 0};
    private static final int $$b = 89;
    private static int component3 = 0;
    private static int component1 = 1;
    private static int[] ShareDataUIState = {-1974784813, -98356934, -457631580, 1756336312, -896413863, -874952767, -334160745, -1888177967, 1906608679, -542911481, 1737807831, 1984580601, 698505963, -600333488, 1827323233, -1253013396, 1804338595, -654601177};
    private static long copydefault = 4023429256865764573L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r5, byte r6, short r7) {
        /*
            int r6 = r6 + 4
            int r5 = r5 + 102
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.$$c
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r6]
        L25:
            int r5 = r5 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.$$g(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = 100 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 + 3
            int r7 = r7 + 106
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + 2
            int r6 = r6 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.d(int, byte, int, java.lang.Object[]):void");
    }

    public final String getNewPin() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.newPin;
        }
        throw null;
    }

    public final String getOldPin() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.oldPin;
        }
        throw null;
    }

    public final List<QAItem> getQaList() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<QAItem> list = this.qaList;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public ActiveConsumerParams(String str, String str2, List<QAItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.oldPin = str;
        this.newPin = str2;
        this.qaList = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveConsumerParams(String str, String str2) {
        this(str, str2, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 125;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 3266, 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 60268), -834797019, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() | (copydefault % 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        int maximumDrawingCacheSize = 687 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int doubleTapTimeout = 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        char maximumDrawingCacheSize2 = (char) (60373 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte b4 = (byte) ($$f & 15);
                        byte b5 = (byte) (b4 - 4);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, doubleTapTimeout, maximumDrawingCacheSize2, -1969106284, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 3266, TextUtils.indexOf("", "", 0) + 33, (char) (60268 - TextUtils.getTrimmedLength("")), -834797019, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                    try {
                        Object[] objArr5 = {notifyVar, notifyVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault4 == null) {
                            int iAlpha = 687 - Color.alpha(0);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 34;
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 60372);
                            byte b8 = (byte) ($$f & 15);
                            byte b9 = (byte) (b8 - 4);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, jumpTapTimeout, c2, -1969106284, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
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
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                int keyRepeatDelay = 687 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iGreen = Color.green(0) + 34;
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 60373);
                byte b10 = (byte) ($$f & 15);
                byte b11 = (byte) (b10 - 4);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, iGreen, defaultSize, -1969106284, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ShareDataUIState;
        int i6 = 684241640;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $11 + 29;
                $10 = i10 % 128;
                if (i10 % i4 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i8] = Integer.valueOf(iArr3[i9]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6);
                        if (objCopydefault == null) {
                            byte length3 = (byte) $$c.length;
                            byte b2 = (byte) (length3 - 5);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(i8) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i8) == 0.0d ? 0 : -1)) + 4391, 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), -309236339, false, $$g(length3, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i4 = 2;
                        i6 = 684241640;
                        i9 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i9])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 4391;
                        int iGreen = 37 - Color.green(0);
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        byte length4 = (byte) $$c.length;
                        byte b3 = (byte) (length4 - 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iGreen, threadPriority, -309236339, false, $$g(length4, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i9++;
                    i4 = 2;
                    i6 = 684241640;
                }
                i8 = 0;
            }
            iArr3 = iArr4;
        }
        int length5 = iArr3.length;
        int[] iArr5 = new int[length5];
        int[] iArr6 = ShareDataUIState;
        if (iArr6 != null) {
            int i11 = $10 + 35;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i12 = $11 + 21;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    Object[] objArr4 = new Object[i7];
                    objArr4[0] = Integer.valueOf(iArr6[i2]);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        int offsetBefore = 4391 - TextUtils.getOffsetBefore("", 0);
                        int iAlpha = 37 - Color.alpha(0);
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        byte length6 = (byte) $$c.length;
                        byte b4 = (byte) (length6 - 5);
                        i3 = length;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iAlpha, gidForName, -309236339, false, $$g(length6, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    } else {
                        i3 = length;
                    }
                    iArr2[i2] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                } else {
                    i3 = length;
                    Object[] objArr5 = {Integer.valueOf(iArr6[i2])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault4 == null) {
                        int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4390;
                        int iArgb = Color.argb(0, 0, 0, 0) + 37;
                        char mode = (char) View.MeasureSpec.getMode(0);
                        byte length7 = (byte) $$c.length;
                        byte b5 = (byte) (length7 - 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i13, iArgb, mode, -309236339, false, $$g(length7, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    i2++;
                }
                length = i3;
                i7 = 1;
            }
            iArr6 = iArr2;
        }
        char c2 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length5);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i14 = 0;
            while (i14 < 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i14];
                try {
                    Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault5 == null) {
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 2968;
                        int tapTimeout = 16 - (ViewConfiguration.getTapTimeout() >> 16);
                        char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49870);
                        byte b6 = (byte) ($$f & 14);
                        byte b7 = (byte) (b6 - 3);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority2, tapTimeout, c3, 462826032, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i14++;
                    int i15 = $10 + 121;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                byte b8 = (byte) (-1);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 2945, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (27637 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), -1616366948, false, $$g((byte) 5, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ActiveConsumerParams copy$default(ActiveConsumerParams activeConsumerParams, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 23;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str = activeConsumerParams.oldPin;
        }
        if ((i & 2) != 0) {
            int i7 = component1 + 95;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                String str3 = activeConsumerParams.newPin;
                throw null;
            }
            str2 = activeConsumerParams.newPin;
        }
        if ((i & 4) != 0) {
            list = activeConsumerParams.qaList;
        }
        return activeConsumerParams.copy(str, str2, list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.oldPin;
            int i4 = 81 / 0;
        } else {
            str = this.oldPin;
        }
        int i5 = i2 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.newPin;
        int i4 = i3 + 75;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<QAItem> component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<QAItem> list = this.qaList;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final ActiveConsumerParams copy(String oldPin, String newPin, List<QAItem> qaList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(oldPin, "");
        Intrinsics.checkNotNullParameter(newPin, "");
        ActiveConsumerParams activeConsumerParams = new ActiveConsumerParams(oldPin, newPin, qaList);
        int i2 = component3 + 9;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return activeConsumerParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 113;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof ActiveConsumerParams)) {
            return false;
        }
        ActiveConsumerParams activeConsumerParams = (ActiveConsumerParams) other;
        if (!Intrinsics.areEqual(this.oldPin, activeConsumerParams.oldPin)) {
            int i5 = component1 + 97;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.newPin, activeConsumerParams.newPin)) {
            return Intrinsics.areEqual(this.qaList, activeConsumerParams.qaList);
        }
        int i7 = component3 + 3;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.oldPin.hashCode();
        int iHashCode3 = this.newPin.hashCode();
        List<QAItem> list = this.qaList;
        if (list == null) {
            int i4 = component3 + 29;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActiveConsumerParams(oldPin=" + this.oldPin + ", newPin=" + this.newPin + ", qaList=" + this.qaList + ")";
        int i2 = component3 + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6895 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v318 */
    /* JADX WARN: Type inference failed for: r45v11 */
    /* JADX WARN: Type inference failed for: r45v12 */
    /* JADX WARN: Type inference failed for: r45v13 */
    /* JADX WARN: Type inference failed for: r45v26 */
    /* JADX WARN: Type inference failed for: r45v28 */
    /* JADX WARN: Type inference failed for: r45v29 */
    /* JADX WARN: Type inference failed for: r45v30 */
    /* JADX WARN: Type inference failed for: r45v32 */
    /* JADX WARN: Type inference failed for: r45v65 */
    /* JADX WARN: Type inference failed for: r45v66 */
    /* JADX WARN: Type inference failed for: r45v67 */
    /* JADX WARN: Type inference failed for: r45v68 */
    /* JADX WARN: Type inference failed for: r45v69 */
    /* JADX WARN: Type inference failed for: r45v7 */
    /* JADX WARN: Type inference failed for: r45v70 */
    /* JADX WARN: Type inference failed for: r45v71 */
    /* JADX WARN: Type inference failed for: r45v72 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] component3$16dd2b22(int r72, int r73, java.lang.Object r74, int r75, boolean r76, boolean r77) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 17732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams.component3$16dd2b22(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
    }
}
