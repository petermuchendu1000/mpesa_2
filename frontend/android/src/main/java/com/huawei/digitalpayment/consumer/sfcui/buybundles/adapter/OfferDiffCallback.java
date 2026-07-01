package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/OfferDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferDiffCallback extends DiffUtil.ItemCallback<Object> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 93 % 128;
    private static int component2 = 1;
    private static int copydefault;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean areItemsTheSame(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.copydefault
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.component2 = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5e
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.component2
            int r1 = r1 + 107
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.copydefault = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L2d
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp
            r4 = 30
            int r4 = r4 / r2
            if (r1 == r3) goto L32
            goto L5e
        L2d:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp
            if (r1 == r3) goto L32
            goto L5e
        L32:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp) r6
            java.lang.String r1 = r6.getProductId()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp r7 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp) r7
            java.lang.String r4 = r7.getProductId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r3
            if (r1 == 0) goto L46
            goto L90
        L46:
            java.lang.String r6 = r6.getAccountId()
            java.lang.String r7 = r7.getAccountId()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L90
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.component2
            int r6 = r6 + 15
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.copydefault = r7
            int r6 = r6 % r0
            goto L81
        L5e:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle
            if (r1 == 0) goto L90
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle
            if (r1 == 0) goto L90
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.component2
            int r1 = r1 + 49
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.copydefault = r4
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle) r6
            if (r1 != 0) goto L83
            long r0 = r6.getOfferId()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle r7 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle) r7
            long r6 = r7.getOfferId()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L90
        L81:
            r2 = r3
            goto L90
        L83:
            r6.getOfferId()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle r7 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle) r7
            r7.getOfferId()
            r6 = 0
            r6.hashCode()
            throw r6
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferDiffCallback.areItemsTheSame(java.lang.Object, java.lang.Object):boolean");
    }

    @Override
    public boolean areContentsTheSame(Object oldItem, Object newItem) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(oldItem, "");
        Intrinsics.checkNotNullParameter(newItem, "");
        boolean zAreEqual = Intrinsics.areEqual(oldItem, newItem);
        int i4 = component2 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return zAreEqual;
    }

    static {
        if (93 % 2 == 0) {
            int i = 59 / 0;
        }
    }
}
