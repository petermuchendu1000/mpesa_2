package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0003J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ServiceDTO;", "Landroid/os/Parcelable;", "creationDate", "", "description", "", "iconBgColor", "iconUrl", GriverCacheDao.COLUMN_CACHE_ID, GriverParams.ShareParams.IMAGE_URL, "name", "trustLevel", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreationDate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getIconBgColor", "getIconUrl", "getId", "getImageUrl", "getName", "getTrustLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/resp/ServiceDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceDTO implements Parcelable {
    public static final Parcelable.Creator<ServiceDTO> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("creationDate")
    private final Integer creationDate;

    @SerializedName("description")
    private final String description;

    @SerializedName("iconBgColor")
    private final String iconBgColor;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @SerializedName(GriverParams.ShareParams.IMAGE_URL)
    private final String imageUrl;

    @SerializedName("name")
    private final String name;

    @SerializedName("trustLevel")
    private final String trustLevel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceDTO> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServiceDTO createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                numValueOf.hashCode();
                throw null;
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
                int i4 = component3 + 67;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            return new ServiceDTO(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public ServiceDTO createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServiceDTO[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 11;
            component2 = i4 % 128;
            ServiceDTO[] serviceDTOArr = new ServiceDTO[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 119;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
            }
            return serviceDTOArr;
        }

        @Override
        public ServiceDTO[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 53;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public ServiceDTO(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.creationDate = num;
        this.description = str;
        this.iconBgColor = str2;
        this.iconUrl = str3;
        this.id = str4;
        this.imageUrl = str5;
        this.name = str6;
        this.trustLevel = str7;
    }

    public final Integer getCreationDate() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.creationDate;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getIconBgColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.iconBgColor;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i2 + 85;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String getImageUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.imageUrl;
        int i4 = i2 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTrustLevel() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.trustLevel;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 117;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static ServiceDTO copy$default(ServiceDTO serviceDTO, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 79;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        Integer num2 = (i & 1) != 0 ? serviceDTO.creationDate : num;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i4 + 53;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                String str12 = serviceDTO.description;
                throw null;
            }
            str8 = serviceDTO.description;
        } else {
            str8 = str;
        }
        if ((i & 4) != 0) {
            int i7 = i4 + 103;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str9 = serviceDTO.iconBgColor;
        } else {
            str9 = str2;
        }
        String str13 = (i & 8) != 0 ? serviceDTO.iconUrl : str3;
        String str14 = (i & 16) != 0 ? serviceDTO.id : str4;
        String str15 = (i & 32) != 0 ? serviceDTO.imageUrl : str5;
        if ((i & 64) != 0) {
            int i9 = i4 + 47;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                String str16 = serviceDTO.name;
                obj2.hashCode();
                throw null;
            }
            str10 = serviceDTO.name;
        } else {
            str10 = str6;
        }
        if ((i & 128) != 0) {
            int i10 = i4 + 63;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            str11 = serviceDTO.trustLevel;
        } else {
            str11 = str7;
        }
        return serviceDTO.copy(num2, str8, str9, str13, str14, str15, str10, str11);
    }

    public final Integer component1() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.creationDate;
            int i4 = 14 / 0;
        } else {
            num = this.creationDate;
        }
        int i5 = i2 + 113;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconBgColor;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i3 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.imageUrl;
            int i4 = 84 / 0;
        } else {
            str = this.imageUrl;
        }
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.trustLevel;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final ServiceDTO copy(Integer creationDate, String description, String iconBgColor, String iconUrl, String id, String imageUrl, String name, String trustLevel) {
        int i = 2 % 2;
        ServiceDTO serviceDTO = new ServiceDTO(creationDate, description, iconBgColor, iconUrl, id, imageUrl, name, trustLevel);
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return serviceDTO;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 91;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof ServiceDTO)) {
            int i6 = component1 + 87;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        ServiceDTO serviceDTO = (ServiceDTO) other;
        if (!Intrinsics.areEqual(this.creationDate, serviceDTO.creationDate)) {
            int i8 = ShareDataUIState + 113;
            component1 = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.description, serviceDTO.description)) {
            int i9 = ShareDataUIState + 17;
            int i10 = i9 % 128;
            component1 = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 67;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 63 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.iconBgColor, serviceDTO.iconBgColor) || !Intrinsics.areEqual(this.iconUrl, serviceDTO.iconUrl) || !Intrinsics.areEqual(this.id, serviceDTO.id) || !Intrinsics.areEqual(this.imageUrl, serviceDTO.imageUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, serviceDTO.name)) {
            int i14 = component1 + 65;
            ShareDataUIState = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.trustLevel, serviceDTO.trustLevel)) {
            return true;
        }
        int i16 = ShareDataUIState + 41;
        component1 = i16 % 128;
        return i16 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.creationDate;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.description;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.iconBgColor;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUrl;
        if (str3 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            int i2 = ShareDataUIState + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        String str4 = this.id;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.imageUrl;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.name;
        if (str6 == null) {
            int i4 = ShareDataUIState + 119;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.trustLevel;
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServiceDTO(creationDate=" + this.creationDate + ", description=" + this.description + ", iconBgColor=" + this.iconBgColor + ", iconUrl=" + this.iconUrl + ", id=" + this.id + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", trustLevel=" + this.trustLevel + ")";
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            throw null;
        }
        Integer num = this.creationDate;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
            int i4 = component1 + 51;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.description);
        dest.writeString(this.iconBgColor);
        dest.writeString(this.iconUrl);
        dest.writeString(this.id);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeString(this.trustLevel);
        int i6 = component1 + 121;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
