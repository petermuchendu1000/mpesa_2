package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/MpesaGlobalApiUrl;", "", "<init>", "()V", "CUSTOMER_OPERATIONS", "", "WESTERN_UNION_COUNTRY_INFO", "WESTERN_UNION_FEE_INQUIRY", "WESTERN_UNION_SEND", "SEND_TO_MOBILE_COUNTRY_INFO", "SEND_TO_BANK_COUNTRY_INFO", "SEND_TO_BANK_FEE_INQUIRY", "ROAMING_CASHOUT_FEE_INQUIRY", "SEND_TO_MOBILE_FEE_INQUIRY", "ROAMING_CASHOUT_NAME_CHECK", "ROAMING_CASHOUT_PREVALIDATION", "SEND_TO_BANK_PAY", "SEND_TO_BANK_GET_BANK_INPUT_CONFIGS", "SEND_TO_BANK_GET_COMBO_VALUES", "SEND_TO_BANK_GET_US_STATES", "SEND_TO_MOBILE_FEE_INQUIRY_V3", "SEND_TO_MOBILE_FEE_INQUIRY_V1", "SEND_TO_MOBILE_SEND_V1", "SEND_TO_MOBILE_VALIDATION", "SEND_TO_MOBILE_COUNTRIES", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalApiUrl {
    public static final int $stable = 0;
    public static final String CUSTOMER_OPERATIONS = "/mpesa-global/customers/v1/custoperations";
    public static final MpesaGlobalApiUrl INSTANCE = new MpesaGlobalApiUrl();
    public static final String ROAMING_CASHOUT_FEE_INQUIRY = "/mpesa-global/roaming-cashout/customerMoneyTransferAPI/customerMoneyTransfer";
    public static final String ROAMING_CASHOUT_NAME_CHECK = "/mpesa-global/roaming-cashout/name-check";
    public static final String ROAMING_CASHOUT_PREVALIDATION = "/mpesa-global/roaming-cashout/pre-validation";
    public static final String SEND_TO_BANK_COUNTRY_INFO = "/mpesa-global/send-to-bank/getcountryinfo";
    public static final String SEND_TO_BANK_FEE_INQUIRY = "/mpesa-global/send-to-bank";
    public static final String SEND_TO_BANK_GET_BANK_INPUT_CONFIGS = "mpesa-global/send-to-bank-configs/mpesaglobalgetconfigs";
    public static final String SEND_TO_BANK_GET_COMBO_VALUES = "mpesa-global/send-to-bank-configs/mpesaglobalgetconfigs";
    public static final String SEND_TO_BANK_GET_US_STATES = "mpesa-global/send-to-bank-configs/all-us-states";
    public static final String SEND_TO_BANK_PAY = "/mpesa-global/send-to-bank/SendToBank";
    public static final String SEND_TO_MOBILE_COUNTRIES = "mpesa-global/send-to-mobile/v1/imtsendtomobile/getcountries";
    public static final String SEND_TO_MOBILE_COUNTRY_INFO = "/mpesa-global/send-to-mobile/v3/countries";
    public static final String SEND_TO_MOBILE_FEE_INQUIRY = "/mpesa-global/send-to-mobile/v3/transactions/cost-estimator";
    public static final String SEND_TO_MOBILE_FEE_INQUIRY_V1 = "/mpesa-global/send-to-mobile/v1/imtsendtomobile";
    public static final String SEND_TO_MOBILE_FEE_INQUIRY_V3 = "/mpesa-global/send-to-mobile/v3/transactions/cost-estimator";
    public static final String SEND_TO_MOBILE_SEND_V1 = "/mpesa-global/send-to-mobile/v1/imtsendtomobile";
    public static final String SEND_TO_MOBILE_VALIDATION = "/mpesa-global/send-to-mobile/v1/imtsendtomobile";
    private static int ShareDataUIState = 0;
    public static final String WESTERN_UNION_COUNTRY_INFO = "/mpesa-global/send-to-agent/getcountryinfo";
    public static final String WESTERN_UNION_FEE_INQUIRY = "/mpesa-global/send-to-agent";
    public static final String WESTERN_UNION_SEND = "/mpesa-global/send-to-agent/SendToAgent";
    private static int component1 = 1;

    private MpesaGlobalApiUrl() {
    }

    static {
        int i = component1 + 61;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
