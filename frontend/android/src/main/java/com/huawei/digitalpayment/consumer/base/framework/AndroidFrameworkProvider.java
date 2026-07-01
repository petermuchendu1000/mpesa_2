package com.huawei.digitalpayment.consumer.base.framework;

import android.app.Application;
import android.net.ConnectivityManager;
import android.telephony.PhoneStateListener;
import com.huawei.digitalpayment.consumer.base.util.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0017J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/framework/AndroidFrameworkProvider;", "Lcom/huawei/digitalpayment/consumer/base/framework/NetworkInformationProvider;", "Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "networkUtils", "Lcom/huawei/digitalpayment/consumer/base/util/NetworkUtils;", "isNetworkConnected", "", "getNetworkConnectionInfo", "Lkotlin/Pair;", "", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "isDeviceHoldingMultipleSimCards", "getCurrentSIMOperator", "hasSimCard", "getSimIccid", "getSimImsi", "registerPhoneStateListener", "", "phoneStateListener", "Landroid/telephony/PhoneStateListener;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidFrameworkProvider implements NetworkInformationProvider, PhoneNetworkInformationProvider {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Application ShareDataUIState;
    private final NetworkUtils component3;

    public AndroidFrameworkProvider(Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.ShareDataUIState = application;
        this.component3 = new NetworkUtils();
    }

    @Override
    public boolean isNetworkConnected() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsNetworkConnected = this.component3.isNetworkConnected(this.ShareDataUIState);
        int i4 = copydefault + 67;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zIsNetworkConnected;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.Pair<java.lang.String, java.lang.String> getNetworkConnectionInfo() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.base.util.NetworkUtils r1 = r4.component3
            android.app.Application r2 = r4.ShareDataUIState
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r1.getNetworkType(r2)
            if (r1 == 0) goto L3c
            int r2 = com.huawei.digitalpayment.consumer.base.framework.AndroidFrameworkProvider.component2
            int r2 = r2 + 97
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.framework.AndroidFrameworkProvider.copydefault = r3
            int r2 = r2 % r0
            com.huawei.digitalpayment.consumer.base.util.NetworkUtils r0 = r4.component3
            if (r2 != 0) goto L2b
            android.app.Application r2 = r4.ShareDataUIState
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r0.getNetworkOperatorName(r2)
            r2 = 27
            int r2 = r2 / 0
            if (r0 != 0) goto L37
            goto L35
        L2b:
            android.app.Application r2 = r4.ShareDataUIState
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r0.getNetworkOperatorName(r2)
            if (r0 != 0) goto L37
        L35:
            java.lang.String r0 = ""
        L37:
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            goto L46
        L3c:
            int r1 = com.huawei.digitalpayment.consumer.base.framework.AndroidFrameworkProvider.component2
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.framework.AndroidFrameworkProvider.copydefault = r2
            int r1 = r1 % r0
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.framework.AndroidFrameworkProvider.getNetworkConnectionInfo():kotlin.Pair");
    }

    @Override
    public ConnectivityManager getConnectivityManager() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object systemService = this.ShareDataUIState.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            int i4 = copydefault + 19;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return (ConnectivityManager) systemService;
        }
        int i6 = component2 + 85;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override
    public boolean isDeviceHoldingMultipleSimCards() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NetworkUtils networkUtils = this.component3;
        if (i3 != 0) {
            return networkUtils.isDeviceHoldingMultipleSimCards(this.ShareDataUIState);
        }
        int i4 = 95 / 0;
        return networkUtils.isDeviceHoldingMultipleSimCards(this.ShareDataUIState);
    }

    @Override
    public String getCurrentSIMOperator() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.component3.getCurrentSIMOperator(this.ShareDataUIState);
            throw null;
        }
        String currentSIMOperator = this.component3.getCurrentSIMOperator(this.ShareDataUIState);
        int i3 = component2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return currentSIMOperator;
    }

    @Override
    public boolean hasSimCard() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zHasSimCard = this.component3.hasSimCard(this.ShareDataUIState);
        int i4 = component2 + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zHasSimCard;
    }

    @Override
    public String getSimIccid() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String simIccid = this.component3.getSimIccid(this.ShareDataUIState);
        int i4 = component2 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return simIccid;
    }

    @Override
    public String getSimImsi() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String simImsi = this.component3.getSimImsi(this.ShareDataUIState);
        int i4 = component2 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return simImsi;
        }
        throw null;
    }

    @Override
    public void registerPhoneStateListener(PhoneStateListener phoneStateListener) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(phoneStateListener, "");
            this.component3.registerPhoneStateListener(this.ShareDataUIState, phoneStateListener);
        } else {
            Intrinsics.checkNotNullParameter(phoneStateListener, "");
            this.component3.registerPhoneStateListener(this.ShareDataUIState, phoneStateListener);
            throw null;
        }
    }
}
