package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.HomeWirelessViewModel;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class FixedDataChoosePlanActivity_MembersInjector implements MembersInjector<FixedDataChoosePlanActivity> {
    private final Provider<FixedDataViewModel> component1;
    private final Provider<RemoteConfig> component2;
    private final Provider<HomeWirelessViewModel> copydefault;
    private static final byte[] $$c = {108, -1, -36, 99};
    private static final int $$f = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {69, -50, 81, 75, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 102;
    private static final byte[] $$a = {10, 80, 9, 70, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, Ascii.NAK, -31, 45, Ascii.SI, -3, Ascii.NAK};
    private static final int $$b = 66;
    private static int component3 = 0;
    private static int equals = 1;
    private static long ShareDataUIState = -5460120133990241085L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.$$c
            int r8 = r8 * 3
            int r8 = r8 + 102
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.$$g(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 6
            int r8 = r8 + 100
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.$$a
            int r7 = r7 * 12
            int r1 = 19 - r7
            int r6 = r6 * 18
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 18 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 9
            int r7 = 12 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.$$d
            int r6 = r6 + 98
            int r8 = r8 * 3
            int r1 = 10 - r8
            byte[] r1 = new byte[r1]
            int r8 = 9 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-27)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.b(short, short, byte, java.lang.Object[]):void");
    }

    @Override
    public void injectMembers(FixedDataChoosePlanActivity fixedDataChoosePlanActivity) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        equals = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(fixedDataChoosePlanActivity);
        if (i3 == 0) {
            throw null;
        }
    }

    public FixedDataChoosePlanActivity_MembersInjector(Provider<FixedDataViewModel> provider, Provider<HomeWirelessViewModel> provider2, Provider<RemoteConfig> provider3) {
        this.component1 = provider;
        this.copydefault = provider2;
        this.component2 = provider3;
    }

    public static MembersInjector<FixedDataChoosePlanActivity> create(Provider<FixedDataViewModel> provider, Provider<HomeWirelessViewModel> provider2, Provider<RemoteConfig> provider3) {
        int i = 2 % 2;
        FixedDataChoosePlanActivity_MembersInjector fixedDataChoosePlanActivity_MembersInjector = new FixedDataChoosePlanActivity_MembersInjector(provider, provider2, provider3);
        int i2 = component3 + 61;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return fixedDataChoosePlanActivity_MembersInjector;
    }

    public static MembersInjector<FixedDataChoosePlanActivity> create(javax.inject.Provider<FixedDataViewModel> provider, javax.inject.Provider<HomeWirelessViewModel> provider2, javax.inject.Provider<RemoteConfig> provider3) {
        int i = 2 % 2;
        FixedDataChoosePlanActivity_MembersInjector fixedDataChoosePlanActivity_MembersInjector = new FixedDataChoosePlanActivity_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
        int i2 = component3 + 93;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return fixedDataChoosePlanActivity_MembersInjector;
    }

    public void injectMembers2(FixedDataChoosePlanActivity fixedDataChoosePlanActivity) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        injectFixedDataViewModel(fixedDataChoosePlanActivity, this.component1.get());
        injectHomeWirelessViewModel(fixedDataChoosePlanActivity, this.copydefault.get());
        injectRemoteConfig(fixedDataChoosePlanActivity, this.component2.get());
        int i4 = equals + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void injectFixedDataViewModel(FixedDataChoosePlanActivity fixedDataChoosePlanActivity, FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        fixedDataChoosePlanActivity.fixedDataViewModel = fixedDataViewModel;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component3 + 7;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void injectHomeWirelessViewModel(FixedDataChoosePlanActivity fixedDataChoosePlanActivity, HomeWirelessViewModel homeWirelessViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        fixedDataChoosePlanActivity.homeWirelessViewModel = homeWirelessViewModel;
        int i4 = component3 + 53;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 101;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3266;
                        int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 60267);
                        byte b2 = (byte) ($$c[1] + 1);
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, iLastIndexOf, c2, -834797019, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() % (ShareDataUIState & 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        int iResolveSize = 687 - View.resolveSize(0, 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 34;
                        char c3 = (char) (60374 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte b4 = $$c[1];
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, jumpTapTimeout, c3, -1969106284, false, $$g(b5, b5, (byte) (-b4)), new Class[]{Object.class, Object.class});
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
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3266;
                    int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 60268);
                    byte b6 = (byte) ($$c[1] + 1);
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i6, pressedStateDuration, -834797019, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    int pressedStateDuration2 = 687 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int pressedStateDuration3 = 34 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    char longPressTimeout = (char) (60373 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b8 = $$c[1];
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration2, pressedStateDuration3, longPressTimeout, -1969106284, false, $$g(b9, b9, (byte) (-b8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i7 = $11 + 15;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                int iMyPid = (Process.myPid() >> 22) + 687;
                int keyRepeatDelay = 34 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                char cBlue = (char) (Color.blue(0) + 60373);
                byte b10 = $$c[1];
                byte b11 = (byte) (b10 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, keyRepeatDelay, cBlue, -1969106284, false, $$g(b11, b11, (byte) (-b10)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public static void injectRemoteConfig(FixedDataChoosePlanActivity fixedDataChoosePlanActivity, RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        fixedDataChoosePlanActivity.remoteConfig = remoteConfig;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0877, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0878, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x087c, code lost:
    
        if (r1 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x087e, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x087f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04dd, code lost:
    
        r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.equals;
        r1 = ((r0 | 23) << 1) - (r0 ^ 23);
        com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.component3 = r1 % 128;
        r1 = r1 % 2;
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04f2, code lost:
    
        if (r0 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04f4, code lost:
    
        r0 = 1343 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1));
        r24 = android.view.View.getDefaultSize(0, 0) + 33;
        r1 = (char) (6425 - android.widget.ExpandableListView.getPackedPositionType(0));
        r4 = (byte) 1;
        r5 = r4;
        r7 = new java.lang.Object[1];
        b(r4, r5, (byte) (r5 - 1), r7);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r24, r1, 1443979249, false, (java.lang.String) r7[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x052d, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r13);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x053a, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x053c, code lost:
    
        r23 = (-16775874) - android.graphics.Color.rgb(0, 0, 0);
        r24 = ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 34;
        r0 = (char) (6425 - android.text.TextUtils.getOffsetAfter("", 0));
        r3 = (byte) 1;
        r4 = r3;
        r6 = new java.lang.Object[1];
        b(r3, r4, (byte) (r4 - 1), r6);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r23, r24, r0, 1443979249, false, (java.lang.String) r6[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x057b, code lost:
    
        r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0590, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0592, code lost:
    
        r0 = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1342;
        r24 = 33 - android.text.TextUtils.indexOf("", "", 0);
        r1 = (char) (android.text.AndroidCharacter.getMirror('0') + 6377);
        r4 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.$$e & 11);
        r5 = (byte) (r4 - 2);
        r8 = new java.lang.Object[1];
        b(r4, r5, (byte) (r5 + 3), r8);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r24, r1, -181198845, false, (java.lang.String) r8[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x05dd, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05e9, code lost:
    
        r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.equals + 33;
        com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.component3 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x05f3, code lost:
    
        if ((r0 % 2) != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x05f7, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component3(java.util.List r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataChoosePlanActivity_MembersInjector.component3(java.util.List):int");
    }

    public static void copydefault() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
