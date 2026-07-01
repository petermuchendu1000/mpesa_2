package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultChangeLanguageServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/ChangeLanguageService;", "<init>", "()V", "refreshMenu", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultChangeLanguageServiceIml implements ChangeLanguageService {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public void refreshMenu(AppCompatActivity activity) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        int i4 = component2 + 113;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
