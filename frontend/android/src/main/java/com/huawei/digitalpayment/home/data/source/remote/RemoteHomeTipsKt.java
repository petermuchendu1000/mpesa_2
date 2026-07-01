package com.huawei.digitalpayment.home.data.source.remote;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toLocal", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeTips;", "Lcom/huawei/digitalpayment/home/data/source/remote/RemoteHomeTips;", "ConsumerHomeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RemoteHomeTipsKt {
    private static int component3 = 0;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips toLocal(com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTips r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.component3
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.copydefault = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r1 = r6.getBulletin()
            r3 = 38
            int r3 = r3 / 0
            if (r1 != 0) goto L28
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r1 = r6.getBulletin()
            if (r1 != 0) goto L28
        L27:
            r1 = r2
        L28:
            java.lang.String r3 = r6.getShowSeconds()
            if (r3 != 0) goto L40
            int r3 = com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.copydefault
            int r3 = r3 + 85
            int r4 = r3 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.component3 = r4
            int r3 = r3 % r0
            int r4 = r4 + 91
            int r3 = r4 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.copydefault = r3
            int r4 = r4 % r0
            java.lang.String r3 = "3"
        L40:
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
            java.lang.String r4 = r4.getH5BaseUrl()
            java.lang.String r5 = r6.getIcon()
            java.lang.String r4 = com.huawei.common.util.image.UrlUtils.getURL(r4, r5)
            if (r4 != 0) goto L62
            int r4 = com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.copydefault
            int r4 = r4 + 99
            int r5 = r4 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.component3 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L60
            java.lang.String r4 = "icon_home_tips"
            goto L62
        L60:
            r6 = 0
            throw r6
        L62:
            java.lang.String r0 = r6.getExecute()
            if (r0 != 0) goto L69
            goto L6a
        L69:
            r2 = r0
        L6a:
            com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips r0 = new com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips
            r0.<init>(r1, r3, r4, r2)
            com.huawei.http.BaseResp r6 = (com.huawei.http.BaseResp) r6
            r0.copyExtension(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt.toLocal(com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTips):com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips");
    }
}
