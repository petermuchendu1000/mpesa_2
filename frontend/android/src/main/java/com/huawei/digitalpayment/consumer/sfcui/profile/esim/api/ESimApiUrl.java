package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/ESimApiUrl;", "", "<init>", "()V", "E_SIM_RESERVATION_QUERY", "", "E_SIM_RESERVATION", "E_SIM_GENERATE_OTP", "E_SIM_VALIDATE_OTP", "E_SIM_RESEND_OTP", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimApiUrl {
    public static final int $stable = 0;
    public static final String E_SIM_GENERATE_OTP = "/ms-otp-authentication-revamp/api/v1/generateOTP";
    public static final String E_SIM_RESEND_OTP = "ms-otp-authentication-revamp/api/v1/resendOTP";
    public static final String E_SIM_RESERVATION = "/ms-esim-reservation/api/v1/reserve";
    public static final String E_SIM_RESERVATION_QUERY = "/ms-esim-reservation/api/v1/query";
    public static final String E_SIM_VALIDATE_OTP = "/ms-otp-authentication-revamp/api/v1/validateOTP";
    public static final ESimApiUrl INSTANCE = new ESimApiUrl();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    private ESimApiUrl() {
    }

    static {
        int i = component2 + 99;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
