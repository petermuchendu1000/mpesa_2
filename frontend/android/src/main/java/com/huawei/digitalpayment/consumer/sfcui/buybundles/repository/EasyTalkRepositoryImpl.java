package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYProductCatalogResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkAirtimePurchaseRequest;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaPurchaseRequest;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaValidatedData;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkTariff;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0096@¢\u0006\u0002\u0010\u000bJ:\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0014J<\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0019JR\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/EasyTalkRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/EasyTalkRepository;", "service", "Lcom/huawei/digitalpayment/consumer/sfcui/api/EasyTalkService;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/EasyTalkService;)V", "getDiyCatalog", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYProductCatalogResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseViaAirtime", "", "sponsorMsisdn", "", "beneficiaryMsisdn", "diyBundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "cellId", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateMpesa", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidatedData;", "tariff", "offerName", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeMpesaPurchase", "securityCredential", "validatedData", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidatedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildGsmResources", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkGsmResource;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkRepositoryImpl implements EasyTalkRepository {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final EasyTalkService component1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.EasyTalkRepositoryImpl", f = "EasyTalkRepository.kt", i = {}, l = {83}, m = "validateMpesa", n = {}, s = {})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;
        Object copydefault;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 63;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object objValidateMpesa = EasyTalkRepositoryImpl.this.validateMpesa(null, null, null, null, null, this);
            int i4 = component1 + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objValidateMpesa;
        }
    }

    @Inject
    public EasyTalkRepositoryImpl(EasyTalkService easyTalkService) {
        Intrinsics.checkNotNullParameter(easyTalkService, "");
        this.component1 = easyTalkService;
    }

    @Override
    public Object getDiyCatalog(Continuation<? super Resource<HaProxyResponse<List<DIYProductCatalogResponse>>>> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object diyCatalog = this.component1.getDiyCatalog(continuation);
        int i4 = component3 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return diyCatalog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Object purchaseViaAirtime(String str, String str2, DIYBundle dIYBundle, String str3, Continuation<? super Resource<HaProxyResponse<Object>>> continuation) {
        int i = 2 % 2;
        EasyTalkService easyTalkService = this.component1;
        String productId = dIYBundle.getProductId();
        int productAmount = dIYBundle.getProductAmount();
        Object objAirtimePurchase = easyTalkService.airtimePurchase(new EasyTalkAirtimePurchaseRequest(str, str2, productId, String.valueOf(productAmount), str3, dIYBundle.getProductName(), component1(dIYBundle)), continuation);
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return objAirtimePurchase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object validateMpesa(java.lang.String r16, java.lang.String r17, com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle r18, java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation<? super com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaValidatedData>> r21) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.EasyTalkRepositoryImpl.validateMpesa(java.lang.String, java.lang.String, com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public Object completeMpesaPurchase(String str, String str2, DIYBundle dIYBundle, String str3, String str4, String str5, EasyTalkMpesaValidatedData easyTalkMpesaValidatedData, Continuation<? super Resource<HaProxyResponse<Object>>> continuation) {
        double dDoubleValue;
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String productName = str5;
        if (StringsKt.isBlank(productName)) {
            int i4 = ShareDataUIState + 93;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            productName = dIYBundle.getProductName();
        }
        String str6 = productName;
        EasyTalkTariff easyTalkTariffFromRaw = EasyTalkTariff.INSTANCE.fromRaw(str4);
        Double doubleOrNull = StringsKt.toDoubleOrNull(easyTalkMpesaValidatedData.getUseODAmount());
        if (doubleOrNull != null) {
            int i6 = component3 + 79;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            dDoubleValue = doubleOrNull.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        return this.component1.mpesaPurchase(new EasyTalkMpesaPurchaseRequest(str, str2, dIYBundle.getProductId(), String.valueOf(dIYBundle.getProductAmount()), easyTalkMpesaValidatedData.getOkoaAmount(), easyTalkMpesaValidatedData.getChannelSessionId(), dDoubleValue > 0.0d ? "1" : "0", easyTalkMpesaValidatedData.getUseODAmount(), str3, easyTalkTariffFromRaw.getRaw(), str6, "", dIYBundle.getProductOfferId(), component1(dIYBundle)), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource> component1(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.EasyTalkRepositoryImpl.component1(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle):java.util.List");
    }

    static {
        int i = 1 + 75;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }
}
