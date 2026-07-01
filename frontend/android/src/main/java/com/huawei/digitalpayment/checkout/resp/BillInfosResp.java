package com.huawei.digitalpayment.checkout.resp;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H×\u0003J\t\u00100\u001a\u000201H×\u0001J\t\u00102\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/BillInfosResp;", "Ljava/io/Serializable;", "billName", "", KeysConstants.KEY_MERCH_CODE, "entityType", "billId", "bill", "enabled", "order", "serviceId", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillName", "()Ljava/lang/String;", "setBillName", "(Ljava/lang/String;)V", "getMerchCode", "setMerchCode", "getEntityType", "setEntityType", "getBillId", "setBillId", "getBill", "setBill", "getEnabled", "setEnabled", "getOrder", "setOrder", "getServiceId", "setServiceId", "getAvatar", "setAvatar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillInfosResp implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 89 % 128;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private String avatar;
    private String bill;
    private String billId;
    private String billName;
    private String enabled;
    private String entityType;
    private String merchCode;
    private String order;
    private String serviceId;

    public BillInfosResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.billName = str;
        this.merchCode = str2;
        this.entityType = str3;
        this.billId = str4;
        this.bill = str5;
        this.enabled = str6;
        this.order = str7;
        this.serviceId = str8;
        this.avatar = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillInfosResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14 = "";
        if ((i & 1) != 0) {
            int i2 = component2 + 123;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str10 = "";
        } else {
            str10 = str;
        }
        String str15 = (i & 2) != 0 ? "" : str2;
        String str16 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i7 = component2;
            int i8 = i7 + 69;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 57;
            component1 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            int i12 = 2 % 2;
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i & 32) != 0) {
            int i13 = component1 + 113;
            component2 = i13 % 128;
            if (i13 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i14 = 2 % 2;
            str13 = "";
        } else {
            str13 = str6;
        }
        String str17 = (i & 64) != 0 ? "" : str7;
        String str18 = (i & 128) != 0 ? "" : str8;
        if ((i & 256) != 0) {
            int i15 = 2 % 2;
        } else {
            str14 = str9;
        }
        this(str10, str15, str16, str11, str12, str13, str17, str18, str14);
    }

    public final String getBillName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billName;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBillName(String str) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.billName = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMerchCode() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.merchCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMerchCode(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.merchCode = str;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
    }

    public final String getEntityType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.entityType;
        int i4 = i2 + 27;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setEntityType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.entityType = str;
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        int i6 = i3 + 117;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
    }

    public final String getBillId() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.billId;
            int i4 = 26 / 0;
        } else {
            str = this.billId;
        }
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBillId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.billId = str;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getBill() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bill;
        int i5 = i2 + 29;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final void setBill(String str) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bill = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.bill = str;
        int i3 = component2 + 81;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
    }

    public final String getEnabled() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.enabled;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setEnabled(String str) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.enabled = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOrder() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.order;
        int i5 = i2 + 29;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final void setOrder(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.order = str;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getServiceId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceId;
        int i5 = i2 + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setServiceId(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.serviceId = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.avatar;
        int i4 = i3 + 89;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setAvatar(String str) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.avatar = str;
        if (i3 == 0) {
            throw null;
        }
    }

    static {
        if (89 % 2 == 0) {
            throw null;
        }
    }

    public BillInfosResp() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static BillInfosResp copy$default(BillInfosResp billInfosResp, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i2 = 2 % 2;
        String str15 = (i & 1) != 0 ? billInfosResp.billName : str;
        if ((i & 2) != 0) {
            int i3 = component1 + 109;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str10 = billInfosResp.merchCode;
        } else {
            str10 = str2;
        }
        String str16 = (i & 4) != 0 ? billInfosResp.entityType : str3;
        String str17 = (i & 8) != 0 ? billInfosResp.billId : str4;
        String str18 = (i & 16) != 0 ? billInfosResp.bill : str5;
        if ((i & 32) != 0) {
            int i5 = component1 + 31;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                str11 = billInfosResp.enabled;
                int i6 = 11 / 0;
            } else {
                str11 = billInfosResp.enabled;
            }
        } else {
            str11 = str6;
        }
        if ((i & 64) != 0) {
            int i7 = component2 + 3;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str12 = billInfosResp.order;
        } else {
            str12 = str7;
        }
        Object obj2 = null;
        if ((i & 128) != 0) {
            int i9 = component2 + 85;
            component1 = i9 % 128;
            if (i9 % 2 == 0) {
                String str19 = billInfosResp.serviceId;
                obj2.hashCode();
                throw null;
            }
            str13 = billInfosResp.serviceId;
        } else {
            str13 = str8;
        }
        if ((i & 256) != 0) {
            int i10 = component2 + 51;
            component1 = i10 % 128;
            if (i10 % 2 == 0) {
                String str20 = billInfosResp.avatar;
                obj2.hashCode();
                throw null;
            }
            str14 = billInfosResp.avatar;
        } else {
            str14 = str9;
        }
        return billInfosResp.copy(str15, str10, str16, str17, str18, str11, str12, str13, str14);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billName;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.merchCode;
        int i4 = i2 + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.entityType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billId;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bill;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.enabled;
        int i4 = i2 + 121;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.order;
        int i5 = i2 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.serviceId;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.avatar;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BillInfosResp copy(String billName, String merchCode, String entityType, String billId, String bill, String enabled, String order, String serviceId, String avatar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bill, "");
        BillInfosResp billInfosResp = new BillInfosResp(billName, merchCode, entityType, billId, bill, enabled, order, serviceId, avatar);
        int i2 = component2 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return billInfosResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillInfosResp)) {
            return false;
        }
        BillInfosResp billInfosResp = (BillInfosResp) other;
        if (!Intrinsics.areEqual(this.billName, billInfosResp.billName)) {
            int i3 = component1 + 79;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.merchCode, billInfosResp.merchCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.entityType, billInfosResp.entityType)) {
            int i5 = component1 + 39;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
            }
            return false;
        }
        if ((!Intrinsics.areEqual(this.billId, billInfosResp.billId)) || !Intrinsics.areEqual(this.bill, billInfosResp.bill)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.enabled, billInfosResp.enabled)) {
            int i7 = component2 + 57;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.order, billInfosResp.order)) {
            int i9 = component1 + 67;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.serviceId, billInfosResp.serviceId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.avatar, billInfosResp.avatar)) {
            int i11 = component2 + 43;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        int i13 = component1 + 3;
        component2 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billName;
        int iHashCode3 = 0;
        if (str == null) {
            int i5 = i2 + 115;
            component2 = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = component1 + 117;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str2 = this.merchCode;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.entityType;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.billId;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = this.bill.hashCode();
        String str5 = this.enabled;
        if (str5 == null) {
            int i8 = component1 + 93;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.order;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.serviceId;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.avatar;
        if (str8 != null) {
            iHashCode3 = str8.hashCode();
            int i10 = component2 + 85;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = (((((((((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3;
        int i13 = component1 + 109;
        component2 = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillInfosResp(billName=" + this.billName + ", merchCode=" + this.merchCode + ", entityType=" + this.entityType + ", billId=" + this.billId + ", bill=" + this.bill + ", enabled=" + this.enabled + ", order=" + this.order + ", serviceId=" + this.serviceId + ", avatar=" + this.avatar + ")";
        int i2 = component2 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
