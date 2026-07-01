package com.mpesa.qrcode.service.impl;

class CRCService {
    CRCService() {
    }

    public static String generateCRC(byte[] bArr, int i, String str) {
        if (str.contains("CRC-16/CCITT-FALSE")) {
            return generateCCIITT_FALSECrc(bArr, i);
        }
        return generateMCRF4XXCrc(bArr, i);
    }

    public static String generateMCRF4XXCrc(byte[] bArr, int i) {
        int i2 = 65535;
        for (byte b2 : bArr) {
            for (int i3 = 0; i3 < 8; i3++) {
                boolean z = ((b2 >> (7 - (7 - i3))) & 1) == 1;
                boolean z2 = ((i2 >> 15) & 1) == 1;
                i2 <<= 1;
                if (z ^ z2) {
                    i2 ^= 4129;
                }
            }
        }
        return String.format("%0" + i + "X", Integer.valueOf(Integer.reverse(i2) >>> 16));
    }

    public static String generateCCIITT_FALSECrc(byte[] bArr, int i) {
        int i2 = 65535;
        for (byte b2 : bArr) {
            for (int i3 = 0; i3 < 8; i3++) {
                boolean z = ((b2 >> (7 - i3)) & 1) == 1;
                boolean z2 = ((i2 >> 15) & 1) == 1;
                i2 <<= 1;
                if (z ^ z2) {
                    i2 ^= 4129;
                }
            }
        }
        return String.format("%0" + i + "X", Integer.valueOf(i2 & 65535));
    }
}
