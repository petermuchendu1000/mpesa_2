package com.huawei.common.language;

import android.content.Context;
import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.language.LanguageListBean;
import com.huawei.common.util.AssetsReadUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LocalActivityResultRegistryOwner;
import kotlin.setOwners;

public class DefaultLanguage implements ILanguage {
    private List<LanguageListBean.LanguageBean> component3;
    protected String currentLanguageCode;
    protected String currentShowLanguage;

    @Override
    public void init(Context context) {
        LanguageUtils.setDefaultLocale(context);
        component2(context, component1(context));
        copydefault(context, SPUtils.getInstance(context).getString(LanguageConstants.LANGUAGE_CONFIG));
    }

    @Override
    public String getDefaultLanguageCode() {
        return LanguageConstants.EN;
    }

    @Override
    public String getCurrentLanguageCode() {
        if (TextUtils.isEmpty(this.currentLanguageCode)) {
            return getDefaultLanguageCode();
        }
        return this.currentLanguageCode;
    }

    @Override
    public Context attach(Context context) {
        Locale localeComponent2 = component2(getCurrentLanguageCode());
        return LanguageUtils.getLocale(context).equals(localeComponent2) ? context : LanguageUtils.attachLanguages(context, localeComponent2);
    }

    @Override
    public void setLanguage(Context context, String str) {
        if (context == null || context.getResources() == null || TextUtils.isEmpty(str)) {
            return;
        }
        component2(context, str);
        component1(str);
        Locale localeComponent2 = component2(str);
        if (LanguageUtils.getLocale(context).equals(localeComponent2)) {
            return;
        }
        LanguageUtils.updateLanguages(context.getResources(), localeComponent2);
        if (context.getApplicationContext() != null && context.getApplicationContext().getResources() != null) {
            LanguageUtils.updateLanguages(context.getApplicationContext().getResources(), localeComponent2);
        }
        LanguageUtils.setDefaultLocale(context);
    }

    private Locale component2(String str) {
        if (TextUtils.isEmpty(str)) {
            return Locale.ENGLISH;
        }
        if (str.contains("_")) {
            String[] strArrSplit = str.split("_");
            return new Locale(strArrSplit[0], strArrSplit[1]);
        }
        return new Locale(str, "");
    }

    private void component2(Context context, String str) {
        if (TextUtils.equals(this.currentLanguageCode, str)) {
            return;
        }
        String str2 = this.currentLanguageCode;
        this.currentLanguageCode = str;
        this.currentShowLanguage = component3(context, str);
        LanguageUtils.getInstance().onLanguageChange(str2, this.currentLanguageCode);
    }

    private String component3(String str) {
        return component3(Utils.getApp(), str);
    }

    private String component3(Context context, String str) {
        for (LanguageListBean.LanguageBean languageBean : copydefault(context)) {
            if (TextUtils.equals(str, languageBean.getLanguageCode())) {
                return languageBean.getLanguage();
            }
        }
        return "";
    }

    private void component1(String str) {
        SPUtils.getInstance().put(LanguageConstants.LANGUAGE_CODE, str);
    }

    private String component1(Context context) {
        return SPUtils.getInstance(context).getString(LanguageConstants.LANGUAGE_CODE, getDefaultLanguageCode());
    }

    @Override
    public List<LanguageListBean.LanguageBean> getLanguages() {
        return copydefault(Utils.getApp());
    }

    private List<LanguageListBean.LanguageBean> copydefault(Context context) {
        if (CollectionUtils.isEmpty(this.component3)) {
            return ShareDataUIState(context);
        }
        return this.component3;
    }

    @Override
    public List<LanguageListBean.LanguageBean> getDefaultLanguages() {
        return ShareDataUIState(Utils.getApp());
    }

    private List<LanguageListBean.LanguageBean> ShareDataUIState(Context context) {
        LanguageListBean languageListBean = (LanguageListBean) SecureGsonUtils.fromJson(AssetsReadUtils.parseFile(context, "language.json"), LanguageListBean.class);
        if (languageListBean != null) {
            return languageListBean.getLanguageBeanList();
        }
        return new ArrayList();
    }

    @Override
    public void setLanguageConfig(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SPUtils.getInstance().put(LanguageConstants.LANGUAGE_CONFIG, str);
        copydefault(Utils.getApp(), str);
    }

    public class AnonymousClass1 extends TypeToken<List<LanguageListBean.LanguageBean>> {
        AnonymousClass1(DefaultLanguage defaultLanguage) {
        }

        public static void component2() {
            LocalActivityResultRegistryOwner.component1[0] = setOwners.ShareDataUIState[0];
        }
    }

    private void copydefault(Context context, String str) {
        List<LanguageListBean.LanguageBean> list = (List) SecureGsonUtils.fromJson(str, new AnonymousClass1(this).getType());
        this.component3 = list;
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<LanguageListBean.LanguageBean> it = this.component3.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(this.currentLanguageCode, it.next().getLanguageCode())) {
                    return;
                }
            }
            component2(context, this.component3.get(0).getLanguageCode());
        }
    }

    @Override
    public String getCurrentShowLanguage() {
        if (TextUtils.isEmpty(this.currentShowLanguage)) {
            this.currentShowLanguage = component3(this.currentLanguageCode);
        }
        return this.currentShowLanguage;
    }
}
