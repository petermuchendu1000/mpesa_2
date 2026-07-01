package com.huawei.digitalpayment.consumer.fixeddata.constant;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/constant/HomeInternetConstants;", "", "<init>", "()V", "INTERNET_TYPE_CODE_FIBRE", "", "INTERNET_TYPE_CODE_PTMP", "INTERNET_TYPE_CODE_FOUR_G", "INTERNET_TYPE_CODE_FIVE_G", "URL_FIXED_GET_CONNECTED", "URL_FIXED_HOME_FIBRE", "URL_FIXED_WIRELESS", "URL_FAQS_HOME_FIBRE", "URL_FAQS_FOUR_G_WIRELESS", "URL_FAQS_FIVE_G_WIRELESS", "ACTIVE_STATUS", "EXPIRED_STATUS", "INACTIVE_STATUS", "HttpCodes", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeInternetConstants {
    public static final int $stable = 0;
    public static final String ACTIVE_STATUS = "active";
    public static final String EXPIRED_STATUS = "expired";
    public static final String INACTIVE_STATUS = "inactive";
    public static final HomeInternetConstants INSTANCE = new HomeInternetConstants();
    public static final String INTERNET_TYPE_CODE_FIBRE = "ftth";
    public static final String INTERNET_TYPE_CODE_FIVE_G = "5g";
    public static final String INTERNET_TYPE_CODE_FOUR_G = "4g";
    public static final String INTERNET_TYPE_CODE_PTMP = "ptmp";
    private static int ShareDataUIState = 0;
    public static final String URL_FAQS_FIVE_G_WIRELESS = "https://internet.safaricom.co.ke/faqs/fiveG";
    public static final String URL_FAQS_FOUR_G_WIRELESS = "https://internet.safaricom.co.ke/faqs/wireless";
    public static final String URL_FAQS_HOME_FIBRE = "https://internet.safaricom.co.ke/faqs/homeFibre";
    public static final String URL_FIXED_GET_CONNECTED = "https://internet.safaricom.co.ke/#get-connected";
    public static final String URL_FIXED_HOME_FIBRE = "https://internet.safaricom.co.ke/home";
    public static final String URL_FIXED_WIRELESS = "https://www.masoko.com/routers";
    private static int copydefault = 1;

    private HomeInternetConstants() {
    }

    static {
        int i = ShareDataUIState + 73;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/constant/HomeInternetConstants$HttpCodes;", "", "<init>", "()V", "NETWORK_ERROR_GSM_USER_NOT_VERIFIED", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HttpCodes {
        public static final int $stable = 0;
        public static final HttpCodes INSTANCE = new HttpCodes();
        public static final String NETWORK_ERROR_GSM_USER_NOT_VERIFIED = "403-87";
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        private HttpCodes() {
        }

        static {
            int i = ShareDataUIState + 65;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
