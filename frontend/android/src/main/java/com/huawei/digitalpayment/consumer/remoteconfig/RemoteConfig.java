package com.huawei.digitalpayment.consumer.remoteconfig;

import com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig;
import com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh;
import com.huawei.digitalpayment.consumer.remoteconfig.models.InAppUpdate;
import com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0011H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "", "expiryBundlesLastUpdate", "", "getExpiryBundlesLastUpdate", "()Ljava/lang/String;", "noExpiryBundlesLastUpdate", "getNoExpiryBundlesLastUpdate", "inAppUpdate", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/InAppUpdate;", "getInAppUpdate", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/InAppUpdate;", "miniAppIds", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", "getMiniAppIds", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", "pochiJourneyNative", "", "getPochiJourneyNative", "()Ljava/lang/Boolean;", "h5TokenRefresh", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/H5TokenRefresh;", "getH5TokenRefresh", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/H5TokenRefresh;", "homeFibreNewCustomerDiscountFeatureEnabled", "getHomeFibreNewCustomerDiscountFeatureEnabled", "fixedDataFamilyShareConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/FixedDataFamilyShareConfig;", "getFixedDataFamilyShareConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/FixedDataFamilyShareConfig;", "check", "", "setRemoteConfigStale", "configStale", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RemoteConfig {
    void check();

    String getExpiryBundlesLastUpdate();

    FixedDataFamilyShareConfig getFixedDataFamilyShareConfig();

    H5TokenRefresh getH5TokenRefresh();

    Boolean getHomeFibreNewCustomerDiscountFeatureEnabled();

    InAppUpdate getInAppUpdate();

    MiniAppIds getMiniAppIds();

    String getNoExpiryBundlesLastUpdate();

    Boolean getPochiJourneyNative();

    void setRemoteConfigStale(boolean configStale);
}
