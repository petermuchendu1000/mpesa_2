package com.huawei.digitalpayment.consumer.sfcui.profile.manageline;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/SimConstants;", "", "<init>", "()V", "STATUS_PENDING", "", "STATUS_APPROVED", "DOC_NATIONAL_ID_API", "DOC_NATIONAL_ID_UI", "DOC_PASSPORT_API", "DOC_PASSPORT_UI", "DOC_ALIEN_ID_API", "DOC_ALIEN_ID_UI", "DOC_MILITARY_ID_API", "DOC_MILITARY_ID_UI", "mapDocTypeToUI", "apiDocType", "UPDATE_FOR_OTHER_URL", "VERIFY_PHOTO", "VERIFY_PASSPORT", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimConstants {
    public static final int $stable = 0;
    public static final String DOC_ALIEN_ID_API = "Alien Id Card";
    public static final String DOC_ALIEN_ID_UI = "Alien ID";
    public static final String DOC_MILITARY_ID_API = "Military Id Card";
    public static final String DOC_MILITARY_ID_UI = "Military ID";
    public static final String DOC_NATIONAL_ID_API = "National Id Card";
    public static final String DOC_NATIONAL_ID_UI = "National ID";
    public static final String DOC_PASSPORT_API = "Passport";
    public static final String DOC_PASSPORT_UI = "Passport";
    public static final SimConstants INSTANCE = new SimConstants();
    public static final String STATUS_APPROVED = "APPROVED";
    public static final String STATUS_PENDING = "PENDING";
    private static int ShareDataUIState = 0;
    public static final String UPDATE_FOR_OTHER_URL = "https://myaccount.safaricom.co.ke/account/kyc-upload";
    public static final String VERIFY_PASSPORT = "https://preprod.safaricom.com/api/v1/process-passport";
    public static final String VERIFY_PHOTO = "https://safaricom.com/api/v1/process-id";
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    private SimConstants() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String mapDocTypeToUI(String apiDocType) {
        int i = 2 % 2;
        if (apiDocType != null) {
            int i2 = component1 + 35;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            switch (apiDocType.hashCode()) {
                case -1262940548:
                    if (apiDocType.equals(DOC_ALIEN_ID_API)) {
                        return DOC_ALIEN_ID_UI;
                    }
                    break;
                case 505681575:
                    if (apiDocType.equals(DOC_NATIONAL_ID_API)) {
                        int i4 = component1 + 115;
                        component3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 3 / 4;
                        }
                        return DOC_NATIONAL_ID_UI;
                    }
                    break;
                case 1281421362:
                    if (apiDocType.equals("Passport")) {
                        return "Passport";
                    }
                    break;
                case 1404340994:
                    if (apiDocType.equals(DOC_MILITARY_ID_API)) {
                        return DOC_MILITARY_ID_UI;
                    }
                    break;
            }
        }
        if (apiDocType != null) {
            return apiDocType;
        }
        int i6 = component3 + 109;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 15;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
