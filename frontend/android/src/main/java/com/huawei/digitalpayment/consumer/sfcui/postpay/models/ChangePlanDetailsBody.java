package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÇ\u0001J\b\u0010(\u001a\u00020)H\u0007J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H×\u0003J\t\u0010.\u001a\u00020)H×\u0001J\t\u0010/\u001a\u00020\u0003H×\u0001J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/ChangePlanDetailsBody;", "Landroid/os/Parcelable;", "accountKey", "", "creditLimit", "prepayment", "deposit", "creditCategory", "currentPlan", FirebaseAnalytics.Param.PRICE, "productId", "totalBill", "availablePlans", "", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/AvailablePlan;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccountKey", "()Ljava/lang/String;", "getCreditLimit", "getPrepayment", "getDeposit", "getCreditCategory", "getCurrentPlan", "getPrice", "getProductId", "getTotalBill", "getAvailablePlans", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangePlanDetailsBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChangePlanDetailsBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("accountKey")
    private final String accountKey;

    @SerializedName("availablePlans")
    private final List<AvailablePlan> availablePlans;

    @SerializedName("creditCategory")
    private final String creditCategory;

    @SerializedName("creditLimit")
    private final String creditLimit;

    @SerializedName("currentPlan")
    private final String currentPlan;

    @SerializedName("deposit")
    private final String deposit;

    @SerializedName("prepayment")
    private final String prepayment;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("totalBill")
    private final String totalBill;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangePlanDetailsBody> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangePlanDetailsBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = copydefault + 101;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 != i2; i5++) {
                int i6 = copydefault + 45;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(AvailablePlan.CREATOR.createFromParcel(parcel));
            }
            return new ChangePlanDetailsBody(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        @Override
        public ChangePlanDetailsBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ChangePlanDetailsBody changePlanDetailsBodyCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 53;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return changePlanDetailsBodyCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangePlanDetailsBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 83;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            ChangePlanDetailsBody[] changePlanDetailsBodyArr = new ChangePlanDetailsBody[i];
            int i6 = i4 + 57;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return changePlanDetailsBodyArr;
        }

        @Override
        public ChangePlanDetailsBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 61;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            ChangePlanDetailsBody[] changePlanDetailsBodyArrNewArray = newArray(i);
            int i4 = component3 + 67;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return changePlanDetailsBodyArrNewArray;
        }
    }

    public ChangePlanDetailsBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<AvailablePlan> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountKey = str;
        this.creditLimit = str2;
        this.prepayment = str3;
        this.deposit = str4;
        this.creditCategory = str5;
        this.currentPlan = str6;
        this.price = str7;
        this.productId = str8;
        this.totalBill = str9;
        this.availablePlans = list;
    }

    public final String getAccountKey() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountKey;
        int i4 = i2 + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCreditLimit() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.creditLimit;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPrepayment() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.prepayment;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public final String getDeposit() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.deposit;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getCreditCategory() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.creditCategory;
        int i5 = i3 + 65;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCurrentPlan() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.currentPlan;
        int i4 = i3 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPrice() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.price;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTotalBill() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.totalBill;
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<AvailablePlan> getAvailablePlans() {
        List<AvailablePlan> list;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.availablePlans;
            int i4 = 83 / 0;
        } else {
            list = this.availablePlans;
        }
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 125;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChangePlanDetailsBody copy$default(ChangePlanDetailsBody changePlanDetailsBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        List list2;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        String str15 = (i & 1) != 0 ? changePlanDetailsBody.accountKey : str;
        String str16 = (i & 2) != 0 ? changePlanDetailsBody.creditLimit : str2;
        if ((i & 4) != 0) {
            int i6 = i3 + 27;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str10 = changePlanDetailsBody.prepayment;
        } else {
            str10 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = copydefault + 115;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                str11 = changePlanDetailsBody.deposit;
                int i9 = 1 / 0;
            } else {
                str11 = changePlanDetailsBody.deposit;
            }
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            int i10 = copydefault + 81;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str12 = changePlanDetailsBody.creditCategory;
        } else {
            str12 = str5;
        }
        String str17 = (i & 32) != 0 ? changePlanDetailsBody.currentPlan : str6;
        String str18 = (i & 64) != 0 ? changePlanDetailsBody.price : str7;
        if ((i & 128) != 0) {
            int i12 = copydefault + 87;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            str13 = changePlanDetailsBody.productId;
        } else {
            str13 = str8;
        }
        if ((i & 256) != 0) {
            str14 = changePlanDetailsBody.totalBill;
            int i14 = copydefault + 89;
            component2 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            str14 = str9;
        }
        if ((i & 512) != 0) {
            int i16 = component2 + 1;
            copydefault = i16 % 128;
            if (i16 % 2 != 0) {
                list2 = changePlanDetailsBody.availablePlans;
                int i17 = 14 / 0;
            } else {
                list2 = changePlanDetailsBody.availablePlans;
            }
        } else {
            list2 = list;
        }
        return changePlanDetailsBody.copy(str15, str16, str10, str11, str12, str17, str18, str13, str14, list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountKey;
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<AvailablePlan> component10() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<AvailablePlan> list = this.availablePlans;
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.creditLimit;
            int i4 = 52 / 0;
        } else {
            str = this.creditLimit;
        }
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.prepayment;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.deposit;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.creditCategory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 93;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.currentPlan;
            int i4 = 2 / 0;
        } else {
            str = this.currentPlan;
        }
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.price;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalBill;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ChangePlanDetailsBody copy(String accountKey, String creditLimit, String prepayment, String deposit, String creditCategory, String currentPlan, String price, String productId, String totalBill, List<AvailablePlan> availablePlans) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountKey, "");
        Intrinsics.checkNotNullParameter(creditLimit, "");
        Intrinsics.checkNotNullParameter(prepayment, "");
        Intrinsics.checkNotNullParameter(deposit, "");
        Intrinsics.checkNotNullParameter(creditCategory, "");
        Intrinsics.checkNotNullParameter(currentPlan, "");
        Intrinsics.checkNotNullParameter(price, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(totalBill, "");
        Intrinsics.checkNotNullParameter(availablePlans, "");
        ChangePlanDetailsBody changePlanDetailsBody = new ChangePlanDetailsBody(accountKey, creditLimit, prepayment, deposit, creditCategory, currentPlan, price, productId, totalBill, availablePlans);
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return changePlanDetailsBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePlanDetailsBody)) {
            int i5 = i3 + 113;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ChangePlanDetailsBody changePlanDetailsBody = (ChangePlanDetailsBody) other;
        if (!Intrinsics.areEqual(this.accountKey, changePlanDetailsBody.accountKey)) {
            int i7 = component2 + 15;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.creditLimit, changePlanDetailsBody.creditLimit)) {
            int i9 = component2 + 55;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.prepayment, changePlanDetailsBody.prepayment) || !Intrinsics.areEqual(this.deposit, changePlanDetailsBody.deposit) || !Intrinsics.areEqual(this.creditCategory, changePlanDetailsBody.creditCategory) || !Intrinsics.areEqual(this.currentPlan, changePlanDetailsBody.currentPlan)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.price, changePlanDetailsBody.price)) {
            int i11 = copydefault + 11;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.productId, changePlanDetailsBody.productId)) {
            return !(Intrinsics.areEqual(this.totalBill, changePlanDetailsBody.totalBill) ^ true) && Intrinsics.areEqual(this.availablePlans, changePlanDetailsBody.availablePlans);
        }
        int i13 = copydefault + 71;
        component2 = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((this.accountKey.hashCode() * 31) + this.creditLimit.hashCode()) * 31) + this.prepayment.hashCode()) * 31) + this.deposit.hashCode()) * 31) + this.creditCategory.hashCode()) * 31) + this.currentPlan.hashCode()) * 31) + this.price.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.totalBill.hashCode()) * 31) + this.availablePlans.hashCode();
        int i4 = component2 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangePlanDetailsBody(accountKey=" + this.accountKey + ", creditLimit=" + this.creditLimit + ", prepayment=" + this.prepayment + ", deposit=" + this.deposit + ", creditCategory=" + this.creditCategory + ", currentPlan=" + this.currentPlan + ", price=" + this.price + ", productId=" + this.productId + ", totalBill=" + this.totalBill + ", availablePlans=" + this.availablePlans + ")";
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountKey);
        dest.writeString(this.creditLimit);
        dest.writeString(this.prepayment);
        dest.writeString(this.deposit);
        dest.writeString(this.creditCategory);
        dest.writeString(this.currentPlan);
        dest.writeString(this.price);
        dest.writeString(this.productId);
        dest.writeString(this.totalBill);
        List<AvailablePlan> list = this.availablePlans;
        dest.writeInt(list.size());
        Iterator<AvailablePlan> it = list.iterator();
        int i4 = component2 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = component2 + 91;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
        int i7 = component2 + 69;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }
}
