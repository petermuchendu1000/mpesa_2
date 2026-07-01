package com.huawei.digitalpayment.history.ui.view;

public class TransactionHistoryView {
    private static int ArtificialStackFrames = 0;
    private static int getShareableDataState = 1;
    private String ShareDataUIState;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String copy;
    private String copydefault;
    private String equals;
    private String getAsAtTimestamp;
    private boolean getRequestBeneficiariesState;

    public String getMouth() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 111;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 85;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public void setMouth(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 63;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = str;
        int i5 = i2 + 89;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getTransType() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 119;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTransType(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 65;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.copy = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isReceiverIsConsumer() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 93;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return z;
    }

    public void setReceiverIsConsumer(boolean z) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 43;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        this.getRequestBeneficiariesState = z;
        int i5 = i2 + 51;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCurrency() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState + 39;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            str = this.component3;
            int i4 = 60 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i3 + 81;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 109;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.component3 = str;
        int i5 = i2 + 37;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getOrderId() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 29;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 85;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        this.getAsAtTimestamp = str;
        int i5 = i2 + 69;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLogo() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 99;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 17;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public void setLogo(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 39;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = str;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
    }

    public String getTransTypeDisplay() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 23;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 121;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTransTypeDisplay(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 119;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        this.equals = str;
        int i5 = i2 + 65;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getTransTime() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 65;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component4;
        int i4 = i3 + 19;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setTransTime(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 61;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.component4 = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 83;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 29;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = str;
        int i5 = i2 + 41;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOppositeName() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 65;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 19;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setOppositeName(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 99;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.component1 = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 3;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
    }
}
