package com.huawei.digitalpayment.consumer.sfc.mpesaglobal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/IFragmentBackPressHandler;", "", "onFragmentBackPressed", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IFragmentBackPressHandler {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component2 = 1;
        private static int component3;

        public static boolean onFragmentBackPressed(IFragmentBackPressHandler iFragmentBackPressHandler) {
            int i = 2 % 2;
            int i2 = component3 + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
    }

    boolean onFragmentBackPressed();
}
