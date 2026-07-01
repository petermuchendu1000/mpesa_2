package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.dynatrace.android.callback.Callback;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.arouter.ActivityName;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.common.util.sign.SignUtils;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository;
import com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository;
import com.huawei.digitalpayment.consumer.base.repository.SimCardRemovalRepository;
import com.huawei.digitalpayment.consumer.base.sim.DeviceRestartManager;
import com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState;
import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalManager;
import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.update.contants.UpdateEntrance;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.BasicActivitySplashBinding;
import com.huawei.digitalpayment.consumer.basic.init.StartPageManager;
import com.huawei.digitalpayment.consumer.basic.ui.bean.CustomQueryLoginType;
import com.huawei.digitalpayment.consumer.basic.util.ConvertorManager;
import com.huawei.digitalpayment.consumer.basicUi.model.OpenPageConfig;
import com.huawei.digitalpayment.consumer.basicUi.util.BasicUiModuleHelper;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.SplashViewModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.QueryLoginTypeParams;
import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.LoginViewModel;
import com.huawei.http.convert.BaseDataConvertAdapter;
import com.huawei.http.convert.DataConvertManager;
import com.huawei.payment.mvvm.Resource;
import com.huawei.secure.android.common.detect.RootDetect;
import com.huawei.secure.android.common.detect.SecurityDetect;
import com.huawei.secure.android.common.detect.XposedDetect;
import com.safaricom.mpesa.logging.L;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.jvm.functions.Function1;
import org.apache.commons.lang3.CharUtils;
import org.json.JSONObject;
import pl.droidsonroids.gif.AnimationListener;
import pl.droidsonroids.gif.GifDrawable;

@ActivityName(UpdateEntrance.SPLASH_PAGE)
public class SplashActivity extends Hilt_SplashActivity<BasicActivitySplashBinding, SplashViewModel> {
    private static final int MAX_QUERY_TIME = 3;
    private static final int MAX_TIMEOUT_TIME = 5;
    private CountDownTimer countDownTimer;

    @Inject
    DeviceInfoRepository deviceInfoRepository;

    @Inject
    DeviceRestartManager deviceRestartManager;

    @Inject
    DeviceRestartRepository deviceRestartRepository;
    private LoginViewModel loginViewModel;
    private CountDownTimer queryDataTimer;

    @Inject
    SimCardRemovalManager simCardRemovalManager;

    @Inject
    SimCardRemovalRepository simCardRemovalRepository;
    private CountDownTimer timeoutTimer;
    private CountDownTimer waitConfigTimer;
    private static final byte[] $$d = {79, 9, 94, -7};
    private static final int $$e = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;
    private static int copy = 1;
    private static char[] component3 = {30695, 30682, 30688, 30678, 30677, 30687, 30618, 30673, 30708, 30689, 30691, 30683, 30671, 30707, 30612, 30690, 30604, 30615, 30610, 30614, 30611, 30605, 30694, 30608, 30609, 30607, 30619};
    private static int ShareDataUIState = 321287748;
    private static boolean component1 = true;
    private static boolean component2 = true;
    private static char[] copydefault = {1970, 2041, 2019, 2021, 1975, 2031, 2037, 1969, 2023, 2036, 2033, 2034, 2020, 2035, 2030, 1967, 1974, 1985, 2032, 1978, 2038, 1972, 1976, 2029, 2018, 1977, 2022, 2025, 1973, 1968, 1966, 2028, 2017, 2004, 1971, 2024};
    private static char getRequestBeneficiariesState = 12828;
    private boolean isExecute = false;
    private boolean isDeviceRestartLoadingVisible = false;
    private boolean isLogoAnimatedEnd = false;
    private boolean isGuideQueryEnd = false;
    private boolean isConfigQueryEnd = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 + 4
            int r6 = 119 - r6
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r5 = r5 + 1
            r3 = r1[r5]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.$$f(byte, byte, int):java.lang.String");
    }

    static ViewDataBinding access$000(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = copy + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = splashActivity.binding;
        if (i3 == 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ViewDataBinding access$100(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = component4 + 3;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = splashActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        throw null;
    }

    static String access$200(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = splashActivity.TAG;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    static ViewDataBinding access$300(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = copy + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = splashActivity.binding;
        int i4 = component4 + 49;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 63;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.basic_activity_splash;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    private static void d(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component3;
        int i4 = -1;
        int i5 = 1;
        if (cArr2 != null) {
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[0] = Integer.valueOf(cArr2[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 3760, ImageFormat.getBitsPerPixel(0) + 25, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + i5), -1670574543, false, $$f(b2, (byte) (b2 & TarHeader.LF_CHR), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = -1;
                    i5 = 1;
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
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7139, TextUtils.indexOf("", "", 0) + 13, (char) (ViewConfiguration.getTapTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i9 = 689978476;
            float f = 0.0f;
            if (component2) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i10 = $11 + 73;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i12 = $11 + 39;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 / 0) >>> cancelVar.component3] >>> i] + iIntValue);
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault3 == null) {
                            byte b3 = (byte) (-1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 19 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), (char) (View.resolveSize(0, 0) + 7644), -327556343, false, $$f(b3, (byte) (b3 & 46), (byte) 0), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } else {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            j = 0;
                            byte b4 = (byte) (-1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 2748, 19 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7643), -327556343, false, $$f(b4, (byte) (b4 & 46), (byte) 0), new Class[]{Object.class, Object.class});
                        } else {
                            j = 0;
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                        f = 0.0f;
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!component1) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i13 = $11 + 75;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        cArr5[cancelVar.component3] = (char) (cArr2[iArr[cancelVar.component1 * cancelVar.component3] >> i] % iIntValue);
                        i2 = cancelVar.component3 << 1;
                    } else {
                        cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                        i2 = cancelVar.component3 + 1;
                    }
                    cancelVar.component3 = i2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i14 = $11 + 95;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9);
                if (objCopydefault5 == null) {
                    byte b5 = (byte) (-1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 2748, (ViewConfiguration.getTapTimeout() >> 16) + 19, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7644), -327556343, false, $$f(b5, (byte) (b5 & 46), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                i9 = 689978476;
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
    public void onCreate(Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        d(127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-125, -122, -114, -115, -116}, null, null, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = component4 + 103;
                copy = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).length() + 25, new char[]{2, 20, 17, 6, 3, 29, 18, 0, 30, 20, 24, 0, 14, 5, 15, '!', 21, JSONLexer.EOI, 7, 3, '\"', 30, '\t', 5, 30, 14}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 63), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{0, '\b', 13888, 13888, 2, 15, 11, 15, 13890, 13890, '!', 25, '\b', 2, 15, '!', 2, 17}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 9), objArr4);
                baseContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, new char[]{31, JSONLexer.EOI, '\b', 25, 22, '\n', 3, 4, JSONLexer.EOI, 5, CharUtils.CR, 28, 28, 31, 4, 15, 25, 6, 13814, 13814, '!', '#', 15, 4, 22, 23, 27, 20, JSONLexer.EOI, 30, 13891, 13891, 2, '!', 25, 11, 1, 24, '\b', 2, 15, 22, 24, 29, 22, 3, 18, 27}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).length() + 70), objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 37, new char[]{6, 18, 31, '\n', 27, 23, 13883, 13883, 2, 24, '\t', 19, 28, CharUtils.CR, 13883, 13883, '#', 28, 18, 28, 24, 27, 28, '#', 20, 4, 16, 30, 22, 28, '\f', 28, 28, 23, 0, JSONLexer.EOI, 0, 15, '\b', 1, 4, 20, 31, CharUtils.CR, 27, 29, 25, '\n', 18, 6, 30, JSONLexer.EOI, '\n', 28, 28, 20, 22, 4, 28, 19, 31, 28, CharUtils.CR, 28}, (byte) (TextUtils.indexOf("", "", 0, 0) + 66), objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(0) + 17, new byte[]{-118, -107, -104, -109, -108, -111, -117, -127, -105, -113, -113, -110, -102, -118, -106, -110, -118, -108, -102, -113, -106, -102, -109, -106, -117, -111, -125, -110, -113, -118, -109, -113, -112, -103, -103, -125, -103, -109, -125, -104, -109, -111, -106, -108, -107, -107, -118, -117, -105, -107, -113, -106, -112, -118, -118, -109, -107, -108, -109, -110, -125, -111, -112, -113}, null, null, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(73 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{'!', 11, 6, 21, 19, 25, 13872, 13872, 22, '\"', 28, '\n', ' ', 28, 22, 27, '\n', CharUtils.CR, 13859, 13859, 22, 3, 0, JSONLexer.EOI, '!', 6, 5, 17, 2, '!', '\b', 3, 31, 14, 6, '!', '\t', 7, '#', '\b', CharUtils.CR, 14, 11, 7, '#', '\b', 0, '!', 3, 0, 21, 17, 30, 20, '!', 21, JSONLexer.EOI, 15, '\t', 2, 15, 7, 14, 21, 3, '\f', 2, 21, 2, 15, 7, 15}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 94), objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, new char[]{24, 31, '\t', 19, 31, '#'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 103), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) + 78, new byte[]{-113, -106, -104, -127, -109, -102, -104, -111, -117, -104, -117, -109, -101, -105, -113, -104, -127, -101, -109, -107, -107, -104, -101, -113, -111, -113, -113, -101, -109, -105, -103, -104, -109, -127, -110, -125}, null, null, objArr10);
                    Object[] objArr11 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr10[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, 56 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) View.MeasureSpec.getSize(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        ((IPushService) RouteUtils.getService(IPushService.class)).unsubscribeToTopic();
        super.onCreate(bundle);
        this.deviceRestartManager.setSplashScreenVisible(true);
        TokenHelper.INSTANCE.clearToken();
        AppConfigManager.INSTANCE.setSecurityConfig(null);
        addDataConvert();
        this.loginViewModel = (LoginViewModel) new ViewModelProvider(this).get(LoginViewModel.class);
        observeSimCardRemovalState();
        observeDeviceRestartState();
        checkCachedSimCardRemovalState();
        checkCachedDeviceRestartState();
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 63;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.deviceRestartManager.setSplashScreenVisible(true);
        int i4 = copy + 11;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStop() {
        int i = 2 % 2;
        int i2 = component4 + 101;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.deviceRestartManager.setSplashScreenVisible(false);
        super.onStop();
        int i4 = copy + 109;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void checkCachedDeviceRestartState() {
        int i = 2 % 2;
        this.deviceRestartRepository.getCachedStateAsync(new Function1() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 31;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$iT7wfSQ5vTTN9hGgvPRL2tw8Dx8 = SplashActivity.$r8$lambda$iT7wfSQ5vTTN9hGgvPRL2tw8Dx8(this.f$0, (DeviceRestartState) obj);
                int i5 = copydefault + 109;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$iT7wfSQ5vTTN9hGgvPRL2tw8Dx8;
            }
        });
        int i2 = component4 + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private Unit lambda$checkCachedDeviceRestartState$1(final DeviceRestartState deviceRestartState) {
        int i = 2 % 2;
        runOnUiThread(new Runnable() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SplashActivity.$r8$lambda$zsiiFudt45Bbm0ATF5DgP5erEok(this.f$0, deviceRestartState);
                int i5 = component3 + 105;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = copy + 51;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void lambda$checkCachedDeviceRestartState$0(DeviceRestartState deviceRestartState) {
        int i = 2 % 2;
        int i2 = copy + 47;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (deviceRestartState != null) {
            this.deviceRestartManager.updateRestartState(deviceRestartState);
        } else if (this.deviceRestartManager.getRestartStateLiveData().getValue() instanceof DeviceRestartState.Unknown) {
            int i3 = component4 + 61;
            copy = i3 % 128;
            int i4 = i3 % 2;
            this.deviceRestartManager.markNotRestarted();
        }
    }

    private static void e(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        Object obj2 = null;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getTouchSlop() >> i4), TextUtils.getCapsMode("", 0, 0) + 15, (char) (64291 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
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
        Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j = 0;
        float f = 0.0f;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 7422, 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionGroup(0L) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i8 = $10 + 73;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i10 = $10 + 103;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 7117, 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (44463 - TextUtils.getOffsetBefore("", 0)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2944, 23 - ImageFormat.getBitsPerPixel(0), (char) (27637 - View.resolveSizeAndState(0, 0, 0)), 794909189, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i12];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i13 = $10 + 101;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i15];
                            cArr4[cancelall.component2 + 1] = cArr2[i16];
                        } else {
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i17];
                            cArr4[cancelall.component2 + 1] = cArr2[i18];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                f = 0.0f;
                j = 0;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void observeSimCardRemovalState() {
        int i = 2 % 2;
        this.simCardRemovalManager.getSimCardRemovalStateLiveData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SplashActivity.m10292$r8$lambda$VGhS9oE7K0x8eB0eFygNGmp3L0(this.f$0, (SimCardRemovalState) obj);
                int i5 = ShareDataUIState + 1;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copy + 81;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$observeSimCardRemovalState$2(com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r4 = r4.isSimRemoved()
            r1 = 76
            int r1 = r1 / 0
            if (r4 == 0) goto L3d
            goto L1f
        L19:
            boolean r4 = r4.isSimRemoved()
            if (r4 == 0) goto L3d
        L1f:
            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r4 = r4 + 71
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r1
            int r4 = r4 % r0
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            java.lang.String r2 = "/sfcModule/simCardRemoved"
            if (r4 == 0) goto L35
            com.huawei.arouter.RouteUtils.routeWithExecute(r3, r2, r1)
            r3.finish()
            goto L3d
        L35:
            com.huawei.arouter.RouteUtils.routeWithExecute(r3, r2, r1)
            r3.finish()
            r4 = 0
            throw r4
        L3d:
            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r4 = r4 + 13
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.lambda$observeSimCardRemovalState$2(com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState):void");
    }

    private void checkCachedSimCardRemovalState() {
        int i = 2 % 2;
        this.simCardRemovalRepository.getCachedStateAsync(new Function1() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 65;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM10295$r8$lambda$qW2BhNGCtnfkyQilEaQvisTyUs = SplashActivity.m10295$r8$lambda$qW2BhNGCtnfkyQilEaQvisTyUs(this.f$0, (SimCardRemovalState) obj);
                int i5 = ShareDataUIState + 11;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitM10295$r8$lambda$qW2BhNGCtnfkyQilEaQvisTyUs;
                }
                throw null;
            }
        });
        int i2 = copy + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private Unit lambda$checkCachedSimCardRemovalState$4(final SimCardRemovalState simCardRemovalState) {
        int i = 2 % 2;
        runOnUiThread(new Runnable() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 41;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    SplashActivity.$r8$lambda$aDBy5ePpI0zRvp3Ow25QZr4ojIA(this.f$0, simCardRemovalState);
                    throw null;
                }
                SplashActivity.$r8$lambda$aDBy5ePpI0zRvp3Ow25QZr4ojIA(this.f$0, simCardRemovalState);
                int i4 = component1 + 23;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component4 + 107;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void lambda$checkCachedSimCardRemovalState$3(SimCardRemovalState simCardRemovalState) {
        int i = 2 % 2;
        Object obj = null;
        if (simCardRemovalState != null) {
            this.simCardRemovalManager.updateSimState(simCardRemovalState);
            if (!simCardRemovalState.isSimRemoved()) {
                int i2 = copy + 25;
                component4 = i2 % 128;
                if (i2 % 2 != 0) {
                    checkIfCanProceed();
                    obj.hashCode();
                    throw null;
                }
                checkIfCanProceed();
            }
        } else {
            this.simCardRemovalManager.updateSimState("MISSING_SIM_CARD".equals(this.deviceInfoRepository.getSIMCardState()));
        }
        int i3 = copy + 121;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void observeDeviceRestartState() {
        int i = 2 % 2;
        this.deviceRestartManager.getRestartStateLiveData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 81;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    SplashActivity.$r8$lambda$y90ZGsUr2H3fsxNVlOrC9e2KGOA(this.f$0, (DeviceRestartState) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                SplashActivity.$r8$lambda$y90ZGsUr2H3fsxNVlOrC9e2KGOA(this.f$0, (DeviceRestartState) obj);
                int i4 = ShareDataUIState + 55;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component4 + 101;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r7.isDeviceRestartLoadingVisible == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r7.isDeviceRestartLoadingVisible = true;
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r2 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.NotRestarted;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((!(r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMatch)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r1 = r1 + 103;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if ((r1 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if ((!(r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMismatch)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Error) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.NoLastLoginMsisdn) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.ProceedWithLogin) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        r8 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMismatch;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r7.isDeviceRestartLoadingVisible == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        r7.isDeviceRestartLoadingVisible = false;
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r2 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMatch) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMismatch) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        if ((!(r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Error)) == true) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (r7.deviceRestartManager.isDeviceRestartScreenVisible().getValue().booleanValue() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 + 95;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        if ((r8 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        com.huawei.arouter.RouteUtils.routeWithExecute(r7, com.huawei.digitalpayment.consumer.base.constants.BaseRoutePathConstants.DEVICE_RESTARTED, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        com.huawei.arouter.RouteUtils.routeWithExecute(r7, com.huawei.digitalpayment.consumer.base.constants.BaseRoutePathConstants.DEVICE_RESTARTED, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        checkIfCanProceed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!(r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Loading)) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Loading) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$observeDeviceRestartState$5(com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r2 = r1 + 57
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L19
            boolean r2 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Loading
            r5 = 33
            int r5 = r5 / r3
            r2 = r2 ^ r4
            if (r2 == 0) goto L1d
            goto L27
        L19:
            boolean r2 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Loading
            if (r2 == 0) goto L27
        L1d:
            boolean r8 = r7.isDeviceRestartLoadingVisible
            if (r8 == r4) goto L26
            r7.isDeviceRestartLoadingVisible = r4
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r7)
        L26:
            return
        L27:
            boolean r2 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.NotRestarted
            r5 = 0
            if (r2 != 0) goto L52
            boolean r6 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMatch
            r6 = r6 ^ r4
            if (r6 == 0) goto L52
            int r1 = r1 + 103
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L4c
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMismatch
            r1 = r1 ^ r4
            if (r1 == 0) goto L52
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Error
            if (r1 != 0) goto L52
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.NoLastLoginMsisdn
            if (r1 != 0) goto L52
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.ProceedWithLogin
            if (r1 == 0) goto L5b
            goto L52
        L4c:
            boolean r8 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMismatch
            r5.hashCode()
            throw r5
        L52:
            boolean r1 = r7.isDeviceRestartLoadingVisible
            if (r1 == 0) goto L5b
            r7.isDeviceRestartLoadingVisible = r3
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r7)
        L5b:
            if (r2 != 0) goto L97
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMatch
            if (r1 == 0) goto L62
            goto L97
        L62:
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.MsisdnMismatch
            if (r1 != 0) goto L6b
            boolean r8 = r8 instanceof com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState.Error
            r8 = r8 ^ r4
            if (r8 == r4) goto L9a
        L6b:
            com.huawei.digitalpayment.consumer.base.sim.DeviceRestartManager r8 = r7.deviceRestartManager
            kotlinx.coroutines.flow.StateFlow r8 = r8.isDeviceRestartScreenVisible()
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L9a
            int r8 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r8 = r8 + 95
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r1
            int r8 = r8 % r0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            java.lang.String r1 = "/sfcModule/deviceRestarted"
            if (r8 == 0) goto L90
            com.huawei.arouter.RouteUtils.routeWithExecute(r7, r1, r0)
            goto L9a
        L90:
            com.huawei.arouter.RouteUtils.routeWithExecute(r7, r1, r0)
            r5.hashCode()
            throw r5
        L97:
            r7.checkIfCanProceed()
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.lambda$observeDeviceRestartState$5(com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState):void");
    }

    private void checkIfCanProceed() {
        int i = 2 % 2;
        int i2 = copy + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartState value = this.deviceRestartManager.getRestartStateLiveData().getValue();
        SimCardRemovalState value2 = this.simCardRemovalManager.getSimCardRemovalStateLiveData().getValue();
        boolean z = (value2 == null || value2.isSimRemoved()) ? false : true;
        boolean z2 = !((value instanceof DeviceRestartState.NotRestarted) ^ true) || (value instanceof DeviceRestartState.MsisdnMatch);
        if (z && z2) {
            proceedWithOnCreate();
        }
        int i4 = component4 + 125;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void proceedWithOnCreate() {
        int i = 2 % 2;
        if (!this.deviceInfoRepository.getSIMCardState().equals("MISSING_SIM_CARD")) {
            if (getIntent().getBooleanExtra("sessionOut", false)) {
                initObserver();
                queryLoginType();
                ((BasicActivitySplashBinding) this.binding).ivLogo.setImageResource(R.mipmap.new_splash);
                return;
            }
            ((BasicActivitySplashBinding) this.binding).ivLogo.setImageResource(R.mipmap.new_splash);
            ((BasicActivitySplashBinding) this.binding).ivLogo.postDelayed(new Runnable() {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 17;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    SplashActivity.m10296$r8$lambda$vgNDQo7OrFcapmXSLl_s6QFsTY(this.f$0);
                    int i5 = ShareDataUIState + 51;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }
            }, 100L);
            fetchPublicKeysIfNeed();
            Log.d(this.TAG, "Sign:" + SignUtils.getSign());
            int i2 = copy + 123;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = component4 + 119;
        copy = i4 % 128;
        int i5 = i4 % 2;
        this.simCardRemovalManager.updateSimState(true);
    }

    private void init() {
        int i = 2 % 2;
        ((BasicActivitySplashBinding) this.binding).btnSkip.setOnClickListener(new FilterFastClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 121;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    SplashActivity.m10299$$Nest$mgoNext(SplashActivity.this);
                    throw null;
                }
                SplashActivity.m10299$$Nest$mgoNext(SplashActivity.this);
                int i4 = copydefault + 33;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        AppConfigManager.INSTANCE.getBasicConfig(new ApiCallback<Object>(this) {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 125;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SPUtils.getInstance().put(SPConstant.KEY_BASIC_CONFIG_SUCCESS, true, true);
                int i5 = component2 + 87;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        if (SPUtils.getInstance().getBoolean(SPConstant.KEY_BASIC_CONFIG_SUCCESS)) {
            int i2 = component4 + 17;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                goNext();
            } else {
                goNext();
                throw null;
            }
        }
        initObserver();
        checkNext();
        SPUtils.getInstance().remove(SPConstant.PENDING_EXECUTE);
        SPUtils.getInstance().put(SPConstant.KEY_SHOW_AD, true);
        StartPageManager.INSTANCE.setShowAdPage(true);
        ConvertorManager.INSTANCE.addConvertor();
    }

    private void fetchPublicKeysIfNeed() {
        int i = 2 % 2;
        int i2 = copy + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String signKey = AppConfigManager.getAppConfig().getSignKey();
        String pinKey = AppConfigManager.getAppConfig().getPinKey();
        if (TextUtils.isEmpty(signKey) || TextUtils.isEmpty(pinKey)) {
            DialogUtils.showLoading(this);
            AppConfigManager.INSTANCE.getConfigVerify(new ApiCallback<JSONObject>() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public void onSuccess(JSONObject jSONObject) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 17;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    component2(jSONObject);
                    int i7 = component1 + 85;
                    component3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 16 / 0;
                    }
                }

                public void component2(JSONObject jSONObject) {
                    int i4 = 2 % 2;
                    int i5 = component3 + 21;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    DialogUtils.hideLoading(SplashActivity.this);
                    SplashActivity.m10301$$Nest$minit(SplashActivity.this);
                    int i7 = component1 + 21;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override
                public void onError(BaseException baseException) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 23;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        DialogUtils.hideLoading(SplashActivity.this);
                        CommonToast.showText(baseException.getMessage());
                        int i6 = 28 / 0;
                    } else {
                        DialogUtils.hideLoading(SplashActivity.this);
                        CommonToast.showText(baseException.getMessage());
                    }
                }
            });
            return;
        }
        int i4 = copy + 27;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        AppConfigManager.INSTANCE.getConfigVerify(null);
        init();
    }

    private void lambda$playAnimationLogo$6(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 5;
        copy = i3 % 128;
        int i4 = i3 % 2;
        onLogoAnimationEnd();
        int i5 = copy + 23;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }

    private void playAnimationLogo() {
        int i = 2 % 2;
        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.ic_logo);
            gifDrawable.addAnimationListener(new AnimationListener() {
                private static int component1 = 0;
                private static int component3 = 1;

                @Override
                public final void onAnimationCompleted(int i2) {
                    int i3 = 2 % 2;
                    int i4 = component3 + 69;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        SplashActivity.$r8$lambda$qQGoJuORGI0gtCQ2YYiO1MLo0kc(this.f$0, i2);
                        int i5 = 25 / 0;
                    } else {
                        SplashActivity.$r8$lambda$qQGoJuORGI0gtCQ2YYiO1MLo0kc(this.f$0, i2);
                    }
                    int i6 = component1 + 89;
                    component3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            ((BasicActivitySplashBinding) this.binding).ivLogo.setImageDrawable(gifDrawable);
            int i2 = copy + 59;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        } catch (IOException e) {
            L.INSTANCE.d(this.TAG, e.getMessage(), new Object[0]);
        }
        int i4 = component4 + 93;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r6.isConfigQueryEnd == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        showStartPageImg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r6.isGuideQueryEnd != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r6.isGuideQueryEnd != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        toGuide();
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 + 65;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onLogoAnimationEnd() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "onLogoAnimationEnd"
            if (r1 == 0) goto L22
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r5 = r6.TAG
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.d(r5, r4, r3)
            r6.isLogoAnimatedEnd = r2
            boolean r1 = r6.isGuideQueryEnd
            if (r1 == 0) goto L3e
            goto L31
        L22:
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r5 = r6.TAG
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.d(r5, r4, r3)
            r6.isLogoAnimatedEnd = r2
            boolean r1 = r6.isGuideQueryEnd
            if (r1 == 0) goto L3e
        L31:
            r6.toGuide()
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r2
            int r1 = r1 % r0
            goto L45
        L3e:
            boolean r0 = r6.isConfigQueryEnd
            if (r0 == 0) goto L45
            r6.showStartPageImg()
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.onLogoAnimationEnd():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        observeConfig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils.checkIsShowGuide() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils.checkIsShowGuide() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        toGuide();
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy + 47;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkNext() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "checkNext: "
            if (r1 == 0) goto L21
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r3 = r5.TAG
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.d(r3, r2, r4)
            boolean r1 = com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils.checkIsShowGuide()
            if (r1 == 0) goto L3e
            goto L31
        L21:
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r3 = r5.TAG
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.d(r3, r2, r4)
            boolean r1 = com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils.checkIsShowGuide()
            if (r1 == 0) goto L3e
        L31:
            r5.toGuide()
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            goto L41
        L3e:
            r5.observeConfig()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.checkNext():void");
    }

    private void lambda$initObserver$7(Boolean bool) {
        int i = 2 % 2;
        int i2 = copy + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.isGuideQueryEnd = true;
        if (this.isLogoAnimatedEnd) {
            toGuide();
            int i4 = copy + 69;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void initObserver() {
        int i = 2 % 2;
        ((SplashViewModel) this.viewModel).getMutableLiveData().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    SplashActivity.m10294$r8$lambda$l1eVDv5VdFa2UFZjYH9Wnia2Dk(this.f$0, (Boolean) obj);
                    throw null;
                }
                SplashActivity.m10294$r8$lambda$l1eVDv5VdFa2UFZjYH9Wnia2Dk(this.f$0, (Boolean) obj);
                int i4 = component3 + 25;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        this.loginViewModel.getData().observe(this, new Observer<Resource<LocalQueryLoginType>>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onChanged(Resource<LocalQueryLoginType> resource) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(resource);
                int i5 = component2 + 23;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component3(Resource<LocalQueryLoginType> resource) {
                int i2 = 2 % 2;
                int i3 = copydefault + 109;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    resource.loading();
                    obj.hashCode();
                    throw null;
                }
                if (resource.loading()) {
                    DialogUtils.showLoading(SplashActivity.this);
                    return;
                }
                DialogUtils.hideLoading(SplashActivity.this);
                if (!(!resource.success())) {
                    int i4 = component2 + 43;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        SplashActivity.m10300$$Nest$mhandQueryLoginType(SplashActivity.this, resource.getData());
                    } else {
                        SplashActivity.m10300$$Nest$mhandQueryLoginType(SplashActivity.this, resource.getData());
                        obj.hashCode();
                        throw null;
                    }
                }
                if (resource.error()) {
                    RouteUtils.routeWithExecute(RoutePathConstants.PIN_LOGIN);
                    SplashActivity.this.finish();
                    int i5 = copydefault + 119;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        int i2 = copy + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handQueryLoginType(com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r6) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.handQueryLoginType(com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType):void");
    }

    private String getLoginRoute() {
        int i = 2 % 2;
        int i2 = component4 + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        for (String str : getLoginPriorityList()) {
            if ("2".equals(str)) {
                int i4 = component4 + 31;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 70 / 0;
                }
                return RoutePathConstants.PIN_LOGIN;
            }
            if ("4".equals(str)) {
                int i6 = copy + 101;
                component4 = i6 % 128;
                int i7 = i6 % 2;
                String lastLoginRoute = getLastLoginRoute();
                int i8 = component4 + 3;
                copy = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 90 / 0;
                }
                return lastLoginRoute;
            }
            if ("3".equals(str)) {
                return RoutePathConstants.OTP_LOGIN;
            }
        }
        return RoutePathConstants.PIN_LOGIN;
    }

    private String getLastLoginRoute() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.KEY_LAST_LOGIN_TYPE);
        if ("0".equals(string) || "1".equals(string)) {
            return getPriorityRoute();
        }
        if (!"2".equals(string)) {
            return "3".equals(string) ? RoutePathConstants.OTP_LOGIN : RoutePathConstants.LOGIN;
        }
        int i4 = component4 + 121;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return RoutePathConstants.PIN_LOGIN;
    }

    private String getPriorityRoute() {
        int i = 2 % 2;
        int i2 = copy + 87;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        for (String str : getLoginPriorityList()) {
            int i4 = component4 + 111;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if ("2".equals(str)) {
                return RoutePathConstants.PIN_LOGIN;
            }
            if ("3".equals(str)) {
                int i6 = copy + 61;
                component4 = i6 % 128;
                int i7 = i6 % 2;
                return RoutePathConstants.OTP_LOGIN;
            }
        }
        return RoutePathConstants.LOGIN;
    }

    public static List<String> getLoginPriorityList() {
        int i = 2 % 2;
        int i2 = copy + 91;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.PRIORITY_LOGIN);
            if (TextUtils.isEmpty(string)) {
                return Arrays.asList("0", "1", "2", "3", "4");
            }
            List<String> list = (List) GsonUtils.fromJson(string, new TypeToken<List<String>>() {
            }.getType());
            if (CollectionUtils.isEmpty(list)) {
                return Arrays.asList("0", "1", "2", "3", "4");
            }
            if (!list.contains("0")) {
                list.add("0");
            }
            if (!list.contains("1")) {
                list.add("1");
            }
            if (!list.contains("2")) {
                list.add("2");
            }
            if (!list.contains("3")) {
                int i3 = component4 + 5;
                copy = i3 % 128;
                if (i3 % 2 == 0) {
                    list.add("3");
                    int i4 = 71 / 0;
                } else {
                    list.add("3");
                }
            }
            if (!list.contains("4")) {
                int i5 = copy + 125;
                component4 = i5 % 128;
                if (i5 % 2 != 0) {
                    list.add("4");
                    obj.hashCode();
                    throw null;
                }
                list.add("4");
            }
            return list;
        }
        TextUtils.isEmpty(SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.PRIORITY_LOGIN));
        throw null;
    }

    private void queryGuide() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        L.INSTANCE.d(this.TAG, "queryGuide: ", new Object[0]);
        startQueryDataTimer();
        ((SplashViewModel) this.viewModel).queryGuide();
        int i4 = copy + 17;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$6] */
    private void startQueryDataTimer() {
        int i = 2 % 2;
        this.queryDataTimer = new CountDownTimer(3000L, 1000L) {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onFinish() {
                int i2 = 2 % 2;
                int i3 = component3 + 71;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SplashActivity.m10302$$Nest$mtoGuide(SplashActivity.this);
                int i5 = component3 + 1;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onTick(long j) {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }
        }.start();
        int i2 = copy + 113;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void toGuide() {
        int i = 2 % 2;
        Log.d(this.TAG, "toGuide: " + this.isExecute);
        if (!this.isExecute) {
            this.isExecute = true;
            Intent intent = new Intent(this, (Class<?>) SFCGuideActivity.class);
            intent.setPackage(getPackageName());
            startActivity(intent);
            finish();
            return;
        }
        int i2 = copy + 67;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$8] */
    private void observeConfig() {
        int i = 2 % 2;
        this.waitConfigTimer = new CountDownTimer(3000L, 1000L) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onFinish() {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SplashActivity.m10299$$Nest$mgoNext(SplashActivity.this);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onTick(long j) {
                int i2 = 2 % 2;
                int i3 = component3 + 77;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }
        }.start();
        AppConfigManager.INSTANCE.addConfigListener(new AppConfigListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onAppConfig(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 71;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SplashActivity.$r8$lambda$kIvlCQZK4CQ3HA8_KW4_rpbUCcA(this.f$0, obj);
                int i5 = component1 + 37;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = component4 + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$observeConfig$8(Object obj) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 11;
        copy = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            CountDownTimer countDownTimer = this.waitConfigTimer;
            if (countDownTimer != null) {
                int i4 = i2 + 105;
                copy = i4 % 128;
                if (i4 % 2 != 0) {
                    countDownTimer.cancel();
                } else {
                    countDownTimer.cancel();
                    obj2.hashCode();
                    throw null;
                }
            }
            try {
                BasicUiModuleHelper.INSTANCE.updateOpenPageConfig(new JSONObject(obj.toString()).optString("OpenPageConfig", ""));
            } catch (Exception e) {
                L.INSTANCE.e(e.getMessage(), new Object[0]);
            }
            this.isConfigQueryEnd = true;
            if (this.isLogoAnimatedEnd) {
                int i5 = copy + 83;
                component4 = i5 % 128;
                int i6 = i5 % 2;
                showStartPageImg();
                if (i6 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r14.countDownTimer = new com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.AnonymousClass9(r14, 1000 * java.lang.Long.parseLong(r1.getShowSeconds()), 1000);
        r14.timeoutTimer = new com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.AnonymousClass14(r14, 5000, 1000).start();
        loadAd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.getExecute()) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        com.huawei.common.util.FastClickUtils.setOnClickListener(((com.huawei.digitalpayment.consumer.basic.databinding.BasicActivitySplashBinding) r14.binding).ivSplash, new com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$$ExternalSyntheticLambda8(r14, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        goNext();
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 + 13;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r1 % 128;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$14] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showStartPageImg() {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "showStartPageImg: "
            if (r1 == 0) goto L23
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r3 = r14.TAG
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.d(r3, r2, r4)
            com.huawei.digitalpayment.consumer.basicUi.util.BasicUiModuleHelper r1 = com.huawei.digitalpayment.consumer.basicUi.util.BasicUiModuleHelper.INSTANCE
            com.huawei.digitalpayment.consumer.basicUi.model.OpenPageConfig r1 = r1.getOpenPageConfig()
            if (r1 != 0) goto L49
            goto L35
        L23:
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r3 = r14.TAG
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.d(r3, r2, r4)
            com.huawei.digitalpayment.consumer.basicUi.util.BasicUiModuleHelper r1 = com.huawei.digitalpayment.consumer.basicUi.util.BasicUiModuleHelper.INSTANCE
            com.huawei.digitalpayment.consumer.basicUi.model.OpenPageConfig r1 = r1.getOpenPageConfig()
            if (r1 != 0) goto L49
        L35:
            r14.goNext()
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L44
            return
        L44:
            r0 = 0
            r0.hashCode()
            throw r0
        L49:
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$9 r0 = new com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$9
            java.lang.String r2 = r1.getShowSeconds()
            long r2 = java.lang.Long.parseLong(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            r6 = 1000(0x3e8, double:4.94E-321)
            r2 = r0
            r3 = r14
            r2.<init>(r4, r6)
            r14.countDownTimer = r0
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$14 r0 = new com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$14
            r10 = 5000(0x1388, double:2.4703E-320)
            r12 = 1000(0x3e8, double:4.94E-321)
            r8 = r0
            r9 = r14
            r8.<init>(r10, r12)
            android.os.CountDownTimer r0 = r0.start()
            r14.timeoutTimer = r0
            r14.loadAd(r1)
            java.lang.String r0 = r1.getExecute()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8b
            Binding extends androidx.databinding.ViewDataBinding r0 = r14.binding
            com.huawei.digitalpayment.consumer.basic.databinding.BasicActivitySplashBinding r0 = (com.huawei.digitalpayment.consumer.basic.databinding.BasicActivitySplashBinding) r0
            android.widget.ImageView r0 = r0.ivSplash
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$$ExternalSyntheticLambda8 r2 = new com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity$$ExternalSyntheticLambda8
            r2.<init>()
            com.huawei.common.util.FastClickUtils.setOnClickListener(r0, r2)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.showStartPageImg():void");
    }

    private void lambda$showStartPageImg$9(OpenPageConfig openPageConfig, View view) {
        int i = 2 % 2;
        int i2 = component4 + 113;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            SPUtils.getInstance().put(SPConstant.PENDING_EXECUTE, openPageConfig.getExecute());
            goNext();
            int i3 = copy + 89;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        SPUtils.getInstance().put(SPConstant.PENDING_EXECUTE, openPageConfig.getExecute());
        goNext();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void loadAd(OpenPageConfig openPageConfig) {
        int i = 2 % 2;
        Glide.with(((BasicActivitySplashBinding) this.binding).ivSplash).asBitmap().load(UrlUtils.getURL(AppConfigManager.getAppConfig().getH5BaseUrl(), openPageConfig.getImgUrl())).addListener(new RequestListener<Bitmap>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z) {
                int i2 = 2 % 2;
                int i3 = component2 + 27;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                boolean zComponent1 = component1(bitmap, obj, target, dataSource, z);
                int i5 = component2 + 77;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return zComponent1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SplashActivity.m10299$$Nest$mgoNext(SplashActivity.this);
                int i5 = component3 + 51;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public boolean component1(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z) {
                int i2 = 2 % 2;
                if (SplashActivity.m10298$$Nest$fgettimeoutTimer(SplashActivity.this) != null) {
                    int i3 = component2 + 75;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    SplashActivity.m10298$$Nest$fgettimeoutTimer(SplashActivity.this).cancel();
                }
                AppConfigUtils.getStateBarBgBitmapPixColor(bitmap);
                ((BasicActivitySplashBinding) SplashActivity.access$300(SplashActivity.this)).btnSkip.setVisibility(0);
                if (SplashActivity.m10297$$Nest$fgetcountDownTimer(SplashActivity.this) != null) {
                    int i5 = component3 + 33;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        SplashActivity.m10297$$Nest$fgetcountDownTimer(SplashActivity.this).start();
                        throw null;
                    }
                    SplashActivity.m10297$$Nest$fgetcountDownTimer(SplashActivity.this).start();
                }
                int i6 = component3 + 73;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }).into(((BasicActivitySplashBinding) this.binding).ivSplash);
        int i2 = copy + 69;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.isExecute = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils.checkIsShowGuide() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy + 49;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r1 % 128;
        r1 = r1 % 2;
        com.huawei.arouter.RouteUtils.routeWithExecute(com.huawei.digitalpayment.consumer.basic.ui.constant.RoutePathConstants.SFC_GUIDE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((true ^ android.text.TextUtils.isEmpty(com.huawei.common.util.SPUtils.getInstance().getString("recent_login_phone_number"))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy + 21;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r1 % 128;
        r1 = r1 % 2;
        queryLoginType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        com.huawei.arouter.RouteUtils.routeWithExecute(com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants.LOGIN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.isExecute != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.isExecute != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 115;
        com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void goNext() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            boolean r1 = r4.isExecute
            r3 = 29
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            boolean r1 = r4.isExecute
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 115
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r1
            int r2 = r2 % r0
            return
        L23:
            r1 = 1
            r4.isExecute = r1
            boolean r2 = com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils.checkIsShowGuide()
            if (r2 == 0) goto L3b
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            java.lang.String r0 = "/loginModule/sfcGuide"
            com.huawei.arouter.RouteUtils.routeWithExecute(r0)
            goto L5e
        L3b:
            com.huawei.common.util.SPUtils r2 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r3 = "recent_login_phone_number"
            java.lang.String r2 = r2.getString(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r1 = r1 ^ r2
            if (r1 == 0) goto L59
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.copy
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.component4 = r2
            int r1 = r1 % r0
            r4.queryLoginType()
            goto L5e
        L59:
            java.lang.String r0 = "/loginModule/login"
            com.huawei.arouter.RouteUtils.routeWithExecute(r0)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.goNext():void");
    }

    private void queryLoginType() {
        int i = 2 % 2;
        this.loginViewModel.queryLoginType(new QueryLoginTypeParams(SPUtils.getInstance().getString("recent_login_phone_number")));
        int i2 = component4 + 85;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        this.deviceRestartManager.setSplashScreenVisible(false);
        super.onDestroy();
        CountDownTimer countDownTimer = this.countDownTimer;
        Object obj = null;
        if (countDownTimer != null) {
            int i2 = component4 + 93;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                countDownTimer.cancel();
            } else {
                countDownTimer.cancel();
                obj.hashCode();
                throw null;
            }
        }
        CountDownTimer countDownTimer2 = this.queryDataTimer;
        if (countDownTimer2 != null) {
            int i3 = copy + 13;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                countDownTimer2.cancel();
            } else {
                countDownTimer2.cancel();
                obj.hashCode();
                throw null;
            }
        }
        CountDownTimer countDownTimer3 = this.timeoutTimer;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
            int i4 = component4 + 23;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        CountDownTimer countDownTimer4 = this.waitConfigTimer;
        if (countDownTimer4 != null) {
            int i6 = component4 + 29;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                countDownTimer4.cancel();
            } else {
                countDownTimer4.cancel();
                throw null;
            }
        }
    }

    private void addDataConvert() {
        int i = 2 % 2;
        DataConvertManager.addConvertAdapter(new BaseDataConvertAdapter() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public Object transfer(JsonObject jsonObject) {
                LocalQueryLoginType localQueryLoginType;
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    localQueryLoginType = SplashActivity.this.toLocalQueryLoginType((CustomQueryLoginType) SecureGsonUtils.fromJson(jsonObject.toString(), CustomQueryLoginType.class));
                    int i4 = 84 / 0;
                } else {
                    localQueryLoginType = SplashActivity.this.toLocalQueryLoginType((CustomQueryLoginType) SecureGsonUtils.fromJson(jsonObject.toString(), CustomQueryLoginType.class));
                }
                int i5 = ShareDataUIState + 49;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 83 / 0;
                }
                return localQueryLoginType;
            }

            @Override
            public String path() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                int i4 = i3 % 128;
                component3 = i4;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 95;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 40 / 0;
                }
                return "queryLoginType";
            }

            @Override
            public String redirectPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                int i4 = i3 % 128;
                component3 = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 75;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return "queryLoginType";
            }
        });
        int i2 = component4 + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType toLocalQueryLoginType(com.huawei.digitalpayment.consumer.basic.ui.bean.CustomQueryLoginType r8) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.toLocalQueryLoginType(com.huawei.digitalpayment.consumer.basic.ui.bean.CustomQueryLoginType):com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType");
    }

    private void lambda$securityCheck$10(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 37;
        copy = i3 % 128;
        int i4 = i3 % 2;
        finish();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = component4 + 59;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    private void lambda$securityCheck$11(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 67;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        finish();
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
    }

    private void lambda$securityCheck$12(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 37;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        finish();
        int i5 = copy + 111;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
    }

    private void securityCheck() {
        int i = 2 % 2;
        if (!(!((IAppConfig) RouteUtils.getService(IAppConfig.class)).isSecurityDetectEnabled())) {
            int i2 = copy + 75;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Log.d(this.TAG, "开始检测Root:");
            if (RootDetect.isRoot()) {
                new AlertDialog.Builder(this).setMessage(getString(R.string.basic_the_devices_has_rooted)).setCancelable(false).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = 2 % 2;
                        int i6 = component1 + 25;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        SplashActivity.$r8$lambda$3i0a8xaILNehS3VpwE9783X_UzI(this.f$0, dialogInterface, i4);
                        int i8 = copydefault + 73;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }).create().show();
                int i4 = component4 + 65;
                copy = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Log.d(this.TAG, "开始检测模拟器：");
            if (SecurityDetect.iej()) {
                Log.d(this.TAG, "检测模拟器：success");
                new AlertDialog.Builder(this).setMessage(getString(R.string.basic_the_devices_is_running_in_emulator)).setCancelable(false).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        int i7 = 2 % 2;
                        int i8 = component3 + 85;
                        ShareDataUIState = i8 % 128;
                        Object obj = null;
                        if (i8 % 2 == 0) {
                            SplashActivity.$r8$lambda$y9N1EkHwjoyEhFE8mxAORWw12d8(this.f$0, dialogInterface, i6);
                            obj.hashCode();
                            throw null;
                        }
                        SplashActivity.$r8$lambda$y9N1EkHwjoyEhFE8mxAORWw12d8(this.f$0, dialogInterface, i6);
                        int i9 = ShareDataUIState + 79;
                        component3 = i9 % 128;
                        if (i9 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }).create().show();
            } else {
                Log.d(this.TAG, "检测模拟器：Fail");
                if (XposedDetect.isXposedHook(this)) {
                    new AlertDialog.Builder(this).setMessage(getString(R.string.basic_the_devices_has_installed_xposed_framework)).setCancelable(false).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            int i7 = 2 % 2;
                            int i8 = copydefault + 53;
                            component3 = i8 % 128;
                            int i9 = i8 % 2;
                            SplashActivity.$r8$lambda$5M8Jrg9O4gLPfd1krvvBzo22wPs(this.f$0, dialogInterface, i6);
                            int i10 = copydefault + 49;
                            component3 = i10 % 128;
                            if (i10 % 2 == 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }).create().show();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SplashActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 25, new char[]{2, 20, 17, 6, 3, 29, 18, 0, 30, 20, 24, 0, 14, 5, 15, '!', 21, JSONLexer.EOI, 7, 3, '\"', 30, '\t', 5, 30, 14}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 33), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 14, new char[]{0, '\b', 13888, 13888, 2, 15, 11, 15, 13890, 13890, '!', 25, '\b', 2, 15, '!', 2, 17}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 59), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i2 = copy + 81;
                component4 = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetBefore("", 0), 42 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0), 56 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -960739708, false, "component3", new Class[]{Context.class});
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
        int i4 = copy + 59;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext = context;
        int i = 2 % 2;
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 28, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 126, new byte[]{-125, -122, -114, -115, -116}, null, null, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue >= 99000) {
            int i4 = copy + 115;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            if (iIntValue <= 99999) {
                return;
            }
        }
        if (applicationContext != null) {
            int i6 = component4 + 53;
            copy = i6 % 128;
            int i7 = i6 % 2;
            if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                int i8 = component4 + 55;
                copy = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 / 2;
                }
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
        }
        if (applicationContext != null) {
            int i10 = copy + 59;
            component4 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6618, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = new Object[1];
                e(48 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{31, JSONLexer.EOI, '\b', 25, 22, '\n', 3, 4, JSONLexer.EOI, 5, CharUtils.CR, 28, 28, 31, 4, 15, 25, 6, 13814, 13814, '!', '#', 15, 4, 22, 23, 27, 20, JSONLexer.EOI, 30, 13891, 13891, 2, '!', 25, 11, 1, 24, '\b', 2, 15, 22, 24, 29, 22, 3, 18, 27}, (byte) (Color.green(0) + 71), objArr3);
                String str = (String) objArr3[0];
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 33, new char[]{6, 18, 31, '\n', 27, 23, 13883, 13883, 2, 24, '\t', 19, 28, CharUtils.CR, 13883, 13883, '#', 28, 18, 28, 24, 27, 28, '#', 20, 4, 16, 30, 22, 28, '\f', 28, 28, 23, 0, JSONLexer.EOI, 0, 15, '\b', 1, 4, 20, 31, CharUtils.CR, 27, 29, 25, '\n', 18, 6, 30, JSONLexer.EOI, '\n', 28, 28, 20, 22, 4, 28, 19, 31, 28, CharUtils.CR, 28}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 43), objArr4);
                String str2 = (String) objArr4[0];
                Object[] objArr5 = new Object[1];
                d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) + 95, new byte[]{-118, -107, -104, -109, -108, -111, -117, -127, -105, -113, -113, -110, -102, -118, -106, -110, -118, -108, -102, -113, -106, -102, -109, -106, -117, -111, -125, -110, -113, -118, -109, -113, -112, -103, -103, -125, -103, -109, -125, -104, -109, -111, -106, -108, -107, -107, -118, -117, -105, -107, -113, -106, -112, -118, -118, -109, -107, -108, -109, -110, -125, -111, -112, -113}, null, null, objArr5);
                String str3 = (String) objArr5[0];
                Object[] objArr6 = new Object[1];
                e((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 72, new char[]{'!', 11, 6, 21, 19, 25, 13872, 13872, 22, '\"', 28, '\n', ' ', 28, 22, 27, '\n', CharUtils.CR, 13859, 13859, 22, 3, 0, JSONLexer.EOI, '!', 6, 5, 17, 2, '!', '\b', 3, 31, 14, 6, '!', '\t', 7, '#', '\b', CharUtils.CR, 14, 11, 7, '#', '\b', 0, '!', 3, 0, 21, 17, 30, 20, '!', 21, JSONLexer.EOI, 15, '\t', 2, 15, 7, 14, 21, 3, '\f', 2, 21, 2, 15, 7, 15}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 122), objArr6);
                String str4 = (String) objArr6[0];
                Object[] objArr7 = new Object[1];
                e(6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{24, 31, '\t', 19, 31, '#'}, (byte) (104 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr7);
                String str5 = (String) objArr7[0];
                Object[] objArr8 = new Object[1];
                d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) + 81, new byte[]{-113, -106, -104, -127, -109, -102, -104, -111, -117, -104, -117, -109, -101, -105, -113, -104, -127, -101, -109, -107, -107, -104, -101, -113, -111, -113, -113, -101, -109, -105, -103, -104, -109, -127, -110, -125}, null, null, objArr8);
                Object[] objArr9 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr8[0], Integer.valueOf(CacheConstants.DAY)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0), 55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr9);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public static void $r8$lambda$3i0a8xaILNehS3VpwE9783X_UzI(SplashActivity splashActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 95;
        copy = i3 % 128;
        int i4 = i3 % 2;
        splashActivity.lambda$securityCheck$10(dialogInterface, i);
        int i5 = component4 + 59;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$5M8Jrg9O4gLPfd1krvvBzo22wPs(SplashActivity splashActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 111;
        copy = i3 % 128;
        int i4 = i3 % 2;
        splashActivity.lambda$securityCheck$12(dialogInterface, i);
        int i5 = copy + 45;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
    }

    public static void m10292$r8$lambda$VGhS9oE7K0x8eB0eFygNGmp3L0(SplashActivity splashActivity, SimCardRemovalState simCardRemovalState) {
        int i = 2 % 2;
        int i2 = component4 + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.lambda$observeSimCardRemovalState$2(simCardRemovalState);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = component4 + 37;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10293$r8$lambda$_5yIW3nOjcQ4KlHDRRyoBD3tUg(SplashActivity splashActivity, OpenPageConfig openPageConfig, View view) {
        int i = 2 % 2;
        int i2 = component4 + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10303instrumented$0$showStartPageImg$V(splashActivity, openPageConfig, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 23;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    public static void $r8$lambda$aDBy5ePpI0zRvp3Ow25QZr4ojIA(SplashActivity splashActivity, SimCardRemovalState simCardRemovalState) {
        int i = 2 % 2;
        int i2 = copy + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.lambda$checkCachedSimCardRemovalState$3(simCardRemovalState);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    public static Unit $r8$lambda$iT7wfSQ5vTTN9hGgvPRL2tw8Dx8(SplashActivity splashActivity, DeviceRestartState deviceRestartState) {
        int i = 2 % 2;
        int i2 = copy + 93;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            splashActivity.lambda$checkCachedDeviceRestartState$1(deviceRestartState);
            throw null;
        }
        Unit unitLambda$checkCachedDeviceRestartState$1 = splashActivity.lambda$checkCachedDeviceRestartState$1(deviceRestartState);
        int i3 = component4 + 17;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return unitLambda$checkCachedDeviceRestartState$1;
    }

    public static void $r8$lambda$kIvlCQZK4CQ3HA8_KW4_rpbUCcA(SplashActivity splashActivity, Object obj) {
        int i = 2 % 2;
        int i2 = copy + 51;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.lambda$observeConfig$8(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = component4 + 55;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10294$r8$lambda$l1eVDv5VdFa2UFZjYH9Wnia2Dk(SplashActivity splashActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = copy + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.lambda$initObserver$7(bool);
        int i4 = component4 + 125;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
    }

    public static void $r8$lambda$qQGoJuORGI0gtCQ2YYiO1MLo0kc(SplashActivity splashActivity, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 87;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        splashActivity.lambda$playAnimationLogo$6(i);
        int i5 = copy + 53;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
    }

    public static Unit m10295$r8$lambda$qW2BhNGCtnfkyQilEaQvisTyUs(SplashActivity splashActivity, SimCardRemovalState simCardRemovalState) {
        int i = 2 % 2;
        int i2 = component4 + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitLambda$checkCachedSimCardRemovalState$4 = splashActivity.lambda$checkCachedSimCardRemovalState$4(simCardRemovalState);
        int i4 = component4 + 99;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitLambda$checkCachedSimCardRemovalState$4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10296$r8$lambda$vgNDQo7OrFcapmXSLl_s6QFsTY(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = component4 + 27;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.onLogoAnimationEnd();
        if (i3 == 0) {
            throw null;
        }
        int i4 = copy + 41;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    public static void $r8$lambda$y90ZGsUr2H3fsxNVlOrC9e2KGOA(SplashActivity splashActivity, DeviceRestartState deviceRestartState) {
        int i = 2 % 2;
        int i2 = component4 + 107;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.lambda$observeDeviceRestartState$5(deviceRestartState);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$y9N1EkHwjoyEhFE8mxAORWw12d8(SplashActivity splashActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 63;
        copy = i3 % 128;
        int i4 = i3 % 2;
        splashActivity.lambda$securityCheck$11(dialogInterface, i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$zsiiFudt45Bbm0ATF5DgP5erEok(SplashActivity splashActivity, DeviceRestartState deviceRestartState) {
        int i = 2 % 2;
        int i2 = component4 + 27;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.lambda$checkCachedDeviceRestartState$0(deviceRestartState);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = component4 + 47;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    static CountDownTimer m10297$$Nest$fgetcountDownTimer(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        CountDownTimer countDownTimer = splashActivity.countDownTimer;
        if (i3 == 0) {
            return countDownTimer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static CountDownTimer m10298$$Nest$fgettimeoutTimer(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = component4 + 81;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        CountDownTimer countDownTimer = splashActivity.timeoutTimer;
        int i5 = i3 + 113;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return countDownTimer;
    }

    static void m10299$$Nest$mgoNext(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = copy + 123;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.goNext();
        int i4 = component4 + 119;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10300$$Nest$mhandQueryLoginType(SplashActivity splashActivity, LocalQueryLoginType localQueryLoginType) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.handQueryLoginType(localQueryLoginType);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
    }

    static void m10301$$Nest$minit(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = component4 + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.init();
        int i4 = component4 + 109;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10302$$Nest$mtoGuide(SplashActivity splashActivity) {
        int i = 2 % 2;
        int i2 = component4 + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        splashActivity.toGuide();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 61;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void m10303instrumented$0$showStartPageImg$V(SplashActivity splashActivity, OpenPageConfig openPageConfig, View view) {
        int i = 2 % 2;
        int i2 = copy + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                splashActivity.lambda$showStartPageImg$9(openPageConfig, view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            splashActivity.lambda$showStartPageImg$9(openPageConfig, view);
            Callback.onClick_exit();
            int i4 = copy + 67;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component4 + 37;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
    }
}
