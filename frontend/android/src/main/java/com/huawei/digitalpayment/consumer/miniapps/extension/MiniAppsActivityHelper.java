package com.huawei.digitalpayment.consumer.miniapps.extension;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.common.activity.ActivityHelperExtension;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.session.SFCSessionOutManager;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J-\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050!2\u0006\u0010\"\u001a\u00020#H\u0016¢\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010&H\u0016J\u0016\u0010'\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tJ\b\u0010(\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/extension/MiniAppsActivityHelper;", "Lcom/alibaba/griver/api/common/activity/ActivityHelperExtension;", "<init>", "()V", "TAG", "", "miniAppsActivityListener", "Lcom/huawei/digitalpayment/consumer/miniapps/extension/MiniAppsActivityHelper$MiniAppsActivityListener;", "currentRequestCode", "", "miniAppsActivity", "Landroid/app/Activity;", "sfcSessionOutManager", "Lcom/huawei/digitalpayment/consumer/base/session/SFCSessionOutManager;", "bindActivity", "", "activity", "onCreate", "p0", "Landroid/os/Bundle;", "onResume", "onNewIntent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "resultCode", "data", "onPause", "onStop", "onDestroy", "finish", "onRequestPermissionsResult", "p1", "", "p2", "", "(I[Ljava/lang/String;[I)V", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "setMiniAppsActivityListener", "getMiniAppsActivity", "MiniAppsActivityListener", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppsActivityHelper implements ActivityHelperExtension {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component2;
    private static boolean component3;
    private static int copy;
    private static boolean copydefault;
    private final String TAG;
    private int currentRequestCode;
    private Activity miniAppsActivity;
    private MiniAppsActivityListener miniAppsActivityListener;
    private final SFCSessionOutManager sfcSessionOutManager;
    private static final byte[] $$c = {69, -38, -90, 81};
    private static final int $$f = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {108, -1, -36, 99, Ascii.VT, Ascii.FF, -1, 4, Ascii.FF, 17, -67, 60, 19, 10, 4, 13, 6, -4, Ascii.FF, -2, Ascii.NAK, -62, Base64.padSymbol, 8, 4, Ascii.SUB, -7, -50, 66, Ascii.FF, 13, -8, 20, 3, -6, Ascii.DC2, -55, Ascii.GS, 40, 4, Ascii.SUB, -7, -29, TarHeader.LF_CHR, 10, 4, 13, 6, -4, Ascii.FF, -2, -21, 44, -1, Ascii.DLE, -31, 43, 10, 3, -65, TarHeader.LF_FIFO, Ascii.FS, 0, Ascii.CAN, -6, -26, 36, Ascii.SUB, -12, -5, -5, 17, 40, -12, Ascii.SUB, -8, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -59, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -58};
    private static final int $$e = 153;
    private static final byte[] $$a = {TarHeader.LF_CHR, -39, 98, -44, -26, -15, -23, -26, -12, -17, -13, -13, -5, -23, -20, TarHeader.LF_SYMLINK, -12, -29, 20, -33, -26, -18, 2, -28, -15, 36, -49, -23, -5, -15, -17, -8, -20, -6, -31, -5, -10, -28, Ascii.DC2, -47, 5, -33, 1};
    private static final int $$b = 228;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component1 = 0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/extension/MiniAppsActivityHelper$MiniAppsActivityListener;", "", "onActivityResult", "", "resultCode", "", "requestCode", "data", "Landroid/content/Intent;", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MiniAppsActivityListener {
        void onActivityResult(int resultCode, int requestCode, Intent data);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.miniapps.extension.MiniAppsActivityHelper.$$c
            int r8 = r8 * 5
            int r8 = 73 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.miniapps.extension.MiniAppsActivityHelper.$$g(int, short, short):java.lang.String");
    }

    private static void a(short s, short s2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 103 - (s * 4);
        int i3 = (s2 * 3) + 4;
        int i4 = i * 6;
        byte[] bArr2 = new byte[28 - i4];
        int i5 = 27 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i3 + (-i2)) - 14;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i3];
            i3++;
            i2 = (i2 + (-b2)) - 14;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 9
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.miniapps.extension.MiniAppsActivityHelper.$$d
            int r7 = r7 * 63
            int r7 = r7 + 10
            int r9 = r9 * 8
            int r9 = 107 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + (-7)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.miniapps.extension.MiniAppsActivityHelper.c(int, byte, int, java.lang.Object[]):void");
    }

    public MiniAppsActivityHelper() {
        String simpleName = Reflection.getOrCreateKotlinClass(MiniAppsActivityHelper.class).getSimpleName();
        if (simpleName == null) {
            int i = getRequestBeneficiariesState + 69;
            equals = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
            simpleName = "";
        }
        this.TAG = simpleName;
        this.currentRequestCode = Integer.MIN_VALUE;
        this.sfcSessionOutManager = SFCSessionOutManager.INSTANCE;
        int i3 = equals + 101;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void bindActivity(Activity activity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.miniAppsActivity = activity;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = equals + 111;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            L.INSTANCE.d(this.TAG, "MiniApp Activity Resumed!", new Object[1]);
            this.sfcSessionOutManager.setMiniApp(false);
        } else {
            L.INSTANCE.d(this.TAG, "MiniApp Activity Resumed!", new Object[0]);
            this.sfcSessionOutManager.setMiniApp(true);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        int i = 2 % 2;
        L.INSTANCE.d(this.TAG, "MiniApp onActivityResult called with: requestCode = " + requestCode + ", resultCode = " + resultCode, new Object[0]);
        if (this.currentRequestCode != requestCode) {
            L.INSTANCE.d(this.TAG, "Not notifying miniAppsActivityListener.currentRequestCode=" + this.currentRequestCode + " != requestCode=" + requestCode, new Object[0]);
            return;
        }
        int i2 = getRequestBeneficiariesState + 119;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MiniAppsActivityListener miniAppsActivityListener = this.miniAppsActivityListener;
        if (miniAppsActivityListener != null) {
            miniAppsActivityListener.onActivityResult(resultCode, requestCode, data);
            int i3 = equals + 125;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override
    public void onStop() {
        int i = 2 % 2;
        int i2 = equals + 121;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        L.INSTANCE.d(this.TAG, "MiniApp Activity Stopped", new Object[0]);
        this.sfcSessionOutManager.setMiniApp(false);
        int i4 = getRequestBeneficiariesState + 61;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        L.INSTANCE.d(this.TAG, "MiniApp Activity onDestroy called", new Object[0]);
        this.miniAppsActivity = null;
        this.miniAppsActivityListener = null;
        this.currentRequestCode = Integer.MIN_VALUE;
        int i4 = getRequestBeneficiariesState + 121;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void finish() {
        int i = 2 % 2;
        int i2 = equals + 97;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            L.INSTANCE.d(this.TAG, "MiniApp Activity Finished", new Object[0]);
        } else {
            L.INSTANCE.d(this.TAG, "MiniApp Activity Finished", new Object[0]);
        }
    }

    public final void setMiniAppsActivityListener(MiniAppsActivityListener miniAppsActivityListener, int requestCode) {
        int i = 2 % 2;
        int i2 = equals + 41;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(miniAppsActivityListener, "");
            this.miniAppsActivityListener = miniAppsActivityListener;
            this.currentRequestCode = requestCode;
            throw null;
        }
        Intrinsics.checkNotNullParameter(miniAppsActivityListener, "");
        this.miniAppsActivityListener = miniAppsActivityListener;
        this.currentRequestCode = requestCode;
        int i3 = getRequestBeneficiariesState + 105;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final Activity getMiniAppsActivity() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 71;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Activity activity = this.miniAppsActivity;
        int i5 = i2 + 67;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return activity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - ExpandableListView.getPackedPositionChild(j), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), -1670574543, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
            Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            char c2 = '0';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i4 = 689978476;
            if (copydefault) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, 0) + 2749, 18 - TextUtils.lastIndexOf("", c2, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 7644), -327556343, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    c2 = '0';
                    i4 = 689978476;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!component3) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i5 = $11 + 51;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = $11 + 63;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2747, 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7644), -327556343, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override
    public void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2405;
            int i2 = 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            byte b2 = $$a[42];
            byte b3 = (byte) (b2 - 1);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 4), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, i2, touchSlop, -2047739879, false, (String) objArr2[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault2 == null) {
                int iGreen = Color.green(0) + 2405;
                int i3 = 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b4 = $$a[42];
                byte b5 = b4;
                Object[] objArr3 = new Object[1];
                a(b4, b5, (byte) (b5 + 2), objArr3);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, i3, maximumDrawingCacheSize, 24929979, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(null, TextUtils.indexOf((CharSequence) "", '0') + 128, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, null, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, null, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = getRequestBeneficiariesState + 21;
            int i5 = i4 % 128;
            equals = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 87;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1700684868};
                byte[] bArr = $$d;
                byte b6 = (byte) (-bArr[1]);
                byte b7 = bArr[62];
                Object[] objArr7 = new Object[1];
                c(b6, b7, b7, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(bArr[62], bArr[23], (byte) (-bArr[1]), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault3 == null) {
                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2404;
                    int iMyTid = 26 - (Process.myTid() >> 22);
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    byte b8 = $$a[42];
                    byte b9 = b8;
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, (byte) (b9 + 2), objArr9);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i9, iMyTid, packedPositionChild, 24929979, false, (String) objArr9[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, null, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(null, TextUtils.lastIndexOf("", '0', 0) + 128, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, null, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault4 == null) {
                        byte b10 = (byte) ($$a[42] - 1);
                        byte b11 = (byte) (b10 + 4);
                        Object[] objArr12 = new Object[1];
                        a(b10, b11, (byte) (b11 - 4), objArr12);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2405 - TextUtils.getOffsetBefore("", 0), 25 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -1843538389, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault5 == null) {
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2405;
                        int iRgb = Color.rgb(0, 0, 0) + 16777242;
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b12 = $$a[42];
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, (byte) (b13 + 4), objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i10, iRgb, longPressTimeout, -2047739879, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            return;
        }
        long j = -1;
        long j2 = ((long) (i11 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        long j3 = 0;
        long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
        try {
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 6618, (ViewConfiguration.getEdgeSlop() >> 16) + 42, (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i13 = equals + 33;
            getRequestBeneficiariesState = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr14 = {1012846617, Long.valueOf(j4), arrayList, null, true};
                Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0, 0), 56 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) View.getDefaultSize(0, 0));
                byte[] bArr2 = $$d;
                byte b14 = bArr2[62];
                Object[] objArr15 = new Object[1];
                c(b14, (byte) (b14 | 9), (byte) (-bArr2[1]), objArr15);
                cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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

    static {
        copy = 1;
        component3();
        int i = component1 + 61;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    @Override
    public void dispatchTouchEvent(MotionEvent p0) {
        int i = 2 % 2;
        int i2 = equals + 19;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onNewIntent(Intent p0) {
        int i = 2 % 2;
        int i2 = equals + 19;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    @Override
    public void onPause() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        int i4 = equals + 19;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component2 = new char[]{30629, 30642, 30617, 30305, 30631, 30625, 30632, 30652, 30618, 30620, 30623, 30638, 30630, 30634, 30639, 30283, 30635, 30284, 30624, 30621, 30636, 30628, 30627, 30653};
        ShareDataUIState = 321287699;
        component3 = true;
        copydefault = true;
    }
}
