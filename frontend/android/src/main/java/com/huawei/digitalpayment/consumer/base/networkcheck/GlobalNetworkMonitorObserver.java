package com.huawei.digitalpayment.consumer.base.networkcheck;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.google.common.base.Ascii;
import com.huawei.common.util.L;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.lang.reflect.Method;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@Singleton
@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001c\b\u0007\u0018\u00002\u00020\u0001:\u0001&B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkCheckManager", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;", "<init>", "(Landroid/content/Context;Landroid/net/ConnectivityManager;Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;)V", "TAG", "", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "Lkotlinx/coroutines/CoroutineScope;", "networkMonitor", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkMonitor;", "intentFilter", "Landroid/content/IntentFilter;", "networkCallback", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver$NetworkCallback;", "observeNetworkState", "", "isNetworkAvailable", "", "isWifiOn", "()Z", "isDataOn", "networkReceiver", "com/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver$networkReceiver$1", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver$networkReceiver$1;", "updateConnection", "startNetworkCheck", "stopNetworkCheck", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "launchNetworkCheckActivity", "NetworkCallback", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalNetworkMonitorObserver implements DefaultLifecycleObserver {
    private static int ArtificialStackFrames = 1;
    private static int copy;
    private IntentFilter ShareDataUIState;
    private final Context component1;
    private NetworkCallback component2;
    private final String component3;
    private final GlobalNetworkMonitorObserver$networkReceiver$1 component4;
    private final ConnectivityManager copydefault;
    private final CoroutineScope equals;
    private final NetworkCheckManager getAsAtTimestamp;
    private final NetworkMonitor getRequestBeneficiariesState;

    public static final NetworkCheckManager access$getNetworkCheckManager$p(GlobalNetworkMonitorObserver globalNetworkMonitorObserver) {
        int i = 2 % 2;
        int i2 = copy + 87;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        NetworkCheckManager networkCheckManager = globalNetworkMonitorObserver.getAsAtTimestamp;
        int i5 = i3 + 109;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return networkCheckManager;
    }

    public static final String access$getTAG$p(GlobalNetworkMonitorObserver globalNetworkMonitorObserver) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 7;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = globalNetworkMonitorObserver.component3;
        int i5 = i3 + 99;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final void access$updateConnection(GlobalNetworkMonitorObserver globalNetworkMonitorObserver) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        globalNetworkMonitorObserver.component2();
        int i4 = ArtificialStackFrames + 63;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1] */
    @Inject
    public GlobalNetworkMonitorObserver(@ApplicationContext Context context, ConnectivityManager connectivityManager, NetworkCheckManager networkCheckManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(connectivityManager, "");
        Intrinsics.checkNotNullParameter(networkCheckManager, "");
        this.component1 = context;
        this.copydefault = connectivityManager;
        this.getAsAtTimestamp = networkCheckManager;
        this.component3 = Reflection.getOrCreateKotlinClass(GlobalNetworkMonitorObserver.class).getSimpleName();
        this.equals = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.getRequestBeneficiariesState = new NetworkMonitor(connectivityManager);
        this.ShareDataUIState = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.component2 = new NetworkCallback(this);
        ShareDataUIState();
        this.component4 = new BroadcastReceiver() {
            private static long component1;
            private static long component2;
            private static char[] component3;
            private static int copy;
            private static final byte[] $$c = {120, -46, -95, -23};
            private static final int $$f = 35;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {105, -91, -115, Ascii.US, -54, Ascii.RS, 45, Ascii.FS, 0, 17, 10, -22, 35, 20, Ascii.DC2, -33, TarHeader.LF_FIFO, -4, 19, -12, Ascii.RS, 7, Ascii.GS, -28, 42, Ascii.FF, Ascii.DLE, 6, -34, 41, Ascii.SYN, Ascii.VT, 1, 10, 13, 19, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -54};
            private static final int $$e = 175;
            private static final byte[] $$a = {107, -21, -54, -113, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2};
            private static final int $$b = 220;
            private static int getRequestBeneficiariesState = 1;
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(short r6, int r7, short r8) {
                /*
                    int r6 = r6 * 4
                    int r6 = r6 + 1
                    int r7 = 122 - r7
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    byte[] r0 = com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.$$c
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    int r8 = r8 + 1
                    if (r4 != r6) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r3 = r0[r8]
                L26:
                    int r3 = -r3
                    int r7 = r7 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.$$g(short, int, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(byte r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 + 4
                    int r0 = r5 + 10
                    byte[] r1 = com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.$$a
                    int r7 = r7 * 16
                    int r7 = r7 + 83
                    byte[] r0 = new byte[r0]
                    int r5 = r5 + 9
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r7
                    r4 = r2
                    r7 = r5
                    goto L27
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L25:
                    r3 = r1[r6]
                L27:
                    int r7 = r7 + r3
                    int r7 = r7 + (-17)
                    int r6 = r6 + 1
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.b(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.$$d
                    int r9 = r9 * 23
                    int r9 = 33 - r9
                    int r7 = r7 * 12
                    int r7 = r7 + 99
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L2b
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    int r8 = r8 + 1
                    if (r4 != r9) goto L26
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L26:
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L2b:
                    int r7 = r7 + r8
                    int r7 = r7 + (-11)
                    r8 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.c(byte, byte, short, java.lang.Object[]):void");
            }

            private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                notify notifyVar = new notify();
                notifyVar.component3 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                notifyVar.copydefault = 0;
                while (notifyVar.copydefault < cArr.length) {
                    int i3 = notifyVar.copydefault;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3265, 33 - TextUtils.getOffsetAfter("", 0), (char) (60268 - ExpandableListView.getPackedPositionType(0L)), -834797019, false, $$g(b2, (byte) (b2 | 20), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                        try {
                            Object[] objArr3 = {notifyVar, notifyVar};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                            if (objCopydefault2 == null) {
                                byte b3 = (byte) 0;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 688, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$g(b3, (byte) (b3 | 17), b3), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault2).invoke(null, objArr3);
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
                char[] cArr2 = new char[length];
                notifyVar.copydefault = 0;
                while (notifyVar.copydefault < cArr.length) {
                    int i4 = $11 + 15;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                    Object[] objArr4 = {notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getEdgeSlop() >> 16), 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 60373), -1969106284, false, $$g(b4, (byte) (b4 | 17), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                String str = new String(cArr2);
                int i6 = $11 + 101;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                objArr[0] = str;
            }

            private static void d(int i, int i2, char c2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                cancelNotification cancelnotification = new cancelNotification();
                long[] jArr = new long[i2];
                cancelnotification.copydefault = 0;
                int i4 = $10 + 61;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                }
                while (cancelnotification.copydefault < i2) {
                    int i6 = $11 + 15;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = cancelnotification.copydefault;
                    try {
                        Object[] objArr2 = {Integer.valueOf(component3[i + i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1806 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 34, (char) (KeyEvent.getMaxKeyCode() >> 16), 1159210934, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(component1), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (char) (7171 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1951385784, false, $$g(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 4014, (ViewConfiguration.getTapTimeout() >> 16) + 24, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 27761), -1529629956, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
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
                while (cancelnotification.copydefault < i2) {
                    int i9 = $10 + 1;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4012, 24 - TextUtils.getTrimmedLength(""), (char) (KeyEvent.getDeadChar(0, 0) + 27761), -1529629956, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    int i11 = $10 + 95;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Removed duplicated region for block: B:106:0x0bc9  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0bd5  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x17b2  */
            /* JADX WARN: Removed duplicated region for block: B:232:0x17b3  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r28, android.content.Intent r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 6274
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$networkReceiver$1.onReceive(android.content.Context, android.content.Intent):void");
            }

            static {
                copy = 0;
                component2();
                component3 = new char[]{3093, 25105, 53259, 17984, 46142, 10795, 38951, 3641, 31827, 53847, 16392, 46666, 9343, 39545, 2159, 32378, 60567, 17042, 45206, 9871, 38063, 2739, 30883, 61088, 23746, 45712, 8389, 38593, 1272, 31469, 59635, 24291, 52499, 8972, 37192, 1821, 30000, 60221, 22835, 53031, 15640, 37710, 340, 30529, 58736, 23415, 51562, 16235, 44504, 910, 29071, 59264, 21947, 52159, 14760, 44975, 7633, 29659, 57736, 22472, 50681, 15340, 43489, 8161, 36354, 64526, 21007, 49152, 13944, 42003, 6695, 34848, 65111, 27737, 49731, 12414, 42623, 5232, 35408, 63591, 28307, 56457, 12971, 41089, 5810, 33979, 64170, 26858, 57045, 19670, 41671, 4288, 34545, 62715, 27350, 55527, 20248, 48474, 4951};
                component1 = -2041461005107830146L;
                int i = getRequestBeneficiariesState + 15;
                copy = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static void component2() {
                component2 = -5428953900923810002L;
            }
        };
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$observeNetworkState$1", f = "GlobalNetworkMonitorObserver.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component3 + 29;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                StateFlow<NetworkCheckState> networkCheckState = GlobalNetworkMonitorObserver.access$getNetworkCheckManager$p(GlobalNetworkMonitorObserver.this).getNetworkCheckState();
                final GlobalNetworkMonitorObserver globalNetworkMonitorObserver = GlobalNetworkMonitorObserver.this;
                this.component1 = 1;
                if (networkCheckState.collect(new FlowCollector() {
                    private static int component1 = 0;
                    private static int component2 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i4 = 2 % 2;
                        int i5 = component1 + 25;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        Object objComponent3 = component3((NetworkCheckState) obj2, continuation);
                        int i7 = component2 + 31;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                        return objComponent3;
                    }

                    public final Object component3(NetworkCheckState networkCheckState2, Continuation<? super Unit> continuation) {
                        int i4 = 2 % 2;
                        L.d(GlobalNetworkMonitorObserver.access$getTAG$p(globalNetworkMonitorObserver), "Connection State " + networkCheckState2.isEnabled());
                        Unit unit = Unit.INSTANCE;
                        int i5 = component2 + 95;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    int i4 = component3 + 71;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            throw new KotlinNothingValueException();
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = GlobalNetworkMonitorObserver.this.new component2(continuation);
            int i2 = ShareDataUIState + 117;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component3 + 121;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            int i5 = ShareDataUIState + 37;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(this.equals, null, null, new component2(null), 3, null);
        int i2 = copy + 1;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean isNetworkAvailable() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 35;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            this.getRequestBeneficiariesState.isConnected();
            throw null;
        }
        boolean zIsConnected = this.getRequestBeneficiariesState.isConnected();
        int i3 = copy + 101;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return zIsConnected;
    }

    public final boolean isWifiOn() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 109;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsWifiOn = this.getRequestBeneficiariesState.isWifiOn();
        int i4 = copy + 107;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsWifiOn;
        }
        throw null;
    }

    public final boolean isDataOn() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 77;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsDataOn = this.getRequestBeneficiariesState.isDataOn();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return zIsDataOn;
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = copy + 67;
        ArtificialStackFrames = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.getAsAtTimestamp.updateNetworkCheckState(this.getRequestBeneficiariesState.isConnected());
            int i3 = ArtificialStackFrames + 121;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.getAsAtTimestamp.updateNetworkCheckState(this.getRequestBeneficiariesState.isConnected());
        throw null;
    }

    private final void component1() throws Throwable {
        int i = 2 % 2;
        component2();
        NetworkMonitor networkMonitor = this.getRequestBeneficiariesState;
        NetworkCallback networkCallback = this.component2;
        if (networkCallback == null) {
            int i2 = ArtificialStackFrames + 79;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            networkCallback = null;
        }
        networkMonitor.registerNetworkCallback(networkCallback);
        int i4 = ArtificialStackFrames + 13;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor) = 
  (r1v4 com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor)
  (r1v7 com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor)
 binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void copydefault() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver.copy
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver.ArtificialStackFrames = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor r1 = r4.getRequestBeneficiariesState
            com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$NetworkCallback r2 = r4.component2
            r3 = 33
            int r3 = r3 / 0
            if (r2 != 0) goto L2e
            goto L1f
        L19:
            com.huawei.digitalpayment.consumer.base.networkcheck.NetworkMonitor r1 = r4.getRequestBeneficiariesState
            com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver$NetworkCallback r2 = r4.component2
            if (r2 != 0) goto L2e
        L1f:
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            int r2 = com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver.ArtificialStackFrames
            int r2 = r2 + 15
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver.copy = r3
            int r2 = r2 % r0
            r2 = 0
        L2e:
            android.net.ConnectivityManager$NetworkCallback r2 = (android.net.ConnectivityManager.NetworkCallback) r2
            r1.unregisterNetworkCallback(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.networkcheck.GlobalNetworkMonitorObserver.copydefault():void");
    }

    @Override
    public void onResume(LifecycleOwner owner) throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 103;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(owner, "");
            super.onResume(owner);
            component1();
        } else {
            Intrinsics.checkNotNullParameter(owner, "");
            super.onResume(owner);
            component1();
            int i3 = 73 / 0;
        }
    }

    @Override
    public void onDestroy(LifecycleOwner owner) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 103;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(owner, "");
            super.onDestroy(owner);
            copydefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(owner, "");
        super.onDestroy(owner);
        copydefault();
        int i3 = copy + 35;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = copy + 61;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver$NetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "liveData", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/networkcheck/GlobalNetworkMonitorObserver;)V", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkCallback extends ConnectivityManager.NetworkCallback {
        private static int component2 = 1;
        private static int component3;
        private final GlobalNetworkMonitorObserver component1;

        public NetworkCallback(GlobalNetworkMonitorObserver globalNetworkMonitorObserver) {
            Intrinsics.checkNotNullParameter(globalNetworkMonitorObserver, "");
            this.component1 = globalNetworkMonitorObserver;
        }

        @Override
        public void onAvailable(Network network) {
            NetworkCheckManager networkCheckManagerAccess$getNetworkCheckManager$p;
            boolean z;
            int i = 2 % 2;
            int i2 = component3 + 63;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(network, "");
                networkCheckManagerAccess$getNetworkCheckManager$p = GlobalNetworkMonitorObserver.access$getNetworkCheckManager$p(this.component1);
                z = false;
            } else {
                Intrinsics.checkNotNullParameter(network, "");
                networkCheckManagerAccess$getNetworkCheckManager$p = GlobalNetworkMonitorObserver.access$getNetworkCheckManager$p(this.component1);
                z = true;
            }
            networkCheckManagerAccess$getNetworkCheckManager$p.updateNetworkCheckState(z);
            int i3 = component2 + 11;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public void onLost(Network network) {
            GlobalNetworkMonitorObserver globalNetworkMonitorObserver;
            int i = 2 % 2;
            int i2 = component3 + 65;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(network, "");
                globalNetworkMonitorObserver = this.component1;
            } else {
                Intrinsics.checkNotNullParameter(network, "");
                globalNetworkMonitorObserver = this.component1;
            }
            GlobalNetworkMonitorObserver.access$getNetworkCheckManager$p(globalNetworkMonitorObserver).updateNetworkCheckState(false);
            int i3 = component2 + 97;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            int i = 2 % 2;
            int i2 = component3 + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(network, "");
            Intrinsics.checkNotNullParameter(networkCapabilities, "");
            super.onCapabilitiesChanged(network, networkCapabilities);
            if (!networkCapabilities.hasCapability(12)) {
                GlobalNetworkMonitorObserver.access$getNetworkCheckManager$p(this.component1).updateNetworkCheckState(false);
                return;
            }
            int i4 = component2 + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            GlobalNetworkMonitorObserver.access$getNetworkCheckManager$p(this.component1).updateNetworkCheckState(true);
        }
    }
}
