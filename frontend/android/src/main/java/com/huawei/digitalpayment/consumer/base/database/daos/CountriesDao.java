package com.huawei.digitalpayment.consumer.base.database.daos;

import com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CountryWithDetails;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CurrencyEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH§@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013JB\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122*\u0010\u0015\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u00160\nH\u0097@¢\u0006\u0002\u0010\u0017J2\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0097@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H'¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/CountriesDao;", "", "insertCountry", "", "country", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCurrencies", "", "currencies", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CurrencyEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCarriers", "carriers", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CarrierEntity;", "deleteCountriesByTransaction", "transactionType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAndInsertCountries", "countryData", "Lkotlin/Triple;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFullCountryData", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountriesByTransactionType", "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryWithDetails;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CountriesDao {
    Object clearAndInsertCountries(String str, List<? extends Triple<CountryEntity, ? extends List<CurrencyEntity>, ? extends List<CarrierEntity>>> list, Continuation<? super Unit> continuation);

    Object deleteCountriesByTransaction(String str, Continuation<? super Unit> continuation);

    List<CountryWithDetails> getCountriesByTransactionType(String transactionType);

    Object insertCarriers(List<CarrierEntity> list, Continuation<? super Unit> continuation);

    Object insertCountry(CountryEntity countryEntity, Continuation<? super Long> continuation);

    Object insertCurrencies(List<CurrencyEntity> list, Continuation<? super Unit> continuation);

    Object insertFullCountryData(CountryEntity countryEntity, List<CurrencyEntity> list, List<CarrierEntity> list2, Continuation<? super Unit> continuation);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 1;
        private static int component3;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao$DefaultImpls", f = "CountriesDao.kt", i = {0, 0, 1}, l = {32, 35}, m = "clearAndInsertCountries", n = {"$this", "countryData", "$this"}, s = {"L$0", "L$1", "L$0"})
        static final class component3 extends ContinuationImpl {
            private static int ShareDataUIState = 0;
            private static int getRequestBeneficiariesState = 1;
            Object component1;
            Object component2;
            int component3;
            Object copydefault;

            component3(Continuation<? super component3> continuation) {
                super(continuation);
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 87;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                this.component2 = obj;
                this.component3 |= Integer.MIN_VALUE;
                Object objClearAndInsertCountries = DefaultImpls.clearAndInsertCountries(null, null, null, this);
                int i4 = getRequestBeneficiariesState + 45;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 89 / 0;
                }
                return objClearAndInsertCountries;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao$DefaultImpls", f = "CountriesDao.kt", i = {0, 0, 0, 1, 1}, l = {46, 52, 53}, m = "insertFullCountryData", n = {"$this", "currencies", "carriers", "$this", "carriersWithId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
        static final class copydefault extends ContinuationImpl {
            private static int equals = 1;
            private static int getRequestBeneficiariesState;
            Object ShareDataUIState;
            Object component1;
            Object component2;
            Object component3;
            int copydefault;

            copydefault(Continuation<? super copydefault> continuation) {
                super(continuation);
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = equals + 97;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Object obj2 = null;
                this.component3 = obj;
                this.copydefault |= Integer.MIN_VALUE;
                Object objInsertFullCountryData = DefaultImpls.insertFullCountryData(null, null, null, null, this);
                if (i3 != 0) {
                    int i4 = 98 / 0;
                }
                int i5 = equals + 63;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInsertFullCountryData;
                }
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object clearAndInsertCountries(com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao r6, java.lang.String r7, java.util.List<? extends kotlin.Triple<com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity, ? extends java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.country.CurrencyEntity>, ? extends java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity>>> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r9 instanceof com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component3
                if (r1 == 0) goto L17
                r1 = r9
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao$DefaultImpls$component3 r1 = (com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component3) r1
                int r2 = r1.component3
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 & r3
                if (r2 == 0) goto L17
                int r9 = r1.component3
                int r9 = r9 + r3
                r1.component3 = r9
                goto L1c
            L17:
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao$DefaultImpls$component3 r1 = new com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao$DefaultImpls$component3
                r1.<init>(r9)
            L1c:
                java.lang.Object r9 = r1.component2
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.component3
                r4 = 1
                if (r3 == 0) goto L67
                if (r3 == r4) goto L5a
                if (r3 != r0) goto L52
                int r6 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component1
                int r6 = r6 + 43
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component3 = r7
                int r6 = r6 % r0
                if (r6 == 0) goto L46
                java.lang.Object r6 = r1.component1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r1.copydefault
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao r7 = (com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao) r7
                kotlin.ResultKt.throwOnFailure(r9)
                r8 = 30
                int r8 = r8 / 0
                goto L80
            L46:
                java.lang.Object r6 = r1.component1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r1.copydefault
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao r7 = (com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao) r7
                kotlin.ResultKt.throwOnFailure(r9)
                goto L80
            L52:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L5a:
                java.lang.Object r6 = r1.component1
                r8 = r6
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r6 = r1.copydefault
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao r6 = (com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao) r6
                kotlin.ResultKt.throwOnFailure(r9)
                goto L77
            L67:
                kotlin.ResultKt.throwOnFailure(r9)
                r1.copydefault = r6
                r1.component1 = r8
                r1.component3 = r4
                java.lang.Object r7 = r6.deleteCountriesByTransaction(r7, r1)
                if (r7 != r2) goto L77
                return r2
            L77:
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r7 = r8.iterator()
                r5 = r7
                r7 = r6
                r6 = r5
            L80:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto Lbd
                int r8 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component3
                int r8 = r8 + 27
                int r9 = r8 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component1 = r9
                int r8 = r8 % r0
                java.lang.Object r8 = r6.next()
                kotlin.Triple r8 = (kotlin.Triple) r8
                java.lang.Object r9 = r8.component1()
                com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity r9 = (com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity) r9
                java.lang.Object r3 = r8.component2()
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r8 = r8.component3()
                java.util.List r8 = (java.util.List) r8
                r1.copydefault = r7
                r1.component1 = r6
                r1.component3 = r0
                java.lang.Object r8 = r7.insertFullCountryData(r9, r3, r8, r1)
                if (r8 != r2) goto L80
                int r6 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component3
                int r6 = r6 + 87
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.component1 = r7
                int r6 = r6 % r0
                return r2
            Lbd:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.clearAndInsertCountries(com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0145 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object insertFullCountryData(com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao r20, com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity r21, java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.country.CurrencyEntity> r22, java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity> r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
            /*
                Method dump skipped, instruction units count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao.DefaultImpls.insertFullCountryData(com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao, com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
}
