package com.huawei.digitalpayment.checkout.utils;

import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.digitalpayment.checkout.model.entity.CouponBean;
import com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckoutUtils {
    private static int component2 = 1;
    private static int component3;

    @Deprecated
    public static FundsSourceInfoDisplay getCurrentAccount(CheckoutViewModel checkoutViewModel) {
        int i = 2 % 2;
        FundsSourceInfoDisplay value = checkoutViewModel.getSelectedFundSourceLiveData().getValue();
        if (value == null) {
            int i2 = component3 + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (checkoutViewModel.getFundSourceInfoDisplay().getValue() != null) {
                int i4 = component2 + 93;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                value = getDefaultSelectedPayAccount(checkoutViewModel.getFundSourceInfoDisplay().getValue());
            }
        }
        if (value != null) {
            return value;
        }
        int i6 = component3 + 113;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        List<FundsSourceInfoDisplay> value2 = checkoutViewModel.getFundSourceInfoDisplay().getValue();
        if (value2 == null || value2.size() <= 0) {
            return null;
        }
        return value2.get(0);
    }

    public static FundsSourceInfoDisplay getCurrentAccount(FundsSourceInfoDisplay fundsSourceInfoDisplay, List<FundsSourceInfoDisplay> list) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (fundsSourceInfoDisplay == null && list != null) {
            int i5 = i2 + 11;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                getDefaultSelectedPayAccount(list);
                throw null;
            }
            fundsSourceInfoDisplay = getDefaultSelectedPayAccount(list);
        }
        if (fundsSourceInfoDisplay != null) {
            return fundsSourceInfoDisplay;
        }
        if (list == null) {
            return null;
        }
        int i6 = component3 + 35;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            if (list.size() <= 0) {
                return null;
            }
            FundsSourceInfoDisplay fundsSourceInfoDisplay2 = list.get(0);
            int i7 = component2 + 101;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return fundsSourceInfoDisplay2;
        }
        list.size();
        throw null;
    }

    public static FundsSourceInfoDisplay getDefaultSelectedPayAccount(List<FundsSourceInfoDisplay> list) {
        Iterator<FundsSourceInfoDisplay> it;
        int i = 2 % 2;
        int i2 = component3 + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            it = list.iterator();
            int i3 = 13 / 0;
        } else {
            it = list.iterator();
        }
        int i4 = component2 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = component3 + 75;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            FundsSourceInfoDisplay next = it.next();
            if (!(!next.isIsDefault())) {
                int i8 = component3 + 63;
                component2 = i8 % 128;
                int i9 = i8 % 2;
                return next;
            }
        }
        return null;
    }

    @Deprecated
    public static List<CouponBean> getAvailableCoupons(CheckoutViewModel checkoutViewModel) {
        int i = 2 % 2;
        CheckoutResp value = checkoutViewModel.getCheckoutRespLiveData().getValue();
        FundsSourceInfoDisplay value2 = checkoutViewModel.getSelectedFundSourceLiveData().getValue();
        if (value2 == null) {
            int i2 = component3 + 41;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                getCurrentAccount(checkoutViewModel);
                throw null;
            }
            value2 = getCurrentAccount(checkoutViewModel);
            int i3 = component2 + 83;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        return getAvailableCoupons(value, value2);
    }

    public static List<CouponBean> getAvailableCoupons(CheckoutResp checkoutResp, FundsSourceInfoDisplay fundsSourceInfoDisplay) {
        int i = 2 % 2;
        Object obj = null;
        if (checkoutResp != null) {
            int i2 = component2 + 121;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (fundsSourceInfoDisplay != null) {
                List<CouponBean> listComponent1 = component1(checkoutResp.getUserCoupons(), fundsSourceInfoDisplay.getAvailableCoupons());
                int i3 = component3 + 117;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return listComponent1;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public static List<CouponBean> getAvailableMerchantCoupons(CheckoutResp checkoutResp, FundsSourceInfoDisplay fundsSourceInfoDisplay) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (checkoutResp == null) {
            return null;
        }
        int i5 = i2 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        if (fundsSourceInfoDisplay != null) {
            return component1(checkoutResp.getMerchantCoupons(), fundsSourceInfoDisplay.getAvailableCoupons());
        }
        int i7 = i2 + 93;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public static List<CouponBean> getAvailableSpCoupons(CheckoutResp checkoutResp, FundsSourceInfoDisplay fundsSourceInfoDisplay) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (fundsSourceInfoDisplay == null || checkoutResp == null) {
            return null;
        }
        List<CouponBean> listComponent1 = component1(checkoutResp.getSpCoupons(), fundsSourceInfoDisplay.getAvailableCoupons());
        int i3 = component2 + 107;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return listComponent1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkout.model.entity.CouponBean getOptimalCoupon(com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component3
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component2 = r2
            int r1 = r1 % r0
            androidx.lifecycle.MutableLiveData r1 = r6.getCheckoutRespLiveData()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.checkout.model.response.CheckoutResp r1 = (com.huawei.digitalpayment.checkout.model.response.CheckoutResp) r1
            com.huawei.digitalpayment.checkout.utils.HwMutableLiveData r2 = r6.getSelectedFundSourceLiveData()
            java.lang.Object r2 = r2.getValue()
            com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay r2 = (com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay) r2
            if (r2 != 0) goto L26
            com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay r2 = getCurrentAccount(r6)
        L26:
            r6 = 0
            if (r1 == 0) goto L6b
            int r3 = com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component2
            int r4 = r3 + 5
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component3 = r5
            int r4 = r4 % r0
            r5 = 0
            if (r4 == 0) goto L3b
            r4 = 92
            int r4 = r4 / r5
            if (r2 != 0) goto L45
            goto L3d
        L3b:
            if (r2 != 0) goto L45
        L3d:
            int r3 = r3 + 33
            int r1 = r3 % 128
            com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component3 = r1
            int r3 = r3 % r0
            goto L6b
        L45:
            java.util.List r1 = r1.getUserCoupons()
            java.util.List r2 = r2.getOptimalCouponScheme()
            java.util.List r1 = component1(r1, r2)
            boolean r2 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r1)
            if (r2 == 0) goto L58
            return r6
        L58:
            java.lang.Object r6 = r1.get(r5)
            com.huawei.digitalpayment.checkout.model.entity.CouponBean r6 = (com.huawei.digitalpayment.checkout.model.entity.CouponBean) r6
            int r1 = com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component2
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L6b
            int r0 = r0 % 4
        L6b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.utils.CheckoutUtils.getOptimalCoupon(com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel):com.huawei.digitalpayment.checkout.model.entity.CouponBean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r5 = component1(r5.getSpCoupons(), r6.getOptimalCouponScheme());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (com.blankj.utilcode.util.CollectionUtils.isEmpty(r5) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        return r5.get(0);
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkout.model.entity.CouponBean getOptimaSplCoupon(com.huawei.digitalpayment.checkout.model.response.CheckoutResp r5, com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component2
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component3 = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 69
            int r1 = r1 / r4
            if (r5 == 0) goto L43
            goto L18
        L16:
            if (r5 == 0) goto L43
        L18:
            int r2 = r2 + 45
            int r1 = r2 % 128
            com.huawei.digitalpayment.checkout.utils.CheckoutUtils.component2 = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L26
            r0 = 5
            int r0 = r0 / r4
            if (r6 != 0) goto L29
            goto L43
        L26:
            if (r6 != 0) goto L29
            goto L43
        L29:
            java.util.List r5 = r5.getSpCoupons()
            java.util.List r6 = r6.getOptimalCouponScheme()
            java.util.List r5 = component1(r5, r6)
            boolean r6 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r5)
            if (r6 == 0) goto L3c
            return r3
        L3c:
            java.lang.Object r5 = r5.get(r4)
            com.huawei.digitalpayment.checkout.model.entity.CouponBean r5 = (com.huawei.digitalpayment.checkout.model.entity.CouponBean) r5
            return r5
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.utils.CheckoutUtils.getOptimaSplCoupon(com.huawei.digitalpayment.checkout.model.response.CheckoutResp, com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay):com.huawei.digitalpayment.checkout.model.entity.CouponBean");
    }

    public static CouponBean getOptimalMerchantCoupon(CheckoutResp checkoutResp, FundsSourceInfoDisplay fundsSourceInfoDisplay) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (checkoutResp == null || fundsSourceInfoDisplay == null) {
            return null;
        }
        List<CouponBean> listComponent1 = component1(checkoutResp.getMerchantCoupons(), fundsSourceInfoDisplay.getOptimalCouponScheme());
        if (!CollectionUtils.isEmpty(listComponent1)) {
            return listComponent1.get(0);
        }
        int i3 = component2 + 37;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static List<CouponBean> component1(List<CouponBean> list, List<String> list2) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (CollectionUtils.isEmpty(list) || CollectionUtils.isEmpty(list2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CouponBean couponBean : list) {
            if (list2.contains(couponBean.getCouponId())) {
                int i4 = component3 + 115;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(couponBean);
                if (i5 == 0) {
                    throw null;
                }
                int i6 = component2 + 1;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return arrayList;
    }
}
