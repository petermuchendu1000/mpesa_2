package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.common.interceptor.AppLogInterceptor;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0012HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0012HÆ\u0003J\t\u0010`\u001a\u00020\u001cHÆ\u0003J\t\u0010a\u001a\u00020\u0012HÆ\u0003J\t\u0010b\u001a\u00020\u0012HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003JÅ\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u0003HÇ\u0001J\u0013\u0010k\u001a\u00020\u00122\b\u0010l\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010m\u001a\u00020nH×\u0001J\t\u0010o\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\u001a\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001d\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0011\u0010\u001e\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)¨\u0006p"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/AtmTransferResp;", "Lcom/huawei/http/BaseResp;", "accountBalance", "", "accountBalanceDisplay", "actualAmountDisplay", "businessType", "commissionAmount", "commissionAmountDisplay", "commissionDisplayFormat", "currency", "discountAmountDisplay", "displayItems", "", "", "errorCode", "errorMsg", "exportImage", "", "feeAmountDisplay", "feeDisplayFormat", AppLogInterceptor.MESSAGE_ID, "orderStatus", "originalAmountDisplay", "originalDisplayFormat", "payAmountDisplay", "pollFlag", "referenceData", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/ReferenceData;", "retryPayFlag", "switchPayMethodFlag", "taxAmountDisplay", "title", "totalAmountWithFee", "totalAmountWithFeeDisplay", "transTime", "unit", "unitType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/digitalpayment/consumer/sfcui/ui/resp/ReferenceData;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountBalance", "()Ljava/lang/String;", "getAccountBalanceDisplay", "getActualAmountDisplay", "getBusinessType", "getCommissionAmount", "getCommissionAmountDisplay", "getCommissionDisplayFormat", "getCurrency", "getDiscountAmountDisplay", "getDisplayItems", "()Ljava/util/List;", "getErrorCode", "getErrorMsg", "getExportImage", "()Z", "getFeeAmountDisplay", "getFeeDisplayFormat", "getMessageId", "getOrderStatus", "getOriginalAmountDisplay", "getOriginalDisplayFormat", "getPayAmountDisplay", "getPollFlag", "getReferenceData", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/ReferenceData;", "getRetryPayFlag", "getSwitchPayMethodFlag", "getTaxAmountDisplay", "getTitle", "getTotalAmountWithFee", "getTotalAmountWithFeeDisplay", "getTransTime", "getUnit", "getUnitType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AtmTransferResp extends BaseResp {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 97 % 128;
    private final String accountBalance;
    private final String accountBalanceDisplay;
    private final String actualAmountDisplay;
    private final String businessType;
    private final String commissionAmount;
    private final String commissionAmountDisplay;
    private final String commissionDisplayFormat;
    private final String currency;
    private final String discountAmountDisplay;
    private final List<Object> displayItems;
    private final String errorCode;
    private final String errorMsg;
    private final boolean exportImage;
    private final String feeAmountDisplay;
    private final String feeDisplayFormat;
    private final String messageId;
    private final String orderStatus;
    private final String originalAmountDisplay;
    private final String originalDisplayFormat;
    private final String payAmountDisplay;
    private final boolean pollFlag;
    private final ReferenceData referenceData;
    private final boolean retryPayFlag;
    private final boolean switchPayMethodFlag;
    private final String taxAmountDisplay;
    private final String title;
    private final String totalAmountWithFee;
    private final String totalAmountWithFeeDisplay;
    private final String transTime;
    private final String unit;
    private final String unitType;

    public final String getAccountBalance() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountBalance;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountBalanceDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accountBalanceDisplay;
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return str;
    }

    public final String getActualAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.actualAmountDisplay;
        int i4 = i2 + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBusinessType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.businessType;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCommissionAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.commissionAmount;
            int i4 = 22 / 0;
        } else {
            str = this.commissionAmount;
        }
        int i5 = i2 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCommissionAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.commissionAmountDisplay;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCommissionDisplayFormat() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.commissionDisplayFormat;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getDiscountAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.discountAmountDisplay;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final List<Object> getDisplayItems() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<Object> list = this.displayItems;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return list;
    }

    public final String getErrorCode() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.errorCode;
        }
        throw null;
    }

    public final String getErrorMsg() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.errorMsg;
        }
        throw null;
    }

    public final boolean getExportImage() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.exportImage;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getFeeAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.feeAmountDisplay;
        int i5 = i2 + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFeeDisplayFormat() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.feeDisplayFormat;
            int i4 = 86 / 0;
        } else {
            str = this.feeDisplayFormat;
        }
        int i5 = i2 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.messageId;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final String getOrderStatus() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.orderStatus;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOriginalAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.originalAmountDisplay;
        int i4 = i2 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOriginalDisplayFormat() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.originalDisplayFormat;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getPayAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payAmountDisplay;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getPollFlag() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.pollFlag;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ReferenceData getReferenceData() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.referenceData;
        }
        throw null;
    }

    public final boolean getRetryPayFlag() {
        boolean z;
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            z = this.retryPayFlag;
            int i4 = 3 / 0;
        } else {
            z = this.retryPayFlag;
        }
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getSwitchPayMethodFlag() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.switchPayMethodFlag;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTaxAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.taxAmountDisplay;
        }
        throw null;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 87;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTotalAmountWithFee() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.totalAmountWithFee;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String getTotalAmountWithFeeDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.totalAmountWithFeeDisplay;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTransTime() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transTime;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getUnitType() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public AtmTransferResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<? extends Object> list, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z2, ReferenceData referenceData, boolean z3, boolean z4, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(referenceData, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        this.accountBalance = str;
        this.accountBalanceDisplay = str2;
        this.actualAmountDisplay = str3;
        this.businessType = str4;
        this.commissionAmount = str5;
        this.commissionAmountDisplay = str6;
        this.commissionDisplayFormat = str7;
        this.currency = str8;
        this.discountAmountDisplay = str9;
        this.displayItems = list;
        this.errorCode = str10;
        this.errorMsg = str11;
        this.exportImage = z;
        this.feeAmountDisplay = str12;
        this.feeDisplayFormat = str13;
        this.messageId = str14;
        this.orderStatus = str15;
        this.originalAmountDisplay = str16;
        this.originalDisplayFormat = str17;
        this.payAmountDisplay = str18;
        this.pollFlag = z2;
        this.referenceData = referenceData;
        this.retryPayFlag = z3;
        this.switchPayMethodFlag = z4;
        this.taxAmountDisplay = str19;
        this.title = str20;
        this.totalAmountWithFee = str21;
        this.totalAmountWithFeeDisplay = str22;
        this.transTime = str23;
        this.unit = str24;
        this.unitType = str25;
    }

    static {
        int i = 97 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AtmTransferResp copy$default(AtmTransferResp atmTransferResp, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z2, ReferenceData referenceData, boolean z3, boolean z4, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i, Object obj) {
        String str26;
        String str27;
        String str28;
        boolean z5;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        int i2 = 2 % 2;
        String str44 = (i & 1) != 0 ? atmTransferResp.accountBalance : str;
        String str45 = (i & 2) != 0 ? atmTransferResp.accountBalanceDisplay : str2;
        String str46 = (i & 4) != 0 ? atmTransferResp.actualAmountDisplay : str3;
        String str47 = (i & 8) != 0 ? atmTransferResp.businessType : str4;
        String str48 = (i & 16) != 0 ? atmTransferResp.commissionAmount : str5;
        String str49 = (i & 32) != 0 ? atmTransferResp.commissionAmountDisplay : str6;
        String str50 = (i & 64) != 0 ? atmTransferResp.commissionDisplayFormat : str7;
        if ((i & 128) != 0) {
            int i3 = component3 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str26 = atmTransferResp.currency;
        } else {
            str26 = str8;
        }
        String str51 = (i & 256) != 0 ? atmTransferResp.discountAmountDisplay : str9;
        List list2 = (i & 512) != 0 ? atmTransferResp.displayItems : list;
        String str52 = (i & 1024) != 0 ? atmTransferResp.errorCode : str10;
        if ((i & 2048) != 0) {
            int i5 = component3 + 79;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str27 = atmTransferResp.errorMsg;
        } else {
            str27 = str11;
        }
        boolean z11 = (i & 4096) != 0 ? atmTransferResp.exportImage : z;
        String str53 = (i & 8192) != 0 ? atmTransferResp.feeAmountDisplay : str12;
        String str54 = (i & 16384) != 0 ? atmTransferResp.feeDisplayFormat : str13;
        Object obj2 = null;
        if ((i & 32768) != 0) {
            str28 = str54;
            int i7 = component3 + 75;
            z5 = z11;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                String str55 = atmTransferResp.messageId;
                throw null;
            }
            str29 = atmTransferResp.messageId;
        } else {
            str28 = str54;
            z5 = z11;
            str29 = str14;
        }
        String str56 = (65536 & i) != 0 ? atmTransferResp.orderStatus : str15;
        if ((i & 131072) != 0) {
            str31 = str56;
            int i8 = component1 + 41;
            str30 = str29;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                String str57 = atmTransferResp.originalAmountDisplay;
                obj2.hashCode();
                throw null;
            }
            str32 = atmTransferResp.originalAmountDisplay;
        } else {
            str30 = str29;
            str31 = str56;
            str32 = str16;
        }
        String str58 = (262144 & i) != 0 ? atmTransferResp.originalDisplayFormat : str17;
        String str59 = (i & 524288) != 0 ? atmTransferResp.payAmountDisplay : str18;
        if ((i & 1048576) != 0) {
            str34 = str59;
            int i9 = component3 + 21;
            str33 = str32;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            z6 = atmTransferResp.pollFlag;
        } else {
            str33 = str32;
            str34 = str59;
            z6 = z2;
        }
        ReferenceData referenceData2 = (2097152 & i) != 0 ? atmTransferResp.referenceData : referenceData;
        boolean z12 = (i & 4194304) != 0 ? atmTransferResp.retryPayFlag : z3;
        if ((i & 8388608) != 0) {
            z8 = z12;
            int i11 = component3 + 35;
            z7 = z6;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            z9 = atmTransferResp.switchPayMethodFlag;
            if (i12 == 0) {
                int i13 = 87 / 0;
            }
        } else {
            z7 = z6;
            z8 = z12;
            z9 = z4;
        }
        String str60 = (16777216 & i) != 0 ? atmTransferResp.taxAmountDisplay : str19;
        if ((i & 33554432) != 0) {
            str35 = str60;
            int i14 = component3 + 19;
            z10 = z9;
            component1 = i14 % 128;
            if (i14 % 2 == 0) {
                String str61 = atmTransferResp.title;
                obj2.hashCode();
                throw null;
            }
            str36 = atmTransferResp.title;
        } else {
            z10 = z9;
            str35 = str60;
            str36 = str20;
        }
        String str62 = (67108864 & i) != 0 ? atmTransferResp.totalAmountWithFee : str21;
        if ((i & 134217728) != 0) {
            str38 = str62;
            int i15 = component3 + 15;
            str37 = str36;
            component1 = i15 % 128;
            if (i15 % 2 == 0) {
                String str63 = atmTransferResp.totalAmountWithFeeDisplay;
                obj2.hashCode();
                throw null;
            }
            str39 = atmTransferResp.totalAmountWithFeeDisplay;
        } else {
            str37 = str36;
            str38 = str62;
            str39 = str22;
        }
        if ((268435456 & i) != 0) {
            int i16 = component3 + 5;
            str40 = str39;
            component1 = i16 % 128;
            int i17 = i16 % 2;
            str41 = atmTransferResp.transTime;
            if (i17 == 0) {
                int i18 = 1 / 0;
            }
        } else {
            str40 = str39;
            str41 = str23;
        }
        if ((536870912 & i) != 0) {
            int i19 = component1 + 1;
            str42 = str41;
            component3 = i19 % 128;
            if (i19 % 2 != 0) {
                String str64 = atmTransferResp.unit;
                obj2.hashCode();
                throw null;
            }
            str43 = atmTransferResp.unit;
        } else {
            str42 = str41;
            str43 = str24;
        }
        return atmTransferResp.copy(str44, str45, str46, str47, str48, str49, str50, str26, str51, list2, str52, str27, z5, str53, str28, str30, str31, str33, str58, str34, z7, referenceData2, z8, z10, str35, str37, str38, str40, str42, str43, (i & 1073741824) != 0 ? atmTransferResp.unitType : str25);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountBalance;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<Object> component10() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.displayItems;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.errorCode;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.errorMsg;
        int i5 = i3 + 3;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component13() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.exportImage;
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return z;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.feeAmountDisplay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.feeDisplayFormat;
            int i4 = 42 / 0;
        } else {
            str = this.feeDisplayFormat;
        }
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.messageId;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.orderStatus;
        }
        throw null;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.originalAmountDisplay;
        int i5 = i2 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.originalDisplayFormat;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.accountBalanceDisplay;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component20() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.payAmountDisplay;
            int i4 = 61 / 0;
        } else {
            str = this.payAmountDisplay;
        }
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component21() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.pollFlag;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ReferenceData component22() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ReferenceData referenceData = this.referenceData;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return referenceData;
    }

    public final boolean component23() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.retryPayFlag;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component24() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.switchPayMethodFlag;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return z;
    }

    public final String component25() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.taxAmountDisplay;
            int i4 = 15 / 0;
        } else {
            str = this.taxAmountDisplay;
        }
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final String component26() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 51;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component27() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.totalAmountWithFee;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component28() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalAmountWithFeeDisplay;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component29() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transTime;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.actualAmountDisplay;
        }
        throw null;
    }

    public final String component30() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.unit;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public final String component31() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.businessType;
        int i4 = i2 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.commissionAmount;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.commissionAmountDisplay;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.commissionDisplayFormat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.discountAmountDisplay;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final AtmTransferResp copy(String accountBalance, String accountBalanceDisplay, String actualAmountDisplay, String businessType, String commissionAmount, String commissionAmountDisplay, String commissionDisplayFormat, String currency, String discountAmountDisplay, List<? extends Object> displayItems, String errorCode, String errorMsg, boolean exportImage, String feeAmountDisplay, String feeDisplayFormat, String messageId, String orderStatus, String originalAmountDisplay, String originalDisplayFormat, String payAmountDisplay, boolean pollFlag, ReferenceData referenceData, boolean retryPayFlag, boolean switchPayMethodFlag, String taxAmountDisplay, String title, String totalAmountWithFee, String totalAmountWithFeeDisplay, String transTime, String unit, String unitType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountBalance, "");
        Intrinsics.checkNotNullParameter(accountBalanceDisplay, "");
        Intrinsics.checkNotNullParameter(actualAmountDisplay, "");
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(commissionAmount, "");
        Intrinsics.checkNotNullParameter(commissionAmountDisplay, "");
        Intrinsics.checkNotNullParameter(commissionDisplayFormat, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(discountAmountDisplay, "");
        Intrinsics.checkNotNullParameter(displayItems, "");
        Intrinsics.checkNotNullParameter(errorCode, "");
        Intrinsics.checkNotNullParameter(errorMsg, "");
        Intrinsics.checkNotNullParameter(feeAmountDisplay, "");
        Intrinsics.checkNotNullParameter(feeDisplayFormat, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        Intrinsics.checkNotNullParameter(orderStatus, "");
        Intrinsics.checkNotNullParameter(originalAmountDisplay, "");
        Intrinsics.checkNotNullParameter(originalDisplayFormat, "");
        Intrinsics.checkNotNullParameter(payAmountDisplay, "");
        Intrinsics.checkNotNullParameter(referenceData, "");
        Intrinsics.checkNotNullParameter(taxAmountDisplay, "");
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(totalAmountWithFee, "");
        Intrinsics.checkNotNullParameter(totalAmountWithFeeDisplay, "");
        Intrinsics.checkNotNullParameter(transTime, "");
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(unitType, "");
        AtmTransferResp atmTransferResp = new AtmTransferResp(accountBalance, accountBalanceDisplay, actualAmountDisplay, businessType, commissionAmount, commissionAmountDisplay, commissionDisplayFormat, currency, discountAmountDisplay, displayItems, errorCode, errorMsg, exportImage, feeAmountDisplay, feeDisplayFormat, messageId, orderStatus, originalAmountDisplay, originalDisplayFormat, payAmountDisplay, pollFlag, referenceData, retryPayFlag, switchPayMethodFlag, taxAmountDisplay, title, totalAmountWithFee, totalAmountWithFeeDisplay, transTime, unit, unitType);
        int i2 = component3 + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return atmTransferResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtmTransferResp)) {
            int i2 = component3 + 57;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AtmTransferResp atmTransferResp = (AtmTransferResp) other;
        if (!Intrinsics.areEqual(this.accountBalance, atmTransferResp.accountBalance)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountBalanceDisplay, atmTransferResp.accountBalanceDisplay)) {
            int i4 = component1 + 103;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.actualAmountDisplay, atmTransferResp.actualAmountDisplay)) {
            int i5 = component1 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.businessType, atmTransferResp.businessType) && Intrinsics.areEqual(this.commissionAmount, atmTransferResp.commissionAmount) && Intrinsics.areEqual(this.commissionAmountDisplay, atmTransferResp.commissionAmountDisplay) && Intrinsics.areEqual(this.commissionDisplayFormat, atmTransferResp.commissionDisplayFormat) && !(!Intrinsics.areEqual(this.currency, atmTransferResp.currency))) {
            if (!Intrinsics.areEqual(this.discountAmountDisplay, atmTransferResp.discountAmountDisplay)) {
                int i7 = component1 + 79;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.displayItems, atmTransferResp.displayItems) || !Intrinsics.areEqual(this.errorCode, atmTransferResp.errorCode) || !Intrinsics.areEqual(this.errorMsg, atmTransferResp.errorMsg) || this.exportImage != atmTransferResp.exportImage) {
                return false;
            }
            if (!Intrinsics.areEqual(this.feeAmountDisplay, atmTransferResp.feeAmountDisplay)) {
                int i9 = component1 + 113;
                component3 = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.feeDisplayFormat, atmTransferResp.feeDisplayFormat)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.messageId, atmTransferResp.messageId)) {
                int i11 = component1 + 41;
                int i12 = i11 % 128;
                component3 = i12;
                boolean z = i11 % 2 != 0;
                int i13 = i12 + 3;
                component1 = i13 % 128;
                int i14 = i13 % 2;
                return z;
            }
            if (!Intrinsics.areEqual(this.orderStatus, atmTransferResp.orderStatus)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.originalAmountDisplay, atmTransferResp.originalAmountDisplay)) {
                int i15 = component1 + 75;
                component3 = i15 % 128;
                return i15 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.originalDisplayFormat, atmTransferResp.originalDisplayFormat)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.payAmountDisplay, atmTransferResp.payAmountDisplay)) {
                int i16 = component3 + 79;
                component1 = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            if (this.pollFlag != atmTransferResp.pollFlag || !Intrinsics.areEqual(this.referenceData, atmTransferResp.referenceData) || this.retryPayFlag != atmTransferResp.retryPayFlag || this.switchPayMethodFlag != atmTransferResp.switchPayMethodFlag || !Intrinsics.areEqual(this.taxAmountDisplay, atmTransferResp.taxAmountDisplay) || !Intrinsics.areEqual(this.title, atmTransferResp.title) || !Intrinsics.areEqual(this.totalAmountWithFee, atmTransferResp.totalAmountWithFee) || !Intrinsics.areEqual(this.totalAmountWithFeeDisplay, atmTransferResp.totalAmountWithFeeDisplay) || !Intrinsics.areEqual(this.transTime, atmTransferResp.transTime)) {
                return false;
            }
            if (Intrinsics.areEqual(this.unit, atmTransferResp.unit)) {
                return Intrinsics.areEqual(this.unitType, atmTransferResp.unitType);
            }
            int i18 = component3 + 123;
            component1 = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.accountBalance.hashCode() * 31) + this.accountBalanceDisplay.hashCode()) * 31) + this.actualAmountDisplay.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.commissionAmount.hashCode()) * 31) + this.commissionAmountDisplay.hashCode()) * 31) + this.commissionDisplayFormat.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.discountAmountDisplay.hashCode()) * 31) + this.displayItems.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.errorMsg.hashCode()) * 31) + Boolean.hashCode(this.exportImage)) * 31) + this.feeAmountDisplay.hashCode()) * 31) + this.feeDisplayFormat.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.orderStatus.hashCode()) * 31) + this.originalAmountDisplay.hashCode()) * 31) + this.originalDisplayFormat.hashCode()) * 31) + this.payAmountDisplay.hashCode()) * 31) + Boolean.hashCode(this.pollFlag)) * 31) + this.referenceData.hashCode()) * 31) + Boolean.hashCode(this.retryPayFlag)) * 31) + Boolean.hashCode(this.switchPayMethodFlag)) * 31) + this.taxAmountDisplay.hashCode()) * 31) + this.title.hashCode()) * 31) + this.totalAmountWithFee.hashCode()) * 31) + this.totalAmountWithFeeDisplay.hashCode()) * 31) + this.transTime.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.unitType.hashCode();
        int i4 = component3 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AtmTransferResp(accountBalance=" + this.accountBalance + ", accountBalanceDisplay=" + this.accountBalanceDisplay + ", actualAmountDisplay=" + this.actualAmountDisplay + ", businessType=" + this.businessType + ", commissionAmount=" + this.commissionAmount + ", commissionAmountDisplay=" + this.commissionAmountDisplay + ", commissionDisplayFormat=" + this.commissionDisplayFormat + ", currency=" + this.currency + ", discountAmountDisplay=" + this.discountAmountDisplay + ", displayItems=" + this.displayItems + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", exportImage=" + this.exportImage + ", feeAmountDisplay=" + this.feeAmountDisplay + ", feeDisplayFormat=" + this.feeDisplayFormat + ", messageId=" + this.messageId + ", orderStatus=" + this.orderStatus + ", originalAmountDisplay=" + this.originalAmountDisplay + ", originalDisplayFormat=" + this.originalDisplayFormat + ", payAmountDisplay=" + this.payAmountDisplay + ", pollFlag=" + this.pollFlag + ", referenceData=" + this.referenceData + ", retryPayFlag=" + this.retryPayFlag + ", switchPayMethodFlag=" + this.switchPayMethodFlag + ", taxAmountDisplay=" + this.taxAmountDisplay + ", title=" + this.title + ", totalAmountWithFee=" + this.totalAmountWithFee + ", totalAmountWithFeeDisplay=" + this.totalAmountWithFeeDisplay + ", transTime=" + this.transTime + ", unit=" + this.unit + ", unitType=" + this.unitType + ")";
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
