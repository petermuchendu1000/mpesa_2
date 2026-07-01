package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentMiniApp;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "antId", "name", "description", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAntId", "getName", "getDescription", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentMiniApp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FrequentMiniApp> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String antId;
    private final String description;
    private final String iconUrl;
    private final String id;
    private final String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FrequentMiniApp> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FrequentMiniApp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FrequentMiniApp frequentMiniApp = new FrequentMiniApp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 113;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return frequentMiniApp;
        }

        @Override
        public FrequentMiniApp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FrequentMiniApp frequentMiniAppCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 113;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return frequentMiniAppCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FrequentMiniApp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 109;
            component3 = i3 % 128;
            FrequentMiniApp[] frequentMiniAppArr = new FrequentMiniApp[i];
            if (i3 % 2 == 0) {
                return frequentMiniAppArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FrequentMiniApp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 65;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            FrequentMiniApp[] frequentMiniAppArrNewArray = newArray(i);
            int i4 = component3 + 11;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return frequentMiniAppArrNewArray;
            }
            throw null;
        }
    }

    public FrequentMiniApp(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.antId = str2;
        this.name = str3;
        this.description = str4;
        this.iconUrl = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrequentMiniApp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 8) != 0) {
            int i3 = component2 + 35;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i6 = component2 + 93;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str8 = null;
        } else {
            str8 = str5;
        }
        this(str6, str2, str3, str7, str8);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAntId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.antId;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.description;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i3 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = copydefault + 35;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FrequentMiniApp copy$default(FrequentMiniApp frequentMiniApp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = frequentMiniApp.id;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = frequentMiniApp.antId;
        }
        String str7 = str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = component2 + 105;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                String str8 = frequentMiniApp.name;
                obj2.hashCode();
                throw null;
            }
            str3 = frequentMiniApp.name;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            int i4 = component3 + 73;
            int i5 = i4 % 128;
            component2 = i5;
            if (i4 % 2 != 0) {
                String str10 = frequentMiniApp.description;
                throw null;
            }
            str4 = frequentMiniApp.description;
            int i6 = i5 + 97;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            str5 = frequentMiniApp.iconUrl;
        }
        FrequentMiniApp frequentMiniAppCopy = frequentMiniApp.copy(str6, str7, str9, str11, str5);
        int i8 = component2 + 71;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return frequentMiniAppCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.antId;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.description;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i2 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FrequentMiniApp copy(String id, String antId, String name, String description, String iconUrl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(antId, "");
        Intrinsics.checkNotNullParameter(name, "");
        FrequentMiniApp frequentMiniApp = new FrequentMiniApp(id, antId, name, description, iconUrl);
        int i2 = component3 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return frequentMiniApp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 47;
            component2 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof FrequentMiniApp)) {
            int i3 = component3 + 79;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
            return false;
        }
        FrequentMiniApp frequentMiniApp = (FrequentMiniApp) other;
        if (!Intrinsics.areEqual(this.id, frequentMiniApp.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.antId, frequentMiniApp.antId)) {
            int i5 = component3 + 35;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, frequentMiniApp.name)) {
            int i7 = component3 + 1;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, frequentMiniApp.description)) {
            int i9 = component2 + 91;
            component3 = i9 % 128;
            return i9 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.iconUrl, frequentMiniApp.iconUrl)) {
            return true;
        }
        int i10 = component2 + 3;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.id;
        if (str == null) {
            int i2 = component3 + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode3 = this.antId.hashCode();
        int iHashCode4 = this.name.hashCode();
        String str2 = this.description;
        if (str2 == null) {
            int i4 = component3 + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.iconUrl;
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentMiniApp(id=" + this.id + ", antId=" + this.antId + ", name=" + this.name + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ")";
        int i2 = component3 + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.antId);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.iconUrl);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
    }
}
