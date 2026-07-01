package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/BuyBundleExpiryResp;", "Lcom/huawei/http/BaseResp;", "topUpPageData", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TopUpPageResp;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TopUpPageResp;)V", "getTopUpPageData", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TopUpPageResp;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyBundleExpiryResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 63 % 128;
    private static int component3;
    private final TopUpPageResp topUpPageData;

    public final TopUpPageResp getTopUpPageData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        TopUpPageResp topUpPageResp = this.topUpPageData;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return topUpPageResp;
    }

    public BuyBundleExpiryResp(TopUpPageResp topUpPageResp) {
        Intrinsics.checkNotNullParameter(topUpPageResp, "");
        this.topUpPageData = topUpPageResp;
    }

    static {
        int i = 63 % 2;
    }

    public static BuyBundleExpiryResp copy$default(BuyBundleExpiryResp buyBundleExpiryResp, TopUpPageResp topUpPageResp, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component3 + 77;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                TopUpPageResp topUpPageResp2 = buyBundleExpiryResp.topUpPageData;
                throw null;
            }
            topUpPageResp = buyBundleExpiryResp.topUpPageData;
        }
        BuyBundleExpiryResp buyBundleExpiryRespCopy = buyBundleExpiryResp.copy(topUpPageResp);
        int i4 = component3 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return buyBundleExpiryRespCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final TopUpPageResp component1() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TopUpPageResp topUpPageResp = this.topUpPageData;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return topUpPageResp;
    }

    public final BuyBundleExpiryResp copy(TopUpPageResp topUpPageData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(topUpPageData, "");
        BuyBundleExpiryResp buyBundleExpiryResp = new BuyBundleExpiryResp(topUpPageData);
        int i2 = component3 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return buyBundleExpiryResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 121;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 91 / 0;
            }
            return true;
        }
        if (other instanceof BuyBundleExpiryResp) {
            return Intrinsics.areEqual(this.topUpPageData, ((BuyBundleExpiryResp) other).topUpPageData);
        }
        int i7 = i2 + 93;
        ShareDataUIState = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.topUpPageData.hashCode();
            throw null;
        }
        int iHashCode = this.topUpPageData.hashCode();
        int i3 = ShareDataUIState + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuyBundleExpiryResp(topUpPageData=" + this.topUpPageData + ")";
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
