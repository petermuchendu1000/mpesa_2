package com.huawei.digitalpayment.consumer.base.networkcheck;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.util.L;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\rH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkMonitor;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/net/ConnectivityManager;)V", "TAG", "", "isNetworkInfoAvailable", "", "isNetworkAvailable", "isConnected", "isNetworkCapabilitiesValid", "Landroid/net/NetworkCapabilities;", "isWifiOn", "()Z", "isDataOn", "checkIfWifiOn", "checkIfDataOn", "checkIfWifiConnected", "checkIfDataConnected", "registerNetworkCallback", "", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "unregisterNetworkCallback", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkMonitor {
    private static long ShareDataUIState;
    private static char[] component2;
    private static int component4;
    private static char[] copydefault;
    private static long equals;
    private final String component1;
    private final ConnectivityManager component3;
    private static final byte[] $$c = {120, 65, 99, 57};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {84, -122, 19, 43, -21, 7, -17, 13, 33, -29, -19, 19, Ascii.FF, Ascii.FF, -10, -33, 19, -19, Ascii.SI};
    private static final int $$e = 228;
    private static final byte[] $$a = {119, -40, Ascii.DLE, 123, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_SYMLINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24};
    private static final int $$b = BERTags.FLAGS;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 + 117
            byte[] r1 = com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor.$$g(short, byte, int):java.lang.String");
    }

    private static void a(int i, int i2, short s, Object[] objArr) {
        int i3 = (s * 16) + 83;
        byte[] bArr = $$a;
        int i4 = (i2 * 3) + 4;
        byte[] bArr2 = new byte[i + 10];
        int i5 = i + 9;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = (i5 + (-i3)) - 16;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = bArr[i4];
            i4++;
            i3 = (i3 + (-i8)) - 16;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor.$$d
            int r8 = r8 * 4
            int r1 = r8 + 16
            byte[] r1 = new byte[r1]
            int r8 = r8 + 15
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor.d(int, short, short, java.lang.Object[]):void");
    }

    public NetworkMonitor(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "");
        this.component3 = connectivityManager;
        this.component1 = Reflection.getOrCreateKotlinClass(NetworkMonitor.class).getSimpleName();
    }

    private final boolean component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            NetworkInfo activeNetworkInfo = this.component3.getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            int i3 = getAsAtTimestamp + 69;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                return z;
            }
            throw null;
        }
        this.component3.getActiveNetworkInfo();
        obj.hashCode();
        throw null;
    }

    private final boolean ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ConnectivityManager connectivityManager = this.component3;
        boolean zCopydefault = copydefault(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        int i4 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return zCopydefault;
    }

    public final boolean isConnected() {
        int i = 2 % 2;
        boolean zShareDataUIState = ShareDataUIState();
        L.d(this.component1, "Network Capabilities checked " + zShareDataUIState);
        int i2 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return zShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean copydefault(NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        if (networkCapabilities == null) {
            int i2 = getAsAtTimestamp + 107;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!networkCapabilities.hasCapability(12)) {
            return false;
        }
        int i4 = getAsAtTimestamp + 113;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(0)) {
            int i6 = getRequestBeneficiariesState + 53;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            boolean zHasTransport = networkCapabilities.hasTransport(3);
            if (i7 == 0) {
                if (!zHasTransport) {
                    return false;
                }
            } else if (!zHasTransport) {
                return false;
            }
        }
        return true;
    }

    public final boolean isWifiOn() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 1;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            checkIfWifiConnected();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zCheckIfWifiConnected = checkIfWifiConnected();
        int i3 = getAsAtTimestamp + 67;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return zCheckIfWifiConnected;
    }

    public final boolean isDataOn() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean zCheckIfDataConnected = checkIfDataConnected();
        int i4 = getAsAtTimestamp + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return zCheckIfDataConnected;
    }

    private final boolean component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        NetworkInfo networkInfo = this.component3.getNetworkInfo(1);
        Boolean boolValueOf = null;
        if (networkInfo != null) {
            int i4 = getAsAtTimestamp + 53;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsConnectedOrConnecting = networkInfo.isConnectedOrConnecting();
            if (i5 != 0) {
                Boolean.valueOf(zIsConnectedOrConnecting);
                throw null;
            }
            boolValueOf = Boolean.valueOf(zIsConnectedOrConnecting);
        }
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    private final boolean component1() {
        Boolean boolValueOf;
        int i = 2 % 2;
        NetworkInfo networkInfo = this.component3.getNetworkInfo(0);
        if (networkInfo != null) {
            int i2 = getAsAtTimestamp + 95;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            boolValueOf = Boolean.valueOf(networkInfo.isConnectedOrConnecting());
            int i4 = getAsAtTimestamp + 95;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } else {
            boolValueOf = null;
        }
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    public final boolean checkIfWifiConnected() {
        int i = 2 % 2;
        ConnectivityManager connectivityManager = this.component3;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        L.d(this.component1, "isWifiCapability " + networkCapabilities);
        if (networkCapabilities != null) {
            int i2 = getRequestBeneficiariesState + 25;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            if (networkCapabilities.hasTransport(1)) {
                int i4 = getRequestBeneficiariesState + 81;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    public final boolean checkIfDataConnected() {
        int i = 2 % 2;
        ConnectivityManager connectivityManager = this.component3;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        L.d(this.component1, "isDataConnected " + networkCapabilities);
        boolean z = false;
        if (networkCapabilities != null) {
            int i2 = getRequestBeneficiariesState + 37;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            if (networkCapabilities.hasTransport(0)) {
                int i4 = getAsAtTimestamp + 25;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        int i6 = getRequestBeneficiariesState + 41;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getScrollBarSize() >> 8), 34 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Process.myPid() >> 22), 1159210934, false, $$g(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(equals), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3607, 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (7171 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1951385784, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 23 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (27760 - MotionEvent.axisFromString("")), -1529629956, false, $$g(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i7 = $10 + 19;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        int i9 = $11 + 65;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        while (cancelnotification.copydefault < i2) {
            int i11 = $11 + 1;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, (char) (27760 - TextUtils.lastIndexOf("", '0')), -1529629956, false, $$g(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr6 = {cancelnotification, cancelnotification};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(4012 - TextUtils.indexOf((CharSequence) "", '0'), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, (char) (27762 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -1529629956, false, $$g(b9, b10, (byte) (b10 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void c(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 73;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 34, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1159210934, false, $$g(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3607 - MotionEvent.axisFromString(""), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (7171 - KeyEvent.getDeadChar(0, 0)), 1951385784, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4012, TextUtils.getOffsetAfter("", 0) + 24, (char) (27761 - (ViewConfiguration.getFadingEdgeLength() >> 16)), -1529629956, false, $$g(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i7 = $11 + 81;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4012, 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 27761), -1529629956, false, $$g(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr6 = {cancelnotification, cancelnotification};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 4014, 24 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (KeyEvent.keyCodeFromString("") + 27761), -1529629956, false, $$g(b9, b10, (byte) (b10 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerNetworkCallback(android.net.ConnectivityManager.NetworkCallback r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor.registerNetworkCallback(android.net.ConnectivityManager$NetworkCallback):void");
    }

    public final void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(networkCallback, "");
        this.component3.unregisterNetworkCallback(networkCallback);
        int i4 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    static {
        component4 = 0;
        copydefault();
        copydefault = new char[]{793, 10529, 22399, 32200, 43970, 53259, 65059, 9313, 21183, 30919, 42332, 54050, 63843, 10169, 19915, 31234, 41051, 52834, 62626, 8903, 20243, 30035, 41831, 51640, 63470, 7232, 19025, 28777, 40612, 50413, 61719, 8027, 17823, 29628, 39356, 50709, 60492, 6813, 16567, 28415, 39796, 49502, 61341, 5557, 17406, 26670, 38467, 48271, 60052, 4318, 15677, 27477, 37278, 49102, 58851, 4655, 14412, 26247, 36055, 47857, 59143, 3441, 15238, 25043, 36374, 46186, 57975, 2206, 14031, 25373, 35127, 46946, 56767, 3053, 12314, 24103, 33892, 45753, 55495, 1318, 13142, 22895, 34748, 44418, 55886, 'W', 11884, 21690, 33523, 44800, 54615, 866, 10734, 22523, 31770, 43603, 53401, 65211, 9446, 20739, 32638, 42375, 54194, 63987, 9790, 19466, 31427, 41186, 52923};
        ShareDataUIState = 4187165056808986178L;
        int i = copy + 1;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = new char[]{3095, 29562, 62166, 29218, 61841, 28917, 61534, 30710, 63241, 30327, 62860, 29971, 62615, 31743, 64350, 31405, 64059, 31159, 63742, 30815, 65469, 32535, 3091, 29560, 62163, 29216, 61837, 28921, 61534, 30602, 63235, 30309, 62926, 30004, 62599, 31713, 64335, 3095, 29562, 62166, 29218, 61841, 28917, 61534, 30710, 63239, 30324, 62930, 30062, 62639, 31727, 64350, 31393, 64032, 31133, 63718, 30793, 65418, 32532, 65128, 32221, 64807, 31872, 16705, 15925, 49044, 16246, 48335, 15782, 48410, 15053, 47682, 15136, 47258, 14461, 47577, 14009, 46602, 14325, 46957, 13518, 36014, 62407, 29302, 62083, 29026, 61506, 28905, 63236, 30643, 63128, 30019, 62859, 29743, 64330, 31741, 64023, 49153, 49006, 16073, 48672, 15764, 48363, 15440, 48063, 15152, 47739, 14799, 47414, 14515, 47101, 14160, 46771};
        equals = 1934718590807012116L;
    }
}
