package com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings;

import com.huawei.digitalpayment.consumer.base.database.entities.HomeSettingsEntity;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.model.HomeSettings;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"toHomeSettings", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/HomeSettingsEntity;", "toHomeSettingsEntity", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeSettingsRepositoryImplKt {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static final HomeSettings access$toHomeSettings(HomeSettingsEntity homeSettingsEntity) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeSettings homeSettingsCopydefault = copydefault(homeSettingsEntity);
        int i4 = ShareDataUIState + 63;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return homeSettingsCopydefault;
    }

    public static final HomeSettingsEntity access$toHomeSettingsEntity(HomeSettings homeSettings) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingsEntity homeSettingsEntityShareDataUIState = ShareDataUIState(homeSettings);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return homeSettingsEntityShareDataUIState;
    }

    private static final HomeSettings copydefault(HomeSettingsEntity homeSettingsEntity) {
        Integer id;
        boolean zIsFrequentsSectionExpanded;
        int i = 2 % 2;
        if (homeSettingsEntity != null) {
            int i2 = ShareDataUIState + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            id = homeSettingsEntity.getId();
        } else {
            id = null;
        }
        if (homeSettingsEntity != null) {
            zIsFrequentsSectionExpanded = homeSettingsEntity.isFrequentsSectionExpanded();
            int i4 = ShareDataUIState + 57;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            zIsFrequentsSectionExpanded = false;
        }
        return new HomeSettings(id, zIsFrequentsSectionExpanded);
    }

    private static final HomeSettingsEntity ShareDataUIState(HomeSettings homeSettings) {
        int i = 2 % 2;
        HomeSettingsEntity homeSettingsEntity = new HomeSettingsEntity(homeSettings.getId(), homeSettings.isFrequentsSectionExpanded());
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeSettingsEntity;
    }
}
