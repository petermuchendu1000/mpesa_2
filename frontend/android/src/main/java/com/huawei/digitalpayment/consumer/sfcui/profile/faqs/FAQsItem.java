package com.huawei.digitalpayment.consumer.sfcui.profile.faqs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsItem;", "", "<init>", "()V", "createFAQs", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsBean;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FAQsItem {
    public static final int $stable = 0;
    public static final FAQsItem INSTANCE = new FAQsItem();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private FAQsItem() {
    }

    public final List<FAQsBean> createFAQs() {
        int i = 2 % 2;
        List<FAQsBean> listListOf = CollectionsKt.listOf((Object[]) new FAQsBean[]{new FAQsBean("Why do I need to set a profile picture when I log in for the first time", "Your profile is used to represent and identify you across the app. When performing a send money transaction, you will be able to see the profile picture of the person you are sending money to. "), new FAQsBean("What is biometric authentication?", "Biometric authentication uses your unique physical characteristics, such as fingerprint or face recognition, to securely verify your identity and provide quick access to the app."), new FAQsBean("What is my spend?", "Your spend shows your total spending across all transactions, including transfers, payments, and purchases made through the app."), new FAQsBean("What transaction can I initiate by scanning a QR code", "By scanning a QR code, you can initiate various transactions including sending money, making payments, and accessing merchant services quickly and securely."), new FAQsBean("What is my QR?", "Your QR code is a unique identifier that others can scan to send you money or access your payment information securely."), new FAQsBean("What is Pochi la Biashara?", "Pochi la Biashara is a business-focused mobile money service that allows merchants and businesses to send and receive money, manage transactions, and grow their business."), new FAQsBean("What are favourites?", "Favourites are your frequently used contacts, services, or transactions that you can quickly access without having to search for them each time.")});
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return listListOf;
    }

    static {
        int i = component3 + 61;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
