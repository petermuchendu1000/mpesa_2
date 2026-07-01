package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0#X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\tR\u0014\u0010,\u001a\u0004\u0018\u00010-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\t¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundle;", "", "icon", "", "getIcon", "()I", GriverCacheDao.COLUMN_CACHE_ID, "", "getId", "()Ljava/lang/String;", "name", "getName", "description", "getDescription", "amount", "", "getAmount", "()Ljava/lang/Float;", "units", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "getUnits", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "validity", "Lcom/safaricom/consumer/commons/util/TextResource;", "getValidity", "()Lcom/safaricom/consumer/commons/util/TextResource;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategory;", "getCategory", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategory;", "bundleType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleType;", "getBundleType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleType;", "paymentTypes", "", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "getPaymentTypes", "()Ljava/util/List;", "recipientTypes", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "getRecipientTypes", "packageId", "getPackageId", "tag", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;", "getTag", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;", "packageCategory", "getPackageCategory", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBundle {
    Float getAmount();

    IBundleType getBundleType();

    IBundleCategory getCategory();

    String getDescription();

    int getIcon();

    String getId();

    String getName();

    String getPackageCategory();

    String getPackageId();

    List<PaymentOption> getPaymentTypes();

    List<IRecipientType> getRecipientTypes();

    BundleTag getTag();

    CounterUnits getUnits();

    TextResource getValidity();
}
