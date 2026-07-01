package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.OneOffOffering;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0001¨\u0006\u0005"}, d2 = {"toProduct", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;", "toProductsList", "", "ConsumerSfcFixedData_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FixedDataViewModelKt {
    private static int component1 = 0;
    private static int component3 = 1;

    public static final Product toProduct(OneOffOffering oneOffOffering) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(oneOffOffering, "");
        Product product = new Product(oneOffOffering.getServiceCode(), oneOffOffering.getOfferInfo(), oneOffOffering.getParentOfferingId(), oneOffOffering.getOfferingId(), oneOffOffering.getOfferingCode(), null, oneOffOffering.getPurchaseSeq(), oneOffOffering.getRentCycleId(), oneOffOffering.getRentalVal(), oneOffOffering.getBundleFlag(), oneOffOffering.getBeneficiaryMsisdn(), oneOffOffering.getDiscountValue(), oneOffOffering.getDiscountExpiry(), oneOffOffering.getStatus(), oneOffOffering.getStatusDetail(), oneOffOffering.getAdditionalInfo(), oneOffOffering.getCategory(), null, null, null, null, oneOffOffering.getOneOffOffering());
        int i2 = component1 + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return product;
    }

    public static final List<Product> toProductsList(Product product) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(product, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(product);
        int i2 = component1 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        for (OneOffOffering oneOffOffering = product.getOneOffOffering(); oneOffOffering != null; oneOffOffering = oneOffOffering.getOneOffOffering()) {
            int i4 = component3 + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(toProduct(oneOffOffering));
        }
        return arrayList;
    }
}
