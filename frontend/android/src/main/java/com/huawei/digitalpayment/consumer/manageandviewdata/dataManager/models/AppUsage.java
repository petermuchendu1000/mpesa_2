package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models;

import android.content.pm.ApplicationInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020 H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/AppUsage;", "", "appInfo", "Landroid/content/pm/ApplicationInfo;", "usage", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;", "usageType", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/UsageType;", "<init>", "(Landroid/content/pm/ApplicationInfo;Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/UsageType;)V", "getAppInfo", "()Landroid/content/pm/ApplicationInfo;", "setAppInfo", "(Landroid/content/pm/ApplicationInfo;)V", "getUsage", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;", "setUsage", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;)V", "getUsageType", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/UsageType;", "setUsageType", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/UsageType;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppUsage {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component4 = 0;
    private static int equals = 1;
    private Usage ShareDataUIState;
    private ApplicationInfo component3;
    private UsageType copydefault;

    public AppUsage(ApplicationInfo applicationInfo, Usage usage, UsageType usageType) {
        Intrinsics.checkNotNullParameter(usage, "");
        Intrinsics.checkNotNullParameter(usageType, "");
        this.component3 = applicationInfo;
        this.ShareDataUIState = usage;
        this.copydefault = usageType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppUsage(ApplicationInfo applicationInfo, Usage usage, UsageType usageType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = equals + 9;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            usageType = UsageType.APP;
            int i4 = component4 + 59;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(applicationInfo, usage, usageType);
    }

    public final ApplicationInfo getAppInfo() {
        int i = 2 % 2;
        int i2 = equals + 27;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        ApplicationInfo applicationInfo = this.component3;
        int i5 = i3 + 33;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return applicationInfo;
    }

    public final void setAppInfo(ApplicationInfo applicationInfo) {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.component3 = applicationInfo;
        int i5 = i3 + 17;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Usage getUsage() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 75;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Usage usage = this.ShareDataUIState;
        int i5 = i2 + 115;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return usage;
    }

    public final void setUsage(Usage usage) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(usage, "");
            this.ShareDataUIState = usage;
        } else {
            Intrinsics.checkNotNullParameter(usage, "");
            this.ShareDataUIState = usage;
            throw null;
        }
    }

    public final UsageType getUsageType() {
        UsageType usageType;
        int i = 2 % 2;
        int i2 = component4 + 79;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            usageType = this.copydefault;
            int i4 = 38 / 0;
        } else {
            usageType = this.copydefault;
        }
        int i5 = i3 + 5;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return usageType;
    }

    public final void setUsageType(UsageType usageType) {
        int i = 2 % 2;
        int i2 = component4 + 41;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(usageType, "");
            this.copydefault = usageType;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(usageType, "");
        this.copydefault = usageType;
        int i3 = component4 + 125;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    static {
        int i = 1 + 91;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static AppUsage copy$default(AppUsage appUsage, ApplicationInfo applicationInfo, Usage usage, UsageType usageType, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 29;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 17;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            applicationInfo = appUsage.component3;
            if (i7 != 0) {
                int i8 = 52 / 0;
            }
        }
        if ((i & 2) != 0) {
            usage = appUsage.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            int i9 = component4 + 125;
            equals = i9 % 128;
            int i10 = i9 % 2;
            usageType = appUsage.copydefault;
        }
        return appUsage.copy(applicationInfo, usage, usageType);
    }

    public final ApplicationInfo component1() {
        int i = 2 % 2;
        int i2 = component4 + 53;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Usage component2() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Usage usage = this.ShareDataUIState;
        int i4 = i3 + 47;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return usage;
    }

    public final UsageType component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 71;
        equals = i3 % 128;
        int i4 = i3 % 2;
        UsageType usageType = this.copydefault;
        int i5 = i2 + 21;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return usageType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AppUsage copy(ApplicationInfo appInfo, Usage usage, UsageType usageType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(usage, "");
        Intrinsics.checkNotNullParameter(usageType, "");
        AppUsage appUsage = new AppUsage(appInfo, usage, usageType);
        int i2 = component4 + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return appUsage;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUsage)) {
            return false;
        }
        AppUsage appUsage = (AppUsage) other;
        if (!Intrinsics.areEqual(this.component3, appUsage.component3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, appUsage.ShareDataUIState)) {
            int i2 = equals + 109;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.copydefault == appUsage.copydefault) {
            return true;
        }
        int i4 = component4;
        int i5 = i4 + 21;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 85;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r2
  0x0026: PHI (r2v4 android.content.pm.ApplicationInfo) = (r2v2 android.content.pm.ApplicationInfo), (r2v5 android.content.pm.ApplicationInfo) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage.component4
            int r2 = r1 + 121
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage.equals = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            android.content.pm.ApplicationInfo r2 = r5.component3
            r4 = 70
            int r4 = r4 / r3
            if (r2 != 0) goto L26
            goto L1b
        L17:
            android.content.pm.ApplicationInfo r2 = r5.component3
            if (r2 != 0) goto L26
        L1b:
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage.equals = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2a
            r3 = 1
            goto L2a
        L26:
            int r3 = r2.hashCode()
        L2a:
            int r3 = r3 * 31
            com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.Usage r0 = r5.ShareDataUIState
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * 31
            com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.UsageType r0 = r5.copydefault
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppUsage(appInfo=" + this.component3 + ", usage=" + this.ShareDataUIState + ", usageType=" + this.copydefault + ")";
        int i2 = component4 + 113;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
