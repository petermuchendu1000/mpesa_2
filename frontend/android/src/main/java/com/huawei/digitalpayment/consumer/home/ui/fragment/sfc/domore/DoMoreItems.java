package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.domore;

import com.huawei.digitalpayment.consumer.homeui.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/domore/DoMoreItems;", "", "<init>", "()V", "createDoMoreItemList", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/domore/DoMoreBean;", "createDummyItems", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DoMoreItems {
    public static final int $stable = 0;
    public static final DoMoreItems INSTANCE = new DoMoreItems();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    private DoMoreItems() {
    }

    public final List<DoMoreBean> createDoMoreItemList() {
        int i = 2 % 2;
        List<DoMoreBean> listListOf = CollectionsKt.listOf((Object[]) new DoMoreBean[]{new DoMoreBean("House & Home", R.mipmap.ic_insurance, "#E3F3F3"), new DoMoreBean("Finance", R.mipmap.ic_govt, "#EDEDFE"), new DoMoreBean("Lifestyle", R.mipmap.ic_utilities, "#FCF2DE"), new DoMoreBean("Medical", R.mipmap.ic_education, "#E1F8FD"), new DoMoreBean("Business", R.mipmap.ic_govt, "#F2E9FE")});
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return listListOf;
    }

    public final List<DoMoreBean> createDummyItems() {
        int i = 2 % 2;
        List<DoMoreBean> listListOf = CollectionsKt.listOf((Object[]) new DoMoreBean[]{new DoMoreBean("Beauty", R.mipmap.ic_insurance, "#E3F3F3"), new DoMoreBean("Parenting", R.mipmap.ic_govt, "#EDEDFE"), new DoMoreBean("Productivity", R.mipmap.ic_utilities, "#FCF2DE"), new DoMoreBean("Others", R.mipmap.ic_education, "#E1F8FD"), new DoMoreBean("Entertainment", R.mipmap.ic_health, "#F2E9FE"), new DoMoreBean("Books & Reference", R.mipmap.ic_gift, "#FFEAEE"), new DoMoreBean("Finance", R.mipmap.ic_travel, "#E2FAF1"), new DoMoreBean("Health & Fitness", R.mipmap.ic_loyalty, "#FDE9D4"), new DoMoreBean("Communications", R.mipmap.ic_entertainment, "#FEF4CF"), new DoMoreBean("Travel & Local", R.mipmap.ic_gaming, "#F1F1F1"), new DoMoreBean("House & Home", R.mipmap.ic_insurance, "#E3F3F3"), new DoMoreBean("Education", R.mipmap.ic_govt, "#EDEDFE"), new DoMoreBean("Events", R.mipmap.ic_utilities, "#FCF2DE"), new DoMoreBean("Games", R.mipmap.ic_education, "#E1F8FD"), new DoMoreBean("Food & Beverage", R.mipmap.ic_health, "#F2E9FE"), new DoMoreBean("Lifestyle", R.mipmap.ic_gift, "#FFEAEE"), new DoMoreBean("Shopping", R.mipmap.ic_travel, "#E2FAF1"), new DoMoreBean("News & Magazines", R.mipmap.ic_loyalty, "#FDE9D4"), new DoMoreBean("Auto & Vehicles", R.mipmap.ic_entertainment, "#FEF4CF"), new DoMoreBean("Sports", R.mipmap.ic_gaming, "#F1F1F1"), new DoMoreBean("Business", R.mipmap.ic_gaming, "#F1F1F1")});
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
        return listListOf;
    }

    static {
        int i = component3 + 25;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
