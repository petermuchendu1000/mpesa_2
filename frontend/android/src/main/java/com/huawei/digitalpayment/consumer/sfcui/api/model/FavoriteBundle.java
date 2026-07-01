package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\b\u0010 \u001a\u00020\u0003H\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020\u0003H×\u0001J\t\u0010&\u001a\u00020\u0005H×\u0001J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "", "iconUrl", "darkModeIconUrl", "deepLink", "externalUrl", "position", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getIconUrl", "getDarkModeIconUrl", "getDeepLink", "getExternalUrl", "getPosition", "setPosition", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteBundle implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FavoriteBundle> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("darkModeIconUrl")
    private final String darkModeIconUrl;

    @SerializedName("deepLink")
    private final String deepLink;

    @SerializedName("externalUrl")
    private final String externalUrl;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final int id;

    @SerializedName("name")
    private final String name;
    private int position;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteBundle> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavoriteBundle createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FavoriteBundle favoriteBundle = new FavoriteBundle(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return favoriteBundle;
        }

        @Override
        public FavoriteBundle createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FavoriteBundle favoriteBundleCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 111;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return favoriteBundleCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavoriteBundle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 43;
            copydefault = i3 % 128;
            FavoriteBundle[] favoriteBundleArr = new FavoriteBundle[i];
            if (i3 % 2 != 0) {
                return favoriteBundleArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FavoriteBundle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 125;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FavoriteBundle[] favoriteBundleArrNewArray = newArray(i);
            int i5 = copydefault + 121;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return favoriteBundleArrNewArray;
        }
    }

    public FavoriteBundle(int i, String str, String str2, String str3, String str4, String str5, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = i;
        this.name = str;
        this.iconUrl = str2;
        this.darkModeIconUrl = str3;
        this.deepLink = str4;
        this.externalUrl = str5;
        this.position = i2;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 9;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDarkModeIconUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.darkModeIconUrl;
        int i5 = i2 + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDeepLink() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.deepLink;
        int i4 = i3 + 103;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getExternalUrl() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.externalUrl;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getPosition() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.position;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPosition(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 83;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.position = i;
        int i6 = i4 + 47;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
    }

    static {
        int i = copydefault + 47;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 12 / 0;
        }
    }

    public static FavoriteBundle copy$default(FavoriteBundle favoriteBundle, int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, Object obj) {
        String str6;
        String str7;
        String str8;
        int i4;
        int i5 = 2 % 2;
        int i6 = (i3 & 1) != 0 ? favoriteBundle.id : i;
        String str9 = (i3 & 2) != 0 ? favoriteBundle.name : str;
        String str10 = (i3 & 4) != 0 ? favoriteBundle.iconUrl : str2;
        if ((i3 & 8) != 0) {
            int i7 = component1 + 123;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str6 = favoriteBundle.darkModeIconUrl;
        } else {
            str6 = str3;
        }
        if ((i3 & 16) != 0) {
            int i9 = component1 + 109;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                str7 = favoriteBundle.deepLink;
                int i10 = 14 / 0;
            } else {
                str7 = favoriteBundle.deepLink;
            }
        } else {
            str7 = str4;
        }
        if ((i3 & 32) != 0) {
            int i11 = component3;
            int i12 = i11 + 105;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            str8 = favoriteBundle.externalUrl;
            int i14 = i11 + 79;
            component1 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            str8 = str5;
        }
        if ((i3 & 64) != 0) {
            i4 = favoriteBundle.position;
            int i16 = component3 + 91;
            component1 = i16 % 128;
            int i17 = i16 % 2;
        } else {
            i4 = i2;
        }
        return favoriteBundle.copy(i6, str9, str10, str6, str7, str8, i4);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.id;
        int i6 = i3 + 33;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.darkModeIconUrl;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.deepLink;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.externalUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.position;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FavoriteBundle copy(int id, String name, String iconUrl, String darkModeIconUrl, String deepLink, String externalUrl, int position) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(iconUrl, "");
        Intrinsics.checkNotNullParameter(darkModeIconUrl, "");
        Intrinsics.checkNotNullParameter(deepLink, "");
        Intrinsics.checkNotNullParameter(externalUrl, "");
        FavoriteBundle favoriteBundle = new FavoriteBundle(id, name, iconUrl, darkModeIconUrl, deepLink, externalUrl, position);
        int i2 = component3 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return favoriteBundle;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r7 instanceof com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r7 = (com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.id == r7.id) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r1 = r1 + 23;
        com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.name, r7.name) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.iconUrl, r7.iconUrl) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.darkModeIconUrl, r7.darkModeIconUrl) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.deepLink, r7.deepLink) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 + 99;
        com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.externalUrl, r7.externalUrl) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 + 47;
        com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r6.position == r7.position) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 + 59;
        com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 107;
        com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r3 % 2) == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1
            int r2 = r1 + 29
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 95
            int r2 = r2 / r5
            if (r6 != r7) goto L23
            goto L18
        L16:
            if (r6 != r7) goto L23
        L18:
            int r3 = r3 + 107
            int r7 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 = r7
            int r3 = r3 % r0
            if (r3 == 0) goto L22
            r4 = r5
        L22:
            return r4
        L23:
            boolean r2 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle
            if (r2 != 0) goto L28
            return r5
        L28:
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle r7 = (com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle) r7
            int r2 = r6.id
            int r3 = r7.id
            if (r2 == r3) goto L38
            int r1 = r1 + 23
            int r7 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 = r7
            int r1 = r1 % r0
            return r5
        L38:
            java.lang.String r1 = r6.name
            java.lang.String r2 = r7.name
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L43
            return r5
        L43:
            java.lang.String r1 = r6.iconUrl
            java.lang.String r2 = r7.iconUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L4e
            return r5
        L4e:
            java.lang.String r1 = r6.darkModeIconUrl
            java.lang.String r2 = r7.darkModeIconUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L59
            return r5
        L59:
            java.lang.String r1 = r6.deepLink
            java.lang.String r2 = r7.deepLink
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L6d
            int r7 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3
            int r7 = r7 + 99
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 = r1
            int r7 = r7 % r0
            return r5
        L6d:
            java.lang.String r1 = r6.externalUrl
            java.lang.String r2 = r7.externalUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L81
            int r7 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1
            int r7 = r7 + 47
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3 = r1
            int r7 = r7 % r0
            return r5
        L81:
            int r1 = r6.position
            int r7 = r7.position
            if (r1 == r7) goto L88
            return r5
        L88:
            int r7 = com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component3
            int r7 = r7 + 59
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.component1 = r1
            int r7 = r7 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.darkModeIconUrl.hashCode()) * 31) + this.deepLink.hashCode()) * 31) + this.externalUrl.hashCode()) * 31) + Integer.hashCode(this.position);
        int i4 = component3 + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteBundle(id=" + this.id + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", darkModeIconUrl=" + this.darkModeIconUrl + ", deepLink=" + this.deepLink + ", externalUrl=" + this.externalUrl + ", position=" + this.position + ")";
        int i2 = component1 + 49;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.iconUrl);
        dest.writeString(this.darkModeIconUrl);
        dest.writeString(this.deepLink);
        dest.writeString(this.externalUrl);
        dest.writeInt(this.position);
        int i4 = component3 + 103;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
