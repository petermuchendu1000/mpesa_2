package com.huawei.digitalpayment.consumer.baselib.init;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.skin.SkinManager;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;

public class PaymentResource extends Resources {
    private static final String component1 = "PaymentResource";
    private static int component2 = 1;
    private static int copydefault;
    private final Resources ShareDataUIState;

    public PaymentResource(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.ShareDataUIState = resources;
        resetFont(resources);
    }

    @Override
    public CharSequence getText(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String string = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getString(i);
        if (TextUtils.isEmpty(string)) {
            return this.ShareDataUIState.getText(i);
        }
        int i5 = copydefault + 77;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return string;
    }

    @Override
    public String getString(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        String string = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getString(i);
        if (!TextUtils.isEmpty(string)) {
            int i3 = copydefault + 55;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        String string2 = this.ShareDataUIState.getString(i);
        int i5 = copydefault + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return string2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r5 = java.lang.String.format(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault + 55;
        com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if ((r6 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r5, java.lang.Object... r6) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L29
            java.lang.Class<com.huawei.digitalpayment.consumer.baselib.config.IAppConfig> r1 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.class
            java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)     // Catch: java.lang.Exception -> L27
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r1 = (com.huawei.digitalpayment.consumer.baselib.config.IAppConfig) r1     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r1.getString(r5)     // Catch: java.lang.Exception -> L27
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L27
            r3 = 68
            int r3 = r3 / 0
            if (r2 != 0) goto L67
            goto L3b
        L25:
            r5 = move-exception
            throw r5
        L27:
            r0 = move-exception
            goto L50
        L29:
            java.lang.Class<com.huawei.digitalpayment.consumer.baselib.config.IAppConfig> r1 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.class
            java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)     // Catch: java.lang.Exception -> L27
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r1 = (com.huawei.digitalpayment.consumer.baselib.config.IAppConfig) r1     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r1.getString(r5)     // Catch: java.lang.Exception -> L27
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L27
            if (r2 != 0) goto L67
        L3b:
            java.lang.String r5 = java.lang.String.format(r1, r6)     // Catch: java.lang.Exception -> L27
            int r6 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault
            int r6 = r6 + 55
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4b
            return r5
        L4b:
            r5 = 0
            r5.hashCode()
            throw r5
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getString: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = "PaymentResource"
            java.lang.String r1 = r1.toString()
            com.huawei.common.util.L.d(r0, r1)
        L67:
            android.content.res.Resources r0 = r4.ShareDataUIState
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.getString(int, java.lang.Object[]):java.lang.String");
    }

    @Override
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.updateConfiguration(configuration, displayMetrics);
        int i4 = component2 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void resetFont(Resources resources) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            if (resources.getConfiguration().fontScale == 0.0f) {
                return;
            }
        } else if (resources.getConfiguration().fontScale == 1.0f) {
            return;
        }
        Configuration configuration = new Configuration();
        configuration.setToDefaults();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        int i3 = component2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public Configuration getConfiguration() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        resetFont(this.ShareDataUIState);
        Configuration configuration = this.ShareDataUIState.getConfiguration();
        int i4 = copydefault + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return configuration;
    }

    @Override
    public DisplayMetrics getDisplayMetrics() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            resetFont(this.ShareDataUIState);
            int i3 = 18 / 0;
            return this.ShareDataUIState.getDisplayMetrics();
        }
        resetFont(this.ShareDataUIState);
        return this.ShareDataUIState.getDisplayMetrics();
    }

    @Override
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState.getBoolean(i);
        int i5 = copydefault + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override
    public CharSequence getText(int i, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = copydefault + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CharSequence text = this.ShareDataUIState.getText(i, charSequence);
        int i5 = component2 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return text;
    }

    @Override
    public int getColor(int i, Resources.Theme theme) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = component2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int color = ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getColor(i, theme);
        if (color == -1) {
            try {
                return super.getColor(i, theme);
            } catch (Resources.NotFoundException e) {
                L.e(e.getMessage());
                return -1;
            }
        }
        int i5 = component2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return color;
    }

    @Override
    public int getColor(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = copydefault + 1;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getColor(i, null);
            obj.hashCode();
            throw null;
        }
        int color = getColor(i, null);
        int i4 = copydefault + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return color;
    }

    @Override
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = copydefault + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (i == R.drawable.edittext_cursor_shape) {
            int i5 = copydefault + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            Drawable drawableComponent1 = component1(Utils.getApp().getTheme(), super.getDrawable(i));
            if (drawableComponent1 != null) {
                return drawableComponent1;
            }
        }
        Drawable drawable = super.getDrawable(i);
        int i7 = copydefault + 77;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            return drawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        if (i == R.drawable.edittext_cursor_shape) {
            int i3 = copydefault + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Drawable drawableComponent1 = component1(theme, super.getDrawable(i, theme));
            if (drawableComponent1 != null) {
                return drawableComponent1;
            }
        }
        Drawable drawable = super.getDrawable(i, theme);
        int i5 = copydefault + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    private static Drawable component1(Resources.Theme theme, Drawable drawable) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (drawable == null) {
            int i4 = i2 + 15;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = i2 + 57;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            drawable.setColorFilter(SkinManager.INSTANCE.getAttrColor(Utils.getApp(), theme, R.attr.editTextCursorColor), PorterDuff.Mode.SRC_IN);
            int i7 = 75 / 0;
        } else {
            drawable.setColorFilter(SkinManager.INSTANCE.getAttrColor(Utils.getApp(), theme, R.attr.editTextCursorColor), PorterDuff.Mode.SRC_IN);
        }
        return drawable;
    }

    public static int getOriginColor(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int originColor = getOriginColor(context, i, context.getTheme());
        int i5 = component2 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return originColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return ((com.huawei.digitalpayment.consumer.baselib.init.PaymentResource) r1).ShareDataUIState.getColor(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        ((com.huawei.digitalpayment.consumer.baselib.init.PaymentResource) r1).ShareDataUIState.getColor(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        com.huawei.common.util.L.e(r5.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r5 = r5.getColor(r6);
        r6 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault + 87;
        com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r1 instanceof com.huawei.digitalpayment.consumer.baselib.init.PaymentResource) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r1 instanceof com.huawei.digitalpayment.consumer.baselib.init.PaymentResource) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2 + 45;
        com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getOriginColor(android.content.Context r5, int r6, android.content.res.Resources.Theme r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1c
            android.content.res.Resources r1 = r5.getResources()
            boolean r3 = r1 instanceof com.huawei.digitalpayment.consumer.baselib.init.PaymentResource
            r4 = 84
            int r4 = r4 / 0
            if (r3 == 0) goto L4a
            goto L24
        L1c:
            android.content.res.Resources r1 = r5.getResources()
            boolean r3 = r1 instanceof com.huawei.digitalpayment.consumer.baselib.init.PaymentResource
            if (r3 == 0) goto L4a
        L24:
            int r5 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2
            int r5 = r5 + 45
            int r3 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault = r3
            int r5 = r5 % r0
            if (r5 != 0) goto L38
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource r1 = (com.huawei.digitalpayment.consumer.baselib.init.PaymentResource) r1
            android.content.res.Resources r5 = r1.ShareDataUIState     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r5 = r5.getColor(r6, r7)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r5
        L38:
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource r1 = (com.huawei.digitalpayment.consumer.baselib.init.PaymentResource) r1
            android.content.res.Resources r5 = r1.ShareDataUIState     // Catch: android.content.res.Resources.NotFoundException -> L40
            r5.getColor(r6, r7)     // Catch: android.content.res.Resources.NotFoundException -> L40
            throw r2
        L40:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.huawei.common.util.L.e(r5)
            r5 = -1
            return r5
        L4a:
            int r5 = r5.getColor(r6)
            int r6 = com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.copydefault
            int r6 = r6 + 87
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.component2 = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L5a
            return r5
        L5a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.init.PaymentResource.getOriginColor(android.content.Context, int, android.content.res.Resources$Theme):int");
    }
}
