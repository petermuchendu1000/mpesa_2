package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.ComputationMethod;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.FtpMode;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.UploadStorageType;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpeedTestSocket implements ISpeedTestSocket {
    private static final int component3 = 1000;
    private static int coroutineCreation = 1;
    private static int getShareableDataState;
    private final SpeedTestTask ArtificialStackFrames;
    private final List<ISpeedTestListener> ShareDataUIState;
    private ComputationMethod component1;
    private long component2;
    private int component4;
    private final RepeatWrapper getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private long getSponsorBeneficiariesState;
    private int toString;
    private int copy = 4;
    private RoundingMode equals = SpeedTestConst.DEFAULT_ROUNDING_MODE;
    private FtpMode copydefault = FtpMode.PASSIVE;
    private UploadStorageType hashCode = UploadStorageType.RAM_STORAGE;

    public SpeedTestSocket() {
        ArrayList arrayList = new ArrayList();
        this.ShareDataUIState = arrayList;
        this.toString = 65535;
        this.getRequestBeneficiariesState = 10000;
        this.getAsAtTimestamp = new RepeatWrapper(this);
        this.ArtificialStackFrames = new SpeedTestTask(this, arrayList);
        this.component2 = 0L;
        this.getSponsorBeneficiariesState = 0L;
        this.component4 = -1;
        this.component1 = ComputationMethod.MEDIAN_ALL_TIME;
    }

    public SpeedTestSocket(int i) {
        ArrayList arrayList = new ArrayList();
        this.ShareDataUIState = arrayList;
        this.toString = 65535;
        this.getRequestBeneficiariesState = 10000;
        this.getAsAtTimestamp = new RepeatWrapper(this);
        this.ArtificialStackFrames = new SpeedTestTask(this, arrayList);
        this.component2 = 0L;
        this.getSponsorBeneficiariesState = 0L;
        this.component4 = -1;
        this.component1 = ComputationMethod.MEDIAN_ALL_TIME;
        this.component4 = i;
    }

    private void component3(int i) {
        int i2 = 2 % 2;
        this.ArtificialStackFrames.renewReportThreadPool();
        long j = i;
        this.ArtificialStackFrames.getReportThreadPool().scheduleWithFixedDelay(new Runnable() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void run() {
                int i3 = 2 % 2;
                SpeedTestReport liveReport = SpeedTestSocket.this.getLiveReport();
                Iterator it = SpeedTestSocket.component1(SpeedTestSocket.this).iterator();
                int i4 = ShareDataUIState + 61;
                copydefault = i4 % 128;
                while (true) {
                    int i5 = i4 % 2;
                    if (!it.hasNext()) {
                        return;
                    }
                    int i6 = ShareDataUIState + 79;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    ((ISpeedTestListener) it.next()).onProgress(liveReport.getProgressPercent(), liveReport);
                    i4 = copydefault + 125;
                    ShareDataUIState = i4 % 128;
                }
            }
        }, j, j, TimeUnit.MILLISECONDS);
        int i3 = getShareableDataState + 19;
        coroutineCreation = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void addSpeedTestListener(ISpeedTestListener iSpeedTestListener) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 117;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.add(iSpeedTestListener);
        int i4 = coroutineCreation + 83;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void removeSpeedTestListener(ISpeedTestListener iSpeedTestListener) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 101;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.remove(iSpeedTestListener);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public void shutdownAndWait() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 71;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.ArtificialStackFrames.shutdownAndWait();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void startFixedDownload(String str, int i) {
        int i2 = 2 % 2;
        if (this.component4 != -1) {
            int i3 = getShareableDataState + 103;
            coroutineCreation = i3 % 128;
            int i4 = i3 % 2;
            if (!this.ArtificialStackFrames.isReportInterval()) {
                int i5 = getShareableDataState + 15;
                coroutineCreation = i5 % 128;
                if (i5 % 2 == 0) {
                    component3(this.component4);
                } else {
                    component3(this.component4);
                }
                this.ArtificialStackFrames.setReportInterval(true);
            }
        }
        this.ArtificialStackFrames.renewReportThreadPool();
        this.ArtificialStackFrames.getReportThreadPool().schedule(new Runnable() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void run() {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 19;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                SpeedTestSocket.this.forceStopTask();
                int i9 = copydefault + 63;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
            }
        }, i, TimeUnit.MILLISECONDS);
        startDownload(str);
    }

    public void startFixedDownload(String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = coroutineCreation + 15;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        component3(i2);
        this.ArtificialStackFrames.setReportInterval(true);
        startFixedDownload(str, i);
        int i6 = coroutineCreation + 65;
        getShareableDataState = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void startDownload(String str, int i) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState + 43;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        component3(i);
        this.ArtificialStackFrames.setReportInterval(true);
        startDownload(str);
    }

    @Override
    public void startDownload(String str) {
        int i = 2 % 2;
        if (this.component4 != -1) {
            int i2 = coroutineCreation + 63;
            getShareableDataState = i2 % 128;
            if (i2 % 2 != 0) {
                this.ArtificialStackFrames.isReportInterval();
                throw null;
            }
            if (!this.ArtificialStackFrames.isReportInterval()) {
                component3(this.component4);
                this.ArtificialStackFrames.setReportInterval(true);
                int i3 = getShareableDataState + 83;
                coroutineCreation = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        this.ArtificialStackFrames.startDownloadRequest(str);
        int i5 = coroutineCreation + 47;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
    }

    @Override
    public boolean setProxyServer(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 31;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        boolean proxy = this.ArtificialStackFrames.setProxy(str);
        int i4 = coroutineCreation + 5;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return proxy;
    }

    public void startFixedUpload(String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getShareableDataState;
        int i5 = i4 + 29;
        coroutineCreation = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (this.component4 != -1) {
            int i6 = i4 + 9;
            coroutineCreation = i6 % 128;
            if (i6 % 2 == 0) {
                this.ArtificialStackFrames.isReportInterval();
                throw null;
            }
            if (!this.ArtificialStackFrames.isReportInterval()) {
                component3(this.component4);
                this.ArtificialStackFrames.setReportInterval(true);
                int i7 = getShareableDataState + 53;
                coroutineCreation = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        this.ArtificialStackFrames.renewReportThreadPool();
        this.ArtificialStackFrames.getReportThreadPool().schedule(new Runnable() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void run() {
                int i9 = 2 % 2;
                int i10 = ShareDataUIState + 67;
                component2 = i10 % 128;
                int i11 = i10 % 2;
                SpeedTestSocket.this.forceStopTask();
                if (i11 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, i2, TimeUnit.MILLISECONDS);
        startUpload(str, i);
    }

    public void startFixedUpload(String str, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = coroutineCreation + 49;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        component3(i3);
        this.ArtificialStackFrames.setReportInterval(true);
        startFixedUpload(str, i, i2);
        int i7 = coroutineCreation + 31;
        getShareableDataState = i7 % 128;
        int i8 = i7 % 2;
    }

    public void startUpload(String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getShareableDataState + 99;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        component3(i2);
        this.ArtificialStackFrames.setReportInterval(true);
        startUpload(str, i);
        int i6 = coroutineCreation + 59;
        getShareableDataState = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startUpload(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket.getShareableDataState
            int r2 = r1 + 37
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket.coroutineCreation = r3
            int r2 = r2 % r0
            r3 = -1
            if (r2 != 0) goto L18
            int r2 = r5.component4
            r4 = 78
            int r4 = r4 / 0
            if (r2 == r3) goto L36
            goto L1c
        L18:
            int r2 = r5.component4
            if (r2 == r3) goto L36
        L1c:
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket.coroutineCreation = r2
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask r1 = r5.ArtificialStackFrames
            boolean r1 = r1.isReportInterval()
            if (r1 != 0) goto L36
            int r1 = r5.component4
            r5.component3(r1)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask r1 = r5.ArtificialStackFrames
            r2 = 1
            r1.setReportInterval(r2)
        L36:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask r1 = r5.ArtificialStackFrames
            r1.startUploadRequest(r6, r7)
            int r6 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket.getShareableDataState
            int r6 = r6 + 107
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket.coroutineCreation = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L47
            return
        L47:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket.startUpload(java.lang.String, int):void");
    }

    public void startDownloadRepeat(String str, int i, IRepeatListener iRepeatListener) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState + 89;
        int i4 = i3 % 128;
        coroutineCreation = i4;
        if (i3 % 2 != 0) {
            int i5 = this.component4;
            if (i5 == -1) {
                int i6 = i4 + 39;
                getShareableDataState = i6 % 128;
                int i7 = i6 % 2;
                i5 = 1000;
            }
            startDownloadRepeat(str, i, i5, iRepeatListener);
            return;
        }
        throw null;
    }

    public void startDownloadRepeat(String str, int i, int i2, IRepeatListener iRepeatListener) {
        int i3 = 2 % 2;
        int i4 = coroutineCreation + 55;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        this.getAsAtTimestamp.startDownloadRepeat(str, i, i2, iRepeatListener);
        int i6 = coroutineCreation + 99;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
    }

    public void startUploadRepeat(String str, int i, int i2, IRepeatListener iRepeatListener) {
        int i3 = 2 % 2;
        int i4 = getShareableDataState;
        int i5 = i4 + 103;
        int i6 = i5 % 128;
        coroutineCreation = i6;
        int i7 = i5 % 2;
        int i8 = this.component4;
        if (i8 != -1) {
            int i9 = i6 + 39;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = i4 + 73;
            coroutineCreation = i11 % 128;
            int i12 = i11 % 2;
            i8 = 1000;
        }
        startUploadRepeat(str, i, i8, i2, iRepeatListener);
    }

    public void startUploadRepeat(String str, int i, int i2, int i3, IRepeatListener iRepeatListener) {
        int i4 = 2 % 2;
        int i5 = getShareableDataState + 53;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        this.getAsAtTimestamp.startUploadRepeat(str, i, i2, i3, iRepeatListener);
        int i7 = getShareableDataState + 85;
        coroutineCreation = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    public void forceStopTask() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 11;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            this.getAsAtTimestamp.cleanTimer();
            this.ArtificialStackFrames.forceStopTask();
            this.ArtificialStackFrames.closeSocket();
            shutdownAndWait();
            int i3 = getShareableDataState + 73;
            coroutineCreation = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 26 / 0;
                return;
            }
            return;
        }
        this.getAsAtTimestamp.cleanTimer();
        this.ArtificialStackFrames.forceStopTask();
        this.ArtificialStackFrames.closeSocket();
        shutdownAndWait();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public SpeedTestReport getLiveReport() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 53;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        if (getSpeedTestMode() == SpeedTestMode.DOWNLOAD) {
            return this.ArtificialStackFrames.getReport(SpeedTestMode.DOWNLOAD);
        }
        SpeedTestReport report = this.ArtificialStackFrames.getReport(SpeedTestMode.UPLOAD);
        int i4 = getShareableDataState + 87;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return report;
    }

    @Override
    public void closeSocket() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        this.ArtificialStackFrames.closeSocket();
        int i4 = getShareableDataState + 67;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SpeedTestMode getSpeedTestMode() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 119;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestMode speedTestMode = this.ArtificialStackFrames.getSpeedTestMode();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return speedTestMode;
    }

    public void setSocketTimeout(int i) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation;
        int i4 = i3 + 1;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        if (i >= 0) {
            this.getRequestBeneficiariesState = i;
            int i6 = i3 + 65;
            getShareableDataState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 4;
            }
        }
        int i8 = i3 + 81;
        getShareableDataState = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 15 / 0;
        }
    }

    @Override
    public int getSocketTimeout() {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 5;
        getShareableDataState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.getRequestBeneficiariesState;
        int i5 = i2 + 69;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public int getUploadChunkSize() {
        int i;
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 1;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.toString;
            int i5 = 93 / 0;
        } else {
            i = this.toString;
        }
        int i6 = i3 + 113;
        coroutineCreation = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override
    public RepeatWrapper getRepeatWrapper() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 23;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        RepeatWrapper repeatWrapper = this.getAsAtTimestamp;
        int i5 = i2 + 19;
        coroutineCreation = i5 % 128;
        if (i5 % 2 != 0) {
            return repeatWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUploadChunkSize(int i) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 117;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.toString = i;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 89;
        coroutineCreation = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void setDefaultRoundingMode(RoundingMode roundingMode) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 85;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        this.equals = roundingMode;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 103;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDefaultScale(int i) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 87;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.copy = i;
        if (i4 != 0) {
            throw null;
        }
    }

    @Override
    public void setComputationMethod(ComputationMethod computationMethod) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        this.component1 = computationMethod;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFtpMode(FtpMode ftpMode) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 95;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = ftpMode;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ComputationMethod getComputationMethod() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 93;
        coroutineCreation = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ComputationMethod computationMethod = this.component1;
        int i4 = i2 + 55;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return computationMethod;
        }
        throw null;
    }

    public void setUploadSetupTime(long j) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 93;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        this.getSponsorBeneficiariesState = j;
        int i5 = i3 + 9;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDownloadSetupTime(long j) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 57;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.component2 = j;
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public long getDownloadSetupTime() {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 71;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component2;
        int i5 = i2 + 5;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return j;
    }

    @Override
    public long getUploadSetupTime() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 95;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        long j = this.getSponsorBeneficiariesState;
        if (i4 != 0) {
            int i5 = 0 / 0;
        }
        int i6 = i3 + 61;
        coroutineCreation = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RoundingMode getDefaultRoundingMode() {
        RoundingMode roundingMode;
        int i = 2 % 2;
        int i2 = getShareableDataState + 21;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        if (i2 % 2 == 0) {
            roundingMode = this.equals;
            int i4 = 64 / 0;
        } else {
            roundingMode = this.equals;
        }
        int i5 = i3 + 5;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return roundingMode;
    }

    @Override
    public int getDefaultScale() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 29;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public UploadStorageType getUploadStorageType() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 49;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        UploadStorageType uploadStorageType = this.hashCode;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return uploadStorageType;
    }

    @Override
    public void setUploadStorageType(UploadStorageType uploadStorageType) {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 101;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.hashCode = uploadStorageType;
        int i5 = i2 + 9;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void clearListeners() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 35;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.clear();
        int i4 = coroutineCreation + 89;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public FtpMode getFtpMode() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 99;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        FtpMode ftpMode = this.copydefault;
        int i5 = i3 + 3;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return ftpMode;
    }

    static List component1(SpeedTestSocket speedTestSocket) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 97;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        List<ISpeedTestListener> list = speedTestSocket.ShareDataUIState;
        int i5 = i3 + 31;
        coroutineCreation = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return list;
    }
}
