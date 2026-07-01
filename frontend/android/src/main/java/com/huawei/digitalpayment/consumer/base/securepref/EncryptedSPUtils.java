package com.huawei.digitalpayment.consumer.base.securepref;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.blankj.utilcode.util.Utils;
import com.google.android.gms.stats.CodePackage;
import com.safaricom.mpesa.logging.L;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public class EncryptedSPUtils {
    private static String ShareDataUIState = "EncryptedSPUtils";
    private static final Map<String, EncryptedSPUtils> component1 = new HashMap();
    private static final String component2 = "config_object";
    private static int component3 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;
    private SharedPreferences copydefault;

    static {
        int i = component3 + 35;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public static EncryptedSPUtils getInstance() {
        int i = 2 % 2;
        int i2 = copy + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        EncryptedSPUtils encryptedSPUtils = getInstance(Utils.getApp(), "");
        int i4 = component4 + 43;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return encryptedSPUtils;
        }
        throw null;
    }

    public static EncryptedSPUtils getInstance(Context context) {
        int i = 2 % 2;
        int i2 = component4 + 77;
        copy = i2 % 128;
        int i3 = i2 % 2;
        EncryptedSPUtils encryptedSPUtils = getInstance(context, "");
        int i4 = copy + 29;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return encryptedSPUtils;
    }

    public static EncryptedSPUtils getInstance(String str) {
        int i = 2 % 2;
        int i2 = copy + 85;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        EncryptedSPUtils encryptedSPUtils = getInstance(Utils.getApp(), str);
        int i4 = component4 + 55;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return encryptedSPUtils;
    }

    public static EncryptedSPUtils getInstance(Context context, String str) {
        if (component1(str)) {
            str = "eConsumerApp";
        }
        Map<String, EncryptedSPUtils> map = component1;
        EncryptedSPUtils encryptedSPUtils = map.get(str);
        if (encryptedSPUtils == null) {
            synchronized (EncryptedSPUtils.class) {
                encryptedSPUtils = map.get(str);
                if (encryptedSPUtils == null) {
                    encryptedSPUtils = new EncryptedSPUtils(context, str);
                    map.put(str, encryptedSPUtils);
                }
            }
        }
        return encryptedSPUtils;
    }

    private EncryptedSPUtils(Context context, String str) {
        try {
            this.copydefault = EncryptedSharedPreferences.create(context, str, new MasterKey.Builder(context).setKeyGenParameterSpec(new KeyGenParameterSpec.Builder(MasterKey.DEFAULT_MASTER_KEY_ALIAS, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build()).build(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            int i = 2 % 2;
        } catch (IOException e) {
            L.INSTANCE.d(ShareDataUIState, "IO Exception, " + e.getMessage(), new Object[0]);
        } catch (GeneralSecurityException e2) {
            L.INSTANCE.d(ShareDataUIState, "General Exception, " + e2.getMessage(), new Object[0]);
        }
        int i2 = copy + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void put(String str, String str2) {
        int i = 2 % 2;
        int i2 = copy + 45;
        component4 = i2 % 128;
        put(str, str2, i2 % 2 != 0);
        int i3 = component4 + 29;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void put(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils.copy
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 75
            int r1 = r1 / 0
            if (r6 == 0) goto L25
            goto L17
        L15:
            if (r6 == 0) goto L25
        L17:
            android.content.SharedPreferences r6 = r3.copydefault
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r4 = r6.putString(r4, r5)
            r4.commit()
            goto L32
        L25:
            android.content.SharedPreferences r6 = r3.copydefault
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r4 = r6.putString(r4, r5)
            r4.apply()
        L32:
            int r4 = com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils.component4
            int r4 = r4 + 93
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils.copy = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils.put(java.lang.String, java.lang.String, boolean):void");
    }

    public String getString(String str) {
        int i = 2 % 2;
        int i2 = component4 + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(str, "");
        int i4 = copy + 123;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public String getString(String str, String str2) {
        int i = 2 % 2;
        int i2 = component4 + 59;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            this.copydefault.getString(str, str2);
            throw null;
        }
        String string = this.copydefault.getString(str, str2);
        int i3 = component4 + 95;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public void put(String str, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 89;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        put(str, i, false);
        int i5 = copy + 81;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void put(String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 31;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        if (!z) {
            this.copydefault.edit().putInt(str, i).apply();
            return;
        }
        int i6 = i3 + 63;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            this.copydefault.edit().putInt(str, i).commit();
        } else {
            this.copydefault.edit().putInt(str, i).commit();
            int i7 = 71 / 0;
        }
    }

    private static boolean component1(String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = component4 + 103;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = component4 + 125;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
                if (!Character.isWhitespace(str.charAt(i4))) {
                    int i7 = copy + 5;
                    component4 = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
            } else {
                if (!Character.isWhitespace(str.charAt(i4))) {
                    int i72 = copy + 5;
                    component4 = i72 % 128;
                    int i82 = i72 % 2;
                    return false;
                }
            }
        }
        return true;
    }
}
