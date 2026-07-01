package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestReport;

public interface IRepeatListener {
    void onCompletion(SpeedTestReport speedTestReport);

    void onReport(SpeedTestReport speedTestReport);
}
