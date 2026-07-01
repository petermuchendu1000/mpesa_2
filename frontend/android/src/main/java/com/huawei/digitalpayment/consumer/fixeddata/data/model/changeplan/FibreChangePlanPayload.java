package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J\u007f\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÇ\u0001J\b\u0010'\u001a\u00020(H\u0007J\u0013\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010+H×\u0003J\t\u0010,\u001a\u00020(H×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001c¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreChangePlanPayload;", "Landroid/os/Parcelable;", "msisdn", "", "accountId", "rechargeAmount", DisPlayItems.TRANSACTION_ID, "mainOfferingId", "mainOfferingCode", "currentOfferings", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "newOfferings", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Product;", "isPostPay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "getMsisdn", "()Ljava/lang/String;", "getAccountId", "getRechargeAmount", "getTransactionId", "getMainOfferingId", "getMainOfferingCode", "getCurrentOfferings", "()Ljava/util/List;", "getNewOfferings", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreChangePlanPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreChangePlanPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("currentOfferings")
    private final List<Product> currentOfferings;

    @SerializedName("isPostPay")
    private final boolean isPostPay;

    @SerializedName("mainOfferingCode")
    private final String mainOfferingCode;

    @SerializedName("mainOfferingId")
    private final String mainOfferingId;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("newOfferings")
    private final List<FibreProduct.Product> newOfferings;

    @SerializedName("rechargeAmount")
    private final String rechargeAmount;

    @SerializedName(DisPlayItems.TRANSACTION_ID)
    private final String transactionId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreChangePlanPayload> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreChangePlanPayload createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Product.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList3 = arrayList;
            if (parcel.readInt() == 0) {
                int i4 = component1 + 13;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList4.add(FibreProduct.Product.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList4;
            }
            ArrayList arrayList5 = arrayList2;
            if (parcel.readInt() != 0) {
                int i8 = component1 + 41;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            return new FibreChangePlanPayload(string, string2, string3, string4, string5, string6, arrayList3, arrayList5, z);
        }

        @Override
        public FibreChangePlanPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreChangePlanPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 31;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            FibreChangePlanPayload[] fibreChangePlanPayloadArr = new FibreChangePlanPayload[i];
            int i6 = i4 + 79;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return fibreChangePlanPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FibreChangePlanPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 93;
            component1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            FibreChangePlanPayload[] fibreChangePlanPayloadArrNewArray = newArray(i);
            int i4 = copydefault + 63;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return fibreChangePlanPayloadArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public FibreChangePlanPayload(String str, String str2, String str3, String str4, String str5, String str6, List<Product> list, List<FibreProduct.Product> list2, boolean z) {
        this.msisdn = str;
        this.accountId = str2;
        this.rechargeAmount = str3;
        this.transactionId = str4;
        this.mainOfferingId = str5;
        this.mainOfferingCode = str6;
        this.currentOfferings = list;
        this.newOfferings = list2;
        this.isPostPay = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FibreChangePlanPayload(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        boolean z2;
        if ((i & 32) != 0) {
            int i2 = component2 + 121;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str7 = null;
        } else {
            str7 = str6;
        }
        if ((i & 256) != 0) {
            int i4 = component2 + 7;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 2;
            } else {
                int i6 = 2 % 2;
            }
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str2, str3, str4, str5, str7, list, list2, z2);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 79;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRechargeAmount() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.rechargeAmount;
            int i4 = 10 / 0;
        } else {
            str = this.rechargeAmount;
        }
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMainOfferingId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mainOfferingId;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getMainOfferingCode() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.mainOfferingCode;
            int i4 = 64 / 0;
        } else {
            str = this.mainOfferingCode;
        }
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Product> getCurrentOfferings() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Product> list = this.currentOfferings;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return list;
    }

    public final List<FibreProduct.Product> getNewOfferings() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.newOfferings;
        }
        throw null;
    }

    public final boolean isPostPay() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isPostPay;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return z;
    }

    static {
        int i = copydefault + 9;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreChangePlanPayload copy$default(FibreChangePlanPayload fibreChangePlanPayload, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 73;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str7 = fibreChangePlanPayload.msisdn;
        } else {
            str7 = str;
        }
        String str10 = (i & 2) != 0 ? fibreChangePlanPayload.accountId : str2;
        String str11 = (i & 4) != 0 ? fibreChangePlanPayload.rechargeAmount : str3;
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 23;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str8 = fibreChangePlanPayload.transactionId;
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = ShareDataUIState + 125;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str9 = fibreChangePlanPayload.mainOfferingId;
        } else {
            str9 = str5;
        }
        return fibreChangePlanPayload.copy(str7, str10, str11, str8, str9, (i & 32) != 0 ? fibreChangePlanPayload.mainOfferingCode : str6, (i & 64) != 0 ? fibreChangePlanPayload.currentOfferings : list, (i & 128) != 0 ? fibreChangePlanPayload.newOfferings : list2, (i & 256) != 0 ? fibreChangePlanPayload.isPostPay : z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.rechargeAmount;
        int i5 = i3 + 107;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.transactionId;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mainOfferingId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.mainOfferingCode;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Product> component7() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Product> list = this.currentOfferings;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return list;
    }

    public final List<FibreProduct.Product> component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.newOfferings;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isPostPay;
        }
        throw null;
    }

    public final FibreChangePlanPayload copy(String msisdn, String accountId, String rechargeAmount, String transactionId, String mainOfferingId, String mainOfferingCode, List<Product> currentOfferings, List<FibreProduct.Product> newOfferings, boolean isPostPay) {
        int i = 2 % 2;
        FibreChangePlanPayload fibreChangePlanPayload = new FibreChangePlanPayload(msisdn, accountId, rechargeAmount, transactionId, mainOfferingId, mainOfferingCode, currentOfferings, newOfferings, isPostPay);
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return fibreChangePlanPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibreChangePlanPayload)) {
            return false;
        }
        FibreChangePlanPayload fibreChangePlanPayload = (FibreChangePlanPayload) other;
        if (Intrinsics.areEqual(this.msisdn, fibreChangePlanPayload.msisdn)) {
            if (Intrinsics.areEqual(this.accountId, fibreChangePlanPayload.accountId)) {
                if (!Intrinsics.areEqual(this.rechargeAmount, fibreChangePlanPayload.rechargeAmount)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.transactionId, fibreChangePlanPayload.transactionId)) {
                    int i2 = ShareDataUIState + 125;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.mainOfferingId, fibreChangePlanPayload.mainOfferingId)) {
                    int i4 = component2 + 1;
                    ShareDataUIState = i4 % 128;
                    return i4 % 2 == 0;
                }
                if (Intrinsics.areEqual(this.mainOfferingCode, fibreChangePlanPayload.mainOfferingCode)) {
                    return Intrinsics.areEqual(this.currentOfferings, fibreChangePlanPayload.currentOfferings) && Intrinsics.areEqual(this.newOfferings, fibreChangePlanPayload.newOfferings) && this.isPostPay == fibreChangePlanPayload.isPostPay;
                }
                int i5 = component2 + 79;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = component2 + 19;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.accountId;
        if (str2 == null) {
            int i2 = component2 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.rechargeAmount;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.transactionId;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.mainOfferingId;
        if (str5 == null) {
            int i4 = component2 + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.mainOfferingCode;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        List<Product> list = this.currentOfferings;
        if (list == null) {
            int i6 = component2 + 99;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = list.hashCode();
        }
        List<FibreProduct.Product> list2 = this.newOfferings;
        if (list2 == null) {
            int i8 = component2 + 89;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            iHashCode4 = list2.hashCode();
        }
        return (((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + Boolean.hashCode(this.isPostPay);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreChangePlanPayload(msisdn=" + this.msisdn + ", accountId=" + this.accountId + ", rechargeAmount=" + this.rechargeAmount + ", transactionId=" + this.transactionId + ", mainOfferingId=" + this.mainOfferingId + ", mainOfferingCode=" + this.mainOfferingCode + ", currentOfferings=" + this.currentOfferings + ", newOfferings=" + this.newOfferings + ", isPostPay=" + this.isPostPay + ")";
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.accountId);
        dest.writeString(this.rechargeAmount);
        dest.writeString(this.transactionId);
        dest.writeString(this.mainOfferingId);
        dest.writeString(this.mainOfferingCode);
        List<Product> list = this.currentOfferings;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Product> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<FibreProduct.Product> list2 = this.newOfferings;
        if (list2 == null) {
            dest.writeInt(0);
            int i4 = component2 + 99;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<FibreProduct.Product> it2 = list2.iterator();
            while (!(!it2.hasNext())) {
                it2.next().writeToParcel(dest, flags);
                int i6 = ShareDataUIState + 107;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        dest.writeInt(this.isPostPay ? 1 : 0);
        int i8 = component2 + 95;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 49 / 0;
        }
    }
}
