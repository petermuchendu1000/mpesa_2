package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\bH×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ActionItem;", "", "title", "", "route", "routeIsUrl", "", "imageResId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "getTitle", "()Ljava/lang/String;", "getRoute", "getRouteIsUrl", "()Z", "getImageResId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActionItem {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component3;
    private final int copydefault;

    public ActionItem(String str, String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component1 = z;
        this.copydefault = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionItem(String str, String str2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = equals + 27;
            component4 = i3 % 128;
            z = i3 % 2 != 0;
            int i4 = 2 % 2;
        }
        this(str, str2, z, i);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 55;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRoute() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 113;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 67;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean getRouteIsUrl() {
        int i = 2 % 2;
        int i2 = component4 + 99;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 87;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int getImageResId() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 123;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    static {
        int i = 1 + 33;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActionItem copy$default(ActionItem actionItem, String str, String str2, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 63;
        component4 = i5 % 128;
        if (i5 % 2 == 0 && (i2 & 1) != 0) {
            str = actionItem.ShareDataUIState;
        }
        if ((i2 & 2) != 0) {
            int i6 = i4 + 71;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            str2 = actionItem.component3;
        }
        if ((i2 & 4) != 0) {
            int i8 = i4 + 97;
            component4 = i8 % 128;
            if (i8 % 2 != 0) {
                boolean z2 = actionItem.component1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z = actionItem.component1;
        }
        if ((i2 & 8) != 0) {
            int i9 = component4 + 97;
            equals = i9 % 128;
            int i10 = i9 % 2;
            i = actionItem.copydefault;
        }
        return actionItem.copy(str, str2, z, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 31;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 85;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 113;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 75;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 45;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component1;
        int i5 = i2 + 97;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = equals + 87;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ActionItem copy(String title, String route, boolean routeIsUrl, int imageResId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        ActionItem actionItem = new ActionItem(title, route, routeIsUrl, imageResId);
        int i2 = component4 + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return actionItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 53;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ActionItem)) {
            return false;
        }
        ActionItem actionItem = (ActionItem) other;
        if ((!Intrinsics.areEqual(this.ShareDataUIState, actionItem.ShareDataUIState)) || !Intrinsics.areEqual(this.component3, actionItem.component3)) {
            return false;
        }
        if (this.component1 != actionItem.component1) {
            int i4 = component4 + 117;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.copydefault != actionItem.copydefault) {
            int i6 = component4;
            int i7 = i6 + 39;
            equals = i7 % 128;
            z = i7 % 2 == 0;
            int i8 = i6 + 91;
            equals = i8 % 128;
            int i9 = i8 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 13;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.ShareDataUIState.hashCode();
        String str = this.component3;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = equals + 7;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (((((iHashCode * 31) + i) * 31) + Boolean.hashCode(this.component1)) * 31) + Integer.hashCode(this.copydefault);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActionItem(title=" + this.ShareDataUIState + ", route=" + this.component3 + ", routeIsUrl=" + this.component1 + ", imageResId=" + this.copydefault + ")";
        int i2 = equals + 105;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return str;
    }
}
