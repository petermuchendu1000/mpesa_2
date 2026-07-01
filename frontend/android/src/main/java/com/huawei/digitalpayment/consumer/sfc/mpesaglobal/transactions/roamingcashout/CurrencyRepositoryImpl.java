package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/CurrencyRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/CurrencyRepository;", "<init>", "()V", "getCurrency", "", "getDisplayCurrency", "getSupportedCurrencies", "", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurrencyRepositoryImpl implements CurrencyRepository {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component4 = 1;
    private static int equals;

    public static final Companion INSTANCE = new Companion(null);
    private static final String copydefault = "KES";
    private static final List<String> component3 = CollectionsKt.listOf((Object[]) new String[]{copydefault, "TZS", "UGX"});
    private static final Map<String, String> component2 = MapsKt.mapOf(TuplesKt.to(copydefault, "KSH"), TuplesKt.to("TZS", "TSH"), TuplesKt.to("UGX", "UGX"));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/CurrencyRepositoryImpl$Companion;", "", "<init>", "()V", "DEFAULT_CURRENCY", "", "SUPPORTED_CURRENCIES", "", "CURRENCY_DISPLAY_MAP", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = ShareDataUIState + 5;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    @Override
    public String getCurrency() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getDisplayCurrency() {
        int i = 2 % 2;
        int i2 = component4 + 7;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            String currency = getCurrency();
            String str = component2.get(currency);
            if (str == null) {
                int i3 = component4 + 119;
                equals = i3 % 128;
                int i4 = i3 % 2;
            } else {
                currency = str;
            }
            int i5 = component4 + 123;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return currency;
        }
        component2.get(getCurrency());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public List<String> getSupportedCurrencies() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 23;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = component3;
        int i5 = i2 + 73;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
