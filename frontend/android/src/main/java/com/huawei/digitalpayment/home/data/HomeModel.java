package com.huawei.digitalpayment.home.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.home.data.local.LocalBalance;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.data.source.remote.ChangeSkinResp;
import com.huawei.digitalpayment.home.data.source.remote.QuerySkinResp;
import com.huawei.digitalpayment.home.request.CustomerLocationParams;
import com.huawei.digitalpayment.home.request.HomeThemeDetailParams;
import com.huawei.digitalpayment.home.request.QueryBannerParams;
import com.huawei.digitalpayment.home.request.QuerySkinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.util.List;

public interface HomeModel extends BaseModel {
    void customerLocation(CustomerLocationParams customerLocationParams, ApiCallback<BaseResp> apiCallback);

    void logout(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback);

    void refreshBalance(BaseRequestParams baseRequestParams, ApiCallback<LocalBalance> apiCallback);

    void refreshBanner(QueryBannerParams queryBannerParams, ApiCallback<List<LocalHomeFunction>> apiCallback);

    void refreshMenu(ApiCallback<com.huawei.digitalpayment.consumer.baselib.http.BaseResp> apiCallback);

    void refreshMenu2(ApiCallback<BaseResp> apiCallback);

    void switchTheme(HomeThemeDetailParams homeThemeDetailParams, ApiCallback<ChangeSkinResp> apiCallback);

    void userSwitchableList(QuerySkinParams querySkinParams, ApiCallback<QuerySkinResp> apiCallback);

    void versionVerify(ApiCallback<UpdateBean> apiCallback);
}
