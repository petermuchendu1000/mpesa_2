package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/RoamingInternationalItem;", "Ljava/io/Serializable;", SfcServicePinActivity.EXTRA_IMAGE_RES, "", "title", "", "routePath", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getImageRes", "()I", "getTitle", "()Ljava/lang/String;", "getRoutePath", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingInternationalItem implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 69 % 128;
    private static int component2;
    private static int component3;
    private final int imageRes;
    private final String routePath;
    private final String title;

    public RoamingInternationalItem(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.imageRes = i;
        this.title = str;
        this.routePath = str2;
    }

    public final int getImageRes() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.imageRes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public final String getRoutePath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.routePath;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 69 % 2;
    }

    public static RoamingInternationalItem copy$default(RoamingInternationalItem roamingInternationalItem, int i, String str, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 9;
        int i5 = i4 % 128;
        component3 = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            i = roamingInternationalItem.imageRes;
            int i7 = i5 + 47;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 2) != 0) {
            int i9 = i5 + 17;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str = roamingInternationalItem.title;
            if (i10 == 0) {
                int i11 = 39 / 0;
            }
        }
        if ((i2 & 4) != 0) {
            int i12 = ShareDataUIState + 123;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            str2 = roamingInternationalItem.routePath;
        }
        return roamingInternationalItem.copy(i, str, str2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.imageRes;
        int i5 = i2 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.routePath;
            int i4 = 63 / 0;
        } else {
            str = this.routePath;
        }
        int i5 = i2 + 91;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RoamingInternationalItem copy(int imageRes, String title, String routePath) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(routePath, "");
        RoamingInternationalItem roamingInternationalItem = new RoamingInternationalItem(imageRes, title, routePath);
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return roamingInternationalItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingInternationalItem)) {
            int i5 = i3 + 33;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        RoamingInternationalItem roamingInternationalItem = (RoamingInternationalItem) other;
        if (this.imageRes != roamingInternationalItem.imageRes) {
            int i7 = i3 + 31;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, roamingInternationalItem.title)) {
            int i9 = component3 + 27;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.routePath, roamingInternationalItem.routePath)) {
            return true;
        }
        int i11 = component3 + 83;
        ShareDataUIState = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 68 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.imageRes) * 31) + this.title.hashCode()) * 31) + this.routePath.hashCode();
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingInternationalItem(imageRes=" + this.imageRes + ", title=" + this.title + ", routePath=" + this.routePath + ")";
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return str;
    }
}
