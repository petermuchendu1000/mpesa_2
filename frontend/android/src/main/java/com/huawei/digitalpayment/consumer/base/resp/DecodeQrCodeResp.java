package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/DecodeQrCodeResp;", "Ljava/io/Serializable;", "businessType", "", "phoneNumber", "tillNumber", "agentNumber", "payBillNumber", "accountNumber", KeysConstants.KEY_STORE_NUMBER, "amount", "name", com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_EXECUTE, "errMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessType", "()Ljava/lang/String;", "setBusinessType", "(Ljava/lang/String;)V", Constants.JS_API_GET_PHONE_NUMBER, "setPhoneNumber", "getTillNumber", "setTillNumber", "getAgentNumber", "setAgentNumber", "getPayBillNumber", "setPayBillNumber", "getAccountNumber", "setAccountNumber", "getStoreNumber", "setStoreNumber", "getAmount", "setAmount", "getName", "setName", "getExecute", "setExecute", "getErrMsg", "setErrMsg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecodeQrCodeResp implements Serializable {
    private static int component1 = 1;
    private static int component2;
    private String accountNumber;
    private String agentNumber;
    private String amount;
    private String businessType;
    private String errMsg;
    private String execute;
    private String name;
    private String payBillNumber;
    private String phoneNumber;
    private String storeNumber;
    private String tillNumber;

    public DecodeQrCodeResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.businessType = str;
        this.phoneNumber = str2;
        this.tillNumber = str3;
        this.agentNumber = str4;
        this.payBillNumber = str5;
        this.accountNumber = str6;
        this.storeNumber = str7;
        this.amount = str8;
        this.name = str9;
        this.execute = str10;
        this.errMsg = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DecodeQrCodeResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        String str13;
        String str14;
        String str15;
        if ((i & 2) != 0) {
            int i2 = component1;
            int i3 = i2 + 115;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 119;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str12 = "";
        } else {
            str12 = str2;
        }
        String str16 = (i & 4) != 0 ? "" : str3;
        String str17 = (i & 8) != 0 ? "" : str4;
        String str18 = (i & 16) != 0 ? "" : str5;
        String str19 = (i & 32) != 0 ? "" : str6;
        if ((i & 64) != 0) {
            int i6 = 2 % 2;
            str13 = "";
        } else {
            str13 = str7;
        }
        String str20 = (i & 128) != 0 ? "" : str8;
        if ((i & 256) != 0) {
            int i7 = component2 + 111;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str14 = "";
        } else {
            str14 = str9;
        }
        if ((i & 512) != 0) {
            int i9 = component1 + 101;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str15 = "";
        } else {
            str15 = str10;
        }
        this(str, str12, str16, str17, str18, str19, str13, str20, str14, str15, (i & 1024) == 0 ? str11 : "");
    }

    public final String getBusinessType() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.businessType;
            int i4 = 8 / 0;
        } else {
            str = this.businessType;
        }
        int i5 = i3 + 91;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.businessType = str;
        int i4 = component2 + 119;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.phoneNumber;
        }
        throw null;
    }

    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.phoneNumber = str;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
    }

    public final String getTillNumber() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tillNumber;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTillNumber(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.tillNumber = str;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    public final String getAgentNumber() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.agentNumber;
            int i4 = 85 / 0;
        } else {
            str = this.agentNumber;
        }
        int i5 = i3 + 53;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAgentNumber(String str) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.agentNumber = str;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }

    public final String getPayBillNumber() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payBillNumber;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPayBillNumber(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.payBillNumber = str;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final void setAccountNumber(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.accountNumber = str;
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getStoreNumber() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.storeNumber;
        int i4 = i3 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setStoreNumber(String str) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.storeNumber = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
        int i4 = component2 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        int i4 = component2 + 51;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
            int i3 = 32 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
        }
        int i4 = component2 + 97;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrMsg() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.errMsg;
        int i4 = i2 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setErrMsg(String str) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errMsg = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.errMsg = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static DecodeQrCodeResp copy$default(DecodeQrCodeResp decodeQrCodeResp, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        String str12;
        String str13;
        String str14;
        String str15;
        int i2 = 2 % 2;
        int i3 = component1 + 33;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        String str16 = (i & 1) != 0 ? decodeQrCodeResp.businessType : str;
        if ((i & 2) != 0) {
            str12 = decodeQrCodeResp.phoneNumber;
            int i6 = i4 + 69;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str12 = str2;
        }
        String str17 = (i & 4) != 0 ? decodeQrCodeResp.tillNumber : str3;
        if ((i & 8) != 0) {
            str13 = decodeQrCodeResp.agentNumber;
            int i8 = component1 + 99;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str13 = str4;
        }
        String str18 = (i & 16) != 0 ? decodeQrCodeResp.payBillNumber : str5;
        String str19 = (i & 32) != 0 ? decodeQrCodeResp.accountNumber : str6;
        String str20 = (i & 64) != 0 ? decodeQrCodeResp.storeNumber : str7;
        if ((i & 128) != 0) {
            str14 = decodeQrCodeResp.amount;
            int i10 = component2 + 59;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str14 = str8;
        }
        String str21 = (i & 256) != 0 ? decodeQrCodeResp.name : str9;
        if ((i & 512) != 0) {
            int i12 = component2 + 81;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            str15 = decodeQrCodeResp.execute;
        } else {
            str15 = str10;
        }
        return decodeQrCodeResp.copy(str16, str12, str17, str13, str18, str19, str20, str14, str21, str15, (i & 1024) != 0 ? decodeQrCodeResp.errMsg : str11);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.businessType;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.execute;
        int i4 = i2 + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.errMsg;
        int i4 = i3 + 7;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.phoneNumber;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.tillNumber;
            int i4 = 82 / 0;
        } else {
            str = this.tillNumber;
        }
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.agentNumber;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.payBillNumber;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.accountNumber;
        int i5 = i3 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.storeNumber;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final DecodeQrCodeResp copy(String businessType, String phoneNumber, String tillNumber, String agentNumber, String payBillNumber, String accountNumber, String storeNumber, String amount, String name, String execute, String errMsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(execute, "");
        Intrinsics.checkNotNullParameter(errMsg, "");
        DecodeQrCodeResp decodeQrCodeResp = new DecodeQrCodeResp(businessType, phoneNumber, tillNumber, agentNumber, payBillNumber, accountNumber, storeNumber, amount, name, execute, errMsg);
        int i2 = component1 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return decodeQrCodeResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof DecodeQrCodeResp))) {
            DecodeQrCodeResp decodeQrCodeResp = (DecodeQrCodeResp) other;
            if (!Intrinsics.areEqual(this.businessType, decodeQrCodeResp.businessType) || !Intrinsics.areEqual(this.phoneNumber, decodeQrCodeResp.phoneNumber) || !Intrinsics.areEqual(this.tillNumber, decodeQrCodeResp.tillNumber) || !Intrinsics.areEqual(this.agentNumber, decodeQrCodeResp.agentNumber) || !Intrinsics.areEqual(this.payBillNumber, decodeQrCodeResp.payBillNumber) || !Intrinsics.areEqual(this.accountNumber, decodeQrCodeResp.accountNumber) || !Intrinsics.areEqual(this.storeNumber, decodeQrCodeResp.storeNumber)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.amount, decodeQrCodeResp.amount)) {
                int i2 = component1 + 91;
                int i3 = i2 % 128;
                component2 = i3;
                boolean z = i2 % 2 != 0;
                int i4 = i3 + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return z;
            }
            if (!Intrinsics.areEqual(this.name, decodeQrCodeResp.name) || !Intrinsics.areEqual(this.execute, decodeQrCodeResp.execute)) {
                return false;
            }
            if (Intrinsics.areEqual(this.errMsg, decodeQrCodeResp.errMsg)) {
                return true;
            }
            int i6 = component1 + 33;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i;
        int iHashCode3;
        int iHashCode4;
        int i2 = 2 % 2;
        int i3 = component2 + 57;
        component1 = i3 % 128;
        int iHashCode5 = 1;
        if (i3 % 2 == 0) {
            iHashCode = this.businessType.hashCode();
            str = this.phoneNumber;
            if (str == null) {
                i = 1;
                iHashCode2 = i;
                iHashCode3 = 0;
            } else {
                iHashCode2 = 1;
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.businessType.hashCode();
            str = this.phoneNumber;
            if (str == null) {
                i = 0;
                iHashCode2 = i;
                iHashCode3 = 0;
            } else {
                iHashCode2 = 0;
                iHashCode3 = str.hashCode();
            }
        }
        String str2 = this.tillNumber;
        if (str2 == null) {
            int i4 = component2 + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str2.hashCode();
        }
        String str3 = this.agentNumber;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.payBillNumber;
        if (str4 == null) {
            int i6 = component1 + 121;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str4.hashCode();
            int i7 = component1 + 67;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str5 = this.accountNumber;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.storeNumber;
        if (str6 != null) {
            iHashCode2 = str6.hashCode();
        }
        return (((((((((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + this.amount.hashCode()) * 31) + this.name.hashCode()) * 31) + this.execute.hashCode()) * 31) + this.errMsg.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DecodeQrCodeResp(businessType=" + this.businessType + ", phoneNumber=" + this.phoneNumber + ", tillNumber=" + this.tillNumber + ", agentNumber=" + this.agentNumber + ", payBillNumber=" + this.payBillNumber + ", accountNumber=" + this.accountNumber + ", storeNumber=" + this.storeNumber + ", amount=" + this.amount + ", name=" + this.name + ", execute=" + this.execute + ", errMsg=" + this.errMsg + ")";
        int i2 = component1 + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
