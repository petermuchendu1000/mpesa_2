package com.huawei.digitalpayment.consumer.baselib.util.encrypt.random;

import com.huawei.common.util.L;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.ProviderException;
import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.Objects;

public final class DevRandomSeed extends SecureRandomSpi {
    private static final String NAME_RANDOM = "/dev/random";
    private static int component1 = 1;
    private static int component2 = 0;
    private static final long serialVersionUID = -3725272688849712172L;

    @Override
    protected void engineSetSeed(byte[] bArr) {
        synchronized (this) {
            L.d("DevRandomSeed engineSetSeed");
        }
    }

    @Override
    protected void engineNextBytes(byte[] bArr) {
        synchronized (this) {
            L.d("DevRandomSeed engineNextBytes");
            Objects.requireNonNull(bArr);
            byte[] bArrGenerateSeed = generateSeed(bArr.length);
            System.arraycopy(bArrGenerateSeed, 0, bArr, 0, bArrGenerateSeed.length);
            Arrays.fill(bArrGenerateSeed, (byte) 0);
        }
    }

    @Override
    protected byte[] engineGenerateSeed(int i) {
        byte[] bArrGenerateSeed;
        synchronized (this) {
            L.d("DevRandomSeed engineGenerateSeed");
            bArrGenerateSeed = generateSeed(i);
        }
        return bArrGenerateSeed;
    }

    private byte[] generateSeed(int i) {
        FileInputStream fileInputStream;
        byte[] bArr;
        int i2;
        int i3 = 2 % 2;
        try {
            fileInputStream = new FileInputStream(new File(NAME_RANDOM));
            try {
                bArr = new byte[i];
                int i4 = component1 + 111;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                i2 = 0;
            } finally {
            }
        } catch (IOException e) {
            throw new ProviderException("generateSeed() failed", e);
        }
        while (i > 0) {
            int i6 = fileInputStream.read(bArr, i2, i);
            if (i6 <= 0) {
                throw new EOFException("read file error");
            }
            int i7 = component1;
            int i8 = i7 + 63;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            i2 += i6;
            i -= i6;
            int i10 = i7 + 95;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            throw new ProviderException("generateSeed() failed", e);
        }
        fileInputStream.close();
        return bArr;
    }
}
