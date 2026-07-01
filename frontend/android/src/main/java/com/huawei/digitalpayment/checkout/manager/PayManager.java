package com.huawei.digitalpayment.checkout.manager;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.didi.drouter.router.Result;
import com.didi.drouter.router.RouterCallback;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.IPayModel;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.payment.mvvm.Resource;
import java.util.HashMap;
import java.util.Map;

public class PayManager {
    private static int component1 = 0;
    private static final PayManager component2 = new PayManager();
    private static int component4 = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private ApiCallback<Resource> ShareDataUIState;
    private IPayModel component3;
    private ApiCallback<TransferResp> copydefault;

    static {
        int i = equals + 61;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static PayManager get() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        PayManager payManager = component2;
        int i5 = i2 + 73;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return payManager;
    }

    public void startPay(FragmentActivity fragmentActivity, Map<String, Object> map, TradeTypeEnum tradeTypeEnum) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        startPay(fragmentActivity, map, tradeTypeEnum, null);
        int i4 = component4 + 43;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void startPay(FragmentActivity fragmentActivity, Map<String, Object> map, TradeTypeEnum tradeTypeEnum, ApiCallback<TransferResp> apiCallback) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            startPay(fragmentActivity, map, (CheckoutResp) null, tradeTypeEnum, apiCallback);
            int i3 = 15 / 0;
        } else {
            startPay(fragmentActivity, map, (CheckoutResp) null, tradeTypeEnum, apiCallback);
        }
        int i4 = component4 + 57;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void startPay(FragmentActivity fragmentActivity, Map<String, Object> map, CheckoutResp checkoutResp, TradeTypeEnum tradeTypeEnum, ApiCallback<TransferResp> apiCallback) {
        int i = 2 % 2;
        this.copydefault = apiCallback;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("tradeType", tradeTypeEnum);
        if (checkoutResp != null) {
            int i2 = component4 + 57;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                bundle.putSerializable(KeysConstants.KEY_CHECKOUTT_RES, checkoutResp);
                throw null;
            }
            bundle.putSerializable(KeysConstants.KEY_CHECKOUTT_RES, checkoutResp);
            int i3 = component4 + 61;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        }
        HashMap map2 = new HashMap();
        map2.put("params", map);
        RouteUtils.routeWithExecute(fragmentActivity, "/checkoutModule/checkoutEnter", bundle, null, map2, -1, -1, new RouterCallback(this) {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onResult(Result result) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 85;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        });
    }

    public void startPay(FragmentActivity fragmentActivity, Map<String, Object> map, TradeTypeEnum tradeTypeEnum, ApiCallback<TransferResp> apiCallback, ApiCallback<Resource> apiCallback2) {
        int i = 2 % 2;
        this.copydefault = apiCallback;
        this.ShareDataUIState = apiCallback2;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("tradeType", tradeTypeEnum);
        HashMap map2 = new HashMap();
        map2.put("params", map);
        RouteUtils.routeWithExecute(fragmentActivity, "/checkoutModule/checkoutEnter", bundle, null, map2, -1, -1, new RouterCallback(this) {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onResult(Result result) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = component4 + 89;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public boolean paySuccess(TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component3 = null;
            ApiCallback<TransferResp> apiCallback = this.copydefault;
            if (apiCallback == null) {
                return false;
            }
            apiCallback.onSuccess(transferResp);
            this.copydefault = null;
            int i3 = component4 + 69;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        this.component3 = null;
        obj.hashCode();
        throw null;
    }

    public boolean payFailed(BaseException baseException) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 55;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.component3 = null;
        ApiCallback<TransferResp> apiCallback = this.copydefault;
        if (apiCallback != null) {
            apiCallback.onError(baseException);
            this.copydefault = null;
            return true;
        }
        int i5 = i2 + 53;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public boolean preCallback(Resource resource) {
        int i = 2 % 2;
        ApiCallback<Resource> apiCallback = this.ShareDataUIState;
        Object obj = null;
        if (apiCallback != null) {
            int i2 = component4 + 9;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            apiCallback.onSuccess(resource);
            this.ShareDataUIState = null;
            return true;
        }
        int i4 = getRequestBeneficiariesState + 77;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public void setPayModel(IPayModel iPayModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 45;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.component3 = iPayModel;
        int i5 = i2 + 49;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public IPayModel getPayModel() {
        int i = 2 % 2;
        int i2 = component4 + 101;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }
}
