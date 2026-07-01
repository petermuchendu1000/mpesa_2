package com.huawei.digitalpayment.home.theme.data.local;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J6\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "Lcom/huawei/http/BaseResp;", "navigatorBackgroundColor", "", "navigatorBackgroundUrl", "", "pages", "", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getNavigatorBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNavigatorBackgroundUrl", "()Ljava/lang/String;", "getPages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalHomeTheme extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    private final Integer navigatorBackgroundColor;
    private final String navigatorBackgroundUrl;
    private final List<LocalComponent> pages;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalHomeTheme(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        num = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = component3 + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 27;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i6 = component3 + 117;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } else {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
        }
        this(num, str, list);
    }

    public final Integer getNavigatorBackgroundColor() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.navigatorBackgroundColor;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getNavigatorBackgroundUrl() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.navigatorBackgroundUrl;
        int i5 = i2 + 67;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<LocalComponent> getPages() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pages;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalHomeTheme(Integer num, String str, List<LocalComponent> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.navigatorBackgroundColor = num;
        this.navigatorBackgroundUrl = str;
        this.pages = list;
    }

    public LocalHomeTheme() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalHomeTheme copy$default(LocalHomeTheme localHomeTheme, Integer num, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 25;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                num = localHomeTheme.navigatorBackgroundColor;
                int i4 = 70 / 0;
            } else {
                num = localHomeTheme.navigatorBackgroundColor;
            }
        }
        if ((i & 2) != 0) {
            str = localHomeTheme.navigatorBackgroundUrl;
            int i5 = component1 + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            int i7 = component1 + 39;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            list = localHomeTheme.pages;
        }
        return localHomeTheme.copy(num, str, list);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.navigatorBackgroundColor;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.navigatorBackgroundUrl;
        int i5 = i3 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<LocalComponent> component3() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pages;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalHomeTheme copy(Integer navigatorBackgroundColor, String navigatorBackgroundUrl, List<LocalComponent> pages) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pages, "");
        LocalHomeTheme localHomeTheme = new LocalHomeTheme(navigatorBackgroundColor, navigatorBackgroundUrl, pages);
        int i2 = component3 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localHomeTheme;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalHomeTheme)) {
            return false;
        }
        LocalHomeTheme localHomeTheme = (LocalHomeTheme) other;
        if (Intrinsics.areEqual(this.navigatorBackgroundColor, localHomeTheme.navigatorBackgroundColor)) {
            if (!Intrinsics.areEqual(this.navigatorBackgroundUrl, localHomeTheme.navigatorBackgroundUrl)) {
                return false;
            }
            if (Intrinsics.areEqual(this.pages, localHomeTheme.pages)) {
                return true;
            }
            int i2 = component1 + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = component1 + 121;
        int i5 = i4 % 128;
        component3 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 125;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.navigatorBackgroundColor;
        int iHashCode2 = 0;
        if (num == null) {
            int i5 = i2 + 49;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str = this.navigatorBackgroundUrl;
        if (str != null) {
            iHashCode2 = str.hashCode();
            int i7 = component3 + 93;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 5;
            }
        }
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + this.pages.hashCode();
        int i9 = component1 + 27;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalHomeTheme(navigatorBackgroundColor=" + this.navigatorBackgroundColor + ", navigatorBackgroundUrl=" + this.navigatorBackgroundUrl + ", pages=" + this.pages + ")";
        int i2 = component3 + 17;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
