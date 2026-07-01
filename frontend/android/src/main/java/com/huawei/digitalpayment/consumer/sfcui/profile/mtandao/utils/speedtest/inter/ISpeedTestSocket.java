package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestReport;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.ComputationMethod;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.FtpMode;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.UploadStorageType;
import java.math.RoundingMode;

public interface ISpeedTestSocket {
    void addSpeedTestListener(ISpeedTestListener iSpeedTestListener);

    void closeSocket();

    void forceStopTask();

    ComputationMethod getComputationMethod();

    RoundingMode getDefaultRoundingMode();

    int getDefaultScale();

    long getDownloadSetupTime();

    FtpMode getFtpMode();

    SpeedTestReport getLiveReport();

    RepeatWrapper getRepeatWrapper();

    int getSocketTimeout();

    int getUploadChunkSize();

    long getUploadSetupTime();

    UploadStorageType getUploadStorageType();

    void removeSpeedTestListener(ISpeedTestListener iSpeedTestListener);

    void setComputationMethod(ComputationMethod computationMethod);

    boolean setProxyServer(String str);

    void setUploadStorageType(UploadStorageType uploadStorageType);

    void shutdownAndWait();

    void startDownload(String str);

    void startUpload(String str, int i);
}
