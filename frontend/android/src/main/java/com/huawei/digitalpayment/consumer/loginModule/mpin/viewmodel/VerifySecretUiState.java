package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifySecretUiState;", "", "questions", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "selectedQuestion", "verify", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionResp;", "resetPin", "Lcom/huawei/http/BaseResp;", "<init>", "(Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/payment/mvvm/Resource;)V", "getQuestions", "()Lcom/huawei/payment/mvvm/Resource;", "getSelectedQuestion", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "getVerify", "getResetPin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifySecretUiState {
    private static int ShareDataUIState = 0;
    private static int copy = 1;
    private final LocalQuestionItem component1;
    private final Resource<VerifySecurityQuestionResp> component2;
    private final Resource<List<LocalQuestionItem>> component3;
    private final Resource<BaseResp> copydefault;

    public VerifySecretUiState(Resource<List<LocalQuestionItem>> resource, LocalQuestionItem localQuestionItem, Resource<VerifySecurityQuestionResp> resource2, Resource<BaseResp> resource3) {
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(resource2, "");
        Intrinsics.checkNotNullParameter(resource3, "");
        this.component3 = resource;
        this.component1 = localQuestionItem;
        this.component2 = resource2;
        this.copydefault = resource3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerifySecretUiState(Resource resource, LocalQuestionItem localQuestionItem, Resource resource2, Resource resource3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            resource = Resource.none();
            int i2 = ShareDataUIState + 31;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i4 = copy + 61;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 62 / 0;
            }
            localQuestionItem = null;
        }
        if ((i & 4) != 0) {
            int i6 = copy + 59;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                resource2 = Resource.none();
                int i7 = 2 % 2;
            } else {
                Resource.none();
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 8) != 0) {
            resource3 = Resource.none();
            int i8 = 2 % 2;
        }
        this(resource, localQuestionItem, resource2, resource3);
    }

    public final Resource<List<LocalQuestionItem>> getQuestions() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Resource<List<LocalQuestionItem>> resource = this.component3;
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return resource;
        }
        throw null;
    }

    public final LocalQuestionItem getSelectedQuestion() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        LocalQuestionItem localQuestionItem = this.component1;
        int i5 = i3 + 39;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return localQuestionItem;
    }

    public final Resource<VerifySecurityQuestionResp> getVerify() {
        int i = 2 % 2;
        int i2 = copy + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Resource<BaseResp> getResetPin() {
        int i = 2 % 2;
        int i2 = copy + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i3 + 97;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public VerifySecretUiState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerifySecretUiState copy$default(VerifySecretUiState verifySecretUiState, Resource resource, LocalQuestionItem localQuestionItem, Resource resource2, Resource resource3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copy + 87;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            resource = verifySecretUiState.component3;
        }
        if ((i & 2) != 0) {
            localQuestionItem = verifySecretUiState.component1;
            int i5 = copy + 117;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            resource2 = verifySecretUiState.component2;
        }
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 9;
            copy = i7 % 128;
            if (i7 % 2 == 0) {
                Resource<BaseResp> resource4 = verifySecretUiState.copydefault;
                throw null;
            }
            resource3 = verifySecretUiState.copydefault;
        }
        return verifySecretUiState.copy(resource, localQuestionItem, resource2, resource3);
    }

    public final Resource<List<LocalQuestionItem>> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Resource<List<LocalQuestionItem>> resource = this.component3;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return resource;
        }
        throw null;
    }

    public final LocalQuestionItem component2() {
        LocalQuestionItem localQuestionItem;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            localQuestionItem = this.component1;
            int i4 = 20 / 0;
        } else {
            localQuestionItem = this.component1;
        }
        int i5 = i2 + 45;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return localQuestionItem;
        }
        throw null;
    }

    public final Resource<VerifySecurityQuestionResp> component3() {
        int i = 2 % 2;
        int i2 = copy + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Resource<VerifySecurityQuestionResp> resource = this.component2;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return resource;
    }

    public final Resource<BaseResp> component4() {
        int i = 2 % 2;
        int i2 = copy + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Resource<BaseResp> resource = this.copydefault;
        int i5 = i3 + 21;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return resource;
        }
        throw null;
    }

    public final VerifySecretUiState copy(Resource<List<LocalQuestionItem>> questions, LocalQuestionItem selectedQuestion, Resource<VerifySecurityQuestionResp> verify, Resource<BaseResp> resetPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questions, "");
        Intrinsics.checkNotNullParameter(verify, "");
        Intrinsics.checkNotNullParameter(resetPin, "");
        VerifySecretUiState verifySecretUiState = new VerifySecretUiState(questions, selectedQuestion, verify, resetPin);
        int i2 = ShareDataUIState + 97;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
        return verifySecretUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof VerifySecretUiState)) {
            return false;
        }
        VerifySecretUiState verifySecretUiState = (VerifySecretUiState) other;
        if (Intrinsics.areEqual(this.component3, verifySecretUiState.component3)) {
            return !(Intrinsics.areEqual(this.component1, verifySecretUiState.component1) ^ true) && Intrinsics.areEqual(this.component2, verifySecretUiState.component2) && Intrinsics.areEqual(this.copydefault, verifySecretUiState.copydefault);
        }
        int i4 = ShareDataUIState + 13;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component3.hashCode();
        LocalQuestionItem localQuestionItem = this.component1;
        if (localQuestionItem == null) {
            int i2 = copy + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = localQuestionItem.hashCode();
        }
        int iHashCode3 = (((((iHashCode2 * 31) + iHashCode) * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode();
        int i4 = ShareDataUIState + 111;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifySecretUiState(questions=" + this.component3 + ", selectedQuestion=" + this.component1 + ", verify=" + this.component2 + ", resetPin=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
