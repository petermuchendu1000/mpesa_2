package com.huawei.digitalpayment.consumer.zuriui.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class WebSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory implements Factory<String> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public String get() {
        String strProvideWebSocketUrl$ConsumerSfcZuriUi_release;
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            strProvideWebSocketUrl$ConsumerSfcZuriUi_release = provideWebSocketUrl$ConsumerSfcZuriUi_release();
            int i3 = 17 / 0;
        } else {
            strProvideWebSocketUrl$ConsumerSfcZuriUi_release = provideWebSocketUrl$ConsumerSfcZuriUi_release();
        }
        int i4 = component3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return strProvideWebSocketUrl$ConsumerSfcZuriUi_release;
    }

    public static WebSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        WebSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory webSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory = component2.component1;
        int i4 = component2 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return webSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory;
    }

    public static String provideWebSocketUrl$ConsumerSfcZuriUi_release() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String strProvideWebSocketUrl$ConsumerSfcZuriUi_release = WebSocketModule.INSTANCE.provideWebSocketUrl$ConsumerSfcZuriUi_release();
        if (i3 == 0) {
            return (String) Preconditions.checkNotNullFromProvides(strProvideWebSocketUrl$ConsumerSfcZuriUi_release);
        }
        int i4 = 84 / 0;
        return (String) Preconditions.checkNotNullFromProvides(strProvideWebSocketUrl$ConsumerSfcZuriUi_release);
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        static final WebSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory component1 = new WebSocketModule_ProvideWebSocketUrl$ConsumerSfcZuriUi_releaseFactory();
        private static int component3 = 1;

        private component2() {
        }

        static {
            int i = component3 + 83;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
