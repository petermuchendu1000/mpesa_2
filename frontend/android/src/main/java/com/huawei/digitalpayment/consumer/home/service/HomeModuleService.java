package com.huawei.digitalpayment.consumer.home.service;

import androidx.appcompat.app.AppCompatActivity;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.service.ChangeLanguageService;
import com.huawei.digitalpayment.consumer.service.IHomeModule2Service;
import com.huawei.digitalpayment.consumer.service.IHomeModuleService;
import com.huawei.digitalpayment.home.data.DefaultHomeModel;
import com.huawei.digitalpayment.home.data.HomeConfigManager;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeConfig;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.theme.HomeThemeManager;
import com.huawei.digitalpayment.home.util.BalanceHelper;
import com.huawei.http.BaseResp;
import com.safaricom.mpesa.logging.L;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/service/HomeModuleService;", "Lcom/huawei/digitalpayment/consumer/baselib/service/ChangeLanguageService;", "Lcom/huawei/digitalpayment/consumer/service/IHomeModuleService;", "Lcom/huawei/digitalpayment/consumer/service/IHomeModule2Service;", "<init>", "()V", "refreshMenu", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "getMiniAppName", "", "appId", "fallback", "refreshBalance", "refreshTheme", KeysConstants.KEY_LOGIN_INFO, "getMiniAppIconById", "defaultValue", "isLightIcon", "", "getMiniAppNameById", "getFunctionById", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "getThemeFunctionById", "getOldFunctionById", "Companion", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeModuleService implements ChangeLanguageService, IHomeModuleService, IHomeModule2Service {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static final String copydefault = "HomeModuleService";

    @Override
    public void refreshMenu(AppCompatActivity activity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        new DefaultHomeModel().refreshMenu2(new ApiCallback<BaseResp>() {
        });
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public String getMiniAppName(String appId, String fallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appId, "");
            HomeConfigManager.INSTANCE.getMiniAppNameById(appId, fallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(appId, "");
        String miniAppNameById = HomeConfigManager.INSTANCE.getMiniAppNameById(appId, fallback);
        int i3 = ShareDataUIState + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return miniAppNameById;
    }

    @Override
    public void refreshBalance() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            L.INSTANCE.d(copydefault, "refreshBalance: ", new Object[1]);
            BalanceHelper.INSTANCE.setNeedRefresh(false);
        } else {
            L.INSTANCE.d(copydefault, "refreshBalance: ", new Object[0]);
            BalanceHelper.INSTANCE.setNeedRefresh(true);
        }
    }

    @Override
    public void refreshTheme(String loginInfo) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeManager.INSTANCE.refreshTheme(loginInfo);
        int i4 = component3 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public String getMiniAppIconById(String appId, String defaultValue, boolean isLightIcon) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component3 = i2 % 128;
        String icon = null;
        if (i2 % 2 != 0) {
            LocalHomeFunction localHomeFunctionComponent3 = component3(appId);
            if (localHomeFunctionComponent3 == null) {
                int i3 = component3 + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            } else {
                icon = localHomeFunctionComponent3.getIcon(isLightIcon);
            }
            String str = icon;
            if (str == null || str.length() == 0) {
                return defaultValue;
            }
            int i5 = ShareDataUIState + 121;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
            }
            return icon;
        }
        component3(appId);
        throw null;
    }

    @Override
    public String getMiniAppNameById(String appId, String defaultValue) {
        String funcName;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LocalHomeFunction localHomeFunctionComponent3 = component3(appId);
        if (localHomeFunctionComponent3 != null) {
            int i4 = component3 + 121;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                funcName = localHomeFunctionComponent3.getFuncName();
                int i5 = 38 / 0;
            } else {
                funcName = localHomeFunctionComponent3.getFuncName();
            }
        } else {
            funcName = null;
        }
        String str = funcName;
        if (str != null) {
            if (str.length() != 0) {
                return funcName;
            }
            int i6 = component3 + 59;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return defaultValue;
    }

    private final LocalHomeFunction component3(String str) {
        int i = 2 % 2;
        LocalHomeFunction localHomeFunctionShareDataUIState = ShareDataUIState(str);
        Object obj = null;
        if (localHomeFunctionShareDataUIState == null) {
            int i2 = component3 + 17;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                component2(str);
                obj.hashCode();
                throw null;
            }
            localHomeFunctionShareDataUIState = component2(str);
        }
        int i3 = ShareDataUIState + 83;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return localHomeFunctionShareDataUIState;
        }
        throw null;
    }

    private final LocalHomeFunction ShareDataUIState(String str) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str2 = HomeThemeManager.INSTANCE.getAppIdFunIdMap().get(str);
        Map<String, LocalHomeFunction> value = HomeThemeManager.INSTANCE.getFunctionDefines().getValue();
        if (value != null) {
            return value.get(str2);
        }
        int i4 = component3 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final LocalHomeFunction component2(String str) {
        String str2;
        LocalHomeConfig value;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            str2 = HomeConfigManager.INSTANCE.getAppIdFunIdMap().get(str);
            value = HomeConfigManager.INSTANCE.getlocalHomeConfig().getValue();
            int i3 = 13 / 0;
            if (value == null) {
                return null;
            }
        } else {
            str2 = HomeConfigManager.INSTANCE.getAppIdFunIdMap().get(str);
            value = HomeConfigManager.INSTANCE.getlocalHomeConfig().getValue();
            if (value == null) {
                return null;
            }
        }
        Map<String, LocalHomeFunction> functionDefine = value.getFunctionDefine();
        if (functionDefine == null) {
            return null;
        }
        LocalHomeFunction localHomeFunction = functionDefine.get(str2);
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return localHomeFunction;
    }

    static {
        int i = component2 + 101;
        component1 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/service/HomeModuleService$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
