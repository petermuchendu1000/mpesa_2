package com.huawei.digitalpayment.consumer.baselib.router;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/router/RouterRedirectManager;", "", "<init>", "()V", "redirectPaths", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "addRedirectPath", "", "path", "redirect", "getRedirectPath", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RouterRedirectManager {
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final RouterRedirectManager INSTANCE = new RouterRedirectManager();
    private static final HashMap<String, String> component1 = new HashMap<>();

    private RouterRedirectManager() {
    }

    static {
        int i = component3 + 59;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @JvmStatic
    public static final void addRedirectPath(String path, String redirect) {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str2 = path;
        if (str2 != null) {
            int i5 = i3 + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            if (StringsKt.isBlank(str2) || (str = redirect) == null || StringsKt.isBlank(str)) {
                return;
            }
            component1.put(path, redirect);
        }
    }

    @JvmStatic
    public static final String getRedirectPath(String path) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = path;
        if (str == null) {
            return "";
        }
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return StringsKt.isBlank(str) ? "" : component1.get(path);
        }
        StringsKt.isBlank(str);
        throw null;
    }
}
