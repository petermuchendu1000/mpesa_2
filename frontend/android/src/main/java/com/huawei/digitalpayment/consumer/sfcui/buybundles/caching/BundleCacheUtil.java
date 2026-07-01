package com.huawei.digitalpayment.consumer.sfcui.buybundles.caching;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/caching/BundleCacheUtil;", "", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "<init>", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "setLastCached", "", "bundleCacheType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/caching/BundleCacheType;", "shouldFetchRemote", "", "checkIfShouldFetch", "prefsDateStr", "", "remoteDateStr", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleCacheUtil {
    private static final String ShareDataUIState = "dd/MM/yyyy";
    private static int component2 = 0;
    private static final String component3 = "bundleKeyNoExpiry";
    private static int component4 = 0;
    private static int copy = 1;
    private static final String copydefault = "bundleKeyWithExpiry";
    private static int getAsAtTimestamp = 1;
    private final RemoteConfig component1;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component2 = 0;
        private static int component3 = 1;

        static {
            int[] iArr = new int[BundleCacheType.values().length];
            try {
                iArr[BundleCacheType.WITH_EXPIRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BundleCacheType.NO_EXPIRY.ordinal()] = 2;
                int i = component2 + 27;
                component3 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i3 = component2 + 99;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/caching/BundleCacheUtil$Companion;", "", "<init>", "()V", "KEY_WITH_EXPIRY", "", "KEY_NO_EXPIRY", "CACHE_DATE_FORMAT", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Inject
    public BundleCacheUtil(RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "");
        this.component1 = remoteConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r5
  0x002c: PHI (r5v3 int) = (r5v2 int), (r5v14 int) binds: [B:8:0x002a, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setLastCached(com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheType r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.component4
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.copy = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r1[r5]
            if (r5 == r2) goto L46
            goto L2c
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r1[r5]
            if (r5 == r2) goto L46
        L2c:
            if (r5 != r0) goto L40
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.copy
            int r5 = r5 + 21
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.component4 = r1
            int r5 = r5 % r0
            java.lang.String r0 = "bundleKeyNoExpiry"
            if (r5 == 0) goto L48
            r5 = 11
            int r5 = r5 / 0
            goto L48
        L40:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L46:
            java.lang.String r0 = "bundleKeyWithExpiry"
        L48:
            java.lang.String r5 = "dd/MM/yyyy"
            j$.time.format.DateTimeFormatter r5 = j$.time.format.DateTimeFormatter.ofPattern(r5)
            j$.time.LocalDate r1 = j$.time.LocalDate.now()
            j$.time.temporal.TemporalAccessor r1 = (j$.time.temporal.TemporalAccessor) r1
            java.lang.String r5 = r5.format(r1)
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            r1.put(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil.setLastCached(com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheType):void");
    }

    public final boolean shouldFetchRemote(BundleCacheType bundleCacheType) {
        String str;
        String expiryBundlesLastUpdate;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundleCacheType, "");
        int i2 = WhenMappings.$EnumSwitchMapping$0[bundleCacheType.ordinal()];
        if (i2 == 1) {
            str = copydefault;
            int i3 = copy + 113;
            component4 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = component3;
        }
        String string = SPUtils.getInstance().getString(str, "");
        Intrinsics.checkNotNull(string);
        if (string.length() == 0) {
            return true;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[bundleCacheType.ordinal()];
        if (i5 == 1) {
            expiryBundlesLastUpdate = this.component1.getExpiryBundlesLastUpdate();
            int i6 = component4 + 93;
            copy = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            expiryBundlesLastUpdate = this.component1.getNoExpiryBundlesLastUpdate();
        }
        if (expiryBundlesLastUpdate != null) {
            return component3(string, expiryBundlesLastUpdate);
        }
        int i8 = copy + 117;
        component4 = i8 % 128;
        return i8 % 2 == 0;
    }

    private final boolean component3(String str, String str2) {
        int i = 2 % 2;
        int i2 = component4 + 93;
        copy = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                boolean zIsAfter = LocalDate.parse(str2, dateTimeFormatterOfPattern).isAfter(LocalDate.parse(str, dateTimeFormatterOfPattern));
                int i3 = component4 + 65;
                copy = i3 % 128;
                int i4 = i3 % 2;
                return zIsAfter;
            }
            DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(str2, dateTimeFormatterOfPattern2).isAfter(LocalDate.parse(str, dateTimeFormatterOfPattern2));
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (DateTimeParseException unused) {
            return true;
        }
    }

    static {
        int i = getAsAtTimestamp + 93;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }
}
