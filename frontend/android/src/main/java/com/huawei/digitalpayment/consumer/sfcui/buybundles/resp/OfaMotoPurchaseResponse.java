package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u0003H×\u0001J\t\u0010#\u001a\u00020\u0005H×\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchaseResponse;", "Ljava/io/Serializable;", "count", "", "message", "", "sessionID", Keys.KEY_CUSTOMER_MESSAGE, "responseCode", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getSessionID", "getCustomerMessage", "setCustomerMessage", "(Ljava/lang/String;)V", "getResponseCode", "setResponseCode", "(Ljava/lang/Integer;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchaseResponse;", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfaMotoPurchaseResponse implements Serializable {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 93 % 128;

    @SerializedName("count")
    private final Integer count;

    @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
    private String customerMessage;

    @SerializedName("message")
    private final String message;

    @SerializedName("responseCode")
    private Integer responseCode;

    @SerializedName("sessionID")
    private final String sessionID;

    public OfaMotoPurchaseResponse(Integer num, String str, String str2, String str3, Integer num2) {
        this.count = num;
        this.message = str;
        this.sessionID = str2;
        this.customerMessage = str3;
        this.responseCode = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OfaMotoPurchaseResponse(Integer num, String str, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        Integer num3;
        Object obj = null;
        if ((i & 8) != 0) {
            int i2 = component2 + 73;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        if ((i & 16) != 0) {
            int i4 = component3 + 29;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            int i6 = 2 % 2;
            num3 = null;
        } else {
            num3 = num2;
        }
        this(num, str, str2, str4, num3);
    }

    public final Integer getCount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.count;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i4 = i2 + 83;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSessionID() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sessionID;
        int i5 = i2 + 119;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.customerMessage;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setCustomerMessage(String str) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.customerMessage = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getResponseCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.responseCode;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setResponseCode(Integer num) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.responseCode = num;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = 93 % 2;
    }

    public static OfaMotoPurchaseResponse copy$default(OfaMotoPurchaseResponse ofaMotoPurchaseResponse, Integer num, String str, String str2, String str3, Integer num2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 19;
        component2 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            num = ofaMotoPurchaseResponse.count;
        }
        Integer num3 = num;
        if ((i & 2) != 0) {
            str = ofaMotoPurchaseResponse.message;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = ofaMotoPurchaseResponse.sessionID;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = ofaMotoPurchaseResponse.customerMessage;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            int i5 = i3 + 25;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            num2 = ofaMotoPurchaseResponse.responseCode;
        }
        OfaMotoPurchaseResponse ofaMotoPurchaseResponseCopy = ofaMotoPurchaseResponse.copy(num3, str4, str5, str6, num2);
        int i7 = component3 + 23;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            return ofaMotoPurchaseResponseCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.count;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.sessionID;
        int i4 = i2 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.customerMessage;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return str;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.responseCode;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return num;
    }

    public final OfaMotoPurchaseResponse copy(Integer count, String message, String sessionID, String customerMessage, Integer responseCode) {
        int i = 2 % 2;
        OfaMotoPurchaseResponse ofaMotoPurchaseResponse = new OfaMotoPurchaseResponse(count, message, sessionID, customerMessage, responseCode);
        int i2 = component2 + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return ofaMotoPurchaseResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof OfaMotoPurchaseResponse) {
            OfaMotoPurchaseResponse ofaMotoPurchaseResponse = (OfaMotoPurchaseResponse) other;
            if (Intrinsics.areEqual(this.count, ofaMotoPurchaseResponse.count) && !(!Intrinsics.areEqual(this.message, ofaMotoPurchaseResponse.message))) {
                if (!Intrinsics.areEqual(this.sessionID, ofaMotoPurchaseResponse.sessionID)) {
                    int i2 = component2 + 63;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.customerMessage, ofaMotoPurchaseResponse.customerMessage)) {
                    return Intrinsics.areEqual(this.responseCode, ofaMotoPurchaseResponse.responseCode);
                }
                int i4 = component3 + 41;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v15 java.lang.Integer) = (r1v4 java.lang.Integer), (r1v17 java.lang.Integer) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse.component2
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.Integer r1 = r8.count
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.Integer r1 = r8.count
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r8.message
            if (r4 != 0) goto L26
            r4 = r2
            goto L2a
        L26:
            int r4 = r4.hashCode()
        L2a:
            java.lang.String r5 = r8.sessionID
            if (r5 != 0) goto L30
            r5 = r2
            goto L34
        L30:
            int r5 = r5.hashCode()
        L34:
            java.lang.String r6 = r8.customerMessage
            if (r6 != 0) goto L39
            goto L3d
        L39:
            int r2 = r6.hashCode()
        L3d:
            java.lang.Integer r6 = r8.responseCode
            if (r6 != 0) goto L42
            goto L53
        L42:
            int r3 = r6.hashCode()
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse.component3
            int r6 = r6 + 81
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse.component2 = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L53
            r6 = 4
            int r6 = r6 % r0
        L53:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfaMotoPurchaseResponse(count=" + this.count + ", message=" + this.message + ", sessionID=" + this.sessionID + ", customerMessage=" + this.customerMessage + ", responseCode=" + this.responseCode + ")";
        int i2 = component2 + 71;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
