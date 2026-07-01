package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.appcompat.app.AppCompatActivity;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.baselib.util.update.provider.AppUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultAppUpdateServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/AppUpdateService;", "<init>", "()V", "cachedUpdateBean", "Lcom/huawei/digitalpayment/consumer/baselib/util/update/UpdateBean;", "setCachedUpdateBean", "", "bean", "getCachedUpdateBean", "showAppUpdateDialog", "params", "Lcom/huawei/digitalpayment/consumer/baselib/util/update/provider/AppUpdate;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "tag", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultAppUpdateServiceIml implements AppUpdateService {
    private static int ShareDataUIState = 1;
    private static int component1;
    private UpdateBean copydefault;

    @Override
    public void setCachedUpdateBean(UpdateBean bean) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = bean;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public UpdateBean getCachedUpdateBean() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        UpdateBean updateBean = this.copydefault;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return updateBean;
    }

    @Override
    public void showAppUpdateDialog(AppUpdate params, AppCompatActivity activity, String tag) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (i3 != 0) {
            Intrinsics.checkNotNullParameter(tag, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tag, "");
        int i4 = ShareDataUIState + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }
}
