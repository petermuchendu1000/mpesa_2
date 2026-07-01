package com.huawei.digitalpayment.consumer.baselib.config;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Color;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.common.util.skin.SkinManager;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.init.PaymentResource;
import com.huawei.digitalpayment.consumer.scan.viewmodel.BaseScanViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014J$\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0018\u00010\u001cR\u00020\u001dJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0002\u0010 J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/ColorConfigManager;", "", "<init>", "()V", "TAG", "", "KEY_COLOR_CONFIG", "KEY_THEME_COLOR_CONFIG", "colorMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "h5ColorMap", "themeColorMap", "colorIds", "", "updateColor", "", ColorConfigManager.ShareDataUIState, "updateColorConfigForH5", "", "saveToLocal", "updateThemeColor", "parseColors", "", "getColor", GriverCacheDao.COLUMN_CACHE_ID, "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getColorByEntryName", "resourceEntryName", "(Ljava/lang/String;)Ljava/lang/Integer;", "getColorConfigForH5", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorConfigManager {
    private static final String ShareDataUIState = "colorConfig";
    private static final String component1 = "themeColorConfig";
    private static final String component3 = "ColorConfigManager";
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int hashCode = 1;
    public static final ColorConfigManager INSTANCE = new ColorConfigManager();
    private static final HashMap<String, Integer> copydefault = new HashMap<>();
    private static final HashMap<String, String> component4 = new HashMap<>();
    private static final HashMap<String, Integer> copy = new HashMap<>();
    private static final List<Integer> component2 = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.colorPrimary), Integer.valueOf(R.color.colorPrimaryHover), Integer.valueOf(R.color.colorPrimaryClick), Integer.valueOf(R.color.colorGround), Integer.valueOf(R.color.colorListHeader), Integer.valueOf(R.color.colorBackgroundFloating), Integer.valueOf(R.color.colorSecondLevelBorder), Integer.valueOf(R.color.colorFirstLevelBorder), Integer.valueOf(R.color.colorPlaceholderText), Integer.valueOf(R.color.colorSecondaryText), Integer.valueOf(R.color.colorGeneralText), Integer.valueOf(R.color.colorMainText), Integer.valueOf(R.color.colorProjection), Integer.valueOf(R.color.colorPromptDefault), Integer.valueOf(R.color.colorPromptClick), Integer.valueOf(R.color.colorPromptDisable), Integer.valueOf(R.color.colorSuccessDefault), Integer.valueOf(R.color.colorSuccessClick), Integer.valueOf(R.color.colorSuccessDisable), Integer.valueOf(R.color.colorUrgentDefault), Integer.valueOf(R.color.colorUrgentClick), Integer.valueOf(R.color.colorUrgentDisable), Integer.valueOf(R.color.colorWarningDefault), Integer.valueOf(R.color.colorWarningClick), Integer.valueOf(R.color.colorWarningDisable), Integer.valueOf(R.color.colorImportantDefault), Integer.valueOf(R.color.colorImportantClick), Integer.valueOf(R.color.colorImportantDisable)});

    private ColorConfigManager() {
    }

    static {
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public Object doInBackground() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 113;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    doInBackground();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Void voidDoInBackground = doInBackground();
                int i3 = component2 + 23;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return voidDoInBackground;
            }

            @Override
            public void onSuccess(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 117;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                onSuccess((Void) obj);
                if (i3 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i4 = component2 + 47;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public Void doInBackground() {
                int i = 2 % 2;
                int i2 = component2 + 105;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    ColorConfigManager.INSTANCE.updateColor(SPUtils.getInstance().getString(ColorConfigManager.ShareDataUIState), false, true);
                    ColorConfigManager.INSTANCE.updateThemeColor(SPUtils.getInstance().getString(ColorConfigManager.component1), false, false);
                } else {
                    ColorConfigManager.INSTANCE.updateColor(SPUtils.getInstance().getString(ColorConfigManager.ShareDataUIState), false, false);
                    ColorConfigManager.INSTANCE.updateThemeColor(SPUtils.getInstance().getString(ColorConfigManager.component1), true, false);
                }
                int i3 = ShareDataUIState + 23;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 31 / 0;
                }
                return null;
            }

            public void onSuccess(Void result) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 125;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i = equals + 45;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    public static void updateColor$default(ColorConfigManager colorConfigManager, String str, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = hashCode + 53;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        colorConfigManager.updateColor(str, z, z2);
        int i5 = getRequestBeneficiariesState + 125;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void updateColor(String colorConfig, boolean updateColorConfigForH5, boolean saveToLocal) {
        int i = 2 % 2;
        HashMap<String, Integer> map = copydefault;
        map.clear();
        map.putAll(parseColors(colorConfig));
        L.d(component3, "updateColor colorConfig: " + colorConfig);
        if (!(!saveToLocal)) {
            int i2 = hashCode + 41;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            SPUtils.getInstance().put(ShareDataUIState, colorConfig);
            int i4 = getRequestBeneficiariesState + 109;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
        }
        if (updateColorConfigForH5) {
            ShareDataUIState();
        }
    }

    public static void updateThemeColor$default(ColorConfigManager colorConfigManager, String str, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 23;
        hashCode = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 49;
            hashCode = i5 % 128;
            z2 = i5 % 2 != 0;
        }
        colorConfigManager.updateThemeColor(str, z, z2);
    }

    public final void updateThemeColor(String colorConfig, boolean updateColorConfigForH5, boolean saveToLocal) {
        int i = 2 % 2;
        HashMap<String, Integer> map = copy;
        map.clear();
        map.putAll(parseColors(colorConfig));
        L.d(component3, "updateThemeColor updateThemeColor: " + colorConfig);
        if (saveToLocal) {
            int i2 = getRequestBeneficiariesState + 5;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            SPUtils.getInstance().put(component1, colorConfig);
        }
        if (updateColorConfigForH5) {
            int i4 = getRequestBeneficiariesState + 79;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            ShareDataUIState();
        }
        int i6 = getRequestBeneficiariesState + 59;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Integer> parseColors(String colorConfig) {
        Map.Entry entry;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) SecureGsonUtils.fromJson(colorConfig, new TypeToken<Map<String, ? extends String>>() {
        }.getType());
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            int i2 = hashCode + 63;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            while (!(!it.hasNext())) {
                int i4 = getRequestBeneficiariesState + 29;
                hashCode = i4 % 128;
                if (i4 % 2 == 0) {
                    entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), Integer.valueOf(Color.parseColor((String) entry.getValue())));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                entry = (Map.Entry) it.next();
                try {
                    linkedHashMap.put(entry.getKey(), Integer.valueOf(Color.parseColor((String) entry.getValue())));
                } catch (Exception e) {
                    L.e(component3, "key:" + entry.getKey() + " value:" + entry.getValue() + " format is error " + e.getMessage());
                }
                L.e(component3, "key:" + entry.getKey() + " value:" + entry.getValue() + " format is error " + e.getMessage());
            }
        }
        return linkedHashMap;
    }

    public final int getColor(int id, Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        SkinManager skinManager = SkinManager.INSTANCE;
        Application app = Utils.getApp();
        Intrinsics.checkNotNullExpressionValue(app, "");
        String resourceEntryName = Utils.getApp().getResources().getResourceEntryName(skinManager.getRealResourceId(app, id));
        String str = resourceEntryName;
        if (str == null || str.length() == 0) {
            return PaymentResource.getOriginColor(Utils.getApp(), id, theme);
        }
        Integer colorByEntryName = getColorByEntryName(resourceEntryName);
        if (colorByEntryName != null) {
            int i4 = getRequestBeneficiariesState + 15;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return colorByEntryName.intValue();
        }
        return PaymentResource.getOriginColor(Utils.getApp(), id, theme);
    }

    public final Integer getColorByEntryName(String resourceEntryName) {
        int i = 2 % 2;
        int i2 = hashCode + 23;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(resourceEntryName, "");
            copy.containsKey(resourceEntryName);
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceEntryName, "");
        HashMap<String, Integer> map = copy;
        if (map.containsKey(resourceEntryName)) {
            return map.get(resourceEntryName);
        }
        Integer num = copydefault.get(resourceEntryName);
        int i3 = getRequestBeneficiariesState + 121;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            return num;
        }
        throw null;
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        component4.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = component2.iterator();
        int i2 = getRequestBeneficiariesState + 93;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int iIntValue = it.next().intValue();
            String resourceEntryName = Utils.getApp().getResources().getResourceEntryName(iIntValue);
            int color = getColor(iIntValue, Utils.getApp().getTheme());
            Intrinsics.checkNotNull(resourceEntryName);
            linkedHashMap.put(resourceEntryName, Integer.valueOf(color));
        }
        Set<String> setKeySet = copydefault.keySet();
        setKeySet.removeAll(linkedHashMap.keySet());
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            int i4 = hashCode + 25;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                String str = (String) it2.next();
                ColorConfigManager colorConfigManager = INSTANCE;
                Intrinsics.checkNotNull(str);
                colorConfigManager.getColorByEntryName(str);
                throw null;
            }
            String str2 = (String) it2.next();
            ColorConfigManager colorConfigManager2 = INSTANCE;
            Intrinsics.checkNotNull(str2);
            Integer colorByEntryName = colorConfigManager2.getColorByEntryName(str2);
            Pair pair = colorByEntryName != null ? new Pair(str2, Integer.valueOf(colorByEntryName.intValue())) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        MapsKt.putAll(linkedHashMap, arrayList);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String hexString = Integer.toHexString(((Number) entry.getValue()).intValue());
            if (hexString.length() == 8) {
                HashMap<String, String> map = component4;
                Intrinsics.checkNotNull(hexString);
                String strSubstring = hexString.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strSubstring2 = hexString.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                map.put(str3, BaseScanViewModel.QR_FLAG + strSubstring + strSubstring2);
            } else {
                component4.put(str3, BaseScanViewModel.QR_FLAG + hexString);
            }
        }
        L.d(component3, "updateColorConfigForH5: " + GsonUtils.toJson(component4));
    }

    public final HashMap<String, String> getColorConfigForH5() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 117;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        HashMap<String, String> map = component4;
        int i4 = i2 + 23;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }
}
