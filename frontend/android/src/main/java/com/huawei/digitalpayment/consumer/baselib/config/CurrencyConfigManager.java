package com.huawei.digitalpayment.consumer.baselib.config;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyConfig;
import com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyInfoByLanguage;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tJ\n\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010\u001a\u001a\u00020\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\tJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tJ\u0010\u0010$\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010%\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\tJ\u0015\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0002\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\u0010\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/CurrencyConfigManager;", "", "<init>", "()V", "currencyConfigList", "", "Lcom/huawei/digitalpayment/consumer/baselib/config/model/CurrencyConfig;", "currentCurrencyConfig", "currentCurrencyCode", "", "onCurrencyChangeListeners", "", "Lcom/huawei/digitalpayment/consumer/baselib/config/CurrencyConfigManager$OnCurrencyChangeListener;", "changeCurrencyFlag", "", "getChangeCurrencyFlag", "()Z", "setChangeCurrencyFlag", "(Z)V", "addOnCurrencyChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeOnCurrencyChangeListener", "updateCurrencyConfig", "currencyConfig", "getDefaultCurrency", "getDefaultCurrencyCode", "getSupportCurrencyList", "getCurrentCurrencyConfig", "updateCurrentCurrencyByCode", "code", "onCurrencyChange", "old", "new", "getCurrencyByCode", "getCurrentCurrencyCode", "setCurrentCurrencyCode", "getCurrencySymbolByLanguage", "getCurrencySymbolPositionByLanguage", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "currencyInfoByLanguage", "Lcom/huawei/digitalpayment/consumer/baselib/config/model/CurrencyInfoByLanguage;", "getCurrencyUnitByLanguage", "OnCurrencyChangeListener", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CurrencyConfigManager {
    public static final CurrencyConfigManager INSTANCE = new CurrencyConfigManager();
    private static String ShareDataUIState = null;
    private static CurrencyConfig component1 = null;
    private static List<CurrencyConfig> component2 = null;
    private static boolean component3 = false;
    private static int component4 = 1;
    private static List<OnCurrencyChangeListener> copydefault = null;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/CurrencyConfigManager$OnCurrencyChangeListener;", "", "onCurrencyChange", "", "old", "", "new", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCurrencyChangeListener {
        void onCurrencyChange(String old, String str);
    }

    private CurrencyConfigManager() {
    }

    static {
        List<CurrencyConfig> listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "");
        component2 = listEmptyList;
        copydefault = new ArrayList();
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public Object doInBackground() {
                int i = 2 % 2;
                int i2 = copydefault + 89;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Void voidDoInBackground = doInBackground();
                int i4 = copydefault + 75;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return voidDoInBackground;
            }

            @Override
            public void onSuccess(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 3;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                onSuccess((Void) obj);
                if (i3 == 0) {
                    int i4 = 78 / 0;
                }
            }

            @Override
            public Void doInBackground() {
                int i = 2 % 2;
                int i2 = component1 + 7;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CurrencyConfigManager currencyConfigManager = CurrencyConfigManager.INSTANCE;
                String string = SPUtils.getInstance().getString(SPConstant.SUPPORT_CURRENCY_LIST);
                Intrinsics.checkNotNullExpressionValue(string, "");
                currencyConfigManager.updateCurrencyConfig(string);
                int i4 = component1 + 23;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return null;
            }

            public void onSuccess(Void result) {
                int i = 2 % 2;
                int i2 = copydefault + 113;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i = component4 + 103;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public final boolean getChangeCurrencyFlag() {
        int i = 2 % 2;
        int i2 = equals + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = component3;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return z;
    }

    public final void setChangeCurrencyFlag(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        component3 = z;
        int i5 = i3 + 41;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void addOnCurrencyChangeListener(OnCurrencyChangeListener listener) {
        int i = 2 % 2;
        int i2 = equals + 27;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listener, "");
        if (copydefault.contains(listener)) {
            return;
        }
        copydefault.add(listener);
        int i4 = getRequestBeneficiariesState + 39;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void removeOnCurrencyChangeListener(OnCurrencyChangeListener listener) {
        int i = 2 % 2;
        int i2 = equals + 9;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(listener, "");
            copydefault.remove(listener);
            throw null;
        }
        Intrinsics.checkNotNullParameter(listener, "");
        copydefault.remove(listener);
        int i3 = equals + 1;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
    }

    public final void updateCurrencyConfig(String currencyConfig) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(currencyConfig, "");
        if (currencyConfig.length() > 0) {
            ArrayList arrayList = (List) SecureGsonUtils.fromJson(currencyConfig, new TypeToken<List<? extends CurrencyConfig>>() {
            }.getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            component2 = arrayList;
            int i4 = getRequestBeneficiariesState + 95;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final CurrencyConfig ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!CollectionUtils.isEmpty(component2)) {
                for (CurrencyConfig currencyConfig : component2) {
                    if (!(!Intrinsics.areEqual(currencyConfig.isDefault(), "Y"))) {
                        return currencyConfig;
                    }
                }
                return null;
            }
            int i3 = getRequestBeneficiariesState + 93;
            int i4 = i3 % 128;
            equals = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 101;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        CollectionUtils.isEmpty(component2);
        obj.hashCode();
        throw null;
    }

    public final String getDefaultCurrencyCode() {
        int i = 2 % 2;
        if (CollectionUtils.isEmpty(component2)) {
            return "";
        }
        for (CurrencyConfig currencyConfig : component2) {
            int i2 = getRequestBeneficiariesState + 13;
            equals = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(currencyConfig.isDefault(), "Y")) {
                int i4 = equals + 59;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                String currencyCode = currencyConfig.getCurrencyCode();
                int i6 = getRequestBeneficiariesState + 31;
                equals = i6 % 128;
                if (i6 % 2 == 0) {
                    return currencyCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return "";
    }

    public final List<CurrencyConfig> getSupportCurrencyList() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<CurrencyConfig> list = component2;
        int i4 = i3 + 75;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final CurrencyConfig getCurrentCurrencyConfig() {
        int i = 2 % 2;
        int i2 = equals + 117;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        CurrencyConfig currencyConfig = component1;
        if (currencyConfig == null) {
            return ShareDataUIState();
        }
        int i5 = i3 + 61;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return currencyConfig;
    }

    public final void updateCurrentCurrencyByCode(String code) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        String str = ShareDataUIState;
        if (Intrinsics.areEqual(str, code)) {
            int i2 = getRequestBeneficiariesState + 79;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        for (CurrencyConfig currencyConfig : component2) {
            if (!(!Intrinsics.areEqual(currencyConfig.getCurrencyCode(), code))) {
                int i3 = getRequestBeneficiariesState + 101;
                equals = i3 % 128;
                int i4 = i3 % 2;
                component1 = currencyConfig;
                ShareDataUIState = code;
                ShareDataUIState(str, code);
                return;
            }
        }
    }

    private final void ShareDataUIState(String str, String str2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Iterator<OnCurrencyChangeListener> it = copydefault.iterator();
        while (it.hasNext()) {
            int i4 = equals + 91;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                it.next().onCurrencyChange(str, str2);
                int i5 = 64 / 0;
            } else {
                it.next().onCurrencyChange(str, str2);
            }
            int i6 = equals + 39;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final CurrencyConfig getCurrencyByCode(String code) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 15;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(code, "");
            TextUtils.isEmpty(code);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(code, "");
        if (TextUtils.isEmpty(code)) {
            int i3 = equals + 97;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = getRequestBeneficiariesState + 41;
        equals = i5 % 128;
        int i6 = i5 % 2;
        for (CurrencyConfig currencyConfig : component2) {
            if (Intrinsics.areEqual(currencyConfig.getCurrencyCode(), code)) {
                int i7 = equals + 5;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                return currencyConfig;
            }
        }
        return null;
    }

    public final String getCurrentCurrencyCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String defaultCurrencyCode = ShareDataUIState;
        if (defaultCurrencyCode == null) {
            defaultCurrencyCode = getDefaultCurrencyCode();
        }
        int i4 = getRequestBeneficiariesState + 47;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return defaultCurrencyCode;
    }

    public final void setCurrentCurrencyCode(String currentCurrencyCode) {
        int i = 2 % 2;
        int i2 = equals + 93;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState = currentCurrencyCode;
        for (CurrencyConfig currencyConfig : component2) {
            int i4 = getRequestBeneficiariesState + 113;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(currencyConfig.getCurrencyCode(), currentCurrencyCode)) {
                component1 = currencyConfig;
                int i6 = equals + 73;
                getRequestBeneficiariesState = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 3;
                    return;
                }
                return;
            }
        }
    }

    public final String getCurrencySymbolByLanguage(String code) {
        int i = 2 % 2;
        int i2 = equals + 27;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(code, "");
            TextUtils.isEmpty(code);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(code, "");
        if (!TextUtils.isEmpty(code)) {
            CurrencyInfoByLanguage currencyInfoByLanguageComponent2 = component2(code);
            if (currencyInfoByLanguageComponent2 != null) {
                return currencyInfoByLanguageComponent2.getCurrencySymbol();
            }
            return null;
        }
        int i3 = equals + 63;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    public final Integer getCurrencySymbolPositionByLanguage(String code) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        if (TextUtils.isEmpty(code)) {
            int i4 = equals + 123;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return null;
        }
        CurrencyInfoByLanguage currencyInfoByLanguageComponent2 = component2(code);
        if (currencyInfoByLanguageComponent2 == null) {
            return null;
        }
        int i6 = getRequestBeneficiariesState + 5;
        equals = i6 % 128;
        int i7 = i6 % 2;
        Integer numValueOf = Integer.valueOf(currencyInfoByLanguageComponent2.getCurrencySymbolPosition());
        if (i7 != 0) {
            int i8 = 8 / 0;
        }
        return numValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyInfoByLanguage component2(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyConfig r6 = r5.getCurrencyByCode(r6)
            com.huawei.common.language.LanguageUtils r1 = com.huawei.common.language.LanguageUtils.getInstance()
            com.huawei.common.language.ILanguage r1 = r1.getLanguage()
            java.lang.String r1 = r1.getCurrentLanguageCode()
            r2 = 0
            if (r6 == 0) goto L2c
            int r3 = com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.equals
            int r3 = r3 + 33
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.getRequestBeneficiariesState = r4
            int r3 = r3 % r0
            java.util.HashMap r3 = r6.getI18nCurrencyInfoLocalization()
            if (r3 == 0) goto L2c
            java.lang.Object r1 = r3.get(r1)
            com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyInfoByLanguage r1 = (com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyInfoByLanguage) r1
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 != 0) goto L4f
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.getRequestBeneficiariesState
            int r1 = r1 + 79
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.equals = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L4b
            if (r6 == 0) goto L40
            com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyInfoByLanguage r2 = r6.getCurrencyInfoLocalizationVO()
        L40:
            int r6 = com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.equals
            int r6 = r6 + 107
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            r1 = r2
            goto L4f
        L4b:
            r2.hashCode()
            throw r2
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager.component2(java.lang.String):com.huawei.digitalpayment.consumer.baselib.config.model.CurrencyInfoByLanguage");
    }

    public final String getCurrencyUnitByLanguage(String code) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        if (TextUtils.isEmpty(code)) {
            int i2 = equals + 77;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        CurrencyConfig currencyByCode = getCurrencyByCode(code);
        if (currencyByCode != null) {
            return currencyByCode.getCurrencyUnit();
        }
        int i4 = getRequestBeneficiariesState + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
