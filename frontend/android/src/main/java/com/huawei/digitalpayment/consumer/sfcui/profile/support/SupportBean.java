package com.huawei.digitalpayment.consumer.sfcui.profile.support;

import com.alibaba.griver.api.constants.GriverEvents;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0005H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportBean;", "Ljava/io/Serializable;", GriverCacheDao.COLUMN_CACHE_ID, "", "iconRes", "", "title", CdpConstants.CONTENT_URL_MODEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getTitle", GriverEvents.EVENT_SET_TITLE, "getLink", "setLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportBean implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private int iconRes;
    private String id;
    private String link;
    private String title;

    public SupportBean(String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.iconRes = i;
        this.title = str2;
        this.link = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SupportBean(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component1;
            int i4 = i3 + 43;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str = "";
        }
        i = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            int i9 = component1 + 33;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 49 / 0;
            }
            int i11 = 2 % 2;
            str2 = "";
        }
        this(str, i, str2, (i2 & 8) != 0 ? "" : str3);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        int i4 = component1 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final int getIconRes() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.iconRes;
            int i5 = 13 / 0;
        } else {
            i = this.iconRes;
        }
        int i6 = i3 + 81;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.iconRes = i;
        int i6 = i3 + 33;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTitle(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        int i3 = component1 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getLink() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.link;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setLink(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.link = str;
        int i4 = ShareDataUIState + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 47;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SupportBean() {
        this(null, 0, null, null, 15, null);
    }

    public static SupportBean copy$default(SupportBean supportBean, String str, int i, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component1 + 95;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                str = supportBean.id;
                int i5 = 66 / 0;
            } else {
                str = supportBean.id;
            }
        }
        if ((i2 & 2) != 0) {
            int i6 = component1 + 65;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = supportBean.iconRes;
                throw null;
            }
            i = supportBean.iconRes;
        }
        if ((i2 & 4) != 0) {
            int i8 = component1 + 119;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str2 = supportBean.title;
        }
        if ((i2 & 8) != 0) {
            str3 = supportBean.link;
        }
        return supportBean.copy(str, i, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconRes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.link;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final SupportBean copy(String id, int iconRes, String title, String link) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(link, "");
        SupportBean supportBean = new SupportBean(id, iconRes, title, link);
        int i2 = ShareDataUIState + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return supportBean;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportBean)) {
            int i4 = i2 + 111;
            int i5 = i4 % 128;
            ShareDataUIState = i5;
            boolean z = i4 % 2 == 0;
            int i6 = i5 + 61;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }
        SupportBean supportBean = (SupportBean) other;
        if ((!Intrinsics.areEqual(this.id, supportBean.id)) || this.iconRes != supportBean.iconRes) {
            return false;
        }
        if (Intrinsics.areEqual(this.title, supportBean.title)) {
            return Intrinsics.areEqual(this.link, supportBean.link);
        }
        int i8 = component1 + 85;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.id.hashCode();
        return (i3 != 0 ? (((iHashCode / 119) * Integer.hashCode(this.iconRes)) % 63) * this.title.hashCode() * 103 : ((((iHashCode * 31) + Integer.hashCode(this.iconRes)) * 31) + this.title.hashCode()) * 31) + this.link.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SupportBean(id=" + this.id + ", iconRes=" + this.iconRes + ", title=" + this.title + ", link=" + this.link + ")";
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
