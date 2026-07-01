package com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÇ\u0001¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0003H\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u0003H×\u0001J\t\u0010#\u001a\u00020\u0005H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003H\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/blivebundles/model/BLiveProduct;", "Landroid/os/Parcelable;", "offerId", "", "offerName", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "ussdPriority", "offers", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/blivebundles/model/BLiveOffer;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getOfferId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOfferName", "()Ljava/lang/String;", "getCategory", "getUssdPriority", "getOffers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/blivebundles/model/BLiveProduct;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLiveProduct implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BLiveProduct> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("offerId")
    private final Integer offerId;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("dynCvmSubOffers")
    private final List<BLiveOffer> offers;

    @SerializedName("ussdPriority")
    private final Integer ussdPriority;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BLiveProduct> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct createFromParcel(android.os.Parcel r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.copydefault
                int r1 = r1 + 115
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.component2 = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                r4 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
                if (r1 != 0) goto L1f
                int r1 = r12.readInt()
                r3 = 43
                int r3 = r3 / r2
                if (r1 != 0) goto L27
                goto L25
            L1f:
                int r1 = r12.readInt()
                if (r1 != 0) goto L27
            L25:
                r6 = r4
                goto L39
            L27:
                int r1 = r12.readInt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.component2
                int r3 = r3 + 21
                int r5 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.copydefault = r5
                int r3 = r3 % r0
                r6 = r1
            L39:
                java.lang.String r7 = r12.readString()
                java.lang.String r8 = r12.readString()
                int r1 = r12.readInt()
                if (r1 != 0) goto L52
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.copydefault
                int r1 = r1 + 69
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.component2 = r3
                int r1 = r1 % r0
                r9 = r4
                goto L5b
            L52:
                int r1 = r12.readInt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r9 = r1
            L5b:
                int r1 = r12.readInt()
                if (r1 != 0) goto L62
                goto L9e
            L62:
                int r1 = r12.readInt()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r1)
                int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.copydefault
                int r3 = r3 + 119
                int r5 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.component2 = r5
                int r3 = r3 % r0
                if (r3 != 0) goto L79
                r3 = 4
                int r3 = r3 / 5
            L79:
                if (r2 == r1) goto L9e
                int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.component2
                int r3 = r3 + 51
                int r5 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.copydefault = r5
                int r3 = r3 % r0
                if (r3 == 0) goto L92
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer> r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r12)
                r4.add(r3)
                int r2 = r2 + 100
                goto L79
            L92:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer> r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r12)
                r4.add(r3)
                int r2 = r2 + 1
                goto L79
            L9e:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct r12 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct
                r10 = r4
                java.util.List r10 = (java.util.List) r10
                r5 = r12
                r5.<init>(r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveProduct");
        }

        @Override
        public BLiveProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 59;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BLiveProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 85;
            component2 = i3 % 128;
            BLiveProduct[] bLiveProductArr = new BLiveProduct[i];
            if (i3 % 2 != 0) {
                return bLiveProductArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BLiveProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 9;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BLiveProduct[] bLiveProductArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 26 / 0;
            }
            return bLiveProductArrNewArray;
        }
    }

    public BLiveProduct(Integer num, String str, String str2, Integer num2, List<BLiveOffer> list) {
        this.offerId = num;
        this.offerName = str;
        this.category = str2;
        this.ussdPriority = num2;
        this.offers = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BLiveProduct(Integer num, String str, String str2, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        String str4;
        Integer num3;
        List list2 = null;
        if ((i & 1) != 0) {
            int i2 = component1 + 17;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            num = null;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 73;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            int i6 = component3 + 61;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            int i7 = component3 + 19;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            num3 = null;
        } else {
            num3 = num2;
        }
        if ((i & 16) != 0) {
            int i8 = component3 + 111;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            list2 = list;
        }
        this(num, str3, str4, num3, list2);
    }

    public final Integer getOfferId() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.offerId;
        int i4 = i3 + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getUssdPriority() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.ussdPriority;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BLiveOffer> getOffers() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 19;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public BLiveProduct() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BLiveProduct copy$default(BLiveProduct bLiveProduct, Integer num, String str, String str2, Integer num2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            num = bLiveProduct.offerId;
        }
        Integer num3 = num;
        if ((i & 2) != 0) {
            str = bLiveProduct.offerName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            int i3 = component3 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str2 = bLiveProduct.category;
            if (i4 != 0) {
                int i5 = 93 / 0;
            }
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            int i6 = component1 + 113;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                Integer num4 = bLiveProduct.ussdPriority;
                throw null;
            }
            num2 = bLiveProduct.ussdPriority;
        }
        Integer num5 = num2;
        if ((i & 16) != 0) {
            list = bLiveProduct.offers;
        }
        return bLiveProduct.copy(num3, str3, str4, num5, list);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.offerId;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.offerName;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.ussdPriority;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final List<BLiveOffer> component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<BLiveOffer> list = this.offers;
        int i4 = i2 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final BLiveProduct copy(Integer offerId, String offerName, String category, Integer ussdPriority, List<BLiveOffer> offers) {
        int i = 2 % 2;
        BLiveProduct bLiveProduct = new BLiveProduct(offerId, offerName, category, ussdPriority, offers);
        int i2 = component1 + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return bLiveProduct;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BLiveProduct)) {
            int i2 = component1 + 63;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BLiveProduct bLiveProduct = (BLiveProduct) other;
        if (!Intrinsics.areEqual(this.offerId, bLiveProduct.offerId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, bLiveProduct.offerName)) {
            int i3 = component3 + 69;
            component1 = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.category, bLiveProduct.category)) {
            int i4 = component1 + 37;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ussdPriority, bLiveProduct.ussdPriority)) {
            int i6 = component3 + 99;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.offers, bLiveProduct.offers)) {
            int i8 = component3 + 47;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = component3 + 105;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.offerId;
        int iHashCode3 = 1;
        int iHashCode4 = 0;
        if (num == null) {
            int i5 = i3 + 19;
            component1 = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
            int i6 = i3 + 67;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode = num.hashCode();
        }
        String str = this.offerName;
        if (str == null) {
            int i8 = component1 + 119;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str.hashCode();
        }
        String str2 = this.category;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.ussdPriority;
        if (num2 == null) {
            int i9 = component3 + 21;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        List<BLiveOffer> list = this.offers;
        if (list != null) {
            iHashCode4 = list.hashCode();
            int i11 = component1 + 95;
            component3 = i11 % 128;
            int i12 = i11 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BLiveProduct(offerId=" + this.offerId + ", offerName=" + this.offerName + ", category=" + this.category + ", ussdPriority=" + this.ussdPriority + ", offers=" + this.offers + ")";
        int i2 = component1 + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        Integer num = this.offerId;
        if (num == null) {
            dest.writeInt(0);
            int i2 = component1 + 109;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 5;
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.offerName);
        dest.writeString(this.category);
        Integer num2 = this.ussdPriority;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        List<BLiveOffer> list = this.offers;
        if (list == null) {
            int i4 = component1 + 81;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
            int i6 = component1 + 89;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<BLiveOffer> it = list.iterator();
        int i8 = component3 + 33;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
