package com.huawei.digitalpayment.consumer.base.database.entities.country;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryWithDetails;", "", "country", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;", "currencies", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CurrencyEntity;", "carriers", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CarrierEntity;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;Ljava/util/List;Ljava/util/List;)V", "getCountry", "()Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;", "getCurrencies", "()Ljava/util/List;", "getCarriers", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryWithDetails {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final List<CurrencyEntity> component2;
    private final List<CarrierEntity> component3;
    private final CountryEntity copydefault;

    public CountryWithDetails(CountryEntity countryEntity, List<CurrencyEntity> list, List<CarrierEntity> list2) {
        Intrinsics.checkNotNullParameter(countryEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = countryEntity;
        this.component2 = list;
        this.component3 = list2;
    }

    public final CountryEntity getCountry() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        CountryEntity countryEntity = this.copydefault;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return countryEntity;
    }

    public final List<CurrencyEntity> getCurrencies() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<CurrencyEntity> list = this.component2;
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return list;
    }

    public final List<CarrierEntity> getCarriers() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<CarrierEntity> list = this.component3;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CountryWithDetails copy$default(CountryWithDetails countryWithDetails, CountryEntity countryEntity, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 71;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                CountryEntity countryEntity2 = countryWithDetails.copydefault;
                throw null;
            }
            countryEntity = countryWithDetails.copydefault;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 37;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                List<CurrencyEntity> list3 = countryWithDetails.component2;
                throw null;
            }
            list = countryWithDetails.component2;
        }
        if ((i & 4) != 0) {
            list2 = countryWithDetails.component3;
        }
        return countryWithDetails.copy(countryEntity, list, list2);
    }

    public final CountryEntity component1() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CountryEntity countryEntity = this.copydefault;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return countryEntity;
    }

    public final List<CurrencyEntity> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<CurrencyEntity> list = this.component2;
        int i5 = i3 + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<CarrierEntity> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<CarrierEntity> list = this.component3;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CountryWithDetails copy(CountryEntity country, List<CurrencyEntity> currencies, List<CarrierEntity> carriers) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Intrinsics.checkNotNullParameter(currencies, "");
        Intrinsics.checkNotNullParameter(carriers, "");
        CountryWithDetails countryWithDetails = new CountryWithDetails(country, currencies, carriers);
        int i2 = ShareDataUIState + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return countryWithDetails;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof CountryWithDetails)) {
            int i4 = ShareDataUIState + 55;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, ((CountryWithDetails) other).copydefault) && !(!Intrinsics.areEqual(this.component2, r6.component2))) {
            if (!(!Intrinsics.areEqual(this.component3, r6.component3))) {
                return true;
            }
            int i6 = component1 + 125;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.copydefault.hashCode() * 31) + this.component2.hashCode()) * 31) + this.component3.hashCode();
        int i4 = ShareDataUIState + 65;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryWithDetails(country=" + this.copydefault + ", currencies=" + this.component2 + ", carriers=" + this.component3 + ")";
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
