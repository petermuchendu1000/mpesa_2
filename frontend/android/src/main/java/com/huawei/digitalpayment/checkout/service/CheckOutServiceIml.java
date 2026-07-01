package com.huawei.digitalpayment.checkout.service;

import androidx.fragment.app.FragmentActivity;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.customer.digitalpayment.checkout.service.ICheckoutService;
import com.huawei.customer.digitalpayment.checkout.service.TransactionType;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.PayManager;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import java.util.HashMap;
import java.util.Map;

public class CheckOutServiceIml implements CheckOutService, ICheckoutService {
    private static int ShareDataUIState = 0;
    private static final Map<TransactionType, TradeTypeEnum> component1;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    static {
        HashMap map = new HashMap();
        component1 = map;
        map.put(TransactionType.CUSTOMER_BUY_GOODS, TradeTypeEnum.CUSTOMER_BUY_GOODS);
        map.put(TransactionType.P2P_TRANSFER, TradeTypeEnum.P2P_TRANSFER);
        map.put(TransactionType.P2P_TRANSFER_WITH_FEE, TradeTypeEnum.P2P_TRANSFER_WITH_FEE);
        map.put(TransactionType.P2P_TRANSFER_VOUCHER_CODE, TradeTypeEnum.P2P_TRANSFER_VOUCHER_CODE);
        map.put(TransactionType.CASH_OUT, TradeTypeEnum.CASH_OUT);
        map.put(TransactionType.WITHDRAW_TO_BANK_CARD, TradeTypeEnum.WITHDRAW_TO_BANK_CARD);
        map.put(TransactionType.DEPOSIT_FROM_BANK_CARD, TradeTypeEnum.DEPOSIT_FROM_BANK_CARD);
        map.put(TransactionType.AIR_TIME_DATA_PACK, TradeTypeEnum.AIR_TIME_DATA_PACK);
        map.put(TransactionType.AIR_TOP_UP, TradeTypeEnum.AIR_TOP_UP);
        map.put(TransactionType.H5_CHECKOUT, TradeTypeEnum.H5_CHECKOUT);
        int i = component2 + 85;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    @Override
    public void setCurrentPayWay(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 53;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
            if (i < 0) {
                return;
            }
        } else if (i < 0) {
            return;
        }
        if (i <= 2) {
            SPUtils.getInstance("sp_name_checkout").put("key_current_pay_way" + component3(), i);
            int i5 = component3 + 121;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static String component3() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString("recent_login_phone_number");
        int i2 = component3 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public void startPay(FragmentActivity fragmentActivity, TransactionType transactionType, Map<String, Object> map, final ApiCallback<Map<String, Object>> apiCallback) {
        int i = 2 % 2;
        PayManager.get().startPay(fragmentActivity, map, component1.get(transactionType), new ApiCallback<TransferResp>(this) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 3;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(transferResp);
                if (i4 != 0) {
                    int i5 = 75 / 0;
                }
                int i6 = copydefault + 125;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            public void ShareDataUIState(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 103;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (apiCallback != null) {
                    HashMap map2 = new HashMap();
                    map2.put("orderId", transferResp.getOrderId());
                    apiCallback.onSuccess(map2);
                    int i5 = component2 + 15;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 1;
                copydefault = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    ApiCallback apiCallback2 = apiCallback;
                    if (apiCallback2 != null) {
                        int i5 = i3 + 81;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        apiCallback2.onError(baseException);
                        if (i6 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
