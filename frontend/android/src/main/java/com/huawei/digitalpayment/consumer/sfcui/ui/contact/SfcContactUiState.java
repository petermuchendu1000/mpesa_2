package com.huawei.digitalpayment.consumer.sfcui.ui.contact;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/contact/SfcContactUiState;", "", "searchInput", "", "contacts", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/contact/SfcContactListItemUi;", GriverMonitorConstants.KEY_IS_LOADING, "", "showNoResults", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZ)V", "getSearchInput", "()Ljava/lang/String;", "getContacts", "()Ljava/util/List;", "()Z", "getShowNoResults", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcContactUiState {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 93 % 128;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private final boolean ShareDataUIState;
    private final String component1;
    private final boolean component2;
    private final List<SfcContactListItemUi> component3;

    public SfcContactUiState(String str, List<SfcContactListItemUi> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.component1 = str;
        this.component3 = list;
        this.component2 = z;
        this.ShareDataUIState = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SfcContactUiState(String str, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component4;
            int i3 = i2 + 19;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        list = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 4) != 0) {
            int i8 = getAsAtTimestamp + 93;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z = false;
        }
        this(str, list, z, (i & 8) != 0 ? false : z2);
    }

    public final String getSearchInput() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 97;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 63;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final List<SfcContactListItemUi> getContacts() {
        int i = 2 % 2;
        int i2 = component4 + 25;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 81;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getShowNoResults() {
        int i = 2 % 2;
        int i2 = component4 + 73;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 69;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        if (93 % 2 == 0) {
            throw null;
        }
    }

    public SfcContactUiState() {
        this(null, null, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SfcContactUiState copy$default(SfcContactUiState sfcContactUiState, String str, List list, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = sfcContactUiState.component1;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = component4 + 25;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                List<SfcContactListItemUi> list2 = sfcContactUiState.component3;
                throw null;
            }
            list = sfcContactUiState.component3;
        }
        if ((i & 4) != 0) {
            int i4 = getAsAtTimestamp + 91;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z3 = sfcContactUiState.component2;
                obj2.hashCode();
                throw null;
            }
            z = sfcContactUiState.component2;
        }
        if ((i & 8) != 0) {
            z2 = sfcContactUiState.ShareDataUIState;
        }
        SfcContactUiState sfcContactUiStateCopy = sfcContactUiState.copy(str, list, z, z2);
        int i5 = component4 + 77;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return sfcContactUiStateCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 69;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<SfcContactListItemUi> component2() {
        int i = 2 % 2;
        int i2 = component4 + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        List<SfcContactListItemUi> list = this.component3;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return list;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 81;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 91;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        int i3 = i2 % 128;
        component4 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 45;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final SfcContactUiState copy(String searchInput, List<SfcContactListItemUi> contacts, boolean isLoading, boolean showNoResults) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(searchInput, "");
        Intrinsics.checkNotNullParameter(contacts, "");
        SfcContactUiState sfcContactUiState = new SfcContactUiState(searchInput, contacts, isLoading, showNoResults);
        int i2 = getAsAtTimestamp + 5;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return sfcContactUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp + 49;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SfcContactUiState)) {
            int i4 = component4 + 5;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
            return false;
        }
        SfcContactUiState sfcContactUiState = (SfcContactUiState) other;
        if (!Intrinsics.areEqual(this.component1, sfcContactUiState.component1)) {
            int i6 = component4 + 93;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, sfcContactUiState.component3)) {
            return false;
        }
        if (this.component2 != sfcContactUiState.component2) {
            int i8 = getAsAtTimestamp + 39;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.ShareDataUIState == sfcContactUiState.ShareDataUIState) {
            return true;
        }
        int i10 = getAsAtTimestamp + 81;
        component4 = i10 % 128;
        return i10 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        component4 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? ((((this.component1.hashCode() << 116) % this.component3.hashCode()) << 3) - Boolean.hashCode(this.component2)) >>> Boolean.hashCode(this.ShareDataUIState) : (((((this.component1.hashCode() * 31) + this.component3.hashCode()) * 31) + Boolean.hashCode(this.component2)) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i3 = component4 + 69;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SfcContactUiState(searchInput=" + this.component1 + ", contacts=" + this.component3 + ", isLoading=" + this.component2 + ", showNoResults=" + this.ShareDataUIState + ")";
        int i2 = component4 + 3;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
