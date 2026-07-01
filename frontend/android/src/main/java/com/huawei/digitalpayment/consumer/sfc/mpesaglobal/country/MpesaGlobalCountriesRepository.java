package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country;

import com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao;
import com.huawei.digitalpayment.consumer.base.database.daos.CountryCacheMetaDao;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CountryWithDetails;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CurrencyEntity;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryCarrier;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Currency;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/MpesaGlobalCountriesRepository;", "", "countriesDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/CountriesDao;", "countryCacheMetaDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/CountryCacheMetaDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/CountriesDao;Lcom/huawei/digitalpayment/consumer/base/database/daos/CountryCacheMetaDao;)V", "saveCountries", "", "transactionType", "", "countries", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountries", "isCacheStale", "", "staleAfterMillis", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalCountriesRepository {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 73 % 128;
    private static int copydefault = 0;
    private static int equals = 1;
    private final CountriesDao ShareDataUIState;
    private final CountryCacheMetaDao component3;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository", f = "MpesaGlobalCountriesRepository.kt", i = {0, 0}, l = {43, 45}, m = "saveCountries", n = {"this", "transactionType"}, s = {"L$0", "L$1"})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int equals = 0;
        private static int getAsAtTimestamp = 1;
        Object ShareDataUIState;
        int component1;
        Object component3;
        Object copydefault;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 49;
            equals = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault = obj;
            this.component1 |= Integer.MIN_VALUE;
            Object objSaveCountries = MpesaGlobalCountriesRepository.this.saveCountries(null, null, this);
            int i4 = getAsAtTimestamp + 51;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                return objSaveCountries;
            }
            throw null;
        }
    }

    @Inject
    public MpesaGlobalCountriesRepository(CountriesDao countriesDao, CountryCacheMetaDao countryCacheMetaDao) {
        Intrinsics.checkNotNullParameter(countriesDao, "");
        Intrinsics.checkNotNullParameter(countryCacheMetaDao, "");
        this.ShareDataUIState = countriesDao;
        this.component3 = countryCacheMetaDao;
    }

    public static final CountryCacheMetaDao access$getCountryCacheMetaDao$p(MpesaGlobalCountriesRepository mpesaGlobalCountriesRepository) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        CountryCacheMetaDao countryCacheMetaDao = mpesaGlobalCountriesRepository.component3;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return countryCacheMetaDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveCountries(java.lang.String r25, java.util.List<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country> r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.saveCountries(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object isCacheStale$default(MpesaGlobalCountriesRepository mpesaGlobalCountriesRepository, String str, long j, Continuation continuation, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 79;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j = 86400000;
        }
        return mpesaGlobalCountriesRepository.isCacheStale(str, j, continuation);
    }

    public final Object isCacheStale(String str, long j, Continuation<? super Boolean> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new component2(str, j, null), continuation);
        int i2 = equals + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return objWithContext;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository$isCacheStale$2", f = "MpesaGlobalCountriesRepository.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private static int copydefault = 0;
        private static int getRequestBeneficiariesState = 1;
        final long ShareDataUIState;
        int component1;
        final String component3;

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r8.component1
                r3 = 0
                r4 = 65
                r5 = 1
                if (r2 == 0) goto L2b
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.getRequestBeneficiariesState
                int r1 = r1 + 31
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.copydefault = r6
                int r1 = r1 % r0
                if (r1 == 0) goto L1d
                if (r2 != r5) goto L23
                goto L1f
            L1d:
                if (r2 != r5) goto L23
            L1f:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L4e
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                kotlin.ResultKt.throwOnFailure(r9)
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository r9 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.this
                com.huawei.digitalpayment.consumer.base.database.daos.CountryCacheMetaDao r9 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.access$getCountryCacheMetaDao$p(r9)
                java.lang.String r2 = r8.component3
                r6 = r8
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r8.component1 = r5
                java.lang.Object r9 = r9.getCacheMeta(r2, r6)
                if (r9 != r1) goto L4e
                int r9 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.getRequestBeneficiariesState
                int r9 = r9 + 35
                int r2 = r9 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.copydefault = r2
                int r9 = r9 % r0
                if (r9 == 0) goto L4d
                int r4 = r4 / r3
            L4d:
                return r1
            L4e:
                com.huawei.digitalpayment.consumer.base.database.entities.country.CountryCacheMetaEntity r9 = (com.huawei.digitalpayment.consumer.base.database.entities.country.CountryCacheMetaEntity) r9
                long r1 = java.lang.System.currentTimeMillis()
                if (r9 == 0) goto L77
                int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.getRequestBeneficiariesState
                int r6 = r6 + r4
                int r4 = r6 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.copydefault = r4
                int r6 = r6 % r0
                if (r6 == 0) goto L6c
                long r6 = r9.getLastFetchTimestamp()
                long r1 = r1 / r6
                long r6 = r8.ShareDataUIState
                int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r9 <= 0) goto L78
                goto L77
            L6c:
                long r6 = r9.getLastFetchTimestamp()
                long r1 = r1 - r6
                long r6 = r8.ShareDataUIState
                int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r9 <= 0) goto L78
            L77:
                r3 = r5
            L78:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesRepository.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, long j, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component3 = str;
            this.ShareDataUIState = j;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = MpesaGlobalCountriesRepository.this.new component2(this.component3, this.ShareDataUIState, continuation);
            int i2 = copydefault + 85;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = getRequestBeneficiariesState + 47;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 17;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getRequestBeneficiariesState + 51;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 52 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final List<Country> getCountries(String transactionType) {
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        List<CountryWithDetails> countriesByTransactionType = this.ShareDataUIState.getCountriesByTransactionType(transactionType);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(countriesByTransactionType, 10));
        for (CountryWithDetails countryWithDetails : countriesByTransactionType) {
            String name = countryWithDetails.getCountry().getName();
            String emoji = countryWithDetails.getCountry().getEmoji();
            String unicode = countryWithDetails.getCountry().getUnicode();
            String alpha2Code = countryWithDetails.getCountry().getAlpha2Code();
            String alpha3Code = countryWithDetails.getCountry().getAlpha3Code();
            String dialCode = countryWithDetails.getCountry().getDialCode();
            List<CurrencyEntity> currencies = countryWithDetails.getCurrencies();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(currencies, 10));
            int i3 = equals + 109;
            copydefault = i3 % 128;
            int i4 = i3 % i;
            for (CurrencyEntity currencyEntity : currencies) {
                arrayList2.add(new Currency(currencyEntity.getIso(), currencyEntity.getName()));
            }
            ArrayList arrayList3 = arrayList2;
            List<CarrierEntity> carriers = countryWithDetails.getCarriers();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(carriers, 10));
            int i5 = equals + 81;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            for (CarrierEntity carrierEntity : carriers) {
                arrayList4.add(new CountryCarrier(carrierEntity.getCode(), carrierEntity.getName()));
            }
            arrayList.add(new Country(name, emoji, unicode, alpha2Code, dialCode, alpha3Code, (String) null, arrayList3, arrayList4, 64, (DefaultConstructorMarker) null));
            i = 2;
        }
        return arrayList;
    }

    static {
        int i = 73 % 2;
    }
}
