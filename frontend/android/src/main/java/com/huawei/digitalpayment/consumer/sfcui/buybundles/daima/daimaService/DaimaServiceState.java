package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0006H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "errorMessage", "", "products", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "tariff", "<init>", "(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "getTariff", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaServiceState {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final boolean ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;
    private final List<DaimaProduct> copydefault;

    public DaimaServiceState(boolean z, boolean z2, String str, List<DaimaProduct> list, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = z;
        this.component1 = z2;
        this.component2 = str;
        this.copydefault = list;
        this.component3 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DaimaServiceState(boolean z, boolean z2, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) == 0 ? z2 : false;
        if ((i & 4) != 0) {
            int i2 = equals + 37;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        String str3 = str;
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
            int i4 = equals + 81;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str2 = "Prepaid";
            int i7 = getRequestBeneficiariesState + 125;
            equals = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        this(z3, z4, str3, list2, str2);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 9;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 33;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = equals + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 75;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 83;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<DaimaProduct> getProducts() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<DaimaProduct> list = this.copydefault;
        int i5 = i3 + 85;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getTariff() {
        int i = 2 % 2;
        int i2 = equals + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 25;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public DaimaServiceState() {
        this(false, false, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DaimaServiceState copy$default(DaimaServiceState daimaServiceState, boolean z, boolean z2, String str, List list, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 61;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            z = daimaServiceState.ShareDataUIState;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            int i5 = equals + 51;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z4 = daimaServiceState.component1;
                throw null;
            }
            z2 = daimaServiceState.component1;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = daimaServiceState.component2;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            list = daimaServiceState.copydefault;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str2 = daimaServiceState.component3;
        }
        return daimaServiceState.copy(z3, z5, str3, list2, str2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 125;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i2 + 33;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 93;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<DaimaProduct> component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<DaimaProduct> list = this.copydefault;
        int i4 = i3 + 93;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 121;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 101;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final DaimaServiceState copy(boolean isLoading, boolean isError, String errorMessage, List<DaimaProduct> products, String tariff) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorMessage, "");
        Intrinsics.checkNotNullParameter(products, "");
        Intrinsics.checkNotNullParameter(tariff, "");
        DaimaServiceState daimaServiceState = new DaimaServiceState(isLoading, isError, errorMessage, products, tariff);
        int i2 = getRequestBeneficiariesState + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return daimaServiceState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DaimaServiceState)) {
            return false;
        }
        DaimaServiceState daimaServiceState = (DaimaServiceState) other;
        if (this.ShareDataUIState != daimaServiceState.ShareDataUIState || this.component1 != daimaServiceState.component1) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, daimaServiceState.component2)) {
            return Intrinsics.areEqual(this.copydefault, daimaServiceState.copydefault) && Intrinsics.areEqual(this.component3, daimaServiceState.component3);
        }
        int i4 = getRequestBeneficiariesState + 9;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.ShareDataUIState) * 31) + Boolean.hashCode(this.component1)) * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component3.hashCode();
        int i4 = equals + 53;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaServiceState(isLoading=" + this.ShareDataUIState + ", isError=" + this.component1 + ", errorMessage=" + this.component2 + ", products=" + this.copydefault + ", tariff=" + this.component3 + ")";
        int i2 = equals + 11;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return str;
    }
}
