package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"allFrequentCategories", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "getAllFrequentCategories", "()Ljava/util/List;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FrequentCategoryKt {
    private static int ShareDataUIState = 0;
    private static final List<FrequentCategory> component1 = CollectionsKt.listOf((Object[]) new FrequentCategory[]{FrequentCategory.Apps.INSTANCE, FrequentCategory.Send.INSTANCE, FrequentCategory.Pay.INSTANCE, FrequentCategory.Bundles.INSTANCE});
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    public static final List<FrequentCategory> getAllFrequentCategories() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<FrequentCategory> list = component1;
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component2 + 123;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
