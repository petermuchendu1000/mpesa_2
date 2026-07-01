package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import com.google.gson.annotations.SerializedName;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyConfig;", "Lcom/huawei/http/BaseResp;", "maxAmount", "", "minAmount", "enable", "", "<init>", "(IIZ)V", "getMaxAmount", "()I", "setMaxAmount", "(I)V", "getMinAmount", "setMinAmount", "getEnable", "()Z", "setEnable", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestMoneyConfig extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("app.consumer.request.money.amount.validate.enable")
    private boolean enable;

    @SerializedName("app.consumer.request.money.max.amount")
    private int maxAmount;

    @SerializedName("app.consumer.request.money.min.amount")
    private int minAmount;

    /* JADX WARN: Illegal instructions before constructor call */
    public RequestMoneyConfig(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = copydefault + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            i = 10001;
        }
        if ((i3 & 2) != 0) {
            int i6 = component3 + 53;
            copydefault = i6 % 128;
            i2 = (i6 % 2 == 0 ? 1 : 0) ^ 1;
            int i7 = 2 % 2;
        }
        if ((i3 & 4) != 0) {
            int i8 = 2 % 2;
            z = false;
        }
        this(i, i2, z);
    }

    public final int getMaxAmount() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.maxAmount;
        if (i3 == 0) {
            int i5 = 20 / 0;
        }
        return i4;
    }

    public final void setMaxAmount(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.maxAmount = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 11;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
    }

    public final int getMinAmount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.minAmount;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final void setMinAmount(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 107;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.minAmount = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 45;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean getEnable() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.enable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setEnable(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.enable = z;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public RequestMoneyConfig(int i, int i2, boolean z) {
        this.maxAmount = i;
        this.minAmount = i2;
        this.enable = z;
    }

    static {
        int i = 1 + 111;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public RequestMoneyConfig() {
        this(0, 0, false, 7, null);
    }

    public static RequestMoneyConfig copy$default(RequestMoneyConfig requestMoneyConfig, int i, int i2, boolean z, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            i = requestMoneyConfig.maxAmount;
            int i5 = copydefault + 69;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i3 & 2) != 0) {
            i2 = requestMoneyConfig.minAmount;
        }
        if ((i3 & 4) != 0) {
            int i7 = copydefault + 5;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                z = requestMoneyConfig.enable;
                int i8 = 69 / 0;
            } else {
                z = requestMoneyConfig.enable;
            }
        }
        return requestMoneyConfig.copy(i, i2, z);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.maxAmount;
        int i6 = i2 + 81;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.minAmount;
        int i6 = i3 + 19;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 81 / 0;
        }
        return i5;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.enable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RequestMoneyConfig copy(int maxAmount, int minAmount, boolean enable) {
        int i = 2 % 2;
        RequestMoneyConfig requestMoneyConfig = new RequestMoneyConfig(maxAmount, minAmount, enable);
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
        return requestMoneyConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r8 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig)) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r8 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r7.maxAmount == r8.maxAmount) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r7.minAmount == r8.minAmount) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r1 = r1 + 7;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r7.enable == r8.enable) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r1 = r1 + 89;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r3 = r3 + 1;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.component3 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if ((r3 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r8 = null;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.component3
            int r2 = r1 + 53
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.copydefault = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 25
            int r2 = r2 / r5
            if (r7 != r8) goto L19
            goto L18
        L16:
            if (r7 != r8) goto L19
        L18:
            return r4
        L19:
            boolean r2 = r8 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig
            r2 = r2 ^ r4
            if (r2 == r4) goto L51
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig r8 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig) r8
            int r2 = r7.maxAmount
            int r6 = r8.maxAmount
            if (r2 == r6) goto L27
            return r5
        L27:
            int r2 = r7.minAmount
            int r6 = r8.minAmount
            if (r2 == r6) goto L35
            int r1 = r1 + 7
            int r8 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.copydefault = r8
            int r1 = r1 % r0
            return r5
        L35:
            boolean r2 = r7.enable
            boolean r8 = r8.enable
            if (r2 == r8) goto L43
            int r1 = r1 + 89
            int r8 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.copydefault = r8
            int r1 = r1 % r0
            return r5
        L43:
            int r3 = r3 + r4
            int r8 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.component3 = r8
            int r3 = r3 % r0
            if (r3 != 0) goto L4c
            return r4
        L4c:
            r8 = 0
            r8.hashCode()
            throw r8
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.maxAmount);
        return i3 == 0 ? (((iHashCode / 125) >> Integer.hashCode(this.minAmount)) >>> 106) % Boolean.hashCode(this.enable) : (((iHashCode * 31) + Integer.hashCode(this.minAmount)) * 31) + Boolean.hashCode(this.enable);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestMoneyConfig(maxAmount=" + this.maxAmount + ", minAmount=" + this.minAmount + ", enable=" + this.enable + ")";
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
