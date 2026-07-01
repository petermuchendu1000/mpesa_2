package com.huawei.digitalpayment.consumer.ootb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.Configuration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.CrashHookLooper;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver;
import com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver;
import com.huawei.digitalpayment.consumer.base.ui.theme.SfcPaymentResource;
import com.huawei.digitalpayment.consumer.base.util.ThemeUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.router.RouterRedirectManager;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.home.constants.SfcHomeRoutePath;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.sfcui.airtime.ui.viewmodel.WorkflowModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.subsui.utils.Constants;
import com.huawei.digitalpayment.mobileapp.report.EventReportUtils;
import com.safaricom.mpesa.logging.L;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.HiltAndroidApp;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;

@HiltAndroidApp
public class App extends Hilt_App implements Configuration.Provider {
    private static short[] copydefault;
    private String TAG = "App";

    @Inject
    GlobalDeviceRestartObserver globalDeviceRestartObserver;

    @Inject
    GlobalSimCardRemovalObserver globalSimCardRemovalObserver;

    @Inject
    RemoteConfig remoteConfig;
    private Resources resources;
    private static final byte[] $$l = {98, -3, -80, -4};
    private static final int $$o = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {86, 117, -27, 75, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -18, -26, 4, -18, -18, -12, -37, -8, -25, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2};
    private static final int $$e = 198;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int component2 = 1134163642;
    private static int component1 = -238323952;
    private static int ShareDataUIState = -703396863;
    private static byte[] component3 = {-2, 42, -43, -38, 35, Base64.padSymbol, Ascii.SI, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -3, 42, -43, -38, 35, Base64.padSymbol, -55, 47, 32, -38, 41, -44, 59, -3, 43, 43, -58, TarHeader.LF_CONTIG, -64, 33, 43, -60, 8, -10, 38, -41, -53, 47, 32, -47, 33, -48, Ascii.SO, -55, 43, 43, -58, TarHeader.LF_CONTIG, -64, 33, 43, -60, 8, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -6, -47, 37, 58, -14, 41, 59, -36, 0, -26, 38, -41};

    public interface HiltWorkerFactoryEntryPoint {
        HiltWorkerFactory workerFactory();
    }

    public interface VoucherScannerDependencies {
        ViewModelProvider.Factory workflowModelFactory();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$p(short r5, int r6, byte r7) {
        /*
            int r5 = r5 + 112
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.ootb.App.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r5
            r5 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r3 = r1[r6]
        L25:
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.ootb.App.$$p(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.ootb.App.$$d
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r5 = 23 - r5
            int r1 = 16 - r6
            byte[] r1 = new byte[r1]
            int r6 = 15 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r5]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-17)
            int r5 = r5 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.ootb.App.f(byte, int, int, java.lang.Object[]):void");
    }

    @Module
    public static class VoucherScannerModule {
        private static int component1 = 0;
        private static int component3 = 1;

        @Provides
        public static ViewModelProvider.Factory provideWorkflowModelFactory() {
            int i = 2 % 2;
            ViewModelProvider.Factory factory = new ViewModelProvider.Factory() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public <T extends ViewModel> T create(Class<T> cls) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 109;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    if (!cls.isAssignableFrom(WorkflowModel.class)) {
                        throw new IllegalArgumentException("Unknown ViewModel class: " + cls);
                    }
                    WorkflowModel workflowModel = new WorkflowModel();
                    int i5 = component2 + 7;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0) {
                        return workflowModel;
                    }
                    throw null;
                }
            };
            int i2 = component1 + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return factory;
        }
    }

    @Override
    public void attachBaseContext(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        e(Color.argb(0, 0, 0, 0) + 1303215725, (byte) Color.alpha(0), TextUtils.getCapsMode("", 0, 0) - 668496574, (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) - 57, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(1303215741 - TextUtils.getOffsetBefore("", 0), (byte) (Color.rgb(0, 0, 0) + 16777216), TextUtils.indexOf("", "", 0) - 668496581, (short) KeyEvent.getDeadChar(0, 0), Color.alpha(0) - 58, objArr2);
        Thread thread = (Thread) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0]);
        Object[] objArr3 = new Object[1];
        e(((byte) KeyEvent.getModifierMetaStateMask()) + 1303215726, (byte) TextUtils.indexOf("", "", 0, 0), (-668496574) - TextUtils.getTrimmedLength(""), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 59, objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(View.combineMeasuredStates(0, 0) + 1303215754, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-668496577) - KeyEvent.normalizeMetaState(0), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (-58) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(thread, new Object[0]);
        try {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2141555584);
            if (objCopydefault == null) {
                int iIndexOf = 2026 - TextUtils.indexOf("", "", 0, 0);
                int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                char c2 = (char) (6164 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                byte b2 = (byte) ($$e & 31);
                Object[] objArr5 = new Object[1];
                f((byte) 19, b2, (byte) (b2 - 5), objArr5);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, c2, 1157868517, false, (String) objArr5[0], new Class[0]);
            }
            String[] strArr = (String[]) ((Method) objCopydefault).invoke(null, null);
            Object[] objArr6 = new Object[1];
            e(1303215767 - (Process.myPid() >> 22), (byte) ((Process.getThreadPriority(0) + 20) >> 6), Color.argb(0, 0, 0, 0) - 668496574, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 58, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(MotionEvent.axisFromString("") + 1303215795, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-668496577) - View.MeasureSpec.getMode(0), (short) TextUtils.getCapsMode("", 0, 0), (-58) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
            Method method = cls3.getMethod((String) objArr7[0], new Class[0]);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1430316081);
            if (objCopydefault2 == null) {
                int iCombineMeasuredStates = 796 - View.combineMeasuredStates(0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16777244;
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 49620);
                byte[] bArr = $$d;
                byte b3 = (byte) (-bArr[24]);
                byte b4 = (byte) (-bArr[31]);
                Object[] objArr8 = new Object[1];
                f(b3, b4, (byte) (b4 - 4), objArr8);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, iRgb, offsetAfter, -1877394604, false, (String) objArr8[0], null);
            }
            ((Field) objCopydefault2).setInt(null, 0);
            int length = stackTraceElementArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                int i5 = component4 + 37;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                StackTraceElement stackTraceElement = stackTraceElementArr[i4];
                for (String str : strArr) {
                    if (str.equals((String) method.invoke(stackTraceElement, new Object[0]))) {
                        int i7 = getAsAtTimestamp + 69;
                        component4 = i7 % 128;
                        if (i7 % 2 != 0) {
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1430316081);
                            if (objCopydefault3 == null) {
                                int iAxisFromString = 795 - MotionEvent.axisFromString("");
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 49572);
                                byte[] bArr2 = $$d;
                                byte b5 = (byte) (-bArr2[24]);
                                byte b6 = (byte) (-bArr2[31]);
                                Object[] objArr9 = new Object[1];
                                f(b5, b6, (byte) (b6 - 4), objArr9);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, touchSlop, mirror, -1877394604, false, (String) objArr9[0], null);
                            }
                            ((Field) objCopydefault3).setInt(null, 0);
                        } else {
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1430316081);
                            if (objCopydefault4 == null) {
                                int iBlue = Color.blue(0) + 796;
                                int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                char cRgb = (char) ((-16727596) - Color.rgb(0, 0, 0));
                                byte[] bArr3 = $$d;
                                byte b7 = (byte) (-bArr3[24]);
                                byte b8 = (byte) (-bArr3[31]);
                                Object[] objArr10 = new Object[1];
                                f(b7, b8, (byte) (b8 - 4), objArr10);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, scrollDefaultDelay, cRgb, -1877394604, false, (String) objArr10[0], null);
                            }
                            ((Field) objCopydefault4).setInt(null, 1);
                        }
                    }
                }
                i4++;
            }
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
            if (objCopydefault5 == null) {
                int i8 = 2027 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                char c3 = (char) (6165 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                byte b9 = (byte) 0;
                byte b10 = b9;
                Object[] objArr11 = new Object[1];
                f(b9, b10, b10, objArr11);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i8, tapTimeout, c3, 163751008, false, (String) objArr11[0], null);
            }
            ((Field) objCopydefault5).set(null, -1L);
            SfcPaymentResource.resetFont(Resources.getSystem());
            this.resources = new SfcPaymentResource(super.getResources());
            int i9 = component4 + 123;
            getAsAtTimestamp = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override
    public Resources getResources() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Resources resources = this.resources;
        int i5 = i3 + 125;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return resources;
    }

    @Override
    public Configuration getWorkManagerConfiguration() {
        int i = 2 % 2;
        Configuration configurationBuild = new Configuration.Builder().setWorkerFactory(((HiltWorkerFactoryEntryPoint) EntryPoints.get(this, HiltWorkerFactoryEntryPoint.class)).workerFactory()).build();
        int i2 = component4 + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return configurationBuild;
    }

    private static void e(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 1;
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, (char) (ExpandableListView.getPackedPositionChild(0L) + 61686), 1874745193, false, $$p(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int windowTouchSlop = 2984 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iCombineMeasuredStates = 48 - View.combineMeasuredStates(0, 0);
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 54462);
                            byte length2 = (byte) $$l.length;
                            byte b5 = (byte) (length2 - 4);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iCombineMeasuredStates, cNormalizeMetaState, -1178636483, false, $$p(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component3;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1000 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 61685), 1874745193, false, $$p(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) copydefault[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ 7083766810336261929L));
                if (z) {
                    int i10 = $11 + 53;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i9 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1698 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.alpha(0), -1454191902, false, $$p(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component3;
                if (bArr4 != null) {
                    int i12 = $11 + 111;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        int i15 = $10 + 9;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i17 = $10 + 17;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = copydefault;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:60|3|(1:5)|6|7|(1:9)|10|(1:12)|13|(6:15|(1:17)(1:18)|19|(6:21|(2:23|(4:63|28|(1:30)|31)(2:66|32))(2:26|(4:64|28|(0)|31)(2:67|32))|34|(1:36)|37|(5:42|58|43|49|(1:51)(1:52))(1:41))|65|33)|62|34|(0)|37|(1:39)|42|58|43|49|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0557, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x055c, code lost:
    
        if (r0.getMessage() != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x055e, code lost:
    
        com.safaricom.mpesa.logging.L.INSTANCE.d(r34.TAG, r0.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0577 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0578  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.ootb.App.onCreate():void");
    }

    private void initTheme() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            ThemeUtils.INSTANCE.applyTheme(ThemeUtils.INSTANCE.getUIModeValue());
            int i3 = 86 / 0;
        } else {
            ThemeUtils.INSTANCE.applyTheme(ThemeUtils.INSTANCE.getUIModeValue());
        }
        int i4 = component4 + 85;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private void addRedirectRoutePath() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        RouterRedirectManager.addRedirectPath(RoutePathConstants.P2P_TRANSFER, "/sfcModule/sendMoney");
        RouterRedirectManager.addRedirectPath(RoutePathConstants.COMMON_RISK, com.huawei.digitalpayment.consumer.constants.RoutePathConstants.CUSTOM_RISK);
        RouterRedirectManager.addRedirectPath(RoutePathConstants.PHOTO_PROFILE, RoutePathConstant.SFC_MY_PROFILE);
        RouterRedirectManager.addRedirectPath("/sfcModule/pochiWallet", "/pochiWalletModule/pochiWallet");
        RouterRedirectManager.addRedirectPath("/sfcModule/tunukiwa", RoutePathConstant.SFC_TUNUKIWA_BUNDLES);
        RouterRedirectManager.addRedirectPath("/sfcModule/withExpiryBundles", RoutePathConstant.SFC_WITH_EXPIRY_ONLY);
        RouterRedirectManager.addRedirectPath("/sfcModule/getHelp", RoutePathConstant.SFC_MY_PROFILE_NAV);
        RouterRedirectManager.addRedirectPath("/sfcModule/getPuk", RoutePathConstant.SFC_MY_PROFILE_NAV);
        RouterRedirectManager.addRedirectPath("/sfcModule/securityCenter", RoutePathConstant.SFC_MY_PROFILE_NAV);
        RouterRedirectManager.addRedirectPath("/sfcModule/aboutApp", RoutePathConstant.SFC_MY_PROFILE_NAV);
        RouterRedirectManager.addRedirectPath("/sfcModule/shareApp", RoutePathConstants.SHARE_APP);
        RouterRedirectManager.addRedirectPath("/sfcModule/biometricAuthentication", RoutePathConstant.SFC_BIOMETRICS_SETTING);
        RouterRedirectManager.addRedirectPath("/sfcModule/mpesaGlobal", "/sfc/globalCheckStatus");
        RouterRedirectManager.addRedirectPath("/sfcModule/fulizaWallet", "/pochiWalletModule/fulizaDispatcher");
        RouterRedirectManager.addRedirectPath(RoutePathConstants.NEW_MAIN, RoutePathConstants.MAIN);
        RouterRedirectManager.addRedirectPath("/sfcModule/appearance", "/sfcModule/changeTheme");
        RouterRedirectManager.addRedirectPath("/sfcModule/checkMyUsage", "/sfcModule/manageAndViewData");
        RouterRedirectManager.addRedirectPath("/sfcModule/requestESim", RoutePathConstant.SFC_ESIM);
        RouterRedirectManager.addRedirectPath("/sfcModule/mySubscriptions", Constants.MY_SUBSCRIPTIONS);
        RouterRedirectManager.addRedirectPath("/sfcModule/manageMyLine", RoutePathConstant.MANAGE_LINE);
        RouterRedirectManager.addRedirectPath("/sfcModule/eNewspaper", SfcHomeRoutePath.SFC_ENTERTAINMENT_E_PAPER);
        int i4 = getAsAtTimestamp + 71;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    private static void crashReport() {
        int i = 2 % 2;
        final boolean zIsDebug = AppConfigManager.getAppConfig().isDebug();
        CrashHookLooper.hook(true, zIsDebug, new Thread.UncaughtExceptionHandler() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void uncaughtException(Thread thread, Throwable th) {
                int i2 = 2 % 2;
                int i3 = component1 + 21;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                App.lambda$crashReport$1(zIsDebug, thread, th);
                int i5 = component3 + 3;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 43;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    static void lambda$crashReport$1(boolean z, Thread thread, Throwable th) {
        int i = 2 % 2;
        L.INSTANCE.e("App", "onCreate: " + th.getMessage(), new Object[0]);
        EventReportUtils.INSTANCE.crashReport(th);
        if (z) {
            ThreadUtils.runOnUiThreadDelayed(new Runnable() {
                private static int component1 = 0;
                private static int copydefault = 1;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = copydefault + 103;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    App.lambda$crashReport$0();
                    int i5 = copydefault + 111;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 41 / 0;
                    }
                }
            }, 500L);
            return;
        }
        int i2 = getAsAtTimestamp + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    static void lambda$crashReport$0() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ActivityUtils.finishAllActivities();
        System.exit(0);
    }

    public static String getProcessName(Context context, int i) {
        int i2 = 2 % 2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            int i3 = getAsAtTimestamp + 43;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i4 = getAsAtTimestamp + 87;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            int i6 = component4 + 23;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            if (runningAppProcessInfo.pid == i) {
                String str = runningAppProcessInfo.processName;
                int i8 = getAsAtTimestamp + 69;
                component4 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 83 / 0;
                }
                return str;
            }
        }
        return null;
    }

    private void initializeDynatrace() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Dynatrace.applyUserPrivacyOptions(UserPrivacyOptions.builder().withDataCollectionLevel(DataCollectionLevel.USER_BEHAVIOR).withCrashReportingOptedIn(true).withCrashReplayOptedIn(true).build());
        int i4 = getAsAtTimestamp + 5;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i = 2 % 2;
        super.onConfigurationChanged(configuration);
        Resources resources = this.resources;
        if (resources != null) {
            int i2 = component4 + 105;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            int i4 = getAsAtTimestamp + 11;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void deleteDefaultUrlConfig() {
        int i = 2 % 2;
        String string = SPUtils.getInstance("sp_debug").getString("baseUrl");
        L.INSTANCE.d(this.TAG, "Cached Base Url " + string, new Object[0]);
        L.INSTANCE.d(this.TAG, "App Base Url https://myoneapp.safaricom.co.ke/appgateway/consumer/appserver/consumer/v1/", new Object[0]);
        if (!string.isEmpty()) {
            int i2 = getAsAtTimestamp + 35;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            if (!BuildConfig.BASE_URL.equalsIgnoreCase(string)) {
                int i4 = getAsAtTimestamp + 19;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                L.INSTANCE.d(this.TAG, "App base url changed", new Object[0]);
                SPUtils.getInstance("sp_debug").remove("baseUrl");
                SPUtils.getInstance("sp_debug").remove("signPublicKey");
                SPUtils.getInstance("sp_debug").remove("pinPublicKey");
                SPUtils.getInstance("sp_debug").remove(SPConstant.PIN_KEY_VERSION);
                SPUtils.getInstance("sp_debug").remove(SPConstant.SIGN_KEY_VERSION);
                ((ILoginService) RouteUtils.getService(ILoginService.class)).logout();
            }
        }
    }
}
