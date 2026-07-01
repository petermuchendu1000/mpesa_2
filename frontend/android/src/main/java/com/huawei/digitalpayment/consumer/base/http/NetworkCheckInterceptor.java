package com.huawei.digitalpayment.consumer.base.http;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.base.networkcheck.DaggerNetworkCheckComponent;
import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckComponent;
import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckManager;
import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckModuleDependencies;
import com.mpesa.qrcode.constants.ErrorStore;
import dagger.hilt.android.EntryPointAccessors;
import java.net.ConnectException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/http/NetworkCheckInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "networkCheckManager", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;", "getNetworkCheckManager", "()Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;", "setNetworkCheckManager", "(Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkCheckInterceptor implements Interceptor {
    private static int component2 = 1;
    private static int copydefault;
    private final String ShareDataUIState = Reflection.getOrCreateKotlinClass(NetworkCheckInterceptor.class).getSimpleName();

    @Inject
    public NetworkCheckManager networkCheckManager;

    public NetworkCheckInterceptor() {
        NetworkCheckComponent.Factory factory = DaggerNetworkCheckComponent.factory();
        Application app = Utils.getApp();
        Intrinsics.checkNotNullExpressionValue(app, "");
        factory.addDependencies((NetworkCheckModuleDependencies) EntryPointAccessors.fromApplication(app, NetworkCheckModuleDependencies.class), this).inject(this);
    }

    public final String getTAG() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NetworkCheckManager getNetworkCheckManager() {
        int i = 2 % 2;
        NetworkCheckManager networkCheckManager = this.networkCheckManager;
        Object obj = null;
        if (networkCheckManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = component2;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return networkCheckManager;
        }
        obj.hashCode();
        throw null;
    }

    public final void setNetworkCheckManager(NetworkCheckManager networkCheckManager) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(networkCheckManager, "");
            this.networkCheckManager = networkCheckManager;
        } else {
            Intrinsics.checkNotNullParameter(networkCheckManager, "");
            this.networkCheckManager = networkCheckManager;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public Response intercept(Interceptor.Chain chain) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        try {
            boolean zIsEnabled = getNetworkCheckManager().getNetworkCheckState().getValue().isEnabled();
            L.d(this.ShareDataUIState, "Is Network Available " + zIsEnabled);
            if (!zIsEnabled) {
                throw new ConnectException("Network Not Available");
            }
            int i2 = component2 + 105;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return chain.proceed(chain.request().newBuilder().build());
            }
            int i3 = 44 / 0;
            return chain.proceed(chain.request().newBuilder().build());
        } catch (Exception unused) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(404).message(ErrorStore.NO_INTERNET).body(ResponseBody.INSTANCE.create((MediaType) null, ErrorStore.NO_INTERNET)).build();
        }
    }
}
