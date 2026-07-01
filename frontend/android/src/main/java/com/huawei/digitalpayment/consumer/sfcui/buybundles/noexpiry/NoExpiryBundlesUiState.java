package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryBundlesUiState;", "", "amountInput", "", FavouriteBundlesService.BUNDLES_PARAM, "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "isAmountInvalid", "", GriverMonitorConstants.KEY_IS_LOADING, "<init>", "(Ljava/lang/String;Ljava/util/List;ZZ)V", "getAmountInput", "()Ljava/lang/String;", "getBundles", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoExpiryBundlesUiState {
    public static final int $stable = 8;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final boolean ShareDataUIState;
    private final List<WithExpiryResp> component1;
    private final boolean component2;
    private final String copydefault;

    public NoExpiryBundlesUiState(String str, List<WithExpiryResp> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.component1 = list;
        this.ShareDataUIState = z;
        this.component2 = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoExpiryBundlesUiState(String str, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 91;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = getAsAtTimestamp + 109;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            int i6 = component4 + 19;
            getAsAtTimestamp = i6 % 128;
            z = i6 % 2 != 0;
            int i7 = 2 % 2;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            z2 = false;
        }
        this(str, list, z, z2);
    }

    public final String getAmountInput() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final List<WithExpiryResp> getBundles() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 103;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<WithExpiryResp> list = this.component1;
        int i5 = i2 + 83;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean isAmountInvalid() {
        int i = 2 % 2;
        int i2 = component4 + 69;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 23;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 111;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 65;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = 1 + 87;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NoExpiryBundlesUiState() {
        this(null, null, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NoExpiryBundlesUiState copy$default(NoExpiryBundlesUiState noExpiryBundlesUiState, String str, List list, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 97;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 119;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = noExpiryBundlesUiState.copydefault;
                throw null;
            }
            str = noExpiryBundlesUiState.copydefault;
        }
        if ((i & 2) != 0) {
            list = noExpiryBundlesUiState.component1;
        }
        if ((i & 4) != 0) {
            int i7 = i3 + 73;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            z = noExpiryBundlesUiState.ShareDataUIState;
        }
        if ((i & 8) != 0) {
            z2 = noExpiryBundlesUiState.component2;
        }
        return noExpiryBundlesUiState.copy(str, list, z, z2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final List<WithExpiryResp> component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 19;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<WithExpiryResp> list = this.component1;
        int i4 = i2 + 109;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return list;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component4 + 5;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 95;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return z;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component4 + 25;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.component2;
        int i4 = i3 + 33;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final NoExpiryBundlesUiState copy(String amountInput, List<WithExpiryResp> bundles, boolean isAmountInvalid, boolean isLoading) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amountInput, "");
        Intrinsics.checkNotNullParameter(bundles, "");
        NoExpiryBundlesUiState noExpiryBundlesUiState = new NoExpiryBundlesUiState(amountInput, bundles, isAmountInvalid, isLoading);
        int i2 = getAsAtTimestamp + 81;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return noExpiryBundlesUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoExpiryBundlesUiState)) {
            int i4 = i3 + 121;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NoExpiryBundlesUiState noExpiryBundlesUiState = (NoExpiryBundlesUiState) other;
        if (!Intrinsics.areEqual(this.copydefault, noExpiryBundlesUiState.copydefault)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component1, noExpiryBundlesUiState.component1)) {
            return this.ShareDataUIState == noExpiryBundlesUiState.ShareDataUIState && this.component2 == noExpiryBundlesUiState.component2;
        }
        int i6 = component4 + 95;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.copydefault.hashCode();
        return i3 != 0 ? (((((iHashCode + 72) - this.component1.hashCode()) % 39) + Boolean.hashCode(this.ShareDataUIState)) % 72) - Boolean.hashCode(this.component2) : (((((iHashCode * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState)) * 31) + Boolean.hashCode(this.component2);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NoExpiryBundlesUiState(amountInput=" + this.copydefault + ", bundles=" + this.component1 + ", isAmountInvalid=" + this.ShareDataUIState + ", isLoading=" + this.component2 + ")";
        int i2 = component4 + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
