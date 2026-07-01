package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0005H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/MiniAppOrderInDiscoveryCategory;", "Landroid/os/Parcelable;", "discoveryCategory", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;", "miniAppOrderInDiscoveryCategory", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;I)V", "getDiscoveryCategory", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;", "setDiscoveryCategory", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;)V", "getMiniAppOrderInDiscoveryCategory", "()I", "setMiniAppOrderInDiscoveryCategory", "(I)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppOrderInDiscoveryCategory implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MiniAppOrderInDiscoveryCategory> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private DiscoveryCategory discoveryCategory;
    private int miniAppOrderInDiscoveryCategory;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniAppOrderInDiscoveryCategory> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniAppOrderInDiscoveryCategory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                discoveryCategory.hashCode();
                throw null;
            }
            MiniAppOrderInDiscoveryCategory miniAppOrderInDiscoveryCategory = new MiniAppOrderInDiscoveryCategory(parcel.readInt() != 0 ? DiscoveryCategory.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            int i4 = component3 + 43;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return miniAppOrderInDiscoveryCategory;
        }

        @Override
        public MiniAppOrderInDiscoveryCategory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 93;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            MiniAppOrderInDiscoveryCategory miniAppOrderInDiscoveryCategoryCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 41;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return miniAppOrderInDiscoveryCategoryCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniAppOrderInDiscoveryCategory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 75;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            MiniAppOrderInDiscoveryCategory[] miniAppOrderInDiscoveryCategoryArr = new MiniAppOrderInDiscoveryCategory[i];
            int i6 = i4 + 119;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return miniAppOrderInDiscoveryCategoryArr;
        }

        @Override
        public MiniAppOrderInDiscoveryCategory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 117;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            MiniAppOrderInDiscoveryCategory[] miniAppOrderInDiscoveryCategoryArrNewArray = newArray(i);
            int i5 = component3 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return miniAppOrderInDiscoveryCategoryArrNewArray;
        }
    }

    public MiniAppOrderInDiscoveryCategory(DiscoveryCategory discoveryCategory, int i) {
        this.discoveryCategory = discoveryCategory;
        this.miniAppOrderInDiscoveryCategory = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppOrderInDiscoveryCategory(DiscoveryCategory discoveryCategory, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component3 + 123;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            discoveryCategory = null;
        }
        if ((i2 & 2) != 0) {
            int i5 = component3 + 23;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(discoveryCategory, i);
    }

    public final DiscoveryCategory getDiscoveryCategory() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        DiscoveryCategory discoveryCategory = this.discoveryCategory;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return discoveryCategory;
    }

    public final void setDiscoveryCategory(DiscoveryCategory discoveryCategory) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.discoveryCategory = discoveryCategory;
        int i5 = i3 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getMiniAppOrderInDiscoveryCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.miniAppOrderInDiscoveryCategory;
        int i6 = i3 + 25;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final void setMiniAppOrderInDiscoveryCategory(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.miniAppOrderInDiscoveryCategory = i;
        if (i5 == 0) {
            int i6 = 92 / 0;
        }
        int i7 = i3 + 15;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 23 / 0;
        }
    }

    static {
        int i = copydefault + 19;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiniAppOrderInDiscoveryCategory() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static MiniAppOrderInDiscoveryCategory copy$default(MiniAppOrderInDiscoveryCategory miniAppOrderInDiscoveryCategory, DiscoveryCategory discoveryCategory, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = ShareDataUIState + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            discoveryCategory = miniAppOrderInDiscoveryCategory.discoveryCategory;
        }
        if ((i2 & 2) != 0) {
            i = miniAppOrderInDiscoveryCategory.miniAppOrderInDiscoveryCategory;
            int i6 = ShareDataUIState + 83;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 5;
            }
        }
        return miniAppOrderInDiscoveryCategory.copy(discoveryCategory, i);
    }

    public final DiscoveryCategory component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        DiscoveryCategory discoveryCategory = this.discoveryCategory;
        int i4 = i2 + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return discoveryCategory;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.miniAppOrderInDiscoveryCategory;
        int i6 = i2 + 45;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final MiniAppOrderInDiscoveryCategory copy(DiscoveryCategory discoveryCategory, int miniAppOrderInDiscoveryCategory) {
        int i = 2 % 2;
        MiniAppOrderInDiscoveryCategory miniAppOrderInDiscoveryCategory2 = new MiniAppOrderInDiscoveryCategory(discoveryCategory, miniAppOrderInDiscoveryCategory);
        int i2 = ShareDataUIState + 15;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return miniAppOrderInDiscoveryCategory2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof MiniAppOrderInDiscoveryCategory)) {
            int i4 = ShareDataUIState + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        MiniAppOrderInDiscoveryCategory miniAppOrderInDiscoveryCategory = (MiniAppOrderInDiscoveryCategory) other;
        if (!Intrinsics.areEqual(this.discoveryCategory, miniAppOrderInDiscoveryCategory.discoveryCategory)) {
            return false;
        }
        if (this.miniAppOrderInDiscoveryCategory != miniAppOrderInDiscoveryCategory.miniAppOrderInDiscoveryCategory) {
            int i6 = ShareDataUIState + 47;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = ShareDataUIState + 65;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        DiscoveryCategory discoveryCategory = this.discoveryCategory;
        if (discoveryCategory == null) {
            iHashCode = 1;
            int i2 = ShareDataUIState + 1;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = 0;
            }
        } else {
            iHashCode = discoveryCategory.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + Integer.hashCode(this.miniAppOrderInDiscoveryCategory);
        int i3 = component3 + 91;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppOrderInDiscoveryCategory(discoveryCategory=" + this.discoveryCategory + ", miniAppOrderInDiscoveryCategory=" + this.miniAppOrderInDiscoveryCategory + ")";
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[PHI: r1
  0x0024: PHI (r1v5 com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory) = 
  (r1v4 com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory)
  (r1v7 com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory)
 binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniAppOrderInDiscoveryCategory.ShareDataUIState
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniAppOrderInDiscoveryCategory.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r1 != 0) goto L1c
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory r1 = r4.discoveryCategory
            r3 = 27
            int r3 = r3 / r2
            if (r1 != 0) goto L24
            goto L20
        L1c:
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory r1 = r4.discoveryCategory
            if (r1 != 0) goto L24
        L20:
            r5.writeInt(r2)
            goto L34
        L24:
            r2 = 1
            r5.writeInt(r2)
            r1.writeToParcel(r5, r6)
            int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniAppOrderInDiscoveryCategory.component3
            int r6 = r6 + 33
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniAppOrderInDiscoveryCategory.ShareDataUIState = r1
            int r6 = r6 % r0
        L34:
            int r6 = r4.miniAppOrderInDiscoveryCategory
            r5.writeInt(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniAppOrderInDiscoveryCategory.writeToParcel(android.os.Parcel, int):void");
    }
}
