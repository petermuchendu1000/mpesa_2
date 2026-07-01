package com.huawei.digitalpayment.consumer.nfc.constants;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/constants/NfcConstants;", "", "Companion", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NfcConstants {

    public static final Companion INSTANCE = Companion.component3;
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_AVATAR = "avatar";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_RECEIVER = "receiverMsisdn";
    public static final String KEY_RECEIVE_NAME = "receiveName";
    public static final String SAVE_URI = "saveUri";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/constants/NfcConstants$Companion;", "", "<init>", "()V", "KEY_AMOUNT", "", "SAVE_URI", "KEY_RECEIVE_NAME", "KEY_CURRENCY", "KEY_AVATAR", "KEY_RECEIVER", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final String KEY_AMOUNT = "amount";
        public static final String KEY_AVATAR = "avatar";
        public static final String KEY_CURRENCY = "currency";
        public static final String KEY_RECEIVER = "receiverMsisdn";
        public static final String KEY_RECEIVE_NAME = "receiveName";
        public static final String SAVE_URI = "saveUri";
        private static int ShareDataUIState = 1;
        static final Companion component3 = new Companion();
        private static int copydefault;

        private Companion() {
        }

        static {
            int i = ShareDataUIState + 25;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 40 / 0;
            }
        }
    }
}
