package com.huawei.digitalpayment.consumer.risk.vm;

import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyResp;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/vm/RiskUiState;", "", "verify", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyResp;", "sendOtp", "Lcom/huawei/http/BaseResp;", "<init>", "(Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/payment/mvvm/Resource;)V", "getVerify", "()Lcom/huawei/payment/mvvm/Resource;", "getSendOtp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RiskUiState {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Resource<ProcessVerifyResp> component1;
    private final Resource<BaseResp> copydefault;

    public RiskUiState(Resource<ProcessVerifyResp> resource, Resource<BaseResp> resource2) {
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(resource2, "");
        this.component1 = resource;
        this.copydefault = resource2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RiskUiState(Resource resource, Resource resource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 47;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                resource = Resource.none();
                int i3 = 2 / 0;
            } else {
                resource = Resource.none();
            }
            int i4 = component2 + 5;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            resource2 = Resource.none();
            int i6 = component2 + 103;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        this(resource, resource2);
    }

    public final Resource<ProcessVerifyResp> getVerify() {
        Resource<ProcessVerifyResp> resource;
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            resource = this.component1;
            int i4 = 93 / 0;
        } else {
            resource = this.component1;
        }
        int i5 = i3 + 89;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return resource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Resource<BaseResp> getSendOtp() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return resource;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RiskUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RiskUiState copy$default(RiskUiState riskUiState, Resource resource, Resource resource2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 67;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                Resource<ProcessVerifyResp> resource3 = riskUiState.component1;
                throw null;
            }
            resource = riskUiState.component1;
        }
        if ((i & 2) != 0) {
            resource2 = riskUiState.copydefault;
        }
        RiskUiState riskUiStateCopy = riskUiState.copy(resource, resource2);
        int i7 = ShareDataUIState + 37;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return riskUiStateCopy;
    }

    public final Resource<ProcessVerifyResp> component1() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Resource<ProcessVerifyResp> resource = this.component1;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return resource;
    }

    public final Resource<BaseResp> component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return resource;
        }
        throw null;
    }

    public final RiskUiState copy(Resource<ProcessVerifyResp> verify, Resource<BaseResp> sendOtp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(verify, "");
        Intrinsics.checkNotNullParameter(sendOtp, "");
        RiskUiState riskUiState = new RiskUiState(verify, sendOtp);
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
        return riskUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskUiState)) {
            int i5 = i3 + 81;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        RiskUiState riskUiState = (RiskUiState) other;
        if (Intrinsics.areEqual(this.component1, riskUiState.component1)) {
            return !(Intrinsics.areEqual(this.copydefault, riskUiState.copydefault) ^ true);
        }
        int i7 = ShareDataUIState + 9;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        return i3 == 0 ? (iHashCode >> 11) - this.copydefault.hashCode() : (iHashCode * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RiskUiState(verify=" + this.component1 + ", sendOtp=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
