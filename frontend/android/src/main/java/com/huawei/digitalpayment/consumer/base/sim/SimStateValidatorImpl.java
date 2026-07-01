package com.huawei.digitalpayment.consumer.base.sim;

import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import com.huawei.digitalpayment.consumer.base.repository.ConfigurationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SimStateValidatorImpl;", "Lcom/huawei/digitalpayment/consumer/base/sim/SimStateValidator;", "configurationRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/ConfigurationRepository;", "phoneNetworkInformationProvider", "Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/repository/ConfigurationRepository;Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;)V", "validate", "", "mcc", "", "mnc", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SimStateValidatorImpl implements SimStateValidator {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final PhoneNetworkInformationProvider component2;
    private final ConfigurationRepository component3;

    public SimStateValidatorImpl(ConfigurationRepository configurationRepository, PhoneNetworkInformationProvider phoneNetworkInformationProvider) {
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        Intrinsics.checkNotNullParameter(phoneNetworkInformationProvider, "");
        this.component3 = configurationRepository;
        this.component2 = phoneNetworkInformationProvider;
    }

    @Override
    public String validate(int mcc, int mnc) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!this.component2.hasSimCard()) {
            return "MISSING_SIM_CARD";
        }
        if (mcc != this.component3.getMobileCountryCode()) {
            return "OTHER_COUNTRY_NETWORK_CARD";
        }
        if (mnc == this.component3.getMobileNetworkCode()) {
            return "VALID_SIM_CARD";
        }
        int i4 = copydefault + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return "LOCAL_COUNTRY_NETWORK_CARD";
    }
}
