package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestReport;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError;

public interface ISpeedTestListener {
    void onCompletion(SpeedTestReport speedTestReport);

    void onError(SpeedTestError speedTestError, String str);

    void onProgress(float f, SpeedTestReport speedTestReport);
}
