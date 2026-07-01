package com.huawei.digitalpayment.consumer.base.util;

import android.util.Log;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"toSHA256", "", "ConsumerBaseUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SHA256UtilKt {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static final String toSHA256(String str) {
        int i = 2 % 2;
        String string = "";
        Intrinsics.checkNotNullParameter(str, "");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
            StringBuilder sb = new StringBuilder(new BigInteger(1, bArrDigest).toString(16));
            int i2 = ShareDataUIState + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            while (sb.length() < 32) {
                sb.insert(0, '0');
            }
            string = sb.toString();
        } catch (Exception e) {
            Log.e("TAG", String.valueOf(e.getMessage()));
        }
        int i4 = ShareDataUIState + 117;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
