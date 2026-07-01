package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0013HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003J«\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÇ\u0001J\u0013\u0010C\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010E\u001a\u00020\u0013H×\u0001J\t\u0010F\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006G"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Ljava/io/Serializable;", "title", "", "amount", "unit", "isCall", "", "isWithExpiry", "itemId", "validity", "operatorShortCode", "productType", "bundleType", "accountId", "offerName", PESActivity.EXTRA_BONGA_POINTS, "customConfirmTitle", "icon", "", "tag", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V", "getTitle", "()Ljava/lang/String;", "getAmount", "getUnit", "setUnit", "(Ljava/lang/String;)V", "()Z", "getItemId", "getValidity", "getOperatorShortCode", "getProductType", "getBundleType", "setBundleType", "getAccountId", "setAccountId", "getOfferName", "setOfferName", "getBongaPoints", "setBongaPoints", "getCustomConfirmTitle", "getIcon", "()I", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithExpiryResp implements Serializable {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 25 % 128;
    private String accountId;
    private final String amount;
    private String bongaPoints;
    private String bundleType;
    private final String customConfirmTitle;
    private final int icon;
    private final boolean isCall;
    private final boolean isWithExpiry;
    private final String itemId;
    private String offerName;
    private final String operatorShortCode;
    private final String productType;
    private transient Object tag;
    private final String title;
    private String unit;
    private final String validity;

    public WithExpiryResp(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.title = str;
        this.amount = str2;
        this.unit = str3;
        this.isCall = z;
        this.isWithExpiry = z2;
        this.itemId = str4;
        this.validity = str5;
        this.operatorShortCode = str6;
        this.productType = str7;
        this.bundleType = str8;
        this.accountId = str9;
        this.offerName = str10;
        this.bongaPoints = str11;
        this.customConfirmTitle = str12;
        this.icon = i;
        this.tag = obj;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i2 + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WithExpiryResp(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        String str13;
        String str14;
        String str15;
        String str16;
        Object obj2;
        String str17 = (i2 & 4) != 0 ? "Ksh" : str3;
        boolean z4 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            int i3 = component1 + 115;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z3 = true;
        } else {
            z3 = z2;
        }
        String str18 = (i2 & 32) != 0 ? "" : str4;
        String str19 = (i2 & 64) != 0 ? "No Expiry" : str5;
        String str20 = (i2 & 128) != 0 ? "" : str6;
        if ((i2 & 256) != 0) {
            int i6 = 2 % 2;
            str13 = "2";
        } else {
            str13 = str7;
        }
        String str21 = (i2 & 512) != 0 ? "" : str8;
        String str22 = (i2 & 1024) != 0 ? "" : str9;
        if ((i2 & 2048) != 0) {
            int i7 = 2 % 2;
            str14 = "";
        } else {
            str14 = str10;
        }
        if ((i2 & 4096) != 0) {
            int i8 = 2 % 2;
            str15 = "";
        } else {
            str15 = str11;
        }
        if ((i2 & 8192) != 0) {
            int i9 = component3 + 19;
            int i10 = i9 % 128;
            component1 = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 107;
            component3 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 / 5;
            } else {
                int i14 = 2 % 2;
            }
            str16 = "";
        } else {
            str16 = str12;
        }
        int i15 = (i2 & 16384) != 0 ? 0 : i;
        if ((i2 & 32768) != 0) {
            int i16 = component1 + 81;
            component3 = i16 % 128;
            Object obj3 = null;
            if (i16 % 2 == 0) {
                obj3.hashCode();
                throw null;
            }
            obj2 = null;
        } else {
            obj2 = obj;
        }
        this(str, str2, str17, z4, z3, str18, str19, str20, str13, str21, str22, str14, str15, str16, i15, obj2);
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setUnit(String str) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.unit = str;
        int i4 = component1 + 17;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }

    public final boolean isCall() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isCall;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return z;
    }

    public final boolean isWithExpiry() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isWithExpiry;
        }
        throw null;
    }

    public final String getItemId() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.itemId;
        int i5 = i3 + 43;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOperatorShortCode() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.operatorShortCode;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productType;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return str;
    }

    public final String getBundleType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleType;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final void setBundleType(String str) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bundleType = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.bundleType = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return str;
    }

    public final void setAccountId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.accountId = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        int i3 = component1 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offerName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOfferName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.offerName = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.offerName = str;
            int i3 = 47 / 0;
        }
    }

    public final String getBongaPoints() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bongaPoints;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBongaPoints(String str) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bongaPoints = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.bongaPoints = str;
            throw null;
        }
    }

    public final String getCustomConfirmTitle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customConfirmTitle;
        int i5 = i2 + 109;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.icon;
        int i6 = i3 + 73;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 59 / 0;
        }
        return i5;
    }

    public final Object getTag() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.tag;
        int i5 = i2 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final void setTag(Object obj) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.tag = obj;
        if (i4 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = i2 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        if (25 % 2 == 0) {
            int i = 61 / 0;
        }
    }

    public static WithExpiryResp copy$default(WithExpiryResp withExpiryResp, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj, int i2, Object obj2) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i3 = 2 % 2;
        String str19 = (i2 & 1) != 0 ? withExpiryResp.title : str;
        if ((i2 & 2) != 0) {
            int i4 = component1 + 61;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str13 = withExpiryResp.amount;
        } else {
            str13 = str2;
        }
        if ((i2 & 4) != 0) {
            int i6 = component1 + 77;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                str14 = withExpiryResp.unit;
                int i7 = 96 / 0;
            } else {
                str14 = withExpiryResp.unit;
            }
        } else {
            str14 = str3;
        }
        boolean z3 = (i2 & 8) != 0 ? withExpiryResp.isCall : z;
        boolean z4 = (i2 & 16) != 0 ? withExpiryResp.isWithExpiry : z2;
        String str20 = (i2 & 32) != 0 ? withExpiryResp.itemId : str4;
        String str21 = (i2 & 64) != 0 ? withExpiryResp.validity : str5;
        String str22 = (i2 & 128) != 0 ? withExpiryResp.operatorShortCode : str6;
        Object obj3 = null;
        if ((i2 & 256) != 0) {
            int i8 = component1 + 73;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                String str23 = withExpiryResp.productType;
                throw null;
            }
            str15 = withExpiryResp.productType;
        } else {
            str15 = str7;
        }
        if ((i2 & 512) != 0) {
            int i9 = component3 + 67;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                String str24 = withExpiryResp.bundleType;
                obj3.hashCode();
                throw null;
            }
            str16 = withExpiryResp.bundleType;
        } else {
            str16 = str8;
        }
        if ((i2 & 1024) != 0) {
            int i10 = component1 + 87;
            component3 = i10 % 128;
            if (i10 % 2 == 0) {
                String str25 = withExpiryResp.accountId;
                throw null;
            }
            str17 = withExpiryResp.accountId;
        } else {
            str17 = str9;
        }
        String str26 = (i2 & 2048) != 0 ? withExpiryResp.offerName : str10;
        if ((i2 & 4096) != 0) {
            String str27 = withExpiryResp.bongaPoints;
            int i11 = component3 + 1;
            str18 = str27;
            component1 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str18 = str11;
        }
        return withExpiryResp.copy(str19, str13, str14, z3, z4, str20, str21, str22, str15, str16, str17, str26, str18, (i2 & 8192) != 0 ? withExpiryResp.customConfirmTitle : str12, (i2 & 16384) != 0 ? withExpiryResp.icon : i, (i2 & 32768) != 0 ? withExpiryResp.tag : obj);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.bundleType;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.bongaPoints;
            int i4 = 58 / 0;
        } else {
            str = this.bongaPoints;
        }
        int i5 = i3 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customConfirmTitle;
        int i5 = i2 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final int component15() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 99;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0) {
            i = this.icon;
            int i5 = 30 / 0;
        } else {
            i = this.icon;
        }
        int i6 = i4 + 95;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final Object component16() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.unit;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isCall;
        int i5 = i3 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isWithExpiry;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.itemId;
            int i4 = 71 / 0;
        } else {
            str = this.itemId;
        }
        int i5 = i3 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.operatorShortCode;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productType;
        }
        throw null;
    }

    public final WithExpiryResp copy(String title, String amount, String unit, boolean isCall, boolean isWithExpiry, String itemId, String validity, String operatorShortCode, String productType, String bundleType, String accountId, String offerName, String bongaPoints, String customConfirmTitle, int icon, Object tag) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(itemId, "");
        Intrinsics.checkNotNullParameter(validity, "");
        Intrinsics.checkNotNullParameter(operatorShortCode, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(bundleType, "");
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(bongaPoints, "");
        Intrinsics.checkNotNullParameter(customConfirmTitle, "");
        WithExpiryResp withExpiryResp = new WithExpiryResp(title, amount, unit, isCall, isWithExpiry, itemId, validity, operatorShortCode, productType, bundleType, accountId, offerName, bongaPoints, customConfirmTitle, icon, tag);
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return withExpiryResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithExpiryResp)) {
            return false;
        }
        WithExpiryResp withExpiryResp = (WithExpiryResp) other;
        if (!Intrinsics.areEqual(this.title, withExpiryResp.title) || (!Intrinsics.areEqual(this.amount, withExpiryResp.amount)) || !Intrinsics.areEqual(this.unit, withExpiryResp.unit) || this.isCall != withExpiryResp.isCall || this.isWithExpiry != withExpiryResp.isWithExpiry || !Intrinsics.areEqual(this.itemId, withExpiryResp.itemId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.validity, withExpiryResp.validity)) {
            int i4 = component3 + 15;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.operatorShortCode, withExpiryResp.operatorShortCode)) {
            int i6 = component3 + 83;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productType, withExpiryResp.productType)) {
            int i8 = component1 + 103;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.bundleType, withExpiryResp.bundleType) || !Intrinsics.areEqual(this.accountId, withExpiryResp.accountId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, withExpiryResp.offerName)) {
            int i9 = component3 + 59;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bongaPoints, withExpiryResp.bongaPoints) || !Intrinsics.areEqual(this.customConfirmTitle, withExpiryResp.customConfirmTitle)) {
            return false;
        }
        if (this.icon == withExpiryResp.icon) {
            return Intrinsics.areEqual(this.tag, withExpiryResp.tag);
        }
        int i11 = component1 + 25;
        component3 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = this.unit.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isCall);
        int iHashCode5 = Boolean.hashCode(this.isWithExpiry);
        int iHashCode6 = this.itemId.hashCode();
        int iHashCode7 = this.validity.hashCode();
        int iHashCode8 = this.operatorShortCode.hashCode();
        int iHashCode9 = this.productType.hashCode();
        int iHashCode10 = this.bundleType.hashCode();
        int iHashCode11 = this.accountId.hashCode();
        int iHashCode12 = this.offerName.hashCode();
        int iHashCode13 = this.bongaPoints.hashCode();
        int iHashCode14 = this.customConfirmTitle.hashCode();
        int iHashCode15 = Integer.hashCode(this.icon);
        Object obj = this.tag;
        if (obj == null) {
            int i3 = component3 + 51;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode16 = obj.hashCode();
            int i5 = component3 + 87;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode16;
        }
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithExpiryResp(title=" + this.title + ", amount=" + this.amount + ", unit=" + this.unit + ", isCall=" + this.isCall + ", isWithExpiry=" + this.isWithExpiry + ", itemId=" + this.itemId + ", validity=" + this.validity + ", operatorShortCode=" + this.operatorShortCode + ", productType=" + this.productType + ", bundleType=" + this.bundleType + ", accountId=" + this.accountId + ", offerName=" + this.offerName + ", bongaPoints=" + this.bongaPoints + ", customConfirmTitle=" + this.customConfirmTitle + ", icon=" + this.icon + ", tag=" + this.tag + ")";
        int i2 = component3 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
