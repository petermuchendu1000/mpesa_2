package com.huawei.digitalpayment.consumer.base.sim;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SIMState;", "", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface SIMState {

    public static final Companion INSTANCE = Companion.ShareDataUIState;
    public static final String LOCAL_COUNTRY_NETWORK_CARD = "LOCAL_COUNTRY_NETWORK_CARD";
    public static final String MISSING_SIM_CARD = "MISSING_SIM_CARD";
    public static final String OTHER_COUNTRY_NETWORK_CARD = "OTHER_COUNTRY_NETWORK_CARD";
    public static final String VALID_SIM_CARD = "VALID_SIM_CARD";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SIMState$Companion;", "", "<init>", "()V", "MISSING_SIM_CARD", "", "OTHER_COUNTRY_NETWORK_CARD", "LOCAL_COUNTRY_NETWORK_CARD", "VALID_SIM_CARD", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final String LOCAL_COUNTRY_NETWORK_CARD = "LOCAL_COUNTRY_NETWORK_CARD";
        public static final String MISSING_SIM_CARD = "MISSING_SIM_CARD";
        public static final String OTHER_COUNTRY_NETWORK_CARD = "OTHER_COUNTRY_NETWORK_CARD";
        static final Companion ShareDataUIState = new Companion();
        public static final String VALID_SIM_CARD = "VALID_SIM_CARD";
        private static int component2 = 1;
        private static int component3;

        private Companion() {
        }

        static {
            int i = component2 + 29;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
