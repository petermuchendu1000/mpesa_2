package com.huawei.digitalpayment.consumer.base.database.entities.country;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CurrencyEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "countryId", "iso", "", "name", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getCountryId", "getIso", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurrencyEntity {
    private static int component4 = 1;
    private static int copydefault;
    private final String ShareDataUIState;
    private final int component1;
    private final int component2;
    private final String component3;

    public CurrencyEntity(int i, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = i;
        this.component1 = i2;
        this.component3 = str;
        this.ShareDataUIState = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CurrencyEntity(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = copydefault + 69;
            int i5 = i4 % 128;
            component4 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 97;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i = 0;
        }
        this(i, i2, str, str2);
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 97;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getCountryId() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.component1;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getIso() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component4 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    public static CurrencyEntity copy$default(CurrencyEntity currencyEntity, int i, int i2, String str, String str2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = component4 + 125;
        int i6 = i5 % 128;
        copydefault = i6;
        int i7 = i5 % 2;
        Object obj2 = null;
        if ((i3 & 1) != 0) {
            int i8 = i6 + 29;
            component4 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = currencyEntity.component2;
                throw null;
            }
            i = currencyEntity.component2;
        }
        if ((i3 & 2) != 0) {
            i2 = currencyEntity.component1;
        }
        if ((i3 & 4) != 0) {
            int i10 = i6 + 101;
            int i11 = i10 % 128;
            component4 = i11;
            if (i10 % 2 == 0) {
                String str3 = currencyEntity.component3;
                obj2.hashCode();
                throw null;
            }
            String str4 = currencyEntity.component3;
            int i12 = i11 + 53;
            copydefault = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 % 2;
            }
            str = str4;
        }
        if ((i3 & 8) != 0) {
            str2 = currencyEntity.ShareDataUIState;
            int i14 = component4 + 103;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
        }
        return currencyEntity.copy(i, i2, str, str2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component4 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.component2;
        int i6 = i3 + 87;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 19;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 37;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final CurrencyEntity copy(int id, int countryId, String iso, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iso, "");
        Intrinsics.checkNotNullParameter(name, "");
        CurrencyEntity currencyEntity = new CurrencyEntity(id, countryId, iso, name);
        int i2 = component4 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return currencyEntity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyEntity)) {
            return false;
        }
        CurrencyEntity currencyEntity = (CurrencyEntity) other;
        if (this.component2 != currencyEntity.component2) {
            return false;
        }
        if (this.component1 != currencyEntity.component1) {
            int i2 = component4 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, currencyEntity.component3)) {
            int i4 = copydefault + 83;
            component4 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.ShareDataUIState, currencyEntity.ShareDataUIState))) {
            return true;
        }
        int i5 = copydefault + 97;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component4 = i2 % 128;
        return i2 % 2 == 0 ? (((((r0 + 22) + Integer.hashCode(this.component1)) - 109) - this.component3.hashCode()) / 19) / this.ShareDataUIState.hashCode() : (((((Integer.hashCode(this.component2) * 31) + Integer.hashCode(this.component1)) * 31) + this.component3.hashCode()) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CurrencyEntity(id=" + this.component2 + ", countryId=" + this.component1 + ", iso=" + this.component3 + ", name=" + this.ShareDataUIState + ")";
        int i2 = copydefault + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
