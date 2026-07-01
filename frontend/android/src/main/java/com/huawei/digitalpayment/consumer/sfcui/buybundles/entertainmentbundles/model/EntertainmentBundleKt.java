package com.huawei.digitalpayment.consumer.sfcui.buybundles.entertainmentbundles.model;

import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"entertainmentBundleList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/entertainmentbundles/model/EntertainmentBundle;", "getEntertainmentBundleList", "()Ljava/util/List;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EntertainmentBundleKt {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static final List<EntertainmentBundle> component3 = CollectionsKt.listOf(new EntertainmentBundle(R.drawable.ic_spotify, R.drawable.ic_spotify_trimmed, R.string.spotify_title, R.string.spotify_description, BundleId.Spotify));
    private static int copydefault = 1;

    public static final List<EntertainmentBundle> getEntertainmentBundleList() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<EntertainmentBundle> list = component3;
        int i4 = i3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        int i = component2 + 57;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }
}
