package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
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
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TransferRespMapperKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
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
import kotlin.cancel;
import kotlin.getSmallIconId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u001d\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001cj\b\u0012\u0004\u0012\u00020\u001b`\u001aH\u0002¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/AllInOneConfirmActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivitySfcExpiryConfirmByAirtimeBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "<init>", "()V", "withExpiryResp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "phoneNumber", "", "bundleType", "paymentMethod", "returnDestination", "TAG", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "initListener", "getPayTitle", "getAvatar", "initView", "buildDisplayItems", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/checkout/model/entity/FundsSourceInfoDisplay$DisplayItemsBean;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "initToolbar", "title", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class AllInOneConfirmActivity extends Hilt_AllInOneConfirmActivity<ActivitySfcExpiryConfirmByAirtimeBinding, BuyBundleViewModel> {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static boolean component1;
    private static int component2;
    private static int component3;
    private static short[] component4;
    private static int copy;
    private static boolean copydefault;
    private static int equals;
    private static byte[] getRequestBeneficiariesState;
    private static int getShareableDataState;
    private String phoneNumber;
    private String returnDestination;
    private WithExpiryResp withExpiryResp;
    private static final byte[] $$c = {Ascii.VT, -55, -20, -91};
    private static final int $$f = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {75, -35, 114, TarHeader.LF_CHR, -9, 5, 66, -48, -8, 6, 10, 4, 2, 4, TarHeader.LF_FIFO, -54, -8, Ascii.FF, -10, 20, -10, 71, -59, 0, -2, 3, Ascii.SO, 7, 58, -27, -32, -2, 3, Ascii.SO, 7, 36, -43, 20, -19, Ascii.EM, 2, -7, 10, 68, -10, 2, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 69, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 68, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, 3, Ascii.DC2, -18, 10, -14, Ascii.DLE, 36, -26, -16, Ascii.SYN, Ascii.SI, Ascii.SI, -7, -30, Ascii.SYN, -16, Ascii.DC2};
    private static final int $$h = 110;
    private static final byte[] $$a = {TarHeader.LF_BLK, -107, 59, -11, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 235;
    private static int getSponsorBeneficiariesState = 1;
    private static int getAsAtTimestamp = 0;
    private static int hashCode = 1;
    private String bundleType = "";
    private String paymentMethod = Keys.PAY_METHOD_AIRTIME;
    private final String TAG = "AllInOneConfirm";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int component1 = 1;
        private static int copydefault;
        private final Function1 ShareDataUIState;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r5
  0x001c: PHI (r5v1 boolean) = (r5v0 boolean), (r5v2 boolean) binds: [B:9:0x001a, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.component1.component1
                int r1 = r1 + 85
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.component1.copydefault = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L17
                boolean r1 = r7 instanceof androidx.lifecycle.Observer
                if (r1 == r4) goto L15
                goto L4d
            L15:
                r5 = r4
                goto L1e
            L17:
                boolean r1 = r7 instanceof androidx.lifecycle.Observer
                r5 = 0
                if (r1 == r4) goto L1e
            L1c:
                r4 = r5
                goto L4d
            L1e:
                boolean r1 = r7 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L1c
                int r2 = r2 + r4
                int r1 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.component1.component1 = r1
                int r2 = r2 % r0
                if (r2 == 0) goto L3c
                r1 = r6
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r7 = (kotlin.jvm.internal.FunctionAdapter) r7
                kotlin.Function r7 = r7.getFunctionDelegate()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
                goto L4d
            L3c:
                r0 = r6
                kotlin.jvm.internal.FunctionAdapter r0 = (kotlin.jvm.internal.FunctionAdapter) r0
                kotlin.Function r0 = r0.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r7 = (kotlin.jvm.internal.FunctionAdapter) r7
                kotlin.Function r7 = r7.getFunctionDelegate()
                kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
                throw r3
            L4d:
                int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.component1.component1
                int r7 = r7 + 85
                int r1 = r7 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.component1.copydefault = r1
                int r7 = r7 % r0
                if (r7 != 0) goto L59
                return r4
            L59:
                r3.hashCode()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.component1.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 117;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i2 + 65;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = copydefault + 79;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r5 = 116 - r5
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r6]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.$$i(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.$$a
            int r1 = 28 - r8
            byte[] r1 = new byte[r1]
            int r8 = 27 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.d(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.$$g
            int r7 = r7 + 4
            int r1 = r8 + 10
            int r6 = r6 * 16
            int r6 = r6 + 83
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L30
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.e(short, int, short, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_sfc_expiry_confirm_by_airtime;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        int i4 = 48;
        int i5 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) i5;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 24, (char) Color.blue(i5), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 2;
                    i4 = 48;
                    i5 = 0;
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
            Object[] objArr3 = {Integer.valueOf(component2)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            long j = 0;
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 7140, TextUtils.indexOf("", "") + 13, (char) ExpandableListView.getPackedPositionGroup(0L), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i9 = 43;
            if (copydefault) {
                int i10 = $11 + 69;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        int iMakeMeasureSpec = 2748 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int windowTouchSlop = 19 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        char packedPositionChild = (char) (7643 - ExpandableListView.getPackedPositionChild(j));
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, windowTouchSlop, packedPositionChild, -327556343, false, $$i((byte) 43, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    j = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (component1) {
                int i12 = $10 + 75;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) i9;
                        byte b6 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 20, (char) (7644 - TextUtils.indexOf("", "", 0)), -327556343, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    i9 = 43;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i14 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i14;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i15 = $10 + 17;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[cancelVar.component1 * cancelVar.component3] % i] * iIntValue);
                    i14 = cancelVar.component3 / 0;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i14 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void c(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(equals)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            long j = 0;
            if (objCopydefault == null) {
                byte b3 = (byte) 3;
                byte b4 = (byte) (b3 - 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 999, 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (61684 - ExpandableListView.getPackedPositionChild(0L)), 1874745193, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = getRequestBeneficiariesState;
                char c2 = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 39;
                        $11 = i12 % 128;
                        int i13 = i12 % i5;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2985 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), TextUtils.lastIndexOf("", c2) + 49, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 54461), -1178636483, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i5 = 2;
                            j = 0;
                            c2 = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getRequestBeneficiariesState;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(998 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 61685), 1874745193, false, $$i(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) equals) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) equals) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11;
                int i15 = i14 + 71;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((i + iIntValue) - 2) + ((int) (((long) component3) ^ 7083766810336261929L));
                if (z) {
                    int i18 = i14 + 1;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i17 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(copy), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte length2 = (byte) $$c.length;
                    byte b9 = (byte) (length2 - 4);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1697, Color.blue(0) + 37, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1454191902, false, $$i(length2, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = getRequestBeneficiariesState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i20 = 0; i20 < length3; i20++) {
                        bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                int i21 = $11 + 111;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((BuyBundleViewModel) this.viewModel).getData().observe(this, new component1(new Function1() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 51;
                ShareDataUIState = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    AllInOneConfirmActivity.m11174$r8$lambda$_ipcn3xRKsGqZsl3mQM_dgeDpI(this.f$0, (Resource) obj);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitM11174$r8$lambda$_ipcn3xRKsGqZsl3mQM_dgeDpI = AllInOneConfirmActivity.m11174$r8$lambda$_ipcn3xRKsGqZsl3mQM_dgeDpI(this.f$0, (Resource) obj);
                int i4 = ShareDataUIState + 51;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitM11174$r8$lambda$_ipcn3xRKsGqZsl3mQM_dgeDpI;
                }
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = getAsAtTimestamp + 53;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final Unit initObserver$lambda$1(AllInOneConfirmActivity allInOneConfirmActivity, Resource resource) {
        Integer responseCode;
        WithExpiryResp withExpiryResp;
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(allInOneConfirmActivity, "");
        Utils.showOrHideLoading(allInOneConfirmActivity, resource);
        if (!(!resource.error())) {
            int i2 = getAsAtTimestamp + 91;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
        }
        if (resource.success()) {
            HaProxyResponse.Header header = ((HaProxyResponse) resource.getData()).getHeader();
            String customerMessage = null;
            String str2 = null;
            WithExpiryResp withExpiryResp2 = null;
            if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                if (header != null) {
                    int i4 = hashCode + 107;
                    getAsAtTimestamp = i4 % 128;
                    if (i4 % 2 != 0) {
                        header.getCustomerMessage();
                        customerMessage.hashCode();
                        throw null;
                    }
                    customerMessage = header.getCustomerMessage();
                }
                ToastUtils.showLong(customerMessage != null ? customerMessage : "", new Object[0]);
            } else {
                TransferResp transferResp = new TransferResp();
                transferResp.setResponseCode("");
                String customerMessage2 = header.getCustomerMessage();
                if (customerMessage2 == null) {
                    customerMessage2 = "";
                }
                transferResp.setResponseDesc(customerMessage2);
                WithExpiryResp withExpiryResp3 = allInOneConfirmActivity.withExpiryResp;
                if (withExpiryResp3 == null) {
                    int i5 = hashCode + 105;
                    getAsAtTimestamp = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    withExpiryResp = null;
                } else {
                    withExpiryResp = withExpiryResp3;
                }
                String str3 = allInOneConfirmActivity.paymentMethod;
                String str4 = allInOneConfirmActivity.phoneNumber;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                } else {
                    str = str4;
                }
                BuyBundlesEvent buyBundlesEvent$default = BuyBundlesEventExtKt.toBuyBundlesEvent$default(withExpiryResp, str3, str, false, 4, null);
                if (Intrinsics.areEqual(allInOneConfirmActivity.paymentMethod, Keys.PAY_METHOD_MPESA)) {
                    Bundle bundle = new Bundle(3);
                    SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
                    String str5 = allInOneConfirmActivity.phoneNumber;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        str2 = str5;
                    }
                    bundle.putString("phoneNumber", companion.formatterInputPhoneNumber(str2));
                    bundle.putSerializable(KeysConstants.KEY_TRANSFER_RESP, transferResp);
                    String str6 = allInOneConfirmActivity.returnDestination;
                    if (str6 != null) {
                        bundle.putString("extra_return_destination", str6);
                    }
                    bundle.putParcelable(TransferRespMapperKt.EXTRA_BUY_BUNDLES_EVENT, buyBundlesEvent$default);
                    RouteUtils.routeWithExecute(allInOneConfirmActivity, "/checkoutModule/sfcSTKResult", bundle);
                } else {
                    SfcPhoneNumberUtil.Companion companion2 = SfcPhoneNumberUtil.INSTANCE;
                    String str7 = allInOneConfirmActivity.phoneNumber;
                    if (str7 == null) {
                        int i7 = hashCode + 87;
                        getAsAtTimestamp = i7 % 128;
                        if (i7 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str7 = null;
                    }
                    String str8 = companion2.formatterInputPhoneNumber(str7);
                    String str9 = allInOneConfirmActivity.phoneNumber;
                    if (str9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str9 = null;
                    }
                    boolean zAreEqual = Intrinsics.areEqual(str9, SPUtils.getInstance().getString("recent_login_phone_number"));
                    WithExpiryResp withExpiryResp4 = allInOneConfirmActivity.withExpiryResp;
                    if (withExpiryResp4 == null) {
                        int i8 = hashCode + 35;
                        getAsAtTimestamp = i8 % 128;
                        int i9 = i8 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        withExpiryResp4 = null;
                    }
                    String title = withExpiryResp4.getTitle();
                    WithExpiryResp withExpiryResp5 = allInOneConfirmActivity.withExpiryResp;
                    if (withExpiryResp5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        withExpiryResp2 = withExpiryResp5;
                    }
                    RouteUtils.routeWithExecute("/sfcModule/transactionCompletion", TransferRespMapperKt.getTransactionCompletionBundle$default(allInOneConfirmActivity, str8, zAreEqual, ValidityType.EXPIRY, title, withExpiryResp2.getValidity(), null, false, allInOneConfirmActivity.returnDestination, buyBundlesEvent$default, BERTags.PRIVATE, null));
                }
                allInOneConfirmActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void initListener$lambda$2(AllInOneConfirmActivity allInOneConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(allInOneConfirmActivity, "");
        allInOneConfirmActivity.finish();
        int i4 = getAsAtTimestamp + 91;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initListener() {
        int i = 2 % 2;
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                AllInOneConfirmActivity.$r8$lambda$c_wavQ55A8kHq3fVkTWAO7VzQKE(this.f$0, view);
                int i5 = ShareDataUIState + 3;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    AllInOneConfirmActivity.m11175$r8$lambda$yIOeFXUL92HKfAeYi59nQ47uRs(this.f$0, view);
                    throw null;
                }
                AllInOneConfirmActivity.m11175$r8$lambda$yIOeFXUL92HKfAeYi59nQ47uRs(this.f$0, view);
                int i4 = copydefault + 111;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = getAsAtTimestamp + 109;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void initListener$lambda$3(com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity r10, android.view.View r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.initListener$lambda$3(com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity, android.view.View):void");
    }

    private final String getPayTitle() {
        int i = 2 % 2;
        if (!(!Intrinsics.areEqual(Keys.BUNDLE_TYPE_SMS, this.bundleType))) {
            String string = getString(R.string.sms_bundles);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_ALL_IN_ONE, this.bundleType)) {
            String string2 = getString(R.string.all_in_one_bundles);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_ROAMING, this.bundleType)) {
            String string3 = getString(R.string.roaming_bundles);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_INTERNATIONAL, this.bundleType)) {
            String string4 = getString(R.string.international_bundles);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_DATA_ONLY, this.bundleType)) {
            int i2 = hashCode + 13;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            String string5 = getString(R.string.data_only);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_SHOOK, this.bundleType)) {
            int i4 = hashCode + 89;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            String string6 = getString(R.string.s_hook);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            return string6;
        }
        WithExpiryResp withExpiryResp = null;
        if (!Intrinsics.areEqual("entertainment", this.bundleType)) {
            WithExpiryResp withExpiryResp2 = this.withExpiryResp;
            if (withExpiryResp2 == null) {
                int i6 = getAsAtTimestamp + 31;
                hashCode = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                withExpiryResp = withExpiryResp2;
            }
            return Intrinsics.areEqual(withExpiryResp.getValidity(), "No Expiry") ? "Buy 'No Expiry' Bundles" : "Buy 'With Expiry' Bundles";
        }
        WithExpiryResp withExpiryResp3 = this.withExpiryResp;
        if (withExpiryResp3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            withExpiryResp = withExpiryResp3;
        }
        return withExpiryResp.getOfferName() + " Bundles";
    }

    private final int getAvatar() {
        int i = 2 % 2;
        WithExpiryResp withExpiryResp = null;
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_SMS, this.bundleType)) {
            int i2 = getAsAtTimestamp + 79;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                return R.drawable.ic_sms_bundles;
            }
            int i3 = R.drawable.ic_sms_bundles;
            throw null;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_ROAMING, this.bundleType)) {
            int i4 = getAsAtTimestamp + 37;
            hashCode = i4 % 128;
            if (i4 % 2 != 0) {
                return R.drawable.ic_gsm_roaming_bundle;
            }
            int i5 = R.drawable.ic_gsm_roaming_bundle;
            throw null;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_INTERNATIONAL, this.bundleType)) {
            int i6 = getAsAtTimestamp + 115;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            return R.drawable.icon_bundle_international;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_ALL_IN_ONE, this.bundleType)) {
            int i8 = hashCode + 93;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 == 0) {
                return R.drawable.ic_gsm_all_in_one;
            }
            int i9 = R.drawable.ic_gsm_all_in_one;
            throw null;
        }
        if (!(!Intrinsics.areEqual(Keys.BUNDLE_TYPE_DATA_ONLY, this.bundleType))) {
            return R.drawable.icon_bundle_with_expiry;
        }
        if (Intrinsics.areEqual(Keys.BUNDLE_TYPE_SHOOK, this.bundleType)) {
            return R.drawable.ic_gsm_s_hook_bundles;
        }
        if (Intrinsics.areEqual("entertainment", this.bundleType)) {
            WithExpiryResp withExpiryResp2 = this.withExpiryResp;
            if (withExpiryResp2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                withExpiryResp = withExpiryResp2;
            }
            return withExpiryResp.getIcon();
        }
        WithExpiryResp withExpiryResp3 = this.withExpiryResp;
        if (withExpiryResp3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            withExpiryResp = withExpiryResp3;
        }
        if (Intrinsics.areEqual(withExpiryResp.getValidity(), "No Expiry")) {
            return R.drawable.icon_bundle_no_expiry;
        }
        int i10 = getAsAtTimestamp + 69;
        hashCode = i10 % 128;
        int i11 = i10 % 2;
        return R.drawable.icon_bundle_with_expiry;
    }

    private final void initView() {
        int i = 2 % 2;
        int i2 = hashCode + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Serializable serializableExtra = getIntent().getSerializableExtra("withExpiryResp");
        Intrinsics.checkNotNull(serializableExtra, "");
        this.withExpiryResp = (WithExpiryResp) serializableExtra;
        String stringExtra = getIntent().getStringExtra("phoneNumber");
        if (stringExtra == null) {
            int i4 = hashCode + 117;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        this.phoneNumber = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(Keys.KEY_BUNDLE_TYPE);
        if (stringExtra2 == null) {
            WithExpiryResp withExpiryResp = this.withExpiryResp;
            if (withExpiryResp == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                withExpiryResp = null;
            }
            stringExtra2 = withExpiryResp.getBundleType();
        }
        this.bundleType = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("");
        if (stringExtra3 == null) {
            stringExtra3 = Keys.PAY_METHOD_AIRTIME;
        }
        this.paymentMethod = stringExtra3;
        this.returnDestination = getIntent().getStringExtra(Keys.KEY_RETURN_DESTINATION);
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).tvPayTitle.setText(getPayTitle());
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).ivAvatar.setImageResource(getAvatar());
        final ArrayList<FundsSourceInfoDisplay.DisplayItemsBean> arrayListBuildDisplayItems = buildDisplayItems();
        final int i6 = com.huawei.digitalpayment.checkoutUi.R.layout.item_sfc_confirm_display;
        BaseQuickAdapter<FundsSourceInfoDisplay.DisplayItemsBean, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<FundsSourceInfoDisplay.DisplayItemsBean, BaseViewHolder>(arrayListBuildDisplayItems, i6) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void convert(BaseViewHolder baseViewHolder, FundsSourceInfoDisplay.DisplayItemsBean displayItemsBean) {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 9;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                convert2(baseViewHolder, displayItemsBean);
                if (i9 == 0) {
                    int i10 = 16 / 0;
                }
                int i11 = component3 + 125;
                ShareDataUIState = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(i6, arrayListBuildDisplayItems);
            }

            protected void convert2(BaseViewHolder holder, FundsSourceInfoDisplay.DisplayItemsBean item) {
                int i7 = 2 % 2;
                int i8 = component3 + 27;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(holder, "");
                    Intrinsics.checkNotNullParameter(item, "");
                    holder.setText(R.id.tv_label, item.getLabel());
                    holder.setText(R.id.tv_value, item.getValue());
                    return;
                }
                Intrinsics.checkNotNullParameter(holder, "");
                Intrinsics.checkNotNullParameter(item, "");
                holder.setText(R.id.tv_label, item.getLabel());
                holder.setText(R.id.tv_value, item.getValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).rvConfirm.addItemDecoration(new RecycleViewDivider(ColorUtils.getColor(R.color.color_cbd5e1), ConvertUtils.dp2px(1.0f)));
        ((ActivitySfcExpiryConfirmByAirtimeBinding) this.binding).rvConfirm.setAdapter(baseQuickAdapter);
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
        String str3 = companion2.formatterInputPhoneNumber(str2);
        String str4 = this.phoneNumber;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4) && !Intrinsics.areEqual(str3, str)) {
            String str5 = this.phoneNumber;
            if (str5 == null) {
                int i2 = hashCode + 111;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                str5 = null;
            }
            arrayList.add(new FundsSourceInfoDisplay.DisplayItemsBean("Phone Number", str5));
        }
        WithExpiryResp withExpiryResp2 = this.withExpiryResp;
        if (withExpiryResp2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryResp2 = null;
        }
        arrayList.add(new FundsSourceInfoDisplay.DisplayItemsBean("Bundle", withExpiryResp2.getTitle()));
        WithExpiryResp withExpiryResp3 = this.withExpiryResp;
        if (withExpiryResp3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryResp3 = null;
        }
        if (!TextUtils.isEmpty(withExpiryResp3.getValidity())) {
            WithExpiryResp withExpiryResp4 = this.withExpiryResp;
            if (withExpiryResp4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                withExpiryResp4 = null;
            }
            arrayList.add(new FundsSourceInfoDisplay.DisplayItemsBean("Valid for", withExpiryResp4.getValidity()));
            int i4 = hashCode + 57;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        arrayList.add(new FundsSourceInfoDisplay.DisplayItemsBean("Payment Method", this.paymentMethod));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ENGLISH;
        WithExpiryResp withExpiryResp5 = this.withExpiryResp;
        if (withExpiryResp5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            withExpiryResp = withExpiryResp5;
        }
        String str6 = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(Float.parseFloat(withExpiryResp.getAmount()))}, 1));
        Intrinsics.checkNotNullExpressionValue(str6, "");
        arrayList.add(new FundsSourceInfoDisplay.DisplayItemsBean("Amount", "Ksh. " + str6));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r46) {
        /*
            Method dump skipped, instruction units count: 14291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.AllInOneConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m11174$r8$lambda$_ipcn3xRKsGqZsl3mQM_dgeDpI(AllInOneConfirmActivity allInOneConfirmActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$1 = initObserver$lambda$1(allInOneConfirmActivity, resource);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = getAsAtTimestamp + 97;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return unitInitObserver$lambda$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$c_wavQ55A8kHq3fVkTWAO7VzQKE(AllInOneConfirmActivity allInOneConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m11176instrumented$0$initListener$V(allInOneConfirmActivity, view);
        int i4 = getAsAtTimestamp + 115;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m11175$r8$lambda$yIOeFXUL92HKfAeYi59nQ47uRs(AllInOneConfirmActivity allInOneConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        m11177instrumented$1$initListener$V(allInOneConfirmActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 51;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        getShareableDataState = 0;
        copydefault();
        int i = getSponsorBeneficiariesState + 125;
        getShareableDataState = i % 128;
        int i2 = i % 2;
    }

    private static void m11176instrumented$0$initListener$V(AllInOneConfirmActivity allInOneConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$2(allInOneConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 41;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m11177instrumented$1$initListener$V(AllInOneConfirmActivity allInOneConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$3(allInOneConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = hashCode + 73;
            getAsAtTimestamp = i4 % 128;
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

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = hashCode + 9;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = hashCode + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 95;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void copydefault() {
        ShareDataUIState = new char[]{30699, 30686, 30692, 30682, 30681, 30691, 30622, 30677, 30712, 30693, 30695, 30687, 30675, 30711, 30679, 30676, 30603, 30680, 30684, 30611, 30619, 30694, 30614, 30609, 30616, 30613, 30698, 30615, 30612, 30608, 30618, 30688, 30610, 30617, 30689, 30683, 30678, 30623, 30709, 30597, 30685, 30714};
        component2 = 321287752;
        component1 = true;
        copydefault = true;
        component3 = -1992622674;
        equals = -238323867;
        copy = 409298192;
        getRequestBeneficiariesState = new byte[]{-25, 38, 33, -42, 63, 9, -50, 56, 62, -42, TarHeader.LF_NORMAL, 40, TarHeader.LF_BLK, 7, TarHeader.LF_FIFO, -29, 37, TarHeader.LF_SYMLINK, Ascii.SYN, -1, 46, 47, 32, TarHeader.LF_CHR, 43, TarHeader.LF_NORMAL, -35, -84, 86, -95, 84, -88, -95, 86, -87, 125, -103, -86, 126, -86, -104, 121, -100, 87, -85, 120, -98, 83, -86, 126, -85, -99, 102, -88, -84, -88, -124, -93, 121, -121, -87, -83, -84, 120, -86, -124, -82, -84, 101, -111, 121, -123, -93, 86, 123, -85, -122, 86, -82, -84, 100, -97, 120, -85, -104, -81, -88, -87, 120, -99, -35, 102, Ascii.VT, TarHeader.LF_FIFO, Ascii.FF, TarHeader.LF_SYMLINK, -35, Ascii.FF, 9, 122, 8, 9, TarHeader.LF_NORMAL, -34, 100, Ascii.SO, -58, 123, TarHeader.LF_CHR, 3, TarHeader.LF_CHR, TarHeader.LF_FIFO, 13, 9, -38, 103, -36, 125, Ascii.VT, -57, 103, Ascii.SO, -62, 125, 8, -39, 123, TarHeader.LF_CONTIG, -38, 120, TarHeader.LF_FIFO, TarHeader.LF_FIFO, Ascii.VT, Ascii.SI, TarHeader.LF_CONTIG, 8, -38, TarHeader.LF_FIFO, 13, 103, Ascii.SI, TarHeader.LF_CHR, -37, 13, 8, 103, Ascii.VT, 13, TarHeader.LF_BLK, Ascii.SI, -57, 100, -38, 126, -19, -43, -52, -36, -57, TarHeader.LF_CHR, TarHeader.LF_NORMAL, -110, -60, 40, -64, Ascii.ESC, -24, -10, 32, -62, -19, -126, -74, -1, -84, -74, -107, -22, 80, -122, -100, -74, -103, -102, -126, -116, -35, -90, -106, -64, -105, -23, -96, -108, -37, -94, -106, -50, -107, -71, -24, -50, -72, -59, -107, -105, -108, -94, -37, -110, -23, -100, -24, -109, -110, -105, -21, -98, -19, -108, -93, -40, -105, -94, -57, -100, PSSSigner.TRAILER_IMPLICIT, -61, -24, -98, -105, -109, -21, -110, -89, -108, -107, -59, -107, -107, -19, -94, -110, -59, -69, -62, -90, -112, -62, -110, -106, 81, 91, 93, 94, 83, 92, 83, 89, 82, 70, -106, Ascii.US, Ascii.DLE, 106, Ascii.RS, 20, Ascii.DLE, 104, Ascii.RS, 106, 19};
    }
}
