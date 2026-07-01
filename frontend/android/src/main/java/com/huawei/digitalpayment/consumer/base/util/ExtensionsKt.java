package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils;
import com.huawei.digitalpayment.mobileapp.report.repository.EventReportRequestKt;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0005\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0005\u001a\u0006\u0010\t\u001a\u00020\u0005\u001a6\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a\"\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00122\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u001a6\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0014"}, d2 = {"getParcelable", "P", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", LogConstants.KEY_TIME_STAPM, "maskMsisdn", "OneAppSourceSystem", "addMandatoryHeaders", "", "Type", "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "msisdn", "sourceSystem", "shouldEncrypt", "", "Lcom/huawei/digitalpayment/consumer/base/util/MiniAppProxyRequest;", "Lcom/huawei/digitalpayment/consumer/base/util/HaPdfViewRequest;", "ConsumerBaseUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionsKt {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <P extends android.os.Parcelable> P getParcelable(android.content.Intent r4, java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.ShareDataUIState
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 118(0x76, float:1.65E-43)
            if (r1 < r2) goto L45
            goto L29
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L45
        L29:
            int r1 = com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.ShareDataUIState
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "P"
            r3 = 4
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r2)
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Object r4 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m9776m(r4, r5, r1)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            goto L49
        L45:
            android.os.Parcelable r4 = r4.getParcelableExtra(r5)
        L49:
            int r5 = com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.ShareDataUIState
            int r5 = r5 + 37
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.component3 = r1
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.getParcelable(android.content.Intent, java.lang.String):android.os.Parcelable");
    }

    public static final String timeStamp() {
        int i = 2 % 2;
        String str = new SimpleDateFormat(EventReportRequestKt.TIME_FORMAT, Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return str;
    }

    public static final String maskMsisdn(String str) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (str.length() >= 9) {
                String strTakeLast = StringsKt.takeLast(str, 9);
                String str2 = StringsKt.take(strTakeLast, 2) + "***" + StringsKt.takeLast(strTakeLast, 3);
                int i4 = component3 + 79;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return str2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static final String OneAppSourceSystem() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return HeaderConstants.APP_SOURCE_SYSTEM;
        }
        int i3 = 39 / 0;
        return HeaderConstants.APP_SOURCE_SYSTEM;
    }

    public static void addMandatoryHeaders$default(HaProxyRequest haProxyRequest, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 81;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str2 = HeaderConstants.APP_SOURCE_SYSTEM;
        }
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 95;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
            z = true;
        }
        addMandatoryHeaders(haProxyRequest, str, str2, z);
    }

    public static final <Type> void addMandatoryHeaders(HaProxyRequest<Type> haProxyRequest, String str, String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(haProxyRequest, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String str3 = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string2, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        haProxyRequest.addHeader(HeaderConstants.SOURCE_COUNTY_CODE, "KE");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_OPERATOR, "mysafaricom");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_DIVISION, "DE");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_TIMESTAMP, timeStamp());
        haProxyRequest.addHeader(HeaderConstants.CONVERSATION_ID, string);
        if (z) {
            int i2 = ShareDataUIState + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            haProxyRequest.addHeader(HeaderConstants.MESSAGE_ID, com.huawei.digitalpayment.consumer.base.security.RequestEncryption.INSTANCE.getMessageId());
        }
        haProxyRequest.addHeader(HeaderConstants.DEVICE_INFO, "8b2fd84f-3ae1-4289-ba9e-08d65ec8f8e0");
        haProxyRequest.addHeader(HeaderConstants.DEVICE_ID, "cdvasc0bvnbda3");
        haProxyRequest.addHeader(HeaderConstants.DEVICE_TOKEN, "8b2fd84f-3ae1-4289-ba9e-08d65ec8f8e0");
        if (str == null) {
            int i4 = component3 + 61;
            int i5 = i4 % 128;
            ShareDataUIState = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 117;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str = str3;
        }
        haProxyRequest.addHeader(HeaderConstants.X_MSISDN, str);
        haProxyRequest.addHeader(HeaderConstants.SOURCE_SYSTEM, str2);
        haProxyRequest.addHeader(HeaderConstants.APP, HeaderConstants.APP_SOURCE_SYSTEM);
        haProxyRequest.addHeader(HeaderConstants.VERSION, String.valueOf(AppInfoUtils.getVersionName()));
        haProxyRequest.addHeader("Content-Type", "application/json;charset=UTF-8");
        haProxyRequest.addHeader(HeaderConstants.API_KEY, "OWqwCWWp1w9FlWBWUOnOv5F5hLmWDdQs7rvS9IsS");
        haProxyRequest.addHeader("Accept-Encoding", "application/json;charset=UTF-8");
    }

    public static void addMandatoryHeaders$default(MiniAppProxyRequest miniAppProxyRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 73;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        addMandatoryHeaders(miniAppProxyRequest, str);
    }

    public static final <Type> void addMandatoryHeaders(MiniAppProxyRequest<Type> miniAppProxyRequest, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(miniAppProxyRequest, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String str2 = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string2, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        miniAppProxyRequest.addHeader(HeaderConstants.SOURCE_COUNTY_CODE, "KE");
        miniAppProxyRequest.addHeader(HeaderConstants.SOURCE_OPERATOR, "mysafaricom");
        miniAppProxyRequest.addHeader(HeaderConstants.SOURCE_DIVISION, "DE");
        miniAppProxyRequest.addHeader(HeaderConstants.SOURCE_TIMESTAMP, timeStamp());
        miniAppProxyRequest.addHeader(HeaderConstants.CONVERSATION_ID, string);
        miniAppProxyRequest.addHeader(HeaderConstants.MESSAGE_ID, com.huawei.digitalpayment.consumer.base.security.RequestEncryption.INSTANCE.getMessageId());
        miniAppProxyRequest.addHeader(HeaderConstants.DEVICE_INFO, "8b2fd84f-3ae1-4289-ba9e-08d65ec8f8e0");
        miniAppProxyRequest.addHeader(HeaderConstants.DEVICE_ID, "cdvasc0bvnbda3");
        miniAppProxyRequest.addHeader(HeaderConstants.DEVICE_TOKEN, "8b2fd84f-3ae1-4289-ba9e-08d65ec8f8e0");
        if (str == null) {
            int i2 = component3 + 107;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str = str2;
        }
        miniAppProxyRequest.addHeader(HeaderConstants.X_MSISDN, str);
        miniAppProxyRequest.addHeader(HeaderConstants.SOURCE_SYSTEM, HeaderConstants.APP_SOURCE_SYSTEM);
        miniAppProxyRequest.addHeader(HeaderConstants.APP, HeaderConstants.APP_SOURCE_SYSTEM);
        miniAppProxyRequest.addHeader(HeaderConstants.VERSION, String.valueOf(AppInfoUtils.getVersionName()));
        miniAppProxyRequest.addHeader("Content-Type", "application/json;charset=UTF-8");
        miniAppProxyRequest.addHeader(HeaderConstants.API_KEY, "OWqwCWWp1w9FlWBWUOnOv5F5hLmWDdQs7rvS9IsS");
        miniAppProxyRequest.addHeader("Accept-Encoding", "application/json;charset=UTF-8");
    }

    public static void addMandatoryHeaders$default(HaPdfViewRequest haPdfViewRequest, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 91;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str2 = HeaderConstants.APP_SOURCE_SYSTEM;
        }
        if ((i & 4) != 0) {
            int i4 = component3 + 47;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
            z = true;
        }
        addMandatoryHeaders(haPdfViewRequest, str, str2, z);
    }

    public static final <Type> void addMandatoryHeaders(HaPdfViewRequest<Type> haPdfViewRequest, String str, String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(haPdfViewRequest, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String str3 = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string2, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        haPdfViewRequest.addHeader(HeaderConstants.SOURCE_COUNTY_CODE, "KE");
        haPdfViewRequest.addHeader(HeaderConstants.SOURCE_OPERATOR, "mysafaricom");
        haPdfViewRequest.addHeader(HeaderConstants.SOURCE_DIVISION, "DE");
        haPdfViewRequest.addHeader(HeaderConstants.SOURCE_TIMESTAMP, timeStamp());
        haPdfViewRequest.addHeader(HeaderConstants.CONVERSATION_ID, string);
        if (z) {
            int i2 = component3 + 97;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                haPdfViewRequest.addHeader(HeaderConstants.MESSAGE_ID, com.huawei.digitalpayment.consumer.base.security.RequestEncryption.INSTANCE.getMessageId());
                throw null;
            }
            haPdfViewRequest.addHeader(HeaderConstants.MESSAGE_ID, com.huawei.digitalpayment.consumer.base.security.RequestEncryption.INSTANCE.getMessageId());
        }
        haPdfViewRequest.addHeader(HeaderConstants.DEVICE_INFO, "8b2fd84f-3ae1-4289-ba9e-08d65ec8f8e0");
        haPdfViewRequest.addHeader(HeaderConstants.DEVICE_ID, "cdvasc0bvnbda3");
        haPdfViewRequest.addHeader(HeaderConstants.DEVICE_TOKEN, "8b2fd84f-3ae1-4289-ba9e-08d65ec8f8e0");
        if (str == null) {
            int i3 = ShareDataUIState + 3;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = str3;
        }
        haPdfViewRequest.addHeader(HeaderConstants.X_MSISDN, str);
        haPdfViewRequest.addHeader(HeaderConstants.SOURCE_SYSTEM, str2);
        haPdfViewRequest.addHeader(HeaderConstants.APP, HeaderConstants.APP_SOURCE_SYSTEM);
        haPdfViewRequest.addHeader(HeaderConstants.VERSION, String.valueOf(AppInfoUtils.getVersionName()));
        haPdfViewRequest.addHeader("Content-Type", "application/json;charset=UTF-8");
        haPdfViewRequest.addHeader(HeaderConstants.API_KEY, "OWqwCWWp1w9FlWBWUOnOv5F5hLmWDdQs7rvS9IsS");
        haPdfViewRequest.addHeader("Accept-Encoding", "application/json;charset=UTF-8");
    }
}
