package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductTypeEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoSubOfferingEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProduct;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProductResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallSubOfferings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001a\u0010\n\u001a\u00020\u0006*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\r*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\f\u0010\u0003\u001a\u00020\f*\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"toEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "toDataCallProduct", "subOfferings", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallSubOfferings;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;", "parentProductCategory", "", "toDataCallSubOffering", "productType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProduct;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductTypeEntity;", "parentSubOfferingId", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NeoBundlesRepositoryKt {
    private static int ShareDataUIState = 1;
    private static int component1;

    public static final DataCallProduct access$toDataCallProduct(NeoProductTypeEntity neoProductTypeEntity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return ShareDataUIState(neoProductTypeEntity);
        }
        ShareDataUIState(neoProductTypeEntity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final DataCallProductResponse access$toDataCallProduct(NeoProductEntity neoProductEntity, List list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            copydefault(neoProductEntity, (List<DataCallSubOfferings>) list);
            obj.hashCode();
            throw null;
        }
        DataCallProductResponse dataCallProductResponseCopydefault = copydefault(neoProductEntity, (List<DataCallSubOfferings>) list);
        int i3 = component1 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return dataCallProductResponseCopydefault;
        }
        throw null;
    }

    public static final DataCallSubOfferings access$toDataCallSubOffering(NeoSubOfferingEntity neoSubOfferingEntity, List list) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataCallSubOfferings dataCallSubOfferingsCopydefault = copydefault(neoSubOfferingEntity, (List<DataCallProduct>) list);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return dataCallSubOfferingsCopydefault;
    }

    public static final NeoProductEntity access$toEntity(DataCallProductResponse dataCallProductResponse) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NeoProductEntity neoProductEntityComponent1 = component1(dataCallProductResponse);
        int i4 = component1 + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return neoProductEntityComponent1;
    }

    public static final NeoProductTypeEntity access$toEntity(DataCallProduct dataCallProduct, long j) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NeoProductTypeEntity neoProductTypeEntityComponent3 = component3(dataCallProduct, j);
        int i4 = ShareDataUIState + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return neoProductTypeEntityComponent3;
    }

    public static final NeoSubOfferingEntity access$toEntity(DataCallSubOfferings dataCallSubOfferings, String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NeoSubOfferingEntity neoSubOfferingEntityComponent2 = component2(dataCallSubOfferings, str);
        int i4 = component1 + 59;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return neoSubOfferingEntityComponent2;
    }

    private static final NeoProductEntity component1(DataCallProductResponse dataCallProductResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            dataCallProductResponse.getProductId();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String productId = dataCallProductResponse.getProductId();
        if (productId == null) {
            int i3 = ShareDataUIState + 3;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 20 / 0;
            }
            str = "";
        } else {
            str = productId;
        }
        String productCategory = dataCallProductResponse.getProductCategory();
        Intrinsics.checkNotNull(productCategory);
        String rentalFee = dataCallProductResponse.getRentalFee();
        if (rentalFee == null) {
            int i5 = component1 + 71;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            str2 = "";
        } else {
            str2 = rentalFee;
        }
        String productDescription = dataCallProductResponse.getProductDescription();
        if (productDescription == null) {
            int i7 = ShareDataUIState + 35;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 28 / 0;
            }
            str3 = "";
        } else {
            str3 = productDescription;
        }
        String productUnits = dataCallProductResponse.getProductUnits();
        if (productUnits == null) {
            int i9 = ShareDataUIState + 11;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            str4 = "";
        } else {
            str4 = productUnits;
        }
        return new NeoProductEntity(productCategory, str, str2, str3, str4);
    }

    private static final DataCallProductResponse copydefault(NeoProductEntity neoProductEntity, List<DataCallSubOfferings> list) {
        int i = 2 % 2;
        DataCallProductResponse dataCallProductResponse = new DataCallProductResponse(neoProductEntity.getProductCategory(), neoProductEntity.getRentalFee(), list, neoProductEntity.getProductDescription(), neoProductEntity.getProductUnits(), neoProductEntity.getProductId());
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return dataCallProductResponse;
    }

    private static final NeoSubOfferingEntity component2(DataCallSubOfferings dataCallSubOfferings, String str) {
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        String productRange = dataCallSubOfferings.getProductRange();
        Object obj = null;
        if (productRange == null) {
            int i2 = ShareDataUIState + 27;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "";
        } else {
            str2 = productRange;
        }
        String rentalFee = dataCallSubOfferings.getRentalFee();
        if (rentalFee == null) {
            int i3 = ShareDataUIState + 93;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str3 = "";
        } else {
            str3 = rentalFee;
        }
        String productRangeMin = dataCallSubOfferings.getProductRangeMin();
        if (productRangeMin == null) {
            int i4 = component1 + 73;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str4 = "";
        } else {
            str4 = productRangeMin;
        }
        NeoSubOfferingEntity neoSubOfferingEntity = new NeoSubOfferingEntity(0L, str, str2, str3, str4, dataCallSubOfferings.getProductRangeMax(), 1, null);
        int i6 = component1 + 55;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return neoSubOfferingEntity;
    }

    private static final DataCallSubOfferings copydefault(NeoSubOfferingEntity neoSubOfferingEntity, List<DataCallProduct> list) {
        int i = 2 % 2;
        DataCallSubOfferings dataCallSubOfferings = new DataCallSubOfferings(neoSubOfferingEntity.getProductRange(), neoSubOfferingEntity.getRentalFee(), list, neoSubOfferingEntity.getProductRangeMin(), neoSubOfferingEntity.getProductRangeMax());
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return dataCallSubOfferings;
    }

    private static final NeoProductTypeEntity component3(DataCallProduct dataCallProduct, long j) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String productId = dataCallProduct.getProductId();
        Intrinsics.checkNotNull(productId);
        String productTypes = dataCallProduct.getProductTypes();
        if (productTypes == null) {
            int i4 = ShareDataUIState + 45;
            int i5 = i4 % 128;
            component1 = i5;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            productTypes = "";
            int i6 = i5 + 67;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = productTypes;
        Boolean autoRenew = dataCallProduct.getAutoRenew();
        return new NeoProductTypeEntity(productId, j, str, autoRenew != null ? autoRenew.booleanValue() : false);
    }

    private static final DataCallProduct ShareDataUIState(NeoProductTypeEntity neoProductTypeEntity) {
        int i = 2 % 2;
        DataCallProduct dataCallProduct = new DataCallProduct(neoProductTypeEntity.getProductId(), neoProductTypeEntity.getProductTypes(), Boolean.valueOf(neoProductTypeEntity.getAutoRenew()));
        int i2 = component1 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return dataCallProduct;
    }
}
