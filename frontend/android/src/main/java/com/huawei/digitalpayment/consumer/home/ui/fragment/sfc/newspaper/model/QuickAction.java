package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/QuickAction;", "", "title", "", "icon", "", "<init>", "(Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickAction {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int getAsAtTimestamp = 1;
    private final int component3;
    private final String copydefault;

    public QuickAction(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.component3 = i;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component3;
        if (i3 != 0) {
            int i5 = 80 / 0;
        }
        return i4;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 39;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static QuickAction copy$default(QuickAction quickAction, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = getAsAtTimestamp;
            int i5 = i4 + 83;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            String str2 = quickAction.copydefault;
            int i7 = i4 + 63;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str = str2;
        }
        if ((i2 & 2) != 0) {
            i = quickAction.component3;
            int i9 = component1 + 81;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
        }
        QuickAction quickActionCopy = quickAction.copy(str, i);
        int i11 = component1 + 15;
        getAsAtTimestamp = i11 % 128;
        int i12 = i11 % 2;
        return quickActionCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 9;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 41;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final QuickAction copy(String title, int icon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        QuickAction quickAction = new QuickAction(title, icon);
        int i2 = getAsAtTimestamp + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return quickAction;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof QuickAction)) {
            return false;
        }
        QuickAction quickAction = (QuickAction) other;
        if (!Intrinsics.areEqual(this.copydefault, quickAction.copydefault)) {
            int i7 = getAsAtTimestamp + 1;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.component3 != quickAction.component3) {
            return false;
        }
        int i9 = getAsAtTimestamp + 115;
        component1 = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.copydefault.hashCode();
        return i3 == 0 ? (iHashCode >> 4) * Integer.hashCode(this.component3) : (iHashCode * 31) + Integer.hashCode(this.component3);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuickAction(title=" + this.copydefault + ", icon=" + this.component3 + ")";
        int i2 = getAsAtTimestamp + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
