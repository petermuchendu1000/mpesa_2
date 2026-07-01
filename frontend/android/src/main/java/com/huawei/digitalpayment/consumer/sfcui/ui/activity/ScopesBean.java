package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import com.google.gson.annotations.SerializedName;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0004H×\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/ScopesBean;", "", LogConstants.Oauth.SCOPES, "", "", "<init>", "(Ljava/util/List;)V", "getScopes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopesBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 41 % 128;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName(LogConstants.Oauth.SCOPES)
    private final List<String> component3;

    public ScopesBean(List<String> list) {
        this.component3 = list;
    }

    public final List<String> getScopes() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 41 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScopesBean copy$default(ScopesBean scopesBean, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            list = scopesBean.component3;
        }
        ScopesBean scopesBeanCopy = scopesBean.copy(list);
        int i5 = copydefault + 69;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return scopesBeanCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final List<String> component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.component3;
        int i4 = i2 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final ScopesBean copy(List<String> scopes) {
        int i = 2 % 2;
        ScopesBean scopesBean = new ScopesBean(scopes);
        int i2 = component2 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return scopesBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2;
            int i3 = i2 + 7;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return true;
        }
        if (!(other instanceof ScopesBean)) {
            int i7 = copydefault + 9;
            component2 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.component3, ((ScopesBean) other).component3)) {
            return true;
        }
        int i8 = component2 + 11;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.component3;
        int iHashCode = list == null ? 0 : list.hashCode();
        int i4 = copydefault + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScopesBean(scopes=" + this.component3 + ")";
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
