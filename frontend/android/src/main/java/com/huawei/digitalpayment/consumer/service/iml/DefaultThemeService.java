package com.huawei.digitalpayment.consumer.service.iml;

import com.huawei.digitalpayment.consumer.service.IThemeService;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\tJ\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultThemeService;", "Lcom/huawei/digitalpayment/consumer/service/IThemeService;", "<init>", "()V", "parseThemeString", "", "origin", "parseThemeColor", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "defaultColor", "getFontInputStreamForH5", "Ljava/io/InputStream;", "isFilterMiniApp", "", "appId", "isFilterFunction", "functionId", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultThemeService implements IThemeService {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public String getFontFileForLang(String str, String str2) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String fontFileForLang = IThemeService.DefaultImpls.getFontFileForLang(this, str, str2);
        int i4 = copydefault + 73;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fontFileForLang;
        }
        throw null;
    }

    @Override
    public String getFunctionDefineGroupsJson() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IThemeService.DefaultImpls.getFunctionDefineGroupsJson(this);
            obj.hashCode();
            throw null;
        }
        String functionDefineGroupsJson = IThemeService.DefaultImpls.getFunctionDefineGroupsJson(this);
        int i3 = component1 + 73;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return functionDefineGroupsJson;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public InputStream getFontInputStreamForH5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override
    public boolean isFilterFunction(String functionId) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(functionId, "");
        int i4 = component1 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean isFilterMiniApp(String appId) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appId, "");
        int i4 = component1 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public int parseThemeColor(String origin, int defaultColor) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return defaultColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Integer parseThemeColor(String origin) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        copydefault = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public String parseThemeString(String origin) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return origin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
