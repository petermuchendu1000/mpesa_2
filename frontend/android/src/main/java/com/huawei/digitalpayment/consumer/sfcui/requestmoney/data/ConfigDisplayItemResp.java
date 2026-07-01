package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/ConfigDisplayItemResp;", "", "label", "", "value", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getValue", "setValue", "getKey", "setKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigDisplayItemResp {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private String ShareDataUIState;
    private String component2;
    private String copydefault;

    public ConfigDisplayItemResp(String str, String str2, String str3) {
        this.ShareDataUIState = str;
        this.component2 = str2;
        this.copydefault = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConfigDisplayItemResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = equals + 91;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i4 = equals + 91;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 59;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setLabel(String str) {
        int i = 2 % 2;
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = equals + 5;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 3;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final void setValue(String str) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 55;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = str;
        if (i4 != 0) {
            int i5 = 78 / 0;
        }
        int i6 = i2 + 9;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = equals + 121;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final void setKey(String str) {
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        this.copydefault = str;
        int i5 = i3 + 73;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 23;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ConfigDisplayItemResp() {
        this(null, null, null, 7, null);
    }

    public static ConfigDisplayItemResp copy$default(ConfigDisplayItemResp configDisplayItemResp, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 85;
        equals = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = configDisplayItemResp.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = configDisplayItemResp.component2;
        }
        if ((i & 4) != 0) {
            str3 = configDisplayItemResp.copydefault;
        }
        ConfigDisplayItemResp configDisplayItemRespCopy = configDisplayItemResp.copy(str, str2, str3);
        int i5 = equals + 43;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return configDisplayItemRespCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 17;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 117;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 31;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 43;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ConfigDisplayItemResp copy(String label, String value, String key) {
        int i = 2 % 2;
        ConfigDisplayItemResp configDisplayItemResp = new ConfigDisplayItemResp(label, value, key);
        int i2 = getRequestBeneficiariesState + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return configDisplayItemResp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.equals;
        r1 = r6 + 17;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.getRequestBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 73;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.getRequestBeneficiariesState = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if ((r6 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.getRequestBeneficiariesState
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.equals = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 13
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp r6 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp) r6
            java.lang.String r1 = r5.ShareDataUIState
            java.lang.String r4 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L42
            int r6 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.equals
            int r1 = r6 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            int r6 = r6 + 73
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L3d
            return r3
        L3d:
            r6 = 0
            r6.hashCode()
            throw r6
        L42:
            java.lang.String r0 = r5.component2
            java.lang.String r1 = r6.component2
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r0 = r0 ^ r2
            if (r0 == 0) goto L4e
            return r3
        L4e:
            java.lang.String r0 = r5.copydefault
            java.lang.String r6 = r6.copydefault
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L59
            return r3
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItemResp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.ShareDataUIState;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = getRequestBeneficiariesState + 13;
            equals = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.component2;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.copydefault;
        if (str3 == null) {
            int i4 = getRequestBeneficiariesState + 9;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
        } else {
            iHashCode2 = str3.hashCode();
            int i6 = equals + 69;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConfigDisplayItemResp(label=" + this.ShareDataUIState + ", value=" + this.component2 + ", key=" + this.copydefault + ")";
        int i2 = equals + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
