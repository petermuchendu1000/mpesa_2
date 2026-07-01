package com.huawei.digitalpayment.consumer.base.database.entities.favorite;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/favorite/MpesaFavoriteEntity;", "", "serviceType", "", "favoriteCategory", "createTime", "", "consumerId", GriverCacheDao.COLUMN_CACHE_ID, "favoriteContent", "listPosition", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getServiceType", "()Ljava/lang/String;", "getFavoriteCategory", "getCreateTime", "()J", "getConsumerId", "getId", "getFavoriteContent", "getListPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/base/database/entities/favorite/MpesaFavoriteEntity;", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaFavoriteEntity {
    private static int component4 = 0;
    private static int equals = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copy;
    private final long copydefault;
    private final Integer getAsAtTimestamp;

    public MpesaFavoriteEntity(String str, String str2, long j, String str3, String str4, String str5, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copy = str;
        this.component1 = str2;
        this.copydefault = j;
        this.ShareDataUIState = str3;
        this.component3 = str4;
        this.component2 = str5;
        this.getAsAtTimestamp = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MpesaFavoriteEntity(String str, String str2, long j, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        if ((i & 64) != 0) {
            int i2 = component4;
            int i3 = i2 + 79;
            equals = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        this(str, str2, j, str3, str4, str5, num2);
    }

    public final String getServiceType() {
        int i = 2 % 2;
        int i2 = equals + 123;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 85;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFavoriteCategory() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 41;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 81;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long getCreateTime() {
        int i = 2 % 2;
        int i2 = equals + 105;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getConsumerId() {
        String str;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 65;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 38 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 59;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component4 + 33;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getFavoriteContent() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 45;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 81;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getListPosition() {
        int i = 2 % 2;
        int i2 = equals + 51;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MpesaFavoriteEntity copy$default(MpesaFavoriteEntity mpesaFavoriteEntity, String str, String str2, long j, String str3, String str4, String str5, Integer num, int i, Object obj) {
        String str6;
        Integer num2;
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 115;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        String str7 = (i & 1) != 0 ? mpesaFavoriteEntity.copy : str;
        String str8 = (i & 2) != 0 ? mpesaFavoriteEntity.component1 : str2;
        long j2 = (i & 4) != 0 ? mpesaFavoriteEntity.copydefault : j;
        String str9 = (i & 8) != 0 ? mpesaFavoriteEntity.ShareDataUIState : str3;
        if ((i & 16) != 0) {
            int i6 = i3 + 13;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            str6 = mpesaFavoriteEntity.component3;
        } else {
            str6 = str4;
        }
        String str10 = (i & 32) != 0 ? mpesaFavoriteEntity.component2 : str5;
        if ((i & 64) != 0) {
            int i8 = component4 + 89;
            equals = i8 % 128;
            if (i8 % 2 == 0) {
                Integer num3 = mpesaFavoriteEntity.getAsAtTimestamp;
                throw null;
            }
            num2 = mpesaFavoriteEntity.getAsAtTimestamp;
        } else {
            num2 = num;
        }
        return mpesaFavoriteEntity.copy(str7, str8, j2, str9, str6, str10, num2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 37;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 37;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 125;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 29;
        equals = i3 % 128;
        int i4 = i3 % 2;
        long j = this.copydefault;
        int i5 = i2 + 87;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4 + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component4 + 43;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 75;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 67;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 21 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 11;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 11;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.getAsAtTimestamp;
        int i5 = i2 + 107;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final MpesaFavoriteEntity copy(String serviceType, String favoriteCategory, long createTime, String consumerId, String id, String favoriteContent, Integer listPosition) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        Intrinsics.checkNotNullParameter(favoriteCategory, "");
        Intrinsics.checkNotNullParameter(consumerId, "");
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(favoriteContent, "");
        MpesaFavoriteEntity mpesaFavoriteEntity = new MpesaFavoriteEntity(serviceType, favoriteCategory, createTime, consumerId, id, favoriteContent, listPosition);
        int i2 = component4 + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return mpesaFavoriteEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MpesaFavoriteEntity)) {
            int i2 = equals + 119;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        MpesaFavoriteEntity mpesaFavoriteEntity = (MpesaFavoriteEntity) other;
        if (!Intrinsics.areEqual(this.copy, mpesaFavoriteEntity.copy) || !Intrinsics.areEqual(this.component1, mpesaFavoriteEntity.component1) || this.copydefault != mpesaFavoriteEntity.copydefault || !Intrinsics.areEqual(this.ShareDataUIState, mpesaFavoriteEntity.ShareDataUIState) || !Intrinsics.areEqual(this.component3, mpesaFavoriteEntity.component3) || !Intrinsics.areEqual(this.component2, mpesaFavoriteEntity.component2)) {
            return false;
        }
        if (Intrinsics.areEqual(this.getAsAtTimestamp, mpesaFavoriteEntity.getAsAtTimestamp)) {
            return true;
        }
        int i7 = component4 + 43;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 93 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.copy.hashCode();
        int iHashCode2 = this.component1.hashCode();
        int iHashCode3 = Long.hashCode(this.copydefault);
        int iHashCode4 = this.ShareDataUIState.hashCode();
        int iHashCode5 = this.component3.hashCode();
        int iHashCode6 = this.component2.hashCode();
        Integer num = this.getAsAtTimestamp;
        if (num == null) {
            int i3 = component4 + 53;
            equals = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode7 = num.hashCode();
            int i5 = equals + 29;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode7;
        }
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaFavoriteEntity(serviceType=" + this.copy + ", favoriteCategory=" + this.component1 + ", createTime=" + this.copydefault + ", consumerId=" + this.ShareDataUIState + ", id=" + this.component3 + ", favoriteContent=" + this.component2 + ", listPosition=" + this.getAsAtTimestamp + ")";
        int i2 = equals + 1;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
