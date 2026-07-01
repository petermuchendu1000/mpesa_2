package com.huawei.digitalpayment.consumer.base.security;

import com.google.crypto.tink.jwt.internal.JwtNames;
import java.util.Formatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/security/MsisdnHashGenerator;", "", "<init>", "()V", "genSecret", "", "hashMsisdn", "msg", "key", JwtNames.HEADER_ALGORITHM, "format", "bytes", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MsisdnHashGenerator {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    public static final MsisdnHashGenerator INSTANCE = new MsisdnHashGenerator();
    private static final String copydefault = "83r0CH2cy9";

    private MsisdnHashGenerator() {
    }

    static {
        int i = component2 + 35;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String hashMsisdn$default(MsisdnHashGenerator msisdnHashGenerator, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 63;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i4 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = copydefault;
        }
        if ((i & 4) != 0) {
            int i7 = ShareDataUIState + 105;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = "HmacSHA256";
        }
        return msisdnHashGenerator.hashMsisdn(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String hashMsisdn(java.lang.String r26, java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.security.MsisdnHashGenerator.hashMsisdn(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private final String component1(byte[] bArr) {
        int i = 2 % 2;
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ShareDataUIState + 31;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[0];
                objArr[1] = Byte.valueOf(bArr[i2]);
                formatter.format("%02x", objArr);
                i2 += 4;
            } else {
                formatter.format("%02x", Byte.valueOf(bArr[i2]));
                i2++;
            }
        }
        String string = formatter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = component3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
