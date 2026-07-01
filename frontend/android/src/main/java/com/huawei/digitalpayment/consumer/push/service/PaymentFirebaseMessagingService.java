package com.huawei.digitalpayment.consumer.push.service;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.GsonUtils;
import com.google.common.base.Ascii;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.push.FirebaseInit;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.cancelAll;
import kotlin.cancelNotification;

public class PaymentFirebaseMessagingService extends FirebaseMessagingService {
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static char[] ShareDataUIState = null;
    private static final String TAG = "PaymentFirebaseMessagingService";
    private static long component1;
    private static char[] component2;
    private static int component3;
    private static int copy;
    private static char copydefault;
    private static final Queue<String> recentlyReceivedMessageIds;
    private static final byte[] $$s = {8, -40, 43, -43};
    private static final int $$t = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {66, -42, -1, 80, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1};
    private static final int $$k = 225;
    private static final byte[] $$g = {TarHeader.LF_SYMLINK, -82, -81, 124, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 20, 9, 17, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$h = 18;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$u(short r7, short r8, int r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r7 = 122 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.$$s
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.$$u(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.$$g
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r6 = r6 + 4
            int r1 = r5 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.l(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 9
            int r8 = 13 - r8
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.$$j
            int r7 = r7 * 6
            int r1 = 16 - r7
            byte[] r1 = new byte[r1]
            int r7 = 15 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-16)
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.m(byte, byte, short, java.lang.Object[]):void");
    }

    static {
        copy = 0;
        component1();
        ShareDataUIState();
        recentlyReceivedMessageIds = new ArrayDeque(10);
        int i = getAsAtTimestamp + 25;
        copy = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onNewToken(String str) {
        int i = 2 % 2;
        L.d(TAG, "Firebase getToken newtoken " + str);
        TokenHelper.INSTANCE.saveFirebaseTokenToSp(str);
        String currentLang = LanguageUtils.getInstance().getCurrentLang();
        FirebaseInit.reSubscribeToTopic(currentLang, currentLang);
        int i2 = equals + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void handleIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = component4 + 25;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            L.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "handleIntent");
            super.handleIntent(intent);
            if (!isAppForeground()) {
                L.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "background handleIntent");
                removeFirebaseOriginalNotifications();
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                onMessageReceived(new RemoteMessage(extras));
                int i3 = component4 + 19;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        L.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "handleIntent");
        super.handleIntent(intent);
        isAppForeground();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean isAppForeground() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        equals = i2 % 128;
        if (i2 % 2 != 0 ? ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() : ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            int i3 = equals + 83;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private static void j(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component2[i2 % i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16775458) - Color.rgb(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 34, (char) (ImageFormat.getBitsPerPixel(0) + 1), 1159210934, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(component1), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 5;
                        byte b5 = (byte) (b4 - 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3608, 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7172), 1951385784, false, $$u(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 4013, 24 - (Process.myTid() >> 22), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$u(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr5 = {Integer.valueOf(component2[i2 + i6])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 1;
                        byte b9 = (byte) (b8 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 1758, View.getDefaultSize(0, 0) + 34, (char) Color.green(0), 1159210934, false, $$u(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault5 == null) {
                            byte b10 = (byte) 5;
                            byte b11 = (byte) (b10 - 5);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 29 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7170), 1951385784, false, $$u(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {cancelnotification, cancelnotification};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault6 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4013, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$u(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
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
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i7 = $10 + 59;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 4013, 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (27762 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -1529629956, false, $$u(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private void removeFirebaseOriginalNotifications() {
        StatusBarNotification[] activeNotifications;
        int i = 2 % 2;
        int i2 = component4 + 11;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager == null || (activeNotifications = notificationManager.getActiveNotifications()) == null) {
            return;
        }
        int length = activeNotifications.length;
        int i3 = 0;
        while (i3 < length) {
            StatusBarNotification statusBarNotification = activeNotifications[i3];
            L.d("FCM StatusBarNotification", "tag/id: " + statusBarNotification.getTag() + " / " + statusBarNotification.getId());
            String tag = statusBarNotification.getTag();
            int id = statusBarNotification.getId();
            if (tag != null && (tag.contains("FCM-Notification") || tag.contains("campaign_collapse_key"))) {
                notificationManager.cancel(tag, id);
            }
            i3++;
            int i4 = component4 + 33;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        int i = 2 % 2;
        L.d("Firebase onMessageReceived success \n from：" + remoteMessage.getFrom() + "\n to：" + remoteMessage.getTo() + "\n messageId：" + remoteMessage.getMessageId() + "\n messageType：" + remoteMessage.getMessageType() + "\n senderId：" + remoteMessage.getSenderId() + "\n collapseKey：" + remoteMessage.getCollapseKey() + "\n originalPriority：" + remoteMessage.getOriginalPriority() + "\n sentTime：" + remoteMessage.getSentTime() + "\n ttl：" + remoteMessage.getTtl() + "\n data：" + GsonUtils.toJson(remoteMessage.getData()));
        if (!alreadyReceivedMessage(remoteMessage.getMessageId())) {
            int i2 = component4 + 117;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ((IPushService) RouteUtils.getService(IPushService.class)).onMessageReceived(remoteMessage.getData());
            int i4 = equals + 1;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void k(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            int i5 = $10 + 115;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i2 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getEdgeSlop() >> 16), 38 - View.MeasureSpec.getMode(0), (char) (26860 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 2015799920, false, $$u((byte) 57, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getScrollBarSize() >> 8), ImageFormat.getBitsPerPixel(0) + 17, (char) (Process.myPid() >> 22), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            int i10 = $10 + 19;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i12 = $10 + 53;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.getCapsMode("", 0, 0), View.resolveSize(0, 0) + 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r6 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.recentlyReceivedMessageIds;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1.contains(r6) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        com.huawei.common.util.L.d(com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.TAG, "Received duplicate message: " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1.size() < 10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r1.remove();
        r3 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.equals + 103;
        com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.component4 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if ((r3 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r0 = 4 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r1.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.component4 + 93;
        com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.equals = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean alreadyReceivedMessage(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.equals
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.component4 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r3 = 83
            int r3 = r3 / r2
            if (r1 == 0) goto L2d
            goto L1f
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L2d
        L1f:
            int r6 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.component4
            int r6 = r6 + 93
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.equals = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L2b
            return r2
        L2b:
            r6 = 0
            throw r6
        L2d:
            java.util.Queue<java.lang.String> r1 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.recentlyReceivedMessageIds
            boolean r3 = r1.contains(r6)
            if (r3 == 0) goto L4a
            java.lang.String r0 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Received duplicate message: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.huawei.common.util.L.d(r0, r6)
            r6 = 1
            return r6
        L4a:
            int r3 = r1.size()
            r4 = 10
            if (r3 < r4) goto L62
            r1.remove()
            int r3 = com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.equals
            int r3 = r3 + 103
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.component4 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L62
            r0 = 4
            int r0 = r0 / r0
        L62:
            r1.add(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.alreadyReceivedMessage(java.lang.String):boolean");
    }

    private static void n(byte b2, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        int i4 = 2;
        int i5 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        Object obj2 = null;
        if (cArr2 != null) {
            int i6 = $11 + 75;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 7423, ExpandableListView.getPackedPositionGroup(0L) + 15, (char) (64291 - (ViewConfiguration.getLongPressTimeout() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.getTrimmedLength(""), 14 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            int i9 = 3;
            if (i % 2 != 0) {
                int i10 = $11 + 3;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i12 = $11 + 39;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    int i14 = $10 + 71;
                    $11 = i14 % 128;
                    int i15 = i14 % i4;
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i16 = $10 + 11;
                        $11 = i16 % 128;
                        if (i16 % i4 == 0) {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 % b2);
                            cArr4[cancelall.component2] = (char) (cancelall.component3 / b2);
                        } else {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                            cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        }
                        obj = obj2;
                        i3 = i9;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[i9] = cancelall;
                        objArr4[i4] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int deadChar = 7117 - KeyEvent.getDeadChar(0, 0);
                            int iMyTid = 14 - (Process.myTid() >> 22);
                            char deadChar2 = (char) (44463 - KeyEvent.getDeadChar(0, 0));
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[i4] = Integer.TYPE;
                            clsArr[i9] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[8] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, iMyTid, deadChar2, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            try {
                                Object[] objArr5 = new Object[11];
                                objArr5[10] = cancelall;
                                objArr5[9] = Integer.valueOf(cCharValue);
                                objArr5[8] = cancelall;
                                objArr5[7] = Integer.valueOf(cCharValue);
                                objArr5[6] = Integer.valueOf(cCharValue);
                                objArr5[5] = cancelall;
                                objArr5[4] = cancelall;
                                objArr5[i9] = Integer.valueOf(cCharValue);
                                objArr5[i4] = Integer.valueOf(cCharValue);
                                objArr5[1] = cancelall;
                                objArr5[0] = cancelall;
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                                if (objCopydefault4 == null) {
                                    int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2943;
                                    int i18 = 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    char cLastIndexOf = (char) (27636 - TextUtils.lastIndexOf("", '0', 0));
                                    byte b3 = (byte) i9;
                                    byte b4 = (byte) (b3 - 3);
                                    String str$$u = $$u(b3, b4, b4);
                                    i3 = 3;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i17, i18, cLastIndexOf, 794909189, false, str$$u, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    i3 = i9;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[iIntValue];
                                cArr4[cancelall.component2 + 1] = cArr2[i19];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            i3 = i9;
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i20 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i20];
                                cArr4[cancelall.component2 + 1] = cArr2[i21];
                            } else {
                                int i22 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i23 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i22];
                                cArr4[cancelall.component2 + 1] = cArr2[i23];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    i4 = 2;
                    i9 = i3;
                }
            }
            for (int i24 = 0; i24 < i; i24++) {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x08a5 A[Catch: all -> 0x0c59, TRY_ENTER, TRY_LEAVE, TryCatch #42 {all -> 0x0c59, blocks: (B:87:0x07ec, B:93:0x083b, B:102:0x08a5), top: B:934:0x07ec }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0afc A[Catch: all -> 0x0c2a, TryCatch #9 {all -> 0x0c2a, blocks: (B:145:0x0af2, B:146:0x0af6, B:148:0x0afc, B:151:0x0b16, B:140:0x0a93, B:144:0x0aea), top: B:873:0x0a93 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0cec A[Catch: all -> 0x058a, TryCatch #57 {all -> 0x058a, blocks: (B:208:0x0ce6, B:210:0x0cec, B:211:0x0d17, B:339:0x13fb, B:341:0x1401, B:342:0x1430, B:541:0x1f1e, B:543:0x1f24, B:544:0x1f4f, B:775:0x3418, B:777:0x341e, B:778:0x344e, B:812:0x3765, B:814:0x376b, B:815:0x3792, B:792:0x3597, B:794:0x35ba, B:795:0x3611, B:734:0x3038, B:736:0x303e, B:737:0x3067, B:835:0x3868, B:837:0x386e, B:838:0x389c, B:840:0x38d6, B:841:0x391f, B:610:0x2822, B:612:0x2837, B:613:0x2867, B:592:0x2535, B:594:0x253b, B:595:0x256a, B:597:0x25a4, B:598:0x25e9, B:562:0x219a, B:564:0x21af, B:565:0x21de, B:567:0x2212, B:568:0x2291, B:424:0x18f0, B:426:0x18f6, B:427:0x1920, B:80:0x073a, B:82:0x0740, B:83:0x076d, B:19:0x0263, B:21:0x0269, B:22:0x0297, B:24:0x04f4, B:26:0x0525, B:27:0x0584), top: B:961:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0dee A[Catch: all -> 0x1366, PHI: r1 r4 r32 r33
  0x0dee: PHI (r1v690 java.lang.Object) = (r1v684 java.lang.Object), (r1v689 java.lang.Object) binds: [B:216:0x0d9c, B:217:0x0d9e] A[DONT_GENERATE, DONT_INLINE]
  0x0dee: PHI (r4v69 ??) = (r4v124 ??), (r4v125 ??) binds: [B:216:0x0d9c, B:217:0x0d9e] A[DONT_GENERATE, DONT_INLINE]
  0x0dee: PHI (r32v90 ??) = (r32v168 ??), (r32v169 ??) binds: [B:216:0x0d9c, B:217:0x0d9e] A[DONT_GENERATE, DONT_INLINE]
  0x0dee: PHI (r33v93 ??) = (r33v166 ??), (r33v167 ??) binds: [B:216:0x0d9c, B:217:0x0d9e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #45 {all -> 0x1366, blocks: (B:215:0x0d98, B:221:0x0dee, B:225:0x0e5f, B:246:0x0f04), top: B:939:0x0d98 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0ed4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0efc A[Catch: all -> 0x0de6, TRY_ENTER, TRY_LEAVE, TryCatch #44 {all -> 0x0de6, blocks: (B:217:0x0d9e, B:224:0x0e16, B:229:0x0e78, B:231:0x0e7e, B:232:0x0ec7, B:235:0x0ed8, B:238:0x0ee6, B:242:0x0efc), top: B:938:0x0d9e }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x1217 A[Catch: all -> 0x1344, TryCatch #30 {all -> 0x1344, blocks: (B:279:0x120d, B:280:0x1211, B:282:0x1217, B:285:0x1232, B:248:0x0f12, B:265:0x10e7, B:268:0x1133, B:274:0x11ab, B:278:0x1205), top: B:913:0x0f12 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x1401 A[Catch: all -> 0x058a, TryCatch #57 {all -> 0x058a, blocks: (B:208:0x0ce6, B:210:0x0cec, B:211:0x0d17, B:339:0x13fb, B:341:0x1401, B:342:0x1430, B:541:0x1f1e, B:543:0x1f24, B:544:0x1f4f, B:775:0x3418, B:777:0x341e, B:778:0x344e, B:812:0x3765, B:814:0x376b, B:815:0x3792, B:792:0x3597, B:794:0x35ba, B:795:0x3611, B:734:0x3038, B:736:0x303e, B:737:0x3067, B:835:0x3868, B:837:0x386e, B:838:0x389c, B:840:0x38d6, B:841:0x391f, B:610:0x2822, B:612:0x2837, B:613:0x2867, B:592:0x2535, B:594:0x253b, B:595:0x256a, B:597:0x25a4, B:598:0x25e9, B:562:0x219a, B:564:0x21af, B:565:0x21de, B:567:0x2212, B:568:0x2291, B:424:0x18f0, B:426:0x18f6, B:427:0x1920, B:80:0x073a, B:82:0x0740, B:83:0x076d, B:19:0x0263, B:21:0x0269, B:22:0x0297, B:24:0x04f4, B:26:0x0525, B:27:0x0584), top: B:961:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1516  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1574 A[Catch: all -> 0x1838, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x1838, blocks: (B:346:0x14b4, B:352:0x1509, B:362:0x1574, B:372:0x1601, B:375:0x164d), top: B:900:0x14b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1737  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x18f6 A[Catch: all -> 0x058a, TryCatch #57 {all -> 0x058a, blocks: (B:208:0x0ce6, B:210:0x0cec, B:211:0x0d17, B:339:0x13fb, B:341:0x1401, B:342:0x1430, B:541:0x1f1e, B:543:0x1f24, B:544:0x1f4f, B:775:0x3418, B:777:0x341e, B:778:0x344e, B:812:0x3765, B:814:0x376b, B:815:0x3792, B:792:0x3597, B:794:0x35ba, B:795:0x3611, B:734:0x3038, B:736:0x303e, B:737:0x3067, B:835:0x3868, B:837:0x386e, B:838:0x389c, B:840:0x38d6, B:841:0x391f, B:610:0x2822, B:612:0x2837, B:613:0x2867, B:592:0x2535, B:594:0x253b, B:595:0x256a, B:597:0x25a4, B:598:0x25e9, B:562:0x219a, B:564:0x21af, B:565:0x21de, B:567:0x2212, B:568:0x2291, B:424:0x18f0, B:426:0x18f6, B:427:0x1920, B:80:0x073a, B:82:0x0740, B:83:0x076d, B:19:0x0263, B:21:0x0269, B:22:0x0297, B:24:0x04f4, B:26:0x0525, B:27:0x0584), top: B:961:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1a00  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1ac8 A[Catch: all -> 0x1e4f, TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x1e4f, blocks: (B:431:0x19a3, B:437:0x19f3, B:485:0x1cfb, B:486:0x1cff, B:488:0x1d05, B:491:0x1d20, B:453:0x1ac8, B:471:0x1bd6, B:475:0x1c22, B:481:0x1c97, B:484:0x1cf3), top: B:922:0x19a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1d05 A[Catch: all -> 0x1e4f, TryCatch #35 {all -> 0x1e4f, blocks: (B:431:0x19a3, B:437:0x19f3, B:485:0x1cfb, B:486:0x1cff, B:488:0x1d05, B:491:0x1d20, B:453:0x1ac8, B:471:0x1bd6, B:475:0x1c22, B:481:0x1c97, B:484:0x1cf3), top: B:922:0x19a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x1f24 A[Catch: all -> 0x058a, TryCatch #57 {all -> 0x058a, blocks: (B:208:0x0ce6, B:210:0x0cec, B:211:0x0d17, B:339:0x13fb, B:341:0x1401, B:342:0x1430, B:541:0x1f1e, B:543:0x1f24, B:544:0x1f4f, B:775:0x3418, B:777:0x341e, B:778:0x344e, B:812:0x3765, B:814:0x376b, B:815:0x3792, B:792:0x3597, B:794:0x35ba, B:795:0x3611, B:734:0x3038, B:736:0x303e, B:737:0x3067, B:835:0x3868, B:837:0x386e, B:838:0x389c, B:840:0x38d6, B:841:0x391f, B:610:0x2822, B:612:0x2837, B:613:0x2867, B:592:0x2535, B:594:0x253b, B:595:0x256a, B:597:0x25a4, B:598:0x25e9, B:562:0x219a, B:564:0x21af, B:565:0x21de, B:567:0x2212, B:568:0x2291, B:424:0x18f0, B:426:0x18f6, B:427:0x1920, B:80:0x073a, B:82:0x0740, B:83:0x076d, B:19:0x0263, B:21:0x0269, B:22:0x0297, B:24:0x04f4, B:26:0x0525, B:27:0x0584), top: B:961:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x1fd7  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x2044  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x208b  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x20a0  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x217c  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x23d7  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x24f3  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x26ea  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x2737  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x2802  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x29ab  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x303e A[Catch: all -> 0x058a, TryCatch #57 {all -> 0x058a, blocks: (B:208:0x0ce6, B:210:0x0cec, B:211:0x0d17, B:339:0x13fb, B:341:0x1401, B:342:0x1430, B:541:0x1f1e, B:543:0x1f24, B:544:0x1f4f, B:775:0x3418, B:777:0x341e, B:778:0x344e, B:812:0x3765, B:814:0x376b, B:815:0x3792, B:792:0x3597, B:794:0x35ba, B:795:0x3611, B:734:0x3038, B:736:0x303e, B:737:0x3067, B:835:0x3868, B:837:0x386e, B:838:0x389c, B:840:0x38d6, B:841:0x391f, B:610:0x2822, B:612:0x2837, B:613:0x2867, B:592:0x2535, B:594:0x253b, B:595:0x256a, B:597:0x25a4, B:598:0x25e9, B:562:0x219a, B:564:0x21af, B:565:0x21de, B:567:0x2212, B:568:0x2291, B:424:0x18f0, B:426:0x18f6, B:427:0x1920, B:80:0x073a, B:82:0x0740, B:83:0x076d, B:19:0x0263, B:21:0x0269, B:22:0x0297, B:24:0x04f4, B:26:0x0525, B:27:0x0584), top: B:961:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:742:0x30f2  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x3140  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x31f8  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x33f9  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x34d9  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x3527  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x3579  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0238 A[PHI: r15
  0x0238: PHI (r15v98 char) = (r15v17 char), (r15v99 char) binds: [B:17:0x025e, B:5:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:811:0x3745  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x3831  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0740 A[Catch: all -> 0x058a, TryCatch #57 {all -> 0x058a, blocks: (B:208:0x0ce6, B:210:0x0cec, B:211:0x0d17, B:339:0x13fb, B:341:0x1401, B:342:0x1430, B:541:0x1f1e, B:543:0x1f24, B:544:0x1f4f, B:775:0x3418, B:777:0x341e, B:778:0x344e, B:812:0x3765, B:814:0x376b, B:815:0x3792, B:792:0x3597, B:794:0x35ba, B:795:0x3611, B:734:0x3038, B:736:0x303e, B:737:0x3067, B:835:0x3868, B:837:0x386e, B:838:0x389c, B:840:0x38d6, B:841:0x391f, B:610:0x2822, B:612:0x2837, B:613:0x2867, B:592:0x2535, B:594:0x253b, B:595:0x256a, B:597:0x25a4, B:598:0x25e9, B:562:0x219a, B:564:0x21af, B:565:0x21de, B:567:0x2212, B:568:0x2291, B:424:0x18f0, B:426:0x18f6, B:427:0x1920, B:80:0x073a, B:82:0x0740, B:83:0x076d, B:19:0x0263, B:21:0x0269, B:22:0x0297, B:24:0x04f4, B:26:0x0525, B:27:0x0584), top: B:961:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:889:0x07f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0246 A[PHI: r15
  0x0246: PHI (r15v17 char) = (r15v16 char), (r15v100 char) binds: [B:3:0x0230, B:5:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:938:0x0d9e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:943:0x19a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:956:0x14ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0848  */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v178 */
    /* JADX WARN: Type inference failed for: r11v179 */
    /* JADX WARN: Type inference failed for: r11v182 */
    /* JADX WARN: Type inference failed for: r11v183 */
    /* JADX WARN: Type inference failed for: r11v186 */
    /* JADX WARN: Type inference failed for: r11v187 */
    /* JADX WARN: Type inference failed for: r11v188 */
    /* JADX WARN: Type inference failed for: r11v189 */
    /* JADX WARN: Type inference failed for: r11v207, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v208 */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v214 */
    /* JADX WARN: Type inference failed for: r11v215 */
    /* JADX WARN: Type inference failed for: r11v234 */
    /* JADX WARN: Type inference failed for: r11v235 */
    /* JADX WARN: Type inference failed for: r11v236 */
    /* JADX WARN: Type inference failed for: r11v237 */
    /* JADX WARN: Type inference failed for: r11v238 */
    /* JADX WARN: Type inference failed for: r11v239 */
    /* JADX WARN: Type inference failed for: r11v240 */
    /* JADX WARN: Type inference failed for: r11v241 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r32v100 */
    /* JADX WARN: Type inference failed for: r32v106 */
    /* JADX WARN: Type inference failed for: r32v107 */
    /* JADX WARN: Type inference failed for: r32v108 */
    /* JADX WARN: Type inference failed for: r32v109 */
    /* JADX WARN: Type inference failed for: r32v110 */
    /* JADX WARN: Type inference failed for: r32v111 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v121 */
    /* JADX WARN: Type inference failed for: r32v123 */
    /* JADX WARN: Type inference failed for: r32v125 */
    /* JADX WARN: Type inference failed for: r32v126 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v130 */
    /* JADX WARN: Type inference failed for: r32v131 */
    /* JADX WARN: Type inference failed for: r32v134 */
    /* JADX WARN: Type inference failed for: r32v135 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v140 */
    /* JADX WARN: Type inference failed for: r32v142 */
    /* JADX WARN: Type inference failed for: r32v143 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v154 */
    /* JADX WARN: Type inference failed for: r32v155 */
    /* JADX WARN: Type inference failed for: r32v156 */
    /* JADX WARN: Type inference failed for: r32v157 */
    /* JADX WARN: Type inference failed for: r32v158 */
    /* JADX WARN: Type inference failed for: r32v159 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v160 */
    /* JADX WARN: Type inference failed for: r32v161 */
    /* JADX WARN: Type inference failed for: r32v162 */
    /* JADX WARN: Type inference failed for: r32v163 */
    /* JADX WARN: Type inference failed for: r32v166 */
    /* JADX WARN: Type inference failed for: r32v167 */
    /* JADX WARN: Type inference failed for: r32v168 */
    /* JADX WARN: Type inference failed for: r32v169 */
    /* JADX WARN: Type inference failed for: r32v170 */
    /* JADX WARN: Type inference failed for: r32v171 */
    /* JADX WARN: Type inference failed for: r32v172 */
    /* JADX WARN: Type inference failed for: r32v173 */
    /* JADX WARN: Type inference failed for: r32v174 */
    /* JADX WARN: Type inference failed for: r32v175 */
    /* JADX WARN: Type inference failed for: r32v176 */
    /* JADX WARN: Type inference failed for: r32v177 */
    /* JADX WARN: Type inference failed for: r32v178 */
    /* JADX WARN: Type inference failed for: r32v179 */
    /* JADX WARN: Type inference failed for: r32v180 */
    /* JADX WARN: Type inference failed for: r32v181 */
    /* JADX WARN: Type inference failed for: r32v182 */
    /* JADX WARN: Type inference failed for: r32v183 */
    /* JADX WARN: Type inference failed for: r32v184 */
    /* JADX WARN: Type inference failed for: r32v185 */
    /* JADX WARN: Type inference failed for: r32v186 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v42 */
    /* JADX WARN: Type inference failed for: r32v58 */
    /* JADX WARN: Type inference failed for: r32v87 */
    /* JADX WARN: Type inference failed for: r32v88 */
    /* JADX WARN: Type inference failed for: r32v90 */
    /* JADX WARN: Type inference failed for: r32v91 */
    /* JADX WARN: Type inference failed for: r32v92 */
    /* JADX WARN: Type inference failed for: r32v93 */
    /* JADX WARN: Type inference failed for: r32v96 */
    /* JADX WARN: Type inference failed for: r32v97 */
    /* JADX WARN: Type inference failed for: r32v99 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v100 */
    /* JADX WARN: Type inference failed for: r33v102 */
    /* JADX WARN: Type inference failed for: r33v103 */
    /* JADX WARN: Type inference failed for: r33v104 */
    /* JADX WARN: Type inference failed for: r33v107 */
    /* JADX WARN: Type inference failed for: r33v108 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v112, types: [long] */
    /* JADX WARN: Type inference failed for: r33v113 */
    /* JADX WARN: Type inference failed for: r33v114 */
    /* JADX WARN: Type inference failed for: r33v117 */
    /* JADX WARN: Type inference failed for: r33v118 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v121 */
    /* JADX WARN: Type inference failed for: r33v122 */
    /* JADX WARN: Type inference failed for: r33v123 */
    /* JADX WARN: Type inference failed for: r33v124 */
    /* JADX WARN: Type inference failed for: r33v126 */
    /* JADX WARN: Type inference failed for: r33v128 */
    /* JADX WARN: Type inference failed for: r33v129 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v130 */
    /* JADX WARN: Type inference failed for: r33v131, types: [int] */
    /* JADX WARN: Type inference failed for: r33v132 */
    /* JADX WARN: Type inference failed for: r33v133 */
    /* JADX WARN: Type inference failed for: r33v135 */
    /* JADX WARN: Type inference failed for: r33v136, types: [int] */
    /* JADX WARN: Type inference failed for: r33v137 */
    /* JADX WARN: Type inference failed for: r33v138 */
    /* JADX WARN: Type inference failed for: r33v139 */
    /* JADX WARN: Type inference failed for: r33v140 */
    /* JADX WARN: Type inference failed for: r33v141 */
    /* JADX WARN: Type inference failed for: r33v142 */
    /* JADX WARN: Type inference failed for: r33v144 */
    /* JADX WARN: Type inference failed for: r33v145 */
    /* JADX WARN: Type inference failed for: r33v148 */
    /* JADX WARN: Type inference failed for: r33v149 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v150 */
    /* JADX WARN: Type inference failed for: r33v151 */
    /* JADX WARN: Type inference failed for: r33v152 */
    /* JADX WARN: Type inference failed for: r33v153 */
    /* JADX WARN: Type inference failed for: r33v154 */
    /* JADX WARN: Type inference failed for: r33v155 */
    /* JADX WARN: Type inference failed for: r33v156 */
    /* JADX WARN: Type inference failed for: r33v157 */
    /* JADX WARN: Type inference failed for: r33v158 */
    /* JADX WARN: Type inference failed for: r33v159 */
    /* JADX WARN: Type inference failed for: r33v160 */
    /* JADX WARN: Type inference failed for: r33v161 */
    /* JADX WARN: Type inference failed for: r33v162 */
    /* JADX WARN: Type inference failed for: r33v163 */
    /* JADX WARN: Type inference failed for: r33v164 */
    /* JADX WARN: Type inference failed for: r33v165 */
    /* JADX WARN: Type inference failed for: r33v166 */
    /* JADX WARN: Type inference failed for: r33v167 */
    /* JADX WARN: Type inference failed for: r33v168 */
    /* JADX WARN: Type inference failed for: r33v169 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v170 */
    /* JADX WARN: Type inference failed for: r33v171 */
    /* JADX WARN: Type inference failed for: r33v172 */
    /* JADX WARN: Type inference failed for: r33v173 */
    /* JADX WARN: Type inference failed for: r33v174 */
    /* JADX WARN: Type inference failed for: r33v175 */
    /* JADX WARN: Type inference failed for: r33v176 */
    /* JADX WARN: Type inference failed for: r33v177 */
    /* JADX WARN: Type inference failed for: r33v178 */
    /* JADX WARN: Type inference failed for: r33v179 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v180 */
    /* JADX WARN: Type inference failed for: r33v181 */
    /* JADX WARN: Type inference failed for: r33v182 */
    /* JADX WARN: Type inference failed for: r33v183 */
    /* JADX WARN: Type inference failed for: r33v184 */
    /* JADX WARN: Type inference failed for: r33v185 */
    /* JADX WARN: Type inference failed for: r33v186 */
    /* JADX WARN: Type inference failed for: r33v187 */
    /* JADX WARN: Type inference failed for: r33v188 */
    /* JADX WARN: Type inference failed for: r33v189 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v190 */
    /* JADX WARN: Type inference failed for: r33v191 */
    /* JADX WARN: Type inference failed for: r33v192 */
    /* JADX WARN: Type inference failed for: r33v193 */
    /* JADX WARN: Type inference failed for: r33v194 */
    /* JADX WARN: Type inference failed for: r33v195 */
    /* JADX WARN: Type inference failed for: r33v196 */
    /* JADX WARN: Type inference failed for: r33v197 */
    /* JADX WARN: Type inference failed for: r33v198 */
    /* JADX WARN: Type inference failed for: r33v199 */
    /* JADX WARN: Type inference failed for: r33v200 */
    /* JADX WARN: Type inference failed for: r33v201 */
    /* JADX WARN: Type inference failed for: r33v202 */
    /* JADX WARN: Type inference failed for: r33v203 */
    /* JADX WARN: Type inference failed for: r33v204 */
    /* JADX WARN: Type inference failed for: r33v205 */
    /* JADX WARN: Type inference failed for: r33v206 */
    /* JADX WARN: Type inference failed for: r33v207 */
    /* JADX WARN: Type inference failed for: r33v208 */
    /* JADX WARN: Type inference failed for: r33v209 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v210 */
    /* JADX WARN: Type inference failed for: r33v211 */
    /* JADX WARN: Type inference failed for: r33v212 */
    /* JADX WARN: Type inference failed for: r33v213 */
    /* JADX WARN: Type inference failed for: r33v214 */
    /* JADX WARN: Type inference failed for: r33v215 */
    /* JADX WARN: Type inference failed for: r33v216 */
    /* JADX WARN: Type inference failed for: r33v217 */
    /* JADX WARN: Type inference failed for: r33v218 */
    /* JADX WARN: Type inference failed for: r33v29 */
    /* JADX WARN: Type inference failed for: r33v64 */
    /* JADX WARN: Type inference failed for: r33v66 */
    /* JADX WARN: Type inference failed for: r33v67 */
    /* JADX WARN: Type inference failed for: r33v68 */
    /* JADX WARN: Type inference failed for: r33v69 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v71 */
    /* JADX WARN: Type inference failed for: r33v72 */
    /* JADX WARN: Type inference failed for: r33v77 */
    /* JADX WARN: Type inference failed for: r33v78 */
    /* JADX WARN: Type inference failed for: r33v79 */
    /* JADX WARN: Type inference failed for: r33v82 */
    /* JADX WARN: Type inference failed for: r33v83 */
    /* JADX WARN: Type inference failed for: r33v86 */
    /* JADX WARN: Type inference failed for: r33v87 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r33v93 */
    /* JADX WARN: Type inference failed for: r33v94 */
    /* JADX WARN: Type inference failed for: r33v98 */
    /* JADX WARN: Type inference failed for: r3v114, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v327 */
    /* JADX WARN: Type inference failed for: r3v606 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v18 */
    /* JADX WARN: Type inference failed for: r41v19 */
    /* JADX WARN: Type inference failed for: r41v20 */
    /* JADX WARN: Type inference failed for: r41v21 */
    /* JADX WARN: Type inference failed for: r41v22 */
    /* JADX WARN: Type inference failed for: r41v23 */
    /* JADX WARN: Type inference failed for: r41v43 */
    /* JADX WARN: Type inference failed for: r41v44 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v121 */
    /* JADX WARN: Type inference failed for: r4v122 */
    /* JADX WARN: Type inference failed for: r4v123 */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v125 */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v129 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /* JADX WARN: Type inference failed for: r4v131 */
    /* JADX WARN: Type inference failed for: r4v132 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v74, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r6v144, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v145, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v251 */
    /* JADX WARN: Type inference failed for: r6v313 */
    /* JADX WARN: Type inference failed for: r6v434 */
    /* JADX WARN: Type inference failed for: r6v529 */
    /* JADX WARN: Type inference failed for: r6v530 */
    /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v221, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v227, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v249 */
    /* JADX WARN: Type inference failed for: r7v336 */
    /* JADX WARN: Type inference failed for: r7v338 */
    /* JADX WARN: Type inference failed for: r7v339 */
    /* JADX WARN: Type inference failed for: r7v340 */
    /* JADX WARN: Type inference failed for: r7v341 */
    /* JADX WARN: Type inference failed for: r7v342 */
    /* JADX WARN: Type inference failed for: r7v349, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v352 */
    /* JADX WARN: Type inference failed for: r7v353 */
    /* JADX WARN: Type inference failed for: r7v375 */
    /* JADX WARN: Type inference failed for: r7v414 */
    /* JADX WARN: Type inference failed for: r7v421 */
    /* JADX WARN: Type inference failed for: r7v422 */
    /* JADX WARN: Type inference failed for: r7v424, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v432 */
    /* JADX WARN: Type inference failed for: r7v433 */
    /* JADX WARN: Type inference failed for: r7v434 */
    /* JADX WARN: Type inference failed for: r7v482 */
    /* JADX WARN: Type inference failed for: r7v483 */
    /* JADX WARN: Type inference failed for: r7v484 */
    /* JADX WARN: Type inference failed for: r7v485 */
    /* JADX WARN: Type inference failed for: r7v486 */
    /* JADX WARN: Type inference failed for: r7v487 */
    /* JADX WARN: Type inference failed for: r7v488 */
    /* JADX WARN: Type inference failed for: r7v489 */
    /* JADX WARN: Type inference failed for: r7v490 */
    /* JADX WARN: Type inference failed for: r7v491 */
    /* JADX WARN: Type inference failed for: r7v492 */
    /* JADX WARN: Type inference failed for: r7v493 */
    /* JADX WARN: Type inference failed for: r7v494 */
    /* JADX WARN: Type inference failed for: r7v495 */
    /* JADX WARN: Type inference failed for: r7v496 */
    /* JADX WARN: Type inference failed for: r7v497 */
    /* JADX WARN: Type inference failed for: r7v498 */
    /* JADX WARN: Type inference failed for: r7v499 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Type inference failed for: r7v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.service.PaymentFirebaseMessagingService.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onCreate() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = component4 + 93;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 39;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            ShareDataUIState = new char[]{2031, 2040, 2037, 2036, 1988, 2021, 1048, 1970, 2030, 2017, 2016, 1995, 2023, 1996, 1051, 2028, 2025, 2019, 2034, 2024, 2022, 2020, 1990, 1975, 2029, 1966, 2035, 1050, 1956, 2039, 1989, 2003, 2032, 2018, 1968, 2041};
            copydefault = (char) 12828;
            throw null;
        }
        ShareDataUIState = new char[]{2031, 2040, 2037, 2036, 1988, 2021, 1048, 1970, 2030, 2017, 2016, 1995, 2023, 1996, 1051, 2028, 2025, 2019, 2034, 2024, 2022, 2020, 1990, 1975, 2029, 1966, 2035, 1050, 1956, 2039, 1989, 2003, 2032, 2018, 1968, 2041};
        copydefault = (char) 12828;
        int i4 = i2 + 9;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        component3 = -890926418;
        component2 = new char[]{3099, 53100, 35557, 17974, 414, 31413, 47488, 64635, 12488, 30520, 43612, 61157, 11525, 25003, 42141, 56120, 8098, 21014, 38578, 54746, 2090, 19664, 33653, 50758, 64233, 14603, 32173, 45119, 63318, 11257, 28234, 41661, 57799, 9269, 22657, 40748, 53790, 5845, 21872, 35264, 52284, 856, 18350, 31247, 48885, 64970, 12392, 29826, 43795, 61361, 8923, 24957, 42443, 55332, 8001, 21424, 38405, 51880, 2506, 19543, 32930, 51020, 64491, 16083, 32102, 45447, 62502, 11082, 28603, 2976, 51423, 36218, 16785, 1591, 56093, 40885, 23634, 4326, 54662, 43566, 28350, 9055, 59305, 42134, 31024, 15817, 62061, 46860, 35747, 18496, 3296, 49449, 34383, 23214, 7959, 54190, 37067, 21881, 10654, 60966, 41814, 26569, 9336, 63642, 48495, 29251, 14066, 2843, 53167, 36052, 16736, 1415, 55836, 40621, 21469, 4199, 54475, 43323, 28244, 8947, 59230, 48053, 30919, 15683, 61858, 46601, 35501, 20417, 3196, 49295, 34091, 23069, 7907, 54074, 38852, 21547, 10583, 60897, 41481, 26286, 15310, 3090, 53028, 35537, 18025, 462, 56490, 38982, 23541, 5955, 53821, 44440, 26895, 9442, 57436, 41768, 32398, 14963, 62931, 45229, 35918, 20478, 2905, 50838, 33214, 23816, 6328, 54348, 38754, 21146, 11893, 59861, 42173, 24695, 9089, 65383, 47823, 3150, 53028, 35462, 18031, 462, 56490, 38931, 23547, 5976, 53823, 44444, 50276, 1800, 17063, 36446, 51686, 5251, 20531, 37790, 57202, 6669, 26101, 41239, 60632, 10353, 27419, 46765, 62040, 15829, 30879, 17459, 34778, 50033, 3150, 53024, 35464, 18022, 451, 56490, 38928, 23542, 5975, 53823, 22640, 39700, 57014, 4703, 22006, 34971, 52258, 4046, 17256, 34318, 63909, 50384, 1973, 16923, 36601, 51537, 5181, 20609, 37731, 57285, 6825, 25866};
        component1 = -2600123677610553579L;
    }
}
