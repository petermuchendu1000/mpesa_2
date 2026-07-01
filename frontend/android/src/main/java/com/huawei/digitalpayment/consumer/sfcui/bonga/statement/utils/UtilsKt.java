package com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.digitalpayment.consumer.sfcui.bonga.bongahistory.BongaHistoryAccumulatedResponse;
import com.huawei.digitalpayment.consumer.sfcui.bonga.bongahistory.BongaHistoryRedeemedResponse;
import com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0011\u001a-\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0017\u001a\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u001a\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001e"}, d2 = {"API_DATE_PATTERN", "", "apiDateFormatter", "Ljava/text/SimpleDateFormat;", "getApiDateFormatter", "()Ljava/text/SimpleDateFormat;", "getCurrentDateTimeForApi", "getDateDaysAgoForApi", "days", "", "millisToStartOfDayApi", "millis", "", "millisToEndOfDayApi", "formatDate", "dateString", "formatPoints", "", "getStringOrNull", "obj", "Lcom/google/gson/JsonObject;", UserMetadata.KEYDATA_FILENAME, "", "(Lcom/google/gson/JsonObject;[Ljava/lang/String;)Ljava/lang/String;", "parseAccumulatedStatements", "", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement;", "data", "", "parseRedeemedStatements", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilsKt {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static final String component3 = "yyyy-MM-dd'T'HH:mm:ss";

    private static final SimpleDateFormat component3() {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(component3, Locale.US);
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return simpleDateFormat;
    }

    public static final String getCurrentDateTimeForApi() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 0);
        String str = component3().format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = ShareDataUIState + 103;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String getDateDaysAgoForApi(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        String str = component3().format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i5 = component2 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final String millisToStartOfDayApi(long j) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        String str = component3().format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = ShareDataUIState + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final String millisToEndOfDayApi(long j) {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        if (calendar2.getTimeInMillis() != calendar3.getTimeInMillis()) {
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
        } else {
            int i2 = ShareDataUIState + 125;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 5;
            }
        }
        String str = component3().format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = component2 + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r2 = new java.text.SimpleDateFormat(com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.component3, java.util.Locale.getDefault());
        r3 = new java.text.SimpleDateFormat("dd MMM yyyy", java.util.Locale.getDefault());
        r2 = r2.parse(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.ShareDataUIState + 51;
        com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.component2 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r4 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r0 = r3.format(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r1 = 82 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r0 = r3.format(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r1 = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
        r2 = new java.text.SimpleDateFormat("dd MMM yyyy", java.util.Locale.getDefault());
        r0 = r1.parse(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        r0 = r2.format(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r6.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r6.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String formatDate(java.lang.String r6) {
        /*
            java.lang.String r0 = "dd MMM yyyy"
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.ShareDataUIState
            int r2 = r2 + 37
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.component2 = r3
            int r2 = r2 % r1
            java.lang.String r3 = ""
            if (r2 != 0) goto L23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r4 = 21
            int r4 = r4 / 0
            if (r2 != 0) goto L30
            goto L2f
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L30
        L2f:
            return r3
        L30:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L67
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L67
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L67
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L67
            r3.<init>(r0, r4)     // Catch: java.lang.Exception -> L67
            java.util.Date r2 = r2.parse(r6)     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto L89
            int r4 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.ShareDataUIState
            int r4 = r4 + 51
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.component2 = r5
            int r4 = r4 % r1
            if (r4 != 0) goto L60
            java.lang.String r0 = r3.format(r2)     // Catch: java.lang.Exception -> L67
            r1 = 82
            int r1 = r1 / 0
            if (r0 != 0) goto L88
            goto L89
        L60:
            java.lang.String r0 = r3.format(r2)     // Catch: java.lang.Exception -> L67
            if (r0 != 0) goto L88
            goto L89
        L67:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L89
            java.lang.String r2 = "yyyy-MM-dd"
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L89
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L89
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L89
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L89
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L89
            java.util.Date r0 = r1.parse(r6)     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L89
            java.lang.String r0 = r2.format(r0)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L88
            goto L89
        L88:
            r6 = r0
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.UtilsKt.formatDate(java.lang.String):java.lang.String");
    }

    public static final String formatPoints(double d2) {
        String strValueOf;
        int i = 2 % 2;
        int i2 = (int) d2;
        if (d2 == i2) {
            strValueOf = String.valueOf(i2);
            int i3 = ShareDataUIState + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
            Intrinsics.checkNotNullExpressionValue(strValueOf, "");
        }
        int i5 = ShareDataUIState + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return strValueOf;
    }

    private static final String component2(JsonObject jsonObject, String... strArr) {
        int i = 2 % 2;
        Object obj = null;
        if (jsonObject == null) {
            int i2 = component2 + 77;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = ShareDataUIState + 53;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 % 5;
        }
        for (String str : strArr) {
            int i5 = component2 + 37;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            if (jsonObject.has(str) && (!jsonObject.get(str).isJsonNull())) {
                int i7 = component2 + 59;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return jsonObject.get(str).getAsString();
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (jsonObject.has(lowerCase) && !jsonObject.get(lowerCase).isJsonNull()) {
                return jsonObject.get(lowerCase).getAsString();
            }
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (jsonObject.has(upperCase) && !jsonObject.get(upperCase).isJsonNull()) {
                return jsonObject.get(upperCase).getAsString();
            }
        }
        return null;
    }

    public static final List<BongaStatement> parseAccumulatedStatements(Object obj) {
        JsonElement jsonElement;
        int i = 2 % 2;
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Gson gson = new Gson();
            if (obj instanceof Map) {
                int i2 = ShareDataUIState + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object obj2 = ((Map) obj).get("originalResponse");
                if (obj2 != null) {
                    obj = obj2;
                }
            }
            JsonObject jsonObject = (JsonObject) gson.fromJson(gson.toJson(obj), JsonObject.class);
            JsonObject asJsonObject = jsonObject.getAsJsonObject("header");
            int asInt = (asJsonObject == null || (jsonElement = asJsonObject.get("responseCode")) == null) ? -1 : jsonElement.getAsInt();
            Object obj3 = null;
            if (asInt != 0) {
                int i4 = ShareDataUIState + 85;
                int i5 = i4 % 128;
                component2 = i5;
                int i6 = i4 % 2;
                if (asInt != 200) {
                    int i7 = i5 + 97;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 == 0) {
                        return CollectionsKt.emptyList();
                    }
                    CollectionsKt.emptyList();
                    obj3.hashCode();
                    throw null;
                }
            }
            JsonArray asJsonArray = jsonObject.getAsJsonArray("body");
            ArrayList arrayList = new ArrayList();
            if (asJsonArray != null) {
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    BongaHistoryAccumulatedResponse bongaHistoryAccumulatedResponse = (BongaHistoryAccumulatedResponse) gson.fromJson(it.next(), BongaHistoryAccumulatedResponse.class);
                    arrayList.add(new BongaStatement.Accumulated(bongaHistoryAccumulatedResponse.getBongaPointsAccumulated(), bongaHistoryAccumulatedResponse.getBongaPointsBalance(), bongaHistoryAccumulatedResponse.getAccumulationDate(), null));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    public static final List<BongaStatement> parseRedeemedStatements(Object obj) {
        JsonElement jsonElement;
        Object obj2;
        int i = 2 % 2;
        if (obj == null) {
            int i2 = ShareDataUIState + 81;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return CollectionsKt.emptyList();
            }
            CollectionsKt.emptyList();
            throw null;
        }
        try {
            Gson gson = new Gson();
            if ((obj instanceof Map) && (obj2 = ((Map) obj).get("originalResponse")) != null) {
                obj = obj2;
            }
            JsonObject jsonObject = (JsonObject) gson.fromJson(gson.toJson(obj), JsonObject.class);
            JsonObject asJsonObject = jsonObject.getAsJsonObject("header");
            int asInt = (asJsonObject == null || (jsonElement = asJsonObject.get("responseCode")) == null) ? -1 : jsonElement.getAsInt();
            if (asInt != 0) {
                int i3 = ShareDataUIState + 3;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (asInt != 200) {
                    return CollectionsKt.emptyList();
                }
            }
            JsonArray asJsonArray = jsonObject.getAsJsonArray("body");
            ArrayList arrayList = new ArrayList();
            if (asJsonArray != null) {
                int i5 = ShareDataUIState + 65;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        BongaHistoryRedeemedResponse bongaHistoryRedeemedResponse = (BongaHistoryRedeemedResponse) gson.fromJson(it.next(), BongaHistoryRedeemedResponse.class);
                        arrayList.add(new BongaStatement.Redeemed(bongaHistoryRedeemedResponse.getBongaPointsRedeemed(), bongaHistoryRedeemedResponse.getBongaPointsBalance(), bongaHistoryRedeemedResponse.getRedemptionDate(), bongaHistoryRedeemedResponse.getResourceName()));
                    }
                } else {
                    asJsonArray.iterator();
                    throw null;
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }
}
