package com.huawei.digitalpayment.consumer.sfcui.constants;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/constants/PostpayConstants;", "", "<init>", "()V", "KEY_TRANSACTION_TYPE", "", "KEY_TRANSACTION_TITLE", "KEY_AMOUNT", "KEY_EMAIL", "KEY_PIN_TYPE", "KEY_PHONE_NUMBER", "KEY_AVATAR_ICON", "KEY_OUTSTANDING_AMOUNT", "KEY_CONFIRMATION_DATA", "TRANSACTION_REQUEST_BILL", "TRANSACTION_PAY_BILL", "TRANSACTION_TERMINATE_POSTPAY", "TRANSACTION_CHANGE_PLAN", "POST_PAY_CREDIT_LIMIT_FOUND", "", "KEY_CURRENT_PLAN", "KEY_CURRENT_PLAN_PRICE", "KEY_CURRENT_PLAN_PRODUCT_ID", "KEY_CREDIT_LIMIT", "KEY_CURRENT_DEPOSIT", "KEY_AVAILABLE_PLANS", "KEY_POSTPAY_PLAN", "KEY_OUTSTANDING_BILL", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayConstants {
    public static final int $stable = 0;
    public static final PostpayConstants INSTANCE = new PostpayConstants();
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_AVAILABLE_PLANS = "available_plans";
    public static final String KEY_AVATAR_ICON = "avatar_icon";
    public static final String KEY_CONFIRMATION_DATA = "confirmation_data";
    public static final String KEY_CREDIT_LIMIT = "credit_limit";
    public static final String KEY_CURRENT_DEPOSIT = "current_deposit";
    public static final String KEY_CURRENT_PLAN = "current_plan";
    public static final String KEY_CURRENT_PLAN_PRICE = "current_plan_price";
    public static final String KEY_CURRENT_PLAN_PRODUCT_ID = "current_plan_product_id";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_OUTSTANDING_AMOUNT = "outstanding_amount";
    public static final String KEY_OUTSTANDING_BILL = "outstanding_bill";
    public static final String KEY_PHONE_NUMBER = "phone_number";
    public static final String KEY_PIN_TYPE = "pin_type";
    public static final String KEY_POSTPAY_PLAN = "postpay_plan";
    public static final String KEY_TRANSACTION_TITLE = "transaction_title";
    public static final String KEY_TRANSACTION_TYPE = "transaction_type";
    public static final int POST_PAY_CREDIT_LIMIT_FOUND = 1000;
    public static final String TRANSACTION_CHANGE_PLAN = "change_plan";
    public static final String TRANSACTION_PAY_BILL = "pay_bill";
    public static final String TRANSACTION_REQUEST_BILL = "request_bill";
    public static final String TRANSACTION_TERMINATE_POSTPAY = "terminate_postpay";
    private static int component1 = 1;
    private static int copydefault;

    private PostpayConstants() {
    }

    static {
        int i = copydefault + 95;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
