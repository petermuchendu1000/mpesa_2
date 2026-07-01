package com.huawei.digitalpayment.consumer.home.constants;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/constants/Constants;", "", "<init>", "()V", "BAZE_URL", "", "NEWS_URL", "GAMES_URL", "JOBS_URL", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {
    public static final int $stable = 0;
    public static final String BAZE_URL = "https://www.baze.co.ke";
    public static final String GAMES_URL = "https://myaccount.safaricom.co.ke/discover/games";
    public static final Constants INSTANCE = new Constants();
    public static final String JOBS_URL = "https://www.safaricom.co.ke/careers/";
    public static final String NEWS_URL = "https://myaccount.safaricom.co.ke/discover/e-newspaper/publications";
    private static int ShareDataUIState = 1;
    private static int component3;

    private Constants() {
    }

    static {
        int i = ShareDataUIState + 115;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
