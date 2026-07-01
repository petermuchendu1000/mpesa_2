package com.huawei.digitalpayment.consumer.base.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/NetworkUtils;", "", "<init>", "()V", "getCurrentSIMOperator", "", "context", "Landroid/content/Context;", "hasSimCard", "", "getSimIccid", "getSimImsi", "registerPhoneStateListener", "", "phoneStateListener", "Landroid/telephony/PhoneStateListener;", "isDeviceHoldingMultipleSimCards", "isNetworkConnected", "getNetworkType", "getNetworkOperatorName", "getRegisteredCellId", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkUtils {

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static final String component1 = "dummy_imsi";
    private static int component2 = 1;
    private static int component3 = 0;
    private static final String copydefault = "dummy_iccid";
    private static int getAsAtTimestamp = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/NetworkUtils$Companion;", "", "<init>", "()V", "DUMMY_ICCID", "", "DUMMY_IMSID", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getCurrentSIMOperator(Context context) {
        TelephonyManager telephonyManager;
        String simOperator;
        String str = "";
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService instanceof TelephonyManager) {
            int i4 = component3 + 55;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null && (simOperator = telephonyManager.getSimOperator()) != null) {
            str = simOperator;
        }
        int i6 = getAsAtTimestamp + 115;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean hasSimCard(Context context) {
        TelephonyManager telephonyManager;
        int i = 2 % 2;
        int i2 = component3 + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService instanceof TelephonyManager) {
            int i4 = component3 + 111;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager == null || telephonyManager.getSimState() != 5) {
            return false;
        }
        int i6 = getAsAtTimestamp + 79;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public final String getSimIccid(Context context) {
        String iccId;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        SubscriptionInfo subscriptionInfo;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("telephony_subscription_service");
        SubscriptionManager subscriptionManager = systemService instanceof SubscriptionManager ? (SubscriptionManager) systemService : null;
        if (subscriptionManager == null || (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) == null || (subscriptionInfo = (SubscriptionInfo) CollectionsKt.firstOrNull((List) activeSubscriptionInfoList)) == null) {
            iccId = null;
        } else {
            int i2 = component3 + 35;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                iccId = subscriptionInfo.getIccId();
                int i3 = 36 / 0;
            } else {
                iccId = subscriptionInfo.getIccId();
            }
        }
        if (iccId != null) {
            int i4 = component3 + 73;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            String str = iccId.length() > 0 ? iccId : null;
            if (str != null) {
                return str;
            }
        }
        return copydefault;
    }

    public final String getSimImsi(Context context) {
        String subscriberId;
        String str = "";
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        String str2 = null;
        TelephonyManager telephonyManager = !(systemService instanceof TelephonyManager) ? null : (TelephonyManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            if (telephonyManager != null) {
                int i4 = component3 + 109;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                String simOperator = telephonyManager.getSimOperator();
                if (simOperator != null) {
                    str = simOperator;
                }
            }
            return StringsKt.padEnd(str, 15, '0');
        }
        if (telephonyManager != null) {
            int i6 = getAsAtTimestamp + 79;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            subscriberId = telephonyManager.getSubscriberId();
        } else {
            int i8 = getAsAtTimestamp + 3;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            subscriberId = null;
        }
        if (subscriberId != null) {
            int i10 = component3 + 75;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
            if (subscriberId.length() > 0) {
                int i12 = component3 + 5;
                getAsAtTimestamp = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 49 / 0;
                }
                str2 = subscriberId;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return component1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r5
  0x0033: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v6 java.lang.Object) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerPhoneStateListener(android.content.Context r5, android.telephony.PhoneStateListener r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.util.NetworkUtils.component3
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.NetworkUtils.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = "phone"
            java.lang.String r3 = ""
            if (r1 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Object r5 = r5.getSystemService(r2)
            boolean r1 = r5 instanceof android.telephony.TelephonyManager
            r2 = 29
            int r2 = r2 / 0
            if (r1 == 0) goto L36
            goto L33
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Object r5 = r5.getSystemService(r2)
            boolean r1 = r5 instanceof android.telephony.TelephonyManager
            if (r1 == 0) goto L36
        L33:
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5
            goto L37
        L36:
            r5 = 0
        L37:
            if (r5 == 0) goto L4d
            int r1 = com.huawei.digitalpayment.consumer.base.util.NetworkUtils.component3
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.NetworkUtils.getAsAtTimestamp = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4a
            r0 = 24
        L46:
            r5.listen(r6, r0)
            goto L4d
        L4a:
            r0 = 32
            goto L46
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.NetworkUtils.registerPhoneStateListener(android.content.Context, android.telephony.PhoneStateListener):void");
    }

    public final boolean isDeviceHoldingMultipleSimCards(Context context) {
        SubscriptionManager subscriptionManager;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("telephony_subscription_service");
        if (systemService instanceof SubscriptionManager) {
            int i2 = component3 + 101;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            subscriptionManager = (SubscriptionManager) systemService;
        } else {
            int i4 = getAsAtTimestamp + 59;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            subscriptionManager = null;
        }
        if (subscriptionManager != null) {
            int i6 = getAsAtTimestamp + 79;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            if (subscriptionManager.getActiveSubscriptionInfoCount() > 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNetworkConnected(Context context) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            ((ConnectivityManager) systemService).getActiveNetworkInfo();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService2 = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService2, "");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        int i3 = component3 + 81;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return activeNetworkInfo.isConnected();
        }
        activeNetworkInfo.isConnected();
        throw null;
    }

    public final String getNetworkType(Context context) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int i4 = component3 + 19;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if (activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? "OTHER" : activeNetworkInfo.getTypeName() : activeNetworkInfo.getTypeName();
            }
        }
        return null;
    }

    public final String getNetworkOperatorName(Context context) {
        TelephonyManager telephonyManager;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Object obj = null;
        if (!(systemService instanceof TelephonyManager)) {
            telephonyManager = null;
        } else {
            int i2 = component3 + 101;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            telephonyManager = (TelephonyManager) systemService;
        }
        if (telephonyManager == null) {
            return null;
        }
        int i3 = component3 + 27;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return telephonyManager.getNetworkOperatorName();
        }
        telephonyManager.getNetworkOperatorName();
        obj.hashCode();
        throw null;
    }

    public final String getRegisteredCellId(Context context) {
        Object next;
        String strValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Object obj = null;
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            int i2 = component3 + 39;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return "0";
        }
        try {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return "0";
            }
            Iterator<T> it = allCellInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CellInfo) next).isRegistered()) {
                    break;
                }
            }
            CellInfo cellInfo = (CellInfo) next;
            if (cellInfo == null) {
                return "0";
            }
            int i4 = getAsAtTimestamp + 105;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = cellInfo instanceof CellInfoGsm;
                obj.hashCode();
                throw null;
            }
            if (cellInfo instanceof CellInfoGsm) {
                strValueOf = String.valueOf(((CellInfoGsm) cellInfo).getCellIdentity().getCid());
                int i5 = getAsAtTimestamp + 73;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            } else if (cellInfo instanceof CellInfoWcdma) {
                strValueOf = String.valueOf(((CellInfoWcdma) cellInfo).getCellIdentity().getCid());
            } else {
                if (!(cellInfo instanceof CellInfoLte)) {
                    return "0";
                }
                strValueOf = String.valueOf(((CellInfoLte) cellInfo).getCellIdentity().getCi());
            }
            return strValueOf;
        } catch (Exception unused) {
            return "0";
        }
    }

    static {
        int i = component2 + 113;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
