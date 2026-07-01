package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÇ\u0001J\b\u0010 \u001a\u00020\nH\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020\nH×\u0001J\t\u0010&\u001a\u00020\u0006H×\u0001J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\nH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBalanceResponse;", "Landroid/os/Parcelable;", "beneficiaryBalances", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/BeneficiaryBalance;", "expirationDate", "", "initialAmount", "", "offerPrice", "", "sponsorBalance", "sponsorMsisdn", "<init>", "(Ljava/util/List;Ljava/lang/String;DIDLjava/lang/String;)V", "getBeneficiaryBalances", "()Ljava/util/List;", "getExpirationDate", "()Ljava/lang/String;", "getInitialAmount", "()D", "getOfferPrice", "()I", "getSponsorBalance", "getSponsorMsisdn", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectBalanceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FamilyConnectBalanceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("beneficiaryBalances")
    private final List<BeneficiaryBalance> beneficiaryBalances;

    @SerializedName("expirationDate")
    private final String expirationDate;

    @SerializedName("initialAmount")
    private final double initialAmount;

    @SerializedName("offerPrice")
    private final int offerPrice;

    @SerializedName("sponsorBalance")
    private final double sponsorBalance;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyConnectBalanceResponse> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectBalanceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = component3 + 113;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(BeneficiaryBalance.CREATOR.createFromParcel(parcel));
                    i3 += 127;
                } else {
                    arrayList.add(BeneficiaryBalance.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            return new FamilyConnectBalanceResponse(arrayList, parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        @Override
        public FamilyConnectBalanceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FamilyConnectBalanceResponse familyConnectBalanceResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return familyConnectBalanceResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectBalanceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 103;
            int i4 = i3 % 128;
            copydefault = i4;
            Object obj = null;
            FamilyConnectBalanceResponse[] familyConnectBalanceResponseArr = new FamilyConnectBalanceResponse[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 59;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return familyConnectBalanceResponseArr;
            }
            throw null;
        }

        @Override
        public FamilyConnectBalanceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 55;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FamilyConnectBalanceResponse[] familyConnectBalanceResponseArrNewArray = newArray(i);
            int i5 = component3 + 69;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 80 / 0;
            }
            return familyConnectBalanceResponseArrNewArray;
        }
    }

    public FamilyConnectBalanceResponse(List<BeneficiaryBalance> list, String str, double d2, int i, double d3, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.beneficiaryBalances = list;
        this.expirationDate = str;
        this.initialAmount = d2;
        this.offerPrice = i;
        this.sponsorBalance = d3;
        this.sponsorMsisdn = str2;
    }

    public final List<BeneficiaryBalance> getBeneficiaryBalances() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<BeneficiaryBalance> list = this.beneficiaryBalances;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return list;
    }

    public final String getExpirationDate() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expirationDate;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double getInitialAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        double d2 = this.initialAmount;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        int i6 = i3 + 119;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return d2;
    }

    public final int getOfferPrice() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.offerPrice;
        int i6 = i3 + 75;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final double getSponsorBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        double d2 = this.sponsorBalance;
        int i4 = i3 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    static {
        int i = component3 + 109;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FamilyConnectBalanceResponse copy$default(FamilyConnectBalanceResponse familyConnectBalanceResponse, List list, String str, double d2, int i, double d3, String str2, int i2, Object obj) {
        String str3;
        double d4;
        int i3;
        int i4 = 2 % 2;
        List list2 = (i2 & 1) != 0 ? familyConnectBalanceResponse.beneficiaryBalances : list;
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i5 = copydefault + 97;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str4 = familyConnectBalanceResponse.expirationDate;
                throw null;
            }
            str3 = familyConnectBalanceResponse.expirationDate;
        } else {
            str3 = str;
        }
        if ((i2 & 4) != 0) {
            int i6 = copydefault + 5;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            d4 = familyConnectBalanceResponse.initialAmount;
        } else {
            d4 = d2;
        }
        if ((i2 & 8) != 0) {
            int i8 = copydefault + 73;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = familyConnectBalanceResponse.offerPrice;
                obj2.hashCode();
                throw null;
            }
            i3 = familyConnectBalanceResponse.offerPrice;
        } else {
            i3 = i;
        }
        FamilyConnectBalanceResponse familyConnectBalanceResponseCopy = familyConnectBalanceResponse.copy(list2, str3, d4, i3, (i2 & 16) != 0 ? familyConnectBalanceResponse.sponsorBalance : d3, (i2 & 32) != 0 ? familyConnectBalanceResponse.sponsorMsisdn : str2);
        int i10 = ShareDataUIState + 121;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return familyConnectBalanceResponseCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final List<BeneficiaryBalance> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<BeneficiaryBalance> list = this.beneficiaryBalances;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.expirationDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.initialAmount;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.offerPrice;
        int i6 = i3 + 111;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return i5;
    }

    public final double component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d2 = this.sponsorBalance;
        int i4 = i2 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return d2;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.sponsorMsisdn;
            int i4 = 80 / 0;
        } else {
            str = this.sponsorMsisdn;
        }
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final FamilyConnectBalanceResponse copy(List<BeneficiaryBalance> beneficiaryBalances, String expirationDate, double initialAmount, int offerPrice, double sponsorBalance, String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryBalances, "");
        Intrinsics.checkNotNullParameter(expirationDate, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        FamilyConnectBalanceResponse familyConnectBalanceResponse = new FamilyConnectBalanceResponse(beneficiaryBalances, expirationDate, initialAmount, offerPrice, sponsorBalance, sponsorMsisdn);
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return familyConnectBalanceResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r8 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.beneficiaryBalances, r8.beneficiaryBalances) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.expirationDate, r8.expirationDate) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState + 107;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if ((r8 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (java.lang.Double.compare(r7.initialAmount, r8.initialAmount) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault + 77;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if ((r8 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r7.offerPrice == r8.offerPrice) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (java.lang.Double.compare(r7.sponsorBalance, r8.sponsorBalance) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault + 3;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.sponsorMsisdn, r8.sponsorMsisdn) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 41;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState
            int r2 = r1 + 97
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 61
            int r2 = r2 / r4
            if (r7 != r8) goto L20
            goto L18
        L16:
            if (r7 != r8) goto L20
        L18:
            int r1 = r1 + 41
            int r8 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault = r8
            int r1 = r1 % r0
            return r3
        L20:
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse
            if (r1 != 0) goto L25
            return r4
        L25:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse r8 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse) r8
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance> r1 = r7.beneficiaryBalances
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance> r2 = r8.beneficiaryBalances
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            return r4
        L32:
            java.lang.String r1 = r7.expirationDate
            java.lang.String r2 = r8.expirationDate
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r3) goto L49
            int r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState
            int r8 = r8 + 107
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L48
            return r3
        L48:
            return r4
        L49:
            double r1 = r7.initialAmount
            double r5 = r8.initialAmount
            int r1 = java.lang.Double.compare(r1, r5)
            if (r1 == 0) goto L61
            int r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault
            int r8 = r8 + 77
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L5f
            return r4
        L5f:
            r8 = 0
            throw r8
        L61:
            int r1 = r7.offerPrice
            int r2 = r8.offerPrice
            if (r1 == r2) goto L68
            return r4
        L68:
            double r1 = r7.sponsorBalance
            double r5 = r8.sponsorBalance
            int r1 = java.lang.Double.compare(r1, r5)
            if (r1 == 0) goto L7c
            int r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.copydefault
            int r8 = r8 + 3
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.ShareDataUIState = r1
            int r8 = r8 % r0
            return r4
        L7c:
            java.lang.String r0 = r7.sponsorMsisdn
            java.lang.String r8 = r8.sponsorMsisdn
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r8 != 0) goto L87
            return r4
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.beneficiaryBalances.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + Double.hashCode(this.initialAmount)) * 31) + Integer.hashCode(this.offerPrice)) * 31) + Double.hashCode(this.sponsorBalance)) * 31) + this.sponsorMsisdn.hashCode();
        int i4 = ShareDataUIState + 23;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectBalanceResponse(beneficiaryBalances=" + this.beneficiaryBalances + ", expirationDate=" + this.expirationDate + ", initialAmount=" + this.initialAmount + ", offerPrice=" + this.offerPrice + ", sponsorBalance=" + this.sponsorBalance + ", sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
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
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<BeneficiaryBalance> list = this.beneficiaryBalances;
        dest.writeInt(list.size());
        Iterator<BeneficiaryBalance> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.expirationDate);
        dest.writeDouble(this.initialAmount);
        dest.writeInt(this.offerPrice);
        dest.writeDouble(this.sponsorBalance);
        dest.writeString(this.sponsorMsisdn);
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
