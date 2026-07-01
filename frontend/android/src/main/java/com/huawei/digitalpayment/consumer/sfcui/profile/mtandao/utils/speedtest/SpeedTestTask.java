package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest;

import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.ComputationMethod;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.RandomGen;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLSocketFactory;

public class SpeedTestTask {
    private static int e = 1;
    private static int f;
    private ScheduledExecutorService ArtificialStackFrames;
    private boolean CoroutineDebuggingKt;
    private int ShareDataUIState;

    private long f2754a;

    private int f2755b;

    private long f2756c;
    private int component1;
    private boolean component2;
    private int copy;
    private boolean copydefault;
    private final ISpeedTestSocket coroutineBoundary;
    private long coroutineCreation;

    private int f2757d;
    private OutputStream equals;
    private Socket getARTIFICIAL_FRAME_PACKAGE_NAME;
    private InputStream getAsAtTimestamp;
    private final List<ISpeedTestListener> getRequestBeneficiariesState;
    private String getShareableDataState;
    private final RepeatWrapper getSponsorBeneficiariesState;
    private URL hashCode;
    private ExecutorService invokeSuspend;
    private ExecutorService toString;
    private String component4 = "";
    private BigDecimal component3 = BigDecimal.ZERO;
    private BigDecimal invoke = BigDecimal.ZERO;
    private SpeedTestMode accessartificialFrame = SpeedTestMode.NONE;

    public static Object component1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i6 + i5 + i2 + ((-112346298) * i4) + (505796074 * i3);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i6) - 1525940224) + (1734765094 * i5) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i2) + (859308032 * i4) + (310902784 * i3) + (417529856 * i13);
        int i15 = (i6 * (-1233303660)) + 1670658458 + (i5 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i2 * (-1233302909)) + (i4 * 1075253458) + (i3 * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? component2(objArr) : component1(objArr) : ShareDataUIState(objArr) : component3(objArr);
    }

    public SpeedTestTask(ISpeedTestSocket iSpeedTestSocket, List<ISpeedTestListener> list) {
        this.coroutineBoundary = iSpeedTestSocket;
        this.getSponsorBeneficiariesState = iSpeedTestSocket.getRepeatWrapper();
        this.getRequestBeneficiariesState = list;
        copydefault();
    }

    private void copydefault() {
        int i = 2 % 2;
        int i2 = f + 75;
        e = i2 % 128;
        int i3 = i2 % 2;
        this.toString = Executors.newSingleThreadExecutor();
        this.ArtificialStackFrames = Executors.newScheduledThreadPool(1);
        this.invokeSuspend = Executors.newSingleThreadExecutor();
        int i4 = f + 95;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setReportInterval(boolean z) {
        int i = 2 % 2;
        int i2 = f + 35;
        e = i2 % 128;
        int i3 = i2 % 2;
        this.CoroutineDebuggingKt = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean setProxy(String str) {
        URL url;
        int i = 2 % 2;
        if (str != null) {
            try {
                url = new URL(str);
                int i2 = e + 31;
                f = i2 % 128;
                int i3 = i2 % 2;
            } catch (MalformedURLException unused) {
                return false;
            }
        } else {
            int i4 = f + 101;
            e = i4 % 128;
            int i5 = i4 % 2;
            url = null;
        }
        this.hashCode = url;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[Catch: MalformedURLException -> 0x015c, TryCatch #2 {MalformedURLException -> 0x015c, blocks: (B:3:0x000c, B:9:0x0033, B:24:0x0063, B:26:0x0070, B:30:0x0075, B:31:0x0082, B:36:0x0095, B:38:0x00a3, B:47:0x00c0, B:63:0x013a, B:45:0x00b7, B:43:0x00a9, B:49:0x00e7, B:52:0x0100, B:54:0x0106, B:56:0x010d, B:62:0x011f, B:57:0x0110, B:59:0x0116, B:61:0x011d, B:12:0x003d), top: B:72:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startDownloadRequest(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.startDownloadRequest(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startUploadRequest(java.lang.String r7, int r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode.UPLOAD
            r6.accessartificialFrame = r1
            r1 = 0
            r6.copydefault = r1
            r6.component2 = r1
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L75
            r2.<init>(r7)     // Catch: java.net.MalformedURLException -> L75
            java.lang.String r2 = r2.getProtocol()     // Catch: java.net.MalformedURLException -> L75
            int r3 = r2.hashCode()     // Catch: java.net.MalformedURLException -> L75
            r4 = 3213448(0x310888, float:4.503E-39)
            r5 = 1
            if (r3 == r4) goto L38
            r1 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r3 == r1) goto L25
            goto L41
        L25:
            java.lang.String r1 = "https"
            boolean r1 = r2.equals(r1)     // Catch: java.net.MalformedURLException -> L75
            if (r1 == 0) goto L41
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.f
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.e = r2
            int r1 = r1 % r0
            r1 = r5
            goto L42
        L38:
            java.lang.String r3 = "http"
            boolean r2 = r2.equals(r3)     // Catch: java.net.MalformedURLException -> L75
            if (r2 == 0) goto L41
            goto L42
        L41:
            r1 = -1
        L42:
            if (r1 == 0) goto L71
            if (r1 == r5) goto L71
            int r7 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.e
            int r7 = r7 + 15
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.f = r8
            int r7 = r7 % r0
            java.lang.String r8 = "unsupported protocol"
            if (r7 != 0) goto L5f
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r7 = r6.coroutineBoundary     // Catch: java.net.MalformedURLException -> L75
            boolean r0 = r6.copydefault     // Catch: java.net.MalformedURLException -> L75
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener> r1 = r6.getRequestBeneficiariesState     // Catch: java.net.MalformedURLException -> L75
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError.UNSUPPORTED_PROTOCOL     // Catch: java.net.MalformedURLException -> L75
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.dispatchError(r7, r0, r1, r2, r8)     // Catch: java.net.MalformedURLException -> L75
            goto L85
        L5f:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r7 = r6.coroutineBoundary     // Catch: java.net.MalformedURLException -> L75
            boolean r0 = r6.copydefault     // Catch: java.net.MalformedURLException -> L75
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener> r1 = r6.getRequestBeneficiariesState     // Catch: java.net.MalformedURLException -> L75
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError.UNSUPPORTED_PROTOCOL     // Catch: java.net.MalformedURLException -> L75
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.dispatchError(r7, r0, r1, r2, r8)     // Catch: java.net.MalformedURLException -> L75
            r7 = 0
            r7.hashCode()     // Catch: java.lang.Throwable -> L6f java.net.MalformedURLException -> L75
            throw r7     // Catch: java.lang.Throwable -> L6f java.net.MalformedURLException -> L75
        L6f:
            r7 = move-exception
            throw r7
        L71:
            r6.writeUpload(r7, r8)     // Catch: java.net.MalformedURLException -> L75
            goto L85
        L75:
            r7 = move-exception
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r8 = r6.coroutineBoundary
            boolean r0 = r6.copydefault
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener> r1 = r6.getRequestBeneficiariesState
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError.MALFORMED_URI
            java.lang.String r7 = r7.getMessage()
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.dispatchError(r8, r0, r1, r2, r7)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.startUploadRequest(java.lang.String, int):void");
    }

    private static Object component3(Object[] objArr) {
        SpeedTestTask speedTestTask = (SpeedTestTask) objArr[0];
        int i = 2 % 2;
        int i2 = f + 77;
        e = i2 % 128;
        int i3 = i2 % 2;
        speedTestTask.toString.shutdownNow();
        speedTestTask.ArtificialStackFrames.shutdownNow();
        speedTestTask.invokeSuspend.shutdownNow();
        int i4 = e + 119;
        f = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        getReport(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode.UPLOAD);
        r20.getRequestBeneficiariesState.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0181, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        throw new java.net.SocketTimeoutException("Upload write timeout");
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5 A[Catch: IOException -> 0x01cc, SocketTimeoutException -> 0x01d1, TryCatch #3 {SocketTimeoutException -> 0x01d1, IOException -> 0x01cc, blocks: (B:7:0x0021, B:9:0x005a, B:15:0x0088, B:23:0x00c6, B:28:0x00e4, B:30:0x00ea, B:31:0x00ef, B:36:0x00ff, B:37:0x010b, B:39:0x0111, B:65:0x0173, B:67:0x017e, B:68:0x0181, B:50:0x013e, B:52:0x0149, B:51:0x0143, B:60:0x0161, B:26:0x00d5, B:71:0x0184, B:72:0x018b, B:18:0x00a1, B:73:0x018c, B:76:0x0199, B:77:0x01a5, B:80:0x01b4, B:81:0x01c4, B:82:0x01cb), top: B:90:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea A[Catch: IOException -> 0x01cc, SocketTimeoutException -> 0x01d1, TryCatch #3 {SocketTimeoutException -> 0x01d1, IOException -> 0x01cc, blocks: (B:7:0x0021, B:9:0x005a, B:15:0x0088, B:23:0x00c6, B:28:0x00e4, B:30:0x00ea, B:31:0x00ef, B:36:0x00ff, B:37:0x010b, B:39:0x0111, B:65:0x0173, B:67:0x017e, B:68:0x0181, B:50:0x013e, B:52:0x0149, B:51:0x0143, B:60:0x0161, B:26:0x00d5, B:71:0x0184, B:72:0x018b, B:18:0x00a1, B:73:0x018c, B:76:0x0199, B:77:0x01a5, B:80:0x01b4, B:81:0x01c4, B:82:0x01cb), top: B:90:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ShareDataUIState(java.lang.String r21, java.net.URL r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.ShareDataUIState(java.lang.String, java.net.URL, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r1 > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        if (r1 > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        r7 = r1;
        r8.invoke = new java.math.BigDecimal(r10);
        r8.f2755b = 0;
        r8.f2757d = 0;
        r8.f2754a = java.lang.System.nanoTime();
        r8.coroutineCreation = java.lang.System.nanoTime();
        copydefault(new com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask$$ExternalSyntheticLambda2(r8, r9, r5, r10, r7), false, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid uploadChunkSize: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeUpload(final java.lang.String r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.writeUpload(java.lang.String, int):void");
    }

    private void component2(SocketTimeoutException socketTimeoutException) {
        int i = 2 % 2;
        this.CoroutineDebuggingKt = false;
        this.component2 = true;
        closeSocket();
        component1(zzpj.component3(), new Object[]{this}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
        boolean z = this.copydefault;
        if (z) {
            SpeedTestUtils.dispatchError(this.coroutineBoundary, z, this.getRequestBeneficiariesState, socketTimeoutException.getMessage());
        } else {
            int i2 = f + 57;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                SpeedTestUtils.dispatchSocketTimeout(z, this.getRequestBeneficiariesState, SpeedTestConst.SOCKET_WRITE_ERROR);
                throw null;
            }
            SpeedTestUtils.dispatchSocketTimeout(z, this.getRequestBeneficiariesState, SpeedTestConst.SOCKET_WRITE_ERROR);
        }
        int i3 = f + 17;
        e = i3 % 128;
        int i4 = i3 % 2;
    }

    private void copydefault(IOException iOException) {
        int i = 2 % 2;
        int i2 = e + 67;
        f = i2 % 128;
        int i3 = i2 % 2;
        this.CoroutineDebuggingKt = false;
        this.component2 = true;
        component1(zzpj.component3(), new Object[]{this}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
        SpeedTestUtils.dispatchError(this.coroutineBoundary, this.copydefault, this.getRequestBeneficiariesState, iOException.getMessage());
        int i4 = e + 113;
        f = i4 % 128;
        int i5 = i4 % 2;
    }

    private void copydefault(RandomAccessFile randomAccessFile, RandomGen randomGen) {
        int i = 2 % 2;
        int i2 = e + 35;
        f = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                randomGen.deleteFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        int i3 = f + 9;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void copydefault(final Runnable runnable, final boolean z, final int i) {
        int i2 = 2 % 2;
        int i3 = f;
        int i4 = i3 + 29;
        e = i4 % 128;
        int i5 = i4 % 2;
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME != null) {
            int i6 = i3 + 121;
            e = i6 % 128;
            int i7 = i6 % 2;
            closeSocket();
        }
        try {
            if ("https".equals(this.getShareableDataState)) {
                int i8 = f + 49;
                e = i8 % 128;
                int i9 = i8 % 2;
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket();
            } else {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = new Socket();
            }
            if (this.coroutineBoundary.getSocketTimeout() != 0 && z) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.setSoTimeout(this.coroutineBoundary.getSocketTimeout());
                int i10 = e + 103;
                f = i10 % 128;
                int i11 = i10 % 2;
            }
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setReuseAddress(true);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setKeepAlive(true);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.connect(new InetSocketAddress(this.component4, this.copy));
            ExecutorService executorService = this.toString;
            if (executorService == null || executorService.isShutdown()) {
                this.toString = Executors.newSingleThreadExecutor();
            }
            this.toString.execute(new Runnable() {
                private static int component1 = 0;
                private static int component3 = 1;

                @Override
                public void run() {
                    int i12 = 2 % 2;
                    int i13 = component3 + 79;
                    component1 = i13 % 128;
                    int i14 = i13 % 2;
                    if (!(!z)) {
                        SpeedTestTask speedTestTask = SpeedTestTask.this;
                        SpeedTestTask.component1(speedTestTask, (String) SpeedTestTask.component1(zzpj.component3(), new Object[]{speedTestTask}, zzpj.component3(), zzpj.component3(), zzpj.component3(), 1821628245, -1821628243), SpeedTestTask.component1(SpeedTestTask.this));
                    } else {
                        SpeedTestTask speedTestTask2 = SpeedTestTask.this;
                        SpeedTestTask.copydefault(speedTestTask2, SpeedTestTask.component1(speedTestTask2), i);
                    }
                    int i15 = component1 + 37;
                    component3 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 25 / 0;
                    }
                }
            });
            if (this.invokeSuspend == null || !(!r7.isShutdown())) {
                this.invokeSuspend = Executors.newSingleThreadExecutor();
            }
            this.invokeSuspend.execute(new Runnable(this) {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                @Override
                public void run() {
                    int i12 = 2 % 2;
                    int i13 = copydefault + 13;
                    ShareDataUIState = i13 % 128;
                    if (i13 % 2 != 0) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                            int i14 = copydefault + 15;
                            ShareDataUIState = i14 % 128;
                            int i15 = i14 % 2;
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            });
        } catch (IOException e2) {
            if (this.component2) {
                return;
            }
            SpeedTestUtils.dispatchError(this.coroutineBoundary, this.copydefault, this.getRequestBeneficiariesState, e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0121 A[Catch: InterruptedException -> 0x01a5, IOException -> 0x01a7, SocketTimeoutException -> 0x01b2, TRY_LEAVE, TryCatch #2 {IOException -> 0x01a7, InterruptedException -> 0x01a5, SocketTimeoutException -> 0x01b2, blocks: (B:3:0x000a, B:5:0x0039, B:7:0x0045, B:9:0x005f, B:10:0x0066, B:12:0x007e, B:14:0x0093, B:16:0x00a9, B:17:0x00c6, B:18:0x00cd, B:21:0x00de, B:23:0x00f5, B:28:0x0108, B:33:0x0119, B:42:0x0171, B:43:0x0174, B:45:0x017c, B:46:0x01a1, B:31:0x0111, B:35:0x0121, B:38:0x0134, B:40:0x0146, B:41:0x0167), top: B:56:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171 A[Catch: InterruptedException -> 0x01a5, IOException -> 0x01a7, SocketTimeoutException -> 0x01b2, TryCatch #2 {IOException -> 0x01a7, InterruptedException -> 0x01a5, SocketTimeoutException -> 0x01b2, blocks: (B:3:0x000a, B:5:0x0039, B:7:0x0045, B:9:0x005f, B:10:0x0066, B:12:0x007e, B:14:0x0093, B:16:0x00a9, B:17:0x00c6, B:18:0x00cd, B:21:0x00de, B:23:0x00f5, B:28:0x0108, B:33:0x0119, B:42:0x0171, B:43:0x0174, B:45:0x017c, B:46:0x01a1, B:31:0x0111, B:35:0x0121, B:38:0x0134, B:40:0x0146, B:41:0x0167), top: B:56:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ShareDataUIState(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.ShareDataUIState(java.lang.String, java.lang.String):void");
    }

    private void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = e + 91;
        f = i2 % 128;
        int i3 = i2 % 2;
        closeSocket();
        if (!this.getSponsorBeneficiariesState.isRepeatDownload()) {
            int i4 = e + 9;
            f = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {this};
            int iComponent3 = zzpj.component3();
            int iComponent32 = zzpj.component3();
            int iComponent33 = zzpj.component3();
            int iComponent34 = zzpj.component3();
            if (i5 != 0) {
                component1(iComponent3, objArr, iComponent32, iComponent34, iComponent33, -1508134177, 1508134178);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            component1(iComponent3, objArr, iComponent32, iComponent34, iComponent33, -1508134177, 1508134178);
            int i6 = f + 43;
            e = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private void component1() throws IOException {
        int i = 2 % 2;
        int i2 = e + 105;
        f = i2 % 128;
        int i3 = i2 % 2;
        int iMin = 64;
        byte[] bArr = new byte[64];
        while (true) {
            int i4 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getInputStream().read(bArr);
            if (i4 == -1) {
                return;
            }
            int i5 = f + 29;
            e = i5 % 128;
            int i6 = i5 % 2;
            this.component1 += i4;
            this.ShareDataUIState += i4;
            if (this.getSponsorBeneficiariesState.isRepeatDownload()) {
                this.getSponsorBeneficiariesState.updateTempPacketSize(i4);
            }
            if (!this.CoroutineDebuggingKt) {
                int i7 = f + 63;
                e = i7 % 128;
                int i8 = i7 % 2;
                SpeedTestReport report = getReport(SpeedTestMode.DOWNLOAD);
                for (int i9 = 0; i9 < this.getRequestBeneficiariesState.size(); i9++) {
                    this.getRequestBeneficiariesState.get(i9).onProgress(report.getProgressPercent(), report);
                }
            }
            if (this.component1 == this.component3.longValueExact()) {
                int i10 = e + 65;
                f = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 / 5;
                    return;
                }
                return;
            }
            if (iMin < 65535) {
                iMin = Math.min(iMin * 2, 65535);
                bArr = new byte[iMin];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: IOException | InterruptedException -> 0x016b, IOException -> 0x016d, TryCatch #2 {IOException | InterruptedException -> 0x016b, blocks: (B:3:0x0007, B:5:0x001a, B:7:0x0022, B:11:0x0038, B:12:0x004a, B:14:0x0052, B:15:0x0060, B:17:0x0068, B:21:0x0079, B:37:0x00f3, B:38:0x00f6, B:40:0x00fe, B:41:0x0123, B:23:0x0081, B:25:0x008b, B:27:0x009d, B:28:0x00b8, B:30:0x00c0, B:31:0x00c3, B:33:0x00cb, B:34:0x00dd, B:36:0x00ea, B:43:0x0127, B:45:0x012e, B:48:0x0133, B:50:0x013b, B:51:0x014d), top: B:62:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void component2(java.lang.String r12, int r13) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.component2(java.lang.String, int):void");
    }

    private static Object component1(Object[] objArr) {
        final SpeedTestTask speedTestTask = (SpeedTestTask) objArr[0];
        final byte[] bArr = (byte[]) objArr[1];
        int i = 2 % 2;
        speedTestTask.copydefault(new Runnable() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 115;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SpeedTestTask.$r8$lambda$JNlSE8op9ud_mTIroOx6ZM2FjRA(this.f$0, bArr);
                int i5 = component3 + 123;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 85 / 0;
                }
            }
        }, true, 0);
        int i2 = e + 93;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static Object component2(Object[] objArr) {
        SpeedTestTask speedTestTask = (SpeedTestTask) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = 2 % 2;
        Socket socket = speedTestTask.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (socket == null) {
            return null;
        }
        int i2 = f + 37;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (!(true ^ socket.isClosed())) {
            return null;
        }
        int i4 = f + 23;
        e = i4 % 128;
        int i5 = i4 % 2;
        try {
            if (speedTestTask.getARTIFICIAL_FRAME_PACKAGE_NAME.getOutputStream() == null) {
                return null;
            }
            int i6 = e + 41;
            f = i6 % 128;
            if (i6 % 2 != 0) {
                if (speedTestTask.component2(bArr, 0, bArr.length) == 0) {
                    return null;
                }
            } else if (speedTestTask.component2(bArr, 0, bArr.length) == 0) {
                return null;
            }
            throw new SocketTimeoutException();
        } catch (SocketTimeoutException unused) {
            SpeedTestUtils.dispatchSocketTimeout(speedTestTask.copydefault, speedTestTask.getRequestBeneficiariesState, SpeedTestConst.SOCKET_WRITE_ERROR);
            speedTestTask.closeSocket();
            component1(zzpj.component3(), new Object[]{speedTestTask}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
            return null;
        } catch (IOException e2) {
            SpeedTestUtils.dispatchError(speedTestTask.coroutineBoundary, speedTestTask.copydefault, speedTestTask.getRequestBeneficiariesState, e2.getMessage());
            component1(zzpj.component3(), new Object[]{speedTestTask}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
            return null;
        }
    }

    private Integer component3(byte[] bArr, int i, int i2) throws Exception {
        OutputStream outputStream;
        int i3 = 2 % 2;
        int i4 = f + 117;
        e = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                outputStream = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getOutputStream();
                outputStream.write(bArr, i, i2);
            } else {
                outputStream = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getOutputStream();
                outputStream.write(bArr, i, i2);
            }
            outputStream.flush();
            int i5 = e + 55;
            f = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        } catch (IOException unused) {
            return -1;
        }
    }

    private int component2(final byte[] bArr, final int i, final int i2) throws IOException {
        int iIntValue;
        int i3 = 2 % 2;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final Object call() throws Exception {
                int i4 = 2 % 2;
                int i5 = component2 + 43;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                Integer numM11733$r8$lambda$6r0fWMRnaSA5LEAftcEhDDG_Hg = SpeedTestTask.m11733$r8$lambda$6r0fWMRnaSA5LEAftcEhDDG_Hg(this.f$0, bArr, i, i2);
                int i7 = copydefault + 61;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                return numM11733$r8$lambda$6r0fWMRnaSA5LEAftcEhDDG_Hg;
            }
        });
        try {
            try {
                iIntValue = ((Integer) futureSubmit.get(this.coroutineBoundary.getSocketTimeout(), TimeUnit.MILLISECONDS)).intValue();
                int i4 = e + 93;
                f = i4 % 128;
                int i5 = i4 % 2;
            } catch (InterruptedException | ExecutionException unused) {
                Thread.currentThread().interrupt();
                iIntValue = -1;
            } catch (TimeoutException unused2) {
                futureSubmit.cancel(true);
                iIntValue = -1;
            }
            return iIntValue;
        } finally {
            executorServiceNewSingleThreadExecutor.shutdownNow();
        }
    }

    private void component1(String str) {
        int i = 2 % 2;
        int i2 = f + 45;
        e = i2 % 128;
        int i3 = i2 % 2;
        this.f2756c = System.nanoTime();
        closeSocket();
        component1(zzpj.component3(), new Object[]{this}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
        SpeedTestUtils.dispatchError(this.coroutineBoundary, this.copydefault, this.getRequestBeneficiariesState, str);
        int i4 = f + 65;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
    }

    static class AnonymousClass2 {
        static final int[] ShareDataUIState;
        static final int[] component1;
        private static int component2 = 0;
        private static int copydefault = 1;

        static {
            int[] iArr = new int[ComputationMethod.values().length];
            ShareDataUIState = iArr;
            try {
                iArr[ComputationMethod.MEDIAN_ALL_TIME.ordinal()] = 1;
                int i = component2 + 107;
                copydefault = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShareDataUIState[ComputationMethod.MEDIAN_INTERVAL.ordinal()] = 2;
                int i4 = component2 + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SpeedTestMode.values().length];
            component1 = iArr2;
            try {
                iArr2[SpeedTestMode.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                component1[SpeedTestMode.UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SpeedTestReport getReport(SpeedTestMode speedTestMode) {
        int i = 2 % 2;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        int i2 = AnonymousClass2.component1[speedTestMode.ordinal()];
        if (i2 != 1) {
            int i3 = e + 55;
            f = i3 % 128;
            int i4 = i3 % 2;
            if (i2 == 2) {
                bigDecimal = new BigDecimal(this.f2755b);
                bigDecimal2 = this.invoke;
            }
        } else {
            bigDecimal = new BigDecimal(this.component1);
            bigDecimal2 = this.component3;
        }
        long jNanoTime = this.f2756c;
        if (jNanoTime == 0) {
            jNanoTime = System.nanoTime();
        }
        long j = jNanoTime;
        BigDecimal bigDecimalDivide = BigDecimal.ZERO;
        int defaultScale = this.coroutineBoundary.getDefaultScale();
        RoundingMode defaultRoundingMode = this.coroutineBoundary.getDefaultRoundingMode();
        int i5 = AnonymousClass2.ShareDataUIState[this.coroutineBoundary.getComputationMethod().ordinal()];
        if (i5 == 1) {
            BigDecimal bigDecimalDivide2 = new BigDecimal(j - this.coroutineCreation).divide(SpeedTestConst.NANO_DIVIDER, defaultScale, defaultRoundingMode);
            if (copydefault(j)) {
                int i6 = f + 27;
                e = i6 % 128;
                if (i6 % 2 == 0) {
                    bigDecimalDivide2.compareTo(BigDecimal.ZERO);
                    throw null;
                }
                if (bigDecimalDivide2.compareTo(BigDecimal.ZERO) != 0) {
                    bigDecimalDivide = bigDecimal.divide(bigDecimalDivide2, defaultScale, defaultRoundingMode);
                }
            }
        } else if (i5 == 2) {
            BigDecimal bigDecimal3 = speedTestMode == SpeedTestMode.DOWNLOAD ? new BigDecimal(this.ShareDataUIState) : new BigDecimal(this.f2757d);
            BigDecimal bigDecimalDivide3 = new BigDecimal(j - this.coroutineCreation).divide(SpeedTestConst.NANO_DIVIDER, defaultScale, defaultRoundingMode);
            if (copydefault(j) && bigDecimalDivide3.compareTo(BigDecimal.ZERO) != 0) {
                bigDecimalDivide = bigDecimal3.divide(bigDecimalDivide3, defaultScale, defaultRoundingMode);
            }
            this.ShareDataUIState = 0;
            this.f2757d = 0;
            this.coroutineCreation = System.nanoTime();
        }
        BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(SpeedTestConst.BIT_MULTIPLIER);
        BigDecimal bigDecimalDivide4 = BigDecimal.ZERO;
        if (!this.getSponsorBeneficiariesState.isRepeat()) {
            if (bigDecimal2.compareTo(BigDecimal.ZERO) != 0) {
                bigDecimalDivide4 = bigDecimal.multiply(SpeedTestConst.PERCENT_MAX).divide(bigDecimal2, defaultScale, defaultRoundingMode);
            }
            return new SpeedTestReport(speedTestMode, bigDecimalDivide4.floatValue(), this.f2754a, j, bigDecimal.longValueExact(), bigDecimal2.longValueExact(), bigDecimalDivide, bigDecimalMultiply, 1);
        }
        SpeedTestReport repeatReport = this.getSponsorBeneficiariesState.getRepeatReport(defaultScale, defaultRoundingMode, speedTestMode, j, bigDecimalDivide);
        int i7 = e + 111;
        f = i7 % 128;
        int i8 = i7 % 2;
        return repeatReport;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r7
  0x003e: PHI (r7v7 long) = (r7v1 long), (r7v9 long) binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1 r7
  0x002f: PHI (r1v6 int) = (r1v5 int), (r1v10 int) binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r7v2 long) = (r7v1 long), (r7v9 long) binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean copydefault(long r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.f
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.e = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            long r4 = r6.f2754a
            long r7 = r7 | r4
            int[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.AnonymousClass2.component1
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode r4 = r6.accessartificialFrame
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L3e
            goto L2f
        L20:
            long r4 = r6.f2754a
            long r7 = r7 - r4
            int[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.AnonymousClass2.component1
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode r4 = r6.accessartificialFrame
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L3e
        L2f:
            if (r1 == r0) goto L33
        L31:
            r2 = r3
            goto L52
        L33:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r1 = r6.coroutineBoundary
            long r4 = r1.getUploadSetupTime()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L52
            goto L48
        L3e:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r1 = r6.coroutineBoundary
            long r4 = r1.getDownloadSetupTime()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L52
        L48:
            int r7 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.f
            int r7 = r7 + 75
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.e = r8
            int r7 = r7 % r0
            goto L31
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.copydefault(long):boolean");
    }

    public void closeSocket() {
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 89;
        e = i3 % 128;
        int i4 = i3 % 2;
        Socket socket = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (socket != null) {
            int i5 = i2 + 63;
            e = i5 % 128;
            int i6 = i5 % 2;
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public void forceStopTask() {
        int i = 2 % 2;
        this.copydefault = true;
        InputStream inputStream = this.getAsAtTimestamp;
        if (inputStream != null) {
            int i2 = e + 59;
            f = i2 % 128;
            int i3 = i2 % 2;
            try {
                inputStream.close();
                int i4 = e + 105;
                f = i4 % 128;
                int i5 = i4 % 2;
            } catch (IOException unused) {
            }
        }
        OutputStream outputStream = this.equals;
        if (outputStream != null) {
            int i6 = f + 43;
            e = i6 % 128;
            int i7 = i6 % 2;
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    public void shutdownAndWait() {
        int i = 2 % 2;
        int i2 = f + 7;
        e = i2 % 128;
        int i3 = i2 % 2;
        component1(zzpj.component3(), new Object[]{this}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
        try {
            this.toString.awaitTermination(500L, TimeUnit.MILLISECONDS);
            this.invokeSuspend.awaitTermination(500L, TimeUnit.MILLISECONDS);
            this.ArtificialStackFrames.awaitTermination(500L, TimeUnit.MILLISECONDS);
            int i4 = f + 31;
            e = i4 % 128;
            int i5 = i4 % 2;
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void renewReportThreadPool() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.concurrent.ScheduledExecutorService r1 = r4.ArtificialStackFrames
            if (r1 == 0) goto L16
            int r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.f
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.e = r3
            int r2 = r2 % r0
            boolean r1 = r1.isShutdown()
            if (r1 == 0) goto L1d
        L16:
            r1 = 1
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newScheduledThreadPool(r1)
            r4.ArtificialStackFrames = r1
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.e
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.f = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestTask.renewReportThreadPool():void");
    }

    public ScheduledExecutorService getReportThreadPool() {
        int i = 2 % 2;
        int i2 = f + 121;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        ScheduledExecutorService scheduledExecutorService = this.ArtificialStackFrames;
        int i5 = i3 + 95;
        f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return scheduledExecutorService;
    }

    public boolean isReportInterval() {
        boolean z;
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 17;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.CoroutineDebuggingKt;
            int i4 = 53 / 0;
        } else {
            z = this.CoroutineDebuggingKt;
        }
        int i5 = i2 + 51;
        e = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public SpeedTestMode getSpeedTestMode() {
        int i = 2 % 2;
        int i2 = e + 25;
        f = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestMode speedTestMode = this.accessartificialFrame;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return speedTestMode;
    }

    public static Integer m11733$r8$lambda$6r0fWMRnaSA5LEAftcEhDDG_Hg(SpeedTestTask speedTestTask, byte[] bArr, int i, int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = f + 9;
        e = i4 % 128;
        int i5 = i4 % 2;
        Integer numComponent3 = speedTestTask.component3(bArr, i, i2);
        int i6 = f + 109;
        e = i6 % 128;
        int i7 = i6 % 2;
        return numComponent3;
    }

    public static void $r8$lambda$JNlSE8op9ud_mTIroOx6ZM2FjRA(SpeedTestTask speedTestTask, byte[] bArr) {
        int i = 2 % 2;
        int i2 = f + 19;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            component1(zzpj.component3(), new Object[]{speedTestTask, bArr}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -15975896, 15975896);
            return;
        }
        component1(zzpj.component3(), new Object[]{speedTestTask, bArr}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -15975896, 15975896);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$deoSw34FCfjqAEPd86lMgCppzdY(SpeedTestTask speedTestTask, String str, URL url, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = e + 49;
        f = i4 % 128;
        int i5 = i4 % 2;
        speedTestTask.ShareDataUIState(str, url, i, i2);
        int i6 = f + 105;
        e = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static String component1(SpeedTestTask speedTestTask) {
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 49;
        e = i3 % 128;
        int i4 = i3 % 2;
        String str = speedTestTask.component4;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 27;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static String component3(SpeedTestTask speedTestTask) {
        return (String) component1(zzpj.component3(), new Object[]{speedTestTask}, zzpj.component3(), zzpj.component3(), zzpj.component3(), 1821628245, -1821628243);
    }

    static void component1(SpeedTestTask speedTestTask, String str, String str2) {
        int i = 2 % 2;
        int i2 = f + 103;
        e = i2 % 128;
        int i3 = i2 % 2;
        speedTestTask.ShareDataUIState(str, str2);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = f + 73;
        e = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault(SpeedTestTask speedTestTask, String str, int i) {
        int i2 = 2 % 2;
        int i3 = f + 7;
        e = i3 % 128;
        int i4 = i3 % 2;
        speedTestTask.component2(str, i);
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
    }

    private void component3() {
        component1(zzpj.component3(), new Object[]{this}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -1508134177, 1508134178);
    }

    private void component3(byte[] bArr) {
        component1(zzpj.component3(), new Object[]{this, bArr}, zzpj.component3(), zzpj.component3(), zzpj.component3(), -15975896, 15975896);
    }

    private void component2(byte[] bArr) {
        component1(zzpj.component3(), new Object[]{this, bArr}, zzpj.component3(), zzpj.component3(), zzpj.component3(), 138074584, -138074581);
    }

    private static Object ShareDataUIState(Object[] objArr) {
        SpeedTestTask speedTestTask = (SpeedTestTask) objArr[0];
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 69;
        e = i3 % 128;
        int i4 = i3 % 2;
        String str = speedTestTask.getShareableDataState;
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = i2 + 43;
        e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
