package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0005H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/ActionItem;", "", "title", "", "iconRes", "", "route", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIconRes", "()I", "getRoute", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActionItem {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component4 = 1;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final String component2;
    private final int component3;

    public ActionItem(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = str;
        this.component3 = i;
        this.component2 = str2;
    }

    public final String getTitle() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 65;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            str = this.ShareDataUIState;
            int i4 = 16 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 101;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 35;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.component3;
        int i5 = i2 + 121;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return i4;
    }

    public final String getRoute() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 41;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 123;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActionItem copy$default(ActionItem actionItem, String str, int i, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 19;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            str = actionItem.ShareDataUIState;
        }
        if ((i2 & 2) != 0) {
            int i7 = i4 + 1;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            i = actionItem.component3;
            if (i8 == 0) {
                int i9 = 21 / 0;
            }
        }
        if ((i2 & 4) != 0) {
            str2 = actionItem.component2;
        }
        return actionItem.copy(str, i, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 73;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 77;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component3;
        if (i3 == 0) {
            int i5 = 67 / 0;
        }
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 27;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 79;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ActionItem copy(String title, int iconRes, String route) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(route, "");
        ActionItem actionItem = new ActionItem(title, iconRes, route);
        int i2 = component4 + 97;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return actionItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionItem)) {
            int i2 = getAsAtTimestamp + 105;
            component4 = i2 % 128;
            return i2 % 2 == 0;
        }
        ActionItem actionItem = (ActionItem) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, actionItem.ShareDataUIState)) {
            int i3 = getAsAtTimestamp;
            int i4 = i3 + 1;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 75;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 26 / 0;
            }
            return false;
        }
        if (this.component3 != actionItem.component3) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, actionItem.component2)) {
            int i8 = component4 + 119;
            getAsAtTimestamp = i8 % 128;
            return i8 % 2 != 0;
        }
        int i9 = getAsAtTimestamp + 7;
        component4 = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.ShareDataUIState.hashCode() * 31) + Integer.hashCode(this.component3)) * 31) + this.component2.hashCode();
        int i4 = component4 + 101;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActionItem(title=" + this.ShareDataUIState + ", iconRes=" + this.component3 + ", route=" + this.component2 + ")";
        int i2 = component4 + 67;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return str;
    }
}
