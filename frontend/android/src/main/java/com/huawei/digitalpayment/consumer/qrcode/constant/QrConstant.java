package com.huawei.digitalpayment.consumer.qrcode.constant;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElementTypeConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/constant/QrConstant;", "", "<init>", "()V", "RECEIVE_CODE", "", DynamicsElementTypeConstants.AMOUNT, "NOTE", "KEY_CURRENCY", "KEY_UNIT", "MILLS_OF_SECOND", "", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QrConstant {
    public static final String AMOUNT = "amount";
    public static final QrConstant INSTANCE = new QrConstant();
    public static final String KEY_CURRENCY = "key_currency";
    public static final String KEY_UNIT = "key_unit";
    public static final int MILLS_OF_SECOND = 1000;
    public static final String NOTE = "note";
    public static final String RECEIVE_CODE = "50";
    private static int ShareDataUIState = 1;
    private static int copydefault;

    private QrConstant() {
    }

    static {
        int i = ShareDataUIState + 91;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
