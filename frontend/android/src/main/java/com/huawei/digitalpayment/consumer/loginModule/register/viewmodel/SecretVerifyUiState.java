package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/viewmodel/SecretVerifyUiState;", "", "questions", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "selectedQuestion", "active", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/LocalLoginInfo;", "<init>", "(Lcom/huawei/payment/mvvm/Resource;Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;Lcom/huawei/payment/mvvm/Resource;)V", "getQuestions", "()Lcom/huawei/payment/mvvm/Resource;", "getSelectedQuestion", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "getActive", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecretVerifyUiState {
    private static int component3 = 1;
    private static int copydefault;
    private final Resource<LocalLoginInfo> ShareDataUIState;
    private final Resource<List<LocalQuestionItem>> component1;
    private final LocalQuestionItem component2;

    public SecretVerifyUiState(Resource<List<LocalQuestionItem>> resource, LocalQuestionItem localQuestionItem, Resource<LocalLoginInfo> resource2) {
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(resource2, "");
        this.component1 = resource;
        this.component2 = localQuestionItem;
        this.ShareDataUIState = resource2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SecretVerifyUiState(Resource resource, LocalQuestionItem localQuestionItem, Resource resource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            resource = Resource.none();
            int i2 = copydefault + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 17;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            localQuestionItem = null;
        }
        this(resource, localQuestionItem, (i & 4) != 0 ? Resource.none() : resource2);
    }

    public final Resource<List<LocalQuestionItem>> getQuestions() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Resource<List<LocalQuestionItem>> resource = this.component1;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return resource;
        }
        throw null;
    }

    public final LocalQuestionItem getSelectedQuestion() {
        LocalQuestionItem localQuestionItem;
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            localQuestionItem = this.component2;
            int i4 = 4 / 0;
        } else {
            localQuestionItem = this.component2;
        }
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return localQuestionItem;
    }

    public final Resource<LocalLoginInfo> getActive() {
        Resource<LocalLoginInfo> resource;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            resource = this.ShareDataUIState;
            int i4 = 25 / 0;
        } else {
            resource = this.ShareDataUIState;
        }
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public SecretVerifyUiState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SecretVerifyUiState copy$default(SecretVerifyUiState secretVerifyUiState, Resource resource, LocalQuestionItem localQuestionItem, Resource resource2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 49;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            resource = secretVerifyUiState.component1;
        }
        if ((i & 2) != 0) {
            localQuestionItem = secretVerifyUiState.component2;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 45;
            int i6 = i5 % 128;
            component3 = i6;
            int i7 = i5 % 2;
            Resource<LocalLoginInfo> resource3 = secretVerifyUiState.ShareDataUIState;
            int i8 = i6 + 83;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            resource2 = resource3;
        }
        return secretVerifyUiState.copy(resource, localQuestionItem, resource2);
    }

    public final Resource<List<LocalQuestionItem>> component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Resource<List<LocalQuestionItem>> resource = this.component1;
        int i5 = i2 + 115;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return resource;
        }
        throw null;
    }

    public final LocalQuestionItem component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LocalQuestionItem localQuestionItem = this.component2;
        int i4 = i2 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return localQuestionItem;
    }

    public final Resource<LocalLoginInfo> component3() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final SecretVerifyUiState copy(Resource<List<LocalQuestionItem>> questions, LocalQuestionItem selectedQuestion, Resource<LocalLoginInfo> active) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questions, "");
        Intrinsics.checkNotNullParameter(active, "");
        SecretVerifyUiState secretVerifyUiState = new SecretVerifyUiState(questions, selectedQuestion, active);
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return secretVerifyUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof SecretVerifyUiState) {
            SecretVerifyUiState secretVerifyUiState = (SecretVerifyUiState) other;
            return ((Intrinsics.areEqual(this.component1, secretVerifyUiState.component1) ^ true) || !Intrinsics.areEqual(this.component2, secretVerifyUiState.component2) || (Intrinsics.areEqual(this.ShareDataUIState, secretVerifyUiState.ShareDataUIState) ^ true)) ? false : true;
        }
        int i5 = i3 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        LocalQuestionItem localQuestionItem = this.component2;
        int iHashCode2 = (((iHashCode * 31) + (localQuestionItem == null ? 0 : localQuestionItem.hashCode())) * 31) + this.ShareDataUIState.hashCode();
        int i4 = component3 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecretVerifyUiState(questions=" + this.component1 + ", selectedQuestion=" + this.component2 + ", active=" + this.ShareDataUIState + ")";
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
