package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceInitiationTypes;", "", "<init>", "()V", "manual", "", "qrCode", "aiPay", "nfc", "selectContacts", "favorites", SFCForHomeFragment.MENU_TYPE_FREQUENTS, "popularBusiness", "deepLink", "miniApp", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceInitiationTypes {
    public static final ReferenceInitiationTypes INSTANCE = new ReferenceInitiationTypes();
    public static final String aiPay = "AIPay";
    private static int component2 = 1;
    private static int component3 = 0;
    public static final String deepLink = "Deeplink";
    public static final String favorites = "Favourites";
    public static final String frequents = "Frequents";
    public static final String manual = "Manual";
    public static final String miniApp = "Miniapp";
    public static final String nfc = "NFC";
    public static final String popularBusiness = "PopularBusiness";
    public static final String qrCode = "QRCode";
    public static final String selectContacts = "SelectContacts";

    private ReferenceInitiationTypes() {
    }

    static {
        int i = component3 + 93;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
