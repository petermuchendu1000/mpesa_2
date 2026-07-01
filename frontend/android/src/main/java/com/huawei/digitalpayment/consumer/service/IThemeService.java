package com.huawei.digitalpayment.consumer.service;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/IThemeService;", "", "parseThemeString", "", "origin", "parseThemeColor", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "defaultColor", "getFontInputStreamForH5", "Ljava/io/InputStream;", "getFontFileForLang", "langCode", "fontKey", "getFunctionDefineGroupsJson", "isFilterMiniApp", "", "appId", "isFilterFunction", "functionId", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IThemeService {
    String getFontFileForLang(String langCode, String fontKey);

    InputStream getFontInputStreamForH5();

    String getFunctionDefineGroupsJson();

    boolean isFilterFunction(String functionId);

    boolean isFilterMiniApp(String appId);

    int parseThemeColor(String origin, int defaultColor);

    Integer parseThemeColor(String origin);

    String parseThemeString(String origin);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 1;
        private static int component2;

        public static String getFontFileForLang(IThemeService iThemeService, String str, String str2) {
            int i = 2 % 2;
            int i2 = component2 + 63;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return "";
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            throw null;
        }

        public static String getFunctionDefineGroupsJson(IThemeService iThemeService) {
            int i = 2 % 2;
            int i2 = component1 + 47;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
    }
}
