package com.huawei.digitalpayment.consumer.base.framework;

import android.net.ConnectivityManager;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/framework/NetworkInformationProvider;", "", "isNetworkConnected", "", "getNetworkConnectionInfo", "Lkotlin/Pair;", "", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NetworkInformationProvider {
    ConnectivityManager getConnectivityManager();

    Pair<String, String> getNetworkConnectionInfo();

    boolean isNetworkConnected();
}
