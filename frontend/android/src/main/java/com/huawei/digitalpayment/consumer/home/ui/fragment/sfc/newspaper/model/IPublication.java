package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import com.huawei.digitalpayment.consumer.constants.Keys;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;", "", "productName", "", "getProductName", "()Ljava/lang/String;", Keys.KEY_HEADER_URL, "getAvatarUrl", "productPackage", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/ProductPackage;", "getProductPackage", "()Ljava/util/List;", "lifeSpan", "", "getLifeSpan", "()I", "latestRelease", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/LatestRelease;", "getLatestRelease", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPublication {
    String getAvatarUrl();

    List<LatestRelease> getLatestRelease();

    int getLifeSpan();

    String getProductName();

    List<ProductPackage> getProductPackage();
}
