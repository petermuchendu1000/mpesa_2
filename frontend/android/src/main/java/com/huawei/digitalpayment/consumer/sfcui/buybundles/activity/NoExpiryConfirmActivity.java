package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.base.reporting.BuyBundlesEvent;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcExpiryConfirmByAirtimeBinding;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.BuyBundlesEventExtKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.ConfirmDisplayAdapter;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.RechargeInfo;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TransferRespMapperKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.ValidityType;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u001d\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0019j\b\u0012\u0004\u0012\u00020\u0018`\u0017H\u0002¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/NoExpiryConfirmActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivitySfcExpiryConfirmByAirtimeBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryViewModel;", "<init>", "()V", "withExpiryResp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "phoneNumber", "", "paymentMethod", "returnDestination", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "initListeners", "handleConfirm", "initView", "buildDisplayItems", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/checkout/model/entity/FundsSourceInfoDisplay$DisplayItemsBean;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "initToolbar", "title", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class NoExpiryConfirmActivity extends Hilt_NoExpiryConfirmActivity<ActivitySfcExpiryConfirmByAirtimeBinding, NoExpiryViewModel> {
    public static final int $stable = 8;
    private static byte[] ShareDataUIState;
    private static short[] component1;
    private static int component2;
    private static int component3;
    private static char[] component4;
    private static int copydefault;
    private static char equals;
    private static int getAsAtTimestamp;
    private String paymentMethod = Keys.PAY_METHOD_AIRTIME;
    private String phoneNumber;
    private String returnDestination;
    private WithExpiryResp withExpiryResp;
    private static final byte[] $$l = {46, -35, 45, 111};
    private static final int $$o = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {32, 13, -54, -47, -5, 66, -67, Ascii.SO, 5, -1, -16, Ascii.FF, -12, Ascii.DC2, -18, 75, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -64, 0, Ascii.FF, -12, Ascii.DC2, -18, 6, -2, 0, 70, -55, -5, -2, -7, Ascii.ETB, 0, -9, 8, 56, -23, -37, -2, -7, Ascii.ETB, 0, -9, 8, Ascii.DC2, -12, -9, 7, Ascii.SI, -16, 0, -2, 8, 66, -62, -11, 0, -8, Ascii.SYN, 0, 0, 6, -19, 10, -7, -11, 3, -2, 2, 2, 10, -8, -5, 67, -11, 3, -2, 2, 2, 10, -8, -5, 66, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -56, -7, 1, 9, -4, 8, 56, -50, -12, Ascii.VT, -13, 4, 7, 6, TarHeader.LF_CONTIG, -56, -5, -5, 70, -52, -11, 3, 1, -1, 2, 65, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -75, 1, Ascii.DLE, -20, 8, -16, Ascii.SO, 34, -28, -18, 20, 13, 13, -9, -32, 20, -18, Ascii.DLE};
    private static final int $$t = 64;
    private static final byte[] $$d = {68, -59, -116, 119, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 234;
    private static int hashCode = 1;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component3 = 0;
        private static int copydefault = 1;
        private final Function1 ShareDataUIState;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (obj instanceof Observer) {
                int i2 = copydefault + 21;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i4 = copydefault + 45;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return zAreEqual;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3 + 85;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i3 + 53;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = component3 + 99;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r7, short r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.$$l
            int r8 = r8 + 112
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.$$r(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.$$d
            int r7 = r7 + 4
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.h(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.$$s
            int r7 = r7 * 2
            int r1 = r7 + 10
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r5 = 105 - r5
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.i(short, short, int, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_sfc_expiry_confirm_by_airtime;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    private static void f(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 999, 31 - TextUtils.getOffsetBefore("", 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 61685), 1874745193, false, $$r(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 1) {
                j = 7083766810336261929L;
            } else {
                int i6 = $10 + 1;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = ShareDataUIState;
                long j2 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int i9 = (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) + 2983;
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 48;
                            char c2 = (char) (54462 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            byte length2 = (byte) $$l.length;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i9, windowTouchSlop, c2, -1178636483, false, $$r((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i8++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1000 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 31, (char) (61685 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1874745193, false, $$r(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component1[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ j)) + i5;
                try {
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component3), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 1697, View.getDefaultSize(0, 0) + 37, (char) KeyEvent.normalizeMetaState(0), -1454191902, false, $$r(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = ShareDataUIState;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        int i10 = 0;
                        while (i10 < length3) {
                            bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 7083766810336261929L);
                            i10++;
                            int i11 = $10 + 3;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (z) {
                            byte[] bArr6 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        } else {
                            short[] sArr = component1;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component4;
        int i4 = 64291;
        int i5 = -303193356;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 7422, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + i4), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 67;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 3;
                    }
                    i4 = 64291;
                    i5 = -303193356;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 111;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(equals)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 7423, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((Process.myPid() >> 22) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - View.resolveSize(0, 0), Process.getGidForName("") + 15, (char) (44463 - KeyEvent.normalizeMetaState(0)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 2944, Color.alpha(0) + 24, (char) (27637 - View.combineMeasuredStates(0, 0)), 794909189, false, $$r(b3, (byte) (b3 | 7), b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i12 = $11 + 99;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i14];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                        } else {
                            int i16 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i16];
                            cArr4[cancelall.component2 + 1] = cArr2[i17];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0141  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((NoExpiryViewModel) this.viewModel).getData().observe(this, new component3(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 107;
                ShareDataUIState = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    NoExpiryConfirmActivity.$r8$lambda$UrrluNAxku85oR3bz56ZRNQQ_vY(this.f$0, (Resource) obj);
                    obj2.hashCode();
                    throw null;
                }
                Unit unit$r8$lambda$UrrluNAxku85oR3bz56ZRNQQ_vY = NoExpiryConfirmActivity.$r8$lambda$UrrluNAxku85oR3bz56ZRNQQ_vY(this.f$0, (Resource) obj);
                int i4 = ShareDataUIState + 31;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit$r8$lambda$UrrluNAxku85oR3bz56ZRNQQ_vY;
                }
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = copy + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObserver$lambda$2(NoExpiryConfirmActivity noExpiryConfirmActivity, Resource resource) {
        String string;
        Integer responseCode;
        WithExpiryResp withExpiryResp;
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(noExpiryConfirmActivity, "");
        Utils.showOrHideLoading(noExpiryConfirmActivity, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
        } else if (resource.success()) {
            HaProxyResponse.Header header = ((HaProxyResponse) resource.getData()).getHeader();
            if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                if (header == null || (string = header.getCustomerMessage()) == null) {
                    string = noExpiryConfirmActivity.getString(R.string.system_failure);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                ToastUtils.showLong(string, new Object[0]);
                int i2 = copy + 17;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
            } else {
                TransferResp transferResp = new TransferResp();
                transferResp.setResponseCode("");
                String customerMessage = header.getCustomerMessage();
                if (customerMessage == null) {
                    customerMessage = "";
                }
                transferResp.setResponseDesc(customerMessage);
                WithExpiryResp withExpiryResp2 = noExpiryConfirmActivity.withExpiryResp;
                WithExpiryResp withExpiryResp3 = null;
                if (withExpiryResp2 == null) {
                    int i4 = getRequestBeneficiariesState + 53;
                    copy = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        withExpiryResp3.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    withExpiryResp = null;
                } else {
                    withExpiryResp = withExpiryResp2;
                }
                String str2 = noExpiryConfirmActivity.paymentMethod;
                String str3 = noExpiryConfirmActivity.phoneNumber;
                if (str3 == null) {
                    int i5 = getRequestBeneficiariesState + 121;
                    copy = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        withExpiryResp3.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                } else {
                    str = str3;
                }
                BuyBundlesEvent buyBundlesEvent$default = BuyBundlesEventExtKt.toBuyBundlesEvent$default(withExpiryResp, str2, str, false, 4, null);
                if (Intrinsics.areEqual(noExpiryConfirmActivity.paymentMethod, Keys.PAY_METHOD_MPESA)) {
                    Bundle bundle = new Bundle(3);
                    SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
                    String str4 = noExpiryConfirmActivity.phoneNumber;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str4 = null;
                    }
                    bundle.putString("phoneNumber", companion.formatterInputPhoneNumber(str4));
                    bundle.putSerializable(KeysConstants.KEY_TRANSFER_RESP, transferResp);
                    String str5 = noExpiryConfirmActivity.returnDestination;
                    if (str5 != null) {
                        int i6 = copy + 51;
                        getRequestBeneficiariesState = i6 % 128;
                        if (i6 % 2 == 0) {
                            bundle.putString("extra_return_destination", str5);
                            throw null;
                        }
                        bundle.putString("extra_return_destination", str5);
                    }
                    bundle.putParcelable(TransferRespMapperKt.EXTRA_BUY_BUNDLES_EVENT, buyBundlesEvent$default);
                    RouteUtils.routeWithExecute(noExpiryConfirmActivity, "/checkoutModule/sfcSTKResult", bundle);
                } else {
                    SfcPhoneNumberUtil.Companion companion2 = SfcPhoneNumberUtil.INSTANCE;
                    String str6 = noExpiryConfirmActivity.phoneNumber;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str6 = null;
                    }
                    String str7 = companion2.formatterInputPhoneNumber(str6);
                    String str8 = noExpiryConfirmActivity.phoneNumber;
                    if (str8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i7 = copy + 13;
                        getRequestBeneficiariesState = i7 % 128;
                        int i8 = i7 % 2;
                        str8 = null;
                    }
                    boolean zAreEqual = Intrinsics.areEqual(str8, SPUtils.getInstance().getString("recent_login_phone_number"));
                    WithExpiryResp withExpiryResp4 = noExpiryConfirmActivity.withExpiryResp;
                    if (withExpiryResp4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        withExpiryResp4 = null;
                    }
                    String title = withExpiryResp4.getTitle();
                    WithExpiryResp withExpiryResp5 = noExpiryConfirmActivity.withExpiryResp;
                    if (withExpiryResp5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        withExpiryResp3 = withExpiryResp5;
                    }
                    RouteUtils.routeWithExecute("/sfcModule/transactionCompletion", TransferRespMapperKt.getTransactionCompletionBundle$default(noExpiryConfirmActivity, str7, zAreEqual, ValidityType.NO_EXPIRY, title, withExpiryResp3.getValidity(), null, false, noExpiryConfirmActivity.returnDestination, buyBundlesEvent$default, BERTags.PRIVATE, null));
                    int i9 = copy + 81;
                    getRequestBeneficiariesState = i9 % 128;
                    int i10 = i9 % 2;
                }
                noExpiryConfirmActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void initListeners$lambda$3(NoExpiryConfirmActivity noExpiryConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(noExpiryConfirmActivity, "");
        noExpiryConfirmActivity.finish();
        int i4 = copy + 9;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void initListeners() {
        int i = 2 % 2;
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 111;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    NoExpiryConfirmActivity.$r8$lambda$xARlZO2z8_jlpnQPKBQesMjEn84(this.f$0, view);
                    throw null;
                }
                NoExpiryConfirmActivity.$r8$lambda$xARlZO2z8_jlpnQPKBQesMjEn84(this.f$0, view);
                int i4 = copydefault + 91;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 125;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                NoExpiryConfirmActivity.$r8$lambda$wpCexLHFvmBXDt00LoxS14OaFYs(this.f$0, view);
                if (i4 != 0) {
                    int i5 = 89 / 0;
                }
            }
        });
        int i2 = copy + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void initListeners$lambda$4(NoExpiryConfirmActivity noExpiryConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 29;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(noExpiryConfirmActivity, "");
        noExpiryConfirmActivity.handleConfirm();
        int i4 = getRequestBeneficiariesState + 85;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void handleConfirm() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        String str = string;
        WithExpiryResp withExpiryResp = null;
        if (str == null || str.length() == 0) {
            string = null;
        }
        if (string == null) {
            string = PhoneUtils.getRecentLoginPhone();
            int i2 = getRequestBeneficiariesState + 63;
            copy = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = string;
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        Intrinsics.checkNotNull(str2);
        String str3 = companion.formatterInputPhoneNumber(str2);
        SfcPhoneNumberUtil.Companion companion2 = SfcPhoneNumberUtil.INSTANCE;
        String str4 = this.phoneNumber;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        String str5 = companion2.formatterInputPhoneNumber(str4);
        String str6 = Intrinsics.areEqual(str5, str3) ? BuyAirtimeTypes.SELF : "other";
        WithExpiryResp withExpiryResp2 = this.withExpiryResp;
        if (withExpiryResp2 == null) {
            int i4 = copy + 73;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryResp2 = null;
        }
        String itemId = withExpiryResp2.getItemId();
        WithExpiryResp withExpiryResp3 = this.withExpiryResp;
        if (withExpiryResp3 == null) {
            int i6 = copy + 17;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i8 = copy + 125;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            withExpiryResp3 = null;
        }
        RechargeInfo rechargeInfo = new RechargeInfo(itemId, withExpiryResp3.getProductType(), str2, str5, str6);
        String str7 = this.paymentMethod;
        if (Intrinsics.areEqual(str7, Keys.PAY_METHOD_AIRTIME)) {
            NoExpiryViewModel noExpiryViewModel = (NoExpiryViewModel) this.viewModel;
            WithExpiryResp withExpiryResp4 = this.withExpiryResp;
            if (withExpiryResp4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                withExpiryResp = withExpiryResp4;
            }
            noExpiryViewModel.buyNoExpiryViaAirtime(rechargeInfo, withExpiryResp.getAmount());
            return;
        }
        if (!Intrinsics.areEqual(str7, Keys.PAY_METHOD_MPESA)) {
            ToastUtils.showShort("Please select a valid payment method.", new Object[0]);
            return;
        }
        NoExpiryViewModel noExpiryViewModel2 = (NoExpiryViewModel) this.viewModel;
        WithExpiryResp withExpiryResp5 = this.withExpiryResp;
        if (withExpiryResp5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            withExpiryResp = withExpiryResp5;
        }
        noExpiryViewModel2.buyNoExpiryViaMpesa(rechargeInfo, withExpiryResp.getAmount());
    }

    private final void initView() {
        int i = 2 % 2;
        Serializable serializableExtra = getIntent().getSerializableExtra("withExpiryResp");
        Intrinsics.checkNotNull(serializableExtra, "");
        this.withExpiryResp = (WithExpiryResp) serializableExtra;
        String stringExtra = getIntent().getStringExtra("phoneNumber");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.phoneNumber = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("");
        if (stringExtra2 == null) {
            int i2 = copy + 31;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stringExtra2 = Keys.PAY_METHOD_AIRTIME;
        }
        this.paymentMethod = stringExtra2;
        this.returnDestination = getIntent().getStringExtra(Keys.KEY_RETURN_DESTINATION);
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBinding = (ActivitySfcExpiryConfirmByAirtimeBinding) this.binding;
        activitySfcExpiryConfirmByAirtimeBinding.tvPayTitle.setText(getString(R.string.no_expiry_bundles));
        activitySfcExpiryConfirmByAirtimeBinding.ivAvatar.setImageResource(R.drawable.icon_bundle_no_expiry);
        RecyclerView recyclerView = activitySfcExpiryConfirmByAirtimeBinding.rvConfirm;
        recyclerView.addItemDecoration(new RecycleViewDivider(ColorUtils.getColor(R.color.color_cbd5e1), ConvertUtils.dp2px(1.0f)));
        recyclerView.setAdapter(new ConfirmDisplayAdapter(buildDisplayItems()));
        int i3 = copy + 47;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    private final ArrayList<FundsSourceInfoDisplay.DisplayItemsBean> buildDisplayItems() {
        int i = 2 % 2;
        ArrayList<FundsSourceInfoDisplay.DisplayItemsBean> arrayList = new ArrayList<>();
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        String recentLoginPhone = PhoneUtils.getRecentLoginPhone();
        Intrinsics.checkNotNullExpressionValue(recentLoginPhone, "");
        String str = companion.formatterInputPhoneNumber(recentLoginPhone);
        SfcPhoneNumberUtil.Companion companion2 = SfcPhoneNumberUtil.INSTANCE;
        String str2 = this.phoneNumber;
        WithExpiryResp withExpiryResp = null;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        if (!Intrinsics.areEqual(companion2.formatterInputPhoneNumber(str2), str)) {
            int i2 = getRequestBeneficiariesState + 17;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            ArrayList<FundsSourceInfoDisplay.DisplayItemsBean> arrayList2 = arrayList;
            String str3 = this.phoneNumber;
            if (str3 == null) {
                int i5 = i3 + 55;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i6 = 27 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                str3 = null;
            }
            arrayList2.add(new FundsSourceInfoDisplay.DisplayItemsBean("Phone Number", str3));
        }
        ArrayList<FundsSourceInfoDisplay.DisplayItemsBean> arrayList3 = arrayList;
        WithExpiryResp withExpiryResp2 = this.withExpiryResp;
        if (withExpiryResp2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryResp2 = null;
        }
        arrayList3.add(new FundsSourceInfoDisplay.DisplayItemsBean("Bundle", withExpiryResp2.getTitle()));
        WithExpiryResp withExpiryResp3 = this.withExpiryResp;
        if (withExpiryResp3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryResp3 = null;
        }
        String validity = withExpiryResp3.getValidity();
        if (validity.length() <= 0) {
            validity = null;
        }
        if (validity != null) {
            arrayList3.add(new FundsSourceInfoDisplay.DisplayItemsBean("Valid for", validity));
        }
        arrayList3.add(new FundsSourceInfoDisplay.DisplayItemsBean("Payment Method", this.paymentMethod));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ENGLISH;
        WithExpiryResp withExpiryResp4 = this.withExpiryResp;
        if (withExpiryResp4 == null) {
            int i7 = copy + 95;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            withExpiryResp = withExpiryResp4;
        }
        String str4 = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(Float.parseFloat(withExpiryResp.getAmount()))}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "");
        arrayList3.add(new FundsSourceInfoDisplay.DisplayItemsBean("Amount", "Ksh. " + str4));
        return arrayList;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(ImageFormat.getBitsPerPixel(0) + 740785605, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), 1577109907 + (ViewConfiguration.getEdgeSlop() >> 16), (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953980_res_0x7f13093c).substring(0, 4).codePointAt(3) - 122, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) + 740785514, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 1577109909 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 36, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = copy + 119;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i3 = copy + 27;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 41 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myPid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i5 = copy + 11;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
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
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 740785575, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1577109907, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952856_res_0x7f1304d8).substring(9, 10).codePointAt(0) - 39, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 740785629, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 105), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1577109880, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 32), AndroidCharacter.getMirror('0') - '7', objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = copy + 103;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 11;
            copy = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16770598) - Color.rgb(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getOffsetBefore("", 0) + 56, (char) View.MeasureSpec.getMode(0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i5 = 47 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6618, TextUtils.indexOf("", "", 0) + 42, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 6563, ((Process.getThreadPriority(0) + 20) >> 6) + 56, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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
    }

    /* JADX WARN: Can't wrap try/catch for region: R(51:0|2|(2:(2:9|(2:11|(2:16|(1:20)(1:19))(0))(2:14|(0)(0)))(1:21)|(9:23|862|24|(1:26)|27|28|29|(1:31)|32)(1:7))(0)|36|(2:965|37)|(16:39|949|40|45|46|957|47|(2:940|49)|53|54|918|(4:56|57|(1:59)|60)(14:61|(2:63|(1:69)(1:68))(1:71)|(21:73|74|923|75|936|76|(2:867|78)|82|83|929|84|(2:916|86)|90|91|92|(3:94|903|95)|96|(1:98)(1:100)|101|(2:103|104)|105)(1:157)|162|163|955|164|167|168|(1:170)|171|172|901|173)|106|(4:109|(2:111|994)(11:112|(3:114|(3:117|118|115)|995)|121|905|122|(1:124)|125|126|893|127|993)|128|107)|992|142)(13:45|46|957|47|(0)|53|54|918|(0)(0)|106|(1:107)|992|142)|174|872|175|(10:878|177|181|182|869|(5:184|185|(1:187)|188|189)(22:190|191|858|192|(3:194|967|195)|199|200|851|201|(2:854|203)|207|208|209|(1:211)|212|213|971|214|(3:216|969|217)(1:219)|220|(2:222|223)|224)|225|(4:228|(2:230|975)(11:231|(3:233|(3:236|237|234)|976)|240|953|241|(1:243)|244|245|943|246|974)|247|226)|973|259)(8:181|182|869|(0)(0)|225|(1:226)|973|259)|290|(9:909|291|(1:293)|294|(3:296|(1:298)|299)(22:300|301|897|302|(1:304)|305|306|890|307|(1:309)|310|311|312|(1:314)|315|316|883|317|(2:959|319)(1:321)|322|(1:324)|325)|326|(4:329|(2:331|(2:338|979)(11:339|(3:341|(3:344|345|342)|980)|346|870|347|(1:349)|350|351|860|352|978))(2:336|(0)(0))|353|327)|977|365)|366|(3:892|394|(1:400)(1:399))(1:404)|405|863|406|(1:408)|409|856|410|(1:412)|413|414|437|899|438|(3:440|853|441)|445|446|885|(5:448|449|(1:451)|452|453)(16:455|456|888|457|(2:961|459)|463|464|465|(2:467|468)|469|470|471|(1:473)(1:474)|475|(1:477)|478)|454|479|(9:482|876|483|(1:485)|486|487|488|865|489)|524|(1:526)|527|(3:529|(1:531)|532)(14:533|534|(1:536)|537|538|(1:540)|541|941|542|543|(1:545)(1:546)|547|(1:549)|550)|551|(1:553)(9:554|(3:556|(2:559|557)|991)|560|561|(1:563)|564|(1:566)|567|568)|569|(1:571)|572|(1:574)|575|(3:577|(1:579)|580)(16:582|583|(1:585)|586|(1:588)|589|590|(1:592)|593|951|594|595|(1:597)(1:598)|599|(1:601)|602)|581|603|(18:605|938|606|(13:932|608|613|(6:615|927|616|617|914|618)(1:623)|934|624|625|931|(4:627|628|(1:630)|631)(4:634|(2:636|(1:642)(1:641))|(19:644|645|919|646|(2:921|648)|652|653|907|654|(2:945|656)|660|661|662|(2:664|665)|666|(1:668)|669|(2:671|672)|673)|720)|674|(4:677|(2:679|983)(11:680|(3:682|(3:685|686|683)|984)|687|895|688|(1:690)|691|692|886|693|982)|694|675)|981|720)(11:613|(0)(0)|934|624|625|931|(0)(0)|674|(1:675)|981|720)|738|(1:740)|741|(3:743|(1:745)|746)(13:748|912|749|750|(1:752)|753|874|754|755|(1:757)|758|(1:760)|761)|747|762|(6:765|766|(1:768)|769|770|771)|772|(1:774)|775|(3:777|(1:779)|780)(14:782|783|(1:785)|786|787|(1:789)|790|947|791|792|(1:794)|795|(1:797)|798)|781|799|(1:996)(7:802|803|(1:805)|806|807|808|809))(10:819|(3:821|(4:824|(3:987|826|990)(3:986|827|989)|988|822)|985)|828|829|(1:831)|832|(1:834)|835|836|837)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x214c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x214d, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x215a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x215b, code lost:
    
        r11 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x215d, code lost:
    
        r1 = r0;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0c2d A[Catch: all -> 0x0d70, TryCatch #40 {all -> 0x0d70, blocks: (B:106:0x0c23, B:107:0x0c27, B:109:0x0c2d, B:112:0x0c48, B:75:0x0925, B:92:0x0afb, B:96:0x0b4a, B:101:0x0bbf, B:105:0x0c1b), top: B:923:0x0925 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0e49 A[Catch: all -> 0x07b6, TryCatch #6 {all -> 0x07b6, blocks: (B:168:0x0e43, B:170:0x0e49, B:171:0x0e73, B:284:0x1449, B:286:0x144f, B:287:0x147a, B:518:0x21fd, B:520:0x2203, B:521:0x222a, B:732:0x32a6, B:734:0x32ac, B:735:0x32d6, B:766:0x35e3, B:768:0x35e9, B:769:0x3618, B:803:0x392a, B:805:0x3930, B:806:0x3950, B:783:0x377a, B:785:0x379d, B:786:0x37e9, B:829:0x3a39, B:831:0x3a3f, B:832:0x3a64, B:834:0x3a9e, B:835:0x3ae2, B:583:0x2a12, B:585:0x2a27, B:586:0x2a58, B:588:0x2a8c, B:589:0x2b08, B:561:0x26a6, B:563:0x26ac, B:564:0x26d9, B:566:0x2713, B:567:0x2756, B:534:0x23e9, B:536:0x23fe, B:537:0x2430, B:431:0x1d1a, B:433:0x1d20, B:434:0x1d4f, B:386:0x1a7c, B:388:0x1a82, B:389:0x1aad, B:24:0x03c8, B:26:0x03ce, B:27:0x03fb, B:29:0x0724, B:31:0x0756, B:32:0x07b0, B:394:0x1b3d, B:396:0x1b41, B:417:0x1c2f, B:419:0x1c35, B:420:0x1c36, B:422:0x1c38, B:424:0x1c3f, B:425:0x1c40, B:400:0x1b4d), top: B:862:0x03c8, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0f4d A[Catch: all -> 0x133b, PHI: r1
  0x0f4d: PHI (r1v614 java.lang.Object) = (r1v608 java.lang.Object), (r1v613 java.lang.Object) binds: [B:176:0x0efd, B:177:0x0eff] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x133b, blocks: (B:175:0x0ef9, B:181:0x0f4d, B:190:0x0fb3, B:209:0x10be, B:212:0x1105), top: B:872:0x0ef9 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0f5a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0fb3 A[Catch: all -> 0x133b, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x133b, blocks: (B:175:0x0ef9, B:181:0x0f4d, B:190:0x0fb3, B:209:0x10be, B:212:0x1105), top: B:872:0x0ef9 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x11e7 A[Catch: all -> 0x131e, TryCatch #65 {all -> 0x131e, blocks: (B:225:0x11dd, B:226:0x11e1, B:228:0x11e7, B:231:0x1203, B:214:0x1114, B:220:0x117b, B:224:0x11d5), top: B:971:0x1114 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x144f A[Catch: all -> 0x07b6, TryCatch #6 {all -> 0x07b6, blocks: (B:168:0x0e43, B:170:0x0e49, B:171:0x0e73, B:284:0x1449, B:286:0x144f, B:287:0x147a, B:518:0x21fd, B:520:0x2203, B:521:0x222a, B:732:0x32a6, B:734:0x32ac, B:735:0x32d6, B:766:0x35e3, B:768:0x35e9, B:769:0x3618, B:803:0x392a, B:805:0x3930, B:806:0x3950, B:783:0x377a, B:785:0x379d, B:786:0x37e9, B:829:0x3a39, B:831:0x3a3f, B:832:0x3a64, B:834:0x3a9e, B:835:0x3ae2, B:583:0x2a12, B:585:0x2a27, B:586:0x2a58, B:588:0x2a8c, B:589:0x2b08, B:561:0x26a6, B:563:0x26ac, B:564:0x26d9, B:566:0x2713, B:567:0x2756, B:534:0x23e9, B:536:0x23fe, B:537:0x2430, B:431:0x1d1a, B:433:0x1d20, B:434:0x1d4f, B:386:0x1a7c, B:388:0x1a82, B:389:0x1aad, B:24:0x03c8, B:26:0x03ce, B:27:0x03fb, B:29:0x0724, B:31:0x0756, B:32:0x07b0, B:394:0x1b3d, B:396:0x1b41, B:417:0x1c2f, B:419:0x1c35, B:420:0x1c36, B:422:0x1c38, B:424:0x1c3f, B:425:0x1c40, B:400:0x1b4d), top: B:862:0x03c8, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x150f A[Catch: all -> 0x1963, TryCatch #32 {all -> 0x1963, blocks: (B:291:0x1509, B:293:0x150f, B:294:0x1559, B:296:0x1566, B:298:0x156f, B:299:0x15b3, B:356:0x1933, B:358:0x1939, B:359:0x193a, B:361:0x193c, B:363:0x1943, B:364:0x1944, B:300:0x15c0, B:312:0x16c5, B:314:0x16cb, B:315:0x1713, B:370:0x1950, B:372:0x1957, B:373:0x1958, B:375:0x195a, B:377:0x1961, B:378:0x1962, B:352:0x18b4, B:347:0x1872, B:349:0x1878, B:350:0x18a2, B:307:0x162e, B:309:0x164a, B:310:0x16b9, B:302:0x15e0, B:304:0x15f5, B:305:0x1627), top: B:909:0x1509, inners: #5, #11, #22, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x1566 A[Catch: all -> 0x1963, TryCatch #32 {all -> 0x1963, blocks: (B:291:0x1509, B:293:0x150f, B:294:0x1559, B:296:0x1566, B:298:0x156f, B:299:0x15b3, B:356:0x1933, B:358:0x1939, B:359:0x193a, B:361:0x193c, B:363:0x1943, B:364:0x1944, B:300:0x15c0, B:312:0x16c5, B:314:0x16cb, B:315:0x1713, B:370:0x1950, B:372:0x1957, B:373:0x1958, B:375:0x195a, B:377:0x1961, B:378:0x1962, B:352:0x18b4, B:347:0x1872, B:349:0x1878, B:350:0x18a2, B:307:0x162e, B:309:0x164a, B:310:0x16b9, B:302:0x15e0, B:304:0x15f5, B:305:0x1627), top: B:909:0x1509, inners: #5, #11, #22, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x15c0 A[Catch: all -> 0x1963, TRY_LEAVE, TryCatch #32 {all -> 0x1963, blocks: (B:291:0x1509, B:293:0x150f, B:294:0x1559, B:296:0x1566, B:298:0x156f, B:299:0x15b3, B:356:0x1933, B:358:0x1939, B:359:0x193a, B:361:0x193c, B:363:0x1943, B:364:0x1944, B:300:0x15c0, B:312:0x16c5, B:314:0x16cb, B:315:0x1713, B:370:0x1950, B:372:0x1957, B:373:0x1958, B:375:0x195a, B:377:0x1961, B:378:0x1962, B:352:0x18b4, B:347:0x1872, B:349:0x1878, B:350:0x18a2, B:307:0x162e, B:309:0x164a, B:310:0x16b9, B:302:0x15e0, B:304:0x15f5, B:305:0x1627), top: B:909:0x1509, inners: #5, #11, #22, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x17ee  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x182e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x1832 A[Catch: all -> 0x194b, PHI: r2 r4 r5
  0x1832: PHI (r2v623 java.lang.Object[]) = (r2v622 java.lang.Object[]), (r2v644 java.lang.Object[]) binds: [B:337:0x182c, B:332:0x180f] A[DONT_GENERATE, DONT_INLINE]
  0x1832: PHI (r4v528 int) = (r4v527 int), (r4v544 int) binds: [B:337:0x182c, B:332:0x180f] A[DONT_GENERATE, DONT_INLINE]
  0x1832: PHI (r5v529 int) = (r5v528 int), (r5v552 int) binds: [B:337:0x182c, B:332:0x180f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #18 {all -> 0x194b, blocks: (B:326:0x17e4, B:327:0x17e8, B:339:0x1832, B:336:0x1818, B:317:0x1722, B:322:0x1785, B:325:0x17dc), top: B:883:0x1722 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1a82 A[Catch: all -> 0x07b6, TryCatch #6 {all -> 0x07b6, blocks: (B:168:0x0e43, B:170:0x0e49, B:171:0x0e73, B:284:0x1449, B:286:0x144f, B:287:0x147a, B:518:0x21fd, B:520:0x2203, B:521:0x222a, B:732:0x32a6, B:734:0x32ac, B:735:0x32d6, B:766:0x35e3, B:768:0x35e9, B:769:0x3618, B:803:0x392a, B:805:0x3930, B:806:0x3950, B:783:0x377a, B:785:0x379d, B:786:0x37e9, B:829:0x3a39, B:831:0x3a3f, B:832:0x3a64, B:834:0x3a9e, B:835:0x3ae2, B:583:0x2a12, B:585:0x2a27, B:586:0x2a58, B:588:0x2a8c, B:589:0x2b08, B:561:0x26a6, B:563:0x26ac, B:564:0x26d9, B:566:0x2713, B:567:0x2756, B:534:0x23e9, B:536:0x23fe, B:537:0x2430, B:431:0x1d1a, B:433:0x1d20, B:434:0x1d4f, B:386:0x1a7c, B:388:0x1a82, B:389:0x1aad, B:24:0x03c8, B:26:0x03ce, B:27:0x03fb, B:29:0x0724, B:31:0x0756, B:32:0x07b0, B:394:0x1b3d, B:396:0x1b41, B:417:0x1c2f, B:419:0x1c35, B:420:0x1c36, B:422:0x1c38, B:424:0x1c3f, B:425:0x1c40, B:400:0x1b4d), top: B:862:0x03c8, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x1b56  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x1b6d A[Catch: all -> 0x1c37, TryCatch #7 {all -> 0x1c37, blocks: (B:406:0x1b58, B:408:0x1b6d, B:409:0x1ba1), top: B:863:0x1b58, outer: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x1bb4 A[Catch: all -> 0x1c2d, TryCatch #3 {all -> 0x1c2d, blocks: (B:410:0x1ba7, B:412:0x1bb4, B:413:0x1c24), top: B:856:0x1ba7, outer: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1ddd  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1e36  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1e95 A[Catch: all -> 0x215a, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x215a, blocks: (B:438:0x1dd7, B:445:0x1e29, B:455:0x1e95, B:465:0x1f27, B:469:0x1f74), top: B:899:0x1dd7 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x205d  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x2203 A[Catch: all -> 0x07b6, TryCatch #6 {all -> 0x07b6, blocks: (B:168:0x0e43, B:170:0x0e49, B:171:0x0e73, B:284:0x1449, B:286:0x144f, B:287:0x147a, B:518:0x21fd, B:520:0x2203, B:521:0x222a, B:732:0x32a6, B:734:0x32ac, B:735:0x32d6, B:766:0x35e3, B:768:0x35e9, B:769:0x3618, B:803:0x392a, B:805:0x3930, B:806:0x3950, B:783:0x377a, B:785:0x379d, B:786:0x37e9, B:829:0x3a39, B:831:0x3a3f, B:832:0x3a64, B:834:0x3a9e, B:835:0x3ae2, B:583:0x2a12, B:585:0x2a27, B:586:0x2a58, B:588:0x2a8c, B:589:0x2b08, B:561:0x26a6, B:563:0x26ac, B:564:0x26d9, B:566:0x2713, B:567:0x2756, B:534:0x23e9, B:536:0x23fe, B:537:0x2430, B:431:0x1d1a, B:433:0x1d20, B:434:0x1d4f, B:386:0x1a7c, B:388:0x1a82, B:389:0x1aad, B:24:0x03c8, B:26:0x03ce, B:27:0x03fb, B:29:0x0724, B:31:0x0756, B:32:0x07b0, B:394:0x1b3d, B:396:0x1b41, B:417:0x1c2f, B:419:0x1c35, B:420:0x1c36, B:422:0x1c38, B:424:0x1c3f, B:425:0x1c40, B:400:0x1b4d), top: B:862:0x03c8, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x22b6  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x2308  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x23c9  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x2571  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x2664  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x2856  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x28c4  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x291f  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x29f2  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x2c4a  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x2dac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x2df8  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x2e10  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x2e68  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x30b9 A[Catch: all -> 0x31fe, TryCatch #46 {all -> 0x31fe, blocks: (B:624:0x2dfa, B:674:0x30af, B:675:0x30b3, B:677:0x30b9, B:680:0x30d4, B:644:0x2e84, B:662:0x2f99, B:666:0x2fe3, B:669:0x304f, B:673:0x30a9), top: B:934:0x2dfa }] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x32ac A[Catch: all -> 0x07b6, TryCatch #6 {all -> 0x07b6, blocks: (B:168:0x0e43, B:170:0x0e49, B:171:0x0e73, B:284:0x1449, B:286:0x144f, B:287:0x147a, B:518:0x21fd, B:520:0x2203, B:521:0x222a, B:732:0x32a6, B:734:0x32ac, B:735:0x32d6, B:766:0x35e3, B:768:0x35e9, B:769:0x3618, B:803:0x392a, B:805:0x3930, B:806:0x3950, B:783:0x377a, B:785:0x379d, B:786:0x37e9, B:829:0x3a39, B:831:0x3a3f, B:832:0x3a64, B:834:0x3a9e, B:835:0x3ae2, B:583:0x2a12, B:585:0x2a27, B:586:0x2a58, B:588:0x2a8c, B:589:0x2b08, B:561:0x26a6, B:563:0x26ac, B:564:0x26d9, B:566:0x2713, B:567:0x2756, B:534:0x23e9, B:536:0x23fe, B:537:0x2430, B:431:0x1d1a, B:433:0x1d20, B:434:0x1d4f, B:386:0x1a7c, B:388:0x1a82, B:389:0x1aad, B:24:0x03c8, B:26:0x03ce, B:27:0x03fb, B:29:0x0724, B:31:0x0756, B:32:0x07b0, B:394:0x1b3d, B:396:0x1b41, B:417:0x1c2f, B:419:0x1c35, B:420:0x1c36, B:422:0x1c38, B:424:0x1c3f, B:425:0x1c40, B:400:0x1b4d), top: B:862:0x03c8, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x335f  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x33af  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x3408  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x35c0  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x36b3  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x3705  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x375c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x390c  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x39ee  */
    /* JADX WARN: Removed duplicated region for block: B:878:0x0eff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:892:0x1b3d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:940:0x083b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:996:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v102 */
    /* JADX WARN: Type inference failed for: r10v103 */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v184 */
    /* JADX WARN: Type inference failed for: r11v185 */
    /* JADX WARN: Type inference failed for: r11v186 */
    /* JADX WARN: Type inference failed for: r11v187 */
    /* JADX WARN: Type inference failed for: r11v188 */
    /* JADX WARN: Type inference failed for: r11v189 */
    /* JADX WARN: Type inference failed for: r11v190 */
    /* JADX WARN: Type inference failed for: r11v191 */
    /* JADX WARN: Type inference failed for: r11v192 */
    /* JADX WARN: Type inference failed for: r11v193 */
    /* JADX WARN: Type inference failed for: r11v194 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v196 */
    /* JADX WARN: Type inference failed for: r11v197 */
    /* JADX WARN: Type inference failed for: r11v198 */
    /* JADX WARN: Type inference failed for: r11v199 */
    /* JADX WARN: Type inference failed for: r11v200 */
    /* JADX WARN: Type inference failed for: r11v201 */
    /* JADX WARN: Type inference failed for: r11v202 */
    /* JADX WARN: Type inference failed for: r11v203 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v94, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r38v149 */
    /* JADX WARN: Type inference failed for: r38v150 */
    /* JADX WARN: Type inference failed for: r38v151 */
    /* JADX WARN: Type inference failed for: r38v152 */
    /* JADX WARN: Type inference failed for: r38v153 */
    /* JADX WARN: Type inference failed for: r38v154 */
    /* JADX WARN: Type inference failed for: r38v155 */
    /* JADX WARN: Type inference failed for: r38v156 */
    /* JADX WARN: Type inference failed for: r38v157 */
    /* JADX WARN: Type inference failed for: r38v158 */
    /* JADX WARN: Type inference failed for: r38v159 */
    /* JADX WARN: Type inference failed for: r38v160 */
    /* JADX WARN: Type inference failed for: r38v161 */
    /* JADX WARN: Type inference failed for: r38v162 */
    /* JADX WARN: Type inference failed for: r38v163 */
    /* JADX WARN: Type inference failed for: r38v164 */
    /* JADX WARN: Type inference failed for: r38v165 */
    /* JADX WARN: Type inference failed for: r38v166 */
    /* JADX WARN: Type inference failed for: r38v167 */
    /* JADX WARN: Type inference failed for: r38v168 */
    /* JADX WARN: Type inference failed for: r38v169 */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v18 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v21 */
    /* JADX WARN: Type inference failed for: r38v22 */
    /* JADX WARN: Type inference failed for: r38v23 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v33 */
    /* JADX WARN: Type inference failed for: r38v34 */
    /* JADX WARN: Type inference failed for: r38v35 */
    /* JADX WARN: Type inference failed for: r38v36 */
    /* JADX WARN: Type inference failed for: r38v37 */
    /* JADX WARN: Type inference failed for: r38v38 */
    /* JADX WARN: Type inference failed for: r38v45 */
    /* JADX WARN: Type inference failed for: r38v46 */
    /* JADX WARN: Type inference failed for: r38v47 */
    /* JADX WARN: Type inference failed for: r38v48 */
    /* JADX WARN: Type inference failed for: r38v62 */
    /* JADX WARN: Type inference failed for: r38v63 */
    /* JADX WARN: Type inference failed for: r38v64 */
    /* JADX WARN: Type inference failed for: r38v65 */
    /* JADX WARN: Type inference failed for: r38v70 */
    /* JADX WARN: Type inference failed for: r38v75 */
    /* JADX WARN: Type inference failed for: r4v670 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v110 */
    /* JADX WARN: Type inference failed for: r8v111, types: [long] */
    /* JADX WARN: Type inference failed for: r8v112 */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v114, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v116 */
    /* JADX WARN: Type inference failed for: r8v117 */
    /* JADX WARN: Type inference failed for: r8v118 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v127 */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v61, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.NoExpiryConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$UrrluNAxku85oR3bz56ZRNQQ_vY(NoExpiryConfirmActivity noExpiryConfirmActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$2 = initObserver$lambda$2(noExpiryConfirmActivity, resource);
        int i4 = copy + 101;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return unitInitObserver$lambda$2;
    }

    public static void $r8$lambda$wpCexLHFvmBXDt00LoxS14OaFYs(NoExpiryConfirmActivity noExpiryConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m11192instrumented$1$initListeners$V(noExpiryConfirmActivity, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$xARlZO2z8_jlpnQPKBQesMjEn84(NoExpiryConfirmActivity noExpiryConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 89;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m11191instrumented$0$initListeners$V(noExpiryConfirmActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 41;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        int i = hashCode + 95;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    private static void m11191instrumented$0$initListeners$V(NoExpiryConfirmActivity noExpiryConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListeners$lambda$3(noExpiryConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = copy + 87;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m11192instrumented$1$initListeners$V(NoExpiryConfirmActivity noExpiryConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListeners$lambda$4(noExpiryConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = copy + 19;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 31;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = 571733351;
        component2 = -238323921;
        component3 = 1345602023;
        ShareDataUIState = new byte[]{37, 41, 39, 43, -35, -44, Ascii.VT, Ascii.VT, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, Base64.padSymbol, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, 37, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 47, 32, -38, 41, -44, 59, 3, 7, -44, 42, -42, 44, -43, -41, -4, -41, 3, 46, 40, 40, -26, -43, -42, 41, 44, -42, 7, -25, 7, 45, -26, 6, 42, -5, 5, 41, 45, -26, 5, -8, Ascii.ESC, -45, 41, 42, -6, Ascii.SUB, -30, 43, 5, 40, -7, Ascii.FS, -47, -15, 19, 42, -44, 47, -46, -42, 47, -44, -41, -5, 7, 40, -4, 40, 6, -25, Ascii.SUB, -43, 41, -26, Ascii.FS, -47, 40, -4, 41, Ascii.ESC, -28, -42, 42, -42, 2, 33, -25, 5, -41, 43, 42, -26, 40, 2, 44, 42, -29, Ascii.US, -25, 3, 33, -44, -7, 41, 4, -44, 44, 42, -30, Ascii.GS, -26, 41, 6, 45, -42, -41, -26, Ascii.ESC, 107, -42, 47, 32, -58, 56, Ascii.US, -44, -107, 110, -110, 40, 39, -41, -48, 44, 19, -17, -48, 38, Ascii.ESC, -21, -41, 37, Ascii.FS, -32, -38, 56, -59, 45, -41, 38, -37, 56, -59, 39, Ascii.DLE, -109, 40, 59, -41, -58, 58, -43, -38, 35, -35, 111, -27, -42, 5, 42, 43, 41, -43, 44, -43, 40, -25, Ascii.SUB, -43, -42, 42, -42, 46, 41, -36, -18, 42, -43, 41, 37, 41, 44, -45, 42, 42, -36, 35, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 35, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 57, 33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, 32, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, 44, -45, -44, 46, -46, 40, -44, 44, -46, 46, -41, 45, -48, 45, 40, 40, -45, 41, 40, 42, -44, 44, 43, -43, -41, 40, 45, -42, 45, -45, 44, -48};
        component4 = new char[]{2019, 1975, 1972, 1971, 2022, 2005, 1051, 2023, 2041, 1973, 1965, 2017, 2016, 2021, 2025, 1977, 2029, 1968, 1050, 2020, 1974, 1970, 2018, 1976, 1969};
        equals = (char) 12831;
    }
}
