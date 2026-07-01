package com.huawei.digitalpayment.consumer.base.resp;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baseui.R;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.EPaperConstants;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020>0=2\b\b\u0002\u0010A\u001a\u00020BJ\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020>0D2\b\u0010E\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000fR\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000fR\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000fR\u001d\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000fR\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000fR\u001d\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000fR\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000fR\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000fR\u001d\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u000fR\u001d\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u000fR\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000fR\u001d\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000fR\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000f¨\u0006F"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/SettingItems;", "", "<init>", "()V", "QUICK_ACTIONS_ID", "", "getQUICK_ACTIONS_ID", "()Ljava/lang/String;", "QUICK_CARE_ID", "getQUICK_CARE_ID", "ACCOUNT_AND_SETTINGS_ID", "getACCOUNT_AND_SETTINGS_ID", "GET_PUK", "Lkotlin/Pair;", "getGET_PUK", "()Lkotlin/Pair;", "SECURITY_CENTER", "getSECURITY_CENTER", "REPORT_FRAUD", "getREPORT_FRAUD", "HELP_IMPROVE_YOUR_NETWORK", "getHELP_IMPROVE_YOUR_NETWORK", "CHECK_USAGE", "getCHECK_USAGE", "REQUEST_ESIM", "getREQUEST_ESIM", "MY_SUBSCRIPTIONS", "getMY_SUBSCRIPTIONS", "GET_HELP", "getGET_HELP", "MANAGE_LINE", "getMANAGE_LINE", "FIND_SHOP", "getFIND_SHOP", "MY_COUPON", "getMY_COUPON", "MANAGE_FAVOURITES", "getMANAGE_FAVOURITES", "BLOCKED_BUSINESS", "getBLOCKED_BUSINESS", "ABOUT_APP", "getABOUT_APP", "SHARE_APP", "getSHARE_APP", "APP_APPEARANCE", "getAPP_APPEARANCE", "BIOMETRICS", "getBIOMETRICS", "OFFLINE_MODE", "getOFFLINE_MODE", "PICTURE_TAKE_A_PHOTO", "getPICTURE_TAKE_A_PHOTO", "PICTURE_PICK_FROM_GALLERY", "getPICTURE_PICK_FROM_GALLERY", "PICTURE_REMOVE_PICTURE", "getPICTURE_REMOVE_PICTURE", "CHANGE_THEME", "getCHANGE_THEME", "RECOMMEND_A_FRIEND", "getRECOMMEND_A_FRIEND", "createQuickCareItems", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SettingsBean;", "createAccountSettingsItems", "createQuickSettingItems", "isBiometricsActive", "", "createChangePictureItems", "", "avatar", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingItems {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    public static final SettingItems INSTANCE = new SettingItems();
    private static final String QUICK_ACTIONS_ID = "quick_actions";
    private static final String QUICK_CARE_ID = "quick_care";
    private static final String ACCOUNT_AND_SETTINGS_ID = "account_and_settings";
    private static final Pair<String, String> GET_PUK = new Pair<>("sfc_get_puk", "Get PUK");
    private static final Pair<String, String> SECURITY_CENTER = new Pair<>("sfc_security_center", "Security Center");
    private static final Pair<String, String> REPORT_FRAUD = new Pair<>("sfc_report_fraud", "Report Fraud");
    private static final Pair<String, String> HELP_IMPROVE_YOUR_NETWORK = new Pair<>("sfc_mtandao", "Help Improve Your Network");
    private static final Pair<String, String> CHECK_USAGE = new Pair<>("sfc_check_my_usage", "Check My Usage");
    private static final Pair<String, String> REQUEST_ESIM = new Pair<>("sfc_request_e_sim", "Request e-SIM");
    private static final Pair<String, String> MY_SUBSCRIPTIONS = new Pair<>("sfc_my_subscriptions", EPaperConstants.MY_SUBSCRIPTIONS);
    private static final Pair<String, String> GET_HELP = new Pair<>("sfc_get_help", "Get Help");
    private static final Pair<String, String> MANAGE_LINE = new Pair<>("manage_my_line", "Manage My Line");
    private static final Pair<String, String> FIND_SHOP = new Pair<>("sfc_find_a_safaricom_shop", "Find a Safaricom Shop");
    private static final Pair<String, String> MY_COUPON = new Pair<>("icon_sfc_my_coupons", "My Coupon");
    private static final Pair<String, String> MANAGE_FAVOURITES = new Pair<>("sfc_manage_favorites", "Manage Favourites");
    private static final Pair<String, String> BLOCKED_BUSINESS = new Pair<>("sfc_blocked_businesses", "Blocked Businesses");
    private static final Pair<String, String> ABOUT_APP = new Pair<>("sfc_about_app", "About App");
    private static final Pair<String, String> SHARE_APP = new Pair<>("sfc_share_app", "Share App");
    private static final Pair<String, String> APP_APPEARANCE = new Pair<>("sfc_appearance", "Appearance");
    private static final Pair<String, String> BIOMETRICS = new Pair<>("sfc_biometric_authentication", "Biometric Authentication");
    private static final Pair<String, String> OFFLINE_MODE = new Pair<>("sfc_offline_mode", "Offline Mode");
    private static final Pair<String, String> PICTURE_TAKE_A_PHOTO = new Pair<>("sfc_take_a_photo", "Take a Photo");
    private static final Pair<String, String> PICTURE_PICK_FROM_GALLERY = new Pair<>("sfc_pick_from_gallery", "Pick from Gallery");
    private static final Pair<String, String> PICTURE_REMOVE_PICTURE = new Pair<>("remove_profile_picture", "Remove Profile Picture");
    private static final Pair<String, String> CHANGE_THEME = new Pair<>("sfc_change_theme", "Change Theme");
    private static final Pair<String, String> RECOMMEND_A_FRIEND = new Pair<>("recommend_service", "Recommend A Friend");

    private SettingItems() {
    }

    static {
        int i = component2 + 5;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public final String getQUICK_ACTIONS_ID() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = QUICK_ACTIONS_ID;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public final String getQUICK_CARE_ID() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = QUICK_CARE_ID;
        int i5 = i3 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getACCOUNT_AND_SETTINGS_ID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = ACCOUNT_AND_SETTINGS_ID;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Pair<String, String> getGET_PUK() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = GET_PUK;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getSECURITY_CENTER() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = SECURITY_CENTER;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getREPORT_FRAUD() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = REPORT_FRAUD;
        int i4 = i3 + 59;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return pair;
        }
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getHELP_IMPROVE_YOUR_NETWORK() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = HELP_IMPROVE_YOUR_NETWORK;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getCHECK_USAGE() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return CHECK_USAGE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getREQUEST_ESIM() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Pair<String, String> pair = REQUEST_ESIM;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getMY_SUBSCRIPTIONS() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = MY_SUBSCRIPTIONS;
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getGET_HELP() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = GET_HELP;
        int i4 = i2 + 93;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getMANAGE_LINE() {
        Pair<String, String> pair;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            pair = MANAGE_LINE;
            int i4 = 88 / 0;
        } else {
            pair = MANAGE_LINE;
        }
        int i5 = i2 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getFIND_SHOP() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, String> pair = FIND_SHOP;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getMY_COUPON() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, String> pair = MY_COUPON;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getMANAGE_FAVOURITES() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return MANAGE_FAVOURITES;
        }
        throw null;
    }

    public final Pair<String, String> getBLOCKED_BUSINESS() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Pair<String, String> pair = BLOCKED_BUSINESS;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getABOUT_APP() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return ABOUT_APP;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getSHARE_APP() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return SHARE_APP;
        }
        throw null;
    }

    public final Pair<String, String> getAPP_APPEARANCE() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = APP_APPEARANCE;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getBIOMETRICS() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return BIOMETRICS;
        }
        throw null;
    }

    public final Pair<String, String> getOFFLINE_MODE() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return OFFLINE_MODE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getPICTURE_TAKE_A_PHOTO() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return PICTURE_TAKE_A_PHOTO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getPICTURE_PICK_FROM_GALLERY() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Pair<String, String> pair = PICTURE_PICK_FROM_GALLERY;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getPICTURE_REMOVE_PICTURE() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Pair<String, String> pair = PICTURE_REMOVE_PICTURE;
        int i4 = i2 + 37;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getCHANGE_THEME() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Pair<String, String> pair = CHANGE_THEME;
        int i4 = i3 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    public final Pair<String, String> getRECOMMEND_A_FRIEND() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, String> pair = RECOMMEND_A_FRIEND;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return pair;
    }

    public final List<SettingsBean> createQuickCareItems() {
        int i = 2 % 2;
        Pair<String, String> pair = SECURITY_CENTER;
        SettingsBean settingsBean = new SettingsBean(pair.getFirst(), R.drawable.icon_sfc_security_center, pair.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair2 = GET_PUK;
        SettingsBean settingsBean2 = new SettingsBean(pair2.getFirst(), R.drawable.icon_sfc_get_puk, pair2.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair3 = REPORT_FRAUD;
        SettingsBean settingsBean3 = new SettingsBean(pair3.getFirst(), R.drawable.icon_sfc_report_fraud, pair3.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair4 = CHECK_USAGE;
        SettingsBean settingsBean4 = new SettingsBean(pair4.getFirst(), R.drawable.icon_sfc_check_my_usage, pair4.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair5 = MY_SUBSCRIPTIONS;
        SettingsBean settingsBean5 = new SettingsBean(pair5.getFirst(), R.drawable.icon_sfc_my_subscriptions, pair5.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair6 = GET_HELP;
        SettingsBean settingsBean6 = new SettingsBean(pair6.getFirst(), R.drawable.icon_sfc_get_help, pair6.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair7 = MANAGE_LINE;
        SettingsBean settingsBean7 = new SettingsBean(pair7.getFirst(), R.drawable.icon_sfc_sim_card, pair7.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair8 = FIND_SHOP;
        SettingsBean settingsBean8 = new SettingsBean(pair8.getFirst(), R.drawable.icon_sfc_find_a_safaricom_shop, pair8.getSecond(), null, null, false, false, "https://myaccount.safaricom.co.ke/discover/locate-shop", 120, null);
        Pair<String, String> pair9 = HELP_IMPROVE_YOUR_NETWORK;
        List<SettingsBean> listListOf = CollectionsKt.listOf((Object[]) new SettingsBean[]{settingsBean, settingsBean2, settingsBean3, settingsBean4, settingsBean5, settingsBean6, settingsBean7, settingsBean8, new SettingsBean(pair9.getFirst(), R.drawable.icon_sfc_mtandao, pair9.getSecond(), null, null, false, false, null, 248, null)});
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return listListOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<SettingsBean> createAccountSettingsItems() {
        int i = 2 % 2;
        Pair<String, String> pair = MY_COUPON;
        String first = pair.getFirst();
        String second = pair.getSecond();
        Pair<String, String> pair2 = MANAGE_FAVOURITES;
        String first2 = pair2.getFirst();
        String second2 = pair2.getSecond();
        Pair<String, String> pair3 = BLOCKED_BUSINESS;
        String first3 = pair3.getFirst();
        String second3 = pair3.getSecond();
        Pair<String, String> pair4 = ABOUT_APP;
        String first4 = pair4.getFirst();
        String second4 = pair4.getSecond();
        Pair<String, String> pair5 = SHARE_APP;
        String first5 = pair5.getFirst();
        String second5 = pair5.getSecond();
        Pair<String, String> pair6 = CHANGE_THEME;
        String first6 = pair6.getFirst();
        String second6 = pair6.getSecond();
        Pair<String, String> pair7 = RECOMMEND_A_FRIEND;
        List<SettingsBean> listListOf = CollectionsKt.listOf((Object[]) new SettingsBean[]{new SettingsBean(first, R.drawable.icon_sfc_my_coupons, second, null, null, false, false, null, 248, null), new SettingsBean(first2, R.drawable.icon_sfc_manage_favorites, second2, null, null, false, false, null, 248, null), new SettingsBean(first3, R.drawable.icon_sfc_blocked_businesses, second3, null, null, false, false, null, 248, null), new SettingsBean(first4, R.drawable.icon_sfc_about_app, second4, null, null, false, false, null, 248, null), new SettingsBean(first5, R.drawable.icon_sfc_share_app, second5, null, null, false, false, null, 248, null), new SettingsBean(first6, R.drawable.icon_sfc_share_app, second6, null, null, false, false, null, 248, null), new SettingsBean(pair7.getFirst(), R.drawable.icon_sfc_share_app, pair7.getSecond(), null, null, false, false, null, 248, null)});
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return listListOf;
    }

    public static List createQuickSettingItems$default(SettingItems settingItems, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 69;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return settingItems.createQuickSettingItems(z);
    }

    public final List<SettingsBean> createQuickSettingItems(boolean isBiometricsActive) {
        int i = 2 % 2;
        Pair<String, String> pair = APP_APPEARANCE;
        SettingsBean settingsBean = new SettingsBean(pair.getFirst(), R.drawable.icon_sfc_appearance, pair.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair2 = BIOMETRICS;
        SettingsBean settingsBean2 = new SettingsBean(pair2.getFirst(), R.drawable.icon_sfc_biometric_authentication, pair2.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair3 = OFFLINE_MODE;
        List<SettingsBean> listListOf = CollectionsKt.listOf((Object[]) new SettingsBean[]{settingsBean, settingsBean2, new SettingsBean(pair3.getFirst(), R.drawable.icon_sfc_offline_mode, pair3.getSecond(), null, null, false, false, null, 248, null)});
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return listListOf;
    }

    public final List<SettingsBean> createChangePictureItems(String avatar) {
        int i = 2 % 2;
        Pair<String, String> pair = PICTURE_TAKE_A_PHOTO;
        SettingsBean settingsBean = new SettingsBean(pair.getFirst(), R.drawable.ic_camera, pair.getSecond(), null, null, false, false, null, 248, null);
        Pair<String, String> pair2 = PICTURE_PICK_FROM_GALLERY;
        List<SettingsBean> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new SettingsBean[]{settingsBean, new SettingsBean(pair2.getFirst(), R.drawable.icon_sfc_gallery, pair2.getSecond(), null, null, false, false, null, 248, null)}));
        if (!TextUtils.isEmpty(avatar)) {
            Pair<String, String> pair3 = PICTURE_REMOVE_PICTURE;
            mutableList.add(new SettingsBean(pair3.getFirst(), R.drawable.ic_trash, pair3.getSecond(), null, null, false, false, null, 248, null));
        }
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mutableList;
    }
}
