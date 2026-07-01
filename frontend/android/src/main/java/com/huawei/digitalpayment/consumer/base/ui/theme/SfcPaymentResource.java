package com.huawei.digitalpayment.consumer.base.ui.theme;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.skin.SkinManager;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import com.safaricom.mpesa.logging.L;
import java.util.function.Supplier;

public class SfcPaymentResource extends Resources {
    private static final String ShareDataUIState = "SafePaymentResource";
    private static int component1 = 1;
    private static int component3;
    private final ThreadLocal<Boolean> component2;
    private final Resources copydefault;

    static Boolean component1() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = component1 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public SfcPaymentResource(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.component2 = new Utf8Old$$ExternalSyntheticThreadLocal1(new Supplier() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object get() {
                int i = 2 % 2;
                int i2 = copydefault + 113;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolComponent1 = SfcPaymentResource.component1();
                int i4 = component3 + 49;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return boolComponent1;
            }
        });
        this.copydefault = resources;
        resetFont(resources);
    }

    @Override
    public CharSequence getText(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component1 + 109;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        CharSequence string = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getString(i);
        if (TextUtils.isEmpty(string)) {
            string = this.copydefault.getText(i);
        }
        int i5 = component1 + 51;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getString(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component1 + 11;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            String string = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getString(i);
            if (TextUtils.isEmpty(string)) {
                return this.copydefault.getString(i);
            }
            int i4 = component3 + 41;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return string;
            }
            int i5 = 2 % 3;
            return string;
        }
        TextUtils.isEmpty(((IAppConfig) RouteUtils.getService(IAppConfig.class)).getString(i));
        throw null;
    }

    @Override
    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component1 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        try {
            String string = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getString(i);
            if (!TextUtils.isEmpty(string)) {
                int i5 = component1 + 83;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return String.format(string, objArr);
                }
                String.format(string, objArr);
                throw null;
            }
        } catch (Exception e) {
            L.INSTANCE.d(ShareDataUIState, "getString: " + e.getMessage(), new Object[0]);
        }
        return this.copydefault.getString(i, objArr);
    }

    @Override
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.updateConfiguration(configuration, displayMetrics);
            this.copydefault.updateConfiguration(configuration, displayMetrics);
        } else {
            super.updateConfiguration(configuration, displayMetrics);
            this.copydefault.updateConfiguration(configuration, displayMetrics);
            throw null;
        }
    }

    public static void resetFont(Resources resources) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (resources.getConfiguration().fontScale != 1.0f) {
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        int i4 = component1 + 19;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public Configuration getConfiguration() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            resetFont(this.copydefault);
            int i3 = 11 / 0;
            return this.copydefault.getConfiguration();
        }
        resetFont(this.copydefault);
        return this.copydefault.getConfiguration();
    }

    @Override
    public DisplayMetrics getDisplayMetrics() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        resetFont(this.copydefault);
        DisplayMetrics displayMetrics = this.copydefault.getDisplayMetrics();
        int i4 = component1 + 77;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return displayMetrics;
    }

    @Override
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component1 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault.getBoolean(i);
        int i5 = component1 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override
    public CharSequence getText(int i, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = component1 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = this.copydefault;
        if (i4 == 0) {
            return resources.getText(i, charSequence);
        }
        resources.getText(i, charSequence);
        throw null;
    }

    @Override
    public int getColor(int i, Resources.Theme theme) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component1 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.component2.get().booleanValue())) {
            int i5 = component1 + 25;
            component3 = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    return super.getColor(i, theme);
                }
                super.getColor(i, theme);
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Resources.NotFoundException e) {
                L.INSTANCE.e(e.getMessage(), new Object[0]);
                return -1;
            }
        }
        this.component2.set(true);
        try {
            int color = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getColor(i, theme);
            if (color != -1) {
                return color;
            }
            int color2 = super.getColor(i, theme);
            this.component2.set(false);
            int i6 = component3 + 85;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return color2;
        } catch (Resources.NotFoundException e2) {
            L.INSTANCE.e(e2.getMessage(), new Object[0]);
            return -1;
        } finally {
            this.component2.set(false);
        }
    }

    @Override
    public int getColor(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component1 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int color = getColor(i, null);
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        int i6 = component1 + 9;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return color;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable getDrawable(int r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.ui.theme.SfcPaymentResource.component3
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.theme.SfcPaymentResource.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.drawable.edittext_cursor_shape
            r2 = 58
            int r2 = r2 / 0
            if (r4 != r1) goto L50
            goto L1b
        L17:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.drawable.edittext_cursor_shape
            if (r4 != r1) goto L50
        L1b:
            int r1 = com.huawei.digitalpayment.consumer.base.ui.theme.SfcPaymentResource.component3
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.theme.SfcPaymentResource.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3d
            android.graphics.drawable.Drawable r0 = super.getDrawable(r4)
            android.app.Application r1 = com.blankj.utilcode.util.Utils.getApp()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            android.graphics.drawable.Drawable r0 = component1(r1, r0)
            r1 = 61
            int r1 = r1 / 0
            if (r0 == 0) goto L50
            goto L4f
        L3d:
            android.graphics.drawable.Drawable r0 = super.getDrawable(r4)
            android.app.Application r1 = com.blankj.utilcode.util.Utils.getApp()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            android.graphics.drawable.Drawable r0 = component1(r1, r0)
            if (r0 == 0) goto L50
        L4f:
            return r0
        L50:
            android.graphics.drawable.Drawable r4 = super.getDrawable(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.theme.SfcPaymentResource.getDrawable(int):android.graphics.drawable.Drawable");
    }

    @Override
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        Drawable drawableComponent1;
        int i2 = 2 % 2;
        if (i != R.drawable.edittext_cursor_shape || (drawableComponent1 = component1(theme, super.getDrawable(i, theme))) == null) {
            Drawable drawable = super.getDrawable(i, theme);
            int i3 = component3 + 111;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return drawable;
        }
        int i5 = component3 + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return drawableComponent1;
    }

    private static Drawable component1(Resources.Theme theme, Drawable drawable) {
        int i = 2 % 2;
        if (drawable == null) {
            int i2 = component3 + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        drawable.setColorFilter(SkinManager.INSTANCE.getAttrColor(Utils.getApp(), theme, R.attr.editTextCursorColor), PorterDuff.Mode.SRC_IN);
        int i4 = component3 + 123;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return drawable;
    }

    public static int getOriginColor(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int originColor = getOriginColor(context, i, context.getTheme());
        int i5 = component1 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return originColor;
    }

    public static int getOriginColor(Context context, int i, Resources.Theme theme) {
        int i2 = 2 % 2;
        int i3 = component1 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = context.getResources();
        if (!(!(resources instanceof SfcPaymentResource))) {
            try {
                int color = ((SfcPaymentResource) resources).copydefault.getColor(i, theme);
                int i5 = component3 + 121;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
                return color;
            } catch (Resources.NotFoundException e) {
                L.INSTANCE.e(e.getMessage(), new Object[0]);
                return -1;
            }
        }
        return context.getColor(i);
    }
}
