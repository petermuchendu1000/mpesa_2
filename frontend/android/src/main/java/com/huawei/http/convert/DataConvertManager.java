package com.huawei.http.convert;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0007R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/http/convert/DataConvertManager;", "", "<init>", "()V", "convertAdapters", "Ljava/util/HashMap;", "", "Lcom/huawei/http/convert/BaseDataConvertAdapter;", "Lkotlin/collections/HashMap;", "addConvertAdapter", "", "convertAdapter", "getConvertAdapter", "apiPath", "HttpLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataConvertManager {
    public static final DataConvertManager INSTANCE = new DataConvertManager();
    private static final HashMap<String, BaseDataConvertAdapter> copydefault = new HashMap<>();

    private DataConvertManager() {
    }

    @JvmStatic
    public static final void addConvertAdapter(BaseDataConvertAdapter convertAdapter) {
        Intrinsics.checkNotNullParameter(convertAdapter, "");
        if (convertAdapter.path().length() > 0) {
            copydefault.put(convertAdapter.path(), convertAdapter);
        }
    }

    @JvmStatic
    public static final BaseDataConvertAdapter getConvertAdapter(String apiPath) {
        Intrinsics.checkNotNullParameter(apiPath, "");
        return copydefault.get(apiPath);
    }
}
