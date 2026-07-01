package com.huawei.digitalpayment.consumer.manageandviewdata.di;

import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/di/DataUsageInitializer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "_dataUsageManager", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/DataUsageManager;", "dataManagerInstance", "getDataManagerInstance", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/DataUsageManager;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataUsageInitializer {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 83 % 128;
    private static int copy = 1;
    private static int copydefault;
    private final Context ShareDataUIState;
    private final DataUsageManager component3;

    @Inject
    public DataUsageInitializer(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.ShareDataUIState = context;
        Object systemService = context.getSystemService("netstats");
        Intrinsics.checkNotNull(systemService, "");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        this.component3 = new DataUsageManager((NetworkStatsManager) systemService, packageManager, null, 4, null);
    }

    public final DataUsageManager getDataManagerInstance() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        DataUsageManager dataUsageManager = this.component3;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return dataUsageManager;
    }

    static {
        int i = 83 % 2;
    }
}
