package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddResourceSerializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddResource;", "<init>", "()V", "serialize", "Lcom/google/gson/JsonElement;", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonSerializationContext;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareAddResourceSerializer implements JsonSerializer<FamilyShareAddResource> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 55 % 128;
    private static int copydefault = 1;

    @Override
    public JsonElement serialize(FamilyShareAddResource familyShareAddResource, Type type, JsonSerializationContext jsonSerializationContext) throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        FamilyShareAddResource familyShareAddResource2 = familyShareAddResource;
        if (i2 % 2 != 0) {
            serialize2(familyShareAddResource2, type, jsonSerializationContext);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        JsonElement jsonElementSerialize2 = serialize2(familyShareAddResource2, type, jsonSerializationContext);
        int i3 = component2 + 125;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return jsonElementSerialize2;
    }

    public JsonElement serialize2(FamilyShareAddResource src, Type typeOfSrc, JsonSerializationContext context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(src, "");
        Intrinsics.checkNotNullParameter(typeOfSrc, "");
        Intrinsics.checkNotNullParameter(context, "");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("resourceType", src.getResourceType());
        jsonObject.addProperty("sharingMode", src.getSharingMode());
        Integer shareLimitMB = src.getShareLimitMB();
        if (shareLimitMB != null) {
            int i2 = copydefault + 41;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                jsonObject.addProperty("shareLimitMB", Integer.valueOf(shareLimitMB.intValue()));
                int i3 = 34 / 0;
            } else {
                jsonObject.addProperty("shareLimitMB", Integer.valueOf(shareLimitMB.intValue()));
            }
        }
        Integer shareLimitMinutes = src.getShareLimitMinutes();
        if (shareLimitMinutes != null) {
            int i4 = copydefault + 115;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            jsonObject.addProperty("shareLimitMinutes", Integer.valueOf(shareLimitMinutes.intValue()));
            int i6 = copydefault + 57;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return jsonObject;
    }

    static {
        int i = 55 % 2;
    }
}
