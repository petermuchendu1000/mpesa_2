package com.huawei.digitalpayment.consumer.pochiwallet.ui.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0005H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/PochiBusinessCategoryBean;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "iconRes", "", "name", "content", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getName", "setName", "getContent", "setContent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiBusinessCategoryBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 9 % 128;
    private String component1;
    private String component2;
    private int component3;
    private String copydefault;

    public PochiBusinessCategoryBean(String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component1 = str;
        this.component3 = i;
        this.component2 = str2;
        this.copydefault = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PochiBusinessCategoryBean(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component4 + 51;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            str = "";
        }
        if ((i2 & 4) != 0) {
            int i5 = getAsAtTimestamp + 27;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str2 = "";
        }
        this(str, i, str2, str3);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 97;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 9;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return str;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = component4 + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        int i4 = component4 + 75;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 71;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 29;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 39;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.component3 = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 25;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        int i3 = getAsAtTimestamp + 111;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getContent() {
        int i = 2 % 2;
        int i2 = component4 + 99;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 107;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setContent(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        int i4 = component4 + 55;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PochiBusinessCategoryBean copy$default(PochiBusinessCategoryBean pochiBusinessCategoryBean, String str, int i, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 107;
        int i5 = i4 % 128;
        component4 = i5;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            str = pochiBusinessCategoryBean.component1;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 75;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            i = pochiBusinessCategoryBean.component3;
        }
        if ((i2 & 4) != 0) {
            str2 = pochiBusinessCategoryBean.component2;
        }
        if ((i2 & 8) != 0) {
            int i8 = getAsAtTimestamp + 85;
            component4 = i8 % 128;
            if (i8 % 2 != 0) {
                String str4 = pochiBusinessCategoryBean.copydefault;
                throw null;
            }
            str3 = pochiBusinessCategoryBean.copydefault;
        }
        return pochiBusinessCategoryBean.copy(str, i, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 9;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 53;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 45;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 63;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 43;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.copydefault;
            int i4 = 6 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 79;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PochiBusinessCategoryBean copy(String id, int iconRes, String name, String content) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(content, "");
        PochiBusinessCategoryBean pochiBusinessCategoryBean = new PochiBusinessCategoryBean(id, iconRes, name, content);
        int i2 = component4 + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return pochiBusinessCategoryBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PochiBusinessCategoryBean)) {
            int i2 = getAsAtTimestamp + 83;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PochiBusinessCategoryBean pochiBusinessCategoryBean = (PochiBusinessCategoryBean) other;
        if ((!Intrinsics.areEqual(this.component1, pochiBusinessCategoryBean.component1)) || this.component3 != pochiBusinessCategoryBean.component3) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, pochiBusinessCategoryBean.component2)) {
            int i4 = getAsAtTimestamp + 123;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, pochiBusinessCategoryBean.copydefault)) {
            return true;
        }
        int i6 = component4 + 41;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component1.hashCode() * 31) + Integer.hashCode(this.component3)) * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode();
        int i4 = getAsAtTimestamp + 51;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PochiBusinessCategoryBean(id=" + this.component1 + ", iconRes=" + this.component3 + ", name=" + this.component2 + ", content=" + this.copydefault + ")";
        int i2 = component4 + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
