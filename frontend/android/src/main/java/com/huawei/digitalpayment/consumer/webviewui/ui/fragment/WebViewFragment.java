package com.huawei.digitalpayment.consumer.webviewui.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.core.net.MailTo;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.google.android.gms.fido.fido2.api.common.zzar;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.common.interceptor.AppLogInterceptor;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.photo.GetPhotoUtils;
import com.huawei.common.photo.PhotoOptions;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.base.util.ThemeUtils;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.GrayscaleInterceptor;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils;
import com.huawei.digitalpayment.consumer.baselib.util.sign.SignUtils;
import com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.InteractionView;
import com.huawei.digitalpayment.consumer.webview.interaction.JsInteraction;
import com.huawei.digitalpayment.consumer.webview.util.ApiPermissionHelper;
import com.huawei.digitalpayment.consumer.webview.util.WebRtcHelper;
import com.huawei.digitalpayment.consumer.webview.util.WebViewUtils;
import com.huawei.digitalpayment.consumer.webviewui.R;
import com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding;
import com.huawei.secure.android.common.webview.SafeWebSettings;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import com.safaricom.mpesa.logging.L;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public class WebViewFragment extends BaseFragment implements InteractionView, BaseWebViewClient.OnReceivedErrorListener {
    private static final String component1 = "WebViewFragment";
    private static final String component2 = "accessToken";
    private static final String copydefault = "tradeType";
    private static short[] coroutineCreation;
    private FragmentActivity ShareDataUIState;
    public FragmentWebviewBinding binding;
    private String component3;
    private String component4;
    private String copy;
    private OnWebViewListener equals;
    private OnReceiverTitleListener getAsAtTimestamp;
    private JsInteraction getRequestBeneficiariesState;
    private final String[] hashCode = {"sms:", "tel:", "twitter:", "market:", MailTo.MAILTO_SCHEME};
    protected ValueCallback<Uri[]> mUploadCallbackAboveL;
    protected WebSettings settings;
    private String toString;
    public WebRtcHelper webRtcHelper;
    private static final byte[] $$c = {120, -46, -95, -23};
    private static final int $$d = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {65, -53, 110, -39, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49};
    private static final int $$b = 52;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
    private static int CoroutineDebuggingKt = 1;
    private static int getShareableDataState = 1982012853;
    private static int ArtificialStackFrames = -238323951;
    private static int getSponsorBeneficiariesState = -1831249547;
    private static byte[] coroutineBoundary = {90, -90, 81, 123, -124, 90, -93, 83, -88, 116, 119, -23, 86, 19, -104, -87, -88, -81, 92, -92, 95, 118, -118, 123, -122, -123, 114, -99, 96, 113, 124, -115, -127, 123, -119, -37, 34, -46, 41, -11, -10, 20, 42, -34, 38, -19, Ascii.RS, 56, -58, 36, -37, 47, -10, 1, 47, -56, -61, Ascii.NAK, -33, -47, 47, -36, -45, -37, 33, 41, 41, 41, 41};

    public interface OnReceiverTitleListener {
        void cleanTitle();

        void onReceivedTitle(String str);
    }

    public interface OnWebViewListener {
        void onProgressChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, short r6, byte r7) {
        /*
            int r5 = 116 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.$$c
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r6 = r6 + 1
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.$$e(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.$$a
            int r5 = r5 * 5
            int r5 = r5 + 4
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r0[r5]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-16)
            int r5 = r5 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.a(byte, int, short, java.lang.Object[]):void");
    }

    public static Object copydefault(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = (~i) | i7;
        int i12 = i10 | (~(i11 | i2));
        int i13 = (~(i | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i4));
        int i15 = i4 + i2 + i6 + (783392123 * i3) + ((-786872706) * i5);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i4) + 1729888256 + (218870266 * i2) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i6) + ((-1731985408) * i3) + ((-471334912) * i5) + ((-600899584) * i16);
        int i18 = (i4 * 375823119) + 1642083618 + (i2 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i6 * 375824245) + (i3 * (-117547465)) + (i5 * 763984278) + (i16 * (-763691008));
        return i17 + ((i18 * i18) * 1830354944) != 1 ? component2(objArr) : component1(objArr);
    }

    public void setOnReceiverTitleListener(OnReceiverTitleListener onReceiverTitleListener) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 17;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        this.getAsAtTimestamp = onReceiverTitleListener;
        int i5 = i3 + 105;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setOnWebViewListener(OnWebViewListener onWebViewListener) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 99;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        this.equals = onWebViewListener;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 115;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        this.ShareDataUIState = (FragmentActivity) context;
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 5;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public FragmentActivity getHostActivity() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 97;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity fragmentActivity = this.ShareDataUIState;
        int i5 = i2 + 79;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return fragmentActivity;
    }

    @Override
    public WebView getWebView() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 113;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        SafeWebView safeWebView = this.binding.webview;
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 117;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return safeWebView;
    }

    @Override
    public boolean checkPermission(String str) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 21;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        boolean zHasPermission = ApiPermissionHelper.INSTANCE.hasPermission(URI.create(this.component4).getHost(), str);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 81;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
        return zHasPermission;
    }

    @Override
    public void evaluateJavascript(final String str, final ValueCallback<String> valueCallback) {
        int i = 2 % 2;
        final WebView webView = getWebView();
        webView.post(new Runnable() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = copydefault + 21;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                WebViewFragment.component1(webView, str, valueCallback);
                int i5 = copydefault + 23;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 73;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void component1(WebView webView, String str, ValueCallback valueCallback) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 79;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        webView.evaluateJavascript(str, valueCallback);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 71;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    public static WebViewFragment newInstance(String str, String str2, String str3) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString(RouteUtils.SCHEME_EXECUTE_KEY, str);
        bundle.putString(component2, str2);
        bundle.putString("tradeType", str3);
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.setArguments(bundle);
        int i2 = CoroutineDebuggingKt + 11;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return webViewFragment;
        }
        throw null;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 31;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        FragmentWebviewBinding fragmentWebviewBinding = i2 % 2 != 0 ? (FragmentWebviewBinding) DataBindingUtil.inflate(getLayoutInflater(layoutInflater), R.layout.fragment_webview, viewGroup, false) : (FragmentWebviewBinding) DataBindingUtil.inflate(getLayoutInflater(layoutInflater), R.layout.fragment_webview, viewGroup, false);
        this.binding = fragmentWebviewBinding;
        View root = fragmentWebviewBinding.getRoot();
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 79;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 29;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            super.onViewCreated(view, bundle);
            super.onCreate(bundle);
            if (getArguments() != null) {
                this.copy = getArguments().getString(RouteUtils.SCHEME_EXECUTE_KEY);
                this.component3 = getArguments().getString(component2);
                this.toString = getArguments().getString("tradeType");
                int i3 = CoroutineDebuggingKt + 41;
                getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
                int i4 = i3 % 2;
            }
            initView();
            this.webRtcHelper = new WebRtcHelper(requireActivity());
            return;
        }
        super.onViewCreated(view, bundle);
        super.onCreate(bundle);
        getArguments();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void initView() throws Throwable {
        int i = 2 % 2;
        this.binding.progressBar.setProgressTintList(ColorStateList.valueOf(ColorUtils.getColor(R.color.progressbar)));
        SafeWebSettings.initWebviewAndSettings(this.binding.webview);
        component2();
        copydefault();
        L.INSTANCE.d("======mUrl======" + this.copy, new Object[0]);
        this.component4 = getUrl();
        L.INSTANCE.d("======url======" + this.component4, new Object[0]);
        this.binding.webview.loadUrl(this.component4);
        clearCookies();
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 91;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    private static void b(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ArtificialStackFrames)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 3;
                byte b4 = (byte) (b3 - 4);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 998, 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 61686), 1874745193, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $11;
                int i10 = i9 + 55;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr = coroutineBoundary;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = i9 + 85;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = $11 + 53;
                        $10 = i15 % 128;
                        if (i15 % i5 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = (byte) (b5 - 1);
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getLongPressTimeout() >> 16), 48 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54462), -1178636483, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i14] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i14])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 - 1);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 2984, (ViewConfiguration.getWindowTouchSlop() >> 8) + 48, (char) (54462 - Gravity.getAbsoluteGravity(0, 0)), -1178636483, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i14] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i14++;
                        }
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i16 = $10 + 1;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    byte[] bArr3 = coroutineBoundary;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(getShareableDataState)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 3;
                        byte b10 = (byte) (b9 - 4);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 998, (-16777185) - Color.rgb(0, 0, 0), (char) (Color.blue(0) + 61685), 1874745193, false, $$e(b9, b10, (byte) (b10 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ArtificialStackFrames) ^ 7083766810336261929L)));
                    int i18 = $11 + 21;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) coroutineCreation[i + ((int) (((long) getShareableDataState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ArtificialStackFrames) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) getShareableDataState) ^ j)) + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(getSponsorBeneficiariesState), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int i20 = 1698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 38;
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    byte length2 = (byte) $$c.length;
                    byte b11 = (byte) (length2 - 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i20, packedPositionChild, gidForName, -1454191902, false, $$e(length2, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = coroutineBoundary;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i21 = 0; i21 < length3; i21++) {
                        bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        int i22 = $10 + 97;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr6 = coroutineBoundary;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = coroutineCreation;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private void copydefault() {
        int i;
        int i2 = 2 % 2;
        this.binding.webview.setBackgroundColor(0);
        this.binding.webview.setHorizontalScrollBarEnabled(false);
        this.binding.webview.setWebViewClient(((ICommonService) RouteUtils.getService(ICommonService.class)).getWebViewClient(this.hashCode, this));
        this.binding.webview.setWebChromeClient(getWebChromeClient());
        this.getRequestBeneficiariesState = new JsInteraction(this);
        this.binding.webview.addJavascriptInterface(this.getRequestBeneficiariesState, WebViewConstants.CONSUMER_APP);
        WebSettings settings = this.binding.webview.getSettings();
        boolean zIsDarkModeEnabled = ThemeUtils.INSTANCE.isDarkModeEnabled();
        if (Build.VERSION.SDK_INT >= 33) {
            int i3 = CoroutineDebuggingKt + 27;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
            int i4 = i3 % 2;
            settings.setAlgorithmicDarkeningAllowed(zIsDarkModeEnabled);
        } else if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
            if (!(!zIsDarkModeEnabled)) {
                i = 2;
            } else {
                int i5 = CoroutineDebuggingKt + 37;
                getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 4;
                }
                i = 0;
            }
            WebSettingsCompat.setForceDark(settings, i);
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            int i7 = getARTIFICIAL_FRAME_PACKAGE_NAME + 65;
            CoroutineDebuggingKt = i7 % 128;
            if (i7 % 2 == 0) {
                WebSettingsCompat.setForceDarkStrategy(settings, 1);
            } else {
                WebSettingsCompat.setForceDarkStrategy(settings, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v74, types: [boolean, int] */
    private void component2() throws Throwable {
        Object[] objArrComponent3$16dd2b22;
        int i;
        int i2 = 2 % 2;
        WebSettings settings = this.binding.webview.getSettings();
        this.settings = settings;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
        if (objCopydefault == null) {
            int packedPositionChild = 2404 - ExpandableListView.getPackedPositionChild(0L);
            int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
            char cIndexOf = (char) TextUtils.indexOf("", "");
            byte b2 = $$a[28];
            byte b3 = (byte) (b2 - 1);
            Object[] objArr = new Object[1];
            a(b3, b3, b2, objArr);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, threadPriority, cIndexOf, 1926552790, false, (String) objArr[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr2 = new Object[1];
        b((short) View.getDefaultSize(0, 0), (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 123), 2014811492 + (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-34) - KeyEvent.getDeadChar(0, 0), (-1662135803) + (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 90), 2014811512 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 41, (-1662135799) - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
        if (objCopydefault2 == null) {
            int iResolveSize = View.resolveSize(0, 0) + 2405;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
            char cBlue = (char) Color.blue(0);
            byte[] bArr = $$a;
            byte b4 = (byte) (bArr[17] - 1);
            byte b5 = bArr[28];
            Object[] objArr4 = new Object[1];
            a(b4, b5, (byte) (b5 + 5), objArr4);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iIndexOf, cBlue, 246010334, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault3 == null) {
                byte b6 = (byte) (-$$a[7]);
                byte b7 = (byte) (b6 - 5);
                Object[] objArr5 = new Object[1];
                a(b6, b7, b7, objArr5);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 2405, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 21921080, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objCopydefault3).get(null);
            objArrComponent3$16dd2b22 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i3 = (int) Runtime.getRuntime().totalMemory();
            int i4 = 920800247 + (((-71459371) | i3) * 614);
            int i5 = ~i3;
            int i6 = i4 + (((~((-798037064) | i5)) | 730928197 | (~((-735278702) | i5))) * (-1228)) + (((~(i5 | (-4350505))) | (~((-67108867) | i5))) * 614) + 1653204714;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrComponent3$16dd2b22[1])[0] = i8 ^ (i8 << 5);
            i = 2;
        } else {
            Object[] objArr7 = new Object[1];
            b((short) View.resolveSize(0, 0), (byte) ((-6) - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2014811527, (-40) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1662135794, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            b((short) Color.argb(0, 0, 0, 0), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 13), 2014811542 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "") - 40, (-1662135795) - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {2127421506};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2393, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, (char) (TextUtils.indexOf("", "", 0, 0) + 30139), 1140467866, false, null, new Class[]{Integer.TYPE});
                }
                objArrComponent3$16dd2b22 = zzar.component3$16dd2b22(iIntValue, 0, ((Constructor) objCopydefault4).newInstance(objArr9), 1653204714, false, false);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault5 == null) {
                    int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2404;
                    int iBlue = Color.blue(0) + 26;
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b8 = (byte) (-$$a[7]);
                    byte b9 = (byte) (b8 - 5);
                    Object[] objArr10 = new Object[1];
                    a(b8, b9, b9, objArr10);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9, iBlue, pressedStateDuration, 21921080, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault5).set(null, objArrComponent3$16dd2b22);
                try {
                    Object[] objArr11 = new Object[1];
                    b((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (122 - ImageFormat.getBitsPerPixel(0)), 2014811492 - (ViewConfiguration.getScrollBarSize() >> 8), (-34) - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) - 1662135802, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 89), 2014811513 - TextUtils.getTrimmedLength(""), (-41) - TextUtils.getOffsetAfter("", 0), (Process.myTid() >> 22) - 1662135799, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                    if (objCopydefault6 == null) {
                        byte b10 = (byte) (r15[17] - 1);
                        byte b11 = $$a[28];
                        Object[] objArr13 = new Object[1];
                        a(b10, b11, (byte) (b11 + 5), objArr13);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2405, AndroidCharacter.getMirror('0') - 22, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 246010334, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                    if (objCopydefault7 == null) {
                        int scrollDefaultDelay = 2405 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16777242;
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        byte b12 = $$a[28];
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr14 = new Object[1];
                        a(b13, b13, b12, objArr14);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iRgb, cCombineMeasuredStates, 1926552790, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i10 = getARTIFICIAL_FRAME_PACKAGE_NAME + 85;
                    CoroutineDebuggingKt = i10 % 128;
                    i = 2;
                    int i11 = i10 % 2;
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
        int i12 = ((int[]) objArrComponent3$16dd2b22[0])[0];
        int i13 = ((int[]) objArrComponent3$16dd2b22[i])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrComponent3$16dd2b22[3];
            if (strArr != null) {
                int i14 = getARTIFICIAL_FRAME_PACKAGE_NAME + 69;
                CoroutineDebuggingKt = i14 % 128;
                int i15 = i14 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 2) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), 42 - KeyEvent.normalizeMetaState(0), (char) (Color.rgb(0, 0, 0) + 16777216), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
            Object[] objArr15 = {2127421506, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6563, Drawable.resolveOpacity(0, 0) + 56, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault9).invoke(objInvoke, objArr15);
            int i16 = ((int[]) objArrComponent3$16dd2b22[1])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrComponent3$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrComponent3$16dd2b22[2])[0]}, (String[]) objArrComponent3$16dd2b22[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i17 = i16 + 2137300427 + (((~((~startUptimeMillis) | 800977901)) | 272760834) * 446) + (((~(startUptimeMillis | 1073738735)) | 590975429) * 446) + 1392247676;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr16[1])[0] = i19 ^ (i19 << 5);
            throw null;
        }
        int i20 = CoroutineDebuggingKt + 45;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i20 % 128;
        int i21 = i20 % i;
        Object[] objArr17 = new Object[4];
        objArr17[0] = new int[]{i};
        objArr17[1] = new int[1];
        objArr17[i] = new int[]{i};
        int i22 = ((int[]) objArrComponent3$16dd2b22[1])[0];
        int i23 = ((int[]) objArrComponent3$16dd2b22[i])[0];
        int i24 = ((int[]) objArrComponent3$16dd2b22[0])[0];
        objArr17[3] = (String[]) objArrComponent3$16dd2b22[3];
        int i25 = ~System.identityHashCode(this);
        int i26 = i22 + (-365240551) + (((~(i25 | 87674366)) | 4468736) * (-160)) + (((~(i25 | 24916004)) | 87674366) * 160);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr17[1])[0] = i28 ^ (i28 << 5);
        int i29 = ((int[]) objArr17[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr17[0])[0]}, new int[1], new int[]{((int[]) objArr17[2])[0]}, (String[]) objArr17[3]};
        int iMyPid = Process.myPid();
        int i30 = ~iMyPid;
        int i31 = (~((-112437228) | i30)) | 45220353;
        int i32 = ~(iMyPid | 116895739);
        int i33 = i29 + (-312584322) + ((i31 | i32) * (-713)) + (i32 * 1426) + ((~(49678865 | i30)) * 713);
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr18[1])[0] = i35 ^ (i35 << 5);
        settings.setJavaScriptEnabled(true);
        this.settings.setMediaPlaybackRequiresUserGesture(false);
        this.settings.setLoadWithOverviewMode(true);
        this.settings.setSaveFormData(true);
        this.settings.setSupportZoom(true);
        this.settings.setBuiltInZoomControls(false);
        this.settings.setDatabaseEnabled(false);
        this.settings.setAllowFileAccessFromFileURLs(false);
        WebSettings webSettings = this.settings;
        int i36 = ((int[]) objArr18[1])[0];
        int i37 = i36 * i36;
        int i38 = -(50859017 * i36);
        int i39 = (i37 & i38) + (i37 | i38);
        int i40 = -(i36 * 1140929137);
        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
        int i42 = (i41 & 1207227529) + (1207227529 | i41);
        int i43 = ((i42 >> 27) - 63) / 32;
        int i44 = (i43 ^ 1) + ((i43 & 1) << 1);
        int i45 = (i42 & i44) + (i44 | i42);
        int i46 = i42 >> 21;
        int i47 = -(i45 ^ ((((i46 ^ (-4095)) + ((i46 & (-4095)) << 1)) / 2048) - (-1)));
        int i48 = (i47 & 9) + (i47 | 9);
        int i49 = ((i48 >> 25) - 255) / 128;
        webSettings.setAllowUniversalAccessFromFileURLs(0 / ((i48 & (-((((i49 | 1) << 1) - (i49 ^ 1)) - (-1)))) * 190));
        this.settings.setCacheMode(-1);
        this.settings.setBlockNetworkImage(false);
        this.settings.setDomStorageEnabled(true);
        this.settings.setDefaultFontSize(16);
        this.settings.setMinimumFontSize(12);
        this.settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.binding.webview.setLayerType(2, null);
        this.settings.setTextZoom(100);
        this.settings.setUseWideViewPort(true);
        this.settings.setPluginState(WebSettings.PluginState.ON);
        this.settings.setLoadsImagesAutomatically(true);
        this.settings.setSupportMultipleWindows(false);
        this.settings.setNeedInitialFocus(true);
        this.settings.setDefaultTextEncodingName("utf-8");
        this.settings.setGeolocationEnabled(true);
        this.settings.setAllowContentAccess(false);
        this.settings.setGeolocationDatabasePath(requireActivity().getApplicationContext().getDir("database", 0).getPath());
    }

    protected String getUrl() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("platform", EventMetricsAggregator.TECHNOLOGY_TYPE);
        map.put("language", LanguageUtils.getInstance().getCurrentLang());
        map.put("version", AppInfoUtils.getVersionName());
        map.put("apkSign", SignUtils.getSign());
        map.put("deviceId", AppInfoUtils.getAndroidID());
        if (!TextUtils.isEmpty(this.component3) && ((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
            CoroutineDebuggingKt = i2 % 128;
            int i3 = i2 % 2;
            map.put("token", this.component3);
            int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 3;
            CoroutineDebuggingKt = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!TextUtils.isEmpty(this.toString)) {
            int i6 = CoroutineDebuggingKt + 103;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            int i7 = i6 % 2;
            map.put("tradeType", this.toString);
        }
        map.put("app", AppInfoUtils.getAppType());
        map.put(AppLogInterceptor.MESSAGE_ID, UUID.randomUUID().toString());
        map.put("timestamp", System.currentTimeMillis() + "");
        map.put("X-Gray-User", String.valueOf(GrayscaleInterceptor.getxGrayUser()));
        return WebViewUtils.getAppendUrl(this.copy, map);
    }

    protected WebChromeClient getWebChromeClient() {
        int i = 2 % 2;
        WebChromeClient webChromeClient = new WebChromeClient() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onReceivedTitle(WebView webView, String str) {
                int i2 = 2 % 2;
                super.onReceivedTitle(webView, str);
                if (WebViewFragment.ShareDataUIState(WebViewFragment.this) != null) {
                    int i3 = copydefault + 19;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        WebViewFragment.ShareDataUIState(WebViewFragment.this).onReceivedTitle(str);
                        throw null;
                    }
                    WebViewFragment.ShareDataUIState(WebViewFragment.this).onReceivedTitle(str);
                }
                int i4 = copydefault + 51;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onProgressChanged(android.webkit.WebView r6, int r7) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    super.onProgressChanged(r6, r7)
                    com.safaricom.mpesa.logging.L r6 = com.safaricom.mpesa.logging.L.INSTANCE
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "onProgressChanged: "
                    r1.<init>(r2)
                    r1.append(r7)
                    java.lang.String r1 = r1.toString()
                    r2 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    java.lang.String r4 = "WebViewFragment"
                    r6.d(r4, r1, r3)
                    r6 = 100
                    if (r7 != r6) goto L92
                    int r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.copydefault
                    int r6 = r6 + 67
                    int r7 = r6 % 128
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.component3 = r7
                    int r6 = r6 % r0
                    if (r6 == 0) goto L3c
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    com.huawei.secure.android.common.webview.SafeWebView r6 = r6.webview
                    int r6 = r6.getVisibility()
                    int r7 = r2 / r2
                    if (r6 == 0) goto L86
                    goto L48
                L3c:
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    com.huawei.secure.android.common.webview.SafeWebView r6 = r6.webview
                    int r6 = r6.getVisibility()
                    if (r6 == 0) goto L86
                L48:
                    int r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.component3
                    int r6 = r6 + 5
                    int r7 = r6 % 128
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.copydefault = r7
                    int r6 = r6 % r0
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    com.huawei.secure.android.common.webview.SafeWebView r6 = r6.webview
                    r7 = 0
                    r6.setAlpha(r7)
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    com.huawei.secure.android.common.webview.SafeWebView r6 = r6.webview
                    r6.setVisibility(r2)
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    com.huawei.secure.android.common.webview.SafeWebView r6 = r6.webview
                    android.view.ViewPropertyAnimator r6 = r6.animate()
                    r7 = 1065353216(0x3f800000, float:1.0)
                    android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
                    r1 = 300(0x12c, double:1.48E-321)
                    android.view.ViewPropertyAnimator r6 = r6.setDuration(r1)
                    r6.start()
                    int r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.component3
                    int r6 = r6 + 103
                    int r7 = r6 % 128
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.copydefault = r7
                    int r6 = r6 % r0
                L86:
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    android.widget.ProgressBar r6 = r6.progressBar
                    r7 = 8
                    r6.setVisibility(r7)
                    goto La4
                L92:
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    android.widget.ProgressBar r6 = r6.progressBar
                    r6.setVisibility(r2)
                    com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment r6 = com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.this
                    com.huawei.digitalpayment.consumer.webviewui.databinding.FragmentWebviewBinding r6 = r6.binding
                    android.widget.ProgressBar r6 = r6.progressBar
                    r6.setProgress(r7)
                La4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment.AnonymousClass5.onProgressChanged(android.webkit.WebView, int):void");
            }

            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                WebViewFragment.this.mUploadCallbackAboveL = valueCallback;
                Object[] objArr = {WebViewFragment.this};
                WebViewFragment.copydefault(SingleObserveOn.copydefault.copydefault(), 255151298, objArr, SingleObserveOn.copydefault.copydefault(), -255151298, SingleObserveOn.copydefault.copydefault(), SingleObserveOn.copydefault.copydefault());
                int i5 = component3 + 13;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            @Override
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                int i2 = 2 % 2;
                int i3 = component3 + 33;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                WebViewFragment.this.webRtcHelper.onWebViewPermissionRequest(permissionRequest);
                int i5 = component3 + 23;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                int i2 = 2 % 2;
                int i3 = component3 + 111;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                WebViewFragment.component1(WebViewFragment.this, str, callback);
                if (i4 == 0) {
                    int i5 = 72 / 0;
                }
            }
        };
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 113;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 != 0) {
            return webChromeClient;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component2(final String str, final GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        PermissionUtils.permission("android.permission.ACCESS_FINE_LOCATION").callback(new PermissionUtils.FullCallback(this) {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onGranted(List<String> list) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                callback.invoke(str, true, false);
                int i5 = copydefault + 99;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onDenied(List<String> list, List<String> list2) {
                int i2 = 2 % 2;
                int i3 = component1 + 43;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    callback.invoke(str, true, true);
                } else {
                    callback.invoke(str, false, true);
                }
            }
        }).request();
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 17;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
    }

    private static Object component1(Object[] objArr) {
        WebViewFragment webViewFragment = (WebViewFragment) objArr[0];
        int i = 2 % 2;
        ApiCallback<Uri> apiCallback = new ApiCallback<Uri>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Uri uri) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(uri);
                int i5 = component2 + 5;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component2(Uri uri) {
                int i2 = 2 % 2;
                Uri[] uriArr = new Uri[1];
                if (uri != null) {
                    int i3 = component2 + 73;
                    int i4 = i3 % 128;
                    component3 = i4;
                    int i5 = i3 % 2;
                    uriArr[0] = uri;
                    int i6 = i4 + 13;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                }
                if (WebViewFragment.this.mUploadCallbackAboveL != null) {
                    WebViewFragment.this.mUploadCallbackAboveL.onReceiveValue(uriArr);
                    WebViewFragment.this.mUploadCallbackAboveL = null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    if (WebViewFragment.this.mUploadCallbackAboveL != null) {
                        WebViewFragment.this.mUploadCallbackAboveL.onReceiveValue(null);
                        WebViewFragment.this.mUploadCallbackAboveL = null;
                        int i4 = component3 + 53;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    ToastUtils.showShort(baseException.getResponseDesc());
                    if (baseException.getCode() == 5) {
                        AppUtils.launchAppDetailsSettings();
                        return;
                    }
                    return;
                }
                ValueCallback<Uri[]> valueCallback = WebViewFragment.this.mUploadCallbackAboveL;
                obj.hashCode();
                throw null;
            }
        };
        GetPhotoUtils.choosePhoto(webViewFragment.ShareDataUIState, new PhotoOptions.Builder().setOutputX(400).setOutputY(400).setCrop(false).build(), apiCallback);
        int i2 = CoroutineDebuggingKt + 55;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return null;
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = CoroutineDebuggingKt + 31;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        this.getRequestBeneficiariesState.onActivityResult(i, i2, intent);
        int i6 = getARTIFICIAL_FRAME_PACKAGE_NAME + 111;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
    }

    public void clearCookies() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 47;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            CookieManager.getInstance().removeAllCookies(null);
            throw null;
        }
        CookieManager.getInstance().removeAllCookies(null);
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 7;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
    }

    public void callJs(final String str, final String str2) {
        int i = 2 % 2;
        this.binding.webview.evaluateJavascript(String.format("javascript:%s('%s');", str, str2), new ValueCallback() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onReceiveValue(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 105;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                WebViewFragment.component3(str, str2, (String) obj);
                int i5 = component1 + 37;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = CoroutineDebuggingKt + 113;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void component3(String str, String str2, String str3) {
        int i = 2 % 2;
        L.INSTANCE.d("JavascriptFunction", str + ConstantsKt.COMMA_SEPARATOR + str2, new Object[0]);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 111;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void callJs(final String str, final String str2, final String str3) {
        int i = 2 % 2;
        this.binding.webview.evaluateJavascript(String.format("javascript:%s('%s','%s');", str, str2, str3), new ValueCallback() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onReceiveValue(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    WebViewFragment.component2(str, str2, str3, (String) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                WebViewFragment.component2(str, str2, str3, (String) obj);
                int i4 = component2 + 123;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = CoroutineDebuggingKt + 77;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        L.INSTANCE.d("JavascriptFunction", str + ConstantsKt.COMMA_SEPARATOR + str2 + "===" + str3, new Object[0]);
        int i2 = CoroutineDebuggingKt + 115;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 119;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        if (webResourceRequest != null) {
            L.INSTANCE.d(component1, "shouldOverrideUrlLoading: " + webResourceRequest.getUrl().toString(), new Object[0]);
            this.component4 = webResourceRequest.getUrl().toString();
        }
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 7;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onPause() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 75;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            super.onPause();
            this.binding.webview.onPause();
            int i3 = 70 / 0;
        } else {
            super.onPause();
            this.binding.webview.onPause();
        }
    }

    @Override
    public void onDetach() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 107;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        super.onDetach();
        this.getRequestBeneficiariesState.onDestroy();
        int i4 = CoroutineDebuggingKt + 49;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStop() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 107;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.getRequestBeneficiariesState.onStop();
        int i4 = CoroutineDebuggingKt + 81;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 109;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.getRequestBeneficiariesState.onStart();
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 85;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        this.binding.webview.onResume();
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 15;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
    }

    static OnReceiverTitleListener ShareDataUIState(WebViewFragment webViewFragment) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 81;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        OnReceiverTitleListener onReceiverTitleListener = webViewFragment.getAsAtTimestamp;
        int i5 = i3 + 51;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 != 0) {
            return onReceiverTitleListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1(WebViewFragment webViewFragment, String str, GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        webViewFragment.component2(str, callback);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 23;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ShareDataUIState() {
        copydefault(SingleObserveOn.copydefault.copydefault(), 565355539, new Object[]{this}, SingleObserveOn.copydefault.copydefault(), -565355538, SingleObserveOn.copydefault.copydefault(), SingleObserveOn.copydefault.copydefault());
    }

    @Override
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 71;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    @Override
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 79;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
    }

    private static Object component2(Object[] objArr) {
        WebViewFragment webViewFragment = (WebViewFragment) objArr[0];
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 5;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {webViewFragment};
        int iCopydefault = SingleObserveOn.copydefault.copydefault();
        int iCopydefault2 = SingleObserveOn.copydefault.copydefault();
        int iCopydefault3 = SingleObserveOn.copydefault.copydefault();
        int iCopydefault4 = SingleObserveOn.copydefault.copydefault();
        if (i3 != 0) {
            copydefault(iCopydefault, 565355539, objArr2, iCopydefault3, -565355538, iCopydefault4, iCopydefault2);
            obj.hashCode();
            throw null;
        }
        copydefault(iCopydefault, 565355539, objArr2, iCopydefault3, -565355538, iCopydefault4, iCopydefault2);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 19;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
