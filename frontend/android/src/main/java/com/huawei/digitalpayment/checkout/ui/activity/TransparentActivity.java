package com.huawei.digitalpayment.checkout.ui.activity;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.didi.drouter.router.Request;
import com.didi.drouter.router.RouterHelper;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.payment.mvvm.Resource;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.cancelAll;
import org.bouncycastle.crypto.signers.PSSSigner;

public class TransparentActivity extends Hilt_TransparentActivity {
    private static char ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static long component3;
    private static int getRequestBeneficiariesState;
    Map<String, Object> params;
    TradeTypeEnum tradeType;
    private static final byte[] $$u = {112, 44, -46, -27};
    private static final int $$x = 223;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$y = {34, -66, 77, Ascii.DC2, -15, -1, -6, -2, -2, 6, -12, -9, SignedBytes.MAX_POWER_OF_TWO, -15, -1, -6, -2, -2, 6, -12, -9, 62, -9, 62, -71, 10, 1, -5, -20, 8, -16, Ascii.SO, -22, 71, -62, -8, -9, Ascii.FF, -16, 1, 10, -14, 59, PSSSigner.TRAILER_IMPLICIT, -4, 8, -16, Ascii.SO, -22, 2, -6, -4, 66, -59, -9, -6, -11, 19, -4, -13, 4, TarHeader.LF_BLK, -27, -41, -6, -11, 19, -4, -13, 4, Ascii.SO, -16, -13, 3, Ascii.VT, -20, -4, -6, 4, 62, -66, -15, -4, -12, Ascii.DC2, -4, -4, 2, -23, 6, -11, -15, -1, -6, -2, -2, 6, -12, -9, 63};
    private static final int $$z = 1;
    private static final byte[] $$g = {Ascii.SI, 58, -59, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$h = 166;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int equals = 1;

    private static String $$A(byte b2, int i, byte b3) {
        int i2 = 119 - i;
        int i3 = 4 - (b2 * 2);
        int i4 = b3 * 2;
        byte[] bArr = $$u;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = i4 + i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            byte b4 = bArr[i3];
            i3++;
            i2 += b4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.$$g
            int r8 = 98 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.n(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void p(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.$$y
            int r7 = r7 * 3
            int r7 = 90 - r7
            int r8 = r8 * 60
            int r8 = r8 + 10
            int r6 = r6 * 6
            int r6 = 105 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-3)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.p(byte, byte, byte, java.lang.Object[]):void");
    }

    @Override
    protected void initView() {
        int i = 2 % 2;
        super.initView();
        Request request = RouterHelper.getRequest(this);
        if (request != null) {
            int i2 = copydefault + 9;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                this.params = (Map) ((Map) request.getAddition("paramObjects")).get("params");
                RouterHelper.release(request);
                int i3 = 21 / 0;
            } else {
                this.params = (Map) ((Map) request.getAddition("paramObjects")).get("params");
                RouterHelper.release(request);
            }
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("tradeType");
        if (serializableExtra instanceof TradeTypeEnum) {
            int i4 = equals + 91;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                this.tradeType = (TradeTypeEnum) serializableExtra;
                throw null;
            }
            this.tradeType = (TradeTypeEnum) serializableExtra;
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra(KeysConstants.KEY_CHECKOUTT_RES);
        if (this.params != null) {
            int i5 = copydefault + 63;
            equals = i5 % 128;
            int i6 = i5 % 2;
            if (this.tradeType == null) {
                return;
            }
            if (!(serializableExtra2 instanceof CheckoutResp)) {
                ((CheckoutViewModel) this.viewModel).prePayOrder(this.tradeType, this.params);
                return;
            }
            CheckoutResp checkoutResp = (CheckoutResp) serializableExtra2;
            ((CheckoutViewModel) this.viewModel).setNote(this.params);
            ((CheckoutViewModel) this.viewModel).setTradeTypeEnumLiveData(this.tradeType);
            ((CheckoutViewModel) this.viewModel).setTradeType((String) this.params.get("tradeType"));
            ((CheckoutViewModel) this.viewModel).initCheckoutResp(checkoutResp);
            ((CheckoutViewModel) this.viewModel).getPrePayOrderLiveData().postValue(Resource.success(checkoutResp));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void o(int r26, char[] r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.o(int, char[], java.lang.Object[]):void");
    }

    private static void l(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component2;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 657, 14 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (char) (Color.argb(0, 0, 0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    f = 0.0f;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 25;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i11 = $10 + 63;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4501, (ViewConfiguration.getWindowTouchSlop() >> 8) + 36, (char) (27896 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1464227204, false, $$A(b2, (byte) (b2 | 9), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int maximumFlingVelocity = 3580 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        byte length2 = (byte) $$u.length;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, maximumDrawingCacheSize, packedPositionChild, 1180380354, false, $$A((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 1859, 35 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 80302927, false, $$A(b3, b4, (byte) (b4 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            int i15 = $10 + 107;
            $11 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i7 > 0) {
            int i17 = $10 + 59;
            $11 = i17 % 128;
            if (i17 % i == 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 1, cArr5, 0, i5);
                System.arraycopy(cArr5, 0, cArr3, i5 + i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 1, i5 * i7);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i18 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i18, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i18);
            }
        }
        if (z) {
            int i19 = $11 + 33;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr7 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i21 = $11 + 93;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] + iArr[3]);
                    i2 = iTrustedWebActivityService_Parcel.copydefault >>> 1;
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i2 = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i2;
                int i22 = $11 + 107;
                $10 = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void m(char[] cArr, int i, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        long j;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 19;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getScrollBarSize() >> i4), (ViewConfiguration.getTapTimeout() >> 16) + 15, (char) (TextUtils.getOffsetBefore("", 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j2 = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 7422, Color.rgb(0, 0, 0) + 16777231, (char) (64291 - View.MeasureSpec.makeMeasureSpec(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
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
                    int i10 = $11 + 37;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 >> b2);
                        cArr4[cancelall.component2 - 1] = (char) (cancelall.component3 / b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    j = j2;
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 7117, 14 - Color.alpha(0), (char) (44463 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                j = 0;
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2943, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (27637 - View.MeasureSpec.getSize(0)), 794909189, false, $$A(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            j = 0;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i12];
                                cArr4[cancelall.component2 + 1] = cArr2[i13];
                            } else {
                                int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i14];
                                cArr4[cancelall.component2 + 1] = cArr2[i15];
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
                cancelall.component2 += 2;
                obj2 = obj;
                j2 = j;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0116  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 13948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.TransparentActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = equals + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
    }

    @Override
    protected boolean isTransparentView() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override
    public boolean needFinishIfErrorCode() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        equals = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getRequestBeneficiariesState = 0;
        copydefault();
        component3 = 5487014793502028420L;
        int i = component4 + 15;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = new char[]{33512, 33425, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33461, 33452, 33459, 33467, 33462, 33455, 33470, 33504, 33423, 33517, 33465, 33408, 33464, 33452, 33518, 33428, 33514, 33514, 33515, 33517, 33517, 33514, 33428, 33469, 33425, 33514, 33518, 33519, 33431, 33468, 33466, 33465, 33468, 33470, 33428, 33426, 33424, 33513, 33427, 33426, 33515, 33429, 33428, 33514, 33516, 33430, 33427, 33426, 33427, 33513, 33510, 33512, 33427, 33430, 33429, 33467, 33426, 33513, 33425, 33428, 33514, 33426, 33425, 33383, 33379, 33380, 33384, 33407, 33406, 33407, 33405, 33382, 33295, 33294, 33380, 33407, 33344, 33383, 33295, 33294, 33382, 33405, 33407, 33406, 33403, 33403, 33405, 33382, 33381, 33406, 33383, 33383, 33407, 33382, 33383, 33407, 33382, 33385, 33346, 33384, 33380, 33380, 33380, 33404, 33403, 33402, 33407, 33406, 33405, 33384, 33384, 33406, 33381, 33380, 33405, 33346, 33346, 33385, 33297, 33295, 33380, 33405, 33406, 33405, 33406, 33382, 33515, 33457, 33451, 33453, 33454, 33417, 33515, 33520, 33517, 33514, 33513, 33512, 33514, 33427, 33426, 33515, 33516, 33516, 33515, 33517, 33516, 33514, 33426, 33469, 33431, 33422, 33457, 33458, 33460, 33468, 33461, 33460, 33469, 33461, 33452, 33422, 33429, 33457, 33460, 33462, 33460, 33460, 33453, 33452, 33460, 33462, 33460, 33430, 33431, 33462, 33457, 33425, 33431, 33463, 33459, 33427, 33427, 33460, 33461, 33465, 33459, 33452, 33422, 33421, 33419, 33519, 33429, 33458, 33458, 33462, 33454, 33452, 33517, 33463, 33465, 33463, 33454, 33459, 33467, 33412, 33412, 33468, 33465, 33455, 33457, 33460, 33462, 33475, 33511, 33425, 33468, 33429, 33429, 33428, 33426, 33467, 33429, 33515, 33512, 33513, 33426, 33467, 33467, 33427, 33515, 33514, 33513, 33514, 33516, 33517, 33429, 33426, 33514, 33430, 33430, 33519, 33428, 33428, 33517, 33514, 33513, 33514, 33511, 33511, 33514, 33513, 33515, 33518, 33517, 33428, 33426, 33515, 33515, 33515, 33428, 33426, 33427, 33468, 33425, 33512, 33427, 33469, 33429, 33428, 33465, 33427, 33516, 33514, 33427, 33468, 33426};
        component1 = new char[]{2028, 2023, 2035, 2016, 2021, 2018, 1972, 2041, 2031, 1975, 2032, 2025, 1977, 2004, 2027, 1968, 1992, 2017, 2029, 2026, 1973, 2020, 2034, 1969, 1974, 1970, 1042, 2022, 1987, 1051, 2030, 1971, 1049, 1985, 1052, 1050, 1055, 2038, 2003, 1965, 1048, 2036, 2037, 1966, 1053, 1054, 2019, 2024, 1976};
        ShareDataUIState = (char) 12829;
    }
}
