package com.huawei.digitalpayment.pwa.business;

import android.app.Activity;
import android.net.Uri;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import com.huawei.digitalpayment.pwa.constant.BusinessType;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/pwa/business/OpenApp;", "Lcom/huawei/digitalpayment/pwa/business/IBusiness;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getBusinessName", "", "init", "", "parseUri", "uri", "Landroid/net/Uri;", "openApp", "query", "", "isRouteValid", "", "route", "CustomerPwaModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenApp implements IBusiness {
    private static int component2 = 1;
    private static int copydefault;
    private Activity component1;

    public OpenApp(Activity activity) {
        this.component1 = activity;
    }

    @Override
    public String getBusinessName() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return BusinessType.OPEN_APP;
    }

    @Override
    public void init(Activity activity) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.component1 = activity;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
    }

    @Override
    public void parseUri(Uri uri) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (uri != null) {
            HashMap<String, String> querys = UriUtils.parseQuerys(uri);
            Intrinsics.checkNotNullExpressionValue(querys, "");
            component1(querys);
        }
        int i4 = component2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void component1(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = map.get("route");
        if (component3(str)) {
            RouteUtils.routeWithExecute(this.component1, str);
            return;
        }
        int i4 = component2 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean component3(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.pwa.business.OpenApp.copydefault
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.pwa.business.OpenApp.component2 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L17
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L82
            r4 = r2
            goto L1d
        L17:
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L81
            r4 = r3
        L1d:
            int r1 = r1.length()
            r5 = 0
            if (r1 != 0) goto L30
            int r8 = com.huawei.digitalpayment.pwa.business.OpenApp.copydefault
            int r8 = r8 + r2
            int r1 = r8 % 128
            com.huawei.digitalpayment.pwa.business.OpenApp.component2 = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L2f
            goto L7f
        L2f:
            throw r5
        L30:
            java.lang.String r1 = "native://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L82
            java.lang.String r1 = "macle://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            r1 = r1 ^ r2
            if (r1 == 0) goto L82
            int r1 = com.huawei.digitalpayment.pwa.business.OpenApp.component2
            int r1 = r1 + 117
            int r6 = r1 % 128
            com.huawei.digitalpayment.pwa.business.OpenApp.copydefault = r6
            int r1 = r1 % r0
            java.lang.String r6 = "h5://"
            if (r1 == 0) goto L56
            r1 = 4
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r6, r2, r1, r5)
            if (r1 != 0) goto L82
            goto L5d
        L56:
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r6, r3, r0, r5)
            r1 = r1 ^ r2
            if (r1 == 0) goto L82
        L5d:
            java.lang.String r1 = "merchant://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L82
            int r1 = com.huawei.digitalpayment.pwa.business.OpenApp.component2
            int r1 = r1 + 47
            int r6 = r1 % 128
            com.huawei.digitalpayment.pwa.business.OpenApp.copydefault = r6
            int r1 = r1 % r0
            java.lang.String r1 = "http://"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r1 != 0) goto L82
            java.lang.String r1 = "https://"
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r8, r1, r3, r0, r5)
            if (r8 == 0) goto L7f
            goto L82
        L7f:
            r2 = r4
            goto L82
        L81:
            r2 = r3
        L82:
            int r8 = com.huawei.digitalpayment.pwa.business.OpenApp.copydefault
            int r8 = r8 + 89
            int r1 = r8 % 128
            com.huawei.digitalpayment.pwa.business.OpenApp.component2 = r1
            int r8 = r8 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.business.OpenApp.component3(java.lang.String):boolean");
    }
}
