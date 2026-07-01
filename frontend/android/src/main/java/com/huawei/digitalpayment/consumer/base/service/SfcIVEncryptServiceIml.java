package com.huawei.digitalpayment.consumer.base.service;

import com.huawei.common.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.base.util.IVEncryptHelper;
import com.huawei.digitalpayment.consumer.baselib.http.DefaultIvInterfaceImpl;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/service/SfcIVEncryptServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/http/DefaultIvInterfaceImpl;", "<init>", "()V", "RANDOM_IV_LEN", "", "getRANDOM_IV_LEN", "()I", "getIv", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcIVEncryptServiceIml extends DefaultIvInterfaceImpl {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final int component1 = 6;

    public final int getRANDOM_IV_LEN() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 41;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.component1;
            int i5 = 38 / 0;
        } else {
            i = this.component1;
        }
        int i6 = i3 + 49;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getIv() {
        int i = 2 % 2;
        String ivLoginEncrypt = IVEncryptHelper.INSTANCE.getIvLoginEncrypt();
        if (ivLoginEncrypt == null) {
            int i2 = copydefault + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ivLoginEncrypt = EncryptUtils.createRandomDynamicIv(this.component1);
            int i4 = copydefault + 19;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
        }
        return ivLoginEncrypt;
    }
}
