package com.huawei.digitalpayment.consumer.miniapps.extension;

import com.alibaba.griver.api.common.account.GriverAccountExtension;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.security.MsisdnHashGenerator;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/extension/MiniAppsGetUserIdProvider;", "Lcom/alibaba/griver/api/common/account/GriverAccountExtension;", "<init>", "()V", "getUserId", "", "getMsisdn", "Companion", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppsGetUserIdProvider implements GriverAccountExtension {
    public static final int $stable = 0;

    public static final Companion INSTANCE;
    private static final String NO_USER_ID = "";
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/extension/MiniAppsGetUserIdProvider$Companion;", "", "<init>", "()V", "NO_USER_ID", "", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public String getUserId() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return getMsisdn();
        }
        getMsisdn();
        throw null;
    }

    private final String getMsisdn() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strHashMsisdn$default = MsisdnHashGenerator.hashMsisdn$default(MsisdnHashGenerator.INSTANCE, "254" + StringsKt.take(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9), null, null, 6, null);
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return strHashMsisdn$default;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component3 + 85;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
