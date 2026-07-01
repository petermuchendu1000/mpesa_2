package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.lifecycle.LiveData;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/content/Context;Landroid/net/ConnectivityManager;)V", "networkCallback", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData$NetworkCallback;", "isNetworkAvailable", "()Ljava/lang/Boolean;", "isWifiOn", "isDataOn", "onActive", "", "onInactive", "updateConnection", "NetworkCallback", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectionLiveData extends LiveData<Boolean> {
    public static final int $stable = 8;
    private static int component1 = 39 % 128;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private NetworkCallback ShareDataUIState;
    private final Context component2;
    private ConnectivityManager component3;

    public static final void access$postValue(ConnectionLiveData connectionLiveData, Boolean bool) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        connectionLiveData.postValue(bool);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 21;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    @Inject
    public ConnectionLiveData(@ApplicationContext Context context, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(connectivityManager, "");
        this.component2 = context;
        this.component3 = connectivityManager;
        this.ShareDataUIState = new NetworkCallback(this);
    }

    public final Boolean isNetworkAvailable() {
        int i = 2 % 2;
        int i2 = copy + 1;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Object systemService = this.component2.getApplicationContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            this.component3 = connectivityManager;
            NetworkCapabilities networkCapabilities = this.component3.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return Boolean.valueOf(networkCapabilities.hasCapability(16));
            }
            int i3 = getAsAtTimestamp + 71;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Object systemService2 = this.component2.getApplicationContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService2, "");
        ConnectivityManager connectivityManager2 = (ConnectivityManager) systemService2;
        this.component3 = connectivityManager2;
        this.component3.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
        obj.hashCode();
        throw null;
    }

    public final Boolean isWifiOn() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object systemService = this.component2.getApplicationContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.component3 = connectivityManager;
        NetworkCapabilities networkCapabilities = this.component3.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return null;
        }
        int i4 = getAsAtTimestamp + 111;
        copy = i4 % 128;
        int i5 = i4 % 2;
        Boolean boolValueOf = Boolean.valueOf(networkCapabilities.hasTransport(1));
        int i6 = getAsAtTimestamp + 123;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return boolValueOf;
    }

    public final Boolean isDataOn() {
        int i = 2 % 2;
        Object systemService = this.component2.getApplicationContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.component3 = connectivityManager;
        NetworkCapabilities networkCapabilities = this.component3.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return null;
        }
        int i2 = getAsAtTimestamp + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(networkCapabilities.hasTransport(0));
        int i4 = copy + 65;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    @Override
    public void onActive() {
        int i = 2 % 2;
        int i2 = copy + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onActive();
        component1();
        this.component3.registerDefaultNetworkCallback(this.ShareDataUIState);
        int i4 = copy + 91;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onInactive() {
        int i = 2 % 2;
        int i2 = copy + 37;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            super.onInactive();
            this.component3.unregisterNetworkCallback(this.ShareDataUIState);
            int i3 = 64 / 0;
        } else {
            super.onInactive();
            this.component3.unregisterNetworkCallback(this.ShareDataUIState);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component1() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData.copy
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData.getAsAtTimestamp = r2
            int r1 = r1 % r0
            android.content.Context r1 = r4.component2
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r4.component3 = r1
            android.net.Network r1 = r1.getActiveNetwork()
            android.net.ConnectivityManager r2 = r4.component3
            android.net.NetworkCapabilities r1 = r2.getNetworkCapabilities(r1)
            if (r1 == 0) goto L40
            r2 = 16
            boolean r1 = r1.hasCapability(r2)
            r2 = 1
            if (r1 != r2) goto L40
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData.copy
            int r1 = r1 + 91
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData.getAsAtTimestamp = r3
            int r1 = r1 % r0
            goto L41
        L40:
            r2 = 0
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.postValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData.component1():void");
    }

    static {
        int i = 39 % 2;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData$NetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "liveData", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;)V", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkCallback extends ConnectivityManager.NetworkCallback {
        public static final int $stable = 8;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final ConnectionLiveData ShareDataUIState;

        public NetworkCallback(ConnectionLiveData connectionLiveData) {
            Intrinsics.checkNotNullParameter(connectionLiveData, "");
            this.ShareDataUIState = connectionLiveData;
        }

        @Override
        public void onAvailable(Network network) {
            int i = 2 % 2;
            int i2 = component2 + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(network, "");
            ConnectionLiveData.access$postValue(this.ShareDataUIState, true);
            int i4 = component1 + 95;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override
        public void onLost(Network network) {
            int i = 2 % 2;
            int i2 = component2 + 59;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(network, "");
            ConnectionLiveData.access$postValue(this.ShareDataUIState, false);
            int i4 = component1 + 23;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 1 + 15;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
