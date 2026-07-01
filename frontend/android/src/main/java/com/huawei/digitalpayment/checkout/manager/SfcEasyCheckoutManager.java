package com.huawei.digitalpayment.checkout.manager;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.base.util.SFCUserConfigManager;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0007J4\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J<\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J/\u0010\u0014\u001a\u00020\f2\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0016j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001`\u0015¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\fH\u0007J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/checkout/manager/SfcEasyCheckoutManager;", "", "<init>", "()V", "payCallback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/checkout/model/response/TransferResp;", "getPayCallback", "()Lcom/huawei/common/listener/ApiCallback;", "setPayCallback", "(Lcom/huawei/common/listener/ApiCallback;)V", "easyPay", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "params", "", "", "bundle", "Landroid/os/Bundle;", "fillParams", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Ljava/util/HashMap;)V", "finishEasyActivity", "payFailed", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcEasyCheckoutManager {
    public static final int $stable;
    public static final SfcEasyCheckoutManager INSTANCE;
    private static ApiCallback<TransferResp> ShareDataUIState;
    private static int component1;
    private static char component2;
    private static long component3;
    private static int component4;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager.$$a
            int r7 = 99 - r7
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager.$$c(byte, int, byte):java.lang.String");
    }

    private SfcEasyCheckoutManager() {
    }

    public final ApiCallback<TransferResp> getPayCallback() {
        int i = 2 % 2;
        int i2 = copy + 3;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPayCallback(ApiCallback<TransferResp> apiCallback) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 35;
        copy = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = apiCallback;
        int i5 = i2 + 113;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void easyPay(FragmentActivity activity, Map<String, ? extends Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        INSTANCE.fillParams((HashMap) params);
        HashMap map = new HashMap(params);
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("params", map);
        if (map.containsKey("walletReferenceData")) {
            int i2 = getAsAtTimestamp + 57;
            copy = i2 % 128;
            int i3 = i2 % 2;
            try {
                String json = GsonUtils.toJson(map.get("walletReferenceData"));
                bundle.putString("walletReferenceData_json", json);
                map.put("walletReferenceData_json", json);
                int i4 = copy + 57;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception unused) {
            }
        }
        RouteUtils.routeWithExecute(activity, "/checkoutModule/sfcEasyCheckoutEnter", bundle, null, map, -1, -1, null);
    }

    @JvmStatic
    public static final void easyPay(FragmentActivity activity, Map<String, ? extends Object> params, ApiCallback<TransferResp> payCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(payCallback, "");
        SfcEasyCheckoutManager sfcEasyCheckoutManager = INSTANCE;
        ShareDataUIState = payCallback;
        sfcEasyCheckoutManager.fillParams((HashMap) params);
        HashMap map = new HashMap(params);
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("params", map);
        if (map.containsKey("walletReferenceData")) {
            int i2 = copy + 123;
            getAsAtTimestamp = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    String json = GsonUtils.toJson(map.get("walletReferenceData"));
                    bundle.putString("walletReferenceData_json", json);
                    map.put("walletReferenceData_json", json);
                    throw null;
                }
                String json2 = GsonUtils.toJson(map.get("walletReferenceData"));
                bundle.putString("walletReferenceData_json", json2);
                map.put("walletReferenceData_json", json2);
            } catch (Exception unused) {
            }
        }
        RouteUtils.routeWithExecute(activity, "/checkoutModule/sfcEasyCheckoutEnter", bundle, null, map, -1, -1, null);
        int i3 = copy + 83;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    @JvmStatic
    public static final void easyPay(FragmentActivity activity, Map<String, ? extends Object> params, Bundle bundle, ApiCallback<TransferResp> payCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(payCallback, "");
        SfcEasyCheckoutManager sfcEasyCheckoutManager = INSTANCE;
        ShareDataUIState = payCallback;
        sfcEasyCheckoutManager.fillParams((HashMap) params);
        HashMap map = new HashMap(params);
        bundle.putSerializable("params", map);
        if (map.containsKey("walletReferenceData")) {
            int i2 = getAsAtTimestamp + 61;
            copy = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    String json = GsonUtils.toJson(map.get("walletReferenceData"));
                    bundle.putString("walletReferenceData_json", json);
                    map.put("walletReferenceData_json", json);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String json2 = GsonUtils.toJson(map.get("walletReferenceData"));
                bundle.putString("walletReferenceData_json", json2);
                map.put("walletReferenceData_json", json2);
                int i3 = getAsAtTimestamp + 15;
                copy = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception unused) {
            }
        }
        RouteUtils.routeWithExecute(activity, "/checkoutModule/sfcEasyCheckoutEnter", bundle, null, map, -1, -1, null);
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i6 = $10 + 81;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int deadChar = KeyEvent.getDeadChar(i5, i5) + 4037;
                    int i10 = 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1));
                    char cLastIndexOf = (char) (19180 - TextUtils.lastIndexOf("", '0', i5, i5));
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(deadChar, i10, cLastIndexOf, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 7568;
                        int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0');
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iIndexOf, maxKeyCode, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i11 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i11);
                        objArr4[i5] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i5;
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", i5) + 2459, 28 - Color.alpha(i5), (char) ((Process.getThreadPriority(i5) + 20) >> 6), 931716605, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                i2 = 2;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 7567, 11 - View.resolveSizeAndState(0, 0, 0), (char) View.resolveSize(0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i3 = i2;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final void fillParams(HashMap<String, Object> params) {
        HashMap map;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        if (SFCUserConfigManager.INSTANCE.isCustomerChild()) {
            try {
                if (!(!params.containsKey("walletReferenceData"))) {
                    Object obj = params.get("walletReferenceData");
                    Intrinsics.checkNotNull(obj, "");
                    map = (HashMap) obj;
                    int i2 = copy + 125;
                    getAsAtTimestamp = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    HashMap map2 = new HashMap();
                    params.put("walletReferenceData", map2);
                    int i4 = copy + 11;
                    getAsAtTimestamp = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 4 % 2;
                    }
                    map = map2;
                }
                map.put("UserType", SFCUserConfigManager.USER_TYPE_CHILD);
                int i6 = copy + 103;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null) {
                    L.INSTANCE.e("fillParams", message, new Object[0]);
                }
            }
        }
    }

    @JvmStatic
    public static final void finishEasyActivity() {
        Class<?> cls;
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            a(new char[]{20919, 16177, 60091, 56326, 22625, 38065, 4401, 44001, 57227, 42434, 64562, 59080, 38503, 27364, 9648, 32305, 13396, 11761, 33414, 56540, 59404, 28481, 46006, 43205, 25182, 52140, 15441, 2600, 6351, 11452, 56647, 41894, 43193, 22366, 2938, 23693, 26525, 56730, 44457, 62332, 23461, 11882, 37488, 52723, 60515, 19761, 29366, 39327, 34894, 11721, 49085, 10390, 56785, 10271, 24668, 43884, 50151, 22554, 34363, 1655, 22623, 8558, 10062, 55674, 48032, 51800, 13423}, new char[]{35741, 9114, 41343, 35946}, (char) (MotionEvent.axisFromString("") + 27298), TextUtils.lastIndexOf("", '0', 0) + 2133039756, new char[]{0, 0, 0, 0}, objArr);
            cls = Class.forName(((String) objArr[0]).intern());
            Intrinsics.checkNotNull(cls, "");
        } catch (Exception unused) {
            L.INSTANCE.d("PassWordPayFragment", "paySuccess: ", new Object[0]);
            cls = null;
        }
        if (cls != null) {
            int i2 = copy + 67;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            ActivityUtils.finishActivity((Class<? extends Activity>) cls);
        }
        int i4 = getAsAtTimestamp + 63;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean payFailed(BaseException exception) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exception, "");
        ApiCallback<TransferResp> apiCallback = ShareDataUIState;
        if (apiCallback == null) {
            return false;
        }
        if (apiCallback != null) {
            int i4 = copy + 45;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                apiCallback.onError(exception);
                throw null;
            }
            apiCallback.onError(exception);
            int i5 = getAsAtTimestamp + 59;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        ShareDataUIState = null;
        return true;
    }

    static {
        component4 = 1;
        component1();
        INSTANCE = new SfcEasyCheckoutManager();
        $stable = 8;
        int i = copydefault + 123;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component3 = -3780477796495014671L;
        component1 = -1833199517;
        component2 = (char) 50417;
    }
}
