package com.huawei.digitalpayment.consumer.zuriui.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.serialization.json.Json;

public final class WebSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory implements Factory<Json> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Json json = get();
        int i4 = component3 + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return json;
    }

    @Override
    public Json get() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            provideJson$ConsumerSfcZuriUi_release();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Json jsonProvideJson$ConsumerSfcZuriUi_release = provideJson$ConsumerSfcZuriUi_release();
        int i3 = component3 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return jsonProvideJson$ConsumerSfcZuriUi_release;
    }

    public static WebSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            WebSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory webSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory = ShareDataUIState.component1;
            throw null;
        }
        WebSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory webSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory2 = ShareDataUIState.component1;
        int i3 = component3 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return webSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory2;
    }

    public static Json provideJson$ConsumerSfcZuriUi_release() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Json json = (Json) Preconditions.checkNotNullFromProvides(WebSocketModule.INSTANCE.provideJson$ConsumerSfcZuriUi_release());
        if (i3 != 0) {
            return json;
        }
        throw null;
    }

    static final class ShareDataUIState {
        static final WebSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory component1 = new WebSocketModule_ProvideJson$ConsumerSfcZuriUi_releaseFactory();
        private static int component2 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 87;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
