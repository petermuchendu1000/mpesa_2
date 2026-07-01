package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÇ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H×\u0003J\t\u00104\u001a\u000205H×\u0001J\t\u00106\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u00067"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionData;", "Ljava/io/Serializable;", "businessType", "", "phoneNumber", "tillNumber", "agentNumber", "payBillNumber", "accountNumber", KeysConstants.KEY_STORE_NUMBER, "amount", "name", com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_EXECUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessType", "()Ljava/lang/String;", "setBusinessType", "(Ljava/lang/String;)V", Constants.JS_API_GET_PHONE_NUMBER, "setPhoneNumber", "getTillNumber", "setTillNumber", "getAgentNumber", "setAgentNumber", "getPayBillNumber", "setPayBillNumber", "getAccountNumber", "setAccountNumber", "getStoreNumber", "setStoreNumber", "getAmount", "setAmount", "getName", "setName", "getExecute", "setExecute", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentTransactionData implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private String accountNumber;
    private String agentNumber;
    private String amount;
    private String businessType;
    private String execute;
    private String name;
    private String payBillNumber;
    private String phoneNumber;
    private String storeNumber;
    private String tillNumber;

    public FrequentTransactionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrequentTransactionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = (i & 1) != 0 ? "" : str;
        String str18 = (i & 2) != 0 ? "" : str2;
        String str19 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i2 = component1 + 73;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 4;
            } else {
                int i4 = 2 % 2;
            }
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            int i5 = component1 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = copydefault + 51;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str13 = "";
        } else {
            str13 = str6;
        }
        if ((i & 64) != 0) {
            int i10 = component1 + 117;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str14 = "";
        } else {
            str14 = str7;
        }
        if ((i & 128) != 0) {
            int i13 = component1 + 43;
            copydefault = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 87 / 0;
            }
            int i15 = 2 % 2;
            str15 = "";
        } else {
            str15 = str8;
        }
        if ((i & 256) != 0) {
            int i16 = component1 + 99;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            str16 = "";
        } else {
            str16 = str9;
        }
        this(str17, str18, str19, str11, str12, str13, str14, str15, str16, (i & 512) == 0 ? str10 : "");
    }

    public final String getBusinessType() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.businessType;
        int i5 = i3 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.businessType = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.businessType = str;
        int i3 = copydefault + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getPhoneNumber() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.phoneNumber;
            int i4 = 97 / 0;
        } else {
            str = this.phoneNumber;
        }
        int i5 = i2 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.phoneNumber = str;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
    }

    public final String getTillNumber() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.tillNumber;
            int i4 = 19 / 0;
        } else {
            str = this.tillNumber;
        }
        int i5 = i2 + 19;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTillNumber(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.tillNumber = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAgentNumber() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.agentNumber;
        int i5 = i3 + 35;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final void setAgentNumber(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.agentNumber = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPayBillNumber() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.payBillNumber;
        }
        throw null;
    }

    public final void setPayBillNumber(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.payBillNumber = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountNumber;
        int i4 = i2 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setAccountNumber(String str) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.accountNumber = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getStoreNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.storeNumber;
        int i4 = i3 + 11;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setStoreNumber(String str) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.storeNumber = str;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
            throw null;
        }
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            throw null;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.execute;
        int i4 = i3 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 51;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public FrequentTransactionData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static FrequentTransactionData copy$default(FrequentTransactionData frequentTransactionData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i2 = 2 % 2;
        int i3 = component1 + 121;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 47;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str11 = frequentTransactionData.businessType;
            if (i7 != 0) {
                int i8 = 89 / 0;
            }
        } else {
            str11 = str;
        }
        String str17 = (i & 2) != 0 ? frequentTransactionData.phoneNumber : str2;
        if ((i & 4) != 0) {
            int i9 = component1 + 81;
            copydefault = i9 % 128;
            if (i9 % 2 == 0) {
                String str18 = frequentTransactionData.tillNumber;
                throw null;
            }
            str12 = frequentTransactionData.tillNumber;
        } else {
            str12 = str3;
        }
        if ((i & 8) != 0) {
            int i10 = component1 + 25;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                String str19 = frequentTransactionData.agentNumber;
                throw null;
            }
            str13 = frequentTransactionData.agentNumber;
        } else {
            str13 = str4;
        }
        if ((i & 16) != 0) {
            int i11 = copydefault + 95;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            str14 = frequentTransactionData.payBillNumber;
        } else {
            str14 = str5;
        }
        if ((i & 32) != 0) {
            int i13 = copydefault + 19;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            str15 = frequentTransactionData.accountNumber;
        } else {
            str15 = str6;
        }
        String str20 = (i & 64) != 0 ? frequentTransactionData.storeNumber : str7;
        if ((i & 128) != 0) {
            int i15 = copydefault + 23;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            str16 = frequentTransactionData.amount;
            if (i16 != 0) {
                int i17 = 69 / 0;
            }
        } else {
            str16 = str8;
        }
        return frequentTransactionData.copy(str11, str17, str12, str13, str14, str15, str20, str16, (i & 256) != 0 ? frequentTransactionData.name : str9, (i & 512) != 0 ? frequentTransactionData.execute : str10);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.businessType;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.execute;
            int i4 = 42 / 0;
        } else {
            str = this.execute;
        }
        int i5 = i2 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tillNumber;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.agentNumber;
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.payBillNumber;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.storeNumber;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FrequentTransactionData copy(String businessType, String phoneNumber, String tillNumber, String agentNumber, String payBillNumber, String accountNumber, String storeNumber, String amount, String name, String execute) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(execute, "");
        FrequentTransactionData frequentTransactionData = new FrequentTransactionData(businessType, phoneNumber, tillNumber, agentNumber, payBillNumber, accountNumber, storeNumber, amount, name, execute);
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentTransactionData;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequentTransactionData)) {
            int i2 = component1 + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FrequentTransactionData frequentTransactionData = (FrequentTransactionData) other;
        if (!Intrinsics.areEqual(this.businessType, frequentTransactionData.businessType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.phoneNumber, frequentTransactionData.phoneNumber)) {
            int i4 = copydefault + 113;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.tillNumber, frequentTransactionData.tillNumber) || !Intrinsics.areEqual(this.agentNumber, frequentTransactionData.agentNumber) || (!Intrinsics.areEqual(this.payBillNumber, frequentTransactionData.payBillNumber))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountNumber, frequentTransactionData.accountNumber)) {
            int i5 = component1 + 123;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.storeNumber, frequentTransactionData.storeNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, frequentTransactionData.amount)) {
            int i7 = copydefault + 79;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.name, frequentTransactionData.name)) {
            return Intrinsics.areEqual(this.execute, frequentTransactionData.execute);
        }
        int i9 = component1 + 71;
        int i10 = i9 % 128;
        copydefault = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 27;
        component1 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.businessType.hashCode();
        String str = this.phoneNumber;
        if (str == null) {
            int i2 = copydefault + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.tillNumber;
        if (str2 == null) {
            int i4 = component1 + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.agentNumber;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.payBillNumber;
        if (str4 == null) {
            int i6 = component1 + 65;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.accountNumber;
        if (str5 == null) {
            int i8 = copydefault + 5;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
            int i10 = component1 + 87;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        String str6 = this.storeNumber;
        return (((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.amount.hashCode()) * 31) + this.name.hashCode()) * 31) + this.execute.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentTransactionData(businessType=" + this.businessType + ", phoneNumber=" + this.phoneNumber + ", tillNumber=" + this.tillNumber + ", agentNumber=" + this.agentNumber + ", payBillNumber=" + this.payBillNumber + ", accountNumber=" + this.accountNumber + ", storeNumber=" + this.storeNumber + ", amount=" + this.amount + ", name=" + this.name + ", execute=" + this.execute + ")";
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
