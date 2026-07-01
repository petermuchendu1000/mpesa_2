package com.huawei.common.config;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem;
import com.huawei.common.util.NumberUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020\u00182\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u001e\u001a\u00020\u00182\b\b\u0001\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\bJ\u0010\u0010\"\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/huawei/common/config/AmountConfig;", "", "<init>", "()V", ActionSheetItem.BadgeInfo.TYPE_POINT, "", "zero", "pointLength", "", "inputMaxLength", "maxValue", "", "Ljava/lang/Double;", "limit", "", "symbol", "unit", "getSymbol", "getPointLength", "getInputMaxLength", "getZero", "getPoint", "getUnit", "setUnit", "", "setZero", "setPoint", "setLimit", "getLimit", "setPointLength", "setMaxLength", "maxLength", "getInputMaxValue", "inputLength", "setSymbol", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountConfig {
    public static final AmountConfig INSTANCE;
    private static Double ShareDataUIState;
    private static char component1;
    private static int component2;
    private static int component3;
    private static String copydefault;
    private static String equals;
    private static String getAsAtTimestamp;
    private static char getRequestBeneficiariesState;

    private AmountConfig() {
    }

    static {
        AmountConfig amountConfig = new AmountConfig();
        INSTANCE = amountConfig;
        component1 = '.';
        getRequestBeneficiariesState = '0';
        component2 = 2;
        component3 = 10;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("(([0-9]|\\%s)*)", Arrays.copyOf(new Object[]{Character.valueOf(amountConfig.getPoint())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        copydefault = str;
    }

    public final String getSymbol() {
        return getAsAtTimestamp;
    }

    public final int getPointLength() {
        return component2;
    }

    public final int getInputMaxLength() {
        return component3;
    }

    public final char getZero() {
        return getRequestBeneficiariesState;
    }

    public final char getPoint() {
        return component1;
    }

    public final String getUnit() {
        return equals;
    }

    public final void setUnit(String unit) {
        equals = unit;
    }

    public final void setZero(char zero) {
        getRequestBeneficiariesState = zero;
    }

    public final void setPoint(char point) {
        component1 = point;
    }

    public final void setLimit(String limit) {
        Intrinsics.checkNotNullParameter(limit, "");
        copydefault = limit;
    }

    public final String getLimit() {
        return copydefault;
    }

    public final void setPointLength(int pointLength) {
        if (pointLength < 0) {
            pointLength = 0;
        }
        component2 = pointLength;
    }

    public final void setMaxLength(int maxLength) {
        if (maxLength < 0) {
            maxLength = 0;
        }
        component3 = maxLength;
    }

    public final double getInputMaxValue() {
        Double d2 = ShareDataUIState;
        if (d2 != null) {
            Intrinsics.checkNotNull(d2);
            return d2.doubleValue();
        }
        return getInputMaxValue(getInputMaxLength());
    }

    public final double getInputMaxValue(int inputLength) {
        StringBuilder sb = new StringBuilder();
        if (inputLength <= 0) {
            sb.append("0");
        } else {
            for (int i = 0; i < inputLength; i++) {
                sb.append(PrepareException.ERROR_OFFLINE_APP);
            }
        }
        Double d2 = NumberUtils.parseDouble(sb.toString(), Double.valueOf(Double.MAX_VALUE));
        Intrinsics.checkNotNullExpressionValue(d2, "");
        return d2.doubleValue();
    }

    public final void setSymbol(String symbol) {
        getAsAtTimestamp = symbol;
    }
}
