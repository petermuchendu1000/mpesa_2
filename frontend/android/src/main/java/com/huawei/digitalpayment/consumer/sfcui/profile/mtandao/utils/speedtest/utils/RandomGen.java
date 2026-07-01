package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.utils;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestConst;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;

public class RandomGen {
    private static final SecureRandom component1 = new SecureRandom();
    private static int component2 = 1;
    private static int component3 = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final Random ShareDataUIState = new Random();
    private File copydefault;

    public byte[] generateRandomArray(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 19;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[i];
        int i5 = i / 524288;
        int i6 = i % 524288;
        byte[] bArr2 = new byte[524288];
        int i7 = 0;
        while (i7 < i5) {
            int i8 = getRequestBeneficiariesState + 15;
            equals = i8 % 128;
            if (i8 % 2 != 0) {
                this.ShareDataUIState.nextBytes(bArr2);
                System.arraycopy(bArr2, 0, bArr, i7 - 524288, 524288);
                i7 += 26;
            } else {
                this.ShareDataUIState.nextBytes(bArr2);
                System.arraycopy(bArr2, 0, bArr, i7 * 524288, 524288);
                i7++;
            }
        }
        if (i6 > 0) {
            byte[] bArr3 = new byte[i6];
            this.ShareDataUIState.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr, i5 * 524288, i6);
            int i9 = getRequestBeneficiariesState + 67;
            equals = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = getRequestBeneficiariesState + 7;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 109;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public File generateRandomFile(int i) throws IOException {
        int i2 = 2 % 2;
        File fileCreateTempFile = File.createTempFile("upload_temp", SpeedTestConst.UPLOAD_TEMP_FILE_EXTENSION);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileCreateTempFile));
        try {
            byte[] bArr = new byte[524288];
            int i3 = i / 524288;
            int i4 = i % 524288;
            int i5 = getRequestBeneficiariesState + 83;
            equals = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < i3; i7++) {
                component1.nextBytes(bArr);
                bufferedOutputStream.write(bArr);
            }
            if (i4 > 0) {
                int i8 = getRequestBeneficiariesState + 25;
                equals = i8 % 128;
                if (i8 % 2 != 0) {
                    byte[] bArr2 = new byte[i4];
                    component1.nextBytes(bArr2);
                    bufferedOutputStream.write(bArr2);
                    throw null;
                }
                byte[] bArr3 = new byte[i4];
                component1.nextBytes(bArr3);
                bufferedOutputStream.write(bArr3);
                int i9 = getRequestBeneficiariesState + 31;
                equals = i9 % 128;
                int i10 = i9 % 2;
            }
            bufferedOutputStream.close();
            return fileCreateTempFile;
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void deleteFile() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            File file = this.copydefault;
            if (file != null) {
                file.delete();
                int i3 = equals + 111;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        throw null;
    }
}
