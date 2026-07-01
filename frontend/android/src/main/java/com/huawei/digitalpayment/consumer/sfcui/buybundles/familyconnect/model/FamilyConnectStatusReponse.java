package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\b\u0010#\u001a\u00020\u0005H\u0007J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020\u0005H×\u0001J\t\u0010)\u001a\u00020\u0007H×\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectStatusReponse;", "Landroid/os/Parcelable;", "balance", "", "beneficiariesAdded", "", "offerId", "", "offerPrice", "subscriptionDate", "bundleAttributes", "totalBeneficiaries", "talkTime", "<init>", "(DILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getBalance", "()D", "getBeneficiariesAdded", "()I", "getOfferId", "()Ljava/lang/String;", "getOfferPrice", "getSubscriptionDate", "getBundleAttributes", "getTotalBeneficiaries", "getTalkTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectStatusReponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyConnectStatusReponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("balance")
    private final double balance;

    @SerializedName("beneficiariesAdded")
    private final int beneficiariesAdded;

    @SerializedName("bundleAttributes")
    private final String bundleAttributes;

    @SerializedName("offerId")
    private final String offerId;

    @SerializedName("offerPrice")
    private final int offerPrice;

    @SerializedName("subscriptionDate")
    private final String subscriptionDate;

    @SerializedName("talkTime")
    private final String talkTime;

    @SerializedName("totalBeneficiaries")
    private final int totalBeneficiaries;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyConnectStatusReponse> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectStatusReponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FamilyConnectStatusReponse familyConnectStatusReponse = new FamilyConnectStatusReponse(parcel.readDouble(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            int i2 = component3 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return familyConnectStatusReponse;
        }

        @Override
        public FamilyConnectStatusReponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FamilyConnectStatusReponse familyConnectStatusReponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            int i5 = ShareDataUIState + 27;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return familyConnectStatusReponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectStatusReponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            component3 = i3 % 128;
            FamilyConnectStatusReponse[] familyConnectStatusReponseArr = new FamilyConnectStatusReponse[i];
            if (i3 % 2 != 0) {
                int i4 = 45 / 0;
            }
            return familyConnectStatusReponseArr;
        }

        @Override
        public FamilyConnectStatusReponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 51;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FamilyConnectStatusReponse[] familyConnectStatusReponseArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 47;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return familyConnectStatusReponseArrNewArray;
        }
    }

    public FamilyConnectStatusReponse(double d2, int i, String str, int i2, String str2, String str3, int i3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.balance = d2;
        this.beneficiariesAdded = i;
        this.offerId = str;
        this.offerPrice = i2;
        this.subscriptionDate = str2;
        this.bundleAttributes = str3;
        this.totalBeneficiaries = i3;
        this.talkTime = str4;
    }

    public final double getBalance() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.balance;
        int i5 = i2 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return d2;
    }

    public final int getBeneficiariesAdded() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.beneficiariesAdded;
        int i6 = i2 + 43;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return i5;
    }

    public final String getOfferId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.offerId;
        int i4 = i2 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getOfferPrice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.offerPrice;
        if (i3 == 0) {
            int i5 = 54 / 0;
        }
        return i4;
    }

    public final String getSubscriptionDate() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subscriptionDate;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public final String getBundleAttributes() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bundleAttributes;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getTotalBeneficiaries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.totalBeneficiaries;
        int i6 = i3 + 37;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getTalkTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.talkTime;
        }
        throw null;
    }

    static {
        int i = component3 + 47;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyConnectStatusReponse copy$default(FamilyConnectStatusReponse familyConnectStatusReponse, double d2, int i, String str, int i2, String str2, String str3, int i3, String str4, int i4, Object obj) {
        String str5;
        int i5 = 2 % 2;
        int i6 = copydefault;
        int i7 = i6 + 67;
        ShareDataUIState = i7 % 128;
        double d3 = (i7 % 2 == 0 ? (i4 & 1) == 0 : (i4 & 1) == 0) ? d2 : familyConnectStatusReponse.balance;
        int i8 = (i4 & 2) != 0 ? familyConnectStatusReponse.beneficiariesAdded : i;
        String str6 = (i4 & 4) != 0 ? familyConnectStatusReponse.offerId : str;
        int i9 = (i4 & 8) != 0 ? familyConnectStatusReponse.offerPrice : i2;
        if ((i4 & 16) != 0) {
            str5 = familyConnectStatusReponse.subscriptionDate;
            int i10 = i6 + 83;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str5 = str2;
        }
        return familyConnectStatusReponse.copy(d3, i8, str6, i9, str5, (i4 & 32) != 0 ? familyConnectStatusReponse.bundleAttributes : str3, (i4 & 64) != 0 ? familyConnectStatusReponse.totalBeneficiaries : i3, (i4 & 128) != 0 ? familyConnectStatusReponse.talkTime : str4);
    }

    public final double component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.balance;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.beneficiariesAdded;
        if (i3 == 0) {
            int i5 = 20 / 0;
        }
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offerId;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.offerPrice;
        int i6 = i2 + 107;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.subscriptionDate;
        int i4 = i2 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bundleAttributes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.totalBeneficiaries;
        int i6 = i2 + 41;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.talkTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FamilyConnectStatusReponse copy(double balance, int beneficiariesAdded, String offerId, int offerPrice, String subscriptionDate, String bundleAttributes, int totalBeneficiaries, String talkTime) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(offerId, "");
        Intrinsics.checkNotNullParameter(subscriptionDate, "");
        Intrinsics.checkNotNullParameter(bundleAttributes, "");
        FamilyConnectStatusReponse familyConnectStatusReponse = new FamilyConnectStatusReponse(balance, beneficiariesAdded, offerId, offerPrice, subscriptionDate, bundleAttributes, totalBeneficiaries, talkTime);
        int i2 = copydefault + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return familyConnectStatusReponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (java.lang.Double.compare(r8.balance, r9.balance) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r8.beneficiariesAdded == r9.beneficiariesAdded) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState + 57;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.offerId, r9.offerId) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault + 63;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if ((r9 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r8.offerPrice == r9.offerPrice) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState + 89;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.subscriptionDate, r9.subscriptionDate) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState + 51;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.bundleAttributes, r9.bundleAttributes) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState + 43;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r8.totalBeneficiaries == r9.totalBeneficiaries) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault + 119;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.talkTime, r9.talkTime) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState + 45;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 21
            int r1 = r1 / r3
            if (r8 != r9) goto L19
            goto L18
        L16:
            if (r8 != r9) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r9 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse r9 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse) r9
            double r4 = r8.balance
            double r6 = r9.balance
            int r1 = java.lang.Double.compare(r4, r6)
            if (r1 == 0) goto L2b
            return r3
        L2b:
            int r1 = r8.beneficiariesAdded
            int r4 = r9.beneficiariesAdded
            if (r1 == r4) goto L3b
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState
            int r9 = r9 + 57
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r1
            int r9 = r9 % r0
            return r3
        L3b:
            java.lang.String r1 = r8.offerId
            java.lang.String r4 = r9.offerId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L52
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault
            int r9 = r9 + 63
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState = r1
            int r9 = r9 % r0
            if (r9 == 0) goto L51
            return r2
        L51:
            return r3
        L52:
            int r1 = r8.offerPrice
            int r4 = r9.offerPrice
            if (r1 == r4) goto L62
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState
            int r9 = r9 + 89
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r1
            int r9 = r9 % r0
            return r3
        L62:
            java.lang.String r1 = r8.subscriptionDate
            java.lang.String r4 = r9.subscriptionDate
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L76
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState
            int r9 = r9 + 51
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r1
            int r9 = r9 % r0
            return r3
        L76:
            java.lang.String r1 = r8.bundleAttributes
            java.lang.String r4 = r9.bundleAttributes
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L8a
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState
            int r9 = r9 + 43
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r1
            int r9 = r9 % r0
            return r3
        L8a:
            int r1 = r8.totalBeneficiaries
            int r4 = r9.totalBeneficiaries
            if (r1 == r4) goto L9a
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault
            int r9 = r9 + 119
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState = r1
            int r9 = r9 % r0
            return r3
        L9a:
            java.lang.String r1 = r8.talkTime
            java.lang.String r9 = r9.talkTime
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r9 != 0) goto Lae
            int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.ShareDataUIState
            int r9 = r9 + 45
            int r1 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.copydefault = r1
            int r9 = r9 % r0
            return r3
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Double.hashCode(this.balance);
        int iHashCode3 = Integer.hashCode(this.beneficiariesAdded);
        int iHashCode4 = this.offerId.hashCode();
        int iHashCode5 = Integer.hashCode(this.offerPrice);
        int iHashCode6 = this.subscriptionDate.hashCode();
        int iHashCode7 = this.bundleAttributes.hashCode();
        int iHashCode8 = Integer.hashCode(this.totalBeneficiaries);
        String str = this.talkTime;
        if (str == null) {
            int i4 = copydefault;
            int i5 = i4 + 101;
            ShareDataUIState = i5 % 128;
            iHashCode = (i5 % 2 != 0 ? 0 : 1) ^ 1;
            int i6 = i4 + 113;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectStatusReponse(balance=" + this.balance + ", beneficiariesAdded=" + this.beneficiariesAdded + ", offerId=" + this.offerId + ", offerPrice=" + this.offerPrice + ", subscriptionDate=" + this.subscriptionDate + ", bundleAttributes=" + this.bundleAttributes + ", totalBeneficiaries=" + this.totalBeneficiaries + ", talkTime=" + this.talkTime + ")";
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.balance);
        dest.writeInt(this.beneficiariesAdded);
        dest.writeString(this.offerId);
        dest.writeInt(this.offerPrice);
        dest.writeString(this.subscriptionDate);
        dest.writeString(this.bundleAttributes);
        dest.writeInt(this.totalBeneficiaries);
        dest.writeString(this.talkTime);
        int i4 = copydefault + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
