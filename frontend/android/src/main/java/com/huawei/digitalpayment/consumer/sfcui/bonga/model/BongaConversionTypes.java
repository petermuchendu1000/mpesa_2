package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionTypes;", "", "<init>", "()V", "PointsToRedeem", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "getPointsToRedeem", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "AmountToPoints", "getAmountToPoints", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaConversionTypes {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static int copy = 1;
    private static int copydefault;
    public static final BongaConversionTypes INSTANCE = new BongaConversionTypes();
    private static final BongaConversionType component2 = new BongaConversionType(R.string.gsm_label_points_to_redeem);
    private static final BongaConversionType component1 = new BongaConversionType(R.string.cash_to_spend);

    private BongaConversionTypes() {
    }

    public final BongaConversionType getPointsToRedeem() {
        int i = 2 % 2;
        int i2 = copy + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        BongaConversionType bongaConversionType = component2;
        int i5 = i3 + 63;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return bongaConversionType;
    }

    static {
        int i = component3 + 73;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public final BongaConversionType getAmountToPoints() {
        int i = 2 % 2;
        int i2 = copy + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return component1;
        }
        throw null;
    }
}
