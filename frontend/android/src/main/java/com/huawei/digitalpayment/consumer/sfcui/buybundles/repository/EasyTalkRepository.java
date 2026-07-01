package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYProductCatalogResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaValidatedData;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H¦@¢\u0006\u0002\u0010\u0007J:\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000fJ@\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u0014JV\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/EasyTalkRepository;", "", "getDiyCatalog", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYProductCatalogResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseViaAirtime", "sponsorMsisdn", "", "beneficiaryMsisdn", "diyBundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "cellId", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateMpesa", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidatedData;", "tariff", "offerName", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeMpesaPurchase", "securityCredential", "validatedData", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidatedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EasyTalkRepository {
    Object completeMpesaPurchase(String str, String str2, DIYBundle dIYBundle, String str3, String str4, String str5, EasyTalkMpesaValidatedData easyTalkMpesaValidatedData, Continuation<? super Resource<HaProxyResponse<Object>>> continuation);

    Object getDiyCatalog(Continuation<? super Resource<HaProxyResponse<List<DIYProductCatalogResponse>>>> continuation);

    Object purchaseViaAirtime(String str, String str2, DIYBundle dIYBundle, String str3, Continuation<? super Resource<HaProxyResponse<Object>>> continuation);

    Object validateMpesa(String str, String str2, DIYBundle dIYBundle, String str3, String str4, Continuation<? super Resource<EasyTalkMpesaValidatedData>> continuation);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int component1;

        public static Object validateMpesa$default(EasyTalkRepository easyTalkRepository, String str, String str2, DIYBundle dIYBundle, String str3, String str4, Continuation continuation, int i, Object obj) {
            String str5;
            String str6;
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateMpesa");
            }
            if ((i & 8) != 0) {
                int i3 = ShareDataUIState + 125;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                str5 = "";
            } else {
                str5 = str3;
            }
            if ((i & 16) != 0) {
                int i5 = ShareDataUIState + 15;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                str6 = "";
            } else {
                str6 = str4;
            }
            return easyTalkRepository.validateMpesa(str, str2, dIYBundle, str5, str6, continuation);
        }

        public static Object completeMpesaPurchase$default(EasyTalkRepository easyTalkRepository, String str, String str2, DIYBundle dIYBundle, String str3, String str4, String str5, EasyTalkMpesaValidatedData easyTalkMpesaValidatedData, Continuation continuation, int i, Object obj) {
            String str6;
            int i2 = 2 % 2;
            int i3 = component1 + 47;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeMpesaPurchase");
            }
            int i6 = i4 + 85;
            int i7 = i6 % 128;
            component1 = i7;
            if (i6 % 2 == 0 ? (i & 16) == 0 : (i & 126) == 0) {
                str6 = str4;
            } else {
                int i8 = i7 + 89;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 55;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
                str6 = "";
            }
            return easyTalkRepository.completeMpesaPurchase(str, str2, dIYBundle, str3, str6, (i & 32) != 0 ? "" : str5, easyTalkMpesaValidatedData, continuation);
        }
    }
}
