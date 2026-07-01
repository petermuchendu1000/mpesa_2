package com.huawei.digitalpayment.consumer.remoteconfig;

import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.remoteconfig.FirebaseRemotePreferences;
import com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig;
import com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh;
import com.huawei.digitalpayment.consumer.remoteconfig.models.InAppUpdate;
import com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00102\u001a\u000203H\u0016J\b\u00108\u001a\u00020\u001aH\u0002J\u0010\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020\u001aH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b$\u0010%R\u001d\u0010'\u001a\u0004\u0018\u00010(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfigImpl;", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "Lcom/huawei/digitalpayment/consumer/remoteconfig/FirebaseRemotePreferences;", "<init>", "()V", "expiryBundlesLastUpdate", "", "getExpiryBundlesLastUpdate", "()Ljava/lang/String;", "expiryBundlesLastUpdate$delegate", "Lcom/huawei/digitalpayment/consumer/remoteconfig/FirebaseRemotePreferences$RemoteString;", "noExpiryBundlesLastUpdate", "getNoExpiryBundlesLastUpdate", "noExpiryBundlesLastUpdate$delegate", "inAppUpdate", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/InAppUpdate;", "getInAppUpdate", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/InAppUpdate;", "inAppUpdate$delegate", "Lcom/huawei/digitalpayment/consumer/remoteconfig/FirebaseRemotePreferences$RemoteObject;", "miniAppIds", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", "getMiniAppIds", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", "miniAppIds$delegate", "pochiJourneyNative", "", "getPochiJourneyNative", "()Ljava/lang/Boolean;", "pochiJourneyNative$delegate", "Lcom/huawei/digitalpayment/consumer/remoteconfig/FirebaseRemotePreferences$RemoteBoolean;", "homeFibreNewCustomerDiscountFeatureEnabled", "getHomeFibreNewCustomerDiscountFeatureEnabled", "homeFibreNewCustomerDiscountFeatureEnabled$delegate", "fixedDataFamilyShareConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/FixedDataFamilyShareConfig;", "getFixedDataFamilyShareConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/FixedDataFamilyShareConfig;", "fixedDataFamilyShareConfig$delegate", "h5TokenRefresh", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/H5TokenRefresh;", "getH5TokenRefresh", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/H5TokenRefresh;", "h5TokenRefresh$delegate", "cacheExpiration", "", "getCacheExpiration", "()J", "setCacheExpiration", "(J)V", "check", "", "remote", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemote", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "isConfigState", "setRemoteConfigStale", "configStale", "Companion", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigImpl implements RemoteConfig, FirebaseRemotePreferences {
    private static int accessartificialFrame = 0;

    private static int f2700c = 0;
    private static final String component1 = "home_fibre_new_customer_discount_feature_enabled";
    private static final String component2 = "expiry_bundles_last_update";
    private static final String component3 = "configState";
    private static final String component4 = "in_app_update";
    private static final String copy = "miniapp_ids";
    private static final String copydefault = "fixed_data_family_share_config";

    private static int f2701d = 1;
    private static final String equals = "no_expiry_bundles_last_update";
    private static final String getAsAtTimestamp = "h5_token_refresh";
    private static final String getRequestBeneficiariesState = "is_pochi_native";
    private static int invoke = 1;
    static final KProperty<Object>[] ShareDataUIState = {Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "expiryBundlesLastUpdate", "getExpiryBundlesLastUpdate()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "noExpiryBundlesLastUpdate", "getNoExpiryBundlesLastUpdate()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "inAppUpdate", "getInAppUpdate()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/InAppUpdate;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "miniAppIds", "getMiniAppIds()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "pochiJourneyNative", "getPochiJourneyNative()Ljava/lang/Boolean;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "homeFibreNewCustomerDiscountFeatureEnabled", "getHomeFibreNewCustomerDiscountFeatureEnabled()Ljava/lang/Boolean;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "fixedDataFamilyShareConfig", "getFixedDataFamilyShareConfig()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/FixedDataFamilyShareConfig;", 0)), Reflection.property1(new PropertyReference1Impl(RemoteConfigImpl.class, "h5TokenRefresh", "getH5TokenRefresh()Lcom/huawei/digitalpayment/consumer/remoteconfig/models/H5TokenRefresh;", 0))};

    public static final Companion INSTANCE = new Companion(null);
    private final FirebaseRemotePreferences.RemoteString getSponsorBeneficiariesState = new FirebaseRemotePreferences.RemoteString(component2);
    private final FirebaseRemotePreferences.RemoteString coroutineBoundary = new FirebaseRemotePreferences.RemoteString(equals);
    private final FirebaseRemotePreferences.RemoteObject getARTIFICIAL_FRAME_PACKAGE_NAME = new FirebaseRemotePreferences.RemoteObject(component4, Reflection.getOrCreateKotlinClass(InAppUpdate.class));
    private final FirebaseRemotePreferences.RemoteObject coroutineCreation = new FirebaseRemotePreferences.RemoteObject(copy, Reflection.getOrCreateKotlinClass(MiniAppIds.class));
    private final FirebaseRemotePreferences.RemoteBoolean CoroutineDebuggingKt = new FirebaseRemotePreferences.RemoteBoolean(getRequestBeneficiariesState);
    private final FirebaseRemotePreferences.RemoteBoolean toString = new FirebaseRemotePreferences.RemoteBoolean(component1);
    private final FirebaseRemotePreferences.RemoteObject getShareableDataState = new FirebaseRemotePreferences.RemoteObject(copydefault, Reflection.getOrCreateKotlinClass(FixedDataFamilyShareConfig.class));
    private final FirebaseRemotePreferences.RemoteObject hashCode = new FirebaseRemotePreferences.RemoteObject(getAsAtTimestamp, Reflection.getOrCreateKotlinClass(H5TokenRefresh.class));
    private long ArtificialStackFrames = 43200;

    @Inject
    public RemoteConfigImpl() {
    }

    static {
        int i = invoke + 27;
        f2700c = i % 128;
        int i2 = i % 2;
    }

    @Override
    public String getExpiryBundlesLastUpdate() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 91;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        String value2 = this.getSponsorBeneficiariesState.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[0]);
        int i4 = f2701d + 43;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return value2;
    }

    @Override
    public String getNoExpiryBundlesLastUpdate() {
        int i = 2 % 2;
        int i2 = f2701d + 87;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        String value2 = this.coroutineBoundary.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[1]);
        int i4 = f2701d + 101;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return value2;
    }

    @Override
    public InAppUpdate getInAppUpdate() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 31;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        InAppUpdate inAppUpdate = (InAppUpdate) this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[2]);
        int i4 = accessartificialFrame + 99;
        f2701d = i4 % 128;
        int i5 = i4 % 2;
        return inAppUpdate;
    }

    @Override
    public MiniAppIds getMiniAppIds() {
        FirebaseRemotePreferences.RemoteObject remoteObject;
        RemoteConfigImpl remoteConfigImpl;
        KProperty<?> kProperty;
        int i = 2 % 2;
        int i2 = f2701d + 11;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 != 0) {
            remoteObject = this.coroutineCreation;
            remoteConfigImpl = this;
            kProperty = ShareDataUIState[3];
        } else {
            remoteObject = this.coroutineCreation;
            remoteConfigImpl = this;
            kProperty = ShareDataUIState[3];
        }
        return (MiniAppIds) remoteObject.getValue2((FirebaseRemotePreferences) remoteConfigImpl, kProperty);
    }

    @Override
    public Boolean getPochiJourneyNative() {
        int i = 2 % 2;
        int i2 = f2701d + 13;
        accessartificialFrame = i2 % 128;
        return i2 % 2 != 0 ? this.CoroutineDebuggingKt.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[2]) : this.CoroutineDebuggingKt.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[4]);
    }

    @Override
    public Boolean getHomeFibreNewCustomerDiscountFeatureEnabled() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 7;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        Boolean value2 = this.toString.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[5]);
        int i4 = accessartificialFrame + 89;
        f2701d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return value2;
    }

    @Override
    public FixedDataFamilyShareConfig getFixedDataFamilyShareConfig() {
        FirebaseRemotePreferences.RemoteObject remoteObject;
        RemoteConfigImpl remoteConfigImpl;
        KProperty<?> kProperty;
        int i = 2 % 2;
        int i2 = accessartificialFrame + 91;
        f2701d = i2 % 128;
        if (i2 % 2 == 0) {
            remoteObject = this.getShareableDataState;
            remoteConfigImpl = this;
            kProperty = ShareDataUIState[46];
        } else {
            remoteObject = this.getShareableDataState;
            remoteConfigImpl = this;
            kProperty = ShareDataUIState[6];
        }
        FixedDataFamilyShareConfig fixedDataFamilyShareConfig = (FixedDataFamilyShareConfig) remoteObject.getValue2((FirebaseRemotePreferences) remoteConfigImpl, kProperty);
        int i3 = accessartificialFrame + 93;
        f2701d = i3 % 128;
        int i4 = i3 % 2;
        return fixedDataFamilyShareConfig;
    }

    @Override
    public H5TokenRefresh getH5TokenRefresh() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 85;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        H5TokenRefresh h5TokenRefresh = (H5TokenRefresh) this.hashCode.getValue2((FirebaseRemotePreferences) this, ShareDataUIState[7]);
        int i4 = accessartificialFrame + 19;
        f2701d = i4 % 128;
        int i5 = i4 % 2;
        return h5TokenRefresh;
    }

    public final long getCacheExpiration() {
        int i = 2 % 2;
        int i2 = f2701d;
        int i3 = i2 + 105;
        accessartificialFrame = i3 % 128;
        int i4 = i3 % 2;
        long j = this.ArtificialStackFrames;
        int i5 = i2 + 117;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final void setCacheExpiration(long j) {
        int i = 2 % 2;
        int i2 = f2701d + 111;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        int i4 = i2 % 2;
        this.ArtificialStackFrames = j;
        int i5 = i3 + 17;
        f2701d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void component1(RemoteConfigImpl remoteConfigImpl, Task task) {
        int i = 2 % 2;
        int i2 = f2701d + 31;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(remoteConfigImpl, "");
        Intrinsics.checkNotNullParameter(task, "");
        remoteConfigImpl.setRemoteConfigStale(false);
        int i4 = f2701d + 73;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void check() throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.f2701d
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.accessartificialFrame = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            boolean r1 = r4.component1()
            r2 = 3
            int r2 = r2 / 0
            if (r1 == 0) goto L2b
            goto L1e
        L18:
            boolean r1 = r4.component1()
            if (r1 == 0) goto L2b
        L1e:
            r1 = 0
            r4.ArtificialStackFrames = r1
            int r1 = com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.f2701d
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.accessartificialFrame = r2
            int r1 = r1 % r0
        L2b:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder r1 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder
            r1.<init>()
            long r2 = r4.ArtificialStackFrames
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder r1 = r1.setMinimumFetchIntervalInSeconds(r2)
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings r1 = r1.build()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r2 = r4.getRemote()
            r2.setConfigSettingsAsync(r1)
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = r4.getRemote()
            int r2 = com.huawei.digitalpayment.consumer.remoteconfig.R.xml.remote_config_defaults
            r1.setDefaultsAsync(r2)
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = r4.getRemote()
            com.google.android.gms.tasks.Task r1 = r1.fetchAndActivate()
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl$$ExternalSyntheticLambda0 r2 = new com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl$$ExternalSyntheticLambda0
            r2.<init>()
            com.google.android.gms.tasks.Task r1 = r1.addOnCompleteListener(r2)
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl$$ExternalSyntheticLambda1 r2 = new com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl$$ExternalSyntheticLambda1
            r2.<init>()
            r1.addOnFailureListener(r2)
            int r1 = com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.accessartificialFrame
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.f2701d = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L74
            return
        L74:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl.check():void");
    }

    private static final void ShareDataUIState(Exception exc) {
        int i = 2 % 2;
        int i2 = f2701d + 77;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        exc.printStackTrace();
        int i4 = accessartificialFrame + 83;
        f2701d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public FirebaseRemoteConfig getRemote() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 111;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "");
        int i4 = accessartificialFrame + 21;
        f2701d = i4 % 128;
        if (i4 % 2 != 0) {
            return firebaseRemoteConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean component1() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 23;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        boolean z = SPUtils.getInstance().getBoolean(component3, false);
        int i4 = f2701d + 21;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override
    public void setRemoteConfigStale(boolean configStale) {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 93;
        f2701d = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance().put(component3, configStale);
        int i4 = accessartificialFrame + 31;
        f2701d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$pCr943xOZk4DRgdMm_avaiV9x6Q(Exception exc) {
        int i = 2 % 2;
        int i2 = f2701d + 59;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(exc);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$rqXf6LLZ6IGzB7p2dHil1pUdgZQ(RemoteConfigImpl remoteConfigImpl, Task task) {
        int i = 2 % 2;
        int i2 = f2701d + 65;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        component1(remoteConfigImpl, task);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f2701d + 111;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfigImpl$Companion;", "", "<init>", "()V", "CONFIG_STALE", "", "KEY_IN_APP_UPDATE", "KEY_EXPIRY_BUNDLES", "KEY_NO_EXPIRY_BUNDLES", "KEY_MINIAPP_IDS", "KEY_POCHI_JOURNEY", "KEY_H5_TOKEN_REFRESH", "KEY_FEATURE_HOME_FIBRE_NEW_CUSTOMER_DISCOUNT", "KEY_FIXED_DATA_FAMILY_SHARE_CONFIG", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
