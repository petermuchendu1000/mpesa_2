package com.huawei.digitalpayment.home.theme;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.ColorConfigManager;
import com.huawei.digitalpayment.consumer.homeModule.R;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.digitalpayment.home.data.FunctionExtKt;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction;
import com.huawei.digitalpayment.home.request.HomeThemeDetailParams;
import com.huawei.digitalpayment.home.theme.data.IHomeTheme;
import com.huawei.digitalpayment.home.theme.data.local.LocalComponent;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeThemeData;
import com.huawei.digitalpayment.home.theme.data.local.LocalI18nResource;
import com.huawei.digitalpayment.home.theme.data.remote.RemoteHomePageKt;
import com.huawei.digitalpayment.home.theme.data.remote.RemoteHomeTheme;
import com.huawei.digitalpayment.home.theme.data.remote.RemoteNavigator;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000bH\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000bH\u0016J&\u0010\u0017\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000bH\u0002¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/HomeTheme;", "Lcom/huawei/digitalpayment/home/theme/data/IHomeTheme;", "<init>", "()V", "loadCurrentTheme", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeThemeData;", "params", "Lcom/huawei/digitalpayment/home/request/HomeThemeDetailParams;", "getFunctionDefine", "", "getMiniAppFunctions", "", "functionDefine", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "convertFunctionDefine", "convertFunctionGroupDefine", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "functionDefines", "refreshThemeFunctions", "", "homeTheme", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "refreshLocalComponents", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "Companion", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class HomeTheme implements IHomeTheme {
    private static Map<String, String> ShareDataUIState = null;
    private static final String component1 = "HomeTheme";
    private static int component2 = 0;
    private static Map<String, Integer> component3 = null;
    private static int component4 = 1;
    private static int copy = 1;
    private static int getAsAtTimestamp;

    public static final Companion INSTANCE = new Companion(null);
    private static LocalI18nResource copydefault = new LocalI18nResource(null, null, null, 7, null);

    public static final LocalI18nResource access$getI18nResource$cp() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 3;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        LocalI18nResource localI18nResource = copydefault;
        int i5 = i2 + 1;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return localI18nResource;
    }

    public static final Map access$getThemeColorConfig$cp() {
        Map<String, Integer> map;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 47;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            map = component3;
            int i4 = 33 / 0;
        } else {
            map = component3;
        }
        int i5 = i2 + 65;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Map access$getThemeI18NResources$cp() {
        int i = 2 % 2;
        int i2 = copy + 121;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Map<String, String> map = ShareDataUIState;
        int i5 = i3 + 9;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final void access$setI18nResource$cp(LocalI18nResource localI18nResource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        copydefault = localI18nResource;
        int i5 = i3 + 93;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$setThemeColorConfig$cp(Map map) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 7;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        component3 = map;
        int i5 = i2 + 27;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setThemeI18NResources$cp(Map map) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        ShareDataUIState = map;
        int i5 = i3 + 107;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public String getDefaultThemeId() {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String defaultThemeId = IHomeTheme.DefaultImpls.getDefaultThemeId(this);
        int i4 = copy + 107;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultThemeId;
        }
        throw null;
    }

    @Override
    public int getDefaultThemeVersion() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return IHomeTheme.DefaultImpls.getDefaultThemeVersion(this);
        }
        IHomeTheme.DefaultImpls.getDefaultThemeVersion(this);
        throw null;
    }

    @Override
    public LocalHomeThemeData loadCurrentTheme(HomeThemeDetailParams params) {
        RemoteNavigator navigator;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        String themeContent = HomeThemeManager.INSTANCE.getThemeContent(params.getThemeId(), params.getThemeVersion());
        String themeColors = HomeThemeManager.INSTANCE.getThemeColors(themeContent);
        Companion companion = INSTANCE;
        component3 = ColorConfigManager.INSTANCE.parseColors(themeColors);
        copydefault = HomeThemeManager.INSTANCE.getCacheI18NResource(params.getThemeId());
        ShareDataUIState = HomeThemeManager.INSTANCE.loadThemeI18NResources(params.getThemeId(), params.getThemeVersion());
        try {
            RemoteHomeTheme remoteHomeTheme = (RemoteHomeTheme) GsonUtils.fromJson(themeContent, new TypeToken<RemoteHomeTheme>() {
            }.getType());
            if (remoteHomeTheme != null) {
                navigator = remoteHomeTheme.getNavigator();
                int i2 = copy + 55;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = getAsAtTimestamp + 15;
                copy = i4 % 128;
                int i5 = i4 % 2;
                navigator = null;
            }
            LocalHomeTheme local = RemoteHomePageKt.toLocal(navigator);
            Map<String, LocalHomeFunction> mapConvertFunctionDefine = convertFunctionDefine(component3(params));
            List<LocalFunctionGroup> listConvertFunctionGroupDefine = convertFunctionGroupDefine(mapConvertFunctionDefine);
            if (local != null) {
                int i6 = getAsAtTimestamp + 77;
                copy = i6 % 128;
                int i7 = i6 % 2;
                refreshThemeFunctions(local, mapConvertFunctionDefine);
                int i8 = copy + 103;
                getAsAtTimestamp = i8 % 128;
                int i9 = i8 % 2;
            }
            Companion.access$reset(companion);
            return new LocalHomeThemeData(local, mapConvertFunctionDefine, listConvertFunctionGroupDefine, themeColors, getMiniAppFunctions(mapConvertFunctionDefine));
        } catch (Exception unused) {
            throw new RuntimeException(StringUtils.getString(R.string.home_theme_download_fail));
        }
    }

    private final String component3(HomeThemeDetailParams homeThemeDetailParams) {
        int i = 2 % 2;
        String currentLang = LanguageUtils.getInstance().getCurrentLang();
        String string = SPUtils.getInstance(HomeConstants.SP_NAME).getString("theme_functions_" + currentLang + homeThemeDetailParams.getThemeId());
        String str = string;
        if ((str == null || str.length() == 0) && Intrinsics.areEqual(HomeThemeManager.INSTANCE.defaultThemeId(), homeThemeDetailParams.getThemeId())) {
            File filesDir = Utils.getApp().getFilesDir();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, "theme/%s/%s/functionDefine-%s.json", Arrays.copyOf(new Object[]{HomeThemeManager.INSTANCE.defaultThemeId(), Integer.valueOf(HomeThemeManager.INSTANCE.defaultThemeVersion()), currentLang}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            string = HomeThemeManager.INSTANCE.readFile(new File(filesDir, str2));
            int i2 = copy + 85;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = copy + 119;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public Map<String, String> getMiniAppFunctions(Map<String, LocalHomeFunction> functionDefine) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functionDefine, "");
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, LocalHomeFunction>> it = functionDefine.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = copy + 13;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                SafeUri.getHost(it.next().getValue().getExecute());
                throw null;
            }
            LocalHomeFunction value = it.next().getValue();
            String host = SafeUri.getHost(value.getExecute());
            if (host == null) {
                int i3 = getAsAtTimestamp + 61;
                copy = i3 % 128;
                int i4 = i3 % 2;
            } else {
                HashMap map2 = map;
                String funcId = value.getFuncId();
                if (funcId == null) {
                    int i5 = getAsAtTimestamp + 77;
                    copy = i5 % 128;
                    int i6 = i5 % 2;
                    funcId = "";
                }
                map2.put(host, funcId);
                int i7 = copy + 93;
                getAsAtTimestamp = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return map;
    }

    @Override
    public Map<String, LocalHomeFunction> convertFunctionDefine(String functionDefine) {
        int i = 2 % 2;
        int i2 = copy + 45;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = functionDefine;
        if (str != null && str.length() != 0) {
            Map<String, LocalHomeFunction> localFunctionDefine = FunctionExtKt.toLocalFunctionDefine((Map) SecureGsonUtils.fromJson(functionDefine, new TypeToken<Map<String, ? extends RemoteHomeFunction>>() {
            }.getType()));
            int i3 = copy + 95;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                return localFunctionDefine;
            }
            throw null;
        }
        Map<String, LocalHomeFunction> mapEmptyMap = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "");
        int i4 = getAsAtTimestamp + 85;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return mapEmptyMap;
    }

    @Override
    public List<LocalFunctionGroup> convertFunctionGroupDefine(Map<String, LocalHomeFunction> functionDefines) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functionDefines, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, LocalHomeFunction>> it = functionDefines.entrySet().iterator();
        int i2 = getAsAtTimestamp + 15;
        copy = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            LocalHomeFunction value = it.next().getValue();
            String funTag = value.getFunTag();
            ArrayList arrayList = (List) linkedHashMap.get(funTag);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            linkedHashMap.put(funTag, arrayList);
            arrayList.add(value);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i4 = getAsAtTimestamp + 93;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if (!((List) entry.getValue()).isEmpty()) {
                String funTag2 = ((LocalHomeFunction) ((List) entry.getValue()).get(0)).getFunTag();
                String funTagName = ((LocalHomeFunction) ((List) entry.getValue()).get(0)).getFunTagName();
                if (funTagName == null) {
                    funTagName = StringUtils.getString(R.string.home_function_group_other);
                }
                arrayList2.add(new LocalFunctionGroup(funTag2, null, funTagName, null, null, (List) entry.getValue(), 26, null));
            }
        }
        return arrayList2;
    }

    @Override
    public void refreshThemeFunctions(LocalHomeTheme homeTheme, Map<String, LocalHomeFunction> functionDefine) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeTheme, "");
        Intrinsics.checkNotNullParameter(functionDefine, "");
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        for (LocalComponent localComponent : homeTheme.getPages()) {
            int i4 = getAsAtTimestamp + 7;
            copy = i4 % 128;
            int i5 = i4 % 2;
            localComponent.setFunctions(HomeThemeKt.refreshLocalHomeFunction(localComponent.getFunctions(), functionDefine));
            copydefault(localComponent.getComponents(), functionDefine);
        }
    }

    private final void copydefault(List<LocalComponent> list, Map<String, LocalHomeFunction> map) {
        Iterator<LocalComponent> it;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            it = list.iterator();
            int i3 = 11 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i4 = getAsAtTimestamp + 77;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                LocalComponent next = it.next();
                next.setFunctions(HomeThemeKt.refreshLocalHomeFunction(next.getFunctions(), map));
                copydefault(next.getComponents(), map);
                int i5 = getAsAtTimestamp + 97;
                copy = i5 % 128;
                int i6 = i5 % 2;
            } else {
                LocalComponent next2 = it.next();
                next2.setFunctions(HomeThemeKt.refreshLocalHomeFunction(next2.getFunctions(), map));
                copydefault(next2.getComponents(), map);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/HomeTheme$Companion;", "", "<init>", "()V", "TAG", "", "i18nResource", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalI18nResource;", "themeI18NResources", "", "themeColorConfig", "", "getThemeColorConfig", "()Ljava/util/Map;", "setThemeColorConfig", "(Ljava/util/Map;)V", "reset", "", "getI18nResourceByKey", "key", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 0;
        private static int component2 = 1;

        private Companion() {
        }

        public static final void access$reset(Companion companion) {
            int i = 2 % 2;
            int i2 = component1 + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            companion.ShareDataUIState();
            int i4 = component2 + 125;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public final Map<String, Integer> getThemeColorConfig() {
            int i = 2 % 2;
            int i2 = component2 + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Map<String, Integer> mapAccess$getThemeColorConfig$cp = HomeTheme.access$getThemeColorConfig$cp();
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            return mapAccess$getThemeColorConfig$cp;
        }

        public final void setThemeColorConfig(Map<String, Integer> map) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                HomeTheme.access$setThemeColorConfig$cp(map);
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                HomeTheme.access$setThemeColorConfig$cp(map);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private final void ShareDataUIState() {
            int i = 2 % 2;
            HomeTheme.access$setI18nResource$cp(new LocalI18nResource(null, null, null, 7, null));
            HomeTheme.access$setThemeI18NResources$cp(Collections.emptyMap());
            setThemeColorConfig(Collections.emptyMap());
            int i2 = component1 + 3;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getI18nResourceByKey(String key) {
            String str;
            int i = 2 % 2;
            int i2 = component2 + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str2 = key;
            if (str2 != null && str2.length() != 0) {
                Map<String, Map<String, String>> themeI18nResources = HomeTheme.access$getI18nResource$cp().getThemeI18nResources();
                if (themeI18nResources.containsKey(key)) {
                    Map<String, String> map = themeI18nResources.get(key);
                    String str3 = map != null ? map.get(LanguageUtils.getInstance().getCurrentLang()) : null;
                    if (str3 != null) {
                        return str3;
                    }
                }
                Map<String, Map<String, String>> commonI18nResources = HomeTheme.access$getI18nResource$cp().getCommonI18nResources();
                if (commonI18nResources.containsKey(key)) {
                    Map<String, String> map2 = commonI18nResources.get(key);
                    if (map2 != null) {
                        str = map2.get(LanguageUtils.getInstance().getCurrentLang());
                        int i4 = component1 + 23;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        int i6 = component2 + 117;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        return str;
                    }
                }
                if (!(!HomeTheme.access$getThemeI18NResources$cp().containsKey(key))) {
                    String str4 = (String) HomeTheme.access$getThemeI18NResources$cp().get(key);
                    return str4 == null ? "" : str4;
                }
            }
            return null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "");
        ShareDataUIState = mapEmptyMap;
        Map<String, Integer> mapEmptyMap2 = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap2, "");
        component3 = mapEmptyMap2;
        int i = component4 + 5;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
