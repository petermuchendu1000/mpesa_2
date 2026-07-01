package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"toEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/TunukiwaBundleEntity;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaBundleResp;", "toBundleResp", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaBundlesRepositoryKt {
    private static int component1 = 0;
    private static int component2 = 1;

    public static final TunukiwaBundleResp access$toBundleResp(TunukiwaBundleEntity tunukiwaBundleEntity) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return component1(tunukiwaBundleEntity);
        }
        component1(tunukiwaBundleEntity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final TunukiwaBundleEntity access$toEntity(TunukiwaBundleResp tunukiwaBundleResp) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TunukiwaBundleEntity tunukiwaBundleEntityComponent1 = component1(tunukiwaBundleResp);
        int i4 = component1 + 117;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return tunukiwaBundleEntityComponent1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TunukiwaBundleEntity component1(TunukiwaBundleResp tunukiwaBundleResp) {
        String str;
        String str2;
        int i;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int iIntValue;
        int i2 = 2 % 2;
        String offerPriority = tunukiwaBundleResp.getOfferPriority();
        String str3 = offerPriority == null ? "" : offerPriority;
        String offerID = tunukiwaBundleResp.getOfferID();
        if (offerID == null) {
            int i3 = component1;
            int i4 = i3 + 9;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 15;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = "";
        } else {
            str = offerID;
        }
        String appText = tunukiwaBundleResp.getAppText();
        String str4 = appText == null ? "" : appText;
        String offerPrice = tunukiwaBundleResp.getOfferPrice();
        Object obj = null;
        if (offerPrice == null) {
            int i8 = component2 + 17;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "";
        } else {
            str2 = offerPrice;
        }
        String offerType = tunukiwaBundleResp.getOfferType();
        String str5 = offerType == null ? "" : offerType;
        String offerName = tunukiwaBundleResp.getOfferName();
        String str6 = offerName == null ? "" : offerName;
        String paymentMethod = tunukiwaBundleResp.getPaymentMethod();
        String str7 = paymentMethod == null ? "" : paymentMethod;
        String ussdText = tunukiwaBundleResp.getUssdText();
        String str8 = ussdText == null ? "" : ussdText;
        Integer offerJourney = tunukiwaBundleResp.getOfferJourney();
        if (offerJourney != null) {
            int i9 = component1 + 91;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                iIntValue = offerJourney.intValue();
                int i10 = 76 / 0;
            } else {
                iIntValue = offerJourney.intValue();
            }
            i = iIntValue;
        } else {
            i = 0;
        }
        String offerSegment = tunukiwaBundleResp.getOfferSegment();
        Boolean defaultOffer = tunukiwaBundleResp.getDefaultOffer();
        if (defaultOffer != null) {
            int i11 = component2 + 93;
            component1 = i11 % 128;
            if (i11 % 2 != 0) {
                defaultOffer.booleanValue();
                obj.hashCode();
                throw null;
            }
            zBooleanValue = defaultOffer.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean globalOffer = tunukiwaBundleResp.getGlobalOffer();
        if (globalOffer != null) {
            zBooleanValue2 = globalOffer.booleanValue();
        } else {
            int i12 = component2 + 55;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            zBooleanValue2 = false;
        }
        return new TunukiwaBundleEntity(str3, str, str4, str2, str5, str6, str7, str8, i, offerSegment, zBooleanValue, zBooleanValue2);
    }

    private static final TunukiwaBundleResp component1(TunukiwaBundleEntity tunukiwaBundleEntity) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            tunukiwaBundleEntity.getOfferPriority().length();
            throw null;
        }
        String offerPriority = tunukiwaBundleEntity.getOfferPriority();
        if (offerPriority.length() == 0) {
            int i3 = component1 + 97;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 75 / 0;
            }
            offerPriority = null;
        }
        String str2 = offerPriority;
        String offerId = tunukiwaBundleEntity.getOfferId();
        if (offerId.length() == 0) {
            offerId = null;
        }
        String str3 = offerId;
        String appText = tunukiwaBundleEntity.getAppText();
        if (appText.length() == 0) {
            appText = null;
        }
        String str4 = appText;
        String offerPrice = tunukiwaBundleEntity.getOfferPrice();
        if (offerPrice.length() == 0) {
            offerPrice = null;
        }
        String str5 = offerPrice;
        String offerType = tunukiwaBundleEntity.getOfferType();
        if (offerType.length() == 0) {
            offerType = null;
        }
        String str6 = offerType;
        String offerName = tunukiwaBundleEntity.getOfferName();
        if (offerName.length() == 0) {
            int i5 = component1 + 67;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            offerName = null;
        }
        String str7 = offerName;
        String paymentMethod = tunukiwaBundleEntity.getPaymentMethod();
        if (paymentMethod.length() == 0) {
            int i7 = component2 + 103;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            paymentMethod = null;
        }
        String str8 = paymentMethod;
        String ussdText = tunukiwaBundleEntity.getUssdText();
        if (ussdText.length() == 0) {
            int i8 = component1 + 5;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str = ussdText;
        }
        return new TunukiwaBundleResp(str3, str2, str6, str7, str5, str8, str4, str, Integer.valueOf(tunukiwaBundleEntity.getOfferJourney()), tunukiwaBundleEntity.getOfferSegment(), Boolean.valueOf(tunukiwaBundleEntity.getDefaultOffer()), Boolean.valueOf(tunukiwaBundleEntity.getGlobalOffer()));
    }
}
