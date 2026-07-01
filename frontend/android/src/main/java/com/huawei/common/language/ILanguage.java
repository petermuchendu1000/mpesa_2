package com.huawei.common.language;

import android.content.Context;
import com.huawei.common.language.LanguageListBean;
import java.util.List;

public interface ILanguage {
    Context attach(Context context);

    String getCurrentLanguageCode();

    String getCurrentShowLanguage();

    String getDefaultLanguageCode();

    List<LanguageListBean.LanguageBean> getDefaultLanguages();

    List<LanguageListBean.LanguageBean> getLanguages();

    void init(Context context);

    void setLanguage(Context context, String str);

    void setLanguageConfig(String str);
}
