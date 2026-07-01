package com.huawei.digitalpayment.consumer.register.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.beehive.lottie.player.LottieParams;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.util.LoadUtils;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterKycBinding;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterVerifyViewModel;
import com.huawei.digitalpayment.consumer.register.ui.bean.Relationship;
import com.huawei.digitalpayment.consumer.register.ui.bean.RelationshipItem;
import com.huawei.digitalpayment.customer.dynamics.DynamicsElementDateView;
import com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00122\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u001a\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020#H\u0002J\u001a\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\u0012\u0010.\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010#H\u0002J \u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010#H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/register/ui/activity/SfcRegisterKycActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/login/databinding/ActivitySfcRegisterKycBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/viewmodel/RegisterVerifyViewModel;", "<init>", "()V", "dynamicsViews", "", "Lcom/huawei/digitalpayment/customer/dynamics/base/BaseDynamicsView;", "otpRegisterResp", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/OtpRegisterResp;", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, "", KeysConstants.KEY_ASYNC_REGISTER_TAG, "relatedViews", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initDynamics", "addDynamicsElements", "elements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "needFixTopMarginAndPadding", "pre", "current", "handleDynamicsViewRelationship", "dynamicsView", LottieParams.KEY_ELEMENT_ID, "isRelationshipValid", "expr", "", "onBirthdayChanged", "value", "getRelatedViewVisibility", "relationship", "Lcom/huawei/digitalpayment/consumer/register/ui/bean/Relationship;", "age", "calculateAge", "birthday", "onConfirmClick", "addObserver", "toRegisterResult", "des", "getConvertElements", "toSetPin", "registerParams", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/RegisterParams;", "initToolbar", "title", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcRegisterKycActivity extends Hilt_SfcRegisterKycActivity<ActivitySfcRegisterKycBinding, RegisterVerifyViewModel> {
    public static final int $stable = 8;
    private static char[] component1;
    private static char[] component3;
    private static long copydefault;
    private static int getAsAtTimestamp;
    private boolean asyncRegisterTag;
    private boolean oneStepRegisterTag;
    private OtpRegisterResp otpRegisterResp;
    private static final byte[] $$l = {104, -2, Ascii.CAN, -74};
    private static final int $$o = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Base64.padSymbol, -49, -70, 93, -19, 9, -15, Ascii.SI, 35, -27, -17, Ascii.NAK, Ascii.SO, Ascii.SO, -8, -31, Ascii.NAK, -17, 17, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 67, -10, 4, 65, PSSSigner.TRAILER_IMPLICIT, 20, -17, 8, 3, 1, 4, 0, 67, -70, Ascii.SI, 6, -16, 9, 17, -4, 4, -11, Ascii.DLE, -9, -3, 3, Ascii.FF, -3, Ascii.FF, -3, 8, 4, -17, 7, -1, 70, -34, TarHeader.LF_NORMAL, -70, 13, -22, Ascii.FF, -4, 3, -10, 1, -7, Ascii.ETB, 1, 1, 7, -18, Ascii.VT, -6};
    private static final int $$k = 149;
    private static final byte[] $$d = {9, 8, 112, 107, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 134;
    private static int equals = 1;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final List<BaseDynamicsView> dynamicsViews = new ArrayList();
    private final List<BaseDynamicsView> relatedViews = new ArrayList();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int component2 = 1;
        private final Function1 ShareDataUIState;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L30
                int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component1.component2
                int r1 = r1 + 75
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component1.component1 = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L1b
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                r3 = 28
                int r3 = r3 / r2
                if (r1 == 0) goto L30
                goto L1f
            L1b:
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L30
            L1f:
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            L30:
                int r5 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component1.component1
                int r5 = r5 + 55
                int r1 = r5 % 128
                com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component1.component2 = r1
                int r5 = r5 % r0
                if (r5 == 0) goto L3c
                return r2
            L3c:
                r5 = 0
                r5.hashCode()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component1.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 125;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i2 + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 81;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            int i4 = 66 / 0;
            return functionDelegate.hashCode();
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = component2 + 37;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r5, short r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.$$l
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r6]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.$$r(short, short, short):java.lang.String");
    }

    private static void h(short s, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 99 - s;
        int i3 = 103 - (b2 * 2);
        byte[] bArr2 = new byte[i + 4];
        int i4 = i + 3;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i4 + (-i2)) - 8;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2 + 1;
            i5 = i6;
            i3 = (i3 + (-bArr[i7])) - 8;
            i2 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 70 - r5
            int r0 = r7 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.$$j
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r2
            r2 = r5
            goto L2f
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2f:
            int r6 = -r6
            int r5 = r5 + r6
            int r5 = r5 + 2
            r6 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.j(int, byte, int, java.lang.Object[]):void");
    }

    public static final void access$onBirthdayChanged(SfcRegisterKycActivity sfcRegisterKycActivity, String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        sfcRegisterKycActivity.onBirthdayChanged(str);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_sfc_register_kyc;
        int i5 = component2 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        int i3 = 4;
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i4 = $11 + 67;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - i3;
            int i6 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % i3]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, (char) (63440 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1390, ImageFormat.getBitsPerPixel(0) + 19, (char) (TextUtils.getOffsetBefore("", 0) + 51269), -1883291598, false, $$r(b2, b3, (byte) (b3 | Ascii.FF)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i7 = $11 + 45;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 3;
                }
                i3 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void f(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (char) (View.combineMeasuredStates(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i7 = $10 + 63;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4503 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 36 - Color.alpha(0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 27897), -1464227204, false, $$r(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        int i9 = 95 / 0;
                    } else {
                        int i10 = iTrustedWebActivityService_Parcel.copydefault;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                            if (objCopydefault3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4501 - TextUtils.lastIndexOf("", '0', 0, 0), 35 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27897), -1464227204, false, $$r(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3581, 28 - Drawable.resolveOpacity(0, 0), (char) Color.blue(0), 1180380354, false, $$r(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 1859, 35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 80302927, false, $$r(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i12 = $11 + 41;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i15 = $11 + 67;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void i(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component3;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[i3];
                    objArr2[0] = Integer.valueOf(cArr[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 657, TextUtils.indexOf((CharSequence) "", '0', 0) + 15, (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $10 + 125;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 5 % 5;
                    }
                    i3 = 1;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] != 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 3580, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1180380354, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = $11 + 49;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = iTrustedWebActivityService_Parcel.copydefault;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                            if (objCopydefault3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getLongPressTimeout() >> 16), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27896), -1464227204, false, $$r(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 35 - ImageFormat.getBitsPerPixel(0), (char) ((Process.myPid() >> 22) + 27897), -1464227204, false, $$r(b6, b7, (byte) (b7 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, (char) Color.blue(0), 80302927, false, $$r(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $11 + 33;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 / i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 << i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            int i16 = $11 + 89;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.onCreate(android.os.Bundle):void");
    }

    private static final void initView$lambda$0(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterKycActivity, "");
        sfcRegisterKycActivity.onConfirmClick();
        int i4 = component2 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewUtils.softInputAdjustResize(getWindow(), ((ActivitySfcRegisterKycBinding) this.binding).getRoot());
        Serializable serializableExtra = getIntent().getSerializableExtra(KeysConstants.KEY_REGISTER_KYC_INFO);
        if (!(!(serializableExtra instanceof OtpRegisterResp))) {
            int i4 = component2 + 109;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                this.otpRegisterResp = (OtpRegisterResp) serializableExtra;
            } else {
                this.otpRegisterResp = (OtpRegisterResp) serializableExtra;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.oneStepRegisterTag = getIntent().getBooleanExtra(KeysConstants.KEY_ONE_STEP_REGISTER_TAG, this.oneStepRegisterTag);
        this.asyncRegisterTag = getIntent().getBooleanExtra(KeysConstants.KEY_ASYNC_REGISTER_TAG, this.asyncRegisterTag);
        ((ActivitySfcRegisterKycBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i5 = 2 % 2;
                int i6 = component1 + 31;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    SfcRegisterKycActivity.$r8$lambda$V_1HIuAUuFoc2cwvq8E9vc_y1ak(this.f$0, view);
                    throw null;
                }
                SfcRegisterKycActivity.$r8$lambda$V_1HIuAUuFoc2cwvq8E9vc_y1ak(this.f$0, view);
                int i7 = component1 + 51;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        ((ActivitySfcRegisterKycBinding) this.binding).btnNext.setEnabled(true);
        addObserver();
        ((ActivitySfcRegisterKycBinding) this.binding).getRoot().setVisibility(8);
        initDynamics();
        ((RegisterVerifyViewModel) this.viewModel).getRegisterDynamicKyc(new RegisterKycParams(RegisterKycParamsKt.REGISTER_CODE));
        ((ActivitySfcRegisterKycBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i5 = 2 % 2;
                int i6 = copydefault + 65;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                SfcRegisterKycActivity.$r8$lambda$3MbDebVgqDEPeNjJPkfhz5WHYI0(this.f$0, view);
                if (i7 == 0) {
                    int i8 = 83 / 0;
                }
            }
        });
        int i5 = component2 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void initView$lambda$1(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterKycActivity, "");
        sfcRegisterKycActivity.finish();
        int i4 = ShareDataUIState + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initDynamics() {
        int i = 2 % 2;
        ((RegisterVerifyViewModel) this.viewModel).getDynamicKycInfoLivedata().observe(this, new component1(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 123;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SfcRegisterKycActivity sfcRegisterKycActivity = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 != 0) {
                    return SfcRegisterKycActivity.$r8$lambda$zVTQxmceLShAUDsBoAHIpI04DGE(sfcRegisterKycActivity, resource);
                }
                SfcRegisterKycActivity.$r8$lambda$zVTQxmceLShAUDsBoAHIpI04DGE(sfcRegisterKycActivity, resource);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = component2 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    private static final void initDynamics$lambda$5$lambda$2(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterKycActivity, "");
        ((RegisterVerifyViewModel) sfcRegisterKycActivity.viewModel).getRegisterDynamicKyc(new RegisterKycParams(RegisterKycParamsKt.REGISTER_CODE));
        int i2 = component2 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initDynamics$lambda$5(final SfcRegisterKycActivity sfcRegisterKycActivity, Resource resource) {
        List<DynamicsElement> convertElements;
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterKycActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        if (resource.loading()) {
            int i4 = ShareDataUIState + 79;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                DialogManager.showLoading(sfcRegisterKycActivity);
                return Unit.INSTANCE;
            }
            DialogManager.showLoading(sfcRegisterKycActivity);
            int i5 = 89 / 0;
            return Unit.INSTANCE;
        }
        DialogManager.hideLoading(sfcRegisterKycActivity);
        if (resource.error()) {
            LoadUtils.showError(sfcRegisterKycActivity, new View.OnClickListener() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public final void onClick(View view) {
                    int i6 = 2 % 2;
                    int i7 = component2 + 87;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    SfcRegisterKycActivity.m10932$r8$lambda$eIubmarsvua8exPgYRJnArRXO8(this.f$0, view);
                    int i9 = ShareDataUIState + 115;
                    component2 = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                }
            });
            return Unit.INSTANCE;
        }
        if (resource.success()) {
            ((ActivitySfcRegisterKycBinding) sfcRegisterKycActivity.binding).getRoot().setVisibility(0);
            List<DynamicsElement> list = (List) resource.getData();
            if (list != null && (convertElements = sfcRegisterKycActivity.getConvertElements(list)) != null) {
                sfcRegisterKycActivity.addDynamicsElements(convertElements);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ShareDataUIState + 63;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addDynamicsElements(java.util.List<com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement> r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        L12:
            boolean r2 = r8.hasNext()
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == r3) goto L92
            java.lang.Object r2 = r8.next()
            com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement r2 = (com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement) r2
            com.huawei.digitalpayment.customer.dynamics.DynamicsElementViewManager r3 = com.huawei.digitalpayment.customer.dynamics.DynamicsElementViewManager.INSTANCE
            r5 = r7
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView r3 = r3.getDynamicsElementView(r5, r2)
            if (r3 == 0) goto L12
            int r5 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L49
            java.util.List<com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView> r5 = r7.dynamicsViews
            r5.add(r3)
            boolean r1 = r7.needFixTopMarginAndPadding(r1, r3)
            r5 = 82
            int r5 = r5 / r4
            if (r1 == 0) goto L80
            goto L54
        L49:
            java.util.List<com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView> r5 = r7.dynamicsViews
            r5.add(r3)
            boolean r1 = r7.needFixTopMarginAndPadding(r1, r3)
            if (r1 == 0) goto L80
        L54:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = -2
            r1.<init>(r5, r6)
            r5 = 1103101952(0x41c00000, float:24.0)
            int r5 = com.blankj.utilcode.util.SizeUtils.dp2px(r5)
            r1.topMargin = r5
            android.view.View r5 = r3.getRooView()
            r6 = 1094713344(0x41400000, float:12.0)
            int r6 = com.blankj.utilcode.util.SizeUtils.dp2px(r6)
            r5.setPadding(r4, r6, r4, r4)
            Binding extends androidx.databinding.ViewDataBinding r4 = r7.binding
            com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterKycBinding r4 = (com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterKycBinding) r4
            android.widget.LinearLayout r4 = r4.llContainer
            android.view.View r5 = r3.getRooView()
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r4.addView(r5, r1)
            goto L8d
        L80:
            Binding extends androidx.databinding.ViewDataBinding r1 = r7.binding
            com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterKycBinding r1 = (com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterKycBinding) r1
            android.widget.LinearLayout r1 = r1.llContainer
            android.view.View r4 = r3.getRooView()
            r1.addView(r4)
        L8d:
            r7.handleDynamicsViewRelationship(r3, r2)
            r1 = r3
            goto L12
        L92:
            int r8 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState
            int r8 = r8 + 29
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2 = r1
            int r8 = r8 % r0
            if (r8 != 0) goto La0
            r8 = 89
            int r8 = r8 / r4
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.addDynamicsElements(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean needFixTopMarginAndPadding(com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView r6, com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2 = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L18
            boolean r1 = r7 instanceof com.huawei.digitalpayment.customer.dynamics.DynamicsElementPhotoView
            if (r1 == r4) goto L16
            r1 = r4
            goto L1e
        L16:
            r3 = r4
            goto L2a
        L18:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.customer.dynamics.DynamicsElementPhotoView
            if (r1 == 0) goto L1d
            goto L2a
        L1d:
            r1 = r3
        L1e:
            boolean r7 = r7 instanceof com.huawei.digitalpayment.customer.dynamics.DynamicsElementSignatureView
            if (r7 == 0) goto L3c
            int r7 = r2 + 19
            int r3 = r7 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r3
            int r7 = r7 % r0
            r3 = r1
        L2a:
            boolean r7 = r6 instanceof com.huawei.digitalpayment.customer.dynamics.DynamicsElementPhotoView
            if (r7 != 0) goto L3a
            int r2 = r2 + 9
            int r7 = r2 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r7
            int r2 = r2 % r0
            boolean r6 = r6 instanceof com.huawei.digitalpayment.customer.dynamics.DynamicsElementSignatureView
            if (r6 != 0) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            return r4
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.needFixTopMarginAndPadding(com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView, com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView):boolean");
    }

    private final void handleDynamicsViewRelationship(BaseDynamicsView dynamicsView, DynamicsElement element) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(element);
        if (Intrinsics.areEqual(Keys.KYC_KEY_BIRTHDAY, element.getKey())) {
            dynamicsView.addTextWatcher(new MPTextWatcher() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public void afterTextChanged(Editable s) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 31;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(s, "");
                    SfcRegisterKycActivity.access$onBirthdayChanged(SfcRegisterKycActivity.this, s.toString());
                    int i5 = component2 + 37;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = component2 + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!(!isRelationshipValid(element.getRegularExpr()))) {
            dynamicsView.getRooView().setVisibility(8);
            this.relatedViews.add(dynamicsView);
            int i4 = component2 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isRelationshipValid(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1a
            goto L25
        L1a:
            r1 = r2
            goto L27
        L1c:
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L26
        L25:
            return r3
        L26:
            r1 = r3
        L27:
            java.lang.Class<com.huawei.digitalpayment.consumer.register.ui.bean.Relationship> r4 = com.huawei.digitalpayment.consumer.register.ui.bean.Relationship.class
            java.lang.Object r6 = com.huawei.common.util.SecureGsonUtils.fromJson(r6, r4)
            com.huawei.digitalpayment.consumer.register.ui.bean.Relationship r6 = (com.huawei.digitalpayment.consumer.register.ui.bean.Relationship) r6
            if (r6 != 0) goto L3b
            int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState
            int r6 = r6 + 51
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2 = r1
            int r6 = r6 % r0
            return r3
        L3b:
            com.huawei.digitalpayment.consumer.register.ui.bean.RelationshipItem r4 = r6.getBirthDate()
            if (r4 != 0) goto L4b
            int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2
            int r6 = r6 + 3
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r1
            int r6 = r6 % r0
            return r3
        L4b:
            com.huawei.digitalpayment.consumer.register.ui.bean.RelationshipItem r4 = r6.getBirthDate()
            java.lang.String r4 = r4.getOperator()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L73
            com.huawei.digitalpayment.consumer.register.ui.bean.RelationshipItem r6 = r6.getBirthDate()
            java.lang.Integer r6 = r6.getValue()
            if (r6 == 0) goto L73
            int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState
            int r6 = r6 + 113
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L74
            r2 = r3
            goto L74
        L73:
            r2 = r1
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.isRelationshipValid(java.lang.String):boolean");
    }

    private final void onBirthdayChanged(String value) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.relatedViews.isEmpty()) {
            int iCalculateAge = calculateAge(value);
            for (BaseDynamicsView baseDynamicsView : this.relatedViews) {
                baseDynamicsView.getRooView().setVisibility(getRelatedViewVisibility((Relationship) SecureGsonUtils.fromJson(baseDynamicsView.getDynamicsElement().getRegularExpr(), Relationship.class), iCalculateAge));
            }
            return;
        }
        int i4 = component2 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int getRelatedViewVisibility(Relationship relationship, int age) {
        int iHashCode;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if (relationship == null) {
            return 0;
        }
        RelationshipItem birthDate = relationship.getBirthDate();
        Intrinsics.checkNotNull(birthDate);
        String operator = birthDate.getOperator();
        Integer value = relationship.getBirthDate().getValue();
        Intrinsics.checkNotNull(value);
        int iIntValue = value.intValue();
        if (operator == null) {
            return 0;
        }
        int i6 = component2 + 3;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0 ? (iHashCode = operator.hashCode()) == 1921 : (iHashCode = operator.hashCode()) == 18703) {
            if (!operator.equals("<=") || age <= iIntValue) {
                return 0;
            }
        } else if (iHashCode != 1983) {
            int i7 = component2 + 29;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            switch (iHashCode) {
                case 60:
                    if (!operator.equals("<")) {
                        return 0;
                    }
                    if (age < iIntValue) {
                        i = component2 + 53;
                        i2 = i % 128;
                        ShareDataUIState = i2;
                        int i9 = i % 2;
                        return 0;
                    }
                    break;
                case 61:
                    if (!operator.equals("=")) {
                        return 0;
                    }
                    if (age == iIntValue) {
                        i = component2 + 117;
                        i2 = i % 128;
                        ShareDataUIState = i2;
                        int i92 = i % 2;
                        return 0;
                    }
                    break;
                case 62:
                    if (!operator.equals(">") || age > iIntValue) {
                        return 0;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            Object obj = null;
            if (!operator.equals(">=")) {
                int i10 = ShareDataUIState + 33;
                component2 = i10 % 128;
                if (i10 % 2 != 0) {
                    return 0;
                }
                obj.hashCode();
                throw null;
            }
            if (age >= iIntValue) {
                int i11 = component2 + 37;
                ShareDataUIState = i11 % 128;
                if (i11 % 2 == 0) {
                    return 0;
                }
                throw null;
            }
        }
        return 8;
    }

    private final int calculateAge(String birthday) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(birthday);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!TextUtils.isEmpty(birthday)) {
            Calendar calendar = Calendar.getInstance();
            try {
                Date date = new SimpleDateFormat(DynamicsElementDateView.INSTANCE.getSHOW_DATE_FORMAT(), Locale.US).parse(birthday);
                Intrinsics.checkNotNull(date);
                calendar.setTime(date);
                Calendar calendar2 = Calendar.getInstance();
                int i3 = calendar2.get(1) - calendar.get(1);
                if (calendar2.get(2) < calendar.get(2)) {
                    i3--;
                }
                if (calendar2.get(2) == calendar.get(2)) {
                    if (calendar2.get(6) < calendar.get(6)) {
                        int i4 = component2;
                        int i5 = i4 + 39;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        i3--;
                        int i7 = i4 + 11;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                int i9 = component2 + 37;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
                return i3;
            } catch (ParseException unused) {
                return 0;
            }
        }
        int i11 = component2 + 97;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
        return 0;
    }

    private final void onConfirmClick() {
        int i = 2 % 2;
        KeyboardUtils.hideSoftInput(this);
        HashMap map = new HashMap();
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        for (BaseDynamicsView baseDynamicsView : this.dynamicsViews) {
            if (!baseDynamicsView.isLegal()) {
                int i4 = ShareDataUIState + 23;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    TextUtils.isEmpty(baseDynamicsView.getErrorMessage());
                    throw null;
                }
                String errorMessage = baseDynamicsView.getErrorMessage();
                if (!(!TextUtils.isEmpty(errorMessage))) {
                    return;
                }
                baseDynamicsView.showError(errorMessage);
                return;
            }
            Object commitValue = baseDynamicsView.getCommitValue();
            if (commitValue != null && !TextUtils.isEmpty(commitValue.toString())) {
                String commitKey = baseDynamicsView.getCommitKey();
                Object commitValue2 = baseDynamicsView.getCommitValue();
                Intrinsics.checkNotNull(commitValue2);
                map.put(commitKey, commitValue2);
            }
        }
        RegisterParams registerParams = new RegisterParams("", "", "", map);
        if (this.oneStepRegisterTag) {
            int i5 = component2 + 73;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            toSetPin(registerParams);
            return;
        }
        if (!this.asyncRegisterTag) {
            ((RegisterVerifyViewModel) this.viewModel).registerWithKyc(registerParams);
            return;
        }
        int i7 = component2 + 81;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        ((RegisterVerifyViewModel) this.viewModel).asyncRegisterWithKyc(registerParams);
        int i9 = component2 + 69;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
    }

    private final void addObserver() {
        int i = 2 % 2;
        ((RegisterVerifyViewModel) this.viewModel).getData().observe(this, new component1(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM10931$r8$lambda$Q3lMZ1CKQ5wkwmWFynbE2iwtu4 = SfcRegisterKycActivity.m10931$r8$lambda$Q3lMZ1CKQ5wkwmWFynbE2iwtu4(this.f$0, (Resource) obj);
                int i5 = component3 + 27;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return unitM10931$r8$lambda$Q3lMZ1CKQ5wkwmWFynbE2iwtu4;
            }
        }));
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit addObserver$lambda$6(SfcRegisterKycActivity sfcRegisterKycActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterKycActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Utils.showOrHideLoading(sfcRegisterKycActivity, resource);
        Utils.toastError(resource);
        if (resource.success()) {
            LocalLoginInfo localLoginInfo = (LocalLoginInfo) resource.getData();
            if (!(!sfcRegisterKycActivity.asyncRegisterTag)) {
                sfcRegisterKycActivity.toRegisterResult(localLoginInfo.getAsyncRegisterDesc());
                sfcRegisterKycActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 83;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 23 / 0;
                }
                return unit;
            }
            if (TextUtils.isEmpty(localLoginInfo.getExecute())) {
                UserLifecycleManager.get().loginSuccess(sfcRegisterKycActivity, new Gson().toJson(localLoginInfo), false);
                RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
                sfcRegisterKycActivity.finish();
            } else {
                RouteUtils.routeWithExecute(sfcRegisterKycActivity, localLoginInfo.getExecute());
                sfcRegisterKycActivity.finish();
                int i4 = component2 + 77;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private final void toRegisterResult(String des) {
        int i = 2 % 2;
        Bundle bundle = new Bundle(2);
        bundle.putString(KeysConstants.KEY_EXECUTE, RoutePathConstants.LOGIN);
        bundle.putString(KeysConstants.PAGE_TITLE, getString(R.string.onboarding_register_result_success));
        bundle.putString(KeysConstants.PAGE_DESCRIPTION, des);
        bundle.putBoolean(KeysConstants.KEY_IS_TO_EXECUTE, true);
        bundle.putString(KeysConstants.PAGE_BUTTON, getString(R.string.base_ok));
        RouteUtils.routeWithExecute(RoutePathConstants.SIMPLE_RESULT, bundle);
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
  0x0025: PHI (r1v8 com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp) = 
  (r1v7 com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp)
  (r1v13 com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp)
 binds: [B:10:0x0023, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement> getConvertElements(java.util.List<com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement> r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r1)
            r2 = 1
            if (r1 == r2) goto Lac
            int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L21
            com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp r1 = r7.otpRegisterResp
            r2 = 84
            int r2 = r2 / 0
            if (r1 == 0) goto Lac
            goto L25
        L21:
            com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp r1 = r7.otpRegisterResp
            if (r1 == 0) goto Lac
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.util.List r1 = r1.getKycFields()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto L36
            goto Lac
        L36:
            java.util.Iterator r1 = r8.iterator()
        L3a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement r2 = (com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement) r2
            com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp r3 = r7.otpRegisterResp
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.util.List r3 = r3.getKycFields()
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            int r4 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2
            int r4 = r4 + 33
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L98
            java.lang.Object r4 = r3.next()
            com.huawei.digitalpayment.consumer.loginModule.register.model.KycField r4 = (com.huawei.digitalpayment.consumer.loginModule.register.model.KycField) r4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.String r5 = r2.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L53
            java.lang.String r5 = r2.getKey()
            java.lang.String r6 = r4.getKycName()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L53
            java.lang.String r4 = r4.getKycValue()
            r2.setValue(r4)
            int r4 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.component2
            int r4 = r4 + 33
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.ShareDataUIState = r5
            int r4 = r4 % r0
            goto L53
        L98:
            java.lang.Object r8 = r3.next()
            com.huawei.digitalpayment.consumer.loginModule.register.model.KycField r8 = (com.huawei.digitalpayment.consumer.loginModule.register.model.KycField) r8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.String r8 = r2.getKey()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            android.text.TextUtils.isEmpty(r8)
            r8 = 0
            throw r8
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.getConvertElements(java.util.List):java.util.List");
    }

    private final void toSetPin(RegisterParams registerParams) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putSerializable("registerParams", registerParams);
        bundle.putBoolean(KeysConstants.KEY_ONE_STEP_REGISTER_TAG, this.oneStepRegisterTag);
        bundle.putBoolean(KeysConstants.KEY_ASYNC_REGISTER_TAG, this.asyncRegisterTag);
        RouteUtils.routeWithExecute("/loginModule/setPin", bundle);
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = component2 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{18, 26, 0, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(1) - 115, new char[]{52718, 45072, 52621, 1449, 11168, 54316, 16458, 62778, 6843, 15490, 26908, 11513, 25598, 54348, 12852, 7041, 18461, 35629, 56060, 29361, 37185, 41714}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = component2 + 51;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = ShareDataUIState + 107;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i8 = component2 + 105;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            } else {
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) (MotionEvent.axisFromString("") + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 56, (char) Drawable.resolveOpacity(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{18, 26, 0, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{52718, 45072, 52621, 1449, 11168, 54316, 16458, 62778, 6843, 15490, 26908, 11513, 25598, 54348, 12852, 7041, 18461, 35629, 56060, 29361, 37185, 41714}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = component2 + 57;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = ShareDataUIState + 35;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "") + 42, (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 6562, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) (ViewConfiguration.getScrollBarSize() >> 8), -960739708, false, "component3", new Class[]{Context.class});
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
        int i6 = component2 + 121;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(2:(2:9|(2:11|(1:17)(1:16))(2:18|19))(1:20)|(9:22|863|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|(10:855|36|(2:839|38)|42|43|832|(2:45|(5:47|48|(1:50)|51|52)(4:53|(1:55)|56|57))(21:58|59|846|60|(2:779|62)|66|67|833|68|(2:787|70)|74|75|76|(1:78)|79|80|81|(1:83)|84|(1:86)|87)|88|(4:91|(3:866|93|869)(12:865|94|(3:96|(3:99|100|97)|870)|101|825|102|(1:104)|105|106|818|107|868)|867|89)|864)|148|(28:(6:820|149|(1:151)|152|(1:154)|155)|(3:157|(1:159)|160)(6:161|(2:163|(1:169)(1:168))(1:170)|(18:172|816|173|(1:175)|176|177|810|178|(1:180)|181|182|183|(1:185)|186|(1:188)(1:189)|190|(1:192)|193)(38:248|803|249|(1:251)|252|(3:254|(1:256)|257)(19:258|259|789|260|(1:262)|263|264|785|265|(1:267)|268|269|270|(1:272)|273|(1:275)|276|(1:278)|279)|280|(4:284|(3:877|286|880)(12:876|287|(3:289|(3:292|293|290)|881)|294|777|295|(1:297)|298|299|861|300|879)|878|281)|875|283|(4:337|831|338|(1:344)(1:343))(1:348)|349|812|350|(1:352)|353|808|354|(1:356)|357|381|848|382|(1:384)|385|(3:387|(1:389)|390)(14:392|393|840|394|(1:396)|397|398|399|(1:401)|402|(1:404)(1:405)|406|(1:408)|409)|391|410|(9:413|827|414|(1:416)|417|418|419|821|420)|450|(1:452)|453|(1:455)|456|(3:458|(1:460)|461)(16:463|464|(1:466)|467|(1:469)|470|471|(1:473)|474|814|475|476|(1:478)|479|(1:481)|482)|462|483|(24:485|(1:487)|488|(3:490|(1:492)|493)(14:494|495|(1:497)|498|499|(1:501)|502|781|503|504|(1:506)|507|(1:509)|510)|511|(1:513)(9:514|(5:516|(1:518)(1:519)|887|(2:522|520)|886)|523|524|(1:526)|527|(1:529)|530|531)|532|783|533|(12:845|535|539|(2:541|542)|543|544|776|(4:546|547|(1:549)|550)(13:551|(2:553|(2:555|(2:557|(2:559|563)(1:560))(2:561|562))(1:563))|(22:565|566|851|567|568|859|569|(2:837|571)|575|576|853|577|(2:774|579)|583|584|585|(2:857|587)|588|(2:590|591)|592|(2:594|595)|596)(1:649)|652|653|849|654|657|658|(1:660)|661|662|663)|597|(4:600|(2:602|884)(11:603|(3:605|(4:608|609|610|606)|885)|613|842|614|(1:616)|617|618|829|619|883)|620|598)|882|632)(10:539|(0)|543|544|776|(0)(0)|597|(1:598)|882|632)|664|(1:666)|667|(3:669|(1:671)|672)(13:674|823|675|676|(1:678)|679|791|680|681|(1:683)|684|(1:686)|687)|673|688|(6:691|692|(1:694)|695|696|697)|698|(1:700)|701|(3:703|(1:705)|706)(14:708|709|(1:711)|712|713|(1:715)|716|801|717|718|(1:720)|721|(1:723)|724)|707|725|(1:889)(7:728|729|(1:731)|732|733|734|735))(10:747|(3:749|(2:752|750)|888)|753|754|(1:756)|757|(1:759)|760|761|762))|765|766|(1:768)(1:769))|812|350|(0)|353|808|354|(0)|357|381|848|382|(0)|385|(0)(0)|391|410|(0)|450|(0)|453|(0)|456|(0)(0)|462|483|(0)(0))|194|(4:197|(2:199|873)(11:200|(3:202|(3:205|206|203)|874)|207|806|208|(1:210)|211|212|797|213|872)|214|195)|871|248|803|249|(0)|252|(0)(0)|280|(1:281)|875|283|(0)(0)|349|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:0|2|(2:(2:9|(2:11|(1:17)(1:16))(2:18|19))(1:20)|(9:22|863|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|(10:855|36|(2:839|38)|42|43|832|(2:45|(5:47|48|(1:50)|51|52)(4:53|(1:55)|56|57))(21:58|59|846|60|(2:779|62)|66|67|833|68|(2:787|70)|74|75|76|(1:78)|79|80|81|(1:83)|84|(1:86)|87)|88|(4:91|(3:866|93|869)(12:865|94|(3:96|(3:99|100|97)|870)|101|825|102|(1:104)|105|106|818|107|868)|867|89)|864)|148|820|149|(1:151)|152|(1:154)|155|(3:157|(1:159)|160)(6:161|(2:163|(1:169)(1:168))(1:170)|(18:172|816|173|(1:175)|176|177|810|178|(1:180)|181|182|183|(1:185)|186|(1:188)(1:189)|190|(1:192)|193)(38:248|803|249|(1:251)|252|(3:254|(1:256)|257)(19:258|259|789|260|(1:262)|263|264|785|265|(1:267)|268|269|270|(1:272)|273|(1:275)|276|(1:278)|279)|280|(4:284|(3:877|286|880)(12:876|287|(3:289|(3:292|293|290)|881)|294|777|295|(1:297)|298|299|861|300|879)|878|281)|875|283|(4:337|831|338|(1:344)(1:343))(1:348)|349|812|350|(1:352)|353|808|354|(1:356)|357|381|848|382|(1:384)|385|(3:387|(1:389)|390)(14:392|393|840|394|(1:396)|397|398|399|(1:401)|402|(1:404)(1:405)|406|(1:408)|409)|391|410|(9:413|827|414|(1:416)|417|418|419|821|420)|450|(1:452)|453|(1:455)|456|(3:458|(1:460)|461)(16:463|464|(1:466)|467|(1:469)|470|471|(1:473)|474|814|475|476|(1:478)|479|(1:481)|482)|462|483|(24:485|(1:487)|488|(3:490|(1:492)|493)(14:494|495|(1:497)|498|499|(1:501)|502|781|503|504|(1:506)|507|(1:509)|510)|511|(1:513)(9:514|(5:516|(1:518)(1:519)|887|(2:522|520)|886)|523|524|(1:526)|527|(1:529)|530|531)|532|783|533|(12:845|535|539|(2:541|542)|543|544|776|(4:546|547|(1:549)|550)(13:551|(2:553|(2:555|(2:557|(2:559|563)(1:560))(2:561|562))(1:563))|(22:565|566|851|567|568|859|569|(2:837|571)|575|576|853|577|(2:774|579)|583|584|585|(2:857|587)|588|(2:590|591)|592|(2:594|595)|596)(1:649)|652|653|849|654|657|658|(1:660)|661|662|663)|597|(4:600|(2:602|884)(11:603|(3:605|(4:608|609|610|606)|885)|613|842|614|(1:616)|617|618|829|619|883)|620|598)|882|632)(10:539|(0)|543|544|776|(0)(0)|597|(1:598)|882|632)|664|(1:666)|667|(3:669|(1:671)|672)(13:674|823|675|676|(1:678)|679|791|680|681|(1:683)|684|(1:686)|687)|673|688|(6:691|692|(1:694)|695|696|697)|698|(1:700)|701|(3:703|(1:705)|706)(14:708|709|(1:711)|712|713|(1:715)|716|801|717|718|(1:720)|721|(1:723)|724)|707|725|(1:889)(7:728|729|(1:731)|732|733|734|735))(10:747|(3:749|(2:752|750)|888)|753|754|(1:756)|757|(1:759)|760|761|762))|765|766|(1:768)(1:769))|194|(4:197|(2:199|873)(11:200|(3:202|(3:205|206|203)|874)|207|806|208|(1:210)|211|212|797|213|872)|214|195)|871|248|803|249|(0)|252|(0)(0)|280|(1:281)|875|283|(0)(0)|349|812|350|(0)|353|808|354|(0)|357|381|848|382|(0)|385|(0)(0)|391|410|(0)|450|(0)|453|(0)|456|(0)(0)|462|483|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x12c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x12c4, code lost:
    
        r5 = new java.lang.Object[1];
        f(new byte[]{0, 0, 0, 1, 1, 0, 1, 0, 1, 1}, new int[]{androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, 10, 81, 7}, false, r5);
        r2 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x12e2, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x12f9, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x12fd, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r12 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32)));
        r12 = 0;
        r1 = ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x132d, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x1331, code lost:
    
        if (r4 == null) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x1333, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.lastIndexOf("", '0') + 6619, 41 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (char) android.graphics.Color.argb(0, 0, 0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x135a, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x1362, code lost:
    
        r7 = new java.lang.Object[]{126712444, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.graphics.Color.alpha(0), 56 - android.view.View.getDefaultSize(0, 0), (char) (android.os.Process.getGidForName("") + 1));
        r2 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.$$j[38];
        r8 = new java.lang.Object[1];
        j((byte) 52, r2, r2, r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x1986, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x1987, code lost:
    
        r6 = new java.lang.Object[1];
        f(new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{434, 11, 0, 8}, false, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x19a4, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x19bb, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x19bf, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
        r13 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r5 = r5 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x19ee, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x19f2, code lost:
    
        if (r3 == null) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x19f4, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.ImageFormat.getBitsPerPixel(0) + 6619, 42 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x1a1f, code lost:
    
        r3 = ((java.lang.reflect.Method) r3).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x1a27, code lost:
    
        r8 = new java.lang.Object[]{126712444, java.lang.Long.valueOf(r5), r4, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 56 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
        r4 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.$$j[38];
        r12 = new java.lang.Object[1];
        j((byte) 52, r4, r4, r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r3, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0780 A[Catch: all -> 0x029b, TryCatch #49 {all -> 0x029b, blocks: (B:658:0x2abb, B:660:0x2ac1, B:661:0x2aef, B:692:0x2df3, B:694:0x2df9, B:695:0x2e25, B:729:0x312a, B:731:0x3130, B:732:0x3153, B:709:0x2f73, B:711:0x2f96, B:712:0x2fe5, B:524:0x2385, B:526:0x238b, B:527:0x23b6, B:529:0x23f0, B:530:0x243a, B:495:0x20ab, B:497:0x20c0, B:498:0x20f2, B:754:0x3234, B:756:0x323a, B:757:0x325e, B:759:0x3298, B:760:0x32d7, B:464:0x1c42, B:466:0x1c57, B:467:0x1c8c, B:469:0x1cc0, B:470:0x1d3c, B:444:0x19ee, B:446:0x19f4, B:447:0x1a1f, B:375:0x156f, B:377:0x1575, B:378:0x159d, B:329:0x132d, B:331:0x1333, B:332:0x135a, B:242:0x0df3, B:244:0x0df9, B:245:0x0e24, B:142:0x077a, B:144:0x0780, B:145:0x07a8, B:23:0x011a, B:25:0x0120, B:26:0x0146, B:28:0x020c, B:30:0x023d, B:31:0x0295), top: B:863:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x083a A[Catch: all -> 0x0d65, TryCatch #24 {all -> 0x0d65, blocks: (B:149:0x0834, B:151:0x083a, B:152:0x0884, B:154:0x08ab, B:155:0x08f7, B:157:0x090b, B:159:0x0914, B:160:0x0950, B:194:0x0c2a, B:195:0x0c2e, B:197:0x0c34, B:200:0x0c4e, B:203:0x0c5a, B:205:0x0c5d, B:217:0x0d3f, B:219:0x0d45, B:220:0x0d46, B:222:0x0d48, B:224:0x0d4f, B:225:0x0d50, B:163:0x0963, B:165:0x0967, B:172:0x097b, B:183:0x0b01, B:185:0x0b07, B:186:0x0b51, B:188:0x0b7b, B:190:0x0bc7, B:192:0x0bdd, B:193:0x0c24, B:227:0x0d52, B:229:0x0d59, B:230:0x0d5a, B:232:0x0d5c, B:234:0x0d63, B:235:0x0d64, B:169:0x0973, B:213:0x0cc5, B:208:0x0c8b, B:210:0x0c91, B:211:0x0cbd, B:178:0x0a53, B:180:0x0a77, B:181:0x0af5, B:173:0x0a02, B:175:0x0a16, B:176:0x0a4c), top: B:820:0x0834, outer: #38, inners: #12, #17, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x08ab A[Catch: all -> 0x0d65, TryCatch #24 {all -> 0x0d65, blocks: (B:149:0x0834, B:151:0x083a, B:152:0x0884, B:154:0x08ab, B:155:0x08f7, B:157:0x090b, B:159:0x0914, B:160:0x0950, B:194:0x0c2a, B:195:0x0c2e, B:197:0x0c34, B:200:0x0c4e, B:203:0x0c5a, B:205:0x0c5d, B:217:0x0d3f, B:219:0x0d45, B:220:0x0d46, B:222:0x0d48, B:224:0x0d4f, B:225:0x0d50, B:163:0x0963, B:165:0x0967, B:172:0x097b, B:183:0x0b01, B:185:0x0b07, B:186:0x0b51, B:188:0x0b7b, B:190:0x0bc7, B:192:0x0bdd, B:193:0x0c24, B:227:0x0d52, B:229:0x0d59, B:230:0x0d5a, B:232:0x0d5c, B:234:0x0d63, B:235:0x0d64, B:169:0x0973, B:213:0x0cc5, B:208:0x0c8b, B:210:0x0c91, B:211:0x0cbd, B:178:0x0a53, B:180:0x0a77, B:181:0x0af5, B:173:0x0a02, B:175:0x0a16, B:176:0x0a4c), top: B:820:0x0834, outer: #38, inners: #12, #17, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x090b A[Catch: all -> 0x0d65, TryCatch #24 {all -> 0x0d65, blocks: (B:149:0x0834, B:151:0x083a, B:152:0x0884, B:154:0x08ab, B:155:0x08f7, B:157:0x090b, B:159:0x0914, B:160:0x0950, B:194:0x0c2a, B:195:0x0c2e, B:197:0x0c34, B:200:0x0c4e, B:203:0x0c5a, B:205:0x0c5d, B:217:0x0d3f, B:219:0x0d45, B:220:0x0d46, B:222:0x0d48, B:224:0x0d4f, B:225:0x0d50, B:163:0x0963, B:165:0x0967, B:172:0x097b, B:183:0x0b01, B:185:0x0b07, B:186:0x0b51, B:188:0x0b7b, B:190:0x0bc7, B:192:0x0bdd, B:193:0x0c24, B:227:0x0d52, B:229:0x0d59, B:230:0x0d5a, B:232:0x0d5c, B:234:0x0d63, B:235:0x0d64, B:169:0x0973, B:213:0x0cc5, B:208:0x0c8b, B:210:0x0c91, B:211:0x0cbd, B:178:0x0a53, B:180:0x0a77, B:181:0x0af5, B:173:0x0a02, B:175:0x0a16, B:176:0x0a4c), top: B:820:0x0834, outer: #38, inners: #12, #17, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0c34 A[Catch: all -> 0x0d65, TryCatch #24 {all -> 0x0d65, blocks: (B:149:0x0834, B:151:0x083a, B:152:0x0884, B:154:0x08ab, B:155:0x08f7, B:157:0x090b, B:159:0x0914, B:160:0x0950, B:194:0x0c2a, B:195:0x0c2e, B:197:0x0c34, B:200:0x0c4e, B:203:0x0c5a, B:205:0x0c5d, B:217:0x0d3f, B:219:0x0d45, B:220:0x0d46, B:222:0x0d48, B:224:0x0d4f, B:225:0x0d50, B:163:0x0963, B:165:0x0967, B:172:0x097b, B:183:0x0b01, B:185:0x0b07, B:186:0x0b51, B:188:0x0b7b, B:190:0x0bc7, B:192:0x0bdd, B:193:0x0c24, B:227:0x0d52, B:229:0x0d59, B:230:0x0d5a, B:232:0x0d5c, B:234:0x0d63, B:235:0x0d64, B:169:0x0973, B:213:0x0cc5, B:208:0x0c8b, B:210:0x0c91, B:211:0x0cbd, B:178:0x0a53, B:180:0x0a77, B:181:0x0af5, B:173:0x0a02, B:175:0x0a16, B:176:0x0a4c), top: B:820:0x0834, outer: #38, inners: #12, #17, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ead A[Catch: all -> 0x12c3, TryCatch #15 {all -> 0x12c3, blocks: (B:249:0x0ea7, B:251:0x0ead, B:252:0x0ef2, B:254:0x0eff, B:256:0x0f08, B:257:0x0f43, B:280:0x117e, B:281:0x1182, B:284:0x118e, B:287:0x11a5, B:290:0x11b2, B:292:0x11b5, B:304:0x129d, B:306:0x12a3, B:307:0x12a4, B:309:0x12a6, B:311:0x12ad, B:312:0x12ae, B:258:0x0f4e, B:270:0x105b, B:272:0x1061, B:273:0x10a8, B:275:0x10d2, B:276:0x111a, B:278:0x1130, B:279:0x1178, B:314:0x12b0, B:316:0x12b7, B:317:0x12b8, B:319:0x12ba, B:321:0x12c1, B:322:0x12c2, B:295:0x11e1, B:297:0x11e7, B:298:0x120b, B:265:0x0fbe, B:267:0x0fda, B:268:0x104f, B:260:0x0f6e, B:262:0x0f83, B:263:0x0fb7, B:300:0x121d), top: B:803:0x0ea7, outer: #38, inners: #2, #6, #8, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0eff A[Catch: all -> 0x12c3, TryCatch #15 {all -> 0x12c3, blocks: (B:249:0x0ea7, B:251:0x0ead, B:252:0x0ef2, B:254:0x0eff, B:256:0x0f08, B:257:0x0f43, B:280:0x117e, B:281:0x1182, B:284:0x118e, B:287:0x11a5, B:290:0x11b2, B:292:0x11b5, B:304:0x129d, B:306:0x12a3, B:307:0x12a4, B:309:0x12a6, B:311:0x12ad, B:312:0x12ae, B:258:0x0f4e, B:270:0x105b, B:272:0x1061, B:273:0x10a8, B:275:0x10d2, B:276:0x111a, B:278:0x1130, B:279:0x1178, B:314:0x12b0, B:316:0x12b7, B:317:0x12b8, B:319:0x12ba, B:321:0x12c1, B:322:0x12c2, B:295:0x11e1, B:297:0x11e7, B:298:0x120b, B:265:0x0fbe, B:267:0x0fda, B:268:0x104f, B:260:0x0f6e, B:262:0x0f83, B:263:0x0fb7, B:300:0x121d), top: B:803:0x0ea7, outer: #38, inners: #2, #6, #8, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0f4e A[Catch: all -> 0x12c3, TRY_LEAVE, TryCatch #15 {all -> 0x12c3, blocks: (B:249:0x0ea7, B:251:0x0ead, B:252:0x0ef2, B:254:0x0eff, B:256:0x0f08, B:257:0x0f43, B:280:0x117e, B:281:0x1182, B:284:0x118e, B:287:0x11a5, B:290:0x11b2, B:292:0x11b5, B:304:0x129d, B:306:0x12a3, B:307:0x12a4, B:309:0x12a6, B:311:0x12ad, B:312:0x12ae, B:258:0x0f4e, B:270:0x105b, B:272:0x1061, B:273:0x10a8, B:275:0x10d2, B:276:0x111a, B:278:0x1130, B:279:0x1178, B:314:0x12b0, B:316:0x12b7, B:317:0x12b8, B:319:0x12ba, B:321:0x12c1, B:322:0x12c2, B:295:0x11e1, B:297:0x11e7, B:298:0x120b, B:265:0x0fbe, B:267:0x0fda, B:268:0x104f, B:260:0x0f6e, B:262:0x0f83, B:263:0x0fb7, B:300:0x121d), top: B:803:0x0ea7, outer: #38, inners: #2, #6, #8, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x118e A[Catch: all -> 0x12c3, TryCatch #15 {all -> 0x12c3, blocks: (B:249:0x0ea7, B:251:0x0ead, B:252:0x0ef2, B:254:0x0eff, B:256:0x0f08, B:257:0x0f43, B:280:0x117e, B:281:0x1182, B:284:0x118e, B:287:0x11a5, B:290:0x11b2, B:292:0x11b5, B:304:0x129d, B:306:0x12a3, B:307:0x12a4, B:309:0x12a6, B:311:0x12ad, B:312:0x12ae, B:258:0x0f4e, B:270:0x105b, B:272:0x1061, B:273:0x10a8, B:275:0x10d2, B:276:0x111a, B:278:0x1130, B:279:0x1178, B:314:0x12b0, B:316:0x12b7, B:317:0x12b8, B:319:0x12ba, B:321:0x12c1, B:322:0x12c2, B:295:0x11e1, B:297:0x11e7, B:298:0x120b, B:265:0x0fbe, B:267:0x0fda, B:268:0x104f, B:260:0x0f6e, B:262:0x0f83, B:263:0x0fb7, B:300:0x121d), top: B:803:0x0ea7, outer: #38, inners: #2, #6, #8, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x13d8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x13fb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1412 A[Catch: all -> 0x14d6, TryCatch #20 {all -> 0x14d6, blocks: (B:350:0x13fd, B:352:0x1412, B:353:0x1442), top: B:812:0x13fd, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1455 A[Catch: all -> 0x14cc, TryCatch #18 {all -> 0x14cc, blocks: (B:354:0x1448, B:356:0x1455, B:357:0x14c4), top: B:808:0x1448, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x161e A[Catch: all -> 0x1986, TryCatch #41 {all -> 0x1986, blocks: (B:382:0x1618, B:384:0x161e, B:385:0x1668, B:387:0x1675, B:389:0x167e, B:390:0x16c1, B:410:0x187f, B:418:0x18e8, B:424:0x196a, B:426:0x1970, B:427:0x1971, B:429:0x1973, B:431:0x197a, B:432:0x197b, B:392:0x16cd, B:399:0x175a, B:401:0x1760, B:402:0x17a3, B:404:0x17cd, B:406:0x1819, B:408:0x182f, B:409:0x1875, B:434:0x197d, B:436:0x1984, B:437:0x1985, B:420:0x18ee, B:414:0x18b3, B:416:0x18b9, B:417:0x18e1, B:394:0x16ed, B:396:0x16ff, B:397:0x174e), top: B:848:0x1618, outer: #38, inners: #25, #28, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1675 A[Catch: all -> 0x1986, TryCatch #41 {all -> 0x1986, blocks: (B:382:0x1618, B:384:0x161e, B:385:0x1668, B:387:0x1675, B:389:0x167e, B:390:0x16c1, B:410:0x187f, B:418:0x18e8, B:424:0x196a, B:426:0x1970, B:427:0x1971, B:429:0x1973, B:431:0x197a, B:432:0x197b, B:392:0x16cd, B:399:0x175a, B:401:0x1760, B:402:0x17a3, B:404:0x17cd, B:406:0x1819, B:408:0x182f, B:409:0x1875, B:434:0x197d, B:436:0x1984, B:437:0x1985, B:420:0x18ee, B:414:0x18b3, B:416:0x18b9, B:417:0x18e1, B:394:0x16ed, B:396:0x16ff, B:397:0x174e), top: B:848:0x1618, outer: #38, inners: #25, #28, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x16cd A[Catch: all -> 0x1986, TRY_LEAVE, TryCatch #41 {all -> 0x1986, blocks: (B:382:0x1618, B:384:0x161e, B:385:0x1668, B:387:0x1675, B:389:0x167e, B:390:0x16c1, B:410:0x187f, B:418:0x18e8, B:424:0x196a, B:426:0x1970, B:427:0x1971, B:429:0x1973, B:431:0x197a, B:432:0x197b, B:392:0x16cd, B:399:0x175a, B:401:0x1760, B:402:0x17a3, B:404:0x17cd, B:406:0x1819, B:408:0x182f, B:409:0x1875, B:434:0x197d, B:436:0x1984, B:437:0x1985, B:420:0x18ee, B:414:0x18b3, B:416:0x18b9, B:417:0x18e1, B:394:0x16ed, B:396:0x16ff, B:397:0x174e), top: B:848:0x1618, outer: #38, inners: #25, #28, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1891  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x1aaa  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1b14  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1b6b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1c24  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1e7a  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x25b1  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x260b  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x265d  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x28db A[Catch: all -> 0x2a0a, TryCatch #43 {all -> 0x2a0a, blocks: (B:597:0x28d1, B:598:0x28d5, B:600:0x28db, B:603:0x28f5, B:567:0x269b, B:585:0x27b1, B:588:0x27f9, B:592:0x286b, B:596:0x28cb), top: B:851:0x269b }] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x2ac1 A[Catch: all -> 0x029b, TryCatch #49 {all -> 0x029b, blocks: (B:658:0x2abb, B:660:0x2ac1, B:661:0x2aef, B:692:0x2df3, B:694:0x2df9, B:695:0x2e25, B:729:0x312a, B:731:0x3130, B:732:0x3153, B:709:0x2f73, B:711:0x2f96, B:712:0x2fe5, B:524:0x2385, B:526:0x238b, B:527:0x23b6, B:529:0x23f0, B:530:0x243a, B:495:0x20ab, B:497:0x20c0, B:498:0x20f2, B:754:0x3234, B:756:0x323a, B:757:0x325e, B:759:0x3298, B:760:0x32d7, B:464:0x1c42, B:466:0x1c57, B:467:0x1c8c, B:469:0x1cc0, B:470:0x1d3c, B:444:0x19ee, B:446:0x19f4, B:447:0x1a1f, B:375:0x156f, B:377:0x1575, B:378:0x159d, B:329:0x132d, B:331:0x1333, B:332:0x135a, B:242:0x0df3, B:244:0x0df9, B:245:0x0e24, B:142:0x077a, B:144:0x0780, B:145:0x07a8, B:23:0x011a, B:25:0x0120, B:26:0x0146, B:28:0x020c, B:30:0x023d, B:31:0x0295), top: B:863:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:747:0x31fd  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x3389  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x338a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v64, types: [long] */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r7v144 */
    /* JADX WARN: Type inference failed for: r7v145 */
    /* JADX WARN: Type inference failed for: r7v146, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v161 */
    /* JADX WARN: Type inference failed for: r7v167, types: [long] */
    /* JADX WARN: Type inference failed for: r7v168 */
    /* JADX WARN: Type inference failed for: r7v169 */
    /* JADX WARN: Type inference failed for: r7v170 */
    /* JADX WARN: Type inference failed for: r7v171 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v175 */
    /* JADX WARN: Type inference failed for: r7v197 */
    /* JADX WARN: Type inference failed for: r7v198 */
    /* JADX WARN: Type inference failed for: r7v199 */
    /* JADX WARN: Type inference failed for: r7v200 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v207 */
    /* JADX WARN: Type inference failed for: r7v368 */
    /* JADX WARN: Type inference failed for: r7v369 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterKycActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$3MbDebVgqDEPeNjJPkfhz5WHYI0(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m10935instrumented$1$initView$V(sfcRegisterKycActivity, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static Unit m10931$r8$lambda$Q3lMZ1CKQ5wkwmWFynbE2iwtu4(SfcRegisterKycActivity sfcRegisterKycActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return addObserver$lambda$6(sfcRegisterKycActivity, resource);
        }
        addObserver$lambda$6(sfcRegisterKycActivity, resource);
        throw null;
    }

    public static void $r8$lambda$V_1HIuAUuFoc2cwvq8E9vc_y1ak(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m10934instrumented$0$initView$V(sfcRegisterKycActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component2 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10932$r8$lambda$eIubmarsvua8exPgYRJnArRXO8(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10933x903e4005(sfcRegisterKycActivity, view);
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Unit $r8$lambda$zVTQxmceLShAUDsBoAHIpI04DGE(SfcRegisterKycActivity sfcRegisterKycActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitDynamics$lambda$5 = initDynamics$lambda$5(sfcRegisterKycActivity, resource);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return unitInitDynamics$lambda$5;
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        component1();
        int i = equals + 45;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    private static void m10933x903e4005(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initDynamics$lambda$5$lambda$2(sfcRegisterKycActivity, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 77;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10934instrumented$0$initView$V(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$0(sfcRegisterKycActivity, view);
            Callback.onClick_exit();
            int i4 = component2 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10935instrumented$1$initView$V(SfcRegisterKycActivity sfcRegisterKycActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$1(sfcRegisterKycActivity, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 117;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        component3 = new char[]{33415, 33398, 33349, 33349, 33397, 33399, 33400, 33400, 33403, 33395, 33398, 33358, 33356, 33397, 33399, 33404, 33347, 33402, 33390, 33398, 33397, 33401, 33357, 33446, 33362, 33399, 33403, 33397, 33398, 33397, 33360, 33365, 33393, 33359, 33369, 33398, 33398, 33406, 33404, 33404, 33394, 33392, 33401, 33366, 33360, 33397, 33399, 33391, 33388, 33392, 33394, 33399, 33368, 33359, 33391, 33399, 33399, 33389, 33395, 33400, 33394, 33402, 33398, 33394, 33400, 33400, 33402, 33367, 33365, 33401, 33394, 33396, 33397, 33394, 33365, 33363, 33394, 33399, 33367, 33368, 33406, 33405, 33401, 33401, 33354, 33353, 33402, 33394, 33396, 33402, 33394, 33391, 33389, 33402, 33345, 33402, 33401, 33392, 33397, 33396, 33386, 33346, 33452, 33468, 33461, 33461, 33459, 33459, 33367, 33399, 33403, 33397, 33398, 33349, 33349, 33397, 33399, 33400, 33400, 33403, 33395, 33398, 33358, 33356, 33397, 33399, 33404, 33347, 33402, 33390, 33398, 33397, 33401, 33357, 33451, 33364, 33345, 33348, 33399, 33403};
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component1 = new char[]{33454, 33336, 33338, 33335, 33326, 33333, 33341, 33336, 33329, 33280, 33378, 33297, 33328, 33299, 33304, 33339, 33333, 33329, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33432, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33469, 33517, 33468, 33426, 33514, 33518, 33428, 33428, 33430, 33426, 33515, 33518, 33428, 33468, 33427, 33512, 33513, 33517, 33428, 33427, 33429, 33468, 33428, 33517, 33519, 33517, 33428, 33428, 33514, 33512, 33512, 33513, 33514, 33511, 33513, 33515, 33512, 33424, 33424, 33512, 33427, 33470, 33430, 33428, 33429, 33516, 33514, 33426, 33428, 33514, 33511, 33426, 33468, 33429, 33429, 33467, 33468, 33469, 33426, 33515, 33430, 33427, 33512, 33512, 33515, 33517, 33427, 33514, 33512, 33512, 33515, 33516, 33514, 33427, 33467, 33468, 33428, 33517, 33516, 33425, 33467, 33468, 33427, 33514, 33516, 33515, 33516, 33429, 33425, 33424, 33428, 33430, 33427, 33515, 33514, 33515, 33514, 33425, 33468, 33470, 33430, 33519, 33519, 33514, 33425, 33426, 33515, 33429, 33429, 33514, 33515, 33516, 33511, 33512, 33513, 33425, 33425, 33425, 33429, 33519, 33430, 33427, 33516, 33428, 33427, 33516, 33428, 33428, 33515, 33439, 33374, 33440, 33448, 33444, 33444, 33415, 33505, 33469, 33471, 33408, 33374, 33445, 33451, 33447, 33446, 33413, 33413, 33445, 33449, 33417, 33411, 33443, 33448, 33417, 33416, 33446, 33448, 33446, 33374, 33375, 33446, 33446, 33448, 33446, 33443, 33415, 33408, 33374, 33447, 33455, 33446, 33447, 33454, 33446, 33444, 33443, 33408, 33417, 33455, 33412, 33436, 33438, 33439, 33437, 33438, 33438, 33437, 33412, 33413, 33436, 33434, 33435, 33436, 33439, 33506, 33437, 33467, 33440, 33375, 33373, 33443, 33458, 33282, 33280, 33323, 33322, 33342, 33343, 33343, 33319, 33321, 33321, 33320, 33284, 33326, 33324, 33283, 33323, 33326, 33284, 33280, 33280, 33281, 33285, 33287, 33281, 33281, 33285, 33287, 33284, 33321, 33323, 33282, 33280, 33322, 33324, 33323, 33518, 33373, 33348, 33347, 33344, 33440, 33450, 33348, 33396, 33399, 33406, 33345, 33407, 33349, 33407, 33407, 33509, 33457, 33457, 33454, 33462, 33467, 33465, 33464, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33448, 33332, 33297, 33292, 33321, 33290, 33306, 33332, 33316, 33319, 33326, 33329, 33282, 33283, 33325, 33329, 33331, 33332, 33331, 33329, 33327, 33322, 33517, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33454, 33463, 33465, 33463, 33477, 33513, 33514, 33516, 33517, 33516, 33512, 33514, 33515, 33513, 33512, 33475, 33511, 33425, 33468, 33429, 33429, 33428, 33426, 33467, 33429, 33515, 33512, 33513, 33426, 33467, 33467, 33427, 33515, 33514, 33513, 33514, 33516, 33517, 33429, 33426, 33514, 33430, 33430, 33519, 33428, 33428, 33517, 33514, 33513, 33514, 33511, 33511, 33514, 33513, 33515, 33518, 33517, 33428, 33426, 33515, 33515, 33515, 33428, 33426, 33427, 33468, 33425, 33512, 33427, 33469, 33429, 33428, 33465, 33427, 33516, 33514, 33427, 33468, 33426, 33434, 33365, 33368, 33371, 33370, 33367, 33369, 33369, 33368, 33368, 33476, 33511, 33511, 33512, 33512, 33514, 33515, 33513, 33517, 33515, 33515};
        copydefault = -1495650845399410339L;
    }
}
