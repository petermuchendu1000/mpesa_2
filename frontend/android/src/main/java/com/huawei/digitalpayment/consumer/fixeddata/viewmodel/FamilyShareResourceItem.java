package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareResourceItem;", "", "amount", "", "unit", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getUnit", "getCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareResourceItem {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final String component2;
    private final String copydefault;

    public FamilyShareResourceItem(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = str;
        this.component2 = str2;
        this.copydefault = str3;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 77;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 11;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 125;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 33;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 91;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyShareResourceItem copy$default(FamilyShareResourceItem familyShareResourceItem, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = familyShareResourceItem.ShareDataUIState;
            int i3 = getAsAtTimestamp + 39;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str2 = familyShareResourceItem.component2;
        }
        if ((i & 4) != 0) {
            int i5 = getAsAtTimestamp + 121;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                String str4 = familyShareResourceItem.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = familyShareResourceItem.copydefault;
        }
        FamilyShareResourceItem familyShareResourceItemCopy = familyShareResourceItem.copy(str, str2, str3);
        int i6 = equals + 13;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return familyShareResourceItemCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 15;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 77;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 115;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FamilyShareResourceItem copy(String amount, String unit, String code) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(code, "");
        FamilyShareResourceItem familyShareResourceItem = new FamilyShareResourceItem(amount, unit, code);
        int i2 = getAsAtTimestamp + 111;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return familyShareResourceItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals + 103;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyShareResourceItem)) {
            return false;
        }
        FamilyShareResourceItem familyShareResourceItem = (FamilyShareResourceItem) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, familyShareResourceItem.ShareDataUIState)) {
            int i4 = equals + 37;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, familyShareResourceItem.component2)) {
            int i6 = getAsAtTimestamp + 9;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, familyShareResourceItem.copydefault)) {
            return true;
        }
        int i8 = getAsAtTimestamp + 19;
        equals = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        equals = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.ShareDataUIState.hashCode() - 72) >> this.component2.hashCode()) / 103) >>> this.copydefault.hashCode() : (((this.ShareDataUIState.hashCode() * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode();
        int i3 = equals + 97;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareResourceItem(amount=" + this.ShareDataUIState + ", unit=" + this.component2 + ", code=" + this.copydefault + ")";
        int i2 = getAsAtTimestamp + 55;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
