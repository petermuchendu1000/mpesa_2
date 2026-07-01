package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.HttpFrame;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.states.HttpStates;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.UploadStorageType;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class SpeedTestUtils {
    private static SecureRandom ShareDataUIState = new SecureRandom();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    static {
        int i = component3 + 11;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static String generateFileName() {
        int i = 2 % 2;
        String string = new BigInteger(130, ShareDataUIState).toString(32);
        int i2 = component2 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static void dispatchError(ISpeedTestSocket iSpeedTestSocket, boolean z, List<ISpeedTestListener> list, String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        if (!z) {
            int i6 = i2 + 113;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            while (i5 < list.size()) {
                list.get(i5).onError(SpeedTestError.CONNECTION_ERROR, str);
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                int i8 = component1 + 61;
                component2 = i8 % 128;
                int i9 = i8 % 2;
                list.get(i5).onCompletion(iSpeedTestSocket.getLiveReport());
                i5++;
                int i10 = component1 + 55;
                component2 = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = component1 + 113;
        component2 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void dispatchError(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket r4, boolean r5, java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener> r6, com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError r7, java.lang.String r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.component2
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.component1 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L14
            if (r5 != 0) goto L12
            goto L2c
        L12:
            r3 = 1
            goto L16
        L14:
            if (r5 == 0) goto L2c
        L16:
            int r5 = r6.size()
            if (r3 >= r5) goto L4f
            java.lang.Object r5 = r6.get(r3)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener r5 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener) r5
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestReport r7 = r4.getLiveReport()
            r5.onCompletion(r7)
            int r3 = r3 + 1
            goto L16
        L2c:
            int r2 = r2 + 89
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.component2 = r4
            int r2 = r2 % r0
        L33:
            int r4 = r6.size()
            if (r3 >= r4) goto L4f
            java.lang.Object r4 = r6.get(r3)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener r4 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener) r4
            r4.onError(r7, r8)
            int r3 = r3 + 1
            int r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.component1
            int r4 = r4 + 107
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.component2 = r5
            int r4 = r4 % 2
            goto L33
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils.SpeedTestUtils.dispatchError(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestSocket, boolean, java.util.List, com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError, java.lang.String):void");
    }

    public static byte[] readUploadData(UploadStorageType uploadStorageType, byte[] bArr, RandomAccessFile randomAccessFile, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = component2 + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            if (uploadStorageType == UploadStorageType.RAM_STORAGE) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                int i5 = component2 + 57;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return bArrCopyOfRange;
                }
                int i6 = 2 % 3;
                return bArrCopyOfRange;
            }
            byte[] bArr2 = new byte[i2];
            randomAccessFile.seek(i);
            randomAccessFile.read(bArr2);
            return bArr2;
        }
        UploadStorageType uploadStorageType2 = UploadStorageType.RAM_STORAGE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void dispatchSocketTimeout(boolean z, List<ISpeedTestListener> list, String str) {
        int i = 2 % 2;
        if (!z) {
            int i2 = component2 + 123;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).onError(SpeedTestError.SOCKET_TIMEOUT, str);
            }
        }
        int i5 = component1 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
    }

    public static void checkHttpFrameError(boolean z, List<ISpeedTestListener> list, HttpStates httpStates) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (httpStates != HttpStates.HTTP_FRAME_OK) {
            int i4 = component1 + 39;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (z) {
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).onError(SpeedTestError.INVALID_HTTP_RESPONSE, "Error occurred while parsing http frame");
            }
        }
    }

    public static void checkHttpHeaderError(boolean z, List<ISpeedTestListener> list, HttpStates httpStates) {
        int i = 2 % 2;
        if (httpStates != HttpStates.HTTP_FRAME_OK) {
            int i2 = component2;
            int i3 = i2 + 17;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z) {
                return;
            }
            int i4 = i2 + 87;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < list.size()) {
                int i7 = component1 + 51;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    list.get(i6).onError(SpeedTestError.INVALID_HTTP_RESPONSE, "Error occurred while parsing http headers");
                    i6 += 8;
                } else {
                    list.get(i6).onError(SpeedTestError.INVALID_HTTP_RESPONSE, "Error occurred while parsing http headers");
                    i6++;
                }
            }
        }
    }

    public static void checkHttpContentLengthError(boolean z, List<ISpeedTestListener> list, HttpFrame httpFrame) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            if (httpFrame.getContentLength() > 0 || !(!z)) {
                return;
            }
            int i3 = component2 + 111;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).onError(SpeedTestError.INVALID_HTTP_RESPONSE, "Error content length is inconsistent");
            }
            return;
        }
        httpFrame.getContentLength();
        throw null;
    }
}
