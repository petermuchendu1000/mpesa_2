package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0007H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PackageTabResp;", "Ljava/io/Serializable;", "tabId", "", "tabName", "operatorShortCode", "order", "", "packageGroups", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PackageGroupResp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getTabId", "()Ljava/lang/String;", "getTabName", "getOperatorShortCode", "getOrder", "()I", "getPackageGroups", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PackageTabResp implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private final String operatorShortCode;
    private final int order;
    private final List<PackageGroupResp> packageGroups;
    private final String tabId;
    private final String tabName;

    public PackageTabResp(String str, String str2, String str3, int i, List<PackageGroupResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.tabId = str;
        this.tabName = str2;
        this.operatorShortCode = str3;
        this.order = i;
        this.packageGroups = list;
    }

    public final String getTabId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tabId;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final String getTabName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tabName;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOperatorShortCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.operatorShortCode;
        int i4 = i2 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return str;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.order;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return i4;
    }

    public final List<PackageGroupResp> getPackageGroups() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<PackageGroupResp> list = this.packageGroups;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = 1 + 89;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PackageTabResp copy$default(PackageTabResp packageTabResp, String str, String str2, String str3, int i, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component2 + 57;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            str = packageTabResp.tabId;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            str2 = packageTabResp.tabName;
            int i6 = i5 + 83;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = packageTabResp.operatorShortCode;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = packageTabResp.order;
            int i8 = i5 + 37;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = i;
        if ((i2 & 16) != 0) {
            list = packageTabResp.packageGroups;
        }
        return packageTabResp.copy(str4, str5, str6, i10, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tabId;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tabName;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.operatorShortCode;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 93;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<PackageGroupResp> component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<PackageGroupResp> list = this.packageGroups;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final PackageTabResp copy(String tabId, String tabName, String operatorShortCode, int order, List<PackageGroupResp> packageGroups) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tabId, "");
        Intrinsics.checkNotNullParameter(tabName, "");
        Intrinsics.checkNotNullParameter(operatorShortCode, "");
        Intrinsics.checkNotNullParameter(packageGroups, "");
        PackageTabResp packageTabResp = new PackageTabResp(tabId, tabName, operatorShortCode, order, packageGroups);
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return packageTabResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageTabResp)) {
            int i5 = i3 + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        PackageTabResp packageTabResp = (PackageTabResp) other;
        if (!Intrinsics.areEqual(this.tabId, packageTabResp.tabId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tabName, packageTabResp.tabName)) {
            int i7 = ShareDataUIState + 9;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.operatorShortCode, packageTabResp.operatorShortCode)) {
            int i8 = ShareDataUIState + 41;
            component2 = i8 % 128;
            return i8 % 2 == 0;
        }
        if (this.order != packageTabResp.order) {
            int i9 = ShareDataUIState + 65;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.packageGroups, packageTabResp.packageGroups)) {
            return true;
        }
        int i11 = ShareDataUIState;
        int i12 = i11 + 39;
        component2 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 29;
        component2 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.tabId.hashCode() * 31) + this.tabName.hashCode()) * 31) + this.operatorShortCode.hashCode()) * 31) + Integer.hashCode(this.order)) * 31) + this.packageGroups.hashCode();
        int i4 = component2 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PackageTabResp(tabId=" + this.tabId + ", tabName=" + this.tabName + ", operatorShortCode=" + this.operatorShortCode + ", order=" + this.order + ", packageGroups=" + this.packageGroups + ")";
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
