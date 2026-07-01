package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import com.alibaba.griver.beehive.lottie.player.LottieParams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponse;", "<init>", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "parseResponseCode", "", LottieParams.KEY_ELEMENT_ID, "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaResponseDeserializer implements JsonDeserializer<SambazaResponse> {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 1;
    private static final String component1 = "SambazaDeserializer";
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @Override
    public SambazaResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SambazaResponse sambazaResponseDeserialize = deserialize(jsonElement, type, jsonDeserializationContext);
        int i4 = ShareDataUIState + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return sambazaResponseDeserialize;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseDeserializer$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse deserialize(com.google.gson.JsonElement r10, java.lang.reflect.Type r11, com.google.gson.JsonDeserializationContext r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse");
    }

    private final int component1(JsonElement jsonElement) {
        int i = 2 % 2;
        if (jsonElement != null) {
            int i2 = copydefault + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            if (!jsonElement.isJsonNull()) {
                try {
                    if (!(!jsonElement.isJsonPrimitive())) {
                        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                        if (asJsonPrimitive.isNumber()) {
                            return asJsonPrimitive.getAsInt();
                        }
                        if (asJsonPrimitive.isString()) {
                            int i4 = ShareDataUIState + 85;
                            copydefault = i4 % 128;
                            Object obj = null;
                            if (i4 % 2 != 0) {
                                String asString = asJsonPrimitive.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString, "");
                                StringsKt.toIntOrNull(asString);
                                throw null;
                            }
                            String asString2 = asJsonPrimitive.getAsString();
                            Intrinsics.checkNotNullExpressionValue(asString2, "");
                            Integer intOrNull = StringsKt.toIntOrNull(asString2);
                            if (intOrNull != null) {
                                int i5 = ShareDataUIState + 1;
                                copydefault = i5 % 128;
                                if (i5 % 2 == 0) {
                                    return intOrNull.intValue();
                                }
                                intOrNull.intValue();
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return 0;
    }

    static {
        int i = component2 + 47;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
