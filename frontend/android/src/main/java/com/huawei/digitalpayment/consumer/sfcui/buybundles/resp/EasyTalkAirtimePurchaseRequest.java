package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÇ\u0001J\b\u0010\u001f\u001a\u00020 H\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020 H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkAirtimePurchaseRequest;", "Landroid/os/Parcelable;", "partyAMsisdn", "", "partyBMsisdn", "offeringId", "offerPrice", "cellId", "offerName", "gsmResource", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkGsmResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPartyAMsisdn", "()Ljava/lang/String;", "getPartyBMsisdn", "getOfferingId", "getOfferPrice", "getCellId", "getOfferName", "getGsmResource", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkAirtimePurchaseRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EasyTalkAirtimePurchaseRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("cellId")
    private final String cellId;

    @SerializedName("gsmResource")
    private final List<EasyTalkGsmResource> gsmResource;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("offerPrice")
    private final String offerPrice;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EasyTalkAirtimePurchaseRequest> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkAirtimePurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = copydefault + 11;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(EasyTalkGsmResource.CREATOR.createFromParcel(parcel));
                    i3 += 18;
                } else {
                    arrayList.add(EasyTalkGsmResource.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            EasyTalkAirtimePurchaseRequest easyTalkAirtimePurchaseRequest = new EasyTalkAirtimePurchaseRequest(string, string2, string3, string4, string5, string6, arrayList);
            int i5 = component1 + 89;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return easyTalkAirtimePurchaseRequest;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public EasyTalkAirtimePurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 107;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            EasyTalkAirtimePurchaseRequest easyTalkAirtimePurchaseRequestCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 115;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return easyTalkAirtimePurchaseRequestCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkAirtimePurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            EasyTalkAirtimePurchaseRequest[] easyTalkAirtimePurchaseRequestArr = new EasyTalkAirtimePurchaseRequest[i];
            int i6 = i3 + 113;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 94 / 0;
            }
            return easyTalkAirtimePurchaseRequestArr;
        }

        @Override
        public EasyTalkAirtimePurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 83;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            EasyTalkAirtimePurchaseRequest[] easyTalkAirtimePurchaseRequestArrNewArray = newArray(i);
            int i5 = copydefault + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return easyTalkAirtimePurchaseRequestArrNewArray;
        }
    }

    public EasyTalkAirtimePurchaseRequest(String str, String str2, String str3, String str4, String str5, String str6, List<EasyTalkGsmResource> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.partyAMsisdn = str;
        this.partyBMsisdn = str2;
        this.offeringId = str3;
        this.offerPrice = str4;
        this.cellId = str5;
        this.offerName = str6;
        this.gsmResource = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EasyTalkAirtimePurchaseRequest(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        List listEmptyList;
        if ((i & 64) != 0) {
            int i2 = ShareDataUIState + 59;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i3 = 18 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            int i4 = ShareDataUIState + 59;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            list2 = listEmptyList;
        } else {
            list2 = list;
        }
        this(str, str2, str3, str4, str5, str6, list2);
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.partyAMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.partyBMsisdn;
        int i4 = i2 + 105;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return str;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.offeringId;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferPrice() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.offerPrice;
            int i4 = 84 / 0;
        } else {
            str = this.offerPrice;
        }
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCellId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cellId;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.offerName;
        int i4 = i3 + 33;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<EasyTalkGsmResource> getGsmResource() {
        List<EasyTalkGsmResource> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            list = this.gsmResource;
            int i4 = 61 / 0;
        } else {
            list = this.gsmResource;
        }
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = copydefault + 113;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EasyTalkAirtimePurchaseRequest copy$default(EasyTalkAirtimePurchaseRequest easyTalkAirtimePurchaseRequest, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? easyTalkAirtimePurchaseRequest.partyAMsisdn : str;
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 57;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str7 = easyTalkAirtimePurchaseRequest.partyBMsisdn;
        } else {
            str7 = str2;
        }
        String str12 = (i & 4) != 0 ? easyTalkAirtimePurchaseRequest.offeringId : str3;
        if ((i & 8) != 0) {
            str8 = easyTalkAirtimePurchaseRequest.offerPrice;
            int i5 = ShareDataUIState + 61;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = component3 + 25;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str9 = easyTalkAirtimePurchaseRequest.cellId;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i9 = ShareDataUIState + 31;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str10 = easyTalkAirtimePurchaseRequest.offerName;
        } else {
            str10 = str6;
        }
        return easyTalkAirtimePurchaseRequest.copy(str11, str7, str12, str8, str9, str10, (i & 64) != 0 ? easyTalkAirtimePurchaseRequest.gsmResource : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.partyAMsisdn;
        int i4 = i3 + 55;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyBMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringId;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerPrice;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cellId;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offerName;
        }
        throw null;
    }

    public final List<EasyTalkGsmResource> component7() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<EasyTalkGsmResource> list = this.gsmResource;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final EasyTalkAirtimePurchaseRequest copy(String partyAMsisdn, String partyBMsisdn, String offeringId, String offerPrice, String cellId, String offerName, List<EasyTalkGsmResource> gsmResource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partyAMsisdn, "");
        Intrinsics.checkNotNullParameter(partyBMsisdn, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(offerPrice, "");
        Intrinsics.checkNotNullParameter(cellId, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(gsmResource, "");
        EasyTalkAirtimePurchaseRequest easyTalkAirtimePurchaseRequest = new EasyTalkAirtimePurchaseRequest(partyAMsisdn, partyBMsisdn, offeringId, offerPrice, cellId, offerName, gsmResource);
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return easyTalkAirtimePurchaseRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 41;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return true;
        }
        if (!(other instanceof EasyTalkAirtimePurchaseRequest)) {
            return false;
        }
        EasyTalkAirtimePurchaseRequest easyTalkAirtimePurchaseRequest = (EasyTalkAirtimePurchaseRequest) other;
        if (!Intrinsics.areEqual(this.partyAMsisdn, easyTalkAirtimePurchaseRequest.partyAMsisdn) || !Intrinsics.areEqual(this.partyBMsisdn, easyTalkAirtimePurchaseRequest.partyBMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offeringId, easyTalkAirtimePurchaseRequest.offeringId)) {
            int i6 = component3 + 57;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.offerPrice, easyTalkAirtimePurchaseRequest.offerPrice)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cellId, easyTalkAirtimePurchaseRequest.cellId)) {
            int i8 = component3 + 117;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, easyTalkAirtimePurchaseRequest.offerName)) {
            int i10 = ShareDataUIState + 97;
            component3 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 20 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.gsmResource, easyTalkAirtimePurchaseRequest.gsmResource)) {
            return false;
        }
        int i12 = ShareDataUIState + 75;
        component3 = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.partyAMsisdn.hashCode() * 31) + this.partyBMsisdn.hashCode()) * 31) + this.offeringId.hashCode()) * 31) + this.offerPrice.hashCode()) * 31) + this.cellId.hashCode()) * 31) + this.offerName.hashCode()) * 31) + this.gsmResource.hashCode();
        int i4 = ShareDataUIState + 123;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkAirtimePurchaseRequest(partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", offeringId=" + this.offeringId + ", offerPrice=" + this.offerPrice + ", cellId=" + this.cellId + ", offerName=" + this.offerName + ", gsmResource=" + this.gsmResource + ")";
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeString(this.offeringId);
        dest.writeString(this.offerPrice);
        dest.writeString(this.cellId);
        dest.writeString(this.offerName);
        List<EasyTalkGsmResource> list = this.gsmResource;
        dest.writeInt(list.size());
        Iterator<EasyTalkGsmResource> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 3;
            }
        }
        int i4 = component3 + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
