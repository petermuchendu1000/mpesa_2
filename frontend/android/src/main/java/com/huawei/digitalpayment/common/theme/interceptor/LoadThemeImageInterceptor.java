package com.huawei.digitalpayment.common.theme.interceptor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.alibaba.griver.image.framework.utils.Format;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/interceptor/LoadThemeImageInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadThemeImageInterceptor implements Interceptor {
    public static final String CONTENT_TYPE = "image/png";

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 1;
    public static final String TAG = "LoadThemeImageInterceptor";
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/interceptor/LoadThemeImageInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "CONTENT_TYPE", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        String lowerCase = request.url().getUrl().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        Bitmap bitmapDecodeFile = null;
        if (!StringsKt.endsWith$default(lowerCase, Format.SUFFIX_PNG, false, 2, (Object) null)) {
            int i2 = ShareDataUIState + 39;
            component1 = i2 % 128;
            if (i2 % 2 == 0 ? !StringsKt.endsWith$default(lowerCase, Format.SUFFIX_JPG, false, 2, (Object) null) : !StringsKt.endsWith$default(lowerCase, Format.SUFFIX_JPG, true, 2, (Object) null)) {
                return chain.proceed(request);
            }
        }
        String h5BaseUrl = AppConfigManager.getAppConfig().getH5BaseUrl();
        Intrinsics.checkNotNullExpressionValue(h5BaseUrl, "");
        String lowerCase2 = h5BaseUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(lowerCase, lowerCase2, "", false, 4, (Object) null), "/common/image", "", false, 4, (Object) null);
        String string = SPUtils.getInstance(ThemeConstants.SP_NAME_NO_CACHE).getString("themeId");
        int i3 = SPUtils.getInstance(ThemeConstants.SP_NAME_NO_CACHE).getInt("themeVersion");
        File file = new File(Utils.getApp().getFilesDir(), "theme" + File.separator + string + File.separator + i3 + File.separator + "resources/img" + strReplace$default);
        if (!file.exists()) {
            return chain.proceed(request);
        }
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        } catch (Exception unused) {
        }
        if (bitmapDecodeFile == null) {
            int i4 = ShareDataUIState + 93;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return chain.proceed(request);
            }
            int i5 = 54 / 0;
            return chain.proceed(request);
        }
        L.d(TAG, "LoadThemeImage: " + lowerCase + " --> " + bitmapDecodeFile);
        Response.Builder builderAddHeader = new Response.Builder().code(200).addHeader("Content-Type", CONTENT_TYPE);
        ResponseBody.Companion companion = ResponseBody.INSTANCE;
        byte[] bArrBitmap2Bytes = ImageUtils.bitmap2Bytes(bitmapDecodeFile);
        Intrinsics.checkNotNullExpressionValue(bArrBitmap2Bytes, "");
        return builderAddHeader.body(companion.create(bArrBitmap2Bytes, MediaType.INSTANCE.get(CONTENT_TYPE))).message("ok").request(chain.request()).protocol(Protocol.HTTP_2).build();
    }

    static {
        int i = component3 + 91;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
