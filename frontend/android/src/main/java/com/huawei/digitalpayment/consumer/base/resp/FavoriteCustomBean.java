package com.huawei.digitalpayment.consumer.base.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomBean;", "Ljava/io/Serializable;", "serviceType", "", "favoriteCategory", "createTime", "", "consumerId", GriverCacheDao.COLUMN_CACHE_ID, "favoriteContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceType", "()Ljava/lang/String;", "getFavoriteCategory", "getCreateTime", "()J", "getConsumerId", "getId", "getFavoriteContent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteCustomBean implements Serializable {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final String consumerId;
    private final long createTime;
    private final String favoriteCategory;
    private final String favoriteContent;
    private final String id;
    private final String serviceType;

    public FavoriteCustomBean(String str, String str2, long j, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.serviceType = str;
        this.favoriteCategory = str2;
        this.createTime = j;
        this.consumerId = str3;
        this.id = str4;
        this.favoriteContent = str5;
    }

    public final String getServiceType() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.serviceType;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFavoriteCategory() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.favoriteCategory;
            int i4 = 45 / 0;
        } else {
            str = this.favoriteCategory;
        }
        int i5 = i2 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long getCreateTime() {
        long j;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.createTime;
            int i4 = 13 / 0;
        } else {
            j = this.createTime;
        }
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String getConsumerId() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.consumerId;
            int i4 = 7 / 0;
        } else {
            str = this.consumerId;
        }
        int i5 = i2 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFavoriteContent() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.favoriteContent;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavoriteCustomBean copy$default(FavoriteCustomBean favoriteCustomBean, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
        long j2;
        String str6;
        String str7;
        int i2 = 2 % 2;
        String str8 = (i & 1) != 0 ? favoriteCustomBean.serviceType : str;
        String str9 = (i & 2) != 0 ? favoriteCustomBean.favoriteCategory : str2;
        if ((i & 4) != 0) {
            int i3 = copydefault + 27;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                j2 = favoriteCustomBean.createTime;
                int i4 = 92 / 0;
            } else {
                j2 = favoriteCustomBean.createTime;
            }
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            int i5 = copydefault + 77;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str6 = favoriteCustomBean.consumerId;
        } else {
            str6 = str3;
        }
        if ((i & 16) != 0) {
            int i7 = ShareDataUIState + 97;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                str7 = favoriteCustomBean.id;
                int i8 = 6 / 0;
            } else {
                str7 = favoriteCustomBean.id;
            }
        } else {
            str7 = str4;
        }
        FavoriteCustomBean favoriteCustomBeanCopy = favoriteCustomBean.copy(str8, str9, j2, str6, str7, (i & 32) != 0 ? favoriteCustomBean.favoriteContent : str5);
        int i9 = copydefault + 55;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 74 / 0;
        }
        return favoriteCustomBeanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.serviceType;
        int i4 = i3 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.favoriteCategory;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.createTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.consumerId;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 105;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.favoriteContent;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FavoriteCustomBean copy(String serviceType, String favoriteCategory, long createTime, String consumerId, String id, String favoriteContent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        Intrinsics.checkNotNullParameter(favoriteCategory, "");
        Intrinsics.checkNotNullParameter(consumerId, "");
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(favoriteContent, "");
        FavoriteCustomBean favoriteCustomBean = new FavoriteCustomBean(serviceType, favoriteCategory, createTime, consumerId, id, favoriteContent);
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return favoriteCustomBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteCustomBean)) {
            return false;
        }
        FavoriteCustomBean favoriteCustomBean = (FavoriteCustomBean) other;
        if ((!Intrinsics.areEqual(this.serviceType, favoriteCustomBean.serviceType)) || !Intrinsics.areEqual(this.favoriteCategory, favoriteCustomBean.favoriteCategory) || this.createTime != favoriteCustomBean.createTime) {
            return false;
        }
        if (!Intrinsics.areEqual(this.consumerId, favoriteCustomBean.consumerId)) {
            int i2 = ShareDataUIState + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, favoriteCustomBean.id)) {
            return false;
        }
        if (Intrinsics.areEqual(this.favoriteContent, favoriteCustomBean.favoriteContent)) {
            return true;
        }
        int i4 = ShareDataUIState + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.serviceType.hashCode() * 31) + this.favoriteCategory.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.consumerId.hashCode()) * 31) + this.id.hashCode()) * 31) + this.favoriteContent.hashCode();
        int i4 = ShareDataUIState + 93;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteCustomBean(serviceType=" + this.serviceType + ", favoriteCategory=" + this.favoriteCategory + ", createTime=" + this.createTime + ", consumerId=" + this.consumerId + ", id=" + this.id + ", favoriteContent=" + this.favoriteContent + ")";
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
