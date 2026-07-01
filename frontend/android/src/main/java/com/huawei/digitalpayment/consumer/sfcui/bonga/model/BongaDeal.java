package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import com.alibaba.griver.core.GriverParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDeal;", "", "title", "", "points", GriverParams.ShareParams.IMAGE_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPoints", "getImageUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaDeal {
    public static final int $stable = 0;
    private static int ShareDataUIState = 5 % 128;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copy;
    private final String component1;
    private final String component3;
    private final String copydefault;

    public BongaDeal(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.component1 = str2;
        this.component3 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaDeal(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copy + 105;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component4 + 63;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 83;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPoints() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 87;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 29;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getImageUrl() {
        String str;
        int i = 2 % 2;
        int i2 = copy + 111;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            str = this.component3;
            int i4 = 56 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i3 + 35;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (5 % 2 == 0) {
            throw null;
        }
    }

    public static BongaDeal copy$default(BongaDeal bongaDeal, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 103;
        component4 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 9;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            str = bongaDeal.copydefault;
            int i7 = i3 + 49;
            component4 = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 2) != 0) {
            int i9 = component4 + 81;
            int i10 = i9 % 128;
            copy = i10;
            int i11 = i9 % 2;
            str2 = bongaDeal.component1;
            int i12 = i10 + 93;
            component4 = i12 % 128;
            int i13 = i12 % 2;
        }
        if ((i & 4) != 0) {
            str3 = bongaDeal.component3;
        }
        return bongaDeal.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 21;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 119;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 1;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 31;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final BongaDeal copy(String title, String points, String imageUrl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(points, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        BongaDeal bongaDeal = new BongaDeal(title, points, imageUrl);
        int i2 = component4 + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return bongaDeal;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 45;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaDeal)) {
            int i5 = i2 + 35;
            component4 = i5 % 128;
            return i5 % 2 == 0;
        }
        BongaDeal bongaDeal = (BongaDeal) other;
        if (!Intrinsics.areEqual(this.copydefault, bongaDeal.copydefault)) {
            int i6 = copy + 51;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, bongaDeal.component1)) {
            int i8 = component4 + 63;
            copy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component3, bongaDeal.component3)) {
            return true;
        }
        int i10 = copy + 67;
        component4 = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 121;
        component4 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.copydefault.hashCode() << 77) << this.component1.hashCode()) + 50) / this.component3.hashCode() : (((this.copydefault.hashCode() * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode();
        int i3 = copy + 99;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaDeal(title=" + this.copydefault + ", points=" + this.component1 + ", imageUrl=" + this.component3 + ")";
        int i2 = component4 + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
