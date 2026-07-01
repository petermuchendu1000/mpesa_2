package com.huawei.digitalpayment.checkout.manager;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.didi.drouter.router.Result;
import com.didi.drouter.router.RouterCallback;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.constant.SfcTradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.base.util.SFCUserConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011JB\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005JL\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005JP\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0005J?\u0010\u0016\u001a\u00020\n2*\u0010\r\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00172\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010\u0007\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/checkout/manager/SfcPayManager;", "", "<init>", "()V", "payCallback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/checkout/model/response/TransferResp;", "preCallback", "Lcom/huawei/payment/mvvm/Resource;", "startPay", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "params", "", "", "tradeType", "Lcom/huawei/digitalpayment/checkout/constant/SfcTradeTypeEnum;", "callback", "checkoutResp", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "mPreCallback", "fillParams", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Ljava/util/HashMap;Lcom/huawei/digitalpayment/checkout/constant/SfcTradeTypeEnum;)V", "paySuccess", "", "resp", "payFailed", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcPayManager {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static ApiCallback<Resource<?>> component3 = null;
    private static int copy = 1;
    private static ApiCallback<TransferResp> copydefault;
    public static final SfcPayManager INSTANCE = new SfcPayManager();
    public static final int $stable = 8;

    private SfcPayManager() {
    }

    public final void startPay(FragmentActivity activity, Map<String, ? extends Object> params, SfcTradeTypeEnum tradeType) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tradeType, "");
            startPay(activity, params, tradeType, null);
        } else {
            Intrinsics.checkNotNullParameter(tradeType, "");
            startPay(activity, params, tradeType, null);
            obj.hashCode();
            throw null;
        }
    }

    public final void startPay(FragmentActivity activity, Map<String, ? extends Object> params, SfcTradeTypeEnum tradeType, ApiCallback<TransferResp> callback) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tradeType, "");
        startPay(activity, params, (CheckoutResp) null, tradeType, callback);
        int i4 = component1 + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void startPay(FragmentActivity activity, Map<String, ? extends Object> params, CheckoutResp checkoutResp, SfcTradeTypeEnum tradeType, ApiCallback<TransferResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tradeType, "");
        copydefault = callback;
        Bundle bundle = new Bundle(1);
        Intrinsics.checkNotNull(params, "");
        fillParams((HashMap) params, tradeType);
        bundle.putSerializable("tradeType", tradeType);
        if (checkoutResp != null) {
            int i2 = component1 + 35;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                bundle.putSerializable(KeysConstants.KEY_CHECKOUTT_RES, checkoutResp);
                throw null;
            }
            bundle.putSerializable(KeysConstants.KEY_CHECKOUTT_RES, checkoutResp);
        }
        HashMap map = new HashMap();
        map.put("params", params);
        RouteUtils.routeWithExecute(activity, "/checkoutModule/sfcCheckoutEnter", bundle, null, map, -1, -1, new RouterCallback() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onResult(Result result) {
                int i3 = 2 % 2;
                int i4 = component1 + 83;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                SfcPayManager.m10074$r8$lambda$WXlJVgiCC_ndPLaShQTp8nBrkY(result);
                if (i5 == 0) {
                    throw null;
                }
                int i6 = component1 + 79;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
        });
    }

    public final void startPay(FragmentActivity activity, Map<String, ? extends Object> params, SfcTradeTypeEnum tradeType, ApiCallback<TransferResp> callback, ApiCallback<Resource<?>> mPreCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(callback, "");
        Intrinsics.checkNotNullParameter(mPreCallback, "");
        copydefault = callback;
        component3 = mPreCallback;
        fillParams((HashMap) params, tradeType);
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("tradeType", tradeType);
        HashMap map = new HashMap();
        map.put("params", params);
        RouteUtils.routeWithExecute(activity, "/checkoutModule/sfcCheckoutEnter", bundle, null, map, -1, -1, new RouterCallback() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final void onResult(Result result) {
                int i2 = 2 % 2;
                int i3 = component2 + 73;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SfcPayManager.$r8$lambda$CFfNTUcZWvUZUJdwiFlSnf21Kvo(result);
                int i5 = component2 + 111;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component1 + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void fillParams(HashMap<String, Object> params, SfcTradeTypeEnum tradeType) {
        HashMap map;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        if (SFCUserConfigManager.INSTANCE.isCustomerChild() && tradeType != SfcTradeTypeEnum.EASY_CHECKOUT) {
            int i2 = component1 + 5;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                SfcTradeTypeEnum sfcTradeTypeEnum = SfcTradeTypeEnum.BATCH_TRANSFER;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (tradeType == SfcTradeTypeEnum.BATCH_TRANSFER) {
                return;
            }
            try {
                if (params.containsKey("walletReferenceData")) {
                    Object obj2 = params.get("walletReferenceData");
                    Intrinsics.checkNotNull(obj2, "");
                    map = (HashMap) obj2;
                } else {
                    HashMap map2 = new HashMap();
                    params.put("walletReferenceData", map2);
                    int i3 = component1 + 71;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 2 / 2;
                    }
                    map = map2;
                }
                map.put("UserType", SFCUserConfigManager.USER_TYPE_CHILD);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null) {
                    L.INSTANCE.e("fillParams", message, new Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean paySuccess(com.huawei.digitalpayment.checkout.model.response.TransferResp r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r2
            int r1 = r1 % r0
            com.huawei.common.listener.ApiCallback<com.huawei.digitalpayment.checkout.model.response.TransferResp> r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.copydefault
            r3 = 0
            if (r1 == 0) goto L38
            int r4 = r2 + 121
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 = r5
            int r4 = r4 % r0
            r5 = 0
            if (r4 == 0) goto L21
            r4 = 21
            int r4 = r4 / r3
            if (r1 == 0) goto L34
            goto L23
        L21:
            if (r1 == 0) goto L34
        L23:
            int r2 = r2 + 69
            int r3 = r2 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L30
            r1.onSuccess(r7)
            goto L34
        L30:
            r1.onSuccess(r7)
            throw r5
        L34:
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.copydefault = r5
            r7 = 1
            return r7
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.manager.SfcPayManager.paySuccess(com.huawei.digitalpayment.checkout.model.response.TransferResp):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r1.onError(r6);
        r6 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 + 55;
        com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        com.huawei.digitalpayment.checkout.manager.SfcPayManager.copydefault = null;
        r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 + 99;
        com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r6 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 + 1;
        com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if ((r6 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r6 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r3 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 + 105;
        com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean payFailed(com.huawei.common.exception.BaseException r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            com.huawei.common.listener.ApiCallback<com.huawei.digitalpayment.checkout.model.response.TransferResp> r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.copydefault
            r3 = 57
            int r3 = r3 / r4
            if (r1 == 0) goto L4b
            goto L24
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            com.huawei.common.listener.ApiCallback<com.huawei.digitalpayment.checkout.model.response.TransferResp> r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.copydefault
            if (r1 == 0) goto L4b
        L24:
            int r3 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1
            int r3 = r3 + 105
            int r4 = r3 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r4
            int r3 = r3 % r0
            if (r1 == 0) goto L3b
            r1.onError(r6)
            int r6 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1
            int r6 = r6 + 55
            int r1 = r6 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r1
            int r6 = r6 % r0
        L3b:
            r6 = 0
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.copydefault = r6
            int r1 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2
            int r1 = r1 + 99
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L4a
            return r2
        L4a:
            throw r6
        L4b:
            int r6 = com.huawei.digitalpayment.checkout.manager.SfcPayManager.component1
            int r6 = r6 + r2
            int r1 = r6 % 128
            com.huawei.digitalpayment.checkout.manager.SfcPayManager.component2 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L58
            r6 = 94
            int r6 = r6 / r4
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.manager.SfcPayManager.payFailed(com.huawei.common.exception.BaseException):boolean");
    }

    public final boolean preCallback(Resource<?> resp) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ApiCallback<Resource<?>> apiCallback = component3;
        if (apiCallback == null) {
            return false;
        }
        int i5 = i2 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        if (apiCallback != null) {
            int i7 = i2 + 17;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                apiCallback.onSuccess(resp);
            } else {
                apiCallback.onSuccess(resp);
                throw null;
            }
        }
        component3 = null;
        return true;
    }

    public static void $r8$lambda$CFfNTUcZWvUZUJdwiFlSnf21Kvo(Result result) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        copydefault(result);
        int i4 = component2 + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10074$r8$lambda$WXlJVgiCC_ndPLaShQTp8nBrkY(Result result) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component1(result);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
    }

    static {
        int i = copy + 101;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final void component1(Result result) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(result, "");
        int i4 = component1 + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void copydefault(Result result) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(result, "");
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }
}
