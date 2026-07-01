package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/BongaTransferConstants;", "", "<init>", "()V", "KEY_TRANSFER_AMOUNT", "", "KEY_BENEFICIARY_NUMBER", "KEY_TRANSACTION_TITLE", "KEY_BONGA_VALIDITY", "KEY_BONGA_VALUE", "KEY_BONGA_RESOURCE", "KEY_TRANSACTION_TYPE", "KEY_BONGA_MATRIX_UNIT", "KEY_AVATAR_ICON", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaTransferConstants {
    public static final int $stable = 0;
    public static final BongaTransferConstants INSTANCE = new BongaTransferConstants();
    public static final String KEY_AVATAR_ICON = "confirm_screen_icon";
    public static final String KEY_BENEFICIARY_NUMBER = "beneficiary_number";
    public static final String KEY_BONGA_MATRIX_UNIT = "bonga_matrix_unit";
    public static final String KEY_BONGA_RESOURCE = "bonga_resource";
    public static final String KEY_BONGA_VALIDITY = "bonga_validity";
    public static final String KEY_BONGA_VALUE = "bonga_value";
    public static final String KEY_TRANSACTION_TITLE = "transaction_title";
    public static final String KEY_TRANSACTION_TYPE = "transaction_type";
    public static final String KEY_TRANSFER_AMOUNT = "transfer_amount";
    private static int ShareDataUIState = 1;
    private static int component3;

    private BongaTransferConstants() {
    }

    static {
        int i = component3 + 121;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
