package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.alibaba.ariver.kernel.RVParams;
import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0002¨\u0006\u0006"}, d2 = {"toEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/OfferBundleEntity;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", RVParams.SESSION_ID, "", "toBundle", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OfferBundlesRepositoryKt {
    private static int component2 = 0;
    private static int component3 = 1;

    public static final OfferBundle access$toBundle(OfferBundleEntity offerBundleEntity) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        OfferBundle offerBundleComponent3 = component3(offerBundleEntity);
        int i4 = component2 + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return offerBundleComponent3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final OfferBundleEntity access$toEntity(OfferBundle offerBundle, String str) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            component3(offerBundle, str);
            throw null;
        }
        OfferBundleEntity offerBundleEntityComponent3 = component3(offerBundle, str);
        int i3 = component2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return offerBundleEntityComponent3;
    }

    private static final OfferBundleEntity component3(OfferBundle offerBundle, String str) {
        int i = 2 % 2;
        OfferBundleEntity offerBundleEntity = new OfferBundleEntity((int) offerBundle.getOfferId(), offerBundle.getRecordNumber(), offerBundle.getOfferName(), offerBundle.getOfferType(), offerBundle.getOfferPrice(), offerBundle.getBongaPrice(), offerBundle.getUssdName(), offerBundle.getTunukiwaRate(), offerBundle.getNeoRateId(), offerBundle.getRateMultiplier(), offerBundle.getTunukiwaLocationOffer(), offerBundle.getTunukiwaSalutation(), offerBundle.getFlashMessage(), offerBundle.getAutoRenewable(), offerBundle.getAppOfferName(), str);
        int i2 = component3 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return offerBundleEntity;
    }

    private static final OfferBundle component3(OfferBundleEntity offerBundleEntity) {
        int i = 2 % 2;
        long offerId = offerBundleEntity.getOfferId();
        int recordNumber = offerBundleEntity.getRecordNumber();
        String offerName = offerBundleEntity.getOfferName();
        int offerType = offerBundleEntity.getOfferType();
        int offerPrice = offerBundleEntity.getOfferPrice();
        int bongaPrice = offerBundleEntity.getBongaPrice();
        String ussdName = offerBundleEntity.getUssdName();
        double tunukiwaRate = offerBundleEntity.getTunukiwaRate();
        double neoRateId = offerBundleEntity.getNeoRateId();
        double rateMultiplier = offerBundleEntity.getRateMultiplier();
        String tunukiwaLocationOffer = offerBundleEntity.getTunukiwaLocationOffer();
        String tunukiwaSalutation = offerBundleEntity.getTunukiwaSalutation();
        OfferBundle offerBundle = new OfferBundle(offerBundleEntity.getAppOfferName(), offerBundleEntity.getAutoRenewable(), bongaPrice, offerBundleEntity.getFlashMsg(), neoRateId, offerId, offerName, offerPrice, offerType, rateMultiplier, recordNumber, tunukiwaLocationOffer, tunukiwaRate, tunukiwaSalutation, ussdName, offerBundleEntity.getSessionId());
        int i2 = component2 + 15;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return offerBundle;
    }
}
