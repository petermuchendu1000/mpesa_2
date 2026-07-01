package com.huawei.digitalpayment.history.model.response;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.view.DisplayItem;
import com.huawei.digitalpayment.history.model.entity.SettlementInfo;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;

public class TransactionHistoryDetailResponse extends BaseResp {
    public static final String AML_STATUS_APPROVED = "APPROVED";
    public static final String AML_STATUS_CONFISCATE = "CONFISCATE";
    public static final String AML_STATUS_ON_HOLD = "ON_HOLD";
    public static final String AML_STATUS_REJECTED = "REJECTED";
    public static final String AUTHORIZED = "Authorized";
    public static final String CANCELLED = "Cancelled";
    public static final String COMPLETED = "Completed";
    public static final String DECLINED = "Declined";
    public static final String EXPIRED = "Expired";
    public static final String PENDING = "Pending Authorization";
    public static final String TYPE_BP = "BillPayment";
    public static final String TYPE_CCW = "CardlessWithdrawal";
    public static final String TYPE_CIC = "UAEDeposit";
    public static final String TYPE_DEFAULT = "CommonTransaction";
    public static final String TYPE_IMT = "IMTTransfer";
    public static final String TYPE_P2P = "P2PTransfer";
    private static int component3 = 1;
    private static int copydefault;
    private String amlStatus;
    private String amount;
    private String amountDisplay;
    private String businessType;
    private boolean cancellable;
    private List<SettlementInfo> escrowInfoList;
    private boolean exportImage;
    private String hintMessage;
    private boolean isDebit;
    private String logo;
    private String logoUrl;
    private String oppositePartyMsisdn;
    private String oppositePartyName;
    private List<DisplayItem> orderDisplayItems;
    private String payerIdentityId;
    private String paymentOrderId;
    private boolean receiverIsConsumer;
    private Map<String, String> referenceData;
    private String refundStatus;
    private String remark;
    private String subTitle;
    private String title;
    private List<Field> tradeDetails;
    private String tradeStatus;
    private String tradeStatusDesc;
    private String transStatus;
    private String transType;
    private String unit;
    private String unitType;

    public String getUnitType() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnitType(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.unitType = str;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
    }

    public Map<String, String> getReferenceData() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.referenceData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setReferenceData(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.referenceData = map;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getBillShareButtonText() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Map<String, String> map = this.referenceData;
        if (map != null) {
            String str = map.get(KeysConstants.BILL_SHARE_DISPLAY);
            String str2 = this.referenceData.get(KeysConstants.BILL_SHARE_URL);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            int i4 = copydefault + 23;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public String getBillShareButtonUrl() {
        int i = 2 % 2;
        Map<String, String> map = this.referenceData;
        if (map != null) {
            String str = map.get(KeysConstants.BILL_SHARE_URL);
            if (TextUtils.isEmpty(str)) {
                int i2 = component3 + 31;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return null;
            }
            int i4 = copydefault + 61;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return str;
        }
        int i6 = copydefault + 121;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public boolean isCancellable() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.cancellable;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setCancellable(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.cancellable = z;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPayerIdentityId() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.payerIdentityId;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setPayerIdentityId(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.payerIdentityId = str;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<SettlementInfo> getEscrowInfoList() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<SettlementInfo> list = this.escrowInfoList;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return list;
    }

    public void setEscrowInfoList(List<SettlementInfo> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.escrowInfoList = list;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.amountDisplay;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.amountDisplay = str;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
    }

    public String getLogo() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.logo;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public void setLogo(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.logo = str;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
    }

    public boolean isReceiverIsConsumer() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            z = this.receiverIsConsumer;
            int i4 = 16 / 0;
        } else {
            z = this.receiverIsConsumer;
        }
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setReceiverIsConsumer(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.receiverIsConsumer = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getRefundStatus() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.refundStatus;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public void setRefundStatus(String str) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.refundStatus = str;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
    }

    public List<Field> getTradeDetails() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tradeDetails;
        }
        throw null;
    }

    public void setTradeDetails(List<Field> list) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.tradeDetails = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<DisplayItem> getOrderDisplayItems() {
        List<DisplayItem> list;
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            list = this.orderDisplayItems;
            int i4 = 31 / 0;
        } else {
            list = this.orderDisplayItems;
        }
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public void setOrderDisplayItems(List<DisplayItem> list) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.orderDisplayItems = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.unit;
        }
        throw null;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.unit = str;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getTradeStatusDesc() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.tradeStatusDesc;
        int i5 = i3 + 115;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public void setTradeStatusDesc(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.tradeStatusDesc = str;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getTradeStatus() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.tradeStatus;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTradeStatus(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.tradeStatus = str;
        int i5 = i2 + 51;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.amount = str;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getRemark() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.remark;
        int i5 = i3 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setRemark(String str) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.remark = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 45;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getTransStatus() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transStatus;
        int i5 = i2 + 67;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setTransStatus(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.transStatus = str;
        int i5 = i2 + 51;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public void setTitle(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.title = str;
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        int i6 = i2 + 59;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 75 / 0;
        }
    }

    public String getSubTitle() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.subTitle;
        int i4 = i3 + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return str;
    }

    public void setSubTitle(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.subTitle = str;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isExportImage() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.exportImage;
        int i4 = i2 + 93;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public void setExportImage(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.exportImage = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTransType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.transType;
        int i4 = i2 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setTransType(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.transType = str;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
    }

    public String getOppositePartyMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.oppositePartyMsisdn;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setOppositePartyMsisdn(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.oppositePartyMsisdn = str;
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        int i6 = i2 + 97;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getOppositePartyName() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.oppositePartyName;
        int i4 = i3 + 35;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setOppositePartyName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.oppositePartyName = str;
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 55;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public boolean isDebit() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isDebit;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setDebit(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.isDebit = z;
        int i5 = i2 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getBusinessType() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.businessType;
        int i4 = i3 + 17;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return str;
    }

    public void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.businessType = str;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
    }

    public String getLogoUrl() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.logoUrl;
        int i4 = i3 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setLogoUrl(String str) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.logoUrl = str;
        if (i4 != 0) {
            int i5 = 99 / 0;
        }
        int i6 = i3 + 67;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 92 / 0;
        }
    }

    public String getHintMessage() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hintMessage;
        int i5 = i2 + 45;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public void setHintMessage(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.hintMessage = str;
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        int i6 = i2 + 33;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 96 / 0;
        }
    }

    public String getPaymentOrderId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentOrderId;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPaymentOrderId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.paymentOrderId = str;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
    }

    public String getAmlStatus() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.amlStatus;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setAmlStatus(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.amlStatus = str;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public boolean isSuccess() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = COMPLETED.equals(this.transStatus);
        int i4 = component3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return zEquals;
    }

    public boolean isUnderProcessing() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            PENDING.equals(this.transStatus);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!PENDING.equals(this.transStatus))) {
            return true;
        }
        if (!AUTHORIZED.equals(this.transStatus)) {
            return false;
        }
        int i3 = copydefault + 23;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        int i4 = 4 % 4;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isFailed() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.component3
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "Cancelled"
            if (r1 == 0) goto L1d
            java.lang.String r1 = r4.transStatus
            boolean r1 = r3.equals(r1)
            r3 = 53
            int r3 = r3 / r2
            if (r1 != 0) goto L4f
            goto L25
        L1d:
            java.lang.String r1 = r4.transStatus
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4f
        L25:
            java.lang.String r1 = "Declined"
            java.lang.String r3 = r4.transStatus
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4f
            int r1 = com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.component3
            int r1 = r1 + 77
            int r3 = r1 % 128
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.copydefault = r3
            int r1 = r1 % r0
            java.lang.String r3 = "Expired"
            if (r1 != 0) goto L45
            java.lang.String r1 = r4.transStatus
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L5d
            goto L4f
        L45:
            java.lang.String r0 = r4.transStatus
            r3.equals(r0)
            r0 = 0
            r0.hashCode()
            throw r0
        L4f:
            int r1 = com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.copydefault
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5c
            int r0 = r0 / 4
        L5c:
            r2 = 1
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.isFailed():boolean");
    }

    public boolean isAmlApproved() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = "APPROVED".equals(this.amlStatus);
        int i4 = component3 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    public boolean isAmlOnHold() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return AML_STATUS_ON_HOLD.equals(this.amlStatus);
        }
        AML_STATUS_ON_HOLD.equals(this.amlStatus);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isAmlFailed() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = "REJECTED"
            java.lang.String r2 = r4.amlStatus
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2f
            int r1 = com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.component3
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "CONFISCATE"
            if (r1 == 0) goto L27
            java.lang.String r1 = r4.amlStatus
            boolean r1 = r3.equals(r1)
            r3 = 75
            int r3 = r3 / r2
            if (r1 == 0) goto L30
            goto L2f
        L27:
            java.lang.String r1 = r4.amlStatus
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            int r1 = com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.copydefault
            int r1 = r1 + 49
            int r3 = r1 % 128
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.component3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L3c
            return r2
        L3c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse.isAmlFailed():boolean");
    }

    public static class Field extends BaseResp {
        public static final String TYPE_TIMESTAMP = "timestamp";
        private static int component2 = 0;
        private static int copydefault = 1;
        private String fieldName;
        private String fieldValue;
        private String group;
        private String order;
        private String type;

        public String getFieldName() {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.fieldName;
            int i5 = i3 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setFieldName(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 59;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.fieldName = str;
            int i5 = i2 + 91;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getFieldValue() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 103;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.fieldValue;
            int i4 = i2 + 31;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public void setFieldValue(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.fieldValue = str;
            int i5 = i2 + 13;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
            }
        }

        public String getGroup() {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.group;
            int i5 = i3 + 43;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setGroup(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 43;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.group = str;
            if (i4 == 0) {
                int i5 = 67 / 0;
            }
            int i6 = i2 + 33;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        public String getOrder() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 67;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.order;
            int i5 = i2 + 59;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setOrder(String str) {
            int i = 2 % 2;
            int i2 = component2 + 5;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            this.order = str;
            int i5 = i3 + 31;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public String getType() {
            int i = 2 % 2;
            int i2 = component2 + 35;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.type;
            int i4 = i3 + 73;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public void setType(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.type = str;
            int i5 = i2 + 71;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
