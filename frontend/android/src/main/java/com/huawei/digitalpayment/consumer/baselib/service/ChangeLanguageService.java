package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.accessaddObserverForBackInvoker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/ChangeLanguageService;", "", "refreshMenu", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ChangeLanguageService {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        public static void refreshMenu(ChangeLanguageService changeLanguageService, AppCompatActivity appCompatActivity) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(appCompatActivity, "");
            if (i3 == 0) {
                int i4 = 65 / 0;
            }
            int i5 = ShareDataUIState + 31;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public static void ShareDataUIState() {
            accessaddObserverForBackInvoker.ShareDataUIState[0] = Class.forName("hilt_aggregated_deps._com_huawei_digitalpayment_consumer_home_ui_activity_ChangeSkinActivity_GeneratedInjector").getDeclaredField("ShareDataUIState");
        }
    }

    void refreshMenu(AppCompatActivity activity);
}
