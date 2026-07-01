package com.huawei.digitalpayment.consumer.base.database.entities.country;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CarrierEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "countryId", "code", "", "name", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getCountryId", "getCode", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CarrierEntity {
    private static int component3 = 0;
    private static int component4 = 1;
    private final String ShareDataUIState;
    private final int component1;
    private final int component2;
    private final String copydefault;

    public CarrierEntity(int i, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = i;
        this.component1 = i2;
        this.copydefault = str;
        this.ShareDataUIState = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CarrierEntity(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = component4 + 7;
            int i5 = i4 % 128;
            component3 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 123;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(i, i2, str, str2);
    }

    public final int getId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 49;
        int i4 = i3 % 128;
        component4 = i4;
        if (i3 % 2 == 0) {
            i = this.component2;
            int i5 = 37 / 0;
        } else {
            i = this.component2;
        }
        int i6 = i4 + 19;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return i;
    }

    public final int getCountryId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 115;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 1;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static CarrierEntity copy$default(CarrierEntity carrierEntity, int i, int i2, String str, String str2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = component3;
        int i6 = i5 + 65;
        component4 = i6 % 128;
        if (i6 % 2 != 0 ? (i3 & 1) != 0 : (i3 & 1) != 0) {
            i = carrierEntity.component2;
        }
        if ((i3 & 2) != 0) {
            i2 = carrierEntity.component1;
        }
        if ((i3 & 4) != 0) {
            str = carrierEntity.copydefault;
        }
        if ((i3 & 8) != 0) {
            int i7 = i5 + 65;
            component4 = i7 % 128;
            if (i7 % 2 == 0) {
                String str3 = carrierEntity.ShareDataUIState;
                throw null;
            }
            str2 = carrierEntity.ShareDataUIState;
        }
        return carrierEntity.copy(i, i2, str, str2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component4 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 43;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component4 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.component1;
        int i5 = i3 + 15;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 15;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final CarrierEntity copy(int id, int countryId, String code, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        Intrinsics.checkNotNullParameter(name, "");
        CarrierEntity carrierEntity = new CarrierEntity(id, countryId, code, name);
        int i2 = component3 + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return carrierEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof CarrierEntity) {
            CarrierEntity carrierEntity = (CarrierEntity) other;
            return this.component2 == carrierEntity.component2 && this.component1 == carrierEntity.component1 && Intrinsics.areEqual(this.copydefault, carrierEntity.copydefault) && Intrinsics.areEqual(this.ShareDataUIState, carrierEntity.ShareDataUIState);
        }
        int i4 = component4 + 23;
        component3 = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.component2) * 31) + Integer.hashCode(this.component1)) * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode();
        int i4 = component3 + 123;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CarrierEntity(id=" + this.component2 + ", countryId=" + this.component1 + ", code=" + this.copydefault + ", name=" + this.ShareDataUIState + ")";
        int i2 = component4 + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
