package com.huawei.http.convert;

import com.google.gson.JsonObject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/http/convert/BaseDataConvertAdapter;", "", "transfer", "original", "Lcom/google/gson/JsonObject;", "path", "", "redirectPath", "HttpLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BaseDataConvertAdapter {
    String path();

    String redirectPath();

    Object transfer(JsonObject original);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String redirectPath(BaseDataConvertAdapter baseDataConvertAdapter) {
            return baseDataConvertAdapter.path();
        }
    }
}
