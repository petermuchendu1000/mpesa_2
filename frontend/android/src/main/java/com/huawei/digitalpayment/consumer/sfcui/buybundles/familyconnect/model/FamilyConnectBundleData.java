package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÇ\u0001J\b\u0010\"\u001a\u00020\nH\u0007J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H×\u0003J\t\u0010'\u001a\u00020\nH×\u0001J\t\u0010(\u001a\u00020\u0003H×\u0001J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBundleData;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "description", "amount", "", "units", "icon", "", "limit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getAmount", "()F", "getUnits", "getIcon", "()I", "getLimit", "toBundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectBundleData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyConnectBundleData> CREATOR = new Creator();

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final float amount;
    private final String description;
    private final int icon;
    private final String id;
    private final String limit;
    private final String name;
    private final String units;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyConnectBundleData> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectBundleData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FamilyConnectBundleData familyConnectBundleData = new FamilyConnectBundleData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readInt(), parcel.readString());
            int i2 = component1 + 87;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return familyConnectBundleData;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FamilyConnectBundleData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FamilyConnectBundleData familyConnectBundleDataCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            return familyConnectBundleDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectBundleData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 63;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            FamilyConnectBundleData[] familyConnectBundleDataArr = new FamilyConnectBundleData[i];
            int i6 = i3 + 21;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return familyConnectBundleDataArr;
        }

        @Override
        public FamilyConnectBundleData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 17;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FamilyConnectBundleData[] familyConnectBundleDataArrNewArray = newArray(i);
            int i5 = component1 + 123;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return familyConnectBundleDataArrNewArray;
        }
    }

    public FamilyConnectBundleData(String str, String str2, String str3, float f, String str4, int i, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.amount = f;
        this.units = str4;
        this.icon = i;
        this.limit = str5;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 61;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final float getAmount() {
        float f;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            f = this.amount;
            int i4 = 19 / 0;
        } else {
            f = this.amount;
        }
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String getUnits() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.units;
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.icon;
        if (i3 != 0) {
            int i5 = 20 / 0;
        }
        return i4;
    }

    public final String getLimit() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.limit;
        int i4 = i3 + 17;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBundleData$Companion;", "", "<init>", "()V", "fromBundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBundleData;", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "limit", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component2;

        private Companion() {
        }

        public final FamilyConnectBundleData fromBundle(Bundle bundle, String limit) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(limit, "");
            FamilyConnectBundleData familyConnectBundleData = new FamilyConnectBundleData(bundle.getId(), bundle.getName(), bundle.getDescription(), bundle.getAmount().floatValue(), bundle.getUnits().name(), bundle.getIcon(), limit);
            int i2 = component2 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return familyConnectBundleData;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Bundle toBundle() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(this.icon, this.id, this.name, this.description, this.amount, CounterUnits.valueOf(this.units), null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, null, null, null, null, null, null, 523456, null);
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return bundle;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component3 + 77;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static FamilyConnectBundleData copy$default(FamilyConnectBundleData familyConnectBundleData, String str, String str2, String str3, float f, String str4, int i, String str5, int i2, Object obj) {
        String str6;
        String str7;
        float f2;
        String str8;
        String str9;
        int i3 = 2 % 2;
        int i4 = copydefault;
        int i5 = i4 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        String str10 = (i2 & 1) != 0 ? familyConnectBundleData.id : str;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 73;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str6 = familyConnectBundleData.name;
        } else {
            str6 = str2;
        }
        if ((i2 & 4) != 0) {
            str7 = familyConnectBundleData.description;
            int i9 = i4 + 99;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 % 4;
            }
        } else {
            str7 = str3;
        }
        if ((i2 & 8) != 0) {
            int i11 = i4 + 27;
            component2 = i11 % 128;
            if (i11 % 2 != 0) {
                float f3 = familyConnectBundleData.amount;
                throw null;
            }
            f2 = familyConnectBundleData.amount;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            int i12 = i4 + 27;
            component2 = i12 % 128;
            if (i12 % 2 != 0) {
                String str11 = familyConnectBundleData.units;
                throw null;
            }
            str8 = familyConnectBundleData.units;
        } else {
            str8 = str4;
        }
        int i13 = (i2 & 32) != 0 ? familyConnectBundleData.icon : i;
        if ((i2 & 64) != 0) {
            int i14 = component2 + 3;
            copydefault = i14 % 128;
            if (i14 % 2 == 0) {
                String str12 = familyConnectBundleData.limit;
                throw null;
            }
            str9 = familyConnectBundleData.limit;
        } else {
            str9 = str5;
        }
        return familyConnectBundleData.copy(str10, str6, str7, f2, str8, i13, str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 117;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float component4() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        float f = this.amount;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.units;
        int i4 = i3 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.icon;
        int i5 = i3 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.limit;
        }
        throw null;
    }

    public final FamilyConnectBundleData copy(String id, String name, String description, float amount, String units, int icon, String limit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(units, "");
        Intrinsics.checkNotNullParameter(limit, "");
        FamilyConnectBundleData familyConnectBundleData = new FamilyConnectBundleData(id, name, description, amount, units, icon, limit);
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return familyConnectBundleData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FamilyConnectBundleData)) {
            return false;
        }
        FamilyConnectBundleData familyConnectBundleData = (FamilyConnectBundleData) other;
        if (!Intrinsics.areEqual(this.id, familyConnectBundleData.id)) {
            int i4 = component2 + 81;
            copydefault = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.name, familyConnectBundleData.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.description, familyConnectBundleData.description)) {
            int i5 = component2 + 41;
            copydefault = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Float.compare(this.amount, familyConnectBundleData.amount) != 0 || !Intrinsics.areEqual(this.units, familyConnectBundleData.units) || this.icon != familyConnectBundleData.icon) {
            return false;
        }
        if (Intrinsics.areEqual(this.limit, familyConnectBundleData.limit)) {
            return true;
        }
        int i6 = copydefault + 81;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + Float.hashCode(this.amount)) * 31) + this.units.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.limit.hashCode();
        int i4 = copydefault + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectBundleData(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", amount=" + this.amount + ", units=" + this.units + ", icon=" + this.icon + ", limit=" + this.limit + ")";
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeFloat(this.amount);
        dest.writeString(this.units);
        dest.writeInt(this.icon);
        dest.writeString(this.limit);
        int i4 = copydefault + 25;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
