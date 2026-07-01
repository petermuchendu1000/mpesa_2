package com.huawei.digitalpayment.consumer.sfcadjust;

import android.net.Uri;
import com.huawei.common.util.SPUtils;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import com.safaricom.mpesa.logging.L;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011J\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u000b\u001a\u00020\u0011J&\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f0\u00152\u0006\u0010\u000b\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcadjust/AdjustUtils;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "PATH_PREF", "saveLink", "", CdpConstants.CONTENT_URL_MODEL, "invalidateSavedLink", "getSavedLink", "decodePathParams", "", "url", "Landroid/net/Uri;", "decodePath", "uri", "parseQRLink", "Lkotlin/Pair;", "parseLink", "ConsumerSfcAdjust_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdjustUtils {
    public static final AdjustUtils INSTANCE = new AdjustUtils();
    public static final String PATH_PREF = "SAVED_LINK";
    private static final String ShareDataUIState;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private AdjustUtils() {
    }

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(AdjustUtils.class).getSimpleName();
        if (simpleName == null) {
            int i = component2 + 45;
            component3 = i % 128;
            if (i % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i2 = 2 % 2;
            simpleName = "";
        }
        ShareDataUIState = simpleName;
        int i3 = component3 + 27;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
    }

    public final String getTAG() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = ShareDataUIState;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void saveLink(String link) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(link, "");
            SPUtils.getInstance().put(PATH_PREF, link);
        } else {
            Intrinsics.checkNotNullParameter(link, "");
            SPUtils.getInstance().put(PATH_PREF, link);
            int i3 = 74 / 0;
        }
    }

    public final void invalidateSavedLink() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance().put(PATH_PREF, "");
        int i4 = component1 + 121;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSavedLink() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString(PATH_PREF, "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = copydefault + 99;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final Map<String, String> decodePathParams(Uri url) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(url, "");
        HashMap map = new HashMap();
        Set<String> queryParameterNames = url.getQueryParameterNames();
        Intrinsics.checkNotNull(queryParameterNames);
        for (String str : queryParameterNames) {
            int i2 = copydefault + 109;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str2 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            String queryParameter = url.getQueryParameter(str);
            if (queryParameter == null) {
                int i4 = copydefault + 121;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                queryParameter = "";
            }
            map.put(str2, queryParameter);
        }
        Map<String, String> map2 = MapsKt.toMap(map);
        int i6 = copydefault + 125;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return map2;
    }

    public final String decodePath(Uri uri) {
        Object obj;
        String str;
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        uri.getQuery();
        Intrinsics.checkNotNull(queryParameterNames);
        Iterator<T> it = queryParameterNames.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            if (StringsKt.equals((String) next, "adj_label", true)) {
                obj = next;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            int i4 = copydefault + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = str2;
        }
        String queryParameter = uri.getQueryParameter(str);
        L l = L.INSTANCE;
        String str3 = ShareDataUIState;
        l.d(str3, "Query " + str2, new Object[0]);
        L.INSTANCE.d(str3, "Param " + queryParameter, new Object[0]);
        return queryParameter == null ? "" : queryParameter;
    }

    public final Pair<String, String> parseQRLink(Uri link) {
        String str;
        int i = 2 % 2;
        str = "";
        Intrinsics.checkNotNullParameter(link, "");
        String str2 = link.getHost() + link.getPath();
        Uri uri = Uri.parse(decodePath(link));
        String host = uri.getHost();
        if (host != null) {
            int i2 = copydefault + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (host.length() != 0) {
                String host2 = uri.getHost();
                return new Pair<>(str2, host2 != null ? host2 : "");
            }
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (string.length() > 9) {
            int i4 = component1 + 85;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            String strSubstring = string.substring(9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            str = strSubstring;
        }
        return new Pair<>(str2, str);
    }

    public final Pair<String, Map<String, String>> parseLink(Uri link) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(link, "");
        Pair<String, Map<String, String>> pair = new Pair<>(link.getHost() + link.getPath(), decodePathParams(link));
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return pair;
    }
}
