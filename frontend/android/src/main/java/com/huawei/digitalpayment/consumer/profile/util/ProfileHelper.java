package com.huawei.digitalpayment.consumer.profile.util;

import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalKycGroup;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0007J\u0006\u0010\u001d\u001a\u00020\u001aJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0005H\u0007J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010$\u001a\u00020\u001a2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f\u0018\u00010\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/util/ProfileHelper;", "", "<init>", "()V", "TAG", "", "localCustomer", "Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalCustomer;", ProfileConstants.PROFILES, "", "Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalProfileItem;", "kycGroups", "", "Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalKycGroup;", "getKycGroups", "()Ljava/util/List;", "setKycGroups", "(Ljava/util/List;)V", "kycGroupElements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "getKycGroupElements", "()Ljava/util/Map;", "setKycGroupElements", "(Ljava/util/Map;)V", "updateCustomer", "", "updateProfiles", "profileJson", "cleanCustomer", "getCustomer", "getProfiles", "updateAvatar", "docId", "updateMsisdn", "msisdn", "updateDynamicsKycs", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProfileHelper {
    private static Map<String, ? extends List<DynamicsElement>> ShareDataUIState = null;
    private static LocalCustomer component1 = null;
    private static List<LocalKycGroup> component3 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static final String copydefault = "ProfileHelper";
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    public static final ProfileHelper INSTANCE = new ProfileHelper();
    private static final List<LocalProfileItem> component2 = new ArrayList();

    private ProfileHelper() {
    }

    static {
        try {
            component1 = (LocalCustomer) SecureGsonUtils.fromJson(SPUtils.getInstance(ProfileConstants.SP_NAME_CACHE).getString("userInfo"), LocalCustomer.class);
            int i = component4 + 83;
            copy = i % 128;
            if (i % 2 != 0) {
                int i2 = 4 / 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (Exception e) {
            L.e(copydefault, "ProfileHelper init: " + e.getMessage());
        }
        int i4 = component4 + 67;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final List<LocalKycGroup> getKycGroups() {
        int i = 2 % 2;
        int i2 = equals + 35;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setKycGroups(List<LocalKycGroup> list) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        component3 = list;
        int i5 = i2 + 1;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Map<String, List<DynamicsElement>> getKycGroupElements() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 69;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Map map = ShareDataUIState;
        int i5 = i2 + 103;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final void setKycGroupElements(Map<String, ? extends List<DynamicsElement>> map) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 17;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = map;
        int i5 = i2 + 43;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void updateCustomer(LocalCustomer localCustomer) {
        String str;
        String str2;
        int i = 2 % 2;
        if (localCustomer != null) {
            component1 = localCustomer;
            SPUtils.getInstance(ProfileConstants.SP_NAME_CACHE).put("userInfo", GsonUtils.toJson(localCustomer), false);
            SPUtils.getInstance(ProfileConstants.SP_NAME_CACHE).put(PhoneUtils.getRecentLoginPhone() + ProfileConstants.NICK_NAME, localCustomer.getName(), false);
            int size = component2.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<LocalProfileItem> list = component2;
                LocalProfileItem localProfileItem = list.get(i2);
                String execute = localProfileItem.getExecute();
                if (execute == null) {
                    int i3 = equals + 51;
                    getRequestBeneficiariesState = i3 % 128;
                    int i4 = i3 % 2;
                    execute = "";
                }
                String str3 = execute;
                if (StringsKt.contains$default((CharSequence) str3, (CharSequence) RoutePathConstants.PHOTO_PROFILE, false, 2, (Object) null)) {
                    String avatar = localCustomer.getAvatar();
                    list.set(i2, LocalProfileItem.copy$default(localProfileItem, null, avatar == null ? "" : avatar, null, null, false, 29, null));
                } else if (!(!StringsKt.contains$default((CharSequence) str3, (CharSequence) RoutePathConstants.PROFILE_EDIT, false, 2, (Object) null))) {
                    String name = localCustomer.getName();
                    if (name == null) {
                        int i5 = getRequestBeneficiariesState + 3;
                        equals = i5 % 128;
                        int i6 = i5 % 2;
                        str2 = "";
                    } else {
                        str2 = name;
                    }
                    list.set(i2, LocalProfileItem.copy$default(localProfileItem, null, str2, null, null, false, 29, null));
                    int i7 = getRequestBeneficiariesState + 47;
                    equals = i7 % 128;
                    int i8 = i7 % 2;
                } else if (StringsKt.contains$default((CharSequence) str3, (CharSequence) RoutePathConstants.MSISDN_EDIT, false, 2, (Object) null)) {
                    int i9 = equals + 7;
                    getRequestBeneficiariesState = i9 % 128;
                    int i10 = i9 % 2;
                    String showMsisdn = localCustomer.getShowMsisdn();
                    if (showMsisdn == null) {
                        int i11 = equals + 53;
                        getRequestBeneficiariesState = i11 % 128;
                        int i12 = i11 % 2;
                        str = "";
                    } else {
                        str = showMsisdn;
                    }
                    list.set(i2, LocalProfileItem.copy$default(localProfileItem, null, str, null, null, false, 29, null));
                }
            }
        }
    }

    @JvmStatic
    public static final void updateProfiles(String profileJson) {
        int i = 2 % 2;
        List<LocalProfileItem> list = component2;
        list.clear();
        List list2 = (List) SecureGsonUtils.fromJson(profileJson, new TypeToken<List<? extends LocalProfileItem>>() {
        }.getType());
        List list3 = list2;
        if (CollectionUtils.isNotEmpty(list3)) {
            int i2 = equals + 11;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNull(list2);
            list.addAll(list3);
            SPUtils.getInstance(ProfileConstants.SP_NAME_CACHE).put(ProfileConstants.PROFILES, GsonUtils.toJson(list2), false);
        }
        int i4 = equals + 37;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void cleanCustomer() {
        int i = 2 % 2;
        int i2 = equals + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component1 = null;
        SPUtils.getInstance(ProfileConstants.SP_NAME_CACHE).remove("userInfo", false);
        int i4 = getRequestBeneficiariesState + 65;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LocalCustomer getCustomer() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 53;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LocalCustomer localCustomer = component1;
        int i4 = i2 + 117;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return localCustomer;
    }

    public final List<LocalProfileItem> getProfiles() {
        int i = 2 % 2;
        int i2 = equals + 107;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        List<LocalProfileItem> list = component2;
        int i5 = i3 + 65;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @JvmStatic
    public static final void updateAvatar(String docId) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(docId, "");
        LocalCustomer localCustomer = component1;
        if (localCustomer != null) {
            int i4 = equals + 33;
            getRequestBeneficiariesState = i4 % 128;
            updateCustomer(LocalCustomer.copy$default(localCustomer, null, docId, null, null, i4 % 2 != 0 ? 81 : 13, null));
        }
    }

    @JvmStatic
    public static final void updateMsisdn(String msisdn) {
        int i = 2 % 2;
        LocalCustomer localCustomer = component1;
        if (localCustomer != null) {
            int i2 = equals + 29;
            getRequestBeneficiariesState = i2 % 128;
            updateCustomer(LocalCustomer.copy$default(localCustomer, null, null, msisdn, null, i2 % 2 != 0 ? 66 : 11, null));
            int i3 = equals + 47;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @JvmStatic
    public static final void updateDynamicsKycs(List<LocalKycGroup> kycGroups, Map<String, ? extends List<DynamicsElement>> kycGroupElements) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 117;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            component3 = kycGroups;
            ShareDataUIState = kycGroupElements;
            int i4 = 75 / 0;
        } else {
            component3 = kycGroups;
            ShareDataUIState = kycGroupElements;
        }
        int i5 = i2 + 31;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
    }
}
