package com.huawei.digitalpayment.form.validator;

import com.blankj.utilcode.util.GsonUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequest;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.huawei.digitalpayment.form.validator.response.LocalRegular;
import com.huawei.digitalpayment.form.validator.response.LocalValidator;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.form.validator.response.ValidatorCheckResult;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u0010\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0005J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0012\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\"\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0018\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R.\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/form/validator/ValidatorManager;", "", "<init>", "()V", "TAG", "", "validators", "Ljava/util/HashMap;", "Lcom/huawei/digitalpayment/form/validator/response/LocalValidator;", "Lkotlin/collections/HashMap;", "refreshValidatorConfig", "", "categoryName", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "getValidator", "getValidatorItem", "Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "key", "getExtKey", "checkValidatorWithCommon", "Lcom/huawei/digitalpayment/form/validator/response/ValidatorCheckResult;", "validatorKey", "input", "checkValidator", ValidatorRequestKt.VALIDATOR_SP_NAME, "FormValidator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatorManager {
    public static final ValidatorManager INSTANCE = new ValidatorManager();
    private static final HashMap<String, LocalValidator> ShareDataUIState = new HashMap<>();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static final String copydefault = "ValidatorManager";
    private static int equals = 1;

    private ValidatorManager() {
    }

    public static final HashMap access$getValidators$p() {
        int i = 2 % 2;
        int i2 = equals + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, LocalValidator> map = ShareDataUIState;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return map;
    }

    static {
        int i = component3 + 113;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void refreshValidatorConfig() {
        int i = 2 % 2;
        int i2 = equals + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        refreshValidatorConfig$default(this, "COMMON", null, 2, null);
        int i4 = equals + 43;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void refreshValidatorConfig$default(ValidatorManager validatorManager, String str, ApiCallback apiCallback, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 33;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 115;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 1 / 0;
            }
            str = "COMMON";
        }
        if ((i & 2) != 0) {
            int i7 = i3 + 1;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            apiCallback = null;
        }
        validatorManager.refreshValidatorConfig(str, apiCallback);
    }

    public final void refreshValidatorConfig(final String categoryName, final ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(categoryName, "");
        if (categoryName.length() == 0) {
            return;
        }
        LocalValidator localValidator = (LocalValidator) SecureGsonUtils.fromJson(SPUtils.getInstance(ValidatorRequestKt.VALIDATOR_SP_NAME).getString(getExtKey(categoryName) + "_VALIDATOR_VALUE"), LocalValidator.class);
        if (localValidator != null) {
            int i4 = component1 + 73;
            equals = i4 % 128;
            int i5 = i4 % 2;
            ShareDataUIState.put(getExtKey(categoryName), localValidator);
            if (callback != null) {
                int i6 = component1 + 85;
                equals = i6 % 128;
                int i7 = i6 % 2;
                callback.onSuccess(true);
            }
        }
        new ValidatorRequest(categoryName).sendRequest(new ApiCallback<LocalValidator>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(LocalValidator localValidator2) {
                int i8 = 2 % 2;
                int i9 = ShareDataUIState + 93;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                onSuccess2(localValidator2);
                int i11 = ShareDataUIState + 47;
                component1 = i11 % 128;
                int i12 = i11 % 2;
            }

            public void onSuccess2(LocalValidator value) {
                int i8 = 2 % 2;
                super.onSuccess(value);
                L.d(ValidatorManager.copydefault, "refreshValidatorConfig: " + value + " ");
                if (value != null) {
                    ValidatorManager.access$getValidators$p().put(ValidatorManager.INSTANCE.getExtKey(categoryName), value);
                    SPUtils.getInstance(ValidatorRequestKt.VALIDATOR_SP_NAME).put(ValidatorManager.INSTANCE.getExtKey(categoryName) + "_version", value.getVersion());
                    SPUtils.getInstance(ValidatorRequestKt.VALIDATOR_SP_NAME).put(ValidatorManager.INSTANCE.getExtKey(categoryName) + "_VALIDATOR_VALUE", GsonUtils.toJson(value));
                    int i9 = component1 + 47;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                }
                ApiCallback<Boolean> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onSuccess(true);
                }
                int i11 = ShareDataUIState + 121;
                component1 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i8 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                L.e(ValidatorManager.copydefault, "refreshValidatorConfig: " + e.getMessage() + " ");
                ApiCallback<Boolean> apiCallback = callback;
                if (apiCallback != null) {
                    int i9 = ShareDataUIState + 51;
                    component1 = i9 % 128;
                    int i10 = i9 % 2;
                    apiCallback.onError(e);
                    int i11 = component1 + 61;
                    ShareDataUIState = i11 % 128;
                    int i12 = i11 % 2;
                }
                int i13 = component1 + 93;
                ShareDataUIState = i13 % 128;
                int i14 = i13 % 2;
            }
        });
    }

    public static LocalValidator getValidator$default(ValidatorManager validatorManager, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 43;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = "COMMON";
        }
        LocalValidator validator = validatorManager.getValidator(str);
        int i5 = component1 + 41;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return validator;
        }
        throw null;
    }

    public final LocalValidator getValidator(String categoryName) {
        int i = 2 % 2;
        int i2 = equals + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(categoryName, "");
        LocalValidator localValidator = ShareDataUIState.get(getExtKey(categoryName));
        if (localValidator == null) {
            localValidator = new LocalValidator(null, null, null, null, 15, null);
            int i4 = component1 + 13;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 3;
            }
        }
        int i6 = equals + 1;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return localValidator;
    }

    public static LocalValidatorItem getValidatorItem$default(ValidatorManager validatorManager, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 65;
        equals = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 59;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = "COMMON";
        }
        return validatorManager.getValidatorItem(str, str2);
    }

    public final LocalValidatorItem getValidatorItem(String key, String categoryName) {
        LocalValidatorItem localValidatorItem;
        int i = 2 % 2;
        int i2 = equals + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(categoryName, "");
            localValidatorItem = getValidator(categoryName).getValidatorMap().get(key);
            int i3 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(categoryName, "");
            localValidatorItem = getValidator(categoryName).getValidatorMap().get(key);
        }
        int i4 = equals + 91;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return localValidatorItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getExtKey$default(ValidatorManager validatorManager, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 45;
        equals = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 21;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = "COMMON";
        }
        return validatorManager.getExtKey(str);
    }

    public final String getExtKey(String categoryName) {
        int i = 2 % 2;
        String str = LanguageUtils.getInstance().getCurrentLang() + "_" + categoryName;
        int i2 = equals + 125;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ValidatorCheckResult checkValidatorWithCommon(String validatorKey, String input) {
        ValidatorCheckResult validatorCheckResultCheckValidator;
        int i = 2 % 2;
        int i2 = component1 + 35;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(input, "");
            validatorCheckResultCheckValidator = checkValidator(validatorKey, input, "COMMON");
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(input, "");
            validatorCheckResultCheckValidator = checkValidator(validatorKey, input, "COMMON");
        }
        int i4 = component1 + 47;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return validatorCheckResultCheckValidator;
        }
        throw null;
    }

    public static ValidatorCheckResult checkValidator$default(ValidatorManager validatorManager, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 11;
        component1 = i3 % 128;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 5) != 0) {
            str3 = "COMMON";
        }
        ValidatorCheckResult validatorCheckResultCheckValidator = validatorManager.checkValidator(str, str2, str3);
        int i4 = component1 + 25;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return validatorCheckResultCheckValidator;
    }

    public final ValidatorCheckResult checkValidator(String validatorKey, String input, String categoryName) {
        int i = 2 % 2;
        int i2 = equals + 67;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(input, "");
            Intrinsics.checkNotNullParameter(categoryName, "");
            checkValidator(getValidatorItem(validatorKey, categoryName), input);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(input, "");
        Intrinsics.checkNotNullParameter(categoryName, "");
        ValidatorCheckResult validatorCheckResultCheckValidator = checkValidator(getValidatorItem(validatorKey, categoryName), input);
        int i3 = equals + 69;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return validatorCheckResultCheckValidator;
        }
        obj.hashCode();
        throw null;
    }

    public final ValidatorCheckResult checkValidator(LocalValidatorItem validator, String input) {
        int i = 2 % 2;
        int i2 = equals + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        if (validator != null) {
            if (input.length() < validator.getMinLength()) {
                return new ValidatorCheckResult(false, validator.getInputTips());
            }
            for (LocalRegular localRegular : validator.getRegularList()) {
                int i4 = equals + 53;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                if (!Pattern.matches(localRegular.getRegular(), input)) {
                    return new ValidatorCheckResult(false, localRegular.getMessage());
                }
            }
        }
        return new ValidatorCheckResult(false, null, 3, null);
    }
}
