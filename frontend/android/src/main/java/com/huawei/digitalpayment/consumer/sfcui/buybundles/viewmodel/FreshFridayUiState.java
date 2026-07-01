package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FreshFridayUiState;", "", "offers", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridayResp;", "isAvailable", "", "<init>", "(Ljava/util/List;Z)V", "getOffers", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshFridayUiState {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copy = 1;
    private final boolean component3;
    private final List<FreshFridayResp> copydefault;

    public FreshFridayUiState(List<FreshFridayResp> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.component3 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FreshFridayUiState(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 21;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 31;
            copy = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        this(list, z);
    }

    public final List<FreshFridayResp> getOffers() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<FreshFridayResp> list = this.copydefault;
        int i5 = i2 + 67;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isAvailable() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 79;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FreshFridayUiState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FreshFridayUiState copy$default(FreshFridayUiState freshFridayUiState, List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = freshFridayUiState.copydefault;
            int i3 = component2 + 103;
            copy = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            z = freshFridayUiState.component3;
        }
        FreshFridayUiState freshFridayUiStateCopy = freshFridayUiState.copy(list, z);
        int i5 = component2 + 97;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return freshFridayUiStateCopy;
    }

    public final List<FreshFridayResp> component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<FreshFridayResp> list = this.copydefault;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 23;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final FreshFridayUiState copy(List<FreshFridayResp> offers, boolean isAvailable) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(offers, "");
        FreshFridayUiState freshFridayUiState = new FreshFridayUiState(offers, isAvailable);
        int i2 = component2 + 27;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return freshFridayUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FreshFridayUiState)) {
            return false;
        }
        FreshFridayUiState freshFridayUiState = (FreshFridayUiState) other;
        if (!Intrinsics.areEqual(this.copydefault, freshFridayUiState.copydefault)) {
            return false;
        }
        if (this.component3 == freshFridayUiState.component3) {
            return true;
        }
        int i4 = copy + 53;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 113;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.copydefault.hashCode();
        return i3 == 0 ? (iHashCode << 20) * Boolean.hashCode(this.component3) : (iHashCode * 31) + Boolean.hashCode(this.component3);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FreshFridayUiState(offers=" + this.copydefault + ", isAvailable=" + this.component3 + ")";
        int i2 = component2 + 69;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
