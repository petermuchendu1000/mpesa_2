package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010(\u001a\u00020)H\u0007J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H×\u0003J\t\u0010.\u001a\u00020)H×\u0001J\t\u0010/\u001a\u00020\u0003H×\u0001J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridayResp;", "Landroid/os/Parcelable;", "endPeriod", "", "offerName", "productId", "productName", "startPeriod", "amount", "accountId", "expirationDate", "Ljava/util/Date;", "displayTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getEndPeriod", "()Ljava/lang/String;", "getOfferName", "getProductId", "getProductName", "getStartPeriod", "getAmount", "getAccountId", "getExpirationDate", "()Ljava/util/Date;", "setExpirationDate", "(Ljava/util/Date;)V", "getDisplayTitle", "setDisplayTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshFridayResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FreshFridayResp> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("amount")
    private final String amount;
    private String displayTitle;

    @SerializedName("endPeriod")
    private final String endPeriod;
    private Date expirationDate;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("startPeriod")
    private final String startPeriod;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FreshFridayResp> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FreshFridayResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FreshFridayResp freshFridayResp = new FreshFridayResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString());
            int i2 = component2 + 65;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return freshFridayResp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FreshFridayResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 117;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FreshFridayResp freshFridayRespCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            return freshFridayRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FreshFridayResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            FreshFridayResp[] freshFridayRespArr = new FreshFridayResp[i];
            int i6 = i3 + 33;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return freshFridayRespArr;
        }

        @Override
        public FreshFridayResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 99;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public FreshFridayResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.endPeriod = str;
        this.offerName = str2;
        this.productId = str3;
        this.productName = str4;
        this.startPeriod = str5;
        this.amount = str6;
        this.accountId = str7;
        this.expirationDate = date;
        this.displayTitle = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FreshFridayResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Date date2;
        String str9;
        if ((i & 128) != 0) {
            int i2 = copydefault + 67;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            date2 = null;
        } else {
            date2 = date;
        }
        if ((i & 256) != 0) {
            int i8 = copydefault + 113;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str9 = null;
        } else {
            str9 = str8;
        }
        this(str, str2, str3, str4, str5, str6, str7, date2, str9);
    }

    public final String getEndPeriod() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.endPeriod;
        int i4 = i3 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return str;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStartPeriod() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startPeriod;
        int i5 = i2 + 41;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountId;
        }
        throw null;
    }

    public final Date getExpirationDate() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Date date = this.expirationDate;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return date;
    }

    public final void setExpirationDate(Date date) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.expirationDate = date;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getDisplayTitle() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.displayTitle;
            int i4 = 23 / 0;
        } else {
            str = this.displayTitle;
        }
        int i5 = i2 + 19;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setDisplayTitle(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.displayTitle = str;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = component2 + 43;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static FreshFridayResp copy$default(FreshFridayResp freshFridayResp, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        Date date2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 77;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str9 = freshFridayResp.endPeriod;
        } else {
            str9 = str;
        }
        String str12 = (i & 2) != 0 ? freshFridayResp.offerName : str2;
        if ((i & 4) != 0) {
            int i5 = copydefault + 33;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                String str13 = freshFridayResp.productId;
                throw null;
            }
            str10 = freshFridayResp.productId;
        } else {
            str10 = str3;
        }
        String str14 = (i & 8) != 0 ? freshFridayResp.productName : str4;
        String str15 = (i & 16) != 0 ? freshFridayResp.startPeriod : str5;
        if ((i & 32) != 0) {
            int i6 = copydefault + 125;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str11 = freshFridayResp.amount;
        } else {
            str11 = str6;
        }
        String str16 = (i & 64) != 0 ? freshFridayResp.accountId : str7;
        if ((i & 128) != 0) {
            date2 = freshFridayResp.expirationDate;
            int i8 = component3 + 73;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        } else {
            date2 = date;
        }
        return freshFridayResp.copy(str9, str12, str10, str14, str15, str11, str16, date2, (i & 256) != 0 ? freshFridayResp.displayTitle : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endPeriod;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offerName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.startPeriod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Date component8() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Date date = this.expirationDate;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayTitle;
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final FreshFridayResp copy(String endPeriod, String offerName, String productId, String productName, String startPeriod, String amount, String accountId, Date expirationDate, String displayTitle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(endPeriod, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(startPeriod, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(accountId, "");
        FreshFridayResp freshFridayResp = new FreshFridayResp(endPeriod, offerName, productId, productName, startPeriod, amount, accountId, expirationDate, displayTitle);
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return freshFridayResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshFridayResp)) {
            return false;
        }
        FreshFridayResp freshFridayResp = (FreshFridayResp) other;
        if (!Intrinsics.areEqual(this.endPeriod, freshFridayResp.endPeriod)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, freshFridayResp.offerName)) {
            int i4 = copydefault + 5;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, freshFridayResp.productId)) {
            int i6 = component3 + 37;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, freshFridayResp.productName)) {
            int i8 = copydefault + 107;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.startPeriod, freshFridayResp.startPeriod) || !Intrinsics.areEqual(this.amount, freshFridayResp.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.accountId, freshFridayResp.accountId)) {
            return Intrinsics.areEqual(this.expirationDate, freshFridayResp.expirationDate) && Intrinsics.areEqual(this.displayTitle, freshFridayResp.displayTitle);
        }
        int i10 = copydefault + 125;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.endPeriod.hashCode();
        int iHashCode3 = this.offerName.hashCode();
        int iHashCode4 = this.productId.hashCode();
        int iHashCode5 = this.productName.hashCode();
        int iHashCode6 = this.startPeriod.hashCode();
        int iHashCode7 = this.amount.hashCode();
        int iHashCode8 = this.accountId.hashCode();
        Date date = this.expirationDate;
        if (date == null) {
            int i4 = component3 + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = date.hashCode();
            int i6 = copydefault + 35;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = this.displayTitle;
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FreshFridayResp(endPeriod=" + this.endPeriod + ", offerName=" + this.offerName + ", productId=" + this.productId + ", productName=" + this.productName + ", startPeriod=" + this.startPeriod + ", amount=" + this.amount + ", accountId=" + this.accountId + ", expirationDate=" + this.expirationDate + ", displayTitle=" + this.displayTitle + ")";
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.endPeriod);
        dest.writeString(this.offerName);
        dest.writeString(this.productId);
        dest.writeString(this.productName);
        dest.writeString(this.startPeriod);
        dest.writeString(this.amount);
        dest.writeString(this.accountId);
        dest.writeSerializable(this.expirationDate);
        dest.writeString(this.displayTitle);
        int i4 = component3 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
