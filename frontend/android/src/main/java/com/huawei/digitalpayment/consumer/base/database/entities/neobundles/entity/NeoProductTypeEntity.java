package com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductTypeEntity;", "", "productId", "", "parentSubOfferingId", "", "productTypes", "autoRenew", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Z)V", "getProductId", "()Ljava/lang/String;", "getParentSubOfferingId", "()J", "getProductTypes", "getAutoRenew", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NeoProductTypeEntity {
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private final String ShareDataUIState;
    private final long component1;
    private final String component2;
    private final boolean component3;

    public NeoProductTypeEntity(String str, long j, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = str;
        this.component1 = j;
        this.ShareDataUIState = str2;
        this.component3 = z;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final long getParentSubOfferingId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component1;
        int i5 = i2 + 47;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String getProductTypes() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final boolean getAutoRenew() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public static NeoProductTypeEntity copy$default(NeoProductTypeEntity neoProductTypeEntity, String str, long j, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 75;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 31;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = neoProductTypeEntity.component2;
                throw null;
            }
            str = neoProductTypeEntity.component2;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            j = neoProductTypeEntity.component1;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            int i6 = copydefault + 77;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            str2 = neoProductTypeEntity.ShareDataUIState;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            int i8 = copydefault + 69;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            z = neoProductTypeEntity.component3;
            if (i9 == 0) {
                int i10 = 99 / 0;
            }
        }
        NeoProductTypeEntity neoProductTypeEntityCopy = neoProductTypeEntity.copy(str4, j2, str5, z);
        int i11 = getAsAtTimestamp + 109;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return neoProductTypeEntityCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component1;
        int i5 = i2 + 105;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 111;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final NeoProductTypeEntity copy(String productId, long parentSubOfferingId, String productTypes, boolean autoRenew) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productTypes, "");
        NeoProductTypeEntity neoProductTypeEntity = new NeoProductTypeEntity(productId, parentSubOfferingId, productTypes, autoRenew);
        int i2 = getAsAtTimestamp + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return neoProductTypeEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeoProductTypeEntity)) {
            int i5 = i3 + 13;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        NeoProductTypeEntity neoProductTypeEntity = (NeoProductTypeEntity) other;
        if (!Intrinsics.areEqual(this.component2, neoProductTypeEntity.component2)) {
            int i7 = copydefault + 5;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.component1 != neoProductTypeEntity.component1) {
            int i9 = copydefault + 37;
            getAsAtTimestamp = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, neoProductTypeEntity.ShareDataUIState)) {
            return false;
        }
        if (this.component3 == neoProductTypeEntity.component3) {
            return true;
        }
        int i10 = getAsAtTimestamp + 41;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        copydefault = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.component2.hashCode() - 82) >>> Long.hashCode(this.component1)) >> 24) >> this.ShareDataUIState.hashCode()) * 38) << Boolean.hashCode(this.component3) : (((((this.component2.hashCode() * 31) + Long.hashCode(this.component1)) * 31) + this.ShareDataUIState.hashCode()) * 31) + Boolean.hashCode(this.component3);
        int i3 = getAsAtTimestamp + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NeoProductTypeEntity(productId=" + this.component2 + ", parentSubOfferingId=" + this.component1 + ", productTypes=" + this.ShareDataUIState + ", autoRenew=" + this.component3 + ")";
        int i2 = copydefault + 121;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
