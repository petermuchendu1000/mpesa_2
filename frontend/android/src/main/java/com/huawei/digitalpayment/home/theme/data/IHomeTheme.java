package com.huawei.digitalpayment.home.theme.data;

import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.request.HomeThemeDetailParams;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeThemeData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\n\u001a\u0004\u0018\u00010\bH&J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/IHomeTheme;", "", "loadCurrentTheme", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeThemeData;", "params", "Lcom/huawei/digitalpayment/home/request/HomeThemeDetailParams;", "convertFunctionDefine", "", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "functionDefine", "convertFunctionGroupDefine", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "functionDefines", "refreshThemeFunctions", "", "homeTheme", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "getDefaultThemeId", "getDefaultThemeVersion", "", "Companion", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IHomeTheme {

    public static final Companion INSTANCE = Companion.component2;

    Map<String, LocalHomeFunction> convertFunctionDefine(String functionDefine);

    List<LocalFunctionGroup> convertFunctionGroupDefine(Map<String, LocalHomeFunction> functionDefines);

    String getDefaultThemeId();

    int getDefaultThemeVersion();

    LocalHomeThemeData loadCurrentTheme(HomeThemeDetailParams params);

    void refreshThemeFunctions(LocalHomeTheme homeTheme, Map<String, LocalHomeFunction> functionDefine);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int component3;

        public static String getDefaultThemeId(IHomeTheme iHomeTheme) {
            int i = 2 % 2;
            int i2 = component3 + 61;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return "default";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int getDefaultThemeVersion(IHomeTheme iHomeTheme) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 121;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return 1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/IHomeTheme$Companion;", "", "<init>", "()V", "DEFAULT_THEME_ID", "", "DEFAULT_THEME_VERSION", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static final String component1 = "default";
        static final Companion component2 = new Companion();
        private static final int component3 = 1;
        private static int copydefault;

        private Companion() {
        }

        static {
            int i = copydefault + 97;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
