package com.huawei.digitalpayment.consumer.base.repository;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import com.huawei.digitalpayment.consumer.base.sim.SimStateValidator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0012\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository;", "", "context", "Landroid/content/Context;", "phoneNetworkInformationProvider", "Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;", "simStateValidator", "Lcom/huawei/digitalpayment/consumer/base/sim/SimStateValidator;", "<init>", "(Landroid/content/Context;Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;Lcom/huawei/digitalpayment/consumer/base/sim/SimStateValidator;)V", "_phoneState", "Landroidx/lifecycle/MutableLiveData;", "", "phoneState", "Landroidx/lifecycle/LiveData;", "getPhoneState", "()Landroidx/lifecycle/LiveData;", "invalidPhoneStateListener", "com/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository$invalidPhoneStateListener$2$1", "getInvalidPhoneStateListener", "()Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository$invalidPhoneStateListener$2$1;", "invalidPhoneStateListener$delegate", "Lkotlin/Lazy;", "getSIMCardState", "getSIMICCID", "getSIMIMSI", "getModelBrand", "startSIMCardStateListening", "", "extractMcc", "", "simOperator", "extractMnc", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoRepository {

    public static final Companion INSTANCE = new Companion(null);
    private static final int component1 = 0;
    private static final int component3 = 0;
    private static final String copydefault = "DeviceInfoRepository";
    private static int equals = 0;
    private static int getShareableDataState = 0;
    private static int hashCode = 1;
    private static int toString = 1;
    private final Context ShareDataUIState;
    private final MutableLiveData<String> component2;
    private final LiveData<String> component4;
    private final PhoneNetworkInformationProvider copy;
    private final SimStateValidator getAsAtTimestamp;
    private final Lazy getRequestBeneficiariesState;

    public DeviceInfoRepository(Context context, PhoneNetworkInformationProvider phoneNetworkInformationProvider, SimStateValidator simStateValidator) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(phoneNetworkInformationProvider, "");
        Intrinsics.checkNotNullParameter(simStateValidator, "");
        this.ShareDataUIState = context;
        this.copy = phoneNetworkInformationProvider;
        this.getAsAtTimestamp = simStateValidator;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.component2 = mutableLiveData;
        this.component4 = mutableLiveData;
        this.getRequestBeneficiariesState = LazyKt.lazy(new Function0() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 99;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                DeviceInfoRepository$invalidPhoneStateListener$2$1 deviceInfoRepository$invalidPhoneStateListener$2$1M10159$r8$lambda$BZg6lpKidQsECOEO4daV5T5aeY = DeviceInfoRepository.m10159$r8$lambda$BZg6lpKidQsECOEO4daV5T5aeY(this.f$0);
                int i4 = copydefault + 3;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return deviceInfoRepository$invalidPhoneStateListener$2$1M10159$r8$lambda$BZg6lpKidQsECOEO4daV5T5aeY;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public static final Context access$getContext$p(DeviceInfoRepository deviceInfoRepository) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 63;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        Context context = deviceInfoRepository.ShareDataUIState;
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        int i6 = i2 + 27;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        throw null;
    }

    public static final MutableLiveData access$get_phoneState$p(DeviceInfoRepository deviceInfoRepository) {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 111;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<String> mutableLiveData = deviceInfoRepository.component2;
        int i5 = i2 + 7;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return mutableLiveData;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository$Companion;", "", "<init>", "()V", "TAG", "", "INVALID_MCC", "", "INVALID_MNC", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final LiveData<String> getPhoneState() {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        LiveData<String> liveData = this.component4;
        int i5 = i3 + 65;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final DeviceInfoRepository$invalidPhoneStateListener$2$1 ShareDataUIState() {
        int i = 2 % 2;
        int i2 = hashCode + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        DeviceInfoRepository$invalidPhoneStateListener$2$1 deviceInfoRepository$invalidPhoneStateListener$2$1 = (DeviceInfoRepository$invalidPhoneStateListener$2$1) this.getRequestBeneficiariesState.getValue();
        int i4 = equals + 95;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return deviceInfoRepository$invalidPhoneStateListener$2$1;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1] */
    private static final DeviceInfoRepository$invalidPhoneStateListener$2$1 component3(final DeviceInfoRepository deviceInfoRepository) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "");
        ?? r1 = new PhoneStateListener() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onServiceStateChanged(android.telephony.ServiceState r6) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.component3
                    int r1 = r1 + 55
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.copydefault = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = "phone"
                    if (r1 != 0) goto L7e
                    super.onServiceStateChanged(r6)
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r6 = r5.component2
                    android.content.Context r6 = com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository.access$getContext$p(r6)
                    java.lang.Object r6 = r6.getSystemService(r2)
                    android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6
                    if (r6 != 0) goto L22
                    return
                L22:
                    int r6 = r6.getSimState()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "onServiceStateChanged Service State changed: "
                    r1.<init>(r2)
                    r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r3 = "DeviceInfoRepository"
                    android.util.Log.d(r3, r1)
                    r1 = 5
                    if (r6 == r1) goto L74
                    int r1 = com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.copydefault
                    int r1 = r1 + 77
                    int r4 = r1 % 128
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.component3 = r4
                    int r1 = r1 % r0
                    if (r1 != 0) goto L4e
                    r1 = 50
                    int r1 = r1 / 0
                    if (r6 == 0) goto L74
                    goto L50
                L4e:
                    if (r6 == 0) goto L74
                L50:
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r6 = r5.component2
                    java.lang.String r6 = r6.getSIMCardState()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>(r2)
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    android.util.Log.d(r3, r6)
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r6 = r5.component2
                    androidx.lifecycle.MutableLiveData r6 = com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository.access$get_phoneState$p(r6)
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r1 = r5.component2
                    java.lang.String r1 = r1.getSIMCardState()
                    r6.postValue(r1)
                L74:
                    int r6 = com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.component3
                    int r6 = r6 + 1
                    int r1 = r6 % 128
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.copydefault = r1
                    int r6 = r6 % r0
                    return
                L7e:
                    super.onServiceStateChanged(r6)
                    com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r6 = r5.component2
                    android.content.Context r6 = com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository.access$getContext$p(r6)
                    java.lang.Object r6 = r6.getSystemService(r2)
                    android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6
                    r6 = 0
                    r6.hashCode()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository$invalidPhoneStateListener$2$1.onServiceStateChanged(android.telephony.ServiceState):void");
            }
        };
        int i2 = equals + 119;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
        return r1;
    }

    public final String getSIMCardState() {
        int i = 2 % 2;
        String currentSIMOperator = this.copy.getCurrentSIMOperator();
        int iCopydefault = copydefault(currentSIMOperator);
        int iComponent3 = component3(currentSIMOperator);
        Log.d(copydefault, "SIM Operator: " + currentSIMOperator + " | MCC: " + iCopydefault + " | MNC: " + iComponent3);
        String strValidate = this.getAsAtTimestamp.validate(iCopydefault, iComponent3);
        int i2 = equals + 103;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return strValidate;
        }
        throw null;
    }

    public final String getSIMICCID() {
        String simIccid;
        int i = 2 % 2;
        int i2 = equals + 31;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            simIccid = this.copy.getSimIccid();
            int i3 = 50 / 0;
        } else {
            simIccid = this.copy.getSimIccid();
        }
        int i4 = equals + 55;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return simIccid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSIMIMSI() {
        int i = 2 % 2;
        int i2 = equals + 45;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            this.copy.getSimImsi();
            throw null;
        }
        String simImsi = this.copy.getSimImsi();
        int i3 = equals + 101;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            return simImsi;
        }
        throw null;
    }

    public final String getModelBrand() {
        int i = 2 % 2;
        String str = Build.MANUFACTURER + "_" + Build.MODEL + "_" + Build.DEVICE;
        int i2 = equals + 5;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void startSIMCardStateListening() {
        int i = 2 % 2;
        int i2 = equals + 49;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Log.d(copydefault, "startSIMCardStateListening - PhoneStateListener registered");
            this.copy.registerPhoneStateListener(ShareDataUIState());
        } else {
            Log.d(copydefault, "startSIMCardStateListening - PhoneStateListener registered");
            this.copy.registerPhoneStateListener(ShareDataUIState());
            throw null;
        }
    }

    private final int copydefault(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 53;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        try {
            i = Integer.parseInt(StringsKt.take(str, 3));
        } catch (Exception e) {
            Log.e(copydefault, "Can't extract MCC, SIM operator = " + str, e);
            i = 0;
        }
        int i5 = equals + 67;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    private final int component3(String str) {
        int i = 2 % 2;
        int i2 = hashCode + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strSubstring = str.substring(3, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            int i4 = Integer.parseInt(strSubstring);
            int i5 = equals + 55;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        } catch (Exception e) {
            Log.e(copydefault, "Can't extract MNC, SIM operator = " + str, e);
            return 0;
        }
    }

    public static DeviceInfoRepository$invalidPhoneStateListener$2$1 m10159$r8$lambda$BZg6lpKidQsECOEO4daV5T5aeY(DeviceInfoRepository deviceInfoRepository) {
        int i = 2 % 2;
        int i2 = hashCode + 117;
        equals = i2 % 128;
        int i3 = i2 % 2;
        DeviceInfoRepository$invalidPhoneStateListener$2$1 deviceInfoRepository$invalidPhoneStateListener$2$1Component3 = component3(deviceInfoRepository);
        int i4 = equals + 103;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return deviceInfoRepository$invalidPhoneStateListener$2$1Component3;
    }

    static {
        int i = toString + 13;
        getShareableDataState = i % 128;
        int i2 = i % 2;
    }
}
