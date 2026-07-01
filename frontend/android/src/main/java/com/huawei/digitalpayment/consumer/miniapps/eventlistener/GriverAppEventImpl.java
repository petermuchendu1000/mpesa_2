package com.huawei.digitalpayment.consumer.miniapps.eventlistener;

import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.api.common.page.GriverAppEvent;
import com.safaricom.mpesa.logging.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/eventlistener/GriverAppEventImpl;", "Lcom/alibaba/griver/api/common/page/GriverAppEvent;", "<init>", "()V", "TAG", "", "onAppStart", "", "app", "Lcom/alibaba/ariver/app/api/App;", "onAppExit", "onInitialized", "onFinalized", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GriverAppEventImpl implements GriverAppEvent {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private final String TAG;

    public GriverAppEventImpl() {
        String simpleName = Reflection.getOrCreateKotlinClass(GriverAppEventImpl.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
            int i = ShareDataUIState + 55;
            component2 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.TAG = simpleName;
        int i4 = component2 + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onAppStart(App app) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String appId = null;
        if (app != null) {
            int i5 = i3 + 107;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                app.getAppId();
                appId.hashCode();
                throw null;
            }
            appId = app.getAppId();
        }
        L.INSTANCE.d(this.TAG, "App started " + appId, new Object[0]);
    }

    @Override
    public void onAppExit(App app) {
        String appId;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component2 = i3;
        String str = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (app != null) {
            int i4 = i3 + 21;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                appId = app.getAppId();
                int i5 = 29 / 0;
            } else {
                appId = app.getAppId();
            }
            str = appId;
            int i6 = ShareDataUIState + 77;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
        }
        L.INSTANCE.d(this.TAG, "App exited " + str, new Object[0]);
    }

    static {
        int i = 1 + 9;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onFinalized() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onInitialized() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
