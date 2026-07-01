package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/EPaperScreens;", "", "<init>", "()V", "ENTRY_POINT", "", "PURCHASE_NEWS_PAPERS_SCREEN", "BUY_NEWS_PAPERS_SCREEN", "CONFIRM_PURCHASE_SCREEN", "PURCHASE_SUCCESS_SCREEN", "READ_NEWS_PAPER_SCREEN", "MY_SUBSCRIPTIONS_SCREEN", "OLD_NEWS_PAPERS_SCREEN", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EPaperScreens {
    public static final int $stable = 0;
    public static final String BUY_NEWS_PAPERS_SCREEN = "buy_news_papers_screen";
    public static final String CONFIRM_PURCHASE_SCREEN = "confirm_purchase_screen";
    public static final String ENTRY_POINT = "news_papers_tabs_screen";
    public static final EPaperScreens INSTANCE = new EPaperScreens();
    public static final String MY_SUBSCRIPTIONS_SCREEN = "my_subscriptions_screen";
    public static final String OLD_NEWS_PAPERS_SCREEN = "old_news_papers_screen";
    public static final String PURCHASE_NEWS_PAPERS_SCREEN = "purchase_news_papers_screen";
    public static final String PURCHASE_SUCCESS_SCREEN = "purchase_success_screen";
    public static final String READ_NEWS_PAPER_SCREEN = "read_news_papers_screen";
    private static int component1 = 1;
    private static int component3;

    private EPaperScreens() {
    }

    static {
        int i = component3 + 65;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
