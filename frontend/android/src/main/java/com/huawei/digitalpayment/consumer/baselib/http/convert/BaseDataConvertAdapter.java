package com.huawei.digitalpayment.consumer.baselib.http.convert;

import com.google.gson.JsonObject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/http/convert/BaseDataConvertAdapter;", "", "transfer", "original", "Lcom/google/gson/JsonObject;", "path", "", "redirectPath", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BaseDataConvertAdapter {
    String path();

    String redirectPath();

    Object transfer(JsonObject original);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component2 = 0;
        private static int copydefault = 1;

        public static String redirectPath(BaseDataConvertAdapter baseDataConvertAdapter) {
            int i = 2 % 2;
            int i2 = component2 + 103;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            String strPath = baseDataConvertAdapter.path();
            int i4 = component2 + 47;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return strPath;
        }
    }
}
