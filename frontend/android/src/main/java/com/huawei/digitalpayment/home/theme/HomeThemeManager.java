package com.huawei.digitalpayment.home.theme;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.JsonParser;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.common.util.file.FileDownloadUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.ColorConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.homeModule.R;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.request.HomeThemeDetailParams;
import com.huawei.digitalpayment.home.request.HomeThemeDetailRequest;
import com.huawei.digitalpayment.home.theme.data.IHomeTheme;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeThemeData;
import com.huawei.digitalpayment.home.theme.data.local.LocalI18nResource;
import com.huawei.digitalpayment.home.theme.data.remote.RemoteI18nResource;
import com.huawei.digitalpayment.home.theme.data.remote.RemoteI18nResourceKt;
import com.huawei.digitalpayment.pwaui.R;
import com.huawei.http.BaseRequest;
import com.huawei.http.FileRequest;
import com.huawei.image.glide.ImageRequest;
import com.huawei.image.util.GlideUtils;
import com.huawei.mobileapp.resourcelib.ResourceStringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fJ\u0010\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020\u0005J\u001e\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010/\u001a\u0002002\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000eJ\u000e\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020$J\u0010\u00103\u001a\u0002042\b\u0010'\u001a\u0004\u0018\u00010\u0005J\u0010\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u00106\u001a\u00020\u0005J\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00140\u001fJ\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001fJ\b\u00109\u001a\u00020!H\u0002J \u0010:\u001a\u0002002\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0005H\u0002J\u000e\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020>J\b\u0010?\u001a\u00020>H\u0002J\u001f\u0010@\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010AJ\u000e\u0010@\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u0005J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0005H\u0002J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020GJ+\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00142\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010IJ \u0010J\u001a\u0002002\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020\u000eJ\u0006\u0010O\u001a\u00020\u0005J\u0006\u0010P\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006Q"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/HomeThemeManager;", "", "<init>", "()V", "THEME_PATH", "", "DEFAULT_THEME_PATH_PARTNER", "THEME_ZIP_PATH", "THEME_FUNCTION_PATH", "STRING_PATH", "KEY_THEME_ID", "KEY_THEME_VERSION", "PREVIEW_THEME_ID", "PREVIEW_THEME_VERSION", "", "INVALID_THEME_VERSION", "theme", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "functionDefines", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "functionDefineGroups", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "appIdFunIdMap", "getAppIdFunIdMap", "()Ljava/util/Map;", "setAppIdFunIdMap", "(Ljava/util/Map;)V", "getPageConfig", "Landroidx/lifecycle/LiveData;", "refreshTheme", "", KeysConstants.KEY_LOGIN_INFO, "localDefaultThemeData", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeThemeData;", "updateI18nResource", "i18n", "themeId", "checkZip", "themeVersion", "saveFunctionDefine", "json", "Lorg/json/JSONObject;", "downloadZip", "zipUrl", "isZipDownload", "", "updateTheme", "themeData", "getCacheI18NResource", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalI18nResource;", "getThemeColors", "themeJson", "getFunctionDefines", "getFunctionDefineGroups", "copyDefaultZip", "copyAssetsZip", "zipName", "saveThemeInfo", "params", "Lcom/huawei/digitalpayment/home/request/HomeThemeDetailParams;", "getDefaultThemeId", "getThemeContent", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "path", "string2json", "origin", "readFile", "file", "Ljava/io/File;", "loadThemeI18NResources", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/Map;", "loadThemeImage", BiometricConstants.KEY_BIOMETRIC_IV, "Landroid/widget/ImageView;", "url", "defaultIcon", "defaultThemeId", "defaultThemeVersion", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeThemeManager {
    public static final String DEFAULT_THEME_PATH_PARTNER = "theme/%s/%s/Theme_default.json";
    public static final int INVALID_THEME_VERSION = -1;
    public static final String KEY_THEME_ID = "themeId";
    public static final String KEY_THEME_VERSION = "themeVersion";
    public static final String PREVIEW_THEME_ID = "preview";
    public static final int PREVIEW_THEME_VERSION = 1;
    public static final String STRING_PATH = "theme/%s/%d/resources/i18n/android/strings-%s.xml";
    public static final String THEME_FUNCTION_PATH = "theme/%s/%s/functionDefine-%s.json";
    public static final String THEME_PATH = "theme/%s/%s/Theme.json";
    public static final String THEME_ZIP_PATH = "theme/%s/%s/theme.zip";
    private static Map<String, String> component1 = null;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    public static final HomeThemeManager INSTANCE = new HomeThemeManager();
    private static final MutableLiveData<LocalHomeTheme> component3 = new MutableLiveData<>(new LocalHomeTheme(null, null, null, 7, null));
    private static final MutableLiveData<Map<String, LocalHomeFunction>> ShareDataUIState = new MutableLiveData<>(MapsKt.emptyMap());
    private static final MutableLiveData<List<LocalFunctionGroup>> component2 = new MutableLiveData<>(CollectionsKt.emptyList());

    private HomeThemeManager() {
    }

    static {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "");
        component1 = mapEmptyMap;
        int i = copy + 63;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public final Map<String, String> getAppIdFunIdMap() {
        int i = 2 % 2;
        int i2 = equals + 81;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, String> map = component1;
        int i4 = i3 + 75;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return map;
    }

    public final void setAppIdFunIdMap(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            component1 = map;
            int i3 = 62 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            component1 = map;
        }
        int i4 = getAsAtTimestamp + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LiveData<LocalHomeTheme> getPageConfig() {
        int i = 2 % 2;
        int i2 = equals + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<LocalHomeTheme> mutableLiveData = component3;
        Intrinsics.checkNotNull(mutableLiveData, "");
        MutableLiveData<LocalHomeTheme> mutableLiveData2 = mutableLiveData;
        int i4 = getAsAtTimestamp + 9;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return mutableLiveData2;
    }

    public final void refreshTheme(String loginInfo) {
        JSONObject jSONObjectOptJSONObject;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (((IAppConfig) RouteUtils.getService(IAppConfig.class)).useTheme()) {
            if (loginInfo == null) {
                updateTheme(ShareDataUIState());
                return;
            }
            try {
                jSONObjectOptJSONObject = new JSONObject(loginInfo).optJSONObject("customer");
            } catch (Exception unused) {
                updateTheme(ShareDataUIState());
            }
            if (jSONObjectOptJSONObject == null) {
                int i4 = equals + 31;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                updateTheme(ShareDataUIState());
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("themeInfo");
            String string = null;
            if (jSONObjectOptJSONObject2 == null) {
                int i6 = getAsAtTimestamp + 9;
                equals = i6 % 128;
                if (i6 % 2 != 0) {
                    updateTheme(ShareDataUIState());
                    string.hashCode();
                    throw null;
                }
                updateTheme(ShareDataUIState());
                int i7 = equals + 109;
                getAsAtTimestamp = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                return;
            }
            String strOptString = jSONObjectOptJSONObject2.optString("themeId");
            int iOptInt = jSONObjectOptJSONObject2.optInt("themeVersion", -1);
            String str = strOptString;
            if (str != null && str.length() != 0) {
                if (iOptInt != -1) {
                    if (!isZipDownload(strOptString, iOptInt)) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("zipUrl");
                        Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                        downloadZip(strOptString2, strOptString, iOptInt);
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("i18ResourceInfo");
                    if (jSONObjectOptJSONObject3 != null) {
                        int i8 = equals + 19;
                        getAsAtTimestamp = i8 % 128;
                        int i9 = i8 % 2;
                        string = jSONObjectOptJSONObject3.toString();
                    }
                    updateI18nResource(string, strOptString);
                    saveFunctionDefine(jSONObjectOptJSONObject2, strOptString);
                    checkZip(strOptString, iOptInt);
                    HomeThemeDetailParams homeThemeDetailParams = new HomeThemeDetailParams(strOptString, Integer.valueOf(iOptInt), null, 4, null);
                    LocalHomeThemeData localHomeThemeDataLoadCurrentTheme = ((IHomeTheme) RouteUtils.getService(IHomeTheme.class)).loadCurrentTheme(homeThemeDetailParams);
                    saveThemeInfo(homeThemeDetailParams);
                    updateTheme(localHomeThemeDataLoadCurrentTheme);
                    int i10 = equals + 53;
                    getAsAtTimestamp = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                }
                int i12 = getAsAtTimestamp + 99;
                equals = i12 % 128;
                int i13 = i12 % 2;
            }
            updateTheme(ShareDataUIState());
        }
    }

    private final LocalHomeThemeData ShareDataUIState() throws Throwable {
        LocalHomeThemeData localHomeThemeData;
        int i = 2 % 2;
        HomeThemeDetailParams homeThemeDetailParamsComponent3 = component3();
        saveThemeInfo(homeThemeDetailParamsComponent3);
        try {
            LocalHomeThemeData localHomeThemeDataSendSyncRequest = new HomeThemeDetailRequest(homeThemeDetailParamsComponent3).sendSyncRequest();
            Intrinsics.checkNotNullExpressionValue(localHomeThemeDataSendSyncRequest, "");
            LocalHomeThemeData localHomeThemeData2 = localHomeThemeDataSendSyncRequest;
            int i2 = getAsAtTimestamp + 47;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return localHomeThemeData2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            L.e("localDefaultThemeData: " + e.getMessage());
            component1();
            saveThemeInfo(homeThemeDetailParamsComponent3);
            try {
                localHomeThemeData = ((IHomeTheme) RouteUtils.getService(IHomeTheme.class)).loadCurrentTheme(homeThemeDetailParamsComponent3);
            } catch (Exception unused) {
                localHomeThemeData = new LocalHomeThemeData(null, null, null, null, null, 31, null);
            }
            int i3 = equals + 57;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 58 / 0;
            }
            return localHomeThemeData;
        }
    }

    public final void updateI18nResource(String i18n, String themeId) {
        int i = 2 % 2;
        int i2 = equals + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(themeId, "");
        String str = i18n;
        if (str != null) {
            int i4 = equals + 125;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if (str.length() == 0) {
                return;
            }
            try {
                String string = SPUtils.getInstance(HomeConstants.SP_NAME).getString(themeId, null);
                String strOptString = new JSONObject(i18n).optString("cacheTimestamp");
                if (Intrinsics.areEqual(string, strOptString)) {
                    return;
                }
                SPUtils.getInstance(HomeConstants.SP_NAME).put(themeId, strOptString);
                SPUtils.getInstance(HomeConstants.SP_NAME).put("theme_i18n_" + themeId, i18n);
            } catch (Exception e) {
                L.e("updateI18nResource: " + e.getMessage());
            }
        }
    }

    public final void checkZip(String themeId, int themeVersion) {
        int i = 2 % 2;
        int i2 = equals + 103;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(themeId, "");
            isZipDownload(themeId, themeVersion);
            throw null;
        }
        Intrinsics.checkNotNullParameter(themeId, "");
        if (!isZipDownload(themeId, themeVersion)) {
            throw new RuntimeException(StringUtils.getString(R.string.home_theme_download_fail));
        }
        int i3 = equals + 29;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void saveFunctionDefine(JSONObject json, String themeId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(themeId, "");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - TextUtils.indexOf("", "", 0, 0), View.resolveSize(0, 0) + 33, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19695), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 30, (char) Color.red(0), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = -518;
        long j3 = (j2 * 2331645809436161674L) + (j2 * (-1538942355791957250L));
        long j4 = 519;
        long j5 = -1;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = (j5 ^ 2331645809436161674L) | (jIdentityHashCode ^ j5);
        long j7 = j3 + (((j6 ^ j5) | (-1538942355791957250L)) * j4) + (((long) (-519)) * (((j6 | (-1538942355791957250L)) ^ j5) | (((-1513280295225264386L) | jIdentityHashCode) ^ j5))) + (j4 * (((jIdentityHashCode | (-1538942355791957250L)) ^ j5) | 2331645809436161674L));
        int i5 = 0;
        long j8 = j;
        int i6 = i4;
        while (true) {
            for (int i7 = 0; i7 != 8; i7++) {
                i6 = (((((int) (j8 >> i7)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j8 = j7;
        }
        if (i6 != i2) {
            int i8 = equals + 87;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 33, (char) (19696 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j9 = -1;
            long j10 = ((long) (i2 ^ i3)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)));
            long j11 = 0;
            long j12 = j10 | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetBefore("", 0), 42 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-967349816, Long.valueOf(j12), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Gravity.getAbsoluteGravity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 57, (char) KeyEvent.getDeadChar(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String string = json.optString("functionDefine").toString();
        String str = "theme_functions_" + LanguageUtils.getInstance().getCurrentLang() + themeId;
        if (string.length() > 0) {
            SPUtils.getInstance(HomeConstants.SP_NAME).put(str, string);
            int i10 = equals + 107;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public final void downloadZip(String zipUrl, String themeId, int themeVersion) {
        String fullUrl;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zipUrl, "");
        Intrinsics.checkNotNullParameter(themeId, "");
        if (component1(themeId, themeVersion, themeId + "-" + themeVersion)) {
            return;
        }
        if (!(!Intrinsics.areEqual(themeId, defaultThemeId())) && themeVersion == defaultThemeVersion()) {
            int i2 = getAsAtTimestamp + 95;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                component1();
                return;
            } else {
                component1();
                int i3 = 18 / 0;
                return;
            }
        }
        File filesDir = Utils.getApp().getFilesDir();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "theme/%s/%s/theme.zip", Arrays.copyOf(new Object[]{themeId, Integer.valueOf(themeVersion)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        File file = new File(filesDir, str);
        if (zipUrl.length() == 0) {
            int i4 = getAsAtTimestamp + 35;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                AppConfigManager.getAppConfig().getH5BaseUrl();
                throw null;
            }
            fullUrl = AppConfigManager.getAppConfig().getH5BaseUrl();
        } else {
            fullUrl = UrlUtils.getFullUrl(AppConfigManager.getAppConfig().getH5BaseUrl(), zipUrl);
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        new FileRequest(absolutePath, false, false, 6, null).method(BaseRequest.Method.GET).setUrl(fullUrl).sendSyncRequest();
    }

    public final boolean isZipDownload(String themeId, int themeVersion) {
        int i = 2 % 2;
        int i2 = equals + 123;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(themeId, "");
            getThemeContent(themeId, Integer.valueOf(themeVersion)).length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(themeId, "");
        if (getThemeContent(themeId, Integer.valueOf(themeVersion)).length() <= 0) {
            return false;
        }
        int i3 = equals + 59;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final void updateTheme(LocalHomeThemeData themeData) {
        int i = 2 % 2;
        int i2 = equals + 67;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(themeData, "");
        ColorConfigManager.updateThemeColor$default(ColorConfigManager.INSTANCE, themeData.getThemeColorConfig(), false, false, 6, null);
        ShareDataUIState.postValue(themeData.getFunctionDefines());
        component2.postValue(themeData.getFunctionDefineGroups());
        component3.postValue(themeData.getHomeTheme());
        component1 = themeData.getAppIdFunIdMap();
        int i4 = getAsAtTimestamp + 113;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LocalI18nResource getCacheI18NResource(String themeId) {
        int i = 2 % 2;
        LocalI18nResource local = RemoteI18nResourceKt.toLocal((RemoteI18nResource) SecureGsonUtils.fromJson(SPUtils.getInstance(HomeConstants.SP_NAME).getString("theme_i18n_" + themeId), RemoteI18nResource.class));
        int i2 = equals + 11;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return local;
        }
        throw null;
    }

    public final String getThemeColors(String themeJson) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(themeJson, "");
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(themeJson).optJSONObject("globalSettings");
            if (jSONObjectOptJSONObject != null) {
                int i2 = equals + 17;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                String strOptString = jSONObjectOptJSONObject.optString("configValue");
                int i4 = equals + 47;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return strOptString;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final LiveData<Map<String, LocalHomeFunction>> getFunctionDefines() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Map<String, LocalHomeFunction>> mutableLiveData = ShareDataUIState;
        Intrinsics.checkNotNull(mutableLiveData, "");
        MutableLiveData<Map<String, LocalHomeFunction>> mutableLiveData2 = mutableLiveData;
        int i4 = equals + 35;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData2;
    }

    public final LiveData<List<LocalFunctionGroup>> getFunctionDefineGroups() {
        int i = 2 % 2;
        int i2 = equals + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<List<LocalFunctionGroup>> mutableLiveData = component2;
        Intrinsics.checkNotNull(mutableLiveData, "");
        MutableLiveData<List<LocalFunctionGroup>> mutableLiveData2 = mutableLiveData;
        int i4 = equals + 11;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return mutableLiveData2;
    }

    private final void component1() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            component1(defaultThemeId(), defaultThemeVersion(), "theme.zip");
            int i3 = 18 / 0;
        } else {
            component1(defaultThemeId(), defaultThemeVersion(), "theme.zip");
        }
        int i4 = getAsAtTimestamp + 29;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }

    private final boolean component1(String str, int i, String str2) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int iShareDataUIState = R.xml.ShareDataUIState(arrayList);
        int i3 = iShareDataUIState ^ i;
        if (iShareDataUIState != 0) {
            int i4 = equals + 119;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            long j = -1;
            long j2 = ((long) (i ^ i3)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 1) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 6618, 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr = {-824166928, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", ""), 56 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.getOffsetAfter("", 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i / (((i - 1) * i) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            AssetManager assets = Utils.getApp().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "");
            InputStream inputStreamOpen = assets.open(str2);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            File filesDir = Utils.getApp().getFilesDir();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.ENGLISH, "theme/%s/%s/theme.zip", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            FileDownloadUtils.stream2File(inputStreamOpen, new File(filesDir, str3).getAbsolutePath(), true);
            int i6 = getAsAtTimestamp + 89;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void saveThemeInfo(HomeThemeDetailParams params) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(params, "");
            params.getThemeId();
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        if (params.getThemeId() != null) {
            int i3 = equals + 59;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
                if (params.getThemeVersion() == null) {
                    return;
                }
            } else if (params.getThemeVersion() == null) {
                return;
            }
            int i5 = equals + 59;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            SPUtils.getInstance("homeModuleNoCache").put("themeId", params.getThemeId());
            SPUtils.getInstance("homeModuleNoCache").put("themeVersion", params.getThemeVersion().intValue());
        }
    }

    private final HomeThemeDetailParams component3() {
        int i = 2 % 2;
        HomeThemeDetailParams homeThemeDetailParams = new HomeThemeDetailParams(defaultThemeId(), Integer.valueOf(defaultThemeVersion()), null, 4, null);
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return homeThemeDetailParams;
    }

    public final String getThemeContent(String themeId, Integer themeVersion) {
        int i = 2 % 2;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "theme/%s/%s/Theme_default.json", Arrays.copyOf(new Object[]{themeId, themeVersion}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String themeContent = getThemeContent(str);
        if (themeContent.length() <= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, "theme/%s/%s/Theme.json", Arrays.copyOf(new Object[]{themeId, themeVersion}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String themeContent2 = getThemeContent(str2);
            int i2 = equals + 99;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return themeContent2;
        }
        int i4 = equals + 13;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return themeContent;
    }

    public final String getThemeContent(String path) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(path, "");
        try {
            String file = readFile(new File(Utils.getApp().getFilesDir(), path));
            String strOptString = new JSONObject(file).optString("total", file);
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            String strComponent1 = component1(strOptString);
            int i2 = getAsAtTimestamp + 93;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return strComponent1;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String component1(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        equals = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                String asString = JsonParser.parseString(str).getAsJsonPrimitive().getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "");
                int i3 = equals + 75;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                return asString;
            }
            Intrinsics.checkNotNullExpressionValue(JsonParser.parseString(str).getAsJsonPrimitive().getAsString(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return str;
        }
    }

    public final String readFile(File file) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
                int i2 = getAsAtTimestamp + 49;
                int i3 = i2 % 128;
                equals = i3;
                int i4 = i2 % 2;
                if (line != null) {
                    int i5 = i3 + 9;
                    getAsAtTimestamp = i5 % 128;
                    int i6 = i5 % 2;
                    sb.append(line);
                    int i7 = equals + 91;
                    getAsAtTimestamp = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public final Map<String, String> loadThemeI18NResources(String themeId, Integer themeVersion) {
        int i = 2 % 2;
        String currentLang = LanguageUtils.getInstance().getCurrentLang();
        File filesDir = Utils.getApp().getFilesDir();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "theme/%s/%d/resources/i18n/android/strings-%s.xml", Arrays.copyOf(new Object[]{themeId, themeVersion, currentLang}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        Map<String, String> mapLoadStrings = ResourceStringUtils.loadStrings(new File(filesDir, str));
        Intrinsics.checkNotNullExpressionValue(mapLoadStrings, "");
        int i2 = getAsAtTimestamp + 113;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return mapLoadStrings;
        }
        throw null;
    }

    public final boolean loadThemeImage(ImageView iv, String url, int defaultIcon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iv, "");
        String str = url;
        if (str != null) {
            int i2 = getAsAtTimestamp + 105;
            equals = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                String h5BaseUrl = AppConfigManager.getAppConfig().getH5BaseUrl();
                Intrinsics.checkNotNullExpressionValue(h5BaseUrl, "");
                String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(url, h5BaseUrl, "", false, 4, (Object) null), "/common/image", "", false, 4, (Object) null);
                String string = SPUtils.getInstance("homeModuleNoCache").getString("themeId");
                int i4 = SPUtils.getInstance("homeModuleNoCache").getInt("themeVersion");
                File file = new File(Utils.getApp().getFilesDir(), "theme" + File.separator + string + File.separator + i4 + File.separator + "resources/img" + strReplace$default);
                if (!file.exists()) {
                    return GlideUtils.setFunctionIcon(iv, url, defaultIcon);
                }
                ImageRequest.INSTANCE.get().load(file).into(iv).request();
                return true;
            }
            int i5 = equals + 23;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        }
        return GlideUtils.setFunctionIcon(iv, url, defaultIcon);
    }

    public final String defaultThemeId() {
        int i = 2 % 2;
        int i2 = equals + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String defaultThemeId = ((IHomeTheme) RouteUtils.getService(IHomeTheme.class)).getDefaultThemeId();
        int i4 = getAsAtTimestamp + 79;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return defaultThemeId;
    }

    public final int defaultThemeVersion() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int defaultThemeVersion = ((IHomeTheme) RouteUtils.getService(IHomeTheme.class)).getDefaultThemeVersion();
        int i4 = getAsAtTimestamp + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return defaultThemeVersion;
    }
}
