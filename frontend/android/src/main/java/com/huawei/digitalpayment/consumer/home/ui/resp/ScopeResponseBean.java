package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0006H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/ScopeResponseBean;", "", "allowedScopes", "", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/ScopesDataBean;", "rejectedScopes", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAllowedScopes", "()Ljava/util/List;", "getRejectedScopes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopeResponseBean {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 81 % 128;

    @SerializedName("kycAllowed")
    private final List<ScopesDataBean> allowedScopes;

    @SerializedName("kycRejected")
    private final List<String> rejectedScopes;

    public ScopeResponseBean(List<ScopesDataBean> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.allowedScopes = list;
        this.rejectedScopes = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScopeResponseBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt.emptyList();
            int i5 = component1 + 13;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 3;
            } else {
                int i7 = 2 % 2;
            }
        }
        this(list, list2);
    }

    public final List<ScopesDataBean> getAllowedScopes() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<ScopesDataBean> list = this.allowedScopes;
        int i4 = i3 + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<String> getRejectedScopes() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<String> list = this.rejectedScopes;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        if (81 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeResponseBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScopeResponseBean copy$default(ScopeResponseBean scopeResponseBean, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            list = scopeResponseBean.allowedScopes;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 77;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            list2 = scopeResponseBean.rejectedScopes;
            if (i7 != 0) {
                int i8 = 88 / 0;
            }
        }
        ScopeResponseBean scopeResponseBeanCopy = scopeResponseBean.copy(list, list2);
        int i9 = component1 + 89;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return scopeResponseBeanCopy;
    }

    public final List<ScopesDataBean> component1() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<ScopesDataBean> list = this.allowedScopes;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return list;
    }

    public final List<String> component2() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<String> list = this.rejectedScopes;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ScopeResponseBean copy(List<ScopesDataBean> allowedScopes, List<String> rejectedScopes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(allowedScopes, "");
        Intrinsics.checkNotNullParameter(rejectedScopes, "");
        ScopeResponseBean scopeResponseBean = new ScopeResponseBean(allowedScopes, rejectedScopes);
        int i2 = component3 + 39;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return scopeResponseBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScopeResponseBean)) {
            return false;
        }
        ScopeResponseBean scopeResponseBean = (ScopeResponseBean) other;
        if (Intrinsics.areEqual(this.allowedScopes, scopeResponseBean.allowedScopes)) {
            return !(Intrinsics.areEqual(this.rejectedScopes, scopeResponseBean.rejectedScopes) ^ true);
        }
        int i3 = component1 + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.allowedScopes.hashCode() * 31) + this.rejectedScopes.hashCode();
        int i4 = component3 + 7;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScopeResponseBean(allowedScopes=" + this.allowedScopes + ", rejectedScopes=" + this.rejectedScopes + ")";
        int i2 = component1 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
