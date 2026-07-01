package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import com.alibaba.griver.api.constants.GriverEvents;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/ConfigDisplayItem;", "Lcom/huawei/http/BaseResp;", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", GriverEvents.EVENT_SET_TITLE, "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigDisplayItem extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 77 % 128;
    private static int copydefault;
    private String title;
    private String value;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConfigDisplayItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 23;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 75;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String getTitle() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.title;
            int i4 = 93 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTitle(String str) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.title = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final void setValue(String str) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.value = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ConfigDisplayItem(String str, String str2) {
        this.title = str;
        this.value = str2;
    }

    static {
        if (77 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigDisplayItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static ConfigDisplayItem copy$default(ConfigDisplayItem configDisplayItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 67;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 111;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                String str3 = configDisplayItem.title;
                throw null;
            }
            str = configDisplayItem.title;
            int i7 = i4 + 43;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 2) != 0) {
            str2 = configDisplayItem.value;
        }
        return configDisplayItem.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ConfigDisplayItem copy(String title, String value) {
        int i = 2 % 2;
        ConfigDisplayItem configDisplayItem = new ConfigDisplayItem(title, value);
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return configDisplayItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 83;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.title, r6.title) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.copydefault + 109;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.value, r6.value) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.component2
            int r2 = r1 + 55
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 20
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem
            if (r2 == r3) goto L2c
            int r1 = r1 + 83
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.copydefault = r6
            int r1 = r1 % r0
            if (r1 != 0) goto L27
            return r4
        L27:
            r6 = 0
            r6.hashCode()
            throw r6
        L2c:
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem r6 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem) r6
            java.lang.String r1 = r5.title
            java.lang.String r2 = r6.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L42
            int r6 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.copydefault
            int r6 = r6 + 109
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.component2 = r1
            int r6 = r6 % r0
            return r4
        L42:
            java.lang.String r0 = r5.value
            java.lang.String r6 = r6.value
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L4d
            return r4
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.ConfigDisplayItem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = component2 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.value;
        if (str2 == null) {
            int i4 = copydefault + 67;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConfigDisplayItem(title=" + this.title + ", value=" + this.value + ")";
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
