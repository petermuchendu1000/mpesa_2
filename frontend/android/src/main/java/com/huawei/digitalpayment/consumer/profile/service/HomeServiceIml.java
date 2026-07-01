package com.huawei.digitalpayment.consumer.profile.service;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.service.IHomeService;
import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/service/HomeServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IHomeService;", "<init>", "()V", "getNickName", "", "mobile", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeServiceIml implements IHomeService {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public String getNickName(String mobile) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mobile, "");
        String string = SPUtils.getInstance(ProfileConstants.SP_NAME_CACHE).getString(mobile + ProfileConstants.NICK_NAME);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }
}
