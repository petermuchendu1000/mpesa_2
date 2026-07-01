package com.huawei.digitalpayment.consumer.service;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/ICardsService;", "", "getUserInfoFragment", "Landroidx/fragment/app/Fragment;", "component", "", "getFunctionsFragment", "getBankCardsFragment", "getVirtualCardsFragment", "getTransactionFragment", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ICardsService {
    Fragment getBankCardsFragment(String component);

    Fragment getFunctionsFragment(String component);

    Fragment getTransactionFragment(String component);

    Fragment getUserInfoFragment(String component);

    Fragment getVirtualCardsFragment(String component);
}
