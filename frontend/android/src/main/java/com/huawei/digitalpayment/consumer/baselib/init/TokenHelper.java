package com.huawei.digitalpayment.consumer.baselib.init;

import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u0006\u0010\u0011\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/init/TokenHelper;", "", "<init>", "()V", "SP_NAME_TOKEN", "", "KEY_LOGIN_TOKEN", "loginToken", "tempToken", "firebaseToken", "getLoginToken", "setTempToken", "", "getTempToken", "saveTokenToSp", "token", "getTokenFromSp", "clearToken", "saveFirebaseTokenToSp", "getFirebaseTokenFromSp", "getFirebaseToken", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TokenHelper {
    public static final TokenHelper INSTANCE = new TokenHelper();
    private static String ShareDataUIState = null;
    private static String component1 = null;
    private static final String component2 = "key_login_token";
    private static String component3 = null;
    private static int component4 = 0;
    private static final String copydefault = "sp_token";
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;

    private TokenHelper() {
    }

    public static final String access$getFirebaseTokenFromSp(TokenHelper tokenHelper) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String strShareDataUIState = tokenHelper.ShareDataUIState();
        int i4 = getRequestBeneficiariesState + 29;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return strShareDataUIState;
    }

    public static final String access$getTokenFromSp(TokenHelper tokenHelper) {
        int i = 2 % 2;
        int i2 = component4 + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String strComponent1 = tokenHelper.component1();
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = getRequestBeneficiariesState + 119;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return strComponent1;
    }

    public static final void access$setFirebaseToken$p(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        component1 = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 57;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
    }

    public static final void access$setLoginToken$p(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        component3 = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 79;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
    }

    static {
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public Object doInBackground() {
                int i = 2 % 2;
                int i2 = component3 + 109;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    doInBackground();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Void voidDoInBackground = doInBackground();
                int i3 = component3 + 109;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return voidDoInBackground;
            }

            @Override
            public void onSuccess(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 79;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                onSuccess((Void) obj);
                if (i3 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i4 = copydefault + 111;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public Void doInBackground() {
                int i = 2 % 2;
                int i2 = component3 + 11;
                copydefault = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    TokenHelper tokenHelper = TokenHelper.INSTANCE;
                    TokenHelper.access$setLoginToken$p(TokenHelper.access$getTokenFromSp(TokenHelper.INSTANCE));
                    TokenHelper tokenHelper2 = TokenHelper.INSTANCE;
                    TokenHelper.access$setFirebaseToken$p(TokenHelper.access$getFirebaseTokenFromSp(TokenHelper.INSTANCE));
                    return null;
                }
                TokenHelper tokenHelper3 = TokenHelper.INSTANCE;
                TokenHelper.access$setLoginToken$p(TokenHelper.access$getTokenFromSp(TokenHelper.INSTANCE));
                TokenHelper tokenHelper4 = TokenHelper.INSTANCE;
                TokenHelper.access$setFirebaseToken$p(TokenHelper.access$getFirebaseTokenFromSp(TokenHelper.INSTANCE));
                obj.hashCode();
                throw null;
            }

            public void onSuccess(Void result) {
                int i = 2 % 2;
                int i2 = copydefault + 125;
                component3 = i2 % 128;
                int i3 = i2 % 2;
            }
        });
        int i = equals + 89;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public final String getLoginToken() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 59;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = component3;
        int i5 = i2 + 71;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setTempToken(String tempToken) {
        int i = 2 % 2;
        int i2 = component4 + 67;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = tempToken;
        if (str != null) {
            if (!StringsKt.isBlank(str)) {
                ShareDataUIState = tempToken;
                return;
            }
            int i4 = component4 + 67;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final String getTempToken() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 73;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = ShareDataUIState;
        int i5 = i2 + 19;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void saveTokenToSp(String token) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = token;
        if (str != null) {
            int i5 = i3 + 49;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                StringsKt.isBlank(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(str)) {
                component3 = token;
                SPUtils.getInstance(copydefault).put(component2, EncryptManager.INSTANCE.encrypt(token));
            } else {
                int i6 = getRequestBeneficiariesState + 105;
                component4 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            EncryptManager.INSTANCE.decrypt(SPUtils.getInstance(copydefault).getString(component2));
            throw null;
        }
        String strDecrypt = EncryptManager.INSTANCE.decrypt(SPUtils.getInstance(copydefault).getString(component2));
        int i3 = component4 + 99;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return strDecrypt;
    }

    public final void clearToken() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            L.d("TokenHelper", "clearToken: ");
            component3 = null;
            ShareDataUIState = null;
            SPUtils.getInstance(copydefault).remove(component2);
            return;
        }
        L.d("TokenHelper", "clearToken: ");
        component3 = null;
        ShareDataUIState = null;
        SPUtils.getInstance(copydefault).remove(component2);
        throw null;
    }

    public final void saveFirebaseTokenToSp(String token) {
        int i = 2 % 2;
        String str = token;
        if (str != null) {
            int i2 = getRequestBeneficiariesState + 99;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                StringsKt.isBlank(str);
                throw null;
            }
            if (!StringsKt.isBlank(str)) {
                component1 = token;
                SPUtils.getInstance().put(SPConstant.FIREBASE_TOKEN, token);
                int i3 = component4 + 15;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 3;
                }
            }
        }
        int i5 = component4 + 123;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String ShareDataUIState() {
        String string;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            string = SPUtils.getInstance().getString(SPConstant.FIREBASE_TOKEN);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = 3 / 0;
        } else {
            string = SPUtils.getInstance().getString(SPConstant.FIREBASE_TOKEN);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        int i4 = component4 + 19;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public final String getFirebaseToken() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
