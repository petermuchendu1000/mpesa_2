package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H×\u0003J\t\u0010<\u001a\u00020=H×\u0001J\t\u0010>\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006?"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "Ljava/io/Serializable;", "requestMoneyOrderId", "", "amount", "payeeName", "payeeIdentifier", "payeeAvatar", "statusDisplay", "status", "payerName", "payerIdentifier", "payerAvatar", "createTime", GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestMoneyOrderId", "()Ljava/lang/String;", "setRequestMoneyOrderId", "(Ljava/lang/String;)V", "getAmount", "setAmount", "getPayeeName", "setPayeeName", "getPayeeIdentifier", "setPayeeIdentifier", "getPayeeAvatar", "setPayeeAvatar", "getStatusDisplay", "setStatusDisplay", "getStatus", "setStatus", "getPayerName", "setPayerName", "getPayerIdentifier", "setPayerIdentifier", "getPayerAvatar", "setPayerAvatar", "getCreateTime", "setCreateTime", "getExpireTime", "setExpireTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestMoneyOrderInfo implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 87 % 128;
    private String amount;
    private String createTime;
    private String expireTime;
    private String payeeAvatar;
    private String payeeIdentifier;
    private String payeeName;
    private String payerAvatar;
    private String payerIdentifier;
    private String payerName;
    private String requestMoneyOrderId;
    private String status;
    private String statusDisplay;

    public RequestMoneyOrderInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.requestMoneyOrderId = str;
        this.amount = str2;
        this.payeeName = str3;
        this.payeeIdentifier = str4;
        this.payeeAvatar = str5;
        this.statusDisplay = str6;
        this.status = str7;
        this.payerName = str8;
        this.payerIdentifier = str9;
        this.payerAvatar = str10;
        this.createTime = str11;
        this.expireTime = str12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RequestMoneyOrderInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19 = (i & 1) != 0 ? "" : str;
        Object obj = null;
        if ((i & 2) != 0) {
            int i2 = component1 + 55;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str13 = "";
        } else {
            str13 = str2;
        }
        if ((i & 4) != 0) {
            int i3 = component1 + 7;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str14 = "";
        } else {
            str14 = str3;
        }
        if ((i & 8) != 0) {
            int i4 = component2 + 119;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            } else {
                int i6 = 2 % 2;
            }
            str15 = "";
        } else {
            str15 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = component2 + 119;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str16 = "";
        } else {
            str16 = str5;
        }
        String str20 = (i & 32) != 0 ? "" : str6;
        String str21 = (i & 64) != 0 ? "" : str7;
        if ((i & 128) != 0) {
            int i10 = 2 % 2;
            str17 = "";
        } else {
            str17 = str8;
        }
        String str22 = (i & 256) != 0 ? "" : str9;
        String str23 = (i & 512) != 0 ? "" : str10;
        if ((i & 1024) != 0) {
            int i11 = component1 + 23;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 45 / 0;
            }
            str18 = "";
        } else {
            str18 = str11;
        }
        this(str19, str13, str14, str15, str16, str20, str21, str17, str22, str23, str18, (i & 2048) == 0 ? str12 : "");
    }

    public final String getRequestMoneyOrderId() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.requestMoneyOrderId;
        int i4 = i3 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setRequestMoneyOrderId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.requestMoneyOrderId = str;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.amount = str;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getPayeeName() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.payeeName;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final void setPayeeName(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.payeeName = str;
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 101;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getPayeeIdentifier() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payeeIdentifier;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final void setPayeeIdentifier(String str) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.payeeIdentifier = str;
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        int i6 = i3 + 83;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final String getPayeeAvatar() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.payeeAvatar;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final void setPayeeAvatar(String str) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.payeeAvatar = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getStatusDisplay() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.statusDisplay;
        int i4 = i2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setStatusDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.statusDisplay = str;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.status;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public final void setStatus(String str) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.status = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getPayerName() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.payerName;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setPayerName(String str) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.payerName = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getPayerIdentifier() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.payerIdentifier;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPayerIdentifier(String str) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.payerIdentifier = str;
        int i5 = i3 + 79;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPayerAvatar() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.payerAvatar;
        int i4 = i2 + 77;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return str;
    }

    public final void setPayerAvatar(String str) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.payerAvatar = str;
        int i5 = i3 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getCreateTime() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createTime;
        int i5 = i2 + 57;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCreateTime(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.createTime = str;
        int i5 = i2 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getExpireTime() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expireTime;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setExpireTime(String str) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.expireTime = str;
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        if (87 % 2 == 0) {
            int i = 20 / 0;
        }
    }

    public RequestMoneyOrderInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static RequestMoneyOrderInfo copy$default(RequestMoneyOrderInfo requestMoneyOrderInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i2 = 2 % 2;
        String str18 = (i & 1) != 0 ? requestMoneyOrderInfo.requestMoneyOrderId : str;
        String str19 = (i & 2) != 0 ? requestMoneyOrderInfo.amount : str2;
        String str20 = (i & 4) != 0 ? requestMoneyOrderInfo.payeeName : str3;
        String str21 = (i & 8) != 0 ? requestMoneyOrderInfo.payeeIdentifier : str4;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i3 = component1 + 107;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str22 = requestMoneyOrderInfo.payeeAvatar;
                obj2.hashCode();
                throw null;
            }
            str13 = requestMoneyOrderInfo.payeeAvatar;
        } else {
            str13 = str5;
        }
        if ((i & 32) != 0) {
            int i4 = component2 + 31;
            int i5 = i4 % 128;
            component1 = i5;
            int i6 = i4 % 2;
            str14 = requestMoneyOrderInfo.statusDisplay;
            int i7 = i5 + 125;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str14 = str6;
        }
        String str23 = (i & 64) != 0 ? requestMoneyOrderInfo.status : str7;
        String str24 = (i & 128) != 0 ? requestMoneyOrderInfo.payerName : str8;
        if ((i & 256) != 0) {
            int i9 = component1 + 91;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str15 = requestMoneyOrderInfo.payerIdentifier;
        } else {
            str15 = str9;
        }
        String str25 = (i & 512) != 0 ? requestMoneyOrderInfo.payerAvatar : str10;
        if ((i & 1024) != 0) {
            int i11 = component2 + 59;
            component1 = i11 % 128;
            if (i11 % 2 != 0) {
                String str26 = requestMoneyOrderInfo.createTime;
                obj2.hashCode();
                throw null;
            }
            str16 = requestMoneyOrderInfo.createTime;
        } else {
            str16 = str11;
        }
        if ((i & 2048) != 0) {
            int i12 = component2 + 117;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            str17 = requestMoneyOrderInfo.expireTime;
        } else {
            str17 = str12;
        }
        return requestMoneyOrderInfo.copy(str18, str19, str20, str21, str13, str14, str23, str24, str15, str25, str16, str17);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestMoneyOrderId;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.payerAvatar;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.createTime;
        int i4 = i2 + 93;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.expireTime;
        int i5 = i3 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payeeName;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.payeeIdentifier;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payeeAvatar;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusDisplay;
        int i5 = i2 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.status;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.payerName;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payerIdentifier;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final RequestMoneyOrderInfo copy(String requestMoneyOrderId, String amount, String payeeName, String payeeIdentifier, String payeeAvatar, String statusDisplay, String status, String payerName, String payerIdentifier, String payerAvatar, String createTime, String expireTime) {
        int i = 2 % 2;
        RequestMoneyOrderInfo requestMoneyOrderInfo = new RequestMoneyOrderInfo(requestMoneyOrderId, amount, payeeName, payeeIdentifier, payeeAvatar, statusDisplay, status, payerName, payerIdentifier, payerAvatar, createTime, expireTime);
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return requestMoneyOrderInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestMoneyOrderInfo)) {
            return false;
        }
        RequestMoneyOrderInfo requestMoneyOrderInfo = (RequestMoneyOrderInfo) other;
        if (!Intrinsics.areEqual(this.requestMoneyOrderId, requestMoneyOrderInfo.requestMoneyOrderId)) {
            int i2 = component1 + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.amount, requestMoneyOrderInfo.amount)) {
            if (!Intrinsics.areEqual(this.payeeName, requestMoneyOrderInfo.payeeName)) {
                int i4 = component2 + 53;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.payeeIdentifier, requestMoneyOrderInfo.payeeIdentifier)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.payeeAvatar, requestMoneyOrderInfo.payeeAvatar)) {
                int i6 = component1 + 1;
                component2 = i6 % 128;
                return i6 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.statusDisplay, requestMoneyOrderInfo.statusDisplay)) {
                int i7 = component1 + 87;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.status, requestMoneyOrderInfo.status)) {
                int i9 = component2 + 9;
                component1 = i9 % 128;
                return i9 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.payerName, requestMoneyOrderInfo.payerName)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.payerIdentifier, requestMoneyOrderInfo.payerIdentifier))) {
                return Intrinsics.areEqual(this.payerAvatar, requestMoneyOrderInfo.payerAvatar) && Intrinsics.areEqual(this.createTime, requestMoneyOrderInfo.createTime) && Intrinsics.areEqual(this.expireTime, requestMoneyOrderInfo.expireTime);
            }
            int i10 = component2 + 73;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.requestMoneyOrderId;
        if (str == null) {
            int i2 = component1 + 103;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.amount;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.payeeName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.payeeIdentifier;
        if (str4 == null) {
            int i3 = component2 + 85;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.payeeAvatar;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.statusDisplay;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.status;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.payerName;
        if (str8 == null) {
            int i5 = component1 + 107;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str8.hashCode();
        }
        String str9 = this.payerIdentifier;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.payerAvatar;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.createTime;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.expireTime;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestMoneyOrderInfo(requestMoneyOrderId=" + this.requestMoneyOrderId + ", amount=" + this.amount + ", payeeName=" + this.payeeName + ", payeeIdentifier=" + this.payeeIdentifier + ", payeeAvatar=" + this.payeeAvatar + ", statusDisplay=" + this.statusDisplay + ", status=" + this.status + ", payerName=" + this.payerName + ", payerIdentifier=" + this.payerIdentifier + ", payerAvatar=" + this.payerAvatar + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ")";
        int i2 = component2 + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return str;
    }
}
