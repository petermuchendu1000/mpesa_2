package com.huawei.digitalpayment.consumer.base.database.entities.neobundles.relation;

import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/relation/NeoProductFullDetails;", "", "product", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;", "subOfferings", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/relation/NeoSubOfferingWithTypes;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;Ljava/util/List;)V", "getProduct", "()Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;", "getSubOfferings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NeoProductFullDetails {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final List<NeoSubOfferingWithTypes> component3;
    private final NeoProductEntity copydefault;

    public NeoProductFullDetails(NeoProductEntity neoProductEntity, List<NeoSubOfferingWithTypes> list) {
        Intrinsics.checkNotNullParameter(neoProductEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = neoProductEntity;
        this.component3 = list;
    }

    public final NeoProductEntity getProduct() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final List<NeoSubOfferingWithTypes> getSubOfferings() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NeoProductFullDetails copy$default(NeoProductFullDetails neoProductFullDetails, NeoProductEntity neoProductEntity, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 33;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            neoProductEntity = neoProductFullDetails.copydefault;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 23;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                List<NeoSubOfferingWithTypes> list2 = neoProductFullDetails.component3;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = neoProductFullDetails.component3;
        }
        NeoProductFullDetails neoProductFullDetailsCopy = neoProductFullDetails.copy(neoProductEntity, list);
        int i6 = ShareDataUIState + 37;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return neoProductFullDetailsCopy;
    }

    public final NeoProductEntity component1() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        NeoProductEntity neoProductEntity = this.copydefault;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return neoProductEntity;
    }

    public final List<NeoSubOfferingWithTypes> component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<NeoSubOfferingWithTypes> list = this.component3;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final NeoProductFullDetails copy(NeoProductEntity product, List<NeoSubOfferingWithTypes> subOfferings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(product, "");
        Intrinsics.checkNotNullParameter(subOfferings, "");
        NeoProductFullDetails neoProductFullDetails = new NeoProductFullDetails(product, subOfferings);
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return neoProductFullDetails;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof NeoProductFullDetails) {
            NeoProductFullDetails neoProductFullDetails = (NeoProductFullDetails) other;
            return !(Intrinsics.areEqual(this.copydefault, neoProductFullDetails.copydefault) ^ true) && Intrinsics.areEqual(this.component3, neoProductFullDetails.component3);
        }
        int i5 = i2 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 23;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.copydefault.hashCode() * 31) + this.component3.hashCode();
        int i4 = ShareDataUIState + 37;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NeoProductFullDetails(product=" + this.copydefault + ", subOfferings=" + this.component3 + ")";
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
