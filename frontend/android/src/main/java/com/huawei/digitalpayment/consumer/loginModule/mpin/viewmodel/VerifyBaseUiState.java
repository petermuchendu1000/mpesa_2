package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifyBaseUiState;", "", "questions", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "verify", "Lcom/huawei/http/BaseResp;", "resetPin", "<init>", "(Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/payment/mvvm/Resource;)V", "getQuestions", "()Lcom/huawei/payment/mvvm/Resource;", "getVerify", "getResetPin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyBaseUiState {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Resource<List<LocalQuestionItem>> component1;
    private final Resource<BaseResp> component2;
    private final Resource<BaseResp> copydefault;

    public VerifyBaseUiState(Resource<List<LocalQuestionItem>> resource, Resource<BaseResp> resource2, Resource<BaseResp> resource3) {
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(resource2, "");
        Intrinsics.checkNotNullParameter(resource3, "");
        this.component1 = resource;
        this.component2 = resource2;
        this.copydefault = resource3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerifyBaseUiState(Resource resource, Resource resource2, Resource resource3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        resource = (i & 1) != 0 ? Resource.none() : resource;
        if ((i & 2) != 0) {
            int i2 = component3 + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            resource2 = Resource.none();
        }
        if ((i & 4) != 0) {
            resource3 = Resource.none();
            int i4 = ShareDataUIState + 23;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(resource, resource2, resource3);
    }

    public final Resource<List<LocalQuestionItem>> getQuestions() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Resource<List<LocalQuestionItem>> resource = this.component1;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public final Resource<BaseResp> getVerify() {
        Resource<BaseResp> resource;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            resource = this.component2;
            int i4 = 82 / 0;
        } else {
            resource = this.component2;
        }
        int i5 = i2 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public final Resource<BaseResp> getResetPin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public VerifyBaseUiState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerifyBaseUiState copy$default(VerifyBaseUiState verifyBaseUiState, Resource resource, Resource resource2, Resource resource3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            resource = verifyBaseUiState.component1;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 17;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            resource2 = verifyBaseUiState.component2;
            int i6 = i4 + 115;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 4) != 0) {
            resource3 = verifyBaseUiState.copydefault;
        }
        return verifyBaseUiState.copy(resource, resource2, resource3);
    }

    public final Resource<List<LocalQuestionItem>> component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Resource<List<LocalQuestionItem>> resource = this.component1;
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return resource;
        }
        throw null;
    }

    public final Resource<BaseResp> component2() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Resource<BaseResp> resource = this.component2;
        int i5 = i3 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public final Resource<BaseResp> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public final VerifyBaseUiState copy(Resource<List<LocalQuestionItem>> questions, Resource<BaseResp> verify, Resource<BaseResp> resetPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questions, "");
        Intrinsics.checkNotNullParameter(verify, "");
        Intrinsics.checkNotNullParameter(resetPin, "");
        VerifyBaseUiState verifyBaseUiState = new VerifyBaseUiState(questions, verify, resetPin);
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return verifyBaseUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 119;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof VerifyBaseUiState)) {
            int i4 = component3 + 7;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        VerifyBaseUiState verifyBaseUiState = (VerifyBaseUiState) other;
        if (!Intrinsics.areEqual(this.component1, verifyBaseUiState.component1)) {
            int i6 = component3 + 115;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, verifyBaseUiState.component2)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, verifyBaseUiState.copydefault)) {
            return true;
        }
        int i8 = component3 + 27;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component1.hashCode() * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode();
        int i4 = ShareDataUIState + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyBaseUiState(questions=" + this.component1 + ", verify=" + this.component2 + ", resetPin=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
