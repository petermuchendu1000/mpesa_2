package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u009c\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÇ\u0001¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020SH\u0007J\u0013\u0010T\u001a\u00020\u001a2\b\u0010U\u001a\u0004\u0018\u00010VH×\u0003J\t\u0010W\u001a\u00020SH×\u0001J\t\u0010X\u001a\u00020\u0003H×\u0001J\u0018\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020SH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006^"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "Landroid/os/Parcelable;", "serviceCode", "", "offerInfo", "parentOfferingId", "offeringId", "offeringCode", "offeringDetails", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OfferingDetails;", "purchaseSeq", "rentCycleId", "rentalVal", "bundleFlag", "beneficiaryMsisdn", "discountValue", "discountExpiry", "status", "statusDetail", "additionalInfo", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "sponsorNum", "sponsorPayOnly", "sponsorPercent", "purchaseAllowed", "", "oneOffOffering", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;)V", "getServiceCode", "()Ljava/lang/String;", "getOfferInfo", "getParentOfferingId", "getOfferingId", "getOfferingCode", "getOfferingDetails", "()Ljava/util/List;", "getPurchaseSeq", "getRentCycleId", "getRentalVal", "getBundleFlag", "getBeneficiaryMsisdn", "getDiscountValue", "getDiscountExpiry", "getStatus", "getStatusDetail", "getAdditionalInfo", "getCategory", "getSponsorNum", "getSponsorPayOnly", "getSponsorPercent", "getPurchaseAllowed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOneOffOffering", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Product implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Product> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("additionalInfo")
    private final String additionalInfo;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("bundleFlag")
    private final String bundleFlag;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("discountExpiry")
    private final String discountExpiry;

    @SerializedName("discountValue")
    private final String discountValue;

    @SerializedName("offerInfo")
    private final String offerInfo;

    @SerializedName("offeringCode")
    private final String offeringCode;

    @SerializedName("offeringDetails")
    private final List<OfferingDetails> offeringDetails;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("oneOffOffering")
    private final OneOffOffering oneOffOffering;

    @SerializedName("parentOfferingId")
    private final String parentOfferingId;

    @SerializedName("purchaseAllowed")
    private final Boolean purchaseAllowed;

    @SerializedName("purchaseSeq")
    private final String purchaseSeq;

    @SerializedName("rentCycleId")
    private final String rentCycleId;

    @SerializedName("rentalVal")
    private final String rentalVal;

    @SerializedName("serviceCode")
    private final String serviceCode;

    @SerializedName("sponsorNum")
    private final String sponsorNum;

    @SerializedName("sponsorPayOnly")
    private final String sponsorPayOnly;

    @SerializedName("sponsorPercent")
    private final String sponsorPercent;

    @SerializedName("status")
    private final String status;

    @SerializedName("statusDetail")
    private final String statusDetail;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Product> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Product createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = ShareDataUIState + 123;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    int i5 = ShareDataUIState + 15;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(OfferingDetails.CREATOR.createFromParcel(parcel));
                    i4++;
                    int i7 = component1 + 73;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            ArrayList arrayList2 = arrayList;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i9 = component1 + 1;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Product product = new Product(string, string2, string3, string4, string5, arrayList2, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, boolValueOf, parcel.readInt() == 0 ? null : OneOffOffering.CREATOR.createFromParcel(parcel));
            int i11 = ShareDataUIState + 65;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return product;
        }

        @Override
        public Product createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Product productCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return productCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Product[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 13;
            int i4 = i3 % 128;
            component1 = i4;
            Product[] productArr = new Product[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 109;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return productArr;
            }
            throw null;
        }

        @Override
        public Product[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Product[] productArrNewArray = newArray(i);
            int i5 = component1 + 85;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 14 / 0;
            }
            return productArrNewArray;
        }
    }

    public Product(String str, String str2, String str3, String str4, String str5, List<OfferingDetails> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, OneOffOffering oneOffOffering) {
        this.serviceCode = str;
        this.offerInfo = str2;
        this.parentOfferingId = str3;
        this.offeringId = str4;
        this.offeringCode = str5;
        this.offeringDetails = list;
        this.purchaseSeq = str6;
        this.rentCycleId = str7;
        this.rentalVal = str8;
        this.bundleFlag = str9;
        this.beneficiaryMsisdn = str10;
        this.discountValue = str11;
        this.discountExpiry = str12;
        this.status = str13;
        this.statusDetail = str14;
        this.additionalInfo = str15;
        this.category = str16;
        this.sponsorNum = str17;
        this.sponsorPayOnly = str18;
        this.sponsorPercent = str19;
        this.purchaseAllowed = bool;
        this.oneOffOffering = oneOffOffering;
    }

    public final String getServiceCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceCode;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferInfo() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerInfo;
        int i5 = i2 + 91;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getParentOfferingId() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.parentOfferingId;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offeringId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOfferingCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringCode;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<OfferingDetails> getOfferingDetails() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<OfferingDetails> list = this.offeringDetails;
        int i5 = i3 + 53;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return list;
    }

    public final String getPurchaseSeq() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.purchaseSeq;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRentCycleId() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.rentCycleId;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRentalVal() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rentalVal;
        int i5 = i2 + 11;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final String getBundleFlag() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.bundleFlag;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getDiscountValue() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.discountValue;
        int i4 = i3 + 57;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getDiscountExpiry() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.discountExpiry;
        int i4 = i3 + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 43;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getStatusDetail() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.statusDetail;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return str;
    }

    public final String getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.additionalInfo;
        }
        throw null;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        throw null;
    }

    public final String getSponsorNum() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorNum;
        }
        throw null;
    }

    public final String getSponsorPayOnly() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorPayOnly;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final String getSponsorPercent() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorPercent;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getPurchaseAllowed() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.purchaseAllowed;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final OneOffOffering getOneOffOffering() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        OneOffOffering oneOffOffering = this.oneOffOffering;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return oneOffOffering;
    }

    static {
        int i = copydefault + 83;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Product copy$default(Product product, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, OneOffOffering oneOffOffering, int i, Object obj) {
        String str20;
        String str21;
        List list2;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        Boolean bool2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 33;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                str20 = product.serviceCode;
                int i4 = 50 / 0;
            } else {
                str20 = product.serviceCode;
            }
        } else {
            str20 = str;
        }
        String str35 = (i & 2) != 0 ? product.offerInfo : str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = component1 + 77;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str36 = product.parentOfferingId;
                obj2.hashCode();
                throw null;
            }
            str21 = product.parentOfferingId;
        } else {
            str21 = str3;
        }
        String str37 = (i & 8) != 0 ? product.offeringId : str4;
        String str38 = (i & 16) != 0 ? product.offeringCode : str5;
        if ((i & 32) != 0) {
            int i6 = component3 + 113;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                List<OfferingDetails> list3 = product.offeringDetails;
                throw null;
            }
            list2 = product.offeringDetails;
        } else {
            list2 = list;
        }
        String str39 = (i & 64) != 0 ? product.purchaseSeq : str6;
        String str40 = (i & 128) != 0 ? product.rentCycleId : str7;
        String str41 = (i & 256) != 0 ? product.rentalVal : str8;
        String str42 = (i & 512) != 0 ? product.bundleFlag : str9;
        String str43 = (i & 1024) != 0 ? product.beneficiaryMsisdn : str10;
        if ((i & 2048) != 0) {
            int i7 = component3 + 9;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str22 = product.discountValue;
        } else {
            str22 = str11;
        }
        if ((i & 4096) != 0) {
            int i9 = component3 + 55;
            str23 = str22;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            str24 = product.discountExpiry;
        } else {
            str23 = str22;
            str24 = str12;
        }
        if ((i & 8192) != 0) {
            int i11 = component3 + 47;
            str25 = str24;
            component1 = i11 % 128;
            if (i11 % 2 == 0) {
                String str44 = product.status;
                throw null;
            }
            str26 = product.status;
        } else {
            str25 = str24;
            str26 = str13;
        }
        String str45 = (i & 16384) != 0 ? product.statusDetail : str14;
        String str46 = (i & 32768) != 0 ? product.additionalInfo : str15;
        if ((i & 65536) != 0) {
            String str47 = product.category;
            int i12 = component1 + 65;
            str27 = str45;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            str28 = str47;
        } else {
            str27 = str45;
            str28 = str16;
        }
        if ((131072 & i) != 0) {
            int i14 = component3 + 77;
            str29 = str28;
            component1 = i14 % 128;
            int i15 = i14 % 2;
            str30 = product.sponsorNum;
            if (i15 == 0) {
                int i16 = 4 / 0;
            }
        } else {
            str29 = str28;
            str30 = str17;
        }
        String str48 = (262144 & i) != 0 ? product.sponsorPayOnly : str18;
        if ((i & 524288) != 0) {
            str32 = str48;
            int i17 = component3 + 67;
            str31 = str30;
            component1 = i17 % 128;
            if (i17 % 2 == 0) {
                String str49 = product.sponsorPercent;
                throw null;
            }
            str33 = product.sponsorPercent;
        } else {
            str31 = str30;
            str32 = str48;
            str33 = str19;
        }
        if ((1048576 & i) != 0) {
            int i18 = component1 + 1;
            str34 = str33;
            component3 = i18 % 128;
            if (i18 % 2 != 0) {
                Boolean bool3 = product.purchaseAllowed;
                throw null;
            }
            bool2 = product.purchaseAllowed;
        } else {
            str34 = str33;
            bool2 = bool;
        }
        return product.copy(str20, str35, str21, str37, str38, list2, str39, str40, str41, str42, str43, str23, str25, str26, str27, str46, str29, str31, str32, str34, bool2, (i & 2097152) != 0 ? product.oneOffOffering : oneOffOffering);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.serviceCode;
        int i5 = i3 + 51;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.bundleFlag;
        int i4 = i3 + 49;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.discountValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.discountExpiry;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusDetail;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.additionalInfo;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component17() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.category;
            int i4 = 63 / 0;
        } else {
            str = this.category;
        }
        int i5 = i2 + 117;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sponsorNum;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sponsorPayOnly;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.offerInfo;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorPercent;
        }
        throw null;
    }

    public final Boolean component21() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.purchaseAllowed;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return bool;
    }

    public final OneOffOffering component22() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        OneOffOffering oneOffOffering = this.oneOffOffering;
        int i5 = i3 + 51;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return oneOffOffering;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.parentOfferingId;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.offeringId;
        int i5 = i3 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.offeringCode;
        int i4 = i3 + 81;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<OfferingDetails> component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<OfferingDetails> list = this.offeringDetails;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.purchaseSeq;
            int i4 = 37 / 0;
        } else {
            str = this.purchaseSeq;
        }
        int i5 = i2 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.rentCycleId;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.rentalVal;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return str;
    }

    public final Product copy(String serviceCode, String offerInfo, String parentOfferingId, String offeringId, String offeringCode, List<OfferingDetails> offeringDetails, String purchaseSeq, String rentCycleId, String rentalVal, String bundleFlag, String beneficiaryMsisdn, String discountValue, String discountExpiry, String status, String statusDetail, String additionalInfo, String category, String sponsorNum, String sponsorPayOnly, String sponsorPercent, Boolean purchaseAllowed, OneOffOffering oneOffOffering) {
        int i = 2 % 2;
        Product product = new Product(serviceCode, offerInfo, parentOfferingId, offeringId, offeringCode, offeringDetails, purchaseSeq, rentCycleId, rentalVal, bundleFlag, beneficiaryMsisdn, discountValue, discountExpiry, status, statusDetail, additionalInfo, category, sponsorNum, sponsorPayOnly, sponsorPercent, purchaseAllowed, oneOffOffering);
        int i2 = component3 + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return product;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 25;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Product)) {
            int i4 = component3 + 21;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Product product = (Product) other;
        if (!Intrinsics.areEqual(this.serviceCode, product.serviceCode) || !Intrinsics.areEqual(this.offerInfo, product.offerInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.parentOfferingId, product.parentOfferingId)) {
            int i6 = component3 + 73;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.offeringId, product.offeringId) || !Intrinsics.areEqual(this.offeringCode, product.offeringCode) || !Intrinsics.areEqual(this.offeringDetails, product.offeringDetails) || !Intrinsics.areEqual(this.purchaseSeq, product.purchaseSeq)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.rentCycleId, product.rentCycleId)) {
            int i8 = component3 + 33;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rentalVal, product.rentalVal)) {
            int i10 = component3 + 83;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleFlag, product.bundleFlag) || !Intrinsics.areEqual(this.beneficiaryMsisdn, product.beneficiaryMsisdn) || !Intrinsics.areEqual(this.discountValue, product.discountValue) || !Intrinsics.areEqual(this.discountExpiry, product.discountExpiry) || !Intrinsics.areEqual(this.status, product.status)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.statusDetail, product.statusDetail)) {
            int i12 = component1 + 105;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.additionalInfo, product.additionalInfo)) {
            int i14 = component1 + 23;
            component3 = i14 % 128;
            if (i14 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.category, product.category)) {
            int i15 = component3 + 103;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sponsorNum, product.sponsorNum) || !Intrinsics.areEqual(this.sponsorPayOnly, product.sponsorPayOnly) || !Intrinsics.areEqual(this.sponsorPercent, product.sponsorPercent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.purchaseAllowed, product.purchaseAllowed)) {
            int i17 = component3 + 1;
            component1 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.oneOffOffering, product.oneOffOffering)) {
            return true;
        }
        int i19 = component1 + 79;
        component3 = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int iHashCode5;
        int i2;
        int iHashCode6;
        int i3;
        int iHashCode7;
        int i4;
        int iHashCode8;
        int i5;
        int iHashCode9;
        int i6 = 2 % 2;
        String str = this.serviceCode;
        if (str == null) {
            int i7 = component3 + 35;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.offerInfo;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.parentOfferingId;
        if (str3 == null) {
            int i9 = component1 + 33;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.offeringId;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.offeringCode;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        List<OfferingDetails> list = this.offeringDetails;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        String str6 = this.purchaseSeq;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rentCycleId;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.rentalVal;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.bundleFlag;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.beneficiaryMsisdn;
        if (str10 == null) {
            int i11 = component3 + 77;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str10.hashCode();
        }
        String str11 = this.discountValue;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.discountExpiry;
        if (str12 == null) {
            int i13 = component1 + 115;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str12.hashCode();
        }
        String str13 = this.status;
        int iHashCode19 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.statusDetail;
        int iHashCode20 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.additionalInfo;
        if (str15 == null) {
            int i15 = component1 + 67;
            i = iHashCode19;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            iHashCode5 = 0;
        } else {
            i = iHashCode19;
            iHashCode5 = str15.hashCode();
        }
        String str16 = this.category;
        int iHashCode21 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.sponsorNum;
        if (str17 == null) {
            int i17 = component3 + 115;
            i2 = iHashCode5;
            component1 = i17 % 128;
            int i18 = i17 % 2;
            iHashCode6 = 0;
        } else {
            i2 = iHashCode5;
            iHashCode6 = str17.hashCode();
        }
        String str18 = this.sponsorPayOnly;
        if (str18 == null) {
            int i19 = component3 + 79;
            i3 = iHashCode6;
            component1 = i19 % 128;
            int i20 = i19 % 2;
            iHashCode7 = 0;
        } else {
            i3 = iHashCode6;
            iHashCode7 = str18.hashCode();
        }
        String str19 = this.sponsorPercent;
        if (str19 == null) {
            int i21 = component3 + 17;
            i4 = iHashCode7;
            component1 = i21 % 128;
            iHashCode8 = i21 % 2 == 0 ? 1 : 0;
        } else {
            i4 = iHashCode7;
            iHashCode8 = str19.hashCode();
        }
        Boolean bool = this.purchaseAllowed;
        if (bool == null) {
            int i22 = component3 + 67;
            i5 = iHashCode8;
            component1 = i22 % 128;
            int i23 = i22 % 2;
            iHashCode9 = 0;
        } else {
            i5 = iHashCode8;
            iHashCode9 = bool.hashCode();
        }
        OneOffOffering oneOffOffering = this.oneOffOffering;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode3) * 31) + iHashCode18) * 31) + iHashCode4) * 31) + i) * 31) + iHashCode20) * 31) + i2) * 31) + iHashCode21) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + iHashCode9) * 31) + (oneOffOffering == null ? 0 : oneOffOffering.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Product(serviceCode=" + this.serviceCode + ", offerInfo=" + this.offerInfo + ", parentOfferingId=" + this.parentOfferingId + ", offeringId=" + this.offeringId + ", offeringCode=" + this.offeringCode + ", offeringDetails=" + this.offeringDetails + ", purchaseSeq=" + this.purchaseSeq + ", rentCycleId=" + this.rentCycleId + ", rentalVal=" + this.rentalVal + ", bundleFlag=" + this.bundleFlag + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", discountValue=" + this.discountValue + ", discountExpiry=" + this.discountExpiry + ", status=" + this.status + ", statusDetail=" + this.statusDetail + ", additionalInfo=" + this.additionalInfo + ", category=" + this.category + ", sponsorNum=" + this.sponsorNum + ", sponsorPayOnly=" + this.sponsorPayOnly + ", sponsorPercent=" + this.sponsorPercent + ", purchaseAllowed=" + this.purchaseAllowed + ", oneOffOffering=" + this.oneOffOffering + ")";
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.serviceCode);
        dest.writeString(this.offerInfo);
        dest.writeString(this.parentOfferingId);
        dest.writeString(this.offeringId);
        dest.writeString(this.offeringCode);
        List<OfferingDetails> list = this.offeringDetails;
        if (list == null) {
            int i4 = component1 + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<OfferingDetails> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
                int i6 = component1 + 23;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        dest.writeString(this.purchaseSeq);
        dest.writeString(this.rentCycleId);
        dest.writeString(this.rentalVal);
        dest.writeString(this.bundleFlag);
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.discountValue);
        dest.writeString(this.discountExpiry);
        dest.writeString(this.status);
        dest.writeString(this.statusDetail);
        dest.writeString(this.additionalInfo);
        dest.writeString(this.category);
        dest.writeString(this.sponsorNum);
        dest.writeString(this.sponsorPayOnly);
        dest.writeString(this.sponsorPercent);
        Boolean bool = this.purchaseAllowed;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        OneOffOffering oneOffOffering = this.oneOffOffering;
        if (oneOffOffering == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            oneOffOffering.writeToParcel(dest, flags);
        }
    }
}
