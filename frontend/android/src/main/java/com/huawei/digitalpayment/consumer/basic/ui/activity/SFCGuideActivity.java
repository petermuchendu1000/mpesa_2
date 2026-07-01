package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.util.NetworkUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.base.ui.widget.ViewPager2Indicator;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivitySfcGuideBinding;
import com.huawei.digitalpayment.consumer.basic.ui.adapter.SFCViewPagerAdapter;
import com.huawei.digitalpayment.consumer.basic.ui.bean.GuideConfig;
import com.huawei.digitalpayment.consumer.basic.ui.dialog.SwitchMobileDataDialog;
import com.huawei.digitalpayment.consumer.basicUi.util.LaunchUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.QueryLoginTypeParams;
import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.LoginViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0003J\b\u0010\u0018\u001a\u00020\u000fH\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0016\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/activity/SFCGuideActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/basic/databinding/ActivitySfcGuideBinding;", "viewModel", "Lcom/huawei/digitalpayment/consumer/loginModule/login/viewmodel/LoginViewModel;", "queryNumberViewModel", "Lcom/huawei/digitalpayment/consumer/basic/ui/activity/HeaderEnrichmentViewModel;", "phoneNumber", "", "switchMobileDataDialog", "Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/SwitchMobileDataDialog;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setWindowInsets", "showSwitchMobileDataDialog", "title", "content", "type", "checkNetworkType", "onResume", "initView", "addObserver", "handleQueryLoginType", "resource", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalQueryLoginType;", "getGuideConfigs", "", "Lcom/huawei/digitalpayment/consumer/basic/ui/bean/GuideConfig;", "getLocalConfigs", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SFCGuideActivity extends Hilt_SFCGuideActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static boolean component1;
    private static char[] component2;
    private static int component3;
    private static boolean copydefault;
    private static char getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private ActivitySfcGuideBinding binding;
    private String phoneNumber;
    private HeaderEnrichmentViewModel queryNumberViewModel;
    private SwitchMobileDataDialog switchMobileDataDialog;
    private LoginViewModel viewModel;
    private static final byte[] $$d = {46, -95, Ascii.VT, -87};
    private static final int $$e = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;
    private static int component4 = 0;
    private static int copy = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private final Function1 copydefault;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            if (!(obj instanceof Observer) || (!(obj instanceof FunctionAdapter))) {
                zAreEqual = false;
            } else {
                int i2 = ShareDataUIState + 89;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    throw null;
                }
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i3 = ShareDataUIState + 67;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 79;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.copydefault;
            int i5 = i2 + 19;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 123;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 87;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                this.copydefault.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.copydefault.invoke(obj);
            int i3 = ShareDataUIState + 45;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 + 68
            byte[] r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + 1
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.$$f(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0103  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.onCreate(android.os.Bundle):void");
    }

    private static final WindowInsetsCompat setWindowInsets$lambda$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = copy + 23;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, 0, insets.right, insets.bottom);
        int i4 = component4 + 7;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    private final void setWindowInsets() {
        int i = 2 % 2;
        ActivitySfcGuideBinding activitySfcGuideBinding = this.binding;
        ActivitySfcGuideBinding activitySfcGuideBinding2 = null;
        if (activitySfcGuideBinding == null) {
            int i2 = component4 + 81;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = copy + 43;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
            activitySfcGuideBinding = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(activitySfcGuideBinding.getRoot(), new OnApplyWindowInsetsListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i6 = 2 % 2;
                int i7 = component1 + 99;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                WindowInsetsCompat windowInsetsCompat$r8$lambda$jl8yRbj5pQklvHD_VGVIWjGnJhI = SFCGuideActivity.$r8$lambda$jl8yRbj5pQklvHD_VGVIWjGnJhI(view, windowInsetsCompat);
                int i9 = component3 + 71;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                return windowInsetsCompat$r8$lambda$jl8yRbj5pQklvHD_VGVIWjGnJhI;
            }
        });
        ActivitySfcGuideBinding activitySfcGuideBinding3 = this.binding;
        if (activitySfcGuideBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            activitySfcGuideBinding2 = activitySfcGuideBinding3;
        }
        ViewCompat.requestApplyInsets(activitySfcGuideBinding2.getRoot());
        int i6 = component4 + 71;
        copy = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void c(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(i3) + 3760, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, (char) Color.green(i3), -1670574543, false, $$f(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 97;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 7140, 13 - View.resolveSize(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        if (copydefault) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Gravity.getAbsoluteGravity(0, 0), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 7645), -327556343, false, $$f(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component1) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $11 + 31;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i9 = $10 + 41;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 + 1) % cancelVar.component3] + i] >> iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, (char) (7644 - KeyEvent.normalizeMetaState(0)), -327556343, false, $$f(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 19, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 7644), -327556343, false, $$f(b8, b9, (byte) (b9 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr6);
        int i10 = $10 + 5;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 77 / 0;
            objArr[0] = str;
        }
    }

    private static final void showSwitchMobileDataDialog$lambda$1(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sFCGuideActivity, "");
        sFCGuideActivity.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        int i2 = copy + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void showSwitchMobileDataDialog$lambda$2(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sFCGuideActivity, "");
        sFCGuideActivity.checkNetworkType();
        int i4 = copy + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void showSwitchMobileDataDialog(String title, String content, String type) {
        SwitchMobileDataDialog switchMobileDataDialog;
        int i = 2 % 2;
        int i2 = copy + 109;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            SwitchMobileDataDialog switchMobileDataDialog2 = this.switchMobileDataDialog;
            if (switchMobileDataDialog2 == null) {
                SwitchMobileDataDialog switchMobileDataDialogBuilder = new SwitchMobileDataDialog.Builder().setTitle(title).setContent(content).setType(type).setRightClickListener(new View.OnClickListener() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public final void onClick(View view) {
                        int i4 = 2 % 2;
                        int i5 = ShareDataUIState + 79;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        SFCGuideActivity.m10286$r8$lambda$5ti20CCdHQgQyzYluynXebxV_I(this.f$0, view);
                        if (i6 == 0) {
                            throw null;
                        }
                    }
                }).setLeftClickListener(new View.OnClickListener() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void onClick(View view) {
                        int i4 = 2 % 2;
                        int i5 = copydefault + 87;
                        component3 = i5 % 128;
                        if (i5 % 2 != 0) {
                            SFCGuideActivity.$r8$lambda$Fqohaq8shxDmZ9e3bWEAWEnMnKU(this.f$0, view);
                            throw null;
                        }
                        SFCGuideActivity.$r8$lambda$Fqohaq8shxDmZ9e3bWEAWEnMnKU(this.f$0, view);
                        int i6 = component3 + 21;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }).builder();
                this.switchMobileDataDialog = switchMobileDataDialogBuilder;
                if (switchMobileDataDialogBuilder != null) {
                    switchMobileDataDialogBuilder.show(getSupportFragmentManager(), "switchMobileDataDialog");
                    return;
                }
                return;
            }
            if (switchMobileDataDialog2 != null) {
                int i4 = i3 + 11;
                copy = i4 % 128;
                int i5 = i4 % 2;
                if (switchMobileDataDialog2.isShowing || (switchMobileDataDialog = this.switchMobileDataDialog) == null) {
                    return;
                }
                int i6 = copy + 111;
                component4 = i6 % 128;
                int i7 = i6 % 2;
                switchMobileDataDialog.show(getSupportFragmentManager(), "switchMobileDataDialog");
                return;
            }
            return;
        }
        throw null;
    }

    private final void checkNetworkType() {
        int i = 2 % 2;
        int i2 = copy + 53;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (NetworkUtils.isConnected()) {
            if (!(!NetworkUtils.isWifiConnected())) {
                String string = getString(R.string.turn_off_wifi);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = getString(R.string.turn_mobile_data_tips);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                showSwitchMobileDataDialog(string, string2, "WIFI_CONNECTED");
                return;
            }
            HeaderEnrichmentViewModel headerEnrichmentViewModel = this.queryNumberViewModel;
            if (headerEnrichmentViewModel != null) {
                int i4 = copy + 69;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                headerEnrichmentViewModel.queryPhoneNumber(this);
                return;
            }
            return;
        }
        int i6 = component4 + 69;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            String string3 = getString(R.string.turn_mobile_data_on);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = getString(R.string.turn_mobile_data_tips_for_not_connected);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            showSwitchMobileDataDialog(string3, string4, "NOT_CONNECTED");
            return;
        }
        String string5 = getString(R.string.turn_mobile_data_on);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.turn_mobile_data_tips_for_not_connected);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        showSwitchMobileDataDialog(string5, string6, "NOT_CONNECTED");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = copy + 15;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            d(26 - Gravity.getAbsoluteGravity(0, 0), new char[]{'*', 27, '$', 20, '\n', '/', '#', '(', '*', 6, 4, '#', 15, '\n', 31, '+', 31, '0', 30, 29, '*', 18, 18, 29, 6, '0'}, (byte) (74 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 79, new char[]{'\t', '+', 13800, 13800, 28, 25, 31, 15, 13802, 13802, 3, '.', CharUtils.CR, '+', 31, '+', 7, JSONLexer.EOI}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = component4 + 99;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = copy + 3;
                component4 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6561, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55, (char) (Process.myTid() >> 22), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
        checkNetworkType();
        int i8 = component4 + 99;
        copy = i8 % 128;
        int i9 = i8 % 2;
    }

    private static void d(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 71;
                $11 = i7 % 128;
                int i8 = i7 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7423 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 14 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 64290), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 2;
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
        Object[] objArr3 = {Integer.valueOf(getAsAtTimestamp)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 7422, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, (char) (TextUtils.indexOf("", "", 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i9 = $11 + 59;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i11 = $11 + 55;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 + b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 >>> b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                    i3 = 2;
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - View.combineMeasuredStates(0, 0), 14 - View.resolveSizeAndState(0, 0, 0), (char) (44464 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 2944, 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27638), 794909189, false, $$f(b3, (byte) (b3 | TarHeader.LF_CHR), b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                            int i13 = $10 + 87;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                int i15 = $11 + 15;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i17];
                                cArr4[cancelall.component2 + 1] = cArr2[i18];
                            } else {
                                int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i19];
                                cArr4[cancelall.component2 + 1] = cArr2[i20];
                                int i21 = $10 + 95;
                                $11 = i21 % 128;
                                i3 = 2;
                                int i22 = i21 % 2;
                            }
                        }
                        i3 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += i3;
                obj2 = obj;
            }
        }
        int i23 = 0;
        while (i23 < i) {
            int i24 = $10 + 123;
            $11 = i24 % 128;
            if (i24 % 2 == 0) {
                cArr4[i23] = (char) (cArr4[i23] ^ 25837);
                i23 += 79;
            } else {
                cArr4[i23] = (char) (cArr4[i23] ^ 13722);
                i23++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private final void initView() {
        int i = 2 % 2;
        int i2 = component4 + 55;
        copy = i2 % 128;
        ActivitySfcGuideBinding activitySfcGuideBinding = null;
        if (i2 % 2 != 0) {
            ActivitySfcGuideBinding activitySfcGuideBinding2 = this.binding;
            if (activitySfcGuideBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activitySfcGuideBinding2 = null;
            }
            activitySfcGuideBinding2.viewpager.setAdapter(new SFCViewPagerAdapter(getGuideConfigs()));
            ActivitySfcGuideBinding activitySfcGuideBinding3 = this.binding;
            if (activitySfcGuideBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activitySfcGuideBinding3 = null;
            }
            ViewPager2Indicator viewPager2Indicator = activitySfcGuideBinding3.indicator;
            ActivitySfcGuideBinding activitySfcGuideBinding4 = this.binding;
            if (activitySfcGuideBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activitySfcGuideBinding4 = null;
            }
            viewPager2Indicator.attachToViewPager(activitySfcGuideBinding4.viewpager);
            ActivitySfcGuideBinding activitySfcGuideBinding5 = this.binding;
            if (activitySfcGuideBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = copy + 5;
                component4 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                activitySfcGuideBinding = activitySfcGuideBinding5;
            }
            activitySfcGuideBinding.lbStart.setOnClickListener(new View.OnClickListener() {
                private static int component3 = 1;
                private static int copydefault;

                @Override
                public final void onClick(View view) {
                    int i5 = 2 % 2;
                    int i6 = copydefault + 13;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    SFCGuideActivity.$r8$lambda$ABFvx90M6C24MWcwuYpTZVhG0qQ(this.f$0, view);
                    if (i7 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            return;
        }
        activitySfcGuideBinding.hashCode();
        throw null;
    }

    private static final void initView$lambda$3(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sFCGuideActivity, "");
        if (NetworkUtils.isConnected()) {
            int i4 = copy + 45;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            if (!NetworkUtils.isWifiConnected()) {
                String recentLoginPhone = sFCGuideActivity.phoneNumber;
                if (recentLoginPhone == null) {
                    recentLoginPhone = PhoneUtils.getRecentLoginPhone();
                }
                String str = recentLoginPhone;
                if (str == null || str.length() == 0) {
                    RouteUtils.routeWithExecute(RoutePathConstants.LOGIN);
                    sFCGuideActivity.finish();
                    return;
                }
                LoginViewModel loginViewModel = sFCGuideActivity.viewModel;
                if (loginViewModel == null) {
                    int i6 = component4 + 33;
                    copy = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    loginViewModel = null;
                }
                loginViewModel.queryLoginType(new QueryLoginTypeParams(recentLoginPhone));
                return;
            }
        }
        String string = sFCGuideActivity.getString(R.string.turn_off_wifi);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = sFCGuideActivity.getString(R.string.turn_mobile_data_tips);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        sFCGuideActivity.showSwitchMobileDataDialog(string, string2, "WIFI_CONNECTED");
    }

    private static final void addObserver$lambda$5$lambda$4(SFCGuideActivity sFCGuideActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sFCGuideActivity, "");
        LoginViewModel loginViewModel = sFCGuideActivity.viewModel;
        if (loginViewModel == null) {
            int i4 = copy + 121;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                int i6 = 54 / 0;
            }
            loginViewModel = null;
        }
        loginViewModel.cancelRequest();
        int i7 = copy + 73;
        component4 = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final Unit addObserver$lambda$5(final SFCGuideActivity sFCGuideActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sFCGuideActivity, "");
        Utils.showOrHideLoading(sFCGuideActivity, resource, new DialogInterface.OnCancelListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                int i2 = 2 % 2;
                int i3 = component1 + 125;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SFCGuideActivity.$r8$lambda$FP2w1BgV0tCrkDvcJwxl1WfrmE4(this.f$0, dialogInterface);
                int i5 = component3 + 67;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        LoginViewModel loginViewModel = null;
        String message = null;
        if (!resource.error()) {
            if (resource.success()) {
                int i2 = component4 + 121;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNull(resource);
                sFCGuideActivity.handleQueryLoginType(resource);
                LoginViewModel loginViewModel2 = sFCGuideActivity.viewModel;
                if (loginViewModel2 == null) {
                    int i4 = copy + 73;
                    component4 = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    loginViewModel = loginViewModel2;
                }
                loginViewModel.clearState();
            }
            return Unit.INSTANCE;
        }
        int i6 = component4 + 41;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            resource.getException();
            throw null;
        }
        BaseException exception = resource.getException();
        if (exception != null) {
            int i7 = component4 + 1;
            copy = i7 % 128;
            if (i7 % 2 == 0) {
                message = exception.getMessage();
                int i8 = 22 / 0;
            } else {
                message = exception.getMessage();
            }
        }
        if (Intrinsics.areEqual(message, "Failed to verify the blocklist and trustlist.")) {
            sFCGuideActivity.startActivity(new Intent(sFCGuideActivity, (Class<?>) LeaveBetaActivity.class));
            sFCGuideActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = component4 + 103;
        copy = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit addObserver$lambda$7(com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity r5, com.huawei.payment.mvvm.Resource r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            boolean r1 = r6.loading()
            if (r1 != 0) goto La1
            boolean r1 = r6.success()
            r1 = r1 ^ 1
            if (r1 == 0) goto L18
            goto La1
        L18:
            java.lang.Object r6 = r6.getData()
            if (r6 == 0) goto L6e
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = "getServiceResponse"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L6e
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = "getResponseBody"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L6e
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = "getResponse"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L6e
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = "getEncMsisdn"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L6e
            boolean r1 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L6e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L6e
            goto L6f
        L6e:
            r6 = 0
        L6f:
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Exception -> La1
            if (r1 == 0) goto La1
            int r2 = com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.copy
            int r2 = r2 + 29
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.component4 = r3
            int r2 = r2 % r0
            int r1 = r1.length()     // Catch: java.lang.Exception -> La1
            if (r1 != 0) goto L84
            goto La1
        L84:
            com.huawei.digitalpayment.consumer.basic.ui.activity.HeaderEnrichmentViewModel r5 = r5.queryNumberViewModel     // Catch: java.lang.Exception -> La1
            if (r5 == 0) goto La1
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.copy
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.component4 = r2
            int r1 = r1 % r0
            r5.decPhoneNumber(r6)     // Catch: java.lang.Exception -> La1
            int r5 = com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.copy
            int r5 = r5 + 73
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.component4 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto La1
            int r0 = r0 % 4
        La1:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.addObserver$lambda$7(com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void addObserver() {
        int i = 2 % 2;
        LoginViewModel loginViewModel = this.viewModel;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            loginViewModel = null;
        }
        SFCGuideActivity sFCGuideActivity = this;
        loginViewModel.getData().observe(sFCGuideActivity, new component2(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 17;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SFCGuideActivity sFCGuideActivity2 = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 != 0) {
                    return SFCGuideActivity.$r8$lambda$85uSw_HLo9gTeEsMMV534YdSraA(sFCGuideActivity2, resource);
                }
                SFCGuideActivity.$r8$lambda$85uSw_HLo9gTeEsMMV534YdSraA(sFCGuideActivity2, resource);
                throw null;
            }
        }));
        HeaderEnrichmentViewModel headerEnrichmentViewModel = this.queryNumberViewModel;
        if (headerEnrichmentViewModel != null) {
            int i2 = component4 + 99;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                LiveData<Resource<Object>> beanData = headerEnrichmentViewModel.getBeanData();
                if (beanData != null) {
                    beanData.observe(sFCGuideActivity, new component2(new Function1() {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        @Override
                        public final Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = copydefault + 71;
                            component3 = i4 % 128;
                            if (i4 % 2 != 0) {
                                SFCGuideActivity.$r8$lambda$lVnPGIGEWNZAWDS15cgz0eD48yA(this.f$0, (Resource) obj);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unit$r8$lambda$lVnPGIGEWNZAWDS15cgz0eD48yA = SFCGuideActivity.$r8$lambda$lVnPGIGEWNZAWDS15cgz0eD48yA(this.f$0, (Resource) obj);
                            int i5 = copydefault + 51;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
                            return unit$r8$lambda$lVnPGIGEWNZAWDS15cgz0eD48yA;
                        }
                    }));
                }
            } else {
                headerEnrichmentViewModel.getBeanData();
                throw null;
            }
        }
        HeaderEnrichmentViewModel headerEnrichmentViewModel2 = this.queryNumberViewModel;
        if (headerEnrichmentViewModel2 != null) {
            int i3 = copy + 51;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            LiveData<Resource<DesMsisdnResp>> decPhoneNumberData = headerEnrichmentViewModel2.getDecPhoneNumberData();
            if (decPhoneNumberData != null) {
                decPhoneNumberData.observe(sFCGuideActivity, new component2(new Function1() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        Unit unit$r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ;
                        int i5 = 2 % 2;
                        int i6 = ShareDataUIState + 107;
                        component1 = i6 % 128;
                        if (i6 % 2 == 0) {
                            unit$r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ = SFCGuideActivity.$r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ(this.f$0, (Resource) obj);
                            int i7 = 4 / 0;
                        } else {
                            unit$r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ = SFCGuideActivity.$r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ(this.f$0, (Resource) obj);
                        }
                        int i8 = component1 + 23;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        return unit$r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ;
                    }
                }));
            }
        }
    }

    private static final Unit addObserver$lambda$8(SFCGuideActivity sFCGuideActivity, Resource resource) {
        String decMsisdn;
        int i = 2 % 2;
        int i2 = copy + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sFCGuideActivity, "");
        if (!resource.loading() && resource.success()) {
            DesMsisdnResp desMsisdnResp = (DesMsisdnResp) resource.getData();
            if (desMsisdnResp != null) {
                int i4 = copy + 85;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                decMsisdn = desMsisdnResp.getDecMsisdn();
            } else {
                decMsisdn = null;
            }
            sFCGuideActivity.phoneNumber = decMsisdn;
        }
        return Unit.INSTANCE;
    }

    private final void handleQueryLoginType(Resource<LocalQueryLoginType> resource) {
        String responseCode;
        int i = 2 % 2;
        int i2 = component4 + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
        LocalQueryLoginType data = resource.getData();
        if (data != null) {
            int i4 = component4 + 17;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                responseCode = data.getResponseCode();
                int i5 = 25 / 0;
            } else {
                responseCode = data.getResponseCode();
            }
            int i6 = copy + 63;
            component4 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 5;
            }
        } else {
            responseCode = null;
        }
        if (Intrinsics.areEqual(responseCode, "60720011")) {
            startActivity(new Intent(this, (Class<?>) LeaveBetaActivity.class));
            finish();
        } else {
            LaunchUtils.updateIsShowGuide(false);
            RouteUtils.routeWithExecute(RoutePathConstants.LOGIN);
            finish();
        }
    }

    private final List<GuideConfig> getGuideConfigs() {
        int i = 2 % 2;
        int i2 = component4 + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        List<GuideConfig> localConfigs = getLocalConfigs();
        int i4 = copy + 73;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return localConfigs;
    }

    public final List<GuideConfig> getLocalConfigs() {
        int i = 2 % 2;
        int i2 = R.drawable.bg_onboarding_mpesa;
        int i3 = R.drawable.bg_onboarding_mpesa;
        int i4 = R.drawable.mpesa_title_text_img;
        String string = getString(R.string.guide_tips);
        Intrinsics.checkNotNullExpressionValue(string, "");
        GuideConfig guideConfig = new GuideConfig(i2, i3, i4, string, "", "");
        int i5 = R.drawable.bg_onboarding_safaricom;
        int i6 = R.drawable.bg_onboarding_safaricom;
        int i7 = R.drawable.safaricom_title_text_img;
        String string2 = getString(R.string.guide_tips);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(guideConfig, new GuideConfig(i5, i6, i7, string2, "", ""));
        int i8 = component4 + 3;
        copy = i8 % 128;
        int i9 = i8 % 2;
        return arrayListArrayListOf;
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 73, new char[]{'*', 27, '$', 20, '\n', '/', '#', '(', '*', 6, 4, '#', 15, '\n', 31, '+', 31, '0', 30, 29, '*', 18, 18, 29, 6, '0'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952721_res_0x7f130451).substring(6, 7).length() + 74), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{'\t', '+', 13800, 13800, 28, 25, 31, 15, 13802, 13802, 3, '.', CharUtils.CR, '+', 31, '+', 7, JSONLexer.EOI}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component4 + 17;
            copy = i2 % 128;
            int i3 = i2 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = component4 + 57;
                copy = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = component4 + 81;
            copy = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6561, 56 - View.resolveSizeAndState(0, 0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i7 = 17 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 6618, 42 - TextUtils.getCapsMode("", 0, 0), (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ExpandableListView.getPackedPositionType(0L), 56 - KeyEvent.keyCodeFromString(""), (char) TextUtils.indexOf("", "", 0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i8 = copy + 63;
        component4 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 43 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.SFCGuideActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10286$r8$lambda$5ti20CCdHQgQyzYluynXebxV_I(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10288x52e05fdd(sFCGuideActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = copy + 45;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Unit $r8$lambda$85uSw_HLo9gTeEsMMV534YdSraA(SFCGuideActivity sFCGuideActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 47;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return addObserver$lambda$5(sFCGuideActivity, resource);
        }
        addObserver$lambda$5(sFCGuideActivity, resource);
        throw null;
    }

    public static void $r8$lambda$ABFvx90M6C24MWcwuYpTZVhG0qQ(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 31;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10287instrumented$0$initView$V(sFCGuideActivity, view);
        int i4 = copy + 119;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public static void $r8$lambda$FP2w1BgV0tCrkDvcJwxl1WfrmE4(SFCGuideActivity sFCGuideActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = copy + 47;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        addObserver$lambda$5$lambda$4(sFCGuideActivity, dialogInterface);
        int i4 = component4 + 75;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    public static void $r8$lambda$Fqohaq8shxDmZ9e3bWEAWEnMnKU(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10289x9881a27c(sFCGuideActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WindowInsetsCompat $r8$lambda$jl8yRbj5pQklvHD_VGVIWjGnJhI(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = copy + 121;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsets$lambda$0 = setWindowInsets$lambda$0(view, windowInsetsCompat);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return windowInsets$lambda$0;
    }

    public static Unit $r8$lambda$lVnPGIGEWNZAWDS15cgz0eD48yA(SFCGuideActivity sFCGuideActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 97;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            addObserver$lambda$7(sFCGuideActivity, resource);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAddObserver$lambda$7 = addObserver$lambda$7(sFCGuideActivity, resource);
        int i3 = copy + 79;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return unitAddObserver$lambda$7;
    }

    public static Unit $r8$lambda$yl8QNCvNdOrMXIjUh0Tigc67zMQ(SFCGuideActivity sFCGuideActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 109;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAddObserver$lambda$8 = addObserver$lambda$8(sFCGuideActivity, resource);
        int i4 = component4 + 5;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return unitAddObserver$lambda$8;
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        int i = equals + 121;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    private static void m10287instrumented$0$initView$V(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$3(sFCGuideActivity, view);
                Callback.onClick_exit();
            } else {
                initView$lambda$3(sFCGuideActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10288x52e05fdd(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            showSwitchMobileDataDialog$lambda$1(sFCGuideActivity, view);
            Callback.onClick_exit();
            int i4 = component4 + 59;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10289x9881a27c(SFCGuideActivity sFCGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                showSwitchMobileDataDialog$lambda$2(sFCGuideActivity, view);
                Callback.onClick_exit();
                int i4 = 37 / 0;
            } else {
                showSwitchMobileDataDialog$lambda$2(sFCGuideActivity, view);
                Callback.onClick_exit();
            }
            int i5 = component4 + 55;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 107;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 67;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        ShareDataUIState = new char[]{30684, 30675, 30681, 30671, 30674, 30676, 30611, 30670, 30701, 30686, 30680, 30596, 30604, 30683, 30603, 30602, 30605, 30606, 30687, 30600, 30601, 30597, 30607};
        component3 = 321288125;
        component1 = true;
        copydefault = true;
        component2 = new char[]{2032, 2027, 1973, 1970, 2028, 2016, 1977, 1051, 2019, 1968, 1969, 1054, 2031, 1052, 2024, 2034, 1974, 1985, 1971, 2022, 1048, 2030, 2035, 1975, 2018, 2029, 1965, 1976, 2041, 2036, 1049, 1972, 2021, 1978, 2038, 2005, 1050, 2023, 2026, 1966, 2039, 2020, 1055, 1967, 2037, 2025, 2004, 2033, 2017};
        getAsAtTimestamp = (char) 12829;
    }
}
