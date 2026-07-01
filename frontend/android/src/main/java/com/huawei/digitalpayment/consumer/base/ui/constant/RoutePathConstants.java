package com.huawei.digitalpayment.consumer.base.ui.constant;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/constant/RoutePathConstants;", "", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RoutePathConstants {

    public static final Companion INSTANCE = Companion.component3;
    public static final String SFC_IDENTITY_PIN = "/sfcModule/identityPin";
    public static final String SFC_NFC = "/nfcModule/nfc";
    public static final String UNLOCK_APP = "/sfcModule/unlockApp";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/constant/RoutePathConstants$Companion;", "", "<init>", "()V", "UNLOCK_APP", "", "SFC_IDENTITY_PIN", "SFC_NFC", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final String SFC_IDENTITY_PIN = "/sfcModule/identityPin";
        public static final String SFC_NFC = "/nfcModule/nfc";
        private static int ShareDataUIState = 0;
        public static final String UNLOCK_APP = "/sfcModule/unlockApp";
        static final Companion component3 = new Companion();
        private static int copydefault = 1;

        private Companion() {
        }

        static {
            int i = ShareDataUIState + 51;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
