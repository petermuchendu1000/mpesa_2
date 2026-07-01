package com.huawei.digitalpayment.consumer.nfc.utils;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.BooleanUtils;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fJ*\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/utils/NfcOpenApp;", "", "<init>", "()V", "parseUri", "", "uri", "Landroid/net/Uri;", "activity", "Landroidx/fragment/app/FragmentActivity;", "openApp", "query", "", "", KeysConstants.KEY_EXECUTE, "isRouteValid", "", "route", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcOpenApp {
    public static final NfcOpenApp INSTANCE = new NfcOpenApp();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private NfcOpenApp() {
    }

    public final void parseUri(Uri uri, FragmentActivity activity) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (uri != null) {
            int i4 = copydefault + 95;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                HashMap<String, String> querys = UriUtils.parseQuerys(uri);
                Intrinsics.checkNotNullExpressionValue(querys, "");
                INSTANCE.openApp(activity, querys);
                return;
            }
            HashMap<String, String> querys2 = UriUtils.parseQuerys(uri);
            Intrinsics.checkNotNullExpressionValue(querys2, "");
            INSTANCE.openApp(activity, querys2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void openApp(FragmentActivity activity, Map<String, String> query) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(query, "");
            component1(Uri.decode(query.get("route")));
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(query, "");
        String strDecode = Uri.decode(query.get("route"));
        if (component1(strDecode)) {
            query.put(com.huawei.digitalpayment.consumer.base.constants.KeysConstants.KEY_IS_FROM_NFC, BooleanUtils.TRUE);
            RouteUtils.routeWithExecute(activity, strDecode, query);
            int i3 = ShareDataUIState + 113;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public final void openApp(FragmentActivity activity, String execute, Map<String, String> query) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(execute, "");
            Intrinsics.checkNotNullParameter(query, "");
            component1(execute);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(execute, "");
        Intrinsics.checkNotNullParameter(query, "");
        if (component1(execute)) {
            query.put(com.huawei.digitalpayment.consumer.base.constants.KeysConstants.KEY_IS_FROM_NFC, BooleanUtils.TRUE);
            RouteUtils.routeWithExecute(activity, execute, query);
            int i3 = copydefault + 87;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r8, "https://", false, 2, (java.lang.Object) null) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean component1(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.ShareDataUIState
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L92
            r4 = r2
            goto L1d
        L17:
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L91
            r4 = r3
        L1d:
            int r1 = r1.length()
            if (r1 != 0) goto L24
            goto L85
        L24:
            java.lang.String r1 = "native://"
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L87
            int r1 = com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.copydefault
            int r1 = r1 + 51
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.ShareDataUIState = r6
            int r1 = r1 % r0
            java.lang.String r1 = "macle://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L87
            java.lang.String r1 = "h5://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L87
            int r1 = com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.ShareDataUIState
            int r1 = r1 + 93
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.copydefault = r6
            int r1 = r1 % r0
            java.lang.String r1 = "merchant://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L87
            int r1 = com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.ShareDataUIState
            int r1 = r1 + 47
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.copydefault = r6
            int r1 = r1 % r0
            java.lang.String r6 = "http://"
            if (r1 == 0) goto L6c
            r1 = 3
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r6, r3, r1, r5)
            if (r1 != 0) goto L87
            goto L73
        L6c:
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r6, r3, r0, r5)
            r1 = r1 ^ r2
            if (r1 == 0) goto L87
        L73:
            int r1 = com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.copydefault
            int r1 = r1 + 91
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.ShareDataUIState = r6
            int r1 = r1 % r0
            java.lang.String r1 = "https://"
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r8 == 0) goto L85
            goto L87
        L85:
            r2 = r4
            goto L92
        L87:
            int r8 = com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.ShareDataUIState
            int r8 = r8 + 119
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.copydefault = r1
            int r8 = r8 % r0
            goto L92
        L91:
            r2 = r3
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.utils.NfcOpenApp.component1(java.lang.String):boolean");
    }

    static {
        int i = component3 + 111;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
