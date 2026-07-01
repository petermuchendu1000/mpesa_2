package com.huawei.digitalpayment.consumer.fixeddata.constant;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/constant/Endpoints;", "", "<init>", "()V", "HOME_USER_DETAILS", "", "HOME_ACCOUNT_DETAILS", "HOME_ACCOUNT_BALANCES", "HOME_PRODUCTS", "HOME_PREVALIDATION", "HOME_PAYMENT", "HOME_CHANGE_PLAN", "HOME_FEE_QUOTATION", "HOME_PREVALIDATION_RENEWAL", "HOME_PAYMENT_RENEWAL", "HOME_ADD_PRODUCT", "HOME_DELETE_PRODUCT", "HOME_POSTPAY", "MANAGE_ACCOUNT_FETCH_PROFILES", "MANAGE_ACCOUNT_RESET_LINK", "MANAGE_ACCOUNT_CHANGE_WIFI_NAME", "MANAGE_ACCOUNT_CHANGE_WIFI_PASSWORD", "HOME_4G_5G_ACCOUNT_DETAILS", "HOME_4G_5G_PLANS", "HOME_4G_5G_MPESA_PAYMENT", "HOME_4G_5G_POSTPAY_PAYMENT", "HOME_4G_5G_ENOUGH_BAL_PAYMENT", "HOME_4G_5G_AUTORENEW_OPTOUT", "HOME_FAMILY_SHARE_LIST_BENEFICIARIES", "HOME_FAMILY_SHARE_ADD_BENEFICIARY", "HOME_FAMILY_SHARE_DELETE_BENEFICIARY", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Endpoints {
    public static final int $stable = 0;
    public static final String HOME_4G_5G_ACCOUNT_DETAILS = "/home4g/account-details-reactive/api/v1/queryAccountDetails";
    public static final String HOME_4G_5G_AUTORENEW_OPTOUT = "/home4g/postpay/api/v1/postpay-optout";
    public static final String HOME_4G_5G_ENOUGH_BAL_PAYMENT = "/home/4g/5g/payments/api/v1/enoughBal/regular";
    public static final String HOME_4G_5G_MPESA_PAYMENT = "/home/4g/5g/payments/api/v1/mpesa/regular";
    public static final String HOME_4G_5G_PLANS = "/home-4g-5g-reactive/api/v1/getPlans";
    public static final String HOME_4G_5G_POSTPAY_PAYMENT = "/home/4g/5g/payments/api/v1/postPay/regular";
    public static final String HOME_ACCOUNT_BALANCES = "/ms-home-dxl-query-rental-cycle/api/v1/cycle";
    public static final String HOME_ACCOUNT_DETAILS = "/ms-home-dxl-query-offering/api/v1/query-products";
    public static final String HOME_ADD_PRODUCT = "/ms-home-dxl-add-product/api/v1/addProduct";
    public static final String HOME_CHANGE_PLAN = "/ms-home-dxl-change-plan/api/v1/change-plan";
    public static final String HOME_DELETE_PRODUCT = "/ms-home-dxl-delete-product/api/v1/deleteProduct";
    public static final String HOME_FAMILY_SHARE_ADD_BENEFICIARY = "/ms-fd-myob-beneficiary-add-dxl/api/v1/beneficiary-management/relationships";
    public static final String HOME_FAMILY_SHARE_DELETE_BENEFICIARY = "/ms-fd-myob-beneficiary-delete-dxl/api/v1/beneficiary-management/delete";
    public static final String HOME_FAMILY_SHARE_LIST_BENEFICIARIES = "/ms-fd-myob-beneficiary-list-dxl/api/v1/beneficiary-management/relationships";
    public static final String HOME_FEE_QUOTATION = "/ms-home-dxl-fee-quotation/api/v1/fee-quotation";
    public static final String HOME_PAYMENT = "/ms-home-dxl-mpesa-payments/api/v2/pay";
    public static final String HOME_PAYMENT_RENEWAL = "/ms-fd-pin-on-app/api/v1/pinOnApp";
    public static final String HOME_POSTPAY = "/ms-home-dxl-pay-via-postpay/api/v1/pay";
    public static final String HOME_PREVALIDATION = "/ms-home-dxl-mpesa-pre-validation-wrapper/api/v1/prevalidation";
    public static final String HOME_PREVALIDATION_RENEWAL = "/ms-home-dxl-mpesa-pre-validation-wrapper/api/v2/prevalidation";
    public static final String HOME_PRODUCTS = "/ms-home-dxl-products/api/v1/products";
    public static final String HOME_USER_DETAILS = "/ms-home-dxl-customer-details-oracle/api/v1/account/details";
    public static final Endpoints INSTANCE = new Endpoints();
    public static final String MANAGE_ACCOUNT_CHANGE_WIFI_NAME = "/ms-home-dxl-wifi-credentials/api/v1/manage-wifi-credentials/change-name";
    public static final String MANAGE_ACCOUNT_CHANGE_WIFI_PASSWORD = "/ms-home-dxl-wifi-credentials/api/v1/manage-wifi-credentials/change-passphrase";
    public static final String MANAGE_ACCOUNT_FETCH_PROFILES = "/ms-home-dxl-fetch-profile/api/v2/profiles";
    public static final String MANAGE_ACCOUNT_RESET_LINK = "/ms-home-dxl-wifi-credentials/api/v1/manage-wifi-credentials/change-link";
    private static int component3 = 0;
    private static int copydefault = 1;

    private Endpoints() {
    }

    static {
        int i = component3 + 13;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 52 / 0;
        }
    }
}
