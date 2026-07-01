package com.huawei.digitalpayment.consumer.base.util.interceptors;

import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.cube.repository.AppTokenRepository;
import com.huawei.digitalpayment.consumer.base.cube.repository.H5GetAccessTokenRepository;
import com.huawei.digitalpayment.consumer.base.cube.resp.AppTokenResp;
import com.huawei.digitalpayment.consumer.base.cube.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/interceptors/AppTokenCacher;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "TAG", "", "loadSaveToken", "", "fetchAppToken", "h5Token", "fetchH5Token", "setCurrentAppToken", "appToken", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppTokenCacher implements BaseModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final String component1 = Reflection.getOrCreateKotlinClass(AppTokenCacher.class).getSimpleName();

    public static final String access$getTAG$p(AppTokenCacher appTokenCacher) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = appTokenCacher.component1;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setCurrentAppToken(AppTokenCacher appTokenCacher, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        appTokenCacher.copydefault(str);
        int i4 = copydefault + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void loadSaveToken() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        fetchH5Token();
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huawei/digitalpayment/consumer/base/util/interceptors/AppTokenCacher$fetchAppToken$1", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/AppTokenResp;", "onSuccess", "", "value", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements ApiCallback<AppTokenResp> {
        private static final byte[] $$c = {107, -21, -54, -113};
        private static final int $$f = 78;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {59, -24, -77, -23, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
        private static final int $$e = 149;
        private static final byte[] $$a = {10, 80, 9, 70, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -21, Ascii.US, -45, -15, 3, -21};
        private static final int $$b = 140;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static char[] copydefault = {3100, 43683, 16744, 63499, 38536, 19870, 58415, 33524, 14769, 53260, 36620, 9647, 56416, 31550, 4555, 51353, 26434, 7596, 46227, 21327, 2578, 41178, 24417, 63038, 3089, 43687, 16746, 63527, 38601, 19862, 58407, 33532, 14783, 53319, 36620, 9657, 49812, 25643, 36832, 13955, 22528, 33558, 10919, 19580, 63289, 7812, 16772, 60199, 4840, 46518, 57155, 1553, 43466, 54052, 31259, 40397, 50314, 28243, 37344, 14523, 25211, 34072, 3103, 43697, 16720, 63499, 38610, 19867, 58424, 33535, 3089, 43687, 16746, 63544, 38595, 19846, 58427, 33512, 14776, 53366, 36615, 9658, 56419, 3089, 43687, 16746, 63546, 38599, 19840, 58415, 33527, 14771, 53334, 36635, 9656, 56402, 31531, 4574, 51359, 26437};
        private static long component3 = -4389470820588344638L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(short r7, int r8, byte r9) {
            /*
                int r8 = r8 * 2
                int r8 = 3 - r8
                int r9 = r9 * 2
                int r9 = 1 - r9
                int r7 = 122 - r7
                byte[] r0 = com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.$$c
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2d
            L14:
                r3 = r2
            L15:
                r6 = r8
                r8 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r7 = r7 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.$$g(short, int, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 12
                int r0 = r6 + 7
                int r8 = r8 * 6
                int r8 = 106 - r8
                int r7 = r7 * 18
                int r7 = 21 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.$$a
                byte[] r0 = new byte[r0]
                int r6 = r6 + 6
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r7
                goto L32
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L32:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-10)
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.a(short, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 3
                int r0 = 10 - r5
                byte[] r1 = com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.$$d
                int r7 = r7 * 9
                int r7 = r7 + 4
                int r6 = 100 - r6
                byte[] r0 = new byte[r0]
                int r5 = 9 - r5
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r6
                r3 = r2
                r6 = r5
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r1[r7]
            L29:
                int r6 = r6 + r4
                int r7 = r7 + 1
                int r6 = r6 + (-27)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.b(byte, short, int, java.lang.Object[]):void");
        }

        AnonymousClass1() {
        }

        @Override
        public void onSuccess(AppTokenResp appTokenResp) {
            int i = 2 % 2;
            int i2 = component1 + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            onSuccess2(appTokenResp);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onSuccess2(AppTokenResp value) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            super.onSuccess(value);
            Object obj = null;
            String accessToken = value != null ? value.getAccessToken() : null;
            String str = "";
            if (accessToken == null) {
                int i4 = ShareDataUIState + 25;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                accessToken = "";
            }
            String strAccess$getTAG$p = AppTokenCacher.access$getTAG$p(AppTokenCacher.this);
            if (strAccess$getTAG$p == null) {
                int i5 = ShareDataUIState + 113;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            } else {
                str = strAccess$getTAG$p;
            }
            L.d(str, "Saving token " + accessToken);
            AppTokenCacher.access$setCurrentAppToken(AppTokenCacher.this, accessToken);
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x0326  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0327  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 825
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.c(int, int, char, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x0a9a  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0ab1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component2(java.util.List r31) {
            /*
                Method dump skipped, instruction units count: 2938
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher.AnonymousClass1.component2(java.util.List):int");
        }
    }

    public final void fetchAppToken(String h5Token) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(h5Token, "");
        L.d(this.component1, "Fetching App Token");
        AppTokenRepository appTokenRepository = new AppTokenRepository();
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        appTokenRepository.addHeader("authorization", "Bearer " + h5Token);
        appTokenRepository.addHeader("x-correlation-conversationid", UUID.randomUUID().toString());
        appTokenRepository.addHeader("x-msisdn", str);
        appTokenRepository.addHeader("authx-source-systemorization", "MyOneAppAndroid");
        appTokenRepository.sendRequest(new AnonymousClass1());
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void fetchH5Token() {
        int i = 2 % 2;
        L.d(this.component1, "Fetching H5 Token");
        H5GetAccessTokenRepository h5GetAccessTokenRepository = new H5GetAccessTokenRepository();
        h5GetAccessTokenRepository.addParams("appId", "1000000001");
        h5GetAccessTokenRepository.sendRequest(new ApiCallback<GetH5AccessTokenResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(GetH5AccessTokenResp getH5AccessTokenResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(getH5AccessTokenResp);
                int i5 = component3 + 81;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(GetH5AccessTokenResp value) {
                String accessToken;
                int i2 = 2 % 2;
                super.onSuccess(value);
                if (value != null) {
                    int i3 = component3 + 51;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    accessToken = value.getAccessToken();
                    int i5 = component2 + 77;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    accessToken = null;
                }
                if (accessToken == null) {
                    int i7 = component3 + 31;
                    component2 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 35 / 0;
                    }
                    accessToken = "";
                }
                L.d("H5 Token " + accessToken);
                AppTokenCacher.this.fetchAppToken(accessToken);
            }
        });
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
    }

    private final void copydefault(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        EncryptedSPUtils.getInstance().put(H5TokenInterceptor.PREF_CURRENT_APP_TOKEN, str);
        int i4 = copydefault + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
