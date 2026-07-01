package com.huawei.digitalpayment.common.theme.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.font.FontManager;
import com.huawei.customer.digitalpayment.scan.util.CodeScanProcessUtils;
import com.huawei.digitalpayment.common.theme.font.IThemeFontInterface;
import java.util.Collections;
import java.util.List;

public class ThemeModuleInitializer implements Initializer<String> {
    private static int component1 = 0;
    private static final String component3 = "ThemeModuleInitializer";
    private static int copydefault = 1;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strCreate = create(context);
        int i4 = copydefault + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return strCreate;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>(this) {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public Object doInBackground() throws Throwable {
                Void voidComponent3;
                int i2 = 2 % 2;
                int i3 = copydefault + 89;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    voidComponent3 = component3();
                    int i4 = 48 / 0;
                } else {
                    voidComponent3 = component3();
                }
                int i5 = ShareDataUIState + 49;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return voidComponent3;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                copydefault((Void) obj);
                int i5 = copydefault + 91;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public Void component3() throws Throwable {
                int i2 = 2 % 2;
                CodeScanProcessUtils.addCodeScanProcessHandler(new ThemeScanProcessHandler());
                FontManager.INSTANCE.setTypefaceInterceptor((FontManager.TypefaceInterceptor) RouteUtils.getService(IThemeFontInterface.class));
                ((IThemeFontInterface) RouteUtils.getService(IThemeFontInterface.class)).copyAssetsFontToFile();
                int i3 = ShareDataUIState + 83;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }

            public void copydefault(Void r3) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 75;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        L.d("TIME", "ThemeModuleInitializer.init: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        List<Class<? extends Initializer<?>>> listEmptyList;
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            listEmptyList = Collections.emptyList();
            int i3 = 60 / 0;
        } else {
            listEmptyList = Collections.emptyList();
        }
        int i4 = copydefault + 71;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return listEmptyList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
