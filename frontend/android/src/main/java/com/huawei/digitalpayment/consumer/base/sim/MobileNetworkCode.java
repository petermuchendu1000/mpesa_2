package com.huawei.digitalpayment.consumer.base.sim;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/MobileNetworkCode;", "", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface MobileNetworkCode {

    public static final Companion INSTANCE = Companion.component1;
    public static final int SAFARICOM = 2;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/MobileNetworkCode$Companion;", "", "<init>", "()V", "SAFARICOM", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final int SAFARICOM = 2;
        private static int ShareDataUIState = 1;
        static final Companion component1 = new Companion();
        private static int component3;

        private Companion() {
        }

        static {
            int i = component3 + 107;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
