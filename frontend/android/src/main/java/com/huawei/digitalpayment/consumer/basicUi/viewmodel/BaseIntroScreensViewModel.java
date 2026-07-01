package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.basicUi.model.IntroConfig;
import java.util.List;
import org.json.JSONObject;

public class BaseIntroScreensViewModel extends ViewModel {
    private static int component1 = 1;
    private static int component2;
    private final MutableLiveData<List<IntroConfig>> copydefault = new MutableLiveData<>();

    public LiveData<List<IntroConfig>> getListMutableLiveData() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public void initData() {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(SPUtils.getInstance().getString(SPConstant.APP_INTRO_CONFIG));
            String currentLang = LanguageUtils.getInstance().getCurrentLang();
            if (jSONObject.has(currentLang)) {
                this.copydefault.setValue((List) GsonUtils.fromJson(jSONObject.optString(currentLang), new TypeToken<List<IntroConfig>>(this) {
                }.getType()));
                return;
            }
        } catch (Exception e) {
            L.e(e.getMessage());
        }
        Object obj = null;
        this.copydefault.setValue(null);
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
