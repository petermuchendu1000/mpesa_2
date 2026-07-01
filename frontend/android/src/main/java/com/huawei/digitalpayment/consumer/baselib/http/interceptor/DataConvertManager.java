package com.huawei.digitalpayment.consumer.baselib.http.interceptor;

import com.huawei.digitalpayment.consumer.baselib.http.convert.BaseDataConvertAdapter;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0007R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/http/interceptor/DataConvertManager;", "", "<init>", "()V", "convertAdapters", "Ljava/util/HashMap;", "", "Lcom/huawei/digitalpayment/consumer/baselib/http/convert/BaseDataConvertAdapter;", "Lkotlin/collections/HashMap;", "addConvertAdapter", "", "convertAdapter", "getConvertAdapter", "apiPath", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataConvertManager {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    public static final DataConvertManager INSTANCE = new DataConvertManager();
    private static final HashMap<String, BaseDataConvertAdapter> component3 = new HashMap<>();

    private DataConvertManager() {
    }

    static {
        int i = component2 + 121;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void addConvertAdapter(BaseDataConvertAdapter convertAdapter) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(convertAdapter, "");
        if (convertAdapter.path().length() > 0) {
            int i4 = copydefault + 5;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            component3.put(convertAdapter.path(), convertAdapter);
        }
        int i6 = component1 + 37;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
    }

    @JvmStatic
    public static final BaseDataConvertAdapter getConvertAdapter(String apiPath) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(apiPath, "");
        BaseDataConvertAdapter baseDataConvertAdapter = component3.get(apiPath);
        int i4 = copydefault + 97;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseDataConvertAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
