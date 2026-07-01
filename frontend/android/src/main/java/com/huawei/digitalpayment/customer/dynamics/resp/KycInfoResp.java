package com.huawei.digitalpayment.customer.dynamics.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/resp/KycInfoResp;", "", "groups", "", "Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiGroup;", "<init>", "(Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KycInfoResp {
    private static int component1 = 1;
    private static int component2;
    private final List<GuiGroup> copydefault;

    public KycInfoResp(List<GuiGroup> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    public final List<GuiGroup> getGroups() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<GuiGroup> list = this.copydefault;
        int i5 = i3 + 123;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static KycInfoResp copy$default(KycInfoResp kycInfoResp, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 119;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            list = kycInfoResp.copydefault;
            int i5 = i4 + 111;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        KycInfoResp kycInfoRespCopy = kycInfoResp.copy(list);
        int i7 = component2 + 89;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            return kycInfoRespCopy;
        }
        throw null;
    }

    public final List<GuiGroup> component1() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<GuiGroup> list = this.copydefault;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return list;
    }

    public final KycInfoResp copy(List<GuiGroup> groups) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groups, "");
        KycInfoResp kycInfoResp = new KycInfoResp(groups);
        int i2 = component2 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return kycInfoResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycInfoResp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, ((KycInfoResp) other).copydefault)) {
            int i4 = component2 + 7;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = component1 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.copydefault.hashCode();
            int i3 = 23 / 0;
        } else {
            iHashCode = this.copydefault.hashCode();
        }
        int i4 = component1 + 105;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KycInfoResp(groups=" + this.copydefault + ")";
        int i2 = component1 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
