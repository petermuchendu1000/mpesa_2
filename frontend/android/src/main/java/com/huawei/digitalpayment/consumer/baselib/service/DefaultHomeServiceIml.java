package com.huawei.digitalpayment.consumer.baselib.service;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultHomeServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IHomeService;", "<init>", "()V", "getNickName", "", "mobile", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultHomeServiceIml implements IHomeService {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public String getNickName(String mobile) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mobile, "");
            return "";
        }
        Intrinsics.checkNotNullParameter(mobile, "");
        throw null;
    }
}
