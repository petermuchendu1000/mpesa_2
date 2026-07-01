package com.huawei.digitalpayment.checkout.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020\u0005H×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/CommonSuccessFunctionBean;", "", "title", "", "icon", "", GriverCacheDao.COLUMN_CACHE_ID, "selected", "", "alpha", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZF)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "setIcon", "(I)V", "getId", "getSelected", "()Z", "setSelected", "(Z)V", "getAlpha", "()F", "setAlpha", "(F)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonSuccessFunctionBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    private float alpha;
    private int icon;
    private final String id;
    private boolean selected;
    private final String title;

    public CommonSuccessFunctionBean(String str, int i, String str2, boolean z, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.icon = i;
        this.id = str2;
        this.selected = z;
        this.alpha = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CommonSuccessFunctionBean(String str, int i, String str2, boolean z, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component2 + 35;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            str = "";
        }
        boolean z2 = false;
        int i5 = (i2 & 2) != 0 ? 0 : i;
        String str3 = (i2 & 4) == 0 ? str2 : "";
        if ((i2 & 8) != 0) {
            int i6 = component2 + 71;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z2 = z;
        }
        this(str, i5, str3, z2, (i2 & 16) != 0 ? 1.0f : f);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.icon;
        int i6 = i2 + 41;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 119;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.icon = i;
        int i6 = i4 + 89;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 93;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean getSelected() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.selected;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.selected = z;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getAlpha() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        float f = this.alpha;
        int i5 = i3 + 109;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final void setAlpha(float f) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.alpha = f;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
    }

    static {
        int i = 1 + 41;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    public CommonSuccessFunctionBean() {
        this(null, 0, null, false, 0.0f, 31, null);
    }

    public static CommonSuccessFunctionBean copy$default(CommonSuccessFunctionBean commonSuccessFunctionBean, String str, int i, String str2, boolean z, float f, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component2 + 19;
        int i5 = i4 % 128;
        component1 = i5;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            int i6 = i5 + 99;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = commonSuccessFunctionBean.title;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i = commonSuccessFunctionBean.icon;
        }
        int i8 = i;
        if ((i2 & 4) != 0) {
            str2 = commonSuccessFunctionBean.id;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            int i9 = component2 + 91;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            z = commonSuccessFunctionBean.selected;
            if (i10 != 0) {
                int i11 = 3 / 0;
            }
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            f = commonSuccessFunctionBean.alpha;
        }
        return commonSuccessFunctionBean.copy(str3, i8, str4, z2, f);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 17;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.icon;
        int i6 = i2 + 17;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selected;
        }
        throw null;
    }

    public final float component5() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        float f = this.alpha;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final CommonSuccessFunctionBean copy(String title, int icon, String id, boolean selected, float alpha) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(id, "");
        CommonSuccessFunctionBean commonSuccessFunctionBean = new CommonSuccessFunctionBean(title, icon, id, selected, alpha);
        int i2 = component2 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return commonSuccessFunctionBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSuccessFunctionBean)) {
            return false;
        }
        CommonSuccessFunctionBean commonSuccessFunctionBean = (CommonSuccessFunctionBean) other;
        if (!Intrinsics.areEqual(this.title, commonSuccessFunctionBean.title)) {
            return false;
        }
        if (this.icon != commonSuccessFunctionBean.icon) {
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, commonSuccessFunctionBean.id)) {
            return false;
        }
        if (this.selected != commonSuccessFunctionBean.selected) {
            int i4 = component2 + 49;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return false;
        }
        if (Float.compare(this.alpha, commonSuccessFunctionBean.alpha) == 0) {
            int i6 = component2 + 41;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = component2;
        int i9 = i8 + 73;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 3;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.title.hashCode() * 31) + Integer.hashCode(this.icon)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31) + Float.hashCode(this.alpha);
        int i4 = component2 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CommonSuccessFunctionBean(title=" + this.title + ", icon=" + this.icon + ", id=" + this.id + ", selected=" + this.selected + ", alpha=" + this.alpha + ")";
        int i2 = component1 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
