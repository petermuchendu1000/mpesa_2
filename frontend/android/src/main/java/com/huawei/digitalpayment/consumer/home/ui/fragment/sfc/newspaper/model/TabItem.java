package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/TabItem;", "", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabItem {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String component1;

    public TabItem(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 39;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static TabItem copy$default(TabItem tabItem, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 117;
            int i7 = i6 % 128;
            component2 = i7;
            int i8 = i6 % 2;
            String str2 = tabItem.component1;
            int i9 = i7 + 11;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            str = str2;
        }
        return tabItem.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TabItem copy(String title) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        TabItem tabItem = new TabItem(title);
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return tabItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 41;
            copydefault = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(other instanceof TabItem)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component1, ((TabItem) other).component1)) {
            return true;
        }
        int i6 = copydefault + 7;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TabItem(title=" + this.component1 + ")";
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
