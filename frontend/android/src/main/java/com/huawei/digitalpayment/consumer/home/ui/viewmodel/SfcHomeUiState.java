package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/viewmodel/SfcHomeUiState;", "", "functions", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "<init>", "(Ljava/util/List;)V", "getFunctions", "()Ljava/util/List;", "setFunctions", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcHomeUiState {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private List<SFCLocalHomeFunction> ShareDataUIState;

    public SfcHomeUiState(List<SFCLocalHomeFunction> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SfcHomeUiState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = copydefault + 113;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(list);
    }

    public final List<SFCLocalHomeFunction> getFunctions() {
        List<SFCLocalHomeFunction> list;
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            list = this.ShareDataUIState;
            int i4 = 50 / 0;
        } else {
            list = this.ShareDataUIState;
        }
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setFunctions(List<SFCLocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = list;
        int i4 = copydefault + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 109;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SfcHomeUiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SfcHomeUiState copy$default(SfcHomeUiState sfcHomeUiState, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 125;
        component1 = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            int i6 = i3 + 119;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                List<SFCLocalHomeFunction> list2 = sfcHomeUiState.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = sfcHomeUiState.ShareDataUIState;
        }
        return sfcHomeUiState.copy(list);
    }

    public final List<SFCLocalHomeFunction> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SfcHomeUiState copy(List<SFCLocalHomeFunction> functions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functions, "");
        SfcHomeUiState sfcHomeUiState = new SfcHomeUiState(functions);
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return sfcHomeUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 75;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SfcHomeUiState)) {
            int i7 = copydefault + 53;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.ShareDataUIState, ((SfcHomeUiState) other).ShareDataUIState))) {
            return true;
        }
        int i9 = component1 + 87;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.ShareDataUIState.hashCode();
        int i4 = component1 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SfcHomeUiState(functions=" + this.ShareDataUIState + ")";
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
