package com.huawei.digitalpayment.consumer.base.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomRespWrapper;", "Ljava/io/Serializable;", "businessType", "", "data", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomResp;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomResp;)V", "getBusinessType", "()Ljava/lang/String;", "setBusinessType", "(Ljava/lang/String;)V", "getData", "()Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomResp;", "setData", "(Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomResp;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteCustomRespWrapper implements Serializable {
    private static int component2 = 1;
    private static int component3;
    private String businessType;
    private FavoriteCustomResp data;

    public FavoriteCustomRespWrapper(String str, FavoriteCustomResp favoriteCustomResp) {
        Intrinsics.checkNotNullParameter(str, "");
        this.businessType = str;
        this.data = favoriteCustomResp;
    }

    public final String getBusinessType() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.businessType;
        int i5 = i3 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.businessType = str;
        int i4 = component3 + 9;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final FavoriteCustomResp getData() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FavoriteCustomResp favoriteCustomResp = this.data;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return favoriteCustomResp;
    }

    public final void setData(FavoriteCustomResp favoriteCustomResp) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.data = favoriteCustomResp;
        if (i4 == 0) {
            int i5 = 90 / 0;
        }
        int i6 = i3 + 41;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
    }

    public static FavoriteCustomRespWrapper copy$default(FavoriteCustomRespWrapper favoriteCustomRespWrapper, String str, FavoriteCustomResp favoriteCustomResp, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 67;
        component3 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 37;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str = favoriteCustomRespWrapper.businessType;
        }
        if ((i & 2) != 0) {
            favoriteCustomResp = favoriteCustomRespWrapper.data;
        }
        return favoriteCustomRespWrapper.copy(str, favoriteCustomResp);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.businessType;
        }
        throw null;
    }

    public final FavoriteCustomResp component2() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        FavoriteCustomResp favoriteCustomResp = this.data;
        int i4 = i3 + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return favoriteCustomResp;
    }

    public final FavoriteCustomRespWrapper copy(String businessType, FavoriteCustomResp data) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(businessType, "");
        FavoriteCustomRespWrapper favoriteCustomRespWrapper = new FavoriteCustomRespWrapper(businessType, data);
        int i2 = component3 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return favoriteCustomRespWrapper;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2;
            int i3 = i2 + 93;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof FavoriteCustomRespWrapper)) {
            int i7 = component2 + 97;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        FavoriteCustomRespWrapper favoriteCustomRespWrapper = (FavoriteCustomRespWrapper) other;
        if (Intrinsics.areEqual(this.businessType, favoriteCustomRespWrapper.businessType)) {
            return !(Intrinsics.areEqual(this.data, favoriteCustomRespWrapper.data) ^ true);
        }
        int i9 = component2 + 57;
        component3 = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 29;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.businessType.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.businessType.hashCode();
        FavoriteCustomResp favoriteCustomResp = this.data;
        if (favoriteCustomResp == null) {
            int i3 = component3 + 111;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = favoriteCustomResp.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteCustomRespWrapper(businessType=" + this.businessType + ", data=" + this.data + ")";
        int i2 = component2 + 3;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return str;
    }
}
