package com.huawei.digitalpayment.common.theme.model;

import android.graphics.Color;
import com.blankj.utilcode.util.StringUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.common.theme.R;
import com.huawei.digitalpayment.common.theme.ThemeManager;
import com.huawei.digitalpayment.common.theme.data.FunctionGroupResp;
import com.huawei.digitalpayment.common.theme.data.FunctionResp;
import com.huawei.digitalpayment.common.theme.data.HomeThemeResp;
import com.huawei.digitalpayment.common.theme.data.I18nResourceResp;
import com.huawei.digitalpayment.common.theme.data.NavigationComponent;
import com.huawei.digitalpayment.common.theme.model.IThemeInterface;
import com.huawei.digitalpayment.common.theme.request.params.ThemeDetailParams;
import com.huawei.digitalpayment.consumer.baselib.config.ColorConfigManager;
import com.huawei.digitalpayment.consumer.baselib.theme.ThemeConvertManager;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\fJ\u0012\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J(\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$0\u000bH\u0016J\u001e\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$0\u000b2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016J,\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$\u0018\u00010\u000b2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$\u0018\u00010\u000bH\u0016J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$0\u000bH\u0016J\u0019\u0010,\u001a\u0004\u0018\u00010\u00152\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u0004\u0018\u00010\f2\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/DefaultThemeImpl;", "Lcom/huawei/digitalpayment/common/theme/model/IThemeInterface;", "<init>", "()V", "i18nResource", "Lcom/huawei/digitalpayment/common/theme/data/I18nResourceResp;", "getI18nResource", "()Lcom/huawei/digitalpayment/common/theme/data/I18nResourceResp;", "setI18nResource", "(Lcom/huawei/digitalpayment/common/theme/data/I18nResourceResp;)V", "themeI18NResources", "", "", "getThemeI18NResources", "()Ljava/util/Map;", "setThemeI18NResources", "(Ljava/util/Map;)V", "defaultThemeI18NResources", "getDefaultThemeI18NResources", "setDefaultThemeI18NResources", "themeColorConfig", "", "getThemeColorConfig", "setThemeColorConfig", "getI18nResourceByKey", "key", "loadCurrentTheme", "Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "parseNavigationComponent", "Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;", "themeContent", "getFunctionDefine", "getMiniAppFunctions", "functionDefine", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "convertFunctionDefine", "sortByOrder", "map", "convertFunctionGroupDefine", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionGroupResp;", "functionDefines", "parseThemeColor", "origin", "(Ljava/lang/String;)Ljava/lang/Integer;", "parseThemeString", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultThemeImpl implements IThemeInterface {
    public static final String COLOR_REFERENCE = "@color/";

    public static final Companion INSTANCE = new Companion(null);
    public static final String STRING_REFERENCE = "@string/";
    public static final String TYPE_OTHER = "other";
    private static int component3 = 0;
    private static int copy = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private Map<String, String> ShareDataUIState;
    private I18nResourceResp component1 = new I18nResourceResp(null, null, null, 7, null);
    private Map<String, Integer> component2;
    private Map<String, String> copydefault;

    public DefaultThemeImpl() {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "");
        this.copydefault = mapEmptyMap;
        this.ShareDataUIState = MapsKt.emptyMap();
        Map<String, Integer> mapEmptyMap2 = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap2, "");
        this.component2 = mapEmptyMap2;
    }

    @Override
    public boolean copyAssetsZip(String str, int i, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = copy + 109;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean zCopyAssetsZip = IThemeInterface.DefaultImpls.copyAssetsZip(this, str, i, str2);
        int i5 = equals + 123;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return zCopyAssetsZip;
    }

    @Override
    public void copyDefaultZip() {
        int i = 2 % 2;
        int i2 = copy + 125;
        equals = i2 % 128;
        int i3 = i2 % 2;
        IThemeInterface.DefaultImpls.copyDefaultZip(this);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void downloadFont(String str, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 3;
        equals = i3 % 128;
        int i4 = i3 % 2;
        IThemeInterface.DefaultImpls.downloadFont(this, str, i);
        int i5 = equals + 1;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void downloadFont(List<String> list) throws InterruptedException {
        int i = 2 % 2;
        int i2 = equals + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        IThemeInterface.DefaultImpls.downloadFont(this, list);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
    }

    @Override
    public void downloadSingleFont(String str) {
        int i = 2 % 2;
        int i2 = equals + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
        IThemeInterface.DefaultImpls.downloadSingleFont(this, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void downloadZip(String str, String str2, int i) throws Exception {
        int i2 = 2 % 2;
        int i3 = copy + 39;
        equals = i3 % 128;
        int i4 = i3 % 2;
        IThemeInterface.DefaultImpls.downloadZip(this, str, str2, i);
        int i5 = equals + 65;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
    }

    @Override
    public FunctionResp fillFunction(FunctionResp functionResp, Map<String, ? extends FunctionResp> map) {
        int i = 2 % 2;
        int i2 = copy + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        FunctionResp functionRespFillFunction = IThemeInterface.DefaultImpls.fillFunction(this, functionResp, map);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return functionRespFillFunction;
    }

    @Override
    public List<FunctionResp> fillFunctions(List<? extends FunctionResp> list, Map<String, ? extends FunctionResp> map) {
        int i = 2 % 2;
        int i2 = copy + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        List<FunctionResp> listFillFunctions = IThemeInterface.DefaultImpls.fillFunctions(this, list, map);
        int i4 = copy + 1;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return listFillFunctions;
    }

    @Override
    public boolean filterByCurrencyConfig(FunctionResp functionResp) {
        int i = 2 % 2;
        int i2 = equals + 11;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return IThemeInterface.DefaultImpls.filterByCurrencyConfig(this, functionResp);
        }
        IThemeInterface.DefaultImpls.filterByCurrencyConfig(this, functionResp);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean filterDefineNull() {
        int i = 2 % 2;
        int i2 = copy + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean zFilterDefineNull = IThemeInterface.DefaultImpls.filterDefineNull(this);
        int i4 = equals + 51;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return zFilterDefineNull;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public I18nResourceResp getCacheI18NResource(String str) {
        int i = 2 % 2;
        int i2 = equals + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        I18nResourceResp cacheI18NResource = IThemeInterface.DefaultImpls.getCacheI18NResource(this, str);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return cacheI18NResource;
    }

    @Override
    public ThemeDetailParams getCacheTheme() {
        int i = 2 % 2;
        int i2 = copy + 31;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IThemeInterface.DefaultImpls.getCacheTheme(this);
            obj.hashCode();
            throw null;
        }
        ThemeDetailParams cacheTheme = IThemeInterface.DefaultImpls.getCacheTheme(this);
        int i3 = copy + 111;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return cacheTheme;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public ThemeDetailParams getDefaultTheme() {
        int i = 2 % 2;
        int i2 = equals + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ThemeDetailParams defaultTheme = IThemeInterface.DefaultImpls.getDefaultTheme(this);
        int i4 = copy + 73;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return defaultTheme;
    }

    @Override
    public String getDefaultThemeId() {
        int i = 2 % 2;
        int i2 = equals + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String defaultThemeId = IThemeInterface.DefaultImpls.getDefaultThemeId(this);
        int i4 = copy + 79;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return defaultThemeId;
    }

    @Override
    public int getDefaultThemeVersion() {
        int i = 2 % 2;
        int i2 = equals + 123;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return IThemeInterface.DefaultImpls.getDefaultThemeVersion(this);
        }
        IThemeInterface.DefaultImpls.getDefaultThemeVersion(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getFontFileForLang(String str, String str2) {
        int i = 2 % 2;
        int i2 = equals + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String fontFileForLang = IThemeInterface.DefaultImpls.getFontFileForLang(this, str, str2);
        int i4 = equals + 33;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return fontFileForLang;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public InputStream getFontInputStreamForH5() {
        int i = 2 % 2;
        int i2 = equals + 61;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IThemeInterface.DefaultImpls.getFontInputStreamForH5(this);
            obj.hashCode();
            throw null;
        }
        InputStream fontInputStreamForH5 = IThemeInterface.DefaultImpls.getFontInputStreamForH5(this);
        int i3 = copy + 115;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return fontInputStreamForH5;
        }
        throw null;
    }

    @Override
    public String getFunctionDefineGroupsJson() {
        int i = 2 % 2;
        int i2 = copy + 117;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String functionDefineGroupsJson = IThemeInterface.DefaultImpls.getFunctionDefineGroupsJson(this);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return functionDefineGroupsJson;
    }

    @Override
    public String getThemeColors(String str) {
        int i = 2 % 2;
        int i2 = equals + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String themeColors = IThemeInterface.DefaultImpls.getThemeColors(this, str);
        int i4 = copy + 35;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return themeColors;
        }
        throw null;
    }

    @Override
    public String getThemeColorsIn25(String str) {
        int i = 2 % 2;
        int i2 = equals + 49;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            IThemeInterface.DefaultImpls.getThemeColorsIn25(this, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String themeColorsIn25 = IThemeInterface.DefaultImpls.getThemeColorsIn25(this, str);
        int i3 = equals + 97;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return themeColorsIn25;
    }

    @Override
    public String getThemeContent(String str) {
        int i = 2 % 2;
        int i2 = copy + 53;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return IThemeInterface.DefaultImpls.getThemeContent(this, str);
        }
        IThemeInterface.DefaultImpls.getThemeContent(this, str);
        throw null;
    }

    @Override
    public String getThemeContent(String str, Integer num) {
        int i = 2 % 2;
        int i2 = equals + 59;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String themeContent = IThemeInterface.DefaultImpls.getThemeContent(this, str, num);
        int i4 = equals + 83;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return themeContent;
        }
        throw null;
    }

    @Override
    public String getThemeFonts(String str) {
        int i = 2 % 2;
        int i2 = equals + 17;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String themeFonts = IThemeInterface.DefaultImpls.getThemeFonts(this, str);
        int i4 = equals + 101;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return themeFonts;
    }

    @Override
    public String getUserInfoKey() {
        int i = 2 % 2;
        int i2 = equals + 61;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            IThemeInterface.DefaultImpls.getUserInfoKey(this);
            throw null;
        }
        String userInfoKey = IThemeInterface.DefaultImpls.getUserInfoKey(this);
        int i3 = copy + 13;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return userInfoKey;
    }

    @Override
    public boolean isFilterFunction(FunctionResp functionResp) {
        int i = 2 % 2;
        int i2 = copy + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsFilterFunction = IThemeInterface.DefaultImpls.isFilterFunction(this, functionResp);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = equals + 103;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsFilterFunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isFilterFunction(String str) {
        int i = 2 % 2;
        int i2 = copy + 13;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return IThemeInterface.DefaultImpls.isFilterFunction(this, str);
        }
        IThemeInterface.DefaultImpls.isFilterFunction(this, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isFilterMiniApp(String str) {
        int i = 2 % 2;
        int i2 = copy + 85;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IThemeInterface.DefaultImpls.isFilterMiniApp(this, str);
            throw null;
        }
        boolean zIsFilterMiniApp = IThemeInterface.DefaultImpls.isFilterMiniApp(this, str);
        int i3 = copy + 91;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return zIsFilterMiniApp;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isPreview(String str, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 37;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IThemeInterface.DefaultImpls.isPreview(this, str, i);
            obj.hashCode();
            throw null;
        }
        boolean zIsPreview = IThemeInterface.DefaultImpls.isPreview(this, str, i);
        int i4 = copy + 103;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsPreview;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isZipDownload(String str, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 51;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return IThemeInterface.DefaultImpls.isZipDownload(this, str, i);
        }
        IThemeInterface.DefaultImpls.isZipDownload(this, str, i);
        throw null;
    }

    @Override
    public HomeThemeResp loadTheme(String str) {
        int i = 2 % 2;
        int i2 = copy + 49;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            IThemeInterface.DefaultImpls.loadTheme(this, str);
            throw null;
        }
        HomeThemeResp homeThemeRespLoadTheme = IThemeInterface.DefaultImpls.loadTheme(this, str);
        int i3 = copy + 9;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return homeThemeRespLoadTheme;
    }

    @Override
    public HomeThemeResp loadThemeAfterLogin(String str) {
        int i = 2 % 2;
        int i2 = copy + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeResp homeThemeRespLoadThemeAfterLogin = IThemeInterface.DefaultImpls.loadThemeAfterLogin(this, str);
        int i4 = copy + 53;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return homeThemeRespLoadThemeAfterLogin;
    }

    @Override
    public HomeThemeResp loadThemeData(ThemeDetailParams themeDetailParams) {
        int i = 2 % 2;
        int i2 = copy + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeResp homeThemeRespLoadThemeData = IThemeInterface.DefaultImpls.loadThemeData(this, themeDetailParams);
        int i4 = equals + 71;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return homeThemeRespLoadThemeData;
    }

    @Override
    public Map<String, String> loadThemeI18NResources(String str, Integer num, String str2) {
        int i = 2 % 2;
        int i2 = equals + 73;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapLoadThemeI18NResources = IThemeInterface.DefaultImpls.loadThemeI18NResources(this, str, num, str2);
        int i4 = equals + 45;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return mapLoadThemeI18NResources;
    }

    @Override
    public HomeThemeResp localDefaultThemeData() {
        HomeThemeResp homeThemeRespLocalDefaultThemeData;
        int i = 2 % 2;
        int i2 = equals + 103;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            homeThemeRespLocalDefaultThemeData = IThemeInterface.DefaultImpls.localDefaultThemeData(this);
            int i3 = 63 / 0;
        } else {
            homeThemeRespLocalDefaultThemeData = IThemeInterface.DefaultImpls.localDefaultThemeData(this);
        }
        int i4 = copy + 87;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return homeThemeRespLocalDefaultThemeData;
    }

    @Override
    public <T> List<T> maxCount(List<? extends T> list, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        List<T> listMaxCount = IThemeInterface.DefaultImpls.maxCount(this, list, i);
        int i5 = copy + 81;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return listMaxCount;
    }

    @Override
    public Map<String, Map<String, String>> parseFonts(String str) {
        int i = 2 % 2;
        int i2 = copy + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Map<String, String>> fonts = IThemeInterface.DefaultImpls.parseFonts(this, str);
        int i4 = copy + 17;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return fonts;
    }

    @Override
    public List<FunctionResp> parseFunctions(List<? extends FunctionResp> list, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 49;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<FunctionResp> functions = IThemeInterface.DefaultImpls.parseFunctions(this, list, i);
        int i5 = equals + 97;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return functions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int parseThemeColor(String str, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 17;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return IThemeInterface.DefaultImpls.parseThemeColor(this, str, i);
        }
        IThemeInterface.DefaultImpls.parseThemeColor(this, str, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String readFile(File file) {
        int i = 2 % 2;
        int i2 = copy + 33;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return IThemeInterface.DefaultImpls.readFile(this, file);
        }
        IThemeInterface.DefaultImpls.readFile(this, file);
        throw null;
    }

    @Override
    public void saveFunctionDefine(String str, String str2) {
        int i = 2 % 2;
        int i2 = copy + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        IThemeInterface.DefaultImpls.saveFunctionDefine(this, str, str2);
        int i4 = copy + 71;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void saveThemeInfo(ThemeDetailParams themeDetailParams) {
        int i = 2 % 2;
        int i2 = copy + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        IThemeInterface.DefaultImpls.saveThemeInfo(this, themeDetailParams);
        int i4 = copy + 3;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateI18nResource(String str, String str2) {
        int i = 2 % 2;
        int i2 = equals + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        IThemeInterface.DefaultImpls.updateI18nResource(this, str, str2);
        int i4 = copy + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public I18nResourceResp getI18nResource() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 115;
        copy = i3 % 128;
        int i4 = i3 % 2;
        I18nResourceResp i18nResourceResp = this.component1;
        int i5 = i2 + 39;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return i18nResourceResp;
    }

    public void setI18nResource(I18nResourceResp i18nResourceResp) {
        int i = 2 % 2;
        int i2 = copy + 103;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(i18nResourceResp, "");
            this.component1 = i18nResourceResp;
            int i3 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(i18nResourceResp, "");
            this.component1 = i18nResourceResp;
        }
        int i4 = equals + 77;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public Map<String, String> getThemeI18NResources() {
        Map<String, String> map;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 109;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            map = this.copydefault;
            int i4 = 11 / 0;
        } else {
            map = this.copydefault;
        }
        int i5 = i2 + 39;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public void setThemeI18NResources(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = equals + 43;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = map;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = map;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Map<String, String> getDefaultThemeI18NResources() {
        int i = 2 % 2;
        int i2 = equals + 59;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return map;
    }

    public void setDefaultThemeI18NResources(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = equals + 7;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.ShareDataUIState = map;
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            this.ShareDataUIState = map;
        }
        int i4 = equals + 25;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public Map<String, Integer> getThemeColorConfig() {
        int i = 2 % 2;
        int i2 = equals + 49;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setThemeColorConfig(Map<String, Integer> map) {
        int i = 2 % 2;
        int i2 = copy + 71;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.component2 = map;
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = map;
        int i3 = copy + 99;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public String getI18nResourceByKey(String key) {
        String str;
        int i = 2 % 2;
        int i2 = equals + 21;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str2 = key;
        if (str2 != null) {
            int i4 = i3 + 9;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() != 0) {
                Map<String, Map<String, String>> theme = getI18nResource().getTheme();
                if (theme.containsKey(key)) {
                    Map<String, String> map = theme.get(key);
                    if (map != null) {
                        str = map.get(LanguageUtils.getInstance().getCurrentLang());
                        int i6 = equals + 101;
                        copy = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                Map<String, Map<String, String>> common = getI18nResource().getCommon();
                if (common.containsKey(key)) {
                    Map<String, String> map2 = common.get(key);
                    String str3 = map2 != null ? map2.get(LanguageUtils.getInstance().getCurrentLang()) : null;
                    if (str3 != null) {
                        return str3;
                    }
                }
                if (getThemeI18NResources().containsKey(key)) {
                    int i8 = equals + 1;
                    copy = i8 % 128;
                    int i9 = i8 % 2;
                    String str4 = getThemeI18NResources().get(key);
                    return str4 == null ? "" : str4;
                }
                if (getDefaultThemeI18NResources().containsKey(key)) {
                    int i10 = equals + 13;
                    copy = i10 % 128;
                    int i11 = i10 % 2;
                    String str5 = getDefaultThemeI18NResources().get(key);
                    if (i11 != 0) {
                        return str5 == null ? "" : str5;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    @Override
    public HomeThemeResp loadCurrentTheme(ThemeDetailParams params) {
        String string;
        int i = 2 % 2;
        int i2 = copy + 93;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        String themeContent = getThemeContent(params.getThemeId(), params.getThemeVersion());
        if (themeContent.length() == 0) {
            throw new RuntimeException(StringUtils.getString(R.string.home_theme_download_fail));
        }
        String themeColors = getThemeColors(themeContent);
        Map<String, Map<String, String>> fonts = parseFonts(getThemeFonts(themeContent));
        setThemeColorConfig(ColorConfigManager.INSTANCE.parseColors(themeColors));
        setI18nResource(getCacheI18NResource(params.getThemeId()));
        setThemeI18NResources(IThemeInterface.DefaultImpls.loadThemeI18NResources$default(this, params.getThemeId(), params.getThemeVersion(), null, 4, null));
        String themeId = params.getThemeId();
        Integer themeVersion = params.getThemeVersion();
        String defaultLanguageCode = LanguageUtils.getInstance().getLanguage().getDefaultLanguageCode();
        Intrinsics.checkNotNullExpressionValue(defaultLanguageCode, "");
        setDefaultThemeI18NResources(loadThemeI18NResources(themeId, themeVersion, defaultLanguageCode));
        Map<String, FunctionResp> mapConvertFunctionDefine = convertFunctionDefine(component2(params));
        List<FunctionGroupResp> listConvertFunctionGroupDefine = convertFunctionGroupDefine(mapConvertFunctionDefine);
        ThemeManager.INSTANCE.getTempFunctionDefines().clear();
        ThemeManager.INSTANCE.getTempFunctionDefines().putAll(mapConvertFunctionDefine);
        JSONObject jSONObjectOptJSONObject = new JSONObject(themeContent).optJSONObject("navigator");
        if (jSONObjectOptJSONObject != null) {
            string = jSONObjectOptJSONObject.toString();
            int i4 = equals + 91;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = null;
        }
        return new HomeThemeResp(parseNavigationComponent(string), mapConvertFunctionDefine, listConvertFunctionGroupDefine, themeColors, getMiniAppFunctions(mapConvertFunctionDefine), fonts, params);
    }

    public final NavigationComponent parseNavigationComponent(String themeContent) {
        int i = 2 % 2;
        int i2 = copy + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        NavigationComponent navigationComponent = (NavigationComponent) ThemeConvertManager.INSTANCE.convert(themeContent);
        int i4 = equals + 5;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return navigationComponent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String component2(com.huawei.digitalpayment.common.theme.request.params.ThemeDetailParams r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.common.language.LanguageUtils r1 = com.huawei.common.language.LanguageUtils.getInstance()
            java.lang.String r1 = r1.getCurrentLang()
            java.lang.String r2 = r7.getThemeId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "theme_functions_"
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "homeThemeModule"
            com.huawei.common.util.SPUtils r3 = com.huawei.common.util.SPUtils.getInstance(r3)
            java.lang.String r2 = r3.getString(r2)
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L3e
            int r4 = com.huawei.digitalpayment.common.theme.model.DefaultThemeImpl.equals
            int r4 = r4 + 27
            int r5 = r4 % 128
            com.huawei.digitalpayment.common.theme.model.DefaultThemeImpl.copy = r5
            int r4 = r4 % r0
            int r3 = r3.length()
            if (r3 != 0) goto L8f
        L3e:
            java.lang.String r3 = r6.getDefaultThemeId()
            java.lang.String r7 = r7.getThemeId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
            if (r7 == 0) goto L8f
            android.app.Application r7 = com.blankj.utilcode.util.Utils.getApp()
            java.io.File r7 = r7.getFilesDir()
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = r6.getDefaultThemeId()
            int r4 = r6.getDefaultThemeVersion()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r1}
            r3 = 3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r3 = "theme/%s/%s/functionDefine-%s.json"
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r7, r1)
            java.lang.String r2 = r6.readFile(r2)
            int r7 = com.huawei.digitalpayment.common.theme.model.DefaultThemeImpl.equals
            int r7 = r7 + 43
            int r1 = r7 % 128
            com.huawei.digitalpayment.common.theme.model.DefaultThemeImpl.copy = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L8f
            r7 = 5
            int r7 = r7 / 4
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.model.DefaultThemeImpl.component2(com.huawei.digitalpayment.common.theme.request.params.ThemeDetailParams):java.lang.String");
    }

    public Map<String, String> getMiniAppFunctions(Map<String, ? extends FunctionResp> functionDefine) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functionDefine, "");
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, ? extends FunctionResp>> it = functionDefine.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = copy + 73;
            equals = i2 % 128;
            int i3 = i2 % 2;
            FunctionResp value = it.next().getValue();
            String host = SafeUri.getHost(value.getExecute());
            if (host != null) {
                HashMap map2 = map;
                String funcId = value.getFuncId();
                if (funcId == null) {
                    int i4 = copy + 37;
                    equals = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 74 / 0;
                    }
                    funcId = "";
                }
                map2.put(host, funcId);
                int i6 = equals + 115;
                copy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        HashMap map3 = map;
        int i8 = equals + 3;
        copy = i8 % 128;
        int i9 = i8 % 2;
        return map3;
    }

    @Override
    public Map<String, FunctionResp> convertFunctionDefine(String functionDefine) {
        int i = 2 % 2;
        int i2 = equals + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = functionDefine;
        if (str == null || str.length() == 0) {
            Map<String, FunctionResp> mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "");
            return mapEmptyMap;
        }
        Map<String, FunctionResp> mapSortByOrder = sortByOrder((Map) SecureGsonUtils.fromJson(functionDefine, new TypeToken<Map<String, ? extends FunctionResp>>() {
        }.getType()));
        if (mapSortByOrder != null) {
            return mapSortByOrder;
        }
        int i4 = equals + 59;
        copy = i4 % 128;
        int i5 = i4 % 2;
        Map<String, FunctionResp> mapEmptyMap2 = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap2, "");
        int i6 = equals + 107;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return mapEmptyMap2;
    }

    public Map<String, FunctionResp> sortByOrder(Map<String, ? extends FunctionResp> map) {
        int i = 2 % 2;
        Object obj = null;
        if (map == null) {
            int i2 = copy + 43;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : CollectionsKt.sortedWith(map.entrySet(), new Comparator() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final int compare(T t, T t2) {
                int i4 = 2 % 2;
                int i5 = component2 + 61;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                int iCompareValues = ComparisonsKt.compareValues((FunctionResp) ((Map.Entry) t).getValue(), (FunctionResp) ((Map.Entry) t2).getValue());
                int i7 = component3 + 103;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                return iCompareValues;
            }
        })) {
            int i4 = equals + 123;
            copy = i4 % 128;
            int i5 = i4 % 2;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        int i6 = equals + 27;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return linkedHashMap;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.huawei.digitalpayment.common.theme.data.FunctionGroupResp> convertFunctionGroupDefine(java.util.Map<java.lang.String, ? extends com.huawei.digitalpayment.common.theme.data.FunctionResp> r20) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.model.DefaultThemeImpl.convertFunctionGroupDefine(java.util.Map):java.util.List");
    }

    @Override
    public Integer parseThemeColor(String origin) {
        int i = 2 % 2;
        Integer numValueOf = null;
        if (origin == null) {
            int i2 = copy + 15;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return null;
        }
        if (StringsKt.startsWith$default(origin, "@color/", false, 2, (Object) null)) {
            String strReplace$default = StringsKt.replace$default(origin, "@color/", "", false, 4, (Object) null);
            if (!getThemeColorConfig().containsKey(strReplace$default)) {
                return ColorConfigManager.INSTANCE.getColorByEntryName(strReplace$default);
            }
            int i4 = equals + 97;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return getThemeColorConfig().get(strReplace$default);
        }
        try {
            numValueOf = Integer.valueOf(Color.parseColor(origin));
        } catch (Exception unused) {
        }
        int i6 = copy + 1;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return numValueOf;
    }

    @Override
    public String parseThemeString(String origin) {
        String i18nResourceByKey;
        int i = 2 % 2;
        int i2 = copy + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (origin == null) {
            return null;
        }
        if (!StringsKt.startsWith$default(origin, "@string/", false, 2, (Object) null)) {
            return origin;
        }
        int i4 = copy + 113;
        equals = i4 % 128;
        if (i4 % 2 == 0 ? (i18nResourceByKey = getI18nResourceByKey(StringsKt.replace$default(origin, "@string/", "", false, 4, (Object) null))) == null : (i18nResourceByKey = getI18nResourceByKey(StringsKt.replace$default(origin, "@string/", "", true, 4, (Object) null))) == null) {
            return "";
        }
        int i5 = equals + 5;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return i18nResourceByKey;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/DefaultThemeImpl$Companion;", "", "<init>", "()V", "COLOR_REFERENCE", "", "STRING_REFERENCE", "TYPE_OTHER", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = getRequestBeneficiariesState + 49;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
