package com.huawei.digitalpayment.consumer.baselib.util.encrypt;

import com.huawei.common.exception.BaseException;
import com.huawei.common.util.L;
import com.huawei.common.util.encrypt.AESUtil;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import org.json.JSONObject;

public final class H5SignUtils {
    public static final int AES_IV_LEN = 16;
    public static final int AES_KEY_LEN = 32;
    private static final String ShareDataUIState = "H5SignUtils";
    private static int component2 = 0;
    private static int copydefault = 1;

    public static String encryptBody(JSONObject jSONObject) throws BaseException {
        int i = 2 % 2;
        if (jSONObject == null) {
            L.e(ShareDataUIState, "rawRequest not found");
            throw new BaseException("rawRequest not found");
        }
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KeysConstants.PAY_RAW_REQUEST);
        if (jSONObjectOptJSONObject == null) {
            L.e(ShareDataUIState, "rawRequest not found");
            throw new BaseException("rawRequest not found");
        }
        try {
            String string = jSONObjectOptJSONObject.toString();
            L.e(ShareDataUIState, "rawRequest： " + string);
            String strCopydefault = copydefault(32);
            String strCopydefault2 = copydefault(16);
            String h5SignKey = AppConfigManager.getAppConfig().getH5SignKey();
            String h5SignTransformation = AppConfigManager.getAppConfig().getH5SignTransformation();
            String strRsaEncrypt = com.huawei.common.util.encrypt.EncryptUtils.rsaEncrypt(h5SignKey, h5SignTransformation, strCopydefault);
            String strRsaEncrypt2 = com.huawei.common.util.encrypt.EncryptUtils.rsaEncrypt(h5SignKey, h5SignTransformation, strCopydefault2);
            String str = "" + System.currentTimeMillis();
            String strEncrypt = AESUtil.encrypt(str + strCopydefault2 + string, strCopydefault, strCopydefault2);
            String strEncrypt2 = AESUtil.encrypt(string, strCopydefault, strCopydefault2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("resultCode", "1");
            jSONObject2.put("result", "success");
            jSONObject2.put("timestamp", str);
            jSONObject2.put("sign", strEncrypt);
            jSONObject2.put("encryptIv", strRsaEncrypt2);
            jSONObject2.put("encryptKey", strRsaEncrypt);
            jSONObject2.put("encryptContent", strEncrypt2);
            String string2 = jSONObject2.toString();
            int i4 = component2 + 65;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return string2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            L.e(e.getMessage());
            throw new BaseException(e.getMessage(), e);
        }
    }

    private static String copydefault(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String strSubstring = com.huawei.common.util.encrypt.EncryptUtils.createRandomDynamicIv(i).substring(0, i);
        int i5 = copydefault + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return strSubstring;
    }
}
