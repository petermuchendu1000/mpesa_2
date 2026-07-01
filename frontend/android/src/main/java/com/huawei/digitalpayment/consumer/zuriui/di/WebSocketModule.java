package com.huawei.digitalpayment.consumer.zuriui.di;

import com.huawei.digitalpayment.consumer.zuriui.BuildConfig;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/di/WebSocketModule;", "", "<init>", "()V", "NAMED_WEB_SOCKET_URL", "", "provideJson", "Lkotlinx/serialization/json/Json;", "provideJson$ConsumerSfcZuriUi_release", "provideWebSocketClient", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketClient;", "json", "provideWebSocketClient$ConsumerSfcZuriUi_release", "provideWebSocketUrl", "provideWebSocketUrl$ConsumerSfcZuriUi_release", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class WebSocketModule {
    public static final int $stable = 0;
    public static final WebSocketModule INSTANCE = new WebSocketModule();
    public static final String NAMED_WEB_SOCKET_URL = "WebSocketUrl";
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;

    private WebSocketModule() {
    }

    @Provides
    @Singleton
    public final Json provideJson$ConsumerSfcZuriUi_release() {
        int i = 2 % 2;
        Json jsonJson$default = JsonKt.Json$default(null, new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 23;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM12191$r8$lambda$gZLsEkDbsYzIKACfcqp0kHgd3s = WebSocketModule.m12191$r8$lambda$gZLsEkDbsYzIKACfcqp0kHgd3s((JsonBuilder) obj);
                if (i4 == 0) {
                    int i5 = 31 / 0;
                }
                return unitM12191$r8$lambda$gZLsEkDbsYzIKACfcqp0kHgd3s;
            }
        }, 1, null);
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return jsonJson$default;
    }

    private static final Unit copydefault(JsonBuilder jsonBuilder) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(false);
            jsonBuilder.setLenient(false);
        } else {
            Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
            jsonBuilder.setLenient(true);
        }
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setPrettyPrint(false);
        return Unit.INSTANCE;
    }

    @Provides
    @Singleton
    public final WebSocketClient provideWebSocketClient$ConsumerSfcZuriUi_release(Json json) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(json, "");
        WebSocketClient webSocketClient = new WebSocketClient(json);
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return webSocketClient;
    }

    @Provides
    @Named(NAMED_WEB_SOCKET_URL)
    public final String provideWebSocketUrl$ConsumerSfcZuriUi_release() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return BuildConfig.ZURI_WEB_SOCKET_URL;
    }

    public static Unit m12191$r8$lambda$gZLsEkDbsYzIKACfcqp0kHgd3s(JsonBuilder jsonBuilder) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault(jsonBuilder);
        }
        copydefault(jsonBuilder);
        throw null;
    }

    static {
        int i = ShareDataUIState + 103;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
