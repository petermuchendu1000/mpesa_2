package com.huawei.digitalpayment.consumer.base.framework;

import android.telephony.PhoneStateListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;", "", "isDeviceHoldingMultipleSimCards", "", "getCurrentSIMOperator", "", "hasSimCard", "getSimIccid", "getSimImsi", "registerPhoneStateListener", "", "phoneStateListener", "Landroid/telephony/PhoneStateListener;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PhoneNetworkInformationProvider {
    String getCurrentSIMOperator();

    String getSimIccid();

    String getSimImsi();

    boolean hasSimCard();

    boolean isDeviceHoldingMultipleSimCards();

    void registerPhoneStateListener(PhoneStateListener phoneStateListener);
}
