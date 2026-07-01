package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.api.constants.GriverEvents;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003JV\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0003H\u0007J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-H×\u0003J\t\u0010.\u001a\u00020\u0003H×\u0001J\t\u0010/\u001a\u000200H×\u0001J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItem;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "title", "description", "icon", "tintColor", "isIconTinted", "", "itemType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;", "<init>", "(IILjava/lang/Integer;IIZLcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;)V", "getId", "()I", "getTitle", GriverEvents.EVENT_SET_TITLE, "(I)V", "getDescription", "()Ljava/lang/Integer;", "setDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIcon", "setIcon", "getTintColor", "setTintColor", "()Z", "getItemType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;", "setItemType", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IILjava/lang/Integer;IIZLcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;)Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItem;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalDashboardItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpesaGlobalDashboardItem> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private Integer description;
    private int icon;
    private final int id;
    private final boolean isIconTinted;
    private MpesaGlobalDashboardItemType itemType;
    private int tintColor;
    private int title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MpesaGlobalDashboardItem> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaGlobalDashboardItem createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                num.hashCode();
                throw null;
            }
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i8 = copydefault + 13;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            return new MpesaGlobalDashboardItem(i4, i5, numValueOf, i6, i7, z, (MpesaGlobalDashboardItemType) parcel.readParcelable(MpesaGlobalDashboardItem.class.getClassLoader()));
        }

        @Override
        public MpesaGlobalDashboardItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 93;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaGlobalDashboardItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 51;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            MpesaGlobalDashboardItem[] mpesaGlobalDashboardItemArr = new MpesaGlobalDashboardItem[i];
            int i6 = i4 + 83;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 0;
            }
            return mpesaGlobalDashboardItemArr;
        }

        @Override
        public MpesaGlobalDashboardItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 81;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            MpesaGlobalDashboardItem[] mpesaGlobalDashboardItemArrNewArray = newArray(i);
            int i5 = copydefault + 15;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return mpesaGlobalDashboardItemArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public MpesaGlobalDashboardItem(int i, int i2, Integer num, int i3, int i4, boolean z, MpesaGlobalDashboardItemType mpesaGlobalDashboardItemType) {
        Intrinsics.checkNotNullParameter(mpesaGlobalDashboardItemType, "");
        this.id = i;
        this.title = i2;
        this.description = num;
        this.icon = i3;
        this.tintColor = i4;
        this.isIconTinted = z;
        this.itemType = mpesaGlobalDashboardItemType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MpesaGlobalDashboardItem(int i, int i2, Integer num, int i3, int i4, boolean z, MpesaGlobalDashboardItemType mpesaGlobalDashboardItemType, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6;
        Integer num2;
        int i7;
        boolean z2;
        if ((i5 & 1) != 0) {
            int i8 = component2 + 65;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            i6 = 0;
        } else {
            i6 = i;
        }
        if ((i5 & 4) != 0) {
            int i10 = copydefault + 105;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i5 & 16) != 0) {
            int i12 = component2 + 3;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            i7 = 0;
        } else {
            i7 = i4;
        }
        if ((i5 & 32) != 0) {
            int i15 = copydefault + 67;
            component2 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        this(i6, i2, num2, i3, i7, z2, (i5 & 64) != 0 ? MpesaGlobalDashboardItemType.Transaction.INSTANCE : mpesaGlobalDashboardItemType);
    }

    public final int getId() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 57;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0) {
            i = this.id;
            int i5 = 89 / 0;
        } else {
            i = this.id;
        }
        int i6 = i4 + 55;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int getTitle() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 17;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0) {
            i = this.title;
            int i5 = 81 / 0;
        } else {
            i = this.title;
        }
        int i6 = i4 + 109;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final void setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.title = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final Integer getDescription() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.description;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setDescription(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.description = num;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getIcon() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 5;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0) {
            i = this.icon;
            int i5 = 75 / 0;
        } else {
            i = this.icon;
        }
        int i6 = i4 + 27;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 45;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        this.icon = i;
        int i6 = i4 + 73;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getTintColor() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tintColor;
        }
        throw null;
    }

    public final void setTintColor(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.tintColor = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final boolean isIconTinted() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isIconTinted;
        int i5 = i3 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final MpesaGlobalDashboardItemType getItemType() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalDashboardItemType mpesaGlobalDashboardItemType = this.itemType;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return mpesaGlobalDashboardItemType;
    }

    public final void setItemType(MpesaGlobalDashboardItemType mpesaGlobalDashboardItemType) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mpesaGlobalDashboardItemType, "");
        this.itemType = mpesaGlobalDashboardItemType;
        int i4 = copydefault + 63;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
    }

    static {
        int i = component1 + 123;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static MpesaGlobalDashboardItem copy$default(MpesaGlobalDashboardItem mpesaGlobalDashboardItem, int i, int i2, Integer num, int i3, int i4, boolean z, MpesaGlobalDashboardItemType mpesaGlobalDashboardItemType, int i5, Object obj) {
        int i6 = 2 % 2;
        Object obj2 = null;
        if ((i5 & 1) != 0) {
            int i7 = component2 + 123;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = mpesaGlobalDashboardItem.id;
                throw null;
            }
            i = mpesaGlobalDashboardItem.id;
        }
        int i9 = i;
        if ((i5 & 2) != 0) {
            int i10 = component2 + 109;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            i2 = mpesaGlobalDashboardItem.title;
        }
        int i12 = i2;
        if ((i5 & 4) != 0) {
            int i13 = component2 + 123;
            int i14 = i13 % 128;
            copydefault = i14;
            int i15 = i13 % 2;
            num = mpesaGlobalDashboardItem.description;
            int i16 = i14 + 7;
            component2 = i16 % 128;
            int i17 = i16 % 2;
        }
        Integer num2 = num;
        if ((i5 & 8) != 0) {
            i3 = mpesaGlobalDashboardItem.icon;
        }
        int i18 = i3;
        if ((i5 & 16) != 0) {
            int i19 = copydefault + 113;
            component2 = i19 % 128;
            int i20 = i19 % 2;
            i4 = mpesaGlobalDashboardItem.tintColor;
        }
        int i21 = i4;
        if ((i5 & 32) != 0) {
            int i22 = copydefault + 89;
            component2 = i22 % 128;
            if (i22 % 2 == 0) {
                boolean z2 = mpesaGlobalDashboardItem.isIconTinted;
                obj2.hashCode();
                throw null;
            }
            z = mpesaGlobalDashboardItem.isIconTinted;
        }
        boolean z3 = z;
        if ((i5 & 64) != 0) {
            mpesaGlobalDashboardItemType = mpesaGlobalDashboardItem.itemType;
        }
        return mpesaGlobalDashboardItem.copy(i9, i12, num2, i18, i21, z3, mpesaGlobalDashboardItemType);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.title;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return i4;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.description;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return num;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.icon;
        int i6 = i2 + 7;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.tintColor;
        if (i3 == 0) {
            int i5 = 59 / 0;
        }
        return i4;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isIconTinted;
        int i4 = i3 + 91;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return z;
    }

    public final MpesaGlobalDashboardItemType component7() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        MpesaGlobalDashboardItemType mpesaGlobalDashboardItemType = this.itemType;
        int i4 = i2 + 59;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return mpesaGlobalDashboardItemType;
        }
        obj.hashCode();
        throw null;
    }

    public final MpesaGlobalDashboardItem copy(int id, int title, Integer description, int icon, int tintColor, boolean isIconTinted, MpesaGlobalDashboardItemType itemType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(itemType, "");
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem = new MpesaGlobalDashboardItem(id, title, description, icon, tintColor, isIconTinted, itemType);
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return mpesaGlobalDashboardItem;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MpesaGlobalDashboardItem)) {
            int i2 = component2 + 19;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem = (MpesaGlobalDashboardItem) other;
        if (this.id != mpesaGlobalDashboardItem.id) {
            return false;
        }
        if (this.title != mpesaGlobalDashboardItem.title) {
            int i3 = copydefault + 9;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, mpesaGlobalDashboardItem.description)) {
            int i5 = component2 + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.icon != mpesaGlobalDashboardItem.icon) {
            return false;
        }
        if (this.tintColor != mpesaGlobalDashboardItem.tintColor) {
            int i7 = component2 + 53;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.isIconTinted != mpesaGlobalDashboardItem.isIconTinted) {
            return false;
        }
        Object obj = null;
        if (Intrinsics.areEqual(this.itemType, mpesaGlobalDashboardItem.itemType)) {
            int i9 = component2 + 103;
            copydefault = i9 % 128;
            if (i9 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i10 = component2 + 3;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Integer.hashCode(this.id);
        int iHashCode3 = Integer.hashCode(this.title);
        Integer num = this.description;
        if (num == null) {
            int i2 = component2;
            int i3 = i2 + 17;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 115;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode4 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.tintColor)) * 31) + Boolean.hashCode(this.isIconTinted)) * 31) + this.itemType.hashCode();
        int i7 = component2 + 39;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 0 / 0;
        }
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaGlobalDashboardItem(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", icon=" + this.icon + ", tintColor=" + this.tintColor + ", isIconTinted=" + this.isIconTinted + ", itemType=" + this.itemType + ')';
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.id);
        dest.writeInt(this.title);
        Integer num = this.description;
        if (num == null) {
            int i5 = copydefault + 15;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            dest.writeInt(1);
            int iIntValue = num.intValue();
            int i7 = component2 + 59;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            i = iIntValue;
        }
        dest.writeInt(i);
        dest.writeInt(this.icon);
        dest.writeInt(this.tintColor);
        dest.writeInt(this.isIconTinted ? 1 : 0);
        dest.writeParcelable(this.itemType, flags);
    }
}
