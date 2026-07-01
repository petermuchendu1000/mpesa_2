package com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;", "", "subOfferingId", "", "parentProductCategory", "", "productRange", "rentalFee", "productRangeMin", "productRangeMax", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubOfferingId", "()J", "getParentProductCategory", "()Ljava/lang/String;", "getProductRange", "getRentalFee", "getProductRangeMin", "getProductRangeMax", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NeoSubOfferingEntity {
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;
    private final long getRequestBeneficiariesState;

    public NeoSubOfferingEntity(long j, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.getRequestBeneficiariesState = j;
        this.component3 = str;
        this.component2 = str2;
        this.component1 = str3;
        this.copydefault = str4;
        this.ShareDataUIState = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NeoSubOfferingEntity(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 115;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            j2 = 0;
        } else {
            j2 = j;
        }
        this(j2, str, str2, str3, str4, str5);
    }

    public final long getSubOfferingId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 65;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.getRequestBeneficiariesState;
        int i5 = i2 + 97;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String getParentProductCategory() {
        int i = 2 % 2;
        int i2 = component4 + 9;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 21;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductRange() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 77;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final String getRentalFee() {
        int i = 2 % 2;
        int i2 = component4 + 103;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final String getProductRangeMin() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 69;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 87;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductRangeMax() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public static NeoSubOfferingEntity copy$default(NeoSubOfferingEntity neoSubOfferingEntity, long j, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        int i2 = 2 % 2;
        long j2 = (i & 1) != 0 ? neoSubOfferingEntity.getRequestBeneficiariesState : j;
        String str8 = (i & 2) != 0 ? neoSubOfferingEntity.component3 : str;
        if ((i & 4) != 0) {
            int i3 = getAsAtTimestamp + 1;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            str6 = neoSubOfferingEntity.component2;
        } else {
            str6 = str2;
        }
        if ((i & 8) != 0) {
            int i5 = getAsAtTimestamp + 37;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                String str9 = neoSubOfferingEntity.component1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str7 = neoSubOfferingEntity.component1;
        } else {
            str7 = str3;
        }
        return neoSubOfferingEntity.copy(j2, str8, str6, str7, (i & 16) != 0 ? neoSubOfferingEntity.copydefault : str4, (i & 32) != 0 ? neoSubOfferingEntity.ShareDataUIState : str5);
    }

    public final long component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.getRequestBeneficiariesState;
        int i5 = i2 + 81;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 115;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 33;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 47;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 69;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final NeoSubOfferingEntity copy(long subOfferingId, String parentProductCategory, String productRange, String rentalFee, String productRangeMin, String productRangeMax) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parentProductCategory, "");
        Intrinsics.checkNotNullParameter(productRange, "");
        Intrinsics.checkNotNullParameter(rentalFee, "");
        Intrinsics.checkNotNullParameter(productRangeMin, "");
        Intrinsics.checkNotNullParameter(productRangeMax, "");
        NeoSubOfferingEntity neoSubOfferingEntity = new NeoSubOfferingEntity(subOfferingId, parentProductCategory, productRange, rentalFee, productRangeMin, productRangeMax);
        int i2 = getAsAtTimestamp + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return neoSubOfferingEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4 + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeoSubOfferingEntity)) {
            return false;
        }
        NeoSubOfferingEntity neoSubOfferingEntity = (NeoSubOfferingEntity) other;
        if (this.getRequestBeneficiariesState != neoSubOfferingEntity.getRequestBeneficiariesState || (!Intrinsics.areEqual(this.component3, neoSubOfferingEntity.component3)) || (!Intrinsics.areEqual(this.component2, neoSubOfferingEntity.component2)) || !Intrinsics.areEqual(this.component1, neoSubOfferingEntity.component1)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.copydefault, neoSubOfferingEntity.copydefault))) {
            return Intrinsics.areEqual(this.ShareDataUIState, neoSubOfferingEntity.ShareDataUIState);
        }
        int i3 = component4 + 101;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.getRequestBeneficiariesState) * 31) + this.component3.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode();
        int i4 = getAsAtTimestamp + 77;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NeoSubOfferingEntity(subOfferingId=" + this.getRequestBeneficiariesState + ", parentProductCategory=" + this.component3 + ", productRange=" + this.component2 + ", rentalFee=" + this.component1 + ", productRangeMin=" + this.copydefault + ", productRangeMax=" + this.ShareDataUIState + ")";
        int i2 = component4 + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
