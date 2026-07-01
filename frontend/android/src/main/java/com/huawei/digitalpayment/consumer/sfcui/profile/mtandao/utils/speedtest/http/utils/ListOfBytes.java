package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ListOfBytes implements IByteList {
    public static final int BLOCK_SIZE = 4095;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private List<byte[]> component2;

    public ListOfBytes() {
        this.component2 = new ArrayList();
        this.component2 = new ArrayList();
    }

    public ListOfBytes(String str) {
        int i;
        this.component2 = new ArrayList();
        this.component2 = new ArrayList();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            if (length > 0) {
                if (length % 4095 == 0) {
                    i = length / 4095;
                } else {
                    i = (length / 4095) + 1;
                }
                int i2 = 0;
                while (i2 < i) {
                    int i3 = component3 + 85;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 == i - 1) {
                        int i5 = i2 * 4095;
                        int i6 = length - i5;
                        byte[] bArr = new byte[i6];
                        System.arraycopy(bytes, i5, bArr, 0, i6);
                        this.component2.add(bArr);
                    } else {
                        byte[] bArr2 = new byte[4095];
                        System.arraycopy(bytes, i2 * 4095, bArr2, 0, 4095);
                        this.component2.add(bArr2);
                        int i7 = component3 + 29;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = 2 % 2;
                    }
                    i2++;
                    int i10 = component3 + 97;
                    ShareDataUIState = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 2 % 2;
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public byte[] getBytes() {
        int i = 2 % 2;
        int i2 = 0;
        int length = 0;
        while (i2 < this.component2.size()) {
            int i3 = ShareDataUIState + 23;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                length -= this.component2.get(i2).length;
                i2 += 111;
            } else {
                length += this.component2.get(i2).length;
                i2++;
            }
        }
        byte[] bArr = new byte[length];
        int i4 = ShareDataUIState + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        int length2 = 0;
        for (int i6 = 0; i6 < this.component2.size(); i6++) {
            System.arraycopy(this.component2.get(i6), 0, bArr, length2, this.component2.get(i6).length);
            length2 += this.component2.get(i6).length;
        }
        return bArr;
    }

    @Override
    public int add(byte[] bArr) {
        int size;
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.add(bArr);
            size = this.component2.size();
        } else {
            this.component2.add(bArr);
            size = this.component2.size() - 1;
        }
        int i3 = ShareDataUIState + 105;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return size;
        }
        throw null;
    }

    @Override
    public int getSize() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.component2.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = this.component2.size();
        int i3 = component3 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    public List<byte[]> getList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<byte[]> list = this.component2;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override
    public byte[] get(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (i <= 0 || i > this.component2.size() - 1) {
            return null;
        }
        int i5 = ShareDataUIState + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return this.component2.get(i);
    }
}
