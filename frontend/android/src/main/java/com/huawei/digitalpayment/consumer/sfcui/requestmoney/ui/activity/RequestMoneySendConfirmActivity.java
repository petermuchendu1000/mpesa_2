package com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.checkout.constant.SfcTradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.SfcPayManager;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.base.ui.dialog.SfcCommonBottomDialog;
import com.huawei.digitalpayment.consumer.base.util.AmountUtil;
import com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.base.util.TimestampFormatterUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityRequestMoneySendConfirmBinding;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyOrderInfo;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import okhttp3.internal.Util;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/activity/RequestMoneySendConfirmActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityRequestMoneySendConfirmBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyOrderViewModel;", "<init>", "()V", "requestMoneyOrderInfo", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "configDisplayItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/ConfigDisplayItem;", "getLayoutId", "", "initToolbar", "", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initData", "addConfigItem", "value", "initView", "initObserver", "rejectOrder", "doTransferAmount", "showTimeLast", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RequestMoneySendConfirmActivity extends Hilt_RequestMoneySendConfirmActivity<ActivityRequestMoneySendConfirmBinding, RequestMoneyOrderViewModel> {
    public static final int $stable = 8;
    private static long component1;
    private static char[] component3;
    private static long copydefault;
    private static int getRequestBeneficiariesState;
    private final List<ConfigDisplayItem> configDisplayItems = new ArrayList();
    private RequestMoneyOrderInfo requestMoneyOrderInfo;
    private static final byte[] $$l = {77, -67, -125, 9};
    private static final int $$o = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {TarHeader.LF_NORMAL, 86, 58, 71, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -67, 8, -23, Ascii.VT, -17, 5, 4, -15, 58, -63, -9, -10, Ascii.VT, -17, 0, 9, -15, 58, -38, -21, -21, Ascii.VT, -6, -11, 7, -5, -14, 3, Ascii.SO, -33, Ascii.VT, -21, -5, 10, Ascii.CAN, -41, -10, 47, -53, -4, 13, -28, 81, -17, -16, -2, -7, -3, -3, 5, -13, -10, 63, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -80, -2, Ascii.VT, -9, 3, TarHeader.LF_DIR, -70, 8, -6, 46, -1, -10, 5, -58, -5, -2, -16, 7, -5, -17, SignedBytes.MAX_POWER_OF_TWO, -24, -35, -21, Ascii.VT, -16, 7, -5, 20, -28, -19, Ascii.SI, -7, -1, -23, Ascii.SI, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT};
    private static final int $$t = 156;
    private static final byte[] $$d = {TarHeader.LF_BLK, -107, 59, -11, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 5;
    private static int component4 = 1;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int component3 = 1;
        private final Function1 component1;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                if (r1 == 0) goto L26
                int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.component2.component3
                int r1 = r1 + 13
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.component2.component2 = r2
                int r1 = r1 % r0
                boolean r1 = r4 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L26
                r1 = r3
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r4 = (kotlin.jvm.internal.FunctionAdapter) r4
                kotlin.Function r4 = r4.getFunctionDelegate()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                goto L27
            L26:
                r4 = 0
            L27:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.component2.component2
                int r1 = r1 + 87
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.component2.component3 = r2
                int r1 = r1 % r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2 + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component1;
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 51;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component2 + 83;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            int i4 = component3 + 123;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 + 102
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.$$l
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.$$r(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 100 - r7
            int r0 = r6 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.i(short, short, int, java.lang.Object[]):void");
    }

    private static void j(byte b2, int i, byte b3, Object[] objArr) {
        int i2 = 130 - b3;
        int i3 = (b2 * 16) + 83;
        byte[] bArr = $$s;
        byte[] bArr2 = new byte[63 - i];
        int i4 = 62 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i4)) - 4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i2])) - 4;
                i2++;
            }
        }
    }

    public static final RequestMoneyOrderInfo access$getRequestMoneyOrderInfo$p(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RequestMoneyOrderInfo requestMoneyOrderInfo = requestMoneySendConfirmActivity.requestMoneyOrderInfo;
        if (i3 != 0) {
            return requestMoneyOrderInfo;
        }
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.layout.activity_request_money_send_confirm;
            throw null;
        }
        int i4 = R.layout.activity_request_money_send_confirm;
        int i5 = ShareDataUIState + 33;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 35;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 3266, TextUtils.indexOf("", "") + 33, (char) (60268 - (Process.myTid() >> 22)), -834797019, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component1 / 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 3;
                        byte b5 = (byte) (b4 - 3);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 687, (ViewConfiguration.getScrollBarSize() >> 8) + 34, (char) (KeyEvent.getDeadChar(0, 0) + 60373), -1969106284, false, $$r(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - Drawable.resolveOpacity(0, 0), 33 - TextUtils.indexOf("", ""), (char) (60268 - View.resolveSize(0, 0)), -834797019, false, $$r(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 3);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 688, (ViewConfiguration.getLongPressTimeout() >> 16) + 34, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60373), -1969106284, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i6 = $10 + 107;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $11 + 83;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 3;
                byte b11 = (byte) (b10 - 3);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 687, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, (char) (60373 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -1969106284, false, $$r(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(char r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.h(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0188  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private final void initData() {
        int i = 2 % 2;
        Serializable serializableExtra = getIntent().getSerializableExtra("requestMoneyOrderInfo");
        Intrinsics.checkNotNull(serializableExtra, "");
        this.requestMoneyOrderInfo = (RequestMoneyOrderInfo) serializableExtra;
        this.configDisplayItems.clear();
        String string = getString(R.string.request_from);
        Intrinsics.checkNotNullExpressionValue(string, "");
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        RequestMoneyOrderInfo requestMoneyOrderInfo2 = null;
        if (requestMoneyOrderInfo == null) {
            int i2 = ShareDataUIState + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo = null;
        }
        addConfigItem(string, requestMoneyOrderInfo.getPayeeName());
        String string2 = getString(R.string.phone_number);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        RequestMoneyOrderInfo requestMoneyOrderInfo3 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo3 = null;
        }
        String payeeIdentifier = requestMoneyOrderInfo3.getPayeeIdentifier();
        if (payeeIdentifier == null) {
            payeeIdentifier = "";
        }
        addConfigItem(string2, companion.formatterPhoneNumberNoCountryCodePlusZero(payeeIdentifier));
        String string3 = getString(R.string.sfc_amount);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        RequestMoneyOrderInfo requestMoneyOrderInfo4 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo4 == null) {
            int i4 = component2 + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            requestMoneyOrderInfo2 = requestMoneyOrderInfo4;
        }
        addConfigItem(string3, "-Ksh " + requestMoneyOrderInfo2.getAmount());
    }

    public final void addConfigItem(String title, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Object obj = null;
        ConfigDisplayItem configDisplayItem = new ConfigDisplayItem(null, null, 3, null);
        configDisplayItem.setTitle(title);
        configDisplayItem.setValue(value);
        this.configDisplayItems.add(configDisplayItem);
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void initView$lambda$0(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMoneySendConfirmActivity, "");
            requestMoneySendConfirmActivity.finish();
            throw null;
        }
        Intrinsics.checkNotNullParameter(requestMoneySendConfirmActivity, "");
        requestMoneySendConfirmActivity.finish();
        int i3 = ShareDataUIState + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void initView$lambda$1(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneySendConfirmActivity, "");
        requestMoneySendConfirmActivity.doTransferAmount();
        int i4 = ShareDataUIState + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void initView$lambda$2(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneySendConfirmActivity, "");
        requestMoneySendConfirmActivity.rejectOrder();
        int i4 = ShareDataUIState + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initView() {
        int i = 2 % 2;
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        RequestMoneyOrderInfo requestMoneyOrderInfo2 = null;
        String str = "";
        if (requestMoneyOrderInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo = null;
        }
        if (TextUtils.isEmpty(requestMoneyOrderInfo.getPayeeAvatar())) {
            ((ActivityRequestMoneySendConfirmBinding) this.binding).ivAvatar.setVisibility(8);
            ((ActivityRequestMoneySendConfirmBinding) this.binding).cardAbbr.setVisibility(0);
            DefaultAvatarDisplayUtil defaultAvatarDisplayUtil = DefaultAvatarDisplayUtil.INSTANCE;
            TextView textView = ((ActivityRequestMoneySendConfirmBinding) this.binding).tvAbbr;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            RequestMoneyOrderInfo requestMoneyOrderInfo3 = this.requestMoneyOrderInfo;
            if (requestMoneyOrderInfo3 == null) {
                int i2 = ShareDataUIState + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                requestMoneyOrderInfo2 = requestMoneyOrderInfo3;
            }
            String payeeName = requestMoneyOrderInfo2.getPayeeName();
            if (payeeName == null) {
                int i4 = component2 + 27;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 88 / 0;
                }
            } else {
                str = payeeName;
            }
            defaultAvatarDisplayUtil.displayDefaultAvatar(textView, str);
        } else {
            RequestMoneyOrderInfo requestMoneyOrderInfo4 = this.requestMoneyOrderInfo;
            if (requestMoneyOrderInfo4 == null) {
                int i6 = ShareDataUIState + 65;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    requestMoneyOrderInfo2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                requestMoneyOrderInfo2 = requestMoneyOrderInfo4;
            }
            GlideUtils.load(Base64Mode.getConsumerMode(requestMoneyOrderInfo2.getPayeeAvatar()), ((ActivityRequestMoneySendConfirmBinding) this.binding).ivAvatar, R.mipmap.icon_default_avatar, R.mipmap.icon_default_avatar);
        }
        ((ActivityRequestMoneySendConfirmBinding) this.binding).rvConfirm.setLayoutManager(new LinearLayoutManager(this));
        final int i7 = R.layout.item_sfc_confirm_display;
        final List<ConfigDisplayItem> list = this.configDisplayItems;
        BaseQuickAdapter<ConfigDisplayItem, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<ConfigDisplayItem, BaseViewHolder>(i7, list) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void convert(BaseViewHolder baseViewHolder, ConfigDisplayItem configDisplayItem) {
                int i8 = 2 % 2;
                int i9 = copydefault + 67;
                component2 = i9 % 128;
                int i10 = i9 % 2;
                convert2(baseViewHolder, configDisplayItem);
                if (i10 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i11 = component2 + 101;
                copydefault = i11 % 128;
                int i12 = i11 % 2;
            }

            protected void convert2(BaseViewHolder holder, ConfigDisplayItem item) {
                int i8 = 2 % 2;
                int i9 = copydefault + 113;
                component2 = i9 % 128;
                if (i9 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(holder, "");
                    Intrinsics.checkNotNullParameter(item, "");
                    holder.setText(R.id.tv_label, item.getTitle());
                    holder.setText(R.id.tv_value, item.getValue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(holder, "");
                Intrinsics.checkNotNullParameter(item, "");
                holder.setText(R.id.tv_label, item.getTitle());
                holder.setText(R.id.tv_value, item.getValue());
                int i10 = component2 + 13;
                copydefault = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 78 / 0;
                }
            }
        };
        ((ActivityRequestMoneySendConfirmBinding) this.binding).rvConfirm.addItemDecoration(new RecycleViewDivider(ColorUtils.getColor(R.color.color_cbd5e1), ConvertUtils.dp2px(1.0f)));
        ((ActivityRequestMoneySendConfirmBinding) this.binding).rvConfirm.setAdapter(baseQuickAdapter);
        ((ActivityRequestMoneySendConfirmBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = copydefault + 79;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                RequestMoneySendConfirmActivity.$r8$lambda$CBtm08rO9YQrBc0QNPrcuHcwNgU(this.f$0, view);
                int i11 = copydefault + 91;
                component1 = i11 % 128;
                int i12 = i11 % 2;
            }
        });
        ((ActivityRequestMoneySendConfirmBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = component2 + 39;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                RequestMoneySendConfirmActivity.m11860$r8$lambda$52LQsztaYVVgDqAqdkQaThxzM4(this.f$0, view);
                int i11 = component2 + 31;
                component1 = i11 % 128;
                int i12 = i11 % 2;
            }
        });
        ((ActivityRequestMoneySendConfirmBinding) this.binding).btnReject.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = component1 + 91;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                RequestMoneySendConfirmActivity.$r8$lambda$D5ZNu44RCwsbuPW7x31KluQsP8A(this.f$0, view);
                if (i10 == 0) {
                    int i11 = 85 / 0;
                }
            }
        });
        showTimeLast();
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((RequestMoneyOrderViewModel) this.viewModel).cancelOrRejectOrder().observe(this, new component2(new Function1() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 125;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$2iW6k9KDKry7nYZ7XgOEX9rNKcU = RequestMoneySendConfirmActivity.$r8$lambda$2iW6k9KDKry7nYZ7XgOEX9rNKcU(this.f$0, (Resource) obj);
                int i5 = component2 + 35;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit$r8$lambda$2iW6k9KDKry7nYZ7XgOEX9rNKcU;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit initObserver$lambda$3(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneySendConfirmActivity, "");
        Utils.showOrHideLoading(requestMoneySendConfirmActivity, resource);
        if (!(!resource.error())) {
            int i2 = ShareDataUIState + 17;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                ToastUtils.showLong(resource.getMessage(), new Object[1]);
            } else {
                ToastUtils.showLong(resource.getMessage(), new Object[0]);
            }
        }
        if (resource.success()) {
            ToastUtils.showLong(requestMoneySendConfirmActivity.getString(R.string.decline_request_success), new Object[0]);
            Intent intent = new Intent();
            intent.putExtra(SplashEntryInfo.NEED_REFRESH, true);
            requestMoneySendConfirmActivity.setResult(-1, intent);
            requestMoneySendConfirmActivity.finish();
            int i3 = component2 + 125;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void rejectOrder$lambda$6$lambda$5(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneySendConfirmActivity, "");
        RequestMoneyOrderViewModel requestMoneyOrderViewModel = (RequestMoneyOrderViewModel) requestMoneySendConfirmActivity.viewModel;
        RequestMoneyOrderInfo requestMoneyOrderInfo = requestMoneySendConfirmActivity.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo == null) {
            int i2 = component2 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = ShareDataUIState + 11;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            requestMoneyOrderInfo = null;
        }
        requestMoneyOrderViewModel.cancelOrReject(requestMoneyOrderInfo.getRequestMoneyOrderId(), RequestMoneyResultActivity.TYPE_REJECTED);
    }

    private final void rejectOrder() {
        int i = 2 % 2;
        SfcCommonBottomDialog.Builder builder = new SfcCommonBottomDialog.Builder();
        builder.m10177setTitle(getString(R.string.decline_dialog_title));
        builder.setContent((CharSequence) getString(R.string.decline_dialog_content));
        builder.m10172setLeftButtonText(getString(R.string.request_back));
        builder.m10175setRightButtonText(getString(R.string.decline_dialog_yes));
        builder.m10174setLeftClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                RequestMoneySendConfirmActivity.$r8$lambda$aiCavOS22QJHXgMufTQLIKww83M(view);
                int i5 = copydefault + 61;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        builder.setRightClickListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 13;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    RequestMoneySendConfirmActivity.m11861$r8$lambda$nedRS1NM_vL4LCGmI1lRDuNv3I(this.f$0, view);
                    throw null;
                }
                RequestMoneySendConfirmActivity.m11861$r8$lambda$nedRS1NM_vL4LCGmI1lRDuNv3I(this.f$0, view);
                int i4 = component2 + 37;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        builder.build().show(getSupportFragmentManager(), "checkout fuliza");
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void doTransferAmount() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        AmountUtil amountUtil = AmountUtil.INSTANCE;
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        RequestMoneyOrderInfo requestMoneyOrderInfo2 = null;
        if (requestMoneyOrderInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo = null;
        }
        map.put("amount", amountUtil.formatAmountNoMil(requestMoneyOrderInfo.getAmount()));
        RequestMoneyOrderInfo requestMoneyOrderInfo3 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo3 == null) {
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo3 = null;
        }
        map.put("receiverMsisdn", requestMoneyOrderInfo3.getPayeeIdentifier());
        map.put("tradeType", "NativeApp");
        RequestMoneyOrderInfo requestMoneyOrderInfo4 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo4 == null) {
            int i4 = ShareDataUIState + 71;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                requestMoneyOrderInfo2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo4 = null;
        }
        map.put("requestMoneyOrderId", requestMoneyOrderInfo4.getRequestMoneyOrderId());
        map.put("type", "BizParam");
        RequestMoneyOrderInfo requestMoneyOrderInfo5 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo5 == null) {
            int i5 = component2 + 125;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo5 = null;
        }
        if (!TextUtils.isEmpty(requestMoneyOrderInfo5.getPayeeAvatar())) {
            int i7 = component2;
            int i8 = i7 + 55;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            RequestMoneyOrderInfo requestMoneyOrderInfo6 = this.requestMoneyOrderInfo;
            if (requestMoneyOrderInfo6 == null) {
                int i10 = i7 + 45;
                ShareDataUIState = i10 % 128;
                if (i10 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    requestMoneyOrderInfo2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                requestMoneyOrderInfo2 = requestMoneyOrderInfo6;
            }
            map.put("avatar", requestMoneyOrderInfo2.getPayeeAvatar());
            int i11 = component2 + 31;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
        }
        map.put("buttonText", getString(R.string.request_send));
        map.put("businessType", "RequestMoneyC2CForApp");
        SfcPayManager.INSTANCE.startPay(this, map, SfcTradeTypeEnum.REQUEST_MONEY, new ApiCallback<TransferResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i13 = 2 % 2;
                int i14 = component1 + 5;
                component3 = i14 % 128;
                int i15 = i14 % 2;
                onSuccess2(transferResp);
                int i16 = component3 + 77;
                component1 = i16 % 128;
                if (i16 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(TransferResp value) {
                int i13 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                Bundle bundle = new Bundle(1);
                bundle.putSerializable(KeysConstants.KEY_TRANSFER_RESP, value);
                RequestMoneyOrderInfo requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p = RequestMoneySendConfirmActivity.access$getRequestMoneyOrderInfo$p(this.component2);
                Object obj = null;
                if (requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i14 = component3 + 113;
                    component1 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 3 % 4;
                    }
                    requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p = null;
                }
                bundle.putSerializable("requestMoneyOrderInfo", requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p);
                bundle.putString("businessType", "P2PTransfer");
                RequestMoneyOrderInfo requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p2 = RequestMoneySendConfirmActivity.access$getRequestMoneyOrderInfo$p(this.component2);
                if (requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p2 = null;
                }
                bundle.putString(CheckIdentityActivity.ID_NUMBER, requestMoneyOrderInfoAccess$getRequestMoneyOrderInfo$p2.getPayeeIdentifier());
                RouteUtils.routeWithExecute("/checkoutModule/sfcRequestMoneyResult", bundle);
                int i16 = component3 + 117;
                component1 = i16 % 128;
                if (i16 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i13 = 2 % 2;
                int i14 = component1 + 101;
                component3 = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ToastUtils.showLong(e.getMessage(), new Object[0]);
                this.component2.finish();
                int i16 = component1 + 123;
                component3 = i16 % 128;
                int i17 = i16 % 2;
            }
        });
    }

    private final void showTimeLast() {
        int i = 2 % 2;
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        RequestMoneyOrderInfo requestMoneyOrderInfo2 = null;
        if (requestMoneyOrderInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo = null;
        }
        if (!(!TextUtils.isEmpty(requestMoneyOrderInfo.getExpireTime()))) {
            ((ActivityRequestMoneySendConfirmBinding) this.binding).tvDes.setVisibility(8);
            return;
        }
        RequestMoneyOrderInfo requestMoneyOrderInfo3 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo3 == null) {
            int i2 = ShareDataUIState + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            requestMoneyOrderInfo2 = requestMoneyOrderInfo3;
        }
        String expireTime = requestMoneyOrderInfo2.getExpireTime();
        Intrinsics.checkNotNull(expireTime);
        Date date = TimeUtils.getDate(expireTime, TimeUtils.DAY_MONTH_YEAR_HH_MM_SS);
        if (date == null) {
            return;
        }
        long jTimeLast = TimestampFormatterUtil.INSTANCE.timeLast(date.getTime()) / ((long) 1000);
        if (jTimeLast >= com.alibaba.griver.beehive.lottie.player.TimeUtils.DAY_TO_SECOND) {
            long j = jTimeLast / ((long) CacheConstants.DAY);
            TextView textView = ((ActivityRequestMoneySendConfirmBinding) this.binding).tvDes;
            String string = getString(R.string.request_money_valid_days);
            Intrinsics.checkNotNullExpressionValue(string, "");
            textView.setText(Util.format(string, Long.valueOf(j), getString(R.string.days)));
            return;
        }
        TextView textView2 = ((ActivityRequestMoneySendConfirmBinding) this.binding).tvDes;
        String string2 = getString(R.string.request_money_valid_days);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        textView2.setText(Util.format(string2, 0, getString(R.string.days)));
        int i4 = ShareDataUIState + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953368_res_0x7f1306d8).substring(0, 6).length() - 6), TextUtils.indexOf((CharSequence) "", '0') + 27, 5 - Color.blue(0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 15, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = component2 + 13;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = ShareDataUIState + 57;
            component2 = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0, 0), 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16783778, 56 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) View.resolveSize(0, 0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i7 = 48 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.getSize(0) + 42, (char) KeyEvent.getDeadChar(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 6562, 56 - (ViewConfiguration.getEdgeSlop() >> 16), (char) KeyEvent.getDeadChar(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
        int i8 = component2 + 111;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0123  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r48) {
        /*
            Method dump skipped, instruction units count: 14476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneySendConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$2iW6k9KDKry7nYZ7XgOEX9rNKcU(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            initObserver$lambda$3(requestMoneySendConfirmActivity, resource);
            obj.hashCode();
            throw null;
        }
        Unit unitInitObserver$lambda$3 = initObserver$lambda$3(requestMoneySendConfirmActivity, resource);
        int i3 = ShareDataUIState + 109;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitInitObserver$lambda$3;
        }
        throw null;
    }

    public static void m11860$r8$lambda$52LQsztaYVVgDqAqdkQaThxzM4(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m11864instrumented$1$initView$V(requestMoneySendConfirmActivity, view);
        int i4 = ShareDataUIState + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$CBtm08rO9YQrBc0QNPrcuHcwNgU(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m11862instrumented$0$initView$V(requestMoneySendConfirmActivity, view);
        int i4 = component2 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$D5ZNu44RCwsbuPW7x31KluQsP8A(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m11866instrumented$2$initView$V(requestMoneySendConfirmActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$aiCavOS22QJHXgMufTQLIKww83M(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m11863instrumented$0$rejectOrder$V(view);
        int i4 = component2 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m11861$r8$lambda$nedRS1NM_vL4LCGmI1lRDuNv3I(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m11865instrumented$1$rejectOrder$V(requestMoneySendConfirmActivity, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        int i = component4 + 41;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            int i2 = 40 / 0;
        }
    }

    private static void m11862instrumented$0$initView$V(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$0(requestMoneySendConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = component2 + 119;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m11863instrumented$0$rejectOrder$V(View view) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                rejectOrder$lambda$6$lambda$4(view);
                Callback.onClick_exit();
                int i4 = 49 / 0;
            } else {
                rejectOrder$lambda$6$lambda$4(view);
                Callback.onClick_exit();
            }
            int i5 = component2 + 41;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m11864instrumented$1$initView$V(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$1(requestMoneySendConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = component2 + 83;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m11865instrumented$1$rejectOrder$V(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                rejectOrder$lambda$6$lambda$5(requestMoneySendConfirmActivity, view);
                Callback.onClick_exit();
                int i4 = 81 / 0;
            } else {
                rejectOrder$lambda$6$lambda$5(requestMoneySendConfirmActivity, view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m11866instrumented$2$initView$V(RequestMoneySendConfirmActivity requestMoneySendConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initView$lambda$2(requestMoneySendConfirmActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            initView$lambda$2(requestMoneySendConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 27;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static final void rejectOrder$lambda$6$lambda$4(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = ShareDataUIState + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component1 = -3550826543368455942L;
        component3 = new char[]{3099, 19081, 33071, 57229, 5642, 3095, 19102, 33054, 57238, 5633, 27777, 43830, 57842, 14375, 30384, 52538, 2970, 17023, 39131, 55126, 11717, 25696, 41721, 63854, 14333, 36442, 50400, 896, 23065, 36999, 61188, 3093, 19077, 33032, 57238, 5643, 27782, 43814, 57757, 14390, 30384, 52518, 3037, 16989, 39129, 55126, 11717, 25721, 41726, 51153, 33039, 19085, 5188, 56734, 42777, 24823, 10879, 62384, 48485, 1722, 49227, 35265, 21325, 7297, 58972, 44978, 26983, 13033, 64631, 17833, 3965, 51202, 37343, 23316, 9374, 61002, 47014, 29050, 15103, 33890, 19948, 5909, 53399, 39500, 25555, 11610, 63191, 45111, 31163, 50038, 36082, 22140, 7943, 55436, 41481, 27536, 13640, 34021, 49717, 2536, 22388, 40703, 58493, 9104, 26910, 45269, 65031, 17882, 33569, 51878, 4143, 24544, 42350, 60548, 10753, 29059, 48967, 1695, 19535, 35683, 53998, 6271, 26530, 44335, 62662, 12873, 31169, 51029, 3727, 21543, 37801, 55672, 8423, 28266, 46573, 62210, 15070, 32836, 53145, 5394, 23652, 39865, 57708, 10486, 30332, 48531, 64323, 17050, 34823, 55256, 7505, 25845, 41509, 59825, 14130, 32434, 50189, 908, 18688, 37013, 56852, 3102, 19076, 33038, 57236, 5661, 27858, 43901, 57843, 14448, 30453, 52594, 2947, 16909, 39134, 55062, 11673, 25639, 41638, 63784, 14262, 36410, 50367, 913, 23070, 37064, 61204, 9602, 31782, 47803, 61753, 20406, 34351, 56535, 6979, 20942, 43018, 59081, 15709, 31731, 45678, 2274, 18291, 40443, 54401, 4895, 27018, 40967, 65218, 13621, 29631, 51767, 235, 24367, 38328, 60507, 10899, 24911, 49102, 63053, 19697, 35693, 49644, 6189, 22266, 44484, 58463, 8863, 30994, 46987, 3590, 17574, 33583, 27590, 11541, 59087, 47110, 29070, 2831, 52452, 34366, 24511, 4388, 43694, 27736, 9690, 65345, 45250, 19021, 1015, 50546, 40675, 20529, 59886, 41836, 25668, 15749, 63236, 35025, 16906, 7141, 56626, 38584, 10287, 57774, 47875, 31952, 13913, 53184, 45703, 62476, 16263, 24850, 43138, 53785, 5566, 24381, 34454, 51257, 29601, 46404, 64741, 9807, 27102, 37713, 24776, 9793, 60865, 45897, 31454, '^', 51177, 36141, 21750, 6764, 41403, 26424, 11928, 62484, 48009, 16662, 2212, 52748, 38313, 23348, 58034, 43068, 3091, 19100, 33051, 57236, 5661, 27789, 43830, 57742, 14371, 30369, 52518, 3008, 16983, 39125, 55111, 13412, 29419, 47462, 59390, 11888, 21745, 37711, 55758, Matrix.MATRIX_TYPE_ZERO, 20184, 62804, 3088, 19145, 33054, 57300, 5645, 27786, 43827, 57835, 14373, 30452, 52527, 3030, 16907, 39051, 55059, 11720, 25632, 41637, 63868, 14258, 36463, 50411, 918, 23112, 37076, 61270, 9693, 31792, 47804, 61803, 20388, 34430, 56463, 6996, 20867, 43024, 59030, 15646, 31655, 45604, 2275, 18227, 40379, 54418, 4893, 27081, 40963, 65240, 13616, 29673, 51772, 166, 24445, 38317, 60502, 10885, 24901, 49092, 62995, 19619, 35630, 49577, 6241, 22255, 3141, 19140, 33097, 57297, 5719, 27871, 43873, 57828, 14453, 30454, 52594};
        copydefault = -4791305608590505232L;
    }
}
