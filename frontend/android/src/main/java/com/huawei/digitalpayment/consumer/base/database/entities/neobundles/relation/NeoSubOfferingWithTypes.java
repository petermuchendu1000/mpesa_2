package com.huawei.digitalpayment.consumer.base.database.entities.neobundles.relation;

import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductTypeEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoSubOfferingEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/relation/NeoSubOfferingWithTypes;", "", "subOffering", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;", "productTypes", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductTypeEntity;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;Ljava/util/List;)V", "getSubOffering", "()Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;", "getProductTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NeoSubOfferingWithTypes {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final NeoSubOfferingEntity ShareDataUIState;
    private final List<NeoProductTypeEntity> component1;

    public NeoSubOfferingWithTypes(NeoSubOfferingEntity neoSubOfferingEntity, List<NeoProductTypeEntity> list) {
        Intrinsics.checkNotNullParameter(neoSubOfferingEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = neoSubOfferingEntity;
        this.component1 = list;
    }

    public final NeoSubOfferingEntity getSubOffering() {
        NeoSubOfferingEntity neoSubOfferingEntity;
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            neoSubOfferingEntity = this.ShareDataUIState;
            int i4 = 78 / 0;
        } else {
            neoSubOfferingEntity = this.ShareDataUIState;
        }
        int i5 = i3 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return neoSubOfferingEntity;
    }

    public final List<NeoProductTypeEntity> getProductTypes() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<NeoProductTypeEntity> list = this.component1;
        int i4 = i2 + 109;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NeoSubOfferingWithTypes copy$default(NeoSubOfferingWithTypes neoSubOfferingWithTypes, NeoSubOfferingEntity neoSubOfferingEntity, List list, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component2 + 31;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                NeoSubOfferingEntity neoSubOfferingEntity2 = neoSubOfferingWithTypes.ShareDataUIState;
                throw null;
            }
            neoSubOfferingEntity = neoSubOfferingWithTypes.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 81;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                List<NeoProductTypeEntity> list2 = neoSubOfferingWithTypes.component1;
                obj2.hashCode();
                throw null;
            }
            list = neoSubOfferingWithTypes.component1;
        }
        return neoSubOfferingWithTypes.copy(neoSubOfferingEntity, list);
    }

    public final NeoSubOfferingEntity component1() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final List<NeoProductTypeEntity> component2() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<NeoProductTypeEntity> list = this.component1;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return list;
    }

    public final NeoSubOfferingWithTypes copy(NeoSubOfferingEntity subOffering, List<NeoProductTypeEntity> productTypes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(subOffering, "");
        Intrinsics.checkNotNullParameter(productTypes, "");
        NeoSubOfferingWithTypes neoSubOfferingWithTypes = new NeoSubOfferingWithTypes(subOffering, productTypes);
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return neoSubOfferingWithTypes;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeoSubOfferingWithTypes)) {
            return false;
        }
        NeoSubOfferingWithTypes neoSubOfferingWithTypes = (NeoSubOfferingWithTypes) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, neoSubOfferingWithTypes.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, neoSubOfferingWithTypes.component1)) {
            int i2 = copydefault + 43;
            int i3 = i2 % 128;
            component2 = i3;
            z = i2 % 2 != 0;
            int i4 = i3 + 53;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode();
        int i4 = component2 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NeoSubOfferingWithTypes(subOffering=" + this.ShareDataUIState + ", productTypes=" + this.component1 + ")";
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
