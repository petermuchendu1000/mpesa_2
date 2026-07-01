package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u0006H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SecurityBean;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "iconRes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getIconRes", "()I", "setIconRes", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecurityBean {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private int ShareDataUIState;
    private String component1;
    private String copydefault;

    public SecurityBean(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.copydefault = str2;
        this.ShareDataUIState = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SecurityBean(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = component4 + 19;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str2 = "";
            int i4 = 2 % 2;
        }
        this(str, str2, i);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component4 + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = component4 + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        int i4 = component4 + 91;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 37;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        int i3 = getAsAtTimestamp + 81;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component4 + 109;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.ShareDataUIState;
        int i5 = i3 + 91;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 5;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        this.ShareDataUIState = i;
        int i6 = i3 + 31;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
    }

    static {
        int i = 1 + 87;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static SecurityBean copy$default(SecurityBean securityBean, String str, String str2, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component4 + 17;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 15;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            str = securityBean.component1;
        }
        if ((i2 & 2) != 0) {
            str2 = securityBean.copydefault;
            int i9 = component4 + 83;
            getAsAtTimestamp = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 5;
            }
        }
        if ((i2 & 4) != 0) {
            i = securityBean.ShareDataUIState;
        }
        return securityBean.copy(str, str2, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 101;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 11;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 21;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 65;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i3 + 101;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final SecurityBean copy(String id, String name, int iconRes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        SecurityBean securityBean = new SecurityBean(id, name, iconRes);
        int i2 = component4 + 121;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return securityBean;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof SecurityBean) {
            SecurityBean securityBean = (SecurityBean) other;
            return Intrinsics.areEqual(this.component1, securityBean.component1) && Intrinsics.areEqual(this.copydefault, securityBean.copydefault) && this.ShareDataUIState == securityBean.ShareDataUIState;
        }
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 31;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component1.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.ShareDataUIState);
        int i4 = getAsAtTimestamp + 69;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityBean(id=" + this.component1 + ", name=" + this.copydefault + ", iconRes=" + this.ShareDataUIState + ")";
        int i2 = component4 + 67;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
