package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyChangePinSmsResp;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/ChangePinOtpUiState;", "", "sendSms", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/http/BaseResp;", "verifySms", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyChangePinSmsResp;", "<init>", "(Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/payment/mvvm/Resource;)V", "getSendSms", "()Lcom/huawei/payment/mvvm/Resource;", "getVerifySms", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangePinOtpUiState {
    private static int component2 = 1;
    private static int component3;
    private final Resource<VerifyChangePinSmsResp> component1;
    private final Resource<BaseResp> copydefault;

    public ChangePinOtpUiState(Resource<BaseResp> resource, Resource<VerifyChangePinSmsResp> resource2) {
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(resource2, "");
        this.copydefault = resource;
        this.component1 = resource2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChangePinOtpUiState(Resource resource, Resource resource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 39;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                Resource.none();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            resource = Resource.none();
        }
        if ((i & 2) != 0) {
            resource2 = Resource.none();
            int i3 = component2 + 11;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this(resource, resource2);
    }

    public final Resource<BaseResp> getSendSms() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return resource;
    }

    public final Resource<VerifyChangePinSmsResp> getVerifySms() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Resource<VerifyChangePinSmsResp> resource = this.component1;
        int i5 = i3 + 25;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return resource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangePinOtpUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChangePinOtpUiState copy$default(ChangePinOtpUiState changePinOtpUiState, Resource resource, Resource resource2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 27;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            resource = changePinOtpUiState.copydefault;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 31;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                Resource<VerifyChangePinSmsResp> resource3 = changePinOtpUiState.component1;
                throw null;
            }
            resource2 = changePinOtpUiState.component1;
        }
        return changePinOtpUiState.copy(resource, resource2);
    }

    public final Resource<BaseResp> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i2 + 97;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return resource;
        }
        throw null;
    }

    public final Resource<VerifyChangePinSmsResp> component2() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Resource<VerifyChangePinSmsResp> resource = this.component1;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public final ChangePinOtpUiState copy(Resource<BaseResp> sendSms, Resource<VerifyChangePinSmsResp> verifySms) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sendSms, "");
        Intrinsics.checkNotNullParameter(verifySms, "");
        ChangePinOtpUiState changePinOtpUiState = new ChangePinOtpUiState(sendSms, verifySms);
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return changePinOtpUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePinOtpUiState)) {
            int i2 = component3 + 57;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ChangePinOtpUiState changePinOtpUiState = (ChangePinOtpUiState) other;
        if (Intrinsics.areEqual(this.copydefault, changePinOtpUiState.copydefault)) {
            if (Intrinsics.areEqual(this.component1, changePinOtpUiState.component1)) {
                return true;
            }
            int i4 = component2 + 77;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component3 + 7;
        int i7 = i6 % 128;
        component2 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 61;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.copydefault.hashCode() * 31) + this.component1.hashCode();
        int i4 = component2 + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangePinOtpUiState(sendSms=" + this.copydefault + ", verifySms=" + this.component1 + ")";
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
