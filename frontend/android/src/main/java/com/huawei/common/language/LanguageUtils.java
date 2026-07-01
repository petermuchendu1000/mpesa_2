package com.huawei.common.language;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import com.huawei.common.language.LanguageListBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class LanguageUtils {
    private ILanguage component2;
    private final List<OnLanguageChangeListener> component3;

    static class component3 {
        private static final LanguageUtils component1 = new LanguageUtils();

        private component3() {
        }
    }

    private LanguageUtils() {
        this.component2 = new DefaultLanguage();
        this.component3 = new ArrayList();
    }

    public static LanguageUtils getInstance() {
        return component3.component1;
    }

    public void setLanguage(ILanguage iLanguage) {
        this.component2 = iLanguage;
    }

    public ILanguage getLanguage() {
        return this.component2;
    }

    public void init(Context context) {
        this.component2.init(context);
    }

    public Context attach(Context context) {
        return this.component2.attach(context);
    }

    public void setLanguage(Context context, String str) {
        this.component2.setLanguage(context, str);
    }

    public String getCurrentLang() {
        return this.component2.getCurrentLanguageCode();
    }

    public String getCurrentShowLang() {
        return this.component2.getCurrentShowLanguage();
    }

    public List<LanguageListBean.LanguageBean> getLanguages() {
        return this.component2.getLanguages();
    }

    public void setLanguageConfig(String str) {
        this.component2.setLanguageConfig(str);
    }

    public static Context attachLanguages(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        setLocale(configuration, locale);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return contextCreateConfigurationContext;
    }

    public static void updateLanguages(Resources resources, Locale locale) {
        Configuration configuration = resources.getConfiguration();
        setLocale(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static Locale getLocale(Context context) {
        return getConfigLocale(context.getResources().getConfiguration());
    }

    public static Locale getConfigLocale(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    public static void setLocale(Configuration configuration, Locale locale) {
        configuration.setLocales(new LocaleList(locale));
    }

    public static void setDefaultLocale(Context context) {
        LocaleList.setDefault(context.getResources().getConfiguration().getLocales());
    }

    public void addCallBack(OnLanguageChangeListener onLanguageChangeListener) {
        if (this.component3.contains(onLanguageChangeListener)) {
            return;
        }
        this.component3.add(onLanguageChangeListener);
    }

    public void removeCallBack(OnLanguageChangeListener onLanguageChangeListener) {
        this.component3.remove(onLanguageChangeListener);
    }

    public void onLanguageChange(String str, String str2) {
        Iterator<OnLanguageChangeListener> it = this.component3.iterator();
        while (it.hasNext()) {
            it.next().onLanguageChange(str, str2);
        }
    }
}
