package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"createHome5GlinkItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Home5gLinkBean;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Home5gLinkKt {
    private static int ShareDataUIState = 1;
    private static int component2;

    public static final List<Home5gLinkBean> createHome5GlinkItems() {
        int i = 2 % 2;
        Object objFromJson = new Gson().fromJson("[\n    {\n      \"title\": \"5G Covered Areas\",\n      \"subtitle\": \"View Areas\",\n      \"coverImageUrl\": \"https://firebasestorage.googleapis.com/v0/b/mysafaricom-b0c1c.appspot.com/o/5G%2F5g%20Covered%20areas.png?alt=media&token=1ef3a42b-5d78-488f-a367-d304bccb5860\",\n      \"linkUrl\": \"https://internet.safaricom.co.ke/5g-wireless/coverage\"\n    },\n    {\n      \"title\": \"5G Ready Devices\",\n      \"subtitle\": \"Buy Device\",\n      \"coverImageUrl\": \"https://firebasestorage.googleapis.com/v0/b/mysafaricom-b0c1c.appspot.com/o/5G%2F5g%20ready%20devices.png?alt=media&token=2147422c-025b-461a-b008-3f9fb557a56e\",\n      \"linkUrl\": \"https://www.masoko.com/phones-accessories/mobile-phones/5g-smartphones\"\n    }\n  ]", new TypeToken<List<? extends Home5gLinkBean>>() {
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        List<Home5gLinkBean> list = (List) objFromJson;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
