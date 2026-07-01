package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest;

import com.google.gson.FieldAttributes;
import com.google.mlkit.common.MlKitException;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.time.DurationKt;

public class RepeatWrapper {
    private static int getShareableDataState = 1;
    private static int toString;
    private long ArtificialStackFrames;
    private boolean ShareDataUIState;
    private boolean component2;
    private boolean component3;
    private long component4;
    private int copy;
    private boolean copydefault;
    private boolean getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private final ISpeedTestSocket getSponsorBeneficiariesState;
    private Timer hashCode;
    private List<BigDecimal> equals = Collections.synchronizedList(new ArrayList());
    private BigDecimal component1 = BigDecimal.ZERO;

    public static Object component3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i6) | i7 | i);
        int i9 = (~(i7 | (~i))) | (~(i | i6));
        int i10 = (~(i6 | i5)) | i;
        int i11 = i + i5 + i4 + ((-407681510) * i3) + ((-298114539) * i2);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i) + 672923648 + (2103481690 * i5) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i4) + ((-328728576) * i3) + ((-2108424192) * i2) + ((-1296629760) * i12);
        int i14 = ((i * 57881544) - 1472685786) + (i5 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + (i4 * 57881749) + (i3 * 289608994) + (i2 * 969284153) + (i12 * 813891584);
        return i13 + ((i14 * i14) * 454098944) != 1 ? component2(objArr) : component1(objArr);
    }

    public RepeatWrapper(ISpeedTestSocket iSpeedTestSocket) {
        this.getSponsorBeneficiariesState = iSpeedTestSocket;
    }

    public SpeedTestReport getRepeatReport(int i, RoundingMode roundingMode, SpeedTestMode speedTestMode, long j, BigDecimal bigDecimal) {
        BigDecimal bigDecimalDivide;
        long j2;
        long jLongValue;
        int i2 = 2 % 2;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (this.ArtificialStackFrames != 0) {
            int i3 = getShareableDataState + 33;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.copydefault) {
                bigDecimalDivide = SpeedTestConst.PERCENT_MAX;
                int i4 = toString + 119;
                getShareableDataState = i4 % 128;
                int i5 = i4 % 2;
            } else {
                bigDecimalDivide = new BigDecimal(System.nanoTime() - this.ArtificialStackFrames).multiply(SpeedTestConst.PERCENT_MAX).divide(new BigDecimal(this.copy).multiply(new BigDecimal(DurationKt.NANOS_IN_MILLIS)), i, roundingMode);
            }
        } else {
            bigDecimalDivide = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<BigDecimal> it = this.equals.iterator();
        while (!(!it.hasNext())) {
            bigDecimalAdd = bigDecimalAdd.add(it.next());
            int i6 = getShareableDataState + 51;
            toString = i6 % 128;
            int i7 = i6 % 2;
        }
        BigDecimal bigDecimalDivide2 = !this.equals.isEmpty() ? bigDecimalAdd.add(bigDecimal).divide(new BigDecimal(this.equals.size()).add(new BigDecimal(this.component4).divide(this.component1, i, roundingMode)), i, roundingMode) : bigDecimal;
        BigDecimal bigDecimalMultiply = bigDecimalDivide2.multiply(SpeedTestConst.BIT_MULTIPLIER);
        if (this.copydefault) {
            j2 = this.component4;
            jLongValue = new BigDecimal(this.ArtificialStackFrames).add(new BigDecimal(this.copy).multiply(new BigDecimal(DurationKt.NANOS_IN_MILLIS))).longValue();
        } else {
            int i8 = toString + 27;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
            jLongValue = j;
            j2 = this.component4;
        }
        return new SpeedTestReport(speedTestMode, bigDecimalDivide.floatValue(), this.ArtificialStackFrames, jLongValue, j2, this.component1.longValueExact(), bigDecimalDivide2, bigDecimalMultiply, this.getRequestBeneficiariesState);
    }

    private static Object component2(Object[] objArr) {
        RepeatWrapper repeatWrapper = (RepeatWrapper) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = toString + 55;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        repeatWrapper.component3 = true;
        repeatWrapper.getSponsorBeneficiariesState.startDownload(str);
        int i4 = getShareableDataState + 29;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void component1(String str, int i) {
        int i2 = 2 % 2;
        int i3 = toString + 97;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.getSponsorBeneficiariesState.startUpload(str, i);
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
    }

    public void startDownloadRepeat(final String str, int i, int i2, final IRepeatListener iRepeatListener) {
        int i3 = 2 % 2;
        component1(true);
        this.hashCode = new Timer();
        final ISpeedTestListener iSpeedTestListener = new ISpeedTestListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onCompletion(SpeedTestReport speedTestReport) {
                int i4 = 2 % 2;
                int i5 = component1 + 115;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                RepeatWrapper.component1(RepeatWrapper.this).add(speedTestReport.getTransferRateOctet());
                RepeatWrapper.component3(RepeatWrapper.this, str);
                RepeatWrapper repeatWrapper = RepeatWrapper.this;
                RepeatWrapper.component3(repeatWrapper, RepeatWrapper.ShareDataUIState(repeatWrapper) + 1);
                int i7 = copydefault + 11;
                component1 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(SpeedTestError speedTestError, String str2) {
                int i4 = 2 % 2;
                int i5 = copydefault + 17;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                RepeatWrapper.copydefault(RepeatWrapper.this, this);
                int i7 = copydefault + 15;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onProgress(float f, SpeedTestReport speedTestReport) {
                int i4 = 2 % 2;
                int i5 = component1 + 77;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        this.getSponsorBeneficiariesState.addSpeedTestListener(iSpeedTestListener);
        this.copy = i;
        this.hashCode.schedule(new TimerTask() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void run() {
                IRepeatListener iRepeatListener2;
                int i4 = 2 % 2;
                int i5 = component3 + 19;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    RepeatWrapper.component2(RepeatWrapper.this).removeSpeedTestListener(iSpeedTestListener);
                    RepeatWrapper.component2(RepeatWrapper.this).forceStopTask();
                    RepeatWrapper.this.cleanTimer();
                    Object[] objArr = {RepeatWrapper.this, true};
                    int iComponent2 = FieldAttributes.component2();
                    int iComponent22 = FieldAttributes.component2();
                    RepeatWrapper.component3(-604363272, objArr, FieldAttributes.component2(), FieldAttributes.component2(), iComponent22, 604363273, iComponent2);
                    iRepeatListener2 = iRepeatListener;
                    if (iRepeatListener2 == null) {
                        return;
                    }
                } else {
                    RepeatWrapper.component2(RepeatWrapper.this).removeSpeedTestListener(iSpeedTestListener);
                    RepeatWrapper.component2(RepeatWrapper.this).forceStopTask();
                    RepeatWrapper.this.cleanTimer();
                    Object[] objArr2 = {RepeatWrapper.this, true};
                    int iComponent23 = FieldAttributes.component2();
                    int iComponent24 = FieldAttributes.component2();
                    RepeatWrapper.component3(-604363272, objArr2, FieldAttributes.component2(), FieldAttributes.component2(), iComponent24, 604363273, iComponent23);
                    iRepeatListener2 = iRepeatListener;
                    if (iRepeatListener2 == null) {
                        return;
                    }
                }
                iRepeatListener2.onCompletion(RepeatWrapper.component2(RepeatWrapper.this).getLiveReport());
                int i6 = component1 + 45;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }, i);
        long j = i2;
        this.hashCode.scheduleAtFixedRate(new TimerTask() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void run() {
                int i4 = 2 % 2;
                int i5 = component2 + 5;
                int i6 = i5 % 128;
                component1 = i6;
                int i7 = i5 % 2;
                IRepeatListener iRepeatListener2 = iRepeatListener;
                if (iRepeatListener2 != null) {
                    int i8 = i6 + 97;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    iRepeatListener2.onReport(RepeatWrapper.component2(RepeatWrapper.this).getLiveReport());
                }
            }
        }, j, j);
        int iComponent2 = FieldAttributes.component2();
        component3(1486672349, new Object[]{this, str}, FieldAttributes.component2(), FieldAttributes.component2(), FieldAttributes.component2(), -1486672349, iComponent2);
        int i4 = getShareableDataState + 93;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public void startUploadRepeat(final String str, int i, int i2, final int i3, final IRepeatListener iRepeatListener) {
        int i4 = 2 % 2;
        component1(false);
        this.hashCode = new Timer();
        final ISpeedTestListener iSpeedTestListener = new ISpeedTestListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onError(SpeedTestError speedTestError, String str2) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 65;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                RepeatWrapper.copydefault(RepeatWrapper.this, this);
                int i8 = component3 + 123;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onCompletion(SpeedTestReport speedTestReport) {
                int i5 = 2 % 2;
                int i6 = component3 + 73;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                RepeatWrapper.component1(RepeatWrapper.this).add(speedTestReport.getTransferRateOctet());
                RepeatWrapper.component2(RepeatWrapper.this, str, i3);
                RepeatWrapper repeatWrapper = RepeatWrapper.this;
                RepeatWrapper.component3(repeatWrapper, RepeatWrapper.ShareDataUIState(repeatWrapper) + 1);
                int i8 = ShareDataUIState + 31;
                component3 = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override
            public void onProgress(float f, SpeedTestReport speedTestReport) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 51;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        };
        this.getSponsorBeneficiariesState.addSpeedTestListener(iSpeedTestListener);
        this.copy = i;
        this.hashCode.schedule(new TimerTask() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Removed duplicated region for block: B:9:0x0090 A[PHI: r1
  0x0090: PHI (r1v11 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener) = 
  (r1v10 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener)
  (r1v21 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener)
 binds: [B:8:0x008e, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r10 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.AnonymousClass5.component1
                    int r1 = r1 + 59
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.AnonymousClass5.component3 = r2
                    int r1 = r1 % r0
                    r2 = 1
                    if (r1 != 0) goto L50
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component2(r1)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener r3 = r2
                    r1.removeSpeedTestListener(r3)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component2(r1)
                    r1.forceStopTask()
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    r1.cleanTimer()
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    java.lang.Object[] r4 = new java.lang.Object[]{r1, r2}
                    int r9 = com.google.gson.FieldAttributes.component2()
                    int r7 = com.google.gson.FieldAttributes.component2()
                    int r6 = com.google.gson.FieldAttributes.component2()
                    int r5 = com.google.gson.FieldAttributes.component2()
                    r3 = -604363272(0xffffffffdbfa25f8, float:-1.4082098E17)
                    r8 = 604363273(0x2405da09, float:2.902446E-17)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component3(r3, r4, r5, r6, r7, r8, r9)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener r1 = r3
                    if (r1 == 0) goto L9d
                    goto L90
                L50:
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component2(r1)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener r3 = r2
                    r1.removeSpeedTestListener(r3)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component2(r1)
                    r1.forceStopTask()
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    r1.cleanTimer()
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    java.lang.Object[] r4 = new java.lang.Object[]{r1, r2}
                    int r9 = com.google.gson.FieldAttributes.component2()
                    int r7 = com.google.gson.FieldAttributes.component2()
                    int r6 = com.google.gson.FieldAttributes.component2()
                    int r5 = com.google.gson.FieldAttributes.component2()
                    r3 = -604363272(0xffffffffdbfa25f8, float:-1.4082098E17)
                    r8 = 604363273(0x2405da09, float:2.902446E-17)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component3(r3, r4, r5, r6, r7, r8, r9)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.IRepeatListener r1 = r3
                    if (r1 == 0) goto L9d
                L90:
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.this
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.component2(r2)
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestReport r2 = r2.getLiveReport()
                    r1.onCompletion(r2)
                L9d:
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.AnonymousClass5.component3
                    int r1 = r1 + 5
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.AnonymousClass5.component1 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto Lac
                    r0 = 62
                    int r0 = r0 / 0
                Lac:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.AnonymousClass5.run():void");
            }
        }, i);
        long j = i2;
        this.hashCode.scheduleAtFixedRate(new TimerTask() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void run() {
                int i5 = 2 % 2;
                int i6 = copydefault + 117;
                int i7 = i6 % 128;
                component1 = i7;
                Object obj = null;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                IRepeatListener iRepeatListener2 = iRepeatListener;
                if (iRepeatListener2 != null) {
                    int i8 = i7 + 77;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    iRepeatListener2.onReport(RepeatWrapper.component2(RepeatWrapper.this).getLiveReport());
                }
                int i10 = component1 + 43;
                copydefault = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        }, j, j);
        component1(str, i3);
        int i5 = getShareableDataState + 41;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void cleanTimer() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 69;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Timer timer = this.hashCode;
        if (timer != null) {
            int i4 = i2 + 53;
            getShareableDataState = i4 % 128;
            if (i4 % 2 != 0) {
                timer.cancel();
                this.hashCode.purge();
            } else {
                timer.cancel();
                this.hashCode.purge();
                throw null;
            }
        }
    }

    private void component1(boolean z) {
        int i = 2 % 2;
        int i2 = toString + 113;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.component3 = z;
        this.ShareDataUIState = z;
        boolean z2 = !z;
        this.getAsAtTimestamp = z2;
        this.component2 = z2;
        component1();
        int i4 = getShareableDataState + 3;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    private void component1() {
        int i = 2 % 2;
        this.getRequestBeneficiariesState = 0;
        this.component1 = BigDecimal.ZERO;
        this.component4 = 0L;
        this.copydefault = false;
        this.ArtificialStackFrames = 0L;
        this.equals = new ArrayList();
        int i2 = toString + 55;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void ShareDataUIState(ISpeedTestListener iSpeedTestListener) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 39;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.getSponsorBeneficiariesState.removeSpeedTestListener(iSpeedTestListener);
        cleanTimer();
        this.copydefault = true;
        this.getSponsorBeneficiariesState.closeSocket();
        this.getSponsorBeneficiariesState.shutdownAndWait();
        int i4 = toString + 109;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isFirstDownload() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.getShareableDataState
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.toString = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            boolean r1 = r6.ShareDataUIState
            r5 = 59
            int r5 = r5 / r4
            if (r1 == 0) goto L2b
            goto L1e
        L18:
            boolean r1 = r6.ShareDataUIState
            r1 = r1 ^ r3
            if (r1 == 0) goto L1e
            goto L2b
        L1e:
            boolean r1 = r6.component3
            if (r1 == 0) goto L2b
            int r2 = r2 + 113
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.getShareableDataState = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L2c
        L2b:
            r3 = r4
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.RepeatWrapper.isFirstDownload():boolean");
    }

    public boolean isFirstUpload() {
        int i = 2 % 2;
        if (this.component2 && this.getAsAtTimestamp) {
            int i2 = getShareableDataState + 105;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = toString + 69;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public void setFirstDownloadRepeat(boolean z) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 69;
        toString = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = z;
        int i5 = i2 + 43;
        toString = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setStartDate(long j) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 25;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        this.ArtificialStackFrames = j;
        int i5 = i2 + 95;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public boolean isRepeatDownload() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 91;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component3;
        int i4 = i3 + 83;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public void updatePacketSize(BigDecimal bigDecimal) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 117;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            this.component1 = this.component1.add(bigDecimal);
            throw null;
        }
        this.component1 = this.component1.add(bigDecimal);
        int i3 = toString + 7;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
    }

    public void updateTempPacketSize(int i) {
        int i2 = 2 % 2;
        int i3 = toString + 75;
        getShareableDataState = i3 % 128;
        this.component4 = i3 % 2 == 0 ? this.component4 * ((long) i) : this.component4 + ((long) i);
    }

    public boolean isRepeatUpload() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 103;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i2 + 79;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean isRepeat() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 49;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        if (!this.component3) {
            int i5 = i3 + 105;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            if (!this.getAsAtTimestamp) {
                return false;
            }
        }
        int i7 = i3 + 55;
        getShareableDataState = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public void setFirstUploadRepeat(boolean z) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 59;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        this.component2 = z;
        int i5 = i3 + 19;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int ShareDataUIState(RepeatWrapper repeatWrapper) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 67;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        int i5 = repeatWrapper.getRequestBeneficiariesState;
        if (i4 != 0) {
            int i6 = 68 / 0;
        }
        int i7 = i3 + 19;
        getShareableDataState = i7 % 128;
        if (i7 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    static List component1(RepeatWrapper repeatWrapper) {
        int i = 2 % 2;
        int i2 = toString + 37;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        List<BigDecimal> list = repeatWrapper.equals;
        if (i3 != 0) {
            return list;
        }
        throw null;
    }

    static ISpeedTestSocket component2(RepeatWrapper repeatWrapper) {
        int i = 2 % 2;
        int i2 = toString + 125;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        ISpeedTestSocket iSpeedTestSocket = repeatWrapper.getSponsorBeneficiariesState;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 99;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return iSpeedTestSocket;
    }

    static void component3(RepeatWrapper repeatWrapper, boolean z) {
        Object[] objArr = {repeatWrapper, Boolean.valueOf(z)};
        int iComponent2 = FieldAttributes.component2();
        int iComponent22 = FieldAttributes.component2();
        component3(-604363272, objArr, FieldAttributes.component2(), FieldAttributes.component2(), iComponent22, 604363273, iComponent2);
    }

    static void component3(RepeatWrapper repeatWrapper, int i) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState + 69;
        int i4 = i3 % 128;
        toString = i4;
        int i5 = i3 % 2;
        repeatWrapper.getRequestBeneficiariesState = i;
        int i6 = i4 + 1;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
    }

    static void copydefault(RepeatWrapper repeatWrapper, ISpeedTestListener iSpeedTestListener) {
        int i = 2 % 2;
        int i2 = toString + 77;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        repeatWrapper.ShareDataUIState(iSpeedTestListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3(RepeatWrapper repeatWrapper, String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 7;
        toString = i2 % 128;
        int i3 = i2 % 2;
        int iComponent2 = FieldAttributes.component2();
        int iComponent22 = FieldAttributes.component2();
        component3(1486672349, new Object[]{repeatWrapper, str}, FieldAttributes.component2(), FieldAttributes.component2(), iComponent22, -1486672349, iComponent2);
        int i4 = getShareableDataState + 49;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    static void component2(RepeatWrapper repeatWrapper, String str, int i) {
        int i2 = 2 % 2;
        int i3 = toString + 61;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        repeatWrapper.component1(str, i);
        if (i4 == 0) {
            throw null;
        }
    }

    private void component2(String str) {
        int iComponent2 = FieldAttributes.component2();
        int iComponent22 = FieldAttributes.component2();
        component3(1486672349, new Object[]{this, str}, FieldAttributes.component2(), FieldAttributes.component2(), iComponent22, -1486672349, iComponent2);
    }

    private static Object component1(Object[] objArr) {
        RepeatWrapper repeatWrapper = (RepeatWrapper) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getShareableDataState + 117;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        repeatWrapper.copydefault = zBooleanValue;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 109;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }
}
