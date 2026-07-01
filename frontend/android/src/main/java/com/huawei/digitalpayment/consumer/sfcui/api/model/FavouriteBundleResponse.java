package com.huawei.digitalpayment.consumer.sfcui.api.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavouriteBundleResponse;", "Lcom/huawei/http/BaseResp;", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;)V", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouriteBundleResponse extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("body")
    private final FavoriteBundleWrapper body;

    public final FavoriteBundleWrapper getBody() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FavoriteBundleWrapper favoriteBundleWrapper = this.body;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return favoriteBundleWrapper;
    }

    public FavouriteBundleResponse(FavoriteBundleWrapper favoriteBundleWrapper) {
        Intrinsics.checkNotNullParameter(favoriteBundleWrapper, "");
        this.body = favoriteBundleWrapper;
    }

    static {
        int i = 1 + 39;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavouriteBundleResponse copy$default(FavouriteBundleResponse favouriteBundleResponse, FavoriteBundleWrapper favoriteBundleWrapper, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 111;
        component2 = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            favoriteBundleWrapper = favouriteBundleResponse.body;
        }
        FavouriteBundleResponse favouriteBundleResponseCopy = favouriteBundleResponse.copy(favoriteBundleWrapper);
        int i4 = component2 + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return favouriteBundleResponseCopy;
    }

    public final FavoriteBundleWrapper component1() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        FavoriteBundleWrapper favoriteBundleWrapper = this.body;
        int i5 = i3 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return favoriteBundleWrapper;
    }

    public final FavouriteBundleResponse copy(FavoriteBundleWrapper body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(body, "");
        FavouriteBundleResponse favouriteBundleResponse = new FavouriteBundleResponse(body);
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return favouriteBundleResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof FavouriteBundleResponse))) {
            return Intrinsics.areEqual(this.body, ((FavouriteBundleResponse) other).body);
        }
        int i5 = i2 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 33;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.body.hashCode();
            int i3 = 74 / 0;
        } else {
            iHashCode = this.body.hashCode();
        }
        int i4 = ShareDataUIState + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavouriteBundleResponse(body=" + this.body + ")";
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
