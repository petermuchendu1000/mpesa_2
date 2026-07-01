package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.NetworkType;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.TimeInterval;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.Usage;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.UsageType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0003J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000bH\u0003J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000bH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/DataUsageManager;", "", "statsManager", "Landroid/app/usage/NetworkStatsManager;", "packageManager", "Landroid/content/pm/PackageManager;", "subscriberId", "", "<init>", "(Landroid/app/usage/NetworkStatsManager;Landroid/content/pm/PackageManager;Ljava/lang/String;)V", "getUsagePerApp", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/AppUsage;", "interval", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "networkType", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/NetworkType;", "listSize", "", "getTetheringAndHotspotUsage", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;", "getRemovedAppsUsage", "getUsage", "getDeviceSummaryUsage", "getMultiUsage", "intervals", "checkBucketInterval", "", "bucket", "Landroid/app/usage/NetworkStats$Bucket;", "start", "", "end", "getInstalledApps", "Landroid/content/pm/ApplicationInfo;", "getInstalledPackages", "Landroid/content/pm/PackageInfo;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataUsageManager {
    public static final int $stable = 8;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final NetworkStatsManager ShareDataUIState;
    private final PackageManager component1;
    private final String copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.MOBILE.ordinal()] = 1;
                int i = ShareDataUIState + 61;
                component3 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.WIFI.ordinal()] = 2;
                int i3 = component3 + 91;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DataUsageManager(NetworkStatsManager networkStatsManager, PackageManager packageManager, String str) {
        Intrinsics.checkNotNullParameter(networkStatsManager, "");
        Intrinsics.checkNotNullParameter(packageManager, "");
        this.ShareDataUIState = networkStatsManager;
        this.component1 = packageManager;
        this.copydefault = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataUsageManager(NetworkStatsManager networkStatsManager, PackageManager packageManager, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = equals;
            int i3 = i2 + 41;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(networkStatsManager, packageManager, str);
    }

    public static List getUsagePerApp$default(DataUsageManager dataUsageManager, TimeInterval timeInterval, NetworkType networkType, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = equals + 95;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i5 + 93;
            equals = i7 % 128;
            i = i7 % 2 == 0 ? 111 : 10;
        }
        List<AppUsage> usagePerApp = dataUsageManager.getUsagePerApp(timeInterval, networkType, i);
        int i8 = equals + 17;
        getRequestBeneficiariesState = i8 % 128;
        int i9 = i8 % 2;
        return usagePerApp;
    }

    public final List<AppUsage> getUsagePerApp(TimeInterval interval, NetworkType networkType, int listSize) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(interval, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : component1()) {
            NetworkStatsManager networkStatsManager = this.ShareDataUIState;
            int i3 = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
            if (i3 != 1) {
                int i4 = equals;
                int i5 = i4 + 57;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = i4 + 59;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                i = 1;
            } else {
                i = 0;
            }
            NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(i, this.copydefault, interval.getStart(), interval.getEnd(), applicationInfo.uid);
            Intrinsics.checkNotNullExpressionValue(networkStatsQueryDetailsForUid, "");
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            Usage usage = new Usage(0L, 0L, 3, null);
            while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                usage.setDownloads(usage.getDownloads() + bucket.getRxBytes());
                usage.setUploads(usage.getUploads() + bucket.getTxBytes());
            }
            networkStatsQueryDetailsForUid.close();
            arrayList.add(new AppUsage(applicationInfo, usage, UsageType.APP));
        }
        arrayList.add(new AppUsage(null, getTetheringAndHotspotUsage(interval, networkType), UsageType.TETHERING));
        arrayList.add(new AppUsage(null, getRemovedAppsUsage(interval, networkType), UsageType.REMOVED_APPS));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i9 = equals + 119;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            if (((AppUsage) obj).getUsage().getTotalUsage() > 0) {
                int i11 = equals + 65;
                getRequestBeneficiariesState = i11 % 128;
                int i12 = i11 % 2;
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.take(CollectionsKt.sortedWith(arrayList2, new Comparator() {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final int compare(T t, T t2) {
                int i13 = 2 % 2;
                int i14 = component1 + 47;
                component2 = i14 % 128;
                int i15 = i14 % 2;
                int iCompareValues = ComparisonsKt.compareValues(Long.valueOf(((AppUsage) t2).getUsage().getTotalUsage()), Long.valueOf(((AppUsage) t).getUsage().getTotalUsage()));
                int i16 = component2 + 109;
                component1 = i16 % 128;
                int i17 = i16 % 2;
                return iCompareValues;
            }
        }), listSize);
    }

    public final Usage getTetheringAndHotspotUsage(TimeInterval interval, NetworkType networkType) {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 97;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(interval, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        NetworkStatsManager networkStatsManager = this.ShareDataUIState;
        int i5 = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i5 == 1) {
            i = 0;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = getRequestBeneficiariesState + 23;
            equals = i6 % 128;
            int i7 = i6 % 2;
            i = 1;
        }
        NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(i, this.copydefault, interval.getStart(), interval.getEnd(), -5);
        Intrinsics.checkNotNullExpressionValue(networkStatsQueryDetailsForUid, "");
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        Usage usage = new Usage(0L, 0L, 3, null);
        while (networkStatsQueryDetailsForUid.hasNextBucket()) {
            networkStatsQueryDetailsForUid.getNextBucket(bucket);
            usage.setDownloads(usage.getDownloads() + bucket.getRxBytes());
            usage.setUploads(usage.getUploads() + bucket.getTxBytes());
        }
        networkStatsQueryDetailsForUid.close();
        int i8 = getRequestBeneficiariesState + 103;
        equals = i8 % 128;
        int i9 = i8 % 2;
        return usage;
    }

    public final Usage getRemovedAppsUsage(TimeInterval interval, NetworkType networkType) {
        int i;
        long downloads;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(interval, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        NetworkStatsManager networkStatsManager = this.ShareDataUIState;
        int i3 = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(i, this.copydefault, interval.getStart(), interval.getEnd(), -4);
        Intrinsics.checkNotNullExpressionValue(networkStatsQueryDetailsForUid, "");
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        Usage usage = new Usage(0L, 0L, 3, null);
        int i4 = equals + 3;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        while (!(!networkStatsQueryDetailsForUid.hasNextBucket())) {
            int i6 = equals + 75;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                downloads = usage.getDownloads() | bucket.getRxBytes();
            } else {
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                downloads = usage.getDownloads() + bucket.getRxBytes();
            }
            usage.setDownloads(downloads);
            usage.setUploads(usage.getUploads() + bucket.getTxBytes());
        }
        networkStatsQueryDetailsForUid.close();
        return usage;
    }

    public final Usage getUsage(TimeInterval interval, NetworkType networkType) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(interval, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        NetworkStatsManager networkStatsManager = this.ShareDataUIState;
        int i3 = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        NetworkStats networkStatsQueryDetails = networkStatsManager.queryDetails(i, this.copydefault, interval.getStart(), interval.getEnd());
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        Usage usage = new Usage(0L, 0L, 3, null);
        int i4 = equals + 63;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        while (!(!networkStatsQueryDetails.hasNextBucket())) {
            int i6 = getRequestBeneficiariesState + 75;
            equals = i6 % 128;
            int i7 = i6 % 2;
            networkStatsQueryDetails.getNextBucket(bucket);
            usage.setDownloads(usage.getDownloads() + bucket.getRxBytes());
            usage.setUploads(usage.getUploads() + bucket.getTxBytes());
        }
        networkStatsQueryDetails.close();
        int i8 = equals + 57;
        getRequestBeneficiariesState = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 9 / 0;
        }
        return usage;
    }

    public final Usage getDeviceSummaryUsage(TimeInterval interval, NetworkType networkType) throws RemoteException {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(interval, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        NetworkStatsManager networkStatsManager = this.ShareDataUIState;
        int i3 = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i3 == 1) {
            int i4 = getRequestBeneficiariesState + 103;
            equals = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = getRequestBeneficiariesState + 95;
            equals = i6 % 128;
            int i7 = i6 % 2;
            i = 1;
        }
        NetworkStats.Bucket bucketQuerySummaryForDevice = networkStatsManager.querySummaryForDevice(i, this.copydefault, interval.getStart(), interval.getEnd());
        Usage usage = new Usage(0L, 0L, 3, null);
        usage.setDownloads(usage.getDownloads() + bucketQuerySummaryForDevice.getRxBytes());
        usage.setUploads(usage.getUploads() + bucketQuerySummaryForDevice.getTxBytes());
        int i8 = equals + 49;
        getRequestBeneficiariesState = i8 % 128;
        if (i8 % 2 == 0) {
            return usage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Usage> getMultiUsage(List<TimeInterval> intervals, NetworkType networkType) {
        long start;
        TimeInterval timeInterval;
        int i;
        TimeInterval timeInterval2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(intervals, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!intervals.isEmpty()) {
            int i3 = getRequestBeneficiariesState + 33;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                start = intervals.get(0).getStart();
                timeInterval = intervals.get(1);
            } else {
                start = intervals.get(0).getStart();
                timeInterval = intervals.get(0);
            }
            long end = timeInterval.getEnd();
            List<TimeInterval> list = intervals;
            long start2 = start;
            long end2 = end;
            for (TimeInterval timeInterval3 : list) {
                if (timeInterval3.getStart() < start2) {
                    start2 = timeInterval3.getStart();
                }
                if (timeInterval3.getEnd() > end2) {
                    end2 = timeInterval3.getEnd();
                }
                linkedHashMap.put(timeInterval3, new Usage(0L, 0L, 3, null));
            }
            NetworkStatsManager networkStatsManager = this.ShareDataUIState;
            int i4 = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
            if (i4 == 1) {
                i = 0;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            NetworkStats networkStatsQueryDetails = networkStatsManager.queryDetails(i, this.copydefault, start2, end2);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (networkStatsQueryDetails.hasNextBucket()) {
                networkStatsQueryDetails.getNextBucket(bucket);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i5 = getRequestBeneficiariesState + 11;
                    equals = i5 % 128;
                    if (i5 % 2 == 0) {
                        timeInterval2 = (TimeInterval) it.next();
                        int i6 = 1 / 0;
                        if (component1(bucket, timeInterval2.getStart(), timeInterval2.getEnd())) {
                            Object obj = linkedHashMap.get(timeInterval2);
                            Intrinsics.checkNotNull(obj);
                            Usage usage = (Usage) obj;
                            usage.setDownloads(usage.getDownloads() + bucket.getRxBytes());
                            Object obj2 = linkedHashMap.get(timeInterval2);
                            Intrinsics.checkNotNull(obj2);
                            Usage usage2 = (Usage) obj2;
                            usage2.setUploads(usage2.getUploads() + bucket.getTxBytes());
                        }
                    } else {
                        timeInterval2 = (TimeInterval) it.next();
                        if (component1(bucket, timeInterval2.getStart(), timeInterval2.getEnd())) {
                            Object obj3 = linkedHashMap.get(timeInterval2);
                            Intrinsics.checkNotNull(obj3);
                            Usage usage3 = (Usage) obj3;
                            usage3.setDownloads(usage3.getDownloads() + bucket.getRxBytes());
                            Object obj22 = linkedHashMap.get(timeInterval2);
                            Intrinsics.checkNotNull(obj22);
                            Usage usage22 = (Usage) obj22;
                            usage22.setUploads(usage22.getUploads() + bucket.getTxBytes());
                        }
                    }
                }
            }
            networkStatsQueryDetails.close();
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean component1(android.app.usage.NetworkStats.Bucket r6, long r7, long r9) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            long r1 = r6.getStartTimeStamp()
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L1d
            int r3 = com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager.getRequestBeneficiariesState
            int r3 = r3 + 75
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager.equals = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L1b
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L1d
            goto L2c
        L1b:
            r6 = 0
            throw r6
        L1d:
            long r1 = r6.getEndTimeStamp()
            r3 = 1
            long r7 = r7 + r3
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 > 0) goto L37
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 >= 0) goto L37
        L2c:
            int r6 = com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager.getRequestBeneficiariesState
            int r6 = r6 + 107
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager.equals = r7
            int r6 = r6 % r0
            r6 = 1
            goto L38
        L37:
            r6 = 0
        L38:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.DataUsageManager.component1(android.app.usage.NetworkStats$Bucket, long, long):boolean");
    }

    private final List<PackageInfo> component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        List<PackageInfo> installedPackages = this.component1.getInstalledPackages(128);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "");
        int i4 = equals + 5;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return installedPackages;
    }

    private final List<ApplicationInfo> component1() {
        int i = 2 % 2;
        List<ApplicationInfo> installedApplications = this.component1.getInstalledApplications(128);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedApplications) {
            int i2 = ((ApplicationInfo) obj).flags;
            arrayList.add(obj);
            int i3 = getRequestBeneficiariesState + 105;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        ArrayList arrayList2 = arrayList;
        int i5 = equals + 89;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList2;
        }
        throw null;
    }

    static {
        int i = 1 + 93;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
